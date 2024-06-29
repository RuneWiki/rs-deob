import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class297 extends class154 {

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
    public int field4731;

    @OriginalMember(owner = "client!hh", name = "C", descriptor = "I")
    public int field4739;

    @OriginalMember(owner = "client!hh", name = "H", descriptor = "[I")
    public static int[] field4743 = new int[32];

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "Llm;")
    public static class150 field4729 = new class150(500);

    @OriginalMember(owner = "client!hh", name = "J", descriptor = "[Lud;")
    public static class53[] field4745 = new class53[6];

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!hh", name = "D", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!hh", name = "E", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!hh", name = "G", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)I")
    public final int method1987(boolean arg0) {
        if (!arg0) {
            method1991((class305) null, (class305) null, (byte) 4);
        }
        field4730++;
        return this.field4739 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1988(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class132.field1836 = 0;
        if (arg0 != -5) {
            method2001(55);
        }
        for (int var7 = -1; var7 < class306.field4921 + class171.field2437; var7++) {
            class211 var39 = null;
            class256 var40;
            if (var7 < 0) {
                var40 = class250.field3905;
            } else if (var7 < class171.field2437) {
                var40 = class48.field689[class160.field2235[var7]];
            } else {
                var40 = class88.field1274[class131.field1834[var7 - class171.field2437]];
                var39 = ((class310) var40).field4993;
                if (var39.field3173 != null) {
                    var39 = var39.method1316((byte) -97);
                    if (var39 == null) {
                        continue;
                    }
                }
            }
            if (var40.method1679((byte) -127)) {
                class193.method1223(arg4 >> 1, arg6 >> 1, arg5, 0, var40, var40.method1673((byte) 16), arg1);
                if (class105.field1512 >= 0) {
                    if (!var40.field4136) {
                        int var41 = class161.field2250 + arg3;
                        if (class171.field2437 > var7) {
                            class314 var42 = (class314) var40;
                            if (var42.field5036 != -1 || var42.field5047 != -1) {
                                if (var42.field5036 != -1) {
                                    var41 -= 25;
                                    class56.field783[var42.field5036].method694(arg2 + class105.field1512 - 12, var41);
                                    var41 -= 2;
                                }
                                if (var42.field5047 != -1) {
                                    var41 -= 25;
                                    class177.field2504[var42.field5047].method694(class105.field1512 + arg2 - 12, var41);
                                    var41 -= 2;
                                }
                            }
                        } else if (var39.field3189 >= 0 && var39.field3189 < class177.field2504.length) {
                            var41 -= 25;
                            class108 var43 = class177.field2504[var39.field3189];
                            var43.method694(class105.field1512 + arg2 - (var43.field1540 >> 1), var41);
                            var41 -= 2;
                        }
                        if (class35.field533 < var40.field4076) {
                            class108 var44 = class189.field2857[1];
                            class108 var45 = class189.field2857[0];
                            if (var40 instanceof class310) {
                                class310 var46 = (class310) var40;
                                class108[] var47 = (class108[]) class82.field1126.method950((long) var46.field4993.field3150, (byte) -45);
                                if (var47 == null) {
                                    var47 = class158.method979(var46.field4993.field3150, class311.field5009, 0, -120);
                                    if (var47 != null) {
                                        class82.field1126.method942((long) var46.field4993.field3150, (byte) 15, var47);
                                    }
                                }
                                if (var47 != null && var47.length == 2) {
                                    var44 = var47[1];
                                    var45 = var47[0];
                                }
                            }
                            int var48 = var45.field1543;
                            int var49 = class105.field1512 + arg2 - (var45.field1540 >> 1);
                            var41 -= var48;
                            var45.method694(var49, var41);
                            int var50 = var40.field4056 * var45.field1540 / 255;
                            class266.method1724(var49, var41, var49 + var50, var41 + var48);
                            var44.method694(var49, var41);
                            var41 -= 2;
                            class266.method1747(arg2, arg3, arg2 + arg4, arg3 + arg6);
                        }
                        if (!(var40 instanceof class314)) {
                            int var51 = 0;
                            int var52 = 0;
                            class193[] var53 = class267.field4286;
                            while (var53.length > var52) {
                                class193 var54 = var53[var52];
                                if (var54 != null && var54.field2944 == 1 && class131.field1834[var7 - class171.field2437] == var54.field2943) {
                                    class108 var55 = class99.field1435[var54.field2946];
                                    if (var55.field1543 > var51) {
                                        var51 = var55.field1543;
                                    }
                                    if ((class35.field533 % 20) < 10) {
                                        var55.method694(arg2 + class105.field1512 - 12, -var55.field1543 + var41);
                                    }
                                }
                                var52++;
                            }
                            if (var51 > 0) {
                                var41 -= var51 + 2;
                            }
                        } else if (var7 >= 0) {
                            int var56 = 0;
                            class193[] var57 = class267.field4286;
                            for (int var58 = 0; var58 < var57.length; var58++) {
                                class193 var59 = var57[var58];
                                if (var59 != null && var59.field2944 == 10 && class160.field2235[var7] == var59.field2943) {
                                    class108 var60 = class99.field1435[var59.field2946];
                                    if (var56 < var60.field1543) {
                                        var56 = var60.field1543;
                                    }
                                    var60.method694(arg2 + class105.field1512 - 12, -var60.field1543 + var41);
                                }
                            }
                            if (var56 > 0) {
                                var41 -= var56 + 2;
                            }
                        }
                        if (!var40.field4104 && var40.field4074 != null && (var7 >= class171.field2437 || class126.field1771 == 0 || class126.field1771 == 3 || class126.field1771 == 1 && class90.method586(true, ((class314) var40).field5053)) && class270.field4304 > class132.field1836) {
                            class270.field4308[class132.field1836] = class261.field4201.method230(var40.field4074) / 2;
                            class270.field4313[class132.field1836] = class261.field4201.field484;
                            var41 -= class270.field4313[class132.field1836];
                            class270.field4314[class132.field1836] = class105.field1512;
                            class270.field4305[class132.field1836] = var41;
                            class270.field4309[class132.field1836] = var40.field4115;
                            var41 -= 2;
                            class270.field4312[class132.field1836] = var40.field4040;
                            class270.field4303[class132.field1836] = var40.field4109;
                            class270.field4306[class132.field1836] = var40.field4074;
                            class132.field1836++;
                        }
                        var40.field4049 = var41;
                    }
                    for (int var61 = 0; var61 < 4; var61++) {
                        if (class35.field533 < var40.field4135[var61]) {
                            int var62 = var40.method1673((byte) 83) / 2;
                            class193.method1223(arg4 >> 1, arg6 >> 1, arg5, 0, var40, var62, arg1);
                            if (class105.field1512 > -1) {
                                if (var61 == 1) {
                                    class161.field2250 -= 20;
                                }
                                if (var61 == 2) {
                                    class105.field1512 -= 15;
                                    class161.field2250 -= 10;
                                }
                                if (var61 == 3) {
                                    class105.field1512 += 15;
                                    class161.field2250 -= 10;
                                }
                                class191.field2909[var40.field4141[var61]].method694(class105.field1512 + arg2 - 12, class161.field2250 + -12 + arg3);
                                class301.field4788.method211(Integer.toString(var40.field4090[var61]), class105.field1512 + arg2 - 1, arg3 - -class161.field2250 - -3, 16777215, 0);
                            }
                        }
                    }
                }
            }
        }
        for (int var8 = 0; var8 < class14.field237; var8++) {
            int var24 = class242.field3802[var8];
            class256 var25;
            if (var24 >= 2048) {
                var24 -= 2048;
                var25 = class88.field1274[var24];
            } else {
                var25 = class48.field689[var24];
            }
            int var26 = class222.field3464[var8];
            class256 var27;
            if (var26 >= 2048) {
                var26 -= 2048;
                var27 = class88.field1274[var26];
            } else {
                var27 = class48.field689[var26];
            }
            int var28 = var27.method1670((byte) 108);
            if (var28 != -1) {
                Object var29 = null;
                class108 var30 = (class108) class83.field1154.method950((long) var28, (byte) -45);
                if (var30 == null) {
                    class108[] var31 = class158.method979(var28, class311.field5009, 0, arg0 - 114);
                    if (var31 != null) {
                        var30 = var31[0];
                        class83.field1154.method942((long) var28, (byte) 27, var30);
                    }
                }
                if (var30 != null) {
                    int var32 = var25.field4118++;
                    class212.method1323((byte) -120, arg1, var25.field4140, arg6 >> 1, var25.field4081, 0, var25.method1683(arg0 ^ 0x73) * 64, arg5, arg4 >> 1);
                    int var33 = arg2 + class105.field1512 - 18;
                    int var34 = var32 / 4 * 18 + var33;
                    int var35 = class161.field2250 - 54 - 16;
                    int var36 = var32 % 4 * 18 + var35;
                    var30.method694(var34, var36);
                    if (var25 == var27) {
                        class266.method1743(var34 - 1, var36 + -1, 18, 18, 16776960);
                    }
                    if (class302.field4804 >= var34 && var30.field1540 + var34 > class302.field4804 && class179.field2717 >= var36 && (var30.field1543 + var36) > class179.field2717) {
                        if (var27 instanceof class314) {
                            class171.field2429[0] = (long) var26 << 32;
                        } else {
                            class171.field2429[0] = class158.method978((long) var26 << 32, 536870912L);
                        }
                        class229.field3599 = false;
                        class37.field573 = 1;
                    }
                }
            }
            if (var27.field4074 != null && (var27 instanceof class310 || class126.field1771 == 0 || class126.field1771 == 3 || class126.field1771 == 1 && class90.method586(true, ((class314) var27).field5053)) && class270.field4304 > class132.field1836) {
                class193.method1223(arg4 >> 1, arg6 >> 1, arg5, arg0 + 5, var25, 0, arg1);
                int var37 = var25.field4049;
                class270.field4308[class132.field1836] = class261.field4201.method230(var27.field4074) / 2;
                class270.field4313[class132.field1836] = class261.field4201.field484;
                int var38 = var37 - class270.field4313[class132.field1836];
                class270.field4314[class132.field1836] = class105.field1512;
                class270.field4305[class132.field1836] = var38;
                int var63 = var38 - 2;
                class270.field4309[class132.field1836] = var27.field4115;
                class270.field4312[class132.field1836] = var27.field4040;
                class270.field4303[class132.field1836] = var27.field4109;
                class270.field4306[class132.field1836] = var27.field4074;
                class132.field1836++;
            }
        }
        field4734++;
        for (int var9 = 0; var9 < class132.field1836; var9++) {
            int var10 = class270.field4314[var9];
            int var11 = class270.field4305[var9];
            int var12 = class270.field4308[var9];
            boolean var13 = true;
            int var14 = class270.field4313[var9];
            while (var13) {
                var13 = false;
                for (int var23 = 0; var23 < var9; var23++) {
                    if ((var11 + 2) > (class270.field4305[var23] - class270.field4313[var23]) && class270.field4305[var23] + 2 > -var14 + var11 && class270.field4314[var23] + class270.field4308[var23] > -var12 + var10 && class270.field4314[var23] - class270.field4308[var23] < var10 + var12 && var11 > (class270.field4305[var23] - class270.field4313[var23])) {
                        var13 = true;
                        var11 = class270.field4305[var23] - class270.field4313[var23];
                    }
                }
            }
            class105.field1512 = class270.field4314[var9];
            class161.field2250 = class270.field4305[var9] = var11;
            String var15 = class270.field4306[var9];
            if (class175.field2475 == 0) {
                int var16 = 16776960;
                if (class270.field4309[var9] < 6) {
                    var16 = class257.field4162[class270.field4309[var9]];
                }
                if (class270.field4309[var9] == 6) {
                    var16 = (class167.field2396 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class270.field4309[var9] == 7) {
                    var16 = class167.field2396 % 20 < 10 ? 255 : 65535;
                }
                if (class270.field4309[var9] == 8) {
                    var16 = class167.field2396 % 20 < 10 ? 45056 : 8454016;
                }
                if (class270.field4309[var9] == 9) {
                    int var17 = 150 - class270.field4303[var9];
                    if (var17 < 50) {
                        var16 = var17 * 1280 + 16711680;
                    } else if (var17 < 100) {
                        var16 = 16776960 + 16384000 - (var17 * 327680);
                    } else if (var17 < 150) {
                        var16 = (var17 - 100) * 5 + 65280;
                    }
                }
                if (class270.field4309[var9] == 10) {
                    int var18 = 150 - class270.field4303[var9];
                    if (var18 < 50) {
                        var16 = var18 * 5 + 16711680;
                    } else if (var18 < 100) {
                        var16 = 16384000 + 16711935 - (var18 * 327680);
                    } else if (var18 < 150) {
                        var16 = ((var18 - 100) * 327680) + 255 - ((var18 + -100) * 5);
                    }
                }
                if (class270.field4309[var9] == 11) {
                    int var19 = 150 - class270.field4303[var9];
                    if (var19 < 50) {
                        var16 = 16777215 - (var19 * 327685);
                    } else if (var19 < 100) {
                        var16 = (var19 * 327685) + 65280 - 16384250;
                    } else if (var19 < 150) {
                        var16 = 16777215 + 32768000 - (var19 * 327680);
                    }
                }
                if (class270.field4312[var9] == 0) {
                    class261.field4201.method211(var15, class105.field1512 + arg2, class161.field2250 + arg3, var16, 0);
                }
                if (class270.field4312[var9] == 1) {
                    class261.field4201.method220(var15, class105.field1512 + arg2, arg3 - -class161.field2250, var16, 0, class167.field2396);
                }
                if (class270.field4312[var9] == 2) {
                    class261.field4201.method218(var15, class105.field1512 + arg2, class161.field2250 + arg3, var16, 0, class167.field2396);
                }
                if (class270.field4312[var9] == 3) {
                    class261.field4201.method219(var15, class105.field1512 + arg2, arg3 - -class161.field2250, var16, 0, class167.field2396, 150 - class270.field4303[var9]);
                }
                if (class270.field4312[var9] == 4) {
                    int var20 = (150 - class270.field4303[var9]) * (class261.field4201.method230(var15) + 100) / 150;
                    class266.method1724(arg2 + class105.field1512 - 50, arg3, class105.field1512 + arg2 + 50, arg3 - -arg6);
                    class261.field4201.method206(var15, arg2 + class105.field1512 + 50 - var20, arg3 - -class161.field2250, var16, 0);
                    class266.method1747(arg2, arg3, arg2 + arg4, arg3 + arg6);
                }
                if (class270.field4312[var9] == 5) {
                    int var21 = 150 - class270.field4303[var9];
                    class266.method1724(arg2, class161.field2250 + arg3 - class261.field4201.field484 - 1, arg2 + arg4, arg3 + class161.field2250 + 5);
                    int var22 = 0;
                    if (var21 < 25) {
                        var22 = var21 - 25;
                    } else if (var21 > 125) {
                        var22 = var21 - 125;
                    }
                    class261.field4201.method211(var15, class105.field1512 + arg2, class161.field2250 - -var22 + arg3, var16, 0);
                    class266.method1747(arg2, arg3, arg2 + arg4, arg3 - -arg6);
                }
            } else {
                class261.field4201.method211(var15, class105.field1512 + arg2, class161.field2250 + arg3, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)Z")
    public final boolean method1989(int arg0) {
        field4736++;
        int var2 = -108 / ((-arg0 - 37) / 59);
        return ((this.field4739 & 0x6E38B1B6) >> 30) != 0;
    }

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)Z")
    public final boolean method1990(int arg0) {
        field4735++;
        if (arg0 != 10449) {
            method1988(-6, -113, -104, -6, 80, -85, 88);
        }
        return ((this.field4739 & 0x2DB6FD00) >> 29) != 0;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lnh;Lnh;B)V")
    public static final void method1991(class305 arg0, class305 arg1, byte arg2) {
        field4733++;
        class301.field4788 = class186.method1181(0, class230.field3603, arg1, (byte) 94, arg0);
        class57.field795 = (class239) class301.field4788;
        class17.field293 = class186.method1181(0, class224.field3493, arg1, (byte) 94, arg0);
        if (arg2 != -11) {
            method2001(-96);
        }
        class261.field4201 = class186.method1181(0, class25.field391, arg1, (byte) 94, arg0);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BI)Z")
    public final boolean method1992(byte arg0, int arg1) {
        if (arg0 < 42) {
            this.method1995(-63);
        }
        field4740++;
        return (this.field4739 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public static void method1993(byte arg0) {
        if (arg0 != 45) {
            method2000(-107, -22);
        }
        field4729 = null;
        field4743 = null;
        field4745 = null;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(Z)Z")
    public final boolean method1994(boolean arg0) {
        field4732++;
        if (arg0) {
            return (this.field4739 & 0x306968) >> 21 != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)Z")
    public final boolean method1995(int arg0) {
        if (arg0 != 3420) {
            this.field4739 = 64;
        }
        field4737++;
        return (this.field4739 & 0x145CA6B9) >> 28 != 0;
    }

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "(I)I")
    public final int method1996(int arg0) {
        if (arg0 != -11) {
            this.method1992((byte) -118, 63);
        }
        field4725++;
        return class257.method1687(126, this.field4739);
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(Z)Z")
    public final boolean method1997(boolean arg0) {
        if (arg0) {
            field4745 = null;
        }
        field4738++;
        return (this.field4739 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1998(int arg0, String arg1) {
        field4741++;
        if (class290.field4633 != null && arg0 == 1448) {
            class231.field3614.method809(165, 0);
            class231.field3614.method1363(class231.method1518(arg1, 89), arg0 - 1352);
            class7.field80++;
            class231.field3614.method1384(arg1, -595448376);
        }
    }

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "(I)Z")
    public final boolean method1999(int arg0) {
        if (arg0 != 1) {
            this.field4739 = 106;
        }
        field4742++;
        return (this.field4739 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(II)V")
    public class297(int arg0, int arg1) {
        this.field4731 = arg1;
        this.field4739 = arg0;
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(II)Z")
    public static final boolean method2000(int arg0, int arg1) {
        field4728++;
        if (class254.field3962 == arg0) {
            return false;
        }
        class51.field726 = new int[104][104];
        class45.field665 = new int[4][13][13];
        int var2 = 57 / ((-arg1 - 14) / 59);
        class238.field3693 = new int[104][104];
        class164.field2326 = new int[104][104];
        class106.field1517 = new int[104][104];
        for (int var3 = 0; var3 < 4; var3++) {
            class156.field2153[var3] = new class213(104, 104);
        }
        class51.field724 = new byte[4][104][104];
        class164.field2333 = new byte[4][104][104];
        class254.field3962 = arg0;
        class78.field1088 = new class58[4][104][104];
        return true;
    }

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "(I)V")
    public static final void method2001(int arg0) {
        field4744++;
        while (class131.field1830.method813(8, class114.field1632) >= 27) {
            int var1 = class131.field1830.method805(15, (byte) 19);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class88.field1274[var1] == null) {
                class88.field1274[var1] = new class310();
                var2 = true;
            }
            class310 var3 = class88.field1274[var1];
            class131.field1834[class306.field4921++] = var1;
            var3.field4119 = class35.field533;
            if (var3.field4993 != null && var3.field4993.method1305(36)) {
                class16.method113((byte) 95, var3);
            }
            int var4 = class153.field2131[class131.field1830.method805(3, (byte) 84)];
            if (var2) {
                var3.field4142 = var3.field4093 = var4;
            }
            var3.method2103(class76.method499((byte) 61, class131.field1830.method805(14, (byte) 29)), (byte) 48);
            int var5 = class131.field1830.method805(5, (byte) 53);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class131.field1830.method805(5, (byte) 3);
            int var7 = class131.field1830.method805(1, (byte) -101);
            if (var6 > 15) {
                var6 -= 32;
            }
            if (var7 == 1) {
                class211.field3131[class102.field1466++] = var1;
            }
            int var8 = class131.field1830.method805(1, (byte) 106);
            var3.method1669(false, var3.field4993.field3122);
            var3.field4045 = var3.field4993.field3154;
            var3.field4062 = var3.field4993.field3137;
            if (var3.field4045 == 0) {
                var3.field4093 = 0;
            }
            var3.method1681(var3.method1683(arg0 - 157), class250.field3905.field4053[0] + var5, var8 == 1, class250.field3905.field4143[0] + var6, (byte) -24);
            if (var3.field4993.method1305(28)) {
                class284.method1869(0, 0, 28549, var3, var3.field4053[0], (class240) null, var3.field4143[0], (class314) null, class166.field2364);
            }
        }
        class131.field1830.method810(-77);
        if (arg0 != 32) {
            field4745 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)Z")
    public final boolean method2002(byte arg0) {
        if (arg0 > -100) {
            field4726 = -97;
        }
        field4727++;
        return (this.field4739 >> 31 & 0x1) != 0;
    }
}
