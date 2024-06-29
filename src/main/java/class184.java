import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class184 {

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "[I")
    private int[] field3292;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "[I")
    private int[] field3294;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "[B")
    private byte[] field3296;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public static int field3298 = 0;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "Lvf;")
    public static class265 field3291 = class87.method582(-46, ":");

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "Loe;")
    public static class108 field3293;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)V")
    public static void method1238(boolean arg0) {
        field3291 = null;
        field3293 = null;
        if (arg0) {
            field3297 = 34;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "([BZ[BIII)I")
    public final int method1239(byte[] arg0, boolean arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field3295++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg3 + arg4;
        int var9 = arg5;
        while (true) {
            byte var10 = arg0[var9];
            if (var10 < 0) {
                var7 = this.field3294[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field3294[var7]) < 0) {
                arg2[arg4++] = (byte) (~var11);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field3294[var7];
            }
            int var12;
            if ((var12 = this.field3294[var7]) < 0) {
                arg2[arg4++] = (byte) (~var12);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field3294[var7];
            }
            int var13;
            if ((var13 = this.field3294[var7]) < 0) {
                arg2[arg4++] = (byte) (~var13);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field3294[var7];
            }
            int var14;
            if ((var14 = this.field3294[var7]) < 0) {
                arg2[arg4++] = (byte) (~var14);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field3294[var7];
            }
            int var15;
            if ((var15 = this.field3294[var7]) < 0) {
                arg2[arg4++] = (byte) (~var15);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field3294[var7];
            }
            int var16;
            if ((var16 = this.field3294[var7]) < 0) {
                arg2[arg4++] = (byte) (~var16);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field3294[var7];
            }
            int var17;
            if ((var17 = this.field3294[var7]) < 0) {
                arg2[arg4++] = (byte) (~var17);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field3294[var7];
            }
            int var18;
            if ((var18 = this.field3294[var7]) < 0) {
                arg2[arg4++] = (byte) (~var18);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        if (arg1) {
            method1241(25, (class265) null);
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "([BIII[BI)I")
    public final int method1240(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        int var7 = arg1 + arg3;
        field3289++;
        int var8 = 85 / ((-arg2 - 82) / 40);
        int var9 = 0;
        int var10 = arg5 << 3;
        while (var7 > arg1) {
            int var11 = arg0[arg1] & 0xFF;
            byte var12 = this.field3296[var11];
            int var13 = this.field3292[var11];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var10 >> 3;
            int var15 = var10 & 0x7;
            var10 += var12;
            int var16 = var14 + (var15 + var12 - 1 >> 3);
            int var17 = var9 & -var15 >> 31;
            int var18 = var15 + 24;
            arg4[var14] = (byte) (var9 = class144.method992(var17, var13 >>> var18));
            if (var16 > var14) {
                var15 = var18 - 8;
                var14++;
                arg4[var14] = (byte) (var9 = var13 >>> var15);
                if (var16 > var14) {
                    var14++;
                    var15 -= 8;
                    arg4[var14] = (byte) (var9 = var13 >>> var15);
                    if (var16 > var14) {
                        var14++;
                        var15 -= 8;
                        arg4[var14] = (byte) (var9 = var13 >>> var15);
                        if (var16 > var14) {
                            var14++;
                            var15 -= 8;
                            arg4[var14] = (byte) (var9 = var13 << -var15);
                        }
                    }
                }
            }
            arg1++;
        }
        return (var10 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "([B)V")
    public class184(byte[] arg0) {
        int[] var2 = new int[33];
        int var3 = arg0.length;
        this.field3292 = new int[var3];
        this.field3294 = new int[8];
        this.field3296 = arg0;
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var2[var6];
                this.field3292[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var2[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var2[var10] = var2[var10 - 1];
                            break;
                        }
                        var2[var10] = class144.method992(var11, var12);
                    }
                } else {
                    var9 = var2[var6 - 1];
                }
                var2[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var2[var13] == var8) {
                        var2[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field3294[var14] == 0) {
                            this.field3294[var14] = var4;
                        }
                        var14 = this.field3294[var14];
                    }
                    if (this.field3294.length <= var14) {
                        int[] var17 = new int[this.field3294.length * 2];
                        for (int var18 = 0; var18 < this.field3294.length; var18++) {
                            var17[var18] = this.field3294[var18];
                        }
                        this.field3294 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field3294[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILvf;)Lvf;")
    public static final class265 method1241(int arg0, class265 arg1) {
        field3290++;
        int var2 = class49.method399(arg1, arg0 + 24355);
        if (var2 == -1) {
            return class119.field2107;
        } else if (arg0 == -24463) {
            return class126.field2260.field2702[var2].method1763(class147.field2752, arg0 ^ 0xFFFFA08E, class31.field799);
        } else {
            return null;
        }
    }
}
