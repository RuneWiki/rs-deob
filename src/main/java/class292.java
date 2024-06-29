import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.security.InvalidParameterException;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class292 extends class123 {

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "I")
    private int field4574 = -1;

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "I")
    private int field4578 = 0;

    @OriginalMember(owner = "client!uh", name = "G", descriptor = "Z")
    public boolean field4585 = false;

    @OriginalMember(owner = "client!uh", name = "D", descriptor = "Lbe;")
    public class314 field4582;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "Z")
    private boolean field4573;

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "Z")
    private boolean field4589;

    @OriginalMember(owner = "client!uh", name = "I", descriptor = "Z")
    private boolean field4587;

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "Z")
    private boolean field4580;

    @OriginalMember(owner = "client!uh", name = "L", descriptor = "I")
    private int field4590;

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "I")
    private int field4581;

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "Z")
    private boolean field4575;

    @OriginalMember(owner = "client!uh", name = "E", descriptor = "I")
    private int field4583;

    @OriginalMember(owner = "client!uh", name = "F", descriptor = "I")
    private int field4584;

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "F")
    private float field4588;

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "I")
    private int field4576;

    @OriginalMember(owner = "client!uh", name = "H", descriptor = "I")
    private int field4586;

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "[I")
    private int[] field4577;

    @OriginalMember(owner = "client!uh", name = "A", descriptor = "[I")
    public static int[] field4579;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lln;Lpk;I)Z", line = 13)
    public final boolean method2047(class27 arg0, class120 arg1, int arg2) {
        if (!this.field4582.method2212(arg1, 4, arg0)) {
            return false;
        }
        GL var4 = class162.field2654;
        int var5 = class53.method442(false);
        if ((var5 & 0x1) == 0) {
            if (this.field4574 != -1 && this.field4576 == arg2) {
                class162.method1219(this.field4574);
            } else {
                if (this.field4574 == -1) {
                    int[] var6 = new int[1];
                    var4.glGenTextures(1, var6, 0);
                    this.field4574 = var6[0];
                    this.field4586 = class177.field2819;
                }
                class162.method1219(this.field4574);
                if (this.field4575 && class54.method459()) {
                    float[] var7 = this.field4582.method2224(arg0, arg2, -11458, this.field4589, arg2, arg1);
                    if (this.field4583 == 2) {
                        method2048(class287.field4489, class287.field4495, arg2, arg2, class287.field4492, class287.field4502, var7);
                        var4.glTexParameteri(3553, 10241, 9987);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class177.field2820 += var7.length * 4 / 3 - this.field4578;
                        this.field4578 = var7.length * 4 / 3;
                    } else {
                        var4.glTexImage2D(3553, 0, 34842, arg2, arg2, 0, 6408, 5126, FloatBuffer.wrap(var7));
                        var4.glTexParameteri(3553, 10241, 9729);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class177.field2820 += var7.length - this.field4578;
                        this.field4578 = var7.length;
                    }
                } else {
                    int var8 = class162.field2624 ? 33639 : 5121;
                    int[] var9 = this.field4582.method2211(0.7D, arg2, this.field4589, arg2, 7225, arg0, arg1);
                    if (this.field4583 == 2) {
                        method2052(class287.field4489, class287.field4492, arg2, arg2, class287.field4493, var8, var9);
                        var4.glTexParameteri(3553, 10241, 9987);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class177.field2820 += var9.length * 4 / 3 - this.field4578;
                        this.field4578 = var9.length * 4 / 3;
                    } else if (this.field4583 == 1) {
                        int var10 = 0;
                        while (true) {
                            var4.glTexImage2D(3553, var10++, 6408, arg2, arg2, 0, 32993, var8, IntBuffer.wrap(var9));
                            arg2 >>= 0x1;
                            if (arg2 == 0) {
                                var4.glTexParameteri(3553, 10241, 9987);
                                var4.glTexParameteri(3553, 10240, 9729);
                                class177.field2820 += var9.length * 4 / 3 - this.field4578;
                                this.field4578 = var9.length * 4 / 3;
                                break;
                            }
                            var9 = this.field4582.method2211(0.7D, arg2, this.field4589, arg2, 7225, arg0, arg1);
                        }
                    } else {
                        var4.glTexImage2D(3553, 0, 6408, arg2, arg2, 0, 32993, var8, IntBuffer.wrap(var9));
                        var4.glTexParameteri(3553, 10241, 9729);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class177.field2820 += var9.length - this.field4578;
                        this.field4578 = var9.length;
                    }
                }
                var4.glTexParameteri(3553, 10242, this.field4587 ? 10497 : 33071);
                var4.glTexParameteri(3553, 10243, this.field4580 ? 10497 : 33071);
                this.field4576 = arg2;
            }
        }
        if ((var5 & 0x2) == 0) {
            class162.method1206(this.field4584);
        }
        if ((var5 & 0x4) == 0) {
            class162.method1211(0);
        }
        if ((var5 & 0x8) == 0) {
            if (this.field4581 == 0 && this.field4590 == 0) {
                class162.method1214();
            } else {
                float var11 = (float) (class162.field2656 * this.field4581) / (float) this.field4576;
                float var12 = (float) (class162.field2656 * this.field4590) / (float) this.field4576;
                class162.method1202(var12, var11, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIII[F)V", line = 137)
    private static final void method2048(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6) {
        if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !class140.method1075((byte) -110, arg2)) {
            throw new InvalidParameterException("width must be power of 2");
        } else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !class140.method1075((byte) -124, arg3)) {
            throw new InvalidParameterException("height must be power of 2");
        } else {
            byte var7;
            if (arg4 == 6406) {
                var7 = 1;
            } else if (arg4 == 6409) {
                var7 = 1;
            } else if (arg4 == 32841) {
                var7 = 1;
            } else if (arg4 == 6410) {
                var7 = 2;
            } else if (arg4 == 6407) {
                var7 = 3;
            } else if (arg4 == 6408) {
                var7 = 4;
            } else {
                throw new InvalidParameterException("Invalid external format");
            }
            GL var8 = class162.field2654;
            int var9 = 0;
            int var10 = arg2 < arg3 ? arg2 : arg3;
            int var11 = arg2 >> 1;
            int var12 = arg3 >> 1;
            float[] var13 = arg6;
            float[] var14 = new float[var11 * var12 * var7];
            while (true) {
                var8.glTexImage2D(arg0, var9, arg1, arg2, arg3, 0, arg4, 5126, FloatBuffer.wrap(var13));
                if (var10 <= 1) {
                    return;
                }
                int var15 = arg2 * var7;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var15 + var16;
                    for (int var20 = 0; var20 < var12; var20++) {
                        for (int var21 = 0; var21 < var11; var21++) {
                            float var22 = var13[var18];
                            int var23 = var7 + var18;
                            float var24 = var13[var23] + var22;
                            var18 = var7 + var23;
                            float var25 = var13[var19] + var24;
                            int var26 = var7 + var19;
                            float var27 = var13[var26] + var25;
                            var19 = var7 + var26;
                            var14[var17] = var27 * 0.25F;
                            var17 += var7;
                        }
                        var18 += var15;
                        var19 += var15;
                    }
                }
                float[] var28 = var14;
                var14 = var13;
                var13 = var28;
                arg2 = var11;
                arg3 = var12;
                var11 >>= 0x1;
                var12 >>= 0x1;
                var10 >>= 0x1;
                var9++;
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "finalize", descriptor = "()V", line = 253)
    protected final void finalize() throws Throwable {
        if (this.field4574 != -1) {
            class177.method1308(this.field4574, this.field4578, this.field4586);
            this.field4574 = -1;
            this.field4578 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lln;Lpk;FZ)[I", line = 263)
    public final int[] method2049(class27 arg0, class120 arg1, float arg2, boolean arg3) {
        if (this.field4577 == null || this.field4588 != arg2) {
            if (!this.field4582.method2212(arg1, 4, arg0)) {
                return null;
            }
            this.field4576 = arg3 ? 64 : 128;
            this.field4577 = this.field4582.method2213((double) arg2, this.field4576, arg1, (byte) -108, this.field4576, arg0, true, this.field4589);
            this.field4588 = arg2;
            if (this.field4573) {
                int[] var5 = new int[this.field4576];
                int[] var6 = new int[this.field4576];
                int[] var7 = new int[this.field4576];
                int[] var8 = new int[this.field4576 * this.field4576];
                int var9 = this.field4576;
                int var10 = this.field4576;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14;
                int var15 = var14 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var17 = var11; var17 >= 0; var17--) {
                        var14--;
                        int var18 = this.field4577[var14];
                        var5[var17] += var18 >> 16 & 0xFF;
                        var6[var17] += var18 >> 8 & 0xFF;
                        var7[var17] += var18 & 0xFF;
                    }
                    if (var14 == 0) {
                        var14 = var13;
                    }
                }
                int var19 = var13;
                for (int var20 = var12; var20 >= 0; var20--) {
                    int var21 = 1;
                    int var22 = 1;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var22--;
                        var25 += var5[var22];
                        var23 += var6[var22];
                        var24 += var7[var22];
                        if (var22 == 0) {
                            var22 = var9;
                        }
                    }
                    for (int var27 = var11; var27 >= 0; var27--) {
                        var22--;
                        var21--;
                        int var28 = var25 / 9;
                        int var29 = var23 / 9;
                        int var30 = var24 / 9;
                        var19--;
                        var8[var19] = var28 << 16 | var29 << 8 | var30;
                        var25 += var5[var22] - var5[var21];
                        var24 += var7[var22] - var7[var21];
                        var23 += var6[var22] - var6[var21];
                        if (var22 == 0) {
                            var22 = var9;
                        }
                        if (var21 == 0) {
                            var21 = var9;
                        }
                    }
                    for (int var31 = var11; var31 >= 0; var31--) {
                        var14--;
                        int var32 = this.field4577[var14];
                        var15--;
                        int var33 = this.field4577[var15];
                        var5[var31] += (var32 >> 16 & 0xFF) - (var33 >> 16 & 0xFF);
                        var6[var31] += (var32 >> 8 & 0xFF) - (var33 >> 8 & 0xFF);
                        var7[var31] += (var32 & 0xFF) - (var33 & 0xFF);
                    }
                    if (var14 == 0) {
                        var14 = var13;
                    }
                    if (var15 == 0) {
                        var15 = var13;
                    }
                }
                this.field4577 = var8;
            }
        }
        return this.field4577;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "()V", line = 414)
    public static void method2050() {
        field4579 = null;
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)V", line = 417)
    public final void method2051(int arg0) {
        if (this.field4577 == null || this.field4581 == 0 && this.field4590 == 0) {
            return;
        }
        if (field4579 == null || field4579.length < this.field4577.length) {
            field4579 = new int[this.field4577.length];
        }
        int var2 = this.field4577.length;
        int var3 = this.field4590 * arg0;
        int var4 = this.field4576 - 1;
        int var5 = this.field4576 * arg0 * this.field4581;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field4576) {
            int var8 = var5 + var7 & var6;
            for (int var9 = 0; var9 < this.field4576; var9++) {
                int var10 = var7 + var9;
                int var11 = (var3 + var9 & var4) + var8;
                field4579[var10] = this.field4577[var11];
            }
        }
        int[] var12 = this.field4577;
        this.field4577 = field4579;
        field4579 = var12;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIII[I)V", line = 470)
    private static final void method2052(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !class140.method1075((byte) -119, arg2)) {
            throw new InvalidParameterException("width must be power of 2");
        } else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !class140.method1075((byte) -127, arg3)) {
            throw new InvalidParameterException("height must be power of 2");
        } else if (arg4 == 32993 || arg4 == 6408) {
            GL var7 = class162.field2654;
            int var8 = 0;
            int var9 = arg2 < arg3 ? arg2 : arg3;
            int var10 = arg2 >> 1;
            int var11 = arg3 >> 1;
            int[] var12 = arg6;
            int[] var13 = new int[var10 * var11];
            while (true) {
                var7.glTexImage2D(arg0, var8, arg1, arg2, arg3, 0, arg4, arg5, IntBuffer.wrap(var12));
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = arg2 + var15;
                for (int var17 = 0; var17 < var11; var17++) {
                    for (int var18 = 0; var18 < var10; var18++) {
                        int var19 = var12[var15++];
                        int var20 = var12[var15++];
                        int var21 = var12[var16++];
                        int var22 = var12[var16++];
                        int var23 = var19 >> 24 & 0xFF;
                        int var24 = var19 >> 16 & 0xFF;
                        int var25 = var19 >> 8 & 0xFF;
                        int var26 = var19 & 0xFF;
                        int var27 = (var20 >> 24 & 0xFF) + var23;
                        int var28 = (var20 >> 16 & 0xFF) + var24;
                        int var29 = (var20 >> 8 & 0xFF) + var25;
                        int var30 = (var20 & 0xFF) + var26;
                        int var31 = (var21 >> 24 & 0xFF) + var27;
                        int var32 = (var21 >> 16 & 0xFF) + var28;
                        int var33 = (var21 >> 8 & 0xFF) + var29;
                        int var34 = (var21 & 0xFF) + var30;
                        int var35 = (var22 >> 24 & 0xFF) + var31;
                        int var36 = (var22 >> 16 & 0xFF) + var32;
                        int var37 = (var22 >> 8 & 0xFF) + var33;
                        int var38 = (var22 & 0xFF) + var34;
                        var13[var14++] = (var35 & 0x3FC) << 22 | (var36 & 0x3FC) << 14 | (var37 & 0x3FC) << 6 | (var38 & 0x3FC) >> 2;
                    }
                    var15 += arg2;
                    var16 += arg2;
                }
                int[] var39 = var13;
                var13 = var12;
                var12 = var39;
                arg2 = var10;
                arg3 = var11;
                var10 >>= 0x1;
                var11 >>= 0x1;
                var9 >>= 0x1;
                var8++;
            }
        } else {
            throw new InvalidParameterException("Invalid external format");
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Laj;)V", line = 598)
    public class292(class1 arg0) {
        this.field4582 = new class314(arg0);
        this.field4573 = arg0.method15((byte) -47) == 1;
        this.field4589 = arg0.method15((byte) 107) == 1;
        this.field4587 = arg0.method15((byte) -47) == 1;
        this.field4580 = arg0.method15((byte) 78) == 1;
        int var2 = arg0.method15((byte) 65) & 0x3;
        this.field4590 = arg0.method55(4);
        this.field4581 = arg0.method55(4);
        int var3 = arg0.method15((byte) 103);
        arg0.method15((byte) 85);
        this.field4575 = arg0.method15((byte) -98) == 1;
        this.field4583 = var3 >> 4 & 0xF;
        if (var2 == 1) {
            this.field4584 = 2;
        } else if (var2 == 2) {
            this.field4584 = 3;
        } else if (var2 == 3) {
            this.field4584 = 4;
        } else {
            this.field4584 = 0;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lln;Lpk;Z)[I", line = 577)
    public final int[] method2053(class27 arg0, class120 arg1, boolean arg2) {
        if (this.field4582.method2212(arg1, 4, arg0)) {
            int var4 = arg2 ? 64 : 128;
            return this.field4582.method2213(1.0D, var4, arg1, (byte) -124, var4, arg0, false, this.field4589);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lln;Lpk;)Z", line = 585)
    public final boolean method2054(class27 arg0, class120 arg1) {
        return this.field4582.method2212(arg1, 4, arg0);
    }
}
