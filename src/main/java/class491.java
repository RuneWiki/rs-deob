import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class491 {

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "Lbm;")
    private class74 field7270 = null;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
    public int field7271;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "Z")
    private boolean field7262;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "Lwh;")
    private class99 field7269;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "Llt;")
    public static class475 field7279 = new class475("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "Llt;")
    public static class475 field7282 = new class475("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "I")
    public static int field7283 = 0;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field7241;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field7242;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field7243;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field7244;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field7246;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field7247;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field7248;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field7249;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field7250;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field7252;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field7254;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public static int field7255;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    public static int field7256;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    public static int field7257;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
    public static int field7258;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    public static int field7259;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    public static int field7260;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
    public static int field7261;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "I")
    public static int field7263;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
    public static int field7264;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    public static int field7265;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
    public static int field7266;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "I")
    public static int field7267;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
    public static int field7268;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
    public static int field7272;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "I")
    public static int field7273;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    public static int field7274;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
    public static int field7275;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
    public static int field7276;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
    public static int field7277;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    public static int field7278;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
    public static int field7280;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "[Ljava/lang/Object;")
    private Object[] field7251;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "[[Lrb;")
    public static class234[][] field7281;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field7253;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)I")
    public final int method2921(int arg0) {
        field7244++;
        if (!this.method2926(false)) {
            return 0;
        }
        int var2 = 0;
        if (arg0 < 38) {
            return 12;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field7251.length; var4++) {
            if (this.field7270.field1097[var4] > 0) {
                var3 += this.method2929(0, var4);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIZ)Z")
    public final boolean method2922(int arg0, int arg1, boolean arg2) {
        field7243++;
        if (!this.method2941(arg0, (byte) -116, arg1)) {
            return false;
        } else if (this.field7253[arg1] != null && this.field7253[arg1][arg0] != null) {
            return true;
        } else if (this.field7251[arg1] != null) {
            return true;
        } else if (arg2) {
            this.method2947(arg1, (byte) -124);
            return this.field7251[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZZZ)V")
    public final void method2923(boolean arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            this.method2947(-48, (byte) 67);
        }
        field7266++;
        if (!this.method2926(false)) {
            return;
        }
        if (arg2) {
            this.field7270.field1100 = null;
            this.field7270.field1104 = null;
        }
        if (arg0) {
            this.field7270.field1093 = null;
            this.field7270.field1098 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)Z")
    public final boolean method2924(byte arg0, int arg1) {
        field7241++;
        if (!this.method2926(false)) {
            return false;
        } else if (this.field7270.field1089.length == 1) {
            return this.method2922(arg1, 0, true);
        } else if (this.method2939(-1, arg1)) {
            if (arg0 >= -124) {
                this.method2941(83, (byte) 25, 105);
            }
            if (this.field7270.field1089[arg1] != 1) {
                throw new RuntimeException();
            }
            return this.method2922(0, arg1, true);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method2925(int arg0, String arg1) {
        field7249++;
        if (!this.method2926(false)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 != 4) {
            this.method2921(38);
        }
        int var4 = this.field7270.field1100.method2836(class208.method1405((byte) -111, var3), 123);
        return this.method2949(var4, false);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)Z")
    private final boolean method2926(boolean arg0) {
        field7275++;
        if (arg0) {
            this.field7253 = null;
        }
        if (this.field7270 == null) {
            this.field7270 = this.field7269.method608(true);
            if (this.field7270 == null) {
                return false;
            }
            this.field7253 = new Object[this.field7270.field1103][];
            this.field7251 = new Object[this.field7270.field1103];
        }
        return true;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public final void method2927(int arg0) {
        if (this.field7253 != null) {
            for (int var2 = 0; var2 < this.field7253.length; var2++) {
                this.field7253[var2] = null;
            }
        }
        if (arg0 != -2) {
            this.field7269 = null;
        }
        field7280++;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)Z")
    public final boolean method2928(int arg0) {
        field7273++;
        if (arg0 != -22019) {
            this.field7251 = null;
        }
        if (!this.method2926(false)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field7270.field1096.length; var3++) {
            int var4 = this.field7270.field1096[var3];
            if (this.field7251[var4] == null) {
                this.method2947(var4, (byte) -121);
                if (this.field7251[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)I")
    private final int method2929(int arg0, int arg1) {
        field7257++;
        if (this.method2939(arg0 - 1, arg1)) {
            if (arg0 != 0) {
                method2954(false);
            }
            return this.field7251[arg1] == null ? this.field7269.method607(arg1, 19383) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method2930(String arg0, byte arg1) {
        field7276++;
        if (this.method2926(false)) {
            String var3 = arg0.toLowerCase();
            int var4 = 95 % ((-arg1 - 79) / 44);
            int var5 = this.field7270.field1100.method2836(class208.method1405((byte) -34, var3), 111);
            this.method2952((byte) -40, var5);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
    public final boolean method2931(String arg0, String arg1, int arg2) {
        field7259++;
        if (!this.method2926(false)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field7270.field1100.method2836(class208.method1405((byte) 50, var4), 118);
        if (this.method2939(-1, var6)) {
            int var7 = this.field7270.field1098[var6].method2836(class208.method1405((byte) -81, var5), 101);
            return arg2 == 0 ? this.method2922(var7, var6, true) : false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)V")
    public final void method2932(int arg0, int arg1) {
        field7258++;
        if (this.method2939(-1, arg0)) {
            int var3 = 47 / ((-arg1 - 41) / 63);
            if (this.field7253 != null) {
                this.field7253[arg0] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III[I)[B")
    public final byte[] method2933(int arg0, int arg1, int arg2, int[] arg3) {
        field7252++;
        if (!this.method2941(arg0, (byte) -116, arg2)) {
            return null;
        }
        if (this.field7253[arg2] == null || this.field7253[arg2][arg0] == null) {
            boolean var5 = this.method2936(arg3, arg0, -21, arg2);
            if (!var5) {
                this.method2947(arg2, (byte) -117);
                boolean var6 = this.method2936(arg3, arg0, arg1 + 26888, arg2);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg1 != -26790) {
            this.field7262 = true;
        }
        byte[] var7 = class137.method915(false, this.field7253[arg2][arg0], arg1 ^ 0x68E2);
        if (this.field7271 == 1) {
            this.field7253[arg2][arg0] = null;
            if (this.field7270.field1089[arg2] == 1) {
                this.field7253[arg2] = null;
            }
        } else if (this.field7271 == 2) {
            this.field7253[arg2] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)I")
    public static final int method2934(int arg0) {
        if (arg0 != 26679) {
            field7279 = null;
        }
        field7256++;
        class226 var1 = class111.field1596;
        synchronized (class111.field1596) {
            return class111.field1596.method1543(-29655);
        }
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(II)S")
    public static final short method2935(int arg0, int arg1) {
        field7261++;
        int var2 = (arg0 & 0xFD7E) >> 10;
        int var3 = (arg0 & 0x382) >> 3;
        int var4 = arg0 & 0x7F;
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (arg1 == var6) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var2 << 10 | var7 >> 4 << 7 | var6);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([IIII)Z")
    private final boolean method2936(int[] arg0, int arg1, int arg2, int arg3) {
        field7242++;
        int var5 = -73 / ((arg2 - 43) / 52);
        if (!this.method2939(-1, arg3)) {
            return false;
        } else if (this.field7251[arg3] == null) {
            return false;
        } else {
            int var6 = this.field7270.field1097[arg3];
            int[] var7 = this.field7270.field1102[arg3];
            if (this.field7253[arg3] == null) {
                this.field7253[arg3] = new Object[this.field7270.field1089[arg3]];
            }
            Object[] var8 = this.field7253[arg3];
            boolean var9 = true;
            for (int var10 = 0; var10 < var6; var10++) {
                int var11;
                if (var7 == null) {
                    var11 = var10;
                } else {
                    var11 = var7[var10];
                }
                if (var8[var11] == null) {
                    var9 = false;
                    break;
                }
            }
            if (var9) {
                return true;
            }
            byte[] var12;
            if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
                var12 = class137.method915(false, this.field7251[arg3], -84);
            } else {
                var12 = class137.method915(true, this.field7251[arg3], -59);
                class209 var13 = new class209(var12);
                var13.method1426(5, (byte) 127, arg0, var13.field3036.length);
            }
            byte[] var14;
            try {
                var14 = class142.method941(var12, 80);
            } catch (RuntimeException var50) {
                throw class511.method3020(var50, "T3 - " + (arg0 != null) + "," + arg3 + "," + var12.length + "," + class64.method377(var12.length, var12, -1) + "," + class64.method377(var12.length - 2, var12, -1) + "," + this.field7270.field1092[arg3] + "," + this.field7270.field1090);
            }
            if (this.field7262) {
                this.field7251[arg3] = null;
            }
            if (var6 <= 1) {
                int var49;
                if (var7 == null) {
                    var49 = 0;
                } else {
                    var49 = var7[0];
                }
                if (this.field7271 == 0) {
                    var8[var49] = class387.method2363(var14, false, false);
                } else {
                    var8[var49] = var14;
                }
            } else if (this.field7271 == 2) {
                int var32 = var14.length;
                int var52 = var32 - 1;
                int var33 = var14[var52] & 0xFF;
                int var34 = var52 - var33 * 4 * var6;
                class209 var35 = new class209(var14);
                int var36 = 0;
                int var37 = 0;
                var35.field3037 = var34;
                for (int var38 = 0; var38 < var33; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var6; var40++) {
                        var39 += var35.method1452(65280);
                        int var41;
                        if (var7 == null) {
                            var41 = var40;
                        } else {
                            var41 = var7[var40];
                        }
                        if (arg1 == var41) {
                            var37 = var41;
                            var36 += var39;
                        }
                    }
                }
                if (var36 == 0) {
                    return true;
                }
                byte[] var42 = new byte[var36];
                int var43 = 0;
                var35.field3037 = var34;
                int var44 = 0;
                for (int var45 = 0; var45 < var33; var45++) {
                    int var46 = 0;
                    for (int var47 = 0; var47 < var6; var47++) {
                        var46 += var35.method1452(65280);
                        int var48;
                        if (var7 == null) {
                            var48 = var47;
                        } else {
                            var48 = var7[var47];
                        }
                        if (arg1 == var48) {
                            class520.method3071(var14, var44, var42, var43, var46);
                            var43 += var46;
                        }
                        var44 += var46;
                    }
                }
                var8[var37] = var42;
            } else {
                int var16 = var14.length;
                int var51 = var16 - 1;
                int var17 = var14[var51] & 0xFF;
                int var18 = var51 - var6 * 4 * var17;
                class209 var19 = new class209(var14);
                int[] var20 = new int[var6];
                var19.field3037 = var18;
                for (int var21 = 0; var21 < var17; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var6; var23++) {
                        var22 += var19.method1452(65280);
                        var20[var23] += var22;
                    }
                }
                byte[][] var24 = new byte[var6][];
                for (int var25 = 0; var25 < var6; var25++) {
                    var24[var25] = new byte[var20[var25]];
                    var20[var25] = 0;
                }
                var19.field3037 = var18;
                int var26 = 0;
                for (int var27 = 0; var27 < var17; var27++) {
                    int var28 = 0;
                    for (int var29 = 0; var29 < var6; var29++) {
                        var28 += var19.method1452(65280);
                        class520.method3071(var14, var26, var24[var29], var20[var29], var28);
                        var26 += var28;
                        var20[var29] += var28;
                    }
                }
                for (int var30 = 0; var30 < var6; var30++) {
                    int var31;
                    if (var7 == null) {
                        var31 = var30;
                    } else {
                        var31 = var7[var30];
                    }
                    if (this.field7271 == 0) {
                        var8[var31] = class387.method2363(var24[var30], false, false);
                    } else {
                        var8[var31] = var24[var30];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)I")
    public final int method2937(boolean arg0) {
        field7255++;
        if (!this.method2926(false)) {
            throw new IllegalStateException("");
        }
        if (!arg0) {
            this.field7269 = null;
        }
        return this.field7270.field1090;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(ILjava/lang/String;)I")
    public final int method2938(int arg0, String arg1) {
        field7264++;
        if (arg0 != 0) {
            this.method2952((byte) -72, -44);
        }
        if (this.method2926(false)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field7270.field1100.method2836(class208.method1405((byte) -68, var3), 100);
            return this.method2929(0, var4);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(II)Z")
    private final boolean method2939(int arg0, int arg1) {
        field7254++;
        if (!this.method2926(false)) {
            return false;
        } else if (arg0 >= ~arg1 && arg1 < this.field7270.field1089.length && this.field7270.field1089[arg1] != 0) {
            return true;
        } else if (class290.field4167) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public final int method2940(String arg0, boolean arg1) {
        field7245++;
        if (this.method2926(arg1)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field7270.field1100.method2836(class208.method1405((byte) -90, var3), 114);
            return this.method2939(-1, var4) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBI)Z")
    private final boolean method2941(int arg0, byte arg1, int arg2) {
        field7265++;
        if (arg1 != -116) {
            this.method2924((byte) -94, -123);
        }
        if (!this.method2926(false)) {
            return false;
        } else if (arg2 >= 0 && arg0 >= 0 && this.field7270.field1089.length > arg2 && arg0 < this.field7270.field1089[arg2]) {
            return true;
        } else if (class290.field4167) {
            throw new IllegalArgumentException(arg2 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZI)I")
    public final int method2942(boolean arg0, int arg1) {
        field7246++;
        if (arg0) {
            return 124;
        } else if (this.method2939(-1, arg1)) {
            return this.field7270.field1089[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)I")
    public final int method2943(byte arg0) {
        field7248++;
        if (arg0 != -33) {
            this.method2950(-3, 101);
        }
        return this.method2926(false) ? this.field7270.field1089.length : -1;
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(II)[B")
    public final byte[] method2944(int arg0, int arg1) {
        field7263++;
        if (!this.method2926(false)) {
            return null;
        }
        if (arg1 <= 34) {
            this.method2948(null, (byte) -51);
        }
        if (this.field7270.field1089.length == 1) {
            return this.method2945(0, arg0, true);
        } else if (!this.method2939(-1, arg0)) {
            return null;
        } else if (this.field7270.field1089[arg0] == 1) {
            return this.method2945(arg0, 0, true);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIZ)[B")
    public final byte[] method2945(int arg0, int arg1, boolean arg2) {
        field7268++;
        if (!arg2) {
            this.field7251 = null;
        }
        return this.method2933(arg1, -26790, arg0, null);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)[B")
    public final byte[] method2946(String arg0, String arg1, boolean arg2) {
        field7274++;
        if (!this.method2926(arg2)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field7270.field1100.method2836(class208.method1405((byte) -85, var4), 114);
        if (!this.method2939(-1, var6)) {
            return null;
        }
        int var7 = this.field7270.field1098[var6].method2836(class208.method1405((byte) 77, var5), 111);
        if (arg2) {
            this.field7253 = null;
        }
        return this.method2945(var6, var7, true);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)V")
    private final void method2947(int arg0, byte arg1) {
        field7277++;
        if (this.field7262) {
            this.field7251[arg0] = this.field7269.method614(arg0, false);
        } else {
            this.field7251[arg0] = class387.method2363(this.field7269.method614(arg0, false), false, false);
        }
        if (arg1 >= -116) {
            field7283 = -13;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method2948(String arg0, byte arg1) {
        field7260++;
        if (this.method2926(false)) {
            int var3 = 103 % ((-arg1 - 49) / 54);
            String var4 = arg0.toLowerCase();
            int var5 = this.field7270.field1100.method2836(class208.method1405((byte) -82, var4), 109);
            return var5 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZ)Z")
    public final boolean method2949(int arg0, boolean arg1) {
        field7272++;
        if (arg1) {
            this.field7251 = null;
        }
        if (!this.method2939(-1, arg0)) {
            return false;
        } else if (this.field7251[arg0] == null) {
            this.method2947(arg0, (byte) -121);
            return this.field7251[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(II)I")
    public final int method2950(int arg0, int arg1) {
        field7250++;
        if (!this.method2926(false)) {
            return -1;
        }
        int var3 = this.field7270.field1100.method2836(arg1, 125);
        if (arg0 >= -38) {
            field7282 = null;
        }
        return this.method2939(-1, var3) ? var3 : -1;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(IZ)[I")
    public final int[] method2951(int arg0, boolean arg1) {
        field7278++;
        if (!this.method2939(-1, arg0)) {
            return null;
        }
        if (arg1) {
            this.method2929(-50, -52);
        }
        int[] var3 = this.field7270.field1102[arg0];
        if (var3 == null) {
            var3 = new int[this.field7270.field1097[arg0]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(BI)V")
    private final void method2952(byte arg0, int arg1) {
        field7247++;
        if (arg0 != -40) {
            this.method2951(21, false);
        }
        this.field7269.method611(arg1, (byte) -25);
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V")
    public final void method2953(int arg0) {
        if (this.field7251 != null) {
            for (int var2 = 0; var2 < this.field7251.length; var2++) {
                this.field7251[var2] = null;
            }
        }
        if (arg0 == 0) {
            field7267++;
        }
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(Z)V")
    public static void method2954(boolean arg0) {
        field7279 = null;
        field7281 = null;
        field7282 = null;
        if (arg0) {
            method2934(-108);
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lwh;ZI)V")
    public class491(class99 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field7271 = arg2;
        this.field7262 = arg1;
        this.field7269 = arg0;
    }
}
