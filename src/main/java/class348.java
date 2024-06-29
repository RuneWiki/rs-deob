import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class348 extends class695 {

    @OriginalMember(owner = "client!afa", name = "A", descriptor = "I")
    private int field4493;

    @OriginalMember(owner = "client!afa", name = "x", descriptor = "Lkg;")
    public static class275 field4490 = new class275(38, -2);

    @OriginalMember(owner = "client!afa", name = "y", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!afa", name = "z", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!afa", name = "B", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!afa", name = "C", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!afa", name = "D", descriptor = "Z")
    public static boolean field4496;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(BI)V")
    public static final void method2043(byte arg0, int arg1) {
        if (arg0 != 72) {
            method2046((byte) -50);
        }
        ++field4491;
        class37 var2 = class636.method3571(17, arg1, -39);
        var2.method230(arg0 ^ -18);
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)V")
    public final void method633(int arg0) {
        ++field4495;
        if (arg0 > -70) {
            method2044(-65, 68, 60, 119, 107, -85, 17, 9);
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2044(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field4492;
        int var8 = arg2 - 334;
        if (~var8 > -1) {
            var8 = 0;
        } else if (~var8 < -101) {
            var8 = 100;
        }
        int var9 = (class324.field4171 - class699.field9726) * var8 / 100 + class699.field9726;
        int var10 = arg0 * var9 >> 8;
        class286.field3600 = class286.field3598 * var9 >> 8;
        int var11 = 16383 & 16384 - arg3;
        if (arg6 <= 107) {
            method2044(-44, 53, -78, -114, -113, 18, -30, 17);
        }
        int var12 = 16383 & -arg5 + 16384;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (~var11 != -1) {
            var14 = class16.field320[var11] * -var10 >> 14;
            var15 = class16.field322[var11] * var10 >> 14;
        }
        if (~var12 != -1) {
            var13 = class16.field320[var12] * var15 >> 14;
            var15 = class16.field322[var12] * var15 >> 14;
        }
        class450.field5953 = -var13 + arg4;
        class318.field4121 = -var15 + arg7;
        class66.field954 = arg1 - var14;
        class206.field2731 = arg5;
        class33.field544 = arg3;
        class115.field1704 = 0;
    }

    @OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lbi;II[BI)V")
    public class348(class483 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field4493 = arg2;
        super.field9655.method2850(64, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field9659, 0, super.field9670, this.field4493, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method3898(true, 110);
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(IZ)V")
    public final void method2045(int arg0, boolean arg1) {
        ++field4494;
        if (arg0 != -15179) {
            field4496 = false;
        }
        super.field9655.method2850(arg0 + 15111, this);
        OpenGL.glTexParameteri(super.field9659, 10242, !arg1 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "(B)V")
    public static void method2046(byte arg0) {
        if (arg0 != -116) {
            field4490 = null;
        }
        field4490 = null;
    }
}
