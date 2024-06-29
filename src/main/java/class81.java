import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class398;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class81 implements class512 {

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "Z")
    private boolean field927 = false;

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "Llc;")
    private class629 field929;

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "Lnca;")
    private class54 field928;

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "Z")
    private boolean field931;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "I")
    private int field925;

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
    private int field926;

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field930;

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)I")
    public final int method404(int arg0) {
        if (arg0 != -4469) {
            this.method409(false);
        }
        return this.field926;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZI)V")
    public final void method464(boolean arg0, int arg1) {
        this.field926 = this.field929.field9202 * arg1;
        if (!arg0) {
            this.field929 = null;
        }
        if (this.field926 <= this.field925) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field931) {
            var3 |= 0x200;
            var4 = 0;
        } else {
            var4 = 1;
        }
        if (this.field930 != null) {
            this.field930.method3340((byte) -27);
        }
        this.field930 = this.field928.field676.method2399(this.field926, var3, class629.field9209 == this.field929 ? 101 : 102, var4, this.field930);
        this.field925 = this.field926;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    public final Buffer method410(boolean arg0, byte arg1) {
        if (arg1 != -56) {
            this.field929 = null;
        }
        boolean var3 = arg0 & this.field931;
        if (!this.field927 && class398.method2384(7155, this.field930.Lock(0, this.field925, var3 ? 8192 : 0, this.field928.field666))) {
            this.field927 = true;
            return this.field928.field666;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)Llc;")
    public final class629 method465(byte arg0) {
        if (arg0 != -62) {
            this.field930 = null;
        }
        return this.field929;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)Z")
    public final boolean method411(int arg0) {
        if (this.field927 && class398.method2384(7155, this.field930.Unlock())) {
            this.field927 = false;
            return true;
        } else {
            int var2 = -83 % ((arg0 - 39) / 62);
            return false;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)V")
    public final void method409(boolean arg0) {
        if (this.field930 != null) {
            this.field930.method3340((byte) -27);
            this.field930 = null;
        }
        if (arg0) {
            this.field925 = -95;
        }
        this.field926 = 0;
        this.field925 = 0;
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lnca;Llc;Z)V")
    public class81(class54 arg0, class629 arg1, boolean arg2) {
        this.field929 = arg1;
        this.field928 = arg0;
        this.field931 = arg2;
    }
}
