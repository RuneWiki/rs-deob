import jaggl.OpenGL;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class120 extends class548 {

    @OriginalMember(owner = "client!rv", name = "p", descriptor = "Ltf;")
    private class311 field1616;

    @OriginalMember(owner = "client!rv", name = "n", descriptor = "Lpc;")
    private class697 field1614;

    @OriginalMember(owner = "client!rv", name = "o", descriptor = "Led;")
    public static class732 field1615 = new class732(4, 1, 1, 1);

    @OriginalMember(owner = "client!rv", name = "m", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!rv", name = "q", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!rv", name = "r", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!rv", name = "s", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!rv", name = "t", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!rv", name = "v", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!rv", name = "w", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!rv", name = "x", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!rv", name = "y", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!rv", name = "A", descriptor = "Lhh;")
    public static class140 field1627;

    @OriginalMember(owner = "client!rv", name = "z", descriptor = "Lik;")
    private class222 field1626;

    @OriginalMember(owner = "client!rv", name = "u", descriptor = "Lcc;")
    public static class760 field1621;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)V")
    private final void method856(int arg0) {
        this.field1626 = new class222(super.field7571, 2);
        ++field1613;
        this.field1626.method1416(0, -28867);
        super.field7571.method1631(1, arg0 ^ 24740);
        super.field7571.method1630(7681, 260, 126);
        super.field7571.method1600(17104, 34168, 0, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field7571.method1631(0, -107);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field1616.field4393) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field1626.method1418(arg0 + -19895);
        this.field1626.method1416(1, arg0 ^ -4214);
        super.field7571.method1631(1, 45);
        super.field7571.method1630(8448, 8448, 103);
        super.field7571.method1600(arg0 ^ 8807, 5890, 0, 768);
        OpenGL.glDisable(3168);
        super.field7571.method1631(0, -124);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (arg0 != 24759) {
            this.method856(45);
        }
        if (this.field1616.field4393) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field1626.method1418(4864);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(III)V")
    public final void method753(int arg0, int arg1, int arg2) {
        if (arg2 == 14106) {
            ++field1618;
            if ((1 & arg1) == 1) {
                if (this.field1616.field4393) {
                    super.field7571.method1595((byte) 79, this.field1616.field4397);
                    class227.field2931[3] = (float) (super.field7571.field3519 % 4000) / 4000.0F;
                    class227.field2931[2] = 0.0F;
                    class227.field2931[0] = 0.0F;
                    class227.field2931[1] = 0.0F;
                    OpenGL.glTexGenfv(8194, 9473, class227.field2931, 0);
                } else {
                    int var4 = super.field7571.field3519 % 4000 * 16 / 4000;
                    super.field7571.method1595((byte) 103, this.field1616.field4391[var4]);
                }
            } else if (!this.field1616.field4393) {
                super.field7571.method1595((byte) 109, this.field1616.field4391[0]);
            } else {
                super.field7571.method1595((byte) 87, this.field1616.field4397);
                class227.field2931[2] = 0.0F;
                class227.field2931[0] = 0.0F;
                class227.field2931[3] = 0.0F;
                class227.field2931[1] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class227.field2931, 0);
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZZ)V")
    public final void method754(boolean arg0, boolean arg1) {
        if (~super.field7571.field3625 < -1) {
            float var3 = -0.5F / (float) super.field7571.field3625;
            super.field7571.method1631(1, 98);
            class227.field2931[0] = 0.0F;
            class227.field2931[3] = super.field7571.field3597 * var3 + 0.25F;
            class227.field2931[2] = var3;
            class227.field2931[1] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class227.field2931, 0);
            OpenGL.glPopMatrix();
            super.field7571.method1617((float) super.field7571.field3625, 0.5F, 34161);
            super.field7571.method1595((byte) 79, this.field1614);
            super.field7571.method1631(0, 97);
        }
        ++field1619;
        if (arg1) {
            this.field1616 = null;
        }
        this.field1626.method1413('\u0000', 0);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "(I)V")
    public static void method857(int arg0) {
        field1621 = null;
        if (arg0 == 10433) {
            field1627 = null;
            field1615 = null;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Z)Z")
    public final boolean method756(boolean arg0) {
        if (!arg0) {
            this.method753(-81, 86, 109);
        }
        ++field1624;
        return true;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lru;II)V")
    public final void method760(class205 arg0, int arg1, int arg2) {
        ++field1623;
        if (arg1 != -1) {
            this.method754(true, true);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V")
    public final void method759(int arg0) {
        this.field1626.method1413('\u0001', 0);
        ++field1617;
        if (~super.field7571.field3625 < -1) {
            super.field7571.method1631(1, arg0 + 13);
            super.field7571.method1595((byte) 86, (class205) null);
            super.field7571.method1617(0.0F, 1.0F, 34161);
            super.field7571.method1631(0, arg0 + 39);
        }
        super.field7571.method1630(8448, 8448, 94);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        if (arg0 != 3) {
            field1615 = null;
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Llf;Ltf;)V")
    public class120(class250 arg0, class311 arg1) {
        super(arg0);
        this.field1616 = arg1;
        this.method856(24759);
        this.field1614 = new class697(super.field7571, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field1614.method3788(true, false);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZI)V")
    public final void method758(boolean arg0, int arg1) {
        super.field7571.method1630(260, 8448, 124);
        ++field1622;
        if (arg1 != 0) {
            method858(-87, -113L);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IJ)V")
    public static final void method858(int arg0, long arg1) {
        class79.field1090.setTime(new Date(arg1));
        if (arg0 != 1) {
            method858(-93, -16L);
        }
        ++field1620;
    }
}
