import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class510;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class266 implements class438 {

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "Z")
    private boolean field3748 = false;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "Laia;")
    private class242 field3744;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "Z")
    private boolean field3747;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "B")
    private byte field3746;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    private int field3743;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    private int field3745;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field3742;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BII)Z", line = 5)
    public final boolean method1736(byte arg0, int arg1, int arg2) {
        this.field3745 = arg1;
        this.field3746 = (byte) arg2;
        if (arg0 <= 74) {
            this.method1638((byte) 41);
        }
        if (this.field3745 > this.field3743) {
            int var4 = 8;
            byte var5;
            if (this.field3747) {
                var5 = 0;
                var4 |= 0x200;
            } else {
                var5 = 1;
            }
            if (this.field3742 != null) {
                this.field3742.method3925(-6517);
            }
            this.field3742 = this.field3744.field3462.method2914(this.field3745, var4, 0, var5, this.field3742);
            this.field3743 = this.field3745;
        }
        return this.field3742 != null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V", line = 43)
    public final void method1543(int arg0) {
        if (arg0 != -21647) {
            this.method1740(34);
        }
        if (this.field3742 != null) {
            this.field3742.method3925(-6517);
            this.field3742 = null;
        }
        this.field3743 = 0;
        this.field3745 = 0;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)Z", line = 63)
    public final boolean method1737(byte arg0) {
        if (this.field3748 && class510.method2912(this.field3742.Unlock(), -105)) {
            this.field3748 = false;
            return true;
        } else {
            if (arg0 >= -68) {
                this.method1738(82, null, -121, -70);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)I", line = 84)
    public final int method1638(byte arg0) {
        int var2 = -79 % ((14 - arg0) / 43);
        return this.field3745;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILjaclib/memory/Source;II)Z", line = 95)
    public final boolean method1738(int arg0, Source arg1, int arg2, int arg3) {
        if (arg0 != 21990) {
            this.method1738(-86, null, -46, -120);
        }
        return this.method1736((byte) 77, arg3, arg2) ? this.field3742.method2937(arg1, 0, 0, this.field3745, this.field3747 ? 8192 : 0) : false;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Laia;Z)V", line = 114)
    public class266(class242 arg0, boolean arg1) {
        this.field3744 = arg0;
        this.field3747 = arg1;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;", line = 124)
    public final Buffer method1739(boolean arg0, int arg1) {
        if (this.field3742 == null) {
            return null;
        } else if (arg1 <= 37) {
            return (Buffer) null;
        } else {
            boolean var3 = arg0 & this.field3747;
            if (!this.field3748 && class510.method2912(this.field3742.Lock(0, this.field3743, var3 ? 8192 : 0, this.field3744.field3446), -51)) {
                this.field3748 = true;
                return this.field3744.field3446;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)I", line = 146)
    public final int method1740(int arg0) {
        if (arg0 != 32606) {
            this.method1543(18);
        }
        return this.field3746;
    }
}
