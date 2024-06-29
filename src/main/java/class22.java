import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class22 {

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "Lnj;")
    public static class487 field191 = new class487("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "Lwo;")
    public static class408 field195 = new class408();

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "Lqp;")
    public static class586 field198;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "[[[B")
    public static byte[][][] field197;

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "[[[J")
    public static long[][][] field199;

    static {
        new class487("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field198 = new class586(64, 4);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V", line = 6)
    public static final void method98(int arg0) {
        if (class223.field3280 > 1) {
            class223.field3280--;
            class151.field1944 = class73.field858;
        }
        field192++;
        if (class590.field8736) {
            class590.field8736 = false;
            class561.method3283((byte) 126);
            return;
        }
        if (!class139.field1826) {
            class209.method1355((byte) 90);
        }
        for (int var1 = 0; var1 < 100 && class358.method2201(0); var1++) {
        }
        if (class192.field2903 != 9) {
            return;
        }
        class428.method2613(class221.field3268, class2.field11.method2232(-120), -10);
        if (class68.field777 == null) {
            if (class502.field7510 <= class450.method2719((byte) -62)) {
                class68.field777 = class470.field7161.method3443(-7571, class536.field7933.field6630);
            }
        } else if (class68.field777.field5662 != -1) {
            class165.method1046(-3466, class535.field7913);
            class221.field3268.method2608(class68.field777.field5662, (byte) 121);
            class68.field777 = null;
            class502.field7510 = class450.method2719((byte) 126) + 30000L;
        }
        class497 var2 = (class497) class281.field4170.method2496((byte) 10);
        if (var2 != null || class14.field131 < class450.method2719((byte) 120) - 2000L) {
            boolean var3 = false;
            int var4 = class221.field3268.field6221;
            for (class497 var5 = (class497) class498.field7482.method2496((byte) -103); var5 != null && class221.field3268.field6221 - var4 < 240; var5 = (class497) class498.field7482.method2494(49)) {
                var5.method2997(1);
                int var6 = var5.method31(118);
                if (var6 < -1) {
                    var6 = -1;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                int var7 = var5.method34(-3797);
                if (var7 < -1) {
                    var7 = -1;
                } else if (var7 > 65534) {
                    var7 = 65534;
                }
                if (class342.field5000 != var7 || class595.field8779 != var6) {
                    if (!var3) {
                        class51.field624++;
                        class165.method1046(-3466, class567.field8412);
                        class221.field3268.method2563(-13021, 0);
                        var4 = class221.field3268.field6221;
                        var3 = true;
                    }
                    int var8 = var7 - class342.field5000;
                    class342.field5000 = var7;
                    int var9 = var6 - class595.field8779;
                    class595.field8779 = var6;
                    int var10 = (int) ((var5.method33(3) - class14.field131) / 20L);
                    if (var10 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
                        var9 += 32;
                        var8 += 32;
                        class221.field3268.method2608((var8 << 6) + (var10 << 12) + var9, (byte) 123);
                    } else if (var10 < 32 && var8 >= -128 && var8 <= 127 && var9 >= -128 && var9 <= 127) {
                        class221.field3268.method2563(-13021, var10 + 128);
                        var8 += 128;
                        var9 += 128;
                        class221.field3268.method2608((var8 << 8) + var9, (byte) 72);
                    } else if (var10 < 32) {
                        class221.field3268.method2563(-13021, var10 + 192);
                        if (var7 == 1 || var6 == -1) {
                            class221.field3268.method2576(true, Integer.MIN_VALUE);
                        } else {
                            class221.field3268.method2576(true, var6 << 16 | var7);
                        }
                    } else {
                        class221.field3268.method2608(var10 + 57344, (byte) 75);
                        if (var7 == 1 || var6 == -1) {
                            class221.field3268.method2576(true, Integer.MIN_VALUE);
                        } else {
                            class221.field3268.method2576(true, var6 << 16 | var7);
                        }
                    }
                    class14.field131 = var5.method33(3);
                }
            }
            if (var3) {
                class221.field3268.method2572(-19419, class221.field3268.field6221 - var4);
            }
        }
        if (var2 != null) {
            long var11 = (var2.method33(3) - class282.field4180) / 50L;
            class282.field4180 = var2.method33(3);
            if (var11 > 32767L) {
                var11 = 32767L;
            }
            int var13 = var2.method31(79);
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 65535) {
                var13 = 65535;
            }
            int var14 = var2.method34(-3797);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            byte var15 = 0;
            if (var2.method32((byte) -116) == 2) {
                var15 = 1;
            }
            class301.field4404++;
            int var16 = (int) var11;
            class165.method1046(-3466, class220.field3248);
            class221.field3268.method2577(var15 << 15 | var16, -45066936);
            class221.field3268.method2595(var13 << 16 | var14, 86);
        }
        if (class609.field8964 > 0) {
            class587.field8715++;
            class165.method1046(-3466, class21.field190);
            class221.field3268.method2563(-13021, class609.field8964 * 3);
            for (int var17 = 0; var17 < class609.field8964; var17++) {
                class454 var18 = class257.field3758[var17];
                long var19 = (var18.method2365((byte) -124) - class152.field1950) / 50L;
                class152.field1950 = var18.method2365((byte) -126);
                if (var19 > 65535L) {
                    var19 = 65535L;
                }
                class221.field3268.method2563(-13021, var18.method2367(-28783));
                class221.field3268.method2608((int) var19, (byte) 100);
            }
        }
        if (class558.field8288 > 0) {
            class558.field8288--;
        }
        int var21 = -75 % ((arg0 - 64) / 50);
        if (class120.field1561 && class558.field8288 <= 0) {
            class558.field8288 = 20;
            class119.field1550++;
            class120.field1561 = false;
            class165.method1046(-3466, class137.field1817);
            class221.field3268.method2577((int) class578.field8523 >> 3, -45066936);
            class221.field3268.method2619((int) class591.field8752 >> 3, 1420669333);
        }
        if (class85.field989 && !class492.field7437) {
            class137.field1816++;
            class492.field7437 = true;
            class165.method1046(-3466, class394.field5724);
            class221.field3268.method2563(-13021, 1);
        }
        if (!class85.field989 && class492.field7437) {
            class137.field1816++;
            class492.field7437 = false;
            class165.method1046(-3466, class394.field5724);
            class221.field3268.method2563(-13021, 0);
        }
        if (!class393.field5714) {
            class165.method1046(-3466, class441.field6451);
            class522.field7744++;
            class221.field3268.method2563(-13021, 0);
            int var22 = class221.field3268.field6221;
            class428 var23 = new class428(class477.method2897((byte) -79));
            class94.field1158.method135(0, var23);
            class221.field3268.method2612(23958, var23.field6221, var23.field6162, 0);
            class221.field3268.method2572(-19419, class221.field3268.field6221 - var22);
            class393.field5714 = true;
        }
        if (class526.field7777 != null) {
            if (class287.field4232 == 2) {
                class290.method1795(true);
            } else if (class287.field4232 == 3) {
                class621.method3597((byte) -111);
            }
        }
        if (class247.field3610) {
            class247.field3610 = false;
        } else {
            class203.field3025 /= 2.0F;
        }
        if (class481.field7303) {
            class481.field7303 = false;
        } else {
            class74.field860 /= 2.0F;
        }
        class136.method839(16933);
        if (class192.field2903 != 9) {
            return;
        }
        class427.method2540(18818);
        class603.method3507(-2);
        class85.method493(123);
        class582.method3397(-3);
        class285.field4194++;
        if (class285.field4194 > 750) {
            class561.method3283((byte) 125);
            return;
        }
        class524.method3093(40);
        class426.method2517(0);
        class209.method1351((byte) -100);
        for (int var24 = class406.field5823.method657(75, true); var24 != -1; var24 = class406.field5823.method657(58, false)) {
            class336.method2099(-7, var24);
            class248.field3626[class637.method3693(class99.field1240++, 31)] = var24;
        }
        for (class621 var25 = class430.method2638((byte) 73); var25 != null; var25 = class430.method2638((byte) 101)) {
            int var26 = var25.method3591(-20163);
            int var27 = var25.method3593(80);
            if (var26 == 1) {
                class526.field7774[var27] = var25.field9068;
                class528.field7834 |= class595.field8769[var27];
                class225.field3319[class637.method3693(31, class140.field1839++)] = var27;
            } else if (var26 == 2) {
                class242.field3547[var27] = var25.field9072;
                class418.field6008[class637.method3693(class551.field8205++, 31)] = var27;
            } else if (var26 == 3) {
                class311 var49 = class436.method2659(true, var27);
                if (!var25.field9072.equals(var49.field4539)) {
                    var49.field4539 = var25.field9072;
                    class619.method3586(10, var49);
                }
            } else if (var26 == 4) {
                class311 var45 = class436.method2659(true, var27);
                int var46 = var25.field9068;
                int var47 = var25.field9070;
                int var48 = var25.field9064;
                if (var45.field4535 != var46 || var45.field4650 != var47 || var45.field4624 != var48) {
                    var45.field4535 = var46;
                    var45.field4624 = var48;
                    var45.field4650 = var47;
                    class619.method3586(77, var45);
                }
            } else if (var26 == 5) {
                class311 var44 = class436.method2659(true, var27);
                if (var25.field9068 != var44.field4628 || var25.field9068 == -1) {
                    var44.field4516 = 1;
                    var44.field4628 = var25.field9068;
                    var44.field4542 = 0;
                    var44.field4613 = 0;
                    class619.method3586(91, var44);
                }
            } else if (var26 == 6) {
                int var28 = var25.field9068;
                int var29 = var28 >> 10 & 0x1F;
                int var30 = var28 >> 5 & 0x1F;
                int var31 = var28 & 0x1F;
                int var32 = (var29 << 19) + (var30 << 11) + (var31 << 3);
                class311 var33 = class436.method2659(true, var27);
                if (var33.field4562 != var32) {
                    var33.field4562 = var32;
                    class619.method3586(122, var33);
                }
            } else if (var26 == 7) {
                class311 var42 = class436.method2659(true, var27);
                boolean var43 = var25.field9068 == 1;
                if (var43 != var42.field4577) {
                    var42.field4577 = var43;
                    class619.method3586(73, var42);
                }
            } else if (var26 == 8) {
                class311 var41 = class436.method2659(true, var27);
                if (var25.field9068 != var41.field4528 || var25.field9070 != var41.field4594 || var25.field9064 != var41.field4643) {
                    var41.field4594 = var25.field9070;
                    var41.field4528 = var25.field9068;
                    var41.field4643 = var25.field9064;
                    if (var41.field4661 != -1) {
                        if (var41.field4612 > 0) {
                            var41.field4643 = var41.field4643 * 32 / var41.field4612;
                        } else if (var41.field4546 > 0) {
                            var41.field4643 = var41.field4643 * 32 / var41.field4546;
                        }
                    }
                    class619.method3586(56, var41);
                }
            } else if (var26 == 9) {
                class311 var34 = class436.method2659(true, var27);
                if (var25.field9068 != var34.field4661 || var25.field9070 != var34.field4527) {
                    var34.field4661 = var25.field9068;
                    var34.field4527 = var25.field9070;
                    class619.method3586(44, var34);
                }
            } else if (var26 == 10) {
                class311 var35 = class436.method2659(true, var27);
                if (var25.field9068 != var35.field4564 || var25.field9070 != var35.field4537 || var25.field9064 != var35.field4605) {
                    var35.field4605 = var25.field9064;
                    var35.field4564 = var25.field9068;
                    var35.field4537 = var25.field9070;
                    class619.method3586(105, var35);
                }
            } else if (var26 == 11) {
                class311 var36 = class436.method2659(true, var27);
                var36.field4538 = 0;
                var36.field4576 = 0;
                var36.field4596 = var36.field4529 = var25.field9068;
                var36.field4568 = var36.field4671 = var25.field9070;
                class619.method3586(58, var36);
            } else if (var26 == 12) {
                class311 var37 = class436.method2659(true, var27);
                int var38 = var25.field9068;
                if (var37 != null && var37.field4655 == 0) {
                    if (var37.field4581 - var37.field4620 < var38) {
                        var38 = var37.field4581 - var37.field4620;
                    }
                    if (var38 < 0) {
                        var38 = 0;
                    }
                    if (var37.field4668 != var38) {
                        var37.field4668 = var38;
                        class619.method3586(105, var37);
                    }
                }
            } else if (var26 == 14) {
                class311 var40 = class436.method2659(true, var27);
                var40.field4589 = var25.field9068;
            } else if (var26 == 15) {
                class121.field1566 = true;
                class415.field5969 = var25.field9068;
                class158.field2058 = var25.field9070;
            } else if (var26 == 16) {
                class311 var39 = class436.method2659(true, var27);
                var39.field4522 = var25.field9068;
            }
        }
        if (class356.field5165 != 0) {
            class331.field4911 += 20;
            if (class331.field4911 >= 400) {
                class356.field5165 = 0;
            }
        }
        class394.field5735++;
        if (class405.field5813 != null) {
            class185.field2815++;
            if (class185.field2815 >= 15) {
                class619.method3586(104, class405.field5813);
                class405.field5813 = null;
            }
        }
        class186.field2824 = false;
        class384.field5622 = null;
        class591.field8751 = false;
        class343.field5011 = null;
        class417.method2480(null, false, -1, -1);
        class588.method3429(32768, -1, null, -1);
        if (!class369.field5337) {
            class362.field5233 = -1;
        }
        class94.method539(0);
        class73.field858++;
        if (class590.field8734) {
            class158.field2020++;
            class165.method1046(-3466, class469.field7120);
            class221.field3268.method2576(true, class194.field2924 | class258.field3777 << 28 | class104.field1311 << 14);
            class590.field8734 = false;
        }
        while (true) {
            class355 var50;
            class311 var51;
            class311 var52;
            do {
                var50 = (class355) class614.field9005.method2498((byte) 28);
                if (var50 == null) {
                    while (true) {
                        class355 var53;
                        class311 var54;
                        class311 var55;
                        do {
                            var53 = (class355) class534.field7907.method2498((byte) 98);
                            if (var53 == null) {
                                while (true) {
                                    class355 var56;
                                    class311 var57;
                                    class311 var58;
                                    do {
                                        var56 = (class355) class50.field595.method2498((byte) 78);
                                        if (var56 == null) {
                                            if (class384.field5622 == null) {
                                                class89.field1140 = 0;
                                            }
                                            if (class106.field1333 != null) {
                                                class556.method3244(-2);
                                            }
                                            if (class370.field5351 > 0 && class542.field8105.method1259(true, 82) && class542.field8105.method1259(true, 81) && class509.field7565 != 0) {
                                                int var59 = class239.field3493.field3457 - class509.field7565;
                                                if (var59 < 0) {
                                                    var59 = 0;
                                                } else if (var59 > 3) {
                                                    var59 = 3;
                                                }
                                                class591.method3444(16755, class239.field3493.field1090[0] + class584.field8677, var59, class239.field3493.field1089[0] + class424.field6061);
                                            }
                                            class129.method803(true);
                                            for (int var60 = 0; var60 < 5; var60++) {
                                                int var10002 = class408.field5834[var60]++;
                                            }
                                            if (class528.field7834 && (class450.method2719((byte) 119) - 60000L) > class516.field7684) {
                                                class622.method3622(116);
                                            }
                                            for (class201 var61 = (class201) class76.field879.method772(0); var61 != null; var61 = (class201) class76.field879.method775(2)) {
                                                if (class450.method2719((byte) -75) / 1000L - 5L > (long) var61.field3012) {
                                                    if (var61.field3008 > 0) {
                                                        class549.method3214(74, var61.field3011 + class83.field958.method2953(3181, class77.field889), "", 0, "", 5);
                                                    }
                                                    if (var61.field3008 == 0) {
                                                        class549.method3214(-101, var61.field3011 + class259.field3794.method2953(3181, class77.field889), "", 0, "", 5);
                                                    }
                                                    var61.method736((byte) -127);
                                                }
                                            }
                                            class108.field1375++;
                                            if (class108.field1375 > 500) {
                                                class108.field1375 = 0;
                                                int var62 = (int) (Math.random() * 8.0D);
                                                if ((var62 & 0x4) == 4) {
                                                    class6.field57 += class122.field1574;
                                                }
                                                if ((var62 & 0x1) == 1) {
                                                    class311.field4629 += class509.field7568;
                                                }
                                                if ((var62 & 0x2) == 2) {
                                                    class587.field8720 += class147.field1906;
                                                }
                                            }
                                            if (class311.field4629 < -50) {
                                                class509.field7568 = 2;
                                            }
                                            if (class587.field8720 < -55) {
                                                class147.field1906 = 2;
                                            }
                                            if (class311.field4629 > 50) {
                                                class509.field7568 = -2;
                                            }
                                            if (class6.field57 < -40) {
                                                class122.field1574 = 1;
                                            }
                                            if (class587.field8720 > 55) {
                                                class147.field1906 = -2;
                                            }
                                            if (class6.field57 > 40) {
                                                class122.field1574 = -1;
                                            }
                                            class637.field9276++;
                                            if (class637.field9276 > 500) {
                                                class637.field9276 = 0;
                                                int var63 = (int) (Math.random() * 8.0D);
                                                if ((var63 & 0x2) == 2) {
                                                    class99.field1254 += class433.field6338;
                                                }
                                                if ((var63 & 0x1) == 1) {
                                                    class225.field3322 += class631.field9225;
                                                }
                                            }
                                            if (class225.field3322 < -60) {
                                                class631.field9225 = 2;
                                            }
                                            if (class225.field3322 > 60) {
                                                class631.field9225 = -2;
                                            }
                                            if (class99.field1254 < -20) {
                                                class433.field6338 = 1;
                                            }
                                            class352.field5117++;
                                            if (class99.field1254 > 10) {
                                                class433.field6338 = -1;
                                            }
                                            if (class352.field5117 > 50) {
                                                class165.method1046(-3466, class590.field8733);
                                                class637.field9277++;
                                            }
                                            if (class480.field7290) {
                                                class639.method3701((byte) -74);
                                                class480.field7290 = false;
                                            }
                                            try {
                                                if (class513.field7606 != null && class221.field3268.field6221 > 0) {
                                                    class411.field5858 += class221.field3268.field6221;
                                                    class513.field7606.method1243(class221.field3268.field6162, class221.field3268.field6221, 0, -27985);
                                                    class352.field5117 = 0;
                                                    class221.field3268.field6221 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var64) {
                                                class561.method3283((byte) 127);
                                                return;
                                            }
                                        }
                                        var57 = var56.field5150;
                                        if (var57.field4558 < 0) {
                                            break;
                                        }
                                        var58 = class436.method2659(true, var57.field4551);
                                    } while (var58 == null || var58.field4652 == null || var58.field4652.length <= var57.field4558 || var58.field4652[var57.field4558] != var57);
                                    class330.method2072(var56);
                                }
                            }
                            var54 = var53.field5150;
                            if (var54.field4558 < 0) {
                                break;
                            }
                            var55 = class436.method2659(true, var54.field4551);
                        } while (var55 == null || var55.field4652 == null || var54.field4558 >= var55.field4652.length || var55.field4652[var54.field4558] != var54);
                        class330.method2072(var53);
                    }
                }
                var51 = var50.field5150;
                if (var51.field4558 < 0) {
                    break;
                }
                var52 = class436.method2659(true, var51.field4551);
            } while (var52 == null || var52.field4652 == null || var51.field4558 >= var52.field4652.length || var52.field4652[var51.field4558] != var51);
            class330.method2072(var50);
        }
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(II)V", line = 848)
    public class22(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIIIIIIII)V", line = 859)
    public static final void method99(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field193++;
        if (!class159.method929(arg1, arg0)) {
            return;
        }
        if (class14.field123[arg0] == null) {
            client.method3611(class251.field3650[arg0], -1, arg3, arg6, arg8, arg7, arg4, arg5, arg9, arg2);
        } else {
            client.method3611(class14.field123[arg0], -1, arg3, arg6, arg8, arg7, arg4, arg5, arg9, arg2);
        }
    }

    @OriginalMember(owner = "client!fo", name = "toString", descriptor = "()Ljava/lang/String;", line = 874)
    public final String toString() {
        field194++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z)V", line = 884)
    public static void method100(boolean arg0) {
        if (arg0) {
            return;
        }
        field199 = null;
        field191 = null;
        field197 = null;
        field195 = null;
        field198 = null;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lcd;B)V", line = 918)
    public static final void method101(class86 arg0, byte arg1) {
        field196++;
        if (arg0 instanceof class383) {
            class383 var2 = (class383) arg0;
            if (var2.field5601 != null) {
                class498.method3003((byte) -106, class239.field3493.field3457 != var2.field3457, var2);
            }
        } else if (arg0 instanceof class179) {
            class179 var3 = (class179) arg0;
            class323.method2022(var3, class239.field3493.field3457 != var3.field3457, 104);
        }
        if (arg1 < 123) {
            field195 = null;
        }
    }
}
