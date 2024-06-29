import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class675;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class707 implements class498 {

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "Z")
    private boolean field9868 = false;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "Lmba;")
    private class70 field9867;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "Z")
    private boolean field9870;

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "Llj;")
    private class6 field9871;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
    private int field9869;

    @OriginalMember(owner = "client!nt", name = "g", descriptor = "I")
    private int field9873;

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field9872;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IB)V", line = 5)
    public final void method2429(int arg0, byte arg1) {
        if (arg1 >= -29) {
            this.method2429(112, (byte) 74);
        }
        this.field9869 = this.field9871.field43 * arg0;
        if (this.field9869 <= this.field9873) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field9870) {
            var3 |= 0x200;
            var4 = 0;
        } else {
            var4 = 1;
        }
        if (this.field9872 != null) {
            this.field9872.method1941((byte) -46);
        }
        this.field9872 = this.field9867.field958.method3707(this.field9869, var3, class6.field49 == this.field9871 ? 101 : 102, var4, this.field9872);
        this.field9873 = this.field9869;
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(I)Z", line = 37)
    public final boolean method646(int arg0) {
        if (this.field9868 && class675.method3703((byte) -58, this.field9872.Unlock())) {
            this.field9868 = false;
            return true;
        } else {
            return arg0 >= -100;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;", line = 57)
    public final Buffer method647(boolean arg0, boolean arg1) {
        if (this.field9872 == null) {
            return null;
        } else if (arg0) {
            return (Buffer) null;
        } else {
            boolean var3 = arg1 & this.field9870;
            if (!this.field9868 && class675.method3703((byte) -58, this.field9872.Lock(0, this.field9873, var3 ? 8192 : 0, this.field9867.field950))) {
                this.field9868 = true;
                return this.field9867.field950;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "(I)Llj;", line = 81)
    public final class6 method2700(int arg0) {
        int var2 = -83 % ((-arg0 - 61) / 36);
        return this.field9871;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V", line = 93)
    public final void method645(int arg0) {
        if (this.field9872 != null) {
            this.field9872.method1941((byte) -46);
            this.field9872 = null;
        }
        this.field9869 = 0;
        this.field9873 = 0;
        int var2 = -98 / ((37 - arg0) / 36);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Z)I", line = 110)
    public final int method648(boolean arg0) {
        if (!arg0) {
            this.field9873 = 1;
        }
        return this.field9869;
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lmba;Llj;Z)V", line = 125)
    public class707(class70 arg0, class6 arg1, boolean arg2) {
        this.field9867 = arg0;
        this.field9870 = arg2;
        this.field9871 = arg1;
    }
}
