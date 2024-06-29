import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class452;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class272 implements class4 {

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "Z")
    private boolean field3789 = false;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Lss;")
    private class401 field3784;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "Lne;")
    private class294 field3786;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "Z")
    private boolean field3788;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    private int field3787;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    private int field3790;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field3785;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)Lne;", line = 5)
    public final class294 method25(byte arg0) {
        if (arg0 < 88) {
            this.method28(120);
        }
        return this.field3786;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V", line = 17)
    public final void method24(byte arg0) {
        if (arg0 != -93) {
            this.method26(-102, -7);
        }
        if (this.field3785 != null) {
            this.field3785.method3494(arg0 + 41);
            this.field3785 = null;
        }
        this.field3787 = 0;
        this.field3790 = 0;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)Z", line = 37)
    public final boolean method28(int arg0) {
        if (this.field3789 && class452.method2566(this.field3785.Unlock(), (byte) -42)) {
            this.field3789 = false;
            return true;
        } else {
            if (arg0 != 11390) {
                this.method27((byte) -127, false);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)V", line = 61)
    public final void method26(int arg0, int arg1) {
        this.field3787 = this.field3786.field4155 * arg1;
        if (arg0 != -24955) {
            this.field3788 = true;
        }
        if (this.field3787 <= this.field3790) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field3788) {
            var3 |= 0x200;
            var4 = 0;
        } else {
            var4 = 1;
        }
        if (this.field3785 != null) {
            this.field3785.method3494(-97);
        }
        this.field3785 = this.field3784.field5342.method2575(this.field3787, var3, class294.field4161 == this.field3786 ? 101 : 102, var4, this.field3785);
        this.field3790 = this.field3787;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)I", line = 91)
    public final int method1656(int arg0) {
        if (arg0 != -15151) {
            this.method28(-113);
        }
        return this.field3787;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;", line = 101)
    public final Buffer method27(byte arg0, boolean arg1) {
        if (this.field3785 == null) {
            return null;
        }
        boolean var3 = arg1 & this.field3788;
        if (arg0 != -64) {
            this.method28(-102);
        }
        if (!this.field3789 && class452.method2566(this.field3785.Lock(0, this.field3790, var3 ? 8192 : 0, this.field3784.field5337), (byte) -96)) {
            this.field3789 = true;
            return this.field3784.field5337;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lss;Lne;Z)V", line = 125)
    public class272(class401 arg0, class294 arg1, boolean arg2) {
        this.field3784 = arg0;
        this.field3786 = arg1;
        this.field3788 = arg2;
    }
}
