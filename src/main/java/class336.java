import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class336 extends class501 {

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "I")
    private int field4397 = -1;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "I")
    private int field4403 = -1;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
    public int field4404;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
    public static int field4405 = 0;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "F")
    public static float field4402;

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lbo;IIZ[[I)V", line = 4)
    public class336(class511 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field4404 = arg2;
        super.field6916.method2980(this, 109);
        if (arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                class275.method1645((byte) 102, arg2, arg4[var6], super.field6913, super.field6916.field7442, var6 + 34069, 32993, arg2);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                OpenGL.glTexImage2Di(var7 + 34069, 0, super.field6913, arg2, arg2, 0, 32993, super.field6916.field7442, arg4[var7], 0);
            }
        }
        this.method2866(10241, true);
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lbo;IIZ[[BI)V", line = 178)
    public class336(class511 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field4404 = arg2;
        super.field6916.method2980(this, 121);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field6913, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method2866(10241, true);
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lbo;II)V", line = 231)
    public class336(class511 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field4404 = arg2;
        super.field6916.method2980(this, 120);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(34069 - -var4, 0, super.field6913, arg2, arg2, 0, class316.method1835(6407, super.field6913), 5121, (byte[]) null, 0);
        }
        this.method2866(10241, true);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIZI)V", line = 38)
    public static final void method1922(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg4 == -15904) {
            ++field4400;
            if (class28.method230(arg2, 106)) {
                class483.method2787(class238.field3185[arg2], arg0, false, -1, arg3, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V", line = 54)
    public static final void method1923(byte arg0) {
        ++field4399;
        if (class80.field1185 == null) {
            class80.field1185 = new int[65536];
            double var1 = 0.03D * Math.random() - 0.015D + 0.7D;
            int var3 = 13 / ((arg0 - -16) / 47);
            int var4 = 0;
            for (int var5 = 0; ~var5 > -513; ++var5) {
                float var6 = ((float) (var5 >> 3) / 64.0F + 0.0078125F) * 360.0F;
                float var7 = (float) (7 & var5) / 8.0F + 0.0625F;
                for (int var8 = 0; var8 < 128; ++var8) {
                    float var9 = (float) var8 / 128.0F;
                    float var10 = 0.0F;
                    float var11 = 0.0F;
                    float var12 = 0.0F;
                    float var13 = var6 / 60.0F;
                    int var14 = (int) var13;
                    int var15 = var14 % 6;
                    float var16 = var13 - (float) var14;
                    float var17 = (-var7 + 1.0F) * var9;
                    float var18 = (-(var7 * var16) + 1.0F) * var9;
                    float var19 = (-((-var16 + 1.0F) * var7) + 1.0F) * var9;
                    if (~var15 == -1) {
                        var10 = var9;
                        var11 = var19;
                        var12 = var17;
                    } else if (var15 != 1) {
                        if (var15 != 2) {
                            if (var15 != 3) {
                                if (~var15 == -5) {
                                    var12 = var9;
                                    var11 = var17;
                                    var10 = var19;
                                } else if (~var15 == -6) {
                                    var10 = var9;
                                    var11 = var17;
                                    var12 = var18;
                                }
                            } else {
                                var11 = var18;
                                var10 = var17;
                                var12 = var9;
                            }
                        } else {
                            var10 = var17;
                            var12 = var19;
                            var11 = var9;
                        }
                    } else {
                        var10 = var18;
                        var11 = var9;
                        var12 = var17;
                    }
                    float var20 = (float) Math.pow((double) var10, var1);
                    float var21 = (float) Math.pow((double) var11, var1);
                    float var22 = (float) Math.pow((double) var12, var1);
                    int var23 = (int) (var20 * 256.0F);
                    int var24 = (int) (var21 * 256.0F);
                    int var25 = (int) (var22 * 256.0F);
                    int var26 = (var23 << 16) + var25 + -16777216 - -(var24 << 8);
                    class80.field1185[var4++] = var26;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 197)
    public final void method1503(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field4403, this.field4397, 3553, 0, 0);
        if (arg0 > 126) {
            ++field4398;
            this.field4397 = -1;
            this.field4403 = -1;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIII)V", line = 219)
    public final void method1924(int arg0, int arg1, int arg2, int arg3, int arg4) {
        OpenGL.glFramebufferTexture2DEXT(arg0, arg2, arg1, super.field6924, arg3);
        int var6 = -8 / ((arg4 - 28) / 57);
        ++field4401;
        this.field4397 = arg2;
        this.field4403 = arg0;
    }
}
