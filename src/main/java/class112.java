import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class112 {

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "[I")
    public static int[] field1956 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static volatile int field1957 = -1;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public static int field1965 = -2;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "Lve;")
    public static class184 field1960 = new class184(50);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public int field1951;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public int field1959;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public int field1961;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public int field1964;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "Ljd;")
    public class85 field1953;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "Z")
    public boolean field1962;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    public static void method761(int arg0) {
        field1960 = null;
        if (arg0 != -1) {
            field1965 = 83;
        }
        field1956 = null;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)Lee;")
    public static final class266 method762(int arg0) {
        byte[] var1 = class178.field3060[0];
        if (arg0 != 17562) {
            field1965 = -90;
        }
        int var2 = class30.field443[0] * class244.field4165[0];
        class266 var5;
        if (class37.field577[0]) {
            byte[] var6 = class122.field2139[0];
            int[] var7 = new int[var2];
            for (int var8 = 0; var8 < var2; var8++) {
                var7[var8] = class75.method528(class2.field20[class135.method899(255, var1[var8])], class135.method899(var6[var8], 255) << 24);
            }
            var5 = new class9(class251.field4331, class229.field3961, class246.field4200[0], class121.field2134[0], class30.field443[0], class244.field4165[0], var7);
        } else {
            int[] var3 = new int[var2];
            for (int var4 = 0; var4 < var2; var4++) {
                var3[var4] = class2.field20[class135.method899(255, var1[var4])];
            }
            var5 = new class266(class251.field4331, class229.field3961, class246.field4200[0], class121.field2134[0], class30.field443[0], class244.field4165[0], var3);
        }
        field1952++;
        class47.method322(-29493);
        return var5;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V")
    public static final void method763(int arg0) {
        field1963++;
        while (class189.field3249.method492(class85.field1593, true) >= 27) {
            int var1 = class189.field3249.method490(0, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class194.field3320[var1] == null) {
                class194.field3320[var1] = new class17();
                var2 = true;
            }
            class17 var3 = class194.field3320[var1];
            class137.field2380[class44.field775++] = var1;
            var3.field1009 = class151.field2555;
            if (var3.field247 != null && var3.field247.method1801(-128)) {
                class154.method1011(var3, (byte) 126);
            }
            int var4 = class189.field3249.method490(0, 1);
            if (var4 == 1) {
                class36.field564[class241.field4151++] = var1;
            }
            int var5 = class189.field3249.method490(0, 5);
            int var6 = class43.field738[class189.field3249.method490(0, 3)];
            if (var2) {
                var3.field1047 = var3.field1036 = var6;
            }
            if (var5 > 15) {
                var5 -= 32;
            }
            var3.field247 = class55.method370(true, class189.field3249.method490(0, 14));
            int var7 = class189.field3249.method490(0, 5);
            int var8 = class189.field3249.method490(0, 1);
            if (var7 > 15) {
                var7 -= 32;
            }
            var3.method389(var3.field247.field4700, (byte) -82);
            var3.field1014 = var3.field247.field4666;
            var3.field1033 = var3.field247.field4651;
            var3.field1011 = var3.field247.field4678;
            var3.field1013 = var3.field247.field4676;
            var3.field1041 = var3.field247.field4711;
            var3.field1006 = var3.field247.field4712;
            var3.field1024 = var3.field247.field4661;
            if (var3.field1033 == 0) {
                var3.field1036 = 0;
            }
            var3.field1049 = var3.field247.field4681;
            var3.method386(var3.method311((byte) 70), class22.field308.field1066[0] + var5, var8 == 1, (byte) 127, class22.field308.field1043[0] + var7);
            if (var3.field247.method1801(-128)) {
                class1.method3(var3, class116.field2066, var3.field1066[0], 0, 128, (class44) null, (class199) null, var3.field1043[0]);
            }
        }
        class189.field3249.method487(-56);
        if (arg0 <= 107) {
            method762(51);
        }
    }
}
