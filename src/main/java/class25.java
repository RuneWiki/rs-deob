import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class508;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class25 implements class723 {

    @OriginalMember(owner = "client!an", name = "a", descriptor = "Z")
    private boolean field280 = false;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "Lsd;")
    private class103 field276;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "Z")
    private boolean field277;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "B")
    private byte field279;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    private int field275;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "I")
    private int field278;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field281;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(III)Z", line = 7)
    public final boolean method166(int arg0, int arg1, int arg2) {
        int var4 = -24 % ((75 - arg0) / 45);
        this.field278 = arg2;
        this.field279 = (byte) arg1;
        if (this.field278 > this.field275) {
            int var5 = 8;
            byte var6;
            if (this.field277) {
                var6 = 0;
                var5 |= 0x200;
            } else {
                var6 = 1;
            }
            if (this.field281 != null) {
                this.field281.method5121(115);
            }
            this.field281 = this.field276.field1151.method3828(this.field278, var5, 0, var6, this.field281);
            this.field275 = this.field278;
        }
        return this.field281 != null;
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(I)Z", line = 42)
    public final boolean method167(int arg0) {
        if (this.field280 && class508.method3822(this.field281.Unlock(), true)) {
            this.field280 = false;
            return true;
        } else {
            if (arg0 != -20743) {
                this.field280 = false;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(I)I", line = 65)
    public final int method168(int arg0) {
        int var2 = -115 % ((arg0 - 60) / 53);
        return this.field279;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)I", line = 73)
    public final int method25(int arg0) {
        if (arg0 != -12502) {
            this.method20(true);
        }
        return this.field278;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IILjaclib/memory/Source;I)Z", line = 84)
    public final boolean method169(int arg0, int arg1, Source arg2, int arg3) {
        int var5 = -118 / ((arg3 + 17) / 38);
        return this.method166(121, arg0, arg1) ? this.field281.method3851(arg2, 0, 0, this.field278, this.field277 ? 8192 : 0) : false;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)V", line = 103)
    public final void method20(boolean arg0) {
        if (!arg0) {
            return;
        }
        if (this.field281 != null) {
            this.field281.method5121(114);
            this.field281 = null;
        }
        this.field275 = 0;
        this.field278 = 0;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;", line = 122)
    public final Buffer method170(boolean arg0, boolean arg1) {
        if (this.field281 == null) {
            return null;
        }
        if (arg0) {
            this.method168(111);
        }
        boolean var3 = arg1 & this.field277;
        if (!this.field280 && class508.method3822(this.field281.Lock(0, this.field275, var3 ? 8192 : 0, this.field276.field1153), true)) {
            this.field280 = true;
            return this.field276.field1153;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lsd;Z)V", line = 146)
    public class25(class103 arg0, boolean arg1) {
        this.field276 = arg0;
        this.field277 = arg1;
    }
}
