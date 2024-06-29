import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class151 {

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "Lee;")
    private class404 field2264 = null;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    private int field2266 = 0;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    private int field2267 = 0;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "Lig;")
    private class132 field2265;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "Lfg;")
    private class66 field2263;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "[Lwc;")
    private class42[] field2268;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZZI)V")
    public final void method1122(int arg0, boolean arg1, boolean arg2, int arg3) {
        if (arg0 >= -76) {
            this.method1123(-92, 102);
        }
        boolean var5 = arg2 & this.field2265.method930();
        if (!var5 && (arg3 == 4 || arg3 == 8)) {
            arg3 = 2;
        }
        if (arg3 != 0 && arg1) {
            arg3 |= Integer.MIN_VALUE;
        }
        if (this.field2267 != arg3) {
            if (this.field2267 != 0) {
                this.field2268[Integer.MAX_VALUE & this.field2267].method291();
            }
            if (arg3 != 0) {
                this.field2268[Integer.MAX_VALUE & arg3].method289(arg1);
                this.field2268[Integer.MAX_VALUE & arg3].method288(arg1);
            }
            this.field2264 = null;
            this.field2266 = Integer.MIN_VALUE;
            this.field2267 = arg3;
        } else if (this.field2267 != 0) {
            this.field2268[this.field2267 & Integer.MAX_VALUE].method288(arg1);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)Z")
    public final boolean method1123(int arg0, int arg1) {
        if (arg0 < 43) {
            this.field2265 = (class132) null;
        }
        return this.field2268[arg1].method287();
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZZ)V")
    public final void method1124(int arg0, boolean arg1, boolean arg2) {
        if ((arg1 | this.field2266 != arg0) & this.field2267 != 0) {
            this.field2268[Integer.MAX_VALUE & this.field2267].method290(arg0);
            this.field2266 = arg0;
        }
        if (arg2) {
            this.method1123(106, 31);
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lig;)V")
    public class151(class132 arg0) {
        this.field2265 = arg0;
        this.field2263 = new class66(arg0);
        this.field2268 = new class42[9];
        this.field2268[1] = new class146(arg0);
        this.field2268[2] = new class281(arg0, this.field2263);
        this.field2268[4] = new class298(arg0, this.field2263);
        this.field2268[5] = new class89(arg0, this.field2263);
        this.field2268[6] = new class268(arg0);
        this.field2268[7] = new class350(arg0);
        this.field2268[3] = new class45(arg0);
        this.field2268[8] = this.field2268[4];
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLee;)Z")
    public final boolean method1125(byte arg0, class404 arg1) {
        if (this.field2267 == 0) {
            return false;
        }
        int var3 = 3 / ((arg0 - 29) / 54);
        if (this.field2264 != arg1) {
            this.field2268[this.field2267 & Integer.MAX_VALUE].method286(arg1);
            this.field2264 = arg1;
        }
        return true;
    }
}
