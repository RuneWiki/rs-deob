import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class315 extends class149 {

    @OriginalMember(owner = "client!mt", name = "N", descriptor = "Z")
    public static volatile boolean field4814 = false;

    @OriginalMember(owner = "client!mt", name = "O", descriptor = "Lpg;")
    public static class492 field4815 = new class492(82, 0);

    @OriginalMember(owner = "client!mt", name = "I", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!mt", name = "K", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!mt", name = "L", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!mt", name = "M", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!mt", name = "P", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!mt", name = "J", descriptor = "[Lwt;")
    private class352[] field4810;

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "(I)V", line = 5)
    public static void method2042(int arg0) {
        if (arg0 != 8216) {
            field4815 = null;
        }
        field4815 = null;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Ljava/lang/String;B)[B", line = 16)
    public static final byte[] method2043(String arg0, byte arg1) {
        int var2 = -33 / ((arg1 - 35) / 60);
        ++field4812;
        int var3 = arg0.length();
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var3 > var5; ++var5) {
            char var6 = arg0.charAt(var5);
            if (~var6 < -1 && var6 < 128 || ~var6 <= -161 && ~var6 >= -256) {
                var4[var5] = (byte) var6;
            } else if (var6 == 8364) {
                var4[var5] = -128;
            } else if (~var6 == -8219) {
                var4[var5] = -126;
            } else if (~var6 == -403) {
                var4[var5] = -125;
            } else if (var6 != 8222) {
                if (~var6 == -8231) {
                    var4[var5] = -123;
                } else if (var6 != 8224) {
                    if (~var6 == -8226) {
                        var4[var5] = -121;
                    } else if (~var6 == -711) {
                        var4[var5] = -120;
                    } else if (~var6 == -8241) {
                        var4[var5] = -119;
                    } else if (var6 != 352) {
                        if (var6 != 8249) {
                            if (~var6 != -339) {
                                if (~var6 != -382) {
                                    if (var6 != 8216) {
                                        if (var6 == 8217) {
                                            var4[var5] = -110;
                                        } else if (~var6 == -8221) {
                                            var4[var5] = -109;
                                        } else if (~var6 != -8222) {
                                            if (var6 != 8226) {
                                                if (var6 == 8211) {
                                                    var4[var5] = -106;
                                                } else if (~var6 != -8213) {
                                                    if (~var6 == -733) {
                                                        var4[var5] = -104;
                                                    } else if (var6 != 8482) {
                                                        if (~var6 != -354) {
                                                            if (var6 == 8250) {
                                                                var4[var5] = -101;
                                                            } else if (~var6 != -340) {
                                                                if (var6 != 382) {
                                                                    if (var6 != 376) {
                                                                        var4[var5] = 63;
                                                                    } else {
                                                                        var4[var5] = -97;
                                                                    }
                                                                } else {
                                                                    var4[var5] = -98;
                                                                }
                                                            } else {
                                                                var4[var5] = -100;
                                                            }
                                                        } else {
                                                            var4[var5] = -102;
                                                        }
                                                    } else {
                                                        var4[var5] = -103;
                                                    }
                                                } else {
                                                    var4[var5] = -105;
                                                }
                                            } else {
                                                var4[var5] = -107;
                                            }
                                        } else {
                                            var4[var5] = -108;
                                        }
                                    } else {
                                        var4[var5] = -111;
                                    }
                                } else {
                                    var4[var5] = -114;
                                }
                            } else {
                                var4[var5] = -116;
                            }
                        } else {
                            var4[var5] = -117;
                        }
                    } else {
                        var4[var5] = -118;
                    }
                } else {
                    var4[var5] = -122;
                }
            } else {
                var4[var5] = -124;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(BI)[[I", line = 155)
    public final int[][] method139(byte arg0, int arg1) {
        ++field4811;
        int[][] var3 = super.field2147.method2726(arg1, 0);
        if (super.field2147.field6664) {
            int var4 = class316.field4838;
            int var5 = class150.field2159;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field2147.method2730((byte) -125);
            this.method2044(111, var6);
            for (int var8 = 0; ~class150.field2159 < ~var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~var14 > ~class316.field4838; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class494.method2942(var15 << 4, 4080);
                    var12[var14] = class494.method2942(var15, 65280) >> 4;
                    var11[var14] = class494.method2942(16711680, var15) >> 12;
                }
            }
        }
        if (arg0 >= -45) {
            field4814 = true;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(II)[I", line = 216)
    public final int[] method92(int arg0, int arg1) {
        ++field4813;
        int[] var3 = super.field2152.method2891(arg1, (byte) 113);
        if (arg0 != -10835) {
            this.field4810 = null;
        }
        if (super.field2152.field7051) {
            this.method2044(99, super.field2152.method2888(-113));
        }
        return var3;
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "()V", line = 239)
    public class315() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I[[I)V", line = 244)
    private final void method2044(int arg0, int[][] arg1) {
        ++field4809;
        int var3 = class316.field4838;
        int var4 = -13 % ((arg0 - 45) / 53);
        int var5 = class150.field2159;
        class254.method1656((byte) 125, arg1);
        class439.method2657((byte) -108, class51.field694, class320.field4897, 0, 0);
        if (this.field4810 != null) {
            for (int var6 = 0; this.field4810.length > var6; ++var6) {
                class352 var7 = this.field4810[var6];
                int var8 = var7.field5452;
                int var9 = var7.field5453;
                if (var8 < 0) {
                    if (~var9 <= -1) {
                        var7.method136(1244456711, var3, var5);
                    }
                } else if (~var9 <= -1) {
                    var7.method137(var5, -2, var3);
                } else {
                    var7.method132(var3, (byte) -80, var5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IBLtl;)V", line = 296)
    public final void method93(int arg0, byte arg1, class91 arg2) {
        if (arg1 != 35) {
            this.field4810 = null;
        }
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                super.field2148 = arg2.method618((byte) 100) == 1;
            }
        } else {
            this.field4810 = new class352[arg2.method618((byte) 100)];
            for (int var4 = 0; this.field4810.length > var4; ++var4) {
                int var5 = arg2.method618((byte) 100);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (~var5 != -3) {
                            if (var5 == 3) {
                                this.field4810[var4] = class296.method1908(106, arg2);
                            }
                        } else {
                            this.field4810[var4] = class316.method2047(arg2, -100);
                        }
                    } else {
                        this.field4810[var4] = class229.method1568(arg1 + -36, arg2);
                    }
                } else {
                    this.field4810[var4] = class256.method1665(arg2, (byte) 95);
                }
            }
        }
        ++field4816;
    }
}
