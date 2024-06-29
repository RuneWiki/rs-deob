import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.security.InvalidParameterException;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class24 extends class320 {

    @OriginalMember(owner = "client!li", name = "G", descriptor = "I")
    private int field370 = 0;

    @OriginalMember(owner = "client!li", name = "L", descriptor = "I")
    private int field375 = -1;

    @OriginalMember(owner = "client!li", name = "P", descriptor = "Z")
    public boolean field378 = false;

    @OriginalMember(owner = "client!li", name = "J", descriptor = "Ln;")
    public class326 field373;

    @OriginalMember(owner = "client!li", name = "D", descriptor = "Z")
    private boolean field368;

    @OriginalMember(owner = "client!li", name = "T", descriptor = "Z")
    private boolean field382;

    @OriginalMember(owner = "client!li", name = "H", descriptor = "Z")
    private boolean field371;

    @OriginalMember(owner = "client!li", name = "S", descriptor = "Z")
    private boolean field381;

    @OriginalMember(owner = "client!li", name = "Q", descriptor = "I")
    private int field379;

    @OriginalMember(owner = "client!li", name = "R", descriptor = "I")
    private int field380;

    @OriginalMember(owner = "client!li", name = "M", descriptor = "Z")
    private boolean field376;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client!li", name = "K", descriptor = "I")
    private int field374;

    @OriginalMember(owner = "client!li", name = "N", descriptor = "F")
    private float field377;

    @OriginalMember(owner = "client!li", name = "B", descriptor = "I")
    private int field366;

    @OriginalMember(owner = "client!li", name = "C", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client!li", name = "A", descriptor = "[I")
    public static int[] field365;

    @OriginalMember(owner = "client!li", name = "I", descriptor = "[I")
    private int[] field372;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lbe;Lrn;I)Z", line = 7)
    public final boolean method243(class267 arg0, class18 arg1, int arg2) {
        if (!this.field373.method2315(arg0, -4624, arg1)) {
            return false;
        }
        GL var4 = class240.field3771;
        int var5 = class110.method955(-1);
        if ((var5 & 0x1) == 0) {
            if (this.field375 != -1 && this.field366 == arg2) {
                class240.method1786(this.field375);
            } else {
                if (this.field375 == -1) {
                    int[] var6 = new int[1];
                    var4.glGenTextures(1, var6, 0);
                    this.field375 = var6[0];
                    this.field367 = class28.field455;
                }
                class240.method1786(this.field375);
                if (this.field376 && class357.method2506()) {
                    float[] var7 = this.field373.method2311(arg0, arg2, 117, this.field382, arg2, arg1);
                    if (this.field369 == 2) {
                        method245(class183.field2869, class183.field2875, arg2, arg2, class183.field2872, class183.field2882, var7);
                        var4.glTexParameteri(3553, 10241, 9987);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class28.field459 += var7.length * 4 / 3 - this.field370;
                        this.field370 = var7.length * 4 / 3;
                    } else {
                        var4.glTexImage2D(3553, 0, 34842, arg2, arg2, 0, 6408, 5126, FloatBuffer.wrap(var7));
                        var4.glTexParameteri(3553, 10241, 9729);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class28.field459 += var7.length - this.field370;
                        this.field370 = var7.length;
                    }
                } else {
                    int var8 = class240.field3757 ? 33639 : 5121;
                    int[] var9 = this.field373.method2314(arg2, arg1, 0.7D, arg0, this.field382, (byte) 113, arg2);
                    if (this.field369 == 2) {
                        method248(class183.field2869, class183.field2872, arg2, arg2, class183.field2873, var8, var9);
                        var4.glTexParameteri(3553, 10241, 9987);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class28.field459 += var9.length * 4 / 3 - this.field370;
                        this.field370 = var9.length * 4 / 3;
                    } else if (this.field369 == 1) {
                        int var10 = 0;
                        while (true) {
                            var4.glTexImage2D(3553, var10++, 6408, arg2, arg2, 0, 32993, var8, IntBuffer.wrap(var9));
                            arg2 >>= 0x1;
                            if (arg2 == 0) {
                                var4.glTexParameteri(3553, 10241, 9987);
                                var4.glTexParameteri(3553, 10240, 9729);
                                class28.field459 += var9.length * 4 / 3 - this.field370;
                                this.field370 = var9.length * 4 / 3;
                                break;
                            }
                            var9 = this.field373.method2314(arg2, arg1, 0.7D, arg0, this.field382, (byte) 124, arg2);
                        }
                    } else {
                        var4.glTexImage2D(3553, 0, 6408, arg2, arg2, 0, 32993, var8, IntBuffer.wrap(var9));
                        var4.glTexParameteri(3553, 10241, 9729);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class28.field459 += var9.length - this.field370;
                        this.field370 = var9.length;
                    }
                }
                var4.glTexParameteri(3553, 10242, this.field371 ? 10497 : 33071);
                var4.glTexParameteri(3553, 10243, this.field381 ? 10497 : 33071);
                this.field366 = arg2;
            }
        }
        if ((var5 & 0x2) == 0) {
            class240.method1814(this.field374);
        }
        if ((var5 & 0x4) == 0) {
            class240.method1806(0);
        }
        if ((var5 & 0x8) == 0) {
            if (this.field380 == 0 && this.field379 == 0) {
                class240.method1805();
            } else {
                float var11 = (float) (class240.field3748 * this.field380) / (float) this.field366;
                float var12 = (float) (class240.field3748 * this.field379) / (float) this.field366;
                class240.method1811(var12, var11, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lbe;Lrn;)Z", line = 133)
    public final boolean method244(class267 arg0, class18 arg1) {
        return this.field373.method2315(arg0, -4624, arg1);
    }

    @OriginalMember(owner = "client!li", name = "finalize", descriptor = "()V", line = 144)
    protected final void finalize() throws Throwable {
        if (this.field375 != -1) {
            class28.method324(this.field375, this.field370, this.field367);
            this.field375 = -1;
            this.field370 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIII[F)V", line = 158)
    private static final void method245(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6) {
        if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !class199.method1499(arg2, (byte) 63)) {
            throw new InvalidParameterException("width must be power of 2");
        } else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !class199.method1499(arg3, (byte) -96)) {
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
            GL var8 = class240.field3771;
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

    @OriginalMember(owner = "client!li", name = "a", descriptor = "()V", line = 272)
    public static void method246() {
        field365 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lbe;Lrn;Z)[I", line = 277)
    public final int[] method247(class267 arg0, class18 arg1, boolean arg2) {
        if (this.field373.method2315(arg0, -4624, arg1)) {
            int var4 = arg2 ? 64 : 128;
            return this.field373.method2313(-114, arg0, arg1, false, var4, 1.0D, this.field382, var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIII[I)V", line = 285)
    private static final void method248(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !class199.method1499(arg2, (byte) -120)) {
            throw new InvalidParameterException("width must be power of 2");
        } else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !class199.method1499(arg3, (byte) 83)) {
            throw new InvalidParameterException("height must be power of 2");
        } else if (arg4 == 32993 || arg4 == 6408) {
            GL var7 = class240.field3771;
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

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lug;)V", line = 598)
    public class24(class25 arg0) {
        this.field373 = new class326(arg0);
        this.field368 = arg0.method281(-127) == 1;
        this.field382 = arg0.method281(84) == 1;
        this.field371 = arg0.method281(-124) == 1;
        this.field381 = arg0.method281(-128) == 1;
        int var2 = arg0.method281(76) & 0x3;
        this.field379 = arg0.method286((byte) 102);
        this.field380 = arg0.method286((byte) 89);
        int var3 = arg0.method281(-124);
        arg0.method281(-127);
        this.field376 = arg0.method281(-124) == 1;
        this.field369 = var3 >> 4 & 0xF;
        if (var2 == 1) {
            this.field374 = 2;
        } else if (var2 == 2) {
            this.field374 = 3;
        } else if (var2 == 3) {
            this.field374 = 4;
        } else {
            this.field374 = 0;
        }
    }

    @OriginalMember(owner = "client!li", name = "f", descriptor = "(I)V", line = 388)
    public final void method249(int arg0) {
        if (this.field372 == null || this.field380 == 0 && this.field379 == 0) {
            return;
        }
        if (field365 == null || field365.length < this.field372.length) {
            field365 = new int[this.field372.length];
        }
        int var2 = this.field372.length;
        int var3 = this.field379 * arg0;
        int var4 = this.field366 - 1;
        int var5 = this.field366 * arg0 * this.field380;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field366) {
            int var8 = var5 + var7 & var6;
            for (int var9 = 0; var9 < this.field366; var9++) {
                int var10 = var7 + var9;
                int var11 = (var3 + var9 & var4) + var8;
                field365[var10] = this.field372[var11];
            }
        }
        int[] var12 = this.field372;
        this.field372 = field365;
        field365 = var12;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lbe;Lrn;FZ)[I", line = 438)
    public final int[] method250(class267 arg0, class18 arg1, float arg2, boolean arg3) {
        if (this.field372 == null || this.field377 != arg2) {
            if (!this.field373.method2315(arg0, -4624, arg1)) {
                return null;
            }
            this.field366 = arg3 ? 64 : 128;
            this.field372 = this.field373.method2313(-116, arg0, arg1, true, this.field366, (double) arg2, this.field382, this.field366);
            this.field377 = arg2;
            if (this.field368) {
                int[] var5 = new int[this.field366];
                int[] var6 = new int[this.field366];
                int[] var7 = new int[this.field366];
                int[] var8 = new int[this.field366 * this.field366];
                int var9 = this.field366;
                int var10 = this.field366;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14;
                int var15 = var14 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var17 = var11; var17 >= 0; var17--) {
                        var14--;
                        int var18 = this.field372[var14];
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
                        int var32 = this.field372[var14];
                        var15--;
                        int var33 = this.field372[var15];
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
                this.field372 = var8;
            }
        }
        return this.field372;
    }
}
