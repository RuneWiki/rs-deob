import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class703 {

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "Z")
    public boolean field9908 = true;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "Lmk;")
    public static class54 field9904 = new class54();

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "S")
    public static short field9911 = 205;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "C")
    private char field9909;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field9900;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field9902;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field9903;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field9905;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public int field9906;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field9907;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Ljava/lang/String;")
    public String field9901;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "[[B")
    public static byte[][] field9910;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V", line = 4)
    public static final void method3944(int arg0) {
        if (arg0 != 115) {
            method3947(-26);
        }
        field9903++;
        class41.field465.method1363(arg0 + 17653);
        class462.field6583 = null;
        class446.field6457 = 1;
        class344.field4471 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLig;)V", line = 22)
    public final void method3945(byte arg0, class244 arg1) {
        if (arg0 < 21) {
            return;
        }
        while (true) {
            int var3 = arg1.method1423(-15);
            if (var3 == 0) {
                field9907++;
                return;
            }
            this.method3948(arg1, var3, 1);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)Z", line = 42)
    public final boolean method3946(byte arg0) {
        field9902++;
        if (arg0 != -100) {
            method3944(10);
        }
        return this.field9909 == 's';
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V", line = 61)
    public static void method3947(int arg0) {
        field9904 = null;
        field9910 = null;
        if (arg0 != -3) {
            method3949(-32);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lig;II)V", line = 76)
    private final void method3948(class244 arg0, int arg1, int arg2) {
        field9905++;
        if (arg1 == arg2) {
            this.field9909 = class169.method1054(arg0.method1448((byte) -86), -161);
        } else if (arg1 == 2) {
            this.field9906 = arg0.method1438(88);
        } else if (arg1 == 4) {
            this.field9908 = false;
        } else if (arg1 == 5) {
            this.field9901 = arg0.method1468(-1468860088);
            return;
        }
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V", line = 107)
    public static final void method3949(int arg0) {
        if (arg0 < 17) {
            field9904 = null;
        }
        class476.method2858(-1, true, 255);
        field9900++;
    }
}
