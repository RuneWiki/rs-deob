import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class140 extends class371 {

    @OriginalMember(owner = "client!gw", name = "J", descriptor = "I")
    private int field1834 = 4096;

    @OriginalMember(owner = "client!gw", name = "N", descriptor = "I")
    private int field1838 = 3216;

    @OriginalMember(owner = "client!gw", name = "R", descriptor = "[I")
    private int[] field1842 = new int[3];

    @OriginalMember(owner = "client!gw", name = "K", descriptor = "I")
    private int field1835 = 3216;

    @OriginalMember(owner = "client!gw", name = "O", descriptor = "I")
    public static int field1839 = 0;

    @OriginalMember(owner = "client!gw", name = "L", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!gw", name = "M", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!gw", name = "P", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!gw", name = "Q", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!gw", name = "S", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!gw", name = "T", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!gw", name = "U", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!gw", name = "V", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IBLps;)V")
    public final void method81(int arg0, byte arg1, class428 arg2) {
        ++field1845;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field1835 = arg2.method2620(90);
                }
            } else {
                this.field1838 = arg2.method2620(16);
            }
        } else {
            this.field1834 = arg2.method2620(90);
        }
        int var5 = 115 / ((arg1 - -15) / 39);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IIIIBII)V")
    public static final void method848(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        ++field1837;
        int var7 = class264.field3925;
        class15.field139 = 0;
        int[] var8 = class533.field7895;
        for (int var9 = 0; ~(class567.field8409 + var7) < ~var9; ++var9) {
            class429 var32 = null;
            class86 var33;
            if (~var7 >= ~var9) {
                var33 = ((class234) class627.field9185.method1333((long) class25.field230[-var7 + var9], false)).field3443;
                var32 = ((class383) var33).field5601;
                if (var32.field6238 != null) {
                    var32 = var32.method2629(class406.field5823, (byte) 96);
                    if (var32 == null) {
                        continue;
                    }
                }
            } else {
                var33 = class383.field5604[var8[var9]];
            }
            if (~var33.field1070 <= -1 && (class614.field9000 == var33.field1041 || class239.field3493.field3457 == var33.field3457)) {
                class351.method2149(var33, arg2 >> 1, arg6, arg3 >> 1, arg1, -126, var33.method498((byte) 96));
                if (~class543.field8117[0] <= -1) {
                    if (var33.field1042 != null && (~var7 >= ~var9 || ~class546.field8158 == -1 || ~class546.field8158 == -4 || ~class546.field8158 == -2 && class383.method2323(0, ((class179) var33).field2718)) && ~class15.field139 > ~class365.field5259) {
                        class365.field5257[class15.field139] = class511.field7585.method1053((byte) -118, var33.field1042) / 2;
                        class365.field5250[class15.field139] = class543.field8117[0];
                        class365.field5253[class15.field139] = class543.field8117[1];
                        class365.field5256[class15.field139] = var33.field1064;
                        class365.field5258[class15.field139] = var33.field1055;
                        class365.field5252[class15.field139] = var33.field1027;
                        class365.field5249[class15.field139] = var33.field1042;
                        ++class15.field139;
                    }
                    int var34 = class543.field8117[1] + arg0;
                    int var45;
                    if (!var33.field1034 && ~class576.field8505 > ~var33.field1032) {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var38;
                        if (var9 < var7) {
                            class179 var37 = class383.field5604[var8[var9]];
                            var38 = var33.method513(0).field3394;
                            if (var37.field2744) {
                                var36 = 2;
                            }
                        } else {
                            var38 = var32.field6250;
                            if (var38 == -1) {
                                var38 = var33.method513(arg4 + 7).field3394;
                            }
                        }
                        class116[] var39 = class386.field5646;
                        if (~var38 != 0) {
                            class116[] var40 = (class116[]) class606.field8927.method2025((long) var38, 2);
                            if (var40 == null) {
                                class610[] var41 = class610.method3547(class371.field5368, var38, 0);
                                if (var41 != null) {
                                    var40 = new class116[var41.length];
                                    for (int var42 = 0; var41.length > var42; ++var42) {
                                        var40[var42] = class379.field5558.method961(var41[var42], true);
                                    }
                                    class606.field8927.method2029(false, var40, (long) var38);
                                }
                            }
                            if (var40 != null && ~var40.length <= -3) {
                                var39 = var40;
                            }
                        }
                        if (~var36 <= ~var39.length) {
                            var36 = 1;
                        }
                        class116 var43 = var39[0];
                        class116 var44 = var39[var36];
                        var45 = var34 - Math.max(class511.field7585.field2256, var43.method721());
                        int var46 = arg5 - -class543.field8117[0] - (var43.method718() >> 1);
                        int var47 = var43.method718() * var33.field1014 / 255;
                        if (~var33.field1014 < -1 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method723(var46, var45);
                        class379.field5558.method993(var46, var45, var46 - -var47, var45 + var43.method721());
                        var44.method723(var46, var45);
                        class379.field5558.method1022(arg5, arg0, arg3 + arg5, arg0 + arg2);
                    } else {
                        var45 = var34 - Math.max(class511.field7585.field2256, class386.field5646[0].method721());
                    }
                    var45 -= 2;
                    if (!var33.field1034) {
                        if (var33.field1085 > class576.field8505) {
                            class116 var48 = class429.field6303[var33.field1078 ? 2 : 0];
                            class116 var49 = class429.field6303[var33.field1078 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if (!(var33 instanceof class383)) {
                                var51 = var33.method513(0).field3369;
                            } else {
                                var51 = var32.field6244;
                                if (var51 == -1) {
                                    var51 = var33.method513(0).field3369;
                                }
                            }
                            if (var51 != -1) {
                                class116[] var52 = (class116[]) class296.field4337.method2025((long) var51, 2);
                                if (var52 == null) {
                                    class610[] var53 = class610.method3547(class371.field5368, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class116[var53.length];
                                        for (int var54 = 0; ~var53.length < ~var54; ++var54) {
                                            var52[var54] = class379.field5558.method961(var53[var54], true);
                                        }
                                        class296.field4337.method2029(false, var52, (long) var51);
                                    }
                                }
                                if (var52 != null && ~var52.length == -5) {
                                    var48 = var52[var33.field1078 ? 2 : 0];
                                    var49 = var52[var33.field1078 ? 3 : 1];
                                }
                            }
                            int var55 = var33.field1085 - class576.field8505;
                            int var58;
                            if (~var33.field995 > ~var55) {
                                int var56 = var55 - var33.field995;
                                int var57 = var33.field1006 == 0 ? 0 : (-var56 + var33.field1020) / var33.field1006 * var33.field1006;
                                var58 = var48.method718() * var57 / var33.field1020;
                            } else {
                                var58 = var48.method718();
                            }
                            int var59 = var48.method721();
                            var45 -= var59;
                            int var60 = class543.field8117[0] + arg5 + -(var48.method718() >> 1);
                            var48.method723(var60, var45);
                            class379.field5558.method993(var60, var45, var60 - -var58, var45 + var59);
                            var49.method723(var60, var45);
                            var45 -= 2;
                            class379.field5558.method1022(arg5, arg0, arg5 - -arg3, arg0 + arg2);
                        }
                        if (var9 >= var7) {
                            if (~var32.field6272 <= -1 && class191.field2900.length > var32.field6272) {
                                var45 -= 25;
                                class116 var61 = class191.field2900[var32.field6272];
                                var61.method723(class543.field8117[0] + arg5 + -(var61.method718() >> 1), var45);
                                var45 -= 2;
                            }
                        } else {
                            class179 var62 = (class179) var33;
                            if (~var62.field2732 != 0) {
                                var45 -= 25;
                                class341.field4994[var62.field2732].method723(class543.field8117[0] + -12 + arg5, var45);
                                var45 -= 2;
                            }
                            if (var62.field2747 != -1) {
                                var45 -= 25;
                                class191.field2900[var62.field2747].method723(arg5 + -12 - -class543.field8117[0], var45);
                                var45 -= 2;
                            }
                        }
                    }
                    int var10000;
                    if (var33 instanceof class179) {
                        if (~var9 <= -1) {
                            int var63 = 0;
                            class67[] var64 = class255.field3737;
                            for (int var65 = 0; var64.length > var65; ++var65) {
                                class67 var67 = var64[var65];
                                if (var67 != null && var67.field769 == 10 && ~var8[var9] == ~var67.field776) {
                                    class116 var68 = class445.field6486[var67.field767];
                                    if (var68.method721() > var63) {
                                        var63 = var68.method721();
                                    }
                                    var68.method723(arg5 - -class543.field8117[0] - 12, var45 + -var68.method721());
                                }
                            }
                            if (~var63 < -1) {
                                var10000 = var45 - (var63 - -2);
                            }
                        }
                    } else {
                        int var69 = 0;
                        class67[] var70 = class255.field3737;
                        for (int var71 = 0; ~var71 > ~var70.length; ++var71) {
                            class67 var76 = var70[var71];
                            if (var76 != null && ~var76.field769 == -2 && class25.field230[-var7 + var9] == var76.field776) {
                                class116 var77 = class445.field6486[var76.field767];
                                if (var69 < var77.method721()) {
                                    var69 = var77.method721();
                                }
                                if (~(class576.field8505 % 20) > -11) {
                                    var77.method723(arg5 + -12 + class543.field8117[0], -var77.method721() + var45);
                                }
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 - -2);
                        }
                    }
                    for (int var73 = 0; ~var73 > -5; ++var73) {
                        if (class576.field8505 < var33.field1060[var73]) {
                            int var74 = var33.method498((byte) 87) / 2;
                            class351.method2149(var33, arg2 >> 1, arg6, arg3 >> 1, arg1, arg4 ^ 123, var74);
                            if (~class543.field8117[0] < 0) {
                                int var75 = class63.field737[var33.field1029[var73]].method718();
                                if (~var73 == -2) {
                                    class543.field8117[1] -= 20;
                                }
                                if (var73 == 2) {
                                    class543.field8117[0] -= var75 + -9;
                                    class543.field8117[1] -= 10;
                                }
                                if (~var73 == -4) {
                                    class543.field8117[0] += var75 - 9;
                                    class543.field8117[1] -= 10;
                                }
                                class63.field737[var33.field1029[var73]].method723(-(var75 >> 1) + arg5 - -class543.field8117[0], class543.field8117[1] + arg0 + -12);
                                class463.field6700.method1665(-1, arg5 - (-class543.field8117[0] - -1), false, Integer.toString(var33.field1066[var73]), 0, arg0 + 3 + class543.field8117[1]);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; class517.field7691 > var10; ++var10) {
            int var28 = class298.field4350[var10];
            class86 var29;
            if (~var28 <= -2049) {
                var29 = ((class234) class627.field9185.method1333((long) (var28 + -2048), false)).field3443;
            } else {
                var29 = class383.field5604[var28];
            }
            int var30 = class11.field101[var10];
            class86 var31;
            if (var30 < 2048) {
                var31 = class383.field5604[var30];
            } else {
                var31 = ((class234) class627.field9185.method1333((long) (var30 + -2048), false)).field3443;
            }
            class78.method458(arg3, arg5, var31, --var29.field1033, arg2, arg6, 13450, var29, arg0, arg1);
        }
        if (arg4 != -7) {
            method851((class597) null, -51);
        }
        int var11 = class511.field7585.field2256 - (-class511.field7585.field2253 - 2);
        for (int var12 = 0; class15.field139 > var12; ++var12) {
            int var13 = class365.field5250[var12];
            int var14 = class365.field5253[var12];
            int var15 = class365.field5257[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; ~var12 < ~var27; ++var27) {
                    if (var14 + 2 > class365.field5253[var27] - var11 && -var11 + var14 < class365.field5253[var27] - -2 && -var15 + var13 < class365.field5250[var27] - -class365.field5257[var27] && class365.field5250[var27] + -class365.field5257[var27] < var13 + var15 && ~var14 < ~(class365.field5253[var27] + -var11)) {
                        var16 = true;
                        var14 = class365.field5253[var27] + -var11;
                    }
                }
            }
            class365.field5253[var12] = var14;
            String var17 = class365.field5249[var12];
            if (~class419.field6027 == -1) {
                int var18 = 16776960;
                if (class365.field5256[var12] < 6) {
                    var18 = class186.field2817[class365.field5256[var12]];
                }
                if (class365.field5256[var12] == 6) {
                    var18 = ~(class614.field9000 % 20) <= -11 ? 16776960 : 16711680;
                }
                if (class365.field5256[var12] == 7) {
                    var18 = class614.field9000 % 20 >= 10 ? 65535 : 255;
                }
                if (~class365.field5256[var12] == -9) {
                    var18 = class614.field9000 % 20 < 10 ? 45056 : 8454016;
                }
                if (class365.field5256[var12] == 9) {
                    int var19 = -class365.field5252[var12] + 150;
                    if (~var19 > -51) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (~var19 > -101) {
                        var18 = -((var19 - 50) * 327680) + 16776960;
                    } else if (var19 < 150) {
                        var18 = 65280 - -((var19 - 100) * 5);
                    }
                }
                if (~class365.field5256[var12] == -11) {
                    int var20 = -class365.field5252[var12] + 150;
                    if (var20 >= 50) {
                        if (~var20 <= -101) {
                            if (~var20 > -151) {
                                var18 = 255 - -((var20 - 100) * 327680) - -500 - var20 * 5;
                            }
                        } else {
                            var18 = 16711935 - (var20 * 327680 + -16384000);
                        }
                    } else {
                        var18 = var20 * 5 + 16711680;
                    }
                }
                if (class365.field5256[var12] == 11) {
                    int var21 = -class365.field5252[var12] + 150;
                    if (~var21 <= -51) {
                        if (var21 >= 100) {
                            if (var21 < 150) {
                                var18 = 16777215 - (var21 + -100) * 327680;
                            }
                        } else {
                            var18 = (var21 + -50) * 327685 + 65280;
                        }
                    } else {
                        var18 = -(var21 * 327685) + 16777215;
                    }
                }
                int var22 = -16777216 | var18;
                if (class365.field5258[var12] == 0) {
                    class179.field2757.method1665(var22, arg5 - -var13, false, var17, -16777216, arg0 + var14);
                }
                if (~class365.field5258[var12] == -2) {
                    class179.field2757.method1668(var22, arg5 + var13, class614.field9000, arg0 + var14, -16777216, var17, (byte) 111);
                }
                if (class365.field5258[var12] == 2) {
                    class179.field2757.method1671(var17, var22, 27917, -16777216, arg5 + var13, arg0 + var14, class614.field9000);
                }
                if (class365.field5258[var12] == 3) {
                    class179.field2757.method1676(arg0 + var14, var17, arg5 - -var13, (byte) -112, var22, -16777216, -class365.field5252[var12] + 150, class614.field9000);
                }
                if (class365.field5258[var12] == 4) {
                    int var23 = (-class365.field5252[var12] + 150) * (class511.field7585.method1053((byte) -66, var17) + 100) / 150;
                    class379.field5558.method993(arg5 + var13 + -50, arg0, var13 + 50 + arg5, arg0 - -arg2);
                    class179.field2757.method1683(var22, -16777216, var17, arg5 + 50 - -var13 + -var23, arg0 + var14, arg4 + 19952);
                    class379.field5558.method1022(arg5, arg0, arg3 + arg5, arg0 - -arg2);
                }
                if (~class365.field5258[var12] == -6) {
                    int var24 = 150 - class365.field5252[var12];
                    int var25 = 0;
                    if (~var24 > -26) {
                        var25 = var24 - 25;
                    } else if (~var24 < -126) {
                        var25 = var24 - 125;
                    }
                    int var26 = class511.field7585.field2256 - -class511.field7585.field2253;
                    class379.field5558.method993(arg5, arg0 + var14 + -1 + -var26, arg3 + arg5, arg0 + var14 + 5);
                    class179.field2757.method1665(var22, arg5 + var13, false, var17, -16777216, var14 + var25 + arg0);
                    class379.field5558.method1022(arg5, arg0, arg3 + arg5, arg0 - -arg2);
                }
            } else {
                class179.field2757.method1665(-256, arg5 + var13, false, var17, -16777216, arg0 + var14);
            }
        }
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(BI)[I")
    public final int[] method79(byte arg0, int arg1) {
        ++field1846;
        int[] var3 = super.field5378.method1451(-117, arg1);
        if (arg0 > -80) {
            return null;
        } else {
            if (super.field5378.field3254) {
                int var4 = class197.field2970 * this.field1834 >> 12;
                int[] var5 = this.method2260((byte) -48, class135.field1789 & arg1 + -1, 0);
                int[] var6 = this.method2260((byte) -103, arg1, 0);
                int[] var7 = this.method2260((byte) -62, arg1 + 1 & class135.field1789, 0);
                for (int var8 = 0; ~var8 > ~class41.field455; ++var8) {
                    int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                    int var10 = (var6[var8 + -1 & class343.field5013] - var6[class343.field5013 & var8 + 1]) * var4 >> 12;
                    int var11 = var10 >> 4;
                    if (var11 < 0) {
                        var11 = -var11;
                    }
                    int var12 = var9 >> 4;
                    if (~var11 < -256) {
                        var11 = 255;
                    }
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = 255 & class138.field1822[((var12 + 1) * var12 >> 1) + var11];
                    int var14 = var13 * 4096 >> 8;
                    int var15 = var9 * var13 >> 8;
                    int var16 = var10 * var13 >> 8;
                    int var17 = this.field1842[0] * var16 >> 12;
                    int var18 = this.field1842[2] * var14 >> 12;
                    int var19 = this.field1842[1] * var15 >> 12;
                    var3[var8] = var17 + var18 + var19;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "()V")
    public class140() {
        super(1, true);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V")
    public final void method212(int arg0) {
        this.method849((byte) 77);
        ++field1843;
        if (arg0 != -19103) {
            this.method849((byte) 87);
        }
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(B)V")
    private final void method849(byte arg0) {
        ++field1836;
        double var2 = Math.cos((double) ((float) this.field1835 / 4096.0F));
        this.field1842[0] = (int) (Math.sin((double) ((float) this.field1838 / 4096.0F)) * var2 * 4096.0D);
        if (arg0 != 77) {
            method848(-4, -119, 88, -81, (byte) -31, 70, -52);
        }
        this.field1842[1] = (int) (Math.cos((double) ((float) this.field1838 / 4096.0F)) * var2 * 4096.0D);
        this.field1842[2] = (int) (Math.sin((double) ((float) this.field1835 / 4096.0F)) * 4096.0D);
        int var4 = this.field1842[0] * this.field1842[0] >> 12;
        int var5 = this.field1842[1] * this.field1842[1] >> 12;
        int var6 = this.field1842[2] * this.field1842[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var6 - -var5 >> 12)));
        if (var7 != 0) {
            this.field1842[1] = (this.field1842[1] << 12) / var7;
            this.field1842[0] = (this.field1842[0] << 12) / var7;
            this.field1842[2] = (this.field1842[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(ILwca;)V")
    public static final void method850(int arg0, class311 arg1) {
        ++field1840;
        if (class442.field6463 == arg1.field4678) {
            if (class239.field3493.field2718 == null) {
                arg1.field4650 = 0;
                arg1.field4624 = 0;
            } else {
                arg1.field4528 = 150;
                arg1.field4594 = (int) (Math.sin((double) class576.field8505 / 40.0D) * 256.0D) & 2047;
                arg1.field4535 = 5;
                arg1.field4650 = class404.field5807;
                arg1.field4624 = class245.method1571(class239.field3493.field2718, (byte) 3);
                arg1.field4542 = 0;
                arg1.field4628 = class239.field3493.field1039;
                arg1.field4516 = class239.field3493.field1048;
                arg1.field4613 = class239.field3493.field1003;
            }
        } else if (arg0 != -16190) {
            method850(-13, (class311) null);
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Ldda;I)I")
    public static final int method851(class597 arg0, int arg1) {
        ++field1841;
        int var2 = 0;
        if (arg0.method3491(113, class580.field8546)) {
            ++var2;
        }
        if (arg0.method3491(122, class56.field691)) {
            ++var2;
        }
        if (arg0.method3491(110, class216.field3203)) {
            ++var2;
        }
        if (arg0.method3491(118, class68.field781)) {
            ++var2;
        }
        if (arg0.method3491(104, class103.field1305)) {
            ++var2;
        }
        if (arg0.method3491(121, class586.field8705)) {
            ++var2;
        }
        if (arg0.method3491(112, class105.field1323)) {
            ++var2;
        }
        if (arg0.method3491(103, class636.field9268)) {
            ++var2;
        }
        if (arg0.method3491(113, class605.field8908)) {
            ++var2;
        }
        if (arg0.method3491(112, class346.field5039)) {
            ++var2;
        }
        if (arg0.method3491(105, class49.field576)) {
            ++var2;
        }
        if (arg0.method3491(117, class161.field2159)) {
            ++var2;
        }
        if (arg0.method3491(122, class264.field3928)) {
            ++var2;
        }
        if (arg1 > -49) {
            field1839 = -101;
        }
        if (arg0.method3491(120, class549.field8185)) {
            ++var2;
        }
        if (arg0.method3491(107, class453.field6624)) {
            ++var2;
        }
        if (arg0.method3491(117, class345.field5026)) {
            ++var2;
        }
        return var2;
    }
}
