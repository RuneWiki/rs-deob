import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class87 extends class104 {

    @OriginalMember(owner = "client!fq", name = "H", descriptor = "I")
    public int field1226;

    @OriginalMember(owner = "client!fq", name = "E", descriptor = "Z")
    public boolean field1223;

    @OriginalMember(owner = "client!fq", name = "O", descriptor = "Z")
    public boolean field1233;

    @OriginalMember(owner = "client!fq", name = "J", descriptor = "[S")
    public short[] field1228;

    @OriginalMember(owner = "client!fq", name = "K", descriptor = "I")
    private int field1229;

    @OriginalMember(owner = "client!fq", name = "M", descriptor = "I")
    public int field1231;

    @OriginalMember(owner = "client!fq", name = "A", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!fq", name = "C", descriptor = "I")
    private int field1221;

    @OriginalMember(owner = "client!fq", name = "D", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!fq", name = "F", descriptor = "I")
    private int field1224;

    @OriginalMember(owner = "client!fq", name = "G", descriptor = "I")
    private int field1225;

    @OriginalMember(owner = "client!fq", name = "I", descriptor = "I")
    private int field1227;

    @OriginalMember(owner = "client!fq", name = "L", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!fq", name = "N", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IBZ)V", line = 7)
    public final void method733(int arg0, byte arg1, boolean arg2) {
        ++field1232;
        int var6;
        if (!arg2) {
            int var4 = 2047 & this.field1229 - -(this.field1225 * arg0 / 50);
            int var5 = this.field1227;
            if (~var5 != -2) {
                if (var5 != 3) {
                    if (~var5 != -5) {
                        if (var5 != 2) {
                            if (~var5 == -6) {
                                var6 = (var4 >= 1024 ? -var4 + 2048 : var4) << 1;
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
                    var6 = class18.field194[var4] >> 1;
                }
            } else {
                var6 = (class319.field4501[var4 << 3] >> 5) + 1024;
            }
        } else {
            var6 = 2048;
        }
        super.field1460 = (float) ((this.field1221 * var6 >> 11) + this.field1224) / 2048.0F;
        int var7 = 49 % ((arg1 - 20) / 36);
    }

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "(I)V", line = 81)
    private final void method734(int arg0) {
        int var2 = this.field1231;
        if (~var2 != -3) {
            if (var2 != 3) {
                if (~var2 != -5) {
                    if (~var2 != -6) {
                        if (var2 != 12) {
                            if (var2 != 13) {
                                if (~var2 != -11) {
                                    if (~var2 != -12) {
                                        if (var2 != 6) {
                                            if (~var2 != -8) {
                                                if (var2 != 8) {
                                                    if (var2 != 9) {
                                                        if (var2 != 14) {
                                                            if (var2 != 15) {
                                                                if (var2 == 16) {
                                                                    this.field1227 = 1;
                                                                    this.field1221 = 256;
                                                                    this.field1224 = 1792;
                                                                    this.field1225 = 8192;
                                                                } else {
                                                                    this.field1227 = 0;
                                                                    this.field1221 = 2048;
                                                                    this.field1225 = 2048;
                                                                    this.field1224 = 0;
                                                                }
                                                            } else {
                                                                this.field1224 = 1536;
                                                                this.field1227 = 1;
                                                                this.field1225 = 4096;
                                                                this.field1221 = 512;
                                                            }
                                                        } else {
                                                            this.field1227 = 1;
                                                            this.field1224 = 1280;
                                                            this.field1225 = 2048;
                                                            this.field1221 = 768;
                                                        }
                                                    } else {
                                                        this.field1227 = 3;
                                                        this.field1225 = 4096;
                                                        this.field1224 = 1024;
                                                        this.field1221 = 1024;
                                                    }
                                                } else {
                                                    this.field1225 = 2048;
                                                    this.field1221 = 1024;
                                                    this.field1224 = 1024;
                                                    this.field1227 = 3;
                                                }
                                            } else {
                                                this.field1227 = 3;
                                                this.field1225 = 4096;
                                                this.field1221 = 768;
                                                this.field1224 = 1280;
                                            }
                                        } else {
                                            this.field1221 = 768;
                                            this.field1224 = 1280;
                                            this.field1227 = 3;
                                            this.field1225 = 2048;
                                        }
                                    } else {
                                        this.field1227 = 3;
                                        this.field1225 = 4096;
                                        this.field1224 = 1536;
                                        this.field1221 = 512;
                                    }
                                } else {
                                    this.field1221 = 512;
                                    this.field1225 = 2048;
                                    this.field1227 = 3;
                                    this.field1224 = 1536;
                                }
                            } else {
                                this.field1221 = 2048;
                                this.field1224 = 0;
                                this.field1227 = 2;
                                this.field1225 = 8192;
                            }
                        } else {
                            this.field1221 = 2048;
                            this.field1225 = 2048;
                            this.field1224 = 0;
                            this.field1227 = 2;
                        }
                    } else {
                        this.field1224 = 0;
                        this.field1225 = 8192;
                        this.field1227 = 4;
                        this.field1221 = 2048;
                    }
                } else {
                    this.field1225 = 2048;
                    this.field1221 = 2048;
                    this.field1227 = 4;
                    this.field1224 = 0;
                }
            } else {
                this.field1221 = 2048;
                this.field1224 = 0;
                this.field1225 = 4096;
                this.field1227 = 1;
            }
        } else {
            this.field1221 = 2048;
            this.field1225 = 2048;
            this.field1224 = 0;
            this.field1227 = 1;
        }
        if (arg0 <= 100) {
            this.field1233 = true;
        }
        ++field1230;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(BIIII)V", line = 292)
    public final void method735(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1227 = arg1;
        this.field1221 = arg2;
        this.field1224 = arg4;
        ++field1220;
        if (arg0 == -36) {
            this.field1225 = arg3;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIIIZ)V", line = 306)
    public static final void method736(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field1222;
        if (class369.method2261(0, arg2)) {
            class24.method169(arg0, arg1, -1, arg4, (byte) -74, class263.field3787[arg2]);
            int var5 = -84 / ((arg3 - -11) / 55);
        }
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "()V", line = 320)
    protected class87() {
        if (class18.field194 == null) {
            class38.method238(-106);
        }
        this.method734(105);
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lkk;)V", line = 335)
    public class87(class161 arg0) {
        if (class18.field194 == null) {
            class38.method238(-90);
        }
        this.field1226 = arg0.method1172((byte) -127);
        this.field1223 = (this.field1226 & 8) != 0;
        this.field1233 = ~(16 & this.field1226) != -1;
        this.field1226 &= 7;
        super.field1466 = arg0.method1134(-16848);
        super.field1461 = arg0.method1134(-16848);
        super.field1465 = arg0.method1134(-16848);
        super.field1467 = arg0.method1172((byte) -22);
        int var2 = super.field1467 * 2 - -1;
        this.field1228 = new short[var2];
        for (int var3 = 0; this.field1228.length > var3; ++var3) {
            short var5 = (short) arg0.method1134(-16848);
            int var6 = var5 >>> 8;
            int var7 = 255 & var5;
            if (~var2 >= ~var6) {
                var6 = var2 - 1;
            }
            if (-var6 + var2 < var7) {
                var7 = var2 - var6;
            }
            this.field1228[var3] = (short) class142.method1024(var6 << 8, var7);
        }
        super.field1467 = (super.field1467 << class380.field5232) + class289.field4100;
        if (class439.field6229 == null) {
            super.field1464 = class21.field227[class487.method2868(88, arg0.method1134(-16848)) & 65535];
        } else {
            super.field1464 = class439.field6229[arg0.method1134(-16848)];
        }
        int var4 = arg0.method1172((byte) -24);
        this.field1229 = 1792 & var4 << 3;
        this.field1231 = 31 & var4;
        if (this.field1231 != 31) {
            this.method734(102);
        }
    }
}
