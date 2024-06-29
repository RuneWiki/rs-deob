import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class204 extends class59 {

    @OriginalMember(owner = "client!wf", name = "T", descriptor = "I")
    private int field4015 = 0;

    @OriginalMember(owner = "client!wf", name = "Y", descriptor = "I")
    private int field4020 = 0;

    @OriginalMember(owner = "client!wf", name = "fb", descriptor = "I")
    private int field4027 = 0;

    @OriginalMember(owner = "client!wf", name = "cb", descriptor = "Lsd;")
    public static class166 field4024 = class135.method935("Texturen geladen)3", 0);

    @OriginalMember(owner = "client!wf", name = "ib", descriptor = "I")
    public static int field4030 = -1;

    @OriginalMember(owner = "client!wf", name = "bb", descriptor = "Lb;")
    public static class11 field4023 = new class11(64);

    @OriginalMember(owner = "client!wf", name = "mb", descriptor = "[I")
    public static int[] field4034 = new int[5];

    @OriginalMember(owner = "client!wf", name = "S", descriptor = "I")
    private int field4014;

    @OriginalMember(owner = "client!wf", name = "U", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!wf", name = "V", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!wf", name = "W", descriptor = "I")
    private int field4018;

    @OriginalMember(owner = "client!wf", name = "X", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!wf", name = "Z", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!wf", name = "ab", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!wf", name = "db", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!wf", name = "eb", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!wf", name = "gb", descriptor = "I")
    private int field4028;

    @OriginalMember(owner = "client!wf", name = "hb", descriptor = "I")
    private int field4029;

    @OriginalMember(owner = "client!wf", name = "jb", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!wf", name = "kb", descriptor = "I")
    private int field4032;

    @OriginalMember(owner = "client!wf", name = "lb", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!wf", name = "nb", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!wf", name = "ob", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!wf", name = "pb", descriptor = "I")
    private int field4037;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(Z)V")
    public static void method1336(boolean arg0) {
        field4034 = null;
        field4024 = null;
        field4023 = null;
        if (arg0) {
            method1342(119, -96, -109, 49);
        }
    }

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "(I)V")
    public static final void method1337(int arg0) {
        ++field4033;
        try {
            if (~class48.field897 == -1) {
                if (class47.field861 != null) {
                    class47.field861.method12((byte) 49);
                    class47.field861 = null;
                }
                class72.field1427 = null;
                class139.field2725 = 0;
                class16.field278 = false;
                class48.field897 = 1;
            }
            if (~class48.field897 == -2) {
                if (class72.field1427 == null) {
                    class72.field1427 = class35.field664.method651(class117.field2260, 0, class74.field1497);
                }
                if (class72.field1427.field1351 == 2) {
                    throw new IOException();
                }
                if (class72.field1427.field1351 == 1) {
                    class47.field861 = new class2((Socket) class72.field1427.field1352, class35.field664);
                    class72.field1427 = null;
                    class48.field897 = 2;
                }
            }
            if (class48.field897 == 2) {
                long var1 = class42.field750 = class12.field235.method1133((byte) 30);
                class156.field2989.field1000 = 0;
                class156.field2989.method429(14, (byte) 80);
                int var3 = (int) (31L & var1 >> 16);
                class156.field2989.method429(var3, (byte) 117);
                class47.field861.method15(2, 0, (byte) -110, class156.field2989.field988);
                class48.field897 = 3;
                class179.field3377.field1000 = 0;
            }
            if (~class48.field897 == -4) {
                if (class89.field1761 != null) {
                    class89.field1761.method1179((byte) -29);
                }
                if (class153.field2949 != null) {
                    class153.field2949.method1179((byte) -29);
                }
                int var4 = class47.field861.method10((byte) 119);
                if (class89.field1761 != null) {
                    class89.field1761.method1179((byte) -29);
                }
                if (class153.field2949 != null) {
                    class153.field2949.method1179((byte) -29);
                }
                if (~var4 != -1) {
                    class131.method919(120, var4);
                    return;
                }
                class48.field897 = 4;
                class179.field3377.field1000 = 0;
            }
            if (~class48.field897 == -5) {
                if (~class179.field3377.field1000 > -9) {
                    int var5 = class47.field861.method16((byte) -127);
                    if (-class179.field3377.field1000 + 8 < var5) {
                        var5 = -class179.field3377.field1000 + 8;
                    }
                    if (~var5 < -1) {
                        class47.field861.method13(class179.field3377.field988, true, class179.field3377.field1000, var5);
                        class179.field3377.field1000 += var5;
                    }
                }
                if (class179.field3377.field1000 == 8) {
                    class179.field3377.field1000 = 0;
                    class157.field3009 = class179.field3377.method385((byte) 126);
                    class48.field897 = 5;
                }
            }
            if (~class48.field897 == -6) {
                class156.field2989.field1000 = 0;
                int[] var6 = new int[] { (int) (9.9999999E7D * Math.random()), (int) (Math.random() * 9.9999999E7D), (int) (class157.field3009 >> 32), (int) class157.field3009 };
                class156.field2989.method429(10, (byte) 83);
                class156.field2989.method438(arg0 + 423055928, var6[0]);
                class156.field2989.method438(423055928, var6[1]);
                class156.field2989.method438(423055928, var6[2]);
                class156.field2989.method438(423055928, var6[3]);
                class156.field2989.method428(class12.field235.method1133((byte) 30), (byte) 85);
                class156.field2989.method396(class12.field236, false);
                class156.field2989.method431(class49.field907, class140.field2728, -97);
                class10.field193.field1000 = 0;
                if (client.field520 != 40) {
                    class10.field193.method429(16, (byte) 113);
                } else {
                    class10.field193.method429(18, (byte) 109);
                }
                class10.field193.method429(class156.field2989.field1000 + 93, (byte) 116);
                class10.field193.method438(423055928, 476);
                class10.field193.method429(class97.field1858 ? 1 : 0, (byte) 107);
                class124.method889(class10.field193, true);
                class10.field193.method438(arg0 ^ 423055928, class169.field3272.field850);
                class10.field193.method438(423055928, class172.field3298.field850);
                class10.field193.method438(arg0 ^ 423055928, class95.field1842.field850);
                class10.field193.method438(arg0 + 423055928, class63.field1301.field850);
                class10.field193.method438(arg0 ^ 423055928, class142.field2764.field850);
                class10.field193.method438(423055928, class138.field2693.field850);
                class10.field193.method438(arg0 + 423055928, class11.field213.field850);
                class10.field193.method438(423055928, class98.field1866.field850);
                class10.field193.method438(arg0 ^ 423055928, class3.field33.field850);
                class10.field193.method438(423055928, class120.field2348.field850);
                class10.field193.method438(423055928, class64.field1337.field850);
                class10.field193.method438(423055928, class18.field303.field850);
                class10.field193.method438(423055928, class129.field2529.field850);
                class10.field193.method438(423055928, class203.field4004.field850);
                class10.field193.method438(423055928, class134.field2608.field850);
                class10.field193.method438(423055928, class105.field2052.field850);
                class10.field193.method391(0, 0, class156.field2989.field988, class156.field2989.field1000);
                class47.field861.method15(class10.field193.field1000, 0, (byte) -119, class10.field193.field988);
                class156.field2989.method706(var6, (byte) 48);
                for (int var7 = 0; var7 < 4; ++var7) {
                    var6[var7] += 50;
                }
                class179.field3377.method706(var6, (byte) 62);
                class48.field897 = 6;
            }
            if (class48.field897 == 6 && class47.field861.method16((byte) -124) > 0) {
                int var8 = class47.field861.method10((byte) 119);
                if (~var8 == -22 && ~client.field520 == -21) {
                    class48.field897 = 7;
                } else if (var8 != 2) {
                    if (var8 == 15 && ~client.field520 == -41) {
                        class111.method808(0);
                        return;
                    }
                    if (var8 != 23 || class129.field2527 >= 1) {
                        class131.method919(arg0 ^ 120, var8);
                        return;
                    }
                    ++class129.field2527;
                    class48.field897 = 0;
                } else {
                    class48.field897 = 9;
                }
            }
            if (~class48.field897 == -8 && class47.field861.method16((byte) -123) > 0) {
                class82.field1674 = 60 * class47.field861.method10((byte) 119) - -180;
                class48.field897 = 8;
            }
            if (~class48.field897 == -9) {
                class139.field2725 = 0;
                class174.method1193(class56.field1078, class22.method148(new class166[] { class174.method1192(false, class82.field1674 / 60), class98.field1878 }, 0), (byte) -113, class154.field2966);
                if (--class82.field1674 <= 0) {
                    class48.field897 = 0;
                }
            } else {
                if (class48.field897 == 9 && ~class47.field861.method16((byte) -116) <= -10) {
                    class103.field2022 = class47.field861.method10((byte) 119);
                    class38.field686 = class47.field861.method10((byte) 119);
                    class121.field2379 = ~class47.field861.method10((byte) 119) == -2;
                    class69.field1397 = class47.field861.method10((byte) 119);
                    class69.field1397 <<= 8;
                    class69.field1397 += class47.field861.method10((byte) 119);
                    class12.field227 = class47.field861.method10((byte) 119);
                    class47.field861.method13(class179.field3377.field988, true, 0, 1);
                    class179.field3377.field1000 = 0;
                    class145.field2841 = class179.field3377.method704(arg0 ^ 255);
                    class47.field861.method13(class179.field3377.field988, true, 0, 2);
                    class179.field3377.field1000 = 0;
                    class19.field335 = class179.field3377.method405(2);
                    class48.field897 = 10;
                }
                if (arg0 != 0) {
                    field4030 = -36;
                }
                if (class48.field897 == 10) {
                    if (class47.field861.method16((byte) -114) >= class19.field335) {
                        class179.field3377.field1000 = 0;
                        class47.field861.method13(class179.field3377.field988, true, 0, class19.field335);
                        class91.method715((byte) 109);
                        class29.field531 = -1;
                        class31.method234(-1832, false);
                        class145.field2841 = -1;
                    }
                } else {
                    ++class139.field2725;
                    if (~class139.field2725 < -2001) {
                        if (~class129.field2527 > -2) {
                            if (class117.field2260 == class115.field2241) {
                                class117.field2260 = class110.field2128;
                            } else {
                                class117.field2260 = class115.field2241;
                            }
                            ++class129.field2527;
                            class48.field897 = 0;
                        } else {
                            class131.method919(120, -3);
                        }
                    }
                }
            }
        } catch (IOException var9) {
            if (class129.field2527 < 1) {
                ++class129.field2527;
                if (class117.field2260 != class115.field2241) {
                    class117.field2260 = class115.field2241;
                } else {
                    class117.field2260 = class110.field2128;
                }
                class48.field897 = 0;
            } else {
                class131.method919(120, -2);
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
    public class204() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "(I)V")
    public static final void method1338(int arg0) {
        ++field4031;
        if (arg0 >= 61) {
            for (class58 var1 = (class58) class134.field2596.method1109((byte) -61); var1 != null; var1 = (class58) class134.field2596.method1115((byte) 35)) {
                if (class165.field3130 == var1.field1191 && !var1.field1201) {
                    if (class49.field910 >= var1.field1187) {
                        var1.method497(class187.field3570, 0);
                        if (!var1.field1201) {
                            class131.field2556.method590(var1.field1191, var1.field1203, var1.field1195, var1.field1190, 60, var1, 0, -1, false);
                        } else {
                            var1.method915(0);
                        }
                    }
                } else {
                    var1.method915(0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        if (arg1 > 18) {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (~arg2 == -3) {
                        this.field4020 = (arg0.method388(-29381) << 12) / 100;
                    }
                } else {
                    this.field4027 = (arg0.method388(-29381) << 12) / 100;
                }
            } else {
                this.field4015 = arg0.method421((byte) 77);
            }
            ++field4035;
        }
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(III)I")
    public static final int method1339(int arg0, int arg1, int arg2) {
        ++field4021;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (~arg2 > -3) {
                arg2 = 2;
            } else if (~arg2 < -127) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg0 & 127) * arg2 / 128;
            if (var3 < arg1) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (65408 & arg0) + var3;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZII)V")
    private final void method1340(int arg0, boolean arg1, int arg2, int arg3) {
        ++field4025;
        int var5 = ~arg2 >= ~arg3 ? arg3 : arg2;
        int var6 = arg3 <= arg2 ? arg3 : arg2;
        int var7 = var5 >= arg0 ? var5 : arg0;
        int var8 = ~arg0 <= ~var6 ? var6 : arg0;
        int var9 = -var8 + var7;
        this.field4029 = (var7 + var8) / 2;
        if (var9 > 0) {
            int var10 = (var7 - arg0 << 12) / var9;
            int var11 = (-arg2 + var7 << 12) / var9;
            if (~this.field4029 < -1 && this.field4029 < 4096) {
                this.field4014 = (var9 << 12) / (this.field4029 > 2048 ? -(this.field4029 * 2) + 8192 : this.field4029 * 2);
            }
            int var12 = (-arg3 + var7 << 12) / var9;
            if (arg2 != var7) {
                if (arg3 == var7) {
                    this.field4028 = ~arg0 == ~var8 ? 4096 - -var11 : -var10 + 12288;
                } else {
                    this.field4028 = arg2 == var8 ? 12288 - -var12 : -var11 + 20480;
                }
            } else {
                this.field4028 = ~arg3 == ~var8 ? var10 + 20480 : -var12 + 4096;
            }
            this.field4028 /= 6;
        }
        if (!arg1) {
            this.field4032 = -82;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method37(boolean arg0, int arg1) {
        ++field4017;
        if (!arg0) {
            return null;
        } else {
            int[][] var3 = super.field1207.method528(76, arg1);
            if (super.field1207.field1320) {
                int[][] var4 = this.method498(arg1, 0, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[2];
                int[] var10 = var3[1];
                for (int var11 = 0; ~var11 > ~class98.field1879; ++var11) {
                    this.method1340(var7[var11], true, var5[var11], var6[var11]);
                    this.field4029 += this.field4020;
                    this.field4014 += this.field4027;
                    for (this.field4028 += this.field4015; this.field4028 < 0; this.field4028 += 4096) {
                    }
                    while (this.field4028 > 4096) {
                        this.field4028 -= 4096;
                    }
                    if (this.field4014 < 0) {
                        this.field4014 = 0;
                    }
                    if (this.field4029 < 0) {
                        this.field4029 = 0;
                    }
                    if (~this.field4029 < -4097) {
                        this.field4029 = 4096;
                    }
                    if (~this.field4014 < -4097) {
                        this.field4014 = 4096;
                    }
                    this.method1341(this.field4014, 8795, this.field4028, this.field4029);
                    var8[var11] = this.field4037;
                    var10[var11] = this.field4018;
                    var9[var11] = this.field4032;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIII)V")
    private final void method1341(int arg0, int arg1, int arg2, int arg3) {
        ++field4019;
        if (arg1 != 8795) {
            this.field4018 = 4;
        }
        int var5 = ~arg3 >= -2049 ? (arg0 + 4096) * arg3 >> 12 : arg3 - ((arg0 * arg3 >> 12) + -arg0);
        if (var5 <= 0) {
            this.field4037 = this.field4018 = this.field4032 = arg3;
        } else {
            int var6 = arg2 * 6;
            int var7 = -var5 + arg3 - -arg3;
            int var8 = (-var7 + var5 << 12) / var5;
            int var10 = var6 >> 12;
            int var11 = var8 * var5 >> 12;
            int var12 = var6 - (var10 << 12);
            int var13 = var11 * var12 >> 12;
            int var14 = var7 - -var13;
            int var15 = -var13 + var5;
            if (~var10 != -1) {
                if (~var10 != -2) {
                    if (var10 != 2) {
                        if (~var10 != -4) {
                            if (var10 != 4) {
                                if (var10 == 5) {
                                    this.field4032 = var15;
                                    this.field4018 = var7;
                                    this.field4037 = var5;
                                }
                            } else {
                                this.field4037 = var14;
                                this.field4018 = var7;
                                this.field4032 = var5;
                            }
                        } else {
                            this.field4037 = var7;
                            this.field4032 = var5;
                            this.field4018 = var15;
                        }
                    } else {
                        this.field4037 = var7;
                        this.field4018 = var5;
                        this.field4032 = var14;
                    }
                } else {
                    this.field4037 = var15;
                    this.field4032 = var7;
                    this.field4018 = var5;
                }
            } else {
                this.field4032 = var7;
                this.field4037 = var5;
                this.field4018 = var14;
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(IIII)I")
    public static final int method1342(int arg0, int arg1, int arg2, int arg3) {
        ++field4022;
        int var4 = arg1 & 3;
        if (arg2 >= -50) {
            return 5;
        } else if (var4 == 0) {
            return arg0;
        } else if (~var4 == -2) {
            return 7 - arg3;
        } else {
            return ~var4 == -3 ? 7 - arg0 : arg3;
        }
    }

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "(III)I")
    public static final int method1343(int arg0, int arg1, int arg2) {
        ++field4016;
        if (~arg0 < ~arg1) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        if (arg2 != 0) {
            return 97;
        } else {
            while (~arg0 != -1) {
                int var4 = arg1 % arg0;
                arg1 = arg0;
                arg0 = var4;
            }
            return arg1;
        }
    }
}
