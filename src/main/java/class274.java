import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class274 implements class147 {

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "[I")
    public static int[] field3807 = new int[13];

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "S")
    public static short field3817 = 320;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public int field3810;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public int field3813;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public int field3814;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public int field3815;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public int field3816;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public int field3818;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Z")
    public boolean field3809;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static void method1766(int arg0) {
        int var1 = 111 % ((arg0 + 54) / 50);
        field3807 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)J")
    public final long method1181(boolean arg0) {
        field3812++;
        long[] var2 = class126.field2227;
        long var3 = -1L;
        long var5 = var2[(int) (((long) this.field3815 ^ var3) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var2[(int) ((var5 ^ (long) (this.field3816 >> 8)) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var2[(int) (((long) this.field3816 ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var2[(int) (((long) (this.field3810 >> 24) ^ var9) & 0xFFL)];
        long var13 = var2[(int) ((var11 ^ (long) (this.field3810 >> 16)) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var13 >>> 8 ^ var2[(int) (((long) (this.field3810 >> 8) ^ var13) & 0xFFL)];
        long var17 = var15 >>> 8 ^ var2[(int) ((var15 ^ (long) this.field3810) & 0xFFL)];
        long var19 = var17 >>> 8 ^ var2[(int) (((long) this.field3814 ^ var17) & 0xFFL)];
        long var21 = var19 >>> 8 ^ var2[(int) ((var19 ^ (long) (this.field3813 >> 24)) & 0xFFL)];
        long var23 = var2[(int) ((var21 ^ (long) (this.field3813 >> 16)) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var23 >>> 8 ^ var2[(int) ((var23 ^ (long) (this.field3813 >> 8)) & 0xFFL)];
        if (arg0) {
            long var27 = var25 >>> 8 ^ var2[(int) (((long) this.field3813 ^ var25) & 0xFFL)];
            long var29 = var27 >>> 8 ^ var2[(int) (((long) this.field3818 ^ var27) & 0xFFL)];
            return var2[(int) (((long) (this.field3809 ? 1 : 0) ^ var29) & 0xFFL)] ^ var29 >>> 8;
        } else {
            return 37L;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([Lcn;II)V")
    public static final void method1767(class543[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class543 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field7393;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field7393 > (var7 & 0x1) + var6) {
                class543 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method1767(arg0, arg1, var4 - 1);
        method1767(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lwf;I)Z")
    public final boolean method1182(class147 arg0, int arg1) {
        field3811++;
        if (!(arg0 instanceof class274)) {
            return false;
        }
        class274 var3 = (class274) arg0;
        if (arg1 > -65) {
            return false;
        } else if (this.field3815 != var3.field3815) {
            return false;
        } else if (this.field3816 != var3.field3816) {
            return false;
        } else if (this.field3810 != var3.field3810) {
            return false;
        } else if (this.field3814 != var3.field3814) {
            return false;
        } else if (this.field3813 != var3.field3813) {
            return false;
        } else if (this.field3818 == var3.field3818) {
            return this.field3809 == var3.field3809;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
    public static final void method1768(byte arg0) {
        field3808++;
        if (class445.field6088 > 1) {
            class445.field6088--;
            class479.field6470 = class62.field859;
        }
        if (class568.field8080) {
            class568.field8080 = false;
            class614.method3477((byte) 19);
            return;
        }
        if (!class611.field8532) {
            class300.method1931((byte) -61);
        }
        for (int var1 = 0; var1 < 100 && class528.method3004((byte) 109); var1++) {
        }
        if (class753.field10398 != 10) {
            return;
        }
        while (class373.method2265(0)) {
            class537 var2 = class476.method2729(class777.field10726, (byte) -46, class551.field7498);
            var2.field7295.method754(0, 97);
            int var3 = var2.field7295.field1442;
            class304.method1944(var2.field7295, -98);
            var2.field7295.method778(var2.field7295.field1442 - var3, -1123171672);
            class173.method1314(false, var2);
        }
        if (class707.field9714 == null) {
            if (class189.field2905 <= class197.method1423(1)) {
                class707.field9714 = class111.field1848.method1625(class178.field2812.field10366, (byte) -61);
            }
        } else if (class707.field9714.field5444 != -1) {
            class537 var4 = class476.method2729(class666.field9268, (byte) -46, class551.field7498);
            var4.field7295.method781(59, class707.field9714.field5444);
            class173.method1314(false, var4);
            class707.field9714 = null;
            class189.field2905 = class197.method1423(1) + 30000L;
        }
        class556 var5 = (class556) class373.field5070.method3589((byte) -128);
        if (var5 != null || class304.field4178 < (class197.method1423(1) - 2000L)) {
            class537 var6 = null;
            int var7 = 0;
            for (class556 var8 = (class556) class496.field6786.method3589((byte) -127); var8 != null && (var6 == null || (var6.field7295.field1442 - var7) < 240); var8 = (class556) class496.field6786.method3591(0)) {
                var8.method1207(89);
                int var9 = var8.method2734(false);
                if (var9 < -1) {
                    var9 = -1;
                } else if (var9 > 65534) {
                    var9 = 65534;
                }
                int var10 = var8.method2731(125);
                if (var10 < -1) {
                    var10 = -1;
                } else if (var10 > 65534) {
                    var10 = 65534;
                }
                if (class658.field9109 != var10 || class99.field1617 != var9) {
                    if (var6 == null) {
                        class375.field5079++;
                        var6 = class476.method2729(class414.field5678, (byte) -46, class551.field7498);
                        var6.field7295.method754(0, 96);
                        var7 = var6.field7295.field1442;
                    }
                    int var11 = var10 - class658.field9109;
                    class658.field9109 = var10;
                    int var12 = var9 - class99.field1617;
                    class99.field1617 = var9;
                    int var13 = (int) ((var8.method2735(-2) - class304.field4178) / 20L);
                    if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                        var12 += 32;
                        var11 += 32;
                        var6.field7295.method781(52, (var13 << 12) + (var11 << 6) + var12);
                    } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                        var12 += 128;
                        var6.field7295.method754(var13 + 128, 100);
                        var11 += 128;
                        var6.field7295.method781(53, (var11 << 8) + var12);
                    } else if (var13 < 32) {
                        var6.field7295.method754(var13 + 192, 47);
                        if (var10 == 1 || var9 == -1) {
                            var6.field7295.method759(Integer.MIN_VALUE, -124);
                        } else {
                            var6.field7295.method759(var10 | var9 << 16, 35);
                        }
                    } else {
                        var6.field7295.method781(56, var13 + 57344);
                        if (var10 == 1 || var9 == -1) {
                            var6.field7295.method759(Integer.MIN_VALUE, 123);
                        } else {
                            var6.field7295.method759(var10 | var9 << 16, 125);
                        }
                    }
                    class304.field4178 = var8.method2735(-2);
                }
            }
            if (var6 != null) {
                var6.field7295.method778(var6.field7295.field1442 - var7, -1123171672);
                class173.method1314(false, var6);
            }
        }
        if (var5 != null) {
            long var14 = (var5.method2735(-2) - class327.field4462) / 50L;
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            class327.field4462 = var5.method2735(-2);
            int var16 = var5.method2734(false);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = var5.method2731(125);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            byte var18 = 0;
            if (var5.method2733(0) == 2) {
                var18 = 1;
            }
            int var19 = (int) var14;
            class746.field10301++;
            class537 var20 = class476.method2729(class389.field5343, (byte) -46, class551.field7498);
            var20.field7295.method745(var18 << 15 | var19, -2);
            var20.field7295.method759(var16 << 16 | var17, -115);
            class173.method1314(false, var20);
        }
        if (class65.field944 > 0) {
            class130.field2267++;
            class537 var21 = class476.method2729(class311.field4247, (byte) -46, class551.field7498);
            var21.field7295.method754(class65.field944 * 3, 72);
            for (int var22 = 0; var22 < class65.field944; var22++) {
                class349 var23 = class755.field10415[var22];
                long var24 = (var23.method2150(11419) - class739.field10198) / 50L;
                class739.field10198 = var23.method2150(11419);
                if (var24 > 65535L) {
                    var24 = 65535L;
                }
                var21.field7295.method754(var23.method2151((byte) -50), 115);
                var21.field7295.method781(63, (int) var24);
            }
            class173.method1314(false, var21);
        }
        if (class566.field8005 > 0) {
            class566.field8005--;
        }
        if (class429.field5846 && class566.field8005 <= 0) {
            class429.field5846 = false;
            class39.field649++;
            class566.field8005 = 20;
            class537 var26 = class476.method2729(class514.field7016, (byte) -46, class551.field7498);
            var26.field7295.method745((int) class43.field682 >> 3, -2);
            var26.field7295.method790((int) class53.field763 >> 3, 65280);
            class173.method1314(false, var26);
        }
        if (class29.field539 != class555.field7835) {
            class437.field5941++;
            class555.field7835 = class29.field539;
            class537 var27 = class476.method2729(class586.field8279, (byte) -46, class551.field7498);
            var27.field7295.method754(class29.field539 ? 1 : 0, 79);
            class173.method1314(false, var27);
        }
        if (!class613.field8533) {
            class661.field9157++;
            class537 var28 = class476.method2729(class498.field6808, (byte) -46, class551.field7498);
            var28.field7295.method754(0, 44);
            int var29 = var28.field7295.field1442;
            class93 var30 = class111.field1911.method2833((byte) -107);
            var28.field7295.method743(0, var30.field1442, var30.field1413, true);
            var28.field7295.method778(var28.field7295.field1442 - var29, -1123171672);
            class173.method1314(false, var28);
            class613.field8533 = true;
        }
        if (class325.field4448 != null) {
            if (class536.field7291 == 2) {
                class737.method4089((byte) 15);
            } else if (class536.field7291 == 3) {
                class504.method2879((byte) -124);
            }
        }
        if (class626.field8724) {
            class626.field8724 = false;
        } else {
            class58.field809 /= 2.0F;
        }
        if (class378.field5158) {
            class378.field5158 = false;
        } else {
            class663.field9212 /= 2.0F;
        }
        class116.method1029(-1);
        if (class753.field10398 != 10) {
            return;
        }
        class412.method2441(31460);
        class467.method2687(1512379690);
        class555.method3194((byte) -69);
        class445.field6126++;
        if (class445.field6126 > 750) {
            class614.method3477((byte) 19);
            return;
        }
        class732.method4068(true);
        class676.method3813(true);
        class568.method3278((byte) 46);
        for (int var31 = class694.field9613.method144(-1, true); var31 != -1; var31 = class694.field9613.method144(-1, false)) {
            class110.method929(var31, false);
            class249.field3516[class204.method1456(class583.field8258++, 31)] = var31;
        }
        for (class281 var32 = class708.method3951((byte) -118); var32 != null; var32 = class708.method3951((byte) -124)) {
            int var33 = var32.method1819(88);
            long var34 = var32.method1812(-962962312);
            if (var33 == 1) {
                class46.field724[(int) var34] = var32.field3910;
                class271.field3792 |= class617.field8593[(int) var34];
                class286.field3937[class204.method1456(class513.field7009++, 31)] = (int) var34;
            } else if (var33 == 2) {
                class74.field1071[(int) var34] = var32.field3913;
                class202.field3063[class204.method1456(31, class634.field8770++)] = (int) var34;
            } else if (var33 == 3) {
                class17 var63 = class379.method2309((int) var34, 192);
                if (!var32.field3913.equals(var63.field316)) {
                    var63.field316 = var32.field3913;
                    class410.method2433(var63, 14049);
                }
            } else if (var33 == 4) {
                class17 var36 = class379.method2309((int) var34, 192);
                int var37 = var32.field3910;
                int var38 = var32.field3901;
                int var39 = var32.field3909;
                if (var36.field272 != var37 || var36.field339 != var38 || var36.field276 != var39) {
                    var36.field272 = var37;
                    var36.field276 = var39;
                    var36.field339 = var38;
                    class410.method2433(var36, 14049);
                }
            } else if (var33 == 5) {
                class17 var40 = class379.method2309((int) var34, 192);
                if (var32.field3910 != var40.field259 || var32.field3910 == -1) {
                    var40.field259 = var32.field3910;
                    var40.field247 = 1;
                    var40.field374 = 0;
                    var40.field375 = 0;
                    class200 var41 = var40.field259 == -1 ? null : class108.field1696.method1279((byte) 92, var40.field259);
                    if (var41 != null) {
                        class189.method1391(var41, 111, var40.field375);
                    }
                    class410.method2433(var40, 14049);
                }
            } else if (var33 == 6) {
                int var57 = var32.field3910;
                int var58 = (var57 & 0x7CF4) >> 10;
                int var59 = (var57 & 0x3FF) >> 5;
                int var60 = var57 & 0x1F;
                int var61 = (var60 << 3) + ((var58 << 19) + (var59 << 11));
                class17 var62 = class379.method2309((int) var34, 192);
                if (var62.field273 != var61) {
                    var62.field273 = var61;
                    class410.method2433(var62, 14049);
                }
            } else if (var33 == 7) {
                class17 var42 = class379.method2309((int) var34, 192);
                boolean var43 = var32.field3910 == 1;
                if (var42.field404 != var43) {
                    var42.field404 = var43;
                    class410.method2433(var42, 14049);
                }
            } else if (var33 == 8) {
                class17 var44 = class379.method2309((int) var34, 192);
                if (var32.field3910 != var44.field295 || var32.field3901 != var44.field414 || var32.field3909 != var44.field412) {
                    var44.field412 = var32.field3909;
                    var44.field295 = var32.field3910;
                    var44.field414 = var32.field3901;
                    if (var44.field355 != -1) {
                        if (var44.field381 > 0) {
                            var44.field412 = var44.field412 * 32 / var44.field381;
                        } else if (var44.field376 > 0) {
                            var44.field412 = var44.field412 * 32 / var44.field376;
                        }
                    }
                    class410.method2433(var44, 14049);
                }
            } else if (var33 == 9) {
                class17 var56 = class379.method2309((int) var34, 192);
                if (var32.field3910 != var56.field355 || var32.field3901 != var56.field279) {
                    var56.field355 = var32.field3910;
                    var56.field279 = var32.field3901;
                    class410.method2433(var56, 14049);
                }
            } else if (var33 == 10) {
                class17 var55 = class379.method2309((int) var34, 192);
                if (var32.field3910 != var55.field326 || var32.field3901 != var55.field313 || var32.field3909 != var55.field399) {
                    var55.field399 = var32.field3909;
                    var55.field326 = var32.field3910;
                    var55.field313 = var32.field3901;
                    class410.method2433(var55, 14049);
                }
            } else if (var33 == 11) {
                class17 var45 = class379.method2309((int) var34, 192);
                var45.field248 = var45.field274 = var32.field3910;
                var45.field394 = 0;
                var45.field416 = var45.field244 = var32.field3901;
                var45.field315 = 0;
                class410.method2433(var45, 14049);
            } else if (var33 == 12) {
                class17 var53 = class379.method2309((int) var34, 192);
                int var54 = var32.field3910;
                if (var53 != null && var53.field352 == 0) {
                    if ((var53.field364 - var53.field330) < var54) {
                        var54 = var53.field364 - var53.field330;
                    }
                    if (var54 < 0) {
                        var54 = 0;
                    }
                    if (var53.field362 != var54) {
                        var53.field362 = var54;
                        class410.method2433(var53, 14049);
                    }
                }
            } else if (var33 == 14) {
                class17 var46 = class379.method2309((int) var34, 192);
                var46.field303 = var32.field3910;
            } else if (var33 == 15) {
                class625.field8714 = true;
                class231.field3356 = var32.field3910;
                class392.field5380 = var32.field3901;
            } else if (var33 == 16) {
                class17 var52 = class379.method2309((int) var34, 192);
                var52.field350 = var32.field3910;
            } else if (var33 == 17) {
                class17 var47 = class379.method2309((int) var34, 192);
                var47.field317 = var32.field3910;
            } else if (var33 == 18) {
                class17 var50 = class379.method2309((int) var34, 192);
                int var51 = (int) (var34 >> 32);
                var50.method104(var51, (short) var32.field3910, (byte) 97, (short) var32.field3901);
            } else if (var33 == 19) {
                class17 var48 = class379.method2309((int) var34, 192);
                int var49 = (int) (var34 >> 32);
                var48.method99((short) var32.field3901, (short) var32.field3910, var49, -22);
            }
        }
        if (class487.field6579 != 0) {
            class427.field5828 += 20;
            if (class427.field5828 >= 400) {
                class487.field6579 = 0;
            }
        }
        class241.field3425++;
        if (class736.field10167 != null) {
            class539.field7319++;
            if (class539.field7319 >= 15) {
                class410.method2433(class736.field10167, 14049);
                class736.field10167 = null;
            }
        }
        class268.field3763 = false;
        class454.field6201 = false;
        class335.field4518 = null;
        class488.field6583 = null;
        class259.method1687(-1, 10403, null, -1);
        class23.method158(-1, null, (byte) -119, -1);
        if (!class675.field9384) {
            class335.field4516 = -1;
        }
        class13.method72(0);
        int var64 = -48 % (-arg0 / 44);
        class62.field859++;
        if (class398.field5486) {
            class453.field6192++;
            class537 var65 = class476.method2729(class249.field3510, (byte) -46, class551.field7498);
            var65.field7295.method792((byte) -61, class567.field8013 << 28 | class356.field4860 << 14 | class387.field5327);
            class173.method1314(false, var65);
            class398.field5486 = false;
        }
        while (true) {
            class255 var66;
            class17 var67;
            class17 var68;
            do {
                var66 = (class255) class334.field4513.method3584(23287);
                if (var66 == null) {
                    while (true) {
                        class255 var69;
                        class17 var70;
                        class17 var71;
                        do {
                            var69 = (class255) class525.field7137.method3584(23287);
                            if (var69 == null) {
                                while (true) {
                                    class255 var72;
                                    class17 var73;
                                    class17 var74;
                                    do {
                                        var72 = (class255) class7.field124.method3584(23287);
                                        if (var72 == null) {
                                            if (class488.field6583 == null) {
                                                class462.field6287 = 0;
                                            }
                                            if (class84.field1157 != null) {
                                                class15.method87(19597);
                                            }
                                            if (class407.field5593 > 0 && class789.field10821.method1531(89, 82) && class789.field10821.method1531(126, 81) && class113.field2112 != 0) {
                                                int var75 = class235.field3379.field7391 - class113.field2112;
                                                if (var75 < 0) {
                                                    var75 = 0;
                                                } else if (var75 > 3) {
                                                    var75 = 3;
                                                }
                                                class85.method685(class235.field3379.field5304[0] + class217.field3198, (byte) 124, var75, class400.field5510 + class235.field3379.field5308[0]);
                                            }
                                            class496.method2848(-16227);
                                            for (int var76 = 0; var76 < 5; var76++) {
                                                int var10002 = class407.field5591[var76]++;
                                            }
                                            if (class271.field3792 && class18.field429 < class197.method1423(1) - 60000L) {
                                                class551.method3138((byte) -86);
                                            }
                                            for (class504 var77 = (class504) class61.field849.method1597((byte) -68); var77 != null; var77 = (class504) class61.field849.method1601(116)) {
                                                if ((long) var77.field6875 < class197.method1423(1) / 1000L - 5L) {
                                                    if (var77.field6878 > 0) {
                                                        class648.method3634(5, var77.field6880 + class641.field8837.method3566((byte) -37, class464.field6309), (byte) -13, "", "", 0, "");
                                                    }
                                                    if (var77.field6878 == 0) {
                                                        class648.method3634(5, var77.field6880 + class641.field8838.method3566((byte) 103, class464.field6309), (byte) -13, "", "", 0, "");
                                                    }
                                                    var77.method731((byte) 39);
                                                }
                                            }
                                            class298.field4109++;
                                            if (class298.field4109 > 500) {
                                                class298.field4109 = 0;
                                                int var78 = (int) (Math.random() * 8.0D);
                                                if ((var78 & 0x2) == 2) {
                                                    class645.field8917 += class160.field2575;
                                                }
                                                if ((var78 & 0x1) == 1) {
                                                    class624.field8706 += class523.field7117;
                                                }
                                                if ((var78 & 0x4) == 4) {
                                                    class485.field6563 += class538.field7310;
                                                }
                                            }
                                            if (class624.field8706 < -50) {
                                                class523.field7117 = 2;
                                            }
                                            if (class624.field8706 > 50) {
                                                class523.field7117 = -2;
                                            }
                                            if (class645.field8917 < -55) {
                                                class160.field2575 = 2;
                                            }
                                            if (class485.field6563 < -40) {
                                                class538.field7310 = 1;
                                            }
                                            if (class645.field8917 > 55) {
                                                class160.field2575 = -2;
                                            }
                                            if (class485.field6563 > 40) {
                                                class538.field7310 = -1;
                                            }
                                            class289.field3982++;
                                            if (class289.field3982 > 500) {
                                                class289.field3982 = 0;
                                                int var79 = (int) (Math.random() * 8.0D);
                                                if ((var79 & 0x1) == 1) {
                                                    class408.field5599 += class388.field5335;
                                                }
                                                if ((var79 & 0x2) == 2) {
                                                    class301.field4140 += class174.field2769;
                                                }
                                            }
                                            if (class408.field5599 < -60) {
                                                class388.field5335 = 2;
                                            }
                                            if (class408.field5599 > 60) {
                                                class388.field5335 = -2;
                                            }
                                            if (class301.field4140 < -20) {
                                                class174.field2769 = 1;
                                            }
                                            class243.field3467++;
                                            if (class301.field4140 > 10) {
                                                class174.field2769 = -1;
                                            }
                                            if (class243.field3467 > 50) {
                                                class664.field9226++;
                                                class537 var80 = class476.method2729(class320.field4370, (byte) -46, class551.field7498);
                                                class173.method1314(false, var80);
                                            }
                                            if (class398.field5501) {
                                                class298.method1914(-55);
                                                class398.field5501 = false;
                                            }
                                            try {
                                                class149.method1191(46);
                                                return;
                                            } catch (IOException var81) {
                                                class614.method3477((byte) 19);
                                                return;
                                            }
                                        }
                                        var73 = var72.field3583;
                                        if (var73.field282 < 0) {
                                            break;
                                        }
                                        var74 = class379.method2309(var73.field336, 192);
                                    } while (var74 == null || var74.field320 == null || var74.field320.length <= var73.field282 || var74.field320[var73.field282] != var73);
                                    class76.method644(var72);
                                }
                            }
                            var70 = var69.field3583;
                            if (var70.field282 < 0) {
                                break;
                            }
                            var71 = class379.method2309(var70.field336, 192);
                        } while (var71 == null || var71.field320 == null || var71.field320.length <= var70.field282 || var71.field320[var70.field282] != var70);
                        class76.method644(var69);
                    }
                }
                var67 = var66.field3583;
                if (var67.field282 < 0) {
                    break;
                }
                var68 = class379.method2309(var67.field336, 192);
            } while (var68 == null || var68.field320 == null || var67.field282 >= var68.field320.length || var68.field320[var67.field282] != var67);
            class76.method644(var66);
        }
    }
}
