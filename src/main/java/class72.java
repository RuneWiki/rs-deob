import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class487;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class72 implements class268 {

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "Z")
    private boolean field888 = false;

    @OriginalMember(owner = "client!naa", name = "g", descriptor = "Lmh;")
    private class632 field894;

    @OriginalMember(owner = "client!naa", name = "e", descriptor = "Lns;")
    private class408 field892;

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "Z")
    private boolean field889;

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "I")
    private int field890;

    @OriginalMember(owner = "client!naa", name = "f", descriptor = "I")
    private int field893;

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field891;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(IB)V", line = 5)
    public final void method585(int arg0, byte arg1) {
        this.field890 = this.field892.field5665 * arg0;
        if (arg1 != 102) {
            this.method588(false);
        }
        if (this.field893 >= this.field890) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field889) {
            var3 |= 0x200;
            var4 = 0;
        } else {
            var4 = 1;
        }
        if (this.field891 != null) {
            this.field891.method3757((byte) -111);
        }
        this.field891 = this.field894.field8422.method2750(this.field890, var3, class408.field5669 == this.field892 ? 101 : 102, var4, this.field891);
        this.field893 = this.field890;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(I)Z", line = 40)
    public final boolean method586(int arg0) {
        if (this.field888 && class487.method2767(this.field891.Unlock(), (byte) 98)) {
            this.field888 = false;
            return true;
        } else {
            if (arg0 != -17694) {
                this.field893 = 77;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;", line = 61)
    public final Buffer method587(int arg0, boolean arg1) {
        if (this.field891 == null) {
            return null;
        }
        boolean var3 = arg1 & this.field889;
        if (arg0 != 30907) {
            this.method585(120, (byte) 79);
        }
        if (!this.field888 && class487.method2767(this.field891.Lock(0, this.field893, var3 ? 8192 : 0, this.field894.field8419), (byte) 122)) {
            this.field888 = true;
            return this.field894.field8419;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(Lmh;Lns;Z)V", line = 118)
    public class72(class632 arg0, class408 arg1, boolean arg2) {
        this.field894 = arg0;
        this.field892 = arg1;
        this.field889 = arg2;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Z)V", line = 90)
    public final void method588(boolean arg0) {
        if (this.field891 != null) {
            this.field891.method3757((byte) 109);
            this.field891 = null;
        }
        if (arg0) {
            this.method585(-116, (byte) 71);
        }
        this.field890 = 0;
        this.field893 = 0;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(B)Lns;", line = 108)
    public final class408 method589(byte arg0) {
        if (arg0 != 81) {
            this.field893 = -120;
        }
        return this.field892;
    }

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(I)I", line = 129)
    public final int method590(int arg0) {
        if (arg0 != -1) {
            this.method590(-118);
        }
        return this.field890;
    }
}
