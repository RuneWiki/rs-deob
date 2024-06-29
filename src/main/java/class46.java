import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class771;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class46 implements class233 {

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "Z")
    private boolean field526 = false;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "Z")
    private boolean field531;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "Lcka;")
    private class248 field529;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "B")
    private byte field528;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    private int field527;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    private int field530;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field525;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)I", line = 4)
    public final int method282(int arg0) {
        return arg0 > -15 ? 56 : this.field528;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)Z", line = 14)
    public final boolean method283(int arg0, int arg1, int arg2) {
        this.field527 = arg0;
        this.field528 = (byte) arg1;
        if (this.field527 > this.field530) {
            int var4 = 8;
            byte var5;
            if (this.field531) {
                var4 |= 0x200;
                var5 = 0;
            } else {
                var5 = 1;
            }
            if (this.field525 != null) {
                this.field525.method2546(true);
            }
            this.field525 = this.field529.field3402.method4182(this.field527, var4, 0, var5, this.field525);
            this.field530 = this.field527;
        }
        if (arg2 == -21048) {
            return this.field525 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V", line = 56)
    public final void method284(byte arg0) {
        if (this.field525 != null) {
            this.field525.method2546(true);
            this.field525 = null;
        }
        this.field530 = 0;
        this.field527 = 0;
        if (arg0 <= 33) {
            this.field529 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IBILjaclib/memory/Source;)Z", line = 74)
    public final boolean method285(int arg0, byte arg1, int arg2, Source arg3) {
        if (this.method283(arg0, arg2, arg1 ^ 0xFFFFADA1)) {
            return this.field525.method4170(arg3, 0, 0, this.field527, this.field531 ? 8192 : 0);
        } else {
            if (arg1 != 105) {
                this.field525 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lcka;Z)V", line = 144)
    public class46(class248 arg0, boolean arg1) {
        this.field531 = arg1;
        this.field529 = arg0;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;", line = 92)
    public final Buffer method286(int arg0, boolean arg1) {
        if (this.field525 == null) {
            return null;
        }
        boolean var3 = arg1 & this.field531;
        if (!this.field526 && class771.method4195(false, this.field525.Lock(0, this.field530, var3 ? 8192 : 0, this.field529.field3382))) {
            this.field526 = true;
            return this.field529.field3382;
        } else {
            if (arg0 != 16561) {
                this.method288(39);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)I", line = 113)
    public final int method287(int arg0) {
        if (arg0 != 128) {
            this.field530 = 54;
        }
        return this.field527;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)Z", line = 124)
    public final boolean method288(int arg0) {
        if (arg0 != -12162) {
            this.method283(-63, -22, -64);
        }
        if (this.field526 && class771.method4195(false, this.field525.Unlock())) {
            this.field526 = false;
            return true;
        } else {
            return false;
        }
    }
}
