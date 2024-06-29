import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class151 {

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field3170 = 0;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field3169 = 0;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "Lgg;")
    public static class63 field3175 = class116.method911(43, "");

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public static int field3176 = 0;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "Lgg;")
    public static class63 field3178 = field3175;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZB)V")
    public static final void method1057(boolean arg0, byte arg1) {
        if (arg1 < 39) {
            method1057(false, (byte) 122);
        }
        for (int var2 = 0; var2 < class29.field695; var2++) {
            class6 var3 = class55.field1458[class142.field3045[var2]];
            long var4 = (long) class142.field3045[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method97(4365) && var3.field150.field659 == arg0 && var3.field150.method280((byte) 108)) {
                int var6 = var3.field1141 >> 7;
                int var7 = var3.field1144 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var3.field1123 == 1 && (var3.field1141 & 0x7F) == 64 && (var3.field1144 & 0x7F) == 64) {
                        if (class134.field2904[var6][var7] == class93.field2187) {
                            continue;
                        }
                        class134.field2904[var6][var7] = class93.field2187;
                    }
                    if (!var3.field150.field667) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field1143 = class112.method894(-92, class112.field2528, (var3.field1123 - 1) * 64 + var3.field1141, (var3.field1123 - 1) * 64 + var3.field1144);
                    class134.method975(class112.field2528, var3.field1141, var3.field1144, var3.field1143, var3.field1123 * 64 + 60 - 64, var3, var3.field1104, var4, var3.field1162);
                }
            }
        }
        field3174++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI)Z")
    public static final boolean method1058(byte arg0, int arg1) {
        int var2 = 66 / ((arg0 - 27) / 63);
        field3172++;
        return (arg1 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)Lgg;")
    public static final class63 method1059(int arg0, int arg1) {
        field3171++;
        if (arg1 != -686459346) {
            field3169 = -41;
        }
        return class84.field2003[arg0].method582(-57) <= 0 ? class106.field2414[arg0] : class89.method772((byte) 80, new class63[] { class106.field2414[arg0], class203.field4029, class84.field2003[arg0] });
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
    public static void method1060(byte arg0) {
        if (arg0 != -124) {
            method1062(true);
        }
        field3175 = null;
        field3178 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IJII)Z")
    public static final boolean method1061(int arg0, long arg1, int arg2, int arg3) {
        field3168++;
        int var5 = (int) arg1 >> 20 & 0x3;
        int var6 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
        int var7 = (int) arg1 >> 14 & 0x1F;
        if (arg3 != -23) {
            method1058((byte) -6, 97);
        }
        if (var7 == 10 || var7 == 11 || var7 == 22) {
            class37 var8 = class167.method1133(true, var6);
            int var9;
            int var10;
            if (var5 == 0 || var5 == 2) {
                var9 = var8.field914;
                var10 = var8.field893;
            } else {
                var9 = var8.field893;
                var10 = var8.field914;
            }
            int var11 = var8.field886;
            if (var5 != 0) {
                var11 = (var11 << var5 & 0xF) + (var11 >> 4 - var5);
            }
            class162.method1105(0, class3.field72.field1117[0], var11, var10, var9, 2, arg2, class3.field72.field1164[0], arg0, true, (byte) -102, 0);
        } else {
            class162.method1105(var7 + 1, class3.field72.field1117[0], 0, 0, 0, 2, arg2, class3.field72.field1164[0], arg0, true, (byte) -66, var5);
        }
        class49.field1188 = class143.field3074;
        class6.field149 = 2;
        class32.field785 = class110.field2480;
        class182.field3693 = 0;
        return true;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V")
    public static final void method1062(boolean arg0) {
        field3166++;
        if (arg0) {
            return;
        }
        for (int var1 = 0; var1 < class29.field695; var1++) {
            int var2 = class142.field3045[var1];
            class6 var3 = class55.field1458[var2];
            if (var3 != null) {
                class62.method567(var3, var3.field150.field647, 128);
            }
        }
    }
}
