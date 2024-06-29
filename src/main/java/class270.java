import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class270 extends class488 {

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "I")
    public int field3743;

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "Z")
    public boolean field3732;

    @OriginalMember(owner = "client!gb", name = "Q", descriptor = "Z")
    public boolean field3744;

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "[S")
    public short[] field3745;

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "I")
    public int field3741;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "I")
    private int field3734;

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "Lcs;")
    public static class351 field3738 = new class351(0, 7);

    @OriginalMember(owner = "client!gb", name = "S", descriptor = "Lfn;")
    public static class52 field3746 = new class52(49, -2);

    @OriginalMember(owner = "client!gb", name = "T", descriptor = "I")
    public static int field3747 = -1;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "I")
    private int field3731;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "I")
    private int field3737;

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
    private int field3739;

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "I")
    private int field3742;

    @OriginalMember(owner = "client!gb", name = "U", descriptor = "[[B")
    public static byte[][] field3748;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(B)V", line = 5)
    private final void method1686(byte arg0) {
        if (arg0 < 87) {
            field3736 = 13;
        }
        int var2 = this.field3741;
        if (~var2 != -3) {
            if (~var2 != -4) {
                if (var2 != 4) {
                    if (~var2 != -6) {
                        if (var2 != 12) {
                            if (var2 != 13) {
                                if (var2 != 10) {
                                    if (~var2 != -12) {
                                        if (var2 != 6) {
                                            if (~var2 != -8) {
                                                if (var2 != 8) {
                                                    if (var2 != 9) {
                                                        if (var2 != 14) {
                                                            if (var2 != 15) {
                                                                if (~var2 == -17) {
                                                                    this.field3739 = 256;
                                                                    this.field3737 = 1;
                                                                    this.field3731 = 8192;
                                                                    this.field3742 = 1792;
                                                                } else {
                                                                    this.field3731 = 2048;
                                                                    this.field3742 = 0;
                                                                    this.field3739 = 2048;
                                                                    this.field3737 = 0;
                                                                }
                                                            } else {
                                                                this.field3731 = 4096;
                                                                this.field3737 = 1;
                                                                this.field3739 = 512;
                                                                this.field3742 = 1536;
                                                            }
                                                        } else {
                                                            this.field3737 = 1;
                                                            this.field3731 = 2048;
                                                            this.field3742 = 1280;
                                                            this.field3739 = 768;
                                                        }
                                                    } else {
                                                        this.field3737 = 3;
                                                        this.field3731 = 4096;
                                                        this.field3739 = 1024;
                                                        this.field3742 = 1024;
                                                    }
                                                } else {
                                                    this.field3739 = 1024;
                                                    this.field3731 = 2048;
                                                    this.field3742 = 1024;
                                                    this.field3737 = 3;
                                                }
                                            } else {
                                                this.field3739 = 768;
                                                this.field3742 = 1280;
                                                this.field3731 = 4096;
                                                this.field3737 = 3;
                                            }
                                        } else {
                                            this.field3742 = 1280;
                                            this.field3731 = 2048;
                                            this.field3737 = 3;
                                            this.field3739 = 768;
                                        }
                                    } else {
                                        this.field3731 = 4096;
                                        this.field3739 = 512;
                                        this.field3737 = 3;
                                        this.field3742 = 1536;
                                    }
                                } else {
                                    this.field3731 = 2048;
                                    this.field3737 = 3;
                                    this.field3742 = 1536;
                                    this.field3739 = 512;
                                }
                            } else {
                                this.field3742 = 0;
                                this.field3731 = 8192;
                                this.field3737 = 2;
                                this.field3739 = 2048;
                            }
                        } else {
                            this.field3737 = 2;
                            this.field3731 = 2048;
                            this.field3742 = 0;
                            this.field3739 = 2048;
                        }
                    } else {
                        this.field3739 = 2048;
                        this.field3737 = 4;
                        this.field3731 = 8192;
                        this.field3742 = 0;
                    }
                } else {
                    this.field3739 = 2048;
                    this.field3742 = 0;
                    this.field3737 = 4;
                    this.field3731 = 2048;
                }
            } else {
                this.field3739 = 2048;
                this.field3742 = 0;
                this.field3731 = 4096;
                this.field3737 = 1;
            }
        } else {
            this.field3731 = 2048;
            this.field3739 = 2048;
            this.field3737 = 1;
            this.field3742 = 0;
        }
        ++field3740;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)V", line = 206)
    public final void method1687(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3739 = arg4;
        ++field3735;
        this.field3737 = arg2;
        if (arg1 != 9) {
            method1688(true);
        }
        this.field3742 = arg0;
        this.field3731 = arg3;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V", line = 231)
    public static void method1688(boolean arg0) {
        if (arg0) {
            field3747 = 108;
        }
        field3738 = null;
        field3748 = null;
        field3746 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIZ)V", line = 253)
    public final void method1689(int arg0, int arg1, boolean arg2) {
        ++field3733;
        int var4 = 73 / ((-29 - arg0) / 62);
        int var7;
        if (!arg2) {
            int var5 = 2047 & this.field3731 * arg1 / 50 + this.field3734;
            int var6 = this.field3737;
            if (var6 != 1) {
                if (~var6 != -4) {
                    if (var6 != 4) {
                        if (var6 != 2) {
                            if (var6 == 5) {
                                var7 = (var5 >= 1024 ? 2048 - var5 : var5) << 1;
                            } else {
                                var7 = 2048;
                            }
                        } else {
                            var7 = var5;
                        }
                    } else {
                        var7 = var5 >> 10 << 11;
                    }
                } else {
                    var7 = class181.field2625[var5] >> 1;
                }
            } else {
                var7 = 1024 - -(class432.field5955[var5 << 3] >> 5);
            }
        } else {
            var7 = 2048;
        }
        super.field6880 = (float) ((this.field3739 * var7 >> 11) + this.field3742) / 2048.0F;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V", line = 330)
    protected class270() {
        if (class181.field2625 == null) {
            class159.method961(128);
        }
        this.method1686((byte) 92);
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Llk;)V", line = 344)
    public class270(class425 arg0) {
        if (class181.field2625 == null) {
            class159.method961(128);
        }
        this.field3743 = arg0.method2503(true);
        this.field3732 = (16 & this.field3743) != 0;
        this.field3744 = ~(8 & this.field3743) != -1;
        this.field3743 &= 7;
        super.field6883 = arg0.method2508(true);
        super.field6879 = arg0.method2508(true);
        super.field6877 = arg0.method2508(true);
        super.field6878 = arg0.method2503(true);
        int var2 = super.field6878 * 2 + 1;
        this.field3745 = new short[var2];
        for (int var3 = 0; ~var3 > ~this.field3745.length; ++var3) {
            short var5 = (short) arg0.method2508(true);
            int var6 = var5 >>> 8;
            int var7 = 255 & var5;
            if (~var6 <= ~var2) {
                var6 = var2 - 1;
            }
            if (~(var2 - var6) > ~var7) {
                var7 = -var6 + var2;
            }
            this.field3745[var3] = (short) class366.method2215(var7, var6 << 8);
        }
        super.field6878 = (super.field6878 << class259.field3616) - -class411.field5703;
        if (class479.field6783 == null) {
            super.field6886 = class197.field2807[65535 & class314.method1897(-1433933209, arg0.method2508(true))];
        } else {
            super.field6886 = class479.field6783[arg0.method2508(true)];
        }
        int var4 = arg0.method2503(true);
        this.field3741 = var4 & 31;
        this.field3734 = var4 << 3 & 1792;
        if (this.field3741 != 31) {
            this.method1686((byte) 102);
        }
    }
}
