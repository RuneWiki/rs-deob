import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class399;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class252 implements class180 {

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "Z")
    private boolean field3146 = false;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "Z")
    private boolean field3147;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "Lhv;")
    private class188 field3149;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "Lsb;")
    private class280 field3148;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    private int field3144;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    private int field3150;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field3145;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
    public final void method296(byte arg0) {
        if (this.field3145 != null) {
            this.field3145.method3212((byte) 87);
            this.field3145 = null;
        }
        this.field3150 = 0;
        this.field3144 = 0;
        if (arg0 != 36) {
            this.method296((byte) 11);
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)Lsb;")
    public final class280 method1108(int arg0) {
        return arg0 > -123 ? (class280) null : this.field3148;
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)I")
    public final int method288(int arg0) {
        if (arg0 != 7224) {
            this.method288(-28);
        }
        return this.field3144;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)Z")
    public final boolean method290(int arg0) {
        if (this.field3146 && class399.method2379(this.field3145.Unlock(), 28658)) {
            this.field3146 = false;
            return true;
        } else {
            if (arg0 != 22526) {
                this.method290(97);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    public final Buffer method297(byte arg0, boolean arg1) {
        boolean var3 = arg1 & this.field3147;
        if (arg0 != 52) {
            return (Buffer) null;
        } else if (!this.field3146 && class399.method2379(this.field3145.Lock(0, this.field3150, var3 ? 8192 : 0, this.field3149.field2436), 28658)) {
            this.field3146 = true;
            return this.field3149.field2436;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZI)V")
    public final void method292(boolean arg0, int arg1) {
        this.field3144 = this.field3148.field3654 * arg1;
        if (arg0) {
            this.field3147 = true;
        }
        if (this.field3144 <= this.field3150) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field3147) {
            var4 = 0;
            var3 |= 0x200;
        } else {
            var4 = 1;
        }
        if (this.field3145 != null) {
            this.field3145.method3212((byte) 87);
        }
        this.field3145 = this.field3149.field2418.method2400(this.field3144, var3, class280.field3664 == this.field3148 ? 101 : 102, var4, this.field3145);
        this.field3150 = this.field3144;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lhv;Lsb;Z)V")
    public class252(class188 arg0, class280 arg1, boolean arg2) {
        this.field3147 = arg2;
        this.field3149 = arg0;
        this.field3148 = arg1;
    }
}
