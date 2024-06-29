import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class105 {

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "Lcd;")
    public static class64 field1935 = class44.method335((byte) 71, "gr-Un:");

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "Lcd;")
    public static class64 field1939 = class44.method335((byte) 71, "Untersuchen");

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "Lcd;")
    public static class64 field1940 = class44.method335((byte) 71, ": ");

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "Lcd;")
    public static class64 field1937 = class44.method335((byte) 71, "<)4col> x");

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "[I")
    public static int[] field1943 = new int[1000];

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public int field1934;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public int field1938;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public int field1941;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "[I")
    public static int[] field1942;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILkh;)V", line = 11)
    private final void method770(int arg0, int arg1, class13 arg2) {
        field1936++;
        if (arg0 == arg1) {
            this.field1941 = arg2.method112((byte) 92);
            this.field1934 = arg2.method152((byte) -116);
            this.field1938 = arg2.method152((byte) -124);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BLkh;)V", line = 38)
    public final void method771(byte arg0, class13 arg1) {
        while (true) {
            int var3 = arg1.method152((byte) -117);
            if (var3 == 0) {
                int var4 = 50 % ((arg0 - 11) / 60);
                field1944++;
                return;
            }
            this.method770(1, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V", line = 75)
    public static final void method772(int arg0) {
        field1945++;
        try {
            if (arg0 <= 14) {
                field1943 = (int[]) null;
            }
            if (class238.field4072 == 1) {
                int var1 = class258.field4463.method1725(-74);
                if (var1 > 0 && class258.field4463.method1732(false)) {
                    int var2 = var1 - class17.field332;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class258.field4463.method1702(var2, (byte) 49);
                    return;
                }
                class258.field4463.method1730(80);
                class258.field4463.method1727(-2639);
                class76.field1437 = null;
                class62.field1212 = null;
                if (class124.field2242 == null) {
                    class238.field4072 = 0;
                } else {
                    class238.field4072 = 2;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class258.field4463.method1730(60);
            class76.field1437 = null;
            class238.field4072 = 0;
            class124.field2242 = null;
            class62.field1212 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V", line = 124)
    public static void method773(int arg0) {
        field1942 = null;
        field1935 = null;
        if (arg0 < -125) {
            field1937 = null;
            field1940 = null;
            field1939 = null;
            field1943 = null;
        }
    }
}
