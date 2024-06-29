import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class296 extends class384 {

    @OriginalMember(owner = "client!q", name = "y", descriptor = "Lug;")
    private class395 field3797;

    @OriginalMember(owner = "client!q", name = "z", descriptor = "Lnn;")
    private class288 field3798;

    @OriginalMember(owner = "client!q", name = "D", descriptor = "I")
    public static int field3802 = 0;

    @OriginalMember(owner = "client!q", name = "A", descriptor = "Z")
    public static boolean field3799 = false;

    @OriginalMember(owner = "client!q", name = "F", descriptor = "Ldq;")
    public static class493 field3804 = new class493(4, 20);

    @OriginalMember(owner = "client!q", name = "t", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!q", name = "B", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!q", name = "C", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!q", name = "E", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!q", name = "G", descriptor = "[I")
    public static int[] field3805;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIB)I", line = 4)
    public static final int method1736(int arg0, int arg1, byte arg2) {
        if (arg2 != 121) {
            method1741((byte) -73, null);
        }
        field3795++;
        int var3 = arg0 >> 31 & arg1 - 1;
        return ((arg0 >>> 31) + arg0) % arg1 + var3;
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(B)Lnn;", line = 21)
    public final class288 method1737(byte arg0) {
        if (arg0 <= 84) {
            field3802 = -33;
        }
        field3796++;
        return this.field3798;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILnn;FLnn;)Z", line = 33)
    public final boolean method1738(int arg0, class288 arg1, float arg2, class288 arg3) {
        field3801++;
        boolean var5 = true;
        class279 var6 = this.field3797.field5524;
        this.field3797.method267(class524.field7752);
        this.field3797.method318();
        this.field3797.method2333((byte) 72);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field3798.field3677, this.field3798.field3677);
        this.field3797.method2344(-58, false);
        this.field3797.method2325((byte) 115, false);
        this.field3797.method2311(false, (byte) 102);
        this.field3797.method2337(false, -126);
        if (arg0 != 33985) {
            return false;
        }
        this.field3797.method2349((byte) 114, -2);
        this.field3797.method2321(1, 25322);
        this.field3797.method2273(0.0F, 0.0F, arg2, (byte) -117, 0.0F);
        this.field3797.method2271(arg0 ^ 0xFFFF7B4F, 34165, 34165);
        this.field3797.method2322(arg1, 14);
        this.field3797.method2321(0, 25322);
        this.field3797.method2305(arg0 ^ 0x9AC0, 1);
        this.field3797.method2322(arg3, 14);
        this.field3797.method2303(var6, 34165);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method1647(var8, 0, (byte) 70, this.field3798);
            var6.method1645(true, 0);
            if (!var6.method1654(0)) {
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
        var6.method1643(0, 1);
        this.field3797.method2283(-126, var6);
        this.field3797.method2321(1, arg0 - 8663);
        this.field3797.method2322(null, 14);
        this.field3797.method2271(0, 8448, 8448);
        this.field3797.method2321(0, 25322);
        this.field3797.method2322(null, arg0 - 33971);
        OpenGL.glPopAttrib();
        this.field3797.method330(class524.field7752[0], class524.field7752[1], class524.field7752[2], class524.field7752[3]);
        if (var5 && !this.field3797.field5602) {
            this.field3798.method859((byte) 49);
        }
        return var5;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V", line = 233)
    public static void method1739(int arg0) {
        field3805 = null;
        field3804 = null;
        if (arg0 != 1) {
            method1743(73);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)V", line = 245)
    public static final void method1740(int arg0, byte arg1) {
        if (class387.field5105 == null) {
            class387.field5105 = new byte[4][class452.field6526][class440.field6307];
        }
        field3792++;
        for (int var2 = arg0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class452.field6526; var3++) {
                for (int var4 = 0; var4 < class440.field6307; var4++) {
                    class387.field5105[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BLhd;)Lhd;", line = 280)
    public static final class523 method1741(byte arg0, class523 arg1) {
        field3794++;
        if (arg0 != 96) {
            method1743(78);
        }
        class523 var2 = client.method1231(arg1);
        if (var2 == null) {
            var2 = arg1.field7569;
        }
        return var2;
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)I", line = 297)
    public final int method1742(int arg0) {
        if (arg0 != 65534) {
            this.method1737((byte) -113);
        }
        field3803++;
        return this.field3798.field3677;
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(I)V", line = 308)
    public static final void method1743(int arg0) {
        field3793++;
        if (class162.field2059) {
            return;
        }
        class162.field2059 = true;
        class469.field6792 = true;
        if (arg0 != 33985) {
            return;
        }
        if (class407.field5817.field3615) {
            class49.field629 = ((int) class49.field629 + 47 & 0xFFFFFFF0);
        } else {
            class59.field773 += (12.0F - class59.field773) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lug;I)V", line = 333)
    public class296(class395 arg0, int arg1) {
        this.field3797 = arg0;
        this.field3798 = new class288(arg0, 6408, arg1);
    }
}
