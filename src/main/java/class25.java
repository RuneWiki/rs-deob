import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class25 extends class8 {

    @OriginalMember(owner = "client!pk", name = "I", descriptor = "[I")
    private int[] field339;

    @OriginalMember(owner = "client!pk", name = "R", descriptor = "[I")
    private int[] field348;

    @OriginalMember(owner = "client!pk", name = "Q", descriptor = "Lo;")
    private class285 field347;

    @OriginalMember(owner = "client!pk", name = "H", descriptor = "Lo;")
    private class285 field338;

    @OriginalMember(owner = "client!pk", name = "S", descriptor = "Lo;")
    private class285 field349;

    @OriginalMember(owner = "client!pk", name = "Y", descriptor = "[Lo;")
    private class285[] field355;

    @OriginalMember(owner = "client!pk", name = "U", descriptor = "[[B")
    public static byte[][] field351 = new byte[1000][];

    @OriginalMember(owner = "client!pk", name = "L", descriptor = "I")
    public static int field342 = 0;

    @OriginalMember(owner = "client!pk", name = "G", descriptor = "Ldb;")
    public static class102 field337 = new class102(64);

    @OriginalMember(owner = "client!pk", name = "F", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!pk", name = "J", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!pk", name = "K", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!pk", name = "M", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!pk", name = "P", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!pk", name = "T", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!pk", name = "V", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!pk", name = "W", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!pk", name = "X", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(DIILeg;ZILak;)Lek;", line = 5)
    public final class220 method137(double arg0, int arg1, int arg2, class154 arg3, boolean arg4, int arg5, class172 arg6) {
        field346++;
        class62.method425(arg0, (byte) -97);
        class329.field5080 = arg6;
        class210.field3453 = arg3;
        class324.method2271((byte) -117, arg2, arg5);
        class220 var9 = new class220(arg2, arg5);
        for (int var10 = 0; var10 < this.field355.length; var10++) {
            this.field355[var10].method2050((byte) -4, arg2, arg5);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg5; var12++) {
            if (arg4) {
                var11 = var12;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field338.field4572) {
                int[] var13 = this.field338.method60(true, var12);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field338.method62((byte) 127, var12);
                var16 = var17[2];
                var14 = var17[1];
                var15 = var17[0];
            }
            for (int var18 = 0; var18 != arg2; var18++) {
                int var19 = var16[var18] >> 4;
                if (var19 > 255) {
                    var19 = 255;
                }
                int var20 = var15[var18] >> 4;
                if (var19 < 0) {
                    var19 = 0;
                }
                int var21 = class208.field3423[var19];
                int var22 = var14[var18] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = class208.field3423[var20];
                int var24 = class208.field3423[var22];
                var9.field3545[var11++] = (var24 << 8) + (var23 << 16) + var21;
                if (arg4) {
                    var11 += arg2 - 1;
                }
            }
        }
        if (arg1 > -53) {
            this.method141(20, -90, (class154) null, true, (class172) null, 98);
        }
        for (int var25 = 0; var25 < this.field355.length; var25++) {
            this.field355[var25].method1028(13818);
        }
        return var9;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Leg;IIZLak;BD)[I", line = 120)
    public final int[] method138(class154 arg0, int arg1, int arg2, boolean arg3, class172 arg4, byte arg5, double arg6) {
        field336++;
        int[] var9 = new int[arg1 * arg2 * 4];
        class62.method425(arg6, (byte) -97);
        class210.field3453 = arg0;
        class329.field5080 = arg4;
        class324.method2271((byte) -59, arg2, arg1);
        for (int var10 = 0; var10 < this.field355.length; var10++) {
            this.field355[var10].method2050((byte) -4, arg2, arg1);
        }
        if (arg5 != 42) {
            field337 = (class102) null;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            if (arg3) {
                var11 = var12;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field338.field4572) {
                int[] var17 = this.field338.method60(true, var12);
                var14 = var17;
                var16 = var17;
                var15 = var17;
            } else {
                int[][] var13 = this.field338.method62((byte) 124, var12);
                var14 = var13[2];
                var15 = var13[1];
                var16 = var13[0];
            }
            int[] var18;
            if (this.field349.field4572) {
                var18 = this.field349.method60(true, var12);
            } else {
                var18 = this.field349.method62((byte) 123, var12)[0];
            }
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = var15[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var21 = var16[var19] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var14[var19] >> 4;
                int var23 = class208.field3423[var20];
                int var24 = class208.field3423[var21];
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var25 = class208.field3423[var22];
                int var26;
                if (var24 == 0 && var23 == 0 && var25 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9[var11++] = (var24 << 16) + (var23 << 8) + (var26 << 24) + var25;
                if (arg3) {
                    var11 += arg2 - 1;
                }
            }
        }
        for (int var27 = 0; var27 < this.field355.length; var27++) {
            this.field355[var27].method1028(13818);
        }
        return var9;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)Loc;", line = 260)
    public static final class291 method139(boolean arg0) {
        field341++;
        if (arg0) {
            method140(94);
        }
        return class225.field3604;
    }

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(I)V", line = 278)
    public static final void method140(int arg0) {
        for (int var1 = arg0; var1 < class219.field3543; var1++) {
            class228 var2 = class208.method1512(-20076, var1);
            if (var2 != null && var2.field3626 == 0) {
                class335.field5232[var1] = 0;
                class70.field991[var1] = 0;
            }
        }
        class182.field3004 = new class69(16);
        field340++;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILeg;ZLak;I)[F", line = 301)
    public final float[] method141(int arg0, int arg1, class154 arg2, boolean arg3, class172 arg4, int arg5) {
        field350++;
        class210.field3453 = arg2;
        int var7 = 76 % ((arg1 - 20) / 55);
        class329.field5080 = arg4;
        class324.method2271((byte) -60, arg5, arg0);
        for (int var8 = 0; var8 < this.field355.length; var8++) {
            this.field355[var8].method2050((byte) -4, arg5, arg0);
        }
        float[] var9 = new float[arg0 * arg5 * 4];
        int var10 = 0;
        for (int var11 = 0; var11 < arg0; var11++) {
            if (arg3) {
                var10 = var11 << 2;
            }
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field338.field4572) {
                int[] var12 = this.field338.method60(true, var11);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field338.method62((byte) 124, var11);
                var14 = var16[1];
                var15 = var16[2];
                var13 = var16[0];
            }
            int[] var17;
            if (this.field349.field4572) {
                var17 = this.field349.method60(true, var11);
            } else {
                var17 = this.field349.method62((byte) 125, var11)[0];
            }
            int[] var18;
            if (this.field347.field4572) {
                var18 = this.field347.method60(true, var11);
            } else {
                var18 = this.field347.method62((byte) 126, var11)[0];
            }
            for (int var19 = arg5 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var9[var10++] = (float) var13[var19] * var21;
                var9[var10++] = (float) var14[var19] * var21;
                var9[var10++] = (float) var15[var19] * var21;
                var9[var10++] = var20;
                if (arg3) {
                    var10 += (arg5 << 2) - 4;
                }
            }
        }
        for (int var22 = 0; var22 < this.field355.length; var22++) {
            this.field355[var22].method1028(13818);
        }
        return var9;
    }

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "(I)V", line = 413)
    public static void method142(int arg0) {
        if (arg0 == 0) {
            field337 = null;
            field351 = (byte[][]) null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I[Log;I)V", line = 429)
    public static final void method143(int arg0, class157[] arg1, int arg2) {
        if (arg2 < 125) {
            return;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class157 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field2478 == 0) {
                    if (var4.field2472 != null) {
                        method143(arg0, var4.field2472, 126);
                    }
                    class90 var5 = (class90) class243.field3842.method451((long) var4.field2486, (byte) 100);
                    if (var5 != null) {
                        class60.method410(-11484, arg0, var5.field1249);
                    }
                }
                if (arg0 == 0 && var4.field2437 != null) {
                    class39 var6 = new class39();
                    var6.field500 = var4;
                    var6.field501 = var4.field2437;
                    class144.method1065(var6, (byte) 67);
                }
                if (arg0 == 1 && var4.field2462 != null) {
                    if (var4.field2482 >= 0) {
                        class157 var7 = class142.method1053(var4.field2486, 65535);
                        if (var7 == null || var7.field2472 == null || var4.field2482 >= var7.field2472.length || var7.field2472[var4.field2482] != var4) {
                            continue;
                        }
                    }
                    class39 var8 = new class39();
                    var8.field500 = var4;
                    var8.field501 = var4.field2462;
                    class144.method1065(var8, (byte) 67);
                }
            }
        }
        field354++;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIII)V", line = 496)
    public static final void method144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field345++;
        int var6 = arg3 - arg0;
        int var7 = arg2 - arg5;
        if (var6 == 0) {
            if (var7 != 0) {
                class259.method1853(arg4, 8598, arg0, arg5, arg2);
            }
        } else if (var7 == 0) {
            class253.method1822(arg0, arg3, arg5, arg4, 1);
        } else {
            int var8 = (var7 << 12) / var6;
            if (arg1 != 28060) {
                field337 = (class102) null;
            }
            int var9 = arg5 - (arg0 * var8 >> 12);
            int var10;
            int var11;
            if (arg0 < class336.field5249) {
                var10 = (class336.field5249 * var8 >> 12) + var9;
                var11 = class336.field5249;
            } else if (arg0 > class191.field3131) {
                var11 = class191.field3131;
                var10 = (class191.field3131 * var8 >> 12) + var9;
            } else {
                var11 = arg0;
                var10 = arg5;
            }
            if (class98.field1410 > var10) {
                var10 = class98.field1410;
                var11 = (class98.field1410 - var9 << 12) / var8;
            } else if (var10 > class279.field4497) {
                var10 = class279.field4497;
                var11 = (class279.field4497 - var9 << 12) / var8;
            }
            int var12;
            int var13;
            if (arg3 < class336.field5249) {
                var12 = (class336.field5249 * var8 >> 12) + var9;
                var13 = class336.field5249;
            } else if (arg3 > class191.field3131) {
                var13 = class191.field3131;
                var12 = var9 + (class191.field3131 * var8 >> 12);
            } else {
                var12 = arg2;
                var13 = arg3;
            }
            if (class98.field1410 > var12) {
                var13 = (class98.field1410 - var9 << 12) / var8;
                var12 = class98.field1410;
            } else if (class279.field4497 < var12) {
                var12 = class279.field4497;
                var13 = (class279.field4497 - var9 << 12) / var8;
            }
            class70.method462(var11, (byte) -87, var12, var13, var10, arg4);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIBIIII)V", line = 600)
    public static final void method145(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field352++;
        int var8 = 0;
        int var9 = arg0;
        int var10 = arg0 - arg6;
        int var11 = 0;
        int var12 = arg1 - arg6;
        int var13 = var12 * var12;
        int var14 = arg0 * arg0;
        int var15 = arg1 * arg1;
        if (arg3 != 72) {
            return;
        }
        int var16 = var10 * var10;
        int var17 = var14 << 1;
        int var18 = var16 << 1;
        int var19 = var15 << 1;
        int var20 = var10 << 1;
        int var21 = var13 << 1;
        int var22 = arg0 << 1;
        int var23 = var14 - (var22 - 1) * var19;
        int var24 = (1 - var20) * var13 + var18;
        int var25 = var16 - ((var20 - 1) * var21);
        int var26 = (1 - var22) * var15 + var17;
        int var27 = var13 << 2;
        int var28 = var15 << 2;
        int var29 = var17 * 3;
        int var30 = var14 << 2;
        int var31 = var16 << 2;
        int var32 = (var22 - 3) * var19;
        int var33 = (var20 - 3) * var21;
        int var34 = var30;
        int var35 = var18 * 3;
        int var36 = var31;
        int var37 = (var10 - 1) * var27;
        int var38 = (arg0 - 1) * var28;
        if (arg2 >= class98.field1410 && class279.field4497 >= arg2) {
            int[] var39 = class281.field4523[arg2];
            int var40 = class33.method178(class191.field3131, class336.field5249, arg4 - arg1, 91);
            int var41 = class33.method178(class191.field3131, class336.field5249, arg4 + arg1, 115);
            int var42 = class33.method178(class191.field3131, class336.field5249, arg4 - var12, 60);
            int var43 = class33.method178(class191.field3131, class336.field5249, arg4 + var12, 119);
            class80.method545(arg5, -109, var42, var40, var39);
            class80.method545(arg7, -74, var43, var42, var39);
            class80.method545(arg5, arg3 ^ 0xFFFFFFC8, var41, var43, var39);
        }
        while (var9 > 0) {
            if (var26 < 0) {
                while (var26 < 0) {
                    var11++;
                    var23 += var34;
                    var34 += var30;
                    var26 += var29;
                    var29 += var30;
                }
            }
            if (var23 < 0) {
                var11++;
                var23 += var34;
                var34 += var30;
                var26 += var29;
                var29 += var30;
            }
            var26 += -var38;
            var23 += -var32;
            var32 -= var28;
            boolean var44 = var9 <= var10;
            var9--;
            var38 -= var28;
            if (var44) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var25 += var36;
                        var36 += var31;
                        var8++;
                        var24 += var35;
                        var35 += var31;
                    }
                }
                if (var25 < 0) {
                    var25 += var36;
                    var36 += var31;
                    var24 += var35;
                    var8++;
                    var35 += var31;
                }
                var25 += -var33;
                var24 += -var37;
                var37 -= var27;
                var33 -= var27;
            }
            int var45 = arg2 - var9;
            int var46 = arg2 + var9;
            if (var46 >= class98.field1410 && var45 <= class279.field4497) {
                int var47 = class33.method178(class191.field3131, class336.field5249, arg4 + var11, arg3 ^ 0x71);
                int var48 = class33.method178(class191.field3131, class336.field5249, arg4 - var11, 63);
                if (var44) {
                    int var49 = class33.method178(class191.field3131, class336.field5249, arg4 + var8, 35);
                    int var50 = class33.method178(class191.field3131, class336.field5249, arg4 - var8, 25);
                    if (class98.field1410 <= var45) {
                        int[] var51 = class281.field4523[var45];
                        class80.method545(arg5, -98, var50, var48, var51);
                        class80.method545(arg7, -90, var49, var50, var51);
                        class80.method545(arg5, -98, var47, var49, var51);
                    }
                    if (var46 <= class279.field4497) {
                        int[] var52 = class281.field4523[var46];
                        class80.method545(arg5, -64, var50, var48, var52);
                        class80.method545(arg7, arg3 ^ 0xFFFFFFE8, var49, var50, var52);
                        class80.method545(arg5, -66, var47, var49, var52);
                    }
                } else {
                    if (class98.field1410 <= var45) {
                        class80.method545(arg5, arg3 - 181, var47, var48, class281.field4523[var45]);
                    }
                    if (class279.field4497 >= var46) {
                        class80.method545(arg5, arg3 - 130, var47, var48, class281.field4523[var46]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lak;BLeg;DIIZ)Lta;", line = 808)
    public final class293 method146(class172 arg0, byte arg1, class154 arg2, double arg3, int arg4, int arg5, boolean arg6) {
        class62.method425(arg3, (byte) -97);
        field344++;
        class210.field3453 = arg2;
        class329.field5080 = arg0;
        class324.method2271((byte) -72, arg4, arg5);
        class293 var9 = new class293(arg4, arg5);
        for (int var10 = 0; var10 < this.field355.length; var10++) {
            this.field355[var10].method2050((byte) -4, arg4, arg5);
        }
        int var11 = 0;
        if (arg1 > -24) {
            return (class293) null;
        }
        for (int var12 = 0; var12 < arg5; var12++) {
            if (arg6) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field338.field4572) {
                int[] var17 = this.field338.method60(true, var12);
                var16 = var17;
                var15 = var17;
                var14 = var17;
            } else {
                int[][] var13 = this.field338.method62((byte) 127, var12);
                var14 = var13[1];
                var15 = var13[2];
                var16 = var13[0];
            }
            int[] var18;
            if (this.field349.field4572) {
                var18 = this.field349.method60(true, var12);
            } else {
                var18 = this.field349.method62((byte) 125, var12)[0];
            }
            for (int var19 = arg4 - 1; var19 >= 0; var19--) {
                int var20 = var16[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var21 = var15[var19] >> 4;
                if (var20 < 0) {
                    var20 = 0;
                }
                int var22 = var14[var19] >> 4;
                int var23 = class208.field3423[var20];
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var24 = class208.field3423[var21];
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var25 = class208.field3423[var22];
                int var26;
                if (var23 == 0 && var25 == 0 && var24 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9.field3545[var11++] = (var25 << 8) + (var23 << 16) + (var26 << 24) + var24;
                if (arg6) {
                    var11 += (arg4 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field355.length; var27++) {
            this.field355[var27].method1028(13818);
        }
        return var9;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZLak;IDILeg;ZZ)[I", line = 945)
    public final int[] method147(boolean arg0, class172 arg1, int arg2, double arg3, int arg4, class154 arg5, boolean arg6, boolean arg7) {
        field343++;
        class62.method425(arg3, (byte) -97);
        class210.field3453 = arg5;
        class329.field5080 = arg1;
        int[] var10 = new int[arg2 * arg4];
        class324.method2271((byte) -75, arg2, arg4);
        for (int var11 = 0; var11 < this.field355.length; var11++) {
            this.field355[var11].method2050((byte) -4, arg2, arg4);
        }
        int var12;
        int var13;
        byte var14;
        if (arg6) {
            var14 = -1;
            var13 = arg2 - 1;
            var12 = -1;
        } else {
            var12 = arg2;
            var13 = 0;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg4; var16++) {
            if (arg0) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field338.field4572) {
                int[] var17 = this.field338.method60(true, var16);
                var18 = var17;
                var19 = var17;
                var20 = var17;
            } else {
                int[][] var21 = this.field338.method62((byte) 122, var16);
                var18 = var21[2];
                var20 = var21[0];
                var19 = var21[1];
            }
            for (int var22 = var13; var22 != var12; var22 += var14) {
                int var23 = var19[var22] >> 4;
                int var24 = var20[var22] >> 4;
                int var25 = var18[var22] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = class208.field3423[var24];
                if (var23 > 255) {
                    var23 = 255;
                }
                int var27 = class208.field3423[var25];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var28 = class208.field3423[var23];
                var10[var15++] = (var26 << 16) + (var28 << 8) + var27;
                if (arg0) {
                    var15 += arg2 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field355.length; var29++) {
            this.field355[var29].method1028(13818);
        }
        if (arg7) {
            return var10;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILak;Leg;)Z", line = 1082)
    public final boolean method148(int arg0, class172 arg1, class154 arg2) {
        field353++;
        if (class103.field1510 > 0) {
            for (int var4 = 0; var4 < this.field339.length; var4++) {
                if (!arg1.method1269(this.field339[var4], class103.field1510, (byte) -97)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field339.length; var5++) {
                if (!arg1.method1276(this.field339[var5], 81)) {
                    return false;
                }
            }
        }
        if (arg0 > -8) {
            field337 = (class102) null;
        }
        for (int var6 = 0; var6 < this.field348.length; var6++) {
            if (!arg2.method435(this.field348[var6], 2048)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V", line = 1143)
    public class25() {
        this.field339 = new int[0];
        this.field348 = new int[0];
        this.field347 = new class311(0);
        this.field347.field4579 = 1;
        this.field338 = new class311();
        this.field338.field4579 = 1;
        this.field349 = new class311();
        this.field355 = new class285[] { this.field338, this.field349, this.field347 };
        this.field349.field4579 = 1;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Ljj;)V", line = 1158)
    public class25(class44 arg0) {
        int var2 = arg0.method286((byte) -91);
        this.field355 = new class285[var2];
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class285 var7 = class155.method1113((byte) 111, arg0);
            if (var7.method1031(-128) >= 0) {
                var4++;
            }
            if (var7.method1537(true) >= 0) {
                var3++;
            }
            int var8 = var7.field4580.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method286((byte) -88);
            }
            this.field355[var6] = var7;
        }
        this.field339 = new int[var4];
        int var10 = 0;
        this.field348 = new int[var3];
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class285 var13 = this.field355[var12];
            int var14 = var13.field4580.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field4580[var15] = this.field355[var5[var12][var15]];
            }
            int var16 = var13.method1031(-128);
            int var17 = var13.method1537(true);
            if (var16 > 0) {
                this.field339[var10++] = var16;
            }
            if (var17 > 0) {
                this.field348[var11++] = var17;
            }
            var5[var12] = null;
        }
        this.field338 = this.field355[arg0.method286((byte) -75)];
        int[][] var18 = (int[][]) null;
        this.field349 = this.field355[arg0.method286((byte) -82)];
        this.field347 = this.field355[arg0.method286((byte) -95)];
    }
}
