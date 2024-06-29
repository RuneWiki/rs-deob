import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class238 {

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field3807 = 0;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "[[I")
    public static int[][] field3811 = new int[104][104];

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)Z")
    public static final boolean method1614(int arg0) {
        field3809++;
        if (arg0 != 20786) {
            method1614(-99);
        }
        try {
            if (class189.field2985 == 2) {
                if (class135.field1961 == null) {
                    class135.field1961 = class289.method1923(class63.field887, class182.field2887, class244.field3901);
                    if (class135.field1961 == null) {
                        return false;
                    }
                }
                if (class103.field1600 == null) {
                    class103.field1600 = new class256(class276.field4403, class67.field934);
                }
                if (class135.field1965.method1150(class5.field75, class135.field1961, 22050, -106, class103.field1600)) {
                    class135.field1965.method1173(-2);
                    class135.field1965.method1151(class249.field3996, (byte) 113);
                    class135.field1965.method1169(true, class281.field4456, class135.field1961);
                    class103.field1600 = null;
                    class63.field887 = null;
                    class135.field1961 = null;
                    class189.field2985 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class135.field1965.method1164(32623);
            class189.field2985 = 0;
            class103.field1600 = null;
            class63.field887 = null;
            class135.field1961 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
    public static void method1615(byte arg0) {
        field3811 = null;
        int var1 = 62 / ((-arg0 - 53) / 53);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([BI)Z")
    public static final boolean method1616(byte[] arg0, int arg1) {
        if (arg1 != 0) {
            return true;
        }
        field3810++;
        class25 var2 = new class25(arg0);
        int var3 = var2.method201(arg1 + 255);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method201(255) == 1;
        if (var4) {
            class31.method251((byte) 122, var2);
        }
        class140.method944(var2, true);
        return true;
    }
}
