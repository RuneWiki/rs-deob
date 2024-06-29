import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public abstract class class695 implements class200 {

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "Z")
    private boolean field9657 = false;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "Lbi;")
    public class483 field9655;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "Z")
    private boolean field9654;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public int field9659;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    private int field9658;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    public int field9670;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public int field9663;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "[[I")
    public static int[][] field9656 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "Lql;")
    public static class738 field9661 = new class738();

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "[Lic;")
    public static class701[] field9674 = new class701[14];

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field9653;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public static int field9660;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public static int field9662;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    public static int field9664;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    public static int field9665;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
    public static int field9666;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
    public static int field9667;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    public static int field9668;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
    public static int field9669;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
    public static int field9671;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "I")
    public static int field9673;

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "I")
    public static int field9675;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "Lnd;")
    public static class547 field9672;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lsl;I)Lum;")
    public static final class527 method3890(class461 arg0, int arg1) {
        field9664++;
        if (arg1 != -1) {
            method3891(-103);
        }
        return new class527(arg0.method2577(2), arg0.method2577(2), arg0.method2577(arg1 ^ 0xFFFFFFFD), arg0.method2577(2), arg0.method2576((byte) 104), arg0.method2576((byte) 99), arg0.method2600((byte) -124));
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
    public static void method3891(int arg0) {
        if (arg0 == 4) {
            field9656 = null;
            field9674 = null;
            field9672 = null;
            field9661 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)V")
    public final void method3892(boolean arg0, int arg1) {
        if (arg0 != this.field9654) {
            int var3 = this.method3897(arg1 ^ 0xFFFF8B15);
            this.field9654 = true;
            this.method3900(69);
            this.method3893(var3, (byte) -72);
        }
        if (arg1 != -29829) {
            this.method3899(44);
        }
        field9667++;
    }

    @OriginalMember(owner = "client!cj", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method3895(32);
        field9671++;
        super.finalize();
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)V")
    private final void method3893(int arg0, byte arg1) {
        this.field9655.field6794 -= arg0;
        field9653++;
        this.field9655.field6794 += this.method3897(108);
        if (arg1 != -72) {
            field9656 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)I")
    public static final int method3894(byte arg0) {
        field9666++;
        if (class259.field3281 == 1) {
            return class300.field3937;
        } else {
            if (arg0 < 23) {
                field9656 = null;
            }
            return field9673;
        }
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V")
    public final void method3895(int arg0) {
        field9668++;
        if (arg0 > 21 && this.field9663 > 0) {
            this.field9655.method2786(this.method3897(106), 50, this.field9663);
            this.field9663 = 0;
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)Z")
    public final boolean method3896(byte arg0) {
        field9675++;
        if (arg0 > -121) {
            return true;
        } else if (this.field9655.field6861) {
            int var2 = this.method3897(119);
            this.field9655.method2850(-118, this);
            OpenGL.glGenerateMipmapEXT(this.field9659);
            this.field9654 = true;
            this.method3900(57);
            this.method3893(var2, (byte) -72);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)I")
    private final int method3897(int arg0) {
        if (arg0 <= 102) {
            this.method3893(-33, (byte) 20);
        }
        field9669++;
        int var2 = this.field9655.method2837(this.field9670, -1) * this.field9658;
        return this.field9654 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(ZI)V")
    public final void method3898(boolean arg0, int arg1) {
        if (arg1 < 6) {
            return;
        }
        field9660++;
        if (this.field9657 != arg0) {
            this.field9657 = arg0;
            this.method3900(-54);
        }
    }

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)I")
    public final int method3899(int arg0) {
        field9662++;
        if (arg0 != 4) {
            this.method3898(false, -117);
        }
        return this.field9663;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lbi;IIIZ)V")
    public class695(class483 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field9655 = arg0;
        this.field9654 = arg4;
        this.field9659 = arg1;
        this.field9658 = arg3;
        this.field9670 = arg2;
        OpenGL.glGenTextures(1, class59.field826, 0);
        this.field9663 = class59.field826[0];
        this.method3893(0, (byte) -72);
    }

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "(I)V")
    private final void method3900(int arg0) {
        field9665++;
        this.field9655.method2850(-47, this);
        int var2 = 81 / ((3 - arg0) / 53);
        if (this.field9657) {
            OpenGL.glTexParameteri(this.field9659, 10241, this.field9654 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field9659, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field9659, 10241, this.field9654 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field9659, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public abstract void method633(int arg0);
}
