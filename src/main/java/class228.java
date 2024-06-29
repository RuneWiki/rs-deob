import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class228 extends class4 {

    @OriginalMember(owner = "client!eh", name = "V", descriptor = "I")
    private int field2927 = -1;

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "Luv;")
    public static class3 field2915 = new class3(58, 4);

    @OriginalMember(owner = "client!eh", name = "U", descriptor = "S")
    public static short field2926 = 32767;

    @OriginalMember(owner = "client!eh", name = "F", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "I")
    public int field2916;

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!eh", name = "K", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!eh", name = "L", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!eh", name = "N", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!eh", name = "O", descriptor = "I")
    public int field2921;

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!eh", name = "Q", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!eh", name = "R", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!eh", name = "S", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!eh", name = "W", descriptor = "Lhda;")
    public static class245 field2928;

    @OriginalMember(owner = "client!eh", name = "E", descriptor = "[I")
    public int[] field2912;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class520.method2898(arg3, -26760);
        if (arg0 < -84) {
            ++field2922;
            int var7 = 0;
            int var8 = arg3 - arg5;
            if (~var8 > -1) {
                var8 = 0;
            }
            int var9 = arg3;
            int var10 = -arg3;
            int var11 = var8;
            int var12 = -var8;
            int var13 = -1;
            int var14 = -1;
            if (class535.field7467 <= arg1 && class113.field1453 >= arg1) {
                int[] var15 = class256.field3173[arg1];
                int var16 = class69.method398((byte) -123, arg4 - arg3, class355.field4972, class594.field8575);
                int var17 = class69.method398((byte) -116, arg3 + arg4, class355.field4972, class594.field8575);
                int var18 = class69.method398((byte) -123, -var8 + arg4, class355.field4972, class594.field8575);
                int var19 = class69.method398((byte) 32, arg4 + var8, class355.field4972, class594.field8575);
                class373.method2275((byte) -9, var18, arg2, var16, var15);
                class373.method2275((byte) -9, var19, arg6, var18, var15);
                class373.method2275((byte) -9, var17, arg2, var19, var15);
            }
            while (var7 < var9) {
                var14 += 2;
                var13 += 2;
                var12 += var14;
                var10 += var13;
                if (~var12 <= -1 && ~var11 <= -2) {
                    --var11;
                    var12 -= var11 << 1;
                    class317.field4377[var11] = var7;
                }
                ++var7;
                if (var10 >= 0) {
                    --var9;
                    var10 -= var9 << 1;
                    int var20 = -var9 + arg1;
                    int var21 = arg1 + var9;
                    if (~class535.field7467 >= ~var21 && ~class113.field1453 <= ~var20) {
                        if (~var8 >= ~var9) {
                            int var22 = class69.method398((byte) -126, arg4 + var7, class355.field4972, class594.field8575);
                            int var23 = class69.method398((byte) -112, -var7 + arg4, class355.field4972, class594.field8575);
                            if (~var21 >= ~class113.field1453) {
                                class373.method2275((byte) -9, var22, arg2, var23, class256.field3173[var21]);
                            }
                            if (~var20 <= ~class535.field7467) {
                                class373.method2275((byte) -9, var22, arg2, var23, class256.field3173[var20]);
                            }
                        } else {
                            int var24 = class317.field4377[var9];
                            int var25 = class69.method398((byte) -109, arg4 + var7, class355.field4972, class594.field8575);
                            int var26 = class69.method398((byte) -110, -var7 + arg4, class355.field4972, class594.field8575);
                            int var27 = class69.method398((byte) -112, arg4 + var24, class355.field4972, class594.field8575);
                            int var28 = class69.method398((byte) 107, arg4 - var24, class355.field4972, class594.field8575);
                            if (~var21 >= ~class113.field1453) {
                                int[] var29 = class256.field3173[var21];
                                class373.method2275((byte) -9, var28, arg2, var26, var29);
                                class373.method2275((byte) -9, var27, arg6, var28, var29);
                                class373.method2275((byte) -9, var25, arg2, var27, var29);
                            }
                            if (class535.field7467 <= var20) {
                                int[] var30 = class256.field3173[var20];
                                class373.method2275((byte) -9, var28, arg2, var26, var30);
                                class373.method2275((byte) -9, var27, arg6, var28, var30);
                                class373.method2275((byte) -9, var25, arg2, var27, var30);
                            }
                        }
                    }
                }
                int var31 = -var7 + arg1;
                int var32 = arg1 - -var7;
                if (~var32 <= ~class535.field7467 && class113.field1453 >= var31) {
                    int var33 = arg4 - -var9;
                    int var34 = -var9 + arg4;
                    if (~class594.field8575 >= ~var33 && var34 <= class355.field4972) {
                        int var35 = class69.method398((byte) -37, var33, class355.field4972, class594.field8575);
                        int var36 = class69.method398((byte) 125, var34, class355.field4972, class594.field8575);
                        if (~var8 < ~var7) {
                            int var37 = var11 < var7 ? class317.field4377[var7] : var11;
                            int var38 = class69.method398((byte) -116, arg4 + var37, class355.field4972, class594.field8575);
                            int var39 = class69.method398((byte) -16, arg4 - var37, class355.field4972, class594.field8575);
                            if (class113.field1453 >= var32) {
                                int[] var40 = class256.field3173[var32];
                                class373.method2275((byte) -9, var39, arg2, var36, var40);
                                class373.method2275((byte) -9, var38, arg6, var39, var40);
                                class373.method2275((byte) -9, var35, arg2, var38, var40);
                            }
                            if (var31 >= class535.field7467) {
                                int[] var41 = class256.field3173[var31];
                                class373.method2275((byte) -9, var39, arg2, var36, var41);
                                class373.method2275((byte) -9, var38, arg6, var39, var41);
                                class373.method2275((byte) -9, var35, arg2, var38, var41);
                            }
                        } else {
                            if (~var32 >= ~class113.field1453) {
                                class373.method2275((byte) -9, var35, arg2, var36, class256.field3173[var32]);
                            }
                            if (~var31 <= ~class535.field7467) {
                                class373.method2275((byte) -9, var35, arg2, var36, class256.field3173[var31]);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)Z")
    public final boolean method1443(byte arg0) {
        ++field2917;
        if (arg0 < 52) {
            this.method16(36);
        }
        if (this.field2912 != null) {
            return true;
        } else if (~this.field2927 <= -1) {
            class295 var2 = class187.field2410 >= 0 ? class295.method1806(class546.field7607, class187.field2410, this.field2927) : class295.method1812(class546.field7607, this.field2927);
            var2.method1814();
            this.field2912 = var2.method1807();
            this.field2921 = var2.field3835;
            this.field2916 = var2.field3834;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
    public class228() {
        super(0, false);
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(B)V")
    public static void method1444(byte arg0) {
        field2915 = null;
        if (arg0 != 107) {
            field2915 = null;
        }
        field2928 = null;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V")
    public final void method14(int arg0) {
        super.method14(arg0);
        ++field2923;
        this.field2912 = null;
    }

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "(I)[Lvk;")
    public static final class414[] method1445(int arg0) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field2919;
            return new class414[] { class618.field8915, class487.field6793, class381.field5335 };
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        if (~arg2 == -1) {
            this.field2927 = arg1.method3090(-104);
        }
        ++field2918;
        if (arg0 >= -89) {
            this.method1443((byte) 70);
        }
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(IZI)I")
    public static final int method1446(int arg0, boolean arg1, int arg2) {
        ++field2913;
        if (class491.field6867 == -1) {
            return 1;
        } else {
            if (~class428.field5845 != ~arg2) {
                class293.method1796(arg2, (byte) -64);
                if (~class428.field5845 != ~arg2) {
                    return -1;
                }
            }
            try {
                Dimension var3 = class141.field1806.getSize();
                class410.method2447(class265.field3376.method2157(class245.field3103, 4074), true, -25375, class522.field7281);
                class528 var4 = class624.method3603(-102, 0, class491.field6867, class245.field3104);
                long var5 = class348.method2175(-120);
                class301.field3918.method962();
                class643.field9335.method361(0, class337.field4699, 0);
                class301.field3918.method956(class643.field9335);
                class301.field3918.method961(var3.width / 2, var3.height / 2, 512, 512);
                class301.field3918.method993(1.0F);
                class301.field3918.method981(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
                class521 var7 = class301.field3918.method197(var4, 2048, 64, 64, 768);
                int var8 = 0;
                label45: for (int var9 = 0; ~var9 > -501; ++var9) {
                    class301.field3918.method949(0);
                    class301.field3918.method996();
                    for (int var10 = 15; var10 >= 0; --var10) {
                        for (int var11 = 0; var10 >= var11; ++var11) {
                            class82.field1116.method361((int) (((float) var11 - (float) var10 / 2.0F) * (float) class456.field6523), 0, (var10 + 1) * class456.field6523);
                            var7.method1595(class82.field1116, (class378) null, 0);
                            ++var8;
                            if (-var5 + class348.method2175(-128) >= (long) arg0) {
                                break label45;
                            }
                        }
                    }
                }
                if (arg1) {
                    method1447((byte) 101, (class313) null);
                }
                class301.field3918.method948();
                long var12 = (long) (var8 * 1000) / (class348.method2175(-126) - var5);
                class301.field3918.method949(0);
                class301.field3918.method996();
                return (int) var12;
            } catch (Throwable var15) {
                var15.printStackTrace();
                return -1;
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IB)[[I")
    public int[][] method17(int arg0, byte arg1) {
        ++field2924;
        if (arg1 >= -83) {
            this.field2927 = 97;
        }
        int[][] var3 = super.field38.method3021((byte) 89, arg0);
        if (super.field38.field7618 && this.method1443((byte) 103)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (class620.field8925 == this.field2916 ? arg0 : this.field2916 * arg0 / class620.field8925) * this.field2921;
            if (class132.field1627 != this.field2921) {
                for (int var8 = 0; var8 < class132.field1627; ++var8) {
                    int var9 = this.field2921 * var8 / class132.field1627;
                    int var10 = this.field2912[var7 + var9];
                    var6[var8] = class143.method783(var10, 255) << 4;
                    var5[var8] = class143.method783(65280, var10) >> 4;
                    var4[var8] = class143.method783(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; var11 < class132.field1627; ++var11) {
                    int var12 = this.field2912[var7++];
                    var6[var11] = class143.method783(var12, 255) << 4;
                    var5[var11] = class143.method783(var12, 65280) >> 4;
                    var4[var11] = class143.method783(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)I")
    public final int method16(int arg0) {
        ++field2925;
        if (arg0 != 112) {
            method1447((byte) -3, (class313) null);
        }
        return this.field2927;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLuq;)V")
    public static final void method1447(byte arg0, class313 arg1) {
        if (class82.field1117 == null) {
            class49 var2 = new class49();
            byte[] var3 = var2.method269(128, -3222, 128, 16);
            class82.field1117 = class410.method2443((byte) -62, false, var3);
        }
        ++field2914;
        if (class452.field6401 == null) {
            class40 var4 = new class40();
            byte[] var5 = var4.method231(128, 16, 128, 0);
            class452.field6401 = class410.method2443((byte) -62, false, var5);
        }
        int var6 = 36 % ((arg0 - 27) / 43);
        class408 var7 = arg1.field4199;
        if (var7.method2432(35632) && class523.field7292 == null) {
            byte[] var8 = class95.method521(0.6F, new class304(419684), 4.0F, 8, 0.5F, 16.0F, (byte) -90, 128, 16, 128, 4.0F);
            class523.field7292 = class410.method2443((byte) -62, false, var8);
        }
    }
}
