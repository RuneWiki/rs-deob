import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class555 extends class390 {

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public int field7900;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public static int field7897;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field7898;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field7899;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "[[[J")
    public static long[][][] field7896;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V", line = 6)
    public static void method3228(int arg0) {
        field7896 = null;
        if (arg0 != 255) {
            method3228(105);
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(ILfda;Laba;III)V", line = 16)
    public class555(int arg0, class336 arg1, class185 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field7900 = arg5;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)Lve;", line = 25)
    public final class527 method606(int arg0) {
        field7897++;
        return arg0 == 0 ? class585.field8276 : null;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V", line = 39)
    public static final void method3229(int arg0) {
        if (arg0 != 1768712033) {
            return;
        }
        field7899++;
        if (class638.field8979 == null) {
            return;
        }
        if (class607.field8578) {
            class483.method2830(6169);
        }
        class619.field8726.method3719(0);
        class1.method8();
        class281.method1905((byte) 106);
        class228.method1578(-7);
        class201.method1447(-98);
        class673.method3814(true);
        if (class656.field9247 != null) {
            class656.field9247.method3846(true);
        }
        class197.method1424(-51);
        class497.method2902((byte) 43);
        class249.method1666(arg0 - 1768711916);
        class315.method2072(121);
        class272.method1769(-374497842, false);
        for (int var1 = 0; var1 < 2048; var1++) {
            class559 var5 = class581.field8250[var1];
            if (var5 != null) {
                for (int var6 = 0; var6 < var5.field6439.length; var6++) {
                    var5.field6439[var6] = null;
                }
            }
        }
        for (int var2 = 0; var2 < class662.field9292; var2++) {
            class645 var3 = class642.field9044[var2].field262;
            if (var3 != null) {
                for (int var4 = 0; var4 < var3.field6439.length; var4++) {
                    var3.field6439[var4] = null;
                }
            }
        }
        class13.field256 = null;
        class235.field3402 = null;
        class638.field8979.method450(1);
        class638.field8979 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([IIIIIIII)V", line = 120)
    public static final void method3230(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7898++;
        if (arg4 > 0 && !class315.method2071(-126, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg2 > 0 && !class315.method2071(arg5 - 381, arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg3 == 32993) {
            int var8 = 0;
            int var9 = arg4 >= arg2 ? arg2 : arg4;
            int var10 = arg4 >> 1;
            int var11 = arg2 >> 1;
            int[] var12 = arg0;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg1, var8, arg6, arg4, arg2, 0, arg3, arg7, var12, 0);
                if (var9 <= 1) {
                    if (arg5 != 255) {
                        method3228(70);
                        return;
                    }
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = arg4 + var15;
                for (int var17 = 0; var17 < var11; var17++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var15++];
                        int var22 = var12[var16++];
                        int var23 = var12[var16++];
                        int var24 = (var20 & 0xFFD713) >> 16;
                        int var25 = var20 >> 8 & 0xFF;
                        int var26 = var20 >> 24 & 0xFF;
                        int var27 = var20 & 0xFF;
                        int var28 = (var21 >> 24 & 0xFF) + var26;
                        int var29 = (var21 >> 16 & 0xFF) + var24;
                        int var30 = (var21 & 0xFF) + var27;
                        int var31 = (var21 >> 8 & 0xFF) + var25;
                        int var32 = (var22 >> 8 & 0xFF) + var31;
                        int var33 = ((var22 & 0xFF9BAB) >> 16) + var29;
                        int var34 = (var22 >> 24 & 0xFF) + var28;
                        int var35 = (var22 & 0xFF) + var30;
                        int var36 = (var23 >> 24 & 0xFF) + var34;
                        int var37 = (var23 >> 16 & 0xFF) + var33;
                        int var38 = (var23 & 0xFF) + var35;
                        int var39 = (var23 >> 8 & 0xFF) + var32;
                        var13[var14++] = class281.method1904(class111.method773(var38 >> 2, 255), class281.method1904(class111.method773(65280, var39 << 6), class281.method1904(class111.method773(1020, var36) << 22, class111.method773(var37 << 14, 16711680))));
                    }
                    var15 += arg4;
                    var16 += arg4;
                }
                int[] var18 = var13;
                var13 = var12;
                arg4 = var10;
                var12 = var18;
                arg2 = var11;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var11 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
