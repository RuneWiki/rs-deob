import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class572 extends class154 {

    @OriginalMember(owner = "client!kga", name = "C", descriptor = "Lek;")
    private class535 field8156;

    @OriginalMember(owner = "client!kga", name = "o", descriptor = "Lbq;")
    private class307 field8142;

    @OriginalMember(owner = "client!kga", name = "x", descriptor = "Lsf;")
    private class551 field8151;

    @OriginalMember(owner = "client!kga", name = "n", descriptor = "I")
    private int field8141;

    @OriginalMember(owner = "client!kga", name = "u", descriptor = "I")
    private int field8148;

    @OriginalMember(owner = "client!kga", name = "m", descriptor = "I")
    private int field8140;

    @OriginalMember(owner = "client!kga", name = "y", descriptor = "I")
    private int field8152;

    @OriginalMember(owner = "client!kga", name = "p", descriptor = "[[F")
    private float[][] field8143;

    @OriginalMember(owner = "client!kga", name = "z", descriptor = "[[F")
    private float[][] field8153;

    @OriginalMember(owner = "client!kga", name = "B", descriptor = "[[F")
    private float[][] field8155;

    @OriginalMember(owner = "client!kga", name = "D", descriptor = "I")
    private int field8157;

    @OriginalMember(owner = "client!kga", name = "k", descriptor = "Lcja;")
    private class46 field8138;

    @OriginalMember(owner = "client!kga", name = "i", descriptor = "Lta;")
    private class226 field8136;

    @OriginalMember(owner = "client!kga", name = "q", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8144;

    @OriginalMember(owner = "client!kga", name = "j", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8137;

    @OriginalMember(owner = "client!kga", name = "A", descriptor = "Lmha;")
    private class438 field8154;

    @OriginalMember(owner = "client!kga", name = "l", descriptor = "I")
    private int field8139;

    @OriginalMember(owner = "client!kga", name = "r", descriptor = "I")
    public static int field8145;

    @OriginalMember(owner = "client!kga", name = "s", descriptor = "I")
    public static int field8146;

    @OriginalMember(owner = "client!kga", name = "t", descriptor = "I")
    public static int field8147;

    @OriginalMember(owner = "client!kga", name = "v", descriptor = "I")
    public static int field8149;

    @OriginalMember(owner = "client!kga", name = "w", descriptor = "I")
    public static int field8150;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(SI)V", line = 12)
    private final void method3312(short arg0, int arg1) {
        field8147++;
        if (arg1 != -23081) {
            this.field8157 = 9;
        }
        if (Stream.method3910()) {
            this.field8137.method3912(arg0);
        } else {
            this.field8137.method3903(arg0);
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(III)Llg;", line = 34)
    public static final class436 method3313(int arg0, int arg1, int arg2) {
        class549 var3 = class325.field4448[arg0][arg1][arg2];
        return var3 == null || var3.field7471 == null ? null : var3.field7471;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "([[ZBIII)V", line = 41)
    public final void method3314(boolean[][] arg0, byte arg1, int arg2, int arg3, int arg4) {
        field8146++;
        if (this.field8136 == null || this.field8141 > arg3 + arg4 || this.field8148 < arg3 - arg4 || arg2 + arg4 < this.field8140 || arg2 - arg4 > this.field8152) {
            return;
        }
        int var6 = this.field8140;
        int var7 = 43 % ((13 - arg1) / 62);
        while (this.field8152 >= var6) {
            for (int var8 = this.field8141; var8 <= this.field8148; var8++) {
                int var9 = var8 - arg3;
                int var10 = var6 - arg2;
                if (var9 > (-arg4) && var9 < arg4 && -arg4 < var10 && arg4 > var10 && arg0[var9 + arg4][arg4 + var10]) {
                    this.field8151.method3167(-7232, (byte) ((int) (this.field8142.method1966((byte) -58) * 255.0F)));
                    this.field8151.method863(0, (byte) 70, this.field8154);
                    this.field8151.method846((byte) -117, this.field8151.field7777);
                    this.field8151.method830(this.field8139, this.field8136, class501.field6860, (byte) -125, this.field8157 / 3, 0, 0);
                    return;
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IBIIIII)V", line = 97)
    private final void method3315(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8150++;
        long var8 = -1L;
        int var10 = (arg6 << this.field8156.field4036) + arg5;
        int var11 = (arg0 << this.field8156.field4036) + arg2;
        int var12 = this.field8156.method1907(var10, (byte) 114, var11);
        if ((arg5 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var8 = (long) var11 << 16 & 0xFFFFL << 16 | (long) var10 & 0xFFFFL;
            class154 var13 = this.field8138.method337(var8, 1);
            if (var13 != null) {
                this.method3312(((class33) var13).field560, -23081);
                return;
            }
        }
        short var14 = (short) (this.field8139++);
        if (var8 != -1L) {
            this.field8138.method341(var8, new class33(var14), (byte) 72);
        }
        float var15;
        float var16;
        float var17;
        if (arg5 == 0 && arg2 == 0) {
            var15 = this.field8155[arg3][arg4];
            var16 = this.field8153[arg3][arg4];
            var17 = this.field8143[arg3][arg4];
        } else if (this.field8156.field4035 == arg5 && arg2 == 0) {
            var17 = this.field8143[arg3 + 1][arg4];
            var15 = this.field8155[arg3 + 1][arg4];
            var16 = this.field8153[arg3 + 1][arg4];
        } else if (this.field8156.field4035 == arg5 && this.field8156.field4035 == arg2) {
            var17 = this.field8143[arg3 + 1][arg4 + 1];
            var15 = this.field8155[arg3 + 1][arg4 + 1];
            var16 = this.field8153[arg3 + 1][arg4 + 1];
        } else if (arg5 == 0 && this.field8156.field4035 == arg2) {
            var15 = this.field8155[arg3][arg4 + 1];
            var17 = this.field8143[arg3][arg4 + 1];
            var16 = this.field8153[arg3][arg4 + 1];
        } else {
            float var18 = (float) arg5 / (float) this.field8156.field4035;
            float var19 = (float) arg2 / (float) this.field8156.field4035;
            float var20 = this.field8153[arg3][arg4];
            float var21 = this.field8143[arg3][arg4];
            float var22 = this.field8155[arg3][arg4];
            float var23 = this.field8153[arg3 + 1][arg4];
            float var24 = this.field8143[arg3 + 1][arg4];
            float var25 = (this.field8153[arg3 + 1][arg4 + 1] - var23) * var18 + var23;
            float var26 = (this.field8155[arg3][arg4 + 1] - var22) * var18 + var22;
            float var27 = this.field8155[arg3 + 1][arg4];
            float var28 = (this.field8143[arg3 + 1][arg4 + 1] - var24) * var18 + var24;
            float var29 = (this.field8143[arg3][arg4 + 1] - var21) * var18 + var21;
            float var30 = (this.field8153[arg3][arg4 + 1] - var20) * var18 + var20;
            float var31 = (this.field8155[arg3 + 1][arg4 + 1] - var27) * var18 + var27;
            var16 = (var25 - var30) * var19 + var30;
            var17 = (var28 - var29) * var19 + var29;
            var15 = (var31 - var26) * var19 + var26;
        }
        float var32 = (float) (this.field8142.method1962(0) - var10);
        float var33 = (float) (this.field8142.method1961(-128) - var12);
        float var34 = (float) (this.field8142.method1958(true) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var32 * var36;
        float var39 = var33 * var36;
        if (arg1 < 102) {
            return;
        }
        float var40 = var35 / (float) this.field8142.method1963((byte) -62);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var37 + var16 * var38 + var17 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field8142.method1965(0);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFFF2) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (Stream.method3910()) {
            this.field8144.method3914((float) var10);
            this.field8144.method3914((float) var12);
            this.field8144.method3914((float) var11);
        } else {
            this.field8144.method3909((float) var10);
            this.field8144.method3909((float) var12);
            this.field8144.method3909((float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field8151.field7694 == 0) {
            this.field8144.method3908(var47);
            this.field8144.method3908(var46);
            this.field8144.method3908(var45);
        } else {
            this.field8144.method3908(var45);
            this.field8144.method3908(var46);
            this.field8144.method3908(var47);
        }
        this.field8144.method3908(255);
        this.method3312(var14, -23081);
    }

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Lsf;Lek;Lbq;[I)V", line = 284)
    public class572(class551 arg0, class535 arg1, class307 arg2, int[] arg3) {
        this.field8156 = arg1;
        this.field8142 = arg2;
        this.field8151 = arg0;
        int var5 = this.field8142.method1963((byte) -73) - (arg1.field4035 >> 1);
        this.field8141 = this.field8142.method1962(0) - var5 >> arg1.field4036;
        this.field8148 = var5 + this.field8142.method1962(0) >> arg1.field4036;
        this.field8140 = this.field8142.method1958(true) - var5 >> arg1.field4036;
        this.field8152 = this.field8142.method1958(true) + var5 >> arg1.field4036;
        int var6 = this.field8148 + 1 - this.field8141;
        int var7 = this.field8152 + 1 - this.field8140;
        this.field8143 = new float[var6 + 1][var7 + 1];
        this.field8153 = new float[var6 + 1][var7 + 1];
        this.field8155 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field8140 + var8;
            if (var27 > 0 && var27 < (this.field8156.field4034 - 1)) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field8141 + var28;
                    if (var29 > 0 && var29 < this.field8156.field4037 - 1) {
                        int var30 = arg1.method1897((byte) -34, var27, var29 + 1) - arg1.method1897((byte) -34, var27, var29 - 1);
                        int var31 = arg1.method1897((byte) -34, var27 + 1, var29) - arg1.method1897((byte) -34, var27 - 1, var29);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var30 * var30 + (var31 * var31) + 65536)));
                        this.field8153[var28][var8] = (float) var30 * var32;
                        this.field8143[var28][var8] = var32 * -256.0F;
                        this.field8155[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field8140; var10 <= this.field8152; var10++) {
            if (var10 >= 0 && arg1.field4034 > var10) {
                for (int var23 = this.field8141; var23 <= this.field8148; var23++) {
                    if (var23 >= 0 && var23 < arg1.field4037) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field7266[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var26 < var25.length) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field8157 += 3;
                                    }
                                }
                            } else {
                                this.field8157 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field8148 - this.field8141;
            }
        }
        if (this.field8157 > 0) {
            this.field8138 = new class46(class241.method1609((byte) -118, this.field8157));
            this.field8136 = this.field8151.method812(false, 101);
            this.field8136.method1546(this.field8157, -13659);
            NativeHeapBuffer var11 = this.field8151.method3161(true, this.field8157 * 16, false);
            this.field8144 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field8136.method1545(true, -4450);
                } while (var12 == null);
                this.field8137 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field8140; var15 <= this.field8152; var15++) {
                    if (var15 >= 0 && arg1.field4034 > var15) {
                        int var16 = 0;
                        for (int var17 = this.field8141; var17 <= this.field8148; var17++) {
                            if (var17 >= 0 && var17 < arg1.field4037) {
                                int var18 = arg3[var14];
                                int[] var19 = arg1.field7266[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field7273[var17][var15];
                                        int[] var21 = arg1.field7268[var17][var15];
                                        int var22 = 0;
                                        label122: while (true) {
                                            while (true) {
                                                if (var19.length <= var22) {
                                                    break label122;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method3315(var15, (byte) 122, var21[var22], var16, var13, var20[var22], var17);
                                                    var22++;
                                                    this.method3315(var15, (byte) 111, var21[var22], var16, var13, var20[var22], var17);
                                                    var22++;
                                                    this.method3315(var15, (byte) 105, var21[var22], var16, var13, var20[var22], var17);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method3315(var15, (byte) 105, 0, var16, var13, 0, var17);
                                        this.method3315(var15, (byte) 114, 0, var16, var13, arg1.field4035, var17);
                                        this.method3315(var15, (byte) 120, arg1.field4035, var16, var13, 0, var17);
                                    } else if (var18 == 2) {
                                        this.method3315(var15, (byte) 116, 0, var16, var13, arg1.field4035, var17);
                                        this.method3315(var15, (byte) 118, arg1.field4035, var16, var13, arg1.field4035, var17);
                                        this.method3315(var15, (byte) 118, 0, var16, var13, 0, var17);
                                    } else if (var18 == 5) {
                                        this.method3315(var15, (byte) 124, arg1.field4035, var16, var13, arg1.field4035, var17);
                                        this.method3315(var15, (byte) 117, arg1.field4035, var16, var13, 0, var17);
                                        this.method3315(var15, (byte) 106, 0, var16, var13, arg1.field4035, var17);
                                    } else if (var18 == 4) {
                                        this.method3315(var15, (byte) 127, arg1.field4035, var16, var13, 0, var17);
                                        this.method3315(var15, (byte) 122, 0, var16, var13, 0, var17);
                                        this.method3315(var15, (byte) 108, arg1.field4035, var16, var13, arg1.field4035, var17);
                                    }
                                }
                            }
                            var16++;
                            var14++;
                        }
                    } else {
                        var14 += this.field8148 - this.field8141;
                    }
                    var13++;
                }
                this.field8137.method3901();
                if (this.field8136.method1544(85)) {
                    this.field8144.method3901();
                    this.field8154 = this.field8151.method818(0, false);
                    this.field8154.method1738(21990, var11, 16, this.field8139 * 16);
                    break;
                }
                this.field8144.method3904(0);
                this.field8138.method338((byte) -100);
            }
        } else {
            this.field8154 = null;
            this.field8136 = null;
        }
        this.field8137 = null;
        this.field8153 = this.field8143 = this.field8155 = null;
        this.field8138 = null;
        this.field8144 = null;
    }
}
