import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class735;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class682 implements class33 {

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "Z")
    private boolean field9693 = false;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "Lwq;")
    private class674 field9691;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "Z")
    private boolean field9688;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "Lad;")
    private class173 field9687;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    private int field9690;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    private int field9692;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field9689;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)I", line = 7)
    public final int method1105(boolean arg0) {
        if (arg0) {
            this.field9693 = true;
        }
        return this.field9690;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)Z", line = 18)
    public final boolean method178(byte arg0) {
        if (arg0 > -100) {
            this.method176(-103);
        }
        if (this.field9693 && class735.method4119(-2005530516, this.field9689.Unlock())) {
            this.field9693 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)Lwq;", line = 41)
    public final class674 method176(int arg0) {
        if (arg0 != 29119) {
            this.field9693 = false;
        }
        return this.field9691;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V", line = 51)
    public final void method175(int arg0) {
        if (this.field9689 != null) {
            this.field9689.method2583((byte) -105);
            this.field9689 = null;
        }
        int var2 = 127 / ((-arg0 - 17) / 40);
        this.field9690 = 0;
        this.field9692 = 0;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IB)V", line = 68)
    public final void method174(int arg0, byte arg1) {
        this.field9690 = this.field9691.field9586 * arg0;
        if (arg1 != 39) {
            this.method175(-121);
        }
        if (this.field9690 <= this.field9692) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field9688) {
            var4 = 0;
            var3 |= 0x200;
        } else {
            var4 = 1;
        }
        if (this.field9689 != null) {
            this.field9689.method2583((byte) -91);
        }
        this.field9689 = this.field9687.field2418.method4104(this.field9690, var3, class674.field9591 == this.field9691 ? 101 : 102, var4, this.field9689);
        this.field9692 = this.field9690;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;", line = 101)
    public final Buffer method177(boolean arg0, byte arg1) {
        if (this.field9689 == null) {
            return null;
        }
        boolean var3 = arg0 & this.field9688;
        if (arg1 > -99) {
            return (Buffer) null;
        } else if (!this.field9693 && class735.method4119(-2005530516, this.field9689.Lock(0, this.field9692, var3 ? 8192 : 0, this.field9687.field2423))) {
            this.field9693 = true;
            return this.field9687.field2423;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lad;Lwq;Z)V", line = 126)
    public class682(class173 arg0, class674 arg1, boolean arg2) {
        this.field9691 = arg1;
        this.field9688 = arg2;
        this.field9687 = arg0;
    }
}
