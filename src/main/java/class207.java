import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class757;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class207 implements class463 {

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "Z")
    private boolean field3024 = false;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "Llj;")
    private class8 field3020;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "Z")
    private boolean field3019;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "Ldr;")
    private class629 field3022;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
    private int field3021;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "I")
    private int field3025;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field3023;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;", line = 11)
    public final Buffer method1440(boolean arg0, int arg1) {
        if (this.field3023 == null) {
            return null;
        }
        boolean var3 = arg0 & this.field3019;
        if (!this.field3024 && class757.method4191(-2005530600, this.field3023.Lock(0, this.field3021, var3 ? 8192 : 0, this.field3020.field118))) {
            this.field3024 = true;
            return this.field3020.field118;
        } else {
            if (arg1 != -15169) {
                this.field3019 = true;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)Z", line = 33)
    public final boolean method1441(int arg0) {
        if (arg0 != 32416) {
            return false;
        } else if (this.field3024 && class757.method4191(-2005530600, this.field3023.Unlock())) {
            this.field3024 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(B)Ldr;", line = 54)
    public final class629 method1442(byte arg0) {
        return arg0 > -28 ? (class629) null : this.field3022;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)I", line = 64)
    public final int method35(byte arg0) {
        return arg0 < 71 ? 16 : this.field3025;
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Llj;Ldr;Z)V", line = 128)
    public class207(class8 arg0, class629 arg1, boolean arg2) {
        this.field3020 = arg0;
        this.field3019 = arg2;
        this.field3022 = arg1;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)V", line = 79)
    public final void method602(int arg0, int arg1) {
        if (arg0 != 17154) {
            this.method1440(true, 106);
        }
        this.field3025 = this.field3022.field8914 * arg1;
        if (this.field3025 <= this.field3021) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field3019) {
            var4 = 0;
            var3 |= 0x200;
        } else {
            var4 = 1;
        }
        if (this.field3023 != null) {
            this.field3023.method2234(-4840);
        }
        this.field3023 = this.field3020.field100.method4187(this.field3025, var3, class629.field8919 == this.field3022 ? 101 : 102, var4, this.field3023);
        this.field3021 = this.field3025;
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)V", line = 112)
    public final void method32(int arg0) {
        if (this.field3023 != null) {
            this.field3023.method2234(arg0 ^ 0xFFFFAD47);
            this.field3023 = null;
        }
        this.field3025 = 0;
        this.field3021 = 0;
        if (arg0 != 16479) {
            this.method32(-54);
        }
    }
}
