import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public abstract class class430 {

    @OriginalMember(owner = "client!uba", name = "f", descriptor = "[S")
    private short[] field6130 = new short[512];

    @OriginalMember(owner = "client!uba", name = "c", descriptor = "I")
    private int field6127 = 4;

    @OriginalMember(owner = "client!uba", name = "j", descriptor = "I")
    private int field6134 = 4;

    @OriginalMember(owner = "client!uba", name = "i", descriptor = "I")
    private int field6133 = 0;

    @OriginalMember(owner = "client!uba", name = "g", descriptor = "I")
    public int field6131 = 4;

    @OriginalMember(owner = "client!uba", name = "p", descriptor = "I")
    private int field6140 = 4;

    @OriginalMember(owner = "client!uba", name = "k", descriptor = "Lmq;")
    public static class508 field6135 = null;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!uba", name = "d", descriptor = "I")
    public static int field6128;

    @OriginalMember(owner = "client!uba", name = "e", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!uba", name = "h", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!uba", name = "l", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!uba", name = "m", descriptor = "I")
    public static int field6137;

    @OriginalMember(owner = "client!uba", name = "o", descriptor = "I")
    public static int field6139;

    @OriginalMember(owner = "client!uba", name = "n", descriptor = "[S")
    private short[] field6138;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(III)V")
    public abstract void method129(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(B)V")
    public abstract void method125(byte arg0);

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)V")
    private final void method2623(int arg0) {
        this.field6138 = new short[this.field6131];
        field6136++;
        for (int var2 = 0; var2 < this.field6131; var2++) {
            this.field6138[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 > -21) {
            field6135 = null;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIIIB)V")
    public static final void method2624(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var5 = 21 / ((51 - arg4) / 52);
        field6132++;
        if (arg3 >= class71.field960 && arg3 <= class549.field7665) {
            int var6 = class24.method150(arg1, class143.field2050, false, class461.field6495);
            int var7 = class24.method150(arg2, class143.field2050, false, class461.field6495);
            class218.method1338(arg3, var7, arg0, var6, -8220);
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIZI)V")
    public final void method2625(int arg0, int arg1, boolean arg2, int arg3) {
        field6139++;
        if (arg2) {
            method2631(false);
        }
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg3];
        for (int var7 = 0; var7 < arg0; var7++) {
            var5[var7] = (var7 << 12) / arg0;
        }
        int[] var8 = new int[arg1];
        for (int var9 = 0; var9 < arg3; var9++) {
            var6[var9] = (var9 << 12) / arg3;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            var8[var10] = (var10 << 12) / arg1;
        }
        this.method128(3);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field6131; var14++) {
                        int var15 = this.field6138[var14] << 12;
                        int var16 = var8[var11] * var15 >> 12;
                        int var17 = this.field6134 * var15 >> 12;
                        int var18 = this.field6140 * var15 >> 12;
                        int var19 = this.field6127 * var15 >> 12;
                        int var20 = var6[var12] * var15 >> 12;
                        int var21 = var5[var13] * var15 >> 12;
                        int var22 = this.field6140 * var16;
                        int var23 = this.field6127 * var21;
                        int var24 = this.field6134 * var20;
                        int var25 = var23 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var24 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var22 >> 12;
                        int var31 = var27 & 0xFF;
                        int var32 = var30 + 1;
                        int var33 = var22 & 0xFFF;
                        int var34;
                        if (var18 <= var32) {
                            var34 = 0;
                        } else {
                            var34 = var32 & 0xFF;
                        }
                        int var35 = var23 & 0xFFF;
                        int var36;
                        if (var17 > var29) {
                            var36 = var29 & 0xFF;
                        } else {
                            var36 = 0;
                        }
                        int var37 = var30 & 0xFF;
                        int var38;
                        if (var26 < var19) {
                            var38 = var26 & 0xFF;
                        } else {
                            var38 = 0;
                        }
                        int var39 = var24 & 0xFFF;
                        short var40 = this.field6130[var34];
                        int var41 = var35 - 4096;
                        int var42 = var39 - 4096;
                        int var43 = class47.field556[var35];
                        short var44 = this.field6130[var37];
                        int var45 = var33 - 4096;
                        int var46 = class47.field556[var33];
                        int var47 = class47.field556[var39];
                        short var48 = this.field6130[var36 + var40];
                        short var49 = this.field6130[var31 + var44];
                        short var50 = this.field6130[var36 + var44];
                        short var51 = this.field6130[var31 + var40];
                        int var52 = class516.method3033(var33, this.field6130[var28 + var49], var39, var35, (byte) -77);
                        int var53 = class516.method3033(var33, this.field6130[var38 + var49], var39, var41, (byte) -113);
                        int var54 = ((var53 - var52) * var43 >> 12) + var52;
                        int var55 = class516.method3033(var33, this.field6130[var28 + var50], var42, var35, (byte) -62);
                        int var56 = class516.method3033(var33, this.field6130[var38 + var50], var42, var41, (byte) -87);
                        int var57 = ((var56 - var55) * var43 >> 12) + var55;
                        int var58 = var54 + ((var57 - var54) * var47 >> 12);
                        int var59 = class516.method3033(var45, this.field6130[var28 + var51], var39, var35, (byte) -73);
                        int var60 = class516.method3033(var45, this.field6130[var38 + var51], var39, var41, (byte) -86);
                        int var61 = ((var60 - var59) * var43 >> 12) + var59;
                        int var62 = class516.method3033(var45, this.field6130[var28 + var48], var42, var35, (byte) -102);
                        int var63 = class516.method3033(var45, this.field6130[var38 + var48], var42, var41, (byte) -95);
                        int var64 = ((var63 - var62) * var43 >> 12) + var62;
                        int var65 = ((var64 - var61) * var47 >> 12) + var61;
                        this.method129(var14, ((var65 - var58) * var46 >> 12) + var58, -101);
                    }
                    this.method125((byte) 58);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(II)I")
    public static final int method2626(int arg0, int arg1) {
        field6128++;
        if (arg1 != 0) {
            method2631(true);
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2627(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 > -98) {
            field6135 = null;
        }
        field6129++;
        if (class71.field960 <= (arg6 - arg0) && arg0 + arg6 <= class549.field7665 && class143.field2050 <= arg2 - arg0 && class461.field6495 >= (arg0 + arg2)) {
            class354.method2284(2, arg6, arg4, arg2, arg5, arg1, arg0);
        } else {
            class472.method2821(arg0, arg2, arg6, true, arg4, arg5, arg1);
        }
    }

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(I)V")
    private final void method2628(int arg0) {
        field6137++;
        Random var2 = new Random((long) this.field6133);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field6130[var3] = (short) var3;
        }
        if (arg0 != -256) {
            this.field6140 = -37;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class111.method790(var5, var2, (byte) -119);
            short var7 = this.field6130[var6];
            this.field6130[var6] = this.field6130[var5];
            this.field6130[var5] = this.field6130[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!uba", name = "c", descriptor = "(I)V")
    public abstract void method128(int arg0);

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Z)V")
    public static final void method2629(boolean arg0) {
        if (class561.field7879 > 1) {
            class561.field7879--;
            class542.field7578 = class2.field13;
        }
        field6126++;
        if (class711.field9881) {
            class711.field9881 = false;
            class467.method2786((byte) 103);
            return;
        }
        if (!class436.field6192) {
            class349.method2256(-2);
        }
        for (int var1 = 0; var1 < 100 && class363.method2317(-51); var1++) {
        }
        if (class222.field2897 != 10) {
            return;
        }
        while (class72.method593((byte) -115)) {
            class519 var2 = class357.method2293(class427.field5994, class333.field4662, (byte) -57);
            var2.field7384.method3694(0, -1528071456);
            int var3 = var2.field7384.field9146;
            class516.method3035(true, var2.field7384);
            var2.field7384.method3728(var2.field7384.field9146 - var3, (byte) 123);
            class151.method1027(var2, -20);
        }
        if (class401.field5699 == null) {
            if (class606.field8532 <= class479.method2864((byte) -41)) {
                class401.field5699 = class19.field291.method4080(class584.field8222.field10402, (byte) 54);
            }
        } else if (class401.field5699.field6392 != -1) {
            class519 var4 = class357.method2293(class427.field5994, class18.field279, (byte) 80);
            var4.field7384.method3745(-122, class401.field5699.field6392);
            class151.method1027(var4, -21);
            class401.field5699 = null;
            class606.field8532 = class479.method2864((byte) -53) + 30000L;
        }
        class382 var5 = (class382) class43.field528.method2765(-12261);
        if (var5 != null || (class479.method2864((byte) -61) - 2000L) > class729.field10189) {
            class519 var6 = null;
            int var7 = 0;
            for (class382 var8 = (class382) class648.field8911.method2765(-12261); var8 != null && (var6 == null || (var6.field7384.field9146 - var7) < 240); var8 = (class382) class648.field8911.method2759(-15361)) {
                var8.method1185(-126);
                int var9 = var8.method776(-124);
                if (var9 < -1) {
                    var9 = -1;
                } else if (var9 > 65534) {
                    var9 = 65534;
                }
                int var10 = var8.method779((byte) 74);
                if (var10 < -1) {
                    var10 = -1;
                } else if (var10 > 65534) {
                    var10 = 65534;
                }
                if (class114.field1376 != var10 || class335.field4670 != var9) {
                    if (var6 == null) {
                        var6 = class357.method2293(class427.field5994, class130.field1564, (byte) -103);
                        class545.field7600++;
                        var6.field7384.method3694(0, -1528071456);
                        var7 = var6.field7384.field9146;
                    }
                    int var11 = var10 - class114.field1376;
                    class114.field1376 = var10;
                    int var12 = var9 - class335.field4670;
                    class335.field4670 = var9;
                    int var13 = (int) ((var8.method773(126) - class729.field10189) / 20L);
                    if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                        var12 += 32;
                        var11 += 32;
                        var6.field7384.method3745(-127, (var13 << 12) + (var11 << 6) + var12);
                    } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                        var6.field7384.method3694(var13 + 128, -1528071456);
                        var11 += 128;
                        var12 += 128;
                        var6.field7384.method3745(-118, (var11 << 8) + var12);
                    } else if (var13 < 32) {
                        var6.field7384.method3694(var13 + 192, -1528071456);
                        if (var10 == 1 || var9 == -1) {
                            var6.field7384.method3733(-49, Integer.MIN_VALUE);
                        } else {
                            var6.field7384.method3733(-49, var9 << 16 | var10);
                        }
                    } else {
                        var6.field7384.method3745(-113, var13 + 57344);
                        if (var10 == 1 || var9 == -1) {
                            var6.field7384.method3733(-49, Integer.MIN_VALUE);
                        } else {
                            var6.field7384.method3733(-49, var10 | var9 << 16);
                        }
                    }
                    class729.field10189 = var8.method773(76);
                }
            }
            if (var6 != null) {
                var6.field7384.method3728(var6.field7384.field9146 - var7, (byte) 118);
                class151.method1027(var6, -64);
            }
        }
        if (var5 != null) {
            long var14 = (var5.method773(92) - class193.field2577) / 50L;
            class193.field2577 = var5.method773(95);
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            int var16 = var5.method776(-123);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = var5.method779((byte) 78);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            byte var18 = 0;
            if (var5.method778(0) == 2) {
                var18 = 1;
            }
            class615.field8614++;
            int var19 = (int) var14;
            class519 var20 = class357.method2293(class427.field5994, class496.field7131, (byte) -55);
            var20.field7384.method3745(-120, var19 | var18 << 15);
            var20.field7384.method3749(var16 << 16 | var17, (byte) -67);
            class151.method1027(var20, -92);
        }
        if (class721.field10004 > 0) {
            class110.field1352++;
            class519 var21 = class357.method2293(class427.field5994, class542.field7575, (byte) -40);
            var21.field7384.method3694(class721.field10004 * 3, -1528071456);
            for (int var22 = 0; var22 < class721.field10004; var22++) {
                class620 var23 = class622.field8670[var22];
                long var24 = (var23.method693(32678) - class623.field8672) / 50L;
                class623.field8672 = var23.method693(32678);
                if (var24 > 65535L) {
                    var24 = 65535L;
                }
                var21.field7384.method3694(var23.method699(120), -1528071456);
                var21.field7384.method3745(-128, (int) var24);
            }
            class151.method1027(var21, -54);
        }
        if (class64.field785 > 0) {
            class64.field785--;
        }
        if (class69.field847 && class64.field785 <= 0) {
            class169.field2298++;
            class69.field847 = false;
            class64.field785 = 20;
            class519 var26 = class357.method2293(class427.field5994, class639.field8789, (byte) 82);
            var26.field7384.method3745(-112, (int) class552.field7773 >> 3);
            var26.field7384.method3745(-119, (int) class2.field19 >> 3);
            class151.method1027(var26, -68);
        }
        if (class711.field9885 != class70.field876) {
            class711.field9885 = class70.field876;
            class194.field2591++;
            class519 var27 = class357.method2293(class427.field5994, class560.field7874, (byte) 102);
            var27.field7384.method3694(class70.field876 ? 1 : 0, -1528071456);
            class151.method1027(var27, -52);
        }
        if (!class673.field9128) {
            class397.field5598++;
            class519 var28 = class357.method2293(class427.field5994, class125.field1523, (byte) 65);
            var28.field7384.method3694(0, -1528071456);
            int var29 = var28.field7384.field9146;
            class675 var30 = class557.field7812.method2752((byte) -94);
            var28.field7384.method3748(!arg0, var30.field9154, var30.field9146, 0);
            var28.field7384.method3728(var28.field7384.field9146 - var29, (byte) 127);
            class151.method1027(var28, -52);
            class673.field9128 = true;
        }
        if (class553.field7776 != null) {
            if (class97.field1168 == 2) {
                class208.method1272(-256);
            } else if (class97.field1168 == 3) {
                class352.method2270((byte) 126);
            }
        }
        if (class254.field3724) {
            class254.field3724 = false;
        } else {
            class720.field9993 /= 2.0F;
        }
        if (class110.field1344) {
            class110.field1344 = false;
        } else {
            class518.field7368 /= 2.0F;
        }
        class494.method2955((byte) -6);
        if (class222.field2897 != 10) {
            return;
        }
        class692.method3888((byte) -118);
        class349.method2253(-1);
        class692.method3889((byte) 45);
        class48.field565++;
        if (class48.field565 > 750) {
            class467.method2786((byte) 91);
            return;
        }
        class755.method4198(0);
        class725.method4077(52);
        class243.method1551((byte) 40);
        for (int var31 = class101.field1201.method1997(true, 71); var31 != -1; var31 = class101.field1201.method1997(false, -85)) {
            class674.method3682(127, var31);
            class219.field2858[class286.method1877(class690.field9427++, 31)] = var31;
        }
        for (class592 var32 = class494.method2960(30548); var32 != null; var32 = class494.method2960(30548)) {
            int var33 = var32.method3345((byte) -91);
            int var34 = var32.method3347(6);
            if (var33 == 1) {
                class718.field9975[var34] = var32.field8337;
                class476.field6748 |= class538.field7548[var34];
                class380.field5446[class286.method1877(class592.field8348++, 31)] = var34;
            } else if (var33 == 2) {
                class492.field6941[var34] = var32.field8340;
                class640.field8793[class286.method1877(class519.field7377++, 31)] = var34;
            } else if (var33 == 3) {
                class493 var35 = class127.method854((byte) -119, var34);
                if (!var32.field8340.equals(var35.field6966)) {
                    var35.field6966 = var32.field8340;
                    class543.method3149(var35, 1);
                }
            } else if (var33 == 4) {
                class493 var55 = class127.method854((byte) -97, var34);
                int var56 = var32.field8337;
                int var57 = var32.field8343;
                int var58 = var32.field8341;
                if (var55.field7082 != var56 || var55.field6997 != var57 || var55.field7047 != var58) {
                    var55.field7047 = var58;
                    var55.field7082 = var56;
                    var55.field6997 = var57;
                    class543.method3149(var55, 1);
                }
            } else if (var33 == 5) {
                class493 var53 = class127.method854((byte) -93, var34);
                if (var32.field8337 != var53.field6976 || var32.field8337 == -1) {
                    var53.field6987 = 0;
                    var53.field6976 = var32.field8337;
                    var53.field7030 = 1;
                    var53.field7024 = 0;
                    class709 var54 = var53.field6976 == -1 ? null : class343.field4785.method3525(var53.field6976, (byte) -46);
                    if (var54 != null) {
                        class469.method2803((byte) 126, var53.field7024, var54);
                    }
                    class543.method3149(var53, 1);
                }
            } else if (var33 == 6) {
                int var47 = var32.field8337;
                int var48 = var47 >> 10 & 0x1F;
                int var49 = var47 >> 5 & 0x1F;
                int var50 = var47 & 0x1F;
                int var51 = (var48 << 19) + (var50 << 3) + (var49 << 11);
                class493 var52 = class127.method854((byte) -81, var34);
                if (var52.field7062 != var51) {
                    var52.field7062 = var51;
                    class543.method3149(var52, 1);
                }
            } else if (var33 == 7) {
                class493 var36 = class127.method854((byte) -123, var34);
                boolean var37 = var32.field8337 == 1;
                if (var37 != var36.field7020) {
                    var36.field7020 = var37;
                    class543.method3149(var36, 1);
                }
            } else if (var33 == 8) {
                class493 var38 = class127.method854((byte) -93, var34);
                if (var32.field8337 != var38.field6981 || var32.field8343 != var38.field7063 || var32.field8341 != var38.field7083) {
                    var38.field7063 = var32.field8343;
                    var38.field7083 = var32.field8341;
                    var38.field6981 = var32.field8337;
                    if (var38.field6952 != -1) {
                        if (var38.field7101 > 0) {
                            var38.field7083 = var38.field7083 * 32 / var38.field7101;
                        } else if (var38.field7098 > 0) {
                            var38.field7083 = var38.field7083 * 32 / var38.field7098;
                        }
                    }
                    class543.method3149(var38, 1);
                }
            } else if (var33 == 9) {
                class493 var46 = class127.method854((byte) -117, var34);
                if (var32.field8337 != var46.field6952 || var32.field8343 != var46.field7057) {
                    var46.field6952 = var32.field8337;
                    var46.field7057 = var32.field8343;
                    class543.method3149(var46, 1);
                }
            } else if (var33 == 10) {
                class493 var45 = class127.method854((byte) -123, var34);
                if (var32.field8337 != var45.field7080 || var32.field8343 != var45.field7001 || var32.field8341 != var45.field7011) {
                    var45.field7011 = var32.field8341;
                    var45.field7080 = var32.field8337;
                    var45.field7001 = var32.field8343;
                    class543.method3149(var45, 1);
                }
            } else if (var33 == 11) {
                class493 var39 = class127.method854((byte) -81, var34);
                var39.field6954 = var39.field7100 = var32.field8337;
                var39.field6975 = var39.field7035 = var32.field8343;
                var39.field6958 = 0;
                var39.field7102 = 0;
                class543.method3149(var39, 1);
            } else if (var33 == 12) {
                class493 var40 = class127.method854((byte) -102, var34);
                int var41 = var32.field8337;
                if (var40 != null && var40.field7016 == 0) {
                    if ((var40.field6969 - var40.field7031) < var41) {
                        var41 = var40.field6969 - var40.field7031;
                    }
                    if (var41 < 0) {
                        var41 = 0;
                    }
                    if (var40.field7073 != var41) {
                        var40.field7073 = var41;
                        class543.method3149(var40, 1);
                    }
                }
            } else if (var33 == 14) {
                class493 var44 = class127.method854((byte) -105, var34);
                var44.field7029 = var32.field8337;
            } else if (var33 == 15) {
                class29.field387 = true;
                class656.field8997 = var32.field8343;
                class210.field2763 = var32.field8337;
            } else if (var33 == 16) {
                class493 var42 = class127.method854((byte) -116, var34);
                var42.field6973 = var32.field8337;
            } else if (var33 == 17) {
                class493 var43 = class127.method854((byte) -87, var34);
                var43.field7037 = var32.field8337;
            }
        }
        class144.field2064++;
        if (class674.field9142 != 0) {
            class269.field3848 += 20;
            if (class269.field3848 >= 400) {
                class674.field9142 = 0;
            }
        }
        if (class125.field1521 != null) {
            class53.field605++;
            if (class53.field605 >= 15) {
                class543.method3149(class125.field1521, 1);
                class125.field1521 = null;
            }
        }
        class363.field5147 = false;
        class230.field3104 = null;
        class10.field235 = null;
        class403.field5706 = arg0;
        class545.method3156(-1, -1, null, 0);
        class746.method4151(null, -1, -54, -1);
        if (!class124.field1491) {
            class86.field1057 = -1;
        }
        class485.method2906(25);
        class2.field13++;
        if (class147.field2115) {
            class133.field1948++;
            class519 var59 = class357.method2293(class427.field5994, class252.field3690, (byte) -46);
            var59.field7384.method3749(class274.field3905 << 28 | class738.field10272 << 14 | class465.field6589, (byte) -113);
            class151.method1027(var59, -127);
            class147.field2115 = false;
        }
        while (true) {
            class357 var60;
            class493 var61;
            class493 var62;
            do {
                var60 = (class357) class176.field2362.method2762((byte) -16);
                if (var60 == null) {
                    while (true) {
                        class357 var63;
                        class493 var64;
                        class493 var65;
                        do {
                            var63 = (class357) class367.field5197.method2762((byte) -16);
                            if (var63 == null) {
                                while (true) {
                                    class357 var66;
                                    class493 var67;
                                    class493 var68;
                                    do {
                                        var66 = (class357) class243.field3247.method2762((byte) -16);
                                        if (var66 == null) {
                                            if (class230.field3104 == null) {
                                                class242.field3233 = 0;
                                            }
                                            if (class643.field8813 != null) {
                                                class530.method3092(31167);
                                            }
                                            if (class399.field5645 > 0 && class589.field8306.method1517(0, 82) && class589.field8306.method1517(0, 81) && class677.field9256 != 0) {
                                                int var69 = class660.field9039.field1266 - class677.field9256;
                                                if (var69 < 0) {
                                                    var69 = 0;
                                                } else if (var69 > 3) {
                                                    var69 = 3;
                                                }
                                                class688.method3846(class660.field9039.field8015[0] + class3.field30, -91, class228.field3063 + class660.field9039.field8009[0], var69);
                                            }
                                            class124.method841(-30726);
                                            for (int var70 = 0; var70 < 5; var70++) {
                                                int var10002 = class281.field4001[var70]++;
                                            }
                                            if (class476.field6748 && class13.field248 < class479.method2864((byte) -105) - 60000L) {
                                                class642.method3550(false);
                                            }
                                            for (class742 var71 = (class742) class454.field6413.method2301(-31182); var71 != null; var71 = (class742) class454.field6413.method2310(29)) {
                                                if ((long) var71.field10312 < class479.method2864((byte) -42) / 1000L - 5L) {
                                                    if (var71.field10313 > 0) {
                                                        class336.method2182(-128, var71.field10314 + class71.field915.method588((byte) 111, class549.field7669), "", 0, "", "", 5);
                                                    }
                                                    if (var71.field10313 == 0) {
                                                        class336.method2182(-73, var71.field10314 + class71.field916.method588((byte) 91, class549.field7669), "", 0, "", "", 5);
                                                    }
                                                    var71.method3646((byte) -110);
                                                }
                                            }
                                            class547.field7639++;
                                            if (class547.field7639 > 500) {
                                                class547.field7639 = 0;
                                                int var72 = (int) (Math.random() * 8.0D);
                                                if ((var72 & 0x4) == 4) {
                                                    class399.field5635 += class433.field6181;
                                                }
                                                if ((var72 & 0x2) == 2) {
                                                    class739.field10276 += class668.field9083;
                                                }
                                                if ((var72 & 0x1) == 1) {
                                                    class596.field8376 += class234.field3147;
                                                }
                                            }
                                            if (class596.field8376 < -50) {
                                                class234.field3147 = 2;
                                            }
                                            if (class596.field8376 > 50) {
                                                class234.field3147 = -2;
                                            }
                                            if (class739.field10276 < -55) {
                                                class668.field9083 = 2;
                                            }
                                            if (class739.field10276 > 55) {
                                                class668.field9083 = -2;
                                            }
                                            if (class399.field5635 < -40) {
                                                class433.field6181 = 1;
                                            }
                                            if (class399.field5635 > 40) {
                                                class433.field6181 = -1;
                                            }
                                            class321.field4438++;
                                            if (class321.field4438 > 500) {
                                                class321.field4438 = 0;
                                                int var73 = (int) (Math.random() * 8.0D);
                                                if ((var73 & 0x1) == 1) {
                                                    class535.field7520 += class531.field7475;
                                                }
                                                if ((var73 & 0x2) == 2) {
                                                    class180.field2412 += class335.field4672;
                                                }
                                            }
                                            if (class535.field7520 < -60) {
                                                class531.field7475 = 2;
                                            }
                                            if (class180.field2412 < -20) {
                                                class335.field4672 = 1;
                                            }
                                            if (class535.field7520 > 60) {
                                                class531.field7475 = -2;
                                            }
                                            class522.field7400++;
                                            if (class180.field2412 > 10) {
                                                class335.field4672 = -1;
                                            }
                                            if (class522.field7400 > 50) {
                                                class549.field7661++;
                                                class519 var74 = class357.method2293(class427.field5994, class112.field1371, (byte) 118);
                                                class151.method1027(var74, -16);
                                            }
                                            if (class33.field429) {
                                                class325.method2115(-1);
                                                class33.field429 = false;
                                            }
                                            try {
                                                class390.method2455((byte) 124);
                                                return;
                                            } catch (IOException var75) {
                                                class467.method2786((byte) 103);
                                                return;
                                            }
                                        }
                                        var67 = var66.field5082;
                                        if (var67.field6944 < 0) {
                                            break;
                                        }
                                        var68 = class127.method854((byte) -107, var67.field7078);
                                    } while (var68 == null || var68.field7009 == null || var67.field6944 >= var68.field7009.length || var68.field7009[var67.field6944] != var67);
                                    class241.method1543(var66);
                                }
                            }
                            var64 = var63.field5082;
                            if (var64.field6944 < 0) {
                                break;
                            }
                            var65 = class127.method854((byte) -128, var64.field7078);
                        } while (var65 == null || var65.field7009 == null || var64.field6944 >= var65.field7009.length || var65.field7009[var64.field6944] != var64);
                        class241.method1543(var63);
                    }
                }
                var61 = var60.field5082;
                if (var61.field6944 < 0) {
                    break;
                }
                var62 = class127.method854((byte) -86, var61.field7078);
            } while (var62 == null || var62.field7009 == null || var61.field6944 >= var62.field7009.length || var62.field7009[var61.field6944] != var61);
            class241.method1543(var60);
        }
    }

    @OriginalMember(owner = "client!uba", name = "d", descriptor = "(I)V")
    public static final void method2630(int arg0) {
        field6125++;
        if (arg0 >= 55 && !class254.field3724) {
            class254.field3724 = true;
            class69.field847 = true;
            class720.field9993 += (-class720.field9993 - 24.0F) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(Z)V")
    public static void method2631(boolean arg0) {
        field6135 = null;
        if (!arg0) {
            field6135 = null;
        }
    }

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(IIIII)V")
    public class430(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6127 = arg2;
        this.field6140 = arg4;
        this.field6134 = arg3;
        this.field6131 = arg1;
        this.field6133 = arg0;
        this.method2623(-101);
        this.method2628(-256);
    }
}
