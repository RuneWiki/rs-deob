import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class399;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class303 implements class133 {

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "Z")
    private boolean field3926 = false;

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "Lhv;")
    private class188 field3927;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "Z")
    private boolean field3921;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "B")
    private byte field3922;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
    private int field3923;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
    private int field3924;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field3925;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)Z")
    public final boolean method290(int arg0) {
        if (arg0 != 22526) {
            this.method288(87);
        }
        if (this.field3926 && class399.method2379(this.field3925.Unlock(), 28658)) {
            this.field3926 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)I")
    public final int method288(int arg0) {
        return arg0 == 7224 ? this.field3924 : 126;
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)I")
    public final int method1840(int arg0) {
        return arg0 == 1708 ? this.field3922 : -122;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V")
    public final void method296(byte arg0) {
        if (this.field3925 != null) {
            this.field3925.method3212((byte) 87);
            this.field3925 = null;
        }
        this.field3924 = 0;
        this.field3923 = 0;
        if (arg0 != 36) {
            this.field3922 = 66;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(III)Z")
    public final boolean method703(int arg0, int arg1, int arg2) {
        this.field3922 = (byte) arg2;
        this.field3924 = arg0;
        if (arg1 != 11360) {
            this.field3927 = null;
        }
        if (this.field3924 > this.field3923) {
            int var4 = 8;
            byte var5;
            if (this.field3921) {
                var5 = 0;
                var4 |= 0x200;
            } else {
                var5 = 1;
            }
            if (this.field3925 != null) {
                this.field3925.method3212((byte) 87);
            }
            this.field3925 = this.field3927.field2418.method2397(this.field3924, var4, 0, var5, this.field3925);
            this.field3923 = this.field3924;
        }
        return this.field3925 != null;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Ljaclib/memory/Source;IBI)Z")
    public final boolean method704(Source arg0, int arg1, byte arg2, int arg3) {
        int var5 = -23 / ((74 - arg2) / 40);
        return this.method703(arg1, 11360, arg3) ? this.field3925.method2381(arg0, 0, 0, this.field3924, this.field3921 ? 8192 : 0) : false;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    public final Buffer method297(byte arg0, boolean arg1) {
        boolean var3 = arg1 & this.field3921;
        if (!this.field3926 && class399.method2379(this.field3925.Lock(0, this.field3923, var3 ? 8192 : 0, this.field3927.field2436), 28658)) {
            this.field3926 = true;
            return this.field3927.field2436;
        } else {
            if (arg0 != 52) {
                this.field3922 = 16;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lhv;Z)V")
    public class303(class188 arg0, boolean arg1) {
        this.field3927 = arg0;
        this.field3921 = arg1;
    }
}
