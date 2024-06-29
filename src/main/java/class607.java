import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class607 {

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public int field8489 = -1;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public int field8495 = -1;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "Z")
    public boolean field8504 = false;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "Z")
    public boolean field8499 = false;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "Z")
    public boolean field8487 = false;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
    public int field8503 = -1;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public int field8501 = 2;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    public int field8507 = -1;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public int field8490 = 99;

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
    public int field8514 = 5;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
    public int field8510 = -1;

    @OriginalMember(owner = "client!pf", name = "E", descriptor = "Z")
    public boolean field8516 = false;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
    public static int field8511 = 2;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field8486;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field8488;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field8491;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public static int field8496;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public static int field8497;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field8500;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    public static int field8502;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public static int field8505;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
    public static int field8508;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "I")
    public int field8512;

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "I")
    public static int field8513;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "Ljv;")
    public class86 field8493;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "[I")
    public int[] field8492;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "[I")
    public int[] field8494;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "[I")
    public int[] field8498;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "[I")
    public int[] field8506;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "[I")
    private int[] field8515;

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "[I")
    public int[] field8518;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "[Z")
    public boolean[] field8509;

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "[[I")
    public int[][] field8517;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lka;IIIZI)Lka;")
    public final class496 method3520(class496 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field8508++;
        int var7 = this.field8494[arg3];
        int var8 = this.field8492[arg3];
        class369 var9 = this.field8493.method648((byte) 41, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg0.method93((byte) 1, arg1, true);
        }
        class369 var11 = null;
        if ((this.field8504 || class778.field10685) && arg5 != -1 && arg5 < this.field8492.length) {
            int var12 = this.field8492[arg5];
            var11 = this.field8493.method648((byte) 81, var12 >> 16);
            arg5 = var12 & 0xFFFF;
        }
        class369 var13 = null;
        class369 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field8515 != null) {
            if (arg3 < this.field8515.length) {
                var15 = this.field8515[arg3];
                if (var15 != 65535) {
                    var13 = this.field8493.method648((byte) 67, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field8504 || class778.field10685) && arg5 != -1 && arg5 < this.field8515.length) {
                var16 = this.field8515[arg5];
                if (var16 != 65535) {
                    var14 = this.field8493.method648((byte) 107, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field8516) {
            arg1 |= 0x200;
        }
        if (var9.method2303(-1, var10)) {
            arg1 |= 0x80;
        }
        if (var9.method2304(-755, var10)) {
            arg1 |= 0x100;
        }
        if (var9.method2300((byte) -17, var10)) {
            arg1 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2303(-1, var15)) {
                arg1 |= 0x80;
            }
            if (var13.method2304(-755, var15)) {
                arg1 |= 0x100;
            }
            if (var13.method2300((byte) 16, var15)) {
                arg1 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method2303(-1, arg5)) {
                arg1 |= 0x80;
            }
            if (var11.method2304(-755, arg5)) {
                arg1 |= 0x100;
            }
            if (var11.method2300((byte) -125, arg5)) {
                arg1 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method2303(-1, var16)) {
                arg1 |= 0x80;
            }
            if (var14.method2304(-755, var16)) {
                arg1 |= 0x100;
            }
            if (var14.method2300((byte) -120, var16)) {
                arg1 |= 0x400;
            }
        }
        int var17 = arg1 | 0x20;
        class496 var18 = arg0.method93((byte) 1, var17, arg4);
        var18.method3014(var11, var10, arg2 - 1, arg5, var7, this.field8516, (byte) -109, var9, 0);
        if (var13 != null) {
            var18.method3014(var14, var15, arg2 - 1, var16, var7, this.field8516, (byte) -109, var13, 0);
        }
        return var18;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public static final void method3521(byte arg0) {
        field8505++;
        if (class2.field14 != null) {
            return;
        }
        class2.field14 = new int[65536];
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
        int var3 = 0;
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = (float) (-var13) + var12;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - (var6 * var15)) * var8;
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var9 = var8;
                    var10 = var18;
                    var11 = var16;
                } else if (var14 == 1) {
                    var11 = var16;
                    var10 = var8;
                    var9 = var17;
                } else if (var14 == 2) {
                    var9 = var16;
                    var10 = var8;
                    var11 = var18;
                } else if (var14 == 3) {
                    var10 = var17;
                    var9 = var16;
                    var11 = var8;
                } else if (var14 == 4) {
                    var9 = var18;
                    var10 = var16;
                    var11 = var8;
                } else if (var14 == 5) {
                    var9 = var8;
                    var11 = var17;
                    var10 = var16;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var22 << 16) - (-(var23 << 8) - var24) - 16777216;
                class2.field14[var3++] = var25;
            }
        }
        if (arg0 > -94) {
            field8500 = -127;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lka;BIBIIII)Lka;")
    public final class496 method3522(class496 arg0, byte arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field8497++;
        int var9 = this.field8494[arg5];
        int var10 = this.field8492[arg5];
        class369 var11 = this.field8493.method648((byte) 45, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg0.method93(arg1, arg2, true);
        }
        class369 var13 = null;
        if ((this.field8504 || class778.field10685) && arg6 != -1 && arg6 < this.field8492.length) {
            int var14 = this.field8492[arg6];
            var13 = this.field8493.method648((byte) 103, var14 >> 16);
            arg6 = var14 & 0xFFFF;
        }
        if (this.field8516) {
            arg2 |= 0x200;
        }
        if (var11.method2303(-1, var12)) {
            arg2 |= 0x80;
        }
        if (var11.method2304(-755, var12)) {
            arg2 |= 0x100;
        }
        if (var11.method2300((byte) -117, var12)) {
            arg2 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2303(-1, arg6)) {
                arg2 |= 0x80;
            }
            if (var13.method2304(-755, arg6)) {
                arg2 |= 0x100;
            }
            if (var13.method2300((byte) -29, arg6)) {
                arg2 |= 0x400;
            }
        }
        int var15 = arg2 | 0x20;
        class496 var16 = arg0.method93(arg1, var15, true);
        var16.method3014(var13, var12, arg4 - 1, arg6, var9, this.field8516, (byte) -109, var11, arg7);
        if (arg3 <= 124) {
            this.field8504 = false;
        }
        return var16;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IJ)V")
    public static final void method3523(int arg0, long arg1) {
        field8513++;
        int var3 = class210.field3250.field5742 + class488.field6901;
        int var4 = class210.field3250.field5746 + class246.field3650;
        if (class310.field4429 - var3 < -2000 || (class310.field4429 - var3) > 2000 || class198.field3037 - var4 < -2000 || class198.field3037 - var4 > 2000) {
            class310.field4429 = var3;
            class198.field3037 = var4;
        }
        if (class310.field4429 != var3) {
            int var5 = var3 - class310.field4429;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class310.field4429 += var6;
        }
        class758.field10460 += (float) arg1 * class571.field8063 / 6.0F;
        class642.field8990 += (float) arg1 * class174.field2697 / 6.0F;
        if (class198.field3037 != var4) {
            int var7 = var4 - class198.field3037;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class198.field3037 += var8;
        }
        if (arg0 != 1) {
            method3523(-41, 50L);
        }
        class588.method3427((byte) 47);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static final void method3524(int arg0) {
        field8488++;
        if (arg0 >= -67) {
            method3521((byte) -80);
        }
        if (class601.field8423 == null) {
            return;
        }
        for (int var1 = 0; var1 < class601.field8423.length; var1++) {
            for (int var2 = 0; var2 < class601.field8423[var1].length; var2++) {
                class601.field8423[var1][var2] = class758.field10462;
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILso;)V")
    public final void method3525(int arg0, class494 arg1) {
        field8502++;
        if (arg0 != -1) {
            this.method3520(null, -15, -10, 4, true, 122);
        }
        while (true) {
            int var3 = arg1.method2964((byte) 80);
            if (var3 == 0) {
                return;
            }
            this.method3528(arg1, var3, false);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZII)I")
    public final int method3526(int arg0, boolean arg1, int arg2, int arg3) {
        field8486++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field8492[arg3];
        class369 var8 = null;
        class369 var9 = this.field8493.method648((byte) 36, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        } else if (arg2 == 16775) {
            if ((this.field8504 || class778.field10685) && arg0 != -1 && this.field8492.length > arg0) {
                int var11 = this.field8492[arg0];
                var8 = this.field8493.method648((byte) 80, var11 >> 16);
                var6 = var11 & 0xFFFF;
            }
            if (this.field8516) {
                var5 |= 0x200;
            }
            if (var9.method2303(-1, var10)) {
                var5 |= 0x80;
            }
            if (var9.method2304(-755, var10)) {
                var5 |= 0x100;
            }
            if (var9.method2300((byte) -118, var10)) {
                var5 |= 0x400;
            }
            if (var8 != null) {
                if (var8.method2303(arg2 - 16776, var6)) {
                    var5 |= 0x80;
                }
                if (var8.method2304(-755, var6)) {
                    var5 |= 0x100;
                }
                if (var8.method2300((byte) -115, var6)) {
                    var5 |= 0x400;
                }
            }
            if (this.field8515 != null && arg1) {
                if (this.field8515.length > arg3) {
                    int var12 = this.field8515[arg3];
                    if (var12 != 65535) {
                        class369 var13 = this.field8493.method648((byte) 116, var12 >> 16);
                        int var14 = var12 & 0xFFFF;
                        if (var13 != null) {
                            if (var13.method2303(-1, var14)) {
                                var5 |= 0x80;
                            }
                            if (var13.method2304(-755, var14)) {
                                var5 |= 0x100;
                            }
                            if (var13.method2300((byte) -25, var14)) {
                                var5 |= 0x400;
                            }
                        }
                    }
                }
                if ((this.field8504 || class778.field10685) && arg0 != -1 && this.field8515.length > arg0) {
                    int var15 = this.field8515[arg0];
                    if (var15 != 65535) {
                        class369 var16 = this.field8493.method648((byte) 49, var15 >> 16);
                        int var17 = var15 & 0xFFFF;
                        if (var16 != null) {
                            if (var16.method2303(-1, var17)) {
                                var5 |= 0x80;
                            }
                            if (var16.method2304(-755, var17)) {
                                var5 |= 0x100;
                            }
                            if (var16.method2300((byte) -118, var17)) {
                                var5 |= 0x400;
                            }
                        }
                    }
                }
            }
            return var5 | 0x20;
        } else {
            return -34;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V")
    public final void method3527(boolean arg0) {
        field8491++;
        if (this.field8503 == -1) {
            if (this.field8509 == null) {
                this.field8503 = 0;
            } else {
                this.field8503 = 2;
            }
        }
        if (!arg0 || this.field8489 != -1) {
            return;
        }
        if (this.field8509 == null) {
            this.field8489 = 0;
        } else {
            this.field8489 = 2;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lso;IZ)V")
    private final void method3528(class494 arg0, int arg1, boolean arg2) {
        if (arg1 == 1) {
            int var4 = arg0.method2998(!arg2);
            this.field8494 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field8494[var5] = arg0.method2998(!arg2);
            }
            this.field8492 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field8492[var6] = arg0.method2998(true);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field8492[var7] = (arg0.method2998(true) << 16) + this.field8492[var7];
            }
        } else if (arg1 == 2) {
            this.field8495 = arg0.method2998(true);
        } else if (arg1 == 3) {
            this.field8509 = new boolean[256];
            int var8 = arg0.method2964((byte) 122);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field8509[arg0.method2964((byte) 70)] = true;
            }
        } else if (arg1 == 5) {
            this.field8514 = arg0.method2964((byte) 92);
        } else if (arg1 == 6) {
            this.field8510 = arg0.method2998(true);
        } else if (arg1 == 7) {
            this.field8507 = arg0.method2998(!arg2);
        } else if (arg1 == 8) {
            this.field8490 = arg0.method2964((byte) 118);
        } else if (arg1 == 9) {
            this.field8489 = arg0.method2964((byte) 83);
        } else if (arg1 == 10) {
            this.field8503 = arg0.method2964((byte) 115);
        } else if (arg1 == 11) {
            this.field8501 = arg0.method2964((byte) 71);
        } else if (arg1 == 12) {
            int var10 = arg0.method2964((byte) 51);
            this.field8515 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field8515[var11] = arg0.method2998(!arg2);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field8515[var12] = (arg0.method2998(true) << 16) + this.field8515[var12];
            }
        } else if (arg1 == 13) {
            int var16 = arg0.method2998(true);
            this.field8517 = new int[var16][];
            for (int var17 = 0; var17 < var16; var17++) {
                int var18 = arg0.method2964((byte) 109);
                if (var18 > 0) {
                    this.field8517[var17] = new int[var18];
                    this.field8517[var17][0] = arg0.method2960((byte) 94);
                    for (int var19 = 1; var19 < var18; var19++) {
                        this.field8517[var17][var19] = arg0.method2998(true);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field8516 = true;
        } else if (arg1 == 15) {
            this.field8504 = true;
        } else if (arg1 == 16) {
            this.field8487 = true;
        } else if (arg1 == 18) {
            this.field8499 = true;
        } else if (arg1 == 19) {
            if (this.field8506 == null) {
                this.field8506 = new int[this.field8517.length];
                for (int var15 = 0; var15 < this.field8517.length; var15++) {
                    this.field8506[var15] = 255;
                }
            }
            this.field8506[arg0.method2964((byte) 83)] = arg0.method2964((byte) 102);
        } else if (arg1 == 20) {
            if (this.field8498 == null || this.field8518 == null) {
                this.field8498 = new int[this.field8517.length];
                this.field8518 = new int[this.field8517.length];
                for (int var13 = 0; var13 < this.field8517.length; var13++) {
                    this.field8498[var13] = 256;
                    this.field8518[var13] = 256;
                }
            }
            int var14 = arg0.method2964((byte) 41);
            this.field8498[var14] = arg0.method2998(true);
            this.field8518[var14] = arg0.method2998(true);
        }
        field8496++;
        if (arg2) {
            this.field8510 = 6;
        }
    }
}
