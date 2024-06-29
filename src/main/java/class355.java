import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class355 extends class424 {

    @OriginalMember(owner = "client!wc", name = "H", descriptor = "Lpn;")
    private class296 field4599;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "Los;")
    private class247 field4589;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "Lfc;")
    private class575 field4585;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
    private int field4597;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
    private int field4596;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "I")
    private int field4598;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
    private int field4592;

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "[[F")
    private float[][] field4602;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "[[F")
    private float[][] field4594;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "[[F")
    private float[][] field4603;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    private int field4586;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "Lcu;")
    private class269 field4595;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "Lui;")
    private class498 field4583;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "Lbc;")
    private class9 field4582;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "Ljaclib/memory/Stream;")
    private Stream field4590;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "Ljaclib/memory/Stream;")
    private Stream field4581;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    private int field4584;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "Lq;")
    public static class151 field4580;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "Lah;")
    public static class249 field4593;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "[[B")
    public static byte[][] field4591;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
    public static void method2041(int arg0) {
        field4593 = null;
        field4580 = null;
        if (arg0 > -20) {
            field4591 = null;
        }
        field4591 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIZI)V")
    private final void method2042(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field4600++;
        long var8 = -1L;
        int var10 = (arg2 << this.field4589.field1168) + arg6;
        int var11 = (arg3 << this.field4589.field1168) + arg0;
        int var12 = this.field4589.method669(var10, var11);
        if ((arg6 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | 0xFFFFL << 16 & (long) var11 << 16;
            class424 var13 = this.field4582.method39(var8, 31750);
            if (var13 != null) {
                this.method2044(((class419) var13).field5426, (byte) 68);
                return;
            }
        }
        short var14 = (short) (this.field4584++);
        if (var8 != -1L) {
            this.field4582.method38(new class419(var14), -18, var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg6 == 0 && arg0 == 0) {
            var15 = this.field4594[arg1][arg4];
            var16 = this.field4603[arg1][arg4];
            var17 = this.field4602[arg1][arg4];
        } else if (this.field4589.field1163 == arg6 && arg0 == 0) {
            var16 = this.field4603[arg1 + 1][arg4];
            var17 = this.field4602[arg1 + 1][arg4];
            var15 = this.field4594[arg1 + 1][arg4];
        } else if (this.field4589.field1163 == arg6 && this.field4589.field1163 == arg0) {
            var16 = this.field4603[arg1 + 1][arg4 + 1];
            var17 = this.field4602[arg1 + 1][arg4 + 1];
            var15 = this.field4594[arg1 + 1][arg4 + 1];
        } else if (arg6 == 0 && this.field4589.field1163 == arg0) {
            var17 = this.field4602[arg1][arg4 + 1];
            var16 = this.field4603[arg1][arg4 + 1];
            var15 = this.field4594[arg1][arg4 + 1];
        } else {
            float var18 = (float) arg6 / (float) this.field4589.field1163;
            float var19 = (float) arg0 / (float) this.field4589.field1163;
            float var20 = this.field4594[arg1][arg4];
            float var21 = this.field4603[arg1][arg4];
            float var22 = this.field4602[arg1][arg4];
            float var23 = this.field4594[arg1 + 1][arg4];
            float var24 = this.field4603[arg1 + 1][arg4];
            float var25 = this.field4602[arg1 + 1][arg4];
            float var26 = (this.field4603[arg1 + 1][arg4 + 1] - var24) * var18 + var24;
            float var27 = (this.field4602[arg1][arg4 + 1] - var22) * var18 + var22;
            float var28 = (this.field4594[arg1][arg4 + 1] - var20) * var18 + var20;
            float var29 = (this.field4594[arg1 + 1][arg4 + 1] - var23) * var18 + var23;
            float var30 = (this.field4603[arg1][arg4 + 1] - var21) * var18 + var21;
            float var31 = (this.field4602[arg1 + 1][arg4 + 1] - var25) * var18 + var25;
            var15 = (var29 - var28) * var19 + var28;
            var16 = (var26 - var30) * var19 + var30;
            var17 = (var31 - var27) * var19 + var27;
        }
        float var32 = (float) (this.field4599.method1754(76) - var10);
        float var33 = (float) (this.field4599.method1753((byte) 127) - var12);
        float var34 = (float) (this.field4599.method1755(114) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var34 * var36;
        if (arg5) {
            return;
        }
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field4599.method1752(48);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var38 + var15 * var37 + var16 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field4599.method1751(121);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFFE7) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (Stream.method1964()) {
            this.field4590.method1958((float) var10);
            this.field4590.method1958((float) var12);
            this.field4590.method1958((float) var11);
        } else {
            this.field4590.method1956((float) var10);
            this.field4590.method1956((float) var12);
            this.field4590.method1956((float) var11);
        }
        if (this.field4585.field7738 == 0) {
            this.field4590.method1957(var47);
            this.field4590.method1957(var46);
            this.field4590.method1957(var45);
        } else {
            this.field4590.method1957(var45);
            this.field4590.method1957(var46);
            this.field4590.method1957(var47);
        }
        this.field4590.method1957(255);
        this.method2044(var14, (byte) 80);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLtc;)Ljava/lang/String;")
    public static final String method2043(byte arg0, class477 arg1) {
        field4601++;
        int var2 = 29 % ((-arg0 - 48) / 36);
        if (client.method696(arg1).method1142((byte) -124) == 0) {
            return null;
        } else if (arg1.field6361 == null || arg1.field6361.trim().length() == 0) {
            return class100.field1336 ? "Hidden-use" : null;
        } else {
            return arg1.field6361;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(SB)V")
    private final void method2044(short arg0, byte arg1) {
        field4579++;
        int var3 = -86 % ((arg1 + 46) / 38);
        if (Stream.method1964()) {
            this.field4581.method1961(arg0);
        } else {
            this.field4581.method1959(arg0);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)Z")
    public static final boolean method2045(int arg0, int arg1, int arg2) {
        if (arg0 == 1) {
            field4587++;
            return class57.method502((byte) 118, arg1, arg2) & class247.method1553(arg1, arg2, -9105);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII[[Z)V")
    public final void method2046(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4) {
        field4588++;
        if (this.field4583 == null || this.field4597 > (arg1 + arg0) || arg1 - arg0 > this.field4596 || (arg0 + arg2) < this.field4598 || (arg2 - arg0) > this.field4592) {
            return;
        }
        for (int var6 = this.field4598; var6 <= this.field4592; var6++) {
            for (int var7 = this.field4597; var7 <= this.field4596; var7++) {
                int var8 = var7 - arg1;
                int var9 = var6 - arg2;
                if (var8 > (-arg0) && var8 < arg0 && var9 > (-arg0) && var9 < arg0 && arg4[var8 + arg0][arg0 + var9]) {
                    this.field4585.method3100(-714740432, (byte) ((int) (this.field4599.method1756((byte) 124) * 255.0F)));
                    this.field4585.method155(0, this.field4595, -128);
                    this.field4585.method187(-2, this.field4585.field7783);
                    this.field4585.method164(0, class527.field6860, -21, 0, this.field4586 / 3, this.field4584, this.field4583);
                    return;
                }
            }
        }
        if (arg3 != 0) {
            this.field4581 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lfc;Los;Lpn;[I)V")
    public class355(class575 arg0, class247 arg1, class296 arg2, int[] arg3) {
        this.field4599 = arg2;
        this.field4589 = arg1;
        this.field4585 = arg0;
        int var5 = this.field4599.method1752(118) - (arg1.field1163 >> 1);
        this.field4597 = this.field4599.method1754(39) - var5 >> arg1.field1168;
        this.field4596 = var5 + this.field4599.method1754(118) >> arg1.field1168;
        this.field4598 = this.field4599.method1755(109) - var5 >> arg1.field1168;
        this.field4592 = this.field4599.method1755(116) + var5 >> arg1.field1168;
        int var6 = this.field4596 + 1 - this.field4597;
        int var7 = this.field4592 + 1 - this.field4598;
        this.field4602 = new float[var6 + 1][var7 + 1];
        this.field4594 = new float[var6 + 1][var7 + 1];
        this.field4603 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field4598 + var8;
            if (var27 > 0 && var27 < (this.field4589.field1164 - 1)) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = var28 + this.field4597;
                    if (var29 > 0 && var29 < (this.field4589.field1166 - 1)) {
                        int var30 = arg1.method668(var29 + 1, var27) - arg1.method668(var29 - 1, var27);
                        int var31 = arg1.method668(var29, var27 + 1) - arg1.method668(var29, var27 - 1);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var31 * var31 + var30 * var30 + 65536)));
                        this.field4594[var28][var8] = (float) var30 * var32;
                        this.field4603[var28][var8] = var32 * -256.0F;
                        this.field4602[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field4598; var10 <= this.field4592; var10++) {
            if (var10 >= 0 && arg1.field1164 > var10) {
                for (int var23 = this.field4597; var23 <= this.field4596; var23++) {
                    if (var23 >= 0 && var23 < arg1.field1166) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field3308[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var25.length > var26) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field4586 += 3;
                                    }
                                }
                            } else {
                                this.field4586 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field4596 - this.field4597;
            }
        }
        if (this.field4586 <= 0) {
            this.field4595 = null;
            this.field4583 = null;
        } else {
            this.field4582 = new class9(class426.method2447(this.field4586, 250));
            this.field4583 = this.field4585.method186(false, true);
            this.field4583.method2429(this.field4586, (byte) -59);
            NativeHeapBuffer var11 = this.field4585.method3098(this.field4586 * 16, false, (byte) -94);
            this.field4590 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field4583.method647(false, true);
                } while (var12 == null);
                this.field4581 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field4598; var15 <= this.field4592; var15++) {
                    if (var15 >= 0 && var15 < arg1.field1164) {
                        int var16 = 0;
                        for (int var17 = this.field4597; var17 <= this.field4596; var17++) {
                            if (var17 >= 0 && var17 < arg1.field1166) {
                                int var18 = arg3[var13];
                                int[] var19 = arg1.field3308[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field3297[var17][var15];
                                        int[] var21 = arg1.field3296[var17][var15];
                                        int var22 = 0;
                                        label122: while (true) {
                                            while (true) {
                                                if (var22 >= var19.length) {
                                                    break label122;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method2042(var21[var22], var16, var17, var15, var14, false, var20[var22]);
                                                    var22++;
                                                    this.method2042(var21[var22], var16, var17, var15, var14, false, var20[var22]);
                                                    var22++;
                                                    this.method2042(var21[var22], var16, var17, var15, var14, false, var20[var22]);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method2042(0, var16, var17, var15, var14, false, 0);
                                        this.method2042(0, var16, var17, var15, var14, false, arg1.field1163);
                                        this.method2042(arg1.field1163, var16, var17, var15, var14, false, 0);
                                    } else if (var18 == 2) {
                                        this.method2042(0, var16, var17, var15, var14, false, arg1.field1163);
                                        this.method2042(arg1.field1163, var16, var17, var15, var14, false, arg1.field1163);
                                        this.method2042(0, var16, var17, var15, var14, false, 0);
                                    } else if (var18 == 5) {
                                        this.method2042(arg1.field1163, var16, var17, var15, var14, false, arg1.field1163);
                                        this.method2042(arg1.field1163, var16, var17, var15, var14, false, 0);
                                        this.method2042(0, var16, var17, var15, var14, false, arg1.field1163);
                                    } else if (var18 == 4) {
                                        this.method2042(arg1.field1163, var16, var17, var15, var14, false, 0);
                                        this.method2042(0, var16, var17, var15, var14, false, 0);
                                        this.method2042(arg1.field1163, var16, var17, var15, var14, false, arg1.field1163);
                                    }
                                }
                            }
                            var16++;
                            var13++;
                        }
                    } else {
                        var13 += this.field4596 - this.field4597;
                    }
                    var14++;
                }
                this.field4581.method1955();
                if (this.field4583.method646(-112)) {
                    this.field4590.method1955();
                    this.field4595 = this.field4585.method159(false, false);
                    this.field4595.method643(this.field4584 * 16, 2106, var11, 16);
                    break;
                }
                this.field4590.method1954(0);
                this.field4582.method41(62);
            }
        }
        this.field4581 = null;
        this.field4590 = null;
        this.field4594 = this.field4603 = this.field4602 = null;
        this.field4582 = null;
    }
}
