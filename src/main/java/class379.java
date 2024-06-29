import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class439;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class379 implements class401 {

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "Z")
    private boolean field4792 = false;

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "Z")
    private boolean field4793;

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "Lgaa;")
    private class302 field4794;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "B")
    private byte field4791;

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "I")
    private int field4795;

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "I")
    private int field4796;

    @OriginalMember(owner = "client!ov", name = "g", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field4797;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(III)Z")
    public final boolean method324(int arg0, int arg1, int arg2) {
        if (arg0 > -29) {
            this.method326(null, -126, 11, (byte) -116);
        }
        this.field4791 = (byte) arg1;
        this.field4796 = arg2;
        if (this.field4796 > this.field4795) {
            int var4 = 8;
            byte var5;
            if (this.field4793) {
                var4 |= 0x200;
                var5 = 0;
            } else {
                var5 = 1;
            }
            if (this.field4797 != null) {
                this.field4797.method3435(6168);
            }
            this.field4797 = this.field4794.field3716.method2326(this.field4796, var4, 0, var5, this.field4797);
            this.field4795 = this.field4796;
        }
        return this.field4797 != null;
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(B)I")
    public final int method2058(byte arg0) {
        return arg0 == -102 ? this.field4791 : 82;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Ljaclib/memory/Source;IIB)Z")
    public final boolean method326(Source arg0, int arg1, int arg2, byte arg3) {
        if (this.method324(-115, arg1, arg2)) {
            return this.field4797.method2307(arg0, 0, 0, this.field4796, this.field4793 ? 8192 : 0);
        } else {
            if (arg3 <= 20) {
                this.field4794 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)Z")
    public final boolean method322(int arg0) {
        if (this.field4792 && class439.method2333(this.field4797.Unlock(), -2005530519)) {
            this.field4792 = false;
            return true;
        } else {
            if (arg0 < 12) {
                this.method324(16, -79, 8);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)V")
    public final void method323(int arg0) {
        if (this.field4797 != null) {
            this.field4797.method3435(6168);
            this.field4797 = null;
        }
        if (arg0 != -21271) {
            this.field4794 = null;
        }
        this.field4795 = 0;
        this.field4796 = 0;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)I")
    public final int method330(byte arg0) {
        if (arg0 < 11) {
            this.method2058((byte) -5);
        }
        return this.field4796;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    public final Buffer method325(boolean arg0, int arg1) {
        if (this.field4797 == null) {
            return null;
        }
        boolean var3 = arg0 & this.field4793;
        if (!this.field4792 && class439.method2333(this.field4797.Lock(0, this.field4795, var3 ? 8192 : 0, this.field4794.field3724), arg1 ^ 0x887677BF)) {
            this.field4792 = true;
            return this.field4794.field3724;
        } else {
            if (arg1 != 32726) {
                this.method323(62);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lgaa;Z)V")
    public class379(class302 arg0, boolean arg1) {
        this.field4793 = arg1;
        this.field4794 = arg0;
    }
}
