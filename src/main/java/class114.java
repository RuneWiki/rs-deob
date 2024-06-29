import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public abstract class class114 extends class38 {

    @OriginalMember(owner = "client!qc", name = "Z", descriptor = "[[B")
    private byte[][] field2492 = new byte[256][];

    @OriginalMember(owner = "client!qc", name = "mb", descriptor = "I")
    public int field2505 = 0;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "[I")
    private int[] field2481;

    @OriginalMember(owner = "client!qc", name = "cb", descriptor = "[I")
    private int[] field2495;

    @OriginalMember(owner = "client!qc", name = "kb", descriptor = "[I")
    private int[] field2503;

    @OriginalMember(owner = "client!qc", name = "X", descriptor = "[I")
    private int[] field2490;

    @OriginalMember(owner = "client!qc", name = "vb", descriptor = "I")
    private int field2514;

    @OriginalMember(owner = "client!qc", name = "jb", descriptor = "I")
    private int field2502;

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
    private static int field2480 = 0;

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "I")
    private static int field2482 = 256;

    @OriginalMember(owner = "client!qc", name = "S", descriptor = "Lod;")
    private static class101 field2485 = class46.method335(-52, "lt");

    @OriginalMember(owner = "client!qc", name = "T", descriptor = "Lod;")
    private static class101 field2486 = class46.method335(-120, ")4str");

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "Lod;")
    private static class101 field2484 = class46.method335(103, "shad");

    @OriginalMember(owner = "client!qc", name = "U", descriptor = "Lod;")
    private static class101 field2487 = class46.method335(125, "str");

    @OriginalMember(owner = "client!qc", name = "db", descriptor = "I")
    private static int field2496 = 0;

    @OriginalMember(owner = "client!qc", name = "eb", descriptor = "Lod;")
    private static class101 field2497 = class46.method335(-54, "u=");

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
    private static int field2483 = 0;

    @OriginalMember(owner = "client!qc", name = "hb", descriptor = "Lod;")
    private static class101 field2500 = class46.method335(-113, "gt");

    @OriginalMember(owner = "client!qc", name = "bb", descriptor = "Lod;")
    private static class101 field2494 = class46.method335(-94, "shad=");

    @OriginalMember(owner = "client!qc", name = "fb", descriptor = "I")
    private static int field2498 = -1;

    @OriginalMember(owner = "client!qc", name = "nb", descriptor = "Lod;")
    private static class101 field2506 = class46.method335(90, "str=");

    @OriginalMember(owner = "client!qc", name = "ob", descriptor = "Lod;")
    private static class101 field2507 = class46.method335(101, "img=");

    @OriginalMember(owner = "client!qc", name = "V", descriptor = "Lod;")
    private static class101 field2488 = class46.method335(-91, "br");

    @OriginalMember(owner = "client!qc", name = "qb", descriptor = "Lod;")
    private static class101 field2509 = class46.method335(-113, "u");

    @OriginalMember(owner = "client!qc", name = "lb", descriptor = "I")
    private static int field2504 = -1;

    @OriginalMember(owner = "client!qc", name = "rb", descriptor = "Lod;")
    private static class101 field2510 = class46.method335(-73, ")4col");

    @OriginalMember(owner = "client!qc", name = "pb", descriptor = "Lod;")
    private static class101 field2508 = class46.method335(-82, ")4u");

    @OriginalMember(owner = "client!qc", name = "sb", descriptor = "Lod;")
    private static class101 field2511 = class46.method335(63, "col=");

    @OriginalMember(owner = "client!qc", name = "Y", descriptor = "I")
    private static int field2491 = -1;

    @OriginalMember(owner = "client!qc", name = "W", descriptor = "Lod;")
    private static class101 field2489 = class46.method335(-55, ")4shad");

    @OriginalMember(owner = "client!qc", name = "tb", descriptor = "I")
    private static int field2512 = -1;

    @OriginalMember(owner = "client!qc", name = "wb", descriptor = "I")
    private static int field2515 = 0;

    @OriginalMember(owner = "client!qc", name = "ab", descriptor = "Ljava/util/Random;")
    private static Random field2493 = new Random();

    @OriginalMember(owner = "client!qc", name = "xb", descriptor = "[Lod;")
    private static class101[] field2516 = new class101[100];

    @OriginalMember(owner = "client!qc", name = "ub", descriptor = "[B")
    private byte[] field2513;

    @OriginalMember(owner = "client!qc", name = "ib", descriptor = "[I")
    private int[] field2501;

    @OriginalMember(owner = "client!qc", name = "gb", descriptor = "[Lqe;")
    public static class116[] field2499;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lod;I)V")
    private final void method847(class101 arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        for (int var5 = 0; var5 < arg0.method737(0); var5++) {
            int var6 = arg0.method730(-109, var5);
            if (var6 == 60) {
                var4 = true;
            } else if (var6 == 62) {
                var4 = false;
            } else if (!var4 && var6 == 32) {
                var3++;
            }
        }
        if (var3 > 0) {
            field2483 = (arg1 - this.method866(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([BIIIIII)V")
    public abstract void method626(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lod;)Lod;")
    public static final class101 method848(class101 arg0) {
        int var1 = arg0.method737(0);
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            byte var8 = arg0.field2223[var3];
            if (var8 == 60 || var8 == 62) {
                var2 += 3;
            }
        }
        class101 var4 = new class101();
        var4.field2231 = var1 + var2;
        var4.field2223 = new byte[var4.field2231];
        int var5 = 0;
        for (int var6 = 0; var6 < var1; var6++) {
            byte var7 = arg0.field2223[var6];
            if (var7 == 60) {
                var4.field2223[var5++] = 60;
                var4.field2223[var5++] = 108;
                var4.field2223[var5++] = 116;
                var4.field2223[var5++] = 62;
            } else if (var7 == 62) {
                var4.field2223[var5++] = 60;
                var4.field2223[var5++] = 103;
                var4.field2223[var5++] = 116;
                var4.field2223[var5++] = 62;
            } else {
                var4.field2223[var5++] = var7;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lod;IIII)V")
    public final void method849(class101 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method864(arg3, arg4);
            this.method865(arg0, arg1 - this.method866(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([BIIIII)V")
    public abstract void method627(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(Lod;IIII)V")
    public final void method850(class101 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method864(arg3, arg4);
            this.method865(arg0, arg1 - this.method866(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "([BIIIIII)V")
    private static final void method851(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = class38.field924 * arg2 + arg1;
        int var8 = class38.field924 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class38.field922) {
            int var11 = class38.field922 - arg2;
            arg4 -= var11;
            arg2 = class38.field922;
            var10 += arg3 * var11;
            var7 += class38.field924 * var11;
        }
        if (arg2 + arg4 > class38.field926) {
            arg4 -= arg2 + arg4 - class38.field926;
        }
        if (arg1 < class38.field928) {
            int var12 = class38.field928 - arg1;
            arg3 -= var12;
            arg1 = class38.field928;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class38.field925) {
            int var13 = arg1 + arg3 - class38.field925;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method870(class38.field923, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(Lod;IIII)V")
    public final void method852(class101 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method864(arg3, arg4);
            this.method865(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lod;IIIIII)V")
    public final void method853(class101 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method864(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.field2231];
        for (int var11 = 0; var11 < arg0.field2231; var11++) {
            var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) arg5) * var8);
        }
        this.method860(arg0, arg1 - this.method866(arg0) / 2, arg2, null, var10);
    }

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "(I)I")
    private final int method854(int arg0) {
        return this.field2501[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lod;IIIII)V")
    public final void method855(class101 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method864(arg3, arg4);
        int[] var7 = new int[arg0.field2231];
        for (int var8 = 0; var8 < arg0.field2231; var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method860(arg0, arg1 - this.method866(arg0) / 2, arg2, null, var7);
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(Lod;IIIII)V")
    public final void method856(class101 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method864(arg3, arg4);
        field2493.setSeed((long) arg5);
        field2482 = (field2493.nextInt() & 0x1F) + 192;
        int[] var7 = new int[arg0.field2231];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.field2231; var9++) {
            var7[var9] = var8;
            if ((field2493.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method860(arg0, arg1, arg2, var7, null);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lod;[I[Lod;)I")
    private final int method857(class101 arg0, int[] arg1, class101[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        int var5 = 0;
        class101 var6 = class132.method1024(true, 100);
        int var7 = -1;
        int var8 = 0;
        byte var9 = 0;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg0.method737(0);
        for (int var14 = 0; var14 < var13; var14++) {
            int var15 = arg0.method730(-111, var14);
            if (var15 == 60) {
                var10 = var14;
            } else {
                if (var15 == 62 && var10 != -1) {
                    class101 var16 = arg0.method725(var10 + 1, -113, var14);
                    var10 = -1;
                    var6.method700(60, (byte) -11);
                    var6.method724(var16, true);
                    var6.method700(62, (byte) -11);
                    if (var16.method703(0, field2488)) {
                        arg2[var12++] = var6.method725(var5, -128, var6.method737(0));
                        var5 = var6.method737(0);
                        var4 = 0;
                        var7 = -1;
                        var11 = -1;
                    } else if (var16.method703(0, field2485)) {
                        var4 += this.method854(60);
                        if (this.field2513 != null && var11 != -1) {
                            var4 += this.field2513[(var11 << 8) + 60];
                        }
                        var11 = 60;
                    } else if (var16.method703(0, field2500)) {
                        var4 += this.method854(62);
                        if (this.field2513 != null && var11 != -1) {
                            var4 += this.field2513[(var11 << 8) + 62];
                        }
                        var11 = 62;
                    } else if (var16.method713(field2507, -22411)) {
                        try {
                            int var17 = var16.method707((byte) 101, 4).method716(7987);
                            var4 += field2499[var17].field2571;
                            var11 = -1;
                        } catch (Exception var18) {
                        }
                    }
                    var15 = -1;
                }
                if (var10 == -1) {
                    if (var15 != -1) {
                        var6.method700(var15, (byte) -11);
                        var4 += this.method854(var15);
                        if (this.field2513 != null && var11 != -1) {
                            var4 += this.field2513[(var11 << 8) + var15];
                        }
                        var11 = var15;
                    }
                    if (var15 == 32) {
                        var7 = var6.method737(0);
                        var8 = var4;
                        var9 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var12 < arg1.length ? var12 : arg1.length - 1] && var7 >= 0) {
                        arg2[var12++] = var6.method725(var5, -117, var7 - var9);
                        var5 = var7;
                        var7 = -1;
                        var4 -= var8;
                        var11 = -1;
                    }
                    if (var15 == 45) {
                        var7 = var6.method737(0);
                        var8 = var4;
                        var9 = 0;
                    }
                }
            }
        }
        if (var6.method737(0) > var5) {
            arg2[var12++] = var6.method725(var5, -117, var6.method737(0));
        }
        return var12;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lod;IIIIIIIII)I")
    public final int method858(class101 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method864(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field2505;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field2514 + this.field2502 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method857(arg0, var11, field2516);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field2514 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field2514 - this.field2502 - (var12 - 1) * arg9) / 2 + this.field2514 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field2502 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field2514 - this.field2502 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field2514 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method865(field2516[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method865(field2516[var15], arg1 + (arg3 - this.method866(field2516[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method865(field2516[var15], arg1 + arg3 - this.method866(field2516[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method865(field2516[var15], arg1, var13);
            } else {
                this.method847(field2516[var15], arg3);
                this.method865(field2516[var15], arg1, var13);
                field2483 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([I[BIIIIIII)V")
    public static final void method859(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lod;II[I[I)V")
    private final void method860(class101 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field2505;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field2231; var10++) {
            int var11 = arg0.field2223[var10] & 0xFF;
            if (var11 == 60) {
                var7 = var10;
            } else {
                if (var11 == 62 && var7 != -1) {
                    class101 var12 = arg0.method725(var7 + 1, -104, var10);
                    var7 = -1;
                    if (var12.method703(0, field2485)) {
                        var11 = 60;
                    } else {
                        if (!var12.method703(0, field2500)) {
                            if (var12.method713(field2507, -22411)) {
                                try {
                                    int var13;
                                    if (arg3 == null) {
                                        var13 = 0;
                                    } else {
                                        var13 = arg3[var9];
                                    }
                                    int var14;
                                    if (arg4 == null) {
                                        var14 = 0;
                                    } else {
                                        var14 = arg4[var9];
                                    }
                                    var9++;
                                    int var15 = var12.method707((byte) 101, 4).method716(7987);
                                    class116 var16 = field2499[var15];
                                    var16.method884(arg1 + var13, this.field2505 + var6 - var16.field2568 + var14);
                                    arg1 += var16.field2571;
                                    var8 = -1;
                                } catch (Exception var22) {
                                }
                            } else {
                                this.method871(var12);
                            }
                            continue;
                        }
                        var11 = 62;
                    }
                }
                if (var7 == -1) {
                    if (this.field2513 != null && var8 != -1) {
                        arg1 += this.field2513[(var8 << 8) + var11];
                    }
                    int var17 = this.field2503[var11];
                    int var18 = this.field2490[var11];
                    int var19;
                    if (arg3 == null) {
                        var19 = 0;
                    } else {
                        var19 = arg3[var9];
                    }
                    int var20;
                    if (arg4 == null) {
                        var20 = 0;
                    } else {
                        var20 = arg4[var9];
                    }
                    var9++;
                    if (var11 == 32) {
                        if (field2483 > 0) {
                            field2480 += field2483;
                            arg1 += field2480 >> 8;
                            field2480 &= 0xFF;
                        }
                    } else if (field2482 == 256) {
                        if (field2504 != -1) {
                            method862(this.field2492[var11], this.field2481[var11] + arg1 + var19 + 1, this.field2495[var11] + var6 + 1 + var20, var17, var18, field2504);
                        }
                        this.method627(this.field2492[var11], this.field2481[var11] + arg1 + var19, this.field2495[var11] + var6 + var20, var17, var18, field2515);
                    } else {
                        if (field2504 != -1) {
                            method851(this.field2492[var11], this.field2481[var11] + arg1 + var19 + 1, this.field2495[var11] + var6 + 1 + var20, var17, var18, field2504, field2482);
                        }
                        this.method626(this.field2492[var11], this.field2481[var11] + arg1 + var19, this.field2495[var11] + var6 + var20, var17, var18, field2515, field2482);
                    }
                    int var21 = this.field2501[var11];
                    if (field2491 != -1) {
                        class38.method280(arg1, (int) ((double) this.field2505 * 0.7D) + var6, var21, field2491);
                    }
                    if (field2512 != -1) {
                        class38.method280(arg1, this.field2505 + var6, var21, field2512);
                    }
                    arg1 += var21;
                    var8 = var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "()V")
    public static void method861() {
        field2485 = null;
        field2500 = null;
        field2507 = null;
        field2488 = null;
        field2511 = null;
        field2510 = null;
        field2497 = null;
        field2509 = null;
        field2508 = null;
        field2494 = null;
        field2484 = null;
        field2489 = null;
        field2506 = null;
        field2487 = null;
        field2486 = null;
        field2499 = null;
        field2493 = null;
        field2516 = null;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "([BIIIII)V")
    private static final void method862(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class38.field924 * arg2 + arg1;
        int var7 = class38.field924 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < class38.field922) {
            int var10 = class38.field922 - arg2;
            arg4 -= var10;
            arg2 = class38.field922;
            var9 += arg3 * var10;
            var6 += class38.field924 * var10;
        }
        if (arg2 + arg4 > class38.field926) {
            arg4 -= arg2 + arg4 - class38.field926;
        }
        if (arg1 < class38.field928) {
            int var11 = class38.field928 - arg1;
            arg3 -= var11;
            arg1 = class38.field928;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > class38.field925) {
            int var12 = arg1 + arg3 - class38.field925;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method859(class38.field923, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(Lod;I)I")
    public final int method863(class101 arg0, int arg1) {
        return this.method857(arg0, new int[] { arg1 }, field2516);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V")
    private final void method864(int arg0, int arg1) {
        field2491 = -1;
        field2512 = -1;
        field2498 = arg1;
        field2504 = arg1;
        field2496 = arg0;
        field2515 = arg0;
        field2482 = 256;
        field2483 = 0;
        field2480 = 0;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lod;II)V")
    private final void method865(class101 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2505;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.field2231; var7++) {
            int var8 = arg0.field2223[var7] & 0xFF;
            if (var8 == 60) {
                var5 = var7;
            } else {
                if (var8 == 62 && var5 != -1) {
                    class101 var9 = arg0.method725(var5 + 1, -113, var7);
                    var5 = -1;
                    if (var9.method703(0, field2485)) {
                        var8 = 60;
                    } else {
                        if (!var9.method703(0, field2500)) {
                            if (var9.method713(field2507, -22411)) {
                                try {
                                    int var10 = var9.method707((byte) 101, 4).method716(7987);
                                    class116 var11 = field2499[var10];
                                    var11.method884(arg1, this.field2505 + var4 - var11.field2568);
                                    arg1 += var11.field2571;
                                    var6 = -1;
                                } catch (Exception var15) {
                                }
                            } else {
                                this.method871(var9);
                            }
                            continue;
                        }
                        var8 = 62;
                    }
                }
                if (var5 == -1) {
                    if (this.field2513 != null && var6 != -1) {
                        arg1 += this.field2513[(var6 << 8) + var8];
                    }
                    int var12 = this.field2503[var8];
                    int var13 = this.field2490[var8];
                    if (var8 == 32) {
                        if (field2483 > 0) {
                            field2480 += field2483;
                            arg1 += field2480 >> 8;
                            field2480 &= 0xFF;
                        }
                    } else if (field2482 == 256) {
                        if (field2504 != -1) {
                            method862(this.field2492[var8], this.field2481[var8] + arg1 + 1, this.field2495[var8] + var4 + 1, var12, var13, field2504);
                        }
                        this.method627(this.field2492[var8], this.field2481[var8] + arg1, this.field2495[var8] + var4, var12, var13, field2515);
                    } else {
                        if (field2504 != -1) {
                            method851(this.field2492[var8], this.field2481[var8] + arg1 + 1, this.field2495[var8] + var4 + 1, var12, var13, field2504, field2482);
                        }
                        this.method626(this.field2492[var8], this.field2481[var8] + arg1, this.field2495[var8] + var4, var12, var13, field2515, field2482);
                    }
                    int var14 = this.field2501[var8];
                    if (field2491 != -1) {
                        class38.method280(arg1, (int) ((double) this.field2505 * 0.7D) + var4, var14, field2491);
                    }
                    if (field2512 != -1) {
                        class38.method280(arg1, this.field2505 + var4 + 1, var14, field2512);
                    }
                    arg1 += var14;
                    var6 = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(Lod;)I")
    public final int method866(class101 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = -1;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.field2231; var5++) {
            int var6 = arg0.field2223[var5] & 0xFF;
            if (var6 == 60) {
                var2 = var5;
            } else {
                if (var6 == 62 && var2 != -1) {
                    class101 var7 = arg0.method725(var2 + 1, -104, var5);
                    var2 = -1;
                    if (var7.method703(0, field2485)) {
                        var6 = 60;
                    } else {
                        if (!var7.method703(0, field2500)) {
                            if (var7.method713(field2507, -22411)) {
                                try {
                                    int var8 = var7.method707((byte) 101, 4).method716(7987);
                                    var4 += field2499[var8].field2571;
                                    var3 = -1;
                                } catch (Exception var9) {
                                }
                            }
                            continue;
                        }
                        var6 = 62;
                    }
                }
                if (var2 == -1) {
                    var4 += this.field2501[var6];
                    if (this.field2513 != null && var3 != -1) {
                        var4 += this.field2513[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(Lod;IIIII)V")
    public final void method867(class101 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method864(arg3, arg4);
        int[] var7 = new int[arg0.field2231];
        int[] var8 = new int[arg0.field2231];
        for (int var9 = 0; var9 < arg0.field2231; var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method860(arg0, arg1 - this.method866(arg0) / 2, arg2, var7, var8);
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(Lod;I)I")
    public final int method868(class101 arg0, int arg1) {
        int var3 = this.method857(arg0, new int[] { arg1 }, field2516);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method866(field2516[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([[B[[B[I[I[III)I")
    private static final int method869(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
        int var7 = arg2[arg5];
        int var8 = arg4[arg5] + var7;
        int var9 = arg2[arg6];
        int var10 = arg4[arg6] + var9;
        int var11 = var7;
        if (var9 > var7) {
            var11 = var9;
        }
        int var12 = var8;
        if (var10 < var8) {
            var12 = var10;
        }
        int var13 = arg3[arg5];
        if (arg3[arg6] < var13) {
            var13 = arg3[arg6];
        }
        byte[] var14 = arg1[arg5];
        byte[] var15 = arg0[arg6];
        int var16 = var11 - var7;
        int var17 = var11 - var9;
        for (int var18 = var11; var18 < var12; var18++) {
            int var19 = var14[var16++] + var15[var17++];
            if (var19 < var13) {
                var13 = var19;
            }
        }
        return -var13;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([I[BIIIIIIII)V")
    public static final void method870(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var11 = 256 - arg9;
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = -arg5; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    int var14 = arg0[arg4];
                    arg0[arg4++] = (((var14 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * var11 & 0xFF0000) >> 8) + var10;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(Lod;)V")
    private final void method871(class101 arg0) {
        try {
            if (arg0.method713(field2511, -22411)) {
                field2515 = arg0.method707((byte) 101, 4).method723((byte) 111, 16);
                return;
            }
            if (arg0.method703(0, field2510)) {
                field2515 = field2496;
                return;
            }
            if (arg0.method713(field2506, -22411)) {
                field2491 = arg0.method707((byte) 101, 4).method723((byte) 119, 16);
                return;
            }
            if (arg0.method703(0, field2487)) {
                field2491 = 8388608;
                return;
            }
            if (arg0.method703(0, field2486)) {
                field2491 = -1;
                return;
            }
            if (arg0.method713(field2497, -22411)) {
                field2512 = arg0.method707((byte) 101, 2).method723((byte) 94, 16);
                return;
            }
            if (arg0.method703(0, field2509)) {
                field2512 = 0;
                return;
            }
            if (arg0.method703(0, field2508)) {
                field2512 = -1;
                return;
            }
            if (arg0.method713(field2494, -22411)) {
                field2504 = arg0.method707((byte) 101, 5).method723((byte) 126, 16);
                return;
            }
            if (arg0.method703(0, field2484)) {
                field2504 = 0;
                return;
            }
            if (arg0.method703(0, field2489)) {
                field2504 = field2498;
                return;
            }
            if (arg0.method703(0, field2488)) {
                this.method864(field2496, field2498);
                return;
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([B)V")
    private final void method872(byte[] arg0) {
        this.field2501 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field2501.length; var2++) {
                this.field2501[var2] = arg0[var2] & 0xFF;
            }
            this.field2505 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field2501[var4] = arg0[var3++] & 0xFF;
        }
        int[] var5 = new int[256];
        int[] var6 = new int[256];
        for (int var7 = 0; var7 < 256; var7++) {
            var5[var7] = arg0[var3++] & 0xFF;
        }
        for (int var8 = 0; var8 < 256; var8++) {
            var6[var8] = arg0[var3++] & 0xFF;
        }
        byte[][] var9 = new byte[256][];
        for (int var10 = 0; var10 < 256; var10++) {
            var9[var10] = new byte[var5[var10]];
            byte var17 = 0;
            for (int var18 = 0; var18 < var9[var10].length; var18++) {
                var17 += arg0[var3++];
                var9[var10][var18] = var17;
            }
        }
        byte[][] var11 = new byte[256][];
        for (int var12 = 0; var12 < 256; var12++) {
            var11[var12] = new byte[var5[var12]];
            byte var15 = 0;
            for (int var16 = 0; var16 < var11[var12].length; var16++) {
                var15 += arg0[var3++];
                var11[var12][var16] = var15;
            }
        }
        this.field2513 = new byte[65536];
        for (int var13 = 0; var13 < 256; var13++) {
            if (var13 != 32 && var13 != 160) {
                for (int var14 = 0; var14 < 256; var14++) {
                    if (var14 != 32 && var14 != 160) {
                        this.field2513[(var13 << 8) + var14] = (byte) method869(var9, var11, var6, this.field2501, var5, var13, var14);
                    }
                }
            }
        }
        this.field2505 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class114(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field2481 = arg1;
        this.field2495 = arg2;
        this.field2503 = arg3;
        this.field2490 = arg4;
        this.method872(arg0);
        this.field2492 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field2495[var10] < var8 && this.field2490[var10] != 0) {
                var8 = this.field2495[var10];
            }
            if (this.field2495[var10] + this.field2490[var10] > var9) {
                var9 = this.field2495[var10] + this.field2490[var10];
            }
        }
        this.field2514 = this.field2505 - var8;
        this.field2502 = var9 - this.field2505;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "([B)V")
    public class114(byte[] arg0) {
        this.method872(arg0);
    }
}
