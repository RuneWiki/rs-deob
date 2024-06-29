import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class355 extends class519 implements class337 {

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    private int field5122;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "Lkc;")
    public static class157 field5123 = new class157("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "[C")
    public static char[] field5131 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!uk", name = "y", descriptor = "Z")
    public static boolean field5134 = false;

    @OriginalMember(owner = "client!uk", name = "C", descriptor = "I")
    public static int field5138 = 2;

    @OriginalMember(owner = "client!uk", name = "D", descriptor = "Lhi;")
    public static class45 field5139 = new class45(28, -1);

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!uk", name = "A", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!uk", name = "B", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "Ldk;")
    public static class421 field5129;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V")
    public static final void method2122(int arg0, int arg1) {
        ++field5126;
        if (class225.field3176 == 1) {
            class257.field3494 = arg1;
        } else if (~class225.field3176 == -3 || class225.field3176 == 3) {
            class382.field5489 = arg1;
        }
        int var2 = 31 % ((64 - arg0) / 62);
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(B)V")
    public final void method1348(byte arg0) {
        if (arg0 != 113) {
            this.method2054(-107);
        }
        super.field7627.method2000(-9770, this);
        ++field5125;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IJ)V")
    public static final void method2123(int arg0, long arg1) {
        if (arg0 != -18823) {
            field5134 = false;
        }
        ++field5135;
        int var3 = class387.field5569;
        if (class70.field1012 != var3) {
            int var4 = -class70.field1012 + var3;
            int var5 = (int) ((long) var4 * arg1 / 320L);
            if (var4 > 0) {
                if (~var5 == -1) {
                    var5 = 1;
                } else if (var5 > var4) {
                    var5 = var4;
                }
            } else if (var5 != 0) {
                if (var4 > var5) {
                    var5 = var4;
                }
            } else {
                var5 = -1;
            }
            class70.field1012 += var5;
        }
        int var6 = class102.field1606;
        if (!class76.field1075.field3649) {
            class191.field2797 += (float) arg1 * class526.field7686 / 40.0F * 8.0F;
            class496.field7236 += (float) arg1 * class514.field7533 / 40.0F * 8.0F;
        }
        if (class193.field2815 != var6) {
            int var7 = -class193.field2815 + var6;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (~var7 < -1) {
                if (~var8 != -1) {
                    if (~var7 > ~var8) {
                        var8 = var7;
                    }
                } else {
                    var8 = 1;
                }
            } else if (var8 != 0) {
                if (var7 > var8) {
                    var8 = var7;
                }
            } else {
                var8 = -1;
            }
            class193.field2815 += var8;
        }
        class259.method1538((byte) -84);
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)I")
    public final int method2055(int arg0) {
        int var2 = 78 / ((58 - arg0) / 56);
        ++field5124;
        return this.field5122;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lpg;I[BIZ)V")
    public class355(class333 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field5122 = arg1;
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)V")
    public static void method2124(int arg0) {
        field5139 = null;
        field5131 = null;
        field5123 = null;
        int var1 = -28 / ((arg0 - 66) / 35);
        field5129 = null;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)J")
    public final long method2054(int arg0) {
        ++field5128;
        if (arg0 >= -30) {
            method2126((byte) -125, (String) null);
        }
        return 0L;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)I")
    public final int method2053(int arg0) {
        ++field5137;
        int var2 = 63 % ((22 - arg0) / 34);
        return super.field7628;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IC)B")
    public static final byte method2125(int arg0, char arg1) {
        ++field5132;
        if (arg0 != -15205) {
            field5131 = null;
        }
        byte var2;
        if ((arg1 <= 0 || ~arg1 <= -129) && (~arg1 > -161 || ~arg1 < -256)) {
            if (arg1 != 8364) {
                if (~arg1 != -8219) {
                    if (arg1 == 402) {
                        var2 = -125;
                    } else if (~arg1 == -8223) {
                        var2 = -124;
                    } else if (arg1 == 8230) {
                        var2 = -123;
                    } else if (~arg1 != -8225) {
                        if (arg1 == 8225) {
                            var2 = -121;
                        } else if (arg1 == 710) {
                            var2 = -120;
                        } else if (~arg1 != -8241) {
                            if (~arg1 != -353) {
                                if (arg1 == 8249) {
                                    var2 = -117;
                                } else if (~arg1 == -339) {
                                    var2 = -116;
                                } else if (arg1 == 381) {
                                    var2 = -114;
                                } else if (~arg1 != -8217) {
                                    if (~arg1 != -8218) {
                                        if (~arg1 == -8221) {
                                            var2 = -109;
                                        } else if (~arg1 == -8222) {
                                            var2 = -108;
                                        } else if (arg1 != 8226) {
                                            if (arg1 == 8211) {
                                                var2 = -106;
                                            } else if (~arg1 != -8213) {
                                                if (arg1 == 732) {
                                                    var2 = -104;
                                                } else if (arg1 != 8482) {
                                                    if (~arg1 != -354) {
                                                        if (~arg1 == -8251) {
                                                            var2 = -101;
                                                        } else if (~arg1 == -340) {
                                                            var2 = -100;
                                                        } else if (~arg1 == -383) {
                                                            var2 = -98;
                                                        } else if (~arg1 != -377) {
                                                            var2 = 63;
                                                        } else {
                                                            var2 = -97;
                                                        }
                                                    } else {
                                                        var2 = -102;
                                                    }
                                                } else {
                                                    var2 = -103;
                                                }
                                            } else {
                                                var2 = -105;
                                            }
                                        } else {
                                            var2 = -107;
                                        }
                                    } else {
                                        var2 = -110;
                                    }
                                } else {
                                    var2 = -111;
                                }
                            } else {
                                var2 = -118;
                            }
                        } else {
                            var2 = -119;
                        }
                    } else {
                        var2 = -122;
                    }
                } else {
                    var2 = -126;
                }
            } else {
                var2 = -128;
            }
        } else {
            var2 = (byte) arg1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLjava/lang/String;)[B")
    public static final byte[] method2126(byte arg0, String arg1) {
        if (arg0 != 81) {
            field5134 = false;
        }
        ++field5136;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; ++var4) {
            char var5 = arg1.charAt(var4);
            if (~var5 < -1 && ~var5 > -129 || var5 >= 160 && var5 <= 255) {
                var3[var4] = (byte) var5;
            } else if (var5 != 8364) {
                if (~var5 == -8219) {
                    var3[var4] = -126;
                } else if (~var5 == -403) {
                    var3[var4] = -125;
                } else if (~var5 == -8223) {
                    var3[var4] = -124;
                } else if (~var5 != -8231) {
                    if (var5 == 8224) {
                        var3[var4] = -122;
                    } else if (~var5 == -8226) {
                        var3[var4] = -121;
                    } else if (~var5 != -711) {
                        if (~var5 == -8241) {
                            var3[var4] = -119;
                        } else if (~var5 == -353) {
                            var3[var4] = -118;
                        } else if (~var5 == -8250) {
                            var3[var4] = -117;
                        } else if (var5 != 338) {
                            if (~var5 == -382) {
                                var3[var4] = -114;
                            } else if (var5 != 8216) {
                                if (~var5 == -8218) {
                                    var3[var4] = -110;
                                } else if (~var5 != -8221) {
                                    if (~var5 != -8222) {
                                        if (var5 == 8226) {
                                            var3[var4] = -107;
                                        } else if (var5 == 8211) {
                                            var3[var4] = -106;
                                        } else if (~var5 == -8213) {
                                            var3[var4] = -105;
                                        } else if (var5 == 732) {
                                            var3[var4] = -104;
                                        } else if (var5 == 8482) {
                                            var3[var4] = -103;
                                        } else if (~var5 != -354) {
                                            if (~var5 == -8251) {
                                                var3[var4] = -101;
                                            } else if (var5 != 339) {
                                                if (~var5 == -383) {
                                                    var3[var4] = -98;
                                                } else if (var5 != 376) {
                                                    var3[var4] = 63;
                                                } else {
                                                    var3[var4] = -97;
                                                }
                                            } else {
                                                var3[var4] = -100;
                                            }
                                        } else {
                                            var3[var4] = -102;
                                        }
                                    } else {
                                        var3[var4] = -108;
                                    }
                                } else {
                                    var3[var4] = -109;
                                }
                            } else {
                                var3[var4] = -111;
                            }
                        } else {
                            var3[var4] = -116;
                        }
                    } else {
                        var3[var4] = -120;
                    }
                } else {
                    var3[var4] = -123;
                }
            } else {
                var3[var4] = -128;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(III[B)V")
    public final void method2052(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg2 != 16734) {
            field5129 = null;
        }
        ++field5127;
        this.method3095(arg1, arg3, (byte) 111);
        this.field5122 = arg0;
    }
}
