import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class441;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class131 implements class31 {

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "Z")
    private boolean field1464 = false;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "Z")
    private boolean field1469;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "Lgb;")
    private class197 field1466;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "B")
    private byte field1465;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    private int field1463;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    private int field1467;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field1468;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(III)Z", line = 9)
    public final boolean method169(int arg0, int arg1, int arg2) {
        if (arg2 != 1103) {
            this.method168(null, 82, (byte) 122, -23);
        }
        this.field1465 = (byte) arg1;
        this.field1467 = arg0;
        if (this.field1463 < this.field1467) {
            int var4 = 8;
            byte var5;
            if (this.field1469) {
                var4 |= 0x200;
                var5 = 0;
            } else {
                var5 = 1;
            }
            if (this.field1468 != null) {
                this.field1468.method3457((byte) -34);
            }
            this.field1468 = this.field1466.field2376.method2434(this.field1467, var4, 0, var5, this.field1468);
            this.field1463 = this.field1467;
        }
        return this.field1468 != null;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(B)V", line = 45)
    public final void method166(byte arg0) {
        int var2 = 33 % ((arg0 - 3) / 39);
        if (this.field1468 != null) {
            this.field1468.method3457((byte) -34);
            this.field1468 = null;
        }
        this.field1467 = 0;
        this.field1463 = 0;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)I", line = 61)
    public final int method737(byte arg0) {
        int var2 = 45 % ((-arg0 - 24) / 50);
        return this.field1467;
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lgb;Z)V", line = 123)
    public class131(class197 arg0, boolean arg1) {
        this.field1469 = arg1;
        this.field1466 = arg0;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljaclib/memory/Source;IBI)Z", line = 73)
    public final boolean method168(Source arg0, int arg1, byte arg2, int arg3) {
        if (this.method169(arg3, arg1, 1103)) {
            return this.field1468.method2450(arg0, 0, 0, this.field1467, this.field1469 ? 8192 : 0);
        } else {
            if (arg2 > -90) {
                this.field1464 = false;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;", line = 90)
    public final Buffer method167(int arg0, boolean arg1) {
        if (this.field1468 == null) {
            return null;
        }
        boolean var3 = arg1 & this.field1469;
        if (arg0 != 18829) {
            this.method737((byte) -2);
        }
        if (!this.field1464 && class441.method2451(this.field1468.Lock(0, this.field1463, var3 ? 8192 : 0, this.field1466.field2390), (byte) -49)) {
            this.field1464 = true;
            return this.field1466.field2390;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)I", line = 111)
    public final int method738(boolean arg0) {
        if (!arg0) {
            this.field1464 = false;
        }
        return this.field1465;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)Z", line = 133)
    public final boolean method170(int arg0) {
        if (this.field1464 && class441.method2451(this.field1468.Unlock(), (byte) -109)) {
            this.field1464 = false;
            return true;
        } else {
            return arg0 != 9406;
        }
    }
}
