import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public abstract class class31 implements class401 {

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "Z")
    private boolean field511 = false;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "Lgk;")
    public class463 field512;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    public int field519;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public int field521;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "Z")
    private boolean field517;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public int field509;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    public static int field518 = 0;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "Llv;")
    public static class524 field516;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)V", line = 3)
    private final void method209(boolean arg0) {
        field523++;
        this.field512.method2771(this, -16785);
        if (!arg0) {
            this.method215(false, -13);
        }
        if (this.field511) {
            OpenGL.glTexParameteri(this.field521, 10241, this.field517 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field521, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field521, 10241, this.field517 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field521, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZB)V", line = 25)
    public final void method210(boolean arg0, byte arg1) {
        if (arg0 != this.field511) {
            this.field511 = arg0;
            this.method209(true);
        }
        field507++;
        int var3 = 100 % ((arg1 + 42) / 42);
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)I", line = 43)
    private final int method211(int arg0) {
        if (arg0 != 0) {
            this.method219(87);
        }
        field522++;
        int var2 = this.field512.method2784(-123, this.field519) * this.field524;
        return this.field517 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(Z)V", line = 56)
    public static final void method212(boolean arg0) {
        field515++;
        class319.field4112.field1176 = 0;
        class448.field6233 = null;
        class353.field4528 = null;
        if (arg0) {
            return;
        }
        class439.field6112 = 0;
        class432.field5955 = null;
        class353.field4526 = null;
        class109.field1514.field1176 = 0;
        class37.field574 = 0;
        class285.field3634 = 0;
        class88.method555((byte) 78);
        class188.method1237(-34);
        for (int var1 = 0; var1 < 2048; var1++) {
            class76.field952[var1] = null;
        }
        class37.field573 = null;
        for (int var2 = 0; var2 < class527.field7791.length; var2++) {
            class295 var4 = class527.field7791[var2];
            if (var4 != null) {
                var4.field5202 = -1;
            }
        }
        class216.method1387((byte) -108);
        class396.field5271 = 1;
        class294.method1767(30, (byte) -49);
        for (int var3 = 0; var3 < 100; var3++) {
            class76.field967[var3] = true;
        }
        class250.method1567(6);
        class282.field3609 = null;
        class423.field5828 = 0L;
    }

    @OriginalMember(owner = "client!rh", name = "finalize", descriptor = "()V", line = 114)
    protected final void finalize() throws Throwable {
        this.method219(-23222);
        field520++;
        super.finalize();
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)I", line = 126)
    public static int method213(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)I", line = 135)
    public final int method214(int arg0) {
        field508++;
        return arg0 == 14532 ? this.field509 : -85;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZI)V", line = 149)
    public final void method215(boolean arg0, int arg1) {
        field514++;
        if (arg0 != this.field517) {
            int var3 = this.method211(0);
            this.field517 = true;
            this.method209(true);
            this.method216(var3, -127);
        }
        if (arg1 != 0) {
            this.method217(-61);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)V", line = 174)
    private final void method216(int arg0, int arg1) {
        field510++;
        this.field512.field6704 -= arg0;
        if (arg1 >= 0) {
            this.method211(99);
        }
        this.field512.field6704 += this.method211(0);
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)Z", line = 186)
    public final boolean method217(int arg0) {
        field513++;
        if (!this.field512.field6719) {
            return arg0 <= 4;
        }
        int var2 = this.method211(0);
        this.field512.method2771(this, -16785);
        OpenGL.glGenerateMipmapEXT(this.field521);
        this.field517 = true;
        this.method209(true);
        this.method216(var2, -7);
        return true;
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)V", line = 210)
    public static void method218(int arg0) {
        field516 = null;
        if (arg0 != 9729) {
            method218(-75);
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lgk;IIIZ)V", line = 224)
    public class31(class463 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field524 = arg3;
        this.field512 = arg0;
        this.field519 = arg2;
        this.field521 = arg1;
        this.field517 = arg4;
        OpenGL.glGenTextures(1, class198.field2556, 0);
        this.field509 = class198.field2556[0];
        this.method216(0, -18);
    }

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "(I)V", line = 246)
    public final void method219(int arg0) {
        if (arg0 != -23222) {
            return;
        }
        if (this.field509 > 0) {
            this.field512.method2756(this.method211(0), this.field509, 114);
            this.field509 = 0;
        }
        field525++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public abstract void method220(int arg0);
}
