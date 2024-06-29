import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class339 extends class263 {

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "Lmt;")
    private class261 field5063;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "Lci;")
    private class299 field5060;

    @OriginalMember(owner = "client!jq", name = "o", descriptor = "F")
    public static float field5068 = 0.25F;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "Loe;")
    public static class127 field5061 = new class127(104, 20);

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!jq", name = "p", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!jq", name = "q", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!jq", name = "r", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!jq", name = "s", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "Lkq;")
    private class403 field5066;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method675(int arg0) {
        ++field5059;
        if (arg0 > -112) {
            this.field5063 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V", line = 15)
    private final void method2092(int arg0) {
        ++field5070;
        this.field5066 = new class403(super.field3984, 2);
        this.field5066.method2390(0, arg0 + -35085);
        super.field3984.method2582((byte) -116, 1);
        super.field3984.method2624((byte) 107, 260, 7681);
        super.field3984.method2597(34168, (byte) 89, 768, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field3984.method2582((byte) -73, 0);
        if (arg0 != 2840) {
            field5068 = -0.02237005F;
        }
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field5063.field3952) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field5066.method2391(-105);
        this.field5066.method2390(1, -32245);
        super.field3984.method2582((byte) -123, 1);
        super.field3984.method2624((byte) 107, 8448, 8448);
        super.field3984.method2597(5890, (byte) 122, 768, 0);
        OpenGL.glDisable(3168);
        super.field3984.method2582((byte) 123, 0);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field5063.field3952) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field5066.method2391(arg0 ^ -2894);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lce;IZ)V", line = 62)
    public final void method671(class194 arg0, int arg1, boolean arg2) {
        ++field5065;
        if (!arg2) {
            this.method670((byte) 6);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(III)V", line = 72)
    public final void method673(int arg0, int arg1, int arg2) {
        ++field5072;
        if (~(1 & arg0) != -2) {
            if (this.field5063.field3952) {
                super.field3984.method2586(this.field5063.field3962, false);
                class377.field5502[0] = 0.0F;
                class377.field5502[2] = 0.0F;
                class377.field5502[3] = 0.0F;
                class377.field5502[1] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class377.field5502, 0);
            } else {
                super.field3984.method2586(this.field5063.field3957[0], false);
            }
        } else if (this.field5063.field3952) {
            super.field3984.method2586(this.field5063.field3962, false);
            class377.field5502[2] = 0.0F;
            class377.field5502[1] = 0.0F;
            class377.field5502[3] = (float) (super.field3984.field6691 % 4000) / 4000.0F;
            class377.field5502[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class377.field5502, 0);
        } else {
            int var4 = super.field3984.field6691 % 4000 * 16 / 4000;
            super.field3984.method2586(this.field5063.field3957[var4], false);
        }
        if (arg2 != 6908) {
            this.field5066 = null;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IZ)V", line = 119)
    public final void method666(int arg0, boolean arg1) {
        if (arg0 == -2560) {
            super.field3984.method2624((byte) 107, 8448, 260);
            ++field5062;
        }
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lbl;Lmt;)V", line = 131)
    public class339(class442 arg0, class261 arg1) {
        super(arg0);
        this.field5063 = arg1;
        this.method2092(2840);
        this.field5060 = new class299(super.field3984, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field5060.method1806(false, 45);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZB)V", line = 143)
    public final void method669(boolean arg0, byte arg1) {
        if (~super.field3984.field6812 < -1) {
            float var3 = -0.5F / (float) super.field3984.field6812;
            super.field3984.method2582((byte) 121, 1);
            class377.field5502[2] = var3;
            class377.field5502[0] = 0.0F;
            class377.field5502[1] = 0.0F;
            class377.field5502[3] = super.field3984.field6746 * var3 + 0.25F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class377.field5502, 0);
            OpenGL.glPopMatrix();
            super.field3984.method2590(true, (float) super.field3984.field6812, 0.5F);
            super.field3984.method2586(this.field5060, false);
            super.field3984.method2582((byte) 125, 0);
        }
        ++field5064;
        this.field5066.method2392((byte) 0, '\u0000');
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
        int var4 = 91 / ((arg1 - 24) / 34);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)I", line = 175)
    public static final int method2093(int arg0, int arg1) {
        ++field5071;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        if (arg0 >= -116) {
            method2093(45, 11);
        }
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg1 & ~var7;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V", line = 198)
    public final void method670(byte arg0) {
        if (arg0 == -94) {
            ++field5069;
            this.field5066.method2392((byte) 0, '\u0001');
            if (~super.field3984.field6812 < -1) {
                super.field3984.method2582((byte) 127, 1);
                super.field3984.method2586((class194) null, false);
                super.field3984.method2590(true, 0.0F, 1.0F);
                super.field3984.method2582((byte) -81, 0);
            }
            super.field3984.method2624((byte) 107, 8448, 8448);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "(B)V", line = 230)
    public static void method2094(byte arg0) {
        field5061 = null;
        if (arg0 != 90) {
            method2093(108, -28);
        }
    }
}
