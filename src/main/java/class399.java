import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class399 {

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "[[[B")
    public static byte[][][] field6056;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/awt/Canvas;ZLe;)Loa;")
    public static final class605 method2544(Canvas arg0, boolean arg1, class462 arg2) {
        field6054++;
        return arg1 ? new class54(arg0, arg2) : null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
    public static void method2545(byte arg0) {
        field6056 = null;
        if (arg0 < 87) {
            method2544(null, true, null);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIII[I)V")
    public static final void method2546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
        field6053++;
        if (arg6 > 0 && !class229.method1482(arg6, 53)) {
            throw new IllegalArgumentException("");
        } else if (arg3 > 0 && !class229.method1482(arg3, 60)) {
            throw new IllegalArgumentException("");
        } else if (arg0 == 32993) {
            int var8 = 0;
            int var9 = arg3 > arg6 ? arg6 : arg3;
            int var10 = arg6 >> 1;
            int var11 = -96 % ((arg5 + 24) / 42);
            int var12 = arg3 >> 1;
            int[] var13 = arg7;
            int[] var14 = new int[var10 * var12];
            while (true) {
                OpenGL.glTexImage2Di(arg1, var8, arg4, arg6, arg3, 0, arg0, arg2, var13, 0);
                if (var9 <= 1) {
                    return;
                }
                int var15 = 0;
                int var16 = 0;
                int var17 = arg6 + var16;
                int[] var18 = var14;
                for (int var19 = 0; var19 < var12; var19++) {
                    for (int var20 = 0; var20 < var10; var20++) {
                        int var21 = var13[var16++];
                        int var22 = var13[var17++];
                        int var23 = var13[var16++];
                        int var24 = (var21 & 0xFFA746) >> 16;
                        int var25 = (var21 & 0xFF82) >> 8;
                        int var26 = var21 >> 24 & 0xFF;
                        int var27 = var21 & 0xFF;
                        int var28 = var13[var17++];
                        int var29 = ((var23 & 0xFF9A) >> 8) + var25;
                        int var30 = (var23 >> 16 & 0xFF) + var24;
                        int var31 = (var23 & 0xFF) + var27;
                        int var32 = (var23 >> 24 & 0xFF) + var26;
                        int var33 = (var22 >> 16 & 0xFF) + var30;
                        int var34 = (var22 >> 8 & 0xFF) + var29;
                        int var35 = (var22 & 0xFF) + var31;
                        int var36 = (var22 >> 24 & 0xFF) + var32;
                        int var37 = (var28 >> 16 & 0xFF) + var33;
                        int var38 = (var28 >> 24 & 0xFF) + var36;
                        int var39 = (var28 & 0xFF) + var35;
                        int var40 = ((var28 & 0xFFE4) >> 8) + var34;
                        var14[var15++] = class283.method1834(class283.method1834(class283.method1834(class643.method3659(var38 << 22, -16777216), class643.method3659(1020, var37) << 14), class643.method3659(65280, var40 << 6)), class643.method3659(var39 >> 2, 255));
                    }
                    var17 += arg6;
                    var16 += arg6;
                }
                var14 = var13;
                var13 = var18;
                arg3 = var12;
                arg6 = var10;
                var12 >>= 0x1;
                var8++;
                var10 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIBI)I")
    public static final int method2547(int arg0, int arg1, byte arg2, int arg3) {
        field6055++;
        int var4 = -54 % ((-arg2 - 87) / 38);
        if (class435.field6449 == null) {
            return 0;
        }
        int var5 = arg1 >> 9;
        int var6 = arg0 >> 9;
        if (var5 < 0 || var6 < 0 || var5 > class90.field1032 - 1 || (class30.field349 - 1) < var6) {
            return 0;
        }
        int var7 = arg3;
        if (arg3 < 3 && (class443.field6617[1][var5][var6] & 0x2) != 0) {
            var7 = arg3 + 1;
        }
        return class435.field6449[var7].method249(arg1, arg0);
    }
}
