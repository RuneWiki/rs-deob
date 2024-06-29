import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class481;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class46 implements class543 {

    @OriginalMember(owner = "client!kaa", name = "g", descriptor = "Z")
    private boolean field506 = false;

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "Lhl;")
    private class527 field501;

    @OriginalMember(owner = "client!kaa", name = "f", descriptor = "Ljm;")
    private class687 field505;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "Z")
    private boolean field500;

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "I")
    private int field502;

    @OriginalMember(owner = "client!kaa", name = "e", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "client!kaa", name = "d", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field503;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Z)V", line = 4)
    public final void method262(boolean arg0) {
        if (this.field503 != null) {
            this.field503.method3834(-31315);
            this.field503 = null;
        }
        if (!arg0) {
            this.method262(true);
        }
        this.field502 = 0;
        this.field504 = 0;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;", line = 23)
    public final Buffer method263(int arg0, boolean arg1) {
        if (this.field503 == null) {
            return null;
        }
        boolean var3 = arg1 & this.field500;
        if (!this.field506 && class481.method2896(this.field503.Lock(0, this.field502, var3 ? 8192 : 0, this.field501.field7510), 2005530520)) {
            this.field506 = true;
            return this.field501.field7510;
        } else if (arg0 == 13931) {
            return null;
        } else {
            return (Buffer) null;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "(Z)Ljm;", line = 44)
    public final class687 method264(boolean arg0) {
        if (arg0) {
            this.method267(71, 48);
        }
        return this.field505;
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(Z)I", line = 57)
    public final int method265(boolean arg0) {
        if (!arg0) {
            this.field502 = 96;
        }
        return this.field504;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)Z", line = 70)
    public final boolean method266(int arg0) {
        if (this.field506 && class481.method2896(this.field503.Unlock(), arg0 ^ 0x8876421D)) {
            this.field506 = false;
            return true;
        } else if (arg0 == -19067) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Lhl;Ljm;Z)V", line = 95)
    public class46(class527 arg0, class687 arg1, boolean arg2) {
        this.field501 = arg0;
        this.field505 = arg1;
        this.field500 = arg2;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(II)V", line = 107)
    public final void method267(int arg0, int arg1) {
        if (arg0 != 30903) {
            this.method263(119, true);
        }
        this.field504 = this.field505.field9690 * arg1;
        if (this.field502 >= this.field504) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field500) {
            var3 |= 0x200;
            var4 = 0;
        } else {
            var4 = 1;
        }
        if (this.field503 != null) {
            this.field503.method3834(-31315);
        }
        this.field503 = this.field501.field7501.method2912(this.field504, var3, class687.field9698 == this.field505 ? 101 : 102, var4, this.field503);
        this.field502 = this.field504;
    }
}
