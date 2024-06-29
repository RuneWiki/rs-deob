import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class742;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class426 implements class440 {

    @OriginalMember(owner = "client!br", name = "g", descriptor = "Z")
    private boolean field5969 = false;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "Z")
    private boolean field5963;

    @OriginalMember(owner = "client!br", name = "f", descriptor = "Lkfa;")
    private class386 field5968;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "B")
    private byte field5965;

    @OriginalMember(owner = "client!br", name = "b", descriptor = "I")
    private int field5964;

    @OriginalMember(owner = "client!br", name = "d", descriptor = "I")
    private int field5966;

    @OriginalMember(owner = "client!br", name = "e", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field5967;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(I)I", line = 6)
    public final int method2647(int arg0) {
        if (arg0 != 11215) {
            this.field5969 = true;
        }
        return this.field5965;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(BII)Z", line = 21)
    public final boolean method2140(byte arg0, int arg1, int arg2) {
        this.field5965 = (byte) arg1;
        this.field5966 = arg2;
        if (this.field5966 > this.field5964) {
            int var4 = 8;
            byte var5;
            if (this.field5963) {
                var5 = 0;
                var4 |= 0x200;
            } else {
                var5 = 1;
            }
            if (this.field5967 != null) {
                this.field5967.method2637(-10573);
            }
            this.field5967 = this.field5968.field5542.method4112(this.field5966, var4, 0, var5, this.field5967);
            this.field5964 = this.field5966;
        }
        int var6 = 120 % ((arg0 - 68) / 40);
        return this.field5967 != null;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIZLjaclib/memory/Source;)Z", line = 54)
    public final boolean method2141(int arg0, int arg1, boolean arg2, Source arg3) {
        if (this.method2140((byte) 111, arg1, arg0)) {
            return this.field5967.method4111(arg3, 0, 0, this.field5966, this.field5963 ? 8192 : 0);
        } else {
            if (arg2) {
                this.method970(-107);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(I)Z", line = 74)
    public final boolean method2143(int arg0) {
        if (this.field5969 && class742.method4137(this.field5967.Unlock(), -1)) {
            this.field5969 = false;
            return true;
        } else if (arg0 >= -56) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!br", name = "d", descriptor = "(I)I", line = 94)
    public final int method971(int arg0) {
        if (arg0 != -127) {
            this.field5965 = 113;
        }
        return this.field5966;
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(ZI)Ljaclib/memory/Buffer;", line = 104)
    public final Buffer method2145(boolean arg0, int arg1) {
        if (this.field5967 == null) {
            return null;
        }
        boolean var3 = arg0 & this.field5963;
        if (!this.field5969 && class742.method4137(this.field5967.Lock(0, this.field5964, var3 ? 8192 : 0, this.field5968.field5551), -1)) {
            this.field5969 = true;
            return this.field5968.field5551;
        } else {
            if (arg1 != 27425) {
                this.field5964 = 34;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V", line = 127)
    public final void method970(int arg0) {
        if (this.field5967 != null) {
            this.field5967.method2637(-10573);
            this.field5967 = null;
        }
        this.field5964 = 0;
        this.field5966 = 0;
        if (arg0 >= -95) {
            this.field5967 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lkfa;Z)V", line = 146)
    public class426(class386 arg0, boolean arg1) {
        this.field5963 = arg1;
        this.field5968 = arg0;
    }
}
