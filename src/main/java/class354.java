import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class742;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class354 implements class174 {

    @OriginalMember(owner = "client!b", name = "e", descriptor = "Z")
    private boolean field5100 = false;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "Z")
    private boolean field5096;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "Ljt;")
    private class38 field5097;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "Lkfa;")
    private class386 field5102;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    private int field5098;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    private int field5101;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field5099;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)Z")
    public final boolean method975(int arg0) {
        if (arg0 >= -25) {
            this.method971(-119);
        }
        if (this.field5100 && class742.method4137(this.field5099.Unlock(), -1)) {
            this.field5100 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZI)V")
    public final void method969(boolean arg0, int arg1) {
        this.field5101 = this.field5097.field460 * arg1;
        if (arg0) {
            this.field5099 = null;
        }
        if (this.field5101 <= this.field5098) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field5096) {
            var3 |= 0x200;
            var4 = 0;
        } else {
            var4 = 1;
        }
        if (this.field5099 != null) {
            this.field5099.method2637(-10573);
        }
        this.field5099 = this.field5102.field5542.method4126(this.field5101, var3, class38.field473 == this.field5097 ? 101 : 102, var4, this.field5099);
        this.field5098 = this.field5101;
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(I)I")
    public final int method971(int arg0) {
        if (arg0 != -127) {
            this.field5101 = -94;
        }
        return this.field5101;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)Ljt;")
    public final class38 method974(int arg0) {
        if (arg0 != 9484) {
            this.field5102 = null;
        }
        return this.field5097;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public final void method970(int arg0) {
        if (this.field5099 != null) {
            this.field5099.method2637(-10573);
            this.field5099 = null;
        }
        if (arg0 < -95) {
            this.field5098 = 0;
            this.field5101 = 0;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    public final Buffer method968(boolean arg0, byte arg1) {
        if (this.field5099 == null) {
            return null;
        } else if (arg1 == 45) {
            boolean var3 = arg0 & this.field5096;
            if (!this.field5100 && class742.method4137(this.field5099.Lock(0, this.field5098, var3 ? 8192 : 0, this.field5102.field5551), arg1 - 46)) {
                this.field5100 = true;
                return this.field5102.field5551;
            } else {
                return null;
            }
        } else {
            return (Buffer) null;
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lkfa;Ljt;Z)V")
    public class354(class386 arg0, class38 arg1, boolean arg2) {
        this.field5096 = arg2;
        this.field5097 = arg1;
        this.field5102 = arg0;
    }
}
