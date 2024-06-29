import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class91 extends class459 implements class302 {

    @OriginalMember(owner = "client!kba", name = "bb", descriptor = "Z")
    private boolean field1101;

    @OriginalMember(owner = "client!kba", name = "kb", descriptor = "B")
    private byte field1110;

    @OriginalMember(owner = "client!kba", name = "Q", descriptor = "B")
    private byte field1090;

    @OriginalMember(owner = "client!kba", name = "ob", descriptor = "S")
    private short field1114;

    @OriginalMember(owner = "client!kba", name = "S", descriptor = "Z")
    private boolean field1092;

    @OriginalMember(owner = "client!kba", name = "ib", descriptor = "Z")
    private boolean field1108;

    @OriginalMember(owner = "client!kba", name = "gb", descriptor = "Z")
    private boolean field1106;

    @OriginalMember(owner = "client!kba", name = "T", descriptor = "Lha;")
    private class54 field1093;

    @OriginalMember(owner = "client!kba", name = "R", descriptor = "Lda;")
    public class55 field1091;

    @OriginalMember(owner = "client!kba", name = "qb", descriptor = "F")
    public static float field1116;

    @OriginalMember(owner = "client!kba", name = "K", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!kba", name = "L", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!kba", name = "M", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!kba", name = "N", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!kba", name = "O", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!kba", name = "P", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!kba", name = "U", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!kba", name = "V", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!kba", name = "W", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!kba", name = "X", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!kba", name = "Y", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!kba", name = "ab", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!kba", name = "cb", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!kba", name = "db", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!kba", name = "eb", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!kba", name = "fb", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!kba", name = "hb", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!kba", name = "jb", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!kba", name = "lb", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!kba", name = "mb", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!kba", name = "nb", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!kba", name = "pb", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!kba", name = "rb", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!kba", name = "Z", descriptor = "Lll;")
    private class334 field1099;

    @OriginalMember(owner = "client!kba", name = "I", descriptor = "Lhca;")
    public static class454 field1083;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(B)I", line = 3)
    public final int method394(byte arg0) {
        ++field1094;
        int var2 = 43 % ((arg0 - -14) / 51);
        return this.field1114 & 65535;
    }

    @OriginalMember(owner = "client!kba", name = "h", descriptor = "(B)I", line = 22)
    public final int method810(byte arg0) {
        if (arg0 != -38) {
            this.field1101 = true;
        }
        ++field1086;
        return this.field1091 != null ? this.field1091.method646() / 4 : 15;
    }

    @OriginalMember(owner = "client!kba", name = "e", descriptor = "(B)Z", line = 33)
    public final boolean method398(byte arg0) {
        if (arg0 >= -92) {
            this.method403(-71, (class167) null);
        }
        ++field1098;
        return this.field1108;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IBLr;)Lda;", line = 45)
    private final class55 method811(int arg0, byte arg1, class167 arg2) {
        if (arg1 != -78) {
            this.method393(-99);
        }
        ++field1097;
        if (this.field1091 != null && arg2.method323(this.field1091.method651(), arg0) == 0) {
            return this.field1091;
        } else {
            class564 var4 = this.method815(false, arg0, arg2, (byte) 125);
            return var4 == null ? null : var4.field8102;
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lr;I)V", line = 66)
    public final void method407(class167 arg0, int arg1) {
        int var3 = 109 / ((arg1 - -10) / 40);
        ++field1102;
        Object var4 = null;
        class54 var6;
        if (this.field1093 == null && this.field1106) {
            class564 var5 = this.method815(true, 262144, arg0, (byte) 71);
            var6 = var5 != null ? var5.field8103 : null;
        } else {
            var6 = this.field1093;
            this.field1093 = null;
        }
        if (var6 != null) {
            class458.method2871(var6, super.field9703, super.field9696, super.field9705, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(ZILr;I)Z", line = 93)
    public final boolean method392(boolean arg0, int arg1, class167 arg2, int arg3) {
        ++field1100;
        class55 var5 = this.method811(131072, (byte) -78, arg2);
        if (var5 != null) {
            class393 var6 = arg2.method339();
            var6.method503(super.field9696, super.field9701, super.field9705);
            return !class534.field7778 ? var5.method648(arg3, arg1, var6, false) : var5.method598(arg3, arg1, var6, false, class609.field8652);
        } else {
            if (arg0) {
                this.field1093 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!kba", name = "g", descriptor = "(I)I", line = 116)
    public final int method393(int arg0) {
        if (arg0 != 0) {
            method812(false, (int[][]) null);
        }
        ++field1089;
        return this.field1091 == null ? 0 : this.field1091.method623();
    }

    @OriginalMember(owner = "client!kba", name = "g", descriptor = "(B)I", line = 131)
    public final int method406(byte arg0) {
        ++field1109;
        if (arg0 <= 108) {
            return -109;
        } else {
            return this.field1091 == null ? 0 : this.field1091.method612();
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIILr;ZILpn;)V", line = 143)
    public final void method415(int arg0, int arg1, int arg2, class167 arg3, boolean arg4, int arg5, class692 arg6) {
        if (arg6 instanceof class353) {
            class353 var8 = (class353) arg6;
            if (this.field1091 != null && var8.field5604 != null) {
                this.field1091.method641(var8.field5604, arg1, arg0, arg5, arg4);
            }
        } else if (arg6 instanceof class91) {
            class91 var9 = (class91) arg6;
            if (this.field1091 != null && var9.field1091 != null) {
                this.field1091.method641(var9.field1091, arg1, arg0, arg5, arg4);
            }
        }
        if (arg2 == 1) {
            ++field1105;
        }
    }

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "(B)I", line = 173)
    public final int method401(byte arg0) {
        if (arg0 < 50) {
            this.field1093 = null;
        }
        ++field1113;
        return this.field1110;
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Lr;Llr;IIIIIZIIIIIIZ)V", line = 184)
    public class91(class167 arg0, class698 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field9786 == -2, class487.method2992(arg12, (byte) -66, arg13));
        this.field1101 = ~arg1.field9830 != -1 && !arg7;
        this.field1110 = (byte) arg13;
        super.field9703 = (byte) arg3;
        this.field1090 = (byte) arg12;
        this.field1114 = (short) arg1.field9825;
        this.field1092 = arg7;
        this.field1108 = arg14;
        this.field1106 = arg0.method262() && arg1.field9812 && !this.field1092 && ~class17.field282.method2133(true, class497.field7259) != -1;
        int var16 = 2048;
        if (this.field1108) {
            var16 |= 65536;
        }
        class564 var17 = this.method815(this.field1106, var16, arg0, (byte) 119);
        if (var17 != null) {
            this.field1093 = var17.field8103;
            this.field1091 = var17.field8102;
            if (this.field1108) {
                this.field1091 = this.field1091.method609((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(BLr;)Lll;", line = 220)
    public final class334 method408(byte arg0, class167 arg1) {
        if (arg0 != 111) {
            return null;
        } else {
            if (this.field1099 == null) {
                this.field1099 = class166.method1342(this.method811(0, (byte) -78, arg1), super.field9705, super.field9696, super.field9701, 30640);
            }
            ++field1112;
            return this.field1099;
        }
    }

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(ILr;)Lod;", line = 234)
    public final class468 method403(int arg0, class167 arg1) {
        ++field1103;
        if (this.field1091 == null) {
            return null;
        } else if (arg0 > -38) {
            return null;
        } else {
            class393 var3 = arg1.method339();
            var3.method503(super.field9696, super.field9701, super.field9705);
            class468 var4 = null;
            if (this.field1101) {
                var4 = class429.method2720(1, 0);
            }
            if (!class534.field7778) {
                this.field1091.method606(var3, var4 == null ? null : var4.field6948[0], 0);
            } else {
                this.field1091.method613(var3, var4 != null ? var4.field6948[0] : null, class609.field8652, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(ILr;)V", line = 265)
    public final void method396(int arg0, class167 arg1) {
        ++field1115;
        if (arg0 != -32646) {
            this.field1092 = false;
        }
        Object var3 = null;
        class54 var5;
        if (this.field1093 == null && this.field1106) {
            class564 var4 = this.method815(true, 262144, arg1, (byte) 74);
            var5 = var4 == null ? null : var4.field8103;
        } else {
            var5 = this.field1093;
            this.field1093 = null;
        }
        if (var5 != null) {
            class143.method1214(var5, super.field9703, super.field9696, super.field9705, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)Z", line = 292)
    public final boolean method395(int arg0) {
        if (arg0 != -29400) {
            field1116 = 0.017893428F;
        }
        ++field1088;
        return this.field1106;
    }

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(B)I", line = 303)
    public final int method413(byte arg0) {
        if (arg0 != 11) {
            return -73;
        } else {
            ++field1117;
            return this.field1090;
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lr;Z)V", line = 318)
    public final void method412(class167 arg0, boolean arg1) {
        ++field1107;
        if (arg1) {
            this.field1093 = null;
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Z[[I)V", line = 331)
    public static final void method812(boolean arg0, int[][] arg1) {
        class39.field527 = arg1;
        ++field1096;
        if (arg0) {
            method814(38);
        }
    }

    @OriginalMember(owner = "client!kba", name = "h", descriptor = "(I)Z", line = 343)
    public final boolean method414(int arg0) {
        if (arg0 != 0) {
            this.method401((byte) 71);
        }
        ++field1111;
        return true;
    }

    @OriginalMember(owner = "client!kba", name = "i", descriptor = "(I)Z", line = 355)
    public final boolean method402(int arg0) {
        if (arg0 != 623404585) {
            method813(-25, 104);
        }
        ++field1084;
        return this.field1091 != null ? this.field1091.method614() : false;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(II)I", line = 371)
    public static final int method813(int arg0, int arg1) {
        ++field1087;
        if (arg0 != 65535) {
            return -82;
        } else {
            int var2 = arg1 & 63;
            int var3 = 3 & arg1 >> 6;
            if (~var2 != -19) {
                if (~var2 == -20 || ~var2 == -22) {
                    if (var3 == 0) {
                        return 16;
                    }
                    if (~var3 == -2) {
                        return 32;
                    }
                    if (~var3 == -3) {
                        return 64;
                    }
                    if (var3 == 3) {
                        return 128;
                    }
                }
            } else {
                if (~var3 == -1) {
                    return 1;
                }
                if (~var3 == -2) {
                    return 2;
                }
                if (~var3 == -3) {
                    return 4;
                }
                if (~var3 == -4) {
                    return 8;
                }
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!kba", name = "k", descriptor = "(I)V", line = 429)
    public static void method814(int arg0) {
        field1083 = null;
        if (arg0 != 32) {
            method813(51, -45);
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(ZILr;B)Lraa;", line = 439)
    private final class564 method815(boolean arg0, int arg1, class167 arg2, byte arg3) {
        if (arg3 < 25) {
            this.method413((byte) -80);
        }
        ++field1085;
        class698 var5 = class213.field3537.method94(65535 & this.field1114, (byte) -42);
        class37 var6;
        class37 var7;
        if (this.field1092) {
            var6 = class493.field7208[super.field9703];
            var7 = class491.field7187[0];
        } else {
            var6 = class491.field7187[super.field9703];
            if (~super.field9703 <= -4) {
                var7 = null;
            } else {
                var7 = class491.field7187[super.field9703 + 1];
            }
        }
        return var5.method3933(super.field9696, var6, arg2, arg1, var7, ~this.field1090 == -12 ? this.field1110 + 4 : this.field1110, -1, arg0, super.field9701, ~this.field1090 != -12 ? this.field1090 : 10, super.field9705);
    }

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(I)V", line = 469)
    public final void method409(int arg0) {
        if (this.field1091 != null) {
            this.field1091.method626();
        }
        ++field1104;
        if (arg0 != -7728) {
            this.field1090 = -10;
        }
    }

    @OriginalMember(owner = "client!kba", name = "f", descriptor = "(B)V", line = 482)
    public final void method404(byte arg0) {
        if (arg0 < -40) {
            this.field1108 = false;
            ++field1095;
            if (this.field1091 != null) {
                this.field1091.method629(-65537 & this.field1091.method651());
            }
        }
    }
}
