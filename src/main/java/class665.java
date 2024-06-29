import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class771;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class665 implements class688 {

    @OriginalMember(owner = "client!caa", name = "e", descriptor = "Z")
    private boolean field8667 = false;

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "Lcka;")
    private class248 field8665;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "Lds;")
    private class73 field8663;

    @OriginalMember(owner = "client!caa", name = "g", descriptor = "Z")
    private boolean field8669;

    @OriginalMember(owner = "client!caa", name = "d", descriptor = "I")
    private int field8666;

    @OriginalMember(owner = "client!caa", name = "f", descriptor = "I")
    private int field8668;

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field8664;

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(I)I", line = 6)
    public final int method287(int arg0) {
        return arg0 == 128 ? this.field8666 : -56;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)Lds;", line = 16)
    public final class73 method2015(int arg0) {
        if (arg0 != 18603) {
            this.field8664 = null;
        }
        return this.field8663;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(II)V", line = 27)
    public final void method2016(int arg0, int arg1) {
        int var3 = 78 / ((arg1 - 24) / 59);
        this.field8666 = this.field8663.field987 * arg0;
        if (this.field8668 >= this.field8666) {
            return;
        }
        int var4 = 8;
        byte var5;
        if (this.field8669) {
            var4 |= 0x200;
            var5 = 0;
        } else {
            var5 = 1;
        }
        if (this.field8664 != null) {
            this.field8664.method2546(true);
        }
        this.field8664 = this.field8665.field3402.method4174(this.field8666, var4, class73.field991 == this.field8663 ? 101 : 102, var5, this.field8664);
        this.field8668 = this.field8666;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(B)V", line = 58)
    public final void method284(byte arg0) {
        if (this.field8664 != null) {
            this.field8664.method2546(true);
            this.field8664 = null;
        }
        this.field8668 = 0;
        this.field8666 = 0;
        if (arg0 < 33) {
            this.method2014(true, true);
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;", line = 76)
    public final Buffer method2014(boolean arg0, boolean arg1) {
        if (this.field8664 == null) {
            return null;
        } else if (arg1) {
            boolean var3 = arg0 & this.field8669;
            if (!this.field8667 && class771.method4195(false, this.field8664.Lock(0, this.field8668, var3 ? 8192 : 0, this.field8665.field3382))) {
                this.field8667 = true;
                return this.field8665.field3382;
            } else {
                return null;
            }
        } else {
            return (Buffer) null;
        }
    }

    @OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Lcka;Lds;Z)V", line = 125)
    public class665(class248 arg0, class73 arg1, boolean arg2) {
        this.field8665 = arg0;
        this.field8663 = arg1;
        this.field8669 = arg2;
    }

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "(I)Z", line = 105)
    public final boolean method2017(int arg0) {
        if (arg0 != 28359) {
            this.field8664 = null;
        }
        if (this.field8667 && class771.method4195(false, this.field8664.Unlock())) {
            this.field8667 = false;
            return true;
        } else {
            return false;
        }
    }
}
