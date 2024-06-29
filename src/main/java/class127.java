import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class127 {

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "I")
    public int field1596 = 0;

    @OriginalMember(owner = "client!qca", name = "e", descriptor = "I")
    public int field1598 = 0;

    @OriginalMember(owner = "client!qca", name = "h", descriptor = "Ltja;")
    private class288 field1601 = new class288(64);

    @OriginalMember(owner = "client!qca", name = "i", descriptor = "Lcda;")
    private class184 field1602 = null;

    @OriginalMember(owner = "client!qca", name = "g", descriptor = "Lbt;")
    private class48 field1600;

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "Lbt;")
    private class48 field1595;

    @OriginalMember(owner = "client!qca", name = "f", descriptor = "Llja;")
    public static class744 field1599 = new class744(32, 0);

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!qca", name = "d", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(J[IILbja;)Ljava/lang/String;", line = 10)
    public final String method970(long arg0, int[] arg1, int arg2, class34 arg3) {
        field1597++;
        if (arg2 > -52) {
            this.field1595 = null;
        }
        if (this.field1602 != null) {
            String var6 = this.field1602.method1228(arg0, 35, arg3, arg1);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)V", line = 30)
    public static void method971(int arg0) {
        field1599 = null;
        if (arg0 != 0) {
            field1599 = null;
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(II)Lph;", line = 43)
    public final class671 method972(int arg0, int arg1) {
        field1594++;
        class671 var3 = (class671) this.field1601.method1684((long) arg0, -359);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field1595.method437(1, (byte) 105, arg0 & 0x7FFF);
        } else {
            var4 = this.field1600.method437(1, (byte) 100, arg0);
        }
        class671 var5 = new class671();
        var5.field9204 = this;
        if (arg1 != 1) {
            return null;
        }
        if (var4 != null) {
            var5.method3776((byte) 44, new class403(var4));
        }
        if (arg0 >= 32768) {
            var5.method3771(0);
        }
        this.field1601.method1686(-25638, (long) arg0, var5);
        return var5;
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(ILbt;Lbt;Lcda;)V", line = 94)
    public class127(int arg0, class48 arg1, class48 arg2, class184 arg3) {
        this.field1600 = arg1;
        this.field1595 = arg2;
        this.field1602 = arg3;
        if (this.field1600 != null) {
            this.field1598 = this.field1600.method431(4, 1);
        }
        if (this.field1595 != null) {
            this.field1596 = this.field1595.method431(4, 1);
        }
    }
}
