import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class511;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public class class526 implements class682 {

    @OriginalMember(owner = "client!bia", name = "c", descriptor = "Z")
    private boolean field7746 = false;

    @OriginalMember(owner = "client!bia", name = "e", descriptor = "Ler;")
    private class113 field7750;

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "Z")
    private boolean field7747;

    @OriginalMember(owner = "client!bia", name = "g", descriptor = "B")
    private byte field7749;

    @OriginalMember(owner = "client!bia", name = "f", descriptor = "I")
    private int field7748;

    @OriginalMember(owner = "client!bia", name = "b", descriptor = "I")
    private int field7752;

    @OriginalMember(owner = "client!bia", name = "d", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field7751;

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    public final Buffer method3929(boolean arg0, int arg1) {
        if (arg1 != -31222) {
            this.method3933((byte) -87, -16, 108);
        }
        if (this.field7751 == null) {
            return null;
        }
        boolean var3 = arg0 & this.field7747;
        if (!this.field7746 && class511.method3844(-2005530585, this.field7751.Lock(0, this.field7748, var3 ? 8192 : 0, this.field7750.field1578))) {
            this.field7746 = true;
            return this.field7750.field1578;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bia", name = "b", descriptor = "(Z)I")
    public final int method3930(boolean arg0) {
        if (!arg0) {
            this.field7750 = null;
        }
        return this.field7749;
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(IIILjaclib/memory/Source;)Z")
    public final boolean method3931(int arg0, int arg1, int arg2, Source arg3) {
        if (arg1 < 42) {
            this.field7748 = 5;
        }
        return this.method3933((byte) -83, arg2, arg0) ? this.field7751.method3851(arg3, 0, 0, this.field7752, this.field7747 ? 8192 : 0) : false;
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(Z)I")
    public final int method975(boolean arg0) {
        if (arg0) {
            this.field7750 = null;
        }
        return this.field7752;
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(I)V")
    public final void method981(int arg0) {
        if (this.field7751 != null) {
            this.field7751.method5123(-1);
            this.field7751 = null;
        }
        if (arg0 != 1328) {
            this.field7750 = null;
        }
        this.field7748 = 0;
        this.field7752 = 0;
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(B)Z")
    public final boolean method3932(byte arg0) {
        if (arg0 != -114) {
            this.method3933((byte) -16, -125, 107);
        }
        if (this.field7746 && class511.method3844(-2005530585, this.field7751.Unlock())) {
            this.field7746 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(BII)Z")
    public final boolean method3933(byte arg0, int arg1, int arg2) {
        if (arg0 >= -22) {
            this.method975(true);
        }
        this.field7749 = (byte) arg2;
        this.field7752 = arg1;
        if (this.field7748 < this.field7752) {
            int var4 = 8;
            byte var5;
            if (this.field7747) {
                var4 |= 0x200;
                var5 = 0;
            } else {
                var5 = 1;
            }
            if (this.field7751 != null) {
                this.field7751.method5123(-120);
            }
            this.field7751 = this.field7750.field1575.method3841(this.field7752, var4, 0, var5, this.field7751);
            this.field7748 = this.field7752;
        }
        return this.field7751 != null;
    }

    @OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(Ler;Z)V")
    public class526(class113 arg0, boolean arg1) {
        this.field7750 = arg0;
        this.field7747 = arg1;
    }
}
