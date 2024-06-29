import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class507;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public class class598 implements class741 {

    @OriginalMember(owner = "client!bha", name = "c", descriptor = "Z")
    private boolean field8429 = false;

    @OriginalMember(owner = "client!bha", name = "f", descriptor = "Lki;")
    private class735 field8432;

    @OriginalMember(owner = "client!bha", name = "g", descriptor = "Z")
    private boolean field8433;

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "B")
    private byte field8427;

    @OriginalMember(owner = "client!bha", name = "d", descriptor = "I")
    private int field8430;

    @OriginalMember(owner = "client!bha", name = "e", descriptor = "I")
    private int field8431;

    @OriginalMember(owner = "client!bha", name = "b", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field8428;

    @OriginalMember(owner = "client!bha", name = "c", descriptor = "(B)I")
    public final int method51(byte arg0) {
        if (arg0 != -105) {
            this.method3453(85);
        }
        return this.field8430;
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(I)I")
    public final int method3453(int arg0) {
        return arg0 == 17816 ? this.field8427 : 59;
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    public final Buffer method3454(int arg0, boolean arg1) {
        if (this.field8428 == null) {
            return null;
        }
        boolean var3 = arg1 & this.field8433;
        if (arg0 != 13952) {
            this.method3455(-105, 41, 71, null);
        }
        if (!this.field8429 && class507.method2947(this.field8428.Lock(0, this.field8431, var3 ? 8192 : 0, this.field8432.field10276), -44)) {
            this.field8429 = true;
            return this.field8432.field10276;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(IIILjaclib/memory/Source;)Z")
    public final boolean method3455(int arg0, int arg1, int arg2, Source arg3) {
        if (arg1 == 6838) {
            return this.method3457(arg2, arg0, 3882) ? this.field8428.method2976(arg3, 0, 0, this.field8430, this.field8433 ? 8192 : 0) : false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bha", name = "b", descriptor = "(B)Z")
    public final boolean method3456(byte arg0) {
        if (arg0 != 71) {
            this.field8427 = -66;
        }
        if (this.field8429 && class507.method2947(this.field8428.Unlock(), -125)) {
            this.field8429 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(III)Z")
    public final boolean method3457(int arg0, int arg1, int arg2) {
        if (arg2 != 3882) {
            return false;
        }
        this.field8430 = arg0;
        this.field8427 = (byte) arg1;
        if (this.field8431 < this.field8430) {
            int var4 = 8;
            byte var5;
            if (this.field8433) {
                var5 = 0;
                var4 |= 0x200;
            } else {
                var5 = 1;
            }
            if (this.field8428 != null) {
                this.field8428.method3973(false);
            }
            this.field8428 = this.field8432.field10253.method2960(this.field8430, var4, 0, var5, this.field8428);
            this.field8431 = this.field8430;
        }
        return this.field8428 != null;
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(B)V")
    public final void method47(byte arg0) {
        if (this.field8428 != null) {
            this.field8428.method3973(false);
            this.field8428 = null;
        }
        this.field8431 = 0;
        if (arg0 < -18) {
            this.field8430 = 0;
        }
    }

    @OriginalMember(owner = "client!bha", name = "<init>", descriptor = "(Lki;Z)V")
    public class598(class735 arg0, boolean arg1) {
        this.field8432 = arg0;
        this.field8433 = arg1;
    }
}
