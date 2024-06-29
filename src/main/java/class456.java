import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class435;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class456 implements class697 {

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "Z")
    private boolean field6003 = false;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "Z")
    private boolean field5999;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "Lhb;")
    private class343 field5998;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "B")
    private byte field6000;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    private int field5997;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    private int field6001;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field6002;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)I", line = 5)
    public final int method1755(int arg0) {
        if (arg0 != 16383) {
            this.field6000 = -54;
        }
        return this.field5997;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)Z", line = 18)
    public final boolean method2564(int arg0) {
        int var2 = 92 % ((56 - arg0) / 54);
        if (this.field6003 && class435.method2447(-1, this.field6002.Unlock())) {
            this.field6003 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)I", line = 38)
    public final int method2565(int arg0) {
        if (arg0 > -35) {
            this.field5998 = null;
        }
        return this.field6000;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;", line = 52)
    public final Buffer method2566(boolean arg0, byte arg1) {
        if (this.field6002 == null) {
            return null;
        }
        if (arg1 != 6) {
            this.field6000 = 44;
        }
        boolean var3 = arg0 & this.field5999;
        if (!this.field6003 && class435.method2447(-1, this.field6002.Lock(0, this.field6001, var3 ? 8192 : 0, this.field5998.field4595))) {
            this.field6003 = true;
            return this.field5998.field4595;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)V", line = 72)
    public final void method1758(byte arg0) {
        if (this.field6002 != null) {
            this.field6002.method3454((byte) 127);
            this.field6002 = null;
        }
        int var2 = 3 % ((arg0 - 67) / 38);
        this.field6001 = 0;
        this.field5997 = 0;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IBI)Z", line = 89)
    public final boolean method2567(int arg0, byte arg1, int arg2) {
        if (arg1 >= -115) {
            return true;
        }
        this.field6000 = (byte) arg0;
        this.field5997 = arg2;
        if (this.field6001 < this.field5997) {
            int var4 = 8;
            byte var5;
            if (this.field5999) {
                var5 = 0;
                var4 |= 0x200;
            } else {
                var5 = 1;
            }
            if (this.field6002 != null) {
                this.field6002.method3454((byte) 125);
            }
            this.field6002 = this.field5998.field4612.method2450(this.field5997, var4, 0, var5, this.field6002);
            this.field6001 = this.field5997;
        }
        return this.field6002 != null;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lhb;Z)V", line = 129)
    public class456(class343 arg0, boolean arg1) {
        this.field5999 = arg1;
        this.field5998 = arg0;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljaclib/memory/Source;III)Z", line = 139)
    public final boolean method2568(Source arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -19467) {
            this.method2564(63);
        }
        return this.method2567(arg1, (byte) -128, arg3) ? this.field6002.method2441(arg0, 0, 0, this.field5997, this.field5999 ? 8192 : 0) : false;
    }
}
