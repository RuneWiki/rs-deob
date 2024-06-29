import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class225 extends class202 {

    @OriginalMember(owner = "client!jr", name = "L", descriptor = "Z")
    public static boolean field3771 = false;

    @OriginalMember(owner = "client!jr", name = "I", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!jr", name = "J", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!jr", name = "M", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!jr", name = "N", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!jr", name = "O", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!jr", name = "K", descriptor = "[Z")
    public static boolean[] field3770;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(BI[B)I")
    public static final int method1623(byte arg0, int arg1, byte[] arg2) {
        field3773++;
        return arg0 == -19 ? class7.method60(arg1, arg2, 255, 0) : -64;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1624(boolean arg0, int arg1) {
        field3769++;
        if (arg0) {
            return arg1 == 6 || arg1 == 7 || arg1 == 8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IZ)[I")
    public final int[] method41(int arg0, boolean arg1) {
        if (!arg1) {
            this.method41(111, true);
        }
        field3768++;
        return class476.field7271;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(II[IIIIII)V")
    public static final void method1625(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3772++;
        if (arg3 > 0 && !class357.method2363(-91, arg3)) {
            throw new IllegalArgumentException("");
        } else if (arg4 > 0 && !class357.method2363(arg1 - 33087, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg1 == arg6) {
            int var8 = 0;
            int var9 = arg4 > arg3 ? arg3 : arg4;
            int var10 = arg3 >> 1;
            int var11 = arg4 >> 1;
            int[] var12 = arg2;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg0, var8, arg7, arg3, arg4, 0, arg6, arg5, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = var15 + arg3;
                for (int var17 = 0; var17 < var11; var17++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var16++];
                        int var22 = var12[var15++];
                        int var23 = var20 >> 16 & 0xFF;
                        int var24 = (var20 & 0xFFC8) >> 8;
                        int var25 = var12[var16++];
                        int var26 = var20 & 0xFF;
                        int var27 = var20 >> 24 & 0xFF;
                        int var28 = ((var22 & 0xFF0B) >> 8) + var24;
                        int var29 = (var22 & 0xFF) + var26;
                        int var30 = (var22 >> 16 & 0xFF) + var23;
                        int var31 = (var22 >> 24 & 0xFF) + var27;
                        int var32 = (var21 >> 8 & 0xFF) + var28;
                        int var33 = (var21 >> 24 & 0xFF) + var31;
                        int var34 = ((var21 & 0xFFFAC5) >> 16) + var30;
                        int var35 = (var21 & 0xFF) + var29;
                        int var36 = (var25 >> 16 & 0xFF) + var34;
                        int var37 = (var25 >> 24 & 0xFF) + var33;
                        int var38 = (var25 & 0xFF) + var35;
                        int var39 = (var25 >> 8 & 0xFF) + var32;
                        var13[var14++] = class410.method2621(class410.method2621(class272.method1842(var39, 1020) << 6, class410.method2621(class272.method1842(var37 << 22, -16777216), class272.method1842(1020, var36) << 14)), class272.method1842(var38, 1020) >> 2);
                    }
                    var15 += arg3;
                    var16 += arg3;
                }
                int[] var18 = var13;
                var13 = var12;
                var12 = var18;
                arg3 = var10;
                arg4 = var11;
                var11 >>= 0x1;
                var8++;
                var10 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "(III)V")
    public static final void method1626(int arg0, int arg1, int arg2) {
        field3774++;
        if (class103.field1514 == 1) {
            class155.method944(0, class419.field6352, arg1, arg0);
        } else if (class103.field1514 == 2) {
            class450.method2838((byte) -18, arg0, arg1);
        }
        class103.field1514 = arg2;
        class419.field6352 = null;
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "()V")
    public class225() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "(I)V")
    public static void method1627(int arg0) {
        if (arg0 == -167) {
            field3770 = null;
        }
    }
}
