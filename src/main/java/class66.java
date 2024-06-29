import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class66 extends class33 {

    @OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
    public int field750;

    @OriginalMember(owner = "client!fg", name = "Q", descriptor = "Z")
    public boolean field755;

    @OriginalMember(owner = "client!fg", name = "D", descriptor = "Z")
    public boolean field744;

    @OriginalMember(owner = "client!fg", name = "L", descriptor = "[S")
    public short[] field751;

    @OriginalMember(owner = "client!fg", name = "x", descriptor = "I")
    private int field739;

    @OriginalMember(owner = "client!fg", name = "w", descriptor = "I")
    public int field738;

    @OriginalMember(owner = "client!fg", name = "F", descriptor = "[I")
    public static int[] field746 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!fg", name = "H", descriptor = "I")
    public static volatile int field748 = 0;

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!fg", name = "A", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!fg", name = "C", descriptor = "I")
    private int field743;

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!fg", name = "G", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!fg", name = "I", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!fg", name = "M", descriptor = "I")
    private int field752;

    @OriginalMember(owner = "client!fg", name = "O", descriptor = "I")
    private int field754;

    @OriginalMember(owner = "client!fg", name = "R", descriptor = "I")
    private int field756;

    @OriginalMember(owner = "client!fg", name = "N", descriptor = "Ljf;")
    public static class119 field753;

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "Lkh;")
    public static class11 field740;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BIZ)V")
    public final void method392(byte arg0, int arg1, boolean arg2) {
        ++field745;
        int var6;
        if (!arg2) {
            int var4 = 2047 & this.field739 - -(this.field754 * arg1 / 50);
            int var5 = this.field756;
            if (var5 != 1) {
                if (var5 != 3) {
                    if (var5 != 4) {
                        if (var5 != 2) {
                            if (var5 == 5) {
                                var6 = (var4 < 1024 ? var4 : -var4 + 2048) << 1;
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
                    var6 = class450.field6562[var4] >> 1;
                }
            } else {
                var6 = (class286.field4025[var4 << 3] >> 5) + 1024;
            }
        } else {
            var6 = 2048;
        }
        super.field312 = (float) ((this.field743 * var6 >> 11) + this.field752) / 2048.0F;
        int var7 = 71 % ((arg0 - 35) / 60);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIBI)V")
    public final void method393(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        this.field752 = arg2;
        this.field754 = arg0;
        this.field743 = arg1;
        ++field749;
        this.field756 = arg4;
        if (arg3 > -119) {
            method395((byte) 4);
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
    private final void method394(int arg0) {
        int var2 = this.field738;
        if (var2 != 2) {
            if (~var2 != -4) {
                if (~var2 != -5) {
                    if (~var2 != -6) {
                        if (var2 != 12) {
                            if (~var2 != -14) {
                                if (~var2 != -11) {
                                    if (var2 != 11) {
                                        if (~var2 != -7) {
                                            if (~var2 != -8) {
                                                if (~var2 != -9) {
                                                    if (var2 != 9) {
                                                        if (~var2 != -15) {
                                                            if (~var2 != -16) {
                                                                if (~var2 == -17) {
                                                                    this.field754 = 8192;
                                                                    this.field756 = 1;
                                                                    this.field752 = 1792;
                                                                    this.field743 = 256;
                                                                } else {
                                                                    this.field743 = 2048;
                                                                    this.field752 = 0;
                                                                    this.field754 = 2048;
                                                                    this.field756 = 0;
                                                                }
                                                            } else {
                                                                this.field743 = 512;
                                                                this.field752 = 1536;
                                                                this.field756 = 1;
                                                                this.field754 = 4096;
                                                            }
                                                        } else {
                                                            this.field743 = 768;
                                                            this.field754 = 2048;
                                                            this.field756 = 1;
                                                            this.field752 = 1280;
                                                        }
                                                    } else {
                                                        this.field752 = 1024;
                                                        this.field754 = 4096;
                                                        this.field743 = 1024;
                                                        this.field756 = 3;
                                                    }
                                                } else {
                                                    this.field754 = 2048;
                                                    this.field752 = 1024;
                                                    this.field743 = 1024;
                                                    this.field756 = 3;
                                                }
                                            } else {
                                                this.field752 = 1280;
                                                this.field754 = 4096;
                                                this.field756 = 3;
                                                this.field743 = 768;
                                            }
                                        } else {
                                            this.field754 = 2048;
                                            this.field752 = 1280;
                                            this.field743 = 768;
                                            this.field756 = 3;
                                        }
                                    } else {
                                        this.field752 = 1536;
                                        this.field754 = 4096;
                                        this.field743 = 512;
                                        this.field756 = 3;
                                    }
                                } else {
                                    this.field743 = 512;
                                    this.field754 = 2048;
                                    this.field756 = 3;
                                    this.field752 = 1536;
                                }
                            } else {
                                this.field743 = 2048;
                                this.field754 = 8192;
                                this.field752 = 0;
                                this.field756 = 2;
                            }
                        } else {
                            this.field743 = 2048;
                            this.field752 = 0;
                            this.field754 = 2048;
                            this.field756 = 2;
                        }
                    } else {
                        this.field743 = 2048;
                        this.field756 = 4;
                        this.field752 = 0;
                        this.field754 = 8192;
                    }
                } else {
                    this.field754 = 2048;
                    this.field743 = 2048;
                    this.field752 = 0;
                    this.field756 = 4;
                }
            } else {
                this.field752 = 0;
                this.field756 = 1;
                this.field754 = 4096;
                this.field743 = 2048;
            }
        } else {
            this.field752 = 0;
            this.field756 = 1;
            this.field754 = 2048;
            this.field743 = 2048;
        }
        if (arg0 != 23393) {
            field746 = null;
        }
        ++field747;
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(B)V")
    public static void method395(byte arg0) {
        field746 = null;
        field753 = null;
        field740 = null;
        if (arg0 <= 61) {
            field746 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
    protected class66() {
        if (class450.field6562 == null) {
            class242.method1536(-14747);
        }
        this.method394(23393);
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lbk;)V")
    public class66(class211 arg0) {
        if (class450.field6562 == null) {
            class242.method1536(-14747);
        }
        this.field750 = arg0.method1342((byte) -127);
        this.field755 = (this.field750 & 16) != 0;
        this.field744 = ~(this.field750 & 8) != -1;
        this.field750 &= 7;
        super.field309 = arg0.method1355(32136);
        super.field311 = arg0.method1355(32136);
        super.field304 = arg0.method1355(32136);
        super.field307 = arg0.method1342((byte) -128);
        int var2 = super.field307 * 2 - -1;
        this.field751 = new short[var2];
        for (int var3 = 0; this.field751.length > var3; ++var3) {
            short var5 = (short) arg0.method1355(32136);
            int var6 = var5 >>> 8;
            int var7 = var5 & 255;
            if (var2 <= var6) {
                var6 = var2 - 1;
            }
            if (~(-var6 + var2) > ~var7) {
                var7 = -var6 + var2;
            }
            this.field751[var3] = (short) class164.method1059(var6 << 8, var7);
        }
        super.field307 = (super.field307 << 7) + 64;
        if (class262.field3658 == null) {
            super.field305 = class310.field4421[class443.method2742(119, arg0.method1355(32136)) & 65535];
        } else {
            super.field305 = class262.field3658[arg0.method1355(32136)];
        }
        int var4 = arg0.method1342((byte) -127);
        this.field739 = (224 & var4) << 3;
        this.field738 = 31 & var4;
        if (this.field738 != 31) {
            this.method394(23393);
        }
    }
}
