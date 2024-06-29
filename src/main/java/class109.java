import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class109 {

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Llc;")
    public static class143 field1910 = class66.method374("Hierhin gehen", -1);

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Llc;")
    private static class143 field1913 = class66.method374("Tue", -1);

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "Llc;")
    private static class143 field1918 = class66.method374("Wed", -1);

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "Llc;")
    private static class143 field1916 = class66.method374("Mon", -1);

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Llc;")
    private static class143 field1914 = class66.method374("Fri", -1);

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Llc;")
    private static class143 field1919 = class66.method374("Sun", -1);

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Llc;")
    private static class143 field1912 = class66.method374("Sat", -1);

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "Llc;")
    private static class143 field1923 = class66.method374("Thu", -1);

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "[Llc;")
    public static class143[] field1920 = new class143[] { field1919, field1916, field1913, field1918, field1923, field1914, field1912 };

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Lgf;")
    public static class7 field1911;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "Lgf;")
    public static class7 field1915;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static void method654(int arg0) {
        field1911 = null;
        field1910 = null;
        field1912 = null;
        if (arg0 != 16) {
            field1910 = null;
        }
        field1923 = null;
        field1919 = null;
        field1914 = null;
        field1916 = null;
        field1918 = null;
        field1915 = null;
        field1920 = null;
        field1913 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)Ldd;")
    public static final class218 method655(int arg0, int arg1) {
        field1921++;
        if (arg0 != -19850) {
            method654(25);
        }
        class218 var2 = (class218) class186.field3380.method826((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class14.field265.method41(-18328, 16, arg1);
        class218 var4 = new class218();
        if (var3 != null) {
            var4.method1494((byte) 108, new class190(var3));
        }
        class186.field3380.method827(arg0 ^ 0x4D8B, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)V")
    public static final void method656(int arg0, int arg1) {
        field1922++;
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class166.method1092(9);
        } else if (arg0 == 2) {
            class278.method1835(false);
        } else {
            throw new RuntimeException();
        }
        int var2 = 124 % ((arg1 + 76) / 39);
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
    public static final void method657(int arg0) {
        if (arg0 != -1433) {
            return;
        }
        field1917++;
        class192 var1 = class229.field4189;
        synchronized (class229.field4189) {
            class33.field558++;
            class31.field493 = class66.field1229;
            if (class134.field2353 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class128.field2264[var2] = false;
                }
                class134.field2353 = class7.field145;
            } else {
                while (class7.field145 != class134.field2353) {
                    int var3 = class254.field4563[class7.field145];
                    class7.field145 = class7.field145 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class128.field2264[var3] = true;
                    } else {
                        class128.field2264[~var3] = false;
                    }
                }
            }
            class66.field1229 = class255.field4578;
        }
    }
}
