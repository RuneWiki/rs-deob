import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class507;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class162 implements class535 {

    @OriginalMember(owner = "client!as", name = "g", descriptor = "Z")
    private boolean field2580 = false;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "Lbja;")
    private class34 field2576;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "Lta;")
    private class224 field2577;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "Z")
    private boolean field2574;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    private int field2575;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "I")
    private int field2578;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field2579;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(B)V", line = 4)
    public final void method602(byte arg0) {
        if (this.field2579 != null) {
            this.field2579.method3967(29036);
            this.field2579 = null;
        }
        this.field2578 = 0;
        this.field2575 = 0;
        if (arg0 != 41) {
            this.method602((byte) -108);
        }
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(I)I", line = 22)
    public final int method600(int arg0) {
        int var2 = -31 / ((-arg0 - 54) / 56);
        return this.field2575;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)Z", line = 34)
    public final boolean method601(int arg0) {
        if (arg0 > -49) {
            this.method602((byte) 115);
        }
        if (this.field2580 && class507.method3053(this.field2579.Unlock(), -1)) {
            this.field2580 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(II)V", line = 57)
    public final void method604(int arg0, int arg1) {
        this.field2575 = this.field2576.field453 * arg0;
        if (arg1 < 113 || this.field2578 >= this.field2575) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field2574) {
            var3 |= 0x200;
            var4 = 0;
        } else {
            var4 = 1;
        }
        if (this.field2579 != null) {
            this.field2579.method3967(29036);
        }
        this.field2579 = this.field2577.field3450.method3066(this.field2575, var3, class34.field458 == this.field2576 ? 101 : 102, var4, this.field2579);
        this.field2578 = this.field2575;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(B)Lbja;", line = 89)
    public final class34 method603(byte arg0) {
        return arg0 >= -65 ? (class34) null : this.field2576;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;", line = 100)
    public final Buffer method605(byte arg0, boolean arg1) {
        int var3 = -103 % ((31 - arg0) / 53);
        if (this.field2579 == null) {
            return null;
        }
        boolean var4 = arg1 & this.field2574;
        if (!this.field2580 && class507.method3053(this.field2579.Lock(0, this.field2578, var4 ? 8192 : 0, this.field2577.field3458), -1)) {
            this.field2580 = true;
            return this.field2577.field3458;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lta;Lbja;Z)V", line = 122)
    public class162(class224 arg0, class34 arg1, boolean arg2) {
        this.field2576 = arg1;
        this.field2577 = arg0;
        this.field2574 = arg2;
    }
}
