import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public abstract class class615 implements class54 {

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "Z")
    private boolean field8630 = false;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "Lqj;")
    public class548 field8644;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    private int field8643;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "Z")
    private boolean field8633;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public int field8638;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public int field8640;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public int field8646;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field8631;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field8632;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field8634;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field8635;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field8636;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field8637;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    public static int field8639;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field8641;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field8642;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field8645;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    public static int field8647;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([BZ)V")
    public static final void method3388(byte[] arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field8639++;
        class630 var2 = new class630(arg0);
        while (true) {
            int var3 = var2.method3501(-9268);
            if (var3 == 0) {
                return;
            }
            if (var3 == 2) {
                class405.field5073 = var2.method3470(13111);
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)I")
    public final int method3389(boolean arg0) {
        if (!arg0) {
            this.field8646 = -92;
        }
        field8645++;
        return this.field8646;
    }

    @OriginalMember(owner = "client!rg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method3392((byte) -69);
        field8634++;
        super.finalize();
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
    private final void method3390(int arg0) {
        this.field8644.method2960(this, -2);
        field8647++;
        if (arg0 != 29924) {
            this.field8638 = -80;
        }
        if (this.field8630) {
            OpenGL.glTexParameteri(this.field8638, 10241, this.field8633 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field8638, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field8638, 10241, this.field8633 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field8638, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)I")
    private final int method3391(byte arg0) {
        field8636++;
        int var2 = this.field8644.method2963(-6402, this.field8640) * this.field8643;
        int var3 = 38 / ((arg0 + 31) / 54);
        return this.field8633 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V")
    public final void method3392(byte arg0) {
        field8641++;
        if (arg0 <= -7 && this.field8646 > 0) {
            this.field8644.method3008(this.method3391((byte) -92), 20024, this.field8646);
            this.field8646 = 0;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
    private final void method3393(int arg0, int arg1) {
        field8631++;
        this.field8644.field7498 -= arg0;
        this.field8644.field7498 += this.method3391((byte) 35);
        if (arg1 >= -27) {
            this.method3394(114);
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)Z")
    public final boolean method3394(int arg0) {
        field8632++;
        if (this.field8644.field7593) {
            int var2 = this.method3391((byte) 111);
            this.field8644.method2960(this, -2);
            OpenGL.glGenerateMipmapEXT(this.field8638);
            this.field8633 = true;
            this.method3390(29924);
            this.method3393(var2, -89);
            return true;
        } else if (arg0 == 9566) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZI)V")
    public final void method3395(boolean arg0, int arg1) {
        field8642++;
        if (arg0 != this.field8633) {
            int var3 = this.method3391((byte) -92);
            this.field8633 = true;
            this.method3390(29924);
            this.method3393(var3, -111);
        }
        if (arg1 != 3) {
            this.field8646 = 91;
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(ZI)V")
    public final void method3396(boolean arg0, int arg1) {
        field8637++;
        if (arg1 == 17137 && this.field8630 != arg0) {
            this.field8630 = arg0;
            this.method3390(29924);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method3397(byte arg0, String arg1) {
        if (arg0 <= 91) {
            return null;
        }
        field8635++;
        String var2 = class85.method490(class102.method576(0, arg1), 124);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lqj;IIIZ)V")
    public class615(class548 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field8644 = arg0;
        this.field8643 = arg3;
        this.field8633 = arg4;
        this.field8638 = arg1;
        this.field8640 = arg2;
        OpenGL.glGenTextures(1, class57.field809, 0);
        this.field8646 = class57.field809[0];
        this.method3393(0, -44);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public abstract void method216(int arg0);
}
