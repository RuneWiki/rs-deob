import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class120 extends class223 {

    @OriginalMember(owner = "client!m", name = "L", descriptor = "Lce;")
    public static class229 field1812 = class136.method1008((byte) 96);

    @OriginalMember(owner = "client!m", name = "J", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!m", name = "M", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!m", name = "O", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!m", name = "P", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(Z)V")
    public static final void method907(boolean arg0) {
        ++field1810;
        if (!arg0) {
            class20.field319.method1169(true);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        ++field1814;
        int[] var3 = super.field3588.method1611(0, arg1);
        if (arg0 <= 14) {
            return null;
        } else {
            if (super.field3588.field3722) {
                for (int var4 = 0; class250.field4008 > var4; ++var4) {
                    this.method910(arg1, var4, false);
                    int[] var5 = this.method1533(0, class77.field1177, -104);
                    var3[var4] = var5[class2.field43];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        ++field1811;
        if (arg1 == 0) {
            super.field3583 = arg0.method265(arg2 + -207) == 1;
        }
        if (arg2 != 102) {
            method912(-14, false);
        }
    }

    @OriginalMember(owner = "client!m", name = "f", descriptor = "(I)V")
    public static void method908(int arg0) {
        field1812 = null;
        if (arg0 > -8) {
            field1812 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)[[I")
    public final int[][] method135(int arg0, int arg1) {
        ++field1813;
        if (arg0 < 0) {
            return null;
        } else {
            int[][] var3 = super.field3572.method1818(arg1, false);
            if (super.field3572.field4257) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; ~class250.field4008 < ~var7; ++var7) {
                    this.method910(arg1, var7, false);
                    int[][] var8 = this.method1534(false, 0, class77.field1177);
                    var4[var7] = var8[0][class2.field43];
                    var5[var7] = var8[1][class2.field43];
                    var6[var7] = var8[2][class2.field43];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BLjava/lang/String;)[B")
    public static final byte[] method909(byte arg0, String arg1) {
        if (arg0 != -114) {
            return null;
        } else {
            ++field1817;
            int var2 = arg1.length();
            byte[] var3 = new byte[var2];
            for (int var4 = 0; ~var4 > ~var2; ++var4) {
                char var5 = arg1.charAt(var4);
                if (~var5 < -1 && ~var5 > -129 || ~var5 <= -161 && var5 <= 255) {
                    var3[var4] = (byte) var5;
                } else if (var5 != 8364) {
                    if (~var5 == -8219) {
                        var3[var4] = -126;
                    } else if (~var5 != -403) {
                        if (var5 != 8222) {
                            if (var5 == 8230) {
                                var3[var4] = -123;
                            } else if (~var5 == -8225) {
                                var3[var4] = -122;
                            } else if (var5 == 8225) {
                                var3[var4] = -121;
                            } else if (var5 != 710) {
                                if (~var5 == -8241) {
                                    var3[var4] = -119;
                                } else if (var5 != 352) {
                                    if (var5 != 8249) {
                                        if (~var5 == -339) {
                                            var3[var4] = -116;
                                        } else if (var5 != 381) {
                                            if (var5 != 8216) {
                                                if (var5 == 8217) {
                                                    var3[var4] = -110;
                                                } else if (var5 == 8220) {
                                                    var3[var4] = -109;
                                                } else if (~var5 == -8222) {
                                                    var3[var4] = -108;
                                                } else if (~var5 != -8227) {
                                                    if (~var5 == -8212) {
                                                        var3[var4] = -106;
                                                    } else if (~var5 != -8213) {
                                                        if (~var5 == -733) {
                                                            var3[var4] = -104;
                                                        } else if (~var5 != -8483) {
                                                            if (~var5 == -354) {
                                                                var3[var4] = -102;
                                                            } else if (var5 == 8250) {
                                                                var3[var4] = -101;
                                                            } else if (var5 != 339) {
                                                                if (~var5 == -383) {
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
                                                        var3[var4] = -105;
                                                    }
                                                } else {
                                                    var3[var4] = -107;
                                                }
                                            } else {
                                                var3[var4] = -111;
                                            }
                                        } else {
                                            var3[var4] = -114;
                                        }
                                    } else {
                                        var3[var4] = -117;
                                    }
                                } else {
                                    var3[var4] = -118;
                                }
                            } else {
                                var3[var4] = -120;
                            }
                        } else {
                            var3[var4] = -124;
                        }
                    } else {
                        var3[var4] = -125;
                    }
                } else {
                    var3[var4] = -128;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIZ)V")
    private final void method910(int arg0, int arg1, boolean arg2) {
        int var4 = class106.field1662[arg1];
        if (!arg2) {
            int var5 = class307.field4925[arg0];
            float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class2.field43 = arg1;
                class77.field1177 = arg0;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class2.field43 = arg0;
                class77.field1177 = arg1;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class2.field43 = -arg0 + class250.field4008;
                class77.field1177 = arg1;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class77.field1177 = class172.field2654 - arg0;
                class2.field43 = arg1;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class77.field1177 = -arg0 + class172.field2654;
                class2.field43 = -arg1 + class250.field4008;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class77.field1177 = class172.field2654 - arg1;
                class2.field43 = -arg0 + class250.field4008;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class77.field1177 = class172.field2654 - arg1;
                class2.field43 = arg0;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class2.field43 = class250.field4008 - arg1;
                class77.field1177 = arg0;
            }
            class2.field43 &= class280.field4430;
            class77.field1177 &= class75.field1168;
            ++field1818;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(BI)Z")
    public static final boolean method911(byte arg0, int arg1) {
        ++field1816;
        if (arg0 != -109) {
            field1812 = null;
        }
        return arg1 >= 0 && class262.field4147.length > arg1 ? class262.field4147[arg1] : false;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
    public class120() {
        super(1, false);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IZ)V")
    public static final void method912(int arg0, boolean arg1) {
        ++field1815;
        if (arg1) {
            if (class298.field4803 != -1) {
                class216.method1489(-24005, class298.field4803);
            }
            for (class288 var2 = (class288) class48.field787.method2049(0); var2 != null; var2 = (class288) class48.field787.method2047(93)) {
                class22.method192(true, var2, (byte) 114);
            }
            class298.field4803 = -1;
            class48.field787 = new class305(8);
            class143.method1041(108);
            class298.field4803 = class184.field2903;
            class26.method218(false, (byte) -61);
            class67.method545(100);
            class35.method330(-119, class298.field4803);
        }
        class114.field1755 = -1;
        class194.method1389(26365, class166.field2516);
        class263.field4168 = new class136();
        class263.field4168.field4725 = 3000;
        class263.field4168.field4709 = 3000;
        if (arg0 != -3) {
            method909((byte) -3, (String) null);
        }
        if (~class152.field2248 != -1) {
            if (~class175.field2704 != -3) {
                class114.method846(false);
            } else {
                class226.field3616 = class286.field4495 << 7;
                class118.field1787 = class293.field4550 << 7;
            }
            class233.method1600((byte) -108);
            class248.method1679(28, ~arg0);
        } else {
            class62.method503(class246.field3910, 123);
            class248.method1679(10, 2);
        }
    }
}
