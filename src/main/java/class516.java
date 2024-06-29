import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class737;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class516 implements class251 {

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Z")
    private boolean field7196 = false;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "Z")
    private boolean field7194;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Lrd;")
    private class549 field7199;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "B")
    private byte field7197;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    private int field7195;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    private int field7198;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field7193;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
    public final void method1398(boolean arg0) {
        if (this.field7193 != null) {
            this.field7193.method2573((byte) -115);
            this.field7193 = null;
        }
        this.field7198 = 0;
        if (arg0) {
            this.method1592(39);
        }
        this.field7195 = 0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    public final Buffer method1590(byte arg0, boolean arg1) {
        if (arg0 != 64) {
            this.field7199 = null;
        }
        if (this.field7193 == null) {
            return null;
        }
        boolean var3 = arg1 & this.field7194;
        if (!this.field7196 && class737.method4096(119, this.field7193.Lock(0, this.field7195, var3 ? 8192 : 0, this.field7199.field7759))) {
            this.field7196 = true;
            return this.field7199.field7759;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)Z")
    public final boolean method1592(int arg0) {
        if (arg0 != -14952) {
            this.field7198 = 39;
        }
        if (this.field7196 && class737.method4096(43, this.field7193.Unlock())) {
            this.field7196 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)Z")
    public final boolean method1591(int arg0, int arg1, int arg2) {
        if (arg0 != -17230) {
            return false;
        }
        this.field7197 = (byte) arg2;
        this.field7198 = arg1;
        if (this.field7198 > this.field7195) {
            int var4 = 8;
            byte var5;
            if (this.field7194) {
                var4 |= 0x200;
                var5 = 0;
            } else {
                var5 = 1;
            }
            if (this.field7193 != null) {
                this.field7193.method2573((byte) -116);
            }
            this.field7193 = this.field7199.field7746.method4109(this.field7198, var4, 0, var5, this.field7193);
            this.field7195 = this.field7198;
        }
        return this.field7193 != null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)I")
    public final int method3072(byte arg0) {
        return arg0 >= -44 ? -23 : this.field7197;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(Z)I")
    public final int method1683(boolean arg0) {
        if (arg0) {
            this.field7195 = 120;
        }
        return this.field7198;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljaclib/memory/Source;III)Z")
    public final boolean method1593(Source arg0, int arg1, int arg2, int arg3) {
        if (this.method1591(-17230, arg2, arg1)) {
            return this.field7193.method4099(arg0, 0, 0, this.field7198, this.field7194 ? 8192 : 0);
        } else {
            if (arg3 != 1340) {
                this.method1398(true);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lrd;Z)V")
    public class516(class549 arg0, boolean arg1) {
        this.field7194 = arg1;
        this.field7199 = arg0;
    }
}
