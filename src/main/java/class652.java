import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class451;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class652 implements class378 {

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "Z")
    private boolean field9401 = false;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "Lhg;")
    private class644 field9397;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "Z")
    private boolean field9396;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "B")
    private byte field9400;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    private int field9398;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    private int field9399;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field9402;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    public final Buffer method2167(int arg0, boolean arg1) {
        if (this.field9402 == null) {
            return null;
        } else if (arg0 == -1926) {
            boolean var3 = arg1 & this.field9396;
            if (!this.field9401 && class451.method2727(this.field9402.Lock(0, this.field9399, var3 ? 8192 : 0, this.field9397.field9256), 3102)) {
                this.field9401 = true;
                return this.field9397.field9256;
            } else {
                return null;
            }
        } else {
            return (Buffer) null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
    public final void method382(byte arg0) {
        if (arg0 <= 63) {
            this.method2164(102, -18, 125);
        }
        if (this.field9402 != null) {
            this.field9402.method3595((byte) -67);
            this.field9402 = null;
        }
        this.field9399 = 0;
        this.field9398 = 0;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IILjaclib/memory/Source;I)Z")
    public final boolean method2170(int arg0, int arg1, Source arg2, int arg3) {
        if (this.method2164(arg0, 3573, arg1)) {
            return this.field9402.method2725(arg2, 0, 0, this.field9398, this.field9396 ? 8192 : 0);
        } else {
            int var5 = 113 / ((82 - arg3) / 32);
            return false;
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)I")
    public final int method3721(byte arg0) {
        if (arg0 != 34) {
            this.field9400 = 3;
        }
        return this.field9400;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)Z")
    public final boolean method2169(byte arg0) {
        if (this.field9401 && class451.method2727(this.field9402.Unlock(), 3102)) {
            this.field9401 = false;
            return true;
        } else {
            int var2 = -54 / ((arg0 + 42) / 54);
            return false;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)I")
    public final int method386(int arg0) {
        return arg0 == 0 ? this.field9398 : -89;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)Z")
    public final boolean method2164(int arg0, int arg1, int arg2) {
        this.field9400 = (byte) arg0;
        this.field9398 = arg2;
        if (this.field9398 > this.field9399) {
            int var4 = 8;
            byte var5;
            if (this.field9396) {
                var4 |= 0x200;
                var5 = 0;
            } else {
                var5 = 1;
            }
            if (this.field9402 != null) {
                this.field9402.method3595((byte) -67);
            }
            this.field9402 = this.field9397.field9267.method2705(this.field9398, var4, 0, var5, this.field9402);
            this.field9399 = this.field9398;
        }
        if (arg1 != 3573) {
            this.method3721((byte) -10);
        }
        return this.field9402 != null;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lhg;Z)V")
    public class652(class644 arg0, boolean arg1) {
        this.field9397 = arg0;
        this.field9396 = arg1;
    }
}
