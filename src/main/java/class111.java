import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class111 {

    @OriginalMember(owner = "client!su", name = "a", descriptor = "I")
    public int field1531;

    @OriginalMember(owner = "client!su", name = "b", descriptor = "[I")
    public static int[] field1532 = new int[8];

    @OriginalMember(owner = "client!su", name = "f", descriptor = "[I")
    public static int[] field1536 = new int[4096];

    @OriginalMember(owner = "client!su", name = "e", descriptor = "Z")
    public static boolean field1535 = false;

    @OriginalMember(owner = "client!su", name = "h", descriptor = "I")
    public static int field1538 = 0;

    @OriginalMember(owner = "client!su", name = "c", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!su", name = "d", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!su", name = "g", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZ)V")
    public static final void method730(String arg0, String arg1, int arg2, boolean arg3) {
        class99.field1388 = arg1;
        class166.field2156 = arg2;
        field1533++;
        class422.field5655 = arg0;
        if (class99.field1388.equals("") || class422.field5655.equals("")) {
            class169.field2211 = 3;
        } else if (class375.field4875 == -1) {
            class418.field5558 = 0;
            class169.field2211 = -3;
            class421.field5646 = 0;
            class470.field6876 = 1;
            class88 var4 = new class88(128);
            var4.method565(29, 10);
            var4.method572(-107, (int) (Math.random() * 9.9999999E7D));
            var4.method554(class216.method1386(-30907, class99.field1388), -290082784);
            var4.method572(-107, (int) (Math.random() * 9.9999999E7D));
            var4.method597(-127, class422.field5655);
            var4.method572(-113, (int) (Math.random() * 9.9999999E7D));
            var4.method600(class518.field7667, class411.field5489, 0);
            class319.field4112.field1176 = 0;
            if (!arg3) {
                class319.field4112.method565(-112, class275.field3522.field195);
                class319.field4112.method565(45, var4.field1176 + 2);
                class319.field4112.method609(583, -88);
                class319.field4112.method590(var4.field1176, -1, var4.field1223, 0);
            }
        } else {
            class164.method1086(14052);
        }
    }

    @OriginalMember(owner = "client!su", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1534++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)V")
    public static void method731(int arg0) {
        field1532 = null;
        field1536 = null;
        if (arg0 != 99999999) {
            field1538 = -106;
        }
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(I)V")
    public class111(int arg0) {
        this.field1531 = arg0;
    }
}
