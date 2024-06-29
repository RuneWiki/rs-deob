import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.security.InvalidParameterException;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class85 extends class308 {

    @OriginalMember(owner = "client!pk", name = "F", descriptor = "Z")
    public boolean field1217 = false;

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "I")
    private int field1212 = 0;

    @OriginalMember(owner = "client!pk", name = "Q", descriptor = "I")
    private int field1225 = -1;

    @OriginalMember(owner = "client!pk", name = "I", descriptor = "Lkg;")
    public class121 field1219;

    @OriginalMember(owner = "client!pk", name = "S", descriptor = "Z")
    private boolean field1227;

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "Z")
    private boolean field1213;

    @OriginalMember(owner = "client!pk", name = "T", descriptor = "Z")
    private boolean field1228;

    @OriginalMember(owner = "client!pk", name = "D", descriptor = "Z")
    private boolean field1215;

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "I")
    private int field1223;

    @OriginalMember(owner = "client!pk", name = "J", descriptor = "I")
    private int field1220;

    @OriginalMember(owner = "client!pk", name = "E", descriptor = "Z")
    private boolean field1216;

    @OriginalMember(owner = "client!pk", name = "B", descriptor = "I")
    private int field1214;

    @OriginalMember(owner = "client!pk", name = "R", descriptor = "I")
    private int field1226;

    @OriginalMember(owner = "client!pk", name = "H", descriptor = "F")
    private float field1218;

    @OriginalMember(owner = "client!pk", name = "M", descriptor = "I")
    private int field1222;

    @OriginalMember(owner = "client!pk", name = "P", descriptor = "I")
    private int field1224;

    @OriginalMember(owner = "client!pk", name = "L", descriptor = "[I")
    public static int[] field1221;

    @OriginalMember(owner = "client!pk", name = "U", descriptor = "[I")
    private int[] field1229;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "()V", line = 7)
    public static void method555() {
        field1221 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIII[F)V", line = 10)
    private static final void method556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6) {
        if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !class238.method1667(1, arg2)) {
            throw new InvalidParameterException("width must be power of 2");
        } else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !class238.method1667(1, arg3)) {
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
            GL var8 = class245.field3884;
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

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Leh;Lnm;Z)[I", line = 124)
    public final int[] method557(class164 arg0, class221 arg1, boolean arg2) {
        if (this.field1219.method788(0, arg1, arg0)) {
            int var4 = arg2 ? 64 : 128;
            return this.field1219.method792(false, var4, 1.0D, arg0, arg1, 0, this.field1213, var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIII[I)V", line = 132)
    private static final void method558(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !class238.method1667(1, arg2)) {
            throw new InvalidParameterException("width must be power of 2");
        } else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !class238.method1667(1, arg3)) {
            throw new InvalidParameterException("height must be power of 2");
        } else if (arg4 == 32993 || arg4 == 6408) {
            GL var7 = class245.field3884;
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

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "(I)V", line = 234)
    public final void method559(int arg0) {
        if (this.field1229 == null || this.field1220 == 0 && this.field1223 == 0) {
            return;
        }
        if (field1221 == null || field1221.length < this.field1229.length) {
            field1221 = new int[this.field1229.length];
        }
        int var2 = this.field1229.length;
        int var3 = this.field1223 * arg0;
        int var4 = this.field1224 - 1;
        int var5 = this.field1224 * arg0 * this.field1220;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field1224) {
            int var8 = var5 + var7 & var6;
            for (int var9 = 0; var9 < this.field1224; var9++) {
                int var10 = var7 + var9;
                int var11 = (var3 + var9 & var4) + var8;
                field1221[var10] = this.field1229[var11];
            }
        }
        int[] var12 = this.field1229;
        this.field1229 = field1221;
        field1221 = var12;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Leh;Lnm;)Z", line = 285)
    public final boolean method560(class164 arg0, class221 arg1) {
        return this.field1219.method788(0, arg1, arg0);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Leh;Lnm;FZ)[I", line = 296)
    public final int[] method561(class164 arg0, class221 arg1, float arg2, boolean arg3) {
        if (this.field1229 == null || this.field1218 != arg2) {
            if (!this.field1219.method788(0, arg1, arg0)) {
                return null;
            }
            this.field1224 = arg3 ? 64 : 128;
            this.field1229 = this.field1219.method792(true, this.field1224, (double) arg2, arg0, arg1, 0, this.field1213, this.field1224);
            this.field1218 = arg2;
            if (this.field1227) {
                int[] var5 = new int[this.field1224];
                int[] var6 = new int[this.field1224];
                int[] var7 = new int[this.field1224];
                int[] var8 = new int[this.field1224 * this.field1224];
                int var9 = this.field1224;
                int var10 = this.field1224;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14;
                int var15 = var14 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var17 = var11; var17 >= 0; var17--) {
                        var14--;
                        int var18 = this.field1229[var14];
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
                        int var32 = this.field1229[var14];
                        var15--;
                        int var33 = this.field1229[var15];
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
                this.field1229 = var8;
            }
        }
        return this.field1229;
    }

    @OriginalMember(owner = "client!pk", name = "finalize", descriptor = "()V", line = 446)
    protected final void finalize() throws Throwable {
        if (this.field1225 != -1) {
            class173.method1198(this.field1225, this.field1212, this.field1222);
            this.field1225 = -1;
            this.field1212 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lfh;)V", line = 598)
    public class85(class313 arg0) {
        this.field1219 = new class121(arg0);
        this.field1227 = arg0.method2224(-124) == 1;
        this.field1213 = arg0.method2224(-125) == 1;
        this.field1228 = arg0.method2224(-126) == 1;
        this.field1215 = arg0.method2224(-122) == 1;
        int var2 = arg0.method2224(-127) & 0x3;
        this.field1223 = arg0.method2200(-72);
        this.field1220 = arg0.method2200(-81);
        int var3 = arg0.method2224(-119);
        arg0.method2224(-127);
        this.field1216 = arg0.method2224(-121) == 1;
        this.field1214 = var3 >> 4 & 0xF;
        if (var2 == 1) {
            this.field1226 = 2;
        } else if (var2 == 2) {
            this.field1226 = 3;
        } else if (var2 == 3) {
            this.field1226 = 4;
        } else {
            this.field1226 = 0;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Leh;Lnm;I)Z", line = 474)
    public final boolean method562(class164 arg0, class221 arg1, int arg2) {
        if (!this.field1219.method788(0, arg1, arg0)) {
            return false;
        }
        GL var4 = class245.field3884;
        int var5 = class341.method2405((byte) -18);
        if ((var5 & 0x1) == 0) {
            if (this.field1225 != -1 && this.field1224 == arg2) {
                class245.method1729(this.field1225);
            } else {
                if (this.field1225 == -1) {
                    int[] var6 = new int[1];
                    var4.glGenTextures(1, var6, 0);
                    this.field1225 = var6[0];
                    this.field1222 = class173.field2703;
                }
                class245.method1729(this.field1225);
                if (this.field1216 && class309.method2158()) {
                    float[] var7 = this.field1219.method783((byte) 61, this.field1213, arg2, arg2, arg1, arg0);
                    if (this.field1214 == 2) {
                        method556(class200.field3068, class200.field3074, arg2, arg2, class200.field3071, class200.field3081, var7);
                        var4.glTexParameteri(3553, 10241, 9987);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class173.field2704 += var7.length * 4 / 3 - this.field1212;
                        this.field1212 = var7.length * 4 / 3;
                    } else {
                        var4.glTexImage2D(3553, 0, 34842, arg2, arg2, 0, 6408, 5126, FloatBuffer.wrap(var7));
                        var4.glTexParameteri(3553, 10241, 9729);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class173.field2704 += var7.length - this.field1212;
                        this.field1212 = var7.length;
                    }
                } else {
                    int var8 = class245.field3895 ? 33639 : 5121;
                    int[] var9 = this.field1219.method791(arg0, arg2, 0.7D, arg2, -6043, arg1, this.field1213);
                    if (this.field1214 == 2) {
                        method558(class200.field3068, class200.field3071, arg2, arg2, class200.field3072, var8, var9);
                        var4.glTexParameteri(3553, 10241, 9987);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class173.field2704 += var9.length * 4 / 3 - this.field1212;
                        this.field1212 = var9.length * 4 / 3;
                    } else if (this.field1214 == 1) {
                        int var10 = 0;
                        while (true) {
                            var4.glTexImage2D(3553, var10++, 6408, arg2, arg2, 0, 32993, var8, IntBuffer.wrap(var9));
                            arg2 >>= 0x1;
                            if (arg2 == 0) {
                                var4.glTexParameteri(3553, 10241, 9987);
                                var4.glTexParameteri(3553, 10240, 9729);
                                class173.field2704 += var9.length * 4 / 3 - this.field1212;
                                this.field1212 = var9.length * 4 / 3;
                                break;
                            }
                            var9 = this.field1219.method791(arg0, arg2, 0.7D, arg2, -6043, arg1, this.field1213);
                        }
                    } else {
                        var4.glTexImage2D(3553, 0, 6408, arg2, arg2, 0, 32993, var8, IntBuffer.wrap(var9));
                        var4.glTexParameteri(3553, 10241, 9729);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class173.field2704 += var9.length - this.field1212;
                        this.field1212 = var9.length;
                    }
                }
                var4.glTexParameteri(3553, 10242, this.field1228 ? 10497 : 33071);
                var4.glTexParameteri(3553, 10243, this.field1215 ? 10497 : 33071);
                this.field1224 = arg2;
            }
        }
        if ((var5 & 0x2) == 0) {
            class245.method1721(this.field1226);
        }
        if ((var5 & 0x4) == 0) {
            class245.method1709(0);
        }
        if ((var5 & 0x8) == 0) {
            if (this.field1220 == 0 && this.field1223 == 0) {
                class245.method1710();
            } else {
                float var11 = (float) (class245.field3882 * this.field1220) / (float) this.field1224;
                float var12 = (float) (class245.field3882 * this.field1223) / (float) this.field1224;
                class245.method1738(var12, var11, 0.0F);
            }
        }
        return true;
    }
}
