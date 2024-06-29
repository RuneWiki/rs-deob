import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.security.InvalidParameterException;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class344 extends class325 {

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "Z")
    public boolean field5336 = false;

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "I")
    private int field5335 = 0;

    @OriginalMember(owner = "client!nh", name = "W", descriptor = "I")
    private int field5343 = -1;

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "Lfb;")
    public class308 field5327;

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "Z")
    private boolean field5333;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "Z")
    private boolean field5328;

    @OriginalMember(owner = "client!nh", name = "T", descriptor = "Z")
    private boolean field5340;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "Z")
    private boolean field5331;

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "I")
    private int field5337;

    @OriginalMember(owner = "client!nh", name = "V", descriptor = "I")
    private int field5342;

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "Z")
    private boolean field5338;

    @OriginalMember(owner = "client!nh", name = "U", descriptor = "I")
    private int field5341;

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
    private int field5326;

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "F")
    private float field5334;

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "I")
    private int field5330;

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "I")
    private int field5332;

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "[I")
    public static int[] field5329;

    @OriginalMember(owner = "client!nh", name = "S", descriptor = "[I")
    private int[] field5339;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lem;Ljd;)Z", line = 8)
    public final boolean method2375(class93 arg0, class95 arg1) {
        return this.field5327.method2117(arg1, 0, arg0);
    }

    @OriginalMember(owner = "client!nh", name = "finalize", descriptor = "()V", line = 14)
    protected final void finalize() throws Throwable {
        if (this.field5343 != -1) {
            class80.method625(this.field5343, this.field5335, this.field5332);
            this.field5343 = -1;
            this.field5335 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lem;Ljd;FZ)[I", line = 24)
    public final int[] method2376(class93 arg0, class95 arg1, float arg2, boolean arg3) {
        if (this.field5339 == null || this.field5334 != arg2) {
            if (!this.field5327.method2117(arg1, 0, arg0)) {
                return null;
            }
            this.field5330 = arg3 ? 64 : 128;
            this.field5339 = this.field5327.method2116((byte) 118, this.field5330, arg1, this.field5328, true, arg0, (double) arg2, this.field5330);
            this.field5334 = arg2;
            if (this.field5333) {
                int[] var5 = new int[this.field5330];
                int[] var6 = new int[this.field5330];
                int[] var7 = new int[this.field5330];
                int[] var8 = new int[this.field5330 * this.field5330];
                int var9 = this.field5330;
                int var10 = this.field5330;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14;
                int var15 = var14 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var17 = var11; var17 >= 0; var17--) {
                        var14--;
                        int var18 = this.field5339[var14];
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
                        int var32 = this.field5339[var14];
                        var15--;
                        int var33 = this.field5339[var15];
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
                this.field5339 = var8;
            }
        }
        return this.field5339;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIII[I)V", line = 175)
    private static final void method2377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !class183.method1359(arg2, 1)) {
            throw new InvalidParameterException("width must be power of 2");
        } else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !class183.method1359(arg3, 1)) {
            throw new InvalidParameterException("height must be power of 2");
        } else if (arg4 == 32993 || arg4 == 6408) {
            GL var7 = class73.field1051;
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

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lem;Ljd;Z)[I", line = 275)
    public final int[] method2378(class93 arg0, class95 arg1, boolean arg2) {
        if (this.field5327.method2117(arg1, 0, arg0)) {
            int var4 = arg2 ? 64 : 128;
            return this.field5327.method2116((byte) 57, var4, arg1, this.field5328, false, arg0, 1.0D, var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIII[F)V", line = 285)
    private static final void method2379(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6) {
        if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !class183.method1359(arg2, 1)) {
            throw new InvalidParameterException("width must be power of 2");
        } else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !class183.method1359(arg3, 1)) {
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
            GL var8 = class73.field1051;
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

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "()V", line = 400)
    public static void method2380() {
        field5329 = null;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lwm;)V", line = 598)
    public class344(class254 arg0) {
        this.field5327 = new class308(arg0);
        this.field5333 = arg0.method1774((byte) 50) == 1;
        this.field5328 = arg0.method1774((byte) -92) == 1;
        this.field5340 = arg0.method1774((byte) -98) == 1;
        this.field5331 = arg0.method1774((byte) 5) == 1;
        int var2 = arg0.method1774((byte) -119) & 0x3;
        this.field5337 = arg0.method1733(2023893896);
        this.field5342 = arg0.method1733(2023893896);
        int var3 = arg0.method1774((byte) -128);
        arg0.method1774((byte) 123);
        this.field5338 = arg0.method1774((byte) -128) == 1;
        this.field5341 = var3 >> 4 & 0xF;
        if (var2 == 1) {
            this.field5326 = 2;
        } else if (var2 == 2) {
            this.field5326 = 3;
        } else if (var2 == 3) {
            this.field5326 = 4;
        } else {
            this.field5326 = 0;
        }
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)V", line = 416)
    public final void method2381(int arg0) {
        if (this.field5339 == null || this.field5342 == 0 && this.field5337 == 0) {
            return;
        }
        if (field5329 == null || field5329.length < this.field5339.length) {
            field5329 = new int[this.field5339.length];
        }
        int var2 = this.field5339.length;
        int var3 = this.field5337 * arg0;
        int var4 = this.field5330 - 1;
        int var5 = this.field5330 * arg0 * this.field5342;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field5330) {
            int var8 = var5 + var7 & var6;
            for (int var9 = 0; var9 < this.field5330; var9++) {
                int var10 = var7 + var9;
                int var11 = (var3 + var9 & var4) + var8;
                field5329[var10] = this.field5339[var11];
            }
        }
        int[] var12 = this.field5339;
        this.field5339 = field5329;
        field5329 = var12;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lem;Ljd;I)Z", line = 471)
    public final boolean method2382(class93 arg0, class95 arg1, int arg2) {
        if (!this.field5327.method2117(arg1, 0, arg0)) {
            return false;
        }
        GL var4 = class73.field1051;
        int var5 = class196.method1433((byte) 117);
        if ((var5 & 0x1) == 0) {
            if (this.field5343 != -1 && this.field5330 == arg2) {
                class73.method537(this.field5343);
            } else {
                if (this.field5343 == -1) {
                    int[] var6 = new int[1];
                    var4.glGenTextures(1, var6, 0);
                    this.field5343 = var6[0];
                    this.field5332 = class80.field1183;
                }
                class73.method537(this.field5343);
                if (this.field5338 && class20.method162()) {
                    float[] var7 = this.field5327.method2115(arg2, this.field5328, arg2, (byte) 126, arg0, arg1);
                    if (this.field5341 == 2) {
                        method2379(class150.field2262, class150.field2268, arg2, arg2, class150.field2265, class150.field2275, var7);
                        var4.glTexParameteri(3553, 10241, 9987);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class80.field1186 += var7.length * 4 / 3 - this.field5335;
                        this.field5335 = var7.length * 4 / 3;
                    } else {
                        var4.glTexImage2D(3553, 0, 34842, arg2, arg2, 0, 6408, 5126, FloatBuffer.wrap(var7));
                        var4.glTexParameteri(3553, 10241, 9729);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class80.field1186 += var7.length - this.field5335;
                        this.field5335 = var7.length;
                    }
                } else {
                    int var8 = class73.field1075 ? 33639 : 5121;
                    int[] var9 = this.field5327.method2114(this.field5328, arg2, arg0, arg2, 0.7D, -119, arg1);
                    if (this.field5341 == 2) {
                        method2377(class150.field2262, class150.field2265, arg2, arg2, class150.field2266, var8, var9);
                        var4.glTexParameteri(3553, 10241, 9987);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class80.field1186 += var9.length * 4 / 3 - this.field5335;
                        this.field5335 = var9.length * 4 / 3;
                    } else if (this.field5341 == 1) {
                        int var10 = 0;
                        while (true) {
                            var4.glTexImage2D(3553, var10++, 6408, arg2, arg2, 0, 32993, var8, IntBuffer.wrap(var9));
                            arg2 >>= 0x1;
                            if (arg2 == 0) {
                                var4.glTexParameteri(3553, 10241, 9987);
                                var4.glTexParameteri(3553, 10240, 9729);
                                class80.field1186 += var9.length * 4 / 3 - this.field5335;
                                this.field5335 = var9.length * 4 / 3;
                                break;
                            }
                            var9 = this.field5327.method2114(this.field5328, arg2, arg0, arg2, 0.7D, -31, arg1);
                        }
                    } else {
                        var4.glTexImage2D(3553, 0, 6408, arg2, arg2, 0, 32993, var8, IntBuffer.wrap(var9));
                        var4.glTexParameteri(3553, 10241, 9729);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class80.field1186 += var9.length - this.field5335;
                        this.field5335 = var9.length;
                    }
                }
                var4.glTexParameteri(3553, 10242, this.field5340 ? 10497 : 33071);
                var4.glTexParameteri(3553, 10243, this.field5331 ? 10497 : 33071);
                this.field5330 = arg2;
            }
        }
        if ((var5 & 0x2) == 0) {
            class73.method519(this.field5326);
        }
        if ((var5 & 0x4) == 0) {
            class73.method548(0);
        }
        if ((var5 & 0x8) == 0) {
            if (this.field5342 == 0 && this.field5337 == 0) {
                class73.method552();
            } else {
                float var11 = (float) (class73.field1071 * this.field5342) / (float) this.field5330;
                float var12 = (float) (class73.field1071 * this.field5337) / (float) this.field5330;
                class73.method518(var12, var11, 0.0F);
            }
        }
        return true;
    }
}
