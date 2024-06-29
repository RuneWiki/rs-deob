import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class509;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class266 implements class118 {

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "Z")
    private boolean field3905 = false;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "Lwj;")
    private class415 field3907;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "Z")
    private boolean field3904;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "Luda;")
    private class475 field3903;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    private int field3906;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
    private int field3909;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field3908;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    public final Buffer method847(int arg0, boolean arg1) {
        if (this.field3908 == null) {
            return null;
        } else if (arg0 >= -115) {
            return (Buffer) null;
        } else {
            boolean var3 = arg1 & this.field3904;
            if (!this.field3905 && class509.method2977(this.field3908.Lock(0, this.field3909, var3 ? 8192 : 0, this.field3903.field6674), 17527)) {
                this.field3905 = true;
                return this.field3903.field6674;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)V")
    public final void method850(int arg0, int arg1) {
        if (arg0 != -8165) {
            this.method849(64);
        }
        this.field3906 = this.field3907.field5982 * arg1;
        if (this.field3906 <= this.field3909) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field3904) {
            var4 = 0;
            var3 |= 0x200;
        } else {
            var4 = 1;
        }
        if (this.field3908 != null) {
            this.field3908.method3820(true);
        }
        this.field3908 = this.field3903.field6676.method2970(this.field3906, var3, class415.field5987 == this.field3907 ? 101 : 102, var4, this.field3908);
        this.field3909 = this.field3906;
    }

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(I)V")
    public final void method851(int arg0) {
        if (this.field3908 != null) {
            this.field3908.method3820(true);
            this.field3908 = null;
        }
        this.field3906 = 0;
        this.field3909 = 0;
        if (arg0 != -21765) {
            this.field3909 = -13;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)Lwj;")
    public final class415 method848(byte arg0) {
        if (arg0 != -92) {
            this.field3909 = 112;
        }
        return this.field3907;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)I")
    public final int method84(int arg0) {
        if (arg0 > -80) {
            this.method851(21);
        }
        return this.field3906;
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)Z")
    public final boolean method849(int arg0) {
        if (arg0 != 18579) {
            this.field3906 = -97;
        }
        if (this.field3905 && class509.method2977(this.field3908.Unlock(), 17527)) {
            this.field3905 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Luda;Lwj;Z)V")
    public class266(class475 arg0, class415 arg1, boolean arg2) {
        this.field3907 = arg1;
        this.field3904 = arg2;
        this.field3903 = arg0;
    }
}
