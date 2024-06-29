import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class33 {

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "[B")
    private byte[] field489;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "[I")
    private int[] field491;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "[I")
    private int[] field495;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "S")
    public static short field488 = 1;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Lob;")
    public static class276 field487 = null;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "Z")
    public static boolean field494 = false;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    public static int field500 = 127;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "[[I")
    public static int[][] field499 = new int[5][5000];

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public static int field497 = 1;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "Z")
    public static boolean field501 = true;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "[Lja;")
    public static class60[] field493 = new class60[32768];

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "[I")
    public static int[] field490;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I[B[BIII)I", line = 17)
    public final int method218(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field492++;
        if (arg5 == 0) {
            return 0;
        }
        int var7 = arg4 + arg5;
        int var8 = 0;
        if (arg0 >= -66) {
            return 18;
        }
        int var9 = arg3;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field491[var8];
            }
            int var11;
            if ((var11 = this.field491[var8]) < 0) {
                arg1[arg4++] = (byte) (~var11);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field491[var8];
            }
            int var12;
            if ((var12 = this.field491[var8]) < 0) {
                arg1[arg4++] = (byte) (~var12);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field491[var8];
            }
            int var13;
            if ((var13 = this.field491[var8]) < 0) {
                arg1[arg4++] = (byte) (~var13);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field491[var8];
            }
            int var14;
            if ((var14 = this.field491[var8]) < 0) {
                arg1[arg4++] = (byte) (~var14);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field491[var8];
            }
            int var15;
            if ((var15 = this.field491[var8]) < 0) {
                arg1[arg4++] = (byte) (~var15);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field491[var8];
            }
            int var16;
            if ((var16 = this.field491[var8]) < 0) {
                arg1[arg4++] = (byte) (~var16);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field491[var8];
            }
            int var17;
            if ((var17 = this.field491[var8]) < 0) {
                arg1[arg4++] = (byte) (~var17);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field491[var8];
            }
            int var18;
            if ((var18 = this.field491[var8]) < 0) {
                arg1[arg4++] = (byte) (~var18);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V", line = 170)
    public static void method219(int arg0) {
        int var1 = -39 % ((-arg0 - 52) / 62);
        field487 = null;
        field490 = null;
        field493 = null;
        field499 = (int[][]) null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I[B[BIBI)I", line = 182)
    public final int method220(int arg0, byte[] arg1, byte[] arg2, int arg3, byte arg4, int arg5) {
        int var7 = arg0 + arg5;
        field496++;
        if (arg4 <= 92) {
            this.method218(120, (byte[]) null, (byte[]) null, 112, 0, 67);
        }
        int var8 = 0;
        int var9 = arg3 << 3;
        while (var7 > arg5) {
            int var10 = arg2[arg5] & 0xFF;
            int var11 = this.field495[var10];
            byte var12 = this.field489[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            var9 += var12;
            int var15 = var8 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var8 = class53.method337(var15, var11 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg1[var13] = (byte) (var8 = var11 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg1[var13] = (byte) (var8 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg1[var13] = (byte) (var8 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg1[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg5++;
        }
        return (var9 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)V", line = 272)
    public static final void method221(int arg0, int arg1, int arg2) {
        field498++;
        class72 var3 = class25.method174(arg2, (byte) -72, 1);
        var3.method477(-113);
        var3.field1265 = arg1;
        if (arg0 >= -101) {
            field487 = (class276) null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "([B)V", line = 301)
    public class33(byte[] arg0) {
        int var2 = arg0.length;
        this.field489 = arg0;
        this.field491 = new int[8];
        int var3 = 0;
        int[] var4 = new int[33];
        this.field495 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field495[var5] = var8;
                int var12;
                if ((var8 & var7) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var4[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var10 & var11) != 0) {
                            var4[var9] = var4[var9 - 1];
                            break;
                        }
                        var4[var9] = class53.method337(var11, var10);
                    }
                    var12 = var8 | var7;
                } else {
                    var12 = var4[var6 - 1];
                }
                var4[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field491[var14] == 0) {
                            this.field491[var14] = var3;
                        }
                        var14 = this.field491[var14];
                    }
                    if (var14 >= this.field491.length) {
                        int[] var17 = new int[this.field491.length * 2];
                        for (int var18 = 0; var18 < this.field491.length; var18++) {
                            var17[var18] = this.field491[var18];
                        }
                        this.field491 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field491[var14] = ~var5;
                if (var3 <= var14) {
                    var3 = var14 + 1;
                }
            }
        }
    }
}
