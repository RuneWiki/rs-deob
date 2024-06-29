import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class509;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class735 implements class422 {

    @OriginalMember(owner = "client!pw", name = "g", descriptor = "Z")
    private boolean field10274 = false;

    @OriginalMember(owner = "client!pw", name = "f", descriptor = "Lus;")
    private class1 field10273;

    @OriginalMember(owner = "client!pw", name = "e", descriptor = "Z")
    private boolean field10272;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "Ldw;")
    private class748 field10268;

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "I")
    private int field10270;

    @OriginalMember(owner = "client!pw", name = "d", descriptor = "I")
    private int field10271;

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field10269;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(Z)Ldw;", line = 4)
    public final class748 method2528(boolean arg0) {
        if (!arg0) {
            this.field10273 = null;
        }
        return this.field10268;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;", line = 16)
    public final Buffer method2527(byte arg0, boolean arg1) {
        if (this.field10269 == null) {
            return null;
        }
        boolean var3 = arg1 & this.field10272;
        if (!this.field10274 && class509.method3048(-1, this.field10269.Lock(0, this.field10271, var3 ? 8192 : 0, this.field10273.field12))) {
            this.field10274 = true;
            return this.field10273.field12;
        } else {
            if (arg0 > -55) {
                this.method2527((byte) 85, true);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(B)I", line = 38)
    public final int method276(byte arg0) {
        int var2 = -121 % ((arg0 - 87) / 35);
        return this.field10270;
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(B)V", line = 47)
    public final void method274(byte arg0) {
        if (this.field10269 != null) {
            this.field10269.method4003(true);
            this.field10269 = null;
        }
        this.field10271 = 0;
        int var2 = -70 % ((-arg0 - 40) / 36);
        this.field10270 = 0;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(II)V", line = 64)
    public final void method2529(int arg0, int arg1) {
        if (arg0 <= 79) {
            this.method276((byte) -124);
        }
        this.field10270 = this.field10268.field10374 * arg1;
        if (this.field10271 >= this.field10270) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field10272) {
            var3 |= 0x200;
            var4 = 0;
        } else {
            var4 = 1;
        }
        if (this.field10269 != null) {
            this.field10269.method4003(true);
        }
        this.field10269 = this.field10273.field27.method3058(this.field10270, var3, class748.field10385 == this.field10268 ? 101 : 102, var4, this.field10269);
        this.field10271 = this.field10270;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)Z", line = 101)
    public final boolean method2526(int arg0) {
        if (this.field10274 && class509.method3048(arg0 - 1235, this.field10269.Unlock())) {
            this.field10274 = false;
            return true;
        } else {
            return arg0 != 1234;
        }
    }

    @OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(Lus;Ldw;Z)V", line = 122)
    public class735(class1 arg0, class748 arg1, boolean arg2) {
        this.field10273 = arg0;
        this.field10272 = arg2;
        this.field10268 = arg1;
    }
}
