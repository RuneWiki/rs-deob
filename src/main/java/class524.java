import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class524 extends class246 {

    @OriginalMember(owner = "client!kr", name = "r", descriptor = "C")
    public char field7760;

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "I")
    public static int field7754;

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "I")
    public int field7755;

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "I")
    public static int field7756;

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "I")
    public static int field7757;

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "I")
    public static int field7758;

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "I")
    public int field7759;

    @OriginalMember(owner = "client!kr", name = "s", descriptor = "I")
    public static int field7761;

    @OriginalMember(owner = "client!kr", name = "u", descriptor = "I")
    public static int field7763;

    @OriginalMember(owner = "client!kr", name = "t", descriptor = "J")
    public long field7762;

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "Lkr;")
    public class524 field7751;

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "Z")
    public static boolean field7752;

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "Z")
    public boolean field7753;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method1650(int arg0) {
        field7757++;
        return arg0 > -103 ? true : this.field7753;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)I", line = 16)
    public final int method1655(boolean arg0) {
        if (arg0) {
            field7754++;
            return this.field7755;
        } else {
            return -19;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(II[IIIIII)V", line = 27)
    public static final void method3100(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7756++;
        if (arg3 > 0 && !class415.method2495(arg0 ^ 0xFE, arg3)) {
            throw new IllegalArgumentException("");
        } else if (arg6 > 0 && !class415.method2495(1, arg6)) {
            throw new IllegalArgumentException("");
        } else if (arg4 == 32993) {
            int var8 = 0;
            int var9 = arg6 <= arg3 ? arg6 : arg3;
            int var10 = arg3 >> 1;
            int var11 = arg6 >> 1;
            int[] var12 = arg2;
            int[] var13 = new int[var10 * var11];
            if (arg0 != 255) {
                field7752 = true;
            }
            while (true) {
                OpenGL.glTexImage2Di(arg1, var8, arg7, arg3, arg6, 0, arg4, arg5, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = arg3 + var15;
                int[] var17 = var13;
                for (int var18 = 0; var18 < var11; var18++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var15++];
                        int var22 = var12[var16++];
                        int var23 = var20 & 0xFF;
                        int var24 = (var20 & 0xFF82) >> 8;
                        int var25 = var12[var16++];
                        int var26 = (var20 & 0xFF751B) >> 16;
                        int var27 = var20 >> 24 & 0xFF;
                        int var28 = (var21 & 0xFF) + var23;
                        int var29 = ((var21 & 0xFF3D77) >> 16) + var26;
                        int var30 = (var21 >> 24 & 0xFF) + var27;
                        int var31 = (var21 >> 8 & 0xFF) + var24;
                        int var32 = (var22 >> 24 & 0xFF) + var30;
                        int var33 = (var22 & 0xFF) + var28;
                        int var34 = ((var22 & 0xFF60) >> 8) + var31;
                        int var35 = (var22 >> 16 & 0xFF) + var29;
                        int var36 = ((var25 & 0xFFEE) >> 8) + var34;
                        int var37 = (var25 & 0xFF) + var33;
                        int var38 = (var25 >> 16 & 0xFF) + var35;
                        int var39 = (var25 >> 24 & 0xFF) + var32;
                        var13[var14++] = class18.method119(class18.method119(class286.method1847(65280, var36 << 6), class18.method119(class286.method1847(16711680, var38 << 14), class286.method1847(-16777216, var39 << 22))), class286.method1847(255, var37 >> 2));
                    }
                    var16 += arg3;
                    var15 += arg3;
                }
                var13 = var12;
                arg6 = var11;
                arg3 = var10;
                var12 = var17;
                var11 >>= 0x1;
                var8++;
                var9 >>= 0x1;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)C", line = 143)
    public final char method1658(int arg0) {
        field7763++;
        return arg0 == 255 ? this.field7760 : '7';
    }

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "(I)J", line = 154)
    public final long method1660(int arg0) {
        field7761++;
        return arg0 == 15690 ? this.field7762 : 29L;
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)I", line = 173)
    public final int method1656(byte arg0) {
        if (arg0 != 25) {
            this.method1658(-94);
        }
        field7758++;
        return this.field7759;
    }
}
