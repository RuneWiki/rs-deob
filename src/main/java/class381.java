import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class class381 implements class131 {

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "Z")
    private boolean field5565 = false;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public int field5568;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    public int field5578;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "Z")
    private boolean field5577;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "Lda;")
    public class44 field5575;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    private int field5571;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public int field5561;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public static int field5579 = 20;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "Ls;")
    public static class186 field5567 = new class186(21, -1);

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "Lnn;")
    public static class289 field5581 = new class289(new byte[5000]);

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "La;")
    public static class440 field5580;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V", line = 5)
    public final void method2341(byte arg0) {
        if (arg0 >= -38) {
            field5580 = null;
        }
        field5573++;
        if (this.field5561 > 0) {
            this.field5575.method444(this.field5561, 1, this.method2344((byte) 42));
            this.field5561 = 0;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V", line = 22)
    private final void method2342(int arg0) {
        if (arg0 != 9729) {
            field5579 = 17;
        }
        field5562++;
        this.field5575.method381((byte) 28, this);
        if (this.field5565) {
            OpenGL.glTexParameteri(this.field5578, 10241, this.field5577 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field5578, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field5578, 10241, this.field5577 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field5578, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ac", name = "finalize", descriptor = "()V", line = 46)
    protected final void finalize() throws Throwable {
        this.method2341((byte) -85);
        field5566++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lda;IIIZ)V", line = 181)
    public class381(class44 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field5568 = arg2;
        this.field5578 = arg1;
        this.field5577 = arg4;
        this.field5575 = arg0;
        this.field5571 = arg3;
        OpenGL.glGenTextures(1, class322.field4927, 0);
        this.field5561 = class322.field4927[0];
        this.method2350((byte) 9, 0);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([J[II)V", line = 65)
    public static final void method2343(long[] arg0, int[] arg1, int arg2) {
        class341.method2152(1, arg0.length - 1, arg0, arg1, arg2);
        field5570++;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)I", line = 73)
    private final int method2344(byte arg0) {
        if (arg0 == 42) {
            field5572++;
            int var2 = this.field5575.method420((byte) 89, this.field5568) * this.field5571;
            return this.field5577 ? var2 * 4 / 3 : var2;
        } else {
            return 87;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V", line = 91)
    public static void method2345(boolean arg0) {
        field5580 = null;
        field5567 = null;
        field5581 = null;
        if (arg0) {
            method2345(false);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZ)V", line = 105)
    public final void method2346(int arg0, boolean arg1) {
        field5576++;
        if (this.field5565 != arg1) {
            this.field5565 = arg1;
            this.method2342(9729);
        }
        if (arg0 != 3) {
            field5581 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BZ)V", line = 122)
    public final void method2347(byte arg0, boolean arg1) {
        field5569++;
        if (arg0 != 92) {
            this.method2342(32);
        }
        if (this.field5577 != arg1) {
            int var3 = this.method2344((byte) 42);
            this.field5577 = true;
            this.method2342(arg0 ^ 0x265D);
            this.method2350((byte) 9, var3);
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)I", line = 142)
    public final int method2348(int arg0) {
        if (arg0 != 1) {
            this.field5575 = null;
        }
        field5574++;
        return this.field5561;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)Z", line = 158)
    public final boolean method2349(byte arg0) {
        field5563++;
        if (arg0 != 18) {
            this.method2349((byte) -66);
        }
        if (!this.field5575.field920) {
            return false;
        }
        int var2 = this.method2344((byte) 42);
        this.field5575.method381((byte) 28, this);
        OpenGL.glGenerateMipmapEXT(this.field5578);
        this.field5577 = true;
        this.method2342(9729);
        this.method2350((byte) 9, var2);
        return true;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)V", line = 198)
    private final void method2350(byte arg0, int arg1) {
        this.field5575.field820 -= arg1;
        field5564++;
        this.field5575.field820 += this.method2344((byte) 42);
        if (arg0 != 9) {
            this.method2342(125);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public abstract void method458(int arg0);
}
