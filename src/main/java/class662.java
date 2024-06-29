import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class662 extends class518 {

    @OriginalMember(owner = "client!kea", name = "m", descriptor = "Lpba;")
    private class472 field9385;

    @OriginalMember(owner = "client!kea", name = "q", descriptor = "Lhea;")
    private class393 field9389;

    @OriginalMember(owner = "client!kea", name = "p", descriptor = "[I")
    public static int[] field9388 = new int[14];

    @OriginalMember(owner = "client!kea", name = "s", descriptor = "F")
    public static float field9391;

    @OriginalMember(owner = "client!kea", name = "k", descriptor = "I")
    public static int field9383;

    @OriginalMember(owner = "client!kea", name = "l", descriptor = "I")
    public static int field9384;

    @OriginalMember(owner = "client!kea", name = "n", descriptor = "I")
    public static int field9386;

    @OriginalMember(owner = "client!kea", name = "o", descriptor = "I")
    public static int field9387;

    @OriginalMember(owner = "client!kea", name = "r", descriptor = "I")
    public static int field9390;

    @OriginalMember(owner = "client!kea", name = "t", descriptor = "I")
    public static int field9392;

    @OriginalMember(owner = "client!kea", name = "u", descriptor = "I")
    public static int field9393;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Z)Z", line = 3)
    public final boolean method1131(boolean arg0) {
        ++field9386;
        return arg0 ? true : true;
    }

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "(I)V", line = 14)
    public static void method3674(int arg0) {
        int var1 = -33 / ((arg0 - 83) / 32);
        field9388 = null;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(BLwq;I)V", line = 24)
    public final void method1138(byte arg0, class254 arg1, int arg2) {
        ++field9383;
        if (arg0 != 75) {
            field9388 = null;
        }
        super.field7145.method3553((byte) 120, arg1);
        super.field7145.method3524(arg2, 14);
    }

    @OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Lpea;Lpba;)V", line = 38)
    public class662(class641 arg0, class472 arg1) {
        super(arg0);
        this.field9385 = arg1;
        this.field9389 = new class393(arg0, 2);
        this.field9389.method2339(4864, 0);
        super.field7145.method3488(1, (byte) 23);
        if (this.field9385.field6386) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field7145.method3488(0, (byte) 23);
        this.field9389.method2338(-20555);
        this.field9389.method2339(4864, 1);
        super.field7145.method3488(1, (byte) 23);
        if (this.field9385.field6386) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field7145.method3488(0, (byte) 23);
        this.field9389.method2338(-20555);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZI)V", line = 72)
    public final void method1133(boolean arg0, int arg1) {
        if (arg1 < 79) {
            this.field9389 = null;
        }
        ++field9393;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(II)Z", line = 82)
    public static final boolean method3675(int arg0, int arg1) {
        ++field9384;
        if (arg1 != -5) {
            return false;
        } else {
            return arg0 == 0 || ~arg0 == -5;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZB)V", line = 99)
    public final void method1139(boolean arg0, byte arg1) {
        ++field9390;
        if (arg1 != 127) {
            field9391 = -2.1518047F;
        }
        this.field9389.method2336((byte) 32, '\u0000');
        if (this.field9385.field6386) {
            super.field7145.method3488(1, (byte) 23);
            super.field7145.method3553((byte) 103, this.field9385.field6384);
            super.field7145.method3488(0, (byte) 23);
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IZI)V", line = 118)
    public final void method1134(int arg0, boolean arg1, int arg2) {
        ++field9387;
        float var4 = (float) ((arg0 & 3) - -1) * -5.0E-4F;
        float var5 = (float) (((arg0 & 24) >> 3) + 1) * 5.0E-4F;
        float var6 = (arg0 & 64) != 0 ? 9.765625E-4F : 4.8828125E-4F;
        if (arg1) {
            this.field9385 = null;
        }
        boolean var7 = ~(arg0 & 128) != -1;
        super.field7145.method3488(1, (byte) 23);
        if (!var7) {
            class551.field7540[0] = 0.0F;
            class551.field7540[1] = 0.0F;
            class551.field7540[2] = var6;
            class551.field7540[3] = 0.0F;
        } else {
            class551.field7540[2] = 0.0F;
            class551.field7540[3] = 0.0F;
            class551.field7540[1] = 0.0F;
            class551.field7540[0] = var6;
        }
        OpenGL.glTexGenfv(8192, 9474, class551.field7540, 0);
        class551.field7540[1] = var6;
        class551.field7540[2] = 0.0F;
        class551.field7540[3] = (float) super.field7145.field8943 * var4 % 1.0F;
        class551.field7540[0] = 0.0F;
        OpenGL.glTexGenfv(8193, 9474, class551.field7540, 0);
        if (this.field9385.field6386) {
            class551.field7540[2] = 0.0F;
            class551.field7540[0] = 0.0F;
            class551.field7540[3] = (float) super.field7145.field8943 * var5 % 1.0F;
            class551.field7540[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class551.field7540, 0);
        } else {
            int var8 = (int) ((float) super.field7145.field8943 * var5 * 16.0F);
            super.field7145.method3553((byte) 87, this.field9385.field6383[var8 % 16]);
        }
        super.field7145.method3488(0, (byte) 23);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)V", line = 180)
    public final void method1137(int arg0) {
        this.field9389.method2336((byte) 32, '\u0001');
        ++field9392;
        super.field7145.method3488(1, (byte) 23);
        super.field7145.method3553((byte) 73, (class254) null);
        super.field7145.method3488(0, (byte) 23);
        if (arg0 != 6) {
            this.method1134(-24, true, -126);
        }
    }
}
