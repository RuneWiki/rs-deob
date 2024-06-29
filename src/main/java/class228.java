import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class757;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class228 implements class614 {

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "Z")
    private boolean field3444 = false;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "Z")
    private boolean field3446;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "Lsga;")
    private class608 field3445;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "Loea;")
    private class612 field3447;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    private int field3448;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    private int field3449;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field3450;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)I")
    public final int method1124(int arg0) {
        return arg0 == 22913 ? this.field3448 : -55;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V")
    public final void method1125(int arg0) {
        if (this.field3450 != null) {
            this.field3450.method2320(-5017);
            this.field3450 = null;
        }
        this.field3449 = 0;
        this.field3448 = 0;
        if (arg0 < 18) {
            this.field3447 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    public final Buffer method1126(boolean arg0, byte arg1) {
        if (this.field3450 == null) {
            return null;
        }
        boolean var3 = arg0 & this.field3446;
        if (!this.field3444 && class757.method4192(this.field3450.Lock(0, this.field3449, var3 ? 8192 : 0, this.field3445.field8560), (byte) -121)) {
            this.field3444 = true;
            return this.field3445.field8560;
        } else if (arg1 <= 95) {
            return (Buffer) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)Z")
    public final boolean method1121(int arg0) {
        if (this.field3444 && class757.method4192(this.field3450.Unlock(), (byte) -57)) {
            this.field3444 = false;
            return true;
        } else {
            if (arg0 != 3104) {
                this.method1124(-110);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)Loea;")
    public final class612 method1122(int arg0) {
        if (arg0 != 11677) {
            this.field3449 = -103;
        }
        return this.field3447;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V")
    public final void method1119(int arg0, int arg1) {
        this.field3448 = this.field3447.field8609 * arg0;
        if (arg1 != -27671 || this.field3448 <= this.field3449) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field3446) {
            var4 = 0;
            var3 |= 0x200;
        } else {
            var4 = 1;
        }
        if (this.field3450 != null) {
            this.field3450.method2320(arg1 + 22654);
        }
        this.field3450 = this.field3445.field8555.method4187(this.field3448, var3, class612.field8617 == this.field3447 ? 101 : 102, var4, this.field3450);
        this.field3449 = this.field3448;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lsga;Loea;Z)V")
    public class228(class608 arg0, class612 arg1, boolean arg2) {
        this.field3446 = arg2;
        this.field3445 = arg0;
        this.field3447 = arg1;
    }
}
