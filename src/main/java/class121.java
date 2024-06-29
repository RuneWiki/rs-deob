import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class121 {

    @OriginalMember(owner = "client!c", name = "d", descriptor = "Luf;")
    public static class310 field1669 = new class310(43, -2);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIILd;ZLd;III)V", line = 16)
    public final void method768(int arg0, int arg1, int arg2, class102 arg3, boolean arg4, class102 arg5, int arg6, int arg7, int arg8) {
        field1676++;
        if (arg1 == -1 || !this.method784()) {
            return;
        }
        if (arg7 > -81) {
            field1669 = null;
        }
        class130 var10 = arg5.field1399[arg1];
        class297 var11 = var10.field1786;
        class130 var12 = null;
        if (arg3 != null) {
            var12 = arg3.field1399[arg6];
            if (var12.field1786 != var11) {
                var12 = null;
            }
        }
        this.method794(null, 65535, arg8, arg0, var11, var12, false, arg4, var10, 3, arg2, null);
        this.method786();
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII[I[IZBII)V", line = 52)
    private final void method772(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, boolean arg6, byte arg7, int arg8, int arg9) {
        field1673++;
        if (arg2 == 1) {
            if (arg1 == 0 || arg1 == 1) {
                int var16 = -arg9;
                arg9 = arg3;
                arg3 = var16;
            } else if (arg1 == 3) {
                int var14 = arg9;
                arg9 = arg3;
                arg3 = var14;
            } else if (arg1 == 2) {
                int var15 = arg9;
                arg9 = -arg3 & 0x3FFF;
                arg3 = var15 & 0x3FFF;
            }
        } else if (arg2 == 2) {
            if (arg1 == 0 || arg1 == 1) {
                arg9 = -arg9;
                arg3 = -arg3;
            } else if (arg1 == 2) {
                arg3 = -arg3 & 0x3FFF;
                arg9 = -arg9 & 0x3FFF;
            }
        } else if (arg2 == 3) {
            if (arg1 == 0 || arg1 == 1) {
                int var13 = arg9;
                arg9 = -arg3;
                arg3 = var13;
            } else if (arg1 == 3) {
                int var11 = arg9;
                arg9 = arg3;
                arg3 = var11;
            } else if (arg1 == 2) {
                int var12 = arg9;
                arg9 = arg3 & 0x3FFF;
                arg3 = -var12 & 0x3FFF;
            }
        }
        if (arg8 == 65535) {
            this.method809(arg1, arg4, arg9, arg0, arg3, arg2, arg6);
        } else {
            this.method767(arg1, arg4, arg9, arg0, arg3, arg6, arg8, arg5);
        }
        if (arg7 != -55) {
            this.method793(-113);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([IIILd;BIILd;ZII)V", line = 149)
    public final void method776(int[] arg0, int arg1, int arg2, class102 arg3, byte arg4, int arg5, int arg6, class102 arg7, boolean arg8, int arg9, int arg10) {
        field1674++;
        if (arg2 == -1 || !this.method784()) {
            return;
        }
        class130 var12 = arg3.field1399[arg2];
        if (arg4 != 30) {
            this.method783();
        }
        class297 var13 = var12.field1786;
        class130 var14 = null;
        if (arg7 != null) {
            var14 = arg7.field1399[arg1];
            if (var14.field1786 != var13) {
                var14 = null;
            }
        }
        this.method794(null, arg10, arg9, arg5, var13, var14, false, arg8, var12, 3, arg6, arg0);
        this.method786();
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 187)
    public static final int method780(String arg0, byte arg1) {
        field1671++;
        if (arg1 < 13) {
            field1669 = null;
        }
        return arg0.length() + 1;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 212)
    public static final String method788(Throwable arg0, int arg1) throws IOException {
        field1675++;
        String var2;
        if ((arg0 instanceof class103)) {
            class103 var3 = (class103) arg0;
            var2 = var3.field1406 + " | ";
            arg0 = var3.field1408;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        if (arg1 != 16383) {
            field1669 = null;
        }
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var2 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IBLd;)V", line = 286)
    public final void method790(int arg0, byte arg1, class102 arg2) {
        field1668++;
        if (arg0 == -1 || !this.method784()) {
            return;
        }
        class130 var4 = arg2.field1399[arg0];
        class297 var5 = var4.field1786;
        int var6 = 29 % ((-arg1 - 25) / 41);
        for (int var7 = 0; var7 < var4.field1785; var7++) {
            short var8 = var4.field1795[var7];
            if (var5.field4098[var8]) {
                if (var4.field1796[var7] != -1) {
                    this.method803(0, 0, 0, 0);
                }
                this.method803(var5.field4099[var8], var4.field1791[var7], var4.field1784[var7], var4.field1782[var7]);
            }
        }
        this.method786();
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIILna;BI)V", line = 327)
    public final void method792(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class35 arg6, byte arg7, int arg8) {
        field1670++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg3 / 2;
        int var14 = -arg2 / 2;
        int var15 = arg6.method232(arg5 + var13, arg8 + var14);
        int var16 = arg3 / 2;
        int var17 = -arg2 / 2;
        int var18 = arg6.method232(arg5 + var16, arg8 + var17);
        int var19 = -arg3 / 2;
        int var20 = arg2 / 2;
        if (arg7 != -28) {
            return;
        }
        int var21 = arg6.method232(arg5 + var19, arg8 + var20);
        int var22 = arg3 / 2;
        int var23 = arg2 / 2;
        int var24 = arg6.method232(arg5 + var22, arg8 - -var23);
        int var25 = var15 >= var18 ? var18 : var15;
        int var26 = var24 > var21 ? var21 : var24;
        int var27 = var24 > var18 ? var18 : var24;
        int var28 = var15 >= var21 ? var21 : var15;
        if (arg2 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg1 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg1;
                        if (var30 > var29) {
                            var29 = var30;
                        }
                    } else if (var29 > arg1) {
                        var29 = arg1;
                    }
                }
                this.method773(var29);
            }
        }
        if (arg3 != 0) {
            int var31 = (int) (Math.atan2((double) (var28 - var27), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
            if (var31 != 0) {
                if (arg4 != 0) {
                    if (var31 > 8192) {
                        int var32 = 16384 - arg4;
                        if (var31 < var32) {
                            var31 = var32;
                        }
                    } else if (var31 > arg4) {
                        var31 = arg4;
                    }
                }
                this.method805(var31);
            }
        }
        int var33 = var15 + var24;
        if (var33 > var18 + var21) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg0;
        if (var34 != 0) {
            this.method797(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([ZIIILgr;Lvb;ZZLvb;II[I)V", line = 446)
    private final void method794(boolean[] arg0, int arg1, int arg2, int arg3, class297 arg4, class130 arg5, boolean arg6, boolean arg7, class130 arg8, int arg9, int arg10, int[] arg11) {
        field1667++;
        if (arg5 == null || arg3 == 0) {
            for (int var38 = 0; var38 < arg8.field1785; var38++) {
                short var39 = arg8.field1795[var38];
                if (arg0 == null || arg6 == arg0[var39] || arg4.field4099[var39] == 0) {
                    short var40 = arg8.field1796[var38];
                    if (var40 != -1) {
                        this.method772(0, 0, arg10, 0, arg4.field4100[var40], arg11, arg7, (byte) -55, arg1 & arg4.field4102[var40], 0);
                    }
                    this.method772(arg8.field1784[var38], arg4.field4099[var39], arg10, arg8.field1782[var38], arg4.field4100[var39], arg11, arg7, (byte) -55, arg1 & arg4.field4102[var39], arg8.field1791[var38]);
                }
            }
            return;
        }
        if (arg9 != 3) {
            field1669 = null;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg4.field4106; var15++) {
            boolean var16 = false;
            if (var13 < arg8.field1785 && arg8.field1795[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg5.field1785 > var14 && arg5.field1795[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg0 == null || arg0[var15] == arg6 || arg4.field4099[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg4.field4099[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    byte var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var24 = arg8.field1782[var13];
                        var21 = arg8.field1793[var13];
                        var20 = arg8.field1791[var13];
                        var22 = arg8.field1796[var13];
                        var23 = arg8.field1784[var13];
                        var13++;
                    } else {
                        var20 = var18;
                        var21 = 0;
                        var22 = -1;
                        var23 = var18;
                        var24 = var18;
                    }
                    short var25;
                    byte var26;
                    short var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg5.field1796[var14];
                        var29 = arg5.field1791[var14];
                        var27 = arg5.field1782[var14];
                        var28 = arg5.field1784[var14];
                        var26 = arg5.field1793[var14];
                        var14++;
                    } else {
                        var25 = -1;
                        var26 = 0;
                        var27 = var18;
                        var28 = var18;
                        var29 = var18;
                    }
                    int var30;
                    int var31;
                    int var32;
                    if ((var21 & 0x2) != 0 || (var26 & 0x1) != 0) {
                        var30 = var20;
                        var32 = var24;
                        var31 = var23;
                    } else if (var19 == 2) {
                        int var35 = var29 - var20 & 0x3FFF;
                        int var36 = var28 - var23 & 0x3FFF;
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        int var37 = var27 - var24 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var31 = var23 + (arg3 * var36 / arg2) & 0x3FFF;
                        var30 = arg3 * var35 / arg2 + var20 & 0x3FFF;
                        var32 = var24 + (arg3 * var37 / arg2) & 0x3FFF;
                    } else if (var19 == 9) {
                        int var34 = var29 - var20 & 0x3FFF;
                        if (var34 >= 8192) {
                            var34 -= 16384;
                        }
                        var30 = arg3 * var34 / arg2 + var20 & 0x3FFF;
                        var32 = 0;
                        var31 = 0;
                    } else if (var19 == 7) {
                        int var33 = var29 - var20 & 0x3F;
                        if (var33 >= 32) {
                            var33 -= 64;
                        }
                        var31 = var23 + ((var28 - var23) * arg3 / arg2);
                        var32 = var24 + ((var27 - var24) * arg3 / arg2);
                        var30 = arg3 * var33 / arg2 + var20 & 0x3F;
                    } else {
                        var30 = (var29 - var20) * arg3 / arg2 + var20;
                        var31 = (var28 - var23) * arg3 / arg2 + var23;
                        var32 = (var27 - var24) * arg3 / arg2 + var24;
                    }
                    if (var22 != -1) {
                        this.method772(0, 0, arg10, 0, arg4.field4100[var22], arg11, arg7, (byte) -55, arg1 & arg4.field4102[var22], 0);
                    } else if (var25 != -1) {
                        this.method772(0, 0, arg10, 0, arg4.field4100[var25], arg11, arg7, (byte) -55, arg1 & arg4.field4102[var25], 0);
                    }
                    this.method772(var31, var19, arg10, var32, arg4.field4100[var15], arg11, arg7, (byte) -55, arg1 & arg4.field4102[var15], var30);
                } else {
                    if (var17) {
                        var14++;
                    }
                    if (var16) {
                        var13++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IZIZLd;IIILd;Ld;I[ZLd;II)V", line = 668)
    public final void method802(int arg0, boolean arg1, int arg2, boolean arg3, class102 arg4, int arg5, int arg6, int arg7, class102 arg8, class102 arg9, int arg10, boolean[] arg11, class102 arg12, int arg13, int arg14) {
        field1666++;
        if (arg10 == -1) {
            return;
        }
        if (arg11 == null || arg5 == -1) {
            this.method768(arg7, arg10, 0, arg8, arg1, arg12, arg14, -108, arg6);
        } else if (this.method784()) {
            class130 var16 = arg12.field1399[arg10];
            class297 var17 = var16.field1786;
            class130 var18 = null;
            if (arg8 != null) {
                var18 = arg8.field1399[arg14];
                if (var18.field1786 != var17) {
                    var18 = null;
                }
            }
            this.method794(arg11, 65535, arg6, arg7, var17, var18, arg3, arg1, var16, 3, 0, null);
            class130 var19 = arg4.field1399[arg5];
            class130 var20 = null;
            if (arg9 != null) {
                var20 = arg9.field1399[arg0];
                if (var20.field1786 != var17) {
                    var20 = null;
                }
            }
            this.method809(0, new int[0], 0, 0, 0, 0, arg1);
            this.method794(arg11, 65535, arg2, arg13, var19.field1786, var20, true, arg1, var19, 3, 0, null);
            this.method786();
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V", line = 723)
    public static void method804(int arg0) {
        if (arg0 != 3) {
            field1669 = null;
        }
        field1669 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BIZ)Lc;")
    public abstract class121 method761(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!c", name = "fa", descriptor = "()I")
    public abstract int method762();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V")
    public abstract void method763(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lia;Lnh;II)V")
    public abstract void method764(class415 arg0, class525 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "C", descriptor = "()I")
    public abstract int method765();

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "()I")
    public abstract int method766();

    @OriginalMember(owner = "client!c", name = "va", descriptor = "(I[IIIIZI[I)V")
    public abstract void method767(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!c", name = "XA", descriptor = "(III)V")
    public abstract void method769(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()[Lvj;")
    public abstract class304[] method770();

    @OriginalMember(owner = "client!c", name = "b", descriptor = "()I")
    public abstract int method771();

    @OriginalMember(owner = "client!c", name = "WA", descriptor = "(I)V")
    public abstract void method773(int arg0);

    @OriginalMember(owner = "client!c", name = "ea", descriptor = "(IILna;Lna;III)V")
    public abstract void method774(int arg0, int arg1, class35 arg2, class35 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!c", name = "n", descriptor = "()I")
    public abstract int method775();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IILia;Z)Z")
    public abstract boolean method777(int arg0, int arg1, class415 arg2, boolean arg3);

    @OriginalMember(owner = "client!c", name = "la", descriptor = "()I")
    public abstract int method778();

    @OriginalMember(owner = "client!c", name = "sa", descriptor = "()V")
    public abstract void method779();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lia;Lnh;I)V")
    public abstract void method781(class415 arg0, class525 arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "ia", descriptor = "(I)V")
    public abstract void method782(int arg0);

    @OriginalMember(owner = "client!c", name = "VA", descriptor = "()I")
    public abstract int method783();

    @OriginalMember(owner = "client!c", name = "FA", descriptor = "()Z")
    public abstract boolean method784();

    @OriginalMember(owner = "client!c", name = "ua", descriptor = "(Lj;)Lj;")
    public abstract class378 method785(class378 arg0);

    @OriginalMember(owner = "client!c", name = "W", descriptor = "()V")
    public abstract void method786();

    @OriginalMember(owner = "client!c", name = "u", descriptor = "(I)V")
    public abstract void method787(int arg0);

    @OriginalMember(owner = "client!c", name = "c", descriptor = "()[Lit;")
    public abstract class456[] method789();

    @OriginalMember(owner = "client!c", name = "N", descriptor = "(SS)V")
    public abstract void method791(short arg0, short arg1);

    @OriginalMember(owner = "client!c", name = "oa", descriptor = "(I)V")
    public abstract void method793(int arg0);

    @OriginalMember(owner = "client!c", name = "ZA", descriptor = "(I)V")
    public abstract void method795(int arg0);

    @OriginalMember(owner = "client!c", name = "d", descriptor = "()V")
    public abstract void method796();

    @OriginalMember(owner = "client!c", name = "ja", descriptor = "(III)V")
    public abstract void method797(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "k", descriptor = "(I)V")
    public abstract void method798(int arg0);

    @OriginalMember(owner = "client!c", name = "X", descriptor = "()I")
    public abstract int method799();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lc;IIIZ)V")
    public abstract void method800(class121 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!c", name = "e", descriptor = "()Z")
    public abstract boolean method801();

    @OriginalMember(owner = "client!c", name = "K", descriptor = "(IIII)V")
    public abstract void method803(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "o", descriptor = "(I)V")
    public abstract void method805(int arg0);

    @OriginalMember(owner = "client!c", name = "E", descriptor = "()I")
    public abstract int method806();

    @OriginalMember(owner = "client!c", name = "ra", descriptor = "()I")
    public abstract int method807();

    @OriginalMember(owner = "client!c", name = "YA", descriptor = "(SS)V")
    public abstract void method808(short arg0, short arg1);

    @OriginalMember(owner = "client!c", name = "xa", descriptor = "(I[IIIIIZ)V")
    public abstract void method809(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);
}
