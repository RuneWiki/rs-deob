import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class98 {

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Ltg;")
    public static class184 field1836 = class135.method812("k", 3);

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "[I")
    public static int[] field1837 = new int[4000];

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field1838 = 0;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "Ltg;")
    public static class184 field1835 = class135.method812("null", 3);

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Ltg;")
    private static class184 field1842 = class135.method812("Loading)3)3)3", 3);

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "Ltg;")
    public static class184 field1840 = field1842;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "Lpf;")
    public static class147 field1841;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static void method616(byte arg0) {
        field1842 = null;
        field1841 = null;
        field1840 = null;
        field1835 = null;
        field1836 = null;
        field1837 = null;
        if (arg0 <= 8) {
            method616((byte) -38);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BII)Ltg;")
    public static final class184 method617(byte arg0, int arg1, int arg2) {
        field1839++;
        int var3 = arg2 - arg1;
        if (var3 < -9) {
            return class5.field78;
        } else if (var3 < -6) {
            return class11.field194;
        } else if (var3 < -3) {
            return class76.field1400;
        } else if (var3 < 0) {
            return class174.field3297;
        } else if (var3 > 9) {
            return class58.field1074;
        } else if (var3 > 6) {
            return class46.field873;
        } else if (var3 > 3) {
            return class106.field1926;
        } else if (var3 > 0) {
            return class91.field1695;
        } else {
            if (arg0 > -14) {
                method617((byte) 84, -58, 40);
            }
            return class116.field2099;
        }
    }
}
