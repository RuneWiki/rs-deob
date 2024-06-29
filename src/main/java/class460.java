import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class460 extends class283 {

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "Ldja;")
    private class311 field6367;

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "Lfo;")
    private class518 field6369;

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "Lfc;")
    public static class262 field6371 = new class262(4);

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "Lvea;")
    public static class276 field6376 = new class276(11, 0, 1, 2);

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public static int field6362;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
    public static int field6364;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
    public static int field6368;

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!sl", name = "u", descriptor = "Luaa;")
    public static class119 field6377;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "Lme;")
    public static class196 field6365;

    @OriginalMember(owner = "client!sl", name = "s", descriptor = "Z")
    public static boolean field6375;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V")
    public final void method144(byte arg0) {
        this.field6369.method2853('\u0001', false);
        if (arg0 <= 25) {
            field6377 = null;
        }
        ++field6363;
        super.field3749.method2988(1, 847872872);
        super.field3749.method3006(1, (class221) null);
        super.field3749.method2988(0, 847872872);
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)V")
    public static final void method2563(int arg0) {
        class141.method880();
        ++field6368;
        if (arg0 != -32346) {
            field6376 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZI)V")
    public final void method142(boolean arg0, int arg1) {
        ++field6364;
        if (arg1 != 255) {
            this.field6367 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lac;Ldja;)V")
    public class460(class541 arg0, class311 arg1) {
        super(arg0);
        this.field6367 = arg1;
        this.field6369 = new class518(arg0, 2);
        this.field6369.method2852(0, -30389);
        super.field3749.method2988(1, 847872872);
        if (this.field6367.field4207) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field3749.method2988(0, 847872872);
        this.field6369.method2851((byte) -50);
        this.field6369.method2852(1, -30389);
        super.field3749.method2988(1, 847872872);
        if (this.field6367.field4207) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field3749.method2988(0, 847872872);
        this.field6369.method2851((byte) 53);
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)Z")
    public final boolean method138(int arg0) {
        ++field6374;
        if (arg0 != 31565) {
            field6373 = -90;
        }
        return true;
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(I)V")
    public static void method2564(int arg0) {
        field6376 = null;
        field6371 = null;
        field6365 = null;
        if (arg0 != 0) {
            method2563(-69);
        }
        field6377 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lcu;ZI)V")
    public final void method140(class221 arg0, boolean arg1, int arg2) {
        super.field3749.method3006(1, arg0);
        ++field6366;
        super.field3749.method3039(260, arg2);
        if (arg1) {
            method2563(-73);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)V")
    public final void method137(int arg0, int arg1, int arg2) {
        ++field6370;
        float var4 = (float) ((3 & arg0) - -1) * -5.0E-4F;
        float var5 = (float) (((29 & arg0) >> 3) + 1) * 5.0E-4F;
        float var6 = ~(64 & arg0) != -1 ? 9.765625E-4F : 4.8828125E-4F;
        if (arg2 > -2) {
            this.field6369 = null;
        }
        super.field3749.method2988(1, 847872872);
        boolean var7 = ~(arg0 & 128) != -1;
        if (var7) {
            class638.field8864[0] = var6;
            class638.field8864[2] = 0.0F;
            class638.field8864[3] = 0.0F;
            class638.field8864[1] = 0.0F;
        } else {
            class638.field8864[3] = 0.0F;
            class638.field8864[0] = 0.0F;
            class638.field8864[2] = var6;
            class638.field8864[1] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class638.field8864, 0);
        class638.field8864[0] = 0.0F;
        class638.field8864[1] = var6;
        class638.field8864[3] = (float) super.field3749.field7532 * var4 % 1.0F;
        class638.field8864[2] = 0.0F;
        OpenGL.glTexGenfv(8193, 9474, class638.field8864, 0);
        if (this.field6367.field4207) {
            class638.field8864[0] = 0.0F;
            class638.field8864[3] = (float) super.field3749.field7532 * var5 % 1.0F;
            class638.field8864[2] = 0.0F;
            class638.field8864[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class638.field8864, 0);
        } else {
            int var8 = (int) ((float) super.field3749.field7532 * var5 * 16.0F);
            super.field3749.method3006(1, this.field6367.field4203[var8 % 16]);
        }
        super.field3749.method2988(0, 847872872);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZZ)V")
    public final void method141(boolean arg0, boolean arg1) {
        ++field6362;
        this.field6369.method2853('\u0000', arg0);
        if (this.field6367.field4207) {
            super.field3749.method2988(1, 847872872);
            super.field3749.method3006(1, this.field6367.field4208);
            super.field3749.method2988(0, 847872872);
        }
    }
}
