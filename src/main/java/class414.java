import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class414 implements class509 {

    @OriginalMember(owner = "client!hea", name = "g", descriptor = "Lhq;")
    private class57 field5794;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "Lae;")
    private class283 field5788;

    @OriginalMember(owner = "client!hea", name = "h", descriptor = "Ljn;")
    public static class134 field5795 = new class134(27, 12);

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!hea", name = "e", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!hea", name = "f", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!hea", name = "i", descriptor = "I")
    public static int field5796;

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "Lho;")
    private class318 field5790;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IZ)V", line = 4)
    public final void method939(int arg0, boolean arg1) {
        if (arg0 != 7998) {
            method2520(-25, -72, 17, 85, -103, 41, null);
        }
        field5791++;
        if (!arg1) {
            return;
        }
        int var3 = class456.field6378 >= class742.field10226 ? class456.field6378 : class742.field10226;
        int var4 = class249.field3700 <= class565.field7983 ? class565.field7983 : class249.field3700;
        int var5 = this.field5790.method749();
        int var6 = this.field5790.method736();
        int var7 = 0;
        int var8 = var3;
        int var9 = var3 * var6 / var5;
        int var10 = (var4 - var9) / 2;
        if (var9 > var4) {
            var9 = var4;
            var10 = 0;
            var8 = var4 * var5 / var6;
            var7 = (var3 - var8) / 2;
        }
        this.field5790.method2033(var7, var10, var8, var9);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(B)Z", line = 48)
    public final boolean method941(byte arg0) {
        if (arg0 != -79) {
            this.method938(117);
        }
        field5792++;
        return this.field5788.method1860(this.field5794.field671, (byte) 124);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)V", line = 60)
    public final void method938(int arg0) {
        this.field5790 = class772.method4269(12, this.field5794.field671, this.field5788);
        if (arg0 <= 61) {
            method2519((byte) -102);
        }
        field5793++;
    }

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(B)V", line = 71)
    public static void method2519(byte arg0) {
        if (arg0 <= -39) {
            field5795 = null;
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIIII[F)V", line = 84)
    public static final void method2520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6) {
        field5789++;
        if (arg4 > 0 && !class65.method506(arg4, 30440)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class65.method506(arg3, arg5 ^ 0xFFFFE695)) {
            if (arg5 != -28547) {
                method2519((byte) 79);
            }
            int var7 = class97.method698(arg5 - 1148, arg1);
            int var8 = 0;
            int var9 = arg3 > arg4 ? arg4 : arg3;
            int var10 = arg4 >> 1;
            int var11 = arg3 >> 1;
            float[] var12 = arg6;
            float[] var13 = new float[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Df(arg2, var8, arg0, arg4, arg3, 0, arg1, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg4 * var7;
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
                            var13[var17] = var27 * 0.25F;
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                var13 = var12;
                var12 = var15;
                arg4 = var10;
                arg3 = var11;
                var11 >>= 0x1;
                var8++;
                var9 >>= 0x1;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lae;Lhq;)V", line = 184)
    public class414(class283 arg0, class57 arg1) {
        this.field5794 = arg1;
        this.field5788 = arg0;
    }
}
