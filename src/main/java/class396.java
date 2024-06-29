import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class410;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class396 implements class609 {

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "Z")
    private boolean field5628 = false;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "Z")
    private boolean field5623;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "Lbv;")
    private class256 field5627;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "B")
    private byte field5626;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    private int field5624;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    private int field5625;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field5629;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(III)Z")
    public final boolean method619(int arg0, int arg1, int arg2) {
        this.field5624 = arg2;
        this.field5626 = (byte) arg0;
        int var4 = 33 % ((arg1 + 35) / 47);
        if (this.field5624 > this.field5625) {
            int var5 = 8;
            byte var6;
            if (this.field5623) {
                var5 |= 0x200;
                var6 = 0;
            } else {
                var6 = 1;
            }
            if (this.field5629 != null) {
                this.field5629.method3306((byte) 123);
            }
            this.field5629 = this.field5627.field3527.method2431(this.field5624, var5, 0, var6, this.field5629);
            this.field5625 = this.field5624;
        }
        return this.field5629 != null;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)Z")
    public final boolean method616(byte arg0) {
        if (this.field5628 && class410.method2428(this.field5629.Unlock(), (byte) 112)) {
            this.field5628 = false;
            return true;
        } else {
            if (arg0 >= -65) {
                this.field5625 = 98;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
    public final void method618(byte arg0) {
        if (this.field5629 != null) {
            this.field5629.method3306((byte) 6);
            this.field5629 = null;
        }
        this.field5624 = 0;
        this.field5625 = 0;
        if (arg0 <= 11) {
            this.method620(-123);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIILjaclib/memory/Source;)Z")
    public final boolean method617(int arg0, int arg1, int arg2, Source arg3) {
        int var5 = 48 / ((-arg0 - 1) / 41);
        return this.method619(arg1, -94, arg2) ? this.field5629.method2450(arg3, 0, 0, this.field5624, this.field5623 ? 8192 : 0) : false;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)I")
    public final int method620(int arg0) {
        if (arg0 >= -120) {
            this.method619(-47, -21, 54);
        }
        return this.field5624;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)I")
    public final int method2371(int arg0) {
        if (arg0 != 16078) {
            this.field5625 = 83;
        }
        return this.field5626;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    public final Buffer method613(boolean arg0, int arg1) {
        boolean var3 = arg0 & this.field5623;
        if (arg1 != -25838) {
            this.method620(-87);
        }
        if (!this.field5628 && class410.method2428(this.field5629.Lock(0, this.field5625, var3 ? 8192 : 0, this.field5627.field3540), (byte) 122)) {
            this.field5628 = true;
            return this.field5627.field3540;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lbv;Z)V")
    public class396(class256 arg0, boolean arg1) {
        this.field5623 = arg1;
        this.field5627 = arg0;
    }
}
