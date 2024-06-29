import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public abstract class class84 extends class7 {

    @OriginalMember(owner = "client!as", name = "v", descriptor = "Z")
    public static boolean field1040 = false;

    @OriginalMember(owner = "client!as", name = "x", descriptor = "Ljava/lang/String;")
    public static String field1042 = "Loaded sprites";

    @OriginalMember(owner = "client!as", name = "A", descriptor = "[J")
    public static long[] field1045 = new long[256];

    @OriginalMember(owner = "client!as", name = "D", descriptor = "[I")
    public static int[] field1048;

    @OriginalMember(owner = "client!as", name = "C", descriptor = "Lal;")
    public static class52 field1047;

    @OriginalMember(owner = "client!as", name = "w", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!as", name = "y", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!as", name = "z", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!as", name = "B", descriptor = "[Lne;")
    public static class172[] field1046;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1045[var0] = var1;
        }
        field1048 = new int[50];
        field1047 = new class52(8);
    }

    @OriginalMember(owner = "client!as", name = "f", descriptor = "(I)Lo;", line = 9)
    public static final class21 method516(int arg0) {
        field1043++;
        if (arg0 != 18898) {
            field1047 = null;
        }
        return class400.field5950;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(BJ)V", line = 23)
    public static final void method517(byte arg0, long arg1) {
        field1041++;
        if (arg1 <= 0L) {
            return;
        }
        int var3 = 111 % ((arg0 - 56) / 61);
        if ((arg1 % 10L) == 0L) {
            class265.method1813((byte) -58, arg1 - 1L);
            class265.method1813((byte) -92, 1L);
        } else {
            class265.method1813((byte) 70, arg1);
        }
    }

    @OriginalMember(owner = "client!as", name = "g", descriptor = "(I)V", line = 44)
    public static void method518(int arg0) {
        field1048 = null;
        field1046 = null;
        field1045 = null;
        field1042 = null;
        if (arg0 < 123) {
            field1045 = null;
        }
        field1047 = null;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ILe;)V", line = 63)
    public static final void method519(int arg0, class312 arg1) {
        field1044++;
        int var2 = class75.field949;
        int var3 = class27.field315;
        int var4 = class427.field6299;
        int var5 = class186.field3064 - 3;
        byte var6 = 20;
        if (class329.field5147 == null || class414.field6117 == null) {
            if (class223.field3727.method2762(1, class8.field96) && class223.field3727.method2762(1, class185.field3007)) {
                class329.field5147 = arg1.method641(class100.method756(class223.field3727, class8.field96, 0), true);
                class100 var7 = class100.method756(class223.field3727, class185.field3007, 0);
                class414.field6117 = arg1.method641(var7, true);
                var7.method759();
                class243.field4018 = arg1.method641(var7, true);
            } else {
                arg1.method563(var2, var3, var4, var6, class85.field1049 | 255 - class102.field1430 << 24, 1);
            }
        }
        if (class329.field5147 != null && class414.field6117 != null) {
            int var8 = (var4 - (class414.field6117.method2324() * 2)) / class329.field5147.method2324();
            for (int var9 = 0; var9 < var8; var9++) {
                class329.field5147.method2327(class414.field6117.method2324() + var2 + (class329.field5147.method2324() * var9), var3);
            }
            class414.field6117.method2327(var2, var3);
            class243.field4018.method2327(var2 + var4 - class243.field4018.method2324(), var3);
        }
        class11.field133.method2810(var2 + 3, -1, -16777216 | class372.field5625, var3 + 14, true, class343.field5291);
        int var10 = 50 % ((-arg0 - 60) / 32);
        arg1.method563(var2, var3 + var6, var4, var5 - var6, class85.field1049 | -class102.field1430 + 255 << 24, 1);
        int var11 = class414.field6125;
        int var12 = class287.field4604;
        for (int var13 = 0; var13 < class144.field2267; var13++) {
            int var27 = (class144.field2267 - var13 - 1) * 16 + var3 + var6 + 13;
            if (var2 < var11 && (var2 + var4) > var11 && var12 > var27 - 13 && var12 < (var27 + 4)) {
                arg1.method563(var2, var27 - 12, var4, 16, class308.field4879 | 255 - class282.field4540 << 24, 1);
            }
        }
        if ((class124.field1861 == null || class70.field862 == null || class19.field248 == null) && class223.field3727.method2762(1, class284.field4551) && class223.field3727.method2762(1, class28.field325) && class223.field3727.method2762(1, class150.field2339)) {
            class100 var14 = class100.method756(class223.field3727, class28.field325, 0);
            class70.field862 = arg1.method641(var14, true);
            var14.method759();
            class394.field5911 = arg1.method641(var14, true);
            class124.field1861 = arg1.method641(class100.method756(class223.field3727, class284.field4551, 0), true);
            class100 var15 = class100.method756(class223.field3727, class150.field2339, 0);
            class19.field248 = arg1.method641(var15, true);
            var15.method759();
            class68.field852 = arg1.method641(var15, true);
        }
        if (class124.field1861 != null && class70.field862 != null && class19.field248 != null) {
            int var16 = (var4 - (class19.field248.method2324() * 2)) / class124.field1861.method2324();
            for (int var17 = 0; var17 < var16; var17++) {
                class124.field1861.method2327(class19.field248.method2324() + var2 + var17 * class124.field1861.method2324(), var3 - (-var5 - -class124.field1861.method2325()));
            }
            int var18 = (var5 - var6 - class19.field248.method2325()) / class70.field862.method2325();
            for (int var19 = 0; var19 < var18; var19++) {
                class70.field862.method2327(var2, var3 + (var6 + (class70.field862.method2325() * var19)));
                class394.field5911.method2327(var2 + var4 - class394.field5911.method2324(), var19 * class70.field862.method2325() + var3 + var6);
            }
            class19.field248.method2327(var2, var5 + (var3 - class19.field248.method2325()));
            class68.field852.method2327(var2 + var4 - class19.field248.method2324(), -class19.field248.method2325() + var5 + var3);
        }
        int var20 = 0;
        for (class418 var21 = (class418) class86.field1089.method253((byte) -6); var21 != null; var21 = (class418) class86.field1089.method247((byte) -122)) {
            int var22 = (class144.field2267 - var20 - 1) * 16 + var6 + var3 + 13;
            int var23 = class372.field5625 | 0xFF000000;
            if (var2 < var11 && var11 < var2 + var4 && var22 - 13 < var12 && var12 < (var22 + 4)) {
                var23 = class143.field2266 | 0xFF000000;
            }
            int[] var24 = null;
            if (class222.method1590((byte) -21, var21.field6192)) {
                var24 = class155.method1092(true, (int) var21.field6194).field1361;
            } else if (class239.method1692(var21.field6192, 96)) {
                class50 var25 = class39.field499[(int) var21.field6194];
                if (var25 != null) {
                    var24 = var25.field615.field3797;
                }
            } else if (class104.method792(var21.field6192, 20308)) {
                if (var21.field6192 == 1001) {
                    var24 = class137.method1003((int) var21.field6194, -30796).field1959;
                } else {
                    var24 = class137.method1003((int) (var21.field6194 >>> 32 & 0x7FFFFFFFL), -30796).field1959;
                }
            }
            String var26 = class30.method209(var21, (byte) -106);
            if (var24 != null) {
                var26 = var26 + class269.method1826(true, var24);
            }
            class11.field133.method2813(var22, var26, class297.field4725, 0, var23, var2 + 3, (byte) 55, class372.field5627);
            var20++;
        }
        class3.method66(class75.field949, 85, class186.field3064, class27.field315, class427.field6299);
    }
}
