import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 extends class175 {

    @OriginalMember(owner = "client!to", name = "L", descriptor = "I")
    private int field68 = 10;

    @OriginalMember(owner = "client!to", name = "Q", descriptor = "I")
    private int field73 = 2048;

    @OriginalMember(owner = "client!to", name = "M", descriptor = "I")
    private int field69 = 0;

    @OriginalMember(owner = "client!to", name = "N", descriptor = "I")
    public static int field70 = 0;

    @OriginalMember(owner = "client!to", name = "E", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!to", name = "H", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!to", name = "I", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!to", name = "O", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!to", name = "P", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!to", name = "S", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!to", name = "R", descriptor = "Luq;")
    public static class172 field74;

    @OriginalMember(owner = "client!to", name = "F", descriptor = "[I")
    private int[] field63;

    @OriginalMember(owner = "client!to", name = "G", descriptor = "[I")
    private int[] field64;

    @OriginalMember(owner = "client!to", name = "K", descriptor = "[[Z")
    public static boolean[][] field67;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "(I)V")
    public static void method42(int arg0) {
        if (arg0 == 24171) {
            field74 = null;
            field67 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IILjja;III)V")
    public static final void method43(int arg0, int arg1, class119 arg2, int arg3, int arg4, int arg5) {
        ++field62;
        if (~arg2.field1584 != 0 || arg2.field1596 != null) {
            int var6 = 0;
            int var7 = arg2.field1591 * class125.field1721.field5169.method1871(43) >> 8;
            if (arg4 <= arg2.field1588) {
                if (arg4 < arg2.field1582) {
                    var6 += -arg4 + arg2.field1582;
                }
            } else {
                var6 += -arg2.field1588 + arg4;
            }
            if (~arg2.field1586 <= ~arg1) {
                if (arg2.field1583 > arg1) {
                    var6 += -arg1 + arg2.field1583;
                }
            } else {
                var6 += -arg2.field1586 + arg1;
            }
            if (arg3 != 24828) {
                method45(20, -81);
            }
            if (arg2.field1612 != 0 && ~arg2.field1612 <= ~(var6 + -256) && class125.field1721.field5169.method1871(43) != 0 && arg2.field1608 == arg0) {
                var6 -= 256;
                if (var6 < 0) {
                    var6 = 0;
                }
                int var8 = -arg2.field1601 + arg2.field1612;
                if (var8 < 0) {
                    var8 = arg2.field1612;
                }
                int var9 = var7;
                int var10 = -arg2.field1601 + var6;
                if (var10 > 0 && ~var8 < -1) {
                    var9 = (var8 - var10) * var7 / var8;
                }
                class625.field8475.method2563(-12840);
                int var11 = 8192;
                int var12 = (arg2.field1588 + arg2.field1582) / 2 + -arg4;
                int var13 = (arg2.field1586 + arg2.field1583) / 2 + -arg1;
                if (var12 != 0 || var13 != 0) {
                    int var14 = 16383 & -class41.field442 + -4096 + -((int) (Math.atan2((double) var12, (double) var13) * 2607.5945876176133D));
                    if (var14 > 8192) {
                        var14 = -var14 + 16384;
                    }
                    int var15;
                    if (~var6 >= -1) {
                        var15 = 8192;
                    } else if (~var6 > -4097) {
                        var15 = var6 * 8192 / 4096 + 8192;
                    } else {
                        var15 = 16384;
                    }
                    var11 = var14 * var15 / 8192 - -(-var15 + 16384 >> 1);
                }
                if (arg2.field1599 != null) {
                    arg2.field1599.method1914(var9);
                    arg2.field1599.method1919(var11);
                } else if (~arg2.field1584 <= -1) {
                    int var16 = arg2.field1602 == 256 && arg2.field1604 == 256 ? 256 : class270.method1799(2, arg2.field1602, arg2.field1604);
                    if (arg2.field1593) {
                        if (arg2.field1603 == null) {
                            arg2.field1603 = class590.method3321(field74, arg2.field1584);
                        }
                        if (arg2.field1603 != null) {
                            if (arg2.field1597 == null) {
                                arg2.field1597 = arg2.field1603.method3315(new int[] { 22050 });
                            }
                            if (arg2.field1597 != null) {
                                class296 var17 = class296.method1925(arg2.field1597, var16, var9 << 6, var11);
                                var17.method1907(-1);
                                class701.field9285.method21(var17);
                                arg2.field1599 = var17;
                            }
                        }
                    } else {
                        class633 var18 = class633.method3490(class54.field643, arg2.field1584, 0);
                        if (var18 != null) {
                            class78 var19 = var18.method3492().method631(class548.field7564);
                            class296 var20 = class296.method1925(var19, var16, var9 << 6, var11);
                            var20.method1907(-1);
                            class701.field9285.method21(var20);
                            arg2.field1599 = var20;
                        }
                    }
                }
                if (arg2.field1590 != null) {
                    arg2.field1590.method1914(var9);
                    arg2.field1590.method1919(var11);
                    if (!arg2.field1590.method1104(3)) {
                        arg2.field1587 = null;
                        arg2.field1590 = null;
                        arg2.field1589 = null;
                    }
                } else {
                    if (arg2.field1596 != null && (arg2.field1598 -= arg5) <= 0) {
                        int var21 = ~arg2.field1602 == -257 && arg2.field1604 == 256 ? 256 : (int) (Math.random() * (double) (-arg2.field1604 + arg2.field1602)) - -arg2.field1604;
                        if (arg2.field1581) {
                            if (arg2.field1587 == null) {
                                int var22 = (int) (Math.random() * (double) arg2.field1596.length);
                                arg2.field1587 = class590.method3321(field74, arg2.field1596[var22]);
                            }
                            if (arg2.field1587 != null) {
                                if (arg2.field1589 == null) {
                                    arg2.field1589 = arg2.field1587.method3315(new int[] { 22050 });
                                }
                                if (arg2.field1589 != null) {
                                    class296 var23 = class296.method1925(arg2.field1589, var21, var9 << 6, var11);
                                    var23.method1907(0);
                                    class701.field9285.method21(var23);
                                    arg2.field1590 = var23;
                                    arg2.field1598 = (int) (Math.random() * (double) (-arg2.field1610 + arg2.field1595)) + arg2.field1610;
                                    return;
                                }
                            }
                            return;
                        }
                        int var24 = (int) (Math.random() * (double) arg2.field1596.length);
                        class633 var25 = class633.method3490(class54.field643, arg2.field1596[var24], 0);
                        if (var25 != null) {
                            class78 var26 = var25.method3492().method631(class548.field7564);
                            class296 var27 = class296.method1925(var26, var21, var9 << 6, var11);
                            var27.method1907(0);
                            class701.field9285.method21(var27);
                            arg2.field1590 = var27;
                            arg2.field1598 = arg2.field1610 - -((int) ((double) (-arg2.field1610 + arg2.field1595) * Math.random()));
                            return;
                        }
                    }
                }
            } else {
                if (arg2.field1599 != null) {
                    class701.field9285.method22(arg2.field1599);
                    arg2.field1603 = null;
                    arg2.field1599 = null;
                    arg2.field1597 = null;
                }
                if (arg2.field1590 != null) {
                    class701.field9285.method22(arg2.field1590);
                    arg2.field1590 = null;
                    arg2.field1589 = null;
                    arg2.field1587 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILdt;Z)V")
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field69 = arg1.method1731((byte) 64);
                }
            } else {
                this.field73 = arg1.method1728((byte) 6);
            }
        } else {
            this.field68 = arg1.method1731((byte) 64);
        }
        if (!arg2) {
            ++field65;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(II)I")
    public static final int method45(int arg0, int arg1) {
        int var7 = arg1 - 1;
        ++field66;
        if (arg0 != 23714) {
            field67 = null;
        }
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V")
    public final void method46(int arg0) {
        ++field75;
        if (arg0 == -8) {
            this.method48((byte) -78);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ZI)[I")
    public final int[] method47(boolean arg0, int arg1) {
        ++field72;
        int[] var3 = super.field2310.method91(0, arg1);
        if (!arg0) {
            this.method46(90);
        }
        if (super.field2310.field169) {
            int var4 = class456.field6536[arg1];
            if (this.field69 == 0) {
                short var5 = 0;
                for (int var6 = 0; this.field68 > var6; ++var6) {
                    if (this.field64[var6] <= var4 && var4 < this.field64[var6 + 1]) {
                        if (~var4 > ~this.field63[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class421.method2532(var3, 0, class598.field8136, var5);
            } else {
                for (int var7 = 0; var7 < class598.field8136; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class693.field9221[var7];
                    int var11 = this.field69;
                    if (var11 != 1) {
                        if (var11 != 2) {
                            if (~var11 == -4) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = (var4 - 4096 + var10 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; ~this.field68 < ~var12; ++var12) {
                        if (~var8 <= ~this.field64[var12] && this.field64[var12 + 1] > var8) {
                            if (this.field63[var12] > var8) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "()V")
    public class8() {
        super(0, true);
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(B)V")
    private final void method48(byte arg0) {
        ++field71;
        this.field64 = new int[this.field68 + 1];
        this.field63 = new int[this.field68 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field68;
        int var4 = this.field73 * var3 >> 12;
        for (int var5 = 0; ~var5 > ~this.field68; ++var5) {
            this.field64[var5] = var2;
            this.field63[var5] = var2 - -var4;
            var2 += var3;
        }
        if (arg0 > -71) {
            this.field63 = null;
        }
        this.field64[this.field68] = 4096;
        this.field63[this.field68] = this.field63[0] + 4096;
    }
}
