import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class79 {

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field1408 = 255;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field1412 = 2;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public int field1407;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public int field1410;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public int field1411;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "Lrd;")
    public static class158 field1414;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIBLdd;)V")
    public static final void method398(int arg0, int arg1, int arg2, byte arg3, class34 arg4) {
        if (arg3 <= 115) {
            return;
        }
        field1413++;
        if (class106.field1940 == arg4 || class100.field1841 >= 400) {
            return;
        }
        class93 var5;
        if (arg4.field564 == 0) {
            var5 = class203.method1321(new class93[] { arg4.field550, class207.method1347((byte) -68, class106.field1940.field533, arg4.field533), class178.field3546, class76.field1379, class67.method357((byte) -122, arg4.field533), class16.field286 }, 110);
        } else {
            var5 = class203.method1321(new class93[] { arg4.field550, class178.field3546, class12.field196, class67.method357((byte) -113, arg4.field564), class16.field286 }, -55);
        }
        if (class144.field2800 == 1) {
            class137.method863(class154.field3029, 17001, 49, arg2, class203.method1321(new class93[] { class108.field1957, class18.field294, var5 }, 117), arg1, arg0);
            class82.field1518++;
        } else if (!class103.field1905) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class148.field2846[var6] != null) {
                    class81.field1465++;
                    short var7 = 0;
                    if (class148.field2846[var6].method523(121, class152.field2948)) {
                        if (class106.field1940.field533 < arg4.field533) {
                            var7 = 2000;
                        }
                        if (class106.field1940.field537 != 0 && arg4.field537 != 0) {
                            if (class106.field1940.field537 == arg4.field537) {
                                var7 = 2000;
                            } else {
                                var7 = 0;
                            }
                        }
                    } else if (class204.field3938[var6]) {
                        var7 = 2000;
                    }
                    boolean var8 = false;
                    int var9 = class100.field1848[var6] + var7;
                    class137.method863(class148.field2846[var6], 17001, var9, arg2, class203.method1321(new class93[] { class106.field1934, var5 }, 0), arg1, arg0);
                }
            }
        } else if ((class75.field1360 & 0x8) == 8) {
            class137.method863(class207.field4040, 17001, 31, arg2, class203.method1321(new class93[] { class122.field2270, class18.field294, var5 }, 90), arg1, arg0);
            class81.field1485++;
        }
        for (int var10 = 0; var10 < class100.field1841; var10++) {
            if (class152.field2944[var10] == 17) {
                class35.field575[var10] = class203.method1321(new class93[] { class106.field1934, var5 }, 113);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
    public static void method399(byte arg0) {
        field1414 = null;
        if (arg0 < 5) {
            field1408 = 123;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljg;Z)V")
    public static final void method400(class89 arg0, boolean arg1) {
        field1409++;
        class197.field3842 = arg0;
        if (arg1) {
            field1412 = -85;
        }
    }
}
