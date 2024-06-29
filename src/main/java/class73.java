import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class73 extends class88 {

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "[I")
    private int[] field919;

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "[I")
    private int[] field911;

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "Lgh;")
    private class215 field909;

    @OriginalMember(owner = "client!sa", name = "G", descriptor = "Lgh;")
    private class215 field907;

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "Lgh;")
    private class215 field915;

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "[Lgh;")
    private class215[] field912;

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "I")
    public static int field906 = 0;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
    public static int field913 = 0;

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "I")
    public static int field908 = 0;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "I")
    public static int field920 = 0;

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "I")
    public static int field924 = 0;

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!sa", name = "Y", descriptor = "Lwb;")
    public static class123 field925;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lvl;Leh;I)Z")
    public final boolean method410(class6 arg0, class137 arg1, int arg2) {
        field910++;
        if (class94.field1188 <= 0) {
            for (int var4 = 0; var4 < this.field919.length; var4++) {
                if (!arg1.method938(this.field919[var4], 843075268)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field919.length; var5++) {
                if (!arg1.method947(class94.field1188, this.field919[var5], true)) {
                    return false;
                }
            }
        }
        for (int var6 = arg2; var6 < this.field911.length; var6++) {
            if (!arg0.method36(520, this.field911[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZLeh;Lvl;IZDI)[I")
    public final int[] method411(int arg0, boolean arg1, class137 arg2, class6 arg3, int arg4, boolean arg5, double arg6, int arg7) {
        field914++;
        int var10 = -59 % ((arg7 - 73) / 47);
        int[] var11 = new int[arg0 * arg4];
        class163.method1133(-23755, arg6);
        class150.field2341 = arg2;
        class182.field2900 = arg3;
        class52.method299(arg4, arg0, -30149);
        for (int var12 = 0; var12 < this.field912.length; var12++) {
            this.field912[var12].method1505((byte) -58, arg4, arg0);
        }
        byte var13;
        int var14;
        int var15;
        if (arg5) {
            var13 = -1;
            var14 = -1;
            var15 = arg4 - 1;
        } else {
            var13 = 1;
            var14 = arg4;
            var15 = 0;
        }
        int var16 = 0;
        for (int var17 = 0; var17 < arg0; var17++) {
            if (arg1) {
                var16 = var17;
            }
            int[] var20;
            int[] var21;
            int[] var22;
            if (this.field907.field3453) {
                int[] var23 = this.field907.method47(var17, 255);
                var22 = var23;
                var20 = var23;
                var21 = var23;
            } else {
                int[][] var19 = this.field907.method46(-1, var17);
                var20 = var19[0];
                var21 = var19[2];
                var22 = var19[1];
            }
            for (int var24 = var15; var24 != var14; var24 += var13) {
                int var25 = var20[var24] >> 4;
                int var26 = var22[var24] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = var21[var24] >> 4;
                if (var27 > 255) {
                    var27 = 255;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var27 < 0) {
                    var27 = 0;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var28 = class297.field4700[var25];
                int var29 = class297.field4700[var27];
                int var30 = class297.field4700[var26];
                var11[var16++] = (var28 << 16) + var29 + (var30 << 8);
                if (arg1) {
                    var16 += arg4 - 1;
                }
            }
        }
        for (int var18 = 0; var18 < this.field912.length; var18++) {
            this.field912[var18].method1417(128);
        }
        return var11;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method412(int arg0, String arg1) {
        field921++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < class88.field1091; var2++) {
            if (arg1.equalsIgnoreCase(class143.field2256[var2])) {
                return true;
            }
        }
        return arg1.equalsIgnoreCase(class286.field4571.field4208);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZIIZLeh;Lvl;D)Lkk;")
    public final class65 method413(boolean arg0, int arg1, int arg2, boolean arg3, class137 arg4, class6 arg5, double arg6) {
        if (!arg0) {
            this.method410((class6) null, (class137) null, 8);
        }
        class163.method1133(-23755, arg6);
        field923++;
        class182.field2900 = arg5;
        class150.field2341 = arg4;
        class52.method299(arg1, arg2, -30149);
        class65 var9 = new class65(arg1, arg2);
        for (int var10 = 0; var10 < this.field912.length; var10++) {
            this.field912[var10].method1505((byte) -58, arg1, arg2);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg2; var12++) {
            if (arg3) {
                var11 = var12 << 2;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field907.field3453) {
                int[] var14 = this.field907.method47(var12, 255);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field907.method46(-1, var12);
                var16 = var18[1];
                var17 = var18[0];
                var15 = var18[2];
            }
            int[] var19;
            if (this.field915.field3453) {
                var19 = this.field915.method47(var12, 255);
            } else {
                var19 = this.field915.method46(-1, var12)[0];
            }
            for (int var20 = arg1 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
                int var22 = var16[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = class297.field4700[var21];
                int var24 = var15[var20] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                int var25 = class297.field4700[var22];
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = class297.field4700[var24];
                int var27;
                if (var23 == 0 && var25 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var9.field3640[var11++] = (var23 << 16) + ((var25 << 8) + (var27 << 24) + var26);
                if (arg3) {
                    var11 += (arg1 << 2) - 4;
                }
            }
        }
        for (int var13 = 0; var13 < this.field912.length; var13++) {
            this.field912[var13].method1417(128);
        }
        return var9;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILvl;ILeh;ZD)Lnf;")
    public final class227 method414(int arg0, int arg1, class6 arg2, int arg3, class137 arg4, boolean arg5, double arg6) {
        field922++;
        class163.method1133(-23755, arg6);
        class182.field2900 = arg2;
        class150.field2341 = arg4;
        class52.method299(arg0, arg1, -30149);
        class227 var9 = new class227(arg0, arg1);
        for (int var10 = 0; var10 < this.field912.length; var10++) {
            this.field912[var10].method1505((byte) -58, arg0, arg1);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            if (arg5) {
                var11 = var12;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field907.field3453) {
                int[] var14 = this.field907.method47(var12, 255);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field907.method46(arg3 ^ 0xFFFFFF00, var12);
                var16 = var18[0];
                var15 = var18[1];
                var17 = var18[2];
            }
            for (int var19 = 0; var19 != arg0; var19++) {
                int var20 = var16[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var21 = class297.field4700[var20];
                int var22 = var17[var19] >> 4;
                int var23 = var15[var19] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var24 = class297.field4700[var22];
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class297.field4700[var23];
                var9.field3640[var11++] = (var21 << 16) + var24 + (var25 << 8);
                if (arg5) {
                    var11 += arg0 - 1;
                }
            }
        }
        if (arg3 == 255) {
            for (int var13 = 0; var13 < this.field912.length; var13++) {
                this.field912[var13].method1417(128);
            }
            return var9;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "(I)V")
    public static void method415(int arg0) {
        field925 = null;
        if (arg0 != 1) {
            field924 = -114;
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class73() {
        this.field919 = new int[0];
        this.field911 = new int[0];
        this.field909 = new class214(0);
        this.field909.field3458 = 1;
        this.field907 = new class214();
        this.field907.field3458 = 1;
        this.field915 = new class214();
        this.field915.field3458 = 1;
        this.field912 = new class215[] { this.field907, this.field915, this.field909 };
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lpd;)V")
    public class73(class96 arg0) {
        int var2 = arg0.method584(255);
        this.field912 = new class215[var2];
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class215 var16 = class136.method918(2368, arg0);
            if (var16.method1509((byte) 121) >= 0) {
                var4++;
            }
            if (var16.method1416(-5782) >= 0) {
                var3++;
            }
            int var17 = var16.field3443.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method584(255);
            }
            this.field912[var6] = var16;
        }
        this.field911 = new int[var3];
        int var7 = 0;
        this.field919 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class215 var11 = this.field912[var9];
            int var12 = var11.field3443.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field3443[var13] = this.field912[var5[var9][var13]];
            }
            int var14 = var11.method1509((byte) 121);
            int var15 = var11.method1416(-5782);
            if (var14 > 0) {
                this.field919[var8++] = var14;
            }
            if (var15 > 0) {
                this.field911[var7++] = var15;
            }
            var5[var9] = null;
        }
        this.field907 = this.field912[arg0.method584(255)];
        Object var10 = null;
        this.field915 = this.field912[arg0.method584(255)];
        this.field909 = this.field912[arg0.method584(255)];
    }
}
