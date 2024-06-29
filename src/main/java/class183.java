import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class416;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class183 implements class209 {

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "Z")
    private boolean field2285 = false;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "Z")
    private boolean field2283;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "Lrca;")
    private class391 field2287;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "B")
    private byte field2286;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    private int field2288;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    private int field2289;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field2284;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljaclib/memory/Source;III)Z")
    public final boolean method1070(Source arg0, int arg1, int arg2, int arg3) {
        int var5 = 58 / ((arg1 + 32) / 46);
        return this.method1071(arg2, -1249, arg3) ? this.field2284.method2639(arg0, 0, 0, this.field2288, this.field2283 ? 8192 : 0) : false;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)I")
    public final int method653(int arg0) {
        if (arg0 != 14173) {
            this.field2283 = true;
        }
        return this.field2288;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)Z")
    public final boolean method651(int arg0) {
        if (arg0 != -15045) {
            this.method1072((byte) 67);
        }
        if (this.field2285 && class416.method2641((byte) 48, this.field2284.Unlock())) {
            this.field2285 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)Z")
    public final boolean method1071(int arg0, int arg1, int arg2) {
        if (arg1 != -1249) {
            return false;
        }
        this.field2288 = arg2;
        this.field2286 = (byte) arg0;
        if (this.field2288 > this.field2289) {
            int var4 = 8;
            byte var5;
            if (this.field2283) {
                var4 |= 0x200;
                var5 = 0;
            } else {
                var5 = 1;
            }
            if (this.field2284 != null) {
                this.field2284.method3429((byte) -103);
            }
            this.field2284 = this.field2287.field5990.method2633(this.field2288, var4, 0, var5, this.field2284);
            this.field2289 = this.field2288;
        }
        return this.field2284 != null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
    public final void method650(boolean arg0) {
        if (!arg0) {
            return;
        }
        if (this.field2284 != null) {
            this.field2284.method3429((byte) -64);
            this.field2284 = null;
        }
        this.field2289 = 0;
        this.field2288 = 0;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)I")
    public final int method1072(byte arg0) {
        if (arg0 != -82) {
            this.field2285 = true;
        }
        return this.field2286;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    public final Buffer method652(boolean arg0, int arg1) {
        if (arg1 != 31983) {
            this.method1072((byte) 124);
        }
        boolean var3 = arg0 & this.field2283;
        if (!this.field2285 && class416.method2641((byte) 48, this.field2284.Lock(0, this.field2289, var3 ? 8192 : 0, this.field2287.field5983))) {
            this.field2285 = true;
            return this.field2287.field5983;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lrca;Z)V")
    public class183(class391 arg0, boolean arg1) {
        this.field2283 = arg1;
        this.field2287 = arg0;
    }
}
