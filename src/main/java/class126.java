import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class126 {

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "[I")
    private int[] field2338;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "Z")
    public static boolean field2331 = true;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field2335 = 0;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "J")
    public static long field2326 = 0L;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "Loh;")
    private static class263 field2333 = class253.method1681(-120, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "Loh;")
    public static class263 field2339 = field2333;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "[Ldd;")
    public static class130[] field2336;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)I")
    public final int method813(int arg0, int arg1) {
        int var3 = -17 % ((arg1 + 60) / 38);
        int var4 = (this.field2338.length >> 1) - 1;
        int var5 = var4 & arg0;
        field2328++;
        while (true) {
            int var6 = this.field2338[var5 + var5 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field2338[var5 + var5] == arg0) {
                return var6;
            }
            var5 = var4 & var5 + 1;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
    public static void method814(byte arg0) {
        field2339 = null;
        if (arg0 != -76) {
            method814((byte) -88);
        }
        field2333 = null;
        field2336 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static final void method815(int arg0) {
        field2325++;
        if (arg0 == 15843) {
            class249.field4351.method825(0);
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)Z")
    public static final boolean method816(int arg0, int arg1) {
        if (arg0 != 57) {
            method814((byte) -113);
        }
        field2329++;
        return arg1 >= 48 && arg1 <= 57;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "()V")
    public static final void method817() {
        for (int var0 = 0; var0 < class86.field1728; var0++) {
            class70 var1 = class93.field1827[var0];
            class271.method1848(var1);
            class93.field1827[var0] = null;
        }
        class86.field1728 = 0;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Loh;I)I")
    public static final int method818(class263 arg0, int arg1) {
        field2330++;
        if (arg1 <= 1) {
            method820(96, -108, -86, 111, 27, 47);
        }
        for (int var2 = 0; var2 < class62.field1254.length; var2++) {
            if (class62.field1254[var2].method1766(-1, arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(II)V")
    public static final void method819(int arg0, int arg1) {
        field2334++;
        class95.field1862.method829(arg1, (byte) 110);
        if (arg0 < 106) {
            field2332 = 31;
        }
        class188.field3380.method829(arg1, (byte) 14);
        class141.field2578.method829(arg1, (byte) 103);
        class277.field4840.method829(arg1, (byte) 111);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method820(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class35.field820[arg0][var8][var14] == -class71.field1434) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class112.field2102[arg0][arg1][arg3] + arg5;
            if (!class216.method1469(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class216.method1469(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class216.method1469(var9, var11, var13)) {
                return false;
            } else if (class216.method1469(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class162.method1065(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class216.method1469(var6 + 1, class112.field2102[arg0][arg1][arg3] + arg5, var7 + 1) && class216.method1469(var6 + 128 - 1, class112.field2102[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class216.method1469(var6 + 128 - 1, class112.field2102[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class216.method1469(var6 + 1, class112.field2102[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "([I)V")
    public class126(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field2338 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field2338[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field2338[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field2338[var5 + var5] = arg0[var4];
            this.field2338[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)V")
    public static final void method821(byte arg0) {
        int var1 = class189.field3394.method1512(8, 127);
        field2340++;
        if (var1 < class41.field911) {
            for (int var2 = var1; var2 < class41.field911; var2++) {
                class137.field2499[class70.field1411++] = class249.field4354[var2];
            }
        }
        if (var1 > class41.field911) {
            throw new RuntimeException("gppov1");
        }
        class41.field911 = 0;
        if (arg0 != -60) {
            field2333 = null;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class249.field4354[var3];
            class137 var5 = class151.field2725[var4];
            int var6 = class189.field3394.method1512(1, 126);
            if (var6 == 0) {
                class249.field4354[class41.field911++] = var4;
                var5.field4670 = class228.field4012;
            } else {
                int var7 = class189.field3394.method1512(2, 126);
                if (var7 == 0) {
                    class249.field4354[class41.field911++] = var4;
                    var5.field4670 = class228.field4012;
                    class21.field627[class249.field4355++] = var4;
                } else if (var7 == 1) {
                    class249.field4354[class41.field911++] = var4;
                    var5.field4670 = class228.field4012;
                    int var8 = class189.field3394.method1512(3, 127);
                    var5.method1809(false, var8, (byte) 84);
                    int var9 = class189.field3394.method1512(1, 127);
                    if (var9 == 1) {
                        class21.field627[class249.field4355++] = var4;
                    }
                } else if (var7 == 2) {
                    class249.field4354[class41.field911++] = var4;
                    var5.field4670 = class228.field4012;
                    int var10 = class189.field3394.method1512(3, arg0 + 187);
                    var5.method1809(true, var10, (byte) 84);
                    int var11 = class189.field3394.method1512(3, 126);
                    var5.method1809(true, var11, (byte) 84);
                    int var12 = class189.field3394.method1512(1, 126);
                    if (var12 == 1) {
                        class21.field627[class249.field4355++] = var4;
                    }
                } else if (var7 == 3) {
                    class137.field2499[class70.field1411++] = var4;
                }
            }
        }
    }
}
