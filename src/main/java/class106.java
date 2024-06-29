import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class106 extends RuntimeException {

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1904;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "Ljava/lang/String;")
    public String field1897;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "Z")
    public static boolean field1898 = false;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "Loh;")
    public static class258 field1899 = class153.method1046("gleiten:", 96);

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "[F")
    public static float[] field1895 = new float[4];

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "[I")
    public static int[] field1900;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljm;I)V", line = 18)
    public static final void method790(class179 arg0, int arg1) {
        field1903++;
        long var2 = 0L;
        int var4 = -1;
        if (arg0.field3202 == 0) {
            var2 = class261.method1834(arg0.field3198, arg0.field3208, arg0.field3207);
        }
        int var5 = 0;
        int var6 = 0;
        if (arg0.field3202 == 1) {
            var2 = class29.method218(arg0.field3198, arg0.field3208, arg0.field3207);
        }
        if (arg0.field3202 == 2) {
            var2 = class172.method1158(arg0.field3198, arg0.field3208, arg0.field3207);
        }
        if (~arg0.field3202 == arg1) {
            var2 = class293.method2055(arg0.field3198, arg0.field3208, arg0.field3207);
        }
        if (var2 != 0L) {
            var5 = ((int) var2 & 0x7D8DC) >> 14;
            var4 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
            var6 = ((int) var2 & 0x3FF627) >> 20;
        }
        arg0.field3206 = var6;
        arg0.field3203 = var4;
        arg0.field3196 = var5;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BI)V", line = 57)
    public static final void method791(byte arg0, int arg1) {
        field1901++;
        if (class280.field4818 == arg1) {
            return;
        }
        if (arg0 != 8) {
            field1894 = -45;
        }
        if (class280.field4818 == 0) {
            class208.method1371(32064);
        }
        if (arg1 == 40) {
            class277.method1942((byte) 118);
        }
        if (arg1 != 40 && class50.field758 != null) {
            class50.field758.method1122(arg0 ^ 0xFFFFFFF7);
            class50.field758 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class114.field1995 = 0;
            class201.field3478 = 1;
            class166.field2813 = 0;
            client.field607 = 1;
            class260.field4522 = 0;
            class45.method375((byte) -107);
        }
        if (arg1 == 5) {
            class283.method1985((byte) -62, class34.field395);
        } else {
            class233.method1557(-25523);
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        boolean var3 = class280.field4818 == 5 || class280.field4818 == 10 || class280.field4818 == 28;
        if (var2 != var3) {
            if (var2) {
                class2.field36 = class181.field3247;
                if (class244.field4233 == 0) {
                    class233.method1556(2, -1);
                } else {
                    class155.method1056(false, class95.field1667, 0, -121, 2, class181.field3247, 255);
                }
                class287.field4944.method1959(false, 0);
            } else {
                class233.method1556(2, -1);
                class287.field4944.method1959(true, 0);
            }
        }
        if (class257.field4390 && (arg1 == 25 || arg1 == 28 || arg1 == 40)) {
            class257.method1740();
        }
        class280.field4818 = arg1;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V", line = 133)
    public static void method792(int arg0) {
        field1899 = null;
        if (arg0 != -29) {
            method791((byte) -108, -83);
        }
        field1900 = null;
        field1895 = null;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 170)
    public class106(Throwable arg0, String arg1) {
        this.field1904 = arg0;
        this.field1897 = arg1;
    }
}
