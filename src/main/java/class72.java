import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class72 extends class177 {

    @OriginalMember(owner = "client!vl", name = "v", descriptor = "I")
    private int field1177 = -1;

    @OriginalMember(owner = "client!vl", name = "L", descriptor = "I")
    private int field1191 = 0;

    @OriginalMember(owner = "client!vl", name = "P", descriptor = "I")
    private int field1195 = 0;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
    private int field1168 = -1;

    @OriginalMember(owner = "client!vl", name = "O", descriptor = "Z")
    private boolean field1194 = true;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "I")
    private int field1165 = -32768;

    @OriginalMember(owner = "client!vl", name = "s", descriptor = "I")
    private int field1174 = 0;

    @OriginalMember(owner = "client!vl", name = "u", descriptor = "Ldm;")
    private class273 field1176 = null;

    @OriginalMember(owner = "client!vl", name = "E", descriptor = "I")
    private int field1185;

    @OriginalMember(owner = "client!vl", name = "D", descriptor = "I")
    private int field1184;

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "I")
    private int field1171;

    @OriginalMember(owner = "client!vl", name = "S", descriptor = "I")
    private int field1198;

    @OriginalMember(owner = "client!vl", name = "T", descriptor = "I")
    private int field1199;

    @OriginalMember(owner = "client!vl", name = "w", descriptor = "I")
    private int field1178;

    @OriginalMember(owner = "client!vl", name = "C", descriptor = "Ln;")
    private class271 field1183;

    @OriginalMember(owner = "client!vl", name = "R", descriptor = "I")
    private int field1197;

    @OriginalMember(owner = "client!vl", name = "N", descriptor = "I")
    private int field1193;

    @OriginalMember(owner = "client!vl", name = "B", descriptor = "I")
    public static int field1182 = 0;

    @OriginalMember(owner = "client!vl", name = "F", descriptor = "Lwl;")
    public static class81 field1186 = new class81(64);

    @OriginalMember(owner = "client!vl", name = "U", descriptor = "Lkh;")
    public static class13 field1200 = new class13(64);

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!vl", name = "t", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!vl", name = "x", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!vl", name = "y", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!vl", name = "H", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!vl", name = "J", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!vl", name = "K", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!vl", name = "Q", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!vl", name = "V", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!vl", name = "I", descriptor = "[I")
    public static int[] field1188;

    @OriginalMember(owner = "client!vl", name = "M", descriptor = "[I")
    public static int[] field1192;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZZ)Lme;", line = 5)
    private final class177 method514(boolean arg0, boolean arg1) {
        boolean var3 = class43.field677 != class106.field1783;
        field1172++;
        class145 var4 = class289.method2046(-12453, this.field1184);
        if (var4.field2454 != null) {
            var4 = var4.method1089(-88);
        }
        if (var4 == null) {
            if (class281.field4827 && !var3) {
                this.method517((byte) 95);
            }
            return null;
        }
        int var5 = this.field1199 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field2444;
            var7 = var4.field2442;
        } else {
            var6 = var4.field2442;
            var7 = var4.field2444;
        }
        int var8 = (var6 >> 1) + this.field1171;
        int var9 = (var7 >> 1) + this.field1185;
        int var10 = this.field1185 + (var7 + 1 >> 1);
        int var11 = this.field1171 + (var6 + 1 >> 1);
        this.method524(-1796378174, var8 * 128, var9 * 128);
        boolean var12 = !var3 && var4.field2480 && (this.field1168 != var4.field2458 || this.field1193 != this.field1177 && class13.field176 >= 2);
        if (arg0 && !var12) {
            return null;
        }
        int[][] var13 = class106.field1783[this.field1198];
        int var14 = var13[var8][var9] + var13[var8][var10] + var13[var11][var9] + var13[var11][var10] >> 2;
        int var15 = (this.field1185 << 7) + (var7 << 6);
        int[][] var16 = (int[][]) null;
        int var17 = (this.field1171 << 7) + (var6 << 6);
        if (var3) {
            var16 = class43.field677[0];
        } else if (this.field1198 < 3) {
            var16 = class106.field1783[this.field1198 + 1];
        }
        if (class281.field4827 && var12) {
            class35.method197(this.field1176, this.field1195, this.field1191, this.field1174);
        }
        boolean var18 = this.field1176 == null;
        class209 var19;
        if (this.field1183 == null) {
            var19 = var4.method1077(this.field1178, var16, var14, this.field1199, var13, var17, false, -128, var12, var15, var18 ? class38.field584 : this.field1176);
        } else {
            var19 = var4.method1082(var12, var13, this.field1199, var15, this.field1193, -19805, this.field1178, this.field1183, var14, var17, var18 ? class38.field584 : this.field1176, var16);
        }
        if (arg1) {
            this.method524(-112, -98, 89);
        }
        if (var19 == null) {
            return null;
        }
        if (class281.field4827 && var12) {
            if (var18) {
                class38.field584 = var19.field3572;
            }
            int var20 = 0;
            if (this.field1198 != 0) {
                int[][] var21 = class106.field1783[0];
                var20 = var14 - (var21[var8][var10] + var21[var11][var9] + var21[var8][var9] + var21[var11][var10] >> 2);
            }
            class273 var22 = var19.field3572;
            if (this.field1194 && class35.method203(var22, var17, var20, var15)) {
                this.field1194 = false;
            }
            if (!this.field1194) {
                class35.method210(var22, var17, var20, var15);
                if (var18) {
                    class38.field584 = null;
                }
                this.field1191 = var20;
                this.field1176 = var22;
                this.field1195 = var17;
                this.field1174 = var15;
            }
            this.field1168 = var4.field2458;
            this.field1177 = this.field1193;
        }
        return var19.field3573;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V", line = 137)
    public static void method515(int arg0) {
        field1186 = null;
        field1192 = null;
        field1188 = null;
        if (arg0 == 100) {
            field1200 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)Lme;", line = 151)
    private final class177 method516(int arg0) {
        field1167++;
        if (arg0 != 128) {
            this.method521(-21, 12, 112, 112, -64);
        }
        return this.method514(false, false);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "()I", line = 172)
    public final int method176() {
        field1169++;
        return this.field1165;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIIIIJ)V", line = 184)
    public final void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1166++;
        class177 var11 = this.method516(128);
        if (var11 != null) {
            var11.method168(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1165 = var11.method176();
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)V", line = 198)
    public final void method517(byte arg0) {
        if (this.field1176 != null) {
            class35.method197(this.field1176, this.field1195, this.field1191, this.field1174);
        }
        this.field1177 = -1;
        field1173++;
        if (arg0 == 95) {
            this.field1176 = null;
            this.field1168 = -1;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BIII)V", line = 220)
    public static final void method518(byte arg0, int arg1, int arg2, int arg3) {
        class53 var4 = class303.method2112(-1155040160, arg3, 11);
        field1180++;
        var4.method325((byte) -48);
        if (arg0 == 108) {
            var4.field819 = arg1;
            var4.field824 = arg2;
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(IIIII)V", line = 239)
    public static final void method519(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class30.field473 = arg3;
        field1181++;
        class261.field4427 = arg2;
        class125.field2082 = arg1;
        class11.field156 = arg0;
        if (arg4 != 128) {
            field1196 = -101;
        }
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(IIIIIIIZLme;)V", line = 468)
    public class72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class177 arg8) {
        this.field1185 = arg5;
        this.field1184 = arg0;
        this.field1171 = arg4;
        this.field1198 = arg3;
        this.field1199 = arg2;
        this.field1178 = arg1;
        if (class281.field4827 && arg8 != null) {
            if ((arg8 instanceof class72)) {
                ((class72) arg8).method517((byte) 95);
            } else {
                class145 var10 = class289.method2046(-12453, this.field1184);
                if (var10.field2454 != null) {
                    var10 = var10.method1089(-81);
                }
                if (var10 != null) {
                    class9.method48(0, 0, this.field1185, true, this.field1199, this.field1198, this.field1171, var10, this.field1178);
                }
            }
        }
        if (arg6 != -1) {
            this.field1183 = class181.method1269(112, arg6);
            this.field1197 = class277.field4768 - 1;
            this.field1193 = 0;
            if (this.field1183.field4674 == 0 && arg8 != null && arg8 instanceof class72) {
                class72 var11 = (class72) arg8;
                if (this.field1183 == var11.field1183) {
                    this.field1193 = var11.field1193;
                    this.field1197 = var11.field1197;
                    return;
                }
            }
            if (arg7 && this.field1183.field4648 != -1) {
                this.field1193 = (int) (Math.random() * (double) this.field1183.field4667.length);
                this.field1197 -= (int) (Math.random() * (double) this.field1183.field4680[this.field1193]);
            }
        }
        if (class281.field4827 && arg8 != null) {
            this.method514(true, false);
        }
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)V", line = 279)
    public static final void method520(int arg0) {
        if (arg0 != 64) {
            method515(41);
        }
        for (class294 var1 = (class294) class274.field4716.method1471((byte) 37); var1 != null; var1 = (class294) class274.field4716.method1475((byte) 83)) {
            if (var1.field5045 == -1) {
                var1.field5050 = 0;
                class296.method2083(var1, (byte) -124);
            } else {
                var1.method1502((byte) -82);
            }
        }
        field1189++;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIII)V", line = 309)
    public final void method521(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -19940) {
            field1201 = -89;
        }
        field1170++;
        if (class281.field4827) {
            this.method514(true, false);
        } else {
            this.method524(-1796378174, ((arg4 - arg2 >> 1) + arg2) * 128 + 64, ((-arg3 + arg1 >> 1) + arg3) * 128 + 64);
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(II)Z", line = 335)
    public static final boolean method522(int arg0, int arg1) {
        int var2 = 120 / ((25 - arg0) / 51);
        field1187++;
        return (arg1 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I", line = 347)
    public static final int method523(int arg0, KeyEvent arg1) {
        field1179++;
        int var2 = arg1.getKeyChar();
        if (arg0 != 0) {
            field1196 = 59;
        }
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(III)V", line = 376)
    private final void method524(int arg0, int arg1, int arg2) {
        if (this.field1183 != null) {
            int var4 = class277.field4768 - this.field1197;
            if (var4 > 100 && this.field1183.field4648 > 0) {
                int var5 = this.field1183.field4667.length - this.field1183.field4648;
                while (var5 > this.field1193 && var4 > this.field1183.field4680[this.field1193]) {
                    var4 -= this.field1183.field4680[this.field1193];
                    this.field1193++;
                }
                if (this.field1193 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field1183.field4667.length; var7++) {
                        var6 += this.field1183.field4680[var7];
                    }
                    var4 %= var6;
                }
            }
            label62: {
                do {
                    do {
                        if (this.field1183.field4680[this.field1193] >= var4) {
                            break label62;
                        }
                        class232.method1609(false, arg1, this.field1193, this.field1183, arg2, 26694);
                        var4 -= this.field1183.field4680[this.field1193];
                        this.field1193++;
                    } while (this.field1193 < this.field1183.field4667.length);
                    this.field1193 -= this.field1183.field4648;
                } while (this.field1193 >= 0 && this.field1183.field4667.length > this.field1193);
                this.field1183 = null;
            }
            this.field1197 = class277.field4768 - var4;
        }
        field1175++;
        if (arg0 != -1796378174) {
            field1201 = -31;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZIIIIIII)V", line = 445)
    public static final void method525(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0) {
            method520(4);
        }
        field1190++;
        if (arg2 == arg6) {
            class13.method64(true, arg4, arg1, arg7, arg2, arg5, arg3);
        } else if ((arg4 - arg2) >= class125.field2082 && (arg2 + arg4) <= class30.field473 && arg3 - arg6 >= class261.field4427 && (arg3 + arg6) <= class11.field156) {
            class250.method1720(arg5, arg3, 0, arg4, arg2, arg7, arg6, arg1);
        } else {
            class14.method71((byte) 116, arg4, arg7, arg2, arg1, arg5, arg3, arg6);
        }
    }
}
