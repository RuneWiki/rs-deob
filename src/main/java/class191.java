import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class411;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class191 implements class370 {

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "Z")
    private boolean field2834 = false;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Z")
    private boolean field2836;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Lwda;")
    private class547 field2831;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "Lui;")
    private class194 field2837;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    private int field2833;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    private int field2835;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field2832;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)V", line = 8)
    public final void method287(int arg0, int arg1) {
        this.field2833 = this.field2837.field2870 * arg1;
        if (this.field2833 > this.field2835) {
            int var3 = 8;
            byte var4;
            if (this.field2836) {
                var3 |= 0x200;
                var4 = 0;
            } else {
                var4 = 1;
            }
            if (this.field2832 != null) {
                this.field2832.method3460(2266);
            }
            this.field2832 = this.field2831.field8175.method2420(this.field2833, var3, class194.field2875 == this.field2837 ? 101 : 102, var4, this.field2832);
            this.field2835 = this.field2833;
        }
        if (arg0 > -71) {
            this.method282(-4, false);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;", line = 41)
    public final Buffer method282(int arg0, boolean arg1) {
        if (arg0 != -13803) {
            return (Buffer) null;
        }
        boolean var3 = arg1 & this.field2836;
        if (!this.field2834 && class411.method2436(this.field2832.Lock(0, this.field2835, var3 ? 8192 : 0, this.field2831.field8179), (byte) 66)) {
            this.field2834 = true;
            return this.field2831.field8179;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V", line = 59)
    public final void method281(byte arg0) {
        if (this.field2832 != null) {
            this.field2832.method3460(2266);
            this.field2832 = null;
        }
        this.field2835 = 0;
        if (arg0 <= 34) {
            this.method283((byte) -74);
        }
        this.field2833 = 0;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)Z", line = 78)
    public final boolean method280(int arg0) {
        if (this.field2834 && class411.method2436(this.field2832.Unlock(), (byte) 104)) {
            this.field2834 = false;
            return true;
        } else {
            return arg0 != 28596;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)Lui;", line = 99)
    public final class194 method283(byte arg0) {
        if (arg0 > -69) {
            this.method282(-99, false);
        }
        return this.field2837;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)I", line = 110)
    public final int method288(int arg0) {
        if (arg0 != 247) {
            this.field2834 = true;
        }
        return this.field2833;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lwda;Lui;Z)V", line = 122)
    public class191(class547 arg0, class194 arg1, boolean arg2) {
        this.field2836 = arg2;
        this.field2831 = arg0;
        this.field2837 = arg1;
    }
}
