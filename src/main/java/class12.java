import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class12 extends class397 {

    @OriginalMember(owner = "client!qk", name = "R", descriptor = "I")
    public int field167;

    @OriginalMember(owner = "client!qk", name = "F", descriptor = "Z")
    public boolean field155;

    @OriginalMember(owner = "client!qk", name = "L", descriptor = "Z")
    public boolean field161;

    @OriginalMember(owner = "client!qk", name = "N", descriptor = "[S")
    public short[] field163;

    @OriginalMember(owner = "client!qk", name = "O", descriptor = "I")
    public int field164;

    @OriginalMember(owner = "client!qk", name = "Q", descriptor = "I")
    private int field166;

    @OriginalMember(owner = "client!qk", name = "K", descriptor = "Llg;")
    public static class237 field160 = new class237(64);

    @OriginalMember(owner = "client!qk", name = "C", descriptor = "I")
    private int field152;

    @OriginalMember(owner = "client!qk", name = "D", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!qk", name = "E", descriptor = "I")
    private int field154;

    @OriginalMember(owner = "client!qk", name = "G", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!qk", name = "H", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!qk", name = "I", descriptor = "I")
    private int field158;

    @OriginalMember(owner = "client!qk", name = "J", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!qk", name = "M", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!qk", name = "P", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!qk", name = "S", descriptor = "I")
    private int field168;

    @OriginalMember(owner = "client!qk", name = "T", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!qk", name = "U", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!qk", name = "V", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)I")
    public static final int method84(int arg0, byte arg1) {
        ++field156;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        if (arg1 != 40) {
            return -7;
        } else {
            int var3 = arg0 * 6 + -61440;
            int var4 = (arg0 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BIIII)V")
    public final void method85(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field152 = arg2;
        ++field153;
        this.field168 = arg1;
        this.field154 = arg3;
        int var6 = -92 / ((arg0 - -5) / 56);
        this.field158 = arg4;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(Z)V")
    private final void method86(boolean arg0) {
        int var2 = this.field164;
        if (~var2 != -3) {
            if (~var2 != -4) {
                if (~var2 != -5) {
                    if (~var2 != -6) {
                        if (~var2 != -13) {
                            if (var2 != 13) {
                                if (var2 != 10) {
                                    if (~var2 != -12) {
                                        if (var2 != 6) {
                                            if (~var2 != -8) {
                                                if (var2 != 8) {
                                                    if (~var2 != -10) {
                                                        if (var2 != 14) {
                                                            if (var2 != 15) {
                                                                if (var2 == 16) {
                                                                    this.field158 = 256;
                                                                    this.field168 = 8192;
                                                                    this.field154 = 1792;
                                                                    this.field152 = 1;
                                                                } else {
                                                                    this.field168 = 2048;
                                                                    this.field152 = 0;
                                                                    this.field154 = 0;
                                                                    this.field158 = 2048;
                                                                }
                                                            } else {
                                                                this.field168 = 4096;
                                                                this.field152 = 1;
                                                                this.field154 = 1536;
                                                                this.field158 = 512;
                                                            }
                                                        } else {
                                                            this.field168 = 2048;
                                                            this.field158 = 768;
                                                            this.field154 = 1280;
                                                            this.field152 = 1;
                                                        }
                                                    } else {
                                                        this.field154 = 1024;
                                                        this.field168 = 4096;
                                                        this.field158 = 1024;
                                                        this.field152 = 3;
                                                    }
                                                } else {
                                                    this.field154 = 1024;
                                                    this.field152 = 3;
                                                    this.field158 = 1024;
                                                    this.field168 = 2048;
                                                }
                                            } else {
                                                this.field152 = 3;
                                                this.field158 = 768;
                                                this.field168 = 4096;
                                                this.field154 = 1280;
                                            }
                                        } else {
                                            this.field152 = 3;
                                            this.field154 = 1280;
                                            this.field158 = 768;
                                            this.field168 = 2048;
                                        }
                                    } else {
                                        this.field158 = 512;
                                        this.field168 = 4096;
                                        this.field154 = 1536;
                                        this.field152 = 3;
                                    }
                                } else {
                                    this.field158 = 512;
                                    this.field168 = 2048;
                                    this.field152 = 3;
                                    this.field154 = 1536;
                                }
                            } else {
                                this.field152 = 2;
                                this.field154 = 0;
                                this.field168 = 8192;
                                this.field158 = 2048;
                            }
                        } else {
                            this.field158 = 2048;
                            this.field154 = 0;
                            this.field168 = 2048;
                            this.field152 = 2;
                        }
                    } else {
                        this.field152 = 4;
                        this.field154 = 0;
                        this.field168 = 8192;
                        this.field158 = 2048;
                    }
                } else {
                    this.field158 = 2048;
                    this.field168 = 2048;
                    this.field154 = 0;
                    this.field152 = 4;
                }
            } else {
                this.field158 = 2048;
                this.field152 = 1;
                this.field154 = 0;
                this.field168 = 4096;
            }
        } else {
            this.field154 = 0;
            this.field158 = 2048;
            this.field168 = 2048;
            this.field152 = 1;
        }
        if (arg0) {
            this.field152 = -116;
        }
        ++field165;
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(B)V")
    public static void method87(byte arg0) {
        field160 = null;
        if (arg0 != -123) {
            method88(-46);
        }
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)V")
    public static final void method88(int arg0) {
        if (arg0 != 10) {
            field160 = null;
        }
        ++field169;
        class237 var1 = class337.field4789;
        synchronized (class337.field4789) {
            class337.field4789.method1618(0);
        }
        class237 var2 = class420.field6007;
        synchronized (class420.field6007) {
            class420.field6007.method1618(0);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIZ)V")
    public final void method89(int arg0, int arg1, boolean arg2) {
        ++field171;
        int var4;
        if (arg2) {
            var4 = 2048;
        } else {
            int var5 = 2047 & this.field168 * arg1 / 50 + this.field166;
            int var6 = this.field152;
            if (~var6 != -2) {
                if (~var6 != -4) {
                    if (var6 != 4) {
                        if (var6 != 2) {
                            if (~var6 == -6) {
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
                    var4 = class285.field4008[var5] >> 1;
                }
            } else {
                var4 = 1024 - -(class158.field2055[var5 << 3] >> 5);
            }
        }
        if (arg0 > 76) {
            super.field5688 = (float) ((this.field158 * var4 >> 11) + this.field154) / 2048.0F;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILjava/lang/String;Lrd;I)Lts;")
    public static final class315 method90(int arg0, String arg1, class185 arg2, int arg3) {
        ++field159;
        if (arg0 != 8) {
            method92(-51, -73, 81, 43, 49, 52, -28, (byte) -80);
        }
        if (~arg3 == -1) {
            return arg2.method1254(16, arg1);
        } else if (arg3 == 1) {
            try {
                class368.method2347("openjs", new Object[] { (new URL(arg2.field2685.getCodeBase(), arg1)).toString() }, arg2.field2685, 83);
                class315 var4 = new class315();
                var4.field4498 = 1;
                return var4;
            } catch (Throwable var10) {
                class315 var5 = new class315();
                var5.field4498 = 2;
                return var5;
            }
        } else if (arg3 == 2) {
            try {
                arg2.field2685.getAppletContext().showDocument(new URL(arg2.field2685.getCodeBase(), arg1), "_blank");
                class315 var6 = new class315();
                var6.field4498 = 1;
                return var6;
            } catch (Exception var11) {
                class315 var7 = new class315();
                var7.field4498 = 2;
                return var7;
            }
        } else if (~arg3 == -4) {
            try {
                class368.method2348(arg2.field2685, arg0 + -92, "loggedout");
            } catch (Throwable var13) {
            }
            try {
                arg2.field2685.getAppletContext().showDocument(new URL(arg2.field2685.getCodeBase(), arg1), "_top");
                class315 var8 = new class315();
                var8.field4498 = 1;
                return var8;
            } catch (Exception var12) {
                class315 var9 = new class315();
                var9.field4498 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I[Lon;ZIII)V")
    public static final void method91(int arg0, class184[] arg1, boolean arg2, int arg3, int arg4, int arg5) {
        ++field170;
        for (int var6 = 0; ~var6 > ~arg1.length; ++var6) {
            class184 var8 = arg1[var6];
            if (var8 != null && var8.field2599 == arg4) {
                class92.method508(arg5, var8, arg3, arg2, (byte) -107);
                class55.method319(false, var8, arg5, arg3);
                if (-var8.field2618 + var8.field2545 < var8.field2655) {
                    var8.field2655 = -var8.field2618 + var8.field2545;
                }
                if (~var8.field2655 > -1) {
                    var8.field2655 = 0;
                }
                if (~var8.field2648 < ~(-var8.field2516 + var8.field2646)) {
                    var8.field2648 = var8.field2646 - var8.field2516;
                }
                if (var8.field2648 < 0) {
                    var8.field2648 = 0;
                }
                if (~var8.field2524 == -1) {
                    class384.method2466(arg2, var8, (byte) -93);
                }
            }
        }
        int var7 = -8 / ((-30 - arg0) / 57);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (~class81.field946 >= ~arg3 && class235.field3295 >= arg4 && class388.field5464 <= arg1 && ~class219.field3080 <= ~arg5) {
            class192.method1302(arg1, arg6, arg2, arg4, (byte) 118, arg0, arg5, arg3);
        } else {
            class433.method2720(arg5, arg2, arg1, arg6, -78, arg0, arg3, arg4);
        }
        if (arg7 < -49) {
            ++field157;
        }
    }

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "(I)Z")
    public static final boolean method93(int arg0) {
        ++field162;
        if (arg0 != 1) {
            method91(-29, (class184[]) null, true, 4, -119, -112);
        }
        return ~class26.field329 != -1 ? true : class210.field2997;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
    protected class12() {
        if (class285.field4008 == null) {
            class49.method283(true);
        }
        this.method86(false);
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Ldg;)V")
    public class12(class236 arg0) {
        if (class285.field4008 == null) {
            class49.method283(true);
        }
        this.field167 = arg0.method1574(-28);
        this.field155 = (this.field167 & 8) != 0;
        this.field161 = (this.field167 & 16) != 0;
        this.field167 &= 7;
        super.field5682 = arg0.method1617((byte) 48);
        super.field5687 = arg0.method1617((byte) 48);
        super.field5680 = arg0.method1617((byte) 48);
        super.field5679 = arg0.method1574(-99);
        int var2 = super.field5679 * 2 + 1;
        this.field163 = new short[var2];
        for (int var3 = 0; ~this.field163.length < ~var3; ++var3) {
            short var5 = (short) arg0.method1617((byte) 48);
            int var6 = var5 >>> 8;
            if (var2 <= var6) {
                var6 = var2 + -1;
            }
            int var7 = var5 & 255;
            if (var7 > -var6 + var2) {
                var7 = -var6 + var2;
            }
            this.field163[var3] = (short) class429.method2704(var7, var6 << 8);
        }
        super.field5679 = (super.field5679 << 7) - -64;
        if (class318.field4509 == null) {
            super.field5690 = class113.field1391[class261.method1747(arg0.method1617((byte) 48), (byte) 109) & 65535];
        } else {
            super.field5690 = class318.field4509[arg0.method1617((byte) 48)];
        }
        int var4 = arg0.method1574(-86);
        this.field164 = 31 & var4;
        this.field166 = (224 & var4) << 3;
        if (this.field164 != 31) {
            this.method86(false);
        }
    }

    static {
        new class362(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
        new class362(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
    }
}
