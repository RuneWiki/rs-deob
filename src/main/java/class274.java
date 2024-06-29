import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class274 extends class190 {

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "Llm;")
    private class307 field3999;

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "Llf;")
    private class619 field4003;

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "I")
    public static int field3997 = 13156520;

    @OriginalMember(owner = "client!rs", name = "s", descriptor = "Lbv;")
    public static class567 field4009;

    @OriginalMember(owner = "client!rs", name = "t", descriptor = "Lpp;")
    public static class464 field4010;

    @OriginalMember(owner = "client!rs", name = "v", descriptor = "S")
    public static short field4012;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!rs", name = "o", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!rs", name = "p", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!rs", name = "q", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!rs", name = "r", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!rs", name = "w", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "Lab;")
    private class290 field4002;

    @OriginalMember(owner = "client!rs", name = "u", descriptor = "Lgp;")
    public static class561 field4011;

    static {
        new class567("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
        field4009 = new class567("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");
        field4010 = new class464(17, 7);
        field4012 = 1;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(III)V", line = 3)
    public final void method925(int arg0, int arg1, int arg2) {
        ++field4005;
        if (arg1 != 0) {
            field4008 = 63;
        }
        if ((1 & arg0) == 1) {
            if (!this.field3999.field4419) {
                int var4 = super.field2722.field1135 % 4000 * 16 / 4000;
                super.field2722.method648(arg1 ^ 111, this.field3999.field4420[var4]);
            } else {
                super.field2722.method648(-75, this.field3999.field4413);
                class343.field4930[3] = (float) (super.field2722.field1135 % 4000) / 4000.0F;
                class343.field4930[2] = 0.0F;
                class343.field4930[1] = 0.0F;
                class343.field4930[0] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class343.field4930, 0);
            }
        } else if (!this.field3999.field4419) {
            super.field2722.method648(-105, this.field3999.field4420[0]);
        } else {
            super.field2722.method648(arg1 ^ -119, this.field3999.field4413);
            class343.field4930[3] = 0.0F;
            class343.field4930[1] = 0.0F;
            class343.field4930[0] = 0.0F;
            class343.field4930[2] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class343.field4930, 0);
        }
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)Z", line = 48)
    public final boolean method928(int arg0) {
        int var2 = -33 % ((-7 - arg0) / 57);
        ++field4004;
        return true;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILaba;I)V", line = 60)
    public final void method927(int arg0, class222 arg1, int arg2) {
        if (arg2 == 20731) {
            ++field4001;
        }
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Ljj;Llm;)V", line = 70)
    public class274(class66 arg0, class307 arg1) {
        super(arg0);
        this.field3999 = arg1;
        this.method1770((byte) 74);
        this.field4003 = new class619(super.field2722, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field4003.method3500(false, false);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Z)V", line = 89)
    public static void method1769(boolean arg0) {
        if (arg0) {
            field4011 = null;
            field4010 = null;
            field4009 = null;
        }
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)V", line = 101)
    private final void method1770(byte arg0) {
        ++field3998;
        this.field4002 = new class290(super.field2722, 2);
        this.field4002.method1833((byte) 100, 0);
        super.field2722.method654(false, 1);
        super.field2722.method656(-12645, 260, 7681);
        super.field2722.method607(34168, 0, 768, 125);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field2722.method654(false, 0);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field3999.field4419) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field4002.method1838(0);
        this.field4002.method1833((byte) 114, 1);
        super.field2722.method654(false, 1);
        super.field2722.method656(-12645, 8448, 8448);
        super.field2722.method607(5890, 0, 768, 94);
        if (arg0 != 74) {
            this.method925(-49, -35, 15);
        }
        OpenGL.glDisable(3168);
        super.field2722.method654(false, 0);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field3999.field4419) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field4002.method1838(arg0 + -74);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V", line = 146)
    public final void method926(byte arg0) {
        this.field4002.method1835((byte) -81, '\u0001');
        ++field4000;
        if (~super.field2722.field1229 < -1) {
            super.field2722.method654(false, 1);
            super.field2722.method648(117, (class222) null);
            super.field2722.method590((byte) 120, 1.0F, 0.0F);
            super.field2722.method654(false, 0);
        }
        super.field2722.method656(-12645, 8448, 8448);
        OpenGL.glMatrixMode(5890);
        if (arg0 >= -102) {
            this.method926((byte) -11);
        }
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZB)V", line = 173)
    public final void method919(boolean arg0, byte arg1) {
        if (super.field2722.field1229 > 0) {
            float var3 = -0.5F / (float) super.field2722.field1229;
            super.field2722.method654(false, 1);
            class343.field4930[3] = super.field2722.field1242 * var3 + 0.25F;
            class343.field4930[1] = 0.0F;
            class343.field4930[0] = 0.0F;
            class343.field4930[2] = var3;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class343.field4930, 0);
            OpenGL.glPopMatrix();
            super.field2722.method590((byte) 52, 0.5F, (float) super.field2722.field1229);
            super.field2722.method648(-96, this.field4003);
            super.field2722.method654(false, 0);
        }
        ++field4007;
        this.field4002.method1835((byte) -105, '\u0000');
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        int var4 = 37 / ((arg1 - -55) / 47);
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZI)V", line = 208)
    public final void method921(boolean arg0, int arg1) {
        if (arg1 != 25747) {
            this.field4003 = null;
        }
        ++field4006;
        super.field2722.method656(-12645, 8448, 260);
    }
}
