import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class297 {

    @OriginalMember(owner = "client!te", name = "c", descriptor = "[I")
    private int[] field5074;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "[I")
    private int[] field5072;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "[B")
    private byte[] field5077;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "[I")
    public static int[] field5081 = new int[25];

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIII)V", line = 12)
    public static final void method2049(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 >= class149.field2578 && class327.field5490 >= arg3 && class56.field991 <= arg0 && arg6 <= class142.field2458) {
            if (arg2 == 1) {
                class268.method1887(arg1, 23605, arg3, arg0, arg5, arg6);
            } else {
                class141.method984(arg6, arg1, -60, arg3, arg0, arg5, arg2);
            }
        } else if (arg2 == 1) {
            class318.method2148(arg5, arg6, arg0, arg1, false, arg3);
        } else {
            class120.method854(-347566164, arg5, arg6, arg0, arg2, arg1, arg3);
        }
        if (arg4 == -10383) {
            field5080++;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V", line = 43)
    public static void method2050(int arg0) {
        field5081 = null;
        if (arg0 != 1) {
            field5079 = 67;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BIII[B[B)I", line = 54)
    public final int method2051(byte arg0, int arg1, int arg2, int arg3, byte[] arg4, byte[] arg5) {
        field5073++;
        if (arg1 == 0) {
            return 0;
        }
        if (arg0 >= -26) {
            method2053(-125, (class229) null, 24);
        }
        int var7 = arg1 + arg3;
        int var8 = 0;
        int var9 = arg2;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field5072[var8];
            }
            int var11;
            if ((var11 = this.field5072[var8]) < 0) {
                arg4[arg3++] = (byte) (~var11);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field5072[var8];
            }
            int var12;
            if ((var12 = this.field5072[var8]) < 0) {
                arg4[arg3++] = (byte) (~var12);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field5072[var8];
            }
            int var13;
            if ((var13 = this.field5072[var8]) < 0) {
                arg4[arg3++] = (byte) (~var13);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field5072[var8];
            }
            int var14;
            if ((var14 = this.field5072[var8]) < 0) {
                arg4[arg3++] = (byte) (~var14);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field5072[var8];
            }
            int var15;
            if ((var15 = this.field5072[var8]) < 0) {
                arg4[arg3++] = (byte) (~var15);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field5072[var8];
            }
            int var16;
            if ((var16 = this.field5072[var8]) < 0) {
                arg4[arg3++] = (byte) (~var16);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field5072[var8];
            }
            int var17;
            if ((var17 = this.field5072[var8]) < 0) {
                arg4[arg3++] = (byte) (~var17);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field5072[var8];
            }
            int var18;
            if ((var18 = this.field5072[var8]) < 0) {
                arg4[arg3++] = (byte) (~var18);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg2;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "([B)V", line = 201)
    public class297(byte[] arg0) {
        int var2 = arg0.length;
        this.field5074 = new int[var2];
        int[] var3 = new int[33];
        this.field5072 = new int[8];
        int var4 = 0;
        this.field5077 = arg0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field5074[var5] = var8;
                int var12;
                if ((var8 & var7) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var10 & var11) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class97.method665(var11, var10);
                    }
                    var12 = var7 | var8;
                } else {
                    var12 = var3[var6 - 1];
                }
                var3[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field5072[var14] == 0) {
                            this.field5072[var14] = var4;
                        }
                        var14 = this.field5072[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field5072.length) {
                        int[] var18 = new int[this.field5072.length * 2];
                        for (int var19 = 0; var19 < this.field5072.length; var19++) {
                            var18[var19] = this.field5072[var19];
                        }
                        this.field5072 = var18;
                    }
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field5072[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IB[BI[BI)I", line = 328)
    public final int method2052(int arg0, byte arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        int var7 = 0;
        if (arg1 != 57) {
            return -74;
        }
        int var8 = arg0 << 3;
        field5078++;
        int var9 = arg3 + arg5;
        while (var9 > arg5) {
            int var10 = arg2[arg5] & 0xFF;
            byte var11 = this.field5077[var10];
            int var12 = this.field5074[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = var13 + (var11 + var14 - 1 >> 3);
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var7 = class97.method665(var15, var12 >>> var17));
            if (var16 > var13) {
                var13++;
                var14 = var17 - 8;
                arg4[var13] = (byte) (var7 = var12 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg4[var13] = (byte) (var7 = var12 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg4[var13] = (byte) (var7 = var12 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg4[var13] = (byte) (var7 = var12 << -var14);
                        }
                    }
                }
            }
            var8 += var11;
            arg5++;
        }
        return (var8 + 7 >> 3) - arg0;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjf;I)V", line = 403)
    public static final void method2053(int arg0, class229 arg1, int arg2) {
        class122 var3 = class323.method2175(arg2, arg0, arg2 ^ 0xFFFF9AEC);
        field5075++;
        var3.method862(-29044);
        var3.field2145 = arg1;
    }
}
