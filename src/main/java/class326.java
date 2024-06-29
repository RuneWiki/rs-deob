import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class326 extends class190 {

    @OriginalMember(owner = "client!da", name = "C", descriptor = "I")
    public int field4692;

    @OriginalMember(owner = "client!da", name = "B", descriptor = "Z")
    public boolean field4691;

    @OriginalMember(owner = "client!da", name = "E", descriptor = "Z")
    public boolean field4694;

    @OriginalMember(owner = "client!da", name = "O", descriptor = "[S")
    public short[] field4702;

    @OriginalMember(owner = "client!da", name = "P", descriptor = "I")
    public int field4703;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "I")
    private int field4698;

    @OriginalMember(owner = "client!da", name = "F", descriptor = "Ljava/lang/String;")
    public static String field4695 = null;

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "Llc;")
    public static class135 field4704 = new class135("", 15);

    @OriginalMember(owner = "client!da", name = "D", descriptor = "I")
    private int field4693;

    @OriginalMember(owner = "client!da", name = "G", descriptor = "I")
    private int field4696;

    @OriginalMember(owner = "client!da", name = "H", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!da", name = "M", descriptor = "I")
    private int field4700;

    @OriginalMember(owner = "client!da", name = "N", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!da", name = "R", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!da", name = "S", descriptor = "I")
    private int field4706;

    @OriginalMember(owner = "client!da", name = "T", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(B)V")
    private final void method1980(byte arg0) {
        ++field4697;
        if (arg0 < 76) {
            method1982(121, (class280) null, (class394) null);
        }
        int var2 = this.field4703;
        if (~var2 != -3) {
            if (~var2 != -4) {
                if (var2 != 4) {
                    if (~var2 != -6) {
                        if (var2 != 12) {
                            if (~var2 != -14) {
                                if (~var2 != -11) {
                                    if (var2 != 11) {
                                        if (var2 != 6) {
                                            if (~var2 != -8) {
                                                if (var2 != 8) {
                                                    if (~var2 != -10) {
                                                        if (var2 != 14) {
                                                            if (var2 != 15) {
                                                                if (var2 == 16) {
                                                                    this.field4696 = 1792;
                                                                    this.field4706 = 1;
                                                                    this.field4700 = 8192;
                                                                    this.field4693 = 256;
                                                                } else {
                                                                    this.field4696 = 0;
                                                                    this.field4693 = 2048;
                                                                    this.field4706 = 0;
                                                                    this.field4700 = 2048;
                                                                }
                                                            } else {
                                                                this.field4693 = 512;
                                                                this.field4706 = 1;
                                                                this.field4700 = 4096;
                                                                this.field4696 = 1536;
                                                            }
                                                        } else {
                                                            this.field4706 = 1;
                                                            this.field4700 = 2048;
                                                            this.field4696 = 1280;
                                                            this.field4693 = 768;
                                                        }
                                                    } else {
                                                        this.field4700 = 4096;
                                                        this.field4693 = 1024;
                                                        this.field4696 = 1024;
                                                        this.field4706 = 3;
                                                    }
                                                } else {
                                                    this.field4706 = 3;
                                                    this.field4700 = 2048;
                                                    this.field4693 = 1024;
                                                    this.field4696 = 1024;
                                                }
                                            } else {
                                                this.field4696 = 1280;
                                                this.field4700 = 4096;
                                                this.field4706 = 3;
                                                this.field4693 = 768;
                                            }
                                        } else {
                                            this.field4700 = 2048;
                                            this.field4693 = 768;
                                            this.field4706 = 3;
                                            this.field4696 = 1280;
                                        }
                                    } else {
                                        this.field4700 = 4096;
                                        this.field4693 = 512;
                                        this.field4706 = 3;
                                        this.field4696 = 1536;
                                    }
                                } else {
                                    this.field4700 = 2048;
                                    this.field4696 = 1536;
                                    this.field4706 = 3;
                                    this.field4693 = 512;
                                }
                            } else {
                                this.field4696 = 0;
                                this.field4700 = 8192;
                                this.field4693 = 2048;
                                this.field4706 = 2;
                            }
                        } else {
                            this.field4693 = 2048;
                            this.field4706 = 2;
                            this.field4696 = 0;
                            this.field4700 = 2048;
                        }
                    } else {
                        this.field4696 = 0;
                        this.field4700 = 8192;
                        this.field4706 = 4;
                        this.field4693 = 2048;
                    }
                } else {
                    this.field4693 = 2048;
                    this.field4706 = 4;
                    this.field4696 = 0;
                    this.field4700 = 2048;
                }
            } else {
                this.field4706 = 1;
                this.field4696 = 0;
                this.field4693 = 2048;
                this.field4700 = 4096;
            }
        } else {
            this.field4700 = 2048;
            this.field4706 = 1;
            this.field4693 = 2048;
            this.field4696 = 0;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIII)V")
    public final void method1981(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4696 = arg0;
        int var6 = -114 / ((arg2 - 57) / 55);
        this.field4700 = arg1;
        this.field4706 = arg3;
        this.field4693 = arg4;
        ++field4705;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILoj;Leg;)V")
    public static final void method1982(int arg0, class280 arg1, class394 arg2) {
        ++field4699;
        if (class429.field6185 != null) {
            if (~class403.field5733 > -11) {
                if (!class429.field6184.method2763(class429.field6185.field3142, 3)) {
                    class403.field5733 = class353.field5071.method2782(class429.field6185.field3142, arg0 + -3) / 10;
                    return;
                }
                class57.method298(arg0 ^ 89);
                class403.field5733 = 10;
            }
            if (~class403.field5733 == -11) {
                class429.field6210 = class429.field6185.field3150 >> 6 << 6;
                class429.field6205 = class429.field6185.field3149 >> 6 << 6;
                class429.field6212 = (class429.field6185.field3152 >> 6 << 6) - -64 + -class429.field6205;
                class429.field6200 = (class429.field6185.field3157 >> 6 << 6) + -class429.field6210 + 64;
                int[] var3 = new int[3];
                int var4 = -1;
                int var5 = -1;
                if (class429.field6185.method1251(arg0 ^ 27514, (class19.field258.field1005 >> 7) + class349.field5023, var3, (class19.field258.field1008 >> 7) + class93.field1163, class19.field258.field994)) {
                    var4 = var3[1] - class429.field6205;
                    var5 = var3[2] + -class429.field6210;
                }
                if (!class353.field5072 && var4 >= 0 && class429.field6212 > var4 && var5 >= 0 && class429.field6200 > var5) {
                    int var6 = var4 + (int) (Math.random() * 10.0D) + -5;
                    int var7 = var5 + -5 + (int) (Math.random() * 10.0D);
                    class486.field6898 = var6;
                    class17.field218 = var7;
                } else if (class215.field2963 != -1 && class340.field4881 != -1) {
                    class429.field6185.method1256(var3, class215.field2963, class340.field4881, 113);
                    if (var3 != null) {
                        class486.field6898 = var3[1] - class429.field6205;
                        class17.field218 = var3[2] + -class429.field6210;
                    }
                    class353.field5072 = false;
                    class340.field4881 = -1;
                    class215.field2963 = -1;
                } else {
                    class429.field6185.method1256(var3, (268419234 & class429.field6185.field3151) >> 14, 16383 & class429.field6185.field3151, -40);
                    class486.field6898 = var3[1] + -class429.field6205;
                    class17.field218 = var3[2] + -class429.field6210;
                }
                if (~class429.field6185.field3148 != -38) {
                    if (class429.field6185.field3148 != 50) {
                        if (~class429.field6185.field3148 != -76) {
                            if (~class429.field6185.field3148 != -101) {
                                if (class429.field6185.field3148 != 200) {
                                    class429.field6195 = 8.0F;
                                    class429.field6192 = 8.0F;
                                } else {
                                    class429.field6195 = 16.0F;
                                    class429.field6192 = 16.0F;
                                }
                            } else {
                                class429.field6195 = 8.0F;
                                class429.field6192 = 8.0F;
                            }
                        } else {
                            class429.field6195 = 6.0F;
                            class429.field6192 = 6.0F;
                        }
                    } else {
                        class429.field6195 = 4.0F;
                        class429.field6192 = 4.0F;
                    }
                } else {
                    class429.field6195 = 3.0F;
                    class429.field6192 = 3.0F;
                }
                class429.field6188 = (int) class429.field6195 >> 1;
                class429.field6194 = class150.method725(arg0 ^ -124, class429.field6188);
                class184.method1003(-106);
                class429.method2559();
                class118.field1467 = new class166();
                class429.field6191 += (int) (Math.random() * 5.0D) + -2;
                if (~class429.field6191 > 7) {
                    class429.field6191 = -8;
                }
                class429.field6190 += (int) (Math.random() * 5.0D) + -2;
                if (~class429.field6191 < -9) {
                    class429.field6191 = 8;
                }
                if (~class429.field6190 > 15) {
                    class429.field6190 = -16;
                }
                if (~class429.field6190 < -17) {
                    class429.field6190 = 16;
                }
                class429.method2569(arg2, class429.field6191 >> 2 << 10, class429.field6190 >> 1);
                class429.field6187.method1893(256, false, 1024);
                class429.field6186.method1303(256, 256, 64);
                class429.field6180.method2292(false, 4096);
                class269.field3860.method993(0, 256);
                class403.field5733 = 20;
            } else if (class403.field5733 == 20) {
                class401.method2397(true, 0);
                class429.method2563(arg1, class429.field6191, class429.field6190);
                class403.field5733 = 60;
                class401.method2397(true, arg0 + -3);
                class192.method1053((byte) -35);
            } else if (~class403.field5733 == -61) {
                if (!class429.field6184.method2773(class429.field6185.field3142 + "_staticelements", arg0 + -4)) {
                    class429.field6193 = new class318(0);
                } else {
                    if (!class429.field6184.method2763(class429.field6185.field3142 + "_staticelements", arg0)) {
                        return;
                    }
                    class429.field6193 = class408.method2426(class429.field6184, class101.field1234, 0, class429.field6185.field3142 + "_staticelements");
                }
                class429.method2560();
                class403.field5733 = 70;
                class401.method2397(true, 0);
                class192.method1053((byte) -104);
            } else if (~class403.field5733 == -71) {
                class77.field927 = new class209(arg1, 11, true, class126.field1542);
                class403.field5733 = 73;
                class401.method2397(true, arg0 ^ 3);
                class192.method1053((byte) -79);
            } else if (class403.field5733 == 73) {
                class364.field5224 = new class209(arg1, 12, true, class126.field1542);
                class403.field5733 = 76;
                class401.method2397(true, 0);
                class192.method1053((byte) -101);
            } else {
                if (arg0 != 3) {
                    method1984(74);
                }
                if (~class403.field5733 == -77) {
                    class458.field6455 = new class209(arg1, 14, true, class126.field1542);
                    class403.field5733 = 79;
                    class401.method2397(true, 0);
                    class192.method1053((byte) -106);
                } else if (~class403.field5733 == -80) {
                    class354.field5088 = new class209(arg1, 17, true, class126.field1542);
                    class403.field5733 = 82;
                    class401.method2397(true, arg0 ^ 3);
                    class192.method1053((byte) -29);
                } else if (class403.field5733 == 82) {
                    class52.field686 = new class209(arg1, 19, true, class126.field1542);
                    class403.field5733 = 85;
                    class401.method2397(true, 0);
                    class192.method1053((byte) -14);
                } else if (class403.field5733 == 85) {
                    class476.field6704 = new class209(arg1, 22, true, class126.field1542);
                    class403.field5733 = 88;
                    class401.method2397(true, 0);
                    class192.method1053((byte) -28);
                } else if (class403.field5733 == 88) {
                    class356.field5114 = new class209(arg1, 26, true, class126.field1542);
                    class403.field5733 = 91;
                    class401.method2397(true, 0);
                    class192.method1053((byte) -84);
                } else {
                    class128.field1587 = new class209(arg1, 30, true, class126.field1542);
                    class403.field5733 = 100;
                    class401.method2397(true, 0);
                    class192.method1053((byte) -27);
                    System.gc();
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
    public static void method1983(int arg0) {
        field4695 = null;
        if (arg0 == 0) {
            field4704 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
    public static final void method1984(int arg0) {
        ++field4701;
        if (!class201.field2789) {
            class357.method2187(class105.field1264, (byte) -127);
            if (arg0 > 64) {
                if (class159.field1901 != null) {
                    class357.method2187(class159.field1901, (byte) -96);
                }
                class201.field2789 = true;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZ)V")
    public final void method1985(int arg0, int arg1, boolean arg2) {
        ++field4707;
        if (arg0 != 16) {
            method1984(97);
        }
        int var6;
        if (!arg2) {
            int var4 = 2047 & this.field4700 * arg1 / 50 + this.field4698;
            int var5 = this.field4706;
            if (var5 != 1) {
                if (var5 != 3) {
                    if (~var5 != -5) {
                        if (var5 != 2) {
                            if (var5 == 5) {
                                var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
                            } else {
                                var6 = 2048;
                            }
                        } else {
                            var6 = var4;
                        }
                    } else {
                        var6 = var4 >> 10 << 11;
                    }
                } else {
                    var6 = class368.field5263[var4] >> 1;
                }
            } else {
                var6 = (class16.field212[var4 << 3] >> 5) + 1024;
            }
        } else {
            var6 = 2048;
        }
        super.field2604 = (float) ((this.field4693 * var6 >> 11) + this.field4696) / 2048.0F;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
    protected class326() {
        if (class368.field5263 == null) {
            class442.method2614((byte) 103);
        }
        this.method1980((byte) 109);
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lvt;)V")
    public class326(class179 arg0) {
        if (class368.field5263 == null) {
            class442.method2614((byte) 108);
        }
        this.field4692 = arg0.method895((byte) -128);
        this.field4691 = ~(16 & this.field4692) != -1;
        this.field4694 = (this.field4692 & 8) != 0;
        this.field4692 &= 7;
        super.field2607 = arg0.method916(21933);
        super.field2605 = arg0.method916(21933);
        super.field2602 = arg0.method916(21933);
        super.field2601 = arg0.method895((byte) -76);
        int var2 = super.field2601 * 2 + 1;
        this.field4702 = new short[var2];
        for (int var3 = 0; ~var3 > ~this.field4702.length; ++var3) {
            short var5 = (short) arg0.method916(21933);
            int var6 = var5 >>> 8;
            int var7 = var5 & 255;
            if (~var6 <= ~var2) {
                var6 = var2 + -1;
            }
            if (-var6 + var2 < var7) {
                var7 = -var6 + var2;
            }
            this.field4702[var3] = (short) class292.method1841(var6 << 8, var7);
        }
        super.field2601 = (super.field2601 << class482.field6812) + class137.field1663;
        if (class424.field6109 == null) {
            super.field2606 = class89.field1121[65535 & class52.method283(arg0.method916(21933), 4)];
        } else {
            super.field2606 = class424.field6109[arg0.method916(21933)];
        }
        int var4 = arg0.method895((byte) -125);
        this.field4703 = 31 & var4;
        this.field4698 = var4 << 3 & 1792;
        if (this.field4703 != 31) {
            this.method1980((byte) 99);
        }
    }
}
