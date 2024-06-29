import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class507;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class91 implements class553 {

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "Z")
    private boolean field1023 = false;

    @OriginalMember(owner = "client!fca", name = "g", descriptor = "Lta;")
    private class224 field1027;

    @OriginalMember(owner = "client!fca", name = "e", descriptor = "Z")
    private boolean field1025;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "B")
    private byte field1021;

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "I")
    private int field1022;

    @OriginalMember(owner = "client!fca", name = "d", descriptor = "I")
    private int field1024;

    @OriginalMember(owner = "client!fca", name = "f", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field1026;

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "(B)V")
    public final void method602(byte arg0) {
        if (arg0 != 41) {
            return;
        }
        if (this.field1026 != null) {
            this.field1026.method3967(29036);
            this.field1026 = null;
        }
        this.field1024 = 0;
        this.field1022 = 0;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    public final Buffer method676(byte arg0, boolean arg1) {
        if (this.field1026 == null) {
            return null;
        }
        int var3 = -123 / ((arg0 - 21) / 48);
        boolean var4 = arg1 & this.field1025;
        if (!this.field1023 && class507.method3053(this.field1026.Lock(0, this.field1024, var4 ? 8192 : 0, this.field1027.field3458), -1)) {
            this.field1023 = true;
            return this.field1027.field3458;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(B)I")
    public final int method677(byte arg0) {
        return arg0 < 92 ? -66 : this.field1021;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)Z")
    public final boolean method678(int arg0) {
        if (arg0 != 14234) {
            this.method600(-13);
        }
        if (this.field1023 && class507.method3053(this.field1026.Unlock(), -1)) {
            this.field1023 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIZ)Z")
    public final boolean method679(int arg0, int arg1, boolean arg2) {
        this.field1021 = (byte) arg1;
        this.field1022 = arg0;
        if (this.field1024 < this.field1022) {
            int var4 = 8;
            byte var5;
            if (this.field1025) {
                var4 |= 0x200;
                var5 = 0;
            } else {
                var5 = 1;
            }
            if (this.field1026 != null) {
                this.field1026.method3967(29036);
            }
            this.field1026 = this.field1027.field3450.method3074(this.field1022, var4, 0, var5, this.field1026);
            this.field1024 = this.field1022;
        }
        if (!arg2) {
            this.field1022 = -1;
        }
        return this.field1026 != null;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(IILjaclib/memory/Source;I)Z")
    public final boolean method680(int arg0, int arg1, Source arg2, int arg3) {
        if (this.method679(arg3, arg0, true)) {
            return this.field1026.method3082(arg2, 0, 0, this.field1022, this.field1025 ? 8192 : 0);
        } else {
            if (arg1 < 71) {
                this.method679(-62, 115, true);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "(I)I")
    public final int method600(int arg0) {
        int var2 = -17 / ((arg0 + 54) / 56);
        return this.field1022;
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lta;Z)V")
    public class91(class224 arg0, boolean arg1) {
        this.field1027 = arg0;
        this.field1025 = arg1;
    }
}
