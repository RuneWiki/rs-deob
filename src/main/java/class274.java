import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class274 {

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "Lud;")
    public static class279 field4870 = class130.method1024("comp-Btence ", 255);

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "Lud;")
    public static class279 field4872 = class130.method1024(" )2> <col=ff9040>", 255);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field4867 = 64;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "Lud;")
    public static class279 field4877 = class130.method1024("d-Broulement:", 255);

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Lnk;")
    public static class13 field4873;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "Lok;")
    public static class149 field4869;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "Ljava/lang/String;")
    public static String field4876;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1943(int arg0) {
        int[] var1 = new int[class321.field5614];
        field4871++;
        int var2 = 0;
        for (int var3 = 0; var3 < class321.field5614; var3++) {
            class157 var4 = class220.method1612(-2254, var3);
            if (var4.field2876 >= 0 || var4.field2830 >= 0) {
                var1[var2++] = var3;
            }
        }
        class130.field2376 = new int[var2];
        int var5 = 0;
        if (arg0 != 3156) {
            method1946((byte) -85);
        }
        while (var5 < var2) {
            class130.field2376[var5] = var1[var5];
            var5++;
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V", line = 41)
    public static final void method1944(int arg0) {
        field4874++;
        int var1 = (class72.field1420.field86 >> 7) + class112.field2058;
        class18.field543 = 0;
        int var2 = (class72.field1420.field79 >> 7) + class12.field396;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class18.field543 = 1;
        }
        if (var1 >= arg0 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class18.field543 = 1;
        }
        if (class18.field543 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class18.field543 = 0;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)Lud;", line = 102)
    public static final class279 method1945(byte arg0) {
        class279 var1;
        if (class98.field1839 == 1 && class194.field3488 < 2) {
            var1 = class115.method929(new class279[] { class8.field334, class60.field1258, class141.field2564, class73.field1447 }, (byte) 60);
        } else if (class38.field848 && class194.field3488 < 2) {
            var1 = class115.method929(new class279[] { class244.field4332, class60.field1258, class73.field1429, class73.field1447 }, (byte) 60);
        } else if (class243.field4321 && class284.field5075[81] && class194.field3488 > 2) {
            var1 = class24.method213(class194.field3488 - 2, true);
        } else {
            var1 = class24.method213(class194.field3488 - 1, true);
        }
        if (arg0 >= -56) {
            return (class279) null;
        }
        if (class194.field3488 > 2) {
            var1 = class115.method929(new class279[] { var1, class245.field4353, class191.method1447(5, class194.field3488 - 2), class232.field4066 }, (byte) 60);
        }
        field4868++;
        return var1;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V", line = 141)
    public static void method1946(byte arg0) {
        field4869 = null;
        field4872 = null;
        if (arg0 >= -56) {
            method1943(-43);
        }
        field4873 = null;
        field4876 = null;
        field4870 = null;
        field4877 = null;
    }
}
