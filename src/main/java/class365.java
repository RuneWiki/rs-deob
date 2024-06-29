import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class365 extends class146 {

    @OriginalMember(owner = "client!rba", name = "u", descriptor = "Lgi;")
    private class583 field4970;

    @OriginalMember(owner = "client!rba", name = "v", descriptor = "Lnm;")
    private class403 field4971;

    @OriginalMember(owner = "client!rba", name = "l", descriptor = "I")
    public static int field4961 = -1;

    @OriginalMember(owner = "client!rba", name = "t", descriptor = "I")
    public static int field4969 = 1;

    @OriginalMember(owner = "client!rba", name = "n", descriptor = "Lh;")
    public static class571 field4963 = new class571(4);

    @OriginalMember(owner = "client!rba", name = "m", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!rba", name = "o", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!rba", name = "p", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!rba", name = "q", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!rba", name = "r", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!rba", name = "s", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)Lnm;")
    public final class403 method11(int arg0) {
        int var2 = 95 / ((43 - arg0) / 57);
        field4967++;
        return this.field4971;
    }

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "(I)I")
    public final int method2190(int arg0) {
        field4964++;
        if (arg0 < 54) {
            this.method11(-99);
        }
        return this.field4971.field5733;
    }

    @OriginalMember(owner = "client!rba", name = "d", descriptor = "(I)V")
    public static void method2191(int arg0) {
        field4963 = null;
        if (arg0 >= -83) {
            method2191(24);
        }
    }

    @OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lgi;I)V")
    public class365(class583 arg0, int arg1) {
        this.field4970 = arg0;
        this.field4971 = new class403(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lnm;BFLnm;)Z")
    public final boolean method2192(class403 arg0, byte arg1, float arg2, class403 arg3) {
        field4968++;
        boolean var5 = true;
        class45 var6 = this.field4970.field8341;
        this.field4970.method1350(class541.field7537);
        this.field4970.method1269();
        this.field4970.method3377(-948554512);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field4971.field5733, this.field4971.field5733);
        this.field4970.method3402(true, false);
        this.field4970.method3330(false, (byte) 36);
        this.field4970.method3375(true, false);
        this.field4970.method3331(false, -25107);
        this.field4970.method3408(-2, (byte) 74);
        this.field4970.method3398(-79, 1);
        if (arg1 != 87) {
            return false;
        }
        this.field4970.method3360(0.0F, 0.0F, arg2, (byte) -105, 0.0F);
        this.field4970.method3389(false, 34165, 34165);
        this.field4970.method3358(32886, arg0);
        this.field4970.method3398(-39, 0);
        this.field4970.method3396((byte) 32, 1);
        this.field4970.method3358(32886, arg3);
        this.field4970.method3350(arg1 - 2525, var6);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method441(4962, var8, 0, this.field4971);
            var6.method453(82, 0);
            if (!var6.method448(-116)) {
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
        var6.method452((byte) -62, 0);
        this.field4970.method3395(var6, 14032);
        this.field4970.method3398(-62, 1);
        this.field4970.method3358(32886, null);
        this.field4970.method3389(false, 8448, 8448);
        this.field4970.method3398(arg1 ^ 0xFFFFFFC4, 0);
        this.field4970.method3358(32886, null);
        OpenGL.glPopAttrib();
        this.field4970.method1308(class541.field7537[0], class541.field7537[1], class541.field7537[2], class541.field7537[3]);
        if (var5 && !this.field4970.field8248) {
            this.field4971.method2510((byte) -98);
        }
        return var5;
    }
}
