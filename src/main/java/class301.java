import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class301 extends class326 {

    @OriginalMember(owner = "client!qe", name = "Q", descriptor = "I")
    public static int field4017 = 0;

    @OriginalMember(owner = "client!qe", name = "N", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!qe", name = "O", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!qe", name = "P", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!qe", name = "R", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;Lml;BZZ)V", line = 5)
    public static final void method1685(String arg0, class241 arg1, byte arg2, boolean arg3, boolean arg4) {
        field4015++;
        if (arg2 >= -118) {
            method1685((String) null, (class241) null, (byte) 96, false, true);
        }
        if (!arg4) {
            class332.method1901(arg1, 3, arg0, -127);
            return;
        }
        if (class241.field3208.startsWith("win") && class241.field3211 != 3) {
            String var5 = null;
            if (arg1.field3209 != null) {
                var5 = arg1.field3209.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class474 var6 = class332.method1901(arg1, 0, arg0, -125);
                class203.field2745 = arg0;
                class200.field2718 = var6;
                class233.field3105 = arg1;
                return;
            }
        }
        if (class241.field3208.startsWith("mac")) {
            String var7 = null;
            if (arg1.field3209 != null) {
                var7 = arg1.field3209.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg3) {
                class332.method1901(arg1, 1, arg0, -125);
                return;
            }
        }
        class332.method1901(arg1, 2, arg0, -126);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)[I", line = 70)
    public final int[] method30(byte arg0, int arg1) {
        if (arg0 > -6) {
            return null;
        } else {
            field4014++;
            return class389.field5375;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BZZ)V", line = 81)
    public static final void method1686(byte arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            class365.field5024++;
            class76.method503(0);
        }
        field4016++;
        if (arg0 != 72) {
            field4017 = -86;
        }
        if (arg1) {
            class354.field4903++;
            class462.method2721(true);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIII)I", line = 112)
    public static final int method1687(int arg0, int arg1, int arg2, int arg3) {
        field4018++;
        if (arg1 != -31596) {
            field4017 = 42;
        }
        if ((class1.field26[arg3][arg2][arg0] & 0x8) == 0) {
            return arg3 <= 0 || (class1.field26[1][arg2][arg0] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V", line = 131)
    public class301() {
        super(0, true);
    }
}
