import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class396;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class113 implements class620 {

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "Z")
    private boolean field1867 = false;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "Lvt;")
    private class343 field1872;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "Lde;")
    private class15 field1873;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "Z")
    private boolean field1868;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    private int field1869;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    private int field1870;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field1871;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)Lvt;")
    public final class343 method246(byte arg0) {
        if (arg0 != -91) {
            this.method246((byte) -46);
        }
        return this.field1872;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V")
    public final void method252(int arg0, int arg1) {
        if (arg0 <= 29) {
            this.field1872 = null;
        }
        this.field1869 = this.field1872.field4916 * arg1;
        if (this.field1870 >= this.field1869) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field1868) {
            var4 = 0;
            var3 |= 0x200;
        } else {
            var4 = 1;
        }
        if (this.field1871 != null) {
            this.field1871.method3258(36);
        }
        this.field1871 = this.field1873.field182.method2436(this.field1869, var3, class343.field4923 == this.field1872 ? 101 : 102, var4, this.field1871);
        this.field1870 = this.field1869;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    public final Buffer method251(boolean arg0, byte arg1) {
        boolean var3 = arg0 & this.field1868;
        if (arg1 != 60) {
            this.field1869 = 2;
        }
        if (!this.field1867 && class396.method2412((byte) -100, this.field1871.Lock(0, this.field1870, var3 ? 8192 : 0, this.field1873.field165))) {
            this.field1867 = true;
            return this.field1873.field165;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)Z")
    public final boolean method245(int arg0) {
        if (arg0 != -11359) {
            this.field1867 = false;
        }
        if (this.field1867 && class396.method2412((byte) -64, this.field1871.Unlock())) {
            this.field1867 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)I")
    public final int method248(int arg0) {
        return arg0 == -920 ? this.field1869 : -127;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lde;Lvt;Z)V")
    public class113(class15 arg0, class343 arg1, boolean arg2) {
        this.field1872 = arg1;
        this.field1873 = arg0;
        this.field1868 = arg2;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
    public final void method249(int arg0) {
        if (arg0 != 12416) {
            return;
        }
        if (this.field1871 != null) {
            this.field1871.method3258(arg0 - 12293);
            this.field1871 = null;
        }
        this.field1869 = 0;
        this.field1870 = 0;
    }
}
