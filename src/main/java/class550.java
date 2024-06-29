import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class550 extends class16 {

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "Z")
    private boolean field7853 = false;

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "Lgq;")
    private class470 field7852;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "[I")
    public static int[] field7849 = new int[14];

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
    public static int field7847 = 0;

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "Lkfa;")
    public static class549 field7858 = new class549(0, 7);

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "[I")
    public static int[] field7859 = new int[1000];

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
    public static int field7848;

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "I")
    public static int field7850;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "I")
    public static int field7851;

    @OriginalMember(owner = "client!qs", name = "k", descriptor = "I")
    public static int field7854;

    @OriginalMember(owner = "client!qs", name = "l", descriptor = "I")
    public static int field7855;

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "I")
    public static int field7856;

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "I")
    public static int field7857;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Liaa;I)Lbo;")
    public static final class665 method3106(class452 arg0, int arg1) {
        ++field7855;
        class665 var2 = new class665();
        var2.field9456 = arg0.method2574(-1758460248);
        var2.field9455 = class58.field599.method1516(arg1, var2.field9456);
        return var2;
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lap;)V")
    public class550(class435 arg0) {
        super(arg0);
        if (arg0.field6046) {
            this.field7852 = new class470(arg0, 2);
            this.field7852.method2667(0, -30923);
            super.field141.method2380(1, (byte) -80);
            super.field141.method2371(34165, 7681, -128);
            super.field141.method2372(2, false, 770, 34168);
            super.field141.method2390(34167, true, 0, 770);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field141.method2380(0, (byte) -92);
            this.field7852.method2668(1);
            this.field7852.method2667(1, -30923);
            super.field141.method2380(1, (byte) -77);
            super.field141.method2371(8448, 8448, -76);
            super.field141.method2372(2, false, 770, 34166);
            super.field141.method2390(5890, true, 0, 770);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field141.method2380(0, (byte) -86);
            this.field7852.method2668(1);
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V")
    public static void method3107(int arg0) {
        if (arg0 != 9472) {
            field7849 = null;
        }
        field7859 = null;
        field7858 = null;
        field7849 = null;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V")
    public final void method48(byte arg0) {
        int var2 = -79 / ((-29 - arg0) / 51);
        if (!this.field7853) {
            super.field141.method2390(5890, true, 0, 770);
        } else {
            this.field7852.method2666('\u0001', (byte) 110);
            super.field141.method2380(1, (byte) -76);
            super.field141.method2388((byte) -58, (class412) null);
            super.field141.method2380(0, (byte) -126);
        }
        ++field7854;
        super.field141.method2371(8448, 8448, -83);
        this.field7853 = false;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)Z")
    public final boolean method52(int arg0) {
        if (arg0 != 12733) {
            return false;
        } else {
            ++field7850;
            return true;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIZ)V")
    public final void method42(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.method46((byte) 122, false);
        }
        ++field7856;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZB)V")
    public final void method50(boolean arg0, byte arg1) {
        ++field7857;
        class310 var3 = super.field141.method2394(2);
        if (arg1 != 42) {
            this.method50(false, (byte) -56);
        }
        if (this.field7852 != null && var3 != null && arg0) {
            this.field7852.method2666('\u0000', (byte) 110);
            super.field141.method2380(1, (byte) -83);
            super.field141.method2388((byte) 106, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field141.field6011.method3347(0), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field141.method2380(0, (byte) -81);
            this.field7853 = true;
        } else {
            super.field141.method2390(34168, true, 0, 770);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(BZ)V")
    public final void method46(byte arg0, boolean arg1) {
        if (arg0 != -61) {
            this.method50(false, (byte) 70);
        }
        ++field7851;
        super.field141.method2371(8448, 7681, -73);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IILuda;)V")
    public final void method44(int arg0, int arg1, class412 arg2) {
        super.field141.method2388((byte) 93, arg2);
        ++field7848;
        super.field141.method2396(arg0, arg1);
    }
}
