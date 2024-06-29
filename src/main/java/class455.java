import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class396;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class455 implements class342 {

    @OriginalMember(owner = "client!iba", name = "g", descriptor = "Z")
    private boolean field6581 = false;

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "Lde;")
    private class15 field6576;

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "Z")
    private boolean field6578;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "B")
    private byte field6575;

    @OriginalMember(owner = "client!iba", name = "e", descriptor = "I")
    private int field6579;

    @OriginalMember(owner = "client!iba", name = "f", descriptor = "I")
    private int field6580;

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field6577;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIB)Z")
    public final boolean method1343(int arg0, int arg1, byte arg2) {
        if (arg2 != -118) {
            this.method249(-11);
        }
        this.field6575 = (byte) arg0;
        this.field6579 = arg1;
        if (this.field6580 < this.field6579) {
            int var4 = 8;
            byte var5;
            if (this.field6578) {
                var5 = 0;
                var4 |= 0x200;
            } else {
                var5 = 1;
            }
            if (this.field6577 != null) {
                this.field6577.method3258(70);
            }
            this.field6577 = this.field6576.field182.method2429(this.field6579, var4, 0, var5, this.field6577);
            this.field6580 = this.field6579;
        }
        return this.field6577 != null;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILjaclib/memory/Source;II)Z")
    public final boolean method1344(int arg0, Source arg1, int arg2, int arg3) {
        if (arg0 != -17817) {
            this.method245(-11);
        }
        return this.method1343(arg3, arg2, (byte) -118) ? this.field6577.method2415(arg1, 0, 0, this.field6579, this.field6578 ? 8192 : 0) : false;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)I")
    public final int method248(int arg0) {
        if (arg0 != -920) {
            this.field6575 = 66;
        }
        return this.field6579;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(B)I")
    public final int method2674(byte arg0) {
        if (arg0 < 95) {
            this.field6581 = false;
        }
        return this.field6575;
    }

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "(I)Z")
    public final boolean method245(int arg0) {
        if (this.field6581 && class396.method2412((byte) -44, this.field6577.Unlock())) {
            this.field6581 = false;
            return true;
        } else if (arg0 == -11359) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    public final Buffer method251(boolean arg0, byte arg1) {
        if (arg1 != 60) {
            return (Buffer) null;
        }
        boolean var3 = arg0 & this.field6578;
        if (!this.field6581 && class396.method2412((byte) -124, this.field6577.Lock(0, this.field6580, var3 ? 8192 : 0, this.field6576.field165))) {
            this.field6581 = true;
            return this.field6576.field165;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "(I)V")
    public final void method249(int arg0) {
        if (this.field6577 != null) {
            this.field6577.method3258(89);
            this.field6577 = null;
        }
        this.field6579 = 0;
        if (arg0 != 12416) {
            this.field6580 = -127;
        }
        this.field6580 = 0;
    }

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lde;Z)V")
    public class455(class15 arg0, boolean arg1) {
        this.field6576 = arg0;
        this.field6578 = arg1;
    }
}
