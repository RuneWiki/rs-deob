import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class737;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class361 implements class743 {

    @OriginalMember(owner = "client!fda", name = "g", descriptor = "Z")
    private boolean field5467 = false;

    @OriginalMember(owner = "client!fda", name = "e", descriptor = "Lhb;")
    private class585 field5465;

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "Z")
    private boolean field5462;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "Lal;")
    private class121 field5461;

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "I")
    private int field5464;

    @OriginalMember(owner = "client!fda", name = "f", descriptor = "I")
    private int field5466;

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field5463;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)I", line = 6)
    public final int method695(byte arg0) {
        return arg0 < 37 ? 63 : this.field5464;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(BI)V", line = 16)
    public final void method924(byte arg0, int arg1) {
        if (arg0 > -31) {
            this.field5467 = true;
        }
        this.field5464 = this.field5461.field1855 * arg1;
        if (this.field5466 >= this.field5464) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field5462) {
            var4 = 0;
            var3 |= 0x200;
        } else {
            var4 = 1;
        }
        if (this.field5463 != null) {
            this.field5463.method2604(false);
        }
        this.field5463 = this.field5465.field8281.method4129(this.field5464, var3, class121.field1860 == this.field5461 ? 101 : 102, var4, this.field5463);
        this.field5466 = this.field5464;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;", line = 49)
    public final Buffer method926(boolean arg0, int arg1) {
        if (this.field5463 == null) {
            return null;
        }
        boolean var3 = arg0 & this.field5462;
        if (arg1 != -29944) {
            return (Buffer) null;
        } else if (!this.field5467 && class737.method4132(-94, this.field5463.Lock(0, this.field5466, var3 ? 8192 : 0, this.field5465.field8258))) {
            this.field5467 = true;
            return this.field5465.field8258;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "(I)V", line = 71)
    public final void method697(int arg0) {
        if (this.field5463 != null) {
            this.field5463.method2604(false);
            this.field5463 = null;
        }
        this.field5464 = 0;
        this.field5466 = 0;
        if (arg0 != -18934) {
            this.method927(-20);
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)Lal;", line = 91)
    public final class121 method927(int arg0) {
        return arg0 == 1592 ? this.field5461 : (class121) null;
    }

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "(B)Z", line = 104)
    public final boolean method925(byte arg0) {
        if (arg0 < 14) {
            this.field5461 = null;
        }
        if (this.field5467 && class737.method4132(-13, this.field5463.Unlock())) {
            this.field5467 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(Lhb;Lal;Z)V", line = 127)
    public class361(class585 arg0, class121 arg1, boolean arg2) {
        this.field5465 = arg0;
        this.field5462 = arg2;
        this.field5461 = arg1;
    }
}
