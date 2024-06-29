import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class150 extends class366 {

    @OriginalMember(owner = "client!dfa", name = "m", descriptor = "Lfj;")
    private class609 field2488;

    @OriginalMember(owner = "client!dfa", name = "q", descriptor = "Lsr;")
    private class231 field2492;

    @OriginalMember(owner = "client!dfa", name = "j", descriptor = "I")
    public static int field2485 = 1337;

    @OriginalMember(owner = "client!dfa", name = "l", descriptor = "[I")
    public static int[] field2487 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!dfa", name = "h", descriptor = "I")
    public static int field2483 = 0;

    @OriginalMember(owner = "client!dfa", name = "k", descriptor = "Lrl;")
    public static class672 field2486 = new class672(41, 3);

    @OriginalMember(owner = "client!dfa", name = "g", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!dfa", name = "i", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!dfa", name = "n", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!dfa", name = "o", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!dfa", name = "p", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!dfa", name = "r", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!dfa", name = "s", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZI)V")
    public final void method1133(boolean arg0, int arg1) {
        ++field2494;
        this.field2492.method1687('\u0000', 4864);
        if (this.field2488.field8644) {
            super.field5742.method834(true, 1);
            super.field5742.method856(false, this.field2488.field8641);
            super.field5742.method834(true, 0);
        }
        if (arg1 != 0) {
            this.method1131(true, false);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(Ler;Lfj;)V")
    public class150(class92 arg0, class609 arg1) {
        super(arg0);
        this.field2488 = arg1;
        this.field2492 = new class231(arg0, 2);
        this.field2492.method1689(-31885, 0);
        super.field5742.method834(true, 1);
        if (this.field2488.field8644) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field5742.method834(true, 0);
        this.field2492.method1690(-120);
        this.field2492.method1689(-31885, 1);
        super.field5742.method834(true, 1);
        if (this.field2488.field8644) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field5742.method834(true, 0);
        this.field2492.method1690(12);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IZIII)V")
    public static final void method1250(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (class497.field7259 != arg0) {
            class368.field5763 = class497.field7259;
            class265.method1878(0, -14473);
        } else {
            class373.method2453(false, 118);
        }
        ++field2491;
        class313.field4922 = arg4;
        class74.field941 = arg1;
        class353.field5600 = arg3;
        class378.method2489(arg2);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZZ)V")
    public final void method1131(boolean arg0, boolean arg1) {
        if (arg1) {
            ++field2482;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(III)V")
    public final void method1136(int arg0, int arg1, int arg2) {
        ++field2493;
        float var4 = (float) ((arg2 & 3) - -1) * -5.0E-4F;
        float var5 = (float) (((arg2 & 28) >> 3) - -1) * 5.0E-4F;
        float var6 = ~(arg2 & 64) != -1 ? 9.765625E-4F : 4.8828125E-4F;
        boolean var7 = (128 & arg2) != 0;
        super.field5742.method834(true, 1);
        if (!var7) {
            class149.field2481[1] = 0.0F;
            class149.field2481[3] = 0.0F;
            class149.field2481[2] = var6;
            class149.field2481[0] = 0.0F;
        } else {
            class149.field2481[2] = 0.0F;
            class149.field2481[1] = 0.0F;
            class149.field2481[0] = var6;
            class149.field2481[3] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class149.field2481, 0);
        class149.field2481[1] = var6;
        if (arg0 == -6561) {
            class149.field2481[2] = 0.0F;
            class149.field2481[3] = (float) super.field5742.field1330 * var4 % 1.0F;
            class149.field2481[0] = 0.0F;
            OpenGL.glTexGenfv(8193, 9474, class149.field2481, 0);
            if (this.field2488.field8644) {
                class149.field2481[2] = 0.0F;
                class149.field2481[1] = 0.0F;
                class149.field2481[3] = (float) super.field5742.field1330 * var5 % 1.0F;
                class149.field2481[0] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class149.field2481, 0);
            } else {
                int var8 = (int) ((float) super.field5742.field1330 * var5 * 16.0F);
                super.field5742.method856(false, this.field2488.field8645[var8 % 16]);
            }
            super.field5742.method834(true, 0);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I)V")
    public final void method1132(int arg0) {
        ++field2484;
        this.field2492.method1687('\u0001', 4864);
        super.field5742.method834(true, 1);
        super.field5742.method856(false, (class386) null);
        super.field5742.method834(true, arg0);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Z)Z")
    public final boolean method1137(boolean arg0) {
        if (arg0) {
            this.method1136(47, 63, 28);
        }
        ++field2489;
        return true;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ILep;I)V")
    public final void method1130(int arg0, class386 arg1, int arg2) {
        ++field2490;
        super.field5742.method856(false, arg1);
        super.field5742.method816(arg2, -117);
        if (arg0 != 1) {
            field2483 = -21;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "(B)V")
    public static void method1251(byte arg0) {
        field2487 = null;
        if (arg0 <= 18) {
            field2486 = null;
        }
        field2486 = null;
    }
}
