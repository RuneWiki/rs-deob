import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class451;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class626 implements class519 {

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "Z")
    private boolean field8494 = false;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Ltga;")
    private class54 field8493;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Z")
    private boolean field8492;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "B")
    private byte field8495;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    private int field8497;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    private int field8498;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field8496;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 4)
    public final void method60(int arg0) {
        if (this.field8496 != null) {
            this.field8496.method3542(86);
            this.field8496 = null;
        }
        if (arg0 != 5634) {
            this.field8494 = false;
        }
        this.field8497 = 0;
        this.field8498 = 0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBI)Z", line = 22)
    public final boolean method2814(int arg0, byte arg1, int arg2) {
        this.field8495 = (byte) arg0;
        if (arg1 != -99) {
            this.field8495 = 16;
        }
        this.field8497 = arg2;
        if (this.field8497 > this.field8498) {
            int var4 = 8;
            byte var5;
            if (this.field8492) {
                var4 |= 0x200;
                var5 = 0;
            } else {
                var5 = 1;
            }
            if (this.field8496 != null) {
                this.field8496.method3542(71);
            }
            this.field8496 = this.field8493.field696.method2475(this.field8497, var4, 0, var5, this.field8496);
            this.field8498 = this.field8497;
        }
        return this.field8496 != null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILjaclib/memory/Source;II)Z", line = 60)
    public final boolean method2813(int arg0, Source arg1, int arg2, int arg3) {
        if (this.method2814(arg2, (byte) -99, arg3)) {
            return this.field8496.method2486(arg1, 0, 0, this.field8497, this.field8492 ? 8192 : 0);
        } else {
            return arg0 >= -41;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Z", line = 78)
    public final boolean method61(byte arg0) {
        if (arg0 != 96) {
            this.field8497 = -85;
        }
        if (this.field8494 && class451.method2482(14528, this.field8496.Unlock())) {
            this.field8494 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)I", line = 104)
    public final int method503(int arg0) {
        if (arg0 != -3267) {
            this.method2814(-118, (byte) -71, 91);
        }
        return this.field8497;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;", line = 114)
    public final Buffer method62(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.field8497 = -127;
        }
        if (this.field8496 == null) {
            return null;
        }
        boolean var3 = arg1 & this.field8492;
        if (!this.field8494 && class451.method2482(14528, this.field8496.Lock(0, this.field8498, var3 ? 8192 : 0, this.field8493.field680))) {
            this.field8494 = true;
            return this.field8493.field680;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)I", line = 134)
    public final int method3496(boolean arg0) {
        return arg0 ? this.field8495 : -69;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Ltga;Z)V", line = 145)
    public class626(class54 arg0, boolean arg1) {
        this.field8493 = arg0;
        this.field8492 = arg1;
    }
}
