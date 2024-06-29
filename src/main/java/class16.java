import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class16 {

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "[I")
    private int[] field325;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "[B")
    private byte[] field324;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "[I")
    private int[] field326;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field322 = 0;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "Ljava/lang/String;")
    public static String field321 = "Loaded input handler";

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public static int field328 = 0;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "Ldl;")
    public static class123 field314;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "[I")
    public static int[] field319;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II[BI[BB)I")
    public final int method87(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, byte arg5) {
        field313++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = 0;
        if (arg5 <= 125) {
            return -48;
        }
        int var8 = arg0 + arg1;
        int var9 = arg3;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 >= 0) {
                var7++;
            } else {
                var7 = this.field326[var7];
            }
            int var11;
            if ((var11 = this.field326[var7]) < 0) {
                arg4[arg1++] = (byte) (~var11);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field326[var7];
            }
            int var12;
            if ((var12 = this.field326[var7]) < 0) {
                arg4[arg1++] = (byte) (~var12);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field326[var7];
            }
            int var13;
            if ((var13 = this.field326[var7]) < 0) {
                arg4[arg1++] = (byte) (~var13);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field326[var7];
            }
            int var14;
            if ((var14 = this.field326[var7]) < 0) {
                arg4[arg1++] = (byte) (~var14);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field326[var7];
            }
            int var15;
            if ((var15 = this.field326[var7]) < 0) {
                arg4[arg1++] = (byte) (~var15);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field326[var7];
            }
            int var16;
            if ((var16 = this.field326[var7]) < 0) {
                arg4[arg1++] = (byte) (~var16);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field326[var7];
            }
            int var17;
            if ((var17 = this.field326[var7]) < 0) {
                arg4[arg1++] = (byte) (~var17);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field326[var7];
            }
            int var18;
            if ((var18 = this.field326[var7]) < 0) {
                arg4[arg1++] = (byte) (~var18);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)V")
    public static void method88(boolean arg0) {
        if (!arg0) {
            field321 = null;
            field319 = null;
            field314 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "([B)V")
    public class16(byte[] arg0) {
        int[] var2 = new int[33];
        int var3 = arg0.length;
        this.field325 = new int[var3];
        this.field324 = arg0;
        int var4 = 0;
        this.field326 = new int[8];
        for (int var5 = 0; var5 < var3; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var2[var6];
                this.field325[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var2[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var11 & var10) != 0) {
                            var2[var9] = var2[var9 - 1];
                            break;
                        }
                        var2[var9] = class312.method2107(var10, var11);
                    }
                    var12 = var8 | var7;
                } else {
                    var12 = var2[var6 - 1];
                }
                var2[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var2[var13] == var8) {
                        var2[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field326[var14] == 0) {
                            this.field326[var14] = var4;
                        }
                        var14 = this.field326[var14];
                    }
                    if (this.field326.length <= var14) {
                        int[] var17 = new int[this.field326.length * 2];
                        for (int var18 = 0; var18 < this.field326.length; var18++) {
                            var17[var18] = this.field326[var18];
                        }
                        this.field326 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field326[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZI)I")
    public static final int method89(int arg0, boolean arg1, int arg2) {
        field315++;
        class302 var3 = (class302) class21.field381.method987(-107, (long) arg2);
        if (arg1) {
            return 60;
        } else if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field4927.length; var5++) {
                if (var3.field4922[var5] == arg0) {
                    var4 += var3.field4927[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIII[B[B)I")
    public final int method90(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte[] arg5) {
        field329++;
        int var7 = arg2 + arg3;
        int var8 = 0;
        if (arg1 != -916229452) {
            method91(-117, -42, -100, -64, (byte) 72, 14, 67, -97);
        }
        int var9 = arg0 << 3;
        while (arg2 < var7) {
            int var10 = arg5[arg2] & 0xFF;
            int var11 = this.field325[var10];
            byte var12 = this.field324[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = (var14 + var12 - 1 >> 3) + var13;
            int var16 = var8 & -var14 >> 31;
            var9 += var12;
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var8 = class312.method2107(var16, var11 >>> var17));
            if (var15 > var13) {
                var14 = var17 - 8;
                var13++;
                arg4[var13] = (byte) (var8 = var11 >>> var14);
                if (var13 < var15) {
                    var13++;
                    var14 -= 8;
                    arg4[var13] = (byte) (var8 = var11 >>> var14);
                    if (var15 > var13) {
                        var13++;
                        var14 -= 8;
                        arg4[var13] = (byte) (var8 = var11 >>> var14);
                        if (var13 < var15) {
                            var13++;
                            var14 -= 8;
                            arg4[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg2++;
        }
        return (var9 + 7 >> 3) - arg0;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method91(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field317++;
        int var8 = arg2 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = class118.field1989 + ((class238.field4012 - class118.field1989) * var8 / 100);
        int var10 = 2048 - arg1 & 0x7FF;
        int var11 = 0;
        int var12 = 2048 - arg7 & 0x7FF;
        int var13 = arg3 * var9 >> 8;
        int var14 = 0;
        int var15 = var13;
        if (arg4 > -77) {
            field319 = null;
        }
        if (var10 != 0) {
            int var16 = class128.field2133[var10];
            int var17 = class128.field2130[var10];
            var14 = -var13 * var16 >> 16;
            var15 = var13 * var17 >> 16;
        }
        if (var12 != 0) {
            int var18 = class128.field2130[var12];
            int var19 = class128.field2133[var12];
            var11 = var15 * var19 >> 16;
            var15 = var15 * var18 >> 16;
        }
        class183.field2926 = arg1;
        class245.field4102 = arg7;
        class263.field4393 = arg0 - var14;
        class107.field1758 = arg6 - var11;
        class76.field1302 = arg5 - var15;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIILlb;I)V")
    public static final void method92(int arg0, int arg1, int arg2, int arg3, int arg4, class311 arg5, int arg6) {
        long var7 = 0L;
        if (arg2 == 0) {
            var7 = class185.method1342(arg6, arg0, arg1);
        } else if (arg2 == 1) {
            var7 = class299.method2050(arg6, arg0, arg1);
        } else if (arg2 == 2) {
            var7 = class76.method539(arg6, arg0, arg1);
        } else if (arg2 == 3) {
            var7 = class20.method133(arg6, arg0, arg1);
        }
        boolean var9 = true;
        int var10 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        field323++;
        if (arg4 != -1394) {
            field316 = -65;
        }
        boolean var11 = false;
        boolean var12 = false;
        class1 var13 = class110.method827(var10, (byte) -109);
        int var14 = (int) var7 >> 20 & 0x3;
        if (var13.method16((byte) -64)) {
            class1.method18(arg0, arg1, arg6, var13, true);
        }
        int var15 = (int) var7 >> 14 & 0x1F;
        if (var7 == 0L) {
            return;
        }
        if (arg2 == 0) {
            class132.method984(arg6, arg0, arg1);
            if (var13.field36 != 0) {
                arg5.method2098(true, var15, arg0, var14, var13.field17, arg1, !var13.field35);
            }
        } else if (arg2 == 1) {
            class151.method1139(arg6, arg0, arg1);
        } else if (arg2 == 2) {
            class193.method1385(arg6, arg0, arg1);
            if (var13.field36 != 0 && (var13.field57 + arg0) < 104 && (var13.field57 + arg1) < 104 && (arg0 + var13.field10) < 104 && arg1 + var13.field10 < 104) {
                arg5.method2096(arg0, arg1, var14, !var13.field35, true, var13.field10, var13.field17, var13.field57);
            }
        } else if (arg2 == 3) {
            class68.method465(arg6, arg0, arg1);
            if (var13.field36 == 1) {
                arg5.method2090(arg1, arg0, (byte) 124);
            }
        }
        if (var13.field34 != null) {
            class1 var20 = var13.method22((byte) 117);
            return;
        }
    }
}
