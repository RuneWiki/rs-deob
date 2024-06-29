import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class492 {

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    private int field7180;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field7177 = 0;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field7173 = 0;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field7178 = 0;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "Z")
    public static boolean field7175 = false;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field7174;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field7179;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public static int field7181;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    public static int field7182;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III[BIII)V", line = 7)
    public static final void method2880(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        field7174++;
        if (arg0 > 0 && !class226.method1402(arg0, (byte) -89)) {
            throw new IllegalArgumentException("");
        } else if (arg2 <= 0 || class226.method1402(arg2, (byte) -123)) {
            int var7 = class359.method2149(arg4, 4);
            int var8 = 0;
            int var9 = arg2 <= arg0 ? arg2 : arg0;
            int var10 = arg0 >> 1;
            int var11 = arg2 >> 1;
            byte[] var12 = arg3;
            if (arg6 > -105) {
                field7175 = true;
            }
            byte[] var13 = new byte[var7 * var11 * var10];
            while (true) {
                OpenGL.glTexImage2Dub(arg1, var8, arg5, arg0, arg2, 0, arg4, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg0 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            int var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var13[var17] = (byte) (var27 >> 2);
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                byte[] var16 = var13;
                var13 = var12;
                arg2 = var11;
                arg0 = var10;
                var12 = var16;
                var8++;
                var10 >>= 0x1;
                var11 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IC)V", line = 106)
    public final void method2881(int arg0, char arg1) {
        OpenGL.glCallList(this.field7180 + arg1);
        field7182++;
        if (arg0 != 0) {
            method2882(-85, 96);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)V", line = 118)
    public static final void method2882(int arg0, int arg1) {
        class434.field6366 = arg0;
        field7181++;
        if (arg1 == -2) {
            class89.field1301.method1068(0);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V", line = 135)
    public final void method2883(int arg0) {
        OpenGL.glEndList();
        if (arg0 == -30137) {
            field7176++;
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lef;I)V", line = 152)
    public class492(class338 arg0, int arg1) {
        this.field7180 = OpenGL.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)V", line = 171)
    public final void method2884(int arg0, int arg1) {
        field7179++;
        OpenGL.glNewList(this.field7180 + arg1, arg0);
    }
}
