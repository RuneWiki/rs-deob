import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class481;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class530 implements class545 {

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Z")
    private boolean field7541 = false;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Z")
    private boolean field7538;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "Lhl;")
    private class527 field7536;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "B")
    private byte field7539;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    private int field7535;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    private int field7537;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field7540;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljaclib/memory/Source;BII)Z")
    public final boolean method3106(Source arg0, byte arg1, int arg2, int arg3) {
        int var5 = -94 % ((arg1 - 87) / 36);
        return this.method3110(2501, arg2, arg3) ? this.field7540.method2921(arg0, 0, 0, this.field7537, this.field7538 ? 8192 : 0) : false;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
    public final void method262(boolean arg0) {
        if (this.field7540 != null) {
            this.field7540.method3834(-31315);
            this.field7540 = null;
        }
        if (!arg0) {
            this.field7539 = 104;
        }
        this.field7535 = 0;
        this.field7537 = 0;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)Z")
    public final boolean method3107(byte arg0) {
        if (this.field7541 && class481.method2896(this.field7540.Unlock(), 2005530520)) {
            this.field7541 = false;
            return true;
        } else {
            return arg0 < 71;
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)I")
    public final int method3108(byte arg0) {
        if (arg0 != -128) {
            this.method265(true);
        }
        return this.field7539;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    public final Buffer method3109(boolean arg0, int arg1) {
        if (this.field7540 == null) {
            return null;
        }
        boolean var3 = arg0 & this.field7538;
        if (arg1 != -22228) {
            this.method265(false);
        }
        if (!this.field7541 && class481.method2896(this.field7540.Lock(0, this.field7535, var3 ? 8192 : 0, this.field7536.field7510), 2005530520)) {
            this.field7541 = true;
            return this.field7536.field7510;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)Z")
    public final boolean method3110(int arg0, int arg1, int arg2) {
        this.field7537 = arg2;
        this.field7539 = (byte) arg1;
        if (arg0 != 2501) {
            this.field7540 = null;
        }
        if (this.field7537 > this.field7535) {
            int var4 = 8;
            byte var5;
            if (this.field7538) {
                var4 |= 0x200;
                var5 = 0;
            } else {
                var5 = 1;
            }
            if (this.field7540 != null) {
                this.field7540.method3834(-31315);
            }
            this.field7540 = this.field7536.field7501.method2903(this.field7537, var4, 0, var5, this.field7540);
            this.field7535 = this.field7537;
        }
        return this.field7540 != null;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(Z)I")
    public final int method265(boolean arg0) {
        if (!arg0) {
            this.field7540 = null;
        }
        return this.field7537;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lhl;Z)V")
    public class530(class527 arg0, boolean arg1) {
        this.field7538 = arg1;
        this.field7536 = arg0;
    }
}
