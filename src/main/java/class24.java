import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class24 {

    @OriginalMember(owner = "client!o", name = "c", descriptor = "[B")
    private byte[] field310;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "[I")
    private int[] field313;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "[I")
    private int[] field309;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "[I")
    public static int[] field311 = new int[1000];

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field315 = 0;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "Loe;")
    public static class127 field319 = new class127(10, 8);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
    public static void method124(byte arg0) {
        field319 = null;
        field311 = null;
        if (arg0 != 65) {
            method130(43, 10, false, -0.9292128F, -30, 115, -105, 40, -47);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIFFFIIFLgg;F[BI)V")
    public static final void method125(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, int arg7, float arg8, class111 arg9, float arg10, byte[] arg11, int arg12) {
        if (arg0 < 71) {
            field319 = null;
        }
        for (int var13 = 0; var13 < arg2; var13++) {
            class6.method31(arg3, arg6, arg11, arg10, arg7, arg9, arg2, 123, arg8, arg12, arg4, arg5, arg1, var13);
            arg7 += arg1 * arg12;
        }
        field314++;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I[BI[BII)I")
    public final int method126(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field308++;
        if (arg0 != 14298) {
            return 27;
        }
        int var7 = 0;
        int var8 = arg2 + arg5;
        int var9 = arg4 << 3;
        while (var8 > arg2) {
            int var10 = arg3[arg2] & 0xFF;
            int var11 = this.field313[var10];
            byte var12 = this.field310[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var7 = class318.method1973(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg1[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg1[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg1[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg1[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var9 += var12;
            arg2++;
        }
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "([B)V")
    public class24(byte[] arg0) {
        int var2 = arg0.length;
        this.field310 = arg0;
        this.field313 = new int[var2];
        int[] var3 = new int[33];
        this.field309 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field313[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class318.method1973(var11, var12);
                    }
                    var9 = var8 | var7;
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field309[var14] == 0) {
                            this.field309[var14] = var4;
                        }
                        var14 = this.field309[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field309.length <= var14) {
                        int[] var18 = new int[this.field309.length * 2];
                        for (int var19 = 0; var19 < this.field309.length; var19++) {
                            var18[var19] = this.field309[var19];
                        }
                        this.field309 = var18;
                    }
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field309[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIZ)V")
    public static final void method127(int arg0, int arg1, boolean arg2) {
        field312++;
        class64 var3 = class230.method1387(arg0, (byte) 40, 6);
        var3.method441((byte) 58);
        if (arg2) {
            var3.field1051 = arg1;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I[BZII[B)I")
    public final int method128(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4, byte[] arg5) {
        field318++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg3 + arg4;
        if (arg2) {
            method124((byte) -123);
        }
        int var9 = arg0;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 < 0) {
                var7 = this.field309[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field309[var7]) < 0) {
                arg1[arg4++] = (byte) (~var11);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field309[var7];
            }
            int var12;
            if ((var12 = this.field309[var7]) < 0) {
                arg1[arg4++] = (byte) (~var12);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field309[var7];
            }
            int var13;
            if ((var13 = this.field309[var7]) < 0) {
                arg1[arg4++] = (byte) (~var13);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field309[var7];
            }
            int var14;
            if ((var14 = this.field309[var7]) < 0) {
                arg1[arg4++] = (byte) (~var14);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field309[var7];
            }
            int var15;
            if ((var15 = this.field309[var7]) < 0) {
                arg1[arg4++] = (byte) (~var15);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field309[var7];
            }
            int var16;
            if ((var16 = this.field309[var7]) < 0) {
                arg1[arg4++] = (byte) (~var16);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field309[var7];
            }
            int var17;
            if ((var17 = this.field309[var7]) < 0) {
                arg1[arg4++] = (byte) (~var17);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field309[var7];
            }
            int var18;
            if ((var18 = this.field309[var7]) < 0) {
                arg1[arg4++] = (byte) (~var18);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 - (arg0 - 1);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static final void method129(int arg0) {
        if (arg0 != 30156) {
            return;
        }
        field321++;
        class288 var1 = class33.field452;
        synchronized (class33.field452) {
            class33.field452.method1761(-116);
        }
        class288 var2 = class93.field1667;
        synchronized (class93.field1667) {
            class93.field1667.method1761(-111);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIZFIIIII)[[I")
    public static final int[][] method130(int arg0, int arg1, boolean arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field316++;
        int[][] var9 = new int[arg7][arg1];
        class369 var10 = new class369();
        var10.field5420 = arg5;
        var10.field5418 = arg6;
        var10.field5416 = arg0;
        var10.field5427 = arg2;
        var10.field5429 = (int) (arg3 * 4096.0F);
        var10.method211(-3);
        class223.method1355(arg7, arg1, (byte) 14);
        int var11 = 0;
        if (arg4 != 29642) {
            return null;
        }
        while (var11 < arg7) {
            var10.method2235(var9[var11], (byte) 101, var11);
            var11++;
        }
        return var9;
    }
}
