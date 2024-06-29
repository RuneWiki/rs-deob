import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class686;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class382 implements class526 {

    @OriginalMember(owner = "client!mea", name = "d", descriptor = "Z")
    private boolean field5559 = false;

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "Lui;")
    private class130 field5557;

    @OriginalMember(owner = "client!mea", name = "e", descriptor = "Z")
    private boolean field5560;

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "Leea;")
    private class680 field5558;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "I")
    private int field5556;

    @OriginalMember(owner = "client!mea", name = "g", descriptor = "I")
    private int field5562;

    @OriginalMember(owner = "client!mea", name = "f", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field5561;

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "(B)Leea;", line = 6)
    public final class680 method2310(byte arg0) {
        if (arg0 > -33) {
            this.method1025(false, (byte) -35);
        }
        return this.field5558;
    }

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "(B)I", line = 17)
    public final int method1024(byte arg0) {
        if (arg0 != 54) {
            this.method2310((byte) -12);
        }
        return this.field5562;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(II)V", line = 29)
    public final void method1446(int arg0, int arg1) {
        this.field5562 = this.field5558.field9661 * arg0;
        if (arg1 != 30419) {
            this.field5558 = null;
        }
        if (this.field5556 >= this.field5562) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field5560) {
            var3 |= 0x200;
            var4 = 0;
        } else {
            var4 = 1;
        }
        if (this.field5561 != null) {
            this.field5561.method1547((byte) -77);
        }
        this.field5561 = this.field5557.field1657.method3795(this.field5562, var3, class680.field9665 == this.field5558 ? 101 : 102, var4, this.field5561);
        this.field5556 = this.field5562;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;", line = 64)
    public final Buffer method1025(boolean arg0, byte arg1) {
        if (this.field5561 == null) {
            return null;
        }
        boolean var3 = arg0 & this.field5560;
        if (!this.field5559 && class686.method3804(2005530599, this.field5561.Lock(0, this.field5556, var3 ? 8192 : 0, this.field5557.field1646))) {
            this.field5559 = true;
            return this.field5557.field1646;
        } else {
            if (arg1 != 67) {
                this.field5559 = true;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(B)V", line = 88)
    public final void method1022(byte arg0) {
        if (this.field5561 != null) {
            this.field5561.method1547((byte) -81);
            this.field5561 = null;
        }
        this.field5562 = 0;
        if (arg0 != 33) {
            this.method1022((byte) -53);
        }
        this.field5556 = 0;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Z)Z", line = 105)
    public final boolean method1021(boolean arg0) {
        if (this.field5559 && class686.method3804(2005530599, this.field5561.Unlock())) {
            this.field5559 = false;
            return true;
        } else {
            if (!arg0) {
                this.method1021(true);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lui;Leea;Z)V", line = 127)
    public class382(class130 arg0, class680 arg1, boolean arg2) {
        this.field5557 = arg0;
        this.field5560 = arg2;
        this.field5558 = arg1;
    }
}
