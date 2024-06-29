import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class217 extends class759 {

    @OriginalMember(owner = "client!ts", name = "D", descriptor = "[I")
    public static int[] field3568 = new int[1000];

    @OriginalMember(owner = "client!ts", name = "z", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!ts", name = "A", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!ts", name = "B", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!ts", name = "F", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!ts", name = "G", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!ts", name = "H", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIB)V", line = 3)
    public final void method8(int arg0, int arg1, int arg2, byte arg3) {
        super.field10593 = arg2;
        if (arg3 != -28) {
            field3568 = null;
        }
        ++field3566;
        super.field10584 = arg1;
        super.field10594 = arg0;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIZ)Z", line = 16)
    public static final boolean method1555(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return false;
        } else {
            ++field3565;
            return (class476.method2896(arg0, 24, arg1) | (8192 & arg0) != 0 | class172.method1361(arg0, -74, arg1)) & class64.method634(-104, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZF)V", line = 27)
    public final void method9(boolean arg0, float arg1) {
        ++field3567;
        if (arg0) {
            field3568 = null;
        }
        super.field10589 = arg1;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIIIIIII)V", line = 44)
    public static final void method1556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field3571;
        if (~arg3 <= -513 && ~arg1 <= -513 && (class191.field3229 + -2) * 512 >= arg3 && class314.field4720 * 512 + -1024 >= arg1) {
            if (arg8 != -21553) {
                method1559(-47);
            }
            int var10 = -arg6 + class232.method1611(arg1, arg3, arg9, (byte) 90);
            if (class250.field3989) {
                class32.method165(true, (byte) -108);
            } else {
                class257.field4038.method671(arg7, 0, 0);
                class364.field5573.method244(class257.field4038);
            }
            if (class141.field2211) {
                class364.field5573.method352(arg3, var10, arg1, class106.field1553, class457.field6635);
            } else {
                class364.field5573.method249(arg3, var10, arg1, class457.field6635);
            }
            if (!class250.field3989) {
                class257.field4038.method671(-arg7, 0, 0);
                class364.field5573.method244(class257.field4038);
            } else {
                class694.method3876(1);
            }
        } else {
            class457.field6635[0] = class457.field6635[1] = -1;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIII)V", line = 84)
    public static final void method1557(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var8 = arg2 + 1;
        class608.method3484(class77.field1131[arg2], arg1, arg4 ^ -7, arg0, arg3);
        ++field3569;
        int var9 = arg5 - 1;
        class608.method3484(class77.field1131[arg5], arg1, -7, arg0, arg3);
        int var6 = var8;
        if (arg4 == 0) {
            while (~var6 >= ~var9) {
                int[] var7 = class77.field1131[var6];
                var7[arg1] = var7[arg3] = arg0;
                ++var6;
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(IIIIIF)V", line = 110)
    public class217(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZLjava/lang/String;I)Z", line = 113)
    public static final boolean method1558(boolean arg0, String arg1, int arg2) {
        ++field3570;
        if (class706.field9962.field10270) {
            class229.field3703 = new class522();
            class229.field3703.field7542 = arg2;
            class229.field3703.field7535 = arg1;
            if (class478.field6941 != class209.field3494) {
                class229.field3703.field7537 = class229.field3703.field7542 + 40000;
                class229.field3703.field7533 = class229.field3703.field7542 + 50000;
            }
            if (arg2 < class94.field1406.length && class94.field1406[arg2] != null) {
                class672.field9512 = class94.field1406[arg2].field4700;
            }
            return true;
        } else {
            String var3 = "";
            if (class478.field6941 != class209.field3494) {
                var3 = ":" + (arg2 + 7000);
            }
            if (!arg0) {
                return false;
            } else {
                String var4 = "";
                if (class429.field6277 != null) {
                    var4 = "/p=" + class429.field6277;
                }
                String var5 = "http://" + arg1 + var3 + "/l=" + class467.field6804 + "/a=" + class459.field6658 + var4 + "/j" + (class237.field3816 ? "1" : "0") + ",o" + (class554.field7906 ? "1" : "0") + ",a2";
                try {
                    class52.field834.getAppletContext().showDocument(new URL(var5), "_self");
                    return true;
                } catch (Exception var6) {
                    return false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "(I)V", line = 161)
    public static void method1559(int arg0) {
        if (arg0 != 512) {
            method1556(125, -10, 58, -37, -29, 10, 79, 85, -99, -20);
        }
        field3568 = null;
    }
}
