import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class511;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class792 implements class414 {

    @OriginalMember(owner = "client!rw", name = "g", descriptor = "Z")
    private boolean field11555 = false;

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "Ldn;")
    private class544 field11553;

    @OriginalMember(owner = "client!rw", name = "f", descriptor = "Z")
    private boolean field11554;

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "Ler;")
    private class113 field11558;

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "I")
    private int field11552;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "I")
    private int field11557;

    @OriginalMember(owner = "client!rw", name = "e", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field11556;

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(I)Z")
    public final boolean method3307(int arg0) {
        if (this.field11555 && class511.method3844(-2005530585, this.field11556.Unlock())) {
            this.field11555 = false;
            return true;
        } else {
            if (arg0 < 113) {
                this.method3306((byte) -48);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)Ldn;")
    public final class544 method3306(byte arg0) {
        if (arg0 != -111) {
            this.field11553 = null;
        }
        return this.field11553;
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    public final Buffer method3305(int arg0, boolean arg1) {
        if (this.field11556 == null) {
            return null;
        }
        int var3 = 93 / ((arg0 + 61) / 56);
        boolean var4 = arg1 & this.field11554;
        if (!this.field11555 && class511.method3844(-2005530585, this.field11556.Lock(0, this.field11552, var4 ? 8192 : 0, this.field11558.field1578))) {
            this.field11555 = true;
            return this.field11558.field1578;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)V")
    public final void method981(int arg0) {
        if (arg0 != 1328) {
            this.field11554 = true;
        }
        if (this.field11556 != null) {
            this.field11556.method5123(111);
            this.field11556 = null;
        }
        this.field11552 = 0;
        this.field11557 = 0;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Z)I")
    public final int method975(boolean arg0) {
        return arg0 ? 126 : this.field11557;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IZ)V")
    public final void method980(int arg0, boolean arg1) {
        this.field11557 = this.field11553.field7999 * arg0;
        if (arg1) {
            this.method981(83);
        }
        if (this.field11552 >= this.field11557) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field11554) {
            var4 = 0;
            var3 |= 0x200;
        } else {
            var4 = 1;
        }
        if (this.field11556 != null) {
            this.field11556.method5123(-105);
        }
        this.field11556 = this.field11558.field1575.method3839(this.field11557, var3, class544.field8005 == this.field11553 ? 101 : 102, var4, this.field11556);
        this.field11552 = this.field11557;
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Ler;Ldn;Z)V")
    public class792(class113 arg0, class544 arg1, boolean arg2) {
        this.field11553 = arg1;
        this.field11554 = arg2;
        this.field11558 = arg0;
    }
}
