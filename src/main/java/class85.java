import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class675;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class85 implements class269 {

    @OriginalMember(owner = "client!naa", name = "f", descriptor = "Z")
    private boolean field1147 = false;

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "Z")
    private boolean field1143;

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "Lmba;")
    private class70 field1144;

    @OriginalMember(owner = "client!naa", name = "g", descriptor = "B")
    private byte field1148;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "I")
    private int field1142;

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "I")
    private int field1145;

    @OriginalMember(owner = "client!naa", name = "e", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field1146;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(IILjaclib/memory/Source;I)Z")
    public final boolean method643(int arg0, int arg1, Source arg2, int arg3) {
        if (this.method649((byte) 98, arg3, arg0)) {
            return this.field1146.method3697(arg2, 0, 0, this.field1145, this.field1143 ? 8192 : 0);
        } else {
            if (arg1 != 2106) {
                this.field1143 = false;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "(I)I")
    public final int method644(int arg0) {
        if (arg0 != -6874) {
            this.field1148 = -125;
        }
        return this.field1148;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(I)V")
    public final void method645(int arg0) {
        int var2 = -65 / ((37 - arg0) / 36);
        if (this.field1146 != null) {
            this.field1146.method1941((byte) -46);
            this.field1146 = null;
        }
        this.field1145 = 0;
        this.field1142 = 0;
    }

    @OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(Lmba;Z)V")
    public class85(class70 arg0, boolean arg1) {
        this.field1143 = arg1;
        this.field1144 = arg0;
    }

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(I)Z")
    public final boolean method646(int arg0) {
        if (arg0 > -100) {
            return true;
        } else if (this.field1147 && class675.method3703((byte) -58, this.field1146.Unlock())) {
            this.field1147 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;")
    public final Buffer method647(boolean arg0, boolean arg1) {
        if (arg0) {
            return (Buffer) null;
        } else if (this.field1146 == null) {
            return null;
        } else {
            boolean var3 = arg1 & this.field1143;
            if (!this.field1147 && class675.method3703((byte) -58, this.field1146.Lock(0, this.field1142, var3 ? 8192 : 0, this.field1144.field950))) {
                this.field1147 = true;
                return this.field1144.field950;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Z)I")
    public final int method648(boolean arg0) {
        if (!arg0) {
            this.method647(false, true);
        }
        return this.field1145;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(BII)Z")
    public final boolean method649(byte arg0, int arg1, int arg2) {
        this.field1148 = (byte) arg1;
        if (arg0 < 83) {
            this.method645(-125);
        }
        this.field1145 = arg2;
        if (this.field1142 < this.field1145) {
            int var4 = 8;
            byte var5;
            if (this.field1143) {
                var5 = 0;
                var4 |= 0x200;
            } else {
                var5 = 1;
            }
            if (this.field1146 != null) {
                this.field1146.method1941((byte) -46);
            }
            this.field1146 = this.field1144.field958.method3720(this.field1145, var4, 0, var5, this.field1146);
            this.field1142 = this.field1145;
        }
        return this.field1146 != null;
    }
}
