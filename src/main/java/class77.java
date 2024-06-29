import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class407;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class77 implements class293 {

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "Z")
    private boolean field896 = false;

    @OriginalMember(owner = "client!dba", name = "e", descriptor = "Z")
    private boolean field900;

    @OriginalMember(owner = "client!dba", name = "f", descriptor = "Lhg;")
    private class591 field901;

    @OriginalMember(owner = "client!dba", name = "g", descriptor = "B")
    private byte field902;

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "I")
    private int field897;

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "I")
    private int field898;

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field899;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILjaclib/memory/Source;II)Z", line = 4)
    public final boolean method439(int arg0, Source arg1, int arg2, int arg3) {
        if (arg2 != 26190) {
            this.method441(127);
        }
        return this.method444(false, arg0, arg3) ? this.field899.method2343(arg1, 0, 0, this.field898, this.field900 ? 8192 : 0) : false;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;", line = 22)
    public final Buffer method440(int arg0, boolean arg1) {
        if (arg0 >= -97) {
            this.method444(true, 46, -93);
        }
        boolean var3 = arg1 & this.field900;
        if (!this.field896 && class407.method2320(this.field899.Lock(0, this.field897, var3 ? 8192 : 0, this.field901.field8563), -2005530590)) {
            this.field896 = true;
            return this.field901.field8563;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)I", line = 42)
    public final int method441(int arg0) {
        if (arg0 != 16304) {
            this.method444(false, -125, 115);
        }
        return this.field898;
    }

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "(I)Z", line = 53)
    public final boolean method442(int arg0) {
        int var2 = 43 / ((arg0) / 63);
        if (this.field896 && class407.method2320(this.field899.Unlock(), -2005530590)) {
            this.field896 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(Lhg;Z)V", line = 138)
    public class77(class591 arg0, boolean arg1) {
        this.field900 = arg1;
        this.field901 = arg0;
    }

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "(I)V", line = 78)
    public final void method443(int arg0) {
        if (arg0 != 23678) {
            this.method444(true, 124, -9);
        }
        if (this.field899 != null) {
            this.field899.method3355(-11385);
            this.field899 = null;
        }
        this.field897 = 0;
        this.field898 = 0;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(ZII)Z", line = 95)
    public final boolean method444(boolean arg0, int arg1, int arg2) {
        this.field898 = arg1;
        this.field902 = (byte) arg2;
        if (this.field897 < this.field898) {
            int var4 = 8;
            byte var5;
            if (this.field900) {
                var4 |= 0x200;
                var5 = 0;
            } else {
                var5 = 1;
            }
            if (this.field899 != null) {
                this.field899.method3355(-11385);
            }
            this.field899 = this.field901.field8586.method2329(this.field898, var4, 0, var5, this.field899);
            this.field897 = this.field898;
        }
        if (arg0) {
            return true;
        } else {
            return this.field899 != null;
        }
    }

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "(I)I", line = 131)
    public final int method445(int arg0) {
        int var2 = 56 % ((arg0 + 11) / 40);
        return this.field902;
    }
}
