import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class245 {

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "I")
    private int field4264;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    private int field4242;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "[[I")
    public int[][] field4255;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    private int field4236;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    private int field4245;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "Lmb;")
    public static class172 field4257 = new class172(50);

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "Loh;")
    private static class258 field4261 = class153.method1046("white:", 89);

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "Loh;")
    public static class258 field4259 = field4261;

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "Loh;")
    public static class258 field4265 = field4261;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "Loh;")
    public static class258 field4262 = class153.method1046("welle:", 89);

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "Loh;")
    public static class258 field4266 = class153.method1046("p12_full", 104);

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 8)
    public static final String method1659(Throwable arg0, int arg1) throws IOException {
        String var3;
        if (arg0 instanceof class106) {
            class106 var2 = (class106) arg0;
            var3 = var2.field1897 + " | ";
            arg0 = var2.field1904;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        field4256++;
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        if (arg1 != -7000) {
            return (String) null;
        }
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var3 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var3 = var3 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var3 = var3 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIZZ)V", line = 80)
    public final void method1660(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        field4237++;
        int var7 = 256;
        if (arg5) {
            var7 += 131072;
        }
        int var8 = arg3 - this.field4245;
        if (!arg4) {
            this.method1664(-85, -52, (byte) -106);
        }
        int var9 = arg0 - this.field4236;
        for (int var10 = var8; var10 < (arg2 + var8); var10++) {
            if (var10 >= 0 && var10 < this.field4264) {
                for (int var11 = var9; var11 < (arg1 + var9); var11++) {
                    if (var11 >= 0 && var11 < this.field4242) {
                        this.method1670(var11, var10, var7, -101);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZIIIIIII)Z", line = 125)
    private final boolean method1661(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4246++;
        if (arg5 >= arg8 + arg7 || arg8 >= (arg0 + arg5)) {
            return false;
        } else if (arg1) {
            return false;
        } else {
            return (arg2 + arg4) > arg6 && arg4 < arg6 + arg3;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIBIIIIIII)Z", line = 143)
    private final boolean method1662(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4260++;
        int var11 = arg0 + arg5;
        int var12 = arg3 + arg7;
        if (arg2 > -72) {
            return true;
        }
        int var13 = arg6 + arg8;
        int var14 = arg4 + arg1;
        if (arg4 <= arg5 && var14 > arg5) {
            if (arg8 == var12 && (arg9 & 0x4) == 0) {
                int var15 = var11 <= var14 ? var11 : var14;
                for (int var16 = arg5; var16 < var15; var16++) {
                    if ((this.field4255[var16 - this.field4245][var12 - this.field4236 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg7 == var13 && (arg9 & 0x1) == 0) {
                int var17 = arg5;
                int var18 = var14 >= var11 ? var11 : var14;
                while (var18 > var17) {
                    if ((this.field4255[var17 - this.field4245][arg7 - this.field4236] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (var11 > arg4 && var11 <= var14) {
            if (arg8 == var12 && (arg9 & 0x4) == 0) {
                for (int var19 = arg4; var19 < var11; var19++) {
                    if ((this.field4255[var19 - this.field4245][var12 - this.field4236 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg7 == var13 && (arg9 & 0x1) == 0) {
                for (int var20 = arg4; var20 < var11; var20++) {
                    if ((this.field4255[var20 - this.field4245][arg7 - this.field4236] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg7 >= arg8 && var13 > arg7) {
            if (arg4 == var11 && (arg9 & 0x8) == 0) {
                int var21 = arg7;
                int var22 = var12 <= var13 ? var12 : var13;
                while (var22 > var21) {
                    if ((this.field4255[var11 - this.field4245 - 1][var21 - this.field4236] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg5 == var14 && (arg9 & 0x2) == 0) {
                int var23 = arg7;
                int var24 = var12 <= var13 ? var12 : var13;
                while (var23 < var24) {
                    if ((this.field4255[arg5 - this.field4245][var23 - this.field4236] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (var12 > arg8 && var13 >= var12) {
            if (arg4 == var11 && (arg9 & 0x8) == 0) {
                for (int var25 = arg8; var25 < var12; var25++) {
                    if ((this.field4255[var11 - this.field4245 - 1][var25 - this.field4236] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg5 == var14 && (arg9 & 0x2) == 0) {
                for (int var26 = arg8; var26 < var12; var26++) {
                    if ((this.field4255[arg5 - this.field4245][var26 - this.field4236] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIII)Z", line = 307)
    public final boolean method1663(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4247++;
        if (arg6 == 1) {
            if (arg0 == arg1 && arg2 == arg7) {
                return true;
            }
        } else if (arg1 <= arg0 && (arg1 + arg6 - 1) >= arg0 && arg2 >= arg2 && arg2 <= (arg6 + arg2 - 1)) {
            return true;
        }
        int var9 = arg2 - this.field4236;
        int var10 = arg0 - this.field4245;
        int var11 = arg7 - this.field4236;
        int var12 = arg1 - this.field4245;
        if (arg4 == arg6) {
            if (arg5 == 0) {
                if (arg3 == 0) {
                    if ((var10 - 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field4255[var12][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field4255[var12][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 == var12 && var9 + 1 == var11) {
                        return true;
                    }
                    if ((var10 - 1) == var12 && var9 == var11 && (this.field4255[var12][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11 && (this.field4255[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var10 + 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field4255[var12][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field4255[var12][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 == var12 && var9 - 1 == var11) {
                        return true;
                    }
                    if (var10 - 1 == var12 && var9 == var11 && (this.field4255[var12][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field4255[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg3 == 0) {
                    if ((var10 - 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field4255[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field4255[var12][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field4255[var12][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field4255[var12][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var10 - 1) == var12 && var9 == var11 && (this.field4255[var12][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field4255[var12][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var10 - 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field4255[var12][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field4255[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var10 == var12 && var9 + 1 == var11 && (this.field4255[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && var9 - 1 == var11 && (this.field4255[var12][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var12 && var9 == var11 && (this.field4255[var12][var11] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var9 == var11 && (this.field4255[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg6 - 1;
            int var14 = var11 - (1 - arg6);
            if (arg5 == 0) {
                if (arg3 == 0) {
                    if (var10 - arg6 == var12 && var9 >= var11 && var14 >= var9) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var9 + 1 == var11 && (this.field4255[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && (var9 - arg6) == var11 && (this.field4255[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var12 <= var10 && var10 <= var13 && var9 + 1 == var11) {
                        return true;
                    }
                    if ((var10 - arg6) == var12 && var11 <= var9 && var14 >= var9 && (this.field4255[var13][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 >= var11 && var14 >= var9 && (this.field4255[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var10 + 1 == var12 && var9 >= var11 && var14 >= var9) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && (var9 + 1) == var11 && (this.field4255[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && var9 - arg6 == var11 && (this.field4255[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var12 <= var10 && var13 >= var10 && var9 - arg6 == var11) {
                        return true;
                    }
                    if ((var10 - arg6) == var12 && var9 >= var11 && var9 <= var14 && (this.field4255[var13][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 >= var11 && var9 <= var14 && (this.field4255[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg3 == 0) {
                    if ((var10 - arg6) == var12 && var11 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && var9 + 1 == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var11 <= var9 && var14 >= var9 && (this.field4255[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && var9 - arg6 == var11 && (this.field4255[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var10 - arg6) == var12 && var9 >= var11 && var14 >= var9 && (this.field4255[var13][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && (var9 + 1) == var11) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 >= var11 && var9 <= var14) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && (var9 - arg6) == var11 && (this.field4255[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var10 - arg6 == var12 && var9 >= var11 && var9 <= var14 && (this.field4255[var13][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && var9 + 1 == var11 && (this.field4255[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var11 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && var9 - arg6 == var11) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var10 - arg6) == var12 && var11 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && var9 + 1 == var11 && (this.field4255[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 >= var11 && var14 >= var9 && (this.field4255[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && (var9 - arg6) == var11) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var10 >= var12 && var13 >= var10 && var9 + 1 == var11 && (this.field4255[var10][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var12 <= var10 && var10 <= var13 && (var9 - arg6) == var11 && (this.field4255[var10][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if (var10 - arg6 == var12 && var9 >= var11 && var14 >= var9 && (this.field4255[var13][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var11 <= var9 && var14 >= var9 && (this.field4255[var12][var9] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIB)V", line = 671)
    public final void method1664(int arg0, int arg1, byte arg2) {
        if (arg2 != -111) {
            this.method1674((byte) 103, -24, -97, -121, false, 60, -6);
        }
        int var4 = arg0 - this.field4236;
        field4244++;
        int var5 = arg1 - this.field4245;
        this.field4255[var5][var4] = class307.method2139(this.field4255[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZIIII)V", line = 684)
    public final void method1665(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field4238++;
        int var7 = arg4 - this.field4236;
        int var8 = arg2 - this.field4245;
        if (arg0 == 0) {
            if (arg5 == 0) {
                this.method1670(var7, var8, 128, arg3 - 122);
                this.method1670(var7, var8 - 1, 8, -125);
            }
            if (arg5 == 1) {
                this.method1670(var7, var8, 2, -109);
                this.method1670(var7 + 1, var8, 32, -116);
            }
            if (arg5 == 2) {
                this.method1670(var7, var8, 8, -101);
                this.method1670(var7, var8 + 1, 128, -126);
            }
            if (arg5 == 3) {
                this.method1670(var7, var8, 32, -126);
                this.method1670(var7 - 1, var8, 2, arg3 ^ 0xFFFFFF87);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg5 == 0) {
                this.method1670(var7, var8, 1, -116);
                this.method1670(var7 + 1, var8 + -1, 16, -113);
            }
            if (arg5 == 1) {
                this.method1670(var7, var8, 4, -117);
                this.method1670(var7 + 1, var8 + 1, 64, -111);
            }
            if (arg5 == 2) {
                this.method1670(var7, var8, 16, -119);
                this.method1670(var7 - 1, var8 + 1, 1, arg3 ^ 0xFFFFFF8F);
            }
            if (arg5 == 3) {
                this.method1670(var7, var8, 64, arg3 ^ 0xFFFFFF9C);
                this.method1670(var7 - 1, var8 + -1, 4, -104);
            }
        }
        if (arg0 == 2) {
            if (arg5 == 0) {
                this.method1670(var7, var8, 130, -128);
                this.method1670(var7, var8 - 1, 8, -127);
                this.method1670(var7 + 1, var8, 32, -112);
            }
            if (arg5 == 1) {
                this.method1670(var7, var8, 10, arg3 ^ 0xFFFFFF8B);
                this.method1670(var7 + 1, var8, 32, -115);
                this.method1670(var7, var8 + 1, 128, -122);
            }
            if (arg5 == 2) {
                this.method1670(var7, var8, 40, arg3 - 117);
                this.method1670(var7, var8 + 1, 128, -118);
                this.method1670(var7 - 1, var8, 2, -112);
            }
            if (arg5 == 3) {
                this.method1670(var7, var8, 160, arg3 ^ 0xFFFFFF89);
                this.method1670(var7 - 1, var8, 2, -105);
                this.method1670(var7, var8 - 1, 8, -120);
            }
        }
        if (arg3 != 8 || !arg1) {
            return;
        }
        if (arg0 == 0) {
            if (arg5 == 0) {
                this.method1670(var7, var8, 65536, -111);
                this.method1670(var7, var8 - 1, 4096, -101);
            }
            if (arg5 == 1) {
                this.method1670(var7, var8, 1024, -104);
                this.method1670(var7 + 1, var8, 16384, -128);
            }
            if (arg5 == 2) {
                this.method1670(var7, var8, 4096, -120);
                this.method1670(var7, var8 + 1, 65536, -109);
            }
            if (arg5 == 3) {
                this.method1670(var7, var8, 16384, arg3 - 111);
                this.method1670(var7 - 1, var8, 1024, arg3 ^ 0xFFFFFF90);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg5 == 0) {
                this.method1670(var7, var8, 512, -117);
                this.method1670(var7 + 1, var8 + -1, 8192, -127);
            }
            if (arg5 == 1) {
                this.method1670(var7, var8, 2048, -120);
                this.method1670(var7 + 1, var8 + 1, 32768, -108);
            }
            if (arg5 == 2) {
                this.method1670(var7, var8, 8192, -107);
                this.method1670(var7 - 1, var8 + 1, 512, arg3 - 113);
            }
            if (arg5 == 3) {
                this.method1670(var7, var8, 32768, -120);
                this.method1670(var7 - 1, var8 + -1, 2048, -103);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method1670(var7, var8, 66560, -101);
            this.method1670(var7, var8 - 1, 4096, -114);
            this.method1670(var7 + 1, var8, 16384, -114);
        }
        if (arg5 == 1) {
            this.method1670(var7, var8, 5120, -107);
            this.method1670(var7 + 1, var8, 16384, -102);
            this.method1670(var7, var8 + 1, 65536, -124);
        }
        if (arg5 == 2) {
            this.method1670(var7, var8, 20480, -115);
            this.method1670(var7, var8 + 1, 65536, -118);
            this.method1670(var7 - 1, var8, 1024, -112);
        }
        if (arg5 == 3) {
            this.method1670(var7, var8, 81920, arg3 ^ 0xFFFFFF80);
            this.method1670(var7 - 1, var8, 1024, -104);
            this.method1670(var7, var8 - 1, 4096, arg3 - 123);
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(IIIIIIII)Z", line = 895)
    public final boolean method1666(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4240++;
        if (arg2 == 1) {
            if (arg1 == arg4 && arg3 == arg6) {
                return true;
            }
        } else if (arg1 >= arg4 && (arg2 + arg4 - 1) >= arg1 && arg3 >= arg3 && arg3 <= (arg3 + arg2 - 1)) {
            return true;
        }
        int var9 = arg1 - this.field4245;
        int var10 = arg3 - this.field4236;
        int var11 = arg6 - this.field4236;
        if (arg0 != 0) {
            this.field4245 = -75;
        }
        int var12 = arg4 - this.field4245;
        if (arg2 == 1) {
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if ((var9 + 1) == var12 && var10 == var11 && (this.field4255[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11 && (this.field4255[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var9 - 1) == var12 && var10 == var11 && (this.field4255[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field4255[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var9 - 1 == var12 && var10 == var11 && (this.field4255[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field4255[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var9 + 1 == var12 && var10 == var11 && (this.field4255[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field4255[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var9 == var12 && var10 + 1 == var11 && (this.field4255[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && var10 - 1 == var11 && (this.field4255[var12][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var12 && var10 == var11 && (this.field4255[var12][var11] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var12 && var10 == var11 && (this.field4255[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg2 + var12 - 1;
            int var14 = arg2 + var11 - 1;
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if (var9 + 1 == var12 && var11 <= var10 && var10 <= var14 && (this.field4255[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && var10 - arg2 == var11 && (this.field4255[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var9 - arg2 == var12 && var11 <= var10 && var10 <= var14 && (this.field4255[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && (var10 - arg2) == var11 && (this.field4255[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var9 - arg2 == var12 && var10 >= var11 && var14 >= var10 && (this.field4255[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && var10 + 1 == var11 && (this.field4255[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var9 + 1) == var12 && var11 <= var10 && var10 <= var14 && (this.field4255[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && var10 + 1 == var11 && (this.field4255[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var12 <= var9 && var13 >= var9 && var10 + 1 == var11 && (this.field4255[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 >= var12 && var9 <= var13 && (var10 - arg2) == var11 && (this.field4255[var9][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - arg2) == var12 && var10 >= var11 && var14 >= var10 && (this.field4255[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var12 && var11 <= var10 && var14 >= var10 && (this.field4255[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)V", line = 1083)
    public final void method1667(int arg0, int arg1, int arg2) {
        field4253++;
        int var4 = arg1 - this.field4245;
        int var5 = arg2 - this.field4236;
        this.field4255[var4][var5] = class2.method15(this.field4255[var4][var5], -262145);
        if (arg0 < 23) {
            this.method1667(-5, -127, -45);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIB)V", line = 1096)
    private final void method1668(int arg0, int arg1, int arg2, byte arg3) {
        field4252++;
        this.field4255[arg0][arg1] = class2.method15(this.field4255[arg0][arg1], ~arg2);
        int var5 = 59 / ((20 - arg3) / 47);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIILrk;JZ)V", line = 1113)
    public static final void method1669(int arg0, int arg1, int arg2, int arg3, class123 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class250 var8 = new class250();
        var8.field4310 = arg4;
        var8.field4317 = arg1 * 128 + 64;
        var8.field4307 = arg2 * 128 + 64;
        var8.field4315 = arg3;
        var8.field4306 = arg5;
        var8.field4320 = arg6;
        if (class178.field3180[arg0][arg1][arg2] == null) {
            class178.field3180[arg0][arg1][arg2] = new class228(arg0, arg1, arg2);
        }
        class178.field3180[arg0][arg1][arg2].field3931 = var8;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIII)V", line = 1134)
    private final void method1670(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= -100) {
            field4254++;
            this.field4255[arg1][arg0] = class307.method2139(this.field4255[arg1][arg0], arg2);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V", line = 1145)
    public static void method1671(int arg0) {
        field4259 = null;
        if (arg0 != -27895) {
            return;
        }
        field4262 = null;
        field4265 = null;
        field4257 = null;
        field4266 = null;
        field4261 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBI)V", line = 1161)
    public final void method1672(int arg0, byte arg1, int arg2) {
        int var4 = arg0 - this.field4236;
        if (arg1 != 112) {
            this.method1662(53, 76, (byte) 34, -23, -85, 46, 20, 33, -119, -115);
        }
        field4248++;
        int var5 = arg2 - this.field4245;
        this.field4255[var5][var4] = class307.method2139(this.field4255[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V", line = 1183)
    public final void method1673(byte arg0) {
        if (arg0 > -53) {
            return;
        }
        for (int var2 = 0; var2 < this.field4264; var2++) {
            for (int var3 = 0; var3 < this.field4242; var3++) {
                if (var2 == 0 || var3 == 0 || this.field4264 - 5 <= var2 || (this.field4242 - 5) <= var3) {
                    this.field4255[var2][var3] = 16777215;
                } else {
                    this.field4255[var2][var3] = 16777216;
                }
            }
        }
        field4250++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BIIIZII)V", line = 1216)
    public final void method1674(byte arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 > -113) {
            return;
        }
        int var8 = arg5 - this.field4236;
        field4241++;
        int var9 = arg6 - this.field4245;
        int var10 = 256;
        if (arg4) {
            var10 += 131072;
        }
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg1;
            arg1 = arg3;
            arg3 = var11;
        }
        for (int var12 = var9; var12 < arg1 + var9; var12++) {
            if (var12 >= 0 && this.field4264 > var12) {
                for (int var13 = var8; var13 < (arg3 + var8); var13++) {
                    if (var13 >= 0 && this.field4242 > var13) {
                        this.method1668(var12, var13, var10, (byte) 109);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lok;I)I", line = 1272)
    public static final int method1675(class107 arg0, int arg1) {
        field4235++;
        class151 var2 = arg0.field1906;
        if (var2.field2545 != null) {
            var2 = var2.method1035(-6941);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field2600;
        if (arg1 <= 5) {
            method1678(110);
        }
        if (arg0.field929 == arg0.field909) {
            var3 = var2.field2549;
        } else if (arg0.field937 == arg0.field909) {
            var3 = var2.field2583;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIII)Z", line = 1303)
    public final boolean method1676(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4234++;
        if (arg3 == arg4 && arg0 == arg1) {
            return true;
        }
        int var6 = arg4 - this.field4245;
        int var7 = arg0 - this.field4236;
        if (var6 < 0 || var6 >= this.field4264 || var7 < 0 || var7 >= this.field4242) {
            return false;
        }
        int var8 = arg3 - this.field4245;
        int var9 = arg1 - this.field4236;
        int var10;
        if (var6 > var8) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        if (arg2 != 19661088) {
            field4257 = (class172) null;
        }
        int var11;
        if (var9 < var7) {
            var11 = var7 - var9;
        } else {
            var11 = var9 - var7;
        }
        if (var10 <= var11) {
            int var12 = var10 * 65536 / var11;
            int var13 = 32768;
            while (var7 != var9) {
                if (var7 > var9) {
                    if ((this.field4255[var8][var9] & 0x12C0102) != 0) {
                        return false;
                    }
                    var9++;
                } else if (var9 > var7) {
                    if ((this.field4255[var8][var9] & 0x12C0120) != 0) {
                        return false;
                    }
                    var9--;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var6 > var8) {
                        if ((this.field4255[var8][var9] & 0x12C0108) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var6 < var8) {
                        if ((this.field4255[var8][var9] & 0x12C0180) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        } else {
            int var14 = var11 * 65536 / var10;
            int var15 = 32768;
            while (var6 != var8) {
                if (var6 > var8) {
                    if ((this.field4255[var8][var9] & 0x12C0108) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var6 < var8) {
                    if ((this.field4255[var8][var9] & 0x12C0180) != 0) {
                        return false;
                    }
                    var8--;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var7 > var9) {
                        if ((this.field4255[var8][var9] & 0x12C0102) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var7 < var9) {
                        if ((this.field4255[var8][var9] & 0x12C0120) != 0) {
                            return false;
                        }
                        var9--;
                    }
                }
            }
        }
        return (this.field4255[var6][var7] & 0x1240100) == 0;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIZ)V", line = 1459)
    public final void method1677(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg4 - this.field4245;
        int var8 = arg1 - this.field4236;
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method1668(var7, var8, 128, (byte) -98);
                this.method1668(var7 - 1, var8, 8, (byte) 70);
            }
            if (arg0 == 1) {
                this.method1668(var7, var8, 2, (byte) -81);
                this.method1668(var7, var8 + 1, 32, (byte) 80);
            }
            if (arg0 == 2) {
                this.method1668(var7, var8, 8, (byte) 101);
                this.method1668(var7 + 1, var8, 128, (byte) 118);
            }
            if (arg0 == 3) {
                this.method1668(var7, var8, 32, (byte) -75);
                this.method1668(var7, var8 - 1, 2, (byte) -71);
            }
        }
        if (arg3 > -56) {
            this.field4236 = 74;
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method1668(var7, var8, 1, (byte) 121);
                this.method1668(var7 - 1, var8 + 1, 16, (byte) 108);
            }
            if (arg0 == 1) {
                this.method1668(var7, var8, 4, (byte) 120);
                this.method1668(var7 + 1, var8 + 1, 64, (byte) 109);
            }
            if (arg0 == 2) {
                this.method1668(var7, var8, 16, (byte) -66);
                this.method1668(var7 + 1, var8 - 1, 1, (byte) 67);
            }
            if (arg0 == 3) {
                this.method1668(var7, var8, 64, (byte) 96);
                this.method1668(var7 - 1, var8 + -1, 4, (byte) -49);
            }
        }
        if (arg2 == 2) {
            if (arg0 == 0) {
                this.method1668(var7, var8, 130, (byte) -86);
                this.method1668(var7 - 1, var8, 8, (byte) -103);
                this.method1668(var7, var8 + 1, 32, (byte) -65);
            }
            if (arg0 == 1) {
                this.method1668(var7, var8, 10, (byte) -124);
                this.method1668(var7, var8 + 1, 32, (byte) 83);
                this.method1668(var7 + 1, var8, 128, (byte) -30);
            }
            if (arg0 == 2) {
                this.method1668(var7, var8, 40, (byte) -28);
                this.method1668(var7 + 1, var8, 128, (byte) 90);
                this.method1668(var7, var8 - 1, 2, (byte) 91);
            }
            if (arg0 == 3) {
                this.method1668(var7, var8, 160, (byte) -96);
                this.method1668(var7, var8 - 1, 2, (byte) -28);
                this.method1668(var7 - 1, var8, 8, (byte) -36);
            }
        }
        field4249++;
        if (!arg5) {
            return;
        }
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method1668(var7, var8, 65536, (byte) 71);
                this.method1668(var7 - 1, var8, 4096, (byte) -110);
            }
            if (arg0 == 1) {
                this.method1668(var7, var8, 1024, (byte) 96);
                this.method1668(var7, var8 + 1, 16384, (byte) -73);
            }
            if (arg0 == 2) {
                this.method1668(var7, var8, 4096, (byte) -34);
                this.method1668(var7 + 1, var8, 65536, (byte) -121);
            }
            if (arg0 == 3) {
                this.method1668(var7, var8, 16384, (byte) 93);
                this.method1668(var7, var8 - 1, 1024, (byte) 87);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method1668(var7, var8, 512, (byte) 116);
                this.method1668(var7 - 1, var8 + 1, 8192, (byte) -127);
            }
            if (arg0 == 1) {
                this.method1668(var7, var8, 2048, (byte) 113);
                this.method1668(var7 + 1, var8 + 1, 32768, (byte) 123);
            }
            if (arg0 == 2) {
                this.method1668(var7, var8, 8192, (byte) 95);
                this.method1668(var7 + 1, var8 + -1, 512, (byte) 119);
            }
            if (arg0 == 3) {
                this.method1668(var7, var8, 32768, (byte) -82);
                this.method1668(var7 - 1, var8 + -1, 2048, (byte) -124);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method1668(var7, var8, 66560, (byte) -83);
            this.method1668(var7 - 1, var8, 4096, (byte) -120);
            this.method1668(var7, var8 + 1, 16384, (byte) -96);
        }
        if (arg0 == 1) {
            this.method1668(var7, var8, 5120, (byte) 79);
            this.method1668(var7, var8 + 1, 16384, (byte) -125);
            this.method1668(var7 + 1, var8, 65536, (byte) 71);
        }
        if (arg0 == 2) {
            this.method1668(var7, var8, 20480, (byte) -95);
            this.method1668(var7 + 1, var8, 65536, (byte) 72);
            this.method1668(var7, var8 - 1, 1024, (byte) 95);
        }
        if (arg0 == 3) {
            this.method1668(var7, var8, 81920, (byte) -128);
            this.method1668(var7, var8 - 1, 1024, (byte) -70);
            this.method1668(var7 - 1, var8, 4096, (byte) 73);
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V", line = 1666)
    public static final void method1678(int arg0) {
        class26.field317.method1161(101);
        if (arg0 == 6425) {
            field4243++;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIIII)Z", line = 1683)
    public final boolean method1679(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4239++;
        if (arg7 <= 1) {
            int var10 = arg0 + arg1 - 1;
            int var11 = arg5 - (1 - arg3);
            if (arg2 >= arg0 && var10 >= arg2 && arg6 >= arg5 && arg6 <= var11) {
                return true;
            }
            if (arg8 != 8) {
                this.field4236 = -51;
            }
            if ((arg0 - 1) == arg2 && arg6 >= arg5 && var11 >= arg6 && (this.field4255[arg2 - this.field4245][arg6 - this.field4236] & 0x8) == 0 && (arg4 & 0x8) == 0) {
                return true;
            } else if ((var10 + 1) == arg2 && arg5 <= arg6 && var11 >= arg6 && (this.field4255[arg2 - this.field4245][arg6 - this.field4236] & 0x80) == 0 && (arg4 & 0x2) == 0) {
                return true;
            } else if ((arg5 - 1) == arg6 && arg2 >= arg0 && arg2 <= var10 && (this.field4255[arg2 - this.field4245][arg6 - this.field4236] & 0x2) == 0 && (arg4 & 0x4) == 0) {
                return true;
            } else {
                return (var11 + 1) == arg6 && arg2 >= arg0 && var10 >= arg2 && (this.field4255[arg2 - this.field4245][arg6 - this.field4236] & 0x20) == 0 && (arg4 & 0x1) == 0;
            }
        } else if (this.method1661(arg7, false, arg3, arg7, arg5, arg2, arg6, arg1, arg0)) {
            return true;
        } else {
            return this.method1662(arg7, arg1, (byte) -117, arg7, arg0, arg2, arg3, arg6, arg5, arg4);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IB)I", line = 1728)
    public static final int method1680(int arg0, byte arg1) {
        field4251++;
        class140 var2 = class215.method1464(arg0, 8215);
        int var3 = var2.field2384;
        int var4 = var2.field2388;
        int var5 = -35 / ((33 - arg1) / 35);
        int var6 = var2.field2381;
        int var7 = class144.field2421[var3 - var6];
        return var7 & class227.field3917[var4] >> var6;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(II)V", line = 1777)
    public class245(int arg0, int arg1) {
        this.field4264 = arg0;
        this.field4242 = arg1;
        this.field4255 = new int[this.field4264][this.field4242];
        this.field4236 = 0;
        this.field4245 = 0;
        this.method1673((byte) -121);
    }
}
