import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class653 extends class499 {

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "Z")
    public static boolean field8360 = false;

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "[I")
    public static int[] field8367 = new int[1];

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public static int field8358;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "I")
    public static int field8359;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
    public static int field8361;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "I")
    public static int field8362;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "I")
    public static int field8363;

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "I")
    public static int field8364;

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "I")
    public static int field8365;

    @OriginalMember(owner = "client!vh", name = "y", descriptor = "I")
    public static int field8366;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BII)V")
    public final void method204(byte arg0, int arg1, int arg2) {
        ++field8366;
        if (arg0 <= 11) {
            field8367 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZ)V")
    public final void method201(int arg0, boolean arg1) {
        ++field8361;
        if (arg0 != 91) {
            field8367 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)Z")
    public final boolean method200(boolean arg0) {
        ++field8365;
        if (!arg0) {
            field8360 = true;
        }
        return false;
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(B)V")
    public static void method3537(byte arg0) {
        if (arg0 >= -23) {
            field8360 = true;
        }
        field8367 = null;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
    public final void method205(int arg0) {
        if (arg0 != 0) {
            this.method205(-98);
        }
        ++field8359;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BZ)V")
    public static final void method3538(byte arg0, boolean arg1) {
        class204.method1385(30);
        ++field8364;
        if (class553.method3008(-22038, class332.field4052)) {
            ++class341.field4177;
            if (~class341.field4177 <= -51 || arg1) {
                class341.field4177 = 0;
                if (!class711.field9392 && class252.field3437 != null) {
                    ++class358.field4376;
                    class13 var2 = class659.method3587(class68.field909, 98, class230.field3098);
                    class116.method679(var2, 0);
                    try {
                        class610.method3269(14);
                    } catch (IOException var3) {
                        class711.field9392 = true;
                    }
                }
                if (arg0 != 26) {
                    method3537((byte) 86);
                }
                class204.method1385(21);
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILsfa;I)V")
    public final void method206(int arg0, class132 arg1, int arg2) {
        if (arg2 == 26917) {
            super.field6405.method3756(arg2 + -26907, arg1);
            ++field8363;
            super.field6405.method3740(arg0, 73);
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lgd;)V")
    public class653(class696 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILuc;I)V")
    public static final void method3539(int arg0, class133 arg1, int arg2) {
        ++field8358;
        if (arg2 > 93) {
            if (class115.field1513) {
                arg0 = 0;
                class115.field1513 = false;
            }
            if (class766.field10415 == null || !class766.field10415.method779(arg1, -1)) {
                class766.field10415 = arg1;
                class444.field5817 = class502.method2786(-7114);
                class634.field8063 = arg0;
                class17.field172 = arg0;
                if (~class17.field172 != -1) {
                    class458.field5983 = class679.field8788;
                    class728.field9562 = class528.field6710;
                    class321.field3984 = class721.field9474;
                    class451.field5885 = class495.field6329;
                    class732.field9586 = class117.field1596;
                    class501.field6435 = class259.field3483;
                    class134.field1777 = class656.field8456;
                    class27.field233 = class316.field3941;
                    class301.field3800 = class568.field7184;
                    class302.field3810 = class477.field6185;
                    return;
                }
                class748.method4065(6175);
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZZ)V")
    public final void method202(boolean arg0, boolean arg1) {
        ++field8362;
        if (arg1) {
            this.method200(true);
        }
    }
}
