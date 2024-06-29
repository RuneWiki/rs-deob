import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class483;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public class class92 implements class353 {

    @OriginalMember(owner = "client!aja", name = "c", descriptor = "Z")
    private boolean field1631 = false;

    @OriginalMember(owner = "client!aja", name = "e", descriptor = "Lbfa;")
    private class370 field1633;

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "Z")
    private boolean field1630;

    @OriginalMember(owner = "client!aja", name = "f", descriptor = "B")
    private byte field1634;

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "I")
    private int field1629;

    @OriginalMember(owner = "client!aja", name = "g", descriptor = "I")
    private int field1635;

    @OriginalMember(owner = "client!aja", name = "d", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field1632;

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(Z)I")
    public final int method877(boolean arg0) {
        if (arg0) {
            this.method883(-55);
        }
        return this.field1629;
    }

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "(I)V")
    public final void method878(int arg0) {
        if (this.field1632 != null) {
            this.field1632.method3799(9275);
            this.field1632 = null;
        }
        if (arg0 != 23315) {
            this.method881(null, -80, -30, (byte) 72);
        }
        this.field1635 = 0;
        this.field1629 = 0;
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(IBI)Z")
    public final boolean method879(int arg0, byte arg1, int arg2) {
        this.field1634 = (byte) arg2;
        if (arg1 < 122) {
            this.method879(-127, (byte) 52, -18);
        }
        this.field1629 = arg0;
        if (this.field1629 > this.field1635) {
            int var4 = 8;
            byte var5;
            if (this.field1630) {
                var4 |= 0x200;
                var5 = 0;
            } else {
                var5 = 1;
            }
            if (this.field1632 != null) {
                this.field1632.method3799(9275);
            }
            this.field1632 = this.field1633.field5282.method2854(this.field1629, var4, 0, var5, this.field1632);
            this.field1635 = this.field1629;
        }
        return this.field1632 != null;
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    public final Buffer method880(boolean arg0, int arg1) {
        if (this.field1632 == null) {
            return null;
        }
        boolean var3 = arg0 & this.field1630;
        if (arg1 != 26775) {
            this.method878(93);
        }
        if (!this.field1631 && class483.method2836(this.field1632.Lock(0, this.field1635, var3 ? 8192 : 0, this.field1633.field5283), false)) {
            this.field1631 = true;
            return this.field1633.field5283;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(Ljaclib/memory/Source;IIB)Z")
    public final boolean method881(Source arg0, int arg1, int arg2, byte arg3) {
        if (this.method879(arg2, (byte) 125, arg1)) {
            return this.field1632.method2860(arg0, 0, 0, this.field1629, this.field1630 ? 8192 : 0);
        } else {
            if (arg3 >= -15) {
                this.field1629 = 71;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(I)Z")
    public final boolean method882(int arg0) {
        if (this.field1631 && class483.method2836(this.field1632.Unlock(), false)) {
            this.field1631 = false;
            return true;
        } else if (arg0 == 6331) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aja", name = "c", descriptor = "(I)I")
    public final int method883(int arg0) {
        if (arg0 != 3545) {
            this.method878(-87);
        }
        return this.field1634;
    }

    @OriginalMember(owner = "client!aja", name = "<init>", descriptor = "(Lbfa;Z)V")
    public class92(class370 arg0, boolean arg1) {
        this.field1633 = arg0;
        this.field1630 = arg1;
    }
}
