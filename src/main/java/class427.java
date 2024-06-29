import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class446;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class427 implements class241 {

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "Z")
    private boolean field6279 = false;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "Z")
    private boolean field6280;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "Ltb;")
    private class364 field6283;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Lig;")
    private class218 field6281;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    private int field6277;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    private int field6282;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field6278;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    public final Buffer method5(boolean arg0, int arg1) {
        if (this.field6278 == null) {
            return null;
        }
        if (arg1 <= 76) {
            this.method5(false, 13);
        }
        boolean var3 = arg0 & this.field6280;
        if (!this.field6279 && class446.method2640(1, this.field6278.Lock(0, this.field6282, var3 ? 8192 : 0, this.field6283.field5205))) {
            this.field6279 = true;
            return this.field6283.field5205;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)I")
    public final int method4(byte arg0) {
        if (arg0 != 1) {
            this.field6279 = true;
        }
        return this.field6277;
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)Z")
    public final boolean method2(int arg0) {
        int var2 = 127 / ((22 - arg0) / 62);
        if (this.field6279 && class446.method2640(-72, this.field6278.Unlock())) {
            this.field6279 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)V")
    public final void method1(int arg0, int arg1) {
        int var3 = -91 / ((arg0 - 72) / 43);
        this.field6277 = this.field6281.field3046 * arg1;
        if (this.field6282 >= this.field6277) {
            return;
        }
        int var4 = 8;
        byte var5;
        if (this.field6280) {
            var5 = 0;
            var4 |= 0x200;
        } else {
            var5 = 1;
        }
        if (this.field6278 != null) {
            this.field6278.method3496((byte) -80);
        }
        this.field6278 = this.field6283.field5204.method2653(this.field6277, var4, class218.field3051 == this.field6281 ? 101 : 102, var5, this.field6278);
        this.field6282 = this.field6277;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public final void method7(int arg0) {
        if (this.field6278 != null) {
            this.field6278.method3496((byte) -80);
            this.field6278 = null;
        }
        if (arg0 >= -98) {
            this.field6283 = null;
        }
        this.field6277 = 0;
        this.field6282 = 0;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)Lig;")
    public final class218 method3(int arg0) {
        if (arg0 != -885) {
            this.field6282 = 17;
        }
        return this.field6281;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Ltb;Lig;Z)V")
    public class427(class364 arg0, class218 arg1, boolean arg2) {
        this.field6280 = arg2;
        this.field6283 = arg0;
        this.field6281 = arg1;
    }
}
