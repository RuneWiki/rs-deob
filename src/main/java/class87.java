import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class87 {

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "Lsm;")
    public class46 field1402 = new class46();

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "S")
    public static short field1401 = 256;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    public static int field1411 = 0;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
    public static int field1414 = -1;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "Lsm;")
    private class46 field1415;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)Lsm;", line = 7)
    public final class46 method630(byte arg0) {
        int var2 = -109 / ((-arg0 - 63) / 55);
        field1404++;
        class46 var3 = this.field1415;
        if (this.field1402 == var3) {
            this.field1415 = null;
            return null;
        } else {
            this.field1415 = var3.field756;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lsm;Z)V", line = 24)
    public final void method631(class46 arg0, boolean arg1) {
        if (arg0.field756 != null) {
            arg0.method403(1);
        }
        field1407++;
        arg0.field756 = this.field1402;
        arg0.field754 = this.field1402.field754;
        if (!arg1) {
            arg0.field756.field754 = arg0;
            arg0.field754.field756 = arg0;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILsm;)V", line = 42)
    public final void method632(int arg0, class46 arg1) {
        if (arg1.field756 != null) {
            arg1.method403(1);
        }
        arg1.field756 = this.field1402.field756;
        field1408++;
        arg1.field754 = this.field1402;
        arg1.field756.field754 = arg1;
        arg1.field754.field756 = arg1;
        if (arg0 > -23) {
            this.field1402 = (class46) null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)Lsm;", line = 68)
    public final class46 method633(int arg0) {
        field1412++;
        if (arg0 != -1) {
            this.method637(34);
        }
        class46 var2 = this.field1402.field754;
        if (this.field1402 == var2) {
            return null;
        } else {
            var2.method403(1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)V", line = 91)
    public final void method634(byte arg0) {
        while (true) {
            class46 var2 = this.field1402.field754;
            if (this.field1402 == var2) {
                field1403++;
                this.field1415 = null;
                int var3 = -22 / ((arg0 + 53) / 32);
                return;
            }
            var2.method403(1);
        }
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(B)Lsm;", line = 109)
    public final class46 method635(byte arg0) {
        field1405++;
        if (arg0 <= 25) {
            this.method638(125);
        }
        class46 var2 = this.field1402.field756;
        if (this.field1402 == var2) {
            this.field1415 = null;
            return null;
        } else {
            this.field1415 = var2.field756;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)Lsm;", line = 134)
    public final class46 method636(int arg0) {
        field1410++;
        class46 var2 = this.field1402.field754;
        if (arg0 != -1) {
            field1401 = 119;
        }
        if (this.field1402 == var2) {
            this.field1415 = null;
            return null;
        } else {
            this.field1415 = var2.field754;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V", line = 213)
    public class87() {
        this.field1402.field756 = this.field1402;
        this.field1402.field754 = this.field1402;
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)Z", line = 173)
    public final boolean method637(int arg0) {
        if (arg0 > -84) {
            return true;
        } else {
            field1409++;
            return this.field1402.field754 == this.field1402;
        }
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)Lsm;", line = 195)
    public final class46 method638(int arg0) {
        if (arg0 < 43) {
            this.field1402 = (class46) null;
        }
        class46 var2 = this.field1415;
        field1406++;
        if (this.field1402 == var2) {
            this.field1415 = null;
            return null;
        } else {
            this.field1415 = var2.field754;
            return var2;
        }
    }
}
