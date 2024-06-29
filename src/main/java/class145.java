import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class145 {

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public int field1930 = 1;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "Lpw;")
    public static class507 field1931;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "C")
    public char field1929;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "[Laa;")
    public static class341[] field1933;

    static {
        new class446("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
        field1931 = new class507();
        field1932 = 1;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V", line = 4)
    public static void method964(boolean arg0) {
        if (arg0) {
            method964(true);
        }
        field1933 = null;
        field1931 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBLnj;)V", line = 17)
    private final void method965(int arg0, byte arg1, class164 arg2) {
        field1928++;
        if (arg0 == 1) {
            this.field1929 = class165.method1122((byte) -34, arg2.method1088((byte) -91));
        } else if (arg0 == 2) {
            this.field1930 = 0;
        }
        if (arg1 < 6) {
            this.field1929 = '}';
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lnj;I)V", line = 43)
    public final void method966(class164 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1087(false);
            if (var3 == 0) {
                field1927++;
                if (arg1 != -2) {
                    this.field1930 = 74;
                    return;
                }
                return;
            }
            this.method965(var3, (byte) 47, arg0);
        }
    }
}
