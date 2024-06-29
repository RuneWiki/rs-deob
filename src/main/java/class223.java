import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class223 {

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Lqi;")
    public class137 field3510 = new class137();

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field3515 = 0;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "Lqi;")
    private class137 field3520;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)Lqi;")
    public final class137 method1547(int arg0) {
        field3519++;
        if (arg0 != 0) {
            field3515 = -70;
        }
        class137 var2 = this.field3510.field2218;
        if (this.field3510 == var2) {
            this.field3520 = null;
            return null;
        } else {
            this.field3520 = var2.field2218;
            return var2;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lqi;I)V")
    public final void method1548(class137 arg0, int arg1) {
        if (arg0.field2218 != null) {
            arg0.method952((byte) 77);
        }
        field3518++;
        arg0.field2216 = this.field3510.field2216;
        if (arg1 != 0) {
            this.method1547(-10);
        }
        arg0.field2218 = this.field3510;
        arg0.field2218.field2216 = arg0;
        arg0.field2216.field2218 = arg0;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
    public final void method1549(int arg0) {
        if (arg0 != 0) {
            return;
        }
        while (true) {
            class137 var2 = this.field3510.field2216;
            if (this.field3510 == var2) {
                field3517++;
                this.field3520 = null;
                return;
            }
            var2.method952((byte) 82);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)Lcj;")
    public static final class125 method1550(byte arg0, int arg1) {
        class125 var2 = (class125) class275.field4497.method1879(8887, (long) arg1);
        int var3 = -65 / ((arg0 - 6) / 51);
        field3514++;
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class268.field4338.method1156(36, arg1, (byte) -16);
        class125 var5 = new class125();
        var5.field1980 = arg1;
        if (var4 != null) {
            var5.method862(true, new class274(var4));
        }
        class275.field4497.method1883((long) arg1, -115, var5);
        return var5;
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)Lqi;")
    public final class137 method1551(int arg0) {
        if (arg0 != 0) {
            this.method1548((class137) null, -122);
        }
        class137 var2 = this.field3520;
        field3511++;
        if (this.field3510 == var2) {
            this.field3520 = null;
            return null;
        } else {
            this.field3520 = var2.field2216;
            return var2;
        }
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)Lqi;")
    public final class137 method1552(int arg0) {
        class137 var2 = this.field3520;
        field3516++;
        if (this.field3510 == var2) {
            this.field3520 = null;
            return null;
        }
        if (arg0 >= -125) {
            this.method1551(-35);
        }
        this.field3520 = var2.field2218;
        return var2;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)Lqi;")
    public final class137 method1553(boolean arg0) {
        class137 var2 = this.field3510.field2216;
        field3513++;
        if (this.field3510 == var2) {
            this.field3520 = null;
            return null;
        }
        if (!arg0) {
            field3515 = -4;
        }
        this.field3520 = var2.field2216;
        return var2;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILqi;)V")
    public final void method1554(int arg0, class137 arg1) {
        if (arg1.field2218 != null) {
            arg1.method952((byte) 123);
        }
        arg1.field2216 = this.field3510;
        arg1.field2218 = this.field3510.field2218;
        field3509++;
        if (arg0 == 5257) {
            arg1.field2218.field2216 = arg1;
            arg1.field2216.field2218 = arg1;
        }
    }

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(I)Lqi;")
    public final class137 method1555(int arg0) {
        field3512++;
        if (arg0 != 0) {
            method1550((byte) -14, -99);
        }
        class137 var2 = this.field3510.field2216;
        if (this.field3510 == var2) {
            return null;
        } else {
            var2.method952((byte) 69);
            return var2;
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
    public class223() {
        this.field3510.field2218 = this.field3510;
        this.field3510.field2216 = this.field3510;
    }
}
