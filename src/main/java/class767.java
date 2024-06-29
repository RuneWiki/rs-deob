import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class508;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class767 implements class421 {

    @OriginalMember(owner = "client!au", name = "d", descriptor = "Z")
    private boolean field11082 = false;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "Lpj;")
    private class157 field11084;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "Z")
    private boolean field11086;

    @OriginalMember(owner = "client!au", name = "f", descriptor = "Lsd;")
    private class103 field11088;

    @OriginalMember(owner = "client!au", name = "g", descriptor = "I")
    private int field11085;

    @OriginalMember(owner = "client!au", name = "e", descriptor = "I")
    private int field11087;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field11083;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)I", line = 4)
    public final int method25(int arg0) {
        if (arg0 != -12502) {
            this.field11084 = null;
        }
        return this.field11085;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;", line = 17)
    public final Buffer method3256(boolean arg0, byte arg1) {
        if (this.field11083 == null) {
            return null;
        }
        boolean var3 = arg0 & this.field11086;
        if (arg1 >= -88) {
            this.field11082 = false;
        }
        if (!this.field11082 && class508.method3822(this.field11083.Lock(0, this.field11087, var3 ? 8192 : 0, this.field11088.field1153), true)) {
            this.field11082 = true;
            return this.field11088.field1153;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lsd;Lpj;Z)V", line = 104)
    public class767(class103 arg0, class157 arg1, boolean arg2) {
        this.field11084 = arg1;
        this.field11086 = arg2;
        this.field11088 = arg0;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(I)Lpj;", line = 40)
    public final class157 method3258(int arg0) {
        if (arg0 != -31745) {
            this.field11087 = 88;
        }
        return this.field11084;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(II)V", line = 51)
    public final void method24(int arg0, int arg1) {
        if (arg1 != -10749) {
            this.field11084 = null;
        }
        this.field11085 = this.field11084.field1946 * arg0;
        if (this.field11087 >= this.field11085) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field11086) {
            var4 = 0;
            var3 |= 0x200;
        } else {
            var4 = 1;
        }
        if (this.field11083 != null) {
            this.field11083.method5121(-82);
        }
        this.field11083 = this.field11088.field1151.method3833(this.field11085, var3, class157.field1953 == this.field11084 ? 101 : 102, var4, this.field11083);
        this.field11087 = this.field11085;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Z)V", line = 86)
    public final void method20(boolean arg0) {
        if (this.field11083 != null) {
            this.field11083.method5121(111);
            this.field11083 = null;
        }
        this.field11087 = 0;
        this.field11085 = 0;
        if (!arg0) {
            this.field11082 = true;
        }
    }

    @OriginalMember(owner = "client!au", name = "c", descriptor = "(I)Z", line = 115)
    public final boolean method3257(int arg0) {
        if (arg0 != -3841) {
            return false;
        } else if (this.field11082 && class508.method3822(this.field11083.Unlock(), true)) {
            this.field11082 = false;
            return true;
        } else {
            return false;
        }
    }
}
