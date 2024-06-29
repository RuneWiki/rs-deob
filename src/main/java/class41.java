import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class485;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class41 implements class591 {

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "Z")
    private boolean field614 = false;

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "Lul;")
    private class574 field615;

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "Z")
    private boolean field616;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "B")
    private byte field613;

    @OriginalMember(owner = "client!vba", name = "e", descriptor = "I")
    private int field617;

    @OriginalMember(owner = "client!vba", name = "g", descriptor = "I")
    private int field619;

    @OriginalMember(owner = "client!vba", name = "f", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field618;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)V", line = 4)
    public final void method294(byte arg0) {
        if (this.field618 != null) {
            this.field618.method3809((byte) -36);
            this.field618 = null;
        }
        if (arg0 == 44) {
            this.field619 = 0;
            this.field617 = 0;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;", line = 23)
    public final Buffer method295(boolean arg0, int arg1) {
        if (this.field618 == null) {
            return null;
        }
        boolean var3 = arg0 & this.field616;
        if (arg1 != -32022) {
            return (Buffer) null;
        } else if (!this.field614 && class485.method2865(this.field618.Lock(0, this.field619, var3 ? 8192 : 0, this.field615.field8079), arg1 + 57521)) {
            this.field614 = true;
            return this.field615.field8079;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Lul;Z)V", line = 135)
    public class41(class574 arg0, boolean arg1) {
        this.field615 = arg0;
        this.field616 = arg1;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(III)Z", line = 49)
    public final boolean method296(int arg0, int arg1, int arg2) {
        if (arg2 != 20442) {
            this.method296(21, -56, -59);
        }
        this.field617 = arg1;
        this.field613 = (byte) arg0;
        if (this.field617 > this.field619) {
            int var4 = 8;
            byte var5;
            if (this.field616) {
                var4 |= 0x200;
                var5 = 0;
            } else {
                var5 = 1;
            }
            if (this.field618 != null) {
                this.field618.method3809((byte) -36);
            }
            this.field618 = this.field615.field8080.method2873(this.field617, var4, 0, var5, this.field618);
            this.field619 = this.field617;
        }
        return this.field618 != null;
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(I)I", line = 87)
    public final int method297(int arg0) {
        return arg0 == 2 ? this.field617 : 125;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIILjaclib/memory/Source;)Z", line = 97)
    public final boolean method298(int arg0, int arg1, int arg2, Source arg3) {
        if (this.method296(arg0, arg2, 20442)) {
            return this.field618.method2889(arg3, 0, 0, this.field617, this.field616 ? 8192 : 0);
        } else {
            int var5 = -37 % ((-arg1 - 49) / 44);
            return false;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)Z", line = 115)
    public final boolean method299(int arg0) {
        if (this.field614 && class485.method2865(this.field618.Unlock(), 25499)) {
            this.field614 = false;
            return true;
        } else {
            if (arg0 != 2581) {
                this.field613 = 86;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "(I)I", line = 145)
    public final int method300(int arg0) {
        if (arg0 != 15629) {
            this.method300(-89);
        }
        return this.field613;
    }
}
