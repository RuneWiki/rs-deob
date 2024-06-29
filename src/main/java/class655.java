import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class655 implements class104 {

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "Lcca;")
    private class224 field9111;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Lsea;")
    private class648 field9116;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Lsea;")
    private class648 field9113;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field9109 = 0;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field9112 = 0;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field9115;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field9117;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field9118;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field9119;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Lla;")
    private class417 field9110;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Lf;")
    public static class702 field9114;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[FIIIII)V")
    public static final void method3691(int arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9115++;
        if (arg3 > 0 && !class588.method3342(87, arg3)) {
            throw new IllegalArgumentException("");
        } else if (arg2 <= 0 || class588.method3342(-124, arg2)) {
            int var7 = class363.method2070(82, arg6);
            int var8 = 0;
            int var9 = arg3 >= arg2 ? arg2 : arg3;
            int var10 = arg3 >> 1;
            int var11 = arg2 >> 1;
            float[] var12 = arg1;
            float[] var13 = new float[var7 * var11 * var10];
            if (arg0 >= -127) {
                method3691(-94, null, -127, -80, -107, 13, 104);
            }
            while (true) {
                OpenGL.glTexImage2Df(arg4, var8, arg5, arg3, arg2, 0, arg6, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg3 * var7;
                float[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            float var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = var27 * 0.25F;
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                var13 = var12;
                var12 = var15;
                arg3 = var10;
                arg2 = var11;
                var9 >>= 0x1;
                var11 >>= 0x1;
                var8++;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)Z")
    public final boolean method475(byte arg0) {
        if (arg0 != -90) {
            this.method476(66);
        }
        field9117++;
        boolean var2 = true;
        if (!this.field9116.method3623(-105, this.field9111.field3111)) {
            var2 = false;
        }
        if (!this.field9113.method3623(-93, this.field9111.field3111)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V")
    public static void method3692(byte arg0) {
        field9114 = null;
        int var1 = 14 / ((55 - arg0) / 35);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public final void method476(int arg0) {
        if (arg0 == -12935) {
            field9119++;
            class283 var2 = class699.method3918(this.field9111.field3111, 99, this.field9113);
            this.field9110 = class334.field4506.method129(var2, class168.method1190(this.field9116, this.field9111.field3111), true);
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lsea;Lsea;Lcca;)V")
    public class655(class648 arg0, class648 arg1, class224 arg2) {
        this.field9111 = arg2;
        this.field9116 = arg0;
        this.field9113 = arg1;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZZ)V")
    public final void method647(boolean arg0, boolean arg1) {
        if (arg0) {
            int var3 = this.field9111.field3118.method3361((byte) -108, this.field9111.field3117, class178.field2581) + this.field9111.field3113;
            int var4 = this.field9111.field3122.method59(1, this.field9111.field3110, class157.field2277) + this.field9111.field3116;
            this.field9110.method2427(this.field9111.field3109, 0, null, 0, var4, this.field9111.field3120, null, this.field9111.field3108, this.field9111.field3121, var3, this.field9111.field3117, (byte) 88, this.field9111.field3112, this.field9111.field3110, this.field9111.field3119, null);
        }
        if (!arg1) {
            this.field9111 = null;
        }
        field9118++;
    }
}
