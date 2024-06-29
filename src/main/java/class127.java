import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class127 extends RuntimeException {

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Ljava/lang/String;")
    public String field2927;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2936;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "Lv;")
    public static class146 field2933 = class159.method1226((byte) -37, "mod_icons");

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "Lv;")
    public static class146 field2930 = class159.method1226((byte) -37, "null");

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "[S")
    public static short[] field2934 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Lua;")
    public static class140 field2929 = new class140(64);

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static final void method941(int arg0) {
        class38.field860 = 0;
        field2938++;
        if (arg0 != 3062) {
            method942(97);
        }
        int var1 = (class116.field2696.field757 >> 7) + class63.field1429;
        int var2 = (class116.field2696.field790 >> 7) + class76.field1814;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class38.field860 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class38.field860 = 1;
        }
        if (class38.field860 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class38.field860 = 0;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public static void method942(int arg0) {
        if (arg0 != -15058) {
            field2929 = null;
        }
        field2933 = null;
        field2929 = null;
        field2934 = null;
        field2930 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I")
    public static int method943(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)Lqf;")
    public static final class117 method944(int arg0, int arg1) {
        field2935++;
        class117 var2 = (class117) class79.field1930.method1045((long) arg0, -61);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class76.field1815.method585(arg0, 126, 0);
        if (var3 == null) {
            return null;
        }
        class117 var4 = new class117();
        class95 var5 = new class95(var3);
        var5.field2304 = var5.field2320.length - 12;
        int var6 = var5.method740((byte) 110);
        int var7 = 0;
        var4.field2736 = var5.method795(1);
        var4.field2731 = var5.method795(1);
        var4.field2728 = var5.method795(1);
        var4.field2729 = var5.method795(1);
        var5.field2304 = 0;
        if (arg1 <= 109) {
            field2931 = -104;
        }
        var4.field2726 = var5.method776(16422);
        var4.field2725 = new int[var6];
        var4.field2727 = new class146[var6];
        var4.field2733 = new int[var6];
        while (var5.field2304 < var5.field2320.length - 12) {
            int var8 = var5.method795(1);
            if (var8 == 3) {
                var4.field2727[var7] = var5.method772(127);
            } else if (var8 >= 100 || var8 == 21 || var8 == 38 || var8 == 39) {
                var4.field2725[var7] = var5.method790((byte) 73);
            } else {
                var4.field2725[var7] = var5.method740((byte) -77);
            }
            var4.field2733[var7++] = var8;
        }
        class79.field1930.method1047(-1, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class127(Throwable arg0, String arg1) {
        this.field2927 = arg1;
        this.field2936 = arg0;
    }
}
