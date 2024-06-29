import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class451;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class187 implements class595 {

    @OriginalMember(owner = "client!tw", name = "e", descriptor = "Z")
    private boolean field3004 = false;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "Lhg;")
    private class644 field3000;

    @OriginalMember(owner = "client!tw", name = "f", descriptor = "Z")
    private boolean field3005;

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "Lro;")
    private class2 field3003;

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "I")
    private int field3001;

    @OriginalMember(owner = "client!tw", name = "g", descriptor = "I")
    private int field3006;

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field3002;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IB)V")
    public final void method380(int arg0, byte arg1) {
        if (arg1 != -17) {
            this.method1188(true, false);
        }
        this.field3001 = this.field3003.field367 * arg0;
        if (this.field3006 >= this.field3001) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field3005) {
            var4 = 0;
            var3 |= 0x200;
        } else {
            var4 = 1;
        }
        if (this.field3002 != null) {
            this.field3002.method3595((byte) -67);
        }
        this.field3002 = this.field3000.field9267.method2710(this.field3001, var3, class2.field373 == this.field3003 ? 101 : 102, var4, this.field3002);
        this.field3006 = this.field3001;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(B)V")
    public final void method382(byte arg0) {
        if (this.field3002 != null) {
            this.field3002.method3595((byte) -67);
            this.field3002 = null;
        }
        this.field3006 = 0;
        this.field3001 = 0;
        if (arg0 <= 63) {
            this.method1187((byte) 115);
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)I")
    public final int method386(int arg0) {
        if (arg0 != 0) {
            this.method1185(false);
        }
        return this.field3001;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(Z)Z")
    public final boolean method1185(boolean arg0) {
        if (this.field3004 && class451.method2727(this.field3002.Unlock(), 3102)) {
            this.field3004 = false;
            return true;
        } else {
            return !arg0;
        }
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(B)Lro;")
    public final class2 method1187(byte arg0) {
        if (arg0 != 36) {
            this.method382((byte) -23);
        }
        return this.field3003;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;")
    public final Buffer method1188(boolean arg0, boolean arg1) {
        if (this.field3002 == null) {
            return null;
        }
        boolean var3 = arg1 & this.field3005;
        if (!this.field3004 && class451.method2727(this.field3002.Lock(0, this.field3006, var3 ? 8192 : 0, this.field3000.field9256), 3102)) {
            this.field3004 = true;
            return this.field3000.field9256;
        } else {
            if (arg0) {
                this.field3001 = 96;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lhg;Lro;Z)V")
    public class187(class644 arg0, class2 arg1, boolean arg2) {
        this.field3000 = arg0;
        this.field3005 = arg2;
        this.field3003 = arg1;
    }
}
