import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class133 {

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    private int field1946 = 0;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    private int field1947 = 0;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "Lkq;")
    private class386 field1949 = null;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "Lbf;")
    private class344 field1945;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "Lfs;")
    private class359 field1948;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "[Lcd;")
    private class189[] field1944;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IZI)V")
    public final void method810(int arg0, boolean arg1, int arg2) {
        if (arg0 != 3) {
            this.method812(61, false);
        }
        if (this.field1946 != 0 & (this.field1947 != arg2 | arg1)) {
            this.field1944[Integer.MAX_VALUE & this.field1946].method490(arg2);
            this.field1947 = arg2;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ZIZI)V")
    public final void method811(boolean arg0, int arg1, boolean arg2, int arg3) {
        boolean var5 = arg0 & this.field1945.method1991();
        int var6 = 56 / ((-arg1 - 18) / 44);
        if (!var5 && (arg3 == 4 || arg3 == 8)) {
            arg3 = 2;
        }
        if (arg3 != 0 && arg2) {
            arg3 |= Integer.MIN_VALUE;
        }
        if (this.field1946 != arg3) {
            if (this.field1946 != 0) {
                this.field1944[Integer.MAX_VALUE & this.field1946].method491();
            }
            if (arg3 != 0) {
                this.field1944[Integer.MAX_VALUE & arg3].method486(arg2);
                this.field1944[Integer.MAX_VALUE & arg3].method488(arg2);
            }
            this.field1946 = arg3;
            this.field1949 = null;
            this.field1947 = Integer.MIN_VALUE;
        } else if (this.field1946 != 0) {
            this.field1944[Integer.MAX_VALUE & this.field1946].method488(arg2);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IZ)Z")
    public final boolean method812(int arg0, boolean arg1) {
        return arg1 ? this.field1944[arg0].method487() : false;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lkq;I)Z")
    public final boolean method813(class386 arg0, int arg1) {
        if (this.field1946 == 0) {
            return false;
        } else if (arg1 <= 97) {
            return true;
        } else {
            if (this.field1949 != arg0) {
                this.field1944[this.field1946 & Integer.MAX_VALUE].method492(arg0);
                this.field1949 = arg0;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lbf;)V")
    public class133(class344 arg0) {
        this.field1945 = arg0;
        this.field1948 = new class359(arg0);
        this.field1944 = new class189[9];
        this.field1944[1] = new class242(arg0);
        this.field1944[2] = new class427(arg0, this.field1948);
        this.field1944[4] = new class75(arg0, this.field1948);
        this.field1944[5] = new class489(arg0, this.field1948);
        this.field1944[6] = new class144(arg0);
        this.field1944[7] = new class418(arg0);
        this.field1944[3] = new class479(arg0);
        this.field1944[8] = this.field1944[4];
    }
}
