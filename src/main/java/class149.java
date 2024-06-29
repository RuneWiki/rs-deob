import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class149 extends class26 {

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "B")
    private byte field2611 = 0;

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
    public int field2624 = 0;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "B")
    private byte field2615 = 0;

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "I")
    private int field2635 = 0;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
    private int field2619 = 0;

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "Z")
    public boolean field2625 = false;

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "[I")
    private int[] field2629;

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "[I")
    public int[] field2639;

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "[I")
    public int[] field2630;

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "[I")
    public int[] field2636;

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "[I")
    private int[] field2628;

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "[S")
    private short[] field2643;

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "[S")
    private short[] field2627;

    @OriginalMember(owner = "client!bc", name = "X", descriptor = "[S")
    private short[] field2647;

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "[S")
    private short[] field2634;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "[F")
    private float[] field2614;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "[F")
    private float[] field2612;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "[S")
    private short[] field2623;

    @OriginalMember(owner = "client!bc", name = "W", descriptor = "[B")
    private byte[] field2646;

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "[S")
    private short[] field2631;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "[S")
    private short[] field2622;

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "[S")
    private short[] field2641;

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "[S")
    private short[] field2637;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "[B")
    private byte[] field2613;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "Lbm;")
    public class43 field2618;

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "Li;")
    public class21 field2644;

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "Li;")
    private class21 field2642;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "Li;")
    private class21 field2621;

    @OriginalMember(owner = "client!bc", name = "Y", descriptor = "Li;")
    private class21 field2648;

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "Li;")
    private class21 field2632;

    @OriginalMember(owner = "client!bc", name = "db", descriptor = "S")
    private short field2653;

    @OriginalMember(owner = "client!bc", name = "O", descriptor = "S")
    private short field2638;

    @OriginalMember(owner = "client!bc", name = "Q", descriptor = "[S")
    private short[] field2640;

    @OriginalMember(owner = "client!bc", name = "ab", descriptor = "[I")
    private int[] field2650;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "Lra;")
    private static class41 field2626 = new class41(10000);

    @OriginalMember(owner = "client!bc", name = "Z", descriptor = "Lbc;")
    private static class149 field2649 = new class149();

    @OriginalMember(owner = "client!bc", name = "cb", descriptor = "Lbc;")
    private static class149 field2652 = new class149();

    @OriginalMember(owner = "client!bc", name = "eb", descriptor = "Lbc;")
    private static class149 field2654 = new class149();

    @OriginalMember(owner = "client!bc", name = "fb", descriptor = "Lbc;")
    private static class149 field2655 = new class149();

    @OriginalMember(owner = "client!bc", name = "pb", descriptor = "[I")
    private static int[] field2665 = new int[1];

    @OriginalMember(owner = "client!bc", name = "qb", descriptor = "[I")
    private static int[] field2666 = new int[1];

    @OriginalMember(owner = "client!bc", name = "gb", descriptor = "F")
    private static float field2656;

    @OriginalMember(owner = "client!bc", name = "hb", descriptor = "F")
    private static float field2657;

    @OriginalMember(owner = "client!bc", name = "ib", descriptor = "F")
    private static float field2658;

    @OriginalMember(owner = "client!bc", name = "jb", descriptor = "F")
    private static float field2659;

    @OriginalMember(owner = "client!bc", name = "kb", descriptor = "F")
    private static float field2660;

    @OriginalMember(owner = "client!bc", name = "mb", descriptor = "F")
    private static float field2662;

    @OriginalMember(owner = "client!bc", name = "lb", descriptor = "I")
    private static int field2661;

    @OriginalMember(owner = "client!bc", name = "nb", descriptor = "I")
    private static int field2663;

    @OriginalMember(owner = "client!bc", name = "ob", descriptor = "I")
    private static int field2664;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "Lad;")
    private class176 field2617;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "Lre;")
    private class259 field2620;

    @OriginalMember(owner = "client!bc", name = "V", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2645;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "[J")
    private static long[] field2616;

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "[[I")
    private int[][] field2633;

    @OriginalMember(owner = "client!bc", name = "bb", descriptor = "[[I")
    private int[][] field2651;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "()I", line = 8)
    public final int method178() {
        if (!this.field2618.field815) {
            this.method1115();
        }
        return this.field2618.field812;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(SS)V", line = 18)
    public final void method1085(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2635; var3++) {
            if (this.field2637[var3] == arg0) {
                this.field2637[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class136.field2373.method202(arg0 & 0xFFFF, 27993);
            var5 = class136.field2373.method183(15874, arg0 & 0xFFFF);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class136.field2373.method202(arg1 & 0xFFFF, 27993);
            var7 = class136.field2373.method183(15874, arg1 & 0xFFFF);
        }
        if (var4 != var6 || var5 != var7) {
            this.field2642.field276 = false;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(SS)V", line = 54)
    public final void method1086(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2635; var3++) {
            if (this.field2623[var3] == arg0) {
                this.field2623[var3] = arg1;
            }
        }
        this.field2642.field276 = false;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZZZZZZZ)V", line = 69)
    public final void method1087(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field2611 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field2619 != 0) {
            if (arg6) {
                boolean var8 = !this.field2642.field276 && (arg1 || arg2 && !class193.field3531);
                this.method1102(false, !this.field2644.field276 && arg0, var8, this.field2621 != null && !this.field2621.field276 && arg2, !this.field2648.field276 && arg3);
                if (!this.field2632.field276 && arg4 && arg1) {
                    this.method1104();
                }
            }
            if (arg0) {
                if (this.field2644.field276) {
                    if (!this.field2618.field815) {
                        this.method1115();
                    }
                    this.field2639 = null;
                    this.field2630 = null;
                    this.field2636 = null;
                    this.field2640 = null;
                    this.field2629 = null;
                } else {
                    this.field2615 = (byte) (this.field2615 | 0x1);
                }
            }
            if (arg1) {
                if (this.field2642.field276) {
                    this.field2623 = null;
                    this.field2646 = null;
                } else {
                    this.field2615 = (byte) (this.field2615 | 0x2);
                }
            }
            if (arg2 && class193.field3531) {
                if (this.field2621.field276) {
                    this.field2643 = null;
                    this.field2627 = null;
                    this.field2647 = null;
                    this.field2634 = null;
                } else {
                    this.field2615 = (byte) (this.field2615 | 0x4);
                }
            }
            if (arg3) {
                if (this.field2648.field276) {
                    this.field2614 = null;
                    this.field2612 = null;
                } else {
                    this.field2615 = (byte) (this.field2615 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field2632.field276 && this.field2642.field276) {
                    this.field2631 = null;
                    this.field2622 = null;
                    this.field2641 = null;
                } else {
                    this.field2615 = (byte) (this.field2615 | 0x10);
                }
            }
            if (arg5) {
                this.field2628 = null;
                this.field2613 = null;
                this.field2651 = (int[][]) null;
                this.field2633 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "()V", line = 164)
    public final void method1088() {
        if (this.field2643 == null) {
            this.method163();
            return;
        }
        for (int var1 = 0; var1 < this.field2624; var1++) {
            int var2 = this.field2639[var1];
            this.field2639[var1] = this.field2636[var1];
            this.field2636[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field2619; var3++) {
            short var4 = this.field2643[var3];
            this.field2643[var3] = this.field2647[var3];
            this.field2647[var3] = (short) (-var4);
        }
        this.field2618.field815 = false;
        this.field2644.field276 = false;
        if (this.field2621 != null) {
            this.field2621.field276 = false;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 201)
    private static final void method1089(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
        int var12 = arg0 - arg3;
        int var13 = arg1 - arg4;
        int var14 = arg2 - arg5;
        float var15 = arg7[2] * (float) var14 + arg7[0] * (float) var12 + arg7[1] * (float) var13;
        float var16 = arg7[5] * (float) var14 + arg7[3] * (float) var12 + arg7[4] * (float) var13;
        float var17 = arg7[8] * (float) var14 + arg7[6] * (float) var12 + arg7[7] * (float) var13;
        float var18;
        float var19;
        if (arg6 == 0) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + 0.5F - var17;
        } else if (arg6 == 1) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + var17 + 0.5F;
        } else if (arg6 == 2) {
            var18 = arg9 + 0.5F - var15;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 3) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 4) {
            var18 = arg11 + var17 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else {
            var18 = arg11 + 0.5F - var17;
            var19 = arg10 + 0.5F - var16;
        }
        if (arg8 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg8 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg8 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        field2656 = var18;
        field2660 = var19;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ISIB)I", line = 280)
    private static final int method1090(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class136.field2370[class89.method667(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class136.field2373.method202(arg1 & 0xFFFF, 27993);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg2 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class136.field2373.method183(15874, arg1 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 >> 8) + (var10 & 0xFF00 << 8) + (var11 & 0xFF00);
            }
        }
        return (var4 << 8) + (255 - (arg3 & 0xFF));
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I[IIIIZ)V", line = 339)
    private final void method1091(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field2663 = 0;
            field2664 = 0;
            field2661 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field2651.length) {
                    int[] var14 = this.field2651[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field2663 += this.field2639[var16];
                        field2664 += this.field2630[var16];
                        field2661 += this.field2636[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field2663 = field2663 / var11 + var8;
                field2664 = field2664 / var11 + var9;
                field2661 = field2661 / var11 + var10;
            } else {
                field2663 = var8;
                field2664 = var9;
                field2661 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field2651.length) {
                    int[] var22 = this.field2651[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field2639[var24] += var17;
                        this.field2630[var24] += var18;
                        this.field2636[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field2651.length) {
                    int[] var27 = this.field2651[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field2639[var29] -= field2663;
                        this.field2630[var29] -= field2664;
                        this.field2636[var29] -= field2661;
                        if (arg4 != 0) {
                            int var30 = class136.field2366[arg4];
                            int var31 = class136.field2372[arg4];
                            int var32 = this.field2639[var29] * var31 + this.field2630[var29] * var30 + 32767 >> 16;
                            this.field2630[var29] = this.field2630[var29] * var31 + 32767 - this.field2639[var29] * var30 >> 16;
                            this.field2639[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class136.field2366[arg2];
                            int var34 = class136.field2372[arg2];
                            int var35 = this.field2630[var29] * var34 + 32767 - this.field2636[var29] * var33 >> 16;
                            this.field2636[var29] = this.field2636[var29] * var34 + this.field2630[var29] * var33 + 32767 >> 16;
                            this.field2630[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class136.field2366[arg3];
                            int var37 = class136.field2372[arg3];
                            int var38 = this.field2639[var29] * var37 + this.field2636[var29] * var36 + 32767 >> 16;
                            this.field2636[var29] = this.field2636[var29] * var37 + 32767 - this.field2639[var29] * var36 >> 16;
                            this.field2639[var29] = var38;
                        }
                        this.field2639[var29] += field2663;
                        this.field2630[var29] += field2664;
                        this.field2636[var29] += field2661;
                    }
                }
            }
            if (arg5 && this.field2643 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field2651.length) {
                        int[] var41 = this.field2651[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field2629[var43];
                            int var45 = this.field2629[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field2640[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class136.field2366[arg4];
                                    int var49 = class136.field2372[arg4];
                                    int var50 = this.field2643[var47] * var49 + this.field2627[var47] * var48 + 32767 >> 16;
                                    this.field2627[var47] = (short) (this.field2627[var47] * var49 + 32767 - this.field2643[var47] * var48 >> 16);
                                    this.field2643[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class136.field2366[arg2];
                                    int var52 = class136.field2372[arg2];
                                    int var53 = this.field2627[var47] * var52 + 32767 - this.field2647[var47] * var51 >> 16;
                                    this.field2647[var47] = (short) (this.field2647[var47] * var52 + this.field2627[var47] * var51 + 32767 >> 16);
                                    this.field2627[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class136.field2366[arg3];
                                    int var55 = class136.field2372[arg3];
                                    int var56 = this.field2647[var47] * var54 + this.field2643[var47] * var55 + 32767 >> 16;
                                    this.field2647[var47] = (short) (this.field2647[var47] * var55 + 32767 - this.field2643[var47] * var54 >> 16);
                                    this.field2643[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field2621 != null) {
                    this.field2621.field276 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field2651.length) {
                    int[] var59 = this.field2651[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field2639[var61] -= field2663;
                        this.field2630[var61] -= field2664;
                        this.field2636[var61] -= field2661;
                        this.field2639[var61] = this.field2639[var61] * arg2 >> 7;
                        this.field2630[var61] = this.field2630[var61] * arg3 >> 7;
                        this.field2636[var61] = this.field2636[var61] * arg4 >> 7;
                        this.field2639[var61] += field2663;
                        this.field2630[var61] += field2664;
                        this.field2636[var61] += field2661;
                    }
                }
            }
        } else if (arg0 == 5 && this.field2633 != null && this.field2646 != null) {
            for (int var62 = 0; var62 < var7; var62++) {
                int var63 = arg1[var62];
                if (var63 < this.field2633.length) {
                    int[] var64 = this.field2633[var63];
                    for (int var65 = 0; var65 < var64.length; var65++) {
                        int var66 = var64[var65];
                        int var67 = (this.field2646[var66] & 0xFF) + arg2 * 8;
                        if (var67 < 0) {
                            var67 = 0;
                        } else if (var67 > 255) {
                            var67 = 255;
                        }
                        this.field2646[var66] = (byte) var67;
                    }
                    if (var64.length > 0) {
                        this.field2642.field276 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ldg;IZ)V", line = 682)
    public final void method159(class172 arg0, int arg1, boolean arg2) {
        if (this.field2651 == null || arg1 == -1) {
            return;
        }
        class125 var4 = arg0.field3060[arg1];
        class230 var5 = var4.field2219;
        for (int var6 = 0; var6 < this.field2624; var6++) {
            this.field2639[var6] <<= 0x4;
            this.field2630[var6] <<= 0x4;
            this.field2636[var6] <<= 0x4;
        }
        field2663 = 0;
        field2664 = 0;
        field2661 = 0;
        for (int var7 = 0; var7 < var4.field2211; var7++) {
            short var8 = var4.field2214[var7];
            if (var4.field2221[var7] != -1) {
                this.method1091(0, var5.field3942[var4.field2221[var7]], 0, 0, 0, arg2);
            }
            this.method1091(var5.field3938[var8], var5.field3942[var8], var4.field2212[var7], var4.field2218[var7], var4.field2209[var7], arg2);
        }
        for (int var9 = 0; var9 < this.field2624; var9++) {
            this.field2639[var9] >>= 0x4;
            this.field2630[var9] >>= 0x4;
            this.field2636[var9] >>= 0x4;
        }
        this.field2618.field815 = false;
        this.field2644.field276 = false;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lfm;IJIIIIFF)S", line = 736)
    private final short method1092(class315 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field2629[arg1];
        int var12 = this.field2629[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field2640[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field2616[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field2640[var13] = (short) (this.field2619 + 1);
        field2616[var13] = arg2;
        this.field2643[this.field2619] = (short) arg3;
        this.field2627[this.field2619] = (short) arg4;
        this.field2647[this.field2619] = (short) arg5;
        this.field2634[this.field2619] = (short) arg6;
        this.field2614[this.field2619] = arg7;
        this.field2612[this.field2619] = arg8;
        return (short) (this.field2619++);
    }

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "()V", line = 771)
    public static final void method1093() {
        field2649 = new class149();
        field2652 = new class149();
        field2654 = new class149();
        field2655 = new class149();
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([SI)[S", line = 778)
    private static final short[] method1094(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class299.method2091(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "()I", line = 783)
    public final int method1095() {
        return this.field2638;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIIII)Z", line = 787)
    private final boolean method1096(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "()V", line = 802)
    public final void method1097() {
        int var10002;
        if (this.field2628 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2624; var3++) {
                int var4 = this.field2628[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2651 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2651[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2624) {
                int var7 = this.field2628[var6] & 0xFF;
                this.field2651[var7][var1[var7]++] = var6++;
            }
            this.field2628 = null;
        }
        if (this.field2613 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2635; var10++) {
            int var11 = this.field2613[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2633 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2633[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2635) {
            int var14 = this.field2613[var13] & 0xFF;
            this.field2633[var14][var8[var14]++] = var13++;
        }
        this.field2613 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(FFF)I", line = 895)
    private static final int method1098(float arg0, float arg1, float arg2) {
        float var3 = arg0 < 0.0F ? -arg0 : arg0;
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 > var3 && var4 > var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var5 > var3 && var5 > var4) {
            return arg2 > 0.0F ? 2 : 3;
        } else if (arg0 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "()I", line = 929)
    public final int method179() {
        if (!this.field2618.field815) {
            this.method1115();
        }
        return this.field2618.field816;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZZLbc;Lbc;)Lha;", line = 938)
    private final class26 method1099(boolean arg0, boolean arg1, class149 arg2, class149 arg3) {
        arg2.field2624 = this.field2624;
        arg2.field2619 = this.field2619;
        arg2.field2635 = this.field2635;
        arg2.field2653 = this.field2653;
        arg2.field2638 = this.field2638;
        arg2.field2611 = (byte) ((arg0 ? 0 : 2) | 0x1 | (arg1 ? 0 : 4));
        if (arg2.field2639 == null || arg2.field2639.length < this.field2624) {
            arg2.field2639 = new int[this.field2624 + 100];
            arg2.field2630 = new int[this.field2624 + 100];
            arg2.field2636 = new int[this.field2624 + 100];
        }
        for (int var5 = 0; var5 < this.field2624; var5++) {
            arg2.field2639[var5] = this.field2639[var5];
            arg2.field2630[var5] = this.field2630[var5];
            arg2.field2636[var5] = this.field2636[var5];
        }
        if (arg2.field2644 == null) {
            arg2.field2644 = new class21();
        }
        arg2.field2644.field276 = false;
        if (arg2.field2618 == null) {
            arg2.field2618 = new class43();
        }
        arg2.field2618.field815 = false;
        if (arg0) {
            arg2.field2646 = this.field2646;
            arg2.field2642 = this.field2642;
        } else {
            if (arg3.field2646 == null || arg3.field2646.length < this.field2635) {
                arg3.field2646 = new byte[this.field2635 + 100];
            }
            arg2.field2646 = arg3.field2646;
            for (int var6 = 0; var6 < this.field2635; var6++) {
                arg2.field2646[var6] = this.field2646[var6];
            }
            if (arg3.field2642 == null) {
                arg3.field2642 = new class21();
            }
            arg2.field2642 = arg3.field2642;
            arg2.field2642.field276 = false;
        }
        if (arg1) {
            arg2.field2643 = this.field2643;
            arg2.field2627 = this.field2627;
            arg2.field2647 = this.field2647;
            arg2.field2634 = this.field2634;
            arg2.field2621 = this.field2621;
        } else {
            if (arg3.field2643 == null || arg3.field2643.length < this.field2619) {
                arg3.field2643 = new short[this.field2619 + 100];
                arg3.field2627 = new short[this.field2619 + 100];
                arg3.field2647 = new short[this.field2619 + 100];
                arg3.field2634 = new short[this.field2619 + 100];
            }
            arg2.field2643 = arg3.field2643;
            arg2.field2627 = arg3.field2627;
            arg2.field2647 = arg3.field2647;
            arg2.field2634 = arg3.field2634;
            for (int var7 = 0; var7 < this.field2619; var7++) {
                arg2.field2643[var7] = this.field2643[var7];
                arg2.field2627[var7] = this.field2627[var7];
                arg2.field2647[var7] = this.field2647[var7];
                arg2.field2634[var7] = this.field2634[var7];
            }
            if (class193.field3531) {
                if (arg3.field2621 == null) {
                    arg3.field2621 = new class21();
                }
                arg2.field2621 = arg3.field2621;
                arg2.field2621.field276 = false;
            } else {
                arg2.field2621 = null;
            }
        }
        arg2.field2614 = this.field2614;
        arg2.field2612 = this.field2612;
        arg2.field2628 = this.field2628;
        arg2.field2651 = this.field2651;
        arg2.field2623 = this.field2623;
        arg2.field2631 = this.field2631;
        arg2.field2622 = this.field2622;
        arg2.field2641 = this.field2641;
        arg2.field2637 = this.field2637;
        arg2.field2613 = this.field2613;
        arg2.field2633 = this.field2633;
        arg2.field2648 = this.field2648;
        arg2.field2632 = this.field2632;
        arg2.field2650 = this.field2650;
        arg2.field2640 = this.field2640;
        arg2.field2629 = this.field2629;
        arg2.field331 = this.field331;
        return arg2;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ldg;ILdg;I[IZ)V", line = 1066)
    public final void method160(class172 arg0, int arg1, class172 arg2, int arg3, int[] arg4, boolean arg5) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method159(arg0, arg1, arg5);
            return;
        }
        class125 var7 = arg0.field3060[arg1];
        class125 var8 = arg2.field3060[arg3];
        class230 var9 = var7.field2219;
        for (int var10 = 0; var10 < this.field2624; var10++) {
            this.field2639[var10] <<= 0x4;
            this.field2630[var10] <<= 0x4;
            this.field2636[var10] <<= 0x4;
        }
        field2663 = 0;
        field2664 = 0;
        field2661 = 0;
        byte var11 = 0;
        int var20 = var11 + 1;
        int var12 = arg4[var11];
        for (int var13 = 0; var13 < var7.field2211; var13++) {
            short var14 = var7.field2214[var13];
            while (var14 > var12) {
                var12 = arg4[var20++];
            }
            if (var12 != var14 || var9.field3938[var14] == 0) {
                if (var7.field2221[var13] != -1) {
                    this.method1091(0, var9.field3942[var7.field2221[var13]], 0, 0, 0, arg5);
                }
                this.method1091(var9.field3938[var14], var9.field3942[var14], var7.field2212[var13], var7.field2218[var13], var7.field2209[var13], arg5);
            }
        }
        field2663 = 0;
        field2664 = 0;
        field2661 = 0;
        byte var15 = 0;
        int var21 = var15 + 1;
        int var16 = arg4[var15];
        for (int var17 = 0; var17 < var8.field2211; var17++) {
            short var18 = var8.field2214[var17];
            while (var18 > var16) {
                var16 = arg4[var21++];
            }
            if (var16 == var18 || var9.field3938[var18] == 0) {
                if (var8.field2221[var17] != -1) {
                    this.method1091(0, var9.field3942[var8.field2221[var17]], 0, 0, 0, arg5);
                }
                this.method1091(var9.field3938[var18], var9.field3942[var18], var8.field2212[var17], var8.field2218[var17], var8.field2209[var17], arg5);
            }
        }
        for (int var19 = 0; var19 < this.field2624; var19++) {
            this.field2639[var19] >>= 0x4;
            this.field2630[var19] >>= 0x4;
            this.field2636[var19] >>= 0x4;
        }
        this.field2618.field815 = false;
        this.field2644.field276 = false;
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "()I", line = 1163)
    public final int method172() {
        if (!this.field2618.field815) {
            this.method1115();
        }
        return this.field2618.field811;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)Lmc;", line = 1169)
    public final class51 method411(int arg0, int arg1, int arg2) {
        this.field2625 = false;
        if (this.field2617 != null) {
            this.field2643 = this.field2617.field3122;
            this.field2627 = this.field2617.field3121;
            this.field2647 = this.field2617.field3123;
            this.field2634 = this.field2617.field3120;
            this.field2617 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V", line = 3758)
    private class149() {
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lfm;IIZ)V", line = 3760)
    public class149(class315 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field5429];
        this.field2629 = new int[arg0.field5414 + 1];
        for (int var6 = 0; var6 < arg0.field5429; var6++) {
            if ((arg0.field5407 == null || arg0.field5407[var6] != 2) && (arg0.field5418 == null || arg0.field5418[var6] == -1 || !class136.field2373.method184(102, arg0.field5418[var6] & 0xFFFF))) {
                var5[this.field2635++] = var6;
                this.field2629[arg0.field5415[var6]]++;
                this.field2629[arg0.field5399[var6]]++;
                this.field2629[arg0.field5404[var6]]++;
            }
        }
        long[] var7 = new long[this.field2635];
        for (int var8 = 0; var8 < this.field2635; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field5418 != null) {
                var14 = arg0.field5418[var9];
                if (var14 != -1) {
                    var12 = class136.field2373.method199(var14 & 0xFFFF, (byte) 110);
                    var13 = class136.field2373.method189(var14 & 0xFFFF, 255);
                }
            }
            boolean var15 = arg0.field5411 != null && arg0.field5411[var9] != 0 || var14 != -1 && !class136.field2373.method196(-121, var14 & 0xFFFF);
            if ((arg3 || var15) && arg0.field5398 != null) {
                var10 += arg0.field5398[var9] << 17;
            }
            if (var15) {
                var10 += 65536;
            }
            int var16 = ((var12 & 0xFF) << 8) + var10;
            int var17 = (var13 & 0xFF) + var16;
            int var18 = ((var14 & 0xFFFF) << 16) + var11;
            int var19 = (var8 & 0xFFFF) + var18;
            var7[var8] = ((long) var17 << 32) + (long) var19;
        }
        class71.method541(var5, -1, var7);
        this.field2624 = arg0.field5414;
        this.field2639 = arg0.field5440;
        this.field2630 = arg0.field5419;
        this.field2636 = arg0.field5408;
        this.field2628 = arg0.field5403;
        int var20 = this.field2635 * 3;
        this.field2643 = new short[var20];
        this.field2627 = new short[var20];
        this.field2647 = new short[var20];
        this.field2634 = new short[var20];
        this.field2614 = new float[var20];
        this.field2612 = new float[var20];
        this.field2623 = new short[this.field2635];
        this.field2646 = new byte[this.field2635];
        this.field2631 = new short[this.field2635];
        this.field2622 = new short[this.field2635];
        this.field2641 = new short[this.field2635];
        this.field2637 = new short[this.field2635];
        if (arg0.field5446 != null) {
            this.field2613 = new byte[this.field2635];
        }
        this.field2618 = new class43();
        this.field2644 = new class21();
        this.field2642 = new class21();
        if (class193.field3531) {
            this.field2621 = new class21();
        }
        this.field2648 = new class21();
        this.field2632 = new class21();
        this.field2653 = (short) arg1;
        this.field2638 = (short) arg2;
        this.field2640 = new short[var20];
        field2616 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < arg0.field5414; var22++) {
            int var23 = this.field2629[var22];
            this.field2629[var22] = var21;
            var21 += var23;
        }
        this.field2629[arg0.field5414] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field5420 != null) {
            int var28 = arg0.field5432;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            for (int var36 = 0; var36 < this.field2635; var36++) {
                int var37 = var5[var36];
                if (arg0.field5420[var37] != -1) {
                    int var38 = arg0.field5420[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field5415[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field5399[var37];
                        } else {
                            var40 = arg0.field5404[var37];
                        }
                        int var41 = arg0.field5440[var40];
                        int var42 = arg0.field5419[var40];
                        int var43 = arg0.field5408[var40];
                        if (var41 < var29[var38]) {
                            var29[var38] = var41;
                        }
                        if (var41 > var30[var38]) {
                            var30[var38] = var41;
                        }
                        if (var42 < var31[var38]) {
                            var31[var38] = var42;
                        }
                        if (var42 > var32[var38]) {
                            var32[var38] = var42;
                        }
                        if (var43 < var33[var38]) {
                            var33[var38] = var43;
                        }
                        if (var43 > var34[var38]) {
                            var34[var38] = var43;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var25 = new int[var28];
            var26 = new int[var28];
            var27 = new float[var28][];
            for (int var44 = 0; var44 < var28; var44++) {
                byte var45 = arg0.field5434[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field5431[var44];
                        if (var46 == 0) {
                            var47 = 1.0F;
                            var48 = 1.0F;
                        } else if (var46 > 0) {
                            var47 = 1.0F;
                            var48 = (float) var46 / 1024.0F;
                        } else {
                            var48 = 1.0F;
                            var47 = (float) (-var46) / 1024.0F;
                        }
                        var49 = 64.0F / (float) (arg0.field5410[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field5431[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field5410[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field5405[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field5431[var44] / 1024.0F;
                        var49 = (float) arg0.field5410[var44] / 1024.0F;
                        var48 = (float) arg0.field5405[var44] / 1024.0F;
                    }
                    var27[var44] = method1114(arg0.field5422[var44], arg0.field5435[var44], arg0.field5409[var44], arg0.field5427[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field2635; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field5438[var51] & 0xFFFF;
            short var53;
            if (arg0.field5418 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field5418[var51];
            }
            int var54;
            if (arg0.field5420 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field5420[var51];
            }
            int var55;
            if (arg0.field5411 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field5411[var51] & 0xFF;
            }
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            float var60 = 0.0F;
            float var61 = 0.0F;
            byte var62 = 0;
            byte var63 = 0;
            int var64 = 0;
            if (var53 != -1) {
                if (var54 == -1) {
                    var56 = 0.0F;
                    var57 = 1.0F;
                    var58 = 1.0F;
                    var59 = 1.0F;
                    var62 = 1;
                    var60 = 0.0F;
                    var61 = 0.0F;
                    var63 = 2;
                } else {
                    var54 &= 0xFF;
                    byte var65 = arg0.field5434[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field5415[var51];
                        int var67 = arg0.field5399[var51];
                        int var68 = arg0.field5404[var51];
                        short var69 = arg0.field5422[var54];
                        short var70 = arg0.field5435[var54];
                        short var71 = arg0.field5409[var54];
                        float var72 = (float) arg0.field5440[var69];
                        float var73 = (float) arg0.field5419[var69];
                        float var74 = (float) arg0.field5408[var69];
                        float var75 = (float) arg0.field5440[var70] - var72;
                        float var76 = (float) arg0.field5419[var70] - var73;
                        float var77 = (float) arg0.field5408[var70] - var74;
                        float var78 = (float) arg0.field5440[var71] - var72;
                        float var79 = (float) arg0.field5419[var71] - var73;
                        float var80 = (float) arg0.field5408[var71] - var74;
                        float var81 = (float) arg0.field5440[var66] - var72;
                        float var82 = (float) arg0.field5419[var66] - var73;
                        float var83 = (float) arg0.field5408[var66] - var74;
                        float var84 = (float) arg0.field5440[var67] - var72;
                        float var85 = (float) arg0.field5419[var67] - var73;
                        float var86 = (float) arg0.field5408[var67] - var74;
                        float var87 = (float) arg0.field5440[var68] - var72;
                        float var88 = (float) arg0.field5419[var68] - var73;
                        float var89 = (float) arg0.field5408[var68] - var74;
                        float var90 = var76 * var80 - var77 * var79;
                        float var91 = var77 * var78 - var75 * var80;
                        float var92 = var75 * var79 - var76 * var78;
                        float var93 = var79 * var92 - var80 * var91;
                        float var94 = var80 * var90 - var78 * var92;
                        float var95 = var78 * var91 - var79 * var90;
                        float var96 = 1.0F / (var77 * var95 + var75 * var93 + var76 * var94);
                        var56 = (var83 * var95 + var81 * var93 + var82 * var94) * var96;
                        var58 = (var86 * var95 + var84 * var93 + var85 * var94) * var96;
                        var60 = (var89 * var95 + var87 * var93 + var88 * var94) * var96;
                        float var97 = var76 * var92 - var77 * var91;
                        float var98 = var77 * var90 - var75 * var92;
                        float var99 = var75 * var91 - var76 * var90;
                        float var100 = 1.0F / (var80 * var99 + var78 * var97 + var79 * var98);
                        var57 = (var83 * var99 + var81 * var97 + var82 * var98) * var100;
                        var59 = (var86 * var99 + var84 * var97 + var85 * var98) * var100;
                        var61 = (var89 * var99 + var87 * var97 + var88 * var98) * var100;
                    } else {
                        int var101 = arg0.field5415[var51];
                        int var102 = arg0.field5399[var51];
                        int var103 = arg0.field5404[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field5433[var54];
                        float var109 = (float) arg0.field5436[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field5405[var54] & 0xFFFF) / 1024.0F;
                            method1105(arg0.field5440[var101], arg0.field5419[var101], arg0.field5408[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field2657;
                            var57 = field2658;
                            method1105(arg0.field5440[var102], arg0.field5419[var102], arg0.field5408[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field2657;
                            var59 = field2658;
                            method1105(arg0.field5440[var103], arg0.field5419[var103], arg0.field5408[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field2657;
                            var61 = field2658;
                            float var111 = var110 / 2.0F;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > var111) {
                                    var58 -= var110;
                                    var62 = 1;
                                } else if (var56 - var58 > var111) {
                                    var58 += var110;
                                    var62 = 2;
                                }
                                if (var60 - var56 > var111) {
                                    var60 -= var110;
                                    var63 = 1;
                                } else if (var56 - var60 > var111) {
                                    var60 += var110;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > var111) {
                                    var59 -= var110;
                                    var62 = 1;
                                } else if (var57 - var59 > var111) {
                                    var59 += var110;
                                    var62 = 2;
                                }
                                if (var61 - var57 > var111) {
                                    var61 -= var110;
                                    var63 = 1;
                                } else if (var57 - var61 > var111) {
                                    var61 += var110;
                                    var63 = 2;
                                }
                            }
                        } else if (var65 == 2) {
                            float var112 = (float) arg0.field5417[var54] / 256.0F;
                            float var113 = (float) arg0.field5421[var54] / 256.0F;
                            int var114 = arg0.field5440[var102] - arg0.field5440[var101];
                            int var115 = arg0.field5419[var102] - arg0.field5419[var101];
                            int var116 = arg0.field5408[var102] - arg0.field5408[var101];
                            int var117 = arg0.field5440[var103] - arg0.field5440[var101];
                            int var118 = arg0.field5419[var103] - arg0.field5419[var101];
                            int var119 = arg0.field5408[var103] - arg0.field5408[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field5431[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field5410[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field5405[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method1098(var126, var127, var128);
                            method1089(arg0.field5440[var101], arg0.field5419[var101], arg0.field5408[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field2656;
                            var57 = field2660;
                            method1089(arg0.field5440[var102], arg0.field5419[var102], arg0.field5408[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field2656;
                            var59 = field2660;
                            method1089(arg0.field5440[var103], arg0.field5419[var103], arg0.field5408[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field2656;
                            var61 = field2660;
                        } else if (var65 == 3) {
                            method1113(arg0.field5440[var101], arg0.field5419[var101], arg0.field5408[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field2662;
                            var57 = field2659;
                            method1113(arg0.field5440[var102], arg0.field5419[var102], arg0.field5408[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field2662;
                            var59 = field2659;
                            method1113(arg0.field5440[var103], arg0.field5419[var103], arg0.field5408[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field2662;
                            var61 = field2659;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > 0.5F) {
                                    var58--;
                                    var62 = 1;
                                } else if (var56 - var58 > 0.5F) {
                                    var58++;
                                    var62 = 2;
                                }
                                if (var60 - var56 > 0.5F) {
                                    var60--;
                                    var63 = 1;
                                } else if (var56 - var60 > 0.5F) {
                                    var60++;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > 0.5F) {
                                    var59--;
                                    var62 = 1;
                                } else if (var57 - var59 > 0.5F) {
                                    var59++;
                                    var62 = 2;
                                }
                                if (var61 - var57 > 0.5F) {
                                    var61--;
                                    var63 = 1;
                                } else if (var57 - var61 > 0.5F) {
                                    var61++;
                                    var63 = 2;
                                }
                            }
                        }
                    }
                }
            }
            arg0.method2198();
            byte var129;
            if (arg0.field5407 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field5407[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field5415[var51];
                class313 var133 = arg0.field5439[var132];
                this.field2631[var50] = this.method1092(arg0, var132, var130, var133.field5384, var133.field5388, var133.field5387, var133.field5385, var56, var57);
                int var134 = arg0.field5399[var51];
                class313 var135 = arg0.field5439[var134];
                this.field2622[var50] = this.method1092(arg0, var134, (long) var62 + var130, var135.field5384, var135.field5388, var135.field5387, var135.field5385, var58, var59);
                int var136 = arg0.field5404[var51];
                class313 var137 = arg0.field5439[var136];
                this.field2641[var50] = this.method1092(arg0, var136, (long) var63 + var130, var137.field5384, var137.field5388, var137.field5387, var137.field5385, var60, var61);
            } else if (var129 == 1) {
                class205 var138 = arg0.field5425[var51];
                long var139 = (long) ((var54 << 2) + (var138.field3721 > 0 ? 1024 : 2048) + (var138.field3723 + 256 << 12) + (var138.field3715 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field2631[var50] = this.method1092(arg0, arg0.field5415[var51], var139, var138.field3721, var138.field3723, var138.field3715, 0, var56, var57);
                this.field2622[var50] = this.method1092(arg0, arg0.field5399[var51], (long) var62 + var139, var138.field3721, var138.field3723, var138.field3715, 0, var58, var59);
                this.field2641[var50] = this.method1092(arg0, arg0.field5404[var51], (long) var63 + var139, var138.field3721, var138.field3723, var138.field3715, 0, var60, var61);
            }
            if (arg0.field5418 == null) {
                this.field2637[var50] = -1;
            } else {
                this.field2637[var50] = arg0.field5418[var51];
            }
            if (this.field2613 != null) {
                this.field2613[var50] = (byte) arg0.field5446[var51];
            }
            this.field2623[var50] = arg0.field5438[var51];
            if (arg0.field5411 != null) {
                this.field2646[var50] = arg0.field5411[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field2635; var143++) {
            short var144 = this.field2637[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field2650 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field2635; var147++) {
            short var148 = this.field2637[var147];
            if (var146 != var148) {
                this.field2650[var145++] = var147;
                var146 = var148;
            }
        }
        this.field2650[var145] = this.field2635;
        field2616 = null;
        this.field2643 = method1094(this.field2643, this.field2619);
        this.field2627 = method1094(this.field2627, this.field2619);
        this.field2647 = method1094(this.field2647, this.field2619);
        this.field2634 = method1094(this.field2634, this.field2619);
        this.field2614 = method1108(this.field2614, this.field2619);
        this.field2612 = method1108(this.field2612, this.field2619);
    }

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "()I", line = 1186)
    public final int method1100() {
        return this.field2653;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZZ)Lha;", line = 1190)
    public final class26 method161(boolean arg0, boolean arg1) {
        return this.method1099(arg0, arg1, field2652, field2649);
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)V", line = 1194)
    public final void method1101(int arg0) {
        if (this.field2643 == null) {
            this.method164(arg0);
            return;
        }
        int var2 = class136.field2366[arg0];
        int var3 = class136.field2372[arg0];
        for (int var4 = 0; var4 < this.field2624; var4++) {
            int var5 = this.field2639[var4] * var3 + this.field2636[var4] * var2 >> 16;
            this.field2636[var4] = this.field2636[var4] * var3 - this.field2639[var4] * var2 >> 16;
            this.field2639[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field2619; var6++) {
            int var7 = this.field2647[var6] * var2 + this.field2643[var6] * var3 >> 16;
            this.field2647[var6] = (short) (this.field2647[var6] * var3 - this.field2643[var6] * var2 >> 16);
            this.field2643[var6] = (short) var7;
        }
        this.field2618.field815 = false;
        this.field2644.field276 = false;
        if (this.field2621 != null) {
            this.field2621.field276 = false;
        }
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V", line = 1236)
    public final void method177(int arg0) {
        int var2 = class136.field2366[arg0];
        int var3 = class136.field2372[arg0];
        for (int var4 = 0; var4 < this.field2624; var4++) {
            int var5 = this.field2639[var4] * var3 + this.field2630[var4] * var2 >> 16;
            this.field2630[var4] = this.field2630[var4] * var3 - this.field2639[var4] * var2 >> 16;
            this.field2639[var4] = var5;
        }
        this.field2618.field815 = false;
        this.field2644.field276 = false;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZZZZZ)V", line = 1256)
    private final void method1102(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field2644.field279 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field2642.field279 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field2621.field279 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field2648.field279 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field2626.field772.length < this.field2619 * var6) {
            field2626 = new class41((this.field2619 + 100) * var6);
        } else {
            field2626.field738 = 0;
        }
        if (arg1) {
            if (class253.field4331) {
                for (int var7 = 0; var7 < this.field2624; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field2639[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field2630[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field2636[var7]);
                    int var11 = this.field2629[var7];
                    int var12 = this.field2629[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field2640[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field2626.field738 = var6 * var14;
                        field2626.method365((byte) -32, var8);
                        field2626.method365((byte) -32, var9);
                        field2626.method365((byte) -32, var10);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field2624; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field2639[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field2630[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field2636[var15]);
                    int var19 = this.field2629[var15];
                    int var20 = this.field2629[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field2640[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field2626.field738 = var6 * var22;
                        field2626.method325(true, var16);
                        field2626.method325(true, var17);
                        field2626.method325(true, var18);
                    }
                }
            }
        }
        if (arg2) {
            if (class193.field3531) {
                for (int var42 = 0; var42 < this.field2635; var42++) {
                    int var43 = method1090(this.field2623[var42], this.field2637[var42], this.field2653, this.field2646[var42]);
                    field2626.field738 = this.field2631[var42] * var6 + this.field2642.field279;
                    field2626.method365((byte) -32, var43);
                    field2626.field738 = this.field2622[var42] * var6 + this.field2642.field279;
                    field2626.method365((byte) -32, var43);
                    field2626.field738 = this.field2641[var42] * var6 + this.field2642.field279;
                    field2626.method365((byte) -32, var43);
                }
            } else {
                int var23 = (int) class169.field3000[0];
                int var24 = (int) class169.field3000[1];
                int var25 = (int) class169.field3000[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field2653 * 1.3F);
                int var28 = this.field2638 * var26 >> 8;
                for (int var29 = 0; var29 < this.field2635; var29++) {
                    short var30 = this.field2631[var29];
                    short var31 = this.field2634[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field2647[var30] * var25 + this.field2643[var30] * var23 + this.field2627[var30] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field2647[var30] * var25 + this.field2643[var30] * var23 + this.field2627[var30] * var24) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field2634[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field2622[var29];
                    short var34 = this.field2634[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field2647[var33] * var25 + this.field2643[var33] * var23 + this.field2627[var33] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field2647[var33] * var25 + this.field2643[var33] * var23 + this.field2627[var33] * var24) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field2634[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field2641[var29];
                    short var37 = this.field2634[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field2647[var36] * var25 + this.field2643[var36] * var23 + this.field2627[var36] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field2647[var36] * var25 + this.field2643[var36] * var23 + this.field2627[var36] * var24) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field2634[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method1090(this.field2623[var29], this.field2637[var29], var32, this.field2646[var29]);
                    int var40 = method1090(this.field2623[var29], this.field2637[var29], var35, this.field2646[var29]);
                    int var41 = method1090(this.field2623[var29], this.field2637[var29], var38, this.field2646[var29]);
                    field2626.field738 = var6 * var30 + this.field2642.field279;
                    field2626.method365((byte) -32, var39);
                    field2626.field738 = var6 * var33 + this.field2642.field279;
                    field2626.method365((byte) -32, var40);
                    field2626.field738 = var6 * var36 + this.field2642.field279;
                    field2626.method365((byte) -32, var41);
                }
                this.field2643 = null;
                this.field2627 = null;
                this.field2647 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field2638;
            float var45 = 3.0F / (float) (this.field2638 / 2 + this.field2638);
            field2626.field738 = this.field2621.field279;
            if (class253.field4331) {
                for (int var46 = 0; var46 < this.field2619; var46++) {
                    short var47 = this.field2634[var46];
                    if (var47 == 0) {
                        field2626.method316((float) this.field2643[var46] * var45, -1244406608);
                        field2626.method316((float) this.field2627[var46] * var45, -1244406608);
                        field2626.method316((float) this.field2647[var46] * var45, -1244406608);
                    } else {
                        float var48 = var44 / (float) var47;
                        field2626.method316((float) this.field2643[var46] * var48, -1244406608);
                        field2626.method316((float) this.field2627[var46] * var48, -1244406608);
                        field2626.method316((float) this.field2647[var46] * var48, -1244406608);
                    }
                    field2626.field738 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field2619; var49++) {
                    short var50 = this.field2634[var49];
                    if (var50 == 0) {
                        field2626.method320(false, (float) this.field2643[var49] * var45);
                        field2626.method320(false, (float) this.field2627[var49] * var45);
                        field2626.method320(false, (float) this.field2647[var49] * var45);
                    } else {
                        float var51 = var44 / (float) var50;
                        field2626.method320(false, (float) this.field2643[var49] * var51);
                        field2626.method320(false, (float) this.field2627[var49] * var51);
                        field2626.method320(false, (float) this.field2647[var49] * var51);
                    }
                    field2626.field738 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field2626.field738 = this.field2648.field279;
            if (class253.field4331) {
                for (int var52 = 0; var52 < this.field2619; var52++) {
                    field2626.method316(this.field2614[var52], -1244406608);
                    field2626.method316(this.field2612[var52], -1244406608);
                    field2626.field738 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field2619; var53++) {
                    field2626.method320(false, this.field2614[var53]);
                    field2626.method320(false, this.field2612[var53]);
                    field2626.field738 += var6 - 8;
                }
            }
        }
        field2626.field738 = this.field2619 * var6;
        if (arg0) {
            if (class253.field4318) {
                ByteBuffer var54 = ByteBuffer.wrap(field2626.field772, 0, field2626.field738);
                if (this.field2620 == null) {
                    this.field2620 = new class259(true);
                    this.field2620.method1822(var54);
                } else {
                    this.field2620.method1819(var54);
                }
                if (arg1) {
                    this.field2644.field276 = true;
                    this.field2644.field280 = null;
                    this.field2644.field275 = this.field2620;
                    this.field2644.field274 = var6;
                }
                if (arg2) {
                    this.field2642.field276 = true;
                    this.field2642.field280 = null;
                    this.field2642.field275 = this.field2620;
                    this.field2642.field274 = var6;
                }
                if (arg3) {
                    this.field2621.field276 = true;
                    this.field2621.field280 = null;
                    this.field2621.field275 = this.field2620;
                    this.field2621.field274 = var6;
                }
                if (arg4) {
                    this.field2648.field276 = true;
                    this.field2648.field280 = null;
                    this.field2648.field275 = this.field2620;
                    this.field2648.field274 = var6;
                }
            } else {
                if (field2645 == null || field2645.capacity() < field2626.field738) {
                    field2645 = ByteBuffer.allocateDirect(var6 * 100 + field2626.field738);
                } else {
                    field2645.clear();
                }
                field2645.put(field2626.field772, 0, field2626.field738);
                field2645.flip();
                if (arg1) {
                    this.field2644.field276 = true;
                    this.field2644.field280 = field2645;
                    this.field2644.field275 = null;
                    this.field2644.field274 = var6;
                }
                if (arg2) {
                    this.field2642.field276 = true;
                    this.field2642.field280 = field2645;
                    this.field2644.field275 = null;
                    this.field2642.field274 = var6;
                }
                if (arg3) {
                    this.field2621.field276 = true;
                    this.field2621.field280 = field2645;
                    this.field2621.field275 = null;
                    this.field2621.field274 = var6;
                }
                if (arg4) {
                    this.field2648.field276 = true;
                    this.field2648.field280 = field2645;
                    this.field2648.field275 = null;
                    this.field2648.field274 = var6;
                }
            }
        } else if (class253.field4304) {
            class259 var55 = new class259();
            ByteBuffer var56 = ByteBuffer.wrap(field2626.field772, 0, field2626.field738);
            var55.method1822(var56);
            if (arg1) {
                this.field2644.field276 = true;
                this.field2644.field280 = null;
                this.field2644.field275 = var55;
                this.field2644.field274 = var6;
            }
            if (arg2) {
                this.field2642.field276 = true;
                this.field2642.field280 = null;
                this.field2642.field275 = var55;
                this.field2642.field274 = var6;
            }
            if (arg3) {
                this.field2621.field276 = true;
                this.field2621.field280 = null;
                this.field2621.field275 = var55;
                this.field2621.field274 = var6;
            }
            if (arg4) {
                this.field2648.field276 = true;
                this.field2648.field280 = null;
                this.field2648.field275 = var55;
                this.field2648.field274 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field2626.field738);
            var57.put(field2626.field772, 0, field2626.field738);
            var57.flip();
            if (arg1) {
                this.field2644.field276 = true;
                this.field2644.field280 = var57;
                this.field2644.field275 = null;
                this.field2644.field274 = var6;
            }
            if (arg2) {
                this.field2642.field276 = true;
                this.field2642.field280 = var57;
                this.field2644.field275 = null;
                this.field2642.field274 = var6;
            }
            if (arg3) {
                this.field2621.field276 = true;
                this.field2621.field280 = var57;
                this.field2621.field275 = null;
                this.field2621.field274 = var6;
            }
            if (arg4) {
                this.field2648.field276 = true;
                this.field2648.field280 = var57;
                this.field2648.field275 = null;
                this.field2648.field274 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(III)V", line = 1786)
    public final void method166(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2624; var4++) {
            this.field2639[var4] += arg0;
            this.field2630[var4] += arg1;
            this.field2636[var4] += arg2;
        }
        this.field2618.field815 = false;
        this.field2644.field276 = false;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ldg;I)V", line = 1803)
    public final void method169(class172 arg0, int arg1) {
        if (this.field2651 == null || arg1 == -1) {
            return;
        }
        class125 var3 = arg0.field3060[arg1];
        class230 var4 = var3.field2219;
        field2663 = 0;
        field2664 = 0;
        field2661 = 0;
        for (int var5 = 0; var5 < var3.field2211; var5++) {
            short var6 = var3.field2214[var5];
            if (var4.field3937[var6]) {
                if (var3.field2221[var5] != -1) {
                    this.method1118(0, 0, 0, 0);
                }
                this.method1118(var4.field3938[var6], var3.field2212[var5], var3.field2218[var5], var3.field2209[var5]);
            }
        }
        this.field2644.field276 = false;
        this.field2618.field815 = false;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lel;)Lel;", line = 1838)
    public final class232 method1103(class232 arg0) {
        if (this.field2619 == 0) {
            return null;
        }
        if (!this.field2618.field815) {
            this.method1115();
        }
        int var2;
        int var3;
        if (class169.field3003 > 0) {
            var2 = this.field2618.field817 - (class169.field3003 * this.field2618.field813 >> 8) >> 3;
            var3 = this.field2618.field812 - (class169.field3003 * this.field2618.field810 >> 8) >> 3;
        } else {
            var2 = this.field2618.field817 - (class169.field3003 * this.field2618.field810 >> 8) >> 3;
            var3 = this.field2618.field812 - (class169.field3003 * this.field2618.field813 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class169.field3001 > 0) {
            var4 = this.field2618.field816 - (class169.field3001 * this.field2618.field813 >> 8) >> 3;
            var5 = this.field2618.field814 - (class169.field3001 * this.field2618.field810 >> 8) >> 3;
        } else {
            var4 = this.field2618.field816 - (class169.field3001 * this.field2618.field810 >> 8) >> 3;
            var5 = this.field2618.field814 - (class169.field3001 * this.field2618.field813 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class232 var8;
        if (arg0 == null || arg0.field3980.length < var6 * var7) {
            var8 = new class232(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field5018 = arg0.field5015 = var6;
            arg0.field5008 = arg0.field5009 = var7;
            arg0.method1574();
        }
        var8.field5026 = var2;
        var8.field5014 = var4;
        if (field2666.length < this.field2619) {
            field2666 = new int[this.field2619];
            field2665 = new int[this.field2619];
        }
        for (int var9 = 0; var9 < this.field2624; var9++) {
            int var10 = (this.field2639[var9] - (this.field2630[var9] * class169.field3003 >> 8) >> 3) - var2;
            int var11 = (this.field2636[var9] - (this.field2630[var9] * class169.field3001 >> 8) >> 3) - var4;
            int var12 = this.field2629[var9];
            int var13 = this.field2629[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field2640[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field2666[var15] = var10;
                field2665[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field2635; var16++) {
            if (this.field2646[var16] <= 128) {
                short var17 = this.field2631[var16];
                short var18 = this.field2622[var16];
                short var19 = this.field2641[var16];
                int var20 = field2666[var17];
                int var21 = field2666[var18];
                int var22 = field2666[var19];
                int var23 = field2665[var17];
                int var24 = field2665[var18];
                int var25 = field2665[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class136.method968(var8.field3980, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lmc;IIIZ)V", line = 1962)
    public final void method410(class51 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class149 var6 = (class149) arg0;
        if (this.field2635 == 0 || var6.field2635 == 0) {
            return;
        }
        int var7 = var6.field2624;
        int[] var8 = var6.field2639;
        int[] var9 = var6.field2630;
        int[] var10 = var6.field2636;
        short[] var11 = var6.field2643;
        short[] var12 = var6.field2627;
        short[] var13 = var6.field2647;
        short[] var14 = var6.field2634;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field2617 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field2617.field3122;
            var16 = this.field2617.field3121;
            var17 = this.field2617.field3123;
            var18 = this.field2617.field3120;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field2617 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field2617.field3122;
            var20 = var6.field2617.field3121;
            var21 = var6.field2617.field3123;
            var22 = var6.field2617.field3120;
        }
        int[] var23 = var6.field2629;
        short[] var24 = var6.field2640;
        if (!var6.field2618.field815) {
            var6.method1115();
        }
        short var25 = var6.field2618.field810;
        short var26 = var6.field2618.field813;
        short var27 = var6.field2618.field817;
        short var28 = var6.field2618.field812;
        short var29 = var6.field2618.field816;
        short var30 = var6.field2618.field814;
        for (int var31 = 0; var31 < this.field2624; var31++) {
            int var32 = this.field2630[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field2639[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field2636[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field2629[var31];
                        int var37 = this.field2629[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field2640[var38] - 1;
                            if (var35 == -1 || this.field2634[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var15 == null) {
                                            this.field2617 = new class176();
                                            var15 = this.field2617.field3122 = class195.method1408((byte) 53, this.field2643);
                                            var16 = this.field2617.field3121 = class195.method1408((byte) 53, this.field2627);
                                            var17 = this.field2617.field3123 = class195.method1408((byte) 53, this.field2647);
                                            var18 = this.field2617.field3120 = class195.method1408((byte) 53, this.field2634);
                                        }
                                        if (var19 == null) {
                                            class176 var44 = var6.field2617 = new class176();
                                            var19 = var44.field3122 = class195.method1408((byte) 53, var11);
                                            var20 = var44.field3121 = class195.method1408((byte) 53, var12);
                                            var21 = var44.field3123 = class195.method1408((byte) 53, var13);
                                            var22 = var44.field3120 = class195.method1408((byte) 53, var14);
                                        }
                                        short var45 = this.field2643[var35];
                                        short var46 = this.field2627[var35];
                                        short var47 = this.field2647[var35];
                                        short var48 = this.field2634[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var48;
                                            }
                                        }
                                        short var53 = var11[var40];
                                        short var54 = var12[var40];
                                        short var55 = var13[var40];
                                        short var56 = var14[var40];
                                        int var57 = this.field2629[var31];
                                        int var58 = this.field2629[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field2640[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var15[var60] += var53;
                                                var16[var60] += var54;
                                                var17[var60] += var55;
                                                var18[var60] += var56;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "()V", line = 2201)
    private final void method1104() {
        if (field2626.field772.length < this.field2619 * 12) {
            field2626 = new class41((this.field2619 + 100) * 12);
        } else {
            field2626.field738 = 0;
        }
        if (class253.field4331) {
            for (int var1 = 0; var1 < this.field2635; var1++) {
                field2626.method365((byte) -32, this.field2631[var1]);
                field2626.method365((byte) -32, this.field2622[var1]);
                field2626.method365((byte) -32, this.field2641[var1]);
            }
        } else {
            for (int var2 = 0; var2 < this.field2635; var2++) {
                field2626.method325(true, this.field2631[var2]);
                field2626.method325(true, this.field2622[var2]);
                field2626.method325(true, this.field2641[var2]);
            }
        }
        if (!class253.field4304) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field2626.field738);
            var5.put(field2626.field772, 0, field2626.field738);
            var5.flip();
            this.field2632.field276 = true;
            this.field2632.field280 = var5;
            this.field2632.field275 = null;
            return;
        }
        class259 var3 = new class259();
        ByteBuffer var4 = ByteBuffer.wrap(field2626.field772, 0, field2626.field738);
        var3.method1822(var4);
        this.field2632.field276 = true;
        this.field2632.field280 = null;
        this.field2632.field275 = var3;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIIIJ)V", line = 2259)
    public final void method162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        if (this.field2619 == 0) {
            return;
        }
        GL var10 = class253.field4319;
        var10.glPushMatrix();
        if (arg3 != 0) {
            var10.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        var10.glTranslatef((float) arg4, (float) arg5, (float) arg6);
        if (arg1 != 0) {
            var10.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        }
        if (arg0 != 0) {
            var10.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            var10.glRotatef((float) (-arg2) * 0.17578125F, 0.0F, 0.0F, 1.0F);
        }
        this.method1117();
        var10.glPopMatrix();
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "()I", line = 2282)
    public final int method167() {
        if (!this.field2618.field815) {
            this.method1115();
        }
        return this.field2618.field814;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIII[FFIF)V", line = 2288)
    private static final void method1105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
        int var10 = arg0 - arg3;
        int var11 = arg1 - arg4;
        int var12 = arg2 - arg5;
        float var13 = arg6[2] * (float) var12 + arg6[0] * (float) var10 + arg6[1] * (float) var11;
        float var14 = arg6[5] * (float) var12 + arg6[3] * (float) var10 + arg6[4] * (float) var11;
        float var15 = arg6[8] * (float) var12 + arg6[6] * (float) var10 + arg6[7] * (float) var11;
        float var16 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var16 = arg7 * var16;
        }
        float var17 = var14 + arg9 + 0.5F;
        if (arg8 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg8 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg8 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field2657 = var16;
        field2658 = var17;
    }

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "()V", line = 2334)
    public static void method1106() {
        field2616 = null;
        field2626 = null;
        field2645 = null;
        field2649 = null;
        field2652 = null;
        field2654 = null;
        field2655 = null;
        field2666 = null;
        field2665 = null;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(III)V", line = 2349)
    public final void method170(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2624; var4++) {
            this.field2639[var4] = this.field2639[var4] * arg0 >> 7;
            this.field2630[var4] = this.field2630[var4] * arg1 >> 7;
            this.field2636[var4] = this.field2636[var4] * arg2 >> 7;
        }
        this.field2618.field815 = false;
        this.field2644.field276 = false;
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "()I", line = 2366)
    public final int method168() {
        if (!this.field2618.field815) {
            this.method1115();
        }
        return this.field2618.field817;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IILbc;[[I[[IIII)V", line = 2372)
    public final void method1107(int arg0, int arg1, class149 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field2618.field815) {
            arg2.method1115();
        }
        int var9 = arg2.field2618.field817 + arg5;
        int var10 = arg2.field2618.field812 + arg5;
        int var11 = arg2.field2618.field816 + arg7;
        int var12 = arg2.field2618.field814 + arg7;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var9 < 0 || var10 + 128 >> 7 >= arg3.length || var11 < 0 || var12 + 128 >> 7 >= arg3[0].length) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg4 == null) {
                return;
            }
            if (var9 < 0 || var10 + 128 >> 7 >= arg4.length || var11 < 0 || var12 + 128 >> 7 >= arg4[0].length) {
                return;
            }
        } else {
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            int var15 = var11 >> 7;
            int var16 = var12 + 127 >> 7;
            if (arg3[var13][var15] == arg6 && arg3[var14][var15] == arg6 && arg3[var13][var16] == arg6 && arg3[var14][var16] == arg6) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var17 = 0; var17 < this.field2624; var17++) {
                int var18 = this.field2639[var17] + arg5;
                int var19 = this.field2636[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field2630[var17] = this.field2630[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field2618.field810;
            for (int var28 = 0; var28 < this.field2624; var28++) {
                int var29 = (this.field2630[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field2639[var28] + arg5;
                    int var31 = this.field2636[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field2630[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method165(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field2618.field813 - arg2.field2618.field810;
            for (int var42 = 0; var42 < this.field2624; var42++) {
                int var43 = this.field2639[var42] + arg5;
                int var44 = this.field2636[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field2630[var42] = var51 + this.field2630[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field2618.field813 - arg2.field2618.field810;
            for (int var53 = 0; var53 < this.field2624; var53++) {
                int var54 = this.field2639[var53] + arg5;
                int var55 = this.field2636[var53] + arg7;
                int var56 = var54 & 0x7F;
                int var57 = var55 & 0x7F;
                int var58 = var54 >> 7;
                int var59 = var55 >> 7;
                int var60 = (128 - var56) * arg3[var58][var59] + arg3[var58 + 1][var59] * var56 >> 7;
                int var61 = (128 - var56) * arg3[var58][var59 + 1] + arg3[var58 + 1][var59 + 1] * var56 >> 7;
                int var62 = (128 - var57) * var60 + var57 * var61 >> 7;
                int var63 = (128 - var56) * arg4[var58][var59] + arg4[var58 + 1][var59] * var56 >> 7;
                int var64 = (128 - var56) * arg4[var58][var59 + 1] + arg4[var58 + 1][var59 + 1] * var56 >> 7;
                int var65 = (128 - var57) * var63 + var57 * var64 >> 7;
                int var66 = var62 - var65;
                this.field2630[var53] = ((this.field2630[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field2644.field276 = false;
        this.field2618.field815 = false;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([FI)[F", line = 2570)
    private static final float[] method1108(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class299.method2095(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "()V", line = 2579)
    public final void method176() {
        for (int var1 = 0; var1 < this.field2624; var1++) {
            this.field2639[var1] = -this.field2639[var1];
            this.field2636[var1] = -this.field2636[var1];
        }
        this.field2618.field815 = false;
        this.field2644.field276 = false;
    }

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "()V", line = 2593)
    public final void method1109() {
        if (this.field2643 == null) {
            this.method174();
            return;
        }
        for (int var1 = 0; var1 < this.field2624; var1++) {
            int var2 = this.field2636[var1];
            this.field2636[var1] = this.field2639[var1];
            this.field2639[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field2619; var3++) {
            short var4 = this.field2647[var3];
            this.field2647[var3] = this.field2643[var3];
            this.field2643[var3] = (short) (-var4);
        }
        this.field2618.field815 = false;
        this.field2644.field276 = false;
        if (this.field2621 != null) {
            this.field2621.field276 = false;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V", line = 2631)
    public final void method164(int arg0) {
        int var2 = class136.field2366[arg0];
        int var3 = class136.field2372[arg0];
        for (int var4 = 0; var4 < this.field2624; var4++) {
            int var5 = this.field2639[var4] * var3 + this.field2636[var4] * var2 >> 16;
            this.field2636[var4] = this.field2636[var4] * var3 - this.field2639[var4] * var2 >> 16;
            this.field2639[var4] = var5;
        }
        this.field2618.field815 = false;
        this.field2644.field276 = false;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZZZZZZZZZZZ)Lbc;", line = 2651)
    public final class149 method1110(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class149 var12 = new class149();
        var12.field2624 = this.field2624;
        var12.field2619 = this.field2619;
        var12.field2635 = this.field2635;
        if (arg0) {
            var12.field2639 = this.field2639;
            var12.field2636 = this.field2636;
        } else {
            var12.field2639 = class246.method1665(this.field2639, 1);
            var12.field2636 = class246.method1665(this.field2636, 1);
        }
        if (arg1) {
            var12.field2630 = this.field2630;
        } else {
            var12.field2630 = class246.method1665(this.field2630, 1);
        }
        if (arg0 && arg1) {
            var12.field2644 = this.field2644;
            var12.field2618 = this.field2618;
        } else {
            var12.field2644 = new class21();
            var12.field2618 = new class43();
        }
        if (arg2) {
            var12.field2623 = this.field2623;
        } else {
            var12.field2623 = class195.method1408((byte) 53, this.field2623);
        }
        if (arg3) {
            var12.field2646 = this.field2646;
        } else {
            var12.field2646 = class150.method1124(-9, this.field2646);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class193.field3531) {
            var12.field2642 = new class21();
        } else {
            var12.field2642 = this.field2642;
        }
        if (arg5) {
            var12.field2643 = this.field2643;
            var12.field2627 = this.field2627;
            var12.field2647 = this.field2647;
            var12.field2634 = this.field2634;
        } else {
            var12.field2643 = class195.method1408((byte) 53, this.field2643);
            var12.field2627 = class195.method1408((byte) 53, this.field2627);
            var12.field2647 = class195.method1408((byte) 53, this.field2647);
            var12.field2634 = class195.method1408((byte) 53, this.field2634);
        }
        if (!class193.field3531) {
            var12.field2621 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field2621 = this.field2621;
        } else {
            var12.field2621 = new class21();
        }
        if (arg8) {
            var12.field2614 = this.field2614;
            var12.field2612 = this.field2612;
            var12.field2648 = this.field2648;
        } else {
            var12.field2614 = class107.method754(true, this.field2614);
            var12.field2612 = class107.method754(true, this.field2612);
            var12.field2648 = new class21();
        }
        if (arg9) {
            var12.field2631 = this.field2631;
            var12.field2622 = this.field2622;
            var12.field2641 = this.field2641;
            var12.field2632 = this.field2632;
        } else {
            var12.field2631 = class195.method1408((byte) 53, this.field2631);
            var12.field2622 = class195.method1408((byte) 53, this.field2622);
            var12.field2641 = class195.method1408((byte) 53, this.field2641);
            var12.field2632 = new class21();
        }
        if (arg10) {
            var12.field2637 = this.field2637;
        } else {
            var12.field2637 = class195.method1408((byte) 53, this.field2637);
        }
        var12.field2628 = this.field2628;
        var12.field2651 = this.field2651;
        var12.field2613 = this.field2613;
        var12.field2633 = this.field2633;
        var12.field2650 = this.field2650;
        var12.field2640 = this.field2640;
        var12.field2629 = this.field2629;
        var12.field2653 = this.field2653;
        var12.field2638 = this.field2638;
        return var12;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "()Z", line = 2786)
    public final boolean method408() {
        return this.field2625 && this.field2639 != null && this.field2643 != null;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "()I", line = 2789)
    public final int method154() {
        if (!this.field2618.field815) {
            this.method1115();
        }
        return this.field2618.field810;
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)V", line = 2795)
    public final void method1111(int arg0) {
        this.field2638 = (short) arg0;
        if (this.field2621 != null) {
            this.field2621.field276 = false;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(ZZ)Lha;", line = 2803)
    public final class26 method175(boolean arg0, boolean arg1) {
        return this.method1099(arg0, arg1, field2655, field2654);
    }

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "()V", line = 2806)
    public final void method1112() {
        if (this.field2643 == null) {
            this.method176();
            return;
        }
        for (int var1 = 0; var1 < this.field2624; var1++) {
            this.field2639[var1] = -this.field2639[var1];
            this.field2636[var1] = -this.field2636[var1];
        }
        for (int var2 = 0; var2 < this.field2619; var2++) {
            this.field2643[var2] = (short) (-this.field2643[var2]);
            this.field2647[var2] = (short) (-this.field2647[var2]);
        }
        this.field2618.field815 = false;
        this.field2644.field276 = false;
        if (this.field2621 != null) {
            this.field2621.field276 = false;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIII[FIF)V", line = 2839)
    private static final void method1113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
        int var9 = arg0 - arg3;
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg5;
        float var12 = arg6[2] * (float) var11 + arg6[0] * (float) var9 + arg6[1] * (float) var10;
        float var13 = arg6[5] * (float) var11 + arg6[3] * (float) var9 + arg6[4] * (float) var10;
        float var14 = arg6[8] * (float) var11 + arg6[6] * (float) var9 + arg6[7] * (float) var10;
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = (float) Math.atan2((double) var12, (double) var14) / 6.2831855F + 0.5F;
        float var17 = (float) Math.asin((double) (var13 / var15)) / 3.1415927F + arg8 + 0.5F;
        if (arg7 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg7 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg7 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field2662 = var16;
        field2659 = var17;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIFFF)[F", line = 2885)
    private static final float[] method1114(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float[] var8 = new float[9];
        float var9 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var10 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var11 = 1.0F - var9;
        var7[0] = var9;
        var7[1] = 0.0F;
        var7[2] = var10;
        var7[3] = 0.0F;
        var7[4] = 1.0F;
        var7[5] = 0.0F;
        var7[6] = -var10;
        var7[7] = 0.0F;
        var7[8] = var9;
        float[] var12 = new float[9];
        float var13 = 1.0F;
        float var14 = 0.0F;
        float var15 = (float) arg1 / 32767.0F;
        float var16 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var17 = 1.0F - var15;
        float var18 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var18 == 0.0F && var15 == 0.0F) {
            var8 = var7;
        } else {
            if (var18 != 0.0F) {
                var13 = (float) (-arg2) / var18;
                var14 = (float) arg0 / var18;
            }
            var12[0] = var13 * var13 * var17 + var15;
            var12[1] = var14 * var16;
            var12[2] = var13 * var14 * var17;
            var12[3] = -var14 * var16;
            var12[4] = var15;
            var12[5] = var13 * var16;
            var12[6] = var13 * var14 * var17;
            var12[7] = -var13 * var16;
            var12[8] = var14 * var14 * var17 + var15;
            var8[0] = var7[2] * var12[6] + var7[0] * var12[0] + var7[1] * var12[3];
            var8[1] = var7[2] * var12[7] + var7[0] * var12[1] + var7[1] * var12[4];
            var8[2] = var7[2] * var12[8] + var7[0] * var12[2] + var7[1] * var12[5];
            var8[3] = var7[5] * var12[6] + var7[3] * var12[0] + var7[4] * var12[3];
            var8[4] = var7[5] * var12[7] + var7[3] * var12[1] + var7[4] * var12[4];
            var8[5] = var7[5] * var12[8] + var7[3] * var12[2] + var7[4] * var12[5];
            var8[6] = var7[8] * var12[6] + var7[6] * var12[0] + var7[7] * var12[3];
            var8[7] = var7[8] * var12[7] + var7[6] * var12[1] + var7[7] * var12[4];
            var8[8] = var7[8] * var12[8] + var7[6] * var12[2] + var7[7] * var12[5];
        }
        var8[0] *= arg4;
        var8[1] *= arg4;
        var8[2] *= arg4;
        var8[3] *= arg5;
        var8[4] *= arg5;
        var8[5] *= arg5;
        var8[6] *= arg6;
        var8[7] *= arg6;
        var8[8] *= arg6;
        return var8;
    }

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "()V", line = 2963)
    private final void method1115() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field2624; var9++) {
            int var10 = this.field2639[var9];
            int var11 = this.field2630[var9];
            int var12 = this.field2636[var9];
            if (var10 < var1) {
                var1 = var10;
            }
            if (var10 > var4) {
                var4 = var10;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = var10 * var10 + var12 * var12;
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var10 * var10 + var12 * var12;
            if (var14 > var8) {
                var8 = var14;
            }
        }
        this.field2618.field817 = (short) var1;
        this.field2618.field812 = (short) var4;
        this.field2618.field810 = (short) var2;
        this.field2618.field813 = (short) var5;
        this.field2618.field816 = (short) var3;
        this.field2618.field814 = (short) var6;
        this.field2618.field811 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field2618.field815 = true;
    }

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "(I)V", line = 3032)
    public final void method1116(int arg0) {
        this.field2653 = (short) arg0;
        this.field2642.field276 = false;
    }

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "()V", line = 3037)
    private final void method1117() {
        GL var1 = class253.field4319;
        if (this.field2635 == 0) {
            return;
        }
        if (this.field2611 != 0) {
            this.method1102(true, !this.field2644.field276 && (this.field2611 & 0x1) != 0, !this.field2642.field276 && (this.field2611 & 0x2) != 0, this.field2621 != null && !this.field2621.field276 && (this.field2611 & 0x4) != 0, false);
        }
        this.method1102(false, !this.field2644.field276, !this.field2642.field276, this.field2621 != null && !this.field2621.field276, !this.field2648.field276);
        if (!this.field2632.field276) {
            this.method1104();
        }
        if (this.field2615 != 0) {
            if ((this.field2615 & 0x1) != 0) {
                this.field2639 = null;
                this.field2630 = null;
                this.field2636 = null;
                this.field2640 = null;
                this.field2629 = null;
            }
            if ((this.field2615 & 0x2) != 0) {
                this.field2623 = null;
                this.field2646 = null;
            }
            if ((this.field2615 & 0x4) != 0) {
                this.field2643 = null;
                this.field2627 = null;
                this.field2647 = null;
                this.field2634 = null;
            }
            if ((this.field2615 & 0x8) != 0) {
                this.field2614 = null;
                this.field2612 = null;
            }
            if ((this.field2615 & 0x10) != 0) {
                this.field2631 = null;
                this.field2622 = null;
                this.field2641 = null;
            }
            this.field2615 = 0;
        }
        class259 var2 = null;
        if (this.field2644.field275 != null) {
            this.field2644.field275.method1821();
            var2 = this.field2644.field275;
            var1.glVertexPointer(3, 5126, this.field2644.field274, (long) this.field2644.field279);
        }
        if (this.field2642.field275 != null) {
            if (this.field2642.field275 != var2) {
                this.field2642.field275.method1821();
                var2 = this.field2642.field275;
            }
            var1.glColorPointer(4, 5121, this.field2642.field274, (long) this.field2642.field279);
        }
        if (class193.field3531 && this.field2621.field275 != null) {
            if (this.field2621.field275 != var2) {
                this.field2621.field275.method1821();
                var2 = this.field2621.field275;
            }
            var1.glNormalPointer(5126, this.field2621.field274, (long) this.field2621.field279);
        }
        if (this.field2648.field275 != null) {
            if (this.field2648.field275 != var2) {
                this.field2648.field275.method1821();
                class259 var3 = this.field2648.field275;
            }
            var1.glTexCoordPointer(2, 5126, this.field2648.field274, (long) this.field2648.field279);
        }
        if (this.field2632.field275 != null) {
            this.field2632.field275.method1820();
        }
        if (this.field2644.field275 == null || this.field2642.field275 == null || class193.field3531 && this.field2621.field275 == null || this.field2648.field275 == null) {
            if (class253.field4304) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field2644.field275 == null) {
                this.field2644.field280.position(this.field2644.field279);
                var1.glVertexPointer(3, 5126, this.field2644.field274, this.field2644.field280);
            }
            if (this.field2642.field275 == null) {
                this.field2642.field280.position(this.field2642.field279);
                var1.glColorPointer(4, 5121, this.field2642.field274, this.field2642.field280);
            }
            if (class193.field3531 && this.field2621.field275 == null) {
                this.field2621.field280.position(this.field2621.field279);
                var1.glNormalPointer(5126, this.field2621.field274, this.field2621.field280);
            }
            if (this.field2648.field275 == null) {
                this.field2648.field280.position(this.field2648.field279);
                var1.glTexCoordPointer(2, 5126, this.field2648.field274, this.field2648.field280);
            }
        }
        if (this.field2632.field275 == null && class253.field4304) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field2650.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field2650[var5];
            int var7 = this.field2650[var5 + 1];
            short var8 = this.field2637[var6];
            if (var8 == -1) {
                class253.method1714(-1);
                class277.method1910(0, 0, -19856);
            } else {
                class136.field2373.method195(var8 & 0xFFFF, 80);
            }
            if (this.field2632.field275 == null) {
                this.field2632.field280.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field2632.field280);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "()V", line = 3213)
    public final void method163() {
        for (int var1 = 0; var1 < this.field2624; var1++) {
            int var2 = this.field2639[var1];
            this.field2639[var1] = this.field2636[var1];
            this.field2636[var1] = -var2;
        }
        this.field2618.field815 = false;
        this.field2644.field276 = false;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIIIIJILfk;)V", line = 3227)
    public final void method150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class283 arg10) {
        if (this.field2619 == 0) {
            return;
        }
        if (!this.field2618.field815) {
            this.method1115();
        }
        short var13 = this.field2618.field811;
        short var14 = this.field2618.field810;
        short var15 = this.field2618.field813;
        int var16 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var17 = arg1 * arg6 + arg2 * var16 >> 16;
        int var18 = (arg1 * var15 + arg2 * var13 >> 16) + var17;
        if (var18 <= 50) {
            return;
        }
        int var19 = (-var13 * arg2 + arg1 * var14 >> 16) + var17;
        if (var19 >= 3584) {
            return;
        }
        int var20 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var21 = var13 + var20 << 9;
        if (var21 / var18 <= class105.field1885) {
            return;
        }
        int var22 = var20 - var13 << 9;
        if (var22 / var18 >= class91.field1667) {
            return;
        }
        int var23 = arg2 * arg6 - arg1 * var16 >> 16;
        int var24 = (arg1 * var13 + arg2 * var15 >> 16) + var23 << 9;
        if (var24 / var18 <= class295.field5122) {
            return;
        }
        int var25 = (-var13 * arg1 + arg2 * var14 >> 16) + var23 << 9;
        if (var25 / var18 >= class49.field890) {
            return;
        }
        int var26 = 0;
        int var27 = 0;
        if (arg0 != 0) {
            var26 = class136.field2366[arg0];
            var27 = class136.field2372[arg0];
        }
        if (arg8 > 0L && class150.field2669 && var19 > 0) {
            int var28;
            int var29;
            if (var20 > 0) {
                var28 = var22 / var18;
                var29 = var21 / var19;
            } else {
                var28 = var22 / var19;
                var29 = var21 / var18;
            }
            int var30;
            int var31;
            if (var23 > 0) {
                var30 = var25 / var18;
                var31 = var24 / var19;
            } else {
                var30 = var25 / var19;
                var31 = var24 / var18;
            }
            if (class8.field129 >= var28 && class8.field129 <= var29 && class68.field1268 >= var30 && class68.field1268 <= var31) {
                int var32 = 999999;
                int var33 = -999999;
                int var34 = 999999;
                int var35 = -999999;
                short var36 = this.field2618.field817;
                short var37 = this.field2618.field812;
                short var38 = this.field2618.field816;
                short var39 = this.field2618.field814;
                int[] var40 = new int[] { var36, var37, var36, var37, var36, var37, var36, var37 };
                int[] var41 = new int[] { var38, var38, var39, var39, var38, var38, var39, var39 };
                int[] var42 = new int[] { var14, var14, var14, var14, var15, var15, var15, var15 };
                for (int var43 = 0; var43 < 8; var43++) {
                    int var44 = var40[var43];
                    int var45 = var42[var43];
                    int var46 = var41[var43];
                    if (arg0 != 0) {
                        int var47 = var26 * var46 + var27 * var44 >> 16;
                        var46 = var27 * var46 - var26 * var44 >> 16;
                        var44 = var47;
                    }
                    int var48 = arg5 + var44;
                    int var49 = arg6 + var45;
                    int var50 = arg7 + var46;
                    int var51 = arg3 * var50 + arg4 * var48 >> 16;
                    int var52 = arg4 * var50 - arg3 * var48 >> 16;
                    int var54 = arg2 * var49 - arg1 * var52 >> 16;
                    int var55 = arg1 * var49 + arg2 * var52 >> 16;
                    if (var55 > 0) {
                        int var57 = (var51 << 9) / var55;
                        int var58 = (var54 << 9) / var55;
                        if (var57 < var32) {
                            var32 = var57;
                        }
                        if (var57 > var33) {
                            var33 = var57;
                        }
                        if (var58 < var34) {
                            var34 = var58;
                        }
                        if (var58 > var35) {
                            var35 = var58;
                        }
                    }
                }
                if (class8.field129 >= var32 && class8.field129 <= var33 && class68.field1268 >= var34 && class68.field1268 <= var35) {
                    if (this.field331) {
                        class139.field2445[class177.field3136++] = arg8;
                    } else {
                        if (field2666.length < this.field2619) {
                            field2666 = new int[this.field2619];
                            field2665 = new int[this.field2619];
                        }
                        int var59 = 0;
                        label118: while (true) {
                            if (var59 >= this.field2624) {
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= this.field2635) {
                                        break label118;
                                    }
                                    short var80 = this.field2631[var79];
                                    short var81 = this.field2622[var79];
                                    short var82 = this.field2641[var79];
                                    if (this.method1096(class8.field129, class68.field1268, field2665[var80], field2665[var81], field2665[var82], field2666[var80], field2666[var81], field2666[var82])) {
                                        class139.field2445[class177.field3136++] = arg8;
                                        break label118;
                                    }
                                    var79++;
                                }
                            }
                            int var60 = this.field2639[var59];
                            int var61 = this.field2630[var59];
                            int var62 = this.field2636[var59];
                            if (arg0 != 0) {
                                int var63 = var26 * var62 + var27 * var60 >> 16;
                                var62 = var27 * var62 - var26 * var60 >> 16;
                                var60 = var63;
                            }
                            int var64 = arg5 + var60;
                            int var65 = arg6 + var61;
                            int var66 = arg7 + var62;
                            int var67 = arg3 * var66 + arg4 * var64 >> 16;
                            int var68 = arg4 * var66 - arg3 * var64 >> 16;
                            int var70 = arg2 * var65 - arg1 * var68 >> 16;
                            int var71 = arg1 * var65 + arg2 * var68 >> 16;
                            if (var71 < 50) {
                                break;
                            }
                            int var73 = (var67 << 9) / var71;
                            int var74 = (var70 << 9) / var71;
                            int var75 = this.field2629[var59];
                            int var76 = this.field2629[var59 + 1];
                            for (int var77 = var75; var77 < var76; var77++) {
                                int var78 = this.field2640[var77] - 1;
                                if (var78 == -1) {
                                    break;
                                }
                                field2666[var78] = var73;
                                field2665[var78] = var74;
                            }
                            var59++;
                        }
                    }
                }
            }
        }
        GL var83 = class253.field4319;
        var83.glPushMatrix();
        var83.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var83.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method1117();
        var83.glRotatef((float) (-arg0) * 0.17578125F, 0.0F, 1.0F, 0.0F);
        var83.glTranslatef((float) (-arg5), (float) (-arg6), (float) (-arg7));
        var83.glPopMatrix();
    }

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "()V", line = 3504)
    public final void method174() {
        for (int var1 = 0; var1 < this.field2624; var1++) {
            int var2 = this.field2636[var1];
            this.field2636[var1] = this.field2639[var1];
            this.field2639[var1] = -var2;
        }
        this.field2618.field815 = false;
        this.field2644.field276 = false;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIII)V", line = 3519)
    private final void method1118(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field2663 = 0;
            field2664 = 0;
            field2661 = 0;
            for (int var6 = 0; var6 < this.field2624; var6++) {
                field2663 += this.field2639[var6];
                field2664 += this.field2630[var6];
                field2661 += this.field2636[var6];
                var5++;
            }
            if (var5 > 0) {
                field2663 = field2663 / var5 + arg1;
                field2664 = field2664 / var5 + arg2;
                field2661 = field2661 / var5 + arg3;
            } else {
                field2663 = arg1;
                field2664 = arg2;
                field2661 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field2624; var7++) {
                this.field2639[var7] += arg1;
                this.field2630[var7] += arg2;
                this.field2636[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field2624; var8++) {
                this.field2639[var8] -= field2663;
                this.field2630[var8] -= field2664;
                this.field2636[var8] -= field2661;
                if (arg3 != 0) {
                    int var9 = class136.field2366[arg3];
                    int var10 = class136.field2372[arg3];
                    int var11 = this.field2639[var8] * var10 + this.field2630[var8] * var9 + 32767 >> 16;
                    this.field2630[var8] = this.field2630[var8] * var10 + 32767 - this.field2639[var8] * var9 >> 16;
                    this.field2639[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class136.field2366[arg1];
                    int var13 = class136.field2372[arg1];
                    int var14 = this.field2630[var8] * var13 + 32767 - this.field2636[var8] * var12 >> 16;
                    this.field2636[var8] = this.field2636[var8] * var13 + this.field2630[var8] * var12 + 32767 >> 16;
                    this.field2630[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class136.field2366[arg2];
                    int var16 = class136.field2372[arg2];
                    int var17 = this.field2639[var8] * var16 + this.field2636[var8] * var15 + 32767 >> 16;
                    this.field2636[var8] = this.field2636[var8] * var16 + 32767 - this.field2639[var8] * var15 >> 16;
                    this.field2639[var8] = var17;
                }
                this.field2639[var8] += field2663;
                this.field2630[var8] += field2664;
                this.field2636[var8] += field2661;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field2624; var18++) {
                this.field2639[var18] -= field2663;
                this.field2630[var18] -= field2664;
                this.field2636[var18] -= field2661;
                this.field2639[var18] = this.field2639[var18] * arg1 / 128;
                this.field2630[var18] = this.field2630[var18] * arg2 / 128;
                this.field2636[var18] = this.field2636[var18] * arg3 / 128;
                this.field2639[var18] += field2663;
                this.field2630[var18] += field2664;
                this.field2636[var18] += field2661;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field2635; var19++) {
                int var20 = (this.field2646[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field2646[var19] = (byte) var20;
            }
            this.field2642.field276 = false;
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V", line = 3685)
    public final void method173(int arg0) {
        int var2 = class136.field2366[arg0];
        int var3 = class136.field2372[arg0];
        for (int var4 = 0; var4 < this.field2624; var4++) {
            int var5 = this.field2630[var4] * var3 - this.field2636[var4] * var2 >> 16;
            this.field2636[var4] = this.field2636[var4] * var3 + this.field2630[var4] * var2 >> 16;
            this.field2630[var4] = var5;
        }
        this.field2618.field815 = false;
        this.field2644.field276 = false;
    }

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "()V", line = 3707)
    public final void method1119() {
        for (int var1 = 0; var1 < this.field2624; var1++) {
            this.field2636[var1] = -this.field2636[var1];
        }
        if (this.field2647 != null) {
            for (int var2 = 0; var2 < this.field2619; var2++) {
                this.field2647[var2] = (short) (-this.field2647[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field2635; var3++) {
            short var4 = this.field2631[var3];
            this.field2631[var3] = this.field2641[var3];
            this.field2641[var3] = var4;
        }
        this.field2618.field815 = false;
        this.field2644.field276 = false;
        if (this.field2621 != null) {
            this.field2621.field276 = false;
        }
        this.field2632.field276 = false;
    }
}
