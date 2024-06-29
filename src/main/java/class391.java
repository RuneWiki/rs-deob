import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class391 {

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II[FIIII)V")
    public static final void method2467(int arg0, int arg1, float[] arg2, int arg3, int arg4, int arg5, int arg6) {
        field5719++;
        if (arg5 > 0 && !class380.method2416(-1, arg5)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class380.method2416(-1, arg3)) {
            int var7 = class46.method309(arg1, (byte) -101);
            int var8 = 0;
            int var9 = arg3 <= arg5 ? arg3 : arg5;
            int var10 = arg5 >> 1;
            int var11 = -109 % ((arg0 + 63) / 59);
            int var12 = arg3 >> 1;
            float[] var13 = arg2;
            float[] var14 = new float[var7 * var12 * var10];
            while (true) {
                OpenGL.glTexImage2Df(arg6, var8, arg4, arg5, arg3, 0, arg1, 5126, var13, 0);
                if (var9 <= 1) {
                    return;
                }
                int var15 = arg5 * var7;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var18 = var16;
                    int var19 = var16;
                    int var20 = var15 + var16;
                    for (int var21 = 0; var21 < var12; var21++) {
                        for (int var22 = 0; var22 < var10; var22++) {
                            float var23 = var13[var19];
                            int var24 = var7 + var19;
                            float var25 = var13[var24] + var23;
                            var19 = var7 + var24;
                            float var26 = var13[var20] + var25;
                            int var27 = var7 + var20;
                            float var28 = var13[var27] + var26;
                            var14[var18] = var28 * 0.25F;
                            var20 = var7 + var27;
                            var18 += var7;
                        }
                        var19 += var15;
                        var20 += var15;
                    }
                }
                float[] var17 = var14;
                var14 = var13;
                arg3 = var12;
                arg5 = var10;
                var13 = var17;
                var8++;
                var12 >>= 0x1;
                var10 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBLpq;)V")
    public static final void method2468(int arg0, byte arg1, class52 arg2) {
        if (arg1 != -52) {
            return;
        }
        field5717++;
        if (class218.field3284) {
            arg0 = 0;
            class218.field3284 = false;
        }
        if (class231.field3478 != null && class231.field3478.method346(8, arg2)) {
            return;
        }
        class231.field3478 = arg2;
        class530.field7745 = class375.method2397((byte) -75);
        class104.field1608 = arg0;
        class263.field4181 = arg0;
        if (class263.field4181 == 0) {
            class114.method872(-12500);
            return;
        }
        class421.field6184 = class401.field5915;
        class505.field7343 = class342.field5115;
        class327.field4947 = class172.field2666;
        class238.field3585 = class172.field2667;
        class409.field6045 = class68.field1088;
        class171.field2648 = class345.field5139;
        class157.field2407 = class22.field251;
        class4.field61 = class138.field2093;
        class272.field4287 = class128.field1915;
        class276.field4330 = class192.field2956;
    }
}
