import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class94 extends class8 {

    @OriginalMember(owner = "client!he", name = "X", descriptor = "Ljava/lang/Object;")
    private Object field1535;

    @OriginalMember(owner = "client!he", name = "V", descriptor = "Ln;")
    public static class282 field1533 = new class282(64);

    @OriginalMember(owner = "client!he", name = "Y", descriptor = "I")
    public static volatile int field1536 = 0;

    @OriginalMember(owner = "client!he", name = "ab", descriptor = "Lsc;")
    public static class259 field1538 = new class259(16);

    @OriginalMember(owner = "client!he", name = "db", descriptor = "Lna;")
    public static class26 field1541 = class69.method505("", (byte) -119);

    @OriginalMember(owner = "client!he", name = "eb", descriptor = "[I")
    public static int[] field1542 = new int[1000];

    @OriginalMember(owner = "client!he", name = "bb", descriptor = "Lug;")
    public static class305 field1539 = new class305();

    @OriginalMember(owner = "client!he", name = "gb", descriptor = "Lna;")
    public static class26 field1544 = class69.method505("www", (byte) -120);

    @OriginalMember(owner = "client!he", name = "fb", descriptor = "Ln;")
    public static class282 field1543 = new class282(30);

    @OriginalMember(owner = "client!he", name = "U", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!he", name = "W", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!he", name = "Z", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!he", name = "cb", descriptor = "Lve;")
    public static class266 field1540;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(II)V", line = 4)
    public static final void method710(int arg0, int arg1) {
        if (arg0 < -78) {
            field1534++;
            class120 var2 = class293.method2059(4, 7, arg1);
            var2.method823(true);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)Ljava/lang/Object;", line = 17)
    public final Object method53(boolean arg0) {
        if (arg0) {
            field1537++;
            return this.field1535;
        } else {
            return (Object) null;
        }
    }

    @OriginalMember(owner = "client!he", name = "f", descriptor = "(I)V", line = 28)
    public static void method711(int arg0) {
        field1541 = null;
        field1542 = null;
        field1539 = null;
        field1538 = null;
        field1544 = null;
        field1533 = null;
        field1540 = null;
        if (arg0 > -101) {
            method711(-94);
        }
        field1543 = null;
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(I)Z", line = 49)
    public final boolean method54(int arg0) {
        if (arg0 == -22358) {
            field1532++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 65)
    public class94(Object arg0) {
        this.field1535 = arg0;
    }
}
