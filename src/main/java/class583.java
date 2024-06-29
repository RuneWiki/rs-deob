import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class398;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class583 implements class90 {

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "Z")
    private boolean field8568 = false;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "Z")
    private boolean field8567;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "Lnca;")
    private class54 field8565;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "B")
    private byte field8569;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    private int field8570;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    private int field8571;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field8566;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIB)Z", line = 4)
    public final boolean method412(int arg0, int arg1, byte arg2) {
        this.field8569 = (byte) arg1;
        this.field8571 = arg0;
        if (arg2 != -61) {
            return true;
        }
        if (this.field8571 > this.field8570) {
            int var4 = 8;
            byte var5;
            if (this.field8567) {
                var4 |= 0x200;
                var5 = 0;
            } else {
                var5 = 1;
            }
            if (this.field8566 != null) {
                this.field8566.method3340((byte) -27);
            }
            this.field8566 = this.field8565.field676.method2401(this.field8571, var4, 0, var5, this.field8566);
            this.field8570 = this.field8571;
        }
        return this.field8566 != null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljaclib/memory/Source;III)Z", line = 40)
    public final boolean method408(Source arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 6831) {
            this.method409(false);
        }
        return this.method412(arg1, arg3, (byte) -61) ? this.field8566.method2386(arg0, 0, 0, this.field8571, this.field8567 ? 8192 : 0) : false;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;", line = 60)
    public final Buffer method410(boolean arg0, byte arg1) {
        boolean var3 = arg0 & this.field8567;
        if (!this.field8568 && class398.method2384(arg1 + 7211, this.field8566.Lock(0, this.field8570, var3 ? 8192 : 0, this.field8565.field666))) {
            this.field8568 = true;
            return this.field8565.field666;
        } else {
            if (arg1 != -56) {
                this.method411(82);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)I", line = 79)
    public final int method404(int arg0) {
        if (arg0 != -4469) {
            this.method412(30, 100, (byte) -77);
        }
        return this.field8571;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V", line = 89)
    public final void method409(boolean arg0) {
        if (this.field8566 != null) {
            this.field8566.method3340((byte) -27);
            this.field8566 = null;
        }
        if (arg0) {
            this.method408(null, 63, -73, 108);
        }
        this.field8571 = 0;
        this.field8570 = 0;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)Z", line = 109)
    public final boolean method411(int arg0) {
        if (this.field8568 && class398.method2384(7155, this.field8566.Unlock())) {
            this.field8568 = false;
            return true;
        } else {
            int var2 = -87 / ((39 - arg0) / 62);
            return false;
        }
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)I", line = 128)
    public final int method3402(int arg0) {
        if (arg0 != -12175) {
            this.method404(7);
        }
        return this.field8569;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lnca;Z)V", line = 141)
    public class583(class54 arg0, boolean arg1) {
        this.field8567 = arg1;
        this.field8565 = arg0;
    }
}
