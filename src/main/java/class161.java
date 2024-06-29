import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class161 extends class60 {

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "Lkja;")
    public static class686 field1985 = new class686();

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!ho", name = "p", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!ho", name = "q", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(BI)V")
    public final void method407(byte arg0, int arg1) {
        int var3 = 57 % ((28 - arg0) / 50);
        super.field799 = arg1;
        ++field1991;
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(ILhd;)V")
    public class161(int arg0, class773 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)V")
    public static final void method1129(byte arg0, String arg1, String arg2) {
        ++field1989;
        if (arg2.length() <= 320) {
            if (class62.method534(7900)) {
                if (class436.field5748 != null) {
                    class436.field5748.method768(0);
                    class436.field5748 = null;
                }
                if (arg0 == -55) {
                    class331.method1966(-8324);
                    class742.field10333 = arg2;
                    class710.field9967 = arg1;
                    class48.method454(5, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)I")
    public final int method1130(int arg0) {
        ++field1988;
        if (arg0 != 0) {
            field1985 = null;
        }
        return super.field799;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIBI)V")
    public static final void method1131(int arg0, int arg1, byte arg2, int arg3) {
        class124.field1585 = new byte[arg1][arg0][arg3];
        if (arg2 > 124) {
            ++field1990;
        }
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(Z)V")
    public static final void method1132(boolean arg0) {
        class390.field5065.method61(class394.field5103, class173.field2066, class369.field4592);
        if (arg0) {
            ++field1986;
        }
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(II)I")
    public final int method406(int arg0, int arg1) {
        ++field1984;
        return arg0 != 0 ? 27 : 3;
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lhd;)V")
    public class161(class773 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(B)V")
    public final void method409(byte arg0) {
        if (arg0 > -27) {
            this.method406(-105, 2);
        }
        super.field799 = this.method405(false);
        ++field1992;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)I")
    public final int method405(boolean arg0) {
        ++field1987;
        if (arg0) {
            this.method405(true);
        }
        return super.field798.method4287((byte) 84) ? 1 : 0;
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(B)V")
    public static void method1133(byte arg0) {
        field1985 = null;
        if (arg0 != -1) {
            method1132(false);
        }
    }
}
