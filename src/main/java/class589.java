import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class672;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class589 implements class483 {

    @OriginalMember(owner = "client!co", name = "c", descriptor = "Z")
    private boolean field8588 = false;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "Loe;")
    private class13 field8592;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "Z")
    private boolean field8591;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "B")
    private byte field8587;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "I")
    private int field8586;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "I")
    private int field8590;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field8589;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(I)I", line = 4)
    public final int method240(int arg0) {
        return arg0 == 18471 ? this.field8586 : 89;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;", line = 17)
    public final Buffer method532(boolean arg0, byte arg1) {
        if (arg1 != 56) {
            this.field8592 = null;
        }
        if (this.field8589 == null) {
            return null;
        }
        boolean var3 = arg0 & this.field8591;
        if (!this.field8588 && class672.method3806(61, this.field8589.Lock(0, this.field8590, var3 ? 8192 : 0, this.field8592.field167))) {
            this.field8588 = true;
            return this.field8592.field167;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ILjaclib/memory/Source;IB)Z", line = 38)
    public final boolean method534(int arg0, Source arg1, int arg2, byte arg3) {
        if (this.method535(14036, arg2, arg0)) {
            return this.field8589.method3782(arg1, 0, 0, this.field8586, this.field8591 ? 8192 : 0);
        } else {
            if (arg3 > -12) {
                this.field8592 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(I)I", line = 53)
    public final int method3385(int arg0) {
        return arg0 == -26171 ? this.field8587 : 11;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V", line = 65)
    public final void method231(byte arg0) {
        if (this.field8589 != null) {
            this.field8589.method2012((byte) -6);
            this.field8589 = null;
        }
        this.field8586 = 0;
        if (arg0 != -105) {
            this.method3385(80);
        }
        this.field8590 = 0;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(III)Z", line = 84)
    public final boolean method535(int arg0, int arg1, int arg2) {
        this.field8587 = (byte) arg2;
        this.field8586 = arg1;
        if (this.field8586 > this.field8590) {
            int var4 = 8;
            byte var5;
            if (this.field8591) {
                var4 |= 0x200;
                var5 = 0;
            } else {
                var5 = 1;
            }
            if (this.field8589 != null) {
                this.field8589.method2012((byte) -6);
            }
            this.field8589 = this.field8592.field154.method3788(this.field8586, var4, 0, var5, this.field8589);
            this.field8590 = this.field8586;
        }
        if (arg0 != 14036) {
            this.method3385(-20);
        }
        return this.field8589 != null;
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Loe;Z)V", line = 124)
    public class589(class13 arg0, boolean arg1) {
        this.field8592 = arg0;
        this.field8591 = arg1;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)Z", line = 134)
    public final boolean method530(int arg0) {
        if (this.field8588 && class672.method3806(arg0 + 14820, this.field8589.Unlock())) {
            this.field8588 = false;
            return true;
        } else {
            if (arg0 != -14770) {
                this.method532(true, (byte) -7);
            }
            return false;
        }
    }
}
