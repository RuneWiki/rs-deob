import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class50 {

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "Z")
    public boolean field797 = true;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    private int field810 = 0;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
    public int field816 = -1;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public int field796 = 128;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "Ljava/lang/String;")
    public static String field807 = "Discard";

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public int field799;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public int field800;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public int field805;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    public int field809;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "Ll;")
    public static class133 field803;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "[I")
    public static int[] field818;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIBIIIII)V", line = 6)
    public static final void method418(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        field812++;
        int var9 = arg7;
        int var10 = arg4 - arg6;
        int var11 = arg4 * arg4;
        int var12 = 0;
        int var13 = arg7 * arg7;
        int var14 = var10 * var10;
        int var15 = arg7 - arg6;
        int var16 = var15 * var15;
        int var17 = var11 << 1;
        int var18 = var13 << 1;
        int var19 = var14 << 1;
        int var20 = var15 << 1;
        int var21 = var16 << 1;
        int var22 = arg7 << 1;
        int var23 = (1 - var22) * var11 + var18;
        int var24 = var13 - ((var22 - 1) * var17);
        int var25 = var16 - ((var20 - 1) * var19);
        int var26 = (1 - var20) * var14 + var21;
        int var27 = var11 << 2;
        int var28 = var14 << 2;
        int var29 = var16 << 2;
        int var30 = var18 * 3;
        int var31 = var21 * 3;
        int var32 = var13 << 2;
        int var33 = (var20 - 3) * var19;
        int var34 = (var22 - 3) * var17;
        int var35 = var32;
        int var36 = (arg7 - 1) * var27;
        if (class119.field1817 <= arg5 && arg5 <= class141.field2187) {
            int[] var37 = class34.field525[arg5];
            int var38 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg0 - arg4);
            int var39 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg0 + arg4);
            int var40 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg0 - var10);
            int var41 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg0 + var10);
            class272.method1876(var37, var40, var38, arg1, (byte) -101);
            class272.method1876(var37, var41, var40, arg3, (byte) -120);
            class272.method1876(var37, var39, var41, arg1, (byte) -114);
        }
        if (arg2 != -11) {
            field817 = 119;
        }
        int var42 = var29;
        int var43 = (var15 - 1) * var28;
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var30;
                    var24 += var35;
                    var30 += var32;
                    var8++;
                    var35 += var32;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var8++;
                var35 += var32;
                var23 += var30;
                var30 += var32;
            }
            var23 += -var36;
            var36 -= var27;
            var24 += -var34;
            boolean var44 = var15 >= var9;
            var9--;
            var34 -= var27;
            int var45 = arg5 - var9;
            int var46 = arg5 + var9;
            if (var44) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var26 += var31;
                        var12++;
                        var25 += var42;
                        var31 += var29;
                        var42 += var29;
                    }
                }
                if (var25 < 0) {
                    var25 += var42;
                    var42 += var29;
                    var26 += var31;
                    var12++;
                    var31 += var29;
                }
                var25 += -var33;
                var26 += -var43;
                var33 -= var28;
                var43 -= var28;
            }
            if (class119.field1817 <= var46 && class141.field2187 >= var45) {
                int var47 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg0 + var8);
                int var48 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg0 - var8);
                if (var44) {
                    int var49 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg0 + var12);
                    int var50 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg0 - var12);
                    if (var45 >= class119.field1817) {
                        int[] var51 = class34.field525[var45];
                        class272.method1876(var51, var50, var48, arg1, (byte) -120);
                        class272.method1876(var51, var49, var50, arg3, (byte) -61);
                        class272.method1876(var51, var47, var49, arg1, (byte) -19);
                    }
                    if (class141.field2187 >= var46) {
                        int[] var52 = class34.field525[var46];
                        class272.method1876(var52, var50, var48, arg1, (byte) -119);
                        class272.method1876(var52, var49, var50, arg3, (byte) -50);
                        class272.method1876(var52, var47, var49, arg1, (byte) -110);
                    }
                } else {
                    if (var45 >= class119.field1817) {
                        class272.method1876(class34.field525[var45], var47, var48, arg1, (byte) -40);
                    }
                    if (class141.field2187 >= var46) {
                        class272.method1876(class34.field525[var46], var47, var48, arg1, (byte) -121);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZIILkh;)V", line = 212)
    private final void method419(boolean arg0, int arg1, int arg2, class166 arg3) {
        if (arg0) {
            method422((byte) -125);
        }
        if (arg1 == 1) {
            this.field810 = arg3.method1156((byte) 86);
            this.method421(this.field810, -16108);
        } else if (arg1 == 2) {
            this.field816 = arg3.method1151(-73);
            if (this.field816 == 65535) {
                this.field816 = -1;
            }
        } else if (arg1 == 3) {
            this.field796 = arg3.method1151(-107);
        } else if (arg1 == 4) {
            this.field797 = false;
        }
        field808++;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IILkh;)V", line = 254)
    public final void method420(int arg0, int arg1, class166 arg2) {
        while (true) {
            int var4 = arg2.method1178(0);
            if (var4 == 0) {
                field806++;
                if (arg0 != -13138) {
                    this.field796 = -38;
                }
                return;
            }
            this.method419(false, var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V", line = 273)
    private final void method421(int arg0, int arg1) {
        double var3 = (double) ((arg0 & 0xFF2B6E) >> 16) / 256.0D;
        field804++;
        double var5 = (double) ((arg0 & 0xFF3B) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (arg1 != -16108) {
            return;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field799 = (int) (var17 * 256.0D);
        if (var17 > 0.5D) {
            this.field800 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field800 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field800 < 1) {
            this.field800 = 1;
        }
        this.field805 = (int) (var15 * 256.0D);
        if (this.field805 < 0) {
            this.field805 = 0;
        } else if (this.field805 > 255) {
            this.field805 = 255;
        }
        if (this.field799 < 0) {
            this.field799 = 0;
        } else if (this.field799 > 255) {
            this.field799 = 255;
        }
        double var19 = var13 / 6.0D;
        this.field809 = (int) ((double) this.field800 * var19);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V", line = 363)
    public static final void method422(byte arg0) {
        class10.field132.method752(false);
        field811++;
        int var1 = class10.field132.method759(false, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class10.field132.method759(false, 2);
        if (var2 == 0) {
            class260.field4065[class98.field1562++] = 2047;
        } else if (var2 == 1) {
            int var11 = class10.field132.method759(false, 3);
            class98.field1566.method893(var11, 23172, 1);
            int var12 = class10.field132.method759(false, 1);
            if (var12 == 1) {
                class260.field4065[class98.field1562++] = 2047;
            }
        } else {
            if (arg0 < 90) {
                method427(-109, 69, 102, -80, -29, (class85) null, -56, 109, 97);
            }
            if (var2 == 2) {
                if (class10.field132.method759(false, 1) == 1) {
                    int var3 = class10.field132.method759(false, 3);
                    class98.field1566.method893(var3, 23172, 2);
                    int var4 = class10.field132.method759(false, 3);
                    class98.field1566.method893(var4, 23172, 2);
                } else {
                    int var5 = class10.field132.method759(false, 3);
                    class98.field1566.method893(var5, 23172, 0);
                }
                int var6 = class10.field132.method759(false, 1);
                if (var6 == 1) {
                    class260.field4065[class98.field1562++] = 2047;
                }
            } else if (var2 == 3) {
                int var7 = class10.field132.method759(false, 1);
                class205.field3101 = class10.field132.method759(false, 2);
                int var8 = class10.field132.method759(false, 7);
                int var9 = class10.field132.method759(false, 1);
                if (var9 == 1) {
                    class260.field4065[class98.field1562++] = 2047;
                }
                int var10 = class10.field132.method759(false, 7);
                class98.field1566.method276(var7 == 1, var8, -9749, var10);
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V", line = 454)
    public static void method423(int arg0) {
        field807 = null;
        field818 = null;
        if (arg0 >= -59) {
            field818 = (int[]) null;
        }
        field803 = null;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)Lji;", line = 471)
    public static final class301 method424(byte arg0) {
        field815++;
        try {
            if (arg0 != 114) {
                field803 = (class133) null;
            }
            return (class301) Class.forName("oe").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V", line = 503)
    public static final void method425(boolean arg0) {
        if (arg0) {
            class30.field441.method2176((byte) -65);
            field814++;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IBLl;)Lqd;", line = 518)
    public static final class252 method426(int arg0, byte arg1, class133 arg2) {
        if (arg1 != 85) {
            field817 = 107;
        }
        field802++;
        return class125.method907(arg2, -4956, arg0) ? class60.method476(-103) : null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIILan;III)V", line = 535)
    public static final void method427(int arg0, int arg1, int arg2, int arg3, int arg4, class85 arg5, int arg6, int arg7, int arg8) {
        field798++;
        int var9 = arg6 & 0x3;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var11 = arg5.field1390;
            var10 = arg5.field1385;
        } else {
            var10 = arg5.field1390;
            var11 = arg5.field1385;
        }
        int var12;
        int var13;
        if ((arg8 + var10) <= 104) {
            var12 = arg8 + (var10 >> 1);
            var13 = arg8 + (var10 + 1 >> 1);
        } else {
            var13 = arg8 + 1;
            var12 = arg8;
        }
        int var14;
        int var15;
        if (arg2 < arg7 + var11) {
            var14 = arg7 + 1;
            var15 = arg7;
        } else {
            var15 = (var11 >> 1) + arg7;
            var14 = (var11 + 1 >> 1) + arg7;
        }
        int var16 = (arg8 << 7) + (var10 << 6);
        int var17 = 0;
        int[][] var18 = class218.field3321[arg4];
        int var19 = var18[var12][var14] + var18[var12][var15] + var18[var13][var15] + var18[var13][var14] >> 2;
        if (arg4 != 0) {
            int[][] var20 = class218.field3321[0];
            var17 = var19 - (var20[var12][var14] + var20[var12][var15] + var20[var13][var14] + var20[var13][var15] >> 2);
        }
        int[][] var21 = (int[][]) null;
        if (arg4 < 3) {
            var21 = class218.field3321[arg4 + 1];
        }
        int var22 = (arg7 << 7) + (var11 << 6);
        class121 var23 = arg5.method604(arg6, var19, var21, (class168) null, var22, true, false, var16, 1343828227, arg0, var18);
        class6.method53(var23.field1850, var16 - arg1, var17, var22 - arg3);
    }
}
