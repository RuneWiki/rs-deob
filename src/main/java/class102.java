import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class102 extends class80 {

    @OriginalMember(owner = "client!d", name = "z", descriptor = "I")
    private int field1396;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "Ljm;")
    public static class485 field1401 = new class485(31, 3);

    @OriginalMember(owner = "client!d", name = "v", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!d", name = "A", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!d", name = "D", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!d", name = "G", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!d", name = "B", descriptor = "[I")
    public static int[] field1398;

    @OriginalMember(owner = "client!d", name = "C", descriptor = "[Lvb;")
    public class130[] field1399;

    @OriginalMember(owner = "client!d", name = "F", descriptor = "[[B")
    private byte[][] field1402;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(BI)Z", line = 5)
    public final boolean method672(byte arg0, int arg1) {
        if (arg0 < 31) {
            this.method677((byte) -59, 3);
        }
        field1400++;
        return this.field1399[arg1].field1798;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z", line = 17)
    public final boolean method673(int arg0, int arg1) {
        if (arg1 != 2) {
            method676(-43, -101, null);
        }
        field1392++;
        return this.field1399[arg0].field1790;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)Z", line = 28)
    public final boolean method674(boolean arg0) {
        field1393++;
        if (this.field1399 != null) {
            return true;
        }
        if (this.field1402 == null) {
            if (!class312.field4295.method1393(-126, this.field1396)) {
                return false;
            }
            int[] var2 = class312.field4295.method1415(-128, this.field1396);
            this.field1402 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field1402[var3] = class312.field4295.method1411(arg0, var2[var3], this.field1396);
            }
        }
        boolean var4 = arg0;
        for (int var5 = 0; var5 < this.field1402.length; var5++) {
            byte[] var14 = this.field1402[var5];
            int var15 = var14[0] & 0xFF << 8 | var14[1] & 0xFF;
            var4 &= class507.field7457.method1412(var15, 1);
        }
        if (!var4) {
            return false;
        }
        class522 var6 = new class522();
        int var7 = class312.field4295.method1397((byte) -114, this.field1396);
        this.field1399 = new class130[var7];
        int[] var8 = class312.field4295.method1415(-128, this.field1396);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field1402[var9];
            int var11 = (var10[0] & 0xFF) << 8 | var10[1] & 0xFF;
            class297 var12 = null;
            for (class297 var13 = (class297) var6.method3072((byte) 39); var13 != null; var13 = (class297) var6.method3066(2)) {
                if (var13.field4097 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class297(var11, class507.field7457.method1388(var11, (byte) -126));
                var6.method3070(var12, (byte) -123);
            }
            this.field1399[var8[var9]] = new class130(var10, var12);
        }
        this.field1402 = null;
        return true;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V", line = 120)
    public static void method675(int arg0) {
        field1401 = null;
        field1398 = null;
        if (arg0 != -2110890960) {
            field1401 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IILvh;)Lib;", line = 133)
    public static final class105 method676(int arg0, int arg1, class240 arg2) {
        field1395++;
        byte[] var3 = arg2.method1388(arg1, (byte) -78);
        if (var3 == null) {
            return null;
        } else {
            int var4 = 44 / ((-arg0 - 60) / 34);
            return new class105(var3);
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(BI)Z", line = 149)
    public final boolean method677(byte arg0, int arg1) {
        if (arg0 >= -83) {
            return false;
        } else {
            field1397++;
            return this.field1399[arg1].field1794;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(Z)V", line = 160)
    public static final void method678(boolean arg0) {
        field1394++;
        if (class210.field2983 == -1 || class128.field1745 == -1) {
            return;
        }
        int var1 = ((class170.field2406 - class398.field5540) * class471.field6889 >> 16) + class398.field5540;
        class471.field6889 += var1;
        if (class471.field6889 < 65535) {
            class341.field4712 = false;
            class383.field5387 = false;
        } else {
            if (class341.field4712) {
                class383.field5387 = false;
            } else {
                class383.field5387 = true;
            }
            class471.field6889 = 65535;
            class341.field4712 = true;
        }
        float var2 = (float) class471.field6889 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class168.field2387 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class418.field6119[class210.field2983][var4][var5] * 3;
            int var22 = class418.field6119[class210.field2983][var4 + 1][var5] * 3;
            int var23 = (class418.field6119[class210.field2983][var4 + 2][var5] + class418.field6119[class210.field2983][var4 + 2][var5] - class418.field6119[class210.field2983][var4 + 3][var5]) * 3;
            int var24 = class418.field6119[class210.field2983][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = class418.field6119[class210.field2983][var4 + 2][var5] - (var24 - var22) - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class526.field7729 = (int) var3[1] * -1;
        class132.field1901 = (int) var3[0] - (class215.field3059 * 128);
        class310.field4240 = (int) var3[2] - (class79.field1134 * 128);
        float[] var6 = new float[3];
        int var7 = class236.field3262 * 2;
        int var8 = 0;
        if (arg0) {
            field1398 = null;
        }
        while (var8 < 3) {
            int var14 = class418.field6119[class128.field1745][var7][var8] * 3;
            int var15 = class418.field6119[class128.field1745][var7 + 1][var8] * 3;
            int var16 = (class418.field6119[class128.field1745][var7 + 2][var8] + class418.field6119[class128.field1745][var7 + 2][var8] - class418.field6119[class128.field1745][var7 + 3][var8]) * 3;
            int var17 = class418.field6119[class128.field1745][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = var15 + class418.field6119[class128.field1745][var7 + 2][var8] - var16 - var17;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
            var8++;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class476.field6958 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class208.field2951 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class250.field3483 = class418.field6119[class210.field2983][var4][3] + ((class418.field6119[class210.field2983][var4 + 2][3] - class418.field6119[class210.field2983][var4][3]) * class471.field6889 >> 16);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)Z", line = 265)
    public static final boolean method679(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class493.field7286; var3++) {
            class437 var4 = class94.field1260[var3];
            if (var4.field6383 == 1) {
                int var5 = var4.field6382 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field6379 * var5 >> 8) + var4.field6369;
                    int var7 = (var4.field6361 * var5 >> 8) + var4.field6387;
                    int var8 = (var4.field6366 * var5 >> 8) + var4.field6368;
                    int var9 = (var4.field6377 * var5 >> 8) + var4.field6386;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field6383 == 2) {
                int var10 = arg0 - var4.field6382;
                if (var10 > 0) {
                    int var11 = (var4.field6379 * var10 >> 8) + var4.field6369;
                    int var12 = (var4.field6361 * var10 >> 8) + var4.field6387;
                    int var13 = (var4.field6366 * var10 >> 8) + var4.field6368;
                    int var14 = (var4.field6377 * var10 >> 8) + var4.field6386;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field6383 == 3) {
                int var15 = var4.field6369 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field6364 * var15 >> 8) + var4.field6382;
                    int var17 = (var4.field6365 * var15 >> 8) + var4.field6363;
                    int var18 = (var4.field6366 * var15 >> 8) + var4.field6368;
                    int var19 = (var4.field6377 * var15 >> 8) + var4.field6386;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field6383 == 4) {
                int var20 = arg2 - var4.field6369;
                if (var20 > 0) {
                    int var21 = (var4.field6364 * var20 >> 8) + var4.field6382;
                    int var22 = (var4.field6365 * var20 >> 8) + var4.field6363;
                    int var23 = (var4.field6366 * var20 >> 8) + var4.field6368;
                    int var24 = (var4.field6377 * var20 >> 8) + var4.field6386;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field6383 == 5) {
                int var25 = arg1 - var4.field6368;
                if (var25 > 0) {
                    int var26 = (var4.field6364 * var25 >> 8) + var4.field6382;
                    int var27 = (var4.field6365 * var25 >> 8) + var4.field6363;
                    int var28 = (var4.field6379 * var25 >> 8) + var4.field6369;
                    int var29 = (var4.field6361 * var25 >> 8) + var4.field6387;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(I)V", line = 393)
    public class102(int arg0) {
        this.field1396 = arg0;
    }
}
