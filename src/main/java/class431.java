import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class431 implements class16 {

    @OriginalMember(owner = "client!th", name = "n", descriptor = "Ldg;")
    private class288 field6085 = new class288(256);

    @OriginalMember(owner = "client!th", name = "g", descriptor = "Loi;")
    private class53 field6078;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "Loi;")
    private class53 field6080;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "I")
    private int field6090;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "[Lbb;")
    private class222[] field6081;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "[I")
    public static int[] field6088 = new int[50];

    @OriginalMember(owner = "client!th", name = "r", descriptor = "Ljava/lang/String;")
    public static String field6089 = null;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "Ltn;")
    public static class60 field6074 = new class60(32, 3);

    @OriginalMember(owner = "client!th", name = "u", descriptor = "F")
    public static float field6092;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field6073;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field6076;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field6077;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field6082;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field6083;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public static int field6084;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    public static int field6087;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "Lo;")
    public static class24 field6091;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "Lul;")
    public static class411 field6093;

    // $FF: synthetic field
    @OriginalMember(owner = "client!th", name = "x", descriptor = "Ljava/lang/Class;")
    public static Class field6095;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field6075;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZIIIFI)[I")
    public final int[] method79(boolean arg0, int arg1, int arg2, int arg3, float arg4, int arg5) {
        field6073++;
        if (arg5 != -20550) {
            field6092 = 1.1688564F;
        }
        return this.method2549(arg5 ^ 0xFFFFAFBB, arg2).method100(arg1, -108, arg3, this, (double) arg4, this.field6078, this.field6081[arg2].field3205);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BIIFZI)[I")
    public final int[] method81(byte arg0, int arg1, int arg2, float arg3, boolean arg4, int arg5) {
        if (arg0 == 106) {
            field6077++;
            return this.method2549(1, arg2).method101(arg5, this.field6078, arg1, arg0 ^ 0x4DBE, arg4, this, (double) arg3, this.field6081[arg2].field3205);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILza;IIIIZII)V")
    public static final void method2547(int arg0, class290 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        field6083++;
        class21 var9 = (class21) class38.method211(arg2, arg4, arg3);
        if (var9 != null) {
            class270 var10 = class377.field5338.method1901(50, var9.method110((byte) 109));
            int var11 = var9.method114(-9772) & 0x3;
            int var12 = var9.method112(71);
            if (var10.field3985 == -1) {
                int var13 = arg8;
                if (var10.field3957 > 0) {
                    var13 = arg0;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg1.method1792(1, arg7, 4, var13, arg5);
                    } else if (var11 == 1) {
                        arg1.method1793(arg7, -29535, var13, 4, arg5);
                    } else if (var11 == 2) {
                        arg1.method1792(1, arg7 + 3, 4, var13, arg5);
                    } else if (var11 == 3) {
                        arg1.method1793(arg7, -29535, var13, 4, arg5 + 3);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg1.method1794(1, arg5, var13, 1, 106, arg7);
                    } else if (var11 == 1) {
                        arg1.method1794(1, arg5, var13, 1, 92, arg7 + 3);
                    } else if (var11 == 2) {
                        arg1.method1794(1, arg5 + 3, var13, 1, 112, arg7 + 3);
                    } else if (var11 == 3) {
                        arg1.method1794(1, arg5 + 3, var13, 1, 89, arg7);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg1.method1793(arg7, -29535, var13, 4, arg5);
                    } else if (var11 == 1) {
                        arg1.method1792(1, arg7 + 3, 4, var13, arg5);
                    } else if (var11 == 2) {
                        arg1.method1793(arg7, -29535, var13, 4, arg5 + 3);
                    } else if (var11 == 3) {
                        arg1.method1792(1, arg7, 4, var13, arg5);
                    }
                }
            } else {
                class290.method1796(arg7, (byte) 125, var11, var10, arg5, arg1);
            }
        }
        if (!arg6) {
            method2548(false, null);
        }
        class21 var14 = (class21) class248.method1622(arg2, arg4, arg3, field6095 == null ? (field6095 = method2553("nc")) : field6095);
        if (var14 != null) {
            class270 var15 = class377.field5338.method1901(50, var14.method110((byte) 108));
            int var16 = var14.method114(-9772) & 0x3;
            int var17 = var14.method112(96);
            if (var15.field3985 != -1) {
                class290.method1796(arg7, (byte) 125, var16, var15, arg5, arg1);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field3957 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg1.method1797(arg6, arg5, arg7, arg5 + 3, arg7 + 3, var18);
                } else {
                    arg1.method1797(true, arg5 + 3, arg7, arg5, arg7 + 3, var18);
                }
            }
        }
        class21 var19 = (class21) class87.method628(arg2, arg4, arg3);
        if (var19 == null) {
            return;
        }
        class270 var20 = class377.field5338.method1901(50, var19.method110((byte) 109));
        int var21 = var19.method114(-9772) & 0x3;
        if (var20.field3985 != -1) {
            class290.method1796(arg7, (byte) 125, var21, var20, arg5, arg1);
            return;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZLwm;)Lcu;")
    public static final class149 method2548(boolean arg0, class403 arg1) {
        field6087++;
        if (!arg0) {
            method2547(-85, null, -78, 77, -119, -55, false, 42, 57);
        }
        return new class149(arg1.method2371(7162), arg1.method2371(7162), arg1.method2371(7162), arg1.method2371(7162), arg1.method2323((byte) 77), arg1.method2323((byte) 123), arg1.method2357((byte) 108));
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(II)Lqo;")
    private final class19 method2549(int arg0, int arg1) {
        field6076++;
        class361 var3 = this.field6085.method1781(false, (long) arg1);
        if (var3 != null) {
            return (class19) var3;
        }
        byte[] var4 = this.field6080.method421(arg1, arg0);
        if (var4 == null) {
            return null;
        } else {
            class19 var5 = new class19(new class403(var4));
            this.field6085.method1779(var5, (byte) -27, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(II)Lbb;")
    public final class222 method83(int arg0, int arg1) {
        field6082++;
        if (arg1 < 41) {
            this.field6081 = null;
        }
        return this.field6081[arg0];
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZIZFII)[F")
    public final float[] method80(boolean arg0, int arg1, boolean arg2, float arg3, int arg4, int arg5) {
        field6084++;
        if (arg2) {
            field6089 = null;
        }
        return this.method2549(1, arg5).method99(arg4, this.field6078, this, !arg2, arg1, this.field6081[arg5].field3205);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;I)[B")
    public static final byte[] method2550(String arg0, int arg1) {
        if (arg1 != -8251) {
            field6089 = null;
        }
        field6072++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)Z")
    public final boolean method82(int arg0, int arg1) {
        field6086++;
        class19 var3 = this.method2549(1, arg0);
        if (arg1 != -18226) {
            method2552(30);
        }
        return var3 != null && var3.method103(this, (byte) 123, this.field6078);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BII)Z")
    public static final boolean method2551(byte arg0, int arg1, int arg2) {
        field6079++;
        if (arg0 == 20) {
            return (arg2 & 0x800) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public static void method2552(int arg0) {
        field6091 = null;
        field6074 = null;
        field6088 = null;
        if (arg0 <= -42) {
            field6075 = null;
            field6089 = null;
            field6093 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Loi;Loi;Loi;)V")
    public class431(class53 arg0, class53 arg1, class53 arg2) {
        this.field6078 = arg2;
        this.field6080 = arg1;
        class403 var4 = new class403(arg0.method426(0, (byte) 9, 0));
        this.field6090 = var4.method2338(0);
        this.field6081 = new class222[this.field6090];
        for (int var5 = 0; var5 < this.field6090; var5++) {
            if (var4.method2357((byte) 120) == 1) {
                this.field6081[var5] = new class222();
            }
        }
        for (int var6 = 0; var6 < this.field6090; var6++) {
            if (this.field6081[var6] != null) {
                this.field6081[var6].field3199 = var4.method2357((byte) 119) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field6090; var7++) {
            if (this.field6081[var7] != null) {
                this.field6081[var7].field3189 = var4.method2357((byte) 125) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field6090; var8++) {
            if (this.field6081[var8] != null) {
                this.field6081[var8].field3186 = var4.method2357((byte) 114) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field6090; var9++) {
            if (this.field6081[var9] != null) {
                this.field6081[var9].field3190 = var4.method2357((byte) 122) == 1;
            }
        }
        for (int var10 = 0; var10 < this.field6090; var10++) {
            if (this.field6081[var10] != null) {
                this.field6081[var10].field3191 = var4.method2359(31);
            }
        }
        for (int var11 = 0; var11 < this.field6090; var11++) {
            if (this.field6081[var11] != null) {
                this.field6081[var11].field3201 = var4.method2359(-96);
            }
        }
        for (int var12 = 0; var12 < this.field6090; var12++) {
            if (this.field6081[var12] != null) {
                this.field6081[var12].field3197 = var4.method2359(-107);
            }
        }
        for (int var13 = 0; var13 < this.field6090; var13++) {
            if (this.field6081[var13] != null) {
                this.field6081[var13].field3195 = var4.method2359(-105);
            }
        }
        for (int var14 = 0; var14 < this.field6090; var14++) {
            if (this.field6081[var14] != null) {
                this.field6081[var14].field3204 = (short) var4.method2338(0);
            }
        }
        for (int var15 = 0; var15 < this.field6090; var15++) {
            if (this.field6081[var15] != null) {
                this.field6081[var15].field3192 = var4.method2359(-104);
            }
        }
        for (int var16 = 0; var16 < this.field6090; var16++) {
            if (this.field6081[var16] != null) {
                this.field6081[var16].field3207 = var4.method2359(16);
            }
        }
        for (int var17 = 0; var17 < this.field6090; var17++) {
            if (this.field6081[var17] != null) {
                this.field6081[var17].field3202 = var4.method2357((byte) 120) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field6090; var18++) {
            if (this.field6081[var18] != null) {
                this.field6081[var18].field3205 = var4.method2357((byte) 119) == 1;
            }
        }
        for (int var19 = 0; var19 < this.field6090; var19++) {
            if (this.field6081[var19] != null) {
                this.field6081[var19].field3193 = var4.method2359(-126);
            }
        }
        for (int var20 = 0; var20 < this.field6090; var20++) {
            if (this.field6081[var20] != null) {
                this.field6081[var20].field3196 = var4.method2357((byte) 107) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field6090; var21++) {
            if (this.field6081[var21] != null) {
                this.field6081[var21].field3187 = var4.method2357((byte) 123) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field6090; var22++) {
            if (this.field6081[var22] != null) {
                this.field6081[var22].field3194 = var4.method2357((byte) 115) == 1;
            }
        }
        for (int var23 = 0; var23 < this.field6090; var23++) {
            if (this.field6081[var23] != null) {
                this.field6081[var23].field3203 = var4.method2357((byte) 122);
            }
        }
        for (int var24 = 0; var24 < this.field6090; var24++) {
            if (this.field6081[var24] != null) {
                this.field6081[var24].field3208 = var4.method2319((byte) 111);
            }
        }
        for (int var25 = 0; var25 < this.field6090; var25++) {
            if (this.field6081[var25] != null) {
                this.field6081[var25].field3185 = var4.method2357((byte) 107) == 1;
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2553(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class530("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
        field6092 = 0.0F;
        field6094 = 0;
    }
}
