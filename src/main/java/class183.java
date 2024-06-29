import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class183 {

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2842 = "Select";

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field2844 = -1;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "[Lid;")
    public static class279[] field2853 = new class279[50];

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
    public static int field2854 = 0;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "Ljava/lang/String;")
    public static String field2855 = "flash1:";

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public int field2836;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public int field2837;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public int field2840;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public int field2841;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public int field2845;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public int field2848;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public int field2852;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "[B")
    public byte[] field2843;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "[B")
    public byte[] field2850;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "[I")
    public static int[] field2846;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)Ltd;", line = 28)
    public static final class211 method1268(int arg0) {
        field2849++;
        if (arg0 != 0) {
            field2842 = (String) null;
        }
        class211 var1 = (class211) class246.field3911.method1350(0);
        if (var1 != null) {
            var1.method1131(arg0 ^ 0x8);
            var1.method2148((byte) 109);
            return var1;
        }
        class211 var2;
        do {
            var2 = (class211) class11.field121.method1350(0);
            if (var2 == null) {
                return null;
            }
            if (var2.method1438((byte) 78) > class19.method122(-12169)) {
                return null;
            }
            var2.method1131(arg0 ^ 0x8);
            var2.method2148((byte) 116);
        } while ((var2.field5011 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V", line = 83)
    public static final void method1269(int arg0) {
        class180.field2792.method644((byte) -126);
        if (arg0 >= 77) {
            field2851++;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZI)V", line = 95)
    public static final void method1270(boolean arg0, int arg1) {
        class88.field1271 = (int[][][]) null;
        class88.field1275 = (byte[][][]) null;
        class88.field1280 = (byte[][][]) null;
        class65.field957 = null;
        class88.field1281 = null;
        class88.field1272 = (byte[][][]) null;
        class88.field1268 = (byte[][][]) null;
        class88.field1266 = (int[][][]) null;
        if (arg0 && class88.field1260 != null) {
            class53.field803 = class88.field1260.field4524;
        } else {
            class53.field803 = -1;
        }
        field2847++;
        class6.field79 = null;
        class88.field1260 = null;
        class334.field5425 = 0;
        class88.field1276 = (byte[][][]) null;
        class88.field1258.method1354((byte) -43);
        class40.field610 = null;
        class196.field3015 = null;
        class352.field5615 = null;
        class355.field5630 = null;
        class88.field1255 = null;
        class339.field5460 = null;
        class256.field4056 = null;
        class50.field724 = null;
        class223.field3436 = null;
        class32.field487 = null;
        class99.field1447 = null;
        class32.field488 = arg1;
        class179.field2785 = -1;
        class286.method2020(true);
        class91.field1311 = null;
        class48.field689 = null;
        class47.field686 = null;
        class75.method512(15631, 128, 64);
        class340.method2399((byte) 24, 64);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lnm;B)V", line = 152)
    public static final void method1271(class221 arg0, byte arg1) {
        field2838++;
        int var2 = 78 / ((arg1 + 19) / 58);
        class307.field5007 = arg0.method1510("runes", 0);
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V", line = 162)
    public static void method1272(int arg0) {
        field2855 = null;
        field2853 = null;
        field2842 = null;
        field2846 = null;
        if (arg0 <= 51) {
            field2844 = 87;
        }
    }
}
