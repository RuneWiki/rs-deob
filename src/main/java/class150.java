import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class150 extends class374 {

    @OriginalMember(owner = "client!be", name = "h", descriptor = "Lbt;")
    private class89 field2276;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "Le;")
    private class286 field2277;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Lmt;")
    public static class517 field2273 = new class517(512);

    @OriginalMember(owner = "client!be", name = "p", descriptor = "S")
    public static short field2284 = 32767;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "Laa;")
    public static class76 field2278 = new class76(50, 0);

    @OriginalMember(owner = "client!be", name = "q", descriptor = "Laa;")
    public static class76 field2285 = new class76(52, -1);

    @OriginalMember(owner = "client!be", name = "r", descriptor = "Lfr;")
    public static class497 field2286 = new class497();

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "Ljm;")
    public static class210 field2287;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "Lce;")
    private class328 field2272;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V")
    public static void method1086(int arg0) {
        if (arg0 >= 39) {
            field2287 = null;
            field2273 = null;
            field2285 = null;
            field2278 = null;
            field2286 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)V")
    public final void method19(boolean arg0, int arg1) {
        if (arg1 > -2) {
            this.field2277 = null;
        }
        super.field5646.method1576(260, 8448, (byte) 69);
        ++field2274;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZLew;I)V")
    public final void method18(boolean arg0, class271 arg1, int arg2) {
        ++field2275;
        if (!arg0) {
            this.field2272 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lvd;Lbt;)V")
    public class150(class258 arg0, class89 arg1) {
        super(arg0);
        this.field2276 = arg1;
        this.method1087(true);
        this.field2277 = new class286(super.field5646, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field2277.method1775(false, 67);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
    private final void method1087(boolean arg0) {
        ++field2282;
        this.field2272 = new class328(super.field5646, 2);
        this.field2272.method2036((byte) -107, 0);
        super.field5646.method1553(1, -8156);
        super.field5646.method1576(7681, 260, (byte) 58);
        super.field5646.method1590(768, 34168, true, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field5646.method1553(0, -8156);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field2276.field1386) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field2272.method2041((byte) 33);
        this.field2272.method2036((byte) -107, 1);
        super.field5646.method1553(1, -8156);
        super.field5646.method1576(8448, 8448, (byte) -116);
        super.field5646.method1590(768, 5890, arg0, 0);
        OpenGL.glDisable(3168);
        super.field5646.method1553(0, -8156);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field2276.field1386) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field2272.method2041((byte) 33);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)V")
    public final void method20(int arg0, int arg1, int arg2) {
        if (arg1 == -20857) {
            ++field2283;
            if ((arg0 & 1) != 1) {
                if (this.field2276.field1386) {
                    super.field5646.method1546(arg1 ^ 20857, this.field2276.field1389);
                    class515.field7556[3] = 0.0F;
                    class515.field7556[2] = 0.0F;
                    class515.field7556[1] = 0.0F;
                    class515.field7556[0] = 0.0F;
                    OpenGL.glTexGenfv(8194, 9473, class515.field7556, 0);
                } else {
                    super.field5646.method1546(arg1 ^ 20857, this.field2276.field1390[0]);
                }
            } else if (!this.field2276.field1386) {
                int var4 = super.field5646.field3703 % 4000 * 16 / 4000;
                super.field5646.method1546(arg1 ^ 20857, this.field2276.field1390[var4]);
            } else {
                super.field5646.method1546(-2, this.field2276.field1389);
                class515.field7556[2] = 0.0F;
                class515.field7556[3] = (float) (super.field5646.field3703 % 4000) / 4000.0F;
                class515.field7556[1] = 0.0F;
                class515.field7556[0] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class515.field7556, 0);
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public final void method24(int arg0) {
        if (arg0 >= 74) {
            ++field2280;
            this.field2272.method2035(-123, '\u0001');
            if (~super.field5646.field3831 < -1) {
                super.field5646.method1553(1, -8156);
                super.field5646.method1546(-2, (class271) null);
                super.field5646.method1573((byte) 109, 0.0F, 1.0F);
                super.field5646.method1553(0, -8156);
            }
            super.field5646.method1576(8448, 8448, (byte) 96);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZZ)V")
    public final void method25(boolean arg0, boolean arg1) {
        if (~super.field5646.field3831 < -1) {
            float var3 = -0.5F / (float) super.field5646.field3831;
            super.field5646.method1553(1, -8156);
            class515.field7556[0] = 0.0F;
            class515.field7556[2] = var3;
            class515.field7556[1] = 0.0F;
            class515.field7556[3] = super.field5646.field3757 * var3 + 0.25F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class515.field7556, 0);
            OpenGL.glPopMatrix();
            super.field5646.method1573((byte) 112, (float) super.field5646.field3831, 0.5F);
            super.field5646.method1546(-2, this.field2277);
            super.field5646.method1553(0, -8156);
        }
        ++field2279;
        this.field2272.method2035(88, '\u0000');
        OpenGL.glMatrixMode(5890);
        if (arg1) {
            OpenGL.glPushMatrix();
            OpenGL.glScalef(0.25F, 0.25F, 1.0F);
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)Z")
    public final boolean method21(byte arg0) {
        ++field2281;
        if (arg0 < 85) {
            field2284 = 13;
        }
        return true;
    }
}
