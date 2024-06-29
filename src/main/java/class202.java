import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class483;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class202 implements class163 {

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "Z")
    private boolean field2925 = false;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Lbfa;")
    private class370 field2920;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Z")
    private boolean field2924;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Lbaa;")
    private class523 field2923;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    private int field2921;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    private int field2926;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field2922;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)Lbaa;")
    public final class523 method1242(byte arg0) {
        if (arg0 <= 19) {
            this.field2923 = null;
        }
        return this.field2923;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)Z")
    public final boolean method1239(int arg0) {
        if (arg0 != -23) {
            this.field2921 = 118;
        }
        if (this.field2925 && class483.method2836(this.field2922.Unlock(), false)) {
            this.field2925 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V")
    public final void method1240(int arg0, int arg1) {
        if (arg0 != 15959) {
            this.field2921 = -78;
        }
        this.field2921 = this.field2923.field7244 * arg1;
        if (this.field2926 >= this.field2921) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field2924) {
            var3 |= 0x200;
            var4 = 0;
        } else {
            var4 = 1;
        }
        if (this.field2922 != null) {
            this.field2922.method3799(9275);
        }
        this.field2922 = this.field2920.field5282.method2849(this.field2921, var3, class523.field7250 == this.field2923 ? 101 : 102, var4, this.field2922);
        this.field2926 = this.field2921;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;")
    public final Buffer method1241(boolean arg0, boolean arg1) {
        if (this.field2922 == null) {
            return null;
        }
        if (arg1) {
            this.method1240(-111, 54);
        }
        boolean var3 = arg0 & this.field2924;
        if (!this.field2925 && class483.method2836(this.field2922.Lock(0, this.field2926, var3 ? 8192 : 0, this.field2920.field5283), false)) {
            this.field2925 = true;
            return this.field2920.field5283;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)I")
    public final int method877(boolean arg0) {
        if (arg0) {
            this.method1242((byte) 116);
        }
        return this.field2921;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
    public final void method878(int arg0) {
        if (this.field2922 != null) {
            this.field2922.method3799(9275);
            this.field2922 = null;
        }
        if (arg0 != 23315) {
            this.method1240(65, -35);
        }
        this.field2926 = 0;
        this.field2921 = 0;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lbfa;Lbaa;Z)V")
    public class202(class370 arg0, class523 arg1, boolean arg2) {
        this.field2920 = arg0;
        this.field2924 = arg2;
        this.field2923 = arg1;
    }
}
