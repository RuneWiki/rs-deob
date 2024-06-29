import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class313 {

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "I")
    public static int field3856 = 0;

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "Lhj;")
    public static class596 field3857 = new class596(55, -2);

    @OriginalMember(owner = "client!pfa", name = "d", descriptor = "[Luea;")
    public static class336[] field3859 = new class336[300];

    @OriginalMember(owner = "client!pfa", name = "c", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I)V", line = 10)
    public static void method1848(int arg0) {
        if (arg0 != 9180) {
            method1849(null, false, -35, -112, -97, -123, 69, 22);
        }
        field3859 = null;
        field3857 = null;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "([IZIIIIII)V", line = 41)
    public static final void method1849(int[] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3858++;
        if (arg5 > 0 && !class152.method1091(arg5, -72)) {
            throw new IllegalArgumentException("");
        } else if (arg3 > 0 && !class152.method1091(arg3, -106)) {
            throw new IllegalArgumentException("");
        } else if (arg4 == 32993) {
            int var8 = 0;
            int var9 = arg3 <= arg5 ? arg3 : arg5;
            int var10 = arg5 >> 1;
            int var11 = arg3 >> 1;
            int[] var12 = arg0;
            int[] var13 = new int[var10 * var11];
            if (!arg1) {
                field3856 = 3;
            }
            while (true) {
                OpenGL.glTexImage2Di(arg7, var8, arg6, arg5, arg3, 0, arg4, arg2, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = var15 + arg5;
                for (int var17 = 0; var17 < var11; var17++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var15++];
                        int var22 = var12[var16++];
                        int var23 = var20 >> 8 & 0xFF;
                        int var24 = var12[var16++];
                        int var25 = var20 & 0xFF;
                        int var26 = (var20 & 0xFF5CBD) >> 16;
                        int var27 = var20 >> 24 & 0xFF;
                        int var28 = ((var21 & 0xFFCED2) >> 16) + var26;
                        int var29 = (var21 & 0xFF) + var25;
                        int var30 = (var21 >> 24 & 0xFF) + var27;
                        int var31 = ((var21 & 0xFF8B) >> 8) + var23;
                        int var32 = (var22 >> 16 & 0xFF) + var28;
                        int var33 = (var22 & 0xFF) + var29;
                        int var34 = (var22 >> 24 & 0xFF) + var30;
                        int var35 = (var22 >> 8 & 0xFF) + var31;
                        int var36 = (var24 & 0xFF) + var33;
                        int var37 = (var24 >> 16 & 0xFF) + var32;
                        int var38 = ((var24 & 0xFF97) >> 8) + var35;
                        int var39 = (var24 >> 24 & 0xFF) + var34;
                        var13[var14++] = class5.method105(class296.method1733(255, var36 >> 2), class5.method105(class5.method105(class296.method1733(var37 << 14, 16711680), class296.method1733(var39 << 22, -16777216)), class296.method1733(1020, var38) << 6));
                    }
                    var16 += arg5;
                    var15 += arg5;
                }
                int[] var18 = var13;
                var13 = var12;
                arg3 = var11;
                var12 = var18;
                arg5 = var10;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var8++;
                var11 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
