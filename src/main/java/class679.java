import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class679 extends class603 {

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "Z")
    public static boolean field9734 = false;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "Ljk;")
    public static class585 field9728 = new class585(41, 3);

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public static int field9729;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    public static int field9730;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
    public static int field9731;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    public static int field9732;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
    public static int field9733;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    public static int field9735;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIZZ)V")
    public final void method751(int arg0, int arg1, boolean arg2, boolean arg3) {
        if (!arg3) {
            field9734 = true;
        }
        ++field9729;
        class68.field1045.method278(arg0 - 2, arg1, super.field8689.field7540 + 4, super.field8689.field7528 + 2, ((class435) super.field8689).field6238, 0);
        class68.field1045.method278(arg0 - 1, arg1 + 1, super.field8689.field7540 + 2, super.field8689.field7528, 0, 0);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IBILkfa;IILfga;Lrda;)V")
    public static final void method3852(int arg0, byte arg1, int arg2, class557 arg3, int arg4, int arg5, class232 arg6, class613 arg7) {
        ++field9733;
        if (arg1 <= -57) {
            class58 var8 = new class58();
            var8.field920 = arg0 << 9;
            var8.field923 = arg5 << 9;
            var8.field903 = arg4;
            if (arg6 == null) {
                if (arg3 != null) {
                    var8.field916 = arg3;
                    class323 var11 = arg3.field8052;
                    if (var11.field4315 != null) {
                        var8.field909 = true;
                        var11 = var11.method1881(class410.field5804, (byte) 115);
                    }
                    if (var11 != null) {
                        var8.field905 = var11.field4318 + arg5 << 9;
                        var8.field897 = var11.field4318 + arg0 << 9;
                        var8.field924 = class520.method3085((byte) -104, arg3);
                        var8.field910 = var11.field4251 << 9;
                        var8.field907 = var11.field4327;
                        var8.field900 = var11.field4270;
                        var8.field899 = var11.field4262;
                        var8.field912 = var11.field4277;
                    }
                    class188.field2301.method1129(var8, 262144);
                } else if (arg7 != null) {
                    var8.field921 = arg7;
                    var8.field897 = arg7.method1284((byte) -124) + arg0 << 9;
                    var8.field905 = arg7.method1284((byte) -124) + arg5 << 9;
                    var8.field924 = class608.method3488(108, arg7);
                    var8.field910 = arg7.field8788 << 9;
                    var8.field912 = arg7.field8797;
                    var8.field900 = arg7.field8825;
                    var8.field899 = 256;
                    var8.field907 = 256;
                    class362.field4820.method3670((long) arg7.field2664, var8, (byte) 127);
                }
            } else {
                var8.field919 = arg6;
                int var9 = arg6.field3066;
                int var10 = arg6.field3105;
                if (arg2 == 1 || ~arg2 == -4) {
                    var10 = arg6.field3066;
                    var9 = arg6.field3105;
                }
                var8.field897 = arg0 + var9 << 9;
                var8.field912 = arg6.field3091;
                var8.field907 = arg6.field3099;
                var8.field924 = arg6.field3110;
                var8.field898 = arg6.field3101;
                var8.field900 = arg6.field3089;
                var8.field925 = arg6.field3034;
                var8.field905 = arg5 + var10 << 9;
                var8.field901 = arg6.field3078;
                var8.field922 = arg6.field3062;
                var8.field910 = arg6.field3079 << 9;
                var8.field899 = arg6.field3083;
                if (arg6.field3094 != null) {
                    var8.field909 = true;
                    var8.method588(111);
                }
                if (var8.field901 != null) {
                    var8.field915 = (int) (Math.random() * (double) (var8.field925 - var8.field898)) + var8.field898;
                }
                class148.field1822.method1129(var8, 262144);
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Ljn;Ljn;Lvaa;)V")
    public class679(class668 arg0, class668 arg1, class435 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([BIIIBII)Z")
    public static final boolean method3853(byte[] arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        ++field9732;
        if (arg4 != 99) {
            return false;
        } else {
            int var7 = arg1 % arg2;
            int var8;
            if (var7 == 0) {
                var8 = 0;
            } else {
                var8 = arg2 - var7;
            }
            int var9 = -((arg2 + arg6 - 1) / arg2);
            int var10 = -((arg1 + arg2 + -1) / arg2);
            for (int var11 = var9; var11 < 0; ++var11) {
                for (int var12 = var10; var12 < 0; ++var12) {
                    if (~arg0[arg5] == -1) {
                        return true;
                    }
                    arg5 += arg2;
                }
                int var13 = arg5 - var8;
                if (~arg0[var13 + -1] == -1) {
                    return true;
                }
                arg5 = arg3 + var13;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public static void method3854(byte arg0) {
        field9728 = null;
        int var1 = 104 / ((arg0 - -21) / 32);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZII)V")
    public final void method755(int arg0, boolean arg1, int arg2, int arg3) {
        ++field9731;
        int var5 = this.method3477(-11833) * super.field8689.field7540 / 10000;
        if (arg0 == 1) {
            class68.field1045.method248(arg2, arg3 + 2, var5, super.field8689.field7528 + -2, ((class435) super.field8689).field6241, 0);
            class68.field1045.method248(arg2 + var5, arg3 - -2, -var5 + super.field8689.field7540, super.field8689.field7528 + -2, 0, 0);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lun;Z)Lrp;")
    public static final class403 method3855(class389 arg0, boolean arg1) {
        ++field9730;
        String var2 = arg0.method2244((byte) -84);
        class564 var3 = class262.method1597((byte) 123)[arg0.method2229(255)];
        class172 var4 = class423.method2555((byte) 122)[arg0.method2229(255)];
        int var5 = arg0.method2270((byte) 71);
        int var6 = arg0.method2270((byte) 71);
        if (arg1) {
            method3852(-94, (byte) 1, 14, (class557) null, -123, 104, (class232) null, (class613) null);
        }
        int var7 = arg0.method2229(255);
        int var8 = arg0.method2229(255);
        int var9 = arg0.method2229(255);
        int var10 = arg0.method2260(-36);
        int var11 = arg0.method2260(-87);
        int var12 = arg0.method2255(255);
        int var13 = arg0.method2255(255);
        int var14 = arg0.method2255(255);
        return new class403(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
    }
}
