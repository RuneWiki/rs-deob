import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class737;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class288 implements class212 {

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "Z")
    private boolean field3788 = false;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "Z")
    private boolean field3789;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "Lrd;")
    private class549 field3784;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "Lkf;")
    private class720 field3786;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    private int field3785;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    private int field3787;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field3790;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V", line = 9)
    public final void method1398(boolean arg0) {
        if (this.field3790 != null) {
            this.field3790.method2573((byte) -99);
            this.field3790 = null;
        }
        if (!arg0) {
            this.field3785 = 0;
            this.field3787 = 0;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;", line = 26)
    public final Buffer method1401(boolean arg0, int arg1) {
        if (this.field3790 == null) {
            return null;
        }
        boolean var3 = arg0 & this.field3789;
        if (!this.field3788 && class737.method4096(51, this.field3790.Lock(0, this.field3787, var3 ? 8192 : 0, this.field3784.field7759))) {
            this.field3788 = true;
            return this.field3784.field7759;
        } else {
            if (arg1 < 16) {
                this.method1402(35);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)Z", line = 47)
    public final boolean method1400(boolean arg0) {
        if (arg0) {
            this.method1399(-112, true);
        }
        if (this.field3788 && class737.method4096(125, this.field3790.Unlock())) {
            this.field3788 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)Lkf;", line = 69)
    public final class720 method1402(int arg0) {
        if (arg0 >= -74) {
            this.field3789 = false;
        }
        return this.field3786;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(Z)I", line = 81)
    public final int method1683(boolean arg0) {
        return arg0 ? -94 : this.field3785;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZ)V", line = 92)
    public final void method1399(int arg0, boolean arg1) {
        this.field3785 = this.field3786.field10158 * arg0;
        if (!arg1) {
            this.method1683(true);
        }
        if (this.field3785 <= this.field3787) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field3789) {
            var3 |= 0x200;
            var4 = 0;
        } else {
            var4 = 1;
        }
        if (this.field3790 != null) {
            this.field3790.method2573((byte) -128);
        }
        this.field3790 = this.field3784.field7746.method4105(this.field3785, var3, class720.field10165 == this.field3786 ? 101 : 102, var4, this.field3790);
        this.field3787 = this.field3785;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lrd;Lkf;Z)V", line = 127)
    public class288(class549 arg0, class720 arg1, boolean arg2) {
        this.field3789 = arg2;
        this.field3784 = arg0;
        this.field3786 = arg1;
    }
}
