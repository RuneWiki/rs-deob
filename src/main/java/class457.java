import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class487;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class457 implements class633 {

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Z")
    private boolean field6251 = false;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "Z")
    private boolean field6248;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "Lmh;")
    private class632 field6252;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "B")
    private byte field6253;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    private int field6250;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    private int field6254;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field6249;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    public final Buffer method2599(int arg0, boolean arg1) {
        if (arg0 != -4448) {
            this.method2601(81);
        }
        if (this.field6249 == null) {
            return null;
        }
        boolean var3 = arg1 & this.field6248;
        if (!this.field6251 && class487.method2767(this.field6249.Lock(0, this.field6254, var3 ? 8192 : 0, this.field6252.field8419), (byte) 98)) {
            this.field6251 = true;
            return this.field6252.field8419;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILjaclib/memory/Source;II)Z")
    public final boolean method2600(int arg0, Source arg1, int arg2, int arg3) {
        if (this.method2603(arg3, arg2 ^ 0xFFFFE684, arg0)) {
            return this.field6249.method2772(arg1, 0, 0, this.field6250, this.field6248 ? 8192 : 0);
        } else {
            return arg2 != 24689;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)Z")
    public final boolean method2601(int arg0) {
        if (arg0 != -13472) {
            return true;
        } else if (this.field6251 && class487.method2767(this.field6249.Unlock(), (byte) 120)) {
            this.field6251 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)I")
    public final int method590(int arg0) {
        return arg0 == -1 ? this.field6250 : -117;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)I")
    public final int method2602(byte arg0) {
        return arg0 > -41 ? 18 : this.field6253;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)Z")
    public final boolean method2603(int arg0, int arg1, int arg2) {
        this.field6250 = arg2;
        if (arg1 != -30987) {
            this.method2602((byte) 59);
        }
        this.field6253 = (byte) arg0;
        if (this.field6254 < this.field6250) {
            int var4 = 8;
            byte var5;
            if (this.field6248) {
                var4 |= 0x200;
                var5 = 0;
            } else {
                var5 = 1;
            }
            if (this.field6249 != null) {
                this.field6249.method3757((byte) 85);
            }
            this.field6249 = this.field6252.field8422.method2757(this.field6250, var4, 0, var5, this.field6249);
            this.field6254 = this.field6250;
        }
        return this.field6249 != null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
    public final void method588(boolean arg0) {
        if (arg0) {
            return;
        }
        if (this.field6249 != null) {
            this.field6249.method3757((byte) -70);
            this.field6249 = null;
        }
        this.field6254 = 0;
        this.field6250 = 0;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lmh;Z)V")
    public class457(class632 arg0, boolean arg1) {
        this.field6248 = arg1;
        this.field6252 = arg0;
    }
}
