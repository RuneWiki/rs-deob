import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class447;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class241 implements class601 {

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "Z")
    private boolean field3813 = false;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "Lto;")
    private class8 field3809;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "Z")
    private boolean field3815;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "B")
    private byte field3812;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    private int field3810;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    private int field3811;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field3814;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)Z", line = 5)
    public final boolean method1722(int arg0) {
        if (arg0 != -23181) {
            this.field3811 = 10;
        }
        if (this.field3813 && class447.method2814(this.field3814.Unlock(), 141953135)) {
            this.field3813 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;", line = 29)
    public final Buffer method1726(boolean arg0, boolean arg1) {
        if (this.field3814 == null) {
            return null;
        }
        boolean var3 = arg0 & this.field3815;
        if (!arg1) {
            this.method1722(-86);
        }
        if (!this.field3813 && class447.method2814(this.field3814.Lock(0, this.field3811, var3 ? 8192 : 0, this.field3809.field136), 141953135)) {
            this.field3813 = true;
            return this.field3809.field136;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)I", line = 50)
    public final int method429(int arg0) {
        if (arg0 != 34962) {
            this.method429(89);
        }
        return this.field3810;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BII)Z", line = 62)
    public final boolean method1725(byte arg0, int arg1, int arg2) {
        this.field3810 = arg1;
        this.field3812 = (byte) arg2;
        if (this.field3810 > this.field3811) {
            int var4 = 8;
            byte var5;
            if (this.field3815) {
                var4 |= 0x200;
                var5 = 0;
            } else {
                var5 = 1;
            }
            if (this.field3814 != null) {
                this.field3814.method3643(false);
            }
            this.field3814 = this.field3809.field131.method2820(this.field3810, var4, 0, var5, this.field3814);
            this.field3811 = this.field3810;
        }
        int var6 = 75 / ((arg0 + 23) / 62);
        return this.field3814 != null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 97)
    public final void method431(int arg0) {
        if (this.field3814 != null) {
            this.field3814.method3643(false);
            this.field3814 = null;
        }
        if (arg0 != -5517) {
            this.method431(10);
        }
        this.field3811 = 0;
        this.field3810 = 0;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lto;Z)V", line = 142)
    public class241(class8 arg0, boolean arg1) {
        this.field3809 = arg0;
        this.field3815 = arg1;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljaclib/memory/Source;III)Z", line = 118)
    public final boolean method1723(Source arg0, int arg1, int arg2, int arg3) {
        if (this.method1725((byte) 124, arg3, arg2)) {
            return this.field3814.method2838(arg0, 0, 0, this.field3810, this.field3815 ? 8192 : 0);
        } else if (arg1 == 18869) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)I", line = 134)
    public final int method1731(int arg0) {
        if (arg0 != -29095) {
            this.method429(62);
        }
        return this.field3812;
    }
}
