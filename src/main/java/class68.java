import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class68 {

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "[I")
    public static int[] field1306 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "Z")
    public static boolean field1310 = false;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "Ltg;")
    public static class184 field1312 = class135.method812("Versteckt", 3);

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "Ltg;")
    public static class184 field1308 = class135.method812("gelb:", 3);

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "Lrh;")
    public static class167 field1305;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "[I")
    public static int[] field1313;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
    public static final void method396(byte arg0) {
        field1311++;
        int var1 = class52.field955;
        int var2 = class125.field2256;
        int var3 = class113.field2043;
        int var4 = class67.field1302;
        int var5 = 6116423;
        class4.method27(var1, var3, var2, var4, var5);
        class4.method27(var1 + 1, var3 + 1, var2 - 2, 16, 0);
        class4.method18(var1 + 1, var3 - -18, var2 - 2, var4 - 19, 0);
        class125.field2261.method1366(class150.field2699, var1 + 3, var3 + 14, var5, -1);
        int var6 = class39.field736;
        int var7 = class195.field3793;
        if (arg0 != 98) {
            return;
        }
        for (int var8 = 0; var8 < class133.field2404; var8++) {
            int var9 = (class133.field2404 - var8 - 1) * 15 + var3 + 31;
            int var10 = 16777215;
            if (var6 > var1 && var6 < var1 + var2 && var9 - 13 < var7 && var9 + 3 > var7) {
                var10 = 16776960;
            }
            class125.field2261.method1366(class210.method1333(false, var8), var1 + 3, var9, var10, 0);
        }
        class25.method166(class125.field2256, class67.field1302, class52.field955, class113.field2043, 21157);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V")
    public static void method397(boolean arg0) {
        field1305 = null;
        field1306 = null;
        if (arg0) {
            field1310 = true;
        }
        field1312 = null;
        field1313 = null;
        field1308 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
    public static final void method398(int arg0) {
        field1314++;
        int[] var1 = new int[class12.field216];
        int var2 = 0;
        for (int var3 = arg0; var3 < class12.field216; var3++) {
            class122 var5 = class60.method336(var3, arg0 + 10);
            if (var5.field2225 >= 0 || var5.field2180 >= 0) {
                var1[var2++] = var3;
            }
        }
        class200.field3883 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class200.field3883[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)V")
    public static final void method399(byte arg0) {
        class55.field970 = false;
        class36.field679 = false;
        int var1 = 23 / ((arg0 - 29) / 57);
        field1307++;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZZZ)I")
    public static final int method400(boolean arg0, boolean arg1, boolean arg2) {
        field1309++;
        int var3 = 0;
        if (arg1) {
            var3 += class73.field1370 + class6.field113;
        }
        if (arg2) {
            return 3;
        } else {
            if (arg0) {
                var3 += class146.field2638 + class132.field2394;
            }
            return var3;
        }
    }
}
