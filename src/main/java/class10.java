import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class10 extends class209 {

    @OriginalMember(owner = "client!tu", name = "r", descriptor = "Lln;")
    private class94 field97;

    @OriginalMember(owner = "client!tu", name = "i", descriptor = "Lkba;")
    private class529 field88;

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "I")
    public static int field87 = 1403;

    @OriginalMember(owner = "client!tu", name = "m", descriptor = "I")
    public static int field92 = 0;

    @OriginalMember(owner = "client!tu", name = "j", descriptor = "Lvt;")
    public static class344 field89 = new class344("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!tu", name = "u", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!tu", name = "w", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!tu", name = "x", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!tu", name = "k", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!tu", name = "l", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!tu", name = "n", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!tu", name = "o", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!tu", name = "p", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!tu", name = "q", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!tu", name = "s", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!tu", name = "t", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!tu", name = "v", descriptor = "Lcn;")
    private class21 field101;

    @OriginalMember(owner = "client!tu", name = "y", descriptor = "Lau;")
    public static class478 field104;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)V")
    private final void method39(int arg0) {
        ++field99;
        this.field101 = new class21(super.field2710, 2);
        this.field101.method120((byte) 119, 0);
        super.field2710.method1966(3000, 1);
        super.field2710.method1887(110, 7681, 260);
        super.field2710.method1933(-105, 768, 0, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field2710.method1966(arg0 ^ 3000, arg0);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field97.field1243) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field101.method123(4864);
        this.field101.method120((byte) 22, 1);
        super.field2710.method1966(arg0 ^ 3000, 1);
        super.field2710.method1887(87, 8448, 8448);
        super.field2710.method1933(-80, 768, 0, 5890);
        OpenGL.glDisable(3168);
        super.field2710.method1966(arg0 + 3000, 0);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field97.field1243) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field101.method123(4864);
    }

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "(I)V")
    public static void method40(int arg0) {
        if (arg0 == -31171) {
            field104 = null;
            field89 = null;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V")
    public static final void method41(byte arg0) {
        class453.field6425.method993(((float) class501.field6954.field7860 * 0.1F + 0.7F) * 1.1523438F);
        ++field100;
        class453.field6425.method981(class235.field3008, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
        int var1 = 106 % ((arg0 - 2) / 60);
        class453.field6425.method923(class370.field5162, -1, 0);
        class453.field6425.method927(class449.field6353);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)Z")
    public final boolean method42(boolean arg0) {
        if (!arg0) {
            field87 = -6;
        }
        ++field95;
        return true;
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V")
    public final void method43(int arg0) {
        ++field102;
        this.field101.method118('\u0001', 0);
        if (arg0 > ~super.field2710.field4226) {
            super.field2710.method1966(3000, 1);
            super.field2710.method1884((class148) null, -2);
            super.field2710.method1895(1.0F, 768, 0.0F);
            super.field2710.method1966(arg0 + 3001, 0);
        }
        super.field2710.method1887(-106, 8448, 8448);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lea;IZ)V")
    public final void method44(class148 arg0, int arg1, boolean arg2) {
        ++field91;
        if (!arg2) {
            field98 = 49;
        }
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Luq;Lln;)V")
    public class10(class313 arg0, class94 arg1) {
        super(arg0);
        this.field97 = arg1;
        this.method39(0);
        this.field88 = new class529(super.field2710, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field88.method2954((byte) -64, false);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(III)V")
    public final void method45(int arg0, int arg1, int arg2) {
        if (~(1 & arg0) == -2) {
            if (this.field97.field1243) {
                super.field2710.method1884(this.field97.field1247, -2);
                class15.field156[3] = (float) (super.field2710.field4198 % 4000) / 4000.0F;
                class15.field156[0] = 0.0F;
                class15.field156[2] = 0.0F;
                class15.field156[1] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class15.field156, 0);
            } else {
                int var4 = super.field2710.field4198 % 4000 * 16 / 4000;
                super.field2710.method1884(this.field97.field1250[var4], -2);
            }
        } else if (this.field97.field1243) {
            super.field2710.method1884(this.field97.field1247, -2);
            class15.field156[0] = 0.0F;
            class15.field156[2] = 0.0F;
            class15.field156[1] = 0.0F;
            class15.field156[3] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class15.field156, 0);
        } else {
            super.field2710.method1884(this.field97.field1250[0], -2);
        }
        ++field94;
        if (arg2 > -75) {
            this.method47(true, (byte) -51);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lge;Z)V")
    public static final void method46(class551 arg0, boolean arg1) {
        ++field96;
        int var2 = arg0.method3059(107);
        class70.field918 = new class494[var2];
        if (arg1) {
            method40(-115);
        }
        for (int var3 = 0; var2 > var3; ++var3) {
            class70.field918[var3] = new class494();
            class70.field918[var3].field6890 = arg0.method3059(64);
            class70.field918[var3].field6891 = arg0.method3055(-881972240);
        }
        class477.field6713 = arg0.method3059(25);
        class579.field8066 = arg0.method3059(67);
        class588.field8519 = arg0.method3059(97);
        class208.field2706 = new class272[-class477.field6713 + class579.field8066 + 1];
        for (int var4 = 0; ~class588.field8519 < ~var4; ++var4) {
            int var5 = arg0.method3059(103);
            class272 var6 = class208.field2706[var5] = new class272();
            var6.field2510 = arg0.method3045(-125);
            var6.field2513 = arg0.method3048(-4);
            var6.field3452 = class477.field6713 + var5;
            var6.field3454 = arg0.method3055(-881972240);
            var6.field3455 = arg0.method3055(-881972240);
        }
        class120.field1515 = arg0.method3048(-4);
        class606.field8717 = true;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZB)V")
    public final void method47(boolean arg0, byte arg1) {
        if (~super.field2710.field4226 < -1) {
            float var3 = -0.5F / (float) super.field2710.field4226;
            super.field2710.method1966(3000, 1);
            class15.field156[0] = 0.0F;
            class15.field156[1] = 0.0F;
            class15.field156[3] = super.field2710.field4289 * var3 + 0.25F;
            class15.field156[2] = var3;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class15.field156, 0);
            OpenGL.glPopMatrix();
            super.field2710.method1895(0.5F, 768, (float) super.field2710.field4226);
            super.field2710.method1884(this.field88, -2);
            super.field2710.method1966(3000, 0);
        }
        ++field103;
        this.field101.method118('\u0000', 0);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        if (arg1 < 88) {
            this.method42(false);
        }
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(ZB)V")
    public final void method48(boolean arg0, byte arg1) {
        if (arg1 > 122) {
            ++field90;
            super.field2710.method1887(-115, 260, 8448);
        }
    }
}
