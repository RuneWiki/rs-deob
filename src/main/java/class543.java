import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class447;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class543 implements class679 {

    @OriginalMember(owner = "client!nw", name = "d", descriptor = "Z")
    private boolean field7906 = false;

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "Lto;")
    private class8 field7904;

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "Lmg;")
    private class134 field7905;

    @OriginalMember(owner = "client!nw", name = "e", descriptor = "Z")
    private boolean field7907;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "I")
    private int field7903;

    @OriginalMember(owner = "client!nw", name = "f", descriptor = "I")
    private int field7908;

    @OriginalMember(owner = "client!nw", name = "g", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field7909;

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "(I)Z")
    public final boolean method425(int arg0) {
        if (this.field7906 && class447.method2814(this.field7909.Unlock(), arg0 ^ 0x87670DC)) {
            this.field7906 = false;
            return true;
        } else {
            if (arg0 != 30899) {
                this.method425(-5);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    public final Buffer method430(boolean arg0, byte arg1) {
        if (this.field7909 == null) {
            return null;
        }
        if (arg1 != -107) {
            this.field7905 = null;
        }
        boolean var3 = arg0 & this.field7907;
        if (!this.field7906 && class447.method2814(this.field7909.Lock(0, this.field7903, var3 ? 8192 : 0, this.field7904.field136), arg1 ^ 0xF789F7FA)) {
            this.field7906 = true;
            return this.field7904.field136;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)V")
    public final void method431(int arg0) {
        if (this.field7909 != null) {
            this.field7909.method3643(false);
            this.field7909 = null;
        }
        this.field7903 = 0;
        this.field7908 = 0;
        if (arg0 != -5517) {
            this.method430(false, (byte) -120);
        }
    }

    @OriginalMember(owner = "client!nw", name = "d", descriptor = "(I)I")
    public final int method429(int arg0) {
        if (arg0 != 34962) {
            this.method425(-43);
        }
        return this.field7908;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(BI)V")
    public final void method424(byte arg0, int arg1) {
        if (arg0 > -66) {
            return;
        }
        this.field7908 = this.field7905.field2196 * arg1;
        if (this.field7908 <= this.field7903) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field7907) {
            var3 |= 0x200;
            var4 = 0;
        } else {
            var4 = 1;
        }
        if (this.field7909 != null) {
            this.field7909.method3643(false);
        }
        this.field7909 = this.field7904.field131.method2815(this.field7908, var3, class134.field2198 == this.field7905 ? 101 : 102, var4, this.field7909);
        this.field7903 = this.field7908;
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(I)Lmg;")
    public final class134 method427(int arg0) {
        if (arg0 != 31337) {
            this.field7905 = null;
        }
        return this.field7905;
    }

    @OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lto;Lmg;Z)V")
    public class543(class8 arg0, class134 arg1, boolean arg2) {
        this.field7904 = arg0;
        this.field7905 = arg1;
        this.field7907 = arg2;
    }
}
