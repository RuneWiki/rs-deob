import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class480;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class263 implements class302 {

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "Z")
    private boolean field3836 = false;

    @OriginalMember(owner = "client!mda", name = "f", descriptor = "Z")
    private boolean field3840;

    @OriginalMember(owner = "client!mda", name = "e", descriptor = "Llt;")
    private class672 field3839;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "B")
    private byte field3835;

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "I")
    private int field3837;

    @OriginalMember(owner = "client!mda", name = "d", descriptor = "I")
    private int field3838;

    @OriginalMember(owner = "client!mda", name = "g", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field3841;

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(I)I")
    public final int method1777(int arg0) {
        if (arg0 <= 113) {
            this.method1777(18);
        }
        return this.field3835;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    public final Buffer method1492(byte arg0, boolean arg1) {
        if (this.field3841 == null) {
            return null;
        }
        boolean var3 = arg1 & this.field3840;
        if (arg0 != -20) {
            this.field3836 = true;
        }
        if (!this.field3836 && class480.method2879(this.field3841.Lock(0, this.field3837, var3 ? 8192 : 0, this.field3839.field9437), (byte) -103)) {
            this.field3836 = true;
            return this.field3839.field9437;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "(I)I")
    public final int method1491(int arg0) {
        int var2 = -52 % ((-arg0 - 42) / 46);
        return this.field3838;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(III)Z")
    public final boolean method1497(int arg0, int arg1, int arg2) {
        this.field3838 = arg1;
        this.field3835 = (byte) arg0;
        if (this.field3837 < this.field3838) {
            int var4 = 8;
            byte var5;
            if (this.field3840) {
                var4 |= 0x200;
                var5 = 0;
            } else {
                var5 = 1;
            }
            if (this.field3841 != null) {
                this.field3841.method3786(30216);
            }
            this.field3841 = this.field3839.field9423.method2886(this.field3838, var4, 0, var5, this.field3841);
            this.field3837 = this.field3838;
        }
        if (arg2 != -29407) {
            this.method1497(-84, 7, 116);
        }
        return this.field3841 != null;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)Z")
    public final boolean method1494(int arg0) {
        if (arg0 != 5069) {
            this.method1495(null, 36, -57, (byte) 90);
        }
        if (this.field3836 && class480.method2879(this.field3841.Unlock(), (byte) -104)) {
            this.field3836 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Z)V")
    public final void method1496(boolean arg0) {
        if (this.field3841 != null) {
            this.field3841.method3786(30216);
            this.field3841 = null;
        }
        this.field3837 = 0;
        if (!arg0) {
            this.field3838 = 0;
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Ljaclib/memory/Source;IIB)Z")
    public final boolean method1495(Source arg0, int arg1, int arg2, byte arg3) {
        int var5 = 52 / ((arg3 - 29) / 55);
        return this.method1497(arg1, arg2, -29407) ? this.field3841.method2909(arg0, 0, 0, this.field3838, this.field3840 ? 8192 : 0) : false;
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Llt;Z)V")
    public class263(class672 arg0, boolean arg1) {
        this.field3840 = arg1;
        this.field3839 = arg0;
    }
}
