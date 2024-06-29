import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class21 extends class147 {

    @OriginalMember(owner = "client!lg", name = "C", descriptor = "I")
    public int field284;

    @OriginalMember(owner = "client!lg", name = "O", descriptor = "Z")
    public boolean field296;

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "Z")
    public boolean field291;

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "[S")
    public short[] field281;

    @OriginalMember(owner = "client!lg", name = "M", descriptor = "I")
    public int field294;

    @OriginalMember(owner = "client!lg", name = "y", descriptor = "I")
    private int field280;

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "Loa;")
    public static class149 field287 = new class149(64);

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!lg", name = "A", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!lg", name = "B", descriptor = "I")
    private int field283;

    @OriginalMember(owner = "client!lg", name = "D", descriptor = "I")
    private int field285;

    @OriginalMember(owner = "client!lg", name = "E", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "I")
    private int field288;

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
    private int field292;

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!lg", name = "P", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(B)V")
    public static final void method132(byte arg0) {
        class314.field4766 = new String[500];
        ++field278;
        class138.field1868 = class188.field2828.field4176 + class188.field2828.field4172 - -2;
        class198.field2989 = class458.field6795.field4176 - -class458.field6795.field4172 + 2;
        for (int var1 = 0; ~var1 > ~class314.field4766.length; ++var1) {
            class314.field4766[var1] = "";
        }
        if (arg0 < 104) {
            field286 = -61;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIII)V")
    public final void method133(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field288 = arg2;
        ++field297;
        this.field292 = arg3;
        this.field285 = arg1;
        int var6 = -26 % ((19 - arg4) / 40);
        this.field283 = arg0;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZZI)V")
    public final void method134(boolean arg0, boolean arg1, int arg2) {
        if (arg0) {
            this.method133(-71, 18, -55, 26, -34);
        }
        ++field295;
        int var4;
        if (arg1) {
            var4 = 2048;
        } else {
            int var5 = this.field283 * arg2 / 50 + this.field280 & 2047;
            int var6 = this.field288;
            if (var6 != 1) {
                if (var6 != 3) {
                    if (~var6 != -5) {
                        if (var6 != 2) {
                            if (~var6 == -6) {
                                var4 = (var5 < 1024 ? var5 : -var5 + 2048) << 1;
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
                    var4 = class140.field1886[var5] >> 1;
                }
            } else {
                var4 = (class110.field1450[var5 << 3] >> 5) + 1024;
            }
        }
        super.field2036 = (float) ((this.field292 * var4 >> 11) + this.field285) / 2048.0F;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)B")
    public static final byte method135(int arg0, int arg1, int arg2) {
        if (arg1 != 16183) {
            return -119;
        } else {
            ++field290;
            if (~arg0 != -10) {
                return 0;
            } else {
                return (byte) ((1 & arg2) == 0 ? 1 : 2);
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V")
    private final void method136(int arg0) {
        ++field279;
        if (arg0 != 65535) {
            method139(18);
        }
        int var2 = this.field294;
        if (~var2 != -3) {
            if (var2 != 3) {
                if (var2 != 4) {
                    if (var2 != 5) {
                        if (~var2 != -13) {
                            if (~var2 != -14) {
                                if (~var2 != -11) {
                                    if (~var2 != -12) {
                                        if (~var2 != -7) {
                                            if (~var2 != -8) {
                                                if (var2 != 8) {
                                                    if (~var2 != -10) {
                                                        if (var2 != 14) {
                                                            if (var2 != 15) {
                                                                if (~var2 == -17) {
                                                                    this.field292 = 256;
                                                                    this.field283 = 8192;
                                                                    this.field285 = 1792;
                                                                    this.field288 = 1;
                                                                } else {
                                                                    this.field292 = 2048;
                                                                    this.field285 = 0;
                                                                    this.field283 = 2048;
                                                                    this.field288 = 0;
                                                                }
                                                            } else {
                                                                this.field285 = 1536;
                                                                this.field283 = 4096;
                                                                this.field288 = 1;
                                                                this.field292 = 512;
                                                            }
                                                        } else {
                                                            this.field285 = 1280;
                                                            this.field288 = 1;
                                                            this.field292 = 768;
                                                            this.field283 = 2048;
                                                        }
                                                    } else {
                                                        this.field283 = 4096;
                                                        this.field292 = 1024;
                                                        this.field288 = 3;
                                                        this.field285 = 1024;
                                                    }
                                                } else {
                                                    this.field292 = 1024;
                                                    this.field288 = 3;
                                                    this.field285 = 1024;
                                                    this.field283 = 2048;
                                                }
                                            } else {
                                                this.field285 = 1280;
                                                this.field292 = 768;
                                                this.field283 = 4096;
                                                this.field288 = 3;
                                            }
                                        } else {
                                            this.field283 = 2048;
                                            this.field288 = 3;
                                            this.field292 = 768;
                                            this.field285 = 1280;
                                        }
                                    } else {
                                        this.field288 = 3;
                                        this.field285 = 1536;
                                        this.field292 = 512;
                                        this.field283 = 4096;
                                    }
                                } else {
                                    this.field288 = 3;
                                    this.field285 = 1536;
                                    this.field283 = 2048;
                                    this.field292 = 512;
                                }
                            } else {
                                this.field292 = 2048;
                                this.field283 = 8192;
                                this.field285 = 0;
                                this.field288 = 2;
                            }
                        } else {
                            this.field288 = 2;
                            this.field283 = 2048;
                            this.field292 = 2048;
                            this.field285 = 0;
                        }
                    } else {
                        this.field283 = 8192;
                        this.field288 = 4;
                        this.field285 = 0;
                        this.field292 = 2048;
                    }
                } else {
                    this.field288 = 4;
                    this.field292 = 2048;
                    this.field285 = 0;
                    this.field283 = 2048;
                }
            } else {
                this.field288 = 1;
                this.field292 = 2048;
                this.field285 = 0;
                this.field283 = 4096;
            }
        } else {
            this.field292 = 2048;
            this.field285 = 0;
            this.field283 = 2048;
            this.field288 = 1;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public static final void method137(String arg0, int arg1, boolean arg2) {
        ++field293;
        int var3 = class307.field4634;
        int[] var4 = class201.field3038;
        boolean var5 = false;
        for (int var6 = 0; var6 < var3; ++var6) {
            class169 var7 = class140.field1883[var4[var6]];
            if (var7 != null && class113.field1500 != var7 && var7.field2459 != null && var7.field2459.equalsIgnoreCase(arg0)) {
                var5 = true;
                if (arg1 == 1) {
                    ++class184.field2772;
                    class177.method1082(class466.field6864, 0);
                    class189.field2840.method2366(0, true);
                    class189.field2840.method2334(var4[var6], 1833667168);
                } else if (~arg1 == -5) {
                    ++class415.field6160;
                    class177.method1082(class374.field5446, 0);
                    class189.field2840.method2360(128, 0);
                    class189.field2840.method2377(var4[var6], -102);
                } else if (arg1 != 5) {
                    if (arg1 == 6) {
                        ++class172.field2646;
                        class177.method1082(class95.field1323, 0);
                        class189.field2840.method2377(var4[var6], -6);
                        class189.field2840.method2371(arg2, 0);
                    } else if (~arg1 == -8) {
                        class177.method1082(class90.field1274, 0);
                        ++class286.field4351;
                        class189.field2840.method2352(0, -128);
                        class189.field2840.method2334(var4[var6], 1833667168);
                    }
                } else {
                    class177.method1082(class335.field4985, 0);
                    ++class465.field6849;
                    class189.field2840.method2366(0, true);
                    class189.field2840.method2377(var4[var6], -92);
                }
                break;
            }
        }
        if (!arg2) {
            method139(-2);
        }
        if (!var5) {
            class149.method932(class416.field6177.method937((byte) 105, class27.field356) + arg0, 2688);
        }
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(B)V")
    public static void method138(byte arg0) {
        if (arg0 > -73) {
            method137((String) null, 28, true);
        }
        field287 = null;
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(I)V")
    public static final void method139(int arg0) {
        if (arg0 != -24766) {
            field286 = -115;
        }
        ++field282;
        class375.field5461.method365(((float) class105.field1410 * 0.1F + 0.7F) * 1.1523438F);
        class375.field5461.method360(class162.field2253, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
        class375.field5461.method344(class426.field6270, -1);
        class375.field5461.method380(class57.field763);
    }

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "(I)V")
    public static final void method140(int arg0) {
        ++field289;
        if (~class454.field6750 != arg0) {
            try {
                class232.method1404(class68.field876, 105, "tbrefresh");
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
    protected class21() {
        if (class140.field1886 == null) {
            class303.method1862(-125);
        }
        this.method136(65535);
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lef;)V")
    public class21(class385 arg0) {
        if (class140.field1886 == null) {
            class303.method1862(-126);
        }
        this.field284 = arg0.method2343(255);
        this.field296 = (this.field284 & 16) != 0;
        this.field291 = ~(8 & this.field284) != -1;
        this.field284 &= 7;
        super.field2033 = arg0.method2323(-30);
        super.field2038 = arg0.method2323(-66);
        super.field2040 = arg0.method2323(-123);
        super.field2037 = arg0.method2343(255);
        int var2 = super.field2037 * 2 + 1;
        this.field281 = new short[var2];
        for (int var3 = 0; ~var3 > ~this.field281.length; ++var3) {
            short var5 = (short) arg0.method2323(-27);
            int var6 = var5 >>> 8;
            int var7 = 255 & var5;
            if (~var6 <= ~var2) {
                var6 = var2 + -1;
            }
            if (-var6 + var2 < var7) {
                var7 = -var6 + var2;
            }
            this.field281[var3] = (short) class276.method1712(var6 << 8, var7);
        }
        super.field2037 = (super.field2037 << class254.field3869) + class267.field4058;
        if (class328.field4929 != null) {
            super.field2035 = class328.field4929[arg0.method2323(-112)];
        } else {
            super.field2035 = class150.field2070[class103.method652(arg0.method2323(-112), (byte) 125) & 65535];
        }
        int var4 = arg0.method2343(255);
        this.field294 = 31 & var4;
        this.field280 = (var4 & 224) << 3;
        if (this.field294 != 31) {
            this.method136(65535);
        }
    }
}
