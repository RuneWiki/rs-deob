import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class628 extends class634 {

    @OriginalMember(owner = "client!pda", name = "M", descriptor = "I")
    public static int field9021 = 1338;

    @OriginalMember(owner = "client!pda", name = "F", descriptor = "Lpia;")
    public static class94 field9014 = new class94(54, 6);

    @OriginalMember(owner = "client!pda", name = "G", descriptor = "I")
    public static int field9015;

    @OriginalMember(owner = "client!pda", name = "H", descriptor = "I")
    private int field9016;

    @OriginalMember(owner = "client!pda", name = "I", descriptor = "I")
    public static int field9017;

    @OriginalMember(owner = "client!pda", name = "J", descriptor = "I")
    private int field9018;

    @OriginalMember(owner = "client!pda", name = "L", descriptor = "I")
    public static int field9020;

    @OriginalMember(owner = "client!pda", name = "N", descriptor = "I")
    public static int field9022;

    @OriginalMember(owner = "client!pda", name = "O", descriptor = "I")
    private int field9023;

    @OriginalMember(owner = "client!pda", name = "P", descriptor = "I")
    public static int field9024;

    @OriginalMember(owner = "client!pda", name = "Q", descriptor = "I")
    public static int field9025;

    @OriginalMember(owner = "client!pda", name = "K", descriptor = "Lrga;")
    public static class239 field9019;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Loh;II)Lqf;")
    public static final class679 method3598(class404 arg0, int arg1, int arg2) {
        ++field9024;
        byte[] var3 = arg0.method2472(false, arg2);
        if (arg1 != 1338) {
            field9021 = -61;
        }
        return var3 == null ? null : new class679(var3);
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method3599(int arg0, long arg1) {
        ++field9015;
        if (arg1 > 0L && ~arg1 > -6582952005840035282L) {
            if (~(arg1 % 37L) == -1L) {
                return null;
            } else {
                int var3 = 0;
                for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                    ++var3;
                }
                if (arg0 >= -81) {
                    return null;
                } else {
                    StringBuffer var6 = new StringBuffer(var3);
                    while (~arg1 != -1L) {
                        long var7 = arg1;
                        arg1 /= 37L;
                        var6.append(class489.field6979[(int) (var7 - arg1 * 37L)]);
                    }
                    return var6.reverse().toString();
                }
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Z)V")
    public static void method3600(boolean arg0) {
        field9014 = null;
        if (!arg0) {
            field9021 = 121;
        }
        field9019 = null;
    }

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "()V")
    public class628() {
        this(0);
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(BI)[[I")
    public final int[][] method7(byte arg0, int arg1) {
        int var3 = 107 / ((-56 - arg0) / 53);
        ++field9025;
        int[][] var4 = super.field9126.method132(0, arg1);
        if (super.field9126.field295) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class635.field9139; ++var8) {
                var5[var8] = this.field9018;
                var6[var8] = this.field9023;
                var7[var8] = this.field9016;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(ILig;Z)V")
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        if (arg0 == 0) {
            this.method3603(arg1.method1458((byte) 123), (byte) -63);
        }
        if (arg2) {
            method3602(-29, 51, 84);
        }
        ++field9022;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(CI)B")
    public static final byte method3601(char arg0, int arg1) {
        if (arg1 != 1953684204) {
            field9021 = -11;
        }
        ++field9020;
        byte var2;
        if ((~arg0 >= -1 || ~arg0 <= -129) && (~arg0 > -161 || arg0 > 255)) {
            if (~arg0 == -8365) {
                var2 = -128;
            } else if (~arg0 == -8219) {
                var2 = -126;
            } else if (arg0 != 402) {
                if (~arg0 == -8223) {
                    var2 = -124;
                } else if (~arg0 == -8231) {
                    var2 = -123;
                } else if (~arg0 == -8225) {
                    var2 = -122;
                } else if (~arg0 != -8226) {
                    if (~arg0 == -711) {
                        var2 = -120;
                    } else if (~arg0 != -8241) {
                        if (arg0 != 352) {
                            if (arg0 != 8249) {
                                if (arg0 != 338) {
                                    if (arg0 == 381) {
                                        var2 = -114;
                                    } else if (~arg0 == -8217) {
                                        var2 = -111;
                                    } else if (arg0 == 8217) {
                                        var2 = -110;
                                    } else if (arg0 == 8220) {
                                        var2 = -109;
                                    } else if (~arg0 != -8222) {
                                        if (~arg0 == -8227) {
                                            var2 = -107;
                                        } else if (arg0 == 8211) {
                                            var2 = -106;
                                        } else if (arg0 != 8212) {
                                            if (~arg0 == -733) {
                                                var2 = -104;
                                            } else if (arg0 == 8482) {
                                                var2 = -103;
                                            } else if (~arg0 == -354) {
                                                var2 = -102;
                                            } else if (~arg0 == -8251) {
                                                var2 = -101;
                                            } else if (arg0 != 339) {
                                                if (arg0 == 382) {
                                                    var2 = -98;
                                                } else if (arg0 == 376) {
                                                    var2 = -97;
                                                } else {
                                                    var2 = 63;
                                                }
                                            } else {
                                                var2 = -100;
                                            }
                                        } else {
                                            var2 = -105;
                                        }
                                    } else {
                                        var2 = -108;
                                    }
                                } else {
                                    var2 = -116;
                                }
                            } else {
                                var2 = -117;
                            }
                        } else {
                            var2 = -118;
                        }
                    } else {
                        var2 = -119;
                    }
                } else {
                    var2 = -121;
                }
            } else {
                var2 = -125;
            }
        } else {
            var2 = (byte) arg0;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(III)Ljb;")
    public static final class492 method3602(int arg0, int arg1, int arg2) {
        class691 var3 = class638.field9170[arg0][arg1][arg2];
        return var3 == null ? null : var3.field9728;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(IB)V")
    private final void method3603(int arg0, byte arg1) {
        if (arg1 >= -8) {
            this.method3(44, (class244) null, false);
        }
        this.field9018 = (16711680 & arg0) >> 12;
        ++field9017;
        this.field9016 = (arg0 & 255) << 4;
        this.field9023 = arg0 >> 4 & 4080;
    }

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(I)V")
    private class628(int arg0) {
        super(0, false);
        this.method3603(arg0, (byte) -103);
    }
}
