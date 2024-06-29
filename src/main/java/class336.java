import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class336 extends class541 {

    @OriginalMember(owner = "client!mo", name = "D", descriptor = "I")
    private int field4940;

    @OriginalMember(owner = "client!mo", name = "y", descriptor = "[I")
    public static int[] field4935 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!mo", name = "E", descriptor = "[I")
    public static int[] field4941 = new int[1000];

    @OriginalMember(owner = "client!mo", name = "w", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!mo", name = "x", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!mo", name = "A", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!mo", name = "B", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!mo", name = "C", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!mo", name = "z", descriptor = "Z")
    public static boolean field4936;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIIIII[I)V")
    public static final void method2096(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
        ++field4933;
        if (~arg2 < -1 && !class154.method899(arg2, 72)) {
            throw new IllegalArgumentException("");
        } else if (~arg3 < -1 && !class154.method899(arg3, arg6 ^ 477614485)) {
            throw new IllegalArgumentException("");
        } else {
            if (arg6 != 477614584) {
                method2097((byte) -4);
            }
            if (~arg5 != -32994) {
                throw new IllegalArgumentException("");
            } else {
                int var8 = 0;
                int var9 = ~arg2 <= ~arg3 ? arg3 : arg2;
                int var10 = arg2 >> 1;
                int var11 = arg3 >> 1;
                int[] var12 = arg7;
                int[] var13 = new int[var10 * var11];
                while (true) {
                    OpenGL.glTexImage2Di(arg1, var8, arg0, arg2, arg3, 0, arg5, arg4, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = arg2 + var15;
                    int[] var17 = var13;
                    for (int var18 = 0; var18 < var11; ++var18) {
                        for (int var19 = 0; var10 > var19; ++var19) {
                            int var20 = var12[var15++];
                            int var21 = var12[var15++];
                            int var22 = var12[var16++];
                            int var23 = (16770794 & var20) >> 16;
                            int var24 = var12[var16++];
                            int var25 = (var20 & 65353) >> 8;
                            int var26 = var20 >> 24 & 255;
                            int var27 = 255 & var20;
                            int var28 = (255 & var21 >> 16) + var23;
                            int var29 = (var21 & 255) + var27;
                            int var30 = (255 & var21 >> 8) + var25;
                            int var31 = (var21 >> 24 & 255) + var26;
                            int var32 = (var22 & 255) + var29;
                            int var33 = (var22 >> 16 & 255) + var28;
                            int var34 = (255 & var22 >> 8) + var30;
                            int var35 = (255 & var22 >> 24) + var31;
                            int var36 = (var24 >> 24 & 255) + var35;
                            int var37 = ((var24 & 16733561) >> 16) + var33;
                            int var38 = (255 & var24) + var32;
                            int var39 = (255 & var24 >> 8) + var34;
                            var13[var14++] = class313.method1926(class313.method1926(class313.method1926(class637.method3693(1020, var36) << 22, class637.method3693(var37, 1020) << 14), class637.method3693(var39 << 6, 65280)), class637.method3693(1020, var38) >> 2);
                        }
                        var16 += arg2;
                        var15 += arg2;
                    }
                    var13 = var12;
                    arg2 = var10;
                    arg3 = var11;
                    var12 = var17;
                    var11 >>= 1;
                    var9 >>= 1;
                    var10 >>= 1;
                    ++var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "(B)V")
    public static void method2097(byte arg0) {
        field4941 = null;
        if (arg0 != 39) {
            field4936 = true;
        }
        field4935 = null;
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(ZI)V")
    public final void method2098(boolean arg0, int arg1) {
        ++field4939;
        super.field8091.method2811(this, -2);
        if (arg1 == -1209865776) {
            OpenGL.glTexParameteri(super.field8096, 10242, !arg0 ? 33071 : 10497);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V")
    public final void method1363(byte arg0) {
        if (arg0 != -19) {
            field4934 = -21;
        }
        ++field4938;
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(II)V")
    public static final void method2099(int arg0, int arg1) {
        ++field4937;
        class552.method3231(false);
        int var2 = class239.field3501.method3654(arg1, arg0 + -8102).field1331;
        if (~var2 != -1) {
            int var3 = class406.field5823.field1405[arg1];
            if (var2 == 5) {
                class579.field8532 = var3;
            }
            if (~var2 == arg0) {
                class419.field6027 = var3;
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Los;II[BI)V")
    public class336(class468 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field4940 = arg2;
        super.field8091.method2811(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field8096, 0, super.field8095, this.field4940, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method3174(true, -17759);
    }
}
