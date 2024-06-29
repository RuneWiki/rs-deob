import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class244 extends class261 {

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "Ljq;")
    private class264 field4185;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "Lcs;")
    private class426 field4182;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "Lbu;")
    public static class407 field4176 = new class407(64);

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "Lik;")
    public static class78 field4187 = new class78();

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "[I")
    public static int[] field4188 = new int[3];

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "F")
    public static float field4190;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "Lbq;")
    public static class487 field4180;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "Lbq;")
    public static class487 field4183;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V", line = 8)
    public static void method1665(byte arg0) {
        field4180 = null;
        field4188 = null;
        field4176 = null;
        field4187 = null;
        if (arg0 < -114) {
            field4183 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIII)V", line = 22)
    public static final void method1666(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 << arg1;
        int var5 = arg2 << 3;
        int var6 = arg3 << 3;
        ++field4181;
        class88.field1483 = (float) var6;
        class509.field7395 = (float) var5;
        if (class190.field2963 == 2) {
            class227.field3927 = var5;
            class381.field5891 = var6;
            class64.field950 = var4;
        }
        class249.method1690(arg1 + -7);
        class299.field4804 = true;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IILkk;)V", line = 43)
    public final void method1024(int arg0, int arg1, class179 arg2) {
        super.field4358.method1471(true, arg2);
        ++field4177;
        super.field4358.method1410(arg0, 7681);
        int var4 = -5 % ((arg1 - 21) / 36);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZB)V", line = 56)
    public final void method1020(boolean arg0, byte arg1) {
        if (arg1 <= 23) {
            this.field4185 = null;
        }
        this.field4182.method2603('\u0000', -17213);
        ++field4186;
        if (this.field4185.field4409) {
            super.field4358.method1440(1, 0);
            super.field4358.method1471(true, this.field4185.field4407);
            super.field4358.method1440(0, 0);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZ)V", line = 75)
    public final void method1022(int arg0, boolean arg1) {
        ++field4179;
        int var3 = -94 % ((87 - arg0) / 37);
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lih;Ljq;)V", line = 84)
    public class244(class214 arg0, class264 arg1) {
        super(arg0);
        this.field4185 = arg1;
        this.field4182 = new class426(arg0, 2);
        this.field4182.method2604(14, 0);
        super.field4358.method1440(1, 0);
        if (this.field4185.field4409) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field4358.method1440(0, 0);
        this.field4182.method2601((byte) 122);
        this.field4182.method2604(14, 1);
        super.field4358.method1440(1, 0);
        if (this.field4185.field4409) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field4358.method1440(0, 0);
        this.field4182.method2601((byte) 122);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)V", line = 119)
    public final void method1021(int arg0, int arg1, int arg2) {
        ++field4184;
        float var4 = (float) ((arg2 & 3) + 1) * -5.0E-4F;
        float var5 = (float) ((arg2 >> 3 & 3) - -1) * 5.0E-4F;
        float var6 = (arg2 & 64) != 0 ? 9.765625E-4F : 4.8828125E-4F;
        boolean var7 = ~(arg2 & 128) != -1;
        super.field4358.method1440(1, 0);
        if (var7) {
            class496.field7272[1] = 0.0F;
            class496.field7272[2] = 0.0F;
            class496.field7272[3] = 0.0F;
            class496.field7272[0] = var6;
        } else {
            class496.field7272[0] = 0.0F;
            class496.field7272[3] = 0.0F;
            class496.field7272[1] = 0.0F;
            class496.field7272[2] = var6;
        }
        OpenGL.glTexGenfv(8192, 9474, class496.field7272, 0);
        class496.field7272[1] = var6;
        class496.field7272[3] = (float) super.field4358.field3602 * var4 % 1.0F;
        class496.field7272[0] = 0.0F;
        class496.field7272[2] = 0.0F;
        int var8 = -16 / ((arg1 - 82) / 41);
        OpenGL.glTexGenfv(8193, 9474, class496.field7272, 0);
        if (!this.field4185.field4409) {
            int var9 = (int) ((float) super.field4358.field3602 * var5 * 16.0F);
            super.field4358.method1471(true, this.field4185.field4412[var9 % 16]);
        } else {
            class496.field7272[3] = (float) super.field4358.field3602 * var5 % 1.0F;
            class496.field7272[1] = 0.0F;
            class496.field7272[2] = 0.0F;
            class496.field7272[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class496.field7272, 0);
        }
        super.field4358.method1440(0, 0);
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)Z", line = 174)
    public final boolean method1026(int arg0) {
        ++field4178;
        if (arg0 <= 69) {
            field4190 = 1.4846779F;
        }
        return true;
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)V", line = 185)
    public final void method1023(int arg0) {
        ++field4175;
        this.field4182.method2603('\u0001', -17213);
        super.field4358.method1440(1, arg0 ^ arg0);
        super.field4358.method1471(true, (class179) null);
        super.field4358.method1440(0, arg0 ^ 5000);
    }
}
