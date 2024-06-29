import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class413 extends class403 {

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "I")
    public int field6171;

    @OriginalMember(owner = "client!nd", name = "Q", descriptor = "Z")
    public boolean field6179;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "Z")
    public boolean field6168;

    @OriginalMember(owner = "client!nd", name = "R", descriptor = "[S")
    public short[] field6180;

    @OriginalMember(owner = "client!nd", name = "X", descriptor = "I")
    public int field6186;

    @OriginalMember(owner = "client!nd", name = "P", descriptor = "I")
    private int field6178;

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "I")
    public static int field6174 = 0;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "Ljava/lang/String;")
    public static String field6172 = "Please wait...";

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "Z")
    public static boolean field6165 = true;

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
    public static int field6176 = 0;

    @OriginalMember(owner = "client!nd", name = "Y", descriptor = "I")
    public static int field6187 = 1;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
    public static int field6164;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
    public static int field6166;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
    public static int field6169;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "I")
    private int field6170;

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
    private int field6173;

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!nd", name = "O", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!nd", name = "S", descriptor = "I")
    private int field6181;

    @OriginalMember(owner = "client!nd", name = "U", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!nd", name = "V", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!nd", name = "W", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!nd", name = "Z", descriptor = "I")
    private int field6188;

    @OriginalMember(owner = "client!nd", name = "T", descriptor = "Lhb;")
    public static class345 field6182;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V")
    public static void method2676(int arg0) {
        int var1 = 72 % ((arg0 - -77) / 49);
        field6182 = null;
        field6172 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZII)V")
    public final void method2677(boolean arg0, int arg1, int arg2) {
        ++field6185;
        if (arg2 != 1536) {
            field6182 = null;
        }
        int var6;
        if (!arg0) {
            int var4 = this.field6188 * arg1 / 50 + this.field6178 & 2047;
            int var5 = this.field6181;
            if (~var5 != -2) {
                if (~var5 != -4) {
                    if (var5 != 4) {
                        if (~var5 != -3) {
                            if (var5 == 5) {
                                var6 = (~var4 > -1025 ? var4 : 2048 - var4) << 1;
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
                    var6 = class323.field4623[var4] >> 1;
                }
            } else {
                var6 = (class190.field2644[var4 << 3] >> 5) + 1024;
            }
        } else {
            var6 = 2048;
        }
        super.field5986 = (float) ((this.field6173 * var6 >> 11) + this.field6170) / 2048.0F;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIII)V")
    public final void method2678(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6164;
        this.field6170 = arg1;
        if (arg2 > -98) {
            field6182 = null;
        }
        this.field6173 = arg3;
        this.field6181 = arg0;
        this.field6188 = arg4;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILks;III)V")
    public static final void method2679(int arg0, int arg1, class166 arg2, int arg3, int arg4, int arg5) {
        ++field6169;
        if (~arg2.field2170 != 0 || arg2.field2183 != null) {
            int var6 = 0;
            int var7 = class358.field5243 * arg2.field2165 >> 8;
            if (~arg3 < ~arg2.field2180) {
                var6 += -arg2.field2180 + arg3;
            } else if (~arg3 > ~arg2.field2184) {
                var6 += -arg3 + arg2.field2184;
            }
            if (arg5 <= arg2.field2182) {
                if (~arg2.field2176 < ~arg5) {
                    var6 += arg2.field2176 - arg5;
                }
            } else {
                var6 += -arg2.field2182 + arg5;
            }
            if (~arg2.field2163 != -1 && ~arg2.field2163 <= ~(var6 - 64) && ~class358.field5243 != -1 && ~arg2.field2161 == ~arg0) {
                var6 -= 64;
                if (~var6 > -1) {
                    var6 = 0;
                }
                int var8 = (-var6 + arg2.field2163) * var7 / arg2.field2163;
                if (arg2.field2162 != null) {
                    arg2.field2162.method1842(var8);
                } else if (arg2.field2170 >= 0) {
                    class44 var9 = class44.method328(class258.field3764, arg2.field2170, 0);
                    if (var9 != null) {
                        class61 var10 = var9.method327().method406(class142.field1871);
                        class290 var11 = class290.method1825(var10, 100, var8);
                        var11.method1859(-1);
                        class405.field6092.method174(var11);
                        arg2.field2162 = var11;
                    }
                }
                int var12 = 4 % ((arg4 - 3) / 44);
                if (arg2.field2160 != null) {
                    arg2.field2160.method1842(var8);
                    if (!arg2.field2160.method2571(true)) {
                        arg2.field2160 = null;
                        return;
                    }
                } else {
                    if (arg2.field2183 == null || ~(arg2.field2175 -= arg1) < -1) {
                        return;
                    }
                    int var13 = (int) (Math.random() * (double) arg2.field2183.length);
                    class44 var14 = class44.method328(class258.field3764, arg2.field2183[var13], 0);
                    if (var14 == null) {
                        return;
                    }
                    class61 var15 = var14.method327().method406(class142.field1871);
                    class290 var16 = class290.method1825(var15, 100, var8);
                    var16.method1859(0);
                    class405.field6092.method174(var16);
                    arg2.field2160 = var16;
                    arg2.field2175 = arg2.field2174 + (int) (Math.random() * (double) (-arg2.field2174 + arg2.field2164));
                }
            } else {
                if (arg2.field2162 != null) {
                    class405.field6092.method166(arg2.field2162);
                    arg2.field2162 = null;
                }
                if (arg2.field2160 != null) {
                    class405.field6092.method166(arg2.field2160);
                    arg2.field2160 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III[B)Ljava/lang/String;")
    public static final String method2680(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field6166;
        char[] var4 = new char[arg0];
        int var5 = 0;
        for (int var6 = 0; var6 < arg0; ++var6) {
            int var7 = 255 & arg3[arg1 + var6];
            if (~var7 != -1) {
                if (~var7 <= -129 && ~var7 > -161) {
                    char var8 = class263.field3829[var7 - 128];
                    if (var8 == 0) {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        if (arg2 != 4238) {
            field6182 = null;
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BI)V")
    public static final void method2681(byte arg0, int arg1) {
        ++field6184;
        class22.method190((byte) -98);
        class325.method2004(22050);
        int var2 = class411.method2673((byte) -87, arg1).field66;
        if (~var2 != -1) {
            int var3 = class192.field2668[arg1];
            if (var2 == 9) {
                class52.field781 = var3;
            }
            if (arg0 >= 25) {
                if (var2 == 6) {
                    class311.field4445 = var3;
                }
                if (~var2 == -6) {
                    class288.field4183 = var3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)V")
    private final void method2682(int arg0) {
        ++field6183;
        int var2 = this.field6186;
        if (~var2 != -3) {
            if (~var2 != -4) {
                if (var2 != 4) {
                    if (~var2 != -6) {
                        if (var2 != 12) {
                            if (var2 != 13) {
                                if (~var2 != -11) {
                                    if (~var2 != -12) {
                                        if (var2 != 6) {
                                            if (var2 != 7) {
                                                if (var2 != 8) {
                                                    if (~var2 != -10) {
                                                        if (~var2 != -15) {
                                                            if (~var2 != -16) {
                                                                if (~var2 == -17) {
                                                                    this.field6173 = 256;
                                                                    this.field6181 = 1;
                                                                    this.field6170 = 1792;
                                                                    this.field6188 = 8192;
                                                                } else {
                                                                    this.field6170 = 0;
                                                                    this.field6181 = 0;
                                                                    this.field6173 = 2048;
                                                                    this.field6188 = 2048;
                                                                }
                                                            } else {
                                                                this.field6173 = 512;
                                                                this.field6170 = 1536;
                                                                this.field6181 = 1;
                                                                this.field6188 = 4096;
                                                            }
                                                        } else {
                                                            this.field6188 = 2048;
                                                            this.field6181 = 1;
                                                            this.field6173 = 768;
                                                            this.field6170 = 1280;
                                                        }
                                                    } else {
                                                        this.field6170 = 1024;
                                                        this.field6173 = 1024;
                                                        this.field6188 = 4096;
                                                        this.field6181 = 3;
                                                    }
                                                } else {
                                                    this.field6181 = 3;
                                                    this.field6173 = 1024;
                                                    this.field6188 = 2048;
                                                    this.field6170 = 1024;
                                                }
                                            } else {
                                                this.field6181 = 3;
                                                this.field6170 = 1280;
                                                this.field6188 = 4096;
                                                this.field6173 = 768;
                                            }
                                        } else {
                                            this.field6173 = 768;
                                            this.field6170 = 1280;
                                            this.field6188 = 2048;
                                            this.field6181 = 3;
                                        }
                                    } else {
                                        this.field6188 = 4096;
                                        this.field6181 = 3;
                                        this.field6170 = 1536;
                                        this.field6173 = 512;
                                    }
                                } else {
                                    this.field6173 = 512;
                                    this.field6181 = 3;
                                    this.field6170 = 1536;
                                    this.field6188 = 2048;
                                }
                            } else {
                                this.field6173 = 2048;
                                this.field6188 = 8192;
                                this.field6170 = 0;
                                this.field6181 = 2;
                            }
                        } else {
                            this.field6188 = 2048;
                            this.field6173 = 2048;
                            this.field6170 = 0;
                            this.field6181 = 2;
                        }
                    } else {
                        this.field6173 = 2048;
                        this.field6181 = 4;
                        this.field6170 = 0;
                        this.field6188 = 8192;
                    }
                } else {
                    this.field6188 = 2048;
                    this.field6181 = 4;
                    this.field6170 = 0;
                    this.field6173 = 2048;
                }
            } else {
                this.field6181 = 1;
                this.field6173 = 2048;
                this.field6170 = 0;
                this.field6188 = 4096;
            }
        } else {
            this.field6173 = 2048;
            this.field6181 = 1;
            this.field6170 = 0;
            this.field6188 = 2048;
        }
        if (arg0 <= 58) {
            this.field6188 = -35;
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
    protected class413() {
        if (class323.field4623 == null) {
            class322.method1994((byte) 117);
        }
        this.method2682(114);
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lil;)V")
    public class413(class265 arg0) {
        if (class323.field4623 == null) {
            class322.method1994((byte) -25);
        }
        this.field6171 = arg0.method1697(66);
        this.field6179 = ~(16 & this.field6171) != -1;
        this.field6168 = (8 & this.field6171) != 0;
        this.field6171 &= 7;
        super.field5994 = arg0.method1685(8104);
        super.field5990 = arg0.method1685(8104);
        super.field5984 = arg0.method1685(8104);
        super.field5991 = arg0.method1697(-80);
        int var2 = super.field5991 * 2 - -1;
        this.field6180 = new short[var2];
        for (int var3 = 0; this.field6180.length > var3; ++var3) {
            short var5 = (short) arg0.method1685(8104);
            int var6 = var5 >>> 8;
            if (~var2 >= ~var6) {
                var6 = var2 + -1;
            }
            int var7 = 255 & var5;
            if (var7 > -var6 + var2) {
                var7 = -var6 + var2;
            }
            this.field6180[var3] = (short) class128.method871(var6 << 8, var7);
        }
        super.field5991 = (super.field5991 << 7) + 64;
        if (class198.field2830 != null) {
            super.field5988 = class198.field2830[arg0.method1685(8104)];
        } else {
            super.field5988 = class300.field4317[class196.method1227((byte) -125, arg0.method1685(8104)) & 65535];
        }
        int var4 = arg0.method1697(-60);
        this.field6186 = var4 & 31;
        this.field6178 = (var4 & 224) << 3;
        if (~this.field6186 != -32) {
            this.method2682(103);
        }
    }
}
