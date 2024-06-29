import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class407;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class111 implements class419 {

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "Z")
    private boolean field1373 = false;

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "Z")
    private boolean field1375;

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "Lvp;")
    private class160 field1371;

    @OriginalMember(owner = "client!hu", name = "g", descriptor = "Lhg;")
    private class591 field1376;

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "I")
    private int field1372;

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "I")
    private int field1374;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field1370;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)I")
    public final int method441(int arg0) {
        if (arg0 != 16304) {
            this.field1374 = -44;
        }
        return this.field1372;
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)V")
    public final void method443(int arg0) {
        if (this.field1370 != null) {
            this.field1370.method3355(-11385);
            this.field1370 = null;
        }
        if (arg0 != 23678) {
            this.field1372 = 115;
        }
        this.field1372 = 0;
        this.field1374 = 0;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)V")
    public final void method644(int arg0, int arg1) {
        this.field1372 = this.field1371.field1924 * arg1;
        int var3 = -108 / ((arg0 + 49) / 60);
        if (this.field1372 <= this.field1374) {
            return;
        }
        int var4 = 8;
        byte var5;
        if (this.field1375) {
            var5 = 0;
            var4 |= 0x200;
        } else {
            var5 = 1;
        }
        if (this.field1370 != null) {
            this.field1370.method3355(-11385);
        }
        this.field1370 = this.field1376.field8586.method2335(this.field1372, var4, class160.field1933 == this.field1371 ? 101 : 102, var5, this.field1370);
        this.field1374 = this.field1372;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    public final Buffer method440(int arg0, boolean arg1) {
        boolean var3 = arg1 & this.field1375;
        if (arg0 >= -97) {
            return (Buffer) null;
        } else if (!this.field1373 && class407.method2320(this.field1370.Lock(0, this.field1374, var3 ? 8192 : 0, this.field1376.field8563), -2005530590)) {
            this.field1373 = true;
            return this.field1376.field8563;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lhg;Lvp;Z)V")
    public class111(class591 arg0, class160 arg1, boolean arg2) {
        this.field1375 = arg2;
        this.field1371 = arg1;
        this.field1376 = arg0;
    }

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "(I)Lvp;")
    public final class160 method645(int arg0) {
        if (arg0 != 29150) {
            this.field1372 = 121;
        }
        return this.field1371;
    }

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "(I)Z")
    public final boolean method442(int arg0) {
        if (this.field1373 && class407.method2320(this.field1370.Unlock(), -2005530590)) {
            this.field1373 = false;
            return true;
        } else {
            int var2 = -100 % ((arg0) / 63);
            return false;
        }
    }
}
