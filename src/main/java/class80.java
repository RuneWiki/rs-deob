import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class80 extends class268 {

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
    public int field1162;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)Lvj;")
    public final class26 method117(int arg0) {
        if (arg0 == 1) {
            field1163++;
            return class306.field4641;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIII[FI)V")
    public static final void method720(int arg0, int arg1, int arg2, int arg3, int arg4, float[] arg5, int arg6) {
        field1161++;
        if (arg4 > 0 && !class668.method3743((byte) -126, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class668.method3743((byte) -123, arg1)) {
            int var7 = class254.method1721((byte) -9, arg0);
            int var8 = 0;
            int var9 = arg1 <= arg4 ? arg1 : arg4;
            int var10 = arg4 >> 1;
            if (arg3 == 17876) {
                int var11 = arg1 >> 1;
                float[] var12 = arg5;
                float[] var13 = new float[var10 * var11 * var7];
                while (true) {
                    OpenGL.glTexImage2Df(arg2, var8, arg6, arg4, arg1, 0, arg0, 5126, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = arg4 * var7;
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
                    arg4 = var10;
                    arg1 = var11;
                    var12 = var16;
                    var10 >>= 0x1;
                    var8++;
                    var9 >>= 0x1;
                    var11 >>= 0x1;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V")
    public static final void method721(int arg0) {
        field1164++;
        if (arg0 > -26) {
            method721(-70);
        }
        class543.method3175((byte) 110);
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(ILnha;Ljn;III)V")
    public class80(int arg0, class686 arg1, class322 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field1162 = arg5;
    }
}
