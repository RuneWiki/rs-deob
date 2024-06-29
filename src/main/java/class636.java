import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class636 extends class496 {

    @OriginalMember(owner = "client!eu", name = "r", descriptor = "I")
    public int field9270;

    @OriginalMember(owner = "client!eu", name = "o", descriptor = "I")
    public int field9267;

    @OriginalMember(owner = "client!eu", name = "i", descriptor = "Lwu;")
    public static class500 field9261 = new class500("LOCAL", 4);

    @OriginalMember(owner = "client!eu", name = "j", descriptor = "I")
    public static int field9262;

    @OriginalMember(owner = "client!eu", name = "k", descriptor = "I")
    public static int field9263;

    @OriginalMember(owner = "client!eu", name = "m", descriptor = "I")
    public static int field9265;

    @OriginalMember(owner = "client!eu", name = "n", descriptor = "I")
    public static int field9266;

    @OriginalMember(owner = "client!eu", name = "p", descriptor = "I")
    public static int field9268;

    @OriginalMember(owner = "client!eu", name = "q", descriptor = "I")
    public static int field9269;

    @OriginalMember(owner = "client!eu", name = "l", descriptor = "Lul;")
    public static class388 field9264;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(II[FIIZI)V")
    public static final void method3687(int arg0, int arg1, float[] arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field9262++;
        if (arg1 > 0 && !class154.method899(arg1, 99)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class154.method899(arg4, 96)) {
            int var7 = class425.method2513((byte) 104, arg3);
            int var8 = 0;
            int var9 = arg4 > arg1 ? arg1 : arg4;
            int var10 = arg1 >> 1;
            if (!arg5) {
                method3691((byte) 38, -28, null, null, null, 100);
            }
            int var11 = arg4 >> 1;
            float[] var12 = arg2;
            float[] var13 = new float[var7 * var11 * var10];
            while (true) {
                OpenGL.glTexImage2Df(arg6, var8, arg0, arg1, arg4, 0, arg3, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg1 * var7;
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
                var13 = var12;
                arg4 = var11;
                arg1 = var10;
                var12 = var15;
                var9 >>= 0x1;
                var11 >>= 0x1;
                var10 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "([Lha;I)V")
    public static final void method3688(class116[] arg0, int arg1) {
        field9265++;
        class85.field991 = arg0.length;
        class427.field6112 = new int[class85.field991 + 10];
        class465.field6720 = new class116[class85.field991 + 10];
        class473.method2882(arg0, 0, class465.field6720, 0, class85.field991);
        if (arg1 != 1) {
            method3691((byte) 0, -124, null, null, null, 62);
        }
        for (int var2 = 0; var2 < class85.field991; var2++) {
            class427.field6112[var2] = class465.field6720[var2].method714();
        }
        for (int var3 = class85.field991; var3 < class465.field6720.length; var3++) {
            class427.field6112[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)V")
    public static void method3689(byte arg0) {
        field9261 = null;
        field9264 = null;
        if (arg0 <= 36) {
            method3691((byte) -37, 34, null, null, null, -117);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Z)V")
    public static final void method3690(boolean arg0) {
        class205.method1339(66);
        if (arg0) {
            field9269++;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(BI[I[ILos;I)Loba;")
    public static final class1 method3691(byte arg0, int arg1, int[] arg2, int[] arg3, class468 arg4, int arg5) {
        field9263++;
        byte[] var6 = new byte[arg1 * arg5];
        if (arg0 < 0) {
            return null;
        }
        for (int var7 = 0; var7 < arg1; var7++) {
            int var8 = arg5 * var7 + arg2[var7];
            for (int var9 = 0; var9 < arg3[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class1(arg4, arg5, arg1, var6);
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(II)V")
    public class636(int arg0, int arg1) {
        this.field9270 = arg1;
        this.field9267 = arg0;
    }
}
