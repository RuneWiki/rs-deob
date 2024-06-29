import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class672;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class140 implements class532 {

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "Z")
    private boolean field2028 = false;

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "Lbk;")
    private class106 field2026;

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "Lik;")
    private class107 field2030;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "Z")
    private boolean field2025;

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "I")
    private int field2027;

    @OriginalMember(owner = "client!ufa", name = "e", descriptor = "I")
    private int field2029;

    @OriginalMember(owner = "client!ufa", name = "g", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field2031;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(II)V")
    public final void method984(int arg0, int arg1) {
        this.field2027 = this.field2026.field1564 * arg0;
        if (this.field2029 < this.field2027) {
            int var3 = 8;
            byte var4;
            if (this.field2025) {
                var4 = 0;
                var3 |= 0x200;
            } else {
                var4 = 1;
            }
            if (this.field2031 != null) {
                this.field2031.method2063((byte) 62);
            }
            this.field2031 = this.field2030.field1600.method3774(this.field2027, var3, class106.field1574 == this.field2026 ? 101 : 102, var4, this.field2031);
            this.field2029 = this.field2027;
        }
        if (arg1 <= 119) {
            this.field2027 = -37;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Z)I")
    public final int method963(boolean arg0) {
        if (arg0) {
            this.field2029 = 101;
        }
        return this.field2027;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    public final Buffer method985(byte arg0, boolean arg1) {
        if (this.field2031 == null) {
            return null;
        }
        boolean var3 = arg1 & this.field2025;
        if (!this.field2028 && class672.method3775(this.field2031.Lock(0, this.field2029, var3 ? 8192 : 0, this.field2030.field1583), 10067)) {
            this.field2028 = true;
            return this.field2030.field1583;
        } else {
            int var4 = 33 % ((1 - arg0) / 39);
            return null;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "(Z)Z")
    public final boolean method986(boolean arg0) {
        if (!arg0) {
            this.method988(true);
        }
        if (this.field2028 && class672.method3775(this.field2031.Unlock(), 10067)) {
            this.field2028 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)V")
    public final void method987(int arg0) {
        if (this.field2031 != null) {
            this.field2031.method2063((byte) -111);
            this.field2031 = null;
        }
        this.field2027 = 0;
        this.field2029 = 0;
        int var2 = -65 / ((arg0 + 81) / 33);
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(Z)Lbk;")
    public final class106 method988(boolean arg0) {
        if (arg0) {
            this.field2029 = -90;
        }
        return this.field2026;
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(Lik;Lbk;Z)V")
    public class140(class107 arg0, class106 arg1, boolean arg2) {
        this.field2026 = arg1;
        this.field2030 = arg0;
        this.field2025 = arg2;
    }
}
