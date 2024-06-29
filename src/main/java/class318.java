import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class318 extends class176 {

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "[J")
    public static long[] field4615;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "Lni;")
    public static class367 field4617;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public int field4609;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
    public int field4610;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    public int field4613;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
    public int field4614;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "Lwj;")
    public class275 field4611;

    static {
        new class446("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
        field4615 = new long[100];
        field4617 = new class367(47, 2);
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)V", line = 4)
    public static void method1989(int arg0) {
        field4615 = null;
        if (arg0 == 27477) {
            field4617 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)V", line = 25)
    public static final void method1990(int arg0) {
        if (arg0 != -11739) {
            return;
        }
        field4612++;
        if (class351.field5406 != class116.field1601) {
            try {
                class305.method1920(class168.field2261, "tbrefresh", 21694);
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZ)V", line = 50)
    public static final void method1991(int arg0, boolean arg1) {
        class282.field4151 = arg0;
        field4616++;
        class24.field353 = 0;
        class491.method2933((byte) 98);
        class11.method105(false, arg1);
        class317.method1987((byte) 60);
        boolean var2 = false;
        for (int var3 = 0; var3 < class24.field353; var3++) {
            int var5 = class330.field5149[var3];
            class24 var6 = (class24) class406.field6158.method1747((long) var5, false);
            class17 var7 = var6.field348;
            if (class139.field1850 && class312.method1967(var5, (byte) -58)) {
                class276.method1782(-122);
            }
            if (class393.field6017 != var7.field3859) {
                if (var7.field274.method1665((byte) -79)) {
                    class308.method1930(var7, true);
                }
                var7.method167(8046, null);
                var2 = true;
                var6.method25(-13489);
            }
        }
        if (var2) {
            class515.field7566 = class406.field6158.method1749(0);
            class406.field6158.method1741(0, class480.field7090);
        }
        if (class497.field7326 != class409.field6214.field2185) {
            throw new RuntimeException("gnp1 pos:" + class409.field6214.field2185 + " psize:" + class497.field7326);
        }
        for (int var4 = 0; var4 < class333.field5187; var4++) {
            if (class406.field6158.method1747((long) class224.field3114[var4], false) == null) {
                throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class333.field5187);
            }
        }
    }
}
