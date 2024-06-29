import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class439;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class690 implements class17 {

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "Z")
    private boolean field9707 = false;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "Z")
    private boolean field9705;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "Leda;")
    private class561 field9703;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "Lrt;")
    private class179 field9704;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    private int field9706;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    private int field9709;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field9708;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)I", line = 10)
    public final int method197(int arg0) {
        int var2 = 113 % ((arg0 - 27) / 38);
        return this.field9709;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)Lrt;", line = 19)
    public final class179 method72(byte arg0) {
        int var2 = 87 % ((arg0 - 30) / 41);
        return this.field9704;
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Leda;Lrt;Z)V", line = 123)
    public class690(class561 arg0, class179 arg1, boolean arg2) {
        this.field9705 = arg2;
        this.field9703 = arg0;
        this.field9704 = arg1;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)Z", line = 32)
    public final boolean method71(int arg0) {
        if (arg0 != -26305) {
            return false;
        } else if (this.field9707 && class439.method2511((byte) 35, this.field9708.Unlock())) {
            this.field9707 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IB)V", line = 54)
    public final void method73(int arg0, byte arg1) {
        if (arg1 != -55) {
            this.field9707 = true;
        }
        this.field9709 = this.field9704.field2003 * arg0;
        if (this.field9709 <= this.field9706) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field9705) {
            var4 = 0;
            var3 |= 0x200;
        } else {
            var4 = 1;
        }
        if (this.field9708 != null) {
            this.field9708.method3483(arg1 ^ 0x48);
        }
        this.field9708 = this.field9703.field8021.method2524(this.field9709, var3, class179.field2009 == this.field9704 ? 101 : 102, var4, this.field9708);
        this.field9706 = this.field9709;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;", line = 85)
    public final Buffer method75(boolean arg0, int arg1) {
        if (arg1 != 21281) {
            this.field9705 = true;
        }
        if (this.field9708 == null) {
            return null;
        }
        boolean var3 = arg0 & this.field9705;
        if (!this.field9707 && class439.method2511((byte) 35, this.field9708.Lock(0, this.field9706, var3 ? 8192 : 0, this.field9703.field8003))) {
            this.field9707 = true;
            return this.field9703.field8003;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)V", line = 107)
    public final void method74(byte arg0) {
        if (arg0 < 99) {
            this.method73(53, (byte) -52);
        }
        if (this.field9708 != null) {
            this.field9708.method3483(-127);
            this.field9708 = null;
        }
        this.field9706 = 0;
        this.field9709 = 0;
    }
}
