import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class376 extends class573 {

    @OriginalMember(owner = "client!we", name = "I", descriptor = "I")
    private int field5588 = 4096;

    @OriginalMember(owner = "client!we", name = "O", descriptor = "I")
    private int field5594 = 4096;

    @OriginalMember(owner = "client!we", name = "L", descriptor = "I")
    private int field5591 = 4096;

    @OriginalMember(owner = "client!we", name = "J", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!we", name = "K", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!we", name = "M", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!we", name = "N", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!we", name = "P", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
    public class376() {
        super(1, false);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IC)B")
    public static final byte method2361(int arg0, char arg1) {
        ++field5593;
        byte var2;
        if ((~arg1 >= -1 || ~arg1 <= -129) && (arg1 < 160 || ~arg1 < -256)) {
            if (~arg1 != -8365) {
                if (~arg1 != -8219) {
                    if (arg1 == 402) {
                        var2 = -125;
                    } else if (arg1 != 8222) {
                        if (~arg1 != -8231) {
                            if (~arg1 != -8225) {
                                if (~arg1 == -8226) {
                                    var2 = -121;
                                } else if (arg1 != 710) {
                                    if (~arg1 == -8241) {
                                        var2 = -119;
                                    } else if (arg1 != 352) {
                                        if (~arg1 != -8250) {
                                            if (~arg1 == -339) {
                                                var2 = -116;
                                            } else if (arg1 == 381) {
                                                var2 = -114;
                                            } else if (arg1 == 8216) {
                                                var2 = -111;
                                            } else if (~arg1 != -8218) {
                                                if (~arg1 == -8221) {
                                                    var2 = -109;
                                                } else if (~arg1 == -8222) {
                                                    var2 = -108;
                                                } else if (~arg1 == -8227) {
                                                    var2 = -107;
                                                } else if (arg1 != 8211) {
                                                    if (~arg1 == -8213) {
                                                        var2 = -105;
                                                    } else if (arg1 == 732) {
                                                        var2 = -104;
                                                    } else if (~arg1 != -8483) {
                                                        if (arg1 != 353) {
                                                            if (~arg1 == -8251) {
                                                                var2 = -101;
                                                            } else if (arg1 != 339) {
                                                                if (~arg1 != -383) {
                                                                    if (arg1 == 376) {
                                                                        var2 = -97;
                                                                    } else {
                                                                        var2 = 63;
                                                                    }
                                                                } else {
                                                                    var2 = -98;
                                                                }
                                                            } else {
                                                                var2 = -100;
                                                            }
                                                        } else {
                                                            var2 = -102;
                                                        }
                                                    } else {
                                                        var2 = -103;
                                                    }
                                                } else {
                                                    var2 = -106;
                                                }
                                            } else {
                                                var2 = -110;
                                            }
                                        } else {
                                            var2 = -117;
                                        }
                                    } else {
                                        var2 = -118;
                                    }
                                } else {
                                    var2 = -120;
                                }
                            } else {
                                var2 = -122;
                            }
                        } else {
                            var2 = -123;
                        }
                    } else {
                        var2 = -124;
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
        int var3 = -74 % ((arg0 - 18) / 42);
        return var2;
    }

    @OriginalMember(owner = "client!we", name = "h", descriptor = "(I)V")
    public static final void method2362(int arg0) {
        ++field5592;
        if (class400.field5813) {
            if (arg0 != -28782) {
                method2362(29);
            }
            while (true) {
                while (~class366.field5422.length < ~class137.field2421) {
                    class135 var1 = class366.field5422[class137.field2421];
                    if (var1 != null && ~var1.field2401 == 0) {
                        if (class699.field9854 == null) {
                            class699.field9854 = class163.field2727.method1974(var1.field2399, true);
                        }
                        int var2 = class699.field9854.field1143;
                        if (var2 == -1) {
                            return;
                        }
                        ++class137.field2421;
                        class699.field9854 = null;
                        var1.field2401 = var2;
                    } else {
                        ++class137.field2421;
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BII)Z")
    public static final boolean method2363(byte arg0, int arg1, int arg2) {
        ++field5595;
        if (arg0 > -19) {
            return false;
        } else {
            return ~(arg2 & 2048) != -1;
        }
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(II)[[I")
    public final int[][] method442(int arg0, int arg1) {
        if (arg0 > -116) {
            this.field5591 = 15;
        }
        ++field5590;
        int[][] var3 = super.field8320.method1504(arg1, -2);
        if (super.field8320.field3295) {
            int[][] var4 = this.method3293(0, 125, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class540.field7555; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var13 == var14) {
                    var8[var11] = this.field5594 * var12 >> 12;
                    var9[var11] = this.field5588 * var13 >> 12;
                    var10[var11] = this.field5591 * var14 >> 12;
                } else {
                    var8[var11] = this.field5594;
                    var9[var11] = this.field5588;
                    var10[var11] = this.field5591;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        ++field5589;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field5591 = arg0.method723((byte) -25);
                }
            } else {
                this.field5588 = arg0.method723((byte) -25);
            }
        } else {
            this.field5594 = arg0.method723((byte) -25);
        }
        if (arg2 != 3) {
            this.field5588 = -103;
        }
    }
}
