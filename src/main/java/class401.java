import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class672;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class401 implements class175 {

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "Z")
    private boolean field5794 = false;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "Lqda;")
    private class689 field5796;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "Loe;")
    private class13 field5800;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "Z")
    private boolean field5798;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    private int field5795;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    private int field5797;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field5799;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;", line = 6)
    public final Buffer method1283(byte arg0, boolean arg1) {
        if (this.field5799 == null) {
            return null;
        }
        boolean var3 = arg1 & this.field5798;
        if (!this.field5794 && class672.method3806(-127, this.field5799.Lock(0, this.field5797, var3 ? 8192 : 0, this.field5800.field167))) {
            this.field5794 = true;
            return this.field5800.field167;
        } else if (arg0 == 0) {
            return null;
        } else {
            return (Buffer) null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Loe;Lqda;Z)V", line = 127)
    public class401(class13 arg0, class689 arg1, boolean arg2) {
        this.field5796 = arg1;
        this.field5800 = arg0;
        this.field5798 = arg2;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)Lqda;", line = 31)
    public final class689 method1282(int arg0) {
        if (arg0 != -17149) {
            this.field5798 = true;
        }
        return this.field5796;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)Z", line = 44)
    public final boolean method1284(int arg0) {
        if (this.field5794 && class672.method3806(64, this.field5799.Unlock())) {
            this.field5794 = false;
            return true;
        } else if (arg0 == -28439) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V", line = 68)
    public final void method231(byte arg0) {
        if (this.field5799 != null) {
            this.field5799.method2012((byte) -6);
            this.field5799 = null;
        }
        this.field5795 = 0;
        this.field5797 = 0;
        if (arg0 != -105) {
            this.method240(23);
        }
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)I", line = 86)
    public final int method240(int arg0) {
        if (arg0 != 18471) {
            this.method240(18);
        }
        return this.field5795;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)V", line = 96)
    public final void method238(int arg0, int arg1) {
        this.field5795 = this.field5796.field9764 * arg1;
        if (arg0 != -22454) {
            this.field5794 = true;
        }
        if (this.field5797 >= this.field5795) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field5798) {
            var4 = 0;
            var3 |= 0x200;
        } else {
            var4 = 1;
        }
        if (this.field5799 != null) {
            this.field5799.method2012((byte) -6);
        }
        this.field5799 = this.field5800.field154.method3800(this.field5795, var3, class689.field9772 == this.field5796 ? 101 : 102, var4, this.field5799);
        this.field5797 = this.field5795;
    }
}
