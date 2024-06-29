import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class115 extends class314 {

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "Lud;")
    public static class279 field2095 = class130.method1024("Forced tweening ENABLED(Q", 255);

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "Lud;")
    public static class279 field2102 = class130.method1024("Chargement des fichiers config )2 ", 255);

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "[I")
    public static int[] field2100 = new int[100];

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "Lud;")
    public static class279 field2098 = class130.method1024(": ", 255);

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "Lud;")
    public static class279 field2104 = class130.method1024("(U(Y", 255);

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public static int field2093 = -1;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "Lud;")
    public static class279 field2099 = class130.method1024("Polices charg-Bes", 255);

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "J")
    public long field2103;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "Lnh;")
    public class115 field2094;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "Lnh;")
    public class115 field2105;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "Lok;")
    public static class149 field2101;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "[I")
    public static int[] field2097;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(B)V", line = 9)
    public final void method926(byte arg0) {
        field2090++;
        if (this.field2094 == null) {
            return;
        }
        this.field2094.field2105 = this.field2105;
        this.field2105.field2094 = this.field2094;
        if (arg0 == -8) {
            this.field2105 = null;
            this.field2094 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(B)V", line = 27)
    public static void method927(byte arg0) {
        field2104 = null;
        field2102 = null;
        field2099 = null;
        field2097 = null;
        int var1 = 46 % ((arg0 + 53) / 39);
        field2098 = null;
        field2101 = null;
        field2100 = null;
        field2095 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLud;)V", line = 48)
    public static final void method928(byte arg0, class279 arg1) {
        field2092++;
        int var2 = 47 % ((-arg0 - 67) / 43);
        if (class306.field5437 == null) {
            return;
        }
        int var3 = 0;
        long var4 = arg1.method2013(122);
        if (var4 == 0L) {
            return;
        }
        while (class306.field5437.length > var3 && class306.field5437[var3].field5539 != var4) {
            var3++;
        }
        if (var3 < class306.field5437.length && class306.field5437[var3] != null) {
            class314.field5534.method1634(200, 0);
            class21.field584++;
            class314.field5534.method490(class306.field5437[var3].field5539, 14886);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([Lud;B)Lud;", line = 83)
    public static final class279 method929(class279[] arg0, byte arg1) {
        if (arg1 != 60) {
            field2095 = (class279) null;
        }
        field2096++;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class161.method1272(40, arg0, 0, arg0.length);
    }
}
