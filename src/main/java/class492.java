import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class492 extends class434 {

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
    private int field7094 = -1;

    @OriginalMember(owner = "client!rj", name = "Z", descriptor = "I")
    private int field7114 = -32768;

    @OriginalMember(owner = "client!rj", name = "T", descriptor = "Z")
    private boolean field7108 = false;

    @OriginalMember(owner = "client!rj", name = "fb", descriptor = "I")
    private int field7120 = 0;

    @OriginalMember(owner = "client!rj", name = "jb", descriptor = "I")
    private int field7124 = 0;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    public int field7098;

    @OriginalMember(owner = "client!rj", name = "S", descriptor = "I")
    private int field7107;

    @OriginalMember(owner = "client!rj", name = "X", descriptor = "I")
    public int field7112;

    @OriginalMember(owner = "client!rj", name = "cb", descriptor = "I")
    private int field7117;

    @OriginalMember(owner = "client!rj", name = "ib", descriptor = "I")
    public int field7123;

    @OriginalMember(owner = "client!rj", name = "mb", descriptor = "I")
    private int field7127;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
    private int field7102;

    @OriginalMember(owner = "client!rj", name = "eb", descriptor = "I")
    public int field7119;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "Z")
    private boolean field7101;

    @OriginalMember(owner = "client!rj", name = "pb", descriptor = "Ljp;")
    private class55 field7130;

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "Lkc;")
    public static class157 field7105 = new class157("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!rj", name = "rb", descriptor = "I")
    public static int field7132 = 0;

    @OriginalMember(owner = "client!rj", name = "sb", descriptor = "I")
    public static int field7133 = 0;

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "D")
    private double field7091;

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "D")
    private double field7092;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "D")
    private double field7100;

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "D")
    private double field7104;

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "D")
    private double field7106;

    @OriginalMember(owner = "client!rj", name = "V", descriptor = "D")
    private double field7110;

    @OriginalMember(owner = "client!rj", name = "bb", descriptor = "D")
    private double field7116;

    @OriginalMember(owner = "client!rj", name = "qb", descriptor = "D")
    private double field7131;

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
    public static int field7093;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "I")
    public static int field7095;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
    public static int field7096;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "I")
    public static int field7097;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    public static int field7099;

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "I")
    private int field7103;

    @OriginalMember(owner = "client!rj", name = "U", descriptor = "I")
    public static int field7109;

    @OriginalMember(owner = "client!rj", name = "W", descriptor = "I")
    public static int field7111;

    @OriginalMember(owner = "client!rj", name = "Y", descriptor = "I")
    public static int field7113;

    @OriginalMember(owner = "client!rj", name = "ab", descriptor = "I")
    public static int field7115;

    @OriginalMember(owner = "client!rj", name = "db", descriptor = "I")
    public static int field7118;

    @OriginalMember(owner = "client!rj", name = "gb", descriptor = "I")
    public static int field7121;

    @OriginalMember(owner = "client!rj", name = "kb", descriptor = "I")
    public static int field7125;

    @OriginalMember(owner = "client!rj", name = "lb", descriptor = "I")
    public static int field7126;

    @OriginalMember(owner = "client!rj", name = "nb", descriptor = "I")
    public static int field7128;

    @OriginalMember(owner = "client!rj", name = "ob", descriptor = "I")
    private int field7129;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "Lbv;")
    private class471 field7090;

    @OriginalMember(owner = "client!rj", name = "hb", descriptor = "[Lya;")
    public static class11[] field7122;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V", line = 8)
    public static void method2912(byte arg0) {
        field7105 = null;
        field7122 = null;
        if (arg0 != 24) {
            field7133 = -100;
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(Lza;I)V", line = 21)
    public final void method166(class295 arg0, int arg1) {
        ++field7118;
        class285 var3 = this.method2914(arg0, 0, (byte) 73);
        if (var3 != null) {
            class512 var4 = arg0.method541();
            var4.method942(this.field7103);
            var4.method949(this.field7129);
            var4.method948((int) this.field7100, (int) this.field7116, (int) this.field7110);
            if (arg1 <= 7) {
                this.method158(-122, (byte) 36, 17, (class295) null);
            }
            this.field7114 = var3.method670();
            this.method2916(0, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)V", line = 50)
    public static final void method2913(int arg0, int arg1, int arg2) {
        boolean var3 = class103.field1632[0][arg1][arg2] != null && class103.field1632[0][arg1][arg2].field7829 != null;
        for (int var4 = arg0; var4 >= 0; --var4) {
            if (class103.field1632[var4][arg1][arg2] == null) {
                class532 var5 = class103.field1632[var4][arg1][arg2] = new class532(var4, arg1, arg2);
                if (var3) {
                    ++var5.field7842;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Llb;IZIBILza;)V", line = 70)
    public final void method161(class186 arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, class295 arg6) {
        if (arg4 < 54) {
            this.method169(-118);
        }
        ++field7096;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lza;IB)Le;", line = 82)
    private final class285 method2914(class295 arg0, int arg1, byte arg2) {
        if (arg2 != 73) {
            return null;
        } else {
            ++field7128;
            class350 var4 = class316.field4288.method2651((byte) 59, this.field7117);
            return var4.method2102(this.field7120, this.field7124, arg1, arg0, class50.field716, 98, this.field7094);
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V", line = 375)
    public class492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        super(arg1, arg2, -arg4 + class123.method893(arg3, arg2, (byte) -13, arg1), arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field7098 = arg10;
        this.field7107 = arg4;
        this.field7112 = arg5;
        this.field7108 = false;
        this.field7117 = arg0;
        this.field7123 = arg6;
        this.field7127 = arg8;
        this.field7102 = arg7;
        this.field7119 = arg9;
        this.field7101 = arg11;
        int var13 = class316.field4288.method2651((byte) 59, this.field7117).field5089;
        if (~var13 == 0) {
            this.field7130 = null;
        } else {
            this.field7130 = class50.field716.method831(var13, (byte) 54);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BI)V", line = 102)
    public final void method2915(byte arg0, int arg1) {
        ++field7115;
        this.field7100 += (double) arg1 * this.field7104;
        this.field7110 += (double) arg1 * this.field7091;
        if (arg0 == -76) {
            this.field7108 = true;
            if (this.field7101) {
                this.field7116 = (double) (class123.method893((int) this.field7110, (int) this.field7100, (byte) -13, super.field6279) + -this.field7107);
            } else if (this.field7102 == -1) {
                this.field7116 += (double) arg1 * this.field7106;
            } else {
                this.field7116 += this.field7092 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field7106;
                this.field7106 += (double) arg1 * this.field7092;
            }
            this.field7129 = 16383 & (int) (Math.atan2(this.field7104, this.field7091) * 2607.5945876176133D) + 8192;
            this.field7103 = 16383 & (int) (2607.5945876176133D * Math.atan2(this.field7106, this.field7131));
            if (this.field7130 != null) {
                this.field7120 += arg1;
                while (true) {
                    do {
                        do {
                            if (this.field7120 <= this.field7130.field788[this.field7124]) {
                                return;
                            }
                            this.field7120 -= this.field7130.field788[this.field7124];
                            ++this.field7124;
                            if (~this.field7130.field796.length >= ~this.field7124) {
                                this.field7124 -= this.field7130.field807;
                                if (this.field7124 < 0 || ~this.field7130.field796.length >= ~this.field7124) {
                                    this.field7124 = 0;
                                }
                            }
                            this.field7094 = this.field7124 - -1;
                        } while (this.field7094 < this.field7130.field796.length);
                        this.field7094 -= this.field7130.field807;
                    } while (this.field7094 >= 0 && this.field7130.field796.length > this.field7094);
                    this.field7094 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBILza;)Z", line = 163)
    public final boolean method158(int arg0, byte arg1, int arg2, class295 arg3) {
        if (arg1 < 58) {
            this.field7090 = null;
        }
        ++field7099;
        return false;
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)Z", line = 176)
    public final boolean method169(int arg0) {
        ++field7125;
        if (arg0 != -28206) {
            this.method2915((byte) -9, 64);
        }
        return false;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLza;)Lql;", line = 187)
    public final class121 method171(byte arg0, class295 arg1) {
        ++field7095;
        if (arg0 != -96) {
            this.method2914((class295) null, 74, (byte) 63);
        }
        class285 var3 = this.method2914(arg1, 2048, (byte) 73);
        if (var3 == null) {
            return null;
        } else {
            class512 var4 = arg1.method541();
            var4.method942(this.field7103);
            var4.method949(this.field7129);
            var4.method948((int) this.field7100, (int) this.field7116, (int) this.field7110);
            if (this.field7090 == null) {
                var3.method701(var4, (class305) null, 0);
            } else {
                class334 var5 = this.field7090.method2731();
                arg1.method553(var3, var5, var4, (class305) null, 0);
            }
            this.field7114 = var3.method670();
            this.method2916(0, var3, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILe;Lza;)V", line = 223)
    private final void method2916(int arg0, class285 arg1, class295 arg2) {
        ++field7093;
        class51[] var4 = arg1.method715();
        class502[] var5 = arg1.method709();
        if (arg0 == 0) {
            if ((this.field7090 == null || this.field7090.field6785) && (var4 != null || var5 != null)) {
                this.field7090 = new class471(class28.field417);
            }
            if (this.field7090 != null) {
                this.field7090.method2738(arg2, (long) class28.field417, var4, var5, false);
                this.field7090.method2734(super.field6279, super.field6290, super.field6288, super.field6277, super.field6282);
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "(I)V", line = 248)
    public final void method168(int arg0) {
        int var2 = 92 / ((43 - arg0) / 56);
        ++field7126;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rj", name = "finalize", descriptor = "()V", line = 258)
    protected final void finalize() {
        if (this.field7090 != null) {
            this.field7090.method2732();
        }
        ++field7109;
    }

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "(I)I", line = 269)
    public final int method836(int arg0) {
        ++field7113;
        if (arg0 != -32768) {
            this.method168(-2);
        }
        return this.field7114;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIBII)V", line = 286)
    public final void method2917(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (!this.field7108) {
            double var6 = (double) (-super.field6284 + arg1);
            double var8 = (double) (-super.field6287 + arg0);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field7100 = (double) this.field7127 * var6 / var10 + (double) super.field6284;
            this.field7110 = (double) this.field7127 * var8 / var10 + (double) super.field6287;
            if (this.field7101) {
                this.field7116 = (double) (class123.method893((int) this.field7110, (int) this.field7100, (byte) -13, super.field6279) + -this.field7107);
            } else {
                this.field7116 = (double) super.field6281;
            }
        }
        if (arg2 <= 113) {
            this.finalize();
        }
        ++field7111;
        double var12 = (double) (-arg4 + this.field7123 + 1);
        this.field7104 = ((double) arg1 - this.field7100) / var12;
        this.field7091 = ((double) arg0 - this.field7110) / var12;
        this.field7131 = Math.sqrt(this.field7104 * this.field7104 + this.field7091 * this.field7091);
        if (this.field7102 == -1) {
            this.field7106 = ((double) arg3 - this.field7116) / var12;
        } else {
            if (!this.field7108) {
                this.field7106 = -this.field7131 * Math.tan((double) this.field7102 * 0.02454369D);
            }
            this.field7092 = ((double) arg3 + -this.field7116 + -(this.field7106 * var12)) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "(I)V", line = 331)
    public final void method100(int arg0) {
        super.field6277 = super.field6282 = (short) ((int) (this.field7110 / 128.0D));
        if (arg0 != 0) {
            this.method168(-111);
        }
        super.field6290 = super.field6288 = (short) ((int) (this.field7100 / 128.0D));
        ++field7121;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V", line = 352)
    public final void method2918(int arg0) {
        ++field7097;
        if (arg0 < 77) {
            this.method2918(55);
        }
        if (this.field7090 != null) {
            this.field7090.method2732();
        }
    }
}
