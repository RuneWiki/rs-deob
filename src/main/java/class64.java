import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class64 extends class137 {

    @OriginalMember(owner = "client!mh", name = "G", descriptor = "[I")
    private int[] field1063;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "[I")
    private int[] field1072;

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "Lol;")
    private class117 field1077;

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "Lol;")
    private class117 field1067;

    @OriginalMember(owner = "client!mh", name = "I", descriptor = "Lol;")
    private class117 field1065;

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "[Lol;")
    private class117[] field1075;

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "[J")
    public static long[] field1068 = new long[100];

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "Ljava/lang/String;")
    public static String field1066 = "flash2:";

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "[I")
    public static int[] field1076 = new int[500];

    @OriginalMember(owner = "client!mh", name = "H", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ldk;Ltd;I)Z")
    public final boolean method446(class251 arg0, class226 arg1, int arg2) {
        field1064++;
        if (arg2 > -48) {
            method450((byte) 7, (class251) null);
        }
        if (class227.field3669 > 0) {
            for (int var4 = 0; var4 < this.field1063.length; var4++) {
                if (!arg0.method1693(3943, class227.field3669, this.field1063[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field1063.length; var5++) {
                if (!arg0.method1698((byte) 97, this.field1063[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field1072.length; var6++) {
            if (!arg1.method1036((byte) -80, this.field1072[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method447(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class69.field1140 * arg0 + class264.field4230 * arg3 >> 16;
        int var6 = class69.field1140 * arg3 - class264.field4230 * arg0 >> 16;
        int var7 = class285.field4524 * var6 + class108.field1729 * arg1 >> 16;
        int var8 = class285.field4524 * arg1 - class108.field1729 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class285.field4524 * var6 + class108.field1729 * arg2 >> 16;
        int var12 = class285.field4524 * arg2 - class108.field1729 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class123.field1960 && var13 < class123.field1960) {
            return false;
        } else if (var9 > class46.field773 && var13 > class46.field773) {
            return false;
        } else if (var10 < class251.field4001 && var14 < class251.field4001) {
            return false;
        } else {
            return var10 <= class183.field3010 || var14 <= class183.field3010;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BZLdk;DIILtd;)Lug;")
    public final class200 method448(byte arg0, boolean arg1, class251 arg2, double arg3, int arg4, int arg5, class226 arg6) {
        class251.method1674(arg3, -257);
        class304.field4869 = arg2;
        field1070++;
        class134.field2126 = arg6;
        class41.method270(arg4, 0, arg5);
        if (arg0 > -17) {
            return null;
        }
        class200 var9 = new class200(arg4, arg5);
        for (int var10 = 0; var10 < this.field1075.length; var10++) {
            this.field1075[var10].method835(arg5, (byte) 53, arg4);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg5; var12++) {
            if (arg1) {
                var11 = var12 << 2;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field1067.field1885) {
                int[] var14 = this.field1067.method46(2, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field1067.method47(var12, 114);
                var17 = var18[0];
                var16 = var18[1];
                var15 = var18[2];
            }
            int[] var19;
            if (this.field1065.field1885) {
                var19 = this.field1065.method46(2, var12);
            } else {
                var19 = this.field1065.method47(var12, -5)[0];
            }
            for (int var20 = arg4 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
                int var22 = var16[var20] >> 4;
                int var23 = var15[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class94.field1521[var22];
                int var25 = class94.field1521[var23];
                if (var21 < 0) {
                    var21 = 0;
                }
                int var26 = class94.field1521[var21];
                int var27;
                if (var26 == 0 && var24 == 0 && var25 == 0) {
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
                var9.field3733[var11++] = (var26 << 16) + var25 + (var24 << 8) + (var27 << 24);
                if (arg1) {
                    var11 += (arg4 << 2) - 4;
                }
            }
        }
        for (int var13 = 0; var13 < this.field1075.length; var13++) {
            this.field1075[var13].method655((byte) -58);
        }
        return var9;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ldk;Ltd;ZIZDIB)[I")
    public final int[] method449(class251 arg0, class226 arg1, boolean arg2, int arg3, boolean arg4, double arg5, int arg6, byte arg7) {
        int[] var10 = new int[arg3 * arg6];
        field1074++;
        class251.method1674(arg5, -257);
        class134.field2126 = arg1;
        class304.field4869 = arg0;
        class41.method270(arg6, 0, arg3);
        for (int var11 = 0; var11 < this.field1075.length; var11++) {
            this.field1075[var11].method835(arg3, (byte) 53, arg6);
        }
        int var12 = 0;
        byte var13;
        int var14;
        int var15;
        if (arg4) {
            var13 = -1;
            var14 = arg6 - 1;
            var15 = -1;
        } else {
            var14 = 0;
            var15 = arg6;
            var13 = 1;
        }
        if (arg7 <= 54) {
            return null;
        }
        for (int var16 = 0; var16 < arg3; var16++) {
            if (arg2) {
                var12 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field1067.field1885) {
                int[] var18 = this.field1067.method46(2, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field1067.method47(var16, -48);
                var20 = var22[1];
                var19 = var22[0];
                var21 = var22[2];
            }
            for (int var23 = var14; var23 != var15; var23 += var13) {
                int var24 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class94.field1521[var24];
                int var26 = var19[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = var21[var23] >> 4;
                if (var26 < 0) {
                    var26 = 0;
                }
                if (var27 > 255) {
                    var27 = 255;
                }
                int var28 = class94.field1521[var26];
                if (var27 < 0) {
                    var27 = 0;
                }
                int var29 = class94.field1521[var27];
                var10[var12++] = (var28 << 16) + var29 + (var25 << 8);
                if (arg2) {
                    var12 += arg6 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field1075.length; var17++) {
            this.field1075[var17].method655((byte) -65);
        }
        return var10;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLdk;)V")
    public static final void method450(byte arg0, class251 arg1) {
        class52.field877 = arg1;
        int var2 = 63 / ((arg0 + 19) / 34);
        field1073++;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BILtd;Ldk;ZID)Lqi;")
    public final class232 method451(byte arg0, int arg1, class226 arg2, class251 arg3, boolean arg4, int arg5, double arg6) {
        field1071++;
        class251.method1674(arg6, -257);
        class304.field4869 = arg3;
        class134.field2126 = arg2;
        class41.method270(arg5, 0, arg1);
        class232 var9 = new class232(arg5, arg1);
        for (int var10 = 0; var10 < this.field1075.length; var10++) {
            this.field1075[var10].method835(arg1, (byte) 53, arg5);
        }
        int var11 = 86 / ((-arg0 - 57) / 42);
        int var12 = 0;
        for (int var13 = 0; var13 < arg1; var13++) {
            if (arg4) {
                var12 = var13;
            }
            int[] var16;
            int[] var17;
            int[] var18;
            if (this.field1067.field1885) {
                int[] var15 = this.field1067.method46(2, var13);
                var16 = var15;
                var17 = var15;
                var18 = var15;
            } else {
                int[][] var19 = this.field1067.method47(var13, -99);
                var16 = var19[0];
                var17 = var19[2];
                var18 = var19[1];
            }
            for (int var20 = arg5 - 1; var20 >= 0; var20--) {
                int var21 = var18[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                int var22 = var17[var20] >> 4;
                if (var21 < 0) {
                    var21 = 0;
                }
                int var23 = var16[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class94.field1521[var21];
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var25 = class94.field1521[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class94.field1521[var23];
                var9.field3733[var12++] = (var26 << 16) - (-(var24 << 8) - var25);
                if (arg4) {
                    var12 += arg5 - 1;
                }
            }
        }
        for (int var14 = 0; var14 < this.field1075.length; var14++) {
            this.field1075[var14].method655((byte) -63);
        }
        return var9;
    }

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "(I)V")
    public static void method452(int arg0) {
        field1068 = null;
        if (arg0 != -1) {
            method452(2);
        }
        field1076 = null;
        field1066 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILag;II)V")
    public static final void method453(int arg0, class211 arg1, int arg2, int arg3) {
        if (arg1.field3402 == arg2) {
            arg1.field3416 = arg1.field3451;
        } else if (arg1.field3402 == 1) {
            arg1.field3416 = (arg3 - arg1.field3394) / 2 + arg1.field3451;
        } else if (arg1.field3402 == 2) {
            arg1.field3416 = arg3 - arg1.field3394 - arg1.field3451;
        } else if (arg1.field3402 == 3) {
            arg1.field3416 = arg1.field3451 * arg3 >> 14;
        } else if (arg1.field3402 == 4) {
            arg1.field3416 = (arg3 - arg1.field3394) / 2 + (arg1.field3451 * arg3 >> 14);
        } else {
            arg1.field3416 = arg3 - (arg1.field3451 * arg3 >> 14) - arg1.field3394;
        }
        if (arg1.field3390 == 0) {
            arg1.field3453 = arg1.field3475;
        } else if (arg1.field3390 == 1) {
            arg1.field3453 = (arg0 - arg1.field3430) / 2 + arg1.field3475;
        } else if (arg1.field3390 == 2) {
            arg1.field3453 = arg0 - arg1.field3430 - arg1.field3475;
        } else if (arg1.field3390 == 3) {
            arg1.field3453 = arg1.field3475 * arg0 >> 14;
        } else if (arg1.field3390 == 4) {
            arg1.field3453 = (arg1.field3475 * arg0 >> 14) + (arg0 - arg1.field3430) / 2;
        } else {
            arg1.field3453 = arg0 - (arg1.field3475 * arg0 >> 14) - arg1.field3430;
        }
        field1069++;
        if (!class176.field2877) {
            return;
        }
        if (client.method2015(arg1).field3629 == 0 && arg1.field3385 != 0) {
            return;
        }
        if (arg1.field3453 < 0) {
            arg1.field3453 = 0;
        } else if (arg0 < arg1.field3453 + arg1.field3430) {
            arg1.field3453 = arg0 - arg1.field3430;
        }
        if (arg1.field3416 < 0) {
            arg1.field3416 = 0;
            return;
        }
        if (arg1.field3416 + arg1.field3394 > arg3) {
            arg1.field3416 = arg3 - arg1.field3394;
            return;
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
    public class64() {
        this.field1063 = new int[0];
        this.field1072 = new int[0];
        this.field1077 = new class186(0);
        this.field1077.field1888 = 1;
        this.field1067 = new class186();
        this.field1067.field1888 = 1;
        this.field1065 = new class186();
        this.field1065.field1888 = 1;
        this.field1075 = new class117[] { this.field1067, this.field1065, this.field1077 };
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lwd;)V")
    public class64(class162 arg0) {
        int var2 = arg0.method1133((byte) 53);
        int var3 = 0;
        this.field1075 = new class117[var2];
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class117 var16 = class77.method526(arg0, 86);
            if (var16.method832((byte) -121) >= 0) {
                var3++;
            }
            if (var16.method654(-1) >= 0) {
                var4++;
            }
            int var17 = var16.field1891.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1133((byte) 53);
            }
            this.field1075[var6] = var16;
        }
        this.field1063 = new int[var3];
        this.field1072 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class117 var11 = this.field1075[var9];
            int var12 = var11.field1891.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field1891[var13] = this.field1075[var5[var9][var13]];
            }
            int var14 = var11.method832((byte) -108);
            int var15 = var11.method654(-1);
            if (var14 > 0) {
                this.field1063[var8++] = var14;
            }
            if (var15 > 0) {
                this.field1072[var7++] = var15;
            }
            var5[var9] = null;
        }
        Object var10 = null;
        this.field1067 = this.field1075[arg0.method1133((byte) 53)];
        this.field1065 = this.field1075[arg0.method1133((byte) 53)];
        this.field1077 = this.field1075[arg0.method1133((byte) 53)];
    }
}
