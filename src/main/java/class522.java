import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class484;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class522 implements class216 {

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Z")
    private boolean field7461 = false;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Z")
    private boolean field7462;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Lok;")
    private class256 field7465;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "Lfi;")
    private class558 field7466;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    private int field7463;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    private int field7464;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field7467;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)Z", line = 5)
    public final boolean method1459(int arg0) {
        if (this.field7461 && class484.method2892((byte) 45, this.field7467.Unlock())) {
            this.field7461 = false;
            return true;
        } else {
            return arg0 != -26499;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V", line = 27)
    public final void method1284(boolean arg0) {
        if (!arg0) {
            this.field7466 = null;
        }
        if (this.field7467 != null) {
            this.field7467.method3883((byte) 77);
            this.field7467 = null;
        }
        this.field7463 = 0;
        this.field7464 = 0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;", line = 44)
    public final Buffer method1457(boolean arg0, int arg1) {
        if (arg1 >= -109) {
            this.field7462 = true;
        }
        if (this.field7467 == null) {
            return null;
        }
        boolean var3 = arg0 & this.field7462;
        if (!this.field7461 && class484.method2892((byte) 120, this.field7467.Lock(0, this.field7463, var3 ? 8192 : 0, this.field7466.field7978))) {
            this.field7461 = true;
            return this.field7466.field7978;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)I", line = 69)
    public final int method1292(int arg0) {
        return arg0 == 128 ? this.field7464 : 99;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lfi;Lok;Z)V", line = 128)
    public class522(class558 arg0, class256 arg1, boolean arg2) {
        this.field7462 = arg2;
        this.field7465 = arg1;
        this.field7466 = arg0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)V", line = 88)
    public final void method1458(byte arg0, int arg1) {
        this.field7464 = this.field7465.field3673 * arg1;
        if (arg0 != 91 || this.field7463 >= this.field7464) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field7462) {
            var3 |= 0x200;
            var4 = 0;
        } else {
            var4 = 1;
        }
        if (this.field7467 != null) {
            this.field7467.method3883((byte) 75);
        }
        this.field7467 = this.field7466.field7959.method2899(this.field7464, var3, class256.field3678 == this.field7465 ? 101 : 102, var4, this.field7467);
        this.field7463 = this.field7464;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)Lok;", line = 119)
    public final class256 method1460(int arg0) {
        if (arg0 <= 48) {
            this.method1459(106);
        }
        return this.field7465;
    }
}
