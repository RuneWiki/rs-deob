import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class439;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class254 implements class666 {

    @OriginalMember(owner = "client!kda", name = "f", descriptor = "Z")
    private boolean field3107 = false;

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "Z")
    private boolean field3104;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "Lbt;")
    private class117 field3102;

    @OriginalMember(owner = "client!kda", name = "g", descriptor = "Lgaa;")
    private class302 field3108;

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "I")
    private int field3103;

    @OriginalMember(owner = "client!kda", name = "e", descriptor = "I")
    private int field3106;

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field3105;

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)V")
    public final void method323(int arg0) {
        if (this.field3105 != null) {
            this.field3105.method3435(6168);
            this.field3105 = null;
        }
        if (arg0 == -21271) {
            this.field3106 = 0;
            this.field3103 = 0;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)Lbt;")
    public final class117 method1484(int arg0) {
        if (arg0 != -17318) {
            this.field3103 = -27;
        }
        return this.field3102;
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(B)Z")
    public final boolean method1485(byte arg0) {
        if (arg0 <= 10) {
            return false;
        } else if (this.field3107 && class439.method2333(this.field3105.Unlock(), -2005530519)) {
            this.field3107 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    public final Buffer method1486(byte arg0, boolean arg1) {
        if (this.field3105 == null) {
            return null;
        }
        boolean var3 = arg1 & this.field3104;
        if (arg0 != -88) {
            this.field3106 = 15;
        }
        if (!this.field3107 && class439.method2333(this.field3105.Lock(0, this.field3106, var3 ? 8192 : 0, this.field3108.field3724), -2005530519)) {
            this.field3107 = true;
            return this.field3108.field3724;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(II)V")
    public final void method619(int arg0, int arg1) {
        if (arg0 != 27209) {
            this.method1486((byte) -74, true);
        }
        this.field3103 = this.field3102.field1505 * arg1;
        if (this.field3103 <= this.field3106) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field3104) {
            var3 |= 0x200;
            var4 = 0;
        } else {
            var4 = 1;
        }
        if (this.field3105 != null) {
            this.field3105.method3435(arg0 ^ 0x7251);
        }
        this.field3105 = this.field3108.field3716.method2329(this.field3103, var3, class117.field1510 == this.field3102 ? 101 : 102, var4, this.field3105);
        this.field3106 = this.field3103;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)I")
    public final int method330(byte arg0) {
        if (arg0 <= 11) {
            this.field3107 = true;
        }
        return this.field3103;
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lgaa;Lbt;Z)V")
    public class254(class302 arg0, class117 arg1, boolean arg2) {
        this.field3104 = arg2;
        this.field3102 = arg1;
        this.field3108 = arg0;
    }
}
