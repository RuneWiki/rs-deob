import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class510;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class459 implements class612 {

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "Z")
    private boolean field6356 = false;

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "Lrja;")
    private class115 field6358;

    @OriginalMember(owner = "client!rba", name = "f", descriptor = "Z")
    private boolean field6361;

    @OriginalMember(owner = "client!rba", name = "e", descriptor = "B")
    private byte field6360;

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "I")
    private int field6357;

    @OriginalMember(owner = "client!rba", name = "g", descriptor = "I")
    private int field6362;

    @OriginalMember(owner = "client!rba", name = "d", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field6359;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)I")
    public final int method2631(byte arg0) {
        if (arg0 <= 81) {
            this.field6362 = -104;
        }
        return this.field6362;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)V")
    public final void method2614(int arg0) {
        if (this.field6359 != null) {
            this.field6359.method3936((byte) -70);
            this.field6359 = null;
        }
        this.field6362 = 0;
        this.field6357 = 0;
        if (arg0 != 487) {
            this.field6358 = null;
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;")
    public final Buffer method2646(boolean arg0, boolean arg1) {
        if (!arg0) {
            return (Buffer) null;
        } else if (this.field6359 == null) {
            return null;
        } else {
            boolean var3 = arg1 & this.field6361;
            if (!this.field6356 && class510.method2954(0, this.field6359.Lock(0, this.field6357, var3 ? 8192 : 0, this.field6358.field1570))) {
                this.field6356 = true;
                return this.field6358.field1570;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(III)Z")
    public final boolean method2642(int arg0, int arg1, int arg2) {
        this.field6362 = arg0;
        if (arg2 != -10760) {
            return true;
        }
        this.field6360 = (byte) arg1;
        if (this.field6362 > this.field6357) {
            int var4 = 8;
            byte var5;
            if (this.field6361) {
                var5 = 0;
                var4 |= 0x200;
            } else {
                var5 = 1;
            }
            if (this.field6359 != null) {
                this.field6359.method3936((byte) -70);
            }
            this.field6359 = this.field6358.field1565.method2970(this.field6362, var4, 0, var5, this.field6359);
            this.field6357 = this.field6362;
        }
        return this.field6359 != null;
    }

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "(I)I")
    public final int method2715(int arg0) {
        return arg0 >= -19 ? -111 : this.field6360;
    }

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "(I)Z")
    public final boolean method2640(int arg0) {
        if (this.field6356 && class510.method2954(arg0 - 10925, this.field6359.Unlock())) {
            this.field6356 = false;
            return true;
        } else {
            if (arg0 != 10925) {
                this.field6360 = -52;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(IIILjaclib/memory/Source;)Z")
    public final boolean method2639(int arg0, int arg1, int arg2, Source arg3) {
        if (this.method2642(arg0, arg1, -10760)) {
            return this.field6359.method2984(arg3, 0, 0, this.field6362, this.field6361 ? 8192 : 0);
        } else {
            if (arg2 != -959) {
                this.field6359 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lrja;Z)V")
    public class459(class115 arg0, boolean arg1) {
        this.field6358 = arg0;
        this.field6361 = arg1;
    }
}
