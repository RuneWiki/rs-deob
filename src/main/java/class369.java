import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class369 extends class62 {

    @OriginalMember(owner = "client!sk", name = "H", descriptor = "I")
    public int field5600;

    @OriginalMember(owner = "client!sk", name = "Q", descriptor = "Z")
    public boolean field5609;

    @OriginalMember(owner = "client!sk", name = "A", descriptor = "Z")
    public boolean field5594;

    @OriginalMember(owner = "client!sk", name = "J", descriptor = "[S")
    public short[] field5602;

    @OriginalMember(owner = "client!sk", name = "L", descriptor = "I")
    private int field5604;

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "I")
    public int field5593;

    @OriginalMember(owner = "client!sk", name = "D", descriptor = "[I")
    public static int[] field5597 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!sk", name = "P", descriptor = "[I")
    public static int[] field5608 = new int[64];

    @OriginalMember(owner = "client!sk", name = "N", descriptor = "I")
    public static int field5606 = -13423323;

    @OriginalMember(owner = "client!sk", name = "S", descriptor = "Lal;")
    public static class52 field5611 = new class52(64);

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "I")
    private int field5592;

    @OriginalMember(owner = "client!sk", name = "B", descriptor = "I")
    private int field5595;

    @OriginalMember(owner = "client!sk", name = "F", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!sk", name = "G", descriptor = "I")
    private int field5599;

    @OriginalMember(owner = "client!sk", name = "I", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!sk", name = "K", descriptor = "I")
    private int field5603;

    @OriginalMember(owner = "client!sk", name = "M", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!sk", name = "O", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!sk", name = "R", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!sk", name = "U", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!sk", name = "W", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!sk", name = "V", descriptor = "Lne;")
    public static class172 field5614;

    @OriginalMember(owner = "client!sk", name = "T", descriptor = "Lgl;")
    public static class356 field5612;

    @OriginalMember(owner = "client!sk", name = "C", descriptor = "[I")
    public static int[] field5596;

    @OriginalMember(owner = "client!sk", name = "X", descriptor = "[[[B")
    public static byte[][][] field5616;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IBIII)V")
    public final void method2370(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        this.field5599 = arg2;
        this.field5592 = arg0;
        this.field5595 = arg3;
        this.field5603 = arg4;
        if (arg1 == -29) {
            ++field5601;
        }
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)V")
    public static final void method2371(int arg0) {
        class52 var1 = class216.field3527;
        synchronized (class216.field3527) {
            class216.field3527.method336(103);
        }
        int var2 = 65 % ((33 - arg0) / 52);
        ++field5598;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BIZ)V")
    public final void method2372(byte arg0, int arg1, boolean arg2) {
        ++field5607;
        int var6;
        if (!arg2) {
            int var4 = 2047 & this.field5592 * arg1 / 50 + this.field5604;
            int var5 = this.field5603;
            if (var5 != 1) {
                if (~var5 != -4) {
                    if (~var5 != -5) {
                        if (var5 != 2) {
                            if (~var5 == -6) {
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
                    var6 = class50.field622[var4] >> 1;
                }
            } else {
                var6 = 1024 - -(class258.field4177[var4 << 3] >> 5);
            }
        } else {
            var6 = 2048;
        }
        int var7 = 81 / ((-21 - arg0) / 61);
        super.field806 = (float) ((this.field5599 * var6 >> 11) + this.field5595) / 2048.0F;
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)V")
    private final void method2373(byte arg0) {
        if (arg0 == 92) {
            int var2 = this.field5593;
            if (var2 != 2) {
                if (~var2 != -4) {
                    if (~var2 != -5) {
                        if (~var2 != -6) {
                            if (var2 != 12) {
                                if (~var2 != -14) {
                                    if (~var2 != -11) {
                                        if (~var2 != -12) {
                                            if (~var2 != -7) {
                                                if (~var2 != -8) {
                                                    if (~var2 != -9) {
                                                        if (~var2 != -10) {
                                                            if (~var2 != -15) {
                                                                if (~var2 != -16) {
                                                                    if (var2 == 16) {
                                                                        this.field5599 = 256;
                                                                        this.field5592 = 8192;
                                                                        this.field5603 = 1;
                                                                        this.field5595 = 1792;
                                                                    } else {
                                                                        this.field5592 = 2048;
                                                                        this.field5603 = 0;
                                                                        this.field5599 = 2048;
                                                                        this.field5595 = 0;
                                                                    }
                                                                } else {
                                                                    this.field5592 = 4096;
                                                                    this.field5595 = 1536;
                                                                    this.field5603 = 1;
                                                                    this.field5599 = 512;
                                                                }
                                                            } else {
                                                                this.field5599 = 768;
                                                                this.field5603 = 1;
                                                                this.field5595 = 1280;
                                                                this.field5592 = 2048;
                                                            }
                                                        } else {
                                                            this.field5599 = 1024;
                                                            this.field5595 = 1024;
                                                            this.field5592 = 4096;
                                                            this.field5603 = 3;
                                                        }
                                                    } else {
                                                        this.field5599 = 1024;
                                                        this.field5592 = 2048;
                                                        this.field5595 = 1024;
                                                        this.field5603 = 3;
                                                    }
                                                } else {
                                                    this.field5592 = 4096;
                                                    this.field5595 = 1280;
                                                    this.field5603 = 3;
                                                    this.field5599 = 768;
                                                }
                                            } else {
                                                this.field5592 = 2048;
                                                this.field5599 = 768;
                                                this.field5595 = 1280;
                                                this.field5603 = 3;
                                            }
                                        } else {
                                            this.field5595 = 1536;
                                            this.field5599 = 512;
                                            this.field5603 = 3;
                                            this.field5592 = 4096;
                                        }
                                    } else {
                                        this.field5599 = 512;
                                        this.field5592 = 2048;
                                        this.field5595 = 1536;
                                        this.field5603 = 3;
                                    }
                                } else {
                                    this.field5603 = 2;
                                    this.field5592 = 8192;
                                    this.field5599 = 2048;
                                    this.field5595 = 0;
                                }
                            } else {
                                this.field5592 = 2048;
                                this.field5599 = 2048;
                                this.field5603 = 2;
                                this.field5595 = 0;
                            }
                        } else {
                            this.field5603 = 4;
                            this.field5592 = 8192;
                            this.field5595 = 0;
                            this.field5599 = 2048;
                        }
                    } else {
                        this.field5599 = 2048;
                        this.field5603 = 4;
                        this.field5595 = 0;
                        this.field5592 = 2048;
                    }
                } else {
                    this.field5599 = 2048;
                    this.field5595 = 0;
                    this.field5603 = 1;
                    this.field5592 = 4096;
                }
            } else {
                this.field5595 = 0;
                this.field5599 = 2048;
                this.field5603 = 1;
                this.field5592 = 2048;
            }
            ++field5605;
        }
    }

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "(I)V")
    public static void method2374(int arg0) {
        field5616 = null;
        field5614 = null;
        field5596 = null;
        field5612 = null;
        field5608 = null;
        field5611 = null;
        if (arg0 != -13423323) {
            method2374(31);
        }
        field5597 = null;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V")
    protected class369() {
        if (class50.field622 == null) {
            class107.method806(-90);
        }
        this.method2373((byte) 92);
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Ljg;)V")
    public class369(class186 arg0) {
        if (class50.field622 == null) {
            class107.method806(-69);
        }
        this.field5600 = arg0.method1322(false);
        this.field5609 = ~(this.field5600 & 16) != -1;
        this.field5594 = (8 & this.field5600) != 0;
        this.field5600 &= 7;
        super.field812 = arg0.method1272((byte) -120);
        super.field809 = arg0.method1272((byte) -106);
        super.field805 = arg0.method1272((byte) -73);
        super.field810 = arg0.method1322(false);
        int var2 = super.field810 * 2 + 1;
        this.field5602 = new short[var2];
        for (int var3 = 0; var3 < this.field5602.length; ++var3) {
            short var5 = (short) arg0.method1272((byte) -75);
            int var6 = var5 >>> 8;
            int var7 = 255 & var5;
            if (~var6 <= ~var2) {
                var6 = var2 + -1;
            }
            if (~var7 < ~(var2 - var6)) {
                var7 = -var6 + var2;
            }
            this.field5602[var3] = (short) class35.method227(var6 << 8, var7);
        }
        super.field810 = (super.field810 << 7) - -64;
        if (class36.field441 != null) {
            super.field808 = class36.field441[arg0.method1272((byte) -48)];
        } else {
            super.field808 = class62.field814[65535 & class99.method747(arg0.method1272((byte) -87), -9560)];
        }
        int var4 = arg0.method1322(false);
        this.field5604 = (224 & var4) << 3;
        this.field5593 = var4 & 31;
        if (this.field5593 != 31) {
            this.method2373((byte) 92);
        }
    }
}
