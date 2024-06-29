import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class443;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class187 implements class555 {

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "Z")
    private boolean field2770 = false;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "Lvg;")
    private class49 field2773;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "Z")
    private boolean field2772;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "B")
    private byte field2771;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    private int field2769;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    private int field2774;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field2775;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)I")
    public final int method21(boolean arg0) {
        return arg0 ? -11 : this.field2769;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IBILjaclib/memory/Source;)Z")
    public final boolean method1247(int arg0, byte arg1, int arg2, Source arg3) {
        if (this.method1249(arg0, arg2, (byte) -120)) {
            return this.field2775.method2566(arg3, 0, 0, this.field2769, this.field2772 ? 8192 : 0);
        } else {
            if (arg1 != -64) {
                this.field2770 = true;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)I")
    public final int method1248(byte arg0) {
        int var2 = 32 % ((arg0 + 57) / 38);
        return this.field2771;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)V")
    public final void method776(boolean arg0) {
        if (this.field2775 != null) {
            this.field2775.method3440(21066);
            this.field2775 = null;
        }
        if (arg0) {
            this.method1247(-42, (byte) -114, 69, null);
        }
        this.field2769 = 0;
        this.field2774 = 0;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    public final Buffer method779(byte arg0, boolean arg1) {
        if (this.field2775 == null) {
            return null;
        } else if (arg0 == -20) {
            boolean var3 = arg1 & this.field2772;
            if (!this.field2770 && class443.method2538(-1, this.field2775.Lock(0, this.field2774, var3 ? 8192 : 0, this.field2773.field732))) {
                this.field2770 = true;
                return this.field2773.field732;
            } else {
                return null;
            }
        } else {
            return (Buffer) null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)Z")
    public final boolean method774(int arg0) {
        if (this.field2770 && class443.method2538(-1, this.field2775.Unlock())) {
            this.field2770 = false;
            return true;
        } else {
            if (arg0 != -22324) {
                this.field2773 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIB)Z")
    public final boolean method1249(int arg0, int arg1, byte arg2) {
        int var4 = -109 % ((arg2 + 57) / 63);
        this.field2769 = arg0;
        this.field2771 = (byte) arg1;
        if (this.field2774 < this.field2769) {
            int var5 = 8;
            byte var6;
            if (this.field2772) {
                var5 |= 0x200;
                var6 = 0;
            } else {
                var6 = 1;
            }
            if (this.field2775 != null) {
                this.field2775.method3440(21066);
            }
            this.field2775 = this.field2773.field720.method2555(this.field2769, var5, 0, var6, this.field2775);
            this.field2774 = this.field2769;
        }
        return this.field2775 != null;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lvg;Z)V")
    public class187(class49 arg0, boolean arg1) {
        this.field2773 = arg0;
        this.field2772 = arg1;
    }
}
