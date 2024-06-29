import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class452;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class494 implements class448 {

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "Z")
    private boolean field6646 = false;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "Z")
    private boolean field6645;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "Lss;")
    private class401 field6649;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "B")
    private byte field6647;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    private int field6650;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    private int field6651;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field6648;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)I", line = 4)
    public final int method2752(int arg0) {
        if (arg0 <= 57) {
            this.field6646 = true;
        }
        return this.field6647;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;", line = 15)
    public final Buffer method27(byte arg0, boolean arg1) {
        if (this.field6648 == null) {
            return null;
        }
        boolean var3 = arg1 & this.field6645;
        if (arg0 != -64) {
            this.field6650 = -127;
        }
        if (!this.field6646 && class452.method2566(this.field6648.Lock(0, this.field6650, var3 ? 8192 : 0, this.field6649.field5337), (byte) -103)) {
            this.field6646 = true;
            return this.field6649.field5337;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)Z", line = 38)
    public final boolean method2520(int arg0, int arg1, int arg2) {
        if (arg0 != -5368) {
            this.field6647 = 7;
        }
        this.field6651 = arg2;
        this.field6647 = (byte) arg1;
        if (this.field6651 > this.field6650) {
            int var4 = 8;
            byte var5;
            if (this.field6645) {
                var5 = 0;
                var4 |= 0x200;
            } else {
                var5 = 1;
            }
            if (this.field6648 != null) {
                this.field6648.method3494(arg0 + 5277);
            }
            this.field6648 = this.field6649.field5342.method2568(this.field6651, var4, 0, var5, this.field6648);
            this.field6650 = this.field6651;
        }
        return this.field6648 != null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BIILjaclib/memory/Source;)Z", line = 72)
    public final boolean method2521(byte arg0, int arg1, int arg2, Source arg3) {
        if (this.method2520(arg0 - 5307, arg1, arg2)) {
            return this.field6648.method2588(arg3, 0, 0, this.field6651, this.field6645 ? 8192 : 0);
        } else {
            if (arg0 != -61) {
                this.field6650 = -22;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)I", line = 90)
    public final int method1656(int arg0) {
        if (arg0 != -15151) {
            this.method2752(-93);
        }
        return this.field6651;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lss;Z)V", line = 145)
    public class494(class401 arg0, boolean arg1) {
        this.field6645 = arg1;
        this.field6649 = arg0;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)Z", line = 103)
    public final boolean method28(int arg0) {
        if (arg0 != 11390) {
            this.method2521((byte) 83, 30, -7, null);
        }
        if (this.field6646 && class452.method2566(this.field6648.Unlock(), (byte) -91)) {
            this.field6646 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V", line = 127)
    public final void method24(byte arg0) {
        if (arg0 != -93) {
            this.method28(126);
        }
        if (this.field6648 != null) {
            this.field6648.method3494(-85);
            this.field6648 = null;
        }
        this.field6651 = 0;
        this.field6650 = 0;
    }
}
