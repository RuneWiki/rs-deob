import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class509;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class29 implements class129 {

    @OriginalMember(owner = "client!qaa", name = "d", descriptor = "Z")
    private boolean field440 = false;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "Lus;")
    private class1 field437;

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "Z")
    private boolean field439;

    @OriginalMember(owner = "client!qaa", name = "e", descriptor = "B")
    private byte field441;

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "I")
    private int field438;

    @OriginalMember(owner = "client!qaa", name = "g", descriptor = "I")
    private int field443;

    @OriginalMember(owner = "client!qaa", name = "f", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field442;

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "(B)I", line = 4)
    public final int method270(byte arg0) {
        if (arg0 < 33) {
            this.method273(111, (byte) 88, -13);
        }
        return this.field441;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;", line = 14)
    public final Buffer method271(boolean arg0, byte arg1) {
        if (this.field442 == null) {
            return null;
        }
        boolean var3 = arg0 & this.field439;
        if (!this.field440 && class509.method3048(-1, this.field442.Lock(0, this.field438, var3 ? 8192 : 0, this.field437.field12))) {
            this.field440 = true;
            return this.field437.field12;
        } else {
            int var4 = 111 / ((arg1 + 66) / 48);
            return null;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Ljaclib/memory/Source;IBI)Z", line = 33)
    public final boolean method272(Source arg0, int arg1, byte arg2, int arg3) {
        if (arg2 == 34) {
            return this.method273(arg1, (byte) 125, arg3) ? this.field442.method3073(arg0, 0, 0, this.field443, this.field439 ? 8192 : 0) : false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IBI)Z", line = 50)
    public final boolean method273(int arg0, byte arg1, int arg2) {
        this.field441 = (byte) arg2;
        this.field443 = arg0;
        if (arg1 != 125) {
            this.field443 = 0;
        }
        if (this.field438 < this.field443) {
            int var4 = 8;
            byte var5;
            if (this.field439) {
                var4 |= 0x200;
                var5 = 0;
            } else {
                var5 = 1;
            }
            if (this.field442 != null) {
                this.field442.method4003(true);
            }
            this.field442 = this.field437.field27.method3060(this.field443, var4, 0, var5, this.field442);
            this.field438 = this.field443;
        }
        return this.field442 != null;
    }

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "(B)V", line = 87)
    public final void method274(byte arg0) {
        if (this.field442 != null) {
            this.field442.method4003(true);
            this.field442 = null;
        }
        this.field438 = 0;
        this.field443 = 0;
        int var2 = -19 % ((-arg0 - 40) / 36);
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)Z", line = 106)
    public final boolean method275(int arg0) {
        if (this.field440 && class509.method3048(-1, this.field442.Unlock())) {
            this.field440 = false;
            return true;
        } else {
            if (arg0 != 22022) {
                this.field439 = false;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Lus;Z)V", line = 133)
    public class29(class1 arg0, boolean arg1) {
        this.field437 = arg0;
        this.field439 = arg1;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(B)I", line = 144)
    public final int method276(byte arg0) {
        int var2 = 28 % ((87 - arg0) / 35);
        return this.field443;
    }
}
