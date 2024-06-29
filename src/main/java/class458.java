import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class483;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class458 implements class562 {

    @OriginalMember(owner = "client!iga", name = "e", descriptor = "Z")
    private boolean field6340 = false;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "Lkq;")
    private class594 field6336;

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "Lbea;")
    private class225 field6338;

    @OriginalMember(owner = "client!iga", name = "d", descriptor = "Z")
    private boolean field6339;

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "I")
    private int field6337;

    @OriginalMember(owner = "client!iga", name = "f", descriptor = "I")
    private int field6341;

    @OriginalMember(owner = "client!iga", name = "g", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field6342;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;", line = 4)
    public final Buffer method179(boolean arg0, int arg1) {
        if (this.field6342 == null) {
            return null;
        }
        boolean var3 = arg0 & this.field6339;
        if (!this.field6340 && class483.method2718(-21593, this.field6342.Lock(0, this.field6337, var3 ? 8192 : 0, this.field6338.field2906))) {
            this.field6340 = true;
            return this.field6338.field2906;
        } else {
            if (arg1 > -79) {
                this.field6341 = -35;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(I)I", line = 24)
    public final int method177(int arg0) {
        return arg0 == 200 ? this.field6341 : -80;
    }

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "(I)Lkq;", line = 34)
    public final class594 method181(int arg0) {
        if (arg0 != -15448) {
            this.method177(-126);
        }
        return this.field6336;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(Z)V", line = 44)
    public final void method176(boolean arg0) {
        if (arg0) {
            this.method177(71);
        }
        if (this.field6342 != null) {
            this.field6342.method3801(31);
            this.field6342 = null;
        }
        this.field6337 = 0;
        this.field6341 = 0;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(B)Z", line = 63)
    public final boolean method178(byte arg0) {
        int var2 = -29 / ((-arg0 - 46) / 32);
        if (this.field6340 && class483.method2718(-21593, this.field6342.Unlock())) {
            this.field6340 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(II)V", line = 84)
    public final void method180(int arg0, int arg1) {
        this.field6341 = this.field6336.field8274 * arg0;
        if (this.field6341 > this.field6337) {
            int var3 = 8;
            byte var4;
            if (this.field6339) {
                var4 = 0;
                var3 |= 0x200;
            } else {
                var4 = 1;
            }
            if (this.field6342 != null) {
                this.field6342.method3801(arg1 - 20747);
            }
            this.field6342 = this.field6338.field2918.method2729(this.field6341, var3, class594.field8278 == this.field6336 ? 101 : 102, var4, this.field6342);
            this.field6337 = this.field6341;
        }
        if (arg1 != 20779) {
            this.method179(true, 102);
        }
    }

    @OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(Lbea;Lkq;Z)V", line = 124)
    public class458(class225 arg0, class594 arg1, boolean arg2) {
        this.field6336 = arg1;
        this.field6338 = arg0;
        this.field6339 = arg2;
    }
}
