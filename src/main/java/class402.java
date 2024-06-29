import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class509;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class402 implements class373 {

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "Z")
    private boolean field5735 = false;

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "Z")
    private boolean field5730;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "Luda;")
    private class475 field5729;

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "B")
    private byte field5733;

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "I")
    private int field5732;

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "I")
    private int field5734;

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field5731;

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "(I)V")
    public final void method851(int arg0) {
        if (this.field5731 != null) {
            this.field5731.method3820(true);
            this.field5731 = null;
        }
        if (arg0 != -21765) {
            this.field5734 = 82;
        }
        this.field5732 = 0;
        this.field5734 = 0;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZILjaclib/memory/Source;I)Z")
    public final boolean method2336(boolean arg0, int arg1, Source arg2, int arg3) {
        if (arg0) {
            this.method851(80);
        }
        return this.method2339(arg3, -32754, arg1) ? this.field5731.method2982(arg2, 0, 0, this.field5734, this.field5730 ? 8192 : 0) : false;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)I")
    public final int method2441(byte arg0) {
        if (arg0 <= 40) {
            this.field5732 = 29;
        }
        return this.field5733;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;")
    public final Buffer method2338(boolean arg0, boolean arg1) {
        if (this.field5731 == null) {
            return null;
        }
        if (arg1) {
            this.method2337(-109);
        }
        boolean var3 = arg0 & this.field5730;
        if (!this.field5735 && class509.method2977(this.field5731.Lock(0, this.field5732, var3 ? 8192 : 0, this.field5729.field6674), 17527)) {
            this.field5735 = true;
            return this.field5729.field6674;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)Z")
    public final boolean method2337(int arg0) {
        if (arg0 != 6544) {
            this.method2339(53, -124, -128);
        }
        if (this.field5735 && class509.method2977(this.field5731.Unlock(), 17527)) {
            this.field5735 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)I")
    public final int method84(int arg0) {
        return arg0 >= -80 ? 100 : this.field5734;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(III)Z")
    public final boolean method2339(int arg0, int arg1, int arg2) {
        this.field5734 = arg0;
        this.field5733 = (byte) arg2;
        if (arg1 != -32754) {
            return false;
        }
        if (this.field5734 > this.field5732) {
            int var4 = 8;
            byte var5;
            if (this.field5730) {
                var4 |= 0x200;
                var5 = 0;
            } else {
                var5 = 1;
            }
            if (this.field5731 != null) {
                this.field5731.method3820(true);
            }
            this.field5731 = this.field5729.field6676.method2961(this.field5734, var4, 0, var5, this.field5731);
            this.field5732 = this.field5734;
        }
        return this.field5731 != null;
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Luda;Z)V")
    public class402(class475 arg0, boolean arg1) {
        this.field5730 = arg1;
        this.field5729 = arg0;
    }
}
