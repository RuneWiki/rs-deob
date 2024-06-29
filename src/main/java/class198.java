import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class198 extends class518 {

    @OriginalMember(owner = "client!lba", name = "w", descriptor = "Lpba;")
    private class472 field2617;

    @OriginalMember(owner = "client!lba", name = "k", descriptor = "Lofa;")
    private class100 field2605;

    @OriginalMember(owner = "client!lba", name = "s", descriptor = "Ljj;")
    public static class398 field2613 = new class398(28, 11);

    @OriginalMember(owner = "client!lba", name = "z", descriptor = "Lcb;")
    public static class318 field2620 = new class318(9, 0);

    @OriginalMember(owner = "client!lba", name = "l", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!lba", name = "m", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!lba", name = "n", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!lba", name = "o", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!lba", name = "p", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!lba", name = "q", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!lba", name = "r", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!lba", name = "u", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!lba", name = "v", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!lba", name = "x", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!lba", name = "B", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!lba", name = "t", descriptor = "Lhea;")
    private class393 field2614;

    @OriginalMember(owner = "client!lba", name = "y", descriptor = "[Lxa;")
    public static class424[] field2619;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lwfa;BLpq;Lpq;Lpq;)Z")
    public static final boolean method1259(class54 arg0, byte arg1, class159 arg2, class159 arg3, class159 arg4) {
        ++field2615;
        if (arg1 > -67) {
            field2621 = 79;
        }
        class155.field1922 = arg4;
        class648.field9178 = arg0;
        class128.field1628 = arg2;
        class147.field1868 = arg3;
        return true;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Z)Z")
    public final boolean method1131(boolean arg0) {
        if (arg0) {
            field2613 = null;
        }
        ++field2609;
        return true;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V")
    public final void method1137(int arg0) {
        this.field2614.method2336((byte) 32, '\u0001');
        ++field2610;
        if (super.field7145.field8991 > 0) {
            super.field7145.method3488(1, (byte) 23);
            super.field7145.method3553((byte) -117, (class254) null);
            super.field7145.method3565(98, 0.0F, 1.0F);
            super.field7145.method3488(0, (byte) 23);
        }
        super.field7145.method3499(8448, 34161, 8448);
        if (arg0 == 6) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "(I)V")
    private final void method1260(int arg0) {
        this.field2614 = new class393(super.field7145, 2);
        ++field2616;
        this.field2614.method2339(4864, 0);
        super.field7145.method3488(1, (byte) 23);
        if (arg0 <= 74) {
            this.method1138((byte) -104, (class254) null, -47);
        }
        super.field7145.method3499(260, 34161, 7681);
        super.field7145.method3525(768, 34168, 0, true);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field7145.method3488(0, (byte) 23);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field2617.field6386) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field2614.method2338(-20555);
        this.field2614.method2339(4864, 1);
        super.field7145.method3488(1, (byte) 23);
        super.field7145.method3499(8448, 34161, 8448);
        super.field7145.method3525(768, 5890, 0, true);
        OpenGL.glDisable(3168);
        super.field7145.method3488(0, (byte) 23);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field2617.field6386) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field2614.method2338(-20555);
    }

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(Lpea;Lpba;)V")
    public class198(class641 arg0, class472 arg1) {
        super(arg0);
        this.field2617 = arg1;
        this.method1260(104);
        this.field2605 = new class100(super.field7145, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field2605.method544(10497, false);
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZB)V")
    public final void method1139(boolean arg0, byte arg1) {
        if (arg1 == 127) {
            if (~super.field7145.field8991 < -1) {
                float var3 = -0.5F / (float) super.field7145.field8991;
                super.field7145.method3488(1, (byte) 23);
                class201.field2639[0] = 0.0F;
                class201.field2639[2] = var3;
                class201.field2639[1] = 0.0F;
                class201.field2639[3] = super.field7145.field9057 * var3 + 0.25F;
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glTexGenfv(8192, 9474, class201.field2639, 0);
                OpenGL.glPopMatrix();
                super.field7145.method3565(94, (float) super.field7145.field8991, 0.5F);
                super.field7145.method3553((byte) 47, this.field2605);
                super.field7145.method3488(0, (byte) 23);
            }
            ++field2612;
            this.field2614.method2336((byte) 32, '\u0000');
            OpenGL.glMatrixMode(5890);
            OpenGL.glPushMatrix();
            OpenGL.glScalef(0.25F, 0.25F, 1.0F);
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(BLwq;I)V")
    public final void method1138(byte arg0, class254 arg1, int arg2) {
        if (arg0 == 75) {
            ++field2608;
        }
    }

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "(I)V")
    public static void method1261(int arg0) {
        if (arg0 >= 5) {
            field2620 = null;
            field2619 = null;
            field2613 = null;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IZI)V")
    public final void method1134(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method1138((byte) 94, (class254) null, 46);
        }
        if (~(arg0 & 1) != -2) {
            if (this.field2617.field6386) {
                super.field7145.method3553((byte) 127, this.field2617.field6385);
                class201.field2639[1] = 0.0F;
                class201.field2639[0] = 0.0F;
                class201.field2639[3] = 0.0F;
                class201.field2639[2] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class201.field2639, 0);
            } else {
                super.field7145.method3553((byte) 95, this.field2617.field6387[0]);
            }
        } else if (!this.field2617.field6386) {
            int var4 = super.field7145.field8943 % 4000 * 16 / 4000;
            super.field7145.method3553((byte) -92, this.field2617.field6387[var4]);
        } else {
            super.field7145.method3553((byte) -96, this.field2617.field6385);
            class201.field2639[2] = 0.0F;
            class201.field2639[0] = 0.0F;
            class201.field2639[1] = 0.0F;
            class201.field2639[3] = (float) (super.field7145.field8943 % 4000) / 4000.0F;
            OpenGL.glTexGenfv(8194, 9473, class201.field2639, 0);
        }
        ++field2606;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(B)Lhe;")
    public static final class250 method1262(byte arg0) {
        if (arg0 < 53) {
            return null;
        } else {
            ++field2611;
            return class561.field7647;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZI)V")
    public final void method1133(boolean arg0, int arg1) {
        super.field7145.method3499(8448, 34161, 260);
        ++field2607;
        if (arg1 < 79) {
            this.method1137(-87);
        }
    }
}
