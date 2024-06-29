import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class523 extends class17 {

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "I")
    private int field7693 = 0;

    @OriginalMember(owner = "client!cc", name = "H", descriptor = "I")
    private int field7688 = 0;

    @OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
    private int field7687 = 0;

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "F")
    public static float field7695;

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "I")
    private int field7686;

    @OriginalMember(owner = "client!cc", name = "I", descriptor = "I")
    private int field7689;

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "I")
    private int field7690;

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
    public static int field7691;

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
    public static int field7692;

    @OriginalMember(owner = "client!cc", name = "N", descriptor = "I")
    private int field7694;

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
    public static int field7696;

    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "I")
    public static int field7697;

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "I")
    public static int field7698;

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "I")
    private int field7699;

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "I")
    private int field7700;

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "I")
    public static int field7701;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLhm;IZI)V")
    public static final void method3088(byte arg0, class150 arg1, int arg2, boolean arg3, int arg4) {
        ++field7697;
        int var5 = arg1.field2113;
        if (arg1.field2136 != 0) {
            if (arg1.field2136 == 1) {
                arg1.field2113 = -arg1.field2086 + arg2;
            } else if (arg1.field2136 == 2) {
                arg1.field2113 = arg1.field2086 * arg2 >> 14;
            }
        } else {
            arg1.field2113 = arg1.field2086;
        }
        int var6 = arg1.field2033;
        if (arg1.field2087 != 0) {
            if (~arg1.field2087 != -2) {
                if (~arg1.field2087 == -3) {
                    arg1.field2033 = arg1.field2102 * arg4 >> 14;
                }
            } else {
                arg1.field2033 = arg4 - arg1.field2102;
            }
        } else {
            arg1.field2033 = arg1.field2102;
        }
        if (~arg1.field2136 == -5) {
            arg1.field2113 = arg1.field2144 * arg1.field2033 / arg1.field2097;
        }
        if (arg1.field2087 == 4) {
            arg1.field2033 = arg1.field2113 * arg1.field2097 / arg1.field2144;
        }
        if (class126.field1700 && (~client.method1291(arg1).field7033 != -1 || ~arg1.field2022 == -1)) {
            if (arg1.field2033 < 5 && ~arg1.field2113 > -6) {
                arg1.field2033 = 5;
                arg1.field2113 = 5;
            } else {
                if (~arg1.field2033 >= -1) {
                    arg1.field2033 = 5;
                }
                if (arg1.field2113 <= 0) {
                    arg1.field2113 = 5;
                }
            }
        }
        if (class325.field4746 == arg1.field2006) {
            class426.field5992 = arg1;
        }
        if (arg0 > 89) {
            if (arg3 && arg1.field2077 != null) {
                if (arg1.field2113 != var5 || arg1.field2033 != var6) {
                    class389 var7 = new class389();
                    var7.field5466 = arg1.field2077;
                    var7.field5457 = arg1;
                    class64.field817.method2657(8492, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
    public class523() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIII)V")
    private final void method3089(int arg0, int arg1, int arg2, int arg3) {
        ++field7696;
        int var5 = arg3 > 2048 ? arg3 - -arg2 - (arg2 * arg3 >> 12) : (arg2 + 4096) * arg3 >> 12;
        if (var5 <= 0) {
            this.field7690 = this.field7686 = this.field7689 = arg3;
        } else {
            int var6 = arg1 * 6;
            int var7 = arg3 - -arg3 + -var5;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (var9 != 0) {
                if (var9 != 1) {
                    if (~var9 != -3) {
                        if (~var9 != -4) {
                            if (var9 != 4) {
                                if (var9 == 5) {
                                    this.field7690 = var5;
                                    this.field7686 = var7;
                                    this.field7689 = var15;
                                }
                            } else {
                                this.field7690 = var14;
                                this.field7686 = var7;
                                this.field7689 = var5;
                            }
                        } else {
                            this.field7689 = var5;
                            this.field7690 = var7;
                            this.field7686 = var15;
                        }
                    } else {
                        this.field7689 = var14;
                        this.field7686 = var5;
                        this.field7690 = var7;
                    }
                } else {
                    this.field7690 = var15;
                    this.field7686 = var5;
                    this.field7689 = var7;
                }
            } else {
                this.field7686 = var14;
                this.field7689 = var7;
                this.field7690 = var5;
            }
        }
        if (arg0 != -4) {
            this.method89(-64, (byte) 90);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method3090(byte arg0, Throwable arg1) throws IOException {
        ++field7701;
        String var3;
        if (arg1 instanceof class266) {
            class266 var2 = (class266) arg1;
            arg1 = var2.field3893;
            var3 = var2.field3892 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                if (arg0 < 122) {
                    field7695 = -0.66108614F;
                }
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (~var10 == 0) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) - -1);
            String var15 = var14.substring(1 + var14.lastIndexOf(9));
            String var16 = var3 + var15;
            if (~var10 != 0 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 - -5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        ++field7691;
        if (arg1 != -25) {
            return null;
        } else {
            int[][] var3 = super.field201.method1851(arg0, (byte) -56);
            if (super.field201.field4431) {
                int[][] var4 = this.method91(0, 0, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class530.field7763 > var11; ++var11) {
                    this.method3092(var5[var11], var6[var11], 126, var7[var11]);
                    this.field7699 += this.field7688;
                    this.field7694 += this.field7693;
                    for (this.field7700 += this.field7687; this.field7700 < 0; this.field7700 += 4096) {
                    }
                    while (~this.field7700 < -4097) {
                        this.field7700 -= 4096;
                    }
                    if (this.field7694 < 0) {
                        this.field7694 = 0;
                    }
                    if (this.field7694 > 4096) {
                        this.field7694 = 4096;
                    }
                    if (~this.field7699 > -1) {
                        this.field7699 = 0;
                    }
                    if (~this.field7699 < -4097) {
                        this.field7699 = 4096;
                    }
                    this.method3089(-4, this.field7700, this.field7694, this.field7699);
                    var8[var11] = this.field7690;
                    var9[var11] = this.field7686;
                    var10[var11] = this.field7689;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIILhr;)V")
    public static final void method3091(int arg0, int arg1, int arg2, int arg3, class371 arg4) {
        class239 var5 = class104.method713(arg0, arg1, arg2);
        if (var5 != null) {
            int var6 = 0;
            arg4.field5283 = (arg1 << class493.field6970) + class534.field7832;
            arg4.field5282 = arg3;
            arg4.field5290 = (arg2 << class493.field6970) + class534.field7832;
            for (class134 var7 = var5.field3482; var7 != null; var7 = var7.field1755) {
                if (var7.field1761.field1901) {
                    int var8 = var7.field1761.method127((byte) 86);
                    if (var8 != -32768 && var8 < var6) {
                        var6 = var8;
                    }
                }
            }
            if (var6 < 0) {
                arg4.field5282 += var6;
                arg4.field5287 = true;
            } else if (var5.field3493 != null) {
                arg4.field5282 -= var5.field3493.field388;
            }
            var5.field3495 = arg4;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(IIII)V")
    private final void method3092(int arg0, int arg1, int arg2, int arg3) {
        ++field7698;
        int var5 = arg0 <= arg1 ? arg1 : arg0;
        int var6 = ~arg3 >= ~var5 ? var5 : arg3;
        int var7 = arg0 >= arg1 ? arg1 : arg0;
        int var8 = arg3 < var7 ? arg3 : var7;
        int var9 = var6 - var8;
        if (arg2 < 125) {
            this.method3092(18, 113, -22, 82);
        }
        this.field7699 = (var6 + var8) / 2;
        if (this.field7699 > 0 && this.field7699 < 4096) {
            this.field7694 = (var9 << 12) / (this.field7699 <= 2048 ? this.field7699 * 2 : 8192 - this.field7699 * 2);
        } else {
            this.field7694 = 0;
        }
        if (~var9 >= -1) {
            this.field7700 = 0;
        } else {
            int var10 = (var6 - arg0 << 12) / var9;
            int var11 = (-arg1 + var6 << 12) / var9;
            int var12 = (-arg3 + var6 << 12) / var9;
            if (arg0 == var6) {
                this.field7700 = arg1 != var8 ? -var11 + 4096 : var12 + 20480;
            } else if (arg1 != var6) {
                this.field7700 = ~arg0 == ~var8 ? var11 + 12288 : 20480 - var10;
            } else {
                this.field7700 = arg3 != var8 ? 12288 - var12 : var10 + 4096;
            }
            this.field7700 /= 6;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lwm;II)V")
    public final void method34(class403 arg0, int arg1, int arg2) {
        if (arg2 != 5159) {
            this.field7693 = -25;
        }
        ++field7692;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field7688 = (arg0.method2359(-113) << 12) / 100;
                }
            } else {
                this.field7693 = (arg0.method2359(14) << 12) / 100;
            }
        } else {
            this.field7687 = arg0.method2371(arg2 ^ 4061);
        }
    }

    static {
        new class530("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
    }
}
