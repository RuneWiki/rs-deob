import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class201 {

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "Lrb;")
    public static class283 field2919 = new class283(19, -2);

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "[B")
    public static byte[] field2922 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "Lde;")
    public static class10 field2921 = new class10(11, 0, 1, 2);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public int field2917;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "Luc;")
    public class201 field2918;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "Ltn;")
    public class434 field2915;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([J[IB)V", line = 7)
    public static final void method1304(long[] arg0, int[] arg1, byte arg2) {
        class496.method2948(arg0, arg0.length - 1, 0, arg1, (byte) 59);
        field2914++;
        int var3 = -102 / ((-arg2 - 61) / 33);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 18)
    public static final void method1305(int arg0) {
        if (arg0 > 1) {
            class495.field7196 = new class440(class343.field4967.method1126(class486.field6998, (byte) -19), "", class358.field5165, 1011, -1, 0L, 0, 0, true, false);
            field2923++;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBII[FII)V", line = 33)
    public static final void method1306(int arg0, byte arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        field2916++;
        if (arg0 > 0 && !class113.method855(arg0, (byte) -103)) {
            throw new IllegalArgumentException("");
        } else if (arg2 <= 0 || class113.method855(arg2, (byte) -103)) {
            int var7 = class50.method338(arg6, (byte) -41);
            if (arg1 != -61) {
                field2921 = null;
            }
            int var8 = 0;
            int var9 = arg2 > arg0 ? arg0 : arg2;
            int var10 = arg0 >> 1;
            int var11 = arg2 >> 1;
            float[] var12 = arg4;
            float[] var13 = new float[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Df(arg3, var8, arg5, arg0, arg2, 0, arg6, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg0 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            float var25 = var12[var19] + var24;
                            var18 = var7 + var23;
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
                float[] var16 = var13;
                var13 = var12;
                arg2 = var11;
                arg0 = var10;
                var12 = var16;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var11 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V", line = 135)
    public final void method1307(byte arg0) {
        field2920++;
        if (class462.field6685 >= 500) {
            return;
        }
        this.field2918 = class440.field6335;
        this.field2915 = null;
        this.field2917 = 0;
        class440.field6335 = this;
        class462.field6685++;
        if (arg0 != 83) {
            this.field2915 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V", line = 154)
    public static void method1308(byte arg0) {
        if (arg0 == 25) {
            field2921 = null;
            field2919 = null;
            field2922 = null;
        }
    }
}
