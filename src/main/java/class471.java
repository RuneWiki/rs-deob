import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class757;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class471 implements class601 {

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "Z")
    private boolean field6420 = false;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "Llj;")
    private class8 field6415;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "Z")
    private boolean field6414;

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "B")
    private byte field6418;

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
    private int field6417;

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "I")
    private int field6419;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field6416;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V", line = 4)
    public final void method32(int arg0) {
        if (this.field6416 != null) {
            this.field6416.method2234(arg0 ^ 0xFFFFAD47);
            this.field6416 = null;
        }
        if (arg0 != 16479) {
            this.field6419 = -11;
        }
        this.field6419 = 0;
        this.field6417 = 0;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)Z", line = 24)
    public final boolean method36(int arg0) {
        if (this.field6420 && class757.method4191(-2005530600, this.field6416.Unlock())) {
            this.field6420 = false;
            return true;
        } else {
            if (arg0 != 6740) {
                this.method38((byte) 14, 22, null, 67);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(B)I", line = 45)
    public final int method2754(byte arg0) {
        return arg0 == 96 ? this.field6418 : -48;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)I", line = 56)
    public final int method35(byte arg0) {
        return arg0 <= 71 ? -102 : this.field6419;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(BILjaclib/memory/Source;I)Z", line = 69)
    public final boolean method38(byte arg0, int arg1, Source arg2, int arg3) {
        if (arg0 <= 93) {
            return false;
        } else if (this.method41(arg3, (byte) -117, arg1)) {
            return this.field6416.method4166(arg2, 0, 0, this.field6419, this.field6414 ? 8192 : 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IBI)Z", line = 86)
    public final boolean method41(int arg0, byte arg1, int arg2) {
        this.field6418 = (byte) arg2;
        this.field6419 = arg0;
        int var4 = -37 / ((arg1 + 54) / 53);
        if (this.field6417 < this.field6419) {
            int var5 = 8;
            byte var6;
            if (this.field6414) {
                var5 |= 0x200;
                var6 = 0;
            } else {
                var6 = 1;
            }
            if (this.field6416 != null) {
                this.field6416.method2234(-4840);
            }
            this.field6416 = this.field6415.field100.method4178(this.field6419, var5, 0, var6, this.field6416);
            this.field6417 = this.field6419;
        }
        return this.field6416 != null;
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Llj;Z)V", line = 145)
    public class471(class8 arg0, boolean arg1) {
        this.field6415 = arg0;
        this.field6414 = arg1;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;", line = 126)
    public final Buffer method39(boolean arg0, int arg1) {
        if (this.field6416 == null) {
            return null;
        }
        boolean var3 = arg0 & this.field6414;
        if (arg1 < 27) {
            this.field6416 = null;
        }
        if (!this.field6420 && class757.method4191(-2005530600, this.field6416.Lock(0, this.field6417, var3 ? 8192 : 0, this.field6415.field118))) {
            this.field6420 = true;
            return this.field6415.field118;
        } else {
            return null;
        }
    }
}
