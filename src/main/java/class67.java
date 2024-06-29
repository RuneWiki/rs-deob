import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class439;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class67 implements class155 {

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "Z")
    private boolean field672 = false;

    @OriginalMember(owner = "client!rba", name = "f", descriptor = "Z")
    private boolean field675;

    @OriginalMember(owner = "client!rba", name = "g", descriptor = "Leda;")
    private class561 field676;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "B")
    private byte field670;

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "I")
    private int field671;

    @OriginalMember(owner = "client!rba", name = "e", descriptor = "I")
    private int field674;

    @OriginalMember(owner = "client!rba", name = "d", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field673;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)I", line = 7)
    public final int method197(int arg0) {
        int var2 = -80 % ((arg0 - 27) / 38);
        return this.field671;
    }

    @OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Leda;Z)V", line = 145)
    public class67(class561 arg0, boolean arg1) {
        this.field675 = arg1;
        this.field676 = arg0;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(IIB)Z", line = 23)
    public final boolean method353(int arg0, int arg1, byte arg2) {
        int var4 = -21 % ((arg2 - 17) / 47);
        this.field670 = (byte) arg1;
        this.field671 = arg0;
        if (this.field671 > this.field674) {
            int var5 = 8;
            byte var6;
            if (this.field675) {
                var6 = 0;
                var5 |= 0x200;
            } else {
                var6 = 1;
            }
            if (this.field673 != null) {
                this.field673.method3483(-127);
            }
            this.field673 = this.field676.field8021.method2518(this.field671, var5, 0, var6, this.field673);
            this.field674 = this.field671;
        }
        return this.field673 != null;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;", line = 59)
    public final Buffer method354(boolean arg0, boolean arg1) {
        if (this.field673 == null) {
            return null;
        }
        boolean var3 = arg1 & this.field675;
        if (!arg0) {
            this.field670 = 14;
        }
        if (!this.field672 && class439.method2511((byte) 35, this.field673.Lock(0, this.field674, var3 ? 8192 : 0, this.field676.field8003))) {
            this.field672 = true;
            return this.field676.field8003;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "(B)V", line = 81)
    public final void method74(byte arg0) {
        if (this.field673 != null) {
            this.field673.method3483(-128);
            this.field673 = null;
        }
        this.field674 = 0;
        this.field671 = 0;
        if (arg0 <= 99) {
            this.method353(-60, -106, (byte) -109);
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(IILjaclib/memory/Source;I)Z", line = 98)
    public final boolean method355(int arg0, int arg1, Source arg2, int arg3) {
        if (this.method353(arg3, arg1, (byte) -65)) {
            return this.field673.method2510(arg2, 0, 0, this.field671, this.field675 ? 8192 : 0);
        } else {
            if (arg0 != -26863) {
                this.method356((byte) -107);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)I", line = 114)
    public final int method356(byte arg0) {
        return arg0 == 72 ? this.field670 : -70;
    }

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "(I)Z", line = 125)
    public final boolean method357(int arg0) {
        if (this.field672 && class439.method2511((byte) 35, this.field673.Unlock())) {
            this.field672 = false;
            return true;
        } else {
            if (arg0 != -28830) {
                this.field670 = 104;
            }
            return false;
        }
    }
}
