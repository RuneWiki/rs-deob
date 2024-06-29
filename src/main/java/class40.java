import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public abstract class class40 implements class313 {

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "Z")
    private boolean field508 = false;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public int field496;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
    public int field505;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "Lef;")
    public class338 field503;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    private int field500;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "Z")
    private boolean field507;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public int field501;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "Ldi;")
    public static class83 field495 = new class83(70, -1);

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "[I")
    public static int[] field506;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V", line = 6)
    public static void method334(int arg0) {
        field506 = null;
        if (arg0 != 0) {
            method339(true, 108, -0.020463753F, -0.50382686F, -0.8055141F);
        }
        field495 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BZ)V", line = 19)
    public final void method335(byte arg0, boolean arg1) {
        field497++;
        if (arg1 != this.field508) {
            this.field508 = arg1;
            this.method338(9729);
        }
        if (arg0 != 51) {
            method339(false, -25, 0.8119235F, 1.4421253F, 0.47541475F);
        }
    }

    @OriginalMember(owner = "client!mk", name = "finalize", descriptor = "()V", line = 35)
    protected final void finalize() throws Throwable {
        this.method341(-7733);
        field502++;
        super.finalize();
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)Z", line = 53)
    public final boolean method336(int arg0) {
        field499++;
        if (!this.field503.field4798) {
            if (arg0 != 9323) {
                this.method336(104);
            }
            return false;
        }
        int var2 = this.method343((byte) -112);
        this.field503.method1996(2, this);
        OpenGL.glGenerateMipmapEXT(this.field505);
        this.field507 = true;
        this.method338(9729);
        this.method337(var2, (byte) 114);
        return true;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)V", line = 79)
    private final void method337(int arg0, byte arg1) {
        field504++;
        if (arg1 >= 83) {
            this.field503.field4757 -= arg0;
            this.field503.field4757 += this.method343((byte) 102);
        }
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)V", line = 95)
    private final void method338(int arg0) {
        field494++;
        if (arg0 != 9729) {
            this.field508 = false;
        }
        this.field503.method1996(2, this);
        if (this.field508) {
            OpenGL.glTexParameteri(this.field505, 10241, this.field507 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field505, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field505, 10241, this.field507 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field505, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZIFFF)F", line = 118)
    public static final float method339(boolean arg0, int arg1, float arg2, float arg3, float arg4) {
        if (!arg0) {
            method334(90);
        }
        field498++;
        float[] var5 = class55.field664[arg1];
        return var5[2] * arg3 + var5[1] * arg2 + var5[0] * arg4;
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)I", line = 132)
    public final int method340(int arg0) {
        if (arg0 == 1) {
            field491++;
            return this.field501;
        } else {
            return 95;
        }
    }

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "(I)V", line = 145)
    public final void method341(int arg0) {
        if (this.field501 > 0) {
            this.field503.method1953(this.field501, (byte) 68, this.method343((byte) 46));
            this.field501 = 0;
        }
        if (arg0 != -7733) {
            this.method337(-115, (byte) 96);
        }
        field492++;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lef;IIIZ)V", line = 200)
    public class40(class338 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field496 = arg2;
        this.field505 = arg1;
        this.field503 = arg0;
        this.field500 = arg3;
        this.field507 = arg4;
        OpenGL.glGenTextures(1, class524.field7755, 0);
        this.field501 = class524.field7755[0];
        this.method337(0, (byte) 101);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZI)V", line = 168)
    public final void method342(boolean arg0, int arg1) {
        if (arg1 != 9729) {
            this.field500 = -16;
        }
        field509++;
        if (this.field507 != arg0) {
            int var3 = this.method343((byte) 71);
            this.field507 = true;
            this.method338(arg1);
            this.method337(var3, (byte) 111);
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)I", line = 189)
    private final int method343(byte arg0) {
        field493++;
        int var2 = -120 / ((-arg0 - 8) / 48);
        int var3 = this.field503.method1956(this.field496, 6410) * this.field500;
        return this.field507 ? var3 * 4 / 3 : var3;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
    public abstract void method332(byte arg0);
}
