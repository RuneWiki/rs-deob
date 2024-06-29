import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class174 extends class141 {

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "Lpt;")
    private class376 field2596;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "Lsk;")
    private class448 field2607;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public static int field2601 = 0;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "Luv;")
    private class250 field2608;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)Z")
    public final boolean method55(int arg0) {
        if (arg0 != 0) {
            this.method1220(111);
        }
        ++field2602;
        return true;
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V")
    private final void method1220(int arg0) {
        ++field2605;
        this.field2608 = new class250(super.field2178, 2);
        this.field2608.method1622(0, (byte) 69);
        if (arg0 != 30477) {
            this.method48(97);
        }
        super.field2178.method277(1, (byte) 57);
        super.field2178.method275(7681, 260, arg0 ^ 30581);
        super.field2178.method333(false, 34168, 768, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field2178.method277(0, (byte) 112);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field2596.field5415) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field2608.method1624(-22853);
        this.field2608.method1622(1, (byte) 69);
        super.field2178.method277(1, (byte) 124);
        super.field2178.method275(8448, 8448, 127);
        super.field2178.method333(false, 5890, 768, 0);
        OpenGL.glDisable(3168);
        super.field2178.method277(0, (byte) 59);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field2596.field5415) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field2608.method1624(-22853);
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lbt;Lpt;)V")
    public class174(class33 arg0, class376 arg1) {
        super(arg0);
        this.field2596 = arg1;
        this.method1220(30477);
        this.field2607 = new class448(super.field2178, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field2607.method2636(367, false);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lei;II)V")
    public final void method57(class120 arg0, int arg1, int arg2) {
        if (arg2 < 89) {
            this.method57((class120) null, -14, -44);
        }
        ++field2604;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZI)V")
    public final void method53(boolean arg0, int arg1) {
        if (arg1 == 0) {
            super.field2178.method275(260, 8448, arg1 ^ 125);
            ++field2603;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IZ)V")
    public final void method51(int arg0, boolean arg1) {
        if (super.field2178.field673 > 0) {
            float var3 = -0.5F / (float) super.field2178.field673;
            super.field2178.method277(1, (byte) 54);
            class400.field5682[0] = 0.0F;
            class400.field5682[2] = var3;
            class400.field5682[1] = 0.0F;
            class400.field5682[3] = super.field2178.field708 * var3 + 0.25F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class400.field5682, 0);
            OpenGL.glPopMatrix();
            super.field2178.method256((byte) -58, 0.5F, (float) super.field2178.field673);
            super.field2178.method285(false, this.field2607);
            super.field2178.method277(0, (byte) 62);
        }
        ++field2606;
        this.field2608.method1625('\u0000', (byte) -36);
        if (arg0 != -21897) {
            field2601 = -84;
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
    public static final void method1221(byte arg0) {
        if (arg0 != 5) {
            method1221((byte) 58);
        }
        ++field2600;
        if (!class193.field2806) {
            class314.method1991(class47.field898, arg0 ^ 22039);
            if (class277.field4137 != null) {
                class314.method1991(class277.field4137, 22034);
            }
            class193.field2806 = true;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)V")
    public final void method49(int arg0, int arg1, int arg2) {
        if (arg0 != 1400) {
            this.field2596 = null;
        }
        ++field2609;
        if ((1 & arg2) != 1) {
            if (this.field2596.field5415) {
                super.field2178.method285(false, this.field2596.field5411);
                class400.field5682[3] = 0.0F;
                class400.field5682[0] = 0.0F;
                class400.field5682[1] = 0.0F;
                class400.field5682[2] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class400.field5682, 0);
            } else {
                super.field2178.method285(false, this.field2596.field5418[0]);
            }
        } else if (!this.field2596.field5415) {
            int var4 = super.field2178.field625 % 4000 * 16 / 4000;
            super.field2178.method285(false, this.field2596.field5418[var4]);
        } else {
            super.field2178.method285(false, this.field2596.field5411);
            class400.field5682[3] = (float) (super.field2178.field625 % 4000) / 4000.0F;
            class400.field5682[0] = 0.0F;
            class400.field5682[2] = 0.0F;
            class400.field5682[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class400.field5682, 0);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public final void method48(int arg0) {
        ++field2599;
        this.field2608.method1625('\u0001', (byte) -36);
        if (~super.field2178.field673 < -1) {
            super.field2178.method277(1, (byte) 55);
            super.field2178.method285(false, (class120) null);
            super.field2178.method256((byte) -106, 1.0F, 0.0F);
            super.field2178.method277(0, (byte) 115);
        }
        int var2 = -122 % ((arg0 - -51) / 45);
        super.field2178.method275(8448, 8448, 126);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }
}
