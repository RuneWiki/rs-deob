import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class72 extends class56 {

    @OriginalMember(owner = "client!qr", name = "K", descriptor = "I")
    private int field997 = 32768;

    @OriginalMember(owner = "client!qr", name = "F", descriptor = "Lbja;")
    public static class34 field993 = new class34(2, 4, 4, 0);

    @OriginalMember(owner = "client!qr", name = "D", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!qr", name = "E", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!qr", name = "H", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!qr", name = "I", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!qr", name = "J", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!qr", name = "L", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BILes;)V")
    public final void method144(byte arg0, int arg1, class403 arg2) {
        if (arg1 != 0) {
            if (arg1 == 1) {
                super.field762 = ~arg2.method2396((byte) 106) == -2;
            }
        } else {
            this.field997 = arg2.method2390((byte) 66) << 4;
        }
        ++field998;
        if (arg0 >= -44) {
            field994 = -97;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BI)[[I")
    public final int[][] method187(byte arg0, int arg1) {
        ++field996;
        int[][] var3 = super.field759.method220(arg1, (byte) -91);
        if (arg0 < 35) {
            method687(false);
        }
        if (super.field759.field341) {
            int[] var4 = this.method492(1, arg1, (byte) 74);
            int[] var5 = this.method492(2, arg1, (byte) 86);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; class642.field8759 > var9; ++var9) {
                int var10 = (1045086 & var4[var9] * 255) >> 12;
                int var11 = var5[var9] * this.field997 >> 12;
                int var12 = class285.field3332[var10] * var11 >> 12;
                int var13 = class737.field10282[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class446.field5990;
                int var15 = class75.field1037 & arg1 - -(var13 >> 12);
                int[][] var16 = this.method495(-62, var15, 0);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Ljava/lang/String;I)[B")
    public static final byte[] method686(String arg0, int arg1) {
        if (arg1 != -30189) {
            method687(false);
        }
        ++field992;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; ++var4) {
            char var5 = arg0.charAt(var4);
            if (~var5 < -1 && ~var5 > -129 || var5 >= 160 && var5 <= 255) {
                var3[var4] = (byte) var5;
            } else if (var5 == 8364) {
                var3[var4] = -128;
            } else if (var5 != 8218) {
                if (~var5 != -403) {
                    if (~var5 != -8223) {
                        if (var5 == 8230) {
                            var3[var4] = -123;
                        } else if (var5 == 8224) {
                            var3[var4] = -122;
                        } else if (~var5 != -8226) {
                            if (var5 == 710) {
                                var3[var4] = -120;
                            } else if (~var5 != -8241) {
                                if (var5 != 352) {
                                    if (var5 == 8249) {
                                        var3[var4] = -117;
                                    } else if (var5 == 338) {
                                        var3[var4] = -116;
                                    } else if (~var5 != -382) {
                                        if (var5 == 8216) {
                                            var3[var4] = -111;
                                        } else if (~var5 != -8218) {
                                            if (var5 == 8220) {
                                                var3[var4] = -109;
                                            } else if (var5 != 8221) {
                                                if (var5 != 8226) {
                                                    if (~var5 != -8212) {
                                                        if (~var5 == -8213) {
                                                            var3[var4] = -105;
                                                        } else if (var5 == 732) {
                                                            var3[var4] = -104;
                                                        } else if (~var5 != -8483) {
                                                            if (var5 == 353) {
                                                                var3[var4] = -102;
                                                            } else if (~var5 == -8251) {
                                                                var3[var4] = -101;
                                                            } else if (var5 != 339) {
                                                                if (var5 == 382) {
                                                                    var3[var4] = -98;
                                                                } else if (var5 == 376) {
                                                                    var3[var4] = -97;
                                                                } else {
                                                                    var3[var4] = 63;
                                                                }
                                                            } else {
                                                                var3[var4] = -100;
                                                            }
                                                        } else {
                                                            var3[var4] = -103;
                                                        }
                                                    } else {
                                                        var3[var4] = -106;
                                                    }
                                                } else {
                                                    var3[var4] = -107;
                                                }
                                            } else {
                                                var3[var4] = -108;
                                            }
                                        } else {
                                            var3[var4] = -110;
                                        }
                                    } else {
                                        var3[var4] = -114;
                                    }
                                } else {
                                    var3[var4] = -118;
                                }
                            } else {
                                var3[var4] = -119;
                            }
                        } else {
                            var3[var4] = -121;
                        }
                    } else {
                        var3[var4] = -124;
                    }
                } else {
                    var3[var4] = -125;
                }
            } else {
                var3[var4] = -126;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "(Z)V")
    public static void method687(boolean arg0) {
        if (arg0) {
            field993 = null;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
    public final void method493(byte arg0) {
        ++field995;
        class120.method940((byte) -61);
        int var2 = 16 % ((arg0 - 37) / 62);
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "()V")
    public class72() {
        super(3, false);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)[I")
    public final int[] method145(int arg0, int arg1) {
        ++field991;
        int[] var3 = super.field752.method1308(false, arg1);
        if (arg0 != 0) {
            field994 = 93;
        }
        if (super.field752.field2441) {
            int[] var4 = this.method492(1, arg1, (byte) 54);
            int[] var5 = this.method492(2, arg1, (byte) 121);
            for (int var6 = 0; ~class642.field8759 < ~var6; ++var6) {
                int var7 = (4093 & var4[var6]) >> 4;
                int var8 = var5[var6] * this.field997 >> 12;
                int var9 = class285.field3332[var7] * var8 >> 12;
                int var10 = class737.field10282[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class446.field5990;
                int var12 = (var10 >> 12) + arg1 & class75.field1037;
                int[] var13 = this.method492(0, var12, (byte) 85);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }
}
