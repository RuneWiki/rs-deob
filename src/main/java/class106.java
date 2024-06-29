import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class106 {

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "Lsg;")
    public static class169 field1941 = class165.method1060("Unerwartete Antwort vom Anmelde)2Server)3", 1536);

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field1943 = -1;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IBBZILqd;I)V")
    public static final void method621(int arg0, byte arg1, byte arg2, boolean arg3, int arg4, class148 arg5, int arg6) {
        long var7 = (long) ((arg4 << 16) + arg6);
        class13 var9 = (class13) class54.field985.method1045(var7, (byte) -77);
        field1944++;
        if (var9 != null) {
            return;
        }
        class13 var10 = (class13) class192.field3796.method1045(var7, (byte) -77);
        if (var10 != null) {
            return;
        }
        class13 var11 = (class13) class46.field855.method1045(var7, (byte) -77);
        if (var11 == null) {
            if (!arg3) {
                class13 var12 = (class13) class60.field1115.method1045(var7, (byte) -77);
                if (var12 != null) {
                    return;
                }
            }
            class13 var13 = new class13();
            var13.field306 = arg1;
            var13.field307 = arg0;
            var13.field298 = arg5;
            if (arg2 != -87) {
                field1943 = 27;
            }
            if (arg3) {
                class54.field985.method1044(var7, true, var13);
                class16.field332++;
            } else {
                class197.field3879.method1237(var13, 115);
                class46.field855.method1044(var7, true, var13);
                class154.field2974++;
            }
        } else if (arg3) {
            var11.method973(11076);
            class54.field985.method1044(var7, true, var11);
            class154.field2974--;
            class16.field332++;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILsg;)Z")
    public static final boolean method622(int arg0, class169 arg1) {
        field1945++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class206.field4052; var2++) {
            if (arg1.method1110(class197.field3874[var2], 70)) {
                return true;
            }
        }
        if (arg0 > -52) {
            method625(68);
        }
        return false;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
    public static void method623(byte arg0) {
        if (arg0 == 23) {
            field1941 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIII)V")
    public static final void method624(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1942++;
        class98.field1831 = 0;
        for (int var5 = -1; var5 < class141.field2631 + class164.field3149; var5++) {
            class189 var22;
            if (var5 == -1) {
                var22 = class4.field79;
            } else if (var5 >= class141.field2631) {
                var22 = class54.field992[class182.field3547[var5 - class141.field2631]];
            } else {
                var22 = class65.field1213[class202.field3932[var5]];
            }
            if (var22 != null && var22.method1249(-5701)) {
                if (var22 instanceof class197) {
                    class175 var23 = ((class197) var22).field3872;
                    if (var23.field3430 != null) {
                        var23 = var23.method1173((byte) 70);
                    }
                    if (var23 == null) {
                        continue;
                    }
                }
                if (class141.field2631 <= var5) {
                    class175 var26 = ((class197) var22).field3872;
                    if (var26.field3430 != null) {
                        var26 = var26.method1173((byte) 86);
                    }
                    if (var26.field3424 >= 0 && class151.field2909.length > var26.field3424) {
                        class96.method579(var22, (byte) 115, 15 - var22.field84);
                        if (class181.field3528 > -1) {
                            class151.field2909[var26.field3424].method123(arg2 + class181.field3528 - 12, arg3 - (-class64.field1180 + 30));
                        }
                    }
                    if (class136.field2543 == 1 && class182.field3547[var5 - class141.field2631] == class169.field3261 && class162.field3107 % 20 < 10) {
                        class96.method579(var22, (byte) 127, 15 - var22.field84);
                        if (class181.field3528 > -1) {
                            class190.field3754[0].method123(class181.field3528 + arg2 - 12, class64.field1180 + -28 + arg3);
                        }
                    }
                } else {
                    class196 var24 = (class196) var22;
                    int var25 = 30;
                    if (var24.field3860 != -1 || var24.field3842 != -1) {
                        class96.method579(var22, (byte) 124, 15 - var22.field84);
                        if (class181.field3528 > -1) {
                            if (var24.field3860 != -1) {
                                class6.field132[var24.field3860].method123(arg2 + class181.field3528 - 12, -var25 + class64.field1180 + arg3);
                                var25 += 25;
                            }
                            if (var24.field3842 != -1) {
                                class151.field2909[var24.field3842].method123(class181.field3528 + arg2 - 12, -var25 + class64.field1180 + arg3);
                                var25 += 25;
                            }
                        }
                    }
                    if (var5 >= 0 && class136.field2543 == 10 && class202.field3932[var5] == class159.field3033) {
                        class96.method579(var22, (byte) 120, 15 - var22.field84);
                        if (class181.field3528 > -1) {
                            class190.field3754[1].method123(arg2 + class181.field3528 - 12, class64.field1180 + arg3 + -var25);
                        }
                    }
                }
                if (var22.field3726 != null && (var5 >= class141.field2631 || class42.field791 == 0 || class42.field791 == 3 || class42.field791 == 1 && client.method204(-1569, ((class196) var22).field3856))) {
                    class96.method579(var22, (byte) 118, -var22.field84);
                    if (class181.field3528 > -1 && class98.field1831 < class67.field1257) {
                        class67.field1256[class98.field1831] = class98.field1839.method736(var22.field3726) / 2;
                        class67.field1259[class98.field1831] = class98.field1839.field2166;
                        class67.field1261[class98.field1831] = class181.field3528;
                        class67.field1252[class98.field1831] = class64.field1180;
                        class67.field1262[class98.field1831] = var22.field3704;
                        class67.field1260[class98.field1831] = var22.field3712;
                        class67.field1264[class98.field1831] = var22.field3723;
                        class67.field1254[class98.field1831] = var22.field3726;
                        class98.field1831++;
                    }
                }
                if (var22.field3724 > class162.field3107) {
                    class96.method579(var22, (byte) 120, 15 - var22.field84);
                    if (class181.field3528 > -1) {
                        int var27 = var22.field3736 * 30 / var22.field3678;
                        if (var27 > 30) {
                            var27 = 30;
                        }
                        class130.method850(class181.field3528 + arg2 - 15, class64.field1180 + arg3 - 3, var27, 5, 65280);
                        class130.method850(arg2 + class181.field3528 + var27 - 15, class64.field1180 + arg3 - 3, 30 - var27, 5, 16711680);
                    }
                }
                for (int var28 = 0; var28 < 4; var28++) {
                    if (var22.field3672[var28] > class162.field3107) {
                        class96.method579(var22, (byte) 126, -var22.field84 / 2);
                        if (class181.field3528 > -1) {
                            if (var28 == 1) {
                                class64.field1180 -= 20;
                            }
                            if (var28 == 2) {
                                class64.field1180 -= 10;
                                class181.field3528 -= 15;
                            }
                            if (var28 == 3) {
                                class181.field3528 += 15;
                                class64.field1180 -= 10;
                            }
                            class94.field1760[var22.field3733[var28]].method123(arg2 + class181.field3528 - 12, class64.field1180 + -12 + arg3);
                            class114.field2087.method717(class2.method18((byte) -62, var22.field3677[var28]), arg2 + class181.field3528 - 1, class64.field1180 + arg3 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var6 = 0; var6 < class98.field1831; var6++) {
            int var8 = class67.field1261[var6];
            int var9 = class67.field1259[var6];
            int var10 = class67.field1252[var6];
            int var11 = class67.field1256[var6];
            boolean var12 = true;
            while (var12) {
                var12 = false;
                for (int var21 = 0; var21 < var6; var21++) {
                    if (class67.field1252[var21] - class67.field1259[var21] < var10 + 2 && class67.field1252[var21] + 2 > -var9 + var10 && class67.field1261[var21] + class67.field1256[var21] > -var11 + var8 && var8 + var11 > class67.field1261[var21] + -class67.field1256[var21] && class67.field1252[var21] - class67.field1259[var21] < var10) {
                        var10 = class67.field1252[var21] - class67.field1259[var21];
                        var12 = true;
                    }
                }
            }
            class181.field3528 = class67.field1261[var6];
            class64.field1180 = class67.field1252[var6] = var10;
            class169 var13 = class67.field1254[var6];
            if (class55.field1010 == 0) {
                int var14 = 16776960;
                if (class67.field1262[var6] < 6) {
                    var14 = class81.field1496[class67.field1262[var6]];
                }
                if (class67.field1262[var6] == 6) {
                    var14 = class145.field2701 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class67.field1262[var6] == 7) {
                    var14 = class145.field2701 % 20 < 10 ? 255 : 65535;
                }
                if (class67.field1262[var6] == 8) {
                    var14 = class145.field2701 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class67.field1262[var6] == 9) {
                    int var15 = 150 - class67.field1264[var6];
                    if (var15 < 50) {
                        var14 = var15 * 1280 + 16711680;
                    } else if (var15 < 100) {
                        var14 = 33160960 - var15 * 327680;
                    } else if (var15 < 150) {
                        var14 = var15 * 5 + 65280 - 500;
                    }
                }
                if (class67.field1262[var6] == 10) {
                    int var16 = 150 - class67.field1264[var6];
                    if (var16 < 50) {
                        var14 = var16 * 5 + 16711680;
                    } else if (var16 < 100) {
                        var14 = 16384000 + 16711935 - var16 * 327680;
                    } else if (var16 < 150) {
                        var14 = (var16 - 100) * 327680 + 755 - var16 * 5;
                    }
                }
                if (class67.field1262[var6] == 11) {
                    int var17 = 150 - class67.field1264[var6];
                    if (var17 < 50) {
                        var14 = 16777215 - var17 * 327685;
                    } else if (var17 < 100) {
                        var14 = (var17 - 50) * 327685 + 65280;
                    } else if (var17 < 150) {
                        var14 = 16777215 - (var17 - 100) * 327680;
                    }
                }
                if (class67.field1260[var6] == 0) {
                    class98.field1839.method717(var13, class181.field3528 + arg2, class64.field1180 + arg3, var14, 0);
                }
                if (class67.field1260[var6] == 1) {
                    class98.field1839.method722(var13, class181.field3528 + arg2, arg3 - -class64.field1180, var14, 0, class145.field2701);
                }
                if (class67.field1260[var6] == 2) {
                    class98.field1839.method726(var13, class181.field3528 + arg2, arg3 - -class64.field1180, var14, 0, class145.field2701);
                }
                if (class67.field1260[var6] == 3) {
                    class98.field1839.method740(var13, arg2 + class181.field3528, arg3 - -class64.field1180, var14, 0, class145.field2701, 150 - class67.field1264[var6]);
                }
                if (class67.field1260[var6] == 4) {
                    int var18 = (150 - class67.field1264[var6]) * (class98.field1839.method736(var13) + 100) / 150;
                    class130.method852(class181.field3528 + arg2 - 50, arg3, arg2 + class181.field3528 + 50, arg1 + arg3);
                    class98.field1839.method718(var13, arg2 + class181.field3528 + 50 - var18, class64.field1180 + arg3, var14, 0);
                    class130.method851(arg2, arg3, arg2 + arg4, arg1 + arg3);
                }
                if (class67.field1260[var6] == 5) {
                    int var19 = 0;
                    int var20 = 150 - class67.field1264[var6];
                    class130.method852(arg2, class64.field1180 + arg3 - class98.field1839.field2166 - 1, arg2 + arg4, arg3 + class64.field1180 + 5);
                    if (var20 < 25) {
                        var19 = var20 - 25;
                    } else if (var20 > 125) {
                        var19 = var20 - 125;
                    }
                    class98.field1839.method717(var13, arg2 + class181.field3528, arg3 + var19 + class64.field1180, var14, 0);
                    class130.method851(arg2, arg3, arg2 + arg4, arg1 + arg3);
                }
            } else {
                class98.field1839.method717(var13, class181.field3528 + arg2, class64.field1180 + arg3, 16776960, 0);
            }
        }
        int var7 = 126 % ((arg0 - 55) / 57);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)I")
    public static final int method625(int arg0) {
        field1946++;
        return arg0 == 2 ? class9.field245++ : -95;
    }
}
