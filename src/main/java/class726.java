import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class510;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class726 implements class427 {

    @OriginalMember(owner = "client!sfa", name = "g", descriptor = "Z")
    private boolean field10105 = false;

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "Lrja;")
    private class115 field10101;

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "Lig;")
    private class258 field10099;

    @OriginalMember(owner = "client!sfa", name = "d", descriptor = "Z")
    private boolean field10102;

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "I")
    private int field10100;

    @OriginalMember(owner = "client!sfa", name = "e", descriptor = "I")
    private int field10103;

    @OriginalMember(owner = "client!sfa", name = "f", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field10104;

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(I)V")
    public final void method2614(int arg0) {
        if (arg0 != 487) {
            return;
        }
        if (this.field10104 != null) {
            this.field10104.method3936((byte) -70);
            this.field10104 = null;
        }
        this.field10103 = 0;
        this.field10100 = 0;
    }

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "(I)Z")
    public final boolean method2611(int arg0) {
        if (arg0 != 26937) {
            this.method2615(-55, (byte) -1);
        }
        if (this.field10105 && class510.method2954(arg0 ^ 0x6939, this.field10104.Unlock())) {
            this.field10105 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "(I)Lig;")
    public final class258 method2612(int arg0) {
        return arg0 == 21064 ? this.field10099 : (class258) null;
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IB)V")
    public final void method2615(int arg0, byte arg1) {
        this.field10100 = this.field10099.field3842 * arg0;
        if (this.field10103 < this.field10100) {
            int var3 = 8;
            byte var4;
            if (this.field10102) {
                var4 = 0;
                var3 |= 0x200;
            } else {
                var4 = 1;
            }
            if (this.field10104 != null) {
                this.field10104.method3936((byte) -70);
            }
            this.field10104 = this.field10101.field1565.method2977(this.field10100, var3, class258.field3848 == this.field10099 ? 101 : 102, var4, this.field10104);
            this.field10103 = this.field10100;
        }
        if (arg1 != -73) {
            this.field10105 = false;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    public final Buffer method2613(boolean arg0, int arg1) {
        if (this.field10104 == null) {
            return null;
        }
        if (arg1 != 3754) {
            this.field10101 = null;
        }
        boolean var3 = arg0 & this.field10102;
        if (!this.field10105 && class510.method2954(0, this.field10104.Lock(0, this.field10103, var3 ? 8192 : 0, this.field10101.field1570))) {
            this.field10105 = true;
            return this.field10101.field1570;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(B)I")
    public final int method2631(byte arg0) {
        if (arg0 < 81) {
            this.method2613(true, 29);
        }
        return this.field10100;
    }

    @OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(Lrja;Lig;Z)V")
    public class726(class115 arg0, class258 arg1, boolean arg2) {
        this.field10101 = arg0;
        this.field10099 = arg1;
        this.field10102 = arg2;
    }
}
