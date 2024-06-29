import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class240 {

    @OriginalMember(owner = "client!k", name = "e", descriptor = "J")
    public long field4045 = 0L;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "Lce;")
    public static class126 field4054 = class206.method1445(-7923, "Stufe: ");

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public int field4041;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public int field4044;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public int field4046;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public int field4047;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public int field4049;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public int field4051;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public int field4052;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "I")
    public int field4053;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public int field4055;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public int field4057;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public int field4058;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Lja;")
    public class114 field4043;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V", line = 12)
    public static final void method1644(byte arg0) {
        class48.method304();
        field4056++;
        if (arg0 != 67) {
            method1646((class134) null, -94);
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class94.field1475[var1].method171(54);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 54)
    public static void method1645(int arg0) {
        field4054 = null;
        if (arg0 <= 46) {
            field4054 = (class126) null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lbb;I)Lfc;", line = 71)
    public static final class105 method1646(class134 arg0, int arg1) {
        field4042++;
        return arg1 == 0 ? new class105(arg0.method931((byte) 91), arg0.method931((byte) 121), arg0.method931((byte) 123), arg0.method931((byte) 58), arg0.method949(20732), arg0.method949(20732), arg0.method948(arg1 ^ 0xFFFFFF86)) : (class105) null;
    }
}
