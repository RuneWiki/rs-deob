import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class639 {

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "[I")
    private int[] field8780;

    @OriginalMember(owner = "client!wda", name = "e", descriptor = "[B")
    private byte[] field8783;

    @OriginalMember(owner = "client!wda", name = "j", descriptor = "[I")
    private int[] field8788;

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "Z")
    public static boolean field8781 = false;

    @OriginalMember(owner = "client!wda", name = "i", descriptor = "Lmu;")
    public static class303 field8787 = new class303(55, 0);

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "I")
    public static int field8779;

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "I")
    public static int field8782;

    @OriginalMember(owner = "client!wda", name = "f", descriptor = "I")
    public static int field8784;

    @OriginalMember(owner = "client!wda", name = "g", descriptor = "I")
    public static int field8785;

    @OriginalMember(owner = "client!wda", name = "h", descriptor = "I")
    public static int field8786;

    @OriginalMember(owner = "client!wda", name = "k", descriptor = "I")
    public static int field8789;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3626(int arg0, byte arg1, int arg2) {
        int var3 = 41 / ((59 - arg1) / 37);
        field8779++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)V")
    public static void method3627(int arg0) {
        if (arg0 != 32) {
            field8787 = null;
        }
        field8787 = null;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "([BI[BIII)I")
    public final int method3628(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field8784++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = arg3 + arg5;
        int var8 = 0;
        if (arg4 != -1) {
            this.field8788 = null;
        }
        int var9 = arg1;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field8788[var8];
            }
            int var11;
            if ((var11 = this.field8788[var8]) < 0) {
                arg0[arg5++] = (byte) (~var11);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field8788[var8];
            }
            int var12;
            if ((var12 = this.field8788[var8]) < 0) {
                arg0[arg5++] = (byte) (~var12);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field8788[var8];
            }
            int var13;
            if ((var13 = this.field8788[var8]) < 0) {
                arg0[arg5++] = (byte) (~var13);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field8788[var8];
            }
            int var14;
            if ((var14 = this.field8788[var8]) < 0) {
                arg0[arg5++] = (byte) (~var14);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field8788[var8];
            }
            int var15;
            if ((var15 = this.field8788[var8]) < 0) {
                arg0[arg5++] = (byte) (~var15);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field8788[var8];
            }
            int var16;
            if ((var16 = this.field8788[var8]) < 0) {
                arg0[arg5++] = (byte) (~var16);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field8788[var8];
            }
            int var17;
            if ((var17 = this.field8788[var8]) < 0) {
                arg0[arg5++] = (byte) (~var17);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field8788[var8];
            }
            int var18;
            if ((var18 = this.field8788[var8]) < 0) {
                arg0[arg5++] = (byte) (~var18);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg1;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(III[BI[B)I")
    public final int method3629(int arg0, int arg1, int arg2, byte[] arg3, int arg4, byte[] arg5) {
        field8785++;
        int var7 = 0;
        int var8 = arg0 + arg1;
        int var9 = arg2 << 3;
        if (arg4 <= 14) {
            this.method3628(null, 61, null, 89, 122, 10);
        }
        while (arg1 < var8) {
            int var10 = arg3[arg1] & 0xFF;
            int var11 = this.field8780[var10];
            byte var12 = this.field8783[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            var9 += var12;
            int var17 = var14 + 24;
            arg5[var13] = (byte) (var7 = class418.method2577(var15, var11 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg5[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg5[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg5[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg5[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg1++;
        }
        return (var9 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(I)V")
    public static final void method3630(int arg0) {
        if (arg0 == 0) {
            class653.method3689(7851);
            field8786++;
            class15.method120(false);
        }
    }

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "([B)V")
    public class639(byte[] arg0) {
        int var2 = arg0.length;
        this.field8780 = new int[var2];
        this.field8783 = arg0;
        this.field8788 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field8780[var5] = var8;
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
                        var3[var10] = class418.method2577(var11, var12);
                    }
                    var9 = var7 | var8;
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
                        if (this.field8788[var14] == 0) {
                            this.field8788[var14] = var4;
                        }
                        var14 = this.field8788[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field8788.length) {
                        int[] var18 = new int[this.field8788.length * 2];
                        for (int var19 = 0; var19 < this.field8788.length; var19++) {
                            var18[var19] = this.field8788[var19];
                        }
                        this.field8788 = var18;
                    }
                }
                this.field8788[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
