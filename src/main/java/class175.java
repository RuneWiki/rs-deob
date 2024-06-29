import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class441;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class175 implements class180 {

    @OriginalMember(owner = "client!m", name = "b", descriptor = "Z")
    private boolean field2084 = false;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "Lnb;")
    private class271 field2083;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "Lgb;")
    private class197 field2087;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "Z")
    private boolean field2085;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    private int field2086;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    private int field2089;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field2088;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)Lnb;", line = 10)
    public final class271 method1023(int arg0) {
        int var2 = -90 / ((47 - arg0) / 57);
        return this.field2083;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lgb;Lnb;Z)V", line = 122)
    public class175(class197 arg0, class271 arg1, boolean arg2) {
        this.field2083 = arg1;
        this.field2087 = arg0;
        this.field2085 = arg2;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(B)V", line = 22)
    public final void method166(byte arg0) {
        if (this.field2088 != null) {
            this.field2088.method3457((byte) -34);
            this.field2088 = null;
        }
        this.field2089 = 0;
        this.field2086 = 0;
        int var2 = -57 / ((arg0 - 3) / 39);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)Z", line = 39)
    public final boolean method170(int arg0) {
        if (this.field2084 && class441.method2451(this.field2088.Unlock(), (byte) -90)) {
            this.field2084 = false;
            return true;
        } else {
            if (arg0 != 9406) {
                this.field2086 = -48;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)I", line = 62)
    public final int method737(byte arg0) {
        int var2 = 12 % ((arg0 + 24) / 50);
        return this.field2086;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;", line = 70)
    public final Buffer method167(int arg0, boolean arg1) {
        if (this.field2088 == null) {
            return null;
        } else if (arg0 == 18829) {
            boolean var3 = arg1 & this.field2085;
            if (!this.field2084 && class441.method2451(this.field2088.Lock(0, this.field2089, var3 ? 8192 : 0, this.field2087.field2390), (byte) -69)) {
                this.field2084 = true;
                return this.field2087.field2390;
            } else {
                return null;
            }
        } else {
            return (Buffer) null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V", line = 94)
    public final void method1024(int arg0, int arg1) {
        this.field2086 = this.field2083.field3426 * arg1;
        if (this.field2089 < this.field2086) {
            int var3 = 8;
            byte var4;
            if (this.field2085) {
                var3 |= 0x200;
                var4 = 0;
            } else {
                var4 = 1;
            }
            if (this.field2088 != null) {
                this.field2088.method3457((byte) -34);
            }
            this.field2088 = this.field2087.field2376.method2430(this.field2086, var3, class271.field3430 == this.field2083 ? 101 : 102, var4, this.field2088);
            this.field2089 = this.field2086;
        }
        int var5 = -55 / ((arg0 - 63) / 40);
    }
}
