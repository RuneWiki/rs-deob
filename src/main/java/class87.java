import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class87 {

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
    public static int field1227 = 0;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "[Lsi;")
    public static class320[] field1229 = new class320[29];

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "Lae;")
    public static class275 field1228 = new class275(8);

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z)V")
    public static void method615(boolean arg0) {
        if (arg0) {
            field1227 = -15;
        }
        field1229 = null;
        field1228 = null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)Lvf;")
    public static final class152 method616(byte arg0) {
        if (arg0 != 76) {
            method617((byte) -66, (class43) null);
        }
        field1225++;
        try {
            return (class152) Class.forName("bj").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLcd;)V")
    public static final void method617(byte arg0, class43 arg1) {
        field1226++;
        if (arg0 > -77) {
            field1229 = null;
        }
        for (class365 var2 = (class365) class22.field291.method332(-2130841184); var2 != null; var2 = (class365) class22.field291.method343((byte) -114)) {
            if (var2.field5277 == arg1) {
                if (var2.field5275 != null) {
                    class156.field2122.method2502(var2.field5275);
                    var2.field5275 = null;
                }
                var2.method322(11);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "()V")
    public static final void method618() {
        if (class92.field1299 != null) {
            for (int var0 = 0; var0 < class92.field1299.length; var0++) {
                for (int var1 = 0; var1 < class104.field1436; var1++) {
                    for (int var2 = 0; var2 < class214.field2858; var2++) {
                        if (class92.field1299[var0][var1][var2] != null) {
                            class92.field1299[var0][var1][var2].method1554(-10061);
                        }
                        class92.field1299[var0][var1][var2] = null;
                    }
                }
            }
        }
        class92.field1299 = null;
        class265.field3846 = null;
        if (class99.field1387 != null) {
            for (int var3 = 0; var3 < class99.field1387.length; var3++) {
                for (int var4 = 0; var4 < class104.field1436; var4++) {
                    for (int var5 = 0; var5 < class214.field2858; var5++) {
                        if (class99.field1387[var3][var4][var5] != null) {
                            class99.field1387[var3][var4][var5].method1554(-10061);
                        }
                        class99.field1387[var3][var4][var5] = null;
                    }
                }
            }
        }
        class99.field1387 = null;
        class191.field2557 = null;
        class213.field2852 = null;
        class12.field205 = null;
        class395.field5826 = 0;
        if (class194.field2604 != null) {
            for (int var6 = 0; var6 < class395.field5826; var6++) {
                class194.field2604[var6] = null;
            }
        }
        if (class163.field2183 != null) {
            for (int var7 = 0; var7 < class397.field5914; var7++) {
                class163.field2183[var7] = null;
            }
            class397.field5914 = 0;
        }
        if (class75.field1078 != null) {
            for (int var8 = 0; var8 < class339.field4888; var8++) {
                class75.field1078[var8] = null;
            }
            for (int var9 = 0; var9 < class180.field2380; var9++) {
                for (int var10 = 0; var10 < class104.field1436; var10++) {
                    for (int var11 = 0; var11 < class214.field2858; var11++) {
                        class23.field304[var9][var10][var11] = 0;
                    }
                }
            }
            class339.field4888 = 0;
        }
        class246.field3324 = null;
        class33.method219((byte) 90);
        class385.field5587.method998((byte) 91);
        class328.field4782 = null;
        class282.field4111 = null;
    }
}
