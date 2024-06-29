import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class757;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class600 implements class716 {

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "Z")
    private boolean field8400 = false;

    @OriginalMember(owner = "client!wba", name = "g", descriptor = "Lsga;")
    private class608 field8403;

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "Z")
    private boolean field8398;

    @OriginalMember(owner = "client!wba", name = "f", descriptor = "B")
    private byte field8402;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "I")
    private int field8397;

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "I")
    private int field8399;

    @OriginalMember(owner = "client!wba", name = "e", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field8401;

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "(I)I")
    public final int method3476(int arg0) {
        if (arg0 < 93) {
            this.method1125(-57);
        }
        return this.field8402;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)I")
    public final int method1124(int arg0) {
        if (arg0 != 22913) {
            this.method2276(false, true);
        }
        return this.field8397;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(BILjaclib/memory/Source;I)Z")
    public final boolean method2280(byte arg0, int arg1, Source arg2, int arg3) {
        if (this.method2277(arg3, arg1, false)) {
            return this.field8401.method4167(arg2, 0, 0, this.field8397, this.field8398 ? 8192 : 0);
        } else {
            if (arg0 < 22) {
                this.field8403 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(I)V")
    public final void method1125(int arg0) {
        if (arg0 <= 18) {
            this.field8399 = 29;
        }
        if (this.field8401 != null) {
            this.field8401.method2320(-5017);
            this.field8401 = null;
        }
        this.field8399 = 0;
        this.field8397 = 0;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;")
    public final Buffer method2276(boolean arg0, boolean arg1) {
        if (this.field8401 == null) {
            return null;
        }
        if (arg1) {
            this.method2280((byte) -20, 118, null, 24);
        }
        boolean var3 = arg0 & this.field8398;
        if (!this.field8400 && class757.method4192(this.field8401.Lock(0, this.field8399, var3 ? 8192 : 0, this.field8403.field8560), (byte) -82)) {
            this.field8400 = true;
            return this.field8403.field8560;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "(I)Z")
    public final boolean method2281(int arg0) {
        if (arg0 != -14567) {
            this.field8402 = 13;
        }
        if (this.field8400 && class757.method4192(this.field8401.Unlock(), (byte) 120)) {
            this.field8400 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IIZ)Z")
    public final boolean method2277(int arg0, int arg1, boolean arg2) {
        this.field8397 = arg0;
        this.field8402 = (byte) arg1;
        if (this.field8399 < this.field8397) {
            int var4 = 8;
            byte var5;
            if (this.field8398) {
                var4 |= 0x200;
                var5 = 0;
            } else {
                var5 = 1;
            }
            if (this.field8401 != null) {
                this.field8401.method2320(-5017);
            }
            this.field8401 = this.field8403.field8555.method4174(this.field8397, var4, 0, var5, this.field8401);
            this.field8399 = this.field8397;
        }
        if (arg2) {
            return true;
        } else {
            return this.field8401 != null;
        }
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lsga;Z)V")
    public class600(class608 arg0, boolean arg1) {
        this.field8403 = arg0;
        this.field8398 = arg1;
    }
}
