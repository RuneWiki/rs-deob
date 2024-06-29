import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class284 extends class16 {

    @OriginalMember(owner = "client!mi", name = "X", descriptor = "I")
    private int field4483 = 1;

    @OriginalMember(owner = "client!mi", name = "fb", descriptor = "I")
    private int field4491 = 1;

    @OriginalMember(owner = "client!mi", name = "Y", descriptor = "J")
    public static long field4484 = 0L;

    @OriginalMember(owner = "client!mi", name = "W", descriptor = "[I")
    public static int[] field4482 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!mi", name = "S", descriptor = "[Ljava/lang/String;")
    public static String[] field4478 = new String[500];

    @OriginalMember(owner = "client!mi", name = "Z", descriptor = "[Z")
    public static boolean[] field4485 = new boolean[100];

    @OriginalMember(owner = "client!mi", name = "ab", descriptor = "[[I")
    public static int[][] field4486 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!mi", name = "R", descriptor = "I")
    public static int field4477 = 0;

    @OriginalMember(owner = "client!mi", name = "eb", descriptor = "[I")
    public static int[] field4490 = new int[1000];

    @OriginalMember(owner = "client!mi", name = "db", descriptor = "F")
    public static float field4489;

    @OriginalMember(owner = "client!mi", name = "Q", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!mi", name = "T", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!mi", name = "U", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!mi", name = "V", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!mi", name = "bb", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!mi", name = "cb", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!mi", name = "gb", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB)[[I", line = 15)
    public final int[][] method54(int arg0, byte arg1) {
        field4480++;
        int var3 = 31 % ((40 - arg1) / 41);
        int[][] var4 = this.field197.method715(true, arg0);
        if (this.field197.field1548) {
            int var5 = this.field4483 + this.field4483 + 1;
            int var6 = 65536 / var5;
            int[][][] var7 = new int[var5][][];
            int var8 = this.field4491 + this.field4491 + 1;
            int var9 = 65536 / var8;
            for (int var10 = arg0 - this.field4483; var10 <= (this.field4483 + arg0); var10++) {
                int var11 = 0;
                int[][] var12 = this.method111(0, (byte) 122, var10 & class240.field3798);
                int[][] var13 = new int[3][class276.field4376];
                int[] var14 = var12[0];
                int var15 = 0;
                int var16 = 0;
                int[] var17 = var12[1];
                int[] var18 = var12[2];
                for (int var19 = -this.field4491; var19 <= this.field4491; var19++) {
                    int var20 = var19 & class148.field2215;
                    var15 += var18[var20];
                    var16 += var17[var20];
                    var11 += var14[var20];
                }
                int[] var21 = var13[0];
                int[] var22 = var13[2];
                int[] var23 = var13[1];
                int var24 = 0;
                while (var24 < class276.field4376) {
                    var21[var24] = var9 * var11 >> 16;
                    var23[var24] = var9 * var16 >> 16;
                    var22[var24] = var9 * var15 >> 16;
                    int var25 = class148.field2215 & var24 - this.field4491;
                    int var26 = var11 - var14[var25];
                    var24++;
                    int var27 = var16 - var17[var25];
                    int var28 = var15 - var18[var25];
                    int var29 = this.field4491 + var24 & class148.field2215;
                    var16 = var17[var29] + var27;
                    var11 = var14[var29] + var26;
                    var15 = var18[var29] + var28;
                }
                var7[var10 + this.field4483 - arg0] = var13;
            }
            int[] var30 = var4[0];
            int[] var31 = var4[2];
            int[] var32 = var4[1];
            for (int var33 = 0; var33 < class276.field4376; var33++) {
                int var34 = 0;
                int var35 = 0;
                int var36 = 0;
                for (int var37 = 0; var37 < var5; var37++) {
                    int[][] var38 = var7[var37];
                    var34 += var38[0][var33];
                    var36 += var38[2][var33];
                    var35 += var38[1][var33];
                }
                var30[var33] = var6 * var34 >> 16;
                var32[var33] = var6 * var35 >> 16;
                var31[var33] = var6 * var36 >> 16;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIZ)I", line = 145)
    public static final int method2007(int arg0, int arg1, boolean arg2) {
        field4479++;
        class227 var3 = (class227) class164.field2664.method1743((long) arg0, (byte) 95);
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else if (arg2) {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field3604.length; var5++) {
                if (var3.field3606[var5] == arg1) {
                    var4 += var3.field3604[var5];
                }
            }
            return var4;
        } else {
            return 7;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLim;I)V", line = 184)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        field4488++;
        if (arg2 == 0) {
            this.field4491 = arg1.method1399(arg0 ^ 0x45E13F91);
        } else if (arg2 == 1) {
            this.field4483 = arg1.method1399(-1172389784);
        } else if (arg2 == 2) {
            this.field191 = arg1.method1399(-1172389784) == 1;
        }
        if (arg0 != -7) {
            method2008(48);
        }
    }

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "(I)V", line = 233)
    public static void method2008(int arg0) {
        field4486 = (int[][]) null;
        field4490 = null;
        field4482 = null;
        field4485 = null;
        if (arg0 == 1) {
            field4478 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V", line = 253)
    public class284() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIILsa;I)V", line = 263)
    public static final void method2009(int arg0, int arg1, int arg2, class118 arg3, int arg4) {
        field4492++;
        if (class126.field1887 >= 400) {
            return;
        }
        if (arg3.field1786 != null) {
            arg3 = arg3.method819((byte) -9);
        }
        if (arg3 == null || !arg3.field1792) {
            return;
        }
        String var5 = arg3.field1813;
        if (~arg3.field1764 != arg4) {
            String var6 = class20.field290 == 1 ? class287.field4529 : class292.field4600;
            var5 = var5 + class243.method1724(arg3.field1764, class13.field159.field4994, -118) + " (" + var6 + arg3.field1764 + ")";
        }
        if (class49.field676 == 1) {
            class263.field4171++;
            class22.method142(class198.field3248, (short) 26, arg0, -97, arg1, class318.field4930 + " -> <col=ffff00>" + var5, class138.field2068, (long) arg2);
        } else if (class313.field4874) {
            class191 var14 = class297.field4656 == -1 ? null : class189.method1332(1178651532, class297.field4656);
            if ((class26.field374 & 0x2) != 0 && (var14 == null || arg3.method827(var14.field3096, (byte) 84, class297.field4656) != var14.field3096)) {
                class114.field1700++;
                class22.method142(class24.field344, (short) 40, arg0, arg4 - 118, arg1, class315.field4903 + " -> <col=ffff00>" + var5, class282.field4458, (long) arg2);
            }
        } else {
            class5.field46++;
            String[] var7 = arg3.field1766;
            if (class208.field3408) {
                var7 = class152.method1063(var7, 5);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class20.field290 != 0 || !var7[var8].equalsIgnoreCase(class305.field4758))) {
                        class71.field915++;
                        int var9 = -1;
                        byte var10 = 0;
                        if (arg3.field1780 == var8) {
                            var9 = arg3.field1795;
                        }
                        if (var8 == 0) {
                            var10 = 12;
                        }
                        if (var8 == 1) {
                            var10 = 42;
                        }
                        if (var8 == 2) {
                            var10 = 15;
                        }
                        if (var8 == 3) {
                            var10 = 14;
                        }
                        if (var8 == 4) {
                            var10 = 13;
                        }
                        if (arg3.field1783 == var8) {
                            var9 = arg3.field1759;
                        }
                        class22.method142(var9, var10, arg0, -119, arg1, "<col=ffff00>" + var5, var7[var8], (long) arg2);
                    }
                }
            }
            if (class20.field290 == 0 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class305.field4758)) {
                        class248.field3941++;
                        short var12 = 0;
                        if (class13.field159.field4994 < arg3.field1764) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 12;
                        }
                        if (var11 == 1) {
                            var13 = 42;
                        }
                        if (var11 == 2) {
                            var13 = 15;
                        }
                        if (var11 == 3) {
                            var13 = 14;
                        }
                        if (var11 == 4) {
                            var13 = 13;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class22.method142(arg3.field1779, var13, arg0, arg4 - 108, arg1, "<col=ffff00>" + var5, var7[var11], (long) arg2);
                    }
                }
            }
            class22.method142(class86.field1311, (short) 1004, arg0, 72, arg1, "<col=ffff00>" + var5, class173.field2768, (long) arg2);
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(ZI)[I", line = 423)
    public final int[] method8(boolean arg0, int arg1) {
        if (!arg0) {
            return (int[]) null;
        }
        int[] var3 = this.field207.method1784(arg1, (byte) 102);
        field4481++;
        if (this.field207.field4024) {
            int var4 = this.field4483 + this.field4483 + 1;
            int[][] var5 = new int[var4][];
            int var6 = 65536 / var4;
            int var7 = this.field4491 + this.field4491 + 1;
            int var8 = 65536 / var7;
            for (int var9 = arg1 - this.field4483; var9 <= arg1 + this.field4483; var9++) {
                int[] var10 = this.method103(0, 4389, var9 & class240.field3798);
                int[] var11 = new int[class276.field4376];
                int var12 = 0;
                for (int var13 = -this.field4491; var13 <= this.field4491; var13++) {
                    var12 += var10[class148.field2215 & var13];
                }
                int var14 = 0;
                while (class276.field4376 > var14) {
                    var11[var14] = var8 * var12 >> 16;
                    int var15 = var12 - var10[class148.field2215 & var14 - this.field4491];
                    var14++;
                    var12 = var10[var14 + this.field4491 & class148.field2215] + var15;
                }
                var5[this.field4483 + var9 - arg1] = var11;
            }
            for (int var16 = 0; var16 < class276.field4376; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var5[var18][var16];
                }
                var3[var16] = var6 * var17 >> 16;
            }
        }
        return var3;
    }
}
