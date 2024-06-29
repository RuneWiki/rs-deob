import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class510;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public class class247 implements class226 {

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "Z")
    private boolean field3492 = false;

    @OriginalMember(owner = "client!dia", name = "f", descriptor = "Lso;")
    private class497 field3495;

    @OriginalMember(owner = "client!dia", name = "d", descriptor = "Z")
    private boolean field3493;

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "Laia;")
    private class242 field3490;

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "I")
    private int field3491;

    @OriginalMember(owner = "client!dia", name = "g", descriptor = "I")
    private int field3496;

    @OriginalMember(owner = "client!dia", name = "e", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field3494;

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(B)I", line = 6)
    public final int method1638(byte arg0) {
        int var2 = 91 % ((14 - arg0) / 43);
        return this.field3491;
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(I)Z", line = 18)
    public final boolean method1544(int arg0) {
        if (arg0 <= 80) {
            return false;
        } else if (this.field3492 && class510.method2912(this.field3494.Unlock(), -37)) {
            this.field3492 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "(I)Lso;", line = 39)
    public final class497 method1547(int arg0) {
        return arg0 == 11876 ? this.field3495 : (class497) null;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(II)V", line = 49)
    public final void method1546(int arg0, int arg1) {
        this.field3491 = this.field3495.field6795 * arg0;
        if (arg1 != -13659 || this.field3491 <= this.field3496) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field3493) {
            var3 |= 0x200;
            var4 = 0;
        } else {
            var4 = 1;
        }
        if (this.field3494 != null) {
            this.field3494.method3925(-6517);
        }
        this.field3494 = this.field3490.field3462.method2916(this.field3491, var3, class497.field6800 == this.field3495 ? 101 : 102, var4, this.field3494);
        this.field3496 = this.field3491;
    }

    @OriginalMember(owner = "client!dia", name = "<init>", descriptor = "(Laia;Lso;Z)V", line = 126)
    public class247(class242 arg0, class497 arg1, boolean arg2) {
        this.field3495 = arg1;
        this.field3493 = arg2;
        this.field3490 = arg0;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(I)V", line = 85)
    public final void method1543(int arg0) {
        if (arg0 != -21647) {
            this.field3492 = true;
        }
        if (this.field3494 != null) {
            this.field3494.method3925(-6517);
            this.field3494 = null;
        }
        this.field3491 = 0;
        this.field3496 = 0;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;", line = 105)
    public final Buffer method1545(boolean arg0, int arg1) {
        if (this.field3494 == null) {
            return null;
        }
        boolean var3 = arg0 & this.field3493;
        if (arg1 != -4450) {
            this.method1638((byte) 55);
        }
        if (!this.field3492 && class510.method2912(this.field3494.Lock(0, this.field3496, var3 ? 8192 : 0, this.field3490.field3446), arg1 ^ 0x1126)) {
            this.field3492 = true;
            return this.field3490.field3446;
        } else {
            return null;
        }
    }
}
