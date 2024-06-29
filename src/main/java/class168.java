import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class168 {

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "Ljd;")
    public static class92 field3286 = class202.method1325((byte) 90, "logo");

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "Ljd;")
    public static class92 field3290 = class202.method1325((byte) 90, "cookiehost");

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "Loe;")
    public static class139 field3283 = new class139(500);

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "Ljd;")
    public static class92 field3293 = class202.method1325((byte) 90, "Fallen lassen");

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "Ljd;")
    public static class92 field3292 = class202.method1325((byte) 90, "<)4col>");

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "Lnh;")
    public static class133 field3284;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lff;III)V")
    public static final void method1112(class57 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class64.field1310) {
            class43 var4 = class31.field698[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field969 != null && var4.field969.field633 instanceof class57) {
                class57 var5 = (class57) var4.field969.field633;
                class57.method337(arg0, var5, 128, 0, 0, true);
            }
        }
        if (arg3 < class64.field1310) {
            class43 var6 = class31.field698[arg1][arg2][arg3 + 1];
            if (var6 != null && var6.field969 != null && var6.field969.field633 instanceof class57) {
                class57 var7 = (class57) var6.field969.field633;
                class57.method337(arg0, var7, 0, 0, 128, true);
            }
        }
        if (arg2 < class64.field1310 && arg3 < class93.field1872) {
            class43 var8 = class31.field698[arg1][arg2 + 1][arg3 + 1];
            if (var8 != null && var8.field969 != null && var8.field969.field633 instanceof class57) {
                class57 var9 = (class57) var8.field969.field633;
                class57.method337(arg0, var9, 128, 0, 128, true);
            }
        }
        if (arg2 >= class64.field1310 || arg3 <= 0) {
            return;
        }
        class43 var10 = class31.field698[arg1][arg2 + 1][arg3 - 1];
        if (var10 != null && var10.field969 != null && var10.field969.field633 instanceof class57) {
            class57 var11 = (class57) var10.field969.field633;
            class57.method337(arg0, var11, 128, 0, -128, true);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lsc;I)V")
    public static final void method1113(class173 arg0, int arg1) {
        field3285++;
        short var2 = 256;
        for (int var3 = 0; var3 < class93.field1888.length; var3++) {
            class93.field1888[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var2);
            class93.field1888[var16] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class94.field1901[var15] = (class93.field1888[var15 - 1] + class93.field1888[var15 + 128] + class93.field1888[var15 - -1] + class93.field1888[var15 + -128]) / 4;
                }
            }
            int[] var13 = class93.field1888;
            class93.field1888 = class94.field1901;
            class94.field1901 = var13;
        }
        if (arg0 != null) {
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.field3351; var7++) {
                for (int var8 = 0; var8 < arg0.field3354; var8++) {
                    if (arg0.field3353[var6++] != 0) {
                        int var9 = arg0.field3355 + var8 + 16;
                        int var10 = arg0.field3357 + var7 + 16;
                        int var11 = (var10 << 7) + var9;
                        class93.field1888[var11] = 0;
                    }
                }
            }
        }
        if (arg1 >= -106) {
            field3292 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public static final void method1114(int arg0) {
        if (arg0 != 128) {
            method1117(null, (byte) -56);
        }
        class49.field1070.method923(-121);
        class206.field3965.method923(-122);
        field3291++;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
    public static void method1115(int arg0) {
        field3292 = null;
        if (arg0 != 0) {
            method1112(null, -44, 97, -51);
        }
        field3284 = null;
        field3290 = null;
        field3293 = null;
        field3283 = null;
        field3286 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IBIII)V")
    public static final void method1116(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class66.field1346; var5++) {
            if (class74.field1564[var5] + class135.field2703[var5] > arg2 && class135.field2703[var5] < arg0 + arg2 && class190.field3653[var5] + class206.field3963[var5] > arg4 && arg3 + arg4 > class190.field3653[var5]) {
                class55.field1143[var5] = true;
            }
        }
        if (arg1 != 82) {
            method1112(null, 44, -124, 121);
        }
        field3287++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lh;B)Lje;")
    public static final class93 method1117(class70 arg0, byte arg1) {
        field3289++;
        int var2 = arg0.method443(arg1 ^ 0xFFFFFF4A);
        int var3 = arg0.method443(255);
        Class var4 = class209.method1363(var3, (byte) -123);
        try {
            class93 var5 = (class93) var4.getDeclaredConstructor().newInstance();
            if (arg1 != -75) {
                field3290 = null;
            }
            if (var5 != null) {
                var5.field1881 = var2;
                var5.field1877 = arg0.method443(arg1 ^ 0xFFFFFF4A);
                int var6 = arg0.method443(255);
                for (int var7 = 0; var7 < var6; var7++) {
                    int var8 = arg0.method443(arg1 ^ 0xFFFFFF4A);
                    var5.method63(var8, arg0, arg1 + 75);
                }
            }
            var5.method87((byte) -85);
            return var5;
        } catch (IllegalAccessException var9) {
            throw new RuntimeException();
        } catch (InstantiationException var10) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)J")
    public static final synchronized long method1118(int arg0) {
        if (arg0 != 1) {
            field3286 = null;
        }
        long var1 = System.currentTimeMillis();
        field3288++;
        if (class138.field2768 > var1) {
            class45.field997 += class138.field2768 - var1;
        }
        class138.field2768 = var1;
        return var1 + class45.field997;
    }
}
