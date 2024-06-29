import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class416;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class106 implements class396 {

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "Z")
    private boolean field1273 = false;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "Lrca;")
    private class391 field1269;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "Z")
    private boolean field1268;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "Lvt;")
    private class256 field1274;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    private int field1270;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    private int field1271;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field1272;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)V")
    public final void method650(boolean arg0) {
        if (this.field1272 != null) {
            this.field1272.method3429((byte) -75);
            this.field1272 = null;
        }
        if (!arg0) {
            this.method652(false, -18);
        }
        this.field1271 = 0;
        this.field1270 = 0;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)Z")
    public final boolean method651(int arg0) {
        if (arg0 != -15045) {
            this.method652(true, 7);
        }
        if (this.field1273 && class416.method2641((byte) 48, this.field1272.Unlock())) {
            this.field1273 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    public final Buffer method652(boolean arg0, int arg1) {
        if (arg1 != 31983) {
            this.field1272 = null;
        }
        boolean var3 = arg0 & this.field1268;
        if (!this.field1273 && class416.method2641((byte) 48, this.field1272.Lock(0, this.field1271, var3 ? 8192 : 0, this.field1269.field5983))) {
            this.field1273 = true;
            return this.field1269.field5983;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)I")
    public final int method653(int arg0) {
        if (arg0 != 14173) {
            this.method651(-1);
        }
        return this.field1270;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)V")
    public final void method654(int arg0, int arg1) {
        if (arg1 != 9658) {
            this.field1269 = null;
        }
        this.field1270 = this.field1274.field3652 * arg0;
        if (this.field1271 >= this.field1270) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field1268) {
            var4 = 0;
            var3 |= 0x200;
        } else {
            var4 = 1;
        }
        if (this.field1272 != null) {
            this.field1272.method3429((byte) -95);
        }
        this.field1272 = this.field1269.field5990.method2623(this.field1270, var3, class256.field3654 == this.field1274 ? 101 : 102, var4, this.field1272);
        this.field1271 = this.field1270;
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(I)Lvt;")
    public final class256 method655(int arg0) {
        int var2 = 24 % ((-arg0 - 28) / 48);
        return this.field1274;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lrca;Lvt;Z)V")
    public class106(class391 arg0, class256 arg1, boolean arg2) {
        this.field1269 = arg0;
        this.field1268 = arg2;
        this.field1274 = arg1;
    }
}
