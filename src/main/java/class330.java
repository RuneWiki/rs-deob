import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class482;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class330 implements class749 {

    @OriginalMember(owner = "client!js", name = "c", descriptor = "Z")
    private boolean field4588 = false;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "Ltg;")
    private class229 field4591;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "Lwt;")
    private class309 field4589;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "Z")
    private boolean field4590;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "I")
    private int field4586;

    @OriginalMember(owner = "client!js", name = "g", descriptor = "I")
    private int field4592;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field4587;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;", line = 4)
    public final Buffer method2154(int arg0, boolean arg1) {
        if (this.field4587 == null) {
            return null;
        }
        boolean var3 = arg1 & this.field4590;
        if (arg0 != 27599) {
            this.field4589 = null;
        }
        if (!this.field4588 && class482.method2873(-103, this.field4587.Lock(0, this.field4586, var3 ? 8192 : 0, this.field4591.field3077))) {
            this.field4588 = true;
            return this.field4591.field3077;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Ltg;Lwt;Z)V", line = 92)
    public class330(class229 arg0, class309 arg1, boolean arg2) {
        this.field4591 = arg0;
        this.field4589 = arg1;
        this.field4590 = arg2;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)I", line = 32)
    public final int method1564(boolean arg0) {
        if (!arg0) {
            this.method2155(127);
        }
        return this.field4592;
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(I)Lwt;", line = 43)
    public final class309 method2155(int arg0) {
        if (arg0 != -14876) {
            this.method2155(33);
        }
        return this.field4589;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V", line = 54)
    public final void method1059(int arg0) {
        if (this.field4587 != null) {
            this.field4587.method3677(7516);
            this.field4587 = null;
        }
        this.field4586 = 0;
        if (arg0 != 5342) {
            this.method2155(-128);
        }
        this.field4592 = 0;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(B)Z", line = 71)
    public final boolean method2156(byte arg0) {
        if (this.field4588 && class482.method2873(-108, this.field4587.Unlock())) {
            this.field4588 = false;
            return true;
        } else if (arg0 < 104) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IB)V", line = 104)
    public final void method2157(int arg0, byte arg1) {
        int var3 = 26 % ((3 - arg1) / 47);
        this.field4592 = this.field4589.field4299 * arg0;
        if (this.field4592 <= this.field4586) {
            return;
        }
        int var4 = 8;
        byte var5;
        if (this.field4590) {
            var5 = 0;
            var4 |= 0x200;
        } else {
            var5 = 1;
        }
        if (this.field4587 != null) {
            this.field4587.method3677(7516);
        }
        this.field4587 = this.field4591.field3093.method2887(this.field4592, var4, class309.field4306 == this.field4589 ? 101 : 102, var5, this.field4587);
        this.field4586 = this.field4592;
    }
}
