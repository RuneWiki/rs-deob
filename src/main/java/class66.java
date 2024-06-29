import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.security.InvalidParameterException;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class66 extends class104 {

    @OriginalMember(owner = "client!b", name = "s", descriptor = "I")
    private int field847 = -1;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "Z")
    public boolean field853 = false;

    @OriginalMember(owner = "client!b", name = "I", descriptor = "I")
    private int field861 = 0;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "Lqe;")
    public class198 field848;

    @OriginalMember(owner = "client!b", name = "E", descriptor = "Z")
    private boolean field858;

    @OriginalMember(owner = "client!b", name = "H", descriptor = "Z")
    private boolean field860;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "Z")
    private boolean field849;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "Z")
    private boolean field850;

    @OriginalMember(owner = "client!b", name = "B", descriptor = "I")
    private int field856;

    @OriginalMember(owner = "client!b", name = "G", descriptor = "I")
    private int field859;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "Z")
    private boolean field852;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    private int field854;

    @OriginalMember(owner = "client!b", name = "A", descriptor = "I")
    private int field855;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "F")
    private float field846;

    @OriginalMember(owner = "client!b", name = "D", descriptor = "I")
    private int field857;

    @OriginalMember(owner = "client!b", name = "K", descriptor = "I")
    private int field863;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "[I")
    public static int[] field851;

    @OriginalMember(owner = "client!b", name = "J", descriptor = "[I")
    private int[] field862;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lt;Llc;Z)[I", line = 11)
    public final int[] method408(class268 arg0, class175 arg1, boolean arg2) {
        if (this.field848.method1366(arg0, 1, arg1)) {
            int var4 = arg2 ? 64 : 128;
            return this.field848.method1361((byte) -113, arg0, this.field860, var4, arg1, false, 1.0D, var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIII[F)V", line = 19)
    private static final void method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6) {
        if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !class30.method182(10876, arg2)) {
            throw new InvalidParameterException("width must be power of 2");
        } else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !class30.method182(10876, arg3)) {
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
            GL var8 = class250.field3818;
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

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lt;Llc;FZ)[I", line = 140)
    public final int[] method410(class268 arg0, class175 arg1, float arg2, boolean arg3) {
        if (this.field862 == null || this.field846 != arg2) {
            if (!this.field848.method1366(arg0, 1, arg1)) {
                return null;
            }
            this.field857 = arg3 ? 64 : 128;
            this.field862 = this.field848.method1361((byte) -113, arg0, this.field860, this.field857, arg1, true, (double) arg2, this.field857);
            this.field846 = arg2;
            if (this.field858) {
                int[] var5 = new int[this.field857];
                int[] var6 = new int[this.field857];
                int[] var7 = new int[this.field857];
                int[] var8 = new int[this.field857 * this.field857];
                int var9 = this.field857;
                int var10 = this.field857;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14;
                int var15 = var14 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var17 = var11; var17 >= 0; var17--) {
                        var14--;
                        int var18 = this.field862[var14];
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
                        int var32 = this.field862[var14];
                        var15--;
                        int var33 = this.field862[var15];
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
                this.field862 = var8;
            }
        }
        return this.field862;
    }

    @OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V", line = 290)
    protected final void finalize() throws Throwable {
        if (this.field847 != -1) {
            class266.method1927(this.field847, this.field861, this.field863);
            this.field847 = -1;
            this.field861 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(I)V", line = 304)
    public final void method411(int arg0) {
        if (this.field862 == null || this.field859 == 0 && this.field856 == 0) {
            return;
        }
        if (field851 == null || field851.length < this.field862.length) {
            field851 = new int[this.field862.length];
        }
        int var2 = this.field862.length;
        int var3 = this.field856 * arg0;
        int var4 = this.field857 - 1;
        int var5 = this.field857 * arg0 * this.field859;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field857) {
            int var8 = var5 + var7 & var6;
            for (int var9 = 0; var9 < this.field857; var9++) {
                int var10 = var7 + var9;
                int var11 = (var3 + var9 & var4) + var8;
                field851[var10] = this.field862[var11];
            }
        }
        int[] var12 = this.field862;
        this.field862 = field851;
        field851 = var12;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lt;Llc;)Z", line = 355)
    public final boolean method412(class268 arg0, class175 arg1) {
        return this.field848.method1366(arg0, 1, arg1);
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lp;)V", line = 598)
    public class66(class107 arg0) {
        this.field848 = new class198(arg0);
        this.field858 = arg0.method661(-1) == 1;
        this.field860 = arg0.method661(-1) == 1;
        this.field849 = arg0.method661(-1) == 1;
        this.field850 = arg0.method661(-1) == 1;
        int var2 = arg0.method661(-1) & 0x3;
        this.field856 = arg0.method679(-3);
        this.field859 = arg0.method679(-3);
        int var3 = arg0.method661(-1);
        arg0.method661(-1);
        this.field852 = arg0.method661(-1) == 1;
        this.field854 = var3 >> 4 & 0xF;
        if (var2 == 1) {
            this.field855 = 2;
        } else if (var2 == 2) {
            this.field855 = 3;
        } else if (var2 == 3) {
            this.field855 = 4;
        } else {
            this.field855 = 0;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIII[I)V", line = 365)
    private static final void method413(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !class30.method182(10876, arg2)) {
            throw new InvalidParameterException("width must be power of 2");
        } else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !class30.method182(10876, arg3)) {
            throw new InvalidParameterException("height must be power of 2");
        } else if (arg4 == 32993 || arg4 == 6408) {
            GL var7 = class250.field3818;
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

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lt;Llc;I)Z", line = 469)
    public final boolean method414(class268 arg0, class175 arg1, int arg2) {
        if (!this.field848.method1366(arg0, 1, arg1)) {
            return false;
        }
        GL var4 = class250.field3818;
        int var5 = class45.method266(true);
        if ((var5 & 0x1) == 0) {
            if (this.field847 != -1 && this.field857 == arg2) {
                class250.method1806(this.field847);
            } else {
                if (this.field847 == -1) {
                    int[] var6 = new int[1];
                    var4.glGenTextures(1, var6, 0);
                    this.field847 = var6[0];
                    this.field863 = class266.field4192;
                }
                class250.method1806(this.field847);
                if (this.field852 && class124.method840()) {
                    float[] var7 = this.field848.method1370(arg0, arg2, arg2, arg1, this.field860, -1);
                    if (this.field854 == 2) {
                        method409(class209.field2958, class209.field2964, arg2, arg2, class209.field2961, class209.field2971, var7);
                        var4.glTexParameteri(3553, 10241, 9987);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class266.field4196 += var7.length * 4 / 3 - this.field861;
                        this.field861 = var7.length * 4 / 3;
                    } else {
                        var4.glTexImage2D(3553, 0, 34842, arg2, arg2, 0, 6408, 5126, FloatBuffer.wrap(var7));
                        var4.glTexParameteri(3553, 10241, 9729);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class266.field4196 += var7.length - this.field861;
                        this.field861 = var7.length;
                    }
                } else {
                    int var8 = class250.field3825 ? 33639 : 5121;
                    int[] var9 = this.field848.method1372(0.7D, arg0, (byte) 75, arg2, arg2, arg1, this.field860);
                    if (this.field854 == 2) {
                        method413(class209.field2958, class209.field2961, arg2, arg2, class209.field2962, var8, var9);
                        var4.glTexParameteri(3553, 10241, 9987);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class266.field4196 += var9.length * 4 / 3 - this.field861;
                        this.field861 = var9.length * 4 / 3;
                    } else if (this.field854 == 1) {
                        int var10 = 0;
                        while (true) {
                            var4.glTexImage2D(3553, var10++, 6408, arg2, arg2, 0, 32993, var8, IntBuffer.wrap(var9));
                            arg2 >>= 0x1;
                            if (arg2 == 0) {
                                var4.glTexParameteri(3553, 10241, 9987);
                                var4.glTexParameteri(3553, 10240, 9729);
                                class266.field4196 += var9.length * 4 / 3 - this.field861;
                                this.field861 = var9.length * 4 / 3;
                                break;
                            }
                            var9 = this.field848.method1372(0.7D, arg0, (byte) 85, arg2, arg2, arg1, this.field860);
                        }
                    } else {
                        var4.glTexImage2D(3553, 0, 6408, arg2, arg2, 0, 32993, var8, IntBuffer.wrap(var9));
                        var4.glTexParameteri(3553, 10241, 9729);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class266.field4196 += var9.length - this.field861;
                        this.field861 = var9.length;
                    }
                }
                var4.glTexParameteri(3553, 10242, this.field849 ? 10497 : 33071);
                var4.glTexParameteri(3553, 10243, this.field850 ? 10497 : 33071);
                this.field857 = arg2;
            }
        }
        if ((var5 & 0x2) == 0) {
            class250.method1797(this.field855);
        }
        if ((var5 & 0x4) == 0) {
            class250.method1812(0);
        }
        if ((var5 & 0x8) == 0) {
            if (this.field859 == 0 && this.field856 == 0) {
                class250.method1834();
            } else {
                float var11 = (float) (class250.field3796 * this.field859) / (float) this.field857;
                float var12 = (float) (class250.field3796 * this.field856) / (float) this.field857;
                class250.method1803(var12, var11, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()V", line = 593)
    public static void method415() {
        field851 = null;
    }
}
