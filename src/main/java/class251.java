import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class251 extends class216 {

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    private int field4170 = -32768;

    @OriginalMember(owner = "client!gf", name = "K", descriptor = "I")
    private int field4196 = 0;

    @OriginalMember(owner = "client!gf", name = "O", descriptor = "Z")
    private boolean field4200 = false;

    @OriginalMember(owner = "client!gf", name = "N", descriptor = "Z")
    private boolean field4199 = false;

    @OriginalMember(owner = "client!gf", name = "C", descriptor = "I")
    private int field4188 = 0;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    private int field4168;

    @OriginalMember(owner = "client!gf", name = "S", descriptor = "I")
    private int field4204;

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "I")
    private int field4184;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public int field4167;

    @OriginalMember(owner = "client!gf", name = "B", descriptor = "I")
    public int field4187;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    private int field4169;

    @OriginalMember(owner = "client!gf", name = "L", descriptor = "I")
    public int field4197;

    @OriginalMember(owner = "client!gf", name = "P", descriptor = "I")
    private int field4201;

    @OriginalMember(owner = "client!gf", name = "G", descriptor = "I")
    public int field4192;

    @OriginalMember(owner = "client!gf", name = "U", descriptor = "I")
    public int field4206;

    @OriginalMember(owner = "client!gf", name = "F", descriptor = "I")
    private int field4191;

    @OriginalMember(owner = "client!gf", name = "D", descriptor = "Lwa;")
    private class312 field4189;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "Lph;")
    public static class229 field4172 = class266.method1858("Votre liste d(Wamis est pleine (X100 noms maximum pour la version gratuite et 200 pour les abonn-Bs(Y)3", 0);

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
    public static int field4181 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "Lph;")
    public static class229 field4174 = class266.method1858("Jeter", 0);

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "Lfe;")
    public static class97 field4176 = new class97(8);

    @OriginalMember(owner = "client!gf", name = "W", descriptor = "Lul;")
    public static class203 field4208 = new class203();

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "D")
    public double field4171;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "D")
    private double field4173;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "D")
    private double field4182;

    @OriginalMember(owner = "client!gf", name = "A", descriptor = "D")
    public double field4186;

    @OriginalMember(owner = "client!gf", name = "H", descriptor = "D")
    private double field4193;

    @OriginalMember(owner = "client!gf", name = "Q", descriptor = "D")
    public double field4202;

    @OriginalMember(owner = "client!gf", name = "V", descriptor = "D")
    private double field4207;

    @OriginalMember(owner = "client!gf", name = "Y", descriptor = "D")
    private double field4210;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "I")
    public int field4179;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "I")
    private int field4185;

    @OriginalMember(owner = "client!gf", name = "I", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!gf", name = "J", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!gf", name = "M", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!gf", name = "R", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!gf", name = "T", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!gf", name = "E", descriptor = "Lbn;")
    private class194 field4190;

    @OriginalMember(owner = "client!gf", name = "X", descriptor = "[I")
    public static int[] field4209;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIIIIJILbn;)V", line = 10)
    public final void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class194 arg10) {
        field4183++;
        class286 var13 = this.method1765(1);
        if (var13 != null) {
            this.method1762(var13, -6807);
            var13.method185(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4190);
            this.field4170 = var13.method182();
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V", line = 56)
    public static void method1759(int arg0) {
        field4176 = null;
        if (arg0 != 30140) {
            method1759(43);
        }
        field4208 = null;
        field4172 = null;
        field4174 = null;
        field4209 = null;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "()I", line = 70)
    public final int method182() {
        field4178++;
        return this.field4170;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 331)
    public class251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field4168 = arg4;
        this.field4200 = false;
        this.field4204 = arg0;
        this.field4184 = arg3;
        this.field4167 = arg5;
        this.field4187 = arg9;
        this.field4169 = arg8;
        this.field4197 = arg6;
        this.field4201 = arg7;
        this.field4192 = arg10;
        this.field4206 = arg1;
        this.field4191 = arg2;
        int var12 = class259.method1799(20527, this.field4204).field4508;
        if (var12 == -1) {
            this.field4189 = null;
        } else {
            this.field4189 = class53.method362((byte) -88, var12);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIII)V", line = 83)
    public final void method183(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4198++;
        if (!this.field4199) {
            class286 var6 = this.method1765(1);
            if (var6 == null) {
                return;
            }
            this.method1762(var6, -6807);
        }
        if (this.field4190 != null) {
            this.field4190.method1370(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V", line = 113)
    public final void method1760(int arg0, int arg1) {
        this.field4200 = true;
        this.field4171 += this.field4210 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field4207;
        this.field4186 += (double) arg1 * this.field4173;
        field4175++;
        this.field4202 += (double) arg1 * this.field4182;
        this.field4207 += (double) arg1 * this.field4210;
        this.field4179 = (int) (Math.atan2(this.field4173, this.field4182) * 325.949D) + 1024 & 0x7FF;
        this.field4185 = (int) (Math.atan2(this.field4207, this.field4193) * 325.949D) & 0x7FF;
        if (this.field4189 != null) {
            this.field4196 += arg1;
            label31: while (true) {
                do {
                    do {
                        if (this.field4189.field5236[this.field4188] >= this.field4196) {
                            break label31;
                        }
                        this.field4196 -= this.field4189.field5236[this.field4188];
                        this.field4188++;
                    } while (this.field4188 < this.field4189.field5226.length);
                    this.field4188 -= this.field4189.field5228;
                } while (this.field4188 >= 0 && this.field4188 < this.field4189.field5226.length);
                this.field4188 = 0;
            }
        }
        if (arg0 != -18161) {
            this.field4191 = -18;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BIIII)V", line = 154)
    public final void method1761(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field4200) {
            double var6 = (double) (arg3 - this.field4191);
            double var8 = (double) (arg4 - this.field4184);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field4171 = (double) this.field4168;
            this.field4186 = (double) this.field4169 * var6 / var10 + (double) this.field4191;
            this.field4202 = (double) this.field4169 * var8 / var10 + (double) this.field4184;
        }
        field4203++;
        double var12 = (double) (this.field4197 + 1 - arg1);
        if (arg0 > -104) {
            this.field4186 = 0.18639379418672972D;
        }
        this.field4182 = ((double) arg4 - this.field4202) / var12;
        this.field4173 = ((double) arg3 - this.field4186) / var12;
        this.field4193 = Math.sqrt(this.field4182 * this.field4182 + this.field4173 * this.field4173);
        if (!this.field4200) {
            this.field4207 = -this.field4193 * Math.tan((double) this.field4201 * 0.02454369D);
        }
        this.field4210 = ((double) arg2 - this.field4171 - this.field4207 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lv;I)V", line = 186)
    private final void method1762(class286 arg0, int arg1) {
        field4194++;
        if (class99.field1675) {
            class322 var3 = (class322) arg0;
            if ((this.field4190 == null || this.field4190.field3197) && (var3.field5464 != null || var3.field5476 != null)) {
                this.field4190 = new class194(class319.field5393, 1, 1);
            }
            if (this.field4190 != null) {
                this.field4190.method1372(var3.field5464, var3.field5476, false, var3.field5448, var3.field5461, var3.field5459);
            }
        } else {
            class246 var4 = (class246) arg0;
            if ((this.field4190 == null || this.field4190.field3197) && (var4.field4083 != null || var4.field4064 != null)) {
                this.field4190 = new class194(class319.field5393, 1, 1);
            }
            if (this.field4190 != null) {
                this.field4190.method1372(var4.field4083, var4.field4064, false, var4.field4072, var4.field4080, var4.field4068);
            }
        }
        if (arg1 != -6807) {
            this.field4191 = 62;
        }
        this.field4199 = true;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljj;Ljj;I)V", line = 225)
    public static final void method1763(class29 arg0, class29 arg1, int arg2) {
        field4205++;
        if (arg1.field473 != null) {
            arg1.method224(128);
        }
        arg1.field473 = arg0;
        arg1.field467 = arg0.field467;
        arg1.field473.field467 = arg1;
        if (arg2 == 0) {
            arg1.field467.field473 = arg1;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLph;)Z", line = 251)
    public static final boolean method1764(byte arg0, class229 arg1) {
        field4195++;
        int var2 = 84 / ((29 - arg0) / 40);
        if (arg1 == null) {
            return false;
        }
        for (int var3 = 0; var3 < class216.field3555; var3++) {
            if (arg1.method1630(10, class108.field1820[var3])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)Lv;", line = 276)
    private final class286 method1765(int arg0) {
        field4177++;
        class269 var2 = class259.method1799(arg0 ^ 0x502E, this.field4204);
        class286 var3 = var2.method1868(this.field4188, (byte) -125);
        if (arg0 != 1) {
            this.field4185 = 6;
        }
        if (var3 == null) {
            return null;
        } else {
            var3.method1721(this.field4185);
            return var3;
        }
    }
}
