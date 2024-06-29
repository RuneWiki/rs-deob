import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class446;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class641 implements class288 {

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "Z")
    private boolean field8862 = false;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "Lega;")
    private class662 field8858;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "Z")
    private boolean field8860;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "B")
    private byte field8859;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    private int field8857;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    private int field8861;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field8856;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)Z")
    public final boolean method1768(int arg0, int arg1, int arg2) {
        if (arg1 != -26595) {
            this.method905(false);
        }
        this.field8857 = arg0;
        this.field8859 = (byte) arg2;
        if (this.field8861 < this.field8857) {
            int var4 = 8;
            byte var5;
            if (this.field8860) {
                var4 |= 0x200;
                var5 = 0;
            } else {
                var5 = 1;
            }
            if (this.field8856 != null) {
                this.field8856.method3495(arg1 ^ 0xFFFF9876);
            }
            this.field8856 = this.field8858.field9273.method2536(this.field8857, var4, 0, var5, this.field8856);
            this.field8861 = this.field8857;
        }
        return this.field8856 != null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)Z")
    public final boolean method1771(int arg0) {
        if (this.field8862 && class446.method2528((byte) 106, this.field8856.Unlock())) {
            this.field8862 = false;
            return true;
        } else {
            if (arg0 <= 83) {
                this.method3567((byte) 75);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)I")
    public final int method905(boolean arg0) {
        if (!arg0) {
            this.field8857 = 15;
        }
        return this.field8857;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V")
    public final void method1122(int arg0) {
        if (this.field8856 != null) {
            this.field8856.method3495(116);
            this.field8856 = null;
        }
        if (arg0 != -1620) {
            this.method1770(null, 120, -77, 68);
        }
        this.field8861 = 0;
        this.field8857 = 0;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    public final Buffer method1769(boolean arg0, int arg1) {
        if (this.field8856 == null) {
            return null;
        }
        int var3 = -3 % ((arg1 - 43) / 47);
        boolean var4 = arg0 & this.field8860;
        if (!this.field8862 && class446.method2528((byte) 109, this.field8856.Lock(0, this.field8861, var4 ? 8192 : 0, this.field8858.field9292))) {
            this.field8862 = true;
            return this.field8858.field9292;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)I")
    public final int method3567(byte arg0) {
        if (arg0 != -40) {
            this.field8859 = 48;
        }
        return this.field8859;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljaclib/memory/Source;III)Z")
    public final boolean method1770(Source arg0, int arg1, int arg2, int arg3) {
        if (this.method1768(arg2, -26595, arg1)) {
            return this.field8856.method2552(arg0, 0, 0, this.field8857, this.field8860 ? 8192 : 0);
        } else {
            if (arg3 != -15029) {
                this.method905(true);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lega;Z)V")
    public class641(class662 arg0, boolean arg1) {
        this.field8858 = arg0;
        this.field8860 = arg1;
    }
}
