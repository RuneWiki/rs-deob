import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class64 {

    @OriginalMember(owner = "client!da", name = "g", descriptor = "Lha;")
    private class63 field889;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "Lkaa;")
    private class49 field872;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field894 = new String[] { method689(method688("U't%")), method689(method688("_36\u0003<")), method689(method688("@|6gi")), method689(method688("_36\u001d<")), method689(method688("_36\u0002<")), method689(method688("_36\u0005<")), method689(method688("_36\u0004<")), method689(method688("_36\u000e<")), method689(method688("_36\u001f<")), method689(method688("I7\u007f")), method689(method688("U0k9")), method689(method688("X=h0")), method689(method688("H:a")), method689(method688("W&")), method689(method688("^'j&")), method689(method688("_36\u0006<")), method689(method688("R?\u007ft")), method689(method688("\\&")), method689(method688("O;u,g")), method689(method688("_36\u001e<")), method689(method688("_36\u001c<")), method689(method688("_36\u0000<")), method689(method688("_36\u001b<")), method689(method688("_36u}U;lw<")), method689(method688("_36\u0019<")), method689(method688("_36\u0018<")), method689(method688("_36\u0007<")), method689(method688("\u00141w%")), method689(method688("\u0014'")), method689(method688("\u0014!p(p")), method689(method688("Y ")), method689(method688("H:y-")), method689(method688("H:y-)")), method689(method688("H&j")), method689(method688("\u0014!l;")), method689(method688("_36\u0001<")), method689(method688("H:y-)\u0016c")), method689(method688("H&jt")), method689(method688("Z \u007f+)")), method689(method688("No")), method689(method688("X=tt")), method689(method688("\u00143j.v")), method689(method688("_36\u000f<")) };

    @OriginalMember(owner = "client!da", name = "h", descriptor = "[C")
    public static char[] field875 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Z")
    public static boolean field892 = false;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "Lkaa;")
    public static class49 field877;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;ILjava/util/Random;II[IIIIII[III[Lhk;)I")
    public final int method671(String arg0, int arg1, Random arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int[] arg11, int arg12, int arg13, class107[] arg14) {
        try {
            field878++;
            if (arg0 == null) {
                return 0;
            }
            arg2.setSeed((long) arg7);
            int var16 = (arg2.nextInt() & 0x1F) + 192;
            this.method677(arg1 & 0xFFFFFF | var16 << 24, var16 << 24 | arg8 & 0xFFFFFF, (byte) -79);
            int var17 = arg0.length();
            int[] var18 = new int[var17];
            int var19 = 0;
            for (int var20 = 0; var20 < var17; var20++) {
                var18[var20] = var19;
                if ((arg2.nextInt() & 0x3) == 0) {
                    var19++;
                }
            }
            int var21 = arg12;
            int var22 = this.field872.field581 + arg3;
            if (arg6 == 1) {
                var22 += (arg13 - this.field872.field583 - this.field872.field581) / 2;
            } else if (arg6 == 2) {
                var22 = arg3 + arg13 - this.field872.field583;
            }
            if (arg10 >= -83) {
                this.method682(-122, 107, -99, -53, -66, null, 46, 6);
            }
            int var23 = -1;
            if (arg4 == 1) {
                var23 = var19 + this.field872.method498(arg0, -1);
                var21 = (arg9 - var23) / 2 + arg12;
            } else if (arg4 == 2) {
                var23 = var19 + this.field872.method498(arg0, -1);
                var21 = arg9 + arg12 - var23;
            }
            this.method687(var18, -16777216, arg5, arg14, null, var22, arg0, var21);
            if (arg11 != null) {
                if (var23 == -1) {
                    var23 = this.field872.method498(arg0, -1) + var19;
                }
                arg11[0] = var21;
                arg11[3] = this.field872.field583 + this.field872.field581;
                arg11[2] = var23;
                arg11[1] = var22 - this.field872.field581;
            }
            return var19;
        } catch (RuntimeException var25) {
            throw class590.method4333(var25, field894[7] + (arg0 == null ? field894[0] : field894[2]) + ',' + arg1 + ',' + (arg2 == null ? field894[0] : field894[2]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field894[0] : field894[2]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + (arg11 == null ? field894[0] : field894[2]) + ',' + arg12 + ',' + arg13 + ',' + (arg14 == null ? field894[0] : field894[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLaa;II)V")
    public abstract void method118(char arg0, int arg1, int arg2, int arg3, boolean arg4, class514 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;II)V")
    private final void method672(String arg0, int arg1, int arg2) {
        try {
            field882++;
            int var4 = 0;
            boolean var5 = false;
            for (int var6 = 0; arg0.length() > var6; var6++) {
                char var7 = arg0.charAt(var6);
                if (var7 == '<') {
                    var5 = true;
                } else if (var7 == '>') {
                    var5 = false;
                } else if (!var5 && var7 == ' ') {
                    var4++;
                }
            }
            if (arg2 <= 126) {
                this.field889 = null;
            }
            if (var4 > 0) {
                class693.field9977 = (arg1 - this.field872.method498(arg0, -1) << 8) / var4;
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field894[42] + (arg0 == null ? field894[0] : field894[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private final void method673(String arg0, int arg1) {
        try {
            field874++;
            try {
                if (arg0.startsWith(field894[40])) {
                    class492.field7411 = class492.field7411 & 0xFF000000 | class696.method5061(arg0.substring(4), 16, (byte) -128) & 0xFFFFFF;
                } else if (arg0.equals(field894[27])) {
                    class492.field7411 = class492.field7411 & 0xFF000000 | class720.field10542 & 0xFFFFFF;
                }
                if (arg0.startsWith(field894[38])) {
                    class492.field7411 = class696.method5061(arg0.substring(5), 16, (byte) -125);
                } else if (arg0.equals(field894[41])) {
                    class492.field7411 = class720.field10542;
                } else if (arg0.startsWith(field894[37])) {
                    class309.field5045 = class492.field7411 & 0xFF000000 | class696.method5061(arg0.substring(4), 16, (byte) -126);
                } else if (arg0.equals(field894[33])) {
                    class309.field5045 = class492.field7411 & 0xFF000000 | 0x800000;
                } else if (arg0.equals(field894[34])) {
                    class309.field5045 = -1;
                } else if (arg0.startsWith(field894[39])) {
                    class505.field7555 = class492.field7411 & 0xFF000000 | class696.method5061(arg0.substring(2), 16, (byte) -127);
                } else if (arg0.equals("u")) {
                    class505.field7555 = class492.field7411 & 0xFF000000;
                } else if (arg0.equals(field894[28])) {
                    class505.field7555 = -1;
                } else if (arg0.equalsIgnoreCase(field894[36])) {
                    class54.field692 = 0;
                } else if (arg0.startsWith(field894[32])) {
                    class54.field692 = class492.field7411 & 0xFF000000 | class696.method5061(arg0.substring(5), 16, (byte) -124);
                } else if (arg0.equals(field894[31])) {
                    class54.field692 = class492.field7411 & 0xFF000000;
                } else if (arg0.equals(field894[29])) {
                    class54.field692 = class378.field6110;
                } else if (arg0.equals(field894[30])) {
                    this.method677(class378.field6110, class720.field10542, (byte) -68);
                }
                if (arg1 != -16777216) {
                    this.field889 = null;
                }
            } catch (Exception var4) {
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field894[35] + (arg0 == null ? field894[0] : field894[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
    public final void method674(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            field886++;
            if (arg5 != 10475) {
                this.method682(3, 74, 118, 98, -91, null, -61, 126);
            }
            if (arg0 != null) {
                this.method677(arg3, arg1, (byte) -79);
                this.method683(arg4 - this.field872.method498(arg0, -1), 0, null, null, arg2, arg5 ^ 0xFFFFF656, null, 0, arg0);
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field894[21] + (arg0 == null ? field894[0] : field894[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static void method675(int arg0) {
        try {
            if (arg0 != -1) {
                method675(36);
            }
            field875 = null;
            field877 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field894[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;[Lhk;[IIIILjava/util/Random;I)I")
    public final int method676(int arg0, int arg1, String arg2, class107[] arg3, int[] arg4, int arg5, int arg6, int arg7, Random arg8, int arg9) {
        try {
            field893++;
            if (arg2 == null) {
                return 0;
            }
            arg8.setSeed((long) arg7);
            int var11 = (arg8.nextInt() & 0x1F) + 192;
            if (arg9 < 13) {
                return -50;
            }
            this.method677(arg0 & 0xFFFFFF | var11 << 24, arg6 & 0xFFFFFF | var11 << 24, (byte) -122);
            int var12 = arg2.length();
            int[] var13 = new int[var12];
            int var14 = 0;
            for (int var15 = 0; var15 < var12; var15++) {
                var13[var15] = var14;
                if ((arg8.nextInt() & 0x3) == 0) {
                    var14++;
                }
            }
            this.method687(var13, -16777216, arg4, arg3, null, arg5, arg2, arg1);
            return var14;
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field894[6] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field894[0] : field894[2]) + ',' + (arg3 == null ? field894[0] : field894[2]) + ',' + (arg4 == null ? field894[0] : field894[2]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 == null ? field894[0] : field894[2]) + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIB)V")
    private final void method677(int arg0, int arg1, byte arg2) {
        try {
            class752.field11084 = 0;
            class505.field7555 = -1;
            field885++;
            if (arg0 == -1) {
                arg0 = 0;
            }
            class693.field9977 = 0;
            if (arg2 >= -36) {
                field875 = null;
            }
            class309.field5045 = -1;
            class720.field10542 = arg1;
            class492.field7411 = arg1;
            class378.field6110 = arg0;
            class54.field692 = arg0;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field894[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII[ILaa;[Lhk;IBIIIILjava/lang/String;III)I")
    public final int method678(int arg0, int arg1, int arg2, int arg3, int[] arg4, class514 arg5, class107[] arg6, int arg7, byte arg8, int arg9, int arg10, int arg11, int arg12, String arg13, int arg14, int arg15, int arg16) {
        try {
            field873++;
            if (arg13 == null) {
                return 0;
            }
            this.method677(arg1, arg9, (byte) -51);
            if (arg8 != 57) {
                this.method674(null, 57, -99, -123, 85, -65);
            }
            if (arg12 == 0) {
                arg12 = this.field872.field584;
            }
            int[] var18;
            if (this.field872.field583 + arg12 + this.field872.field581 > arg2 && (arg12 + arg12) > arg2) {
                var18 = null;
            } else {
                var18 = new int[] { arg14 };
            }
            int var19 = this.field872.method507(class49.field580, arg13, arg6, -121, var18);
            if (arg16 == -1) {
                arg16 = arg2 / arg12;
                if (arg16 <= 0) {
                    arg16 = 1;
                }
            }
            if (arg16 > 0 && arg16 <= var19) {
                class49.field580[arg16 - 1] = this.field872.method499(arg14, true, arg6, class49.field580[arg16 - 1]);
                var19 = arg16;
            }
            if (arg11 == 3 && var19 == 1) {
                arg11 = 1;
            }
            int var20;
            if (arg11 == 0) {
                var20 = this.field872.field581 + arg10;
            } else if (arg11 == 1) {
                var20 = arg10 - (-((arg2 - ((var19 - 1) * arg12) - this.field872.field581 - this.field872.field583) / 2) - this.field872.field581);
            } else if (arg11 == 2) {
                var20 = arg10 - ((var19 - 1) * arg12 - arg2) - this.field872.field583;
            } else {
                int var21 = (arg2 - this.field872.field581 - this.field872.field583 - ((var19 + -1) * arg12)) / (var19 + 1);
                if (var21 < 0) {
                    var21 = 0;
                }
                var20 = this.field872.field581 + arg10 + var21;
                arg12 += var21;
            }
            for (int var22 = 0; var22 < var19; var22++) {
                if (arg7 == 0) {
                    this.method683(arg0, arg15, arg4, arg5, var20, -8515, arg6, arg3, class49.field580[var22]);
                } else if (arg7 == 1) {
                    this.method683((arg14 - this.field872.method498(class49.field580[var22], arg8 ^ 0xFFFFFFC6)) / 2 + arg0, arg15, arg4, arg5, var20, -8515, arg6, arg3, class49.field580[var22]);
                } else if (arg7 == 2) {
                    this.method683(arg0 + arg14 - this.field872.method498(class49.field580[var22], arg8 ^ 0xFFFFFFC6), arg15, arg4, arg5, var20, -8515, arg6, arg3, class49.field580[var22]);
                } else if ((var19 - 1) == var22) {
                    this.method683(arg0, arg15, arg4, arg5, var20, -8515, arg6, arg3, class49.field580[var22]);
                } else {
                    this.method672(class49.field580[var22], arg14, arg8 + 70);
                    this.method683(arg0, arg15, arg4, arg5, var20, -8515, arg6, arg3, class49.field580[var22]);
                    class693.field9977 = 0;
                }
                var20 += arg12;
            }
            return var19;
        } catch (RuntimeException var24) {
            throw class590.method4333(var24, field894[20] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field894[0] : field894[2]) + ',' + (arg5 == null ? field894[0] : field894[2]) + ',' + (arg6 == null ? field894[0] : field894[2]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + (arg13 == null ? field894[0] : field894[2]) + ',' + arg14 + ',' + arg15 + ',' + arg16 + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
    public final void method679(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        try {
            field884++;
            if (arg4 != null) {
                this.method677(arg2, arg3, (byte) -105);
                this.method683(arg1, 0, null, null, arg5, -8515, null, arg0, arg4);
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field894[26] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field894[0] : field894[2]) + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IBIIILjava/lang/String;)V")
    public final void method680(int arg0, byte arg1, int arg2, int arg3, int arg4, String arg5) {
        try {
            if (arg1 != -78) {
                this.method682(-112, 3, 124, -105, 121, null, 76, -1);
            }
            field891++;
            if (arg5 != null) {
                this.method677(arg2, arg4, (byte) -87);
                this.method683(arg3 - (this.field872.method498(arg5, -1) / 2), 0, null, null, arg0, -8515, null, 0, arg5);
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field894[24] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field894[0] : field894[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
    public abstract void method120(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLaa;IILjava/lang/String;IIII[Lhk;III[III)I")
    public final int method681(byte arg0, class514 arg1, int arg2, int arg3, String arg4, int arg5, int arg6, int arg7, int arg8, class107[] arg9, int arg10, int arg11, int arg12, int[] arg13, int arg14, int arg15) {
        try {
            if (arg0 >= -109) {
                this.method686(91, -103, null, -8, 54, 121, -36);
            }
            field880++;
            return this.method678(arg8, arg11, arg5, arg3, arg13, arg1, arg9, arg2, (byte) 57, arg7, arg15, arg14, arg12, arg4, arg6, arg10, 0);
        } catch (RuntimeException var18) {
            throw class590.method4333(var18, field894[19] + arg0 + ',' + (arg1 == null ? field894[0] : field894[2]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field894[0] : field894[2]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 == null ? field894[0] : field894[2]) + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + (arg13 == null ? field894[0] : field894[2]) + ',' + arg14 + ',' + arg15 + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILjava/lang/String;II)V")
    public final void method682(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        try {
            field888++;
            if (arg5 != null && arg4 <= -102) {
                this.method677(arg1, arg3, (byte) -67);
                double var9 = 7.0D - ((double) arg0 / 8.0D);
                if (var9 < 0.0D) {
                    var9 = 0.0D;
                }
                int var11 = arg5.length();
                int[] var12 = new int[var11];
                for (int var13 = 0; var13 < var11; var13++) {
                    var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg6));
                }
                this.method687(null, -16777216, null, null, var12, arg2, arg5, arg7 - (this.field872.method498(arg5, -1) / 2));
            }
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field894[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field894[0] : field894[2]) + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[ILaa;II[Lhk;ILjava/lang/String;)V")
    private final void method683(int arg0, int arg1, int[] arg2, class514 arg3, int arg4, int arg5, class107[] arg6, int arg7, String arg8) {
        try {
            field883++;
            int var23 = arg4 - this.field872.field584;
            int var10 = -1;
            int var11 = -1;
            int var12 = arg8.length();
            if (arg5 != -8515) {
                this.field872 = null;
            }
            for (int var13 = 0; var13 < var12; var13++) {
                char var14 = (char) (class666.method4832((byte) -67, arg8.charAt(var13)) & 0xFF);
                if (var14 == '<') {
                    var10 = var13;
                } else {
                    if (var14 == '>' && var10 != -1) {
                        String var15 = arg8.substring(var10 + 1, var13);
                        var10 = -1;
                        if (var15.equals(field894[13])) {
                            var14 = '<';
                        } else if (var15.equals(field894[17])) {
                            var14 = '>';
                        } else if (var15.equals(field894[10])) {
                            var14 = ' ';
                        } else if (var15.equals(field894[12])) {
                            var14 = '\u00AD';
                        } else if (var15.equals(field894[18])) {
                            var14 = '×';
                        } else if (var15.equals(field894[14])) {
                            var14 = '€';
                        } else if (var15.equals(field894[11])) {
                            var14 = '©';
                        } else {
                            if (!var15.equals(field894[9])) {
                                if (var15.startsWith(field894[16])) {
                                    try {
                                        int var16 = class441.method3457(true, var15.substring(4));
                                        class107 var17 = arg6[var16];
                                        int var18 = arg2 == null ? var17.method12() : arg2[var16];
                                        if ((class492.field7411 & 0xFF000000) == -16777216) {
                                            var17.method19(arg0, this.field872.field584 + var23 - var18, 1, 0, 1);
                                        } else {
                                            var17.method19(arg0, this.field872.field584 + var23 - var18, 0, class492.field7411 & 0xFF000000 | 0xFFFFFF, 1);
                                        }
                                        var11 = -1;
                                        arg0 += arg6[var16].method26();
                                    } catch (Exception var21) {
                                    }
                                } else {
                                    this.method673(var15, -16777216);
                                }
                                continue;
                            }
                            var14 = '®';
                        }
                    }
                    if (var10 == -1) {
                        if (var11 != -1) {
                            arg0 += this.field872.method503(var14, var11, -69);
                        }
                        if (var14 == ' ') {
                            if (class693.field9977 > 0) {
                                class752.field11084 += class693.field9977;
                                arg0 += class752.field11084 >> 8;
                                class752.field11084 &= 0xFF;
                            }
                        } else if (arg3 == null) {
                            if ((class54.field692 & 0xFF000000) != 0) {
                                this.method120(var14, arg0 + 1, var23 + 1, class54.field692, true);
                            }
                            this.method120(var14, arg0, var23, class492.field7411, false);
                        } else {
                            if ((class54.field692 & 0xFF000000) != 0) {
                                this.method118(var14, arg0 + 1, var23 + 1, class54.field692, true, arg3, arg7, arg1);
                            }
                            this.method118(var14, arg0, var23, class492.field7411, false, arg3, arg7, arg1);
                        }
                        int var19 = this.field872.method501(var14, (byte) -90);
                        if (class309.field5045 != -1) {
                            this.field889.method658(var19, 27174, arg0, (int) ((double) this.field872.field584 * 0.7D) + var23, class309.field5045);
                        }
                        if (class505.field7555 != -1) {
                            this.field889.method658(var19, 27174, arg0, var23 + this.field872.field584 + 1, class505.field7555);
                        }
                        var11 = var14;
                        arg0 += var19;
                    }
                }
            }
        } catch (RuntimeException var22) {
            throw class590.method4333(var22, field894[15] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field894[0] : field894[2]) + ',' + (arg3 == null ? field894[0] : field894[2]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field894[0] : field894[2]) + ',' + arg7 + ',' + (arg8 == null ? field894[0] : field894[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lha;Lkaa;)V")
    public class64(class63 arg0, class49 arg1) {
        try {
            this.field889 = arg0;
            this.field872 = arg1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field894[23] + (arg0 == null ? field894[0] : field894[2]) + ',' + (arg1 == null ? field894[0] : field894[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Lhk;IILjava/lang/String;III[I)V")
    public final void method684(class107[] arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6, int[] arg7) {
        try {
            field887++;
            if (arg3 != null) {
                this.method677(arg5, arg2, (byte) -124);
                this.method683(arg1, 0, arg7, null, arg4, arg6 - 8515, arg0, arg6, arg3);
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field894[3] + (arg0 == null ? field894[0] : field894[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field894[0] : field894[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field894[0] : field894[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
    public final void method685(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field879++;
            if (arg2 != null) {
                this.method677(arg3, arg1, (byte) -121);
                int var8 = arg2.length();
                int[] var9 = new int[var8];
                for (int var10 = arg0; var10 < var8; var10++) {
                    var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 2.0D) * 5.0D);
                }
                this.method687(null, -16777216, null, null, var9, arg6, arg2, arg4 - this.field872.method498(arg2, -1) / 2);
            }
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field894[25] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field894[0] : field894[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(IILjava/lang/String;IIII)V")
    public final void method686(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field890++;
            if (arg2 != null) {
                this.method677(arg1, arg4, (byte) -104);
                int var8 = arg2.length();
                int[] var9 = new int[var8];
                int[] var10 = new int[var8];
                if (arg3 == -17923) {
                    for (int var11 = 0; var11 < var8; var11++) {
                        var9[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 5.0D) * 5.0D);
                        var10[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 3.0D) * 5.0D);
                    }
                    this.method687(var9, -16777216, null, null, var10, arg6, arg2, arg5 - (this.field872.method498(arg2, arg3 + 17922) / 2));
                }
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field894[1] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field894[0] : field894[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([II[I[Lhk;[IILjava/lang/String;I)V")
    private final void method687(int[] arg0, int arg1, int[] arg2, class107[] arg3, int[] arg4, int arg5, String arg6, int arg7) {
        try {
            int var27 = arg5 - this.field872.field584;
            field876++;
            int var9 = -1;
            int var10 = -1;
            int var11 = 0;
            int var12 = arg6.length();
            int var13 = 0;
            if (arg1 == -16777216) {
                while (var13 < var12) {
                    char var14 = (char) (class666.method4832((byte) 117, arg6.charAt(var13)) & 0xFF);
                    if (var14 == '<') {
                        var9 = var13;
                    } else {
                        label159: {
                            if (var14 == '>' && var9 != -1) {
                                String var15 = arg6.substring(var9 + 1, var13);
                                var9 = -1;
                                if (var15.equals(field894[13])) {
                                    var14 = '<';
                                } else if (var15.equals(field894[17])) {
                                    var14 = '>';
                                } else if (var15.equals(field894[10])) {
                                    var14 = ' ';
                                } else if (var15.equals(field894[12])) {
                                    var14 = '\u00AD';
                                } else if (var15.equals(field894[18])) {
                                    var14 = '×';
                                } else if (var15.equals(field894[14])) {
                                    var14 = '€';
                                } else if (var15.equals(field894[11])) {
                                    var14 = '©';
                                } else {
                                    if (!var15.equals(field894[9])) {
                                        if (var15.startsWith(field894[16])) {
                                            try {
                                                int var16;
                                                if (arg0 == null) {
                                                    var16 = 0;
                                                } else {
                                                    var16 = arg0[var11];
                                                }
                                                int var17;
                                                if (arg4 == null) {
                                                    var17 = 0;
                                                } else {
                                                    var17 = arg4[var11];
                                                }
                                                var11++;
                                                int var18 = class441.method3457(true, var15.substring(4));
                                                class107 var19 = arg3[var18];
                                                int var20 = arg2 == null ? var19.method12() : arg2[var18];
                                                var19.method19(arg7 + var16, var27 - -this.field872.field584 + (-var20 - -var17), 1, 0, 1);
                                                arg7 += arg3[var18].method26();
                                                var10 = -1;
                                            } catch (Exception var25) {
                                            }
                                        } else {
                                            this.method673(var15, -16777216);
                                        }
                                        break label159;
                                    }
                                    var14 = '®';
                                }
                            }
                            if (var9 == -1) {
                                if (var10 != -1) {
                                    arg7 += this.field872.method503(var14, var10, -15);
                                }
                                int var21;
                                if (arg0 == null) {
                                    var21 = 0;
                                } else {
                                    var21 = arg0[var11];
                                }
                                int var22;
                                if (arg4 == null) {
                                    var22 = 0;
                                } else {
                                    var22 = arg4[var11];
                                }
                                if (var14 != ' ') {
                                    if ((class54.field692 & 0xFF000000) != 0) {
                                        this.method120(var14, arg7 + var21 + 1, var27 + var22 + 1, class54.field692, true);
                                    }
                                    this.method120(var14, arg7 + var21, var27 - -var22, class492.field7411, false);
                                } else if (class693.field9977 > 0) {
                                    class752.field11084 += class693.field9977;
                                    arg7 += class752.field11084 >> 8;
                                    class752.field11084 &= 0xFF;
                                }
                                var11++;
                                int var23 = this.field872.method501(var14, (byte) -90);
                                if (class309.field5045 != -1) {
                                    this.field889.method658(var23, arg1 ^ 0xFF006A26, arg7, var27 + ((int) ((double) this.field872.field584 * 0.7D)), class309.field5045);
                                }
                                if (class505.field7555 != -1) {
                                    this.field889.method658(var23, 27174, arg7, var27 + this.field872.field584, class505.field7555);
                                }
                                var10 = var14;
                                arg7 += var23;
                            }
                        }
                    }
                    var13++;
                }
            }
        } catch (RuntimeException var26) {
            throw class590.method4333(var26, field894[22] + (arg0 == null ? field894[0] : field894[2]) + ',' + arg1 + ',' + (arg2 == null ? field894[0] : field894[2]) + ',' + (arg3 == null ? field894[0] : field894[2]) + ',' + (arg4 == null ? field894[0] : field894[2]) + ',' + arg5 + ',' + (arg6 == null ? field894[0] : field894[2]) + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method688(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x14);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!da", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method689(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 59;
                    break;
                case 1:
                    var10005 = 82;
                    break;
                case 2:
                    var10005 = 24;
                    break;
                case 3:
                    var10005 = 73;
                    break;
                default:
                    var10005 = 20;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
