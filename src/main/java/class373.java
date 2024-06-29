import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class435;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class373 implements class556 {

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "Z")
    private boolean field4958 = false;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "Z")
    private boolean field4953;

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "Lvea;")
    private class404 field4959;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "Lhb;")
    private class343 field4957;

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "I")
    private int field4954;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "I")
    private int field4956;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field4955;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;", line = 7)
    public final Buffer method2143(boolean arg0, byte arg1) {
        if (this.field4955 == null) {
            return null;
        }
        boolean var3 = arg0 & this.field4953;
        if (!this.field4958 && class435.method2447(arg1 - 78, this.field4955.Lock(0, this.field4954, var3 ? 8192 : 0, this.field4957.field4595))) {
            this.field4958 = true;
            return this.field4957.field4595;
        } else if (arg1 == 77) {
            return null;
        } else {
            return (Buffer) null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)Lvea;", line = 28)
    public final class404 method2144(byte arg0) {
        if (arg0 != 93) {
            this.field4957 = null;
        }
        return this.field4959;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)V", line = 41)
    public final void method1765(int arg0, int arg1) {
        this.field4956 = this.field4959.field5334 * arg0;
        if (arg1 != 30907 || this.field4956 <= this.field4954) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field4953) {
            var3 |= 0x200;
            var4 = 0;
        } else {
            var4 = 1;
        }
        if (this.field4955 != null) {
            this.field4955.method3454((byte) 123);
        }
        this.field4955 = this.field4957.field4612.method2458(this.field4956, var3, class404.field5339 == this.field4959 ? 101 : 102, var4, this.field4955);
        this.field4954 = this.field4956;
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lhb;Lvea;Z)V", line = 109)
    public class373(class343 arg0, class404 arg1, boolean arg2) {
        this.field4953 = arg2;
        this.field4959 = arg1;
        this.field4957 = arg0;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)I", line = 80)
    public final int method1755(int arg0) {
        return arg0 == 16383 ? this.field4956 : 101;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)Z", line = 90)
    public final boolean method2145(boolean arg0) {
        if (this.field4958 && class435.method2447(-1, this.field4955.Unlock())) {
            this.field4958 = false;
            return true;
        } else if (arg0) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(B)V", line = 121)
    public final void method1758(byte arg0) {
        if (this.field4955 != null) {
            this.field4955.method3454((byte) 126);
            this.field4955 = null;
        }
        this.field4956 = 0;
        int var2 = 110 % ((arg0 - 67) / 38);
        this.field4954 = 0;
    }
}
