import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class737;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class697 implements class669 {

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "Z")
    private boolean field9880 = false;

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "Z")
    private boolean field9878;

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "Lhb;")
    private class585 field9879;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "B")
    private byte field9875;

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "I")
    private int field9877;

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "I")
    private int field9881;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field9876;

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)I", line = 6)
    public final int method3883(int arg0) {
        return arg0 < 45 ? 0 : this.field9875;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILjaclib/memory/Source;II)Z", line = 17)
    public final boolean method698(int arg0, Source arg1, int arg2, int arg3) {
        if (arg0 >= -111) {
            this.method692(false, -96);
        }
        return this.method693(true, arg3, arg2) ? this.field9876.method4113(arg1, 0, 0, this.field9877, this.field9878 ? 8192 : 0) : false;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;", line = 34)
    public final Buffer method692(boolean arg0, int arg1) {
        if (this.field9876 == null) {
            return null;
        }
        boolean var3 = arg0 & this.field9878;
        if (arg1 != -31414) {
            return (Buffer) null;
        } else if (!this.field9880 && class737.method4132(-17, this.field9876.Lock(0, this.field9881, var3 ? 8192 : 0, this.field9879.field8258))) {
            this.field9880 = true;
            return this.field9879.field8258;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)Z", line = 57)
    public final boolean method696(int arg0) {
        if (arg0 != -11404) {
            this.method692(true, -8);
        }
        if (this.field9880 && class737.method4132(126, this.field9876.Unlock())) {
            this.field9880 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZII)Z", line = 78)
    public final boolean method693(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.method3883(-35);
        }
        this.field9877 = arg1;
        this.field9875 = (byte) arg2;
        if (this.field9877 > this.field9881) {
            int var4 = 8;
            byte var5;
            if (this.field9878) {
                var5 = 0;
                var4 |= 0x200;
            } else {
                var5 = 1;
            }
            if (this.field9876 != null) {
                this.field9876.method2604(false);
            }
            this.field9876 = this.field9879.field8281.method4116(this.field9877, var4, 0, var5, this.field9876);
            this.field9881 = this.field9877;
        }
        return this.field9876 != null;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)I", line = 116)
    public final int method695(byte arg0) {
        if (arg0 < 37) {
            this.field9876 = null;
        }
        return this.field9877;
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)V", line = 128)
    public final void method697(int arg0) {
        if (this.field9876 != null) {
            this.field9876.method2604(false);
            this.field9876 = null;
        }
        this.field9877 = 0;
        if (arg0 != -18934) {
            this.field9876 = null;
        }
        this.field9881 = 0;
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lhb;Z)V", line = 148)
    public class697(class585 arg0, boolean arg1) {
        this.field9878 = arg1;
        this.field9879 = arg0;
    }
}
