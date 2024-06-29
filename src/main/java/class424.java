import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class424 extends class363 {

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "Z")
    private boolean field6365 = false;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "Lbw;")
    private class483 field6373;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public static int field6367 = 0;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "F")
    public static float field6363;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field6362;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    public static int field6368;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "[I")
    public static int[] field6364;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V", line = 6)
    public final void method120(boolean arg0) {
        ++field6370;
        if (!this.field6365) {
            super.field5564.method2135(0, 5890, -61, 770);
        } else {
            this.field6373.method2863(arg0, '\u0001');
            super.field5564.method2176(1, 71);
            super.field5564.method2200((class446) null, (byte) 114);
            super.field5564.method2176(0, 63);
        }
        super.field5564.method2131(34162, 8448, 8448);
        this.field6365 = arg0;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)Z", line = 28)
    public final boolean method126(int arg0) {
        ++field6368;
        int var2 = 32 / ((arg0 - 37) / 48);
        return true;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZI)V", line = 40)
    public final void method125(boolean arg0, int arg1) {
        ++field6369;
        if (arg1 >= -69) {
            field6372 = -85;
        }
        class374 var3 = super.field5564.method2151((byte) 95);
        if (this.field6373 != null && var3 != null && arg0) {
            this.field6373.method2863(false, '\u0000');
            super.field5564.method2176(1, 68);
            super.field5564.method2200(var3, (byte) 123);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field5564.field5335.method1551(0), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field5564.method2176(0, 52);
            this.field6365 = true;
        } else {
            super.field5564.method2135(0, 34168, -81, 770);
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lod;)V", line = 67)
    public class424(class349 arg0) {
        super(arg0);
        if (arg0.field5348) {
            this.field6373 = new class483(arg0, 2);
            this.field6373.method2869(0, 81);
            super.field5564.method2176(1, 82);
            super.field5564.method2131(34162, 7681, 34165);
            super.field5564.method2156(34168, 770, 2969, 2);
            super.field5564.method2135(0, 34167, -60, 770);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field5564.method2176(0, 122);
            this.field6373.method2870(1952872654);
            this.field6373.method2869(1, 102);
            super.field5564.method2176(1, 78);
            super.field5564.method2131(34162, 8448, 8448);
            super.field5564.method2156(34166, 770, 2969, 2);
            super.field5564.method2135(0, 5890, -109, 770);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field5564.method2176(0, 58);
            this.field6373.method2870(1952872654);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V", line = 106)
    public static final void method2544(byte arg0) {
        class226 var1 = class111.field1596;
        synchronized (class111.field1596) {
            class111.field1596.method1540(0);
        }
        if (arg0 == -119) {
            ++field6366;
            class226 var2 = class359.field5506;
            synchronized (class359.field5506) {
                class359.field5506.method1540(0);
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljk;IB)V", line = 123)
    public final void method121(class446 arg0, int arg1, byte arg2) {
        super.field5564.method2200(arg0, (byte) 117);
        if (arg2 <= -69) {
            ++field6362;
            super.field5564.method2186(arg1, -115);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZB)V", line = 139)
    public final void method122(boolean arg0, byte arg1) {
        if (arg1 != 52) {
            method2545(-75);
        }
        ++field6374;
        super.field5564.method2131(34162, 7681, 8448);
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V", line = 158)
    public static void method2545(int arg0) {
        if (arg0 < 70) {
            method2545(57);
        }
        field6364 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)V", line = 168)
    public final void method128(int arg0, int arg1, int arg2) {
        ++field6371;
        if (arg1 >= -13) {
            field6367 = 122;
        }
    }
}
