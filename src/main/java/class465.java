import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class465 {

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
    public static int field6408 = 0;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "Ldia;")
    public static class235 field6409 = new class235("", 12);

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
    public static int field6407;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V", line = 5)
    public static void method2635(int arg0) {
        int var1 = -2 % ((arg0 + 82) / 40);
        field6409 = null;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IBILha;Lvfa;)V", line = 14)
    public static final void method2636(int arg0, byte arg1, int arg2, class59 arg3, class672 arg4) {
        field6405++;
        if (arg1 >= -101) {
            return;
        }
        class490 var5 = arg4.method3715(arg3, 0);
        if (var5 == null) {
            return;
        }
        arg3.method419(arg2, arg0, arg2 + arg4.field9287, arg4.field9178 + arg0);
        if (class694.field9657 == 2 || class694.field9657 == 5 || class355.field4993 == null) {
            arg3.method432(-16777216, var5, arg2, arg0);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class278.field3898 == 4) {
            var6 = (int) (-class547.field7230) & 0x3FFF;
            var9 = 4096;
            var8 = class513.field6808;
            var7 = class248.field3439;
        } else {
            var6 = (int) (-class547.field7230) + class649.field8626 & 0x3FFF;
            var7 = class472.field6475.field3502;
            var8 = class472.field6475.field3505;
            var9 = 4096 - (class260.field3629 * 16);
        }
        int var10 = var8 / 128 + 48 + 208 - (class719.field10004 * 2);
        int var11 = class107.field1453 * 4 + 48 - (var7 / 128) - (class107.field1453 + -104) * 2;
        class355.field4993.method1030((float) arg4.field9287 / 2.0F + (float) arg2, (float) arg4.field9178 / 2.0F + (float) arg0, (float) var10, (float) var11, var9, var6 << 2, var5, arg2, arg0);
        for (class651 var12 = (class651) class643.field8560.method21(2); var12 != null; var12 = (class651) class643.field8560.method9(-127)) {
            int var58 = var12.field8636;
            int var59 = ((class668.field9128.field5096[var58] & 0xFFFF924) >> 14) - class503.field6752;
            int var60 = (class668.field9128.field5096[var58] & 0x3FFF) - class334.field4757;
            int var61 = var59 * 4 + 2 - (var8 / 128);
            int var62 = var60 * 4 + 2 - var7 / 128;
            class471.method2652(arg4, var62, arg0, arg2, -99, class668.field9128.field5098[var58], var5, var61, arg3);
        }
        for (int var13 = 0; var13 < class437.field6022; var13++) {
            int var55 = class418.field5770[var13] * 4 + 2 - (var8 / 128);
            int var56 = class48.field606[var13] * 4 + 2 - (var7 / 128);
            class100 var57 = class462.field6333.method2008((byte) -97, class573.field7528[var13]);
            if (var57.field1307 != null) {
                var57 = var57.method748(class74.field901, 121);
                if (var57 == null || var57.field1291 == -1) {
                    continue;
                }
            }
            class471.method2652(arg4, var56, arg0, arg2, -109, var57.field1291, var5, var55, arg3);
        }
        for (class635 var14 = (class635) class649.field8627.method2144(true); var14 != null; var14 = (class635) class649.field8627.method2146(false)) {
            int var50 = (int) (var14.field8680 >> 28 & 0x3L);
            if (class388.field5409 == var50) {
                int var51 = (int) (var14.field8680 & 0x3FFFL) - class503.field6752;
                int var52 = (int) (var14.field8680 >> 14 & 0x3FFFL) - class334.field4757;
                int var53 = var51 * 4 + 2 - var8 / 128;
                int var54 = var52 * 4 + 2 - (var7 / 128);
                class394.method2326(var5, arg2, class290.field4143[0], var54, var53, 110, arg0, arg4);
            }
        }
        for (int var15 = 0; var15 < class306.field4404; var15++) {
            class134 var45 = (class134) class390.field5470.method2135((long) class628.field8351[var15], (byte) 31);
            if (var45 != null) {
                class556 var46 = var45.field2154;
                if (var46.method3092((byte) -84) && class472.field6475.field3508 == var46.field3508) {
                    class166 var47 = var46.field7328;
                    if (var47 != null && var47.field2575 != null) {
                        var47 = var47.method1190((byte) 101, class74.field901);
                    }
                    if (var47 != null && var47.field2573 && var47.field2563) {
                        int var48 = var46.field3505 / 128 - (var8 / 128);
                        int var49 = var46.field3502 / 128 - (var7 / 128);
                        if (var47.field2520 == -1) {
                            class394.method2326(var5, arg2, class290.field4143[1], var49, var48, 97, arg0, arg4);
                        } else {
                            class471.method2652(arg4, var49, arg0, arg2, -103, var47.field2520, var5, var48, arg3);
                        }
                    }
                }
            }
        }
        int var16 = class586.field7665;
        int[] var17 = class20.field351;
        for (int var18 = 0; var18 < var16; var18++) {
            class383 var37 = class248.field3438[var17[var18]];
            if (var37 != null && var37.method2259((byte) -84) && !var37.field5369 && class472.field6475 != var37 && class472.field6475.field3508 == var37.field3508) {
                int var38 = var37.field3505 / 128 - (var8 / 128);
                int var39 = var37.field3502 / 128 - var7 / 128;
                boolean var40 = false;
                for (int var41 = 0; var41 < client.field4355; var41++) {
                    if (var37.field5334.equals(class549.field7252[var41]) && class458.field6255[var41] != 0) {
                        var40 = true;
                        break;
                    }
                }
                boolean var42 = false;
                for (int var43 = 0; var43 < class185.field2803; var43++) {
                    if (var37.field5334.equals(class732.field10141[var43].field3977)) {
                        var42 = true;
                        break;
                    }
                }
                boolean var44 = false;
                if (class472.field6475.field5326 != 0 && var37.field5326 != 0 && class472.field6475.field5326 == var37.field5326) {
                    var44 = true;
                }
                if (var37.field5349) {
                    class394.method2326(var5, arg2, class290.field4143[6], var39, var38, 107, arg0, arg4);
                } else if (var40) {
                    class394.method2326(var5, arg2, class290.field4143[3], var39, var38, -99, arg0, arg4);
                } else if (var42) {
                    class394.method2326(var5, arg2, class290.field4143[5], var39, var38, -3, arg0, arg4);
                } else if (var44) {
                    class394.method2326(var5, arg2, class290.field4143[4], var39, var38, -81, arg0, arg4);
                } else {
                    class394.method2326(var5, arg2, class290.field4143[2], var39, var38, 127, arg0, arg4);
                }
            }
        }
        class317[] var19 = class27.field435;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class317 var23 = var19[var20];
            if (var23 != null && var23.field4526 != 0 && class29.field474 % 20 < 10) {
                if (var23.field4526 == 1) {
                    class134 var24 = (class134) class390.field5470.method2135((long) var23.field4521, (byte) 31);
                    if (var24 != null) {
                        class556 var25 = var24.field2154;
                        int var26 = var25.field3505 / 128 - var8 / 128;
                        int var27 = var25.field3502 / 128 - (var7 / 128);
                        class238.method1500(arg2, (byte) -91, var27, var26, var5, arg0, arg4, 360000L, var23.field4524);
                    }
                }
                if (var23.field4526 == 2) {
                    int var28 = var23.field4516 / 128 - (var8 / 128);
                    int var29 = var23.field4520 / 128 - (var7 / 128);
                    long var30 = (long) (var23.field4525 << 7);
                    long var32 = var30 * var30;
                    class238.method1500(arg2, (byte) -95, var29, var28, var5, arg0, arg4, var32, var23.field4524);
                }
                if (var23.field4526 == 10 && var23.field4521 >= 0 && class248.field3438.length > var23.field4521) {
                    class383 var34 = class248.field3438[var23.field4521];
                    if (var34 != null) {
                        int var35 = var34.field3505 / 128 - (var8 / 128);
                        int var36 = var34.field3502 / 128 - var7 / 128;
                        class238.method1500(arg2, (byte) -73, var36, var35, var5, arg0, arg4, 360000L, var23.field4524);
                    }
                }
            }
        }
        if (class278.field3898 == 4) {
            return;
        }
        if (class359.field5044 != 0) {
            int var21 = class359.field5044 * 4 + class472.field6475.method2256(-1) * 2 + 2 - (var8 / 128) - 2;
            int var22 = class102.field1421 * 4 + class472.field6475.method2256(-1) * 2 + 2 - var7 / 128 - 2;
            class394.method2326(var5, arg2, class659.field8707[class376.field5231 ? 1 : 0], var22, var21, 90, arg0, arg4);
        }
        if (!class472.field6475.field5369) {
            arg3.method489(3, 98, 3, arg4.field9178 / 2 + arg0 - 1, arg2 - -(arg4.field9287 / 2) + -1, -1);
            return;
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V", line = 329)
    public static final void method2637(int arg0) {
        field6406++;
        if (!class12.field194) {
            class616.field8238 = true;
            int var1 = -73 % ((arg0 - 44) / 40);
            class528.field7009 += (-class528.field7009 - 24.0F) / 2.0F;
            class12.field194 = true;
        }
    }
}
