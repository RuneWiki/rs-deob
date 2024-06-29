import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class398 {

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    private int field5942 = 0;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    private int field5947 = 0;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Lod;")
    private class293 field5945 = null;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "Lsq;")
    private class96 field5943;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "Lbk;")
    private class210 field5946;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "[Ltn;")
    private class48[] field5944;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIZ)V")
    public final void method2499(int arg0, int arg1, boolean arg2) {
        if (arg1 != -3710) {
            this.method2502(66, -26);
        }
        if ((arg2 | this.field5942 != arg0) & this.field5947 != 0) {
            this.field5944[Integer.MAX_VALUE & this.field5947].method306(arg0);
            this.field5942 = arg0;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZIZI)V")
    public final void method2500(boolean arg0, int arg1, boolean arg2, int arg3) {
        if (arg3 != -1) {
            this.method2501((class293) null, (byte) 13);
        }
        boolean var5 = arg0 & this.field5943.method660();
        if (!var5 && (arg1 == 4 || arg1 == 8)) {
            arg1 = 2;
        }
        if (arg1 != 0 && arg2) {
            arg1 |= Integer.MIN_VALUE;
        }
        if (this.field5947 != arg1) {
            if (this.field5947 != 0) {
                this.field5944[Integer.MAX_VALUE & this.field5947].method305();
            }
            if (arg1 != 0) {
                this.field5944[arg1 & Integer.MAX_VALUE].method303(arg2);
                this.field5944[Integer.MAX_VALUE & arg1].method307(arg2);
            }
            this.field5947 = arg1;
            this.field5942 = Integer.MIN_VALUE;
            this.field5945 = null;
        } else if (this.field5947 != 0) {
            this.field5944[this.field5947 & Integer.MAX_VALUE].method307(arg2);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lod;B)Z")
    public final boolean method2501(class293 arg0, byte arg1) {
        if (arg1 != 99) {
            this.field5946 = (class210) null;
        }
        if (this.field5947 == 0) {
            return false;
        }
        if (this.field5945 != arg0) {
            this.field5944[this.field5947 & Integer.MAX_VALUE].method308(arg0);
            this.field5945 = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)Z")
    public final boolean method2502(int arg0, int arg1) {
        return arg0 == 0 ? this.field5944[arg1].method304() : true;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lsq;)V")
    public class398(class96 arg0) {
        this.field5943 = arg0;
        this.field5946 = new class210(arg0);
        this.field5944 = new class48[9];
        this.field5944[1] = new class365(arg0);
        this.field5944[2] = new class167(arg0, this.field5946);
        this.field5944[4] = new class204(arg0, this.field5946);
        this.field5944[5] = new class109(arg0, this.field5946);
        this.field5944[6] = new class404(arg0);
        this.field5944[7] = new class273(arg0);
        this.field5944[3] = new class76(arg0);
        this.field5944[8] = this.field5944[4];
    }
}
