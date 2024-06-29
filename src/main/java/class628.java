import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class484;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class628 implements class366 {

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "Z")
    private boolean field8787 = false;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Lfi;")
    private class558 field8782;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "Z")
    private boolean field8784;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "B")
    private byte field8785;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    private int field8781;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    private int field8783;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field8786;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)I")
    public final int method3628(byte arg0) {
        if (arg0 != 9) {
            this.method1284(false);
        }
        return this.field8785;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)Z")
    public final boolean method1290(int arg0, int arg1, int arg2) {
        if (arg0 > -105) {
            return true;
        }
        this.field8785 = (byte) arg1;
        this.field8781 = arg2;
        if (this.field8781 > this.field8783) {
            int var4 = 8;
            byte var5;
            if (this.field8784) {
                var5 = 0;
                var4 |= 0x200;
            } else {
                var5 = 1;
            }
            if (this.field8786 != null) {
                this.field8786.method3883((byte) 127);
            }
            this.field8786 = this.field8782.field7959.method2914(this.field8781, var4, 0, var5, this.field8786);
            this.field8783 = this.field8781;
        }
        return this.field8786 != null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILjaclib/memory/Source;II)Z")
    public final boolean method1285(int arg0, Source arg1, int arg2, int arg3) {
        if (this.method1290(arg3 - 6383, arg0, arg2)) {
            return this.field8786.method2922(arg1, 0, 0, this.field8781, this.field8784 ? 8192 : 0);
        } else {
            if (arg3 != 6265) {
                this.field8786 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)I")
    public final int method1292(int arg0) {
        return arg0 == 128 ? this.field8781 : -102;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    public final Buffer method1283(byte arg0, boolean arg1) {
        if (this.field8786 == null) {
            return null;
        }
        if (arg0 <= 19) {
            this.method1289((byte) -34);
        }
        boolean var3 = arg1 & this.field8784;
        if (!this.field8787 && class484.method2892((byte) 86, this.field8786.Lock(0, this.field8783, var3 ? 8192 : 0, this.field8782.field7978))) {
            this.field8787 = true;
            return this.field8782.field7978;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
    public final void method1284(boolean arg0) {
        if (this.field8786 != null) {
            this.field8786.method3883((byte) 121);
            this.field8786 = null;
        }
        this.field8783 = 0;
        if (arg0) {
            this.field8781 = 0;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)Z")
    public final boolean method1289(byte arg0) {
        if (this.field8787 && class484.method2892((byte) 46, this.field8786.Unlock())) {
            this.field8787 = false;
            return true;
        } else {
            if (arg0 < 13) {
                this.field8787 = false;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lfi;Z)V")
    public class628(class558 arg0, boolean arg1) {
        this.field8782 = arg0;
        this.field8784 = arg1;
    }
}
