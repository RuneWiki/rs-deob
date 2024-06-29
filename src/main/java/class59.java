import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class451;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class59 implements class13 {

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "Z")
    private boolean field752 = false;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "Ljr;")
    private class100 field747;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "Ltga;")
    private class54 field753;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "Z")
    private boolean field749;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    private int field748;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    private int field751;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field750;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)Z", line = 5)
    public final boolean method61(byte arg0) {
        if (arg0 != 96) {
            this.field747 = null;
        }
        if (this.field752 && class451.method2482(14528, this.field750.Unlock())) {
            this.field752 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 27)
    public final void method60(int arg0) {
        if (this.field750 != null) {
            this.field750.method3542(arg0 - 5558);
            this.field750 = null;
        }
        this.field751 = 0;
        if (arg0 != 5634) {
            this.method62(false, false);
        }
        this.field748 = 0;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)I", line = 48)
    public final int method503(int arg0) {
        if (arg0 != -3267) {
            this.field747 = null;
        }
        return this.field751;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;", line = 58)
    public final Buffer method62(boolean arg0, boolean arg1) {
        if (this.field750 == null) {
            return null;
        }
        boolean var3 = arg1 & this.field749;
        if (!arg0) {
            this.field750 = null;
        }
        if (!this.field752 && class451.method2482(14528, this.field750.Lock(0, this.field748, var3 ? 8192 : 0, this.field753.field680))) {
            this.field752 = true;
            return this.field753.field680;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)Ljr;", line = 80)
    public final class100 method58(byte arg0) {
        if (arg0 != 88) {
            this.field752 = false;
        }
        return this.field747;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)V", line = 90)
    public final void method59(int arg0, int arg1) {
        this.field751 = this.field747.field1284 * arg1;
        if (arg0 != -29529) {
            this.field752 = false;
        }
        if (this.field748 >= this.field751) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field749) {
            var3 |= 0x200;
            var4 = 0;
        } else {
            var4 = 1;
        }
        if (this.field750 != null) {
            this.field750.method3542(97);
        }
        this.field750 = this.field753.field696.method2468(this.field751, var3, class100.field1289 == this.field747 ? 101 : 102, var4, this.field750);
        this.field748 = this.field751;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Ltga;Ljr;Z)V", line = 128)
    public class59(class54 arg0, class100 arg1, boolean arg2) {
        this.field747 = arg1;
        this.field753 = arg0;
        this.field749 = arg2;
    }
}
