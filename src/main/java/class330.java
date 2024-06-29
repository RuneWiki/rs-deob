import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class330 implements class346 {

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Lri;")
    private class97 field5101;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "Lio;")
    private class403 field5103;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "Lri;")
    private class97 field5106;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "Lhga;")
    public static class158 field5099 = new class158(0, 1);

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field5102 = 0;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field5107 = new String[100];

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "Lla;")
    private class418 field5098;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "[Lf;")
    public static class702[] field5109;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIBI[F)V")
    public static final void method2214(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, float[] arg6) {
        field5105++;
        if (arg2 > 0 && !class416.method2649(arg2, true)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class416.method2649(arg0, true)) {
            int var7 = class470.method2915(arg1, 105);
            int var8 = 109 / ((arg4 + 10) / 47);
            int var9 = 0;
            int var10 = arg0 > arg2 ? arg2 : arg0;
            int var11 = arg2 >> 1;
            int var12 = arg0 >> 1;
            float[] var13 = arg6;
            float[] var14 = new float[var7 * var12 * var11];
            while (true) {
                OpenGL.glTexImage2Df(arg3, var9, arg5, arg2, arg0, 0, arg1, 5126, var13, 0);
                if (var10 <= 1) {
                    return;
                }
                int var15 = arg2 * var7;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var18 = var16;
                    int var19 = var16;
                    int var20 = var15 + var16;
                    for (int var21 = 0; var21 < var12; var21++) {
                        for (int var22 = 0; var22 < var11; var22++) {
                            float var23 = var13[var19];
                            int var24 = var7 + var19;
                            float var25 = var13[var24] + var23;
                            var19 = var7 + var24;
                            float var26 = var13[var20] + var25;
                            int var27 = var7 + var20;
                            float var28 = var13[var27] + var26;
                            var20 = var7 + var27;
                            var14[var18] = var28 * 0.25F;
                            var18 += var7;
                        }
                        var20 += var15;
                        var19 += var15;
                    }
                }
                float[] var17 = var14;
                var14 = var13;
                arg2 = var11;
                arg0 = var12;
                var13 = var17;
                var11 >>= 0x1;
                var9++;
                var10 >>= 0x1;
                var12 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)V")
    public static void method2215(byte arg0) {
        field5099 = null;
        if (arg0 <= 75) {
            field5102 = -106;
        }
        field5107 = null;
        field5109 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public final void method587(int arg0) {
        field5104++;
        if (arg0 != 22478) {
            this.method585((byte) 6);
        }
        class632 var2 = class597.method3482(arg0 - 22446, this.field5103.field6232, this.field5106);
        this.field5098 = class627.field8857.method347(var2, class284.method2028(this.field5101, this.field5103.field6232), true);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)Z")
    public final boolean method585(byte arg0) {
        field5100++;
        boolean var2 = true;
        if (!this.field5101.method942(0, this.field5103.field6232)) {
            var2 = false;
        }
        if (!this.field5106.method942(0, this.field5103.field6232)) {
            var2 = false;
        }
        if (arg0 <= 119) {
            this.field5098 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lri;Lri;Lio;)V")
    public class330(class97 arg0, class97 arg1, class403 arg2) {
        this.field5101 = arg0;
        this.field5103 = arg2;
        this.field5106 = arg1;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZI)V")
    public final void method1066(boolean arg0, int arg1) {
        field5110++;
        if (arg1 == -5506 && arg0) {
            int var3 = this.field5103.field6229.method1799(-123, this.field5103.field6233, class585.field8333) + this.field5103.field6228;
            int var4 = this.field5103.field6226.method2550(this.field5103.field6223, true, class95.field1487) + this.field5103.field6224;
            this.field5098.method2658(this.field5103.field6233, this.field5103.field6215, this.field5103.field6220, 0, null, var4, this.field5103.field6222, this.field5103.field6216, var3, 86, this.field5103.field6219, 0, this.field5103.field6213, null, null, this.field5103.field6223);
        }
    }
}
