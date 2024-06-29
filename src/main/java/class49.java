import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class49 {

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "Lqd;")
    public static class40 field943 = class147.method1106("Bitte entfernen Sie ", (byte) -116);

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "Lqd;")
    public static class40 field946 = class147.method1106("(Udns", (byte) -101);

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "Lqd;")
    public static class40 field947 = class147.method1106("(U (X", (byte) -112);

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "Z")
    public static boolean field952 = false;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "J")
    public static long field950;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Ljh;")
    public static class259 field945;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "[Lrb;")
    public static class213[] field949;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V", line = 8)
    public static final void method432(int arg0) {
        int var1 = 0;
        field948++;
        if (arg0 != 664) {
            field950 = 7L;
        }
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class110.method828(var3, class93.field1690, 4, var1, var2, true)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V", line = 56)
    public static final void method433(int arg0) {
        field942++;
        for (class116 var1 = (class116) class265.field4445.method1971(100); var1 != null; var1 = (class116) class265.field4445.method1967(100)) {
            class147 var2 = var1.field1994;
            if (class160.field2671 != var2.field2468 || class256.field4266 > var2.field2471) {
                var1.method2095(0);
            } else if (class256.field4266 >= var2.field2447) {
                if (var2.field2445 > 0) {
                    class42 var3 = class91.field1656[var2.field2445 - 1];
                    if (var3 != null && var3.field1531 >= 0 && var3.field1531 < 13312 && var3.field1497 >= 0 && var3.field1497 < 13312) {
                        var2.method1111(class256.field4266, arg0 ^ 0xFFFFA764, var3.field1497, var3.field1531, class293.method2012(var2.field2468, var3.field1497, 0, var3.field1531) - var2.field2463);
                    }
                }
                if (var2.field2445 < 0) {
                    int var4 = -var2.field2445 - 1;
                    class258 var5;
                    if (class289.field4842 == var4) {
                        var5 = class255.field4233;
                    } else {
                        var5 = class298.field4979[var4];
                    }
                    if (var5 != null && var5.field1531 >= 0 && var5.field1531 < 13312 && var5.field1497 >= 0 && var5.field1497 < 13312) {
                        var2.method1111(class256.field4266, -102, var5.field1497, var5.field1531, class293.method2012(var2.field2468, var5.field1497, 0, var5.field1531) - var2.field2463);
                    }
                }
                var2.method1110(class189.field3059, (byte) 64);
                class208.method1470(class160.field2671, (int) var2.field2432, (int) var2.field2441, (int) var2.field2433, 60, var2, var2.field2474, -1L, false);
            }
        }
        if (arg0 != 22759) {
            field949 = (class213[]) null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)Lqd;", line = 113)
    public static final class40 method434(int arg0, int arg1) {
        field944++;
        if (arg0 < 100000) {
            return class153.method1192(new class40[] { class294.field4943, class276.method1927((byte) -85, arg0), class294.field4944 }, (byte) 15);
        } else {
            if (arg1 != -13313) {
                method435(56);
            }
            return arg0 >= 10000000 ? class153.method1192(new class40[] { class128.field2206, class276.method1927((byte) -112, arg0 / 1000000), class142.field2381, class294.field4944 }, (byte) -70) : class153.method1192(new class40[] { class96.field1725, class276.method1927((byte) -128, arg0 / 1000), class307.field5138, class294.field4944 }, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)V", line = 141)
    public static void method435(int arg0) {
        field946 = null;
        field949 = null;
        if (arg0 != -25955) {
            field947 = (class40) null;
        }
        field943 = null;
        field947 = null;
        field945 = null;
    }
}
