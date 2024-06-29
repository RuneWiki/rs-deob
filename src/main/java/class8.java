import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class507;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 implements class532 {

    @OriginalMember(owner = "client!to", name = "g", descriptor = "Z")
    private boolean field87 = false;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "Lki;")
    private class735 field85;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "Lkn;")
    private class770 field86;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "Z")
    private boolean field83;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    private int field82;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    private int field84;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field81;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(B)Lkn;")
    public final class770 method46(byte arg0) {
        if (arg0 != -12) {
            this.method48((byte) -8, false);
        }
        return this.field86;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V")
    public final void method47(byte arg0) {
        if (arg0 > -18) {
            this.method46((byte) 93);
        }
        if (this.field81 != null) {
            this.field81.method3973(false);
            this.field81 = null;
        }
        this.field82 = 0;
        this.field84 = 0;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    public final Buffer method48(byte arg0, boolean arg1) {
        if (this.field81 == null) {
            return null;
        }
        if (arg0 != -31) {
            this.method50(true, 106);
        }
        boolean var3 = arg1 & this.field83;
        if (!this.field87 && class507.method2947(this.field81.Lock(0, this.field82, var3 ? 8192 : 0, this.field85.field10276), arg0 - 97)) {
            this.field87 = true;
            return this.field85.field10276;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)Z")
    public final boolean method49(int arg0) {
        if (arg0 != -11488) {
            return false;
        } else if (this.field87 && class507.method2947(this.field81.Unlock(), -116)) {
            this.field87 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ZI)V")
    public final void method50(boolean arg0, int arg1) {
        if (arg0) {
            this.field87 = true;
        }
        this.field84 = this.field86.field10608 * arg1;
        if (this.field82 >= this.field84) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field83) {
            var3 |= 0x200;
            var4 = 0;
        } else {
            var4 = 1;
        }
        if (this.field81 != null) {
            this.field81.method3973(false);
        }
        this.field81 = this.field85.field10253.method2953(this.field84, var3, class770.field10615 == this.field86 ? 101 : 102, var4, this.field81);
        this.field82 = this.field84;
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(B)I")
    public final int method51(byte arg0) {
        return arg0 == -105 ? this.field84 : -3;
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lki;Lkn;Z)V")
    public class8(class735 arg0, class770 arg1, boolean arg2) {
        this.field85 = arg0;
        this.field86 = arg1;
        this.field83 = arg2;
    }
}
