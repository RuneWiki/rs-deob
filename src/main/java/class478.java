import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class443;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class478 implements class659 {

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Z")
    private boolean field6678 = false;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Z")
    private boolean field6677;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "Lvg;")
    private class49 field6680;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Lps;")
    private class82 field6675;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    private int field6679;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    private int field6681;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field6676;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)I", line = 6)
    public final int method21(boolean arg0) {
        if (arg0) {
            this.method775(-98);
        }
        return this.field6681;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)V", line = 18)
    public final void method777(int arg0, byte arg1) {
        if (arg1 != 73) {
            this.method775(121);
        }
        this.field6681 = this.field6675.field1141 * arg0;
        if (this.field6679 >= this.field6681) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field6677) {
            var4 = 0;
            var3 |= 0x200;
        } else {
            var4 = 1;
        }
        if (this.field6676 != null) {
            this.field6676.method3440(arg1 ^ 0x5203);
        }
        this.field6676 = this.field6680.field720.method2554(this.field6681, var3, class82.field1148 == this.field6675 ? 101 : 102, var4, this.field6676);
        this.field6679 = this.field6681;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(Z)V", line = 50)
    public final void method776(boolean arg0) {
        if (arg0) {
            this.method777(-66, (byte) 21);
        }
        if (this.field6676 != null) {
            this.field6676.method3440(21066);
            this.field6676 = null;
        }
        this.field6679 = 0;
        this.field6681 = 0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;", line = 72)
    public final Buffer method779(byte arg0, boolean arg1) {
        if (this.field6676 == null) {
            return null;
        }
        boolean var3 = arg1 & this.field6677;
        if (arg0 != -20) {
            this.method21(true);
        }
        if (!this.field6678 && class443.method2538(-1, this.field6676.Lock(0, this.field6679, var3 ? 8192 : 0, this.field6680.field732))) {
            this.field6678 = true;
            return this.field6680.field732;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lvg;Lps;Z)V", line = 127)
    public class478(class49 arg0, class82 arg1, boolean arg2) {
        this.field6677 = arg2;
        this.field6680 = arg0;
        this.field6675 = arg1;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Z", line = 99)
    public final boolean method774(int arg0) {
        if (this.field6678 && class443.method2538(arg0 + 22323, this.field6676.Unlock())) {
            this.field6678 = false;
            return true;
        } else {
            if (arg0 != -22324) {
                this.method779((byte) 97, true);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)Lps;", line = 121)
    public final class82 method775(int arg0) {
        int var2 = -4 % ((-arg0 - 31) / 57);
        return this.field6675;
    }
}
