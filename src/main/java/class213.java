import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class485;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class213 implements class497 {

    @OriginalMember(owner = "client!su", name = "f", descriptor = "Z")
    private boolean field2815 = false;

    @OriginalMember(owner = "client!su", name = "d", descriptor = "Lul;")
    private class574 field2813;

    @OriginalMember(owner = "client!su", name = "e", descriptor = "Z")
    private boolean field2814;

    @OriginalMember(owner = "client!su", name = "g", descriptor = "Lwha;")
    private class285 field2816;

    @OriginalMember(owner = "client!su", name = "b", descriptor = "I")
    private int field2811;

    @OriginalMember(owner = "client!su", name = "c", descriptor = "I")
    private int field2812;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field2810;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
    public final void method294(byte arg0) {
        if (this.field2810 != null) {
            this.field2810.method3809((byte) -36);
            this.field2810 = null;
        }
        this.field2812 = 0;
        this.field2811 = 0;
        if (arg0 != 44) {
            this.field2813 = null;
        }
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(I)I")
    public final int method297(int arg0) {
        if (arg0 != 2) {
            this.field2812 = 55;
        }
        return this.field2811;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Z)Z")
    public final boolean method1368(boolean arg0) {
        if (this.field2815 && class485.method2865(this.field2810.Unlock(), 25499)) {
            this.field2815 = false;
            return true;
        } else {
            if (!arg0) {
                this.method1008(59, -92);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    public final Buffer method1369(int arg0, boolean arg1) {
        if (this.field2810 == null) {
            return null;
        }
        boolean var3 = arg1 & this.field2814;
        if (arg0 != -25053) {
            this.field2810 = null;
        }
        if (!this.field2815 && class485.method2865(this.field2810.Lock(0, this.field2812, var3 ? 8192 : 0, this.field2813.field8079), 25499)) {
            this.field2815 = true;
            return this.field2813.field8079;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(B)Lwha;")
    public final class285 method1370(byte arg0) {
        int var2 = -32 % ((arg0 + 21) / 47);
        return this.field2816;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(II)V")
    public final void method1008(int arg0, int arg1) {
        this.field2811 = this.field2816.field3586 * arg0;
        if (this.field2812 < this.field2811) {
            int var3 = 8;
            byte var4;
            if (this.field2814) {
                var4 = 0;
                var3 |= 0x200;
            } else {
                var4 = 1;
            }
            if (this.field2810 != null) {
                this.field2810.method3809((byte) -36);
            }
            this.field2810 = this.field2813.field8080.method2878(this.field2811, var3, class285.field3590 == this.field2816 ? 101 : 102, var4, this.field2810);
            this.field2812 = this.field2811;
        }
        if (arg1 != 23833) {
            this.field2813 = null;
        }
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lul;Lwha;Z)V")
    public class213(class574 arg0, class285 arg1, boolean arg2) {
        this.field2813 = arg0;
        this.field2814 = arg2;
        this.field2816 = arg1;
    }
}
