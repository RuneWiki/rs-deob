import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class480;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class730 implements class234 {

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "Z")
    private boolean field10226 = false;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "Llt;")
    private class672 field10224;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "Lti;")
    private class438 field10227;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "Z")
    private boolean field10229;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    private int field10225;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    private int field10228;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field10230;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V")
    public final void method1600(int arg0, int arg1) {
        this.field10225 = this.field10227.field6113 * arg0;
        int var3 = -88 % ((-arg1 - 34) / 62);
        if (this.field10228 >= this.field10225) {
            return;
        }
        int var4 = 8;
        byte var5;
        if (this.field10229) {
            var4 |= 0x200;
            var5 = 0;
        } else {
            var5 = 1;
        }
        if (this.field10230 != null) {
            this.field10230.method3786(30216);
        }
        this.field10230 = this.field10224.field9423.method2895(this.field10225, var4, class438.field6118 == this.field10227 ? 101 : 102, var5, this.field10230);
        this.field10228 = this.field10225;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    public final Buffer method1599(boolean arg0, byte arg1) {
        if (this.field10230 == null) {
            return null;
        }
        int var3 = 71 / ((-arg1 - 57) / 33);
        boolean var4 = arg0 & this.field10229;
        if (!this.field10226 && class480.method2879(this.field10230.Lock(0, this.field10228, var4 ? 8192 : 0, this.field10224.field9437), (byte) -109)) {
            this.field10226 = true;
            return this.field10224.field9437;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)I")
    public final int method1491(int arg0) {
        int var2 = 66 % ((arg0 + 42) / 46);
        return this.field10225;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)Lti;")
    public final class438 method1598(int arg0) {
        int var2 = -56 % ((70 - arg0) / 40);
        return this.field10227;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
    public final void method1496(boolean arg0) {
        if (this.field10230 != null) {
            this.field10230.method3786(30216);
            this.field10230 = null;
        }
        this.field10228 = 0;
        if (arg0) {
            this.field10228 = -27;
        }
        this.field10225 = 0;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)Z")
    public final boolean method1601(int arg0) {
        if (this.field10226 && class480.method2879(this.field10230.Unlock(), (byte) -128)) {
            this.field10226 = false;
            return true;
        } else {
            int var2 = -96 % ((79 - arg0) / 42);
            return false;
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Llt;Lti;Z)V")
    public class730(class672 arg0, class438 arg1, boolean arg2) {
        this.field10224 = arg0;
        this.field10227 = arg1;
        this.field10229 = arg2;
    }
}
