import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class458 extends class24 {

    @OriginalMember(owner = "client!jh", name = "F", descriptor = "Lvd;")
    private class258 field6701;

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "Lui;")
    private class487 field6696;

    @OriginalMember(owner = "client!jh", name = "G", descriptor = "[Lki;")
    public static class232[] field6702 = new class232[16];

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "I")
    public static int field6695;

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "I")
    public static int field6697;

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
    public static int field6698;

    @OriginalMember(owner = "client!jh", name = "D", descriptor = "I")
    public static int field6699;

    @OriginalMember(owner = "client!jh", name = "E", descriptor = "I")
    public static int field6700;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)I", line = 3)
    public final int method2657(byte arg0) {
        field6699++;
        if (arg0 != 103) {
            this.field6701 = null;
        }
        return this.field6696.field7244;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)Lui;", line = 14)
    public final class487 method244(int arg0) {
        if (arg0 != 0) {
            this.method244(-56);
        }
        field6700++;
        return this.field6696;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)Z", line = 27)
    public static final boolean method2658(byte arg0) {
        field6698++;
        if (arg0 != 36) {
            field6702 = null;
        }
        return class448.field6610 > 0;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lui;IFLui;)Z", line = 43)
    public final boolean method2659(class487 arg0, int arg1, float arg2, class487 arg3) {
        field6695++;
        boolean var5 = true;
        class476 var6 = this.field6701.field3825;
        this.field6701.method109(class391.field5876);
        this.field6701.method94();
        this.field6701.method1544(arg1 + 1097841175);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field6696.field7244, this.field6696.field7244);
        this.field6701.method1596(false, false);
        this.field6701.method1574(false, arg1 ^ 0xFFFFFFBA);
        this.field6701.method1571(true, false);
        this.field6701.method1557(arg1 ^ 0x4873, false);
        this.field6701.method1613(-2, -1);
        this.field6701.method1553(1, -8156);
        this.field6701.method1550(arg2, 0.0F, false, 0.0F, 0.0F);
        this.field6701.method1576(34165, 34165, (byte) 82);
        this.field6701.method1546(-2, arg3);
        this.field6701.method1553(0, -8156);
        this.field6701.method1582(1, true);
        this.field6701.method1546(-2, arg0);
        this.field6701.method1568(var6, 86);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method2838(0, var8, false, this.field6696);
            var6.method2834(-1, 0);
            if (!var6.method2832((byte) -72)) {
                var5 = false;
                break;
            }
            OpenGL.glBegin(7);
            if (var8 == 34069) {
                OpenGL.glTexCoord3i(65535, 65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65535, 65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65535, -65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(65535, -65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34070) {
                OpenGL.glTexCoord3i(-65535, 65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(-65535, 65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(-65535, -65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65535, -65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34071) {
                OpenGL.glTexCoord3i(-65534, 65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, 65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34072) {
                OpenGL.glTexCoord3i(-65534, -65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, -65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34073) {
                OpenGL.glTexCoord3i(-65534, 65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, -65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34074) {
                OpenGL.glTexCoord3i(65534, 65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(-65534, 65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(-65534, -65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(65534, -65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
                OpenGL.glVertex2f(0.0F, 1.0F);
            }
            OpenGL.glEnd();
        }
        var6.method2833(0, (byte) 62);
        this.field6701.method1554(var6, 12644);
        this.field6701.method1553(arg1, -8156);
        this.field6701.method1546(-2, null);
        this.field6701.method1576(8448, 8448, (byte) 39);
        this.field6701.method1553(0, -8156);
        this.field6701.method1546(-2, null);
        OpenGL.glPopAttrib();
        this.field6701.method84(class391.field5876[0], class391.field5876[1], class391.field5876[2], class391.field5876[3]);
        if (var5 && !this.field6701.field3768) {
            this.field6696.method1694(true);
        }
        return var5;
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)V", line = 237)
    public static void method2660(int arg0) {
        if (arg0 >= 33) {
            field6702 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lvd;I)V", line = 246)
    public class458(class258 arg0, int arg1) {
        this.field6701 = arg0;
        this.field6696 = new class487(arg0, 6408, arg1);
    }
}
