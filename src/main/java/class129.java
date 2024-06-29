import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class129 {

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "Lco;")
    private class210 field1600 = new class210(64);

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "Lg;")
    public class470 field1592;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "Lg;")
    private class470 field1594;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "Lpn;")
    public static class72 field1589 = new class72(50, 2);

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "Lec;")
    public static class40 field1591 = new class40("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "Lpn;")
    public static class72 field1597 = new class72(70, 18);

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    public static int field1601 = 1;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public static final void method613(int arg0) {
        field1596++;
        if (!class420.method2503((byte) 102) && class346.field4942 != class100.field1217) {
            class199.method1088(false, class312.field4565, false, class366.field5243, false);
            return;
        }
        class66.method340(class231.field3205, 110);
        if (class174.field2094 != class100.field1217) {
            class62.method317((byte) 0);
        }
        if (arg0 != 64) {
            field1591 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)V")
    public final void method614(int arg0, int arg1) {
        if (arg1 != 3) {
            return;
        }
        field1588++;
        class210 var3 = this.field1600;
        synchronized (this.field1600) {
            this.field1600.method1166(arg0, (byte) -52);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
    public static void method615(byte arg0) {
        field1589 = null;
        field1597 = null;
        if (arg0 > -111) {
            field1591 = null;
        }
        field1591 = null;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)Lkg;")
    public final class233 method616(int arg0, int arg1) {
        field1599++;
        class210 var3 = this.field1600;
        class233 var4;
        synchronized (this.field1600) {
            var4 = (class233) this.field1600.method1163((byte) 110, (long) arg0);
        }
        int var5 = 20 % ((arg1 - 66) / 59);
        if (var4 != null) {
            return var4;
        }
        byte[] var6 = this.field1594.method2768(-20472, arg0, 3);
        class233 var7 = new class233();
        var7.field3235 = this;
        if (var6 != null) {
            var7.method1285(-26793, new class179(var6));
        }
        class210 var8 = this.field1600;
        synchronized (this.field1600) {
            this.field1600.method1172((long) arg0, 1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
    public final void method617(int arg0) {
        class210 var2 = this.field1600;
        synchronized (this.field1600) {
            this.field1600.method1165((byte) 118);
        }
        field1595++;
        if (arg0 != 70) {
            this.method616(108, 78);
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V")
    public final void method618(int arg0) {
        if (arg0 != 18) {
            field1601 = -92;
        }
        class210 var2 = this.field1600;
        synchronized (this.field1600) {
            this.field1600.method1169(1076);
        }
        field1593++;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)V")
    public static final void method619(byte arg0) {
        if (arg0 == 114) {
            field1598++;
            if (class355.field5092 != 3) {
                class232.field3220 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lci;ILg;Lg;)V")
    public class129(class421 arg0, int arg1, class470 arg2, class470 arg3) {
        this.field1592 = arg3;
        this.field1594 = arg2;
        this.field1594.method2755(-116, 3);
    }
}
