import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class448;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 implements class154 {

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "Z")
    private boolean field13 = false;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "Lkaa;")
    private class44 field10;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "Z")
    private boolean field15;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "Lbv;")
    private class279 field11;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    private int field12;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    private int field9;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field14;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)V", line = 5)
    public final void method11(byte arg0) {
        int var2 = 31 / ((arg0 + 86) / 37);
        if (this.field14 != null) {
            this.field14.method3597(100);
            this.field14 = null;
        }
        this.field12 = 0;
        this.field9 = 0;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Z)Lbv;", line = 22)
    public final class279 method12(boolean arg0) {
        return arg0 ? this.field11 : (class279) null;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)V", line = 32)
    public final void method13(int arg0, int arg1) {
        if (arg1 != -6482) {
            return;
        }
        this.field9 = this.field11.field3788 * arg0;
        if (this.field12 >= this.field9) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field15) {
            var3 |= 0x200;
            var4 = 0;
        } else {
            var4 = 1;
        }
        if (this.field14 != null) {
            this.field14.method3597(arg1 ^ 0xFFFFE6CA);
        }
        this.field14 = this.field10.field797.method2664(this.field9, var3, class279.field3794 == this.field11 ? 101 : 102, var4, this.field14);
        this.field12 = this.field9;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;", line = 66)
    public final Buffer method14(boolean arg0, byte arg1) {
        if (this.field14 == null) {
            return null;
        }
        boolean var3 = arg0 & this.field15;
        if (!this.field13 && class448.method2666((byte) -51, this.field14.Lock(0, this.field12, var3 ? 8192 : 0, this.field10.field793))) {
            this.field13 = true;
            return this.field10.field793;
        } else if (arg1 == -60) {
            return null;
        } else {
            return (Buffer) null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)Z", line = 87)
    public final boolean method15(int arg0) {
        if (arg0 != -1969) {
            return false;
        } else if (this.field13 && class448.method2666((byte) 127, this.field14.Unlock())) {
            this.field13 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)I", line = 109)
    public final int method16(int arg0) {
        if (arg0 != 34962) {
            this.field12 = -4;
        }
        return this.field9;
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lkaa;Lbv;Z)V", line = 125)
    public class3(class44 arg0, class279 arg1, boolean arg2) {
        this.field10 = arg0;
        this.field15 = arg2;
        this.field11 = arg1;
    }
}
