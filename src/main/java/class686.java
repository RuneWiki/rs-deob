import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class735;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class686 implements class436 {

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "Z")
    private boolean field9748 = false;

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "Lad;")
    private class173 field9749;

    @OriginalMember(owner = "client!oda", name = "f", descriptor = "Z")
    private boolean field9752;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "B")
    private byte field9747;

    @OriginalMember(owner = "client!oda", name = "d", descriptor = "I")
    private int field9750;

    @OriginalMember(owner = "client!oda", name = "e", descriptor = "I")
    private int field9751;

    @OriginalMember(owner = "client!oda", name = "g", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field9753;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(ILjaclib/memory/Source;II)Z")
    public final boolean method1102(int arg0, Source arg1, int arg2, int arg3) {
        if (this.method1101(-32376, arg3, arg0)) {
            return this.field9753.method4094(arg1, 0, 0, this.field9750, this.field9752 ? 8192 : 0);
        } else {
            if (arg2 > -28) {
                this.field9752 = false;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)V")
    public final void method175(int arg0) {
        if (this.field9753 != null) {
            this.field9753.method2583((byte) -118);
            this.field9753 = null;
        }
        this.field9750 = 0;
        int var2 = 54 / ((-arg0 - 17) / 40);
        this.field9751 = 0;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(III)Z")
    public final boolean method1101(int arg0, int arg1, int arg2) {
        this.field9747 = (byte) arg1;
        this.field9750 = arg2;
        if (arg0 != -32376) {
            this.method3895(97);
        }
        if (this.field9750 > this.field9751) {
            int var4 = 8;
            byte var5;
            if (this.field9752) {
                var5 = 0;
                var4 |= 0x200;
            } else {
                var5 = 1;
            }
            if (this.field9753 != null) {
                this.field9753.method2583((byte) -98);
            }
            this.field9753 = this.field9749.field2418.method4112(this.field9750, var4, 0, var5, this.field9753);
            this.field9751 = this.field9750;
        }
        return this.field9753 != null;
    }

    @OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(Lad;Z)V")
    public class686(class173 arg0, boolean arg1) {
        this.field9749 = arg0;
        this.field9752 = arg1;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Z)I")
    public final int method1105(boolean arg0) {
        return arg0 ? 23 : this.field9750;
    }

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(I)I")
    public final int method3895(int arg0) {
        if (arg0 != -20392) {
            this.field9747 = 34;
        }
        return this.field9747;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    public final Buffer method1103(byte arg0, boolean arg1) {
        if (this.field9753 == null) {
            return null;
        }
        boolean var3 = arg1 & this.field9752;
        if (arg0 != 73) {
            this.field9749 = null;
        }
        if (!this.field9748 && class735.method4119(arg0 ^ 0x88760825, this.field9753.Lock(0, this.field9751, var3 ? 8192 : 0, this.field9749.field2423))) {
            this.field9748 = true;
            return this.field9749.field2423;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(B)Z")
    public final boolean method1099(byte arg0) {
        if (this.field9748 && class735.method4119(-2005530516, this.field9753.Unlock())) {
            this.field9748 = false;
            return true;
        } else {
            if (arg0 >= -103) {
                this.field9751 = 31;
            }
            return false;
        }
    }
}
