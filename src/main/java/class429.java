import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class672;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class429 implements class184 {

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "Z")
    private boolean field6253 = false;

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "Lik;")
    private class107 field6252;

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "Z")
    private boolean field6251;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "B")
    private byte field6250;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
    private int field6249;

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
    private int field6254;

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field6255;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IILjaclib/memory/Source;I)Z")
    public final boolean method1228(int arg0, int arg1, Source arg2, int arg3) {
        if (arg0 != -27648) {
            this.field6249 = -48;
        }
        return this.method1229(arg3, arg1, arg0 + 57460) ? this.field6255.method3751(arg2, 0, 0, this.field6249, this.field6251 ? 8192 : 0) : false;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)I")
    public final int method2568(byte arg0) {
        if (arg0 >= -119) {
            this.field6255 = null;
        }
        return this.field6250;
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)Z")
    public final boolean method1230(int arg0) {
        if (this.field6253 && class672.method3775(this.field6255.Unlock(), 10067)) {
            this.field6253 = false;
            return true;
        } else if (arg0 > -57) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Z)I")
    public final int method963(boolean arg0) {
        if (arg0) {
            this.field6249 = -22;
        }
        return this.field6249;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
    public final void method987(int arg0) {
        if (this.field6255 != null) {
            this.field6255.method2063((byte) 90);
            this.field6255 = null;
        }
        this.field6249 = 0;
        int var2 = 53 / ((-arg0 - 81) / 33);
        this.field6254 = 0;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    public final Buffer method1231(boolean arg0, int arg1) {
        if (this.field6255 == null) {
            return null;
        }
        if (arg1 != 3696) {
            this.field6255 = null;
        }
        boolean var3 = arg0 & this.field6251;
        if (!this.field6253 && class672.method3775(this.field6255.Lock(0, this.field6254, var3 ? 8192 : 0, this.field6252.field1583), 10067)) {
            this.field6253 = true;
            return this.field6252.field1583;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lik;Z)V")
    public class429(class107 arg0, boolean arg1) {
        this.field6252 = arg0;
        this.field6251 = arg1;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(III)Z")
    public final boolean method1229(int arg0, int arg1, int arg2) {
        this.field6250 = (byte) arg1;
        this.field6249 = arg0;
        if (arg2 != 29812) {
            this.field6251 = true;
        }
        if (this.field6249 > this.field6254) {
            int var4 = 8;
            byte var5;
            if (this.field6251) {
                var5 = 0;
                var4 |= 0x200;
            } else {
                var5 = 1;
            }
            if (this.field6255 != null) {
                this.field6255.method2063((byte) 60);
            }
            this.field6255 = this.field6252.field1600.method3764(this.field6249, var4, 0, var5, this.field6255);
            this.field6254 = this.field6249;
        }
        return this.field6255 != null;
    }
}
