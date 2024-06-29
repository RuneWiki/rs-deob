import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public class class588 {

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "[Lkga;")
    public static class555[] field8210 = new class555[14];

    @OriginalMember(owner = "client!uga", name = "c", descriptor = "Lmq;")
    public static class78 field8212 = new class78(44, 1);

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "I")
    public static int field8211;

    @OriginalMember(owner = "client!uga", name = "d", descriptor = "I")
    public static int field8213;

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(I)V", line = 12)
    public static void method3269(int arg0) {
        field8210 = null;
        field8212 = null;
        if (arg0 != -1699840479) {
            method3270((byte) 93, 49, 52, null, 33, -83, -67, -42);
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(BII[IIIII)V", line = 30)
    public static final void method3270(byte arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        field8213++;
        if (arg6 > 0 && !class487.method2850((byte) 58, arg6)) {
            throw new IllegalArgumentException("");
        } else if (arg7 > 0 && !class487.method2850((byte) -121, arg7)) {
            throw new IllegalArgumentException("");
        } else if (arg2 == 32993) {
            int var8 = 0;
            int var9 = arg7 > arg6 ? arg6 : arg7;
            int var10 = arg6 >> 1;
            int var11 = arg7 >> 1;
            int[] var12 = arg3;
            int[] var13 = new int[var10 * var11];
            if (arg0 > 52) {
                while (true) {
                    OpenGL.glTexImage2Di(arg5, var8, arg1, arg6, arg7, 0, arg2, arg4, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = arg6 + var15;
                    for (int var17 = 0; var17 < var11; var17++) {
                        for (int var19 = 0; var19 < var10; var19++) {
                            int var20 = var12[var15++];
                            int var21 = var12[var16++];
                            int var22 = var12[var15++];
                            int var23 = var12[var16++];
                            int var24 = var20 >> 8 & 0xFF;
                            int var25 = var20 >> 16 & 0xFF;
                            int var26 = var20 >> 24 & 0xFF;
                            int var27 = var20 & 0xFF;
                            int var28 = (var22 & 0xFF) + var27;
                            int var29 = (var22 >> 24 & 0xFF) + var26;
                            int var30 = (var22 >> 8 & 0xFF) + var24;
                            int var31 = (var22 >> 16 & 0xFF) + var25;
                            int var32 = (var21 >> 24 & 0xFF) + var29;
                            int var33 = (var21 & 0xFF) + var28;
                            int var34 = ((var21 & 0xFF23) >> 8) + var30;
                            int var35 = ((var21 & 0xFF0724) >> 16) + var31;
                            int var36 = ((var23 & 0xFFE9) >> 8) + var34;
                            int var37 = ((var23 & 0xFF4F91) >> 16) + var35;
                            int var38 = (var23 & 0xFF) + var33;
                            int var39 = (var23 >> 24 & 0xFF) + var32;
                            var13[var14++] = class216.method1308(class272.method1629(255, var38 >> 2), class216.method1308(class216.method1308(class272.method1629(1020, var37) << 14, class272.method1629(1020, var39) << 22), class272.method1629(1020, var36) << 6));
                        }
                        var16 += arg6;
                        var15 += arg6;
                    }
                    int[] var18 = var13;
                    var13 = var12;
                    var12 = var18;
                    arg6 = var10;
                    arg7 = var11;
                    var9 >>= 0x1;
                    var11 >>= 0x1;
                    var8++;
                    var10 >>= 0x1;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
