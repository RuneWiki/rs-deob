import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class492 extends class478 {

    @OriginalMember(owner = "client!vm", name = "B", descriptor = "I")
    private int field7090 = -1;

    @OriginalMember(owner = "client!vm", name = "M", descriptor = "I")
    private int field7101 = 0;

    @OriginalMember(owner = "client!vm", name = "Q", descriptor = "Z")
    private boolean field7105 = false;

    @OriginalMember(owner = "client!vm", name = "kb", descriptor = "I")
    private int field7124 = -32768;

    @OriginalMember(owner = "client!vm", name = "rb", descriptor = "I")
    private int field7131 = 0;

    @OriginalMember(owner = "client!vm", name = "ib", descriptor = "I")
    private int field7122;

    @OriginalMember(owner = "client!vm", name = "K", descriptor = "I")
    private int field7099;

    @OriginalMember(owner = "client!vm", name = "H", descriptor = "I")
    public int field7096;

    @OriginalMember(owner = "client!vm", name = "T", descriptor = "I")
    public int field7107;

    @OriginalMember(owner = "client!vm", name = "Z", descriptor = "I")
    public int field7113;

    @OriginalMember(owner = "client!vm", name = "fb", descriptor = "I")
    private int field7119;

    @OriginalMember(owner = "client!vm", name = "gb", descriptor = "I")
    public int field7120;

    @OriginalMember(owner = "client!vm", name = "pb", descriptor = "Z")
    private boolean field7129;

    @OriginalMember(owner = "client!vm", name = "I", descriptor = "I")
    private int field7097;

    @OriginalMember(owner = "client!vm", name = "C", descriptor = "Lkg;")
    private class183 field7091;

    @OriginalMember(owner = "client!vm", name = "V", descriptor = "Lqv;")
    public static class316 field7109 = new class316(60, -2);

    @OriginalMember(owner = "client!vm", name = "qb", descriptor = "[F")
    public static float[] field7130 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!vm", name = "tb", descriptor = "I")
    public static int field7133;

    @OriginalMember(owner = "client!vm", name = "O", descriptor = "D")
    private double field7103;

    @OriginalMember(owner = "client!vm", name = "U", descriptor = "D")
    private double field7108;

    @OriginalMember(owner = "client!vm", name = "W", descriptor = "D")
    private double field7110;

    @OriginalMember(owner = "client!vm", name = "X", descriptor = "D")
    private double field7111;

    @OriginalMember(owner = "client!vm", name = "db", descriptor = "D")
    private double field7117;

    @OriginalMember(owner = "client!vm", name = "hb", descriptor = "D")
    private double field7121;

    @OriginalMember(owner = "client!vm", name = "lb", descriptor = "D")
    private double field7125;

    @OriginalMember(owner = "client!vm", name = "ob", descriptor = "D")
    private double field7128;

    @OriginalMember(owner = "client!vm", name = "y", descriptor = "I")
    public static int field7087;

    @OriginalMember(owner = "client!vm", name = "z", descriptor = "I")
    public static int field7088;

    @OriginalMember(owner = "client!vm", name = "A", descriptor = "I")
    public static int field7089;

    @OriginalMember(owner = "client!vm", name = "D", descriptor = "I")
    public static int field7092;

    @OriginalMember(owner = "client!vm", name = "E", descriptor = "I")
    public static int field7093;

    @OriginalMember(owner = "client!vm", name = "F", descriptor = "I")
    public static int field7094;

    @OriginalMember(owner = "client!vm", name = "G", descriptor = "I")
    public static int field7095;

    @OriginalMember(owner = "client!vm", name = "J", descriptor = "I")
    public static int field7098;

    @OriginalMember(owner = "client!vm", name = "L", descriptor = "I")
    public static int field7100;

    @OriginalMember(owner = "client!vm", name = "N", descriptor = "I")
    public static int field7102;

    @OriginalMember(owner = "client!vm", name = "P", descriptor = "I")
    public static int field7104;

    @OriginalMember(owner = "client!vm", name = "S", descriptor = "I")
    public static int field7106;

    @OriginalMember(owner = "client!vm", name = "Y", descriptor = "I")
    public static int field7112;

    @OriginalMember(owner = "client!vm", name = "ab", descriptor = "I")
    public static int field7114;

    @OriginalMember(owner = "client!vm", name = "bb", descriptor = "I")
    public static int field7115;

    @OriginalMember(owner = "client!vm", name = "cb", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!vm", name = "eb", descriptor = "I")
    public static int field7118;

    @OriginalMember(owner = "client!vm", name = "jb", descriptor = "I")
    private int field7123;

    @OriginalMember(owner = "client!vm", name = "mb", descriptor = "I")
    public static int field7126;

    @OriginalMember(owner = "client!vm", name = "sb", descriptor = "I")
    public static int field7132;

    @OriginalMember(owner = "client!vm", name = "ub", descriptor = "I")
    private int field7134;

    @OriginalMember(owner = "client!vm", name = "nb", descriptor = "Luh;")
    private class115 field7127;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lka;Lqa;I)V")
    private final void method2882(class336 arg0, class167 arg1, int arg2) {
        ++field7087;
        class248[] var4 = arg0.method1172();
        class280[] var5 = arg0.method1144();
        if ((this.field7127 == null || this.field7127.field1706) && (var4 != null || var5 != null)) {
            this.field7127 = class115.method810(class24.field349);
        }
        if (this.field7127 != null) {
            this.field7127.method817(arg1, (long) class24.field349, var4, var5, false);
            this.field7127.method814(super.field6956, super.field6971, super.field6970, super.field6962, super.field6959);
        }
        if (arg2 > -118) {
            method2884(-126);
        }
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
    public class492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        super(arg1, arg2, class224.method1515(arg2, arg3, arg1, -631749433) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field7122 = arg4;
        this.field7099 = arg8;
        this.field7105 = false;
        this.field7096 = arg9;
        this.field7107 = arg5;
        this.field7113 = arg6;
        this.field7119 = arg0;
        this.field7120 = arg10;
        this.field7129 = arg11;
        this.field7097 = arg7;
        int var13 = class69.field1133.method1312(this.field7119, (byte) -39).field5596;
        if (~var13 == 0) {
            this.field7091 = null;
        } else {
            this.field7091 = class96.field1526.method2717(-126, var13);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
    public static void method2883(int arg0) {
        if (arg0 < 88) {
            method2889(69);
        }
        field7130 = null;
        field7109 = null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)V")
    public final void method549(boolean arg0) {
        ++field7132;
        if (arg0) {
            this.method1792(true);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V")
    public static final void method2884(int arg0) {
        ++field7098;
        if (class66.field1118 != null) {
            class66.field1118.method2961(125);
        }
        if (class445.field6350 != null) {
            class445.field6350.method2961(arg0 ^ 1667005532);
        }
        if (arg0 != 1667005479) {
            method2888(0, (class198) null, (byte) -16);
        }
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(B)V")
    public final void method127(byte arg0) {
        if (arg0 >= -94) {
            this.method1792(true);
        }
        ++field7118;
        super.field6962 = super.field6959 = (short) ((int) (this.field7103 / 128.0D));
        super.field6971 = super.field6970 = (short) ((int) (this.field7121 / 128.0D));
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lqa;II)Lka;")
    private final class336 method2885(class167 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.field7123 = -42;
        }
        ++field7088;
        class394 var4 = class69.field1133.method1312(this.field7119, (byte) -39);
        return var4.method2378(arg0, -19750, class96.field1526, this.field7101, arg1, this.field7131, this.field7090);
    }

    @OriginalMember(owner = "client!vm", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field7127 != null) {
            this.field7127.method813();
        }
        ++field7102;
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(Z)V")
    public final void method2886(boolean arg0) {
        if (this.field7127 != null) {
            this.field7127.method813();
        }
        ++field7115;
        if (!arg0) {
            method2889(34);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BI)V")
    public final void method2887(byte arg0, int arg1) {
        ++field7094;
        this.field7121 += (double) arg1 * this.field7125;
        if (arg0 > -33) {
            method2888(-29, (class198) null, (byte) -70);
        }
        this.field7105 = true;
        this.field7103 += (double) arg1 * this.field7110;
        if (this.field7129) {
            this.field7128 = (double) (class224.method1515((int) this.field7121, (int) this.field7103, super.field6956, -631749433) - this.field7122);
        } else if (this.field7097 != -1) {
            this.field7128 += this.field7108 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field7111;
            this.field7111 += (double) arg1 * this.field7108;
        } else {
            this.field7128 += (double) arg1 * this.field7111;
        }
        this.field7123 = 16383 & (int) (Math.atan2(this.field7125, this.field7110) * 2607.5945876176133D) + 8192;
        this.field7134 = 16383 & (int) (Math.atan2(this.field7111, this.field7117) * 2607.5945876176133D);
        if (this.field7091 != null) {
            this.field7101 += arg1;
            while (true) {
                do {
                    do {
                        if (this.field7091.field2713[this.field7131] >= this.field7101) {
                            return;
                        }
                        this.field7101 -= this.field7091.field2713[this.field7131];
                        ++this.field7131;
                        if (this.field7091.field2692.length <= this.field7131) {
                            this.field7131 -= this.field7091.field2691;
                            if (~this.field7131 > -1 || ~this.field7091.field2692.length >= ~this.field7131) {
                                this.field7131 = 0;
                            }
                        }
                        this.field7090 = this.field7131 + 1;
                    } while (this.field7090 < this.field7091.field2692.length);
                    this.field7090 -= this.field7091.field2691;
                } while (~this.field7090 <= -1 && this.field7091.field2692.length > this.field7090);
                this.field7090 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILqa;)Lnj;")
    public final class166 method554(int arg0, class167 arg1) {
        ++field7114;
        class336 var3 = this.method2885(arg1, 2048, arg0 + arg0);
        if (var3 == null) {
            return null;
        } else {
            class15 var4 = arg1.method312();
            var4.method44(this.field7134);
            var4.method36(this.field7123);
            var4.method37((int) this.field7121, (int) this.field7128, (int) this.field7103);
            if (this.field7127 != null) {
                class300 var5 = this.field7127.method819();
                arg1.method332(var3, var5, var4, (class48) null, 0);
            } else {
                var3.method1142(var4, (class48) null, 0);
            }
            this.field7124 = var3.method1130();
            this.method2882(var3, arg1, -124);
            return null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILtf;B)I")
    public static final int method2888(int arg0, class198 arg1, byte arg2) {
        ++field7095;
        if (arg2 > -75) {
            return -21;
        } else if (!client.method1395(arg1).method1885(arg0, -44) && arg1.field3020 == null) {
            return -1;
        } else {
            return arg1.field2913 != null && ~arg0 > ~arg1.field2913.length ? arg1.field2913[arg0] : -1;
        }
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(I)V")
    public static final void method2889(int arg0) {
        if (~class251.field3738 == -2 || class251.field3738 == 3 || class268.field4023 != class251.field3738 && (class251.field3738 == 0 || ~class268.field4023 == -1)) {
            class477.field6952 = 0;
            class329.field4838 = 0;
            class390.field5539.method2286((byte) 19);
        }
        ++field7089;
        class268.field4023 = class251.field3738;
        if (arg0 != -32768) {
            field7130 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(Z)I")
    public final int method1792(boolean arg0) {
        ++field7093;
        if (arg0) {
            this.field7111 = -2.3155657304908717D;
        }
        return this.field7124;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IBIII)V")
    public final void method2890(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field7100;
        if (!this.field7105) {
            double var6 = (double) (-super.field6961 + arg3);
            double var8 = (double) (-super.field6965 + arg0);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field7103 = (double) this.field7099 * var8 / var10 + (double) super.field6965;
            this.field7121 = (double) this.field7099 * var6 / var10 + (double) super.field6961;
            if (this.field7129) {
                this.field7128 = (double) (class224.method1515((int) this.field7121, (int) this.field7103, super.field6956, -631749433) - this.field7122);
            } else {
                this.field7128 = (double) super.field6954;
            }
        }
        double var12 = (double) (this.field7113 + 1 + -arg4);
        this.field7110 = ((double) arg0 + -this.field7103) / var12;
        this.field7125 = ((double) arg3 + -this.field7121) / var12;
        this.field7117 = Math.sqrt(this.field7125 * this.field7125 + this.field7110 * this.field7110);
        if (this.field7097 == -1) {
            this.field7111 = ((double) arg2 + -this.field7128) / var12;
        } else {
            if (!this.field7105) {
                this.field7111 = -this.field7117 * Math.tan((double) this.field7097 * 0.02454369D);
            }
            this.field7108 = ((double) arg2 - this.field7128 - this.field7111 * var12) * 2.0D / (var12 * var12);
        }
        if (arg1 > -120) {
            this.field7123 = -53;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIILqa;)Z")
    public final boolean method553(int arg0, int arg1, int arg2, class167 arg3) {
        ++field7126;
        if (arg2 < 42) {
            this.field7124 = -67;
        }
        return false;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIILqa;ZLee;Z)V")
    public final void method558(int arg0, int arg1, int arg2, class167 arg3, boolean arg4, class487 arg5, boolean arg6) {
        if (arg4) {
            this.field7127 = null;
        }
        ++field7116;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "(I)Z")
    public final boolean method556(int arg0) {
        if (arg0 != -1) {
            return true;
        } else {
            ++field7092;
            return false;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILdb;Lci;Lci;Lci;)Z")
    public static final boolean method2891(int arg0, class217 arg1, class320 arg2, class320 arg3, class320 arg4) {
        class336.field4972 = arg1;
        ++field7106;
        class80.field1307 = arg2;
        if (arg0 != -1) {
            method2891(-2, (class217) null, (class320) null, (class320) null, (class320) null);
        }
        class287.field4260 = arg3;
        class100.field1557 = arg4;
        return true;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lqa;B)V")
    public final void method552(class167 arg0, byte arg1) {
        ++field7104;
        class336 var3 = this.method2885(arg0, 0, 0);
        if (var3 != null) {
            class15 var4 = arg0.method312();
            var4.method44(this.field7134);
            var4.method36(this.field7123);
            var4.method37((int) this.field7121, (int) this.field7128, (int) this.field7103);
            this.field7124 = var3.method1130();
            if (arg1 < -119) {
                this.method2882(var3, arg0, -120);
            }
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(Lqa;B)Lem;")
    public final class154 method562(class167 arg0, byte arg1) {
        ++field7112;
        return arg1 >= -117 ? null : null;
    }

    static {
        new class44("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
        field7133 = -1;
    }
}
