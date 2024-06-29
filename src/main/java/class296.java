import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class296 {

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "Ltba;")
    public static class470 field3967 = new class470(0, 0);

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZLjava/lang/String;BI)Z")
    public static final boolean method1766(boolean arg0, String arg1, byte arg2, int arg3) {
        field3971++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg1.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg3 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var6 + var11;
            if ((var10 / arg3) != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        if (arg2 <= 33) {
            field3967 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Z)[Lhv;")
    public static final class97[] method1767(boolean arg0) {
        field3972++;
        if (arg0) {
            field3967 = null;
        }
        return new class97[] { class165.field2076, class142.field1811, class530.field7334 };
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZI)V")
    public static final void method1768(boolean arg0, int arg1) {
        field3968++;
        if (class42.method251(arg1, 0)) {
            if (!arg0) {
                field3967 = null;
            }
            class363.method2228(-1, class328.field4799[arg1], 0);
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
    public static void method1769(int arg0) {
        field3967 = null;
        if (arg0 != -23245) {
            method1767(true);
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lqe;I)V")
    public static final void method1770(class122 arg0, int arg1) {
        if (arg1 != 1) {
            method1767(true);
        }
        for (int var2 = 0; var2 < class72.field937; var2++) {
            int var3 = class276.field3745[var2];
            class519 var4 = class292.field3912[var3];
            int var5 = arg0.method957((byte) -84);
            if ((var5 & 0x1) != 0) {
                var5 += arg0.method957((byte) -81) << 8;
            }
            if ((var5 & 0x800) != 0) {
                var5 += arg0.method957((byte) -81) << 16;
            }
            class665.method3694(var4, var3, var5, 30373, arg0);
        }
        field3969++;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public static final void method1771(int arg0, int arg1, int arg2, String arg3, int arg4) {
        field3970++;
        class188 var5 = class630.method3443(arg4, -1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2410 != null) {
            class425 var6 = new class425();
            var6.field5913 = var5.field2410;
            var6.field5912 = arg0;
            var6.field5911 = var5;
            var6.field5910 = arg3;
            class317.method2051(var6);
        }
        if (class476.field6436 != 10 || !client.method1411(var5).method1647(arg0 - 1, (byte) -119)) {
            return;
        }
        if (arg0 == 1) {
            class389.method2326((byte) 118, class301.field4020);
            class102.field1236++;
            class235.method1456(arg4, arg2, var5.field2324, -1);
        }
        if (arg0 == arg1) {
            class389.method2326((byte) 118, class14.field120);
            class86.field1065++;
            class235.method1456(arg4, arg2, var5.field2324, arg1 ^ 0xFFFFFFFD);
        }
        if (arg0 == 3) {
            class110.field1324++;
            class389.method2326((byte) 118, class75.field951);
            class235.method1456(arg4, arg2, var5.field2324, arg1 ^ 0xFFFFFFFD);
        }
        if (arg0 == 4) {
            class208.field2725++;
            class389.method2326((byte) 118, class268.field3673);
            class235.method1456(arg4, arg2, var5.field2324, -1);
        }
        if (arg0 == 5) {
            class509.field6875++;
            class389.method2326((byte) 118, class649.field9202);
            class235.method1456(arg4, arg2, var5.field2324, arg1 - 3);
        }
        if (arg0 == 6) {
            class389.method2326((byte) 118, class171.field2141);
            class229.field2988++;
            class235.method1456(arg4, arg2, var5.field2324, -1);
        }
        if (arg0 == 7) {
            class297.field3979++;
            class389.method2326((byte) 118, class91.field1127);
            class235.method1456(arg4, arg2, var5.field2324, -1);
        }
        if (arg0 == 8) {
            class389.method2326((byte) 118, class311.field4178);
            class489.field6598++;
            class235.method1456(arg4, arg2, var5.field2324, -1);
        }
        if (arg0 == 9) {
            class347.field5082++;
            class389.method2326((byte) 118, class180.field2247);
            class235.method1456(arg4, arg2, var5.field2324, -1);
        }
        if (arg0 == 10) {
            class456.field6210++;
            class389.method2326((byte) 118, class421.field5872);
            class235.method1456(arg4, arg2, var5.field2324, -1);
        }
    }
}
