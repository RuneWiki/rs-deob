import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class21 extends class269 {

    @OriginalMember(owner = "client!mp", name = "K", descriptor = "I")
    public int field389;

    @OriginalMember(owner = "client!mp", name = "S", descriptor = "Z")
    public boolean field397;

    @OriginalMember(owner = "client!mp", name = "D", descriptor = "Z")
    public boolean field382;

    @OriginalMember(owner = "client!mp", name = "V", descriptor = "[S")
    public short[] field399;

    @OriginalMember(owner = "client!mp", name = "M", descriptor = "I")
    public int field391;

    @OriginalMember(owner = "client!mp", name = "R", descriptor = "I")
    private int field396;

    @OriginalMember(owner = "client!mp", name = "B", descriptor = "[I")
    public static int[] field380 = new int[50];

    @OriginalMember(owner = "client!mp", name = "L", descriptor = "Ljava/lang/String;")
    public static String field390 = null;

    @OriginalMember(owner = "client!mp", name = "N", descriptor = "J")
    public static long field392 = 0L;

    @OriginalMember(owner = "client!mp", name = "A", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!mp", name = "C", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!mp", name = "E", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!mp", name = "F", descriptor = "I")
    private int field384;

    @OriginalMember(owner = "client!mp", name = "G", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!mp", name = "H", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!mp", name = "I", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!mp", name = "J", descriptor = "I")
    private int field388;

    @OriginalMember(owner = "client!mp", name = "O", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!mp", name = "P", descriptor = "I")
    private int field394;

    @OriginalMember(owner = "client!mp", name = "Q", descriptor = "I")
    private int field395;

    @OriginalMember(owner = "client!mp", name = "T", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(Z)V")
    private final void method272(boolean arg0) {
        if (!arg0) {
            field385 = 35;
        }
        int var2 = this.field391;
        if (~var2 != -3) {
            if (~var2 != -4) {
                if (var2 != 4) {
                    if (~var2 != -6) {
                        if (~var2 != -13) {
                            if (var2 != 13) {
                                if (~var2 != -11) {
                                    if (~var2 != -12) {
                                        if (~var2 != -7) {
                                            if (var2 != 7) {
                                                if (~var2 != -9) {
                                                    if (~var2 != -10) {
                                                        if (var2 != 14) {
                                                            if (~var2 != -16) {
                                                                if (var2 == 16) {
                                                                    this.field395 = 256;
                                                                    this.field388 = 1792;
                                                                    this.field384 = 8192;
                                                                    this.field394 = 1;
                                                                } else {
                                                                    this.field395 = 2048;
                                                                    this.field384 = 2048;
                                                                    this.field394 = 0;
                                                                    this.field388 = 0;
                                                                }
                                                            } else {
                                                                this.field388 = 1536;
                                                                this.field384 = 4096;
                                                                this.field394 = 1;
                                                                this.field395 = 512;
                                                            }
                                                        } else {
                                                            this.field384 = 2048;
                                                            this.field395 = 768;
                                                            this.field394 = 1;
                                                            this.field388 = 1280;
                                                        }
                                                    } else {
                                                        this.field388 = 1024;
                                                        this.field394 = 3;
                                                        this.field384 = 4096;
                                                        this.field395 = 1024;
                                                    }
                                                } else {
                                                    this.field388 = 1024;
                                                    this.field384 = 2048;
                                                    this.field394 = 3;
                                                    this.field395 = 1024;
                                                }
                                            } else {
                                                this.field384 = 4096;
                                                this.field395 = 768;
                                                this.field388 = 1280;
                                                this.field394 = 3;
                                            }
                                        } else {
                                            this.field395 = 768;
                                            this.field394 = 3;
                                            this.field384 = 2048;
                                            this.field388 = 1280;
                                        }
                                    } else {
                                        this.field388 = 1536;
                                        this.field395 = 512;
                                        this.field384 = 4096;
                                        this.field394 = 3;
                                    }
                                } else {
                                    this.field395 = 512;
                                    this.field388 = 1536;
                                    this.field394 = 3;
                                    this.field384 = 2048;
                                }
                            } else {
                                this.field384 = 8192;
                                this.field394 = 2;
                                this.field395 = 2048;
                                this.field388 = 0;
                            }
                        } else {
                            this.field395 = 2048;
                            this.field388 = 0;
                            this.field384 = 2048;
                            this.field394 = 2;
                        }
                    } else {
                        this.field388 = 0;
                        this.field384 = 8192;
                        this.field394 = 4;
                        this.field395 = 2048;
                    }
                } else {
                    this.field395 = 2048;
                    this.field394 = 4;
                    this.field384 = 2048;
                    this.field388 = 0;
                }
            } else {
                this.field394 = 1;
                this.field388 = 0;
                this.field384 = 4096;
                this.field395 = 2048;
            }
        } else {
            this.field394 = 1;
            this.field384 = 2048;
            this.field388 = 0;
            this.field395 = 2048;
        }
        ++field398;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IBZ)V")
    public final void method273(int arg0, byte arg1, boolean arg2) {
        if (arg1 != 8) {
            this.method273(-96, (byte) -118, false);
        }
        ++field386;
        int var4;
        if (arg2) {
            var4 = 2048;
        } else {
            int var5 = this.field384 * arg0 / 50 + this.field396 & 2047;
            int var6 = this.field394;
            if (~var6 != -2) {
                if (~var6 != -4) {
                    if (var6 != 4) {
                        if (var6 != 2) {
                            if (var6 == 5) {
                                var4 = (~var5 > -1025 ? var5 : -var5 + 2048) << 1;
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
                    var4 = class191.field2753[var5] >> 1;
                }
            } else {
                var4 = (class174.field2572[var5 << 3] >> 5) + 1024;
            }
        }
        super.field3623 = (float) ((this.field395 * var4 >> 11) + this.field388) / 2048.0F;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZI)V")
    public static final void method274(boolean arg0, int arg1) {
        class63.field963 = new class410(arg1);
        ++field387;
        if (arg0) {
            field380 = null;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIIII)V")
    public final void method275(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field384 = arg3;
        this.field395 = arg1;
        if (arg4 != -28022) {
            this.field388 = -122;
        }
        this.field388 = arg2;
        ++field379;
        this.field394 = arg0;
    }

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "(B)V")
    public static void method276(byte arg0) {
        field390 = null;
        field380 = null;
        if (arg0 > -8) {
            field385 = 114;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIIIIIIIBI)V")
    public static final void method277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        ++field381;
        if (~arg7 == ~arg9 && ~arg1 == ~arg2 && arg3 == arg6 && ~arg0 == ~arg5) {
            class69.method600(arg4, arg7, arg3, arg5, arg2, (byte) 97);
        } else {
            int var10 = arg7;
            int var11 = arg2;
            int var12 = arg7 * 3;
            int var13 = arg2 * 3;
            int var14 = arg9 * 3;
            int var15 = arg1 * 3;
            int var16 = arg6 * 3;
            int var17 = arg0 * 3;
            int var18 = -arg7 + var14 + -var16 + arg3;
            int var19 = -arg2 + arg5 + -var17 + var15;
            int var20 = -var14 + var12 + var16 - var14;
            int var21 = -var15 + var13 + -var15 + var17;
            int var22 = -var12 + var14;
            int var23 = -var13 + var15;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var26 = var24 * var24 >> 12;
                int var27 = var24 * var26 >> 12;
                int var28 = var18 * var27;
                int var29 = var19 * var27;
                int var30 = var20 * var26;
                int var31 = var21 * var26;
                int var32 = var22 * var24;
                int var33 = var23 * var24;
                int var34 = arg7 - -(var28 - -var30 + var32 >> 12);
                int var35 = arg2 - -(var29 + var31 + var33 >> 12);
                class69.method600(arg4, var10, var34, var35, var11, (byte) -37);
                var10 = var34;
                var11 = var35;
            }
        }
        int var25 = 20 % ((-50 - arg8) / 63);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILsb;B)V")
    public static final void method278(int arg0, class362 arg1, byte arg2) {
        ++field383;
        int var3 = -84 / ((-25 - arg2) / 34);
        int var4 = -1;
        int var5 = 0;
        if (~arg1.field4940 >= ~class414.field5793) {
            if (class414.field5793 > arg1.field4986) {
                class200.method1413(arg1, (byte) -115, false);
                var4 = class269.field3616;
                var5 = class59.field932;
            } else {
                class185.method1350(arg1, -24589);
            }
        } else {
            class370.method2308((byte) 112, arg1);
        }
        if (arg1.field3176 < 128 || arg1.field3167 < 128 || ~((class116.field1621 - 1) * 128) >= ~arg1.field3176 || ~arg1.field3167 <= ~((class385.field5425 + -1) * 128)) {
            arg1.field4974 = -1;
            arg1.field4986 = 0;
            arg1.field4940 = 0;
            arg1.field4980 = -1;
            arg1.field3176 = arg1.field5005[0] * 128 + arg1.method2146(-124) * 64;
            arg1.field3167 = arg1.field4998[0] * 128 + 64 * arg1.method2146(21);
            arg1.method2278(0);
        }
        if (class95.field1379 == arg1 && (~arg1.field3176 > -1537 || ~arg1.field3167 > -1537 || ~arg1.field3176 <= ~((class116.field1621 + -12) * 128) || ~((class385.field5425 + -12) * 128) >= ~arg1.field3167)) {
            arg1.field4980 = -1;
            arg1.field4974 = -1;
            arg1.field4940 = 0;
            arg1.field4986 = 0;
            arg1.field3176 = arg1.field5005[0] * 128 + arg1.method2146(17) * 64;
            arg1.field3167 = arg1.field4998[0] * 128 + 64 * arg1.method2146(-120);
            arg1.method2278(0);
        }
        int var6 = class264.method1698(arg1, -69);
        class329.method2090(var6, false, var4, var5, arg1);
        class315.method2006((byte) 70, arg1);
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "()V")
    protected class21() {
        if (class191.field2753 == null) {
            class346.method2188((byte) -125);
        }
        this.method272(true);
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lap;)V")
    public class21(class289 arg0) {
        if (class191.field2753 == null) {
            class346.method2188((byte) -106);
        }
        this.field389 = arg0.method1861((byte) -72);
        this.field397 = (this.field389 & 8) != 0;
        this.field382 = (this.field389 & 16) != 0;
        this.field389 &= 7;
        super.field3618 = arg0.method1853(114);
        super.field3620 = arg0.method1853(119);
        super.field3622 = arg0.method1853(-44);
        super.field3625 = arg0.method1861((byte) -72);
        int var2 = super.field3625 * 2 + 1;
        this.field399 = new short[var2];
        for (int var3 = 0; ~this.field399.length < ~var3; ++var3) {
            short var5 = (short) arg0.method1853(118);
            int var6 = var5 >>> 8;
            if (var6 >= var2) {
                var6 = var2 + -1;
            }
            int var7 = 255 & var5;
            if (~(-var6 + var2) > ~var7) {
                var7 = -var6 + var2;
            }
            this.field399[var3] = (short) class260.method1678(var6 << 8, var7);
        }
        super.field3625 = (super.field3625 << 7) + 64;
        if (class193.field2775 == null) {
            super.field3624 = class417.field5848[class40.method394((byte) 65, arg0.method1853(-103)) & 65535];
        } else {
            super.field3624 = class193.field2775[arg0.method1853(-123)];
        }
        int var4 = arg0.method1861((byte) -72);
        this.field391 = var4 & 31;
        this.field396 = var4 << 3 & 1792;
        if (this.field391 != 31) {
            this.method272(true);
        }
    }
}
