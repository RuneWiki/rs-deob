import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.security.InvalidParameterException;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class87 extends class279 {

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "I")
    private int field1184 = -1;

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "I")
    private int field1190 = 0;

    @OriginalMember(owner = "client!ta", name = "G", descriptor = "Z")
    public boolean field1187 = false;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "Laf;")
    public class195 field1176;

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "Z")
    private boolean field1180;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "Z")
    private boolean field1175;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "Z")
    private boolean field1179;

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "Z")
    private boolean field1189;

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
    private int field1192;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
    private int field1178;

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "Z")
    private boolean field1183;

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "I")
    private int field1181;

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "I")
    private int field1182;

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "F")
    private float field1185;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    private int field1177;

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
    private int field1191;

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "[I")
    private int[] field1186;

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "[I")
    private static int[] field1188;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIII[I)V", line = 11)
    private static final void method623(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !class251.method1802(arg2, (byte) -110)) {
            throw new InvalidParameterException("width must be power of 2");
        } else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !class251.method1802(arg3, (byte) -105)) {
            throw new InvalidParameterException("height must be power of 2");
        } else if (arg4 == 32993 || arg4 == 6408) {
            GL var7 = class109.field1456;
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

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lsi;Lug;FZ)[I", line = 111)
    public final int[] method624(class252 arg0, class253 arg1, float arg2, boolean arg3) {
        if (this.field1186 == null || this.field1185 != arg2) {
            if (!this.field1176.method1451(-48, arg0, arg1)) {
                return null;
            }
            this.field1177 = arg3 ? 64 : 128;
            this.field1186 = this.field1176.method1447(arg1, this.field1175, arg0, true, (double) arg2, 1, this.field1177, this.field1177);
            this.field1185 = arg2;
            if (this.field1180) {
                int[] var5 = new int[this.field1177];
                int[] var6 = new int[this.field1177];
                int[] var7 = new int[this.field1177];
                int[] var8 = new int[this.field1177 * this.field1177];
                int var9 = this.field1177;
                int var10 = this.field1177;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14;
                int var15 = var14 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var17 = var11; var17 >= 0; var17--) {
                        var14--;
                        int var18 = this.field1186[var14];
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
                        int var32 = this.field1186[var14];
                        var15--;
                        int var33 = this.field1186[var15];
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
                this.field1186 = var8;
            }
        }
        return this.field1186;
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)V", line = 267)
    public final void method625(int arg0) {
        if (this.field1186 == null || this.field1178 == 0 && this.field1192 == 0) {
            return;
        }
        if (field1188 == null || field1188.length < this.field1186.length) {
            field1188 = new int[this.field1186.length];
        }
        int var2 = this.field1186.length;
        int var3 = this.field1192 * arg0;
        int var4 = this.field1177 - 1;
        int var5 = this.field1177 * arg0 * this.field1178;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field1177) {
            int var8 = var5 + var7 & var6;
            for (int var9 = 0; var9 < this.field1177; var9++) {
                int var10 = var7 + var9;
                int var11 = (var3 + var9 & var4) + var8;
                field1188[var10] = this.field1186[var11];
            }
        }
        int[] var12 = this.field1186;
        this.field1186 = field1188;
        field1188 = var12;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lsi;Lug;I)Z", line = 318)
    public final boolean method626(class252 arg0, class253 arg1, int arg2) {
        if (!this.field1176.method1451(-102, arg0, arg1)) {
            return false;
        }
        GL var4 = class109.field1456;
        int var5 = class153.method1116((byte) -27);
        if ((var5 & 0x1) == 0) {
            if (this.field1184 != -1 && this.field1177 == arg2) {
                class109.method752(this.field1184);
            } else {
                if (this.field1184 == -1) {
                    int[] var6 = new int[1];
                    var4.glGenTextures(1, var6, 0);
                    this.field1184 = var6[0];
                    this.field1191 = class103.field1369;
                }
                class109.method752(this.field1184);
                if (this.field1183 && class189.method1380()) {
                    float[] var7 = this.field1176.method1446(this.field1175, (byte) -124, arg2, arg1, arg2, arg0);
                    if (this.field1181 == 2) {
                        method627(class313.field4897, class313.field4903, arg2, arg2, class313.field4900, class313.field4910, var7);
                        var4.glTexParameteri(3553, 10241, 9987);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class103.field1374 += var7.length * 4 / 3 - this.field1190;
                        this.field1190 = var7.length * 4 / 3;
                    } else {
                        var4.glTexImage2D(3553, 0, 34842, arg2, arg2, 0, 6408, 5126, FloatBuffer.wrap(var7));
                        var4.glTexParameteri(3553, 10241, 9729);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class103.field1374 += var7.length - this.field1190;
                        this.field1190 = var7.length;
                    }
                } else {
                    int var8 = class109.field1464 ? 33639 : 5121;
                    int[] var9 = this.field1176.method1453(this.field1175, arg0, 0, arg2, 0.7D, arg1, arg2);
                    if (this.field1181 == 2) {
                        method623(class313.field4897, class313.field4900, arg2, arg2, class313.field4901, var8, var9);
                        var4.glTexParameteri(3553, 10241, 9987);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class103.field1374 += var9.length * 4 / 3 - this.field1190;
                        this.field1190 = var9.length * 4 / 3;
                    } else if (this.field1181 == 1) {
                        int var10 = 0;
                        while (true) {
                            var4.glTexImage2D(3553, var10++, 6408, arg2, arg2, 0, 32993, var8, IntBuffer.wrap(var9));
                            arg2 >>= 0x1;
                            if (arg2 == 0) {
                                var4.glTexParameteri(3553, 10241, 9987);
                                var4.glTexParameteri(3553, 10240, 9729);
                                class103.field1374 += var9.length * 4 / 3 - this.field1190;
                                this.field1190 = var9.length * 4 / 3;
                                break;
                            }
                            var9 = this.field1176.method1453(this.field1175, arg0, 0, arg2, 0.7D, arg1, arg2);
                        }
                    } else {
                        var4.glTexImage2D(3553, 0, 6408, arg2, arg2, 0, 32993, var8, IntBuffer.wrap(var9));
                        var4.glTexParameteri(3553, 10241, 9729);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class103.field1374 += var9.length - this.field1190;
                        this.field1190 = var9.length;
                    }
                }
                var4.glTexParameteri(3553, 10242, this.field1179 ? 10497 : 33071);
                var4.glTexParameteri(3553, 10243, this.field1189 ? 10497 : 33071);
                this.field1177 = arg2;
            }
        }
        if ((var5 & 0x2) == 0) {
            class109.method766(this.field1182);
        }
        if ((var5 & 0x4) == 0) {
            class109.method756(0);
        }
        if ((var5 & 0x8) == 0) {
            if (this.field1178 == 0 && this.field1192 == 0) {
                class109.method762();
            } else {
                float var11 = (float) (class109.field1472 * this.field1178) / (float) this.field1177;
                float var12 = (float) (class109.field1472 * this.field1192) / (float) this.field1177;
                class109.method774(var12, var11, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ta", name = "finalize", descriptor = "()V", line = 444)
    protected final void finalize() throws Throwable {
        if (this.field1184 != -1) {
            class103.method714(this.field1184, this.field1190, this.field1191);
            this.field1184 = -1;
            this.field1190 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lvl;)V", line = 598)
    public class87(class6 arg0) {
        this.field1176 = new class195(arg0);
        this.field1180 = arg0.method58(-288140008) == 1;
        this.field1175 = arg0.method58(-288140008) == 1;
        this.field1179 = arg0.method58(-288140008) == 1;
        this.field1189 = arg0.method58(-288140008) == 1;
        int var2 = arg0.method58(-288140008) & 0x3;
        this.field1192 = arg0.method83((byte) -106);
        this.field1178 = arg0.method83((byte) -77);
        int var3 = arg0.method58(-288140008);
        arg0.method58(-288140008);
        this.field1183 = arg0.method58(-288140008) == 1;
        this.field1181 = var3 >> 4 & 0xF;
        if (var2 == 1) {
            this.field1182 = 2;
        } else if (var2 == 2) {
            this.field1182 = 3;
        } else if (var2 == 3) {
            this.field1182 = 4;
        } else {
            this.field1182 = 0;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIII[F)V", line = 458)
    private static final void method627(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6) {
        if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !class251.method1802(arg2, (byte) -105)) {
            throw new InvalidParameterException("width must be power of 2");
        } else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !class251.method1802(arg3, (byte) -112)) {
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
            GL var8 = class109.field1456;
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

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()V", line = 573)
    public static void method628() {
        field1188 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lsi;Lug;Z)[I", line = 585)
    public final int[] method629(class252 arg0, class253 arg1, boolean arg2) {
        if (this.field1176.method1451(-127, arg0, arg1)) {
            int var4 = arg2 ? 64 : 128;
            return this.field1176.method1447(arg1, this.field1175, arg0, false, 1.0D, 1, var4, var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lsi;Lug;)Z", line = 593)
    public final boolean method630(class252 arg0, class253 arg1) {
        return this.field1176.method1451(-50, arg0, arg1);
    }
}
