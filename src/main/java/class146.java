import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public abstract class class146 extends class137 {

    @OriginalMember(owner = "client!bl", name = "G", descriptor = "[I")
    public static int[] field2295 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!bl", name = "K", descriptor = "I")
    public static int field2299 = 0;

    @OriginalMember(owner = "client!bl", name = "S", descriptor = "Ljava/lang/String;")
    public static String field2307 = "rating: ";

    @OriginalMember(owner = "client!bl", name = "H", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!bl", name = "I", descriptor = "I")
    public int field2297;

    @OriginalMember(owner = "client!bl", name = "J", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!bl", name = "L", descriptor = "I")
    public int field2300;

    @OriginalMember(owner = "client!bl", name = "M", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!bl", name = "N", descriptor = "I")
    public int field2302;

    @OriginalMember(owner = "client!bl", name = "O", descriptor = "I")
    public int field2303;

    @OriginalMember(owner = "client!bl", name = "P", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!bl", name = "R", descriptor = "I")
    public int field2306;

    @OriginalMember(owner = "client!bl", name = "T", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!bl", name = "U", descriptor = "I")
    public int field2309;

    @OriginalMember(owner = "client!bl", name = "V", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!bl", name = "Q", descriptor = "Lbl;")
    public static class146 field2305;

    @OriginalMember(owner = "client!bl", name = "W", descriptor = "Z")
    public static boolean field2311;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)V")
    public abstract void method1016(int arg0, int arg1);

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(IIIIII)V")
    public abstract void method1017(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(II)V")
    public static final void method1018(int arg0, int arg1) {
        class137.field2164.method1262(arg1, 2736);
        field2310++;
        if (arg0 > -68) {
            method1027((byte) 92);
        }
        class230.field3726.method1262(arg1, 2736);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIII)V")
    public abstract void method1019(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "(I)V")
    public static void method1020(int arg0) {
        field2307 = null;
        field2295 = null;
        field2305 = null;
        if (arg0 != 0) {
            method1021(101);
        }
    }

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "(I)V")
    public static final void method1021(int arg0) {
        field2304++;
        int var1 = class67.field1114;
        int var2 = class96.field1543;
        int var3 = class72.field1211 - 3;
        byte var4 = 20;
        int var5 = class169.field2756;
        if (class250.field3960 == null || field2305 == null) {
            if (class160.field2541.method1698((byte) 66, class120.field1915) && class160.field2541.method1698((byte) 118, class223.field3621)) {
                class250.field3960 = class177.method1300(-28957, class120.field1915, class160.field2541, 0);
                field2305 = class177.method1300(-28957, class223.field3621, class160.field2541, 0);
            } else {
                class127.method881(var5, var1, var2, var4, class239.field3827, 256 - class270.field4349);
            }
        }
        if (class250.field3960 != null && field2305 != null) {
            int var6 = (var2 - (field2305.field2303 * 2)) / class250.field3960.field2303;
            for (int var7 = 0; var7 < var6; var7++) {
                class250.field3960.method1026(class250.field3960.field2303 * var7 + field2305.field2303 + var5, var1);
            }
            field2305.method1026(var5, var1);
            field2305.method1016(var2 + var5 - field2305.field2303, var1);
        }
        class59.field967.method645(class211.field3347, var5 + 3, var1 + 14, class107.field1693, -1);
        class127.method881(var5, var1 + var4, var2, var3 - var4, class239.field3827, 256 - class270.field4349);
        int var8 = class77.field1281;
        int var9 = class269.field4344;
        for (int var10 = 0; var10 < class83.field1384; var10++) {
            int var18 = (class83.field1384 - var10 - 1) * 15 + var1 + var4 + 13;
            if (var9 > var5 && (var2 + var5) > var9 && (var18 - 13) < var8 && var18 + 3 > var8) {
                class127.method881(var5, var18 - 12, var2, 15, class103.field1658, 256 - class287.field4605);
            }
        }
        if ((class220.field3596 == null || class219.field3594 == null || class289.field4630 == null) && class160.field2541.method1698((byte) 115, class109.field1736) && class160.field2541.method1698((byte) 104, class193.field3129) && class160.field2541.method1698((byte) 99, class182.field3009)) {
            class220.field3596 = class177.method1300(-28957, class109.field1736, class160.field2541, 0);
            class219.field3594 = class177.method1300(-28957, class193.field3129, class160.field2541, 0);
            class289.field4630 = class177.method1300(arg0 - 28960, class182.field3009, class160.field2541, 0);
        }
        if (class220.field3596 != null && class219.field3594 != null && class289.field4630 != null) {
            int var11 = (var2 - (class289.field4630.field2303 * 2)) / class220.field3596.field2303;
            for (int var12 = 0; var12 < var11; var12++) {
                class220.field3596.method1026(class289.field4630.field2303 + var5 + (class220.field3596.field2303 * var12), -class220.field3596.field2297 + var1 - -var3);
            }
            int var13 = (var3 - var4 - class289.field4630.field2297) / class219.field3594.field2297;
            for (int var14 = 0; var14 < var13; var14++) {
                class219.field3594.method1026(var5, var1 + var4 + (class219.field3594.field2297 * var14));
                class219.field3594.method1016(var5 + var2 - class219.field3594.field2303, class219.field3594.field2297 * var14 + var1 + var4);
            }
            class289.field4630.method1026(var5, var1 + var3 - class289.field4630.field2297);
            class289.field4630.method1016(var2 + var5 - class289.field4630.field2303, var1 - -var3 + -class289.field4630.field2297);
        }
        for (int var15 = 0; var15 < class83.field1384; var15++) {
            int var16 = class107.field1693;
            int var17 = (class83.field1384 - var15 - 1) * 15 + var1 + var4 + 13;
            if (var9 > var5 && (var2 + var5) > var9 && (var17 - 13) < var8 && var17 + 3 > var8) {
                var16 = class39.field561;
            }
            class59.field967.method645(class112.method789(var15, -92), var5 + 3, var17, var16, 0);
        }
        class6.method33(class67.field1114, arg0 ^ arg0, class72.field1211, class169.field2756, class96.field1543);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
    public static final void method1022(byte arg0) {
        field2301++;
        class137.field2164.method1257(-119);
        int var1 = -66 / ((arg0 + 12) / 48);
        class230.field3726.method1257(-108);
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(II)V")
    public abstract void method1023(int arg0, int arg1);

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIII)V")
    public abstract void method1024(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BIIII)V")
    public final void method1025(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field2308++;
        int var6 = this.field2309 << 3;
        int var7 = this.field2300 << 3;
        int var8 = (arg1 << 4) + (var7 & 0xF);
        int var9 = (arg2 << 4) + (var6 & 0xF);
        if (arg0 != -92) {
            this.field2297 = 66;
        }
        this.method1017(var7, var6, var8, var9, arg4, arg3);
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(II)V")
    public abstract void method1026(int arg0, int arg1);

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)V")
    public static final void method1027(byte arg0) {
        field2298++;
        int var1 = 0;
        int var2 = 0;
        if (arg0 < 29) {
            field2307 = null;
        }
        while (var2 < 104) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class256.method1724(true, var1, var3, var2, class218.field3584, (byte) 73)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)V")
    public abstract void method1028(int arg0, int arg1, int arg2);
}
