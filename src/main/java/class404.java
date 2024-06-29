import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class404 extends class24 {

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
    public int field5744;

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "Z")
    public boolean field5738;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "Z")
    public boolean field5725;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "[S")
    public short[] field5741;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
    public int field5739;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
    private int field5727;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    public static int field5732 = 0;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
    public static int field5737 = 0;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "[Ljm;")
    public static class411[] field5736 = new class411[14];

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
    private int field5731;

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "I")
    private int field5733;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "I")
    private int field5734;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
    private int field5742;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)V")
    public static final void method2530(byte arg0) {
        ++field5743;
        if (arg0 == -105) {
            class341.field4664.method120(class279.field3917, !class54.field755 ? -1 : class214.field2992 - -256);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILms;)V")
    public static final void method2531(int arg0, class453 arg1) {
        if (class2.field24 == arg1.field6315) {
            class377.field5395[arg1.field6319] = true;
        }
        ++field5729;
        if (arg0 != 26878) {
            field5736 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(III)I")
    public static final int method2532(int arg0, int arg1, int arg2) {
        ++field5728;
        int var3 = -128 + class446.method2779(99, arg1 + 91923, arg2 + 45365, 4) + (-128 + class446.method2779(-126, arg1 + 37821, arg2 - -10294, 2) >> 1) + (class446.method2779(-120, arg1, arg2, 1) + -128 >> 2);
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (arg0 != 2048) {
            field5736 = null;
        }
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V")
    public static void method2533(int arg0) {
        field5736 = null;
        if (arg0 != 3) {
            field5736 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(III)V")
    public static final void method2534(int arg0, int arg1, int arg2) {
        class125 var3 = class328.field4549[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field1739 != null) {
                var3.field1739 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZII)V")
    public final void method2535(boolean arg0, int arg1, int arg2) {
        ++field5740;
        int var4;
        if (arg0) {
            var4 = 2048;
        } else {
            int var5 = 2047 & this.field5742 * arg2 / 50 + this.field5727;
            int var6 = this.field5733;
            if (~var6 != -2) {
                if (var6 != 3) {
                    if (var6 != 4) {
                        if (var6 != 2) {
                            if (~var6 == -6) {
                                var4 = (~var5 > -1025 ? var5 : 2048 - var5) << 1;
                            } else {
                                var4 = 2048;
                            }
                        } else {
                            var4 = var5;
                        }
                    } else {
                        var4 = var5 >> 10 << 11;
                    }
                } else {
                    var4 = class304.field4195[var5] >> 1;
                }
            } else {
                var4 = (class133.field1913[var5 << 3] >> 5) + 1024;
            }
        }
        if (arg1 != 1076464939) {
            field5737 = -49;
        }
        super.field412 = (float) ((this.field5734 * var4 >> 11) + this.field5731) / 2048.0F;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIII)V")
    public final void method2536(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5735;
        this.field5733 = arg0;
        this.field5734 = arg1;
        this.field5742 = arg2;
        if (arg3 != -15432) {
            this.field5734 = 6;
        }
        this.field5731 = arg4;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5726;
        int var7 = class302.method1951(class290.field4058, 0, arg1, class442.field6212);
        int var8 = class302.method1951(class290.field4058, 0, arg6, class442.field6212);
        int var9 = class302.method1951(class154.field2161, 0, arg4, class233.field3350);
        int var10 = class302.method1951(class154.field2161, 0, arg5, class233.field3350);
        int var11 = class302.method1951(class290.field4058, 0, arg1 + arg2, class442.field6212);
        int var12 = class302.method1951(class290.field4058, 0, arg6 - arg2, class442.field6212);
        for (int var13 = var7; var11 > var13; ++var13) {
            class295.method1924(3289650, class296.field4138[var13], var10, arg0, var9);
        }
        if (arg3 == -32464) {
            for (int var14 = var8; var14 > var12; --var14) {
                class295.method1924(3289650, class296.field4138[var14], var10, arg0, var9);
            }
            int var15 = class302.method1951(class154.field2161, 0, arg2 + arg4, class233.field3350);
            int var16 = class302.method1951(class154.field2161, arg3 ^ -32464, -arg2 + arg5, class233.field3350);
            for (int var17 = var11; ~var12 <= ~var17; ++var17) {
                int[] var18 = class296.field4138[var17];
                class295.method1924(3289650, var18, var15, arg0, var9);
                class295.method1924(arg3 + 3322114, var18, var10, arg0, var16);
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
    protected class404() {
        if (class304.field4195 == null) {
            class410.method2570(32299);
        }
        this.method2538(32261);
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V")
    private final void method2538(int arg0) {
        ++field5730;
        if (arg0 != 32261) {
            method2530((byte) -48);
        }
        int var2 = this.field5739;
        if (~var2 != -3) {
            if (var2 != 3) {
                if (var2 != 4) {
                    if (~var2 != -6) {
                        if (~var2 != -13) {
                            if (var2 != 13) {
                                if (var2 != 10) {
                                    if (var2 != 11) {
                                        if (var2 != 6) {
                                            if (var2 != 7) {
                                                if (~var2 != -9) {
                                                    if (var2 != 9) {
                                                        if (~var2 != -15) {
                                                            if (var2 != 15) {
                                                                if (var2 == 16) {
                                                                    this.field5742 = 8192;
                                                                    this.field5734 = 256;
                                                                    this.field5731 = 1792;
                                                                    this.field5733 = 1;
                                                                } else {
                                                                    this.field5742 = 2048;
                                                                    this.field5731 = 0;
                                                                    this.field5734 = 2048;
                                                                    this.field5733 = 0;
                                                                }
                                                            } else {
                                                                this.field5733 = 1;
                                                                this.field5734 = 512;
                                                                this.field5742 = 4096;
                                                                this.field5731 = 1536;
                                                            }
                                                        } else {
                                                            this.field5733 = 1;
                                                            this.field5742 = 2048;
                                                            this.field5731 = 1280;
                                                            this.field5734 = 768;
                                                        }
                                                    } else {
                                                        this.field5733 = 3;
                                                        this.field5734 = 1024;
                                                        this.field5742 = 4096;
                                                        this.field5731 = 1024;
                                                    }
                                                } else {
                                                    this.field5731 = 1024;
                                                    this.field5733 = 3;
                                                    this.field5734 = 1024;
                                                    this.field5742 = 2048;
                                                }
                                            } else {
                                                this.field5731 = 1280;
                                                this.field5733 = 3;
                                                this.field5742 = 4096;
                                                this.field5734 = 768;
                                            }
                                        } else {
                                            this.field5733 = 3;
                                            this.field5731 = 1280;
                                            this.field5742 = 2048;
                                            this.field5734 = 768;
                                        }
                                    } else {
                                        this.field5733 = 3;
                                        this.field5742 = 4096;
                                        this.field5731 = 1536;
                                        this.field5734 = 512;
                                    }
                                } else {
                                    this.field5734 = 512;
                                    this.field5731 = 1536;
                                    this.field5733 = 3;
                                    this.field5742 = 2048;
                                }
                            } else {
                                this.field5733 = 2;
                                this.field5734 = 2048;
                                this.field5742 = 8192;
                                this.field5731 = 0;
                            }
                        } else {
                            this.field5733 = 2;
                            this.field5734 = 2048;
                            this.field5731 = 0;
                            this.field5742 = 2048;
                        }
                    } else {
                        this.field5742 = 8192;
                        this.field5734 = 2048;
                        this.field5733 = 4;
                        this.field5731 = 0;
                    }
                } else {
                    this.field5742 = 2048;
                    this.field5731 = 0;
                    this.field5733 = 4;
                    this.field5734 = 2048;
                }
            } else {
                this.field5733 = 1;
                this.field5731 = 0;
                this.field5734 = 2048;
                this.field5742 = 4096;
            }
        } else {
            this.field5734 = 2048;
            this.field5733 = 1;
            this.field5742 = 2048;
            this.field5731 = 0;
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lkh;)V")
    public class404(class11 arg0) {
        if (class304.field4195 == null) {
            class410.method2570(32299);
        }
        this.field5744 = arg0.method172((byte) 52);
        this.field5738 = (8 & this.field5744) != 0;
        this.field5725 = ~(16 & this.field5744) != -1;
        this.field5744 &= 7;
        super.field407 = arg0.method174(255);
        super.field408 = arg0.method174(255);
        super.field409 = arg0.method174(255);
        super.field411 = arg0.method172((byte) 52);
        int var2 = super.field411 * 2 + 1;
        this.field5741 = new short[var2];
        for (int var3 = 0; this.field5741.length > var3; ++var3) {
            short var5 = (short) arg0.method174(255);
            int var6 = var5 >>> 8;
            int var7 = var5 & 255;
            if (var6 >= var2) {
                var6 = var2 + -1;
            }
            if (~var7 < ~(-var6 + var2)) {
                var7 = -var6 + var2;
            }
            this.field5741[var3] = (short) class393.method2487(var6 << 8, var7);
        }
        super.field411 = (super.field411 << 7) - -64;
        if (class128.field1805 != null) {
            super.field413 = class128.field1805[arg0.method174(255)];
        } else {
            super.field413 = class15.field288[class194.method1257(23213, arg0.method174(255)) & 65535];
        }
        int var4 = arg0.method172((byte) 52);
        this.field5739 = 31 & var4;
        this.field5727 = (224 & var4) << 3;
        if (this.field5739 != 31) {
            this.method2538(32261);
        }
    }
}
