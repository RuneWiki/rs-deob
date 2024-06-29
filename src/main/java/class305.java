import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class411;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class305 implements class628 {

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "Z")
    private boolean field4191 = false;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "Z")
    private boolean field4187;

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "Lwda;")
    private class547 field4186;

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "B")
    private byte field4188;

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "I")
    private int field4189;

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "I")
    private int field4190;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field4185;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIB)Z")
    public final boolean method1866(int arg0, int arg1, byte arg2) {
        this.field4190 = arg0;
        this.field4188 = (byte) arg1;
        if (arg2 > -84) {
            this.method1866(97, 44, (byte) 93);
        }
        if (this.field4190 > this.field4189) {
            int var4 = 8;
            byte var5;
            if (this.field4187) {
                var4 |= 0x200;
                var5 = 0;
            } else {
                var5 = 1;
            }
            if (this.field4185 != null) {
                this.field4185.method3460(2266);
            }
            this.field4185 = this.field4186.field8175.method2427(this.field4190, var4, 0, var5, this.field4185);
            this.field4189 = this.field4190;
        }
        return this.field4185 != null;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)I")
    public final int method288(int arg0) {
        return arg0 == 247 ? this.field4190 : 69;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IILjaclib/memory/Source;I)Z")
    public final boolean method1867(int arg0, int arg1, Source arg2, int arg3) {
        if (this.method1866(arg1, arg0, (byte) -98)) {
            return this.field4185.method2442(arg2, 0, 0, this.field4190, this.field4187 ? 8192 : 0);
        } else {
            if (arg3 < 52) {
                this.field4186 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)Z")
    public final boolean method280(int arg0) {
        if (this.field4191 && class411.method2436(this.field4185.Unlock(), (byte) 103)) {
            this.field4191 = false;
            return true;
        } else {
            if (arg0 != 28596) {
                this.field4191 = true;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)I")
    public final int method1868(byte arg0) {
        return arg0 == -114 ? this.field4188 : -119;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    public final Buffer method282(int arg0, boolean arg1) {
        if (arg0 != -13803) {
            this.field4188 = -89;
        }
        boolean var3 = arg1 & this.field4187;
        if (!this.field4191 && class411.method2436(this.field4185.Lock(0, this.field4189, var3 ? 8192 : 0, this.field4186.field8179), (byte) 117)) {
            this.field4191 = true;
            return this.field4186.field8179;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(B)V")
    public final void method281(byte arg0) {
        if (this.field4185 != null) {
            this.field4185.method3460(2266);
            this.field4185 = null;
        }
        this.field4189 = 0;
        this.field4190 = 0;
        if (arg0 < 34) {
            this.method281((byte) -64);
        }
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lwda;Z)V")
    public class305(class547 arg0, boolean arg1) {
        this.field4187 = arg1;
        this.field4186 = arg0;
    }
}
