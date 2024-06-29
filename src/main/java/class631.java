import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class631 extends class12 implements class721 {

    @OriginalMember(owner = "client!tq", name = "lb", descriptor = "S")
    private short field8826;

    @OriginalMember(owner = "client!tq", name = "P", descriptor = "Z")
    private boolean field8804;

    @OriginalMember(owner = "client!tq", name = "O", descriptor = "B")
    private byte field8803;

    @OriginalMember(owner = "client!tq", name = "Z", descriptor = "Z")
    private boolean field8814;

    @OriginalMember(owner = "client!tq", name = "cb", descriptor = "Z")
    private boolean field8817;

    @OriginalMember(owner = "client!tq", name = "Q", descriptor = "B")
    private byte field8805;

    @OriginalMember(owner = "client!tq", name = "fb", descriptor = "Z")
    private boolean field8820;

    @OriginalMember(owner = "client!tq", name = "W", descriptor = "Lr;")
    private class183 field8811;

    @OriginalMember(owner = "client!tq", name = "db", descriptor = "Lka;")
    public class473 field8818;

    @OriginalMember(owner = "client!tq", name = "L", descriptor = "I")
    public static int field8800;

    @OriginalMember(owner = "client!tq", name = "M", descriptor = "I")
    public static int field8801;

    @OriginalMember(owner = "client!tq", name = "N", descriptor = "I")
    public static int field8802;

    @OriginalMember(owner = "client!tq", name = "R", descriptor = "I")
    public static int field8806;

    @OriginalMember(owner = "client!tq", name = "S", descriptor = "I")
    public static int field8807;

    @OriginalMember(owner = "client!tq", name = "T", descriptor = "I")
    public static int field8808;

    @OriginalMember(owner = "client!tq", name = "U", descriptor = "I")
    public static int field8809;

    @OriginalMember(owner = "client!tq", name = "V", descriptor = "I")
    public static int field8810;

    @OriginalMember(owner = "client!tq", name = "X", descriptor = "I")
    public static int field8812;

    @OriginalMember(owner = "client!tq", name = "Y", descriptor = "I")
    public static int field8813;

    @OriginalMember(owner = "client!tq", name = "ab", descriptor = "I")
    public static int field8815;

    @OriginalMember(owner = "client!tq", name = "bb", descriptor = "I")
    public static int field8816;

    @OriginalMember(owner = "client!tq", name = "eb", descriptor = "I")
    public static int field8819;

    @OriginalMember(owner = "client!tq", name = "gb", descriptor = "I")
    public static int field8821;

    @OriginalMember(owner = "client!tq", name = "hb", descriptor = "I")
    public static int field8822;

    @OriginalMember(owner = "client!tq", name = "ib", descriptor = "I")
    public static int field8823;

    @OriginalMember(owner = "client!tq", name = "jb", descriptor = "I")
    public static int field8824;

    @OriginalMember(owner = "client!tq", name = "kb", descriptor = "I")
    public static int field8825;

    @OriginalMember(owner = "client!tq", name = "mb", descriptor = "I")
    public static int field8827;

    @OriginalMember(owner = "client!tq", name = "ob", descriptor = "I")
    public static int field8829;

    @OriginalMember(owner = "client!tq", name = "pb", descriptor = "I")
    public static int field8830;

    @OriginalMember(owner = "client!tq", name = "rb", descriptor = "I")
    public static int field8832;

    @OriginalMember(owner = "client!tq", name = "sb", descriptor = "I")
    public static int field8833;

    @OriginalMember(owner = "client!tq", name = "tb", descriptor = "I")
    public static int field8834;

    @OriginalMember(owner = "client!tq", name = "qb", descriptor = "Lria;")
    private class286 field8831;

    @OriginalMember(owner = "client!tq", name = "nb", descriptor = "Lvd;")
    public static class39 field8828;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IBLha;I)Z")
    public final boolean method312(int arg0, byte arg1, class60 arg2, int arg3) {
        ++field8810;
        if (arg1 >= -44) {
            return false;
        } else {
            class473 var5 = this.method3635(true, 131072, arg2);
            if (var5 != null) {
                class738 var6 = arg2.method442();
                var6.method774(super.field8423, super.field8421, super.field8428);
                return class418.field6258 ? var5.method283(arg0, arg3, var6, false, 0, class188.field2859) : var5.method277(arg0, arg3, var6, false, 0);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)I")
    public final int method317(int arg0) {
        if (arg0 <= 112) {
            this.method318(7, (class60) null);
        }
        ++field8816;
        return 65535 & this.field8826;
    }

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "(B)Z")
    public final boolean method320(byte arg0) {
        ++field8813;
        if (arg0 != 84) {
            return true;
        } else if (this.field8818 == null) {
            return true;
        } else {
            return !this.field8818.method262();
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lha;B)V")
    public final void method310(class60 arg0, byte arg1) {
        ++field8825;
        Object var3 = null;
        class183 var5;
        if (this.field8811 == null && this.field8820) {
            class77 var4 = this.method3636(arg0, 262144, true, 3);
            var5 = var4 != null ? var4.field1067 : null;
        } else {
            var5 = this.field8811;
            this.field8811 = null;
        }
        if (var5 != null) {
            class58.method405(var5, super.field8417, super.field8423, super.field8428, (boolean[]) null);
        }
        if (arg1 != -88) {
            this.field8805 = 117;
        }
    }

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "(B)I")
    public final int method315(byte arg0) {
        if (arg0 != 106) {
            return 112;
        } else {
            ++field8832;
            return this.field8818 == null ? 0 : this.field8818.method253();
        }
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lha;Lsu;IIIIIZIIZ)V")
    public class631(class60 arg0, class211 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class116.method854(arg8, arg9, 224));
        this.field8826 = (short) arg1.field3158;
        this.field8804 = ~arg1.field3113 != -1 && !arg7;
        this.field8803 = (byte) arg8;
        this.field8814 = arg7;
        super.field8428 = arg6;
        super.field8423 = arg4;
        this.field8817 = arg10;
        this.field8805 = (byte) arg9;
        this.field8820 = arg0.method456() && arg1.field3175 && !this.field8814 && ~class63.field916.field10185.method2160(17503) != -1;
        int var12 = 2048;
        if (this.field8817) {
            var12 |= 65536;
        }
        class77 var13 = this.method3636(arg0, var12, this.field8820, 3);
        if (var13 != null) {
            this.field8811 = var13.field1067;
            this.field8818 = var13.field1068;
            if (this.field8817) {
                this.field8818 = this.field8818.method251((byte) 0, var12, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "(B)Z")
    public final boolean method329(byte arg0) {
        ++field8824;
        int var2 = 123 / ((-33 - arg0) / 42);
        return this.field8818 != null ? this.field8818.method275() : false;
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(B)I")
    public final int method309(byte arg0) {
        ++field8812;
        if (arg0 >= -16) {
            this.method738((byte) 36);
        }
        return this.field8803;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZILha;)Lka;")
    private final class473 method3635(boolean arg0, int arg1, class60 arg2) {
        ++field8801;
        if (this.field8818 != null && arg2.method491(this.field8818.method255(), arg1) == 0) {
            return this.field8818;
        } else if (!arg0) {
            return null;
        } else {
            class77 var4 = this.method3636(arg2, arg1, false, 3);
            return var4 != null ? var4.field1068 : null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(Lha;B)Lc;")
    public final class187 method319(class60 arg0, byte arg1) {
        ++field8809;
        if (this.field8818 == null) {
            return null;
        } else {
            class738 var3 = arg0.method442();
            int var4 = -60 % ((-25 - arg1) / 60);
            var3.method774(super.field8423, super.field8421, super.field8428);
            class187 var5 = class650.method3774(108, this.field8804, 1);
            if (class418.field6258) {
                this.field8818.method235(var3, var5.field2851[0], class188.field2859, 0);
            } else {
                this.field8818.method265(var3, var5.field2851[0], 0);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!tq", name = "j", descriptor = "(B)I")
    public final int method313(byte arg0) {
        if (arg0 != 3) {
            return -21;
        } else {
            ++field8822;
            return this.field8818 == null ? 0 : this.field8818.method269();
        }
    }

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "(I)V")
    public final void method741(int arg0) {
        if (arg0 <= -93) {
            this.field8817 = false;
            ++field8827;
            if (this.field8818 != null) {
                this.field8818.method271(this.field8818.method255() & -65537);
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lha;Z)V")
    public final void method314(class60 arg0, boolean arg1) {
        if (!arg1) {
            ++field8829;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)Z")
    public final boolean method321(byte arg0) {
        if (arg0 >= -125) {
            return true;
        } else {
            ++field8834;
            return this.field8820;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILha;)V")
    public final void method318(int arg0, class60 arg1) {
        int var3 = 94 / ((arg0 - 8) / 57);
        ++field8815;
        Object var4 = null;
        class183 var6;
        if (this.field8811 == null && this.field8820) {
            class77 var5 = this.method3636(arg1, 262144, true, 3);
            var6 = var5 != null ? var5.field1067 : null;
        } else {
            var6 = this.field8811;
            this.field8811 = null;
        }
        if (var6 != null) {
            class467.method2833(var6, super.field8417, super.field8423, super.field8428, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lha;IZI)Lqw;")
    private final class77 method3636(class60 arg0, int arg1, boolean arg2, int arg3) {
        if (arg3 != 3) {
            return null;
        } else {
            ++field8807;
            class211 var5 = class239.field3470.method388(this.field8826 & 65535, 100);
            class280 var6;
            class280 var7;
            if (this.field8814) {
                var6 = class531.field7566[0];
                var7 = class46.field568[super.field8417];
            } else {
                if (super.field8417 >= 3) {
                    var6 = null;
                } else {
                    var6 = class531.field7566[super.field8417 + 1];
                }
                var7 = class531.field7566[super.field8417];
            }
            return var5.method1443((byte) 111, arg2, var6, this.field8805, super.field8421, arg1, (class572) null, this.field8803, arg0, super.field8423, super.field8428, var7);
        }
    }

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "(B)Z")
    public final boolean method738(byte arg0) {
        if (arg0 != 88) {
            method3639(' ', (byte) 15);
        }
        ++field8806;
        return this.field8817;
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)I")
    public final int method327(int arg0) {
        ++field8833;
        return arg0 > -116 ? -3 : this.field8805;
    }

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "(I)V")
    public static final void method3637(int arg0) {
        class395.field5937.method809(true);
        if (arg0 != 0) {
            method3639('\u0004', (byte) -89);
        }
        ++field8802;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILvs;ZILha;II)V")
    public final void method737(int arg0, class593 arg1, boolean arg2, int arg3, class60 arg4, int arg5, int arg6) {
        if (!(arg1 instanceof class631)) {
            if (arg1 instanceof class383) {
                class383 var8 = (class383) arg1;
                if (this.field8818 != null && var8.field5795 != null) {
                    this.field8818.method264(var8.field5795, arg6, arg3, arg5, arg2);
                }
            }
        } else {
            class631 var9 = (class631) arg1;
            if (this.field8818 != null && var9.field8818 != null) {
                this.field8818.method264(var9.field8818, arg6, arg3, arg5, arg2);
            }
        }
        ++field8823;
        if (arg0 != 8616) {
            this.method738((byte) 92);
        }
    }

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "(I)V")
    public static void method3638(int arg0) {
        if (arg0 != 26835) {
            field8819 = -20;
        }
        field8828 = null;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lha;I)Lria;")
    public final class286 method325(class60 arg0, int arg1) {
        ++field8830;
        if (arg1 != 92160000) {
            this.method316((byte) -44);
        }
        if (this.field8831 == null) {
            this.field8831 = class60.method527(this.method3635(true, 0, arg0), super.field8428, super.field8423, super.field8421, -22060);
        }
        return this.field8831;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(CB)B")
    public static final byte method3639(char arg0, byte arg1) {
        ++field8800;
        if (arg1 != -31) {
            method3637(-8);
        }
        byte var2;
        if ((~arg0 >= -1 || arg0 >= 128) && (~arg0 > -161 || arg0 > 255)) {
            if (arg0 != 8364) {
                if (~arg0 == -8219) {
                    var2 = -126;
                } else if (~arg0 == -403) {
                    var2 = -125;
                } else if (arg0 != 8222) {
                    if (arg0 != 8230) {
                        if (~arg0 != -8225) {
                            if (~arg0 != -8226) {
                                if (~arg0 == -711) {
                                    var2 = -120;
                                } else if (~arg0 != -8241) {
                                    if (~arg0 != -353) {
                                        if (arg0 != 8249) {
                                            if (arg0 != 338) {
                                                if (arg0 != 381) {
                                                    if (arg0 == 8216) {
                                                        var2 = -111;
                                                    } else if (~arg0 == -8218) {
                                                        var2 = -110;
                                                    } else if (~arg0 != -8221) {
                                                        if (arg0 == 8221) {
                                                            var2 = -108;
                                                        } else if (~arg0 != -8227) {
                                                            if (~arg0 != -8212) {
                                                                if (~arg0 != -8213) {
                                                                    if (~arg0 == -733) {
                                                                        var2 = -104;
                                                                    } else if (~arg0 == -8483) {
                                                                        var2 = -103;
                                                                    } else if (arg0 == 353) {
                                                                        var2 = -102;
                                                                    } else if (~arg0 != -8251) {
                                                                        if (~arg0 == -340) {
                                                                            var2 = -100;
                                                                        } else if (arg0 == 382) {
                                                                            var2 = -98;
                                                                        } else if (arg0 != 376) {
                                                                            var2 = 63;
                                                                        } else {
                                                                            var2 = -97;
                                                                        }
                                                                    } else {
                                                                        var2 = -101;
                                                                    }
                                                                } else {
                                                                    var2 = -105;
                                                                }
                                                            } else {
                                                                var2 = -106;
                                                            }
                                                        } else {
                                                            var2 = -107;
                                                        }
                                                    } else {
                                                        var2 = -109;
                                                    }
                                                } else {
                                                    var2 = -114;
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
                            var2 = -122;
                        }
                    } else {
                        var2 = -123;
                    }
                } else {
                    var2 = -124;
                }
            } else {
                var2 = -128;
            }
        } else {
            var2 = (byte) arg0;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(B)V")
    public final void method316(byte arg0) {
        ++field8808;
        if (arg0 != -66) {
            this.method312(-79, (byte) 36, (class60) null, -106);
        }
        if (this.field8818 != null) {
            this.field8818.method272();
        }
    }
}
