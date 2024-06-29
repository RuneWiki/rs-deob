import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class170 {

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Lel;")
    public static class106 field2750 = new class106();

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
    public static void method1190(boolean arg0) {
        if (!arg0) {
            method1190(true);
        }
        field2750 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLff;)V")
    public static final void method1191(byte arg0, class44 arg1) {
        long var2 = 0L;
        field2748++;
        if (arg1.field517 == 0) {
            var2 = class177.method1222(arg1.field520, arg1.field512, arg1.field511);
        }
        int var4 = -1;
        int var5 = 0;
        if (arg1.field517 == 1) {
            var2 = class294.method1968(arg1.field520, arg1.field512, arg1.field511);
        }
        int var6 = 0;
        if (arg1.field517 == 2) {
            var2 = class289.method1940(arg1.field520, arg1.field512, arg1.field511);
        }
        if (arg0 <= 34) {
            method1190(false);
        }
        if (arg1.field517 == 3) {
            var2 = class125.method866(arg1.field520, arg1.field512, arg1.field511);
        }
        if (var2 != 0L) {
            var6 = ((int) var2 & 0x38708E) >> 20;
            var4 = Integer.MAX_VALUE & (int) (var2 >>> 32);
            var5 = ((int) var2 & 0x7F990) >> 14;
        }
        arg1.field532 = var6;
        arg1.field513 = var5;
        arg1.field530 = var4;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
    public static final void method1192(byte arg0) {
        if (arg0 != 126) {
            return;
        }
        field2749++;
        while (true) {
            class85 var1;
            class49 var3;
            do {
                var1 = (class85) class243.field3892.method367(5);
                if (var1 == null) {
                    return;
                }
                if (var1.field1159 < 0) {
                    int var2 = -var1.field1159 - 1;
                    if (class80.field1121 == var2) {
                        var3 = class197.field3179;
                    } else {
                        var3 = class260.field4141[var2];
                    }
                } else {
                    int var4 = var1.field1159 - 1;
                    var3 = class198.field3193[var4];
                }
            } while (var3 == null);
            class94 var5 = class119.method842(-95, var1.field1164);
            int var6;
            int var7;
            if (var1.field1161 == 1 || var1.field1161 == 3) {
                var7 = var5.field1334;
                var6 = var5.field1340;
            } else {
                var6 = var5.field1334;
                var7 = var5.field1340;
            }
            int var8 = (var7 >> 1) + var1.field1152;
            int var9 = var1.field1152 + (var7 + 1 >> 1);
            int var10 = var1.field1169 + (var6 >> 1);
            int var11 = (var6 + 1 >> 1) + var1.field1169;
            int[][] var12 = class229.field3641[class28.field336];
            int var13 = var12[var10][var8] + var12[var11][var8] + var12[var11][var9] + var12[var10][var9] >> 2;
            int var14 = class207.field3340[var1.field1170];
            class197 var15 = null;
            if (var14 == 0) {
                class233 var16 = class87.method615(class28.field336, var1.field1169, var1.field1152);
                if (var16 != null) {
                    var15 = var16.field3709;
                }
            } else if (var14 == 1) {
                class195 var19 = class278.method1861(class28.field336, var1.field1169, var1.field1152);
                if (var19 != null) {
                    var15 = var19.field3149;
                }
            } else if (var14 == 2) {
                class138 var18 = class175.method1209(class28.field336, var1.field1169, var1.field1152);
                if (var18 != null) {
                    var15 = var18.field2291;
                }
            } else if (var14 == 3) {
                class16 var17 = class267.method1808(class28.field336, var1.field1169, var1.field1152);
                if (var17 != null) {
                    var15 = var17.field185;
                }
            }
            if (var15 != null) {
                class168.method1181(var1.field1155 + 1, var1.field1169, 0, var14, 128, 0, var1.field1173 + 1, -1, class28.field336, var1.field1152);
                var3.field646 = var13;
                var3.field662 = var1.field1152 * 128 + var7 * 64;
                var3.field674 = class9.field141 + var1.field1173;
                var3.field630 = class9.field141 + var1.field1155;
                int var20 = var1.field1167;
                var3.field622 = var1.field1169 * 128 + var6 * 64;
                var3.field688 = var15;
                int var21 = var1.field1165;
                int var22 = var1.field1166;
                int var23 = var1.field1158;
                if (var21 < var20) {
                    int var24 = var20;
                    var20 = var21;
                    var21 = var24;
                }
                if (var22 > var23) {
                    int var25 = var22;
                    var22 = var23;
                    var23 = var25;
                }
                var3.field627 = var1.field1152 + var23;
                var3.field673 = var1.field1169 + var21;
                var3.field701 = var1.field1152 + var22;
                var3.field638 = var1.field1169 + var20;
            }
        }
    }
}
