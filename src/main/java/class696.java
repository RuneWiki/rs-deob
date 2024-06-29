import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class482;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class696 implements class161 {

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "Z")
    private boolean field9583 = false;

    @OriginalMember(owner = "client!sea", name = "c", descriptor = "Ltg;")
    private class229 field9585;

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "Z")
    private boolean field9584;

    @OriginalMember(owner = "client!sea", name = "f", descriptor = "B")
    private byte field9588;

    @OriginalMember(owner = "client!sea", name = "e", descriptor = "I")
    private int field9587;

    @OriginalMember(owner = "client!sea", name = "g", descriptor = "I")
    private int field9589;

    @OriginalMember(owner = "client!sea", name = "d", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field9586;

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(I)Z")
    public final boolean method1060(int arg0) {
        if (arg0 != -17151) {
            return true;
        } else if (this.field9583 && class482.method2873(-74, this.field9586.Unlock())) {
            this.field9583 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Z)I")
    public final int method1564(boolean arg0) {
        return arg0 ? this.field9587 : -105;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)V")
    public final void method1059(int arg0) {
        if (this.field9586 != null) {
            this.field9586.method3677(arg0 + 2174);
            this.field9586 = null;
        }
        if (arg0 == 5342) {
            this.field9587 = 0;
            this.field9589 = 0;
        }
    }

    @OriginalMember(owner = "client!sea", name = "c", descriptor = "(I)I")
    public final int method3921(int arg0) {
        return arg0 == -1611 ? this.field9588 : 65;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Ljaclib/memory/Source;BII)Z")
    public final boolean method1062(Source arg0, byte arg1, int arg2, int arg3) {
        int var5 = 94 / ((arg1 - 22) / 49);
        return this.method1061(-128, arg3, arg2) ? this.field9586.method2903(arg0, 0, 0, this.field9587, this.field9584 ? 8192 : 0) : false;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(III)Z")
    public final boolean method1061(int arg0, int arg1, int arg2) {
        this.field9588 = (byte) arg1;
        int var4 = 35 % ((arg0 + 67) / 56);
        this.field9587 = arg2;
        if (this.field9589 < this.field9587) {
            int var5 = 8;
            byte var6;
            if (this.field9584) {
                var5 |= 0x200;
                var6 = 0;
            } else {
                var6 = 1;
            }
            if (this.field9586 != null) {
                this.field9586.method3677(7516);
            }
            this.field9586 = this.field9585.field3093.method2897(this.field9587, var5, 0, var6, this.field9586);
            this.field9589 = this.field9587;
        }
        return this.field9586 != null;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    public final Buffer method1063(int arg0, boolean arg1) {
        if (this.field9586 == null) {
            return null;
        }
        boolean var3 = arg1 & this.field9584;
        if (arg0 != -5419) {
            this.method1059(73);
        }
        if (!this.field9583 && class482.method2873(-105, this.field9586.Lock(0, this.field9589, var3 ? 8192 : 0, this.field9585.field3077))) {
            this.field9583 = true;
            return this.field9585.field3077;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Ltg;Z)V")
    public class696(class229 arg0, boolean arg1) {
        this.field9585 = arg0;
        this.field9584 = arg1;
    }
}
