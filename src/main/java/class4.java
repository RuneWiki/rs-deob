import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class4 extends class482 {

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "Luga;")
    public static class265 field22 = new class265(0, 0);

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "[Ljava/awt/Color;")
    public static Color[] field28 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "I")
    public int field30;

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "Lit;")
    public static class34 field32;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "Lid;")
    public class463 field21;

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "[B")
    public byte[] field29;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)I", line = 6)
    public final int method11(byte arg0) {
        ++field23;
        if (arg0 <= 105) {
            return -17;
        } else {
            return super.field6952 ? 0 : 100;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)[B", line = 21)
    public final byte[] method12(int arg0) {
        if (arg0 != 24649) {
            this.field30 = -14;
        }
        ++field25;
        if (super.field6952) {
            throw new RuntimeException();
        } else {
            return this.field29;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILcca;)V", line = 41)
    public static final void method13(int arg0, class461 arg1) {
        if (arg0 == 353) {
            ++field26;
            for (class447 var2 = (class447) class680.field9612.method3463((byte) -50); var2 != null; var2 = (class447) class680.field9612.method3469((byte) 107)) {
                if (var2.field6516 == arg1) {
                    if (var2.field6518 != null) {
                        class324.field4793.method2223(var2.field6518);
                        var2.field6518 = null;
                    }
                    var2.method636((byte) 97);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V", line = 75)
    public static void method14(int arg0) {
        if (arg0 >= -44) {
            method15(-35, 121, false);
        }
        field28 = null;
        field22 = null;
        field32 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIZ)Z", line = 88)
    public static final boolean method15(int arg0, int arg1, boolean arg2) {
        ++field31;
        if (!arg2) {
            field22 = null;
        }
        return (arg0 & 52) != 0;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)Z", line = 99)
    public static final boolean method16(byte arg0, int arg1) {
        ++field24;
        if (arg0 != -100) {
            field28 = null;
        }
        if (arg1 != 58 && arg1 != 30 && arg1 != 23 && ~arg1 != -16 && ~arg1 != -3) {
            return ~arg1 == -46 || arg1 == 1004;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/lang/String;I)[B", line = 119)
    public static final byte[] method17(String arg0, int arg1) {
        if (arg1 < 99) {
            method15(-43, -58, true);
        }
        ++field33;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var2 > var4; ++var4) {
            char var5 = arg0.charAt(var4);
            if (var5 > 0 && ~var5 > -129 || var5 >= 160 && ~var5 >= -256) {
                var3[var4] = (byte) var5;
            } else if (~var5 != -8365) {
                if (~var5 != -8219) {
                    if (~var5 == -403) {
                        var3[var4] = -125;
                    } else if (var5 != 8222) {
                        if (var5 == 8230) {
                            var3[var4] = -123;
                        } else if (var5 == 8224) {
                            var3[var4] = -122;
                        } else if (var5 != 8225) {
                            if (~var5 == -711) {
                                var3[var4] = -120;
                            } else if (var5 == 8240) {
                                var3[var4] = -119;
                            } else if (var5 == 352) {
                                var3[var4] = -118;
                            } else if (~var5 != -8250) {
                                if (~var5 != -339) {
                                    if (var5 == 381) {
                                        var3[var4] = -114;
                                    } else if (var5 == 8216) {
                                        var3[var4] = -111;
                                    } else if (var5 == 8217) {
                                        var3[var4] = -110;
                                    } else if (~var5 == -8221) {
                                        var3[var4] = -109;
                                    } else if (~var5 != -8222) {
                                        if (~var5 != -8227) {
                                            if (var5 == 8211) {
                                                var3[var4] = -106;
                                            } else if (var5 == 8212) {
                                                var3[var4] = -105;
                                            } else if (~var5 != -733) {
                                                if (var5 != 8482) {
                                                    if (var5 == 353) {
                                                        var3[var4] = -102;
                                                    } else if (~var5 != -8251) {
                                                        if (var5 == 339) {
                                                            var3[var4] = -100;
                                                        } else if (~var5 == -383) {
                                                            var3[var4] = -98;
                                                        } else if (~var5 == -377) {
                                                            var3[var4] = -97;
                                                        } else {
                                                            var3[var4] = 63;
                                                        }
                                                    } else {
                                                        var3[var4] = -101;
                                                    }
                                                } else {
                                                    var3[var4] = -103;
                                                }
                                            } else {
                                                var3[var4] = -104;
                                            }
                                        } else {
                                            var3[var4] = -107;
                                        }
                                    } else {
                                        var3[var4] = -108;
                                    }
                                } else {
                                    var3[var4] = -116;
                                }
                            } else {
                                var3[var4] = -117;
                            }
                        } else {
                            var3[var4] = -121;
                        }
                    } else {
                        var3[var4] = -124;
                    }
                } else {
                    var3[var4] = -126;
                }
            } else {
                var3[var4] = -128;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "(I)V", line = 272)
    public static final void method18(int arg0) {
        for (class180 var1 = (class180) class26.field263.method3772(true); var1 != null; var1 = (class180) class26.field263.method3780(23774)) {
            if (var1.field3056 > 1) {
                var1.field3056 = 0;
                class206.field3455.method67(((class208) var1.field3055.field9552.field3449).field3476, var1, -6772);
                var1.field3055.method3773((byte) 75);
            }
        }
        ++field27;
        class124.field1898 = 0;
        class608.field8588 = 0;
        class344.field5093.method3465(0);
        class88.field1289.method3517(-98);
        class26.field263.method3773((byte) -83);
        if (arg0 != 352) {
            field32 = null;
        }
        class32.field304 = false;
    }
}
