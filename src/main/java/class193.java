import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class193 implements class290 {

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "I")
    public int field2829;

    @OriginalMember(owner = "client!qga", name = "d", descriptor = "I")
    public int field2832;

    @OriginalMember(owner = "client!qga", name = "f", descriptor = "[F")
    public float[] field2834;

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "Llc;")
    public static class435 field2830 = new class435(51, -2);

    @OriginalMember(owner = "client!qga", name = "h", descriptor = "[I")
    public static int[] field2836 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!qga", name = "e", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!qga", name = "g", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!qga", name = "i", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!qga", name = "j", descriptor = "Lda;")
    public static class400 field2838;

    @OriginalMember(owner = "client!qga", name = "k", descriptor = "[[I")
    public static int[][] field2839;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)V", line = 5)
    public static void method1369(int arg0) {
        field2839 = null;
        if (arg0 == 208) {
            field2830 = null;
            field2838 = null;
            field2836 = null;
        }
    }

    @OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(II)V", line = 27)
    public class193(int arg0, int arg1) {
        this.field2829 = arg0;
        this.field2832 = arg1;
        this.field2834 = new float[arg0 * arg1];
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(BLqk;Lha;II)V", line = 41)
    public static final void method1370(byte arg0, class146 arg1, class543 arg2, int arg3, int arg4) {
        field2835++;
        class569 var5 = arg1.method1030(-120, arg2);
        if (arg0 != -98) {
            field2839 = null;
        }
        if (var5 == null) {
            return;
        }
        arg2.method297(arg3, arg4, arg1.field2016 + arg3, arg1.field1997 + arg4);
        if (class42.field710 == 2 || class42.field710 == 5 || class607.field8612 == null) {
            arg2.method293(-16777216, var5, arg3, arg4);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class165.field2351 == 4) {
            var9 = (int) (-class680.field9668) & 0x3FFF;
            var7 = class658.field9426;
            var8 = 4096;
            var6 = class472.field6697;
        } else {
            var6 = class108.field1536.field3923;
            var7 = class108.field1536.field3916;
            var8 = 4096 - class17.field162 * 16;
            var9 = (int) (-class680.field9668) + class225.field3350 & 0x3FFF;
        }
        int var10 = var6 / 128 + 48 + 208 - (class184.field2546 * 2);
        int var11 = 48 - (var7 / 128) - (class240.field3555 * 2 + -(class240.field3555 * 4) - 208);
        class607.field8612.method3136((float) arg1.field2016 / 2.0F + (float) arg3, (float) arg1.field1997 / 2.0F + (float) arg4, (float) var10, (float) var11, var8, var9 << 2, var5, arg3, arg4);
        for (class177 var12 = (class177) class135.field1856.method3565(-31); var12 != null; var12 = (class177) class135.field1856.method3561((byte) 49)) {
            int var58 = var12.field2473;
            int var59 = (class506.field7353.field7110[var58] >> 14 & 0x3FFF) - class41.field693;
            int var60 = (class506.field7353.field7110[var58] & 0x3FFF) - class71.field1085;
            int var61 = var59 * 4 + 2 - (var6 / 128);
            int var62 = var60 * 4 + 2 - var7 / 128;
            class337.method2077(arg3, var62, true, var5, class506.field7353.field7108[var58], var61, arg2, arg4, arg1);
        }
        for (int var13 = 0; var13 < class691.field9797; var13++) {
            int var55 = class658.field9418[var13] * 4 + 2 - (var6 / 128);
            int var56 = class511.field7412[var13] * 4 + 2 - (var7 / 128);
            class482 var57 = class375.field5421.method2680(class572.field8258[var13], (byte) 100);
            if (var57.field6900 != null) {
                var57 = var57.method2952(-1, class226.field3372);
                if (var57 == null || var57.field6970 == -1) {
                    continue;
                }
            }
            class337.method2077(arg3, var56, true, var5, var57.field6970, var55, arg2, arg4, arg1);
        }
        for (class340 var14 = (class340) class591.field8409.method4023((byte) -101); var14 != null; var14 = (class340) class591.field8409.method4021((byte) 80)) {
            int var50 = (int) (var14.field6188 >> 28 & 0x3L);
            if (class405.field5772 == var50) {
                int var51 = (int) (var14.field6188 & 0x3FFFL) - class41.field693;
                int var52 = (int) (var14.field6188 >> 14 & 0x3FFFL) - class71.field1085;
                int var53 = var51 * 4 + 2 - (var6 / 128);
                int var54 = var52 * 4 + 2 - (var7 / 128);
                class438.method2678(arg3, class168.field2376[0], var5, var53, var54, arg4, arg1, arg0 - 9);
            }
        }
        for (int var15 = 0; var15 < class619.field8816; var15++) {
            class63 var45 = (class63) class389.field5608.method4020((long) class545.field7927[var15], (byte) -71);
            if (var45 != null) {
                class571 var46 = var45.field1004;
                if (var46.method3394(69) && class108.field1536.field3920 == var46.field3920) {
                    class521 var47 = var46.field8235;
                    if (var47 != null && var47.field7535 != null) {
                        var47 = var47.method3166(class226.field3372, true);
                    }
                    if (var47 != null && var47.field7525 && var47.field7541) {
                        int var48 = var46.field3923 / 128 - (var6 / 128);
                        int var49 = var46.field3916 / 128 - (var7 / 128);
                        if (var47.field7515 == -1) {
                            class438.method2678(arg3, class168.field2376[1], var5, var48, var49, arg4, arg1, -77);
                        } else {
                            class337.method2077(arg3, var49, true, var5, var47.field7515, var48, arg2, arg4, arg1);
                        }
                    }
                }
            }
        }
        int var16 = class468.field6665;
        int[] var17 = class38.field500;
        for (int var18 = 0; var18 < var16; var18++) {
            class639 var37 = class536.field7796[var17[var18]];
            if (var37 != null && var37.method3684(127) && !var37.field9055 && class108.field1536 != var37 && class108.field1536.field3920 == var37.field3920) {
                int var38 = var37.field3923 / 128 - (var6 / 128);
                int var39 = var37.field3916 / 128 - var7 / 128;
                boolean var40 = false;
                for (int var41 = 0; var41 < class386.field5583; var41++) {
                    if (var37.field9056.equals(class196.field2860[var41]) && class329.field4455[var41] != 0) {
                        var40 = true;
                        break;
                    }
                }
                boolean var42 = false;
                for (int var43 = 0; var43 < class38.field495; var43++) {
                    if (var37.field9056.equals(class295.field4048[var43].field8809)) {
                        var42 = true;
                        break;
                    }
                }
                boolean var44 = false;
                if (class108.field1536.field9066 != 0 && var37.field9066 != 0 && class108.field1536.field9066 == var37.field9066) {
                    var44 = true;
                }
                if (var37.field9050) {
                    class438.method2678(arg3, class168.field2376[6], var5, var38, var39, arg4, arg1, -84);
                } else if (var40) {
                    class438.method2678(arg3, class168.field2376[3], var5, var38, var39, arg4, arg1, -102);
                } else if (var42) {
                    class438.method2678(arg3, class168.field2376[5], var5, var38, var39, arg4, arg1, -85);
                } else if (var44) {
                    class438.method2678(arg3, class168.field2376[4], var5, var38, var39, arg4, arg1, -74);
                } else {
                    class438.method2678(arg3, class168.field2376[2], var5, var38, var39, arg4, arg1, -128);
                }
            }
        }
        class504[] var19 = class99.field1437;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class504 var23 = var19[var20];
            if (var23 != null && var23.field7322 != 0 && (class703.field9918 % 20) < 10) {
                if (var23.field7322 == 1) {
                    class63 var24 = (class63) class389.field5608.method4020((long) var23.field7334, (byte) -112);
                    if (var24 != null) {
                        class571 var25 = var24.field1004;
                        int var26 = var25.field3923 / 128 - (var6 / 128);
                        int var27 = var25.field3916 / 128 - (var7 / 128);
                        class212.method1500(var5, var27, arg4, 360000L, arg1, arg3, var23.field7327, (byte) -105, var26);
                    }
                }
                if (var23.field7322 == 2) {
                    int var28 = var23.field7335 / 128 - var6 / 128;
                    int var29 = var23.field7323 / 128 - (var7 / 128);
                    long var30 = (long) (var23.field7333 << 7);
                    long var32 = var30 * var30;
                    class212.method1500(var5, var29, arg4, var32, arg1, arg3, var23.field7327, (byte) -105, var28);
                }
                if (var23.field7322 == 10 && var23.field7334 >= 0 && var23.field7334 < class536.field7796.length) {
                    class639 var34 = class536.field7796[var23.field7334];
                    if (var34 != null) {
                        int var35 = var34.field3923 / 128 - var6 / 128;
                        int var36 = var34.field3916 / 128 - (var7 / 128);
                        class212.method1500(var5, var36, arg4, 360000L, arg1, arg3, var23.field7327, (byte) -105, var35);
                    }
                }
            }
        }
        if (class165.field2351 == 4) {
            return;
        }
        if (class545.field7931 != 0) {
            int var21 = class545.field7931 * 4 + (class108.field1536.method2053(true) * 2 - 2) + 2 - (var6 / 128);
            int var22 = class455.field6488 * 4 + ((class108.field1536.method2053(true) + -1) * 2) + 2 - (var7 / 128);
            class438.method2678(arg3, class690.field9787[class126.field1745 ? 1 : 0], var5, var21, var22, arg4, arg1, arg0 ^ 0x1E);
        }
        if (!class108.field1536.field9055) {
            arg2.method3263((byte) -118, arg1.field2016 / 2 + arg3 - 1, 3, 3, arg1.field1997 / 2 + arg4 - 1, -1);
            return;
        }
    }
}
