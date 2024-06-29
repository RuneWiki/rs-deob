import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class7 {

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field88 = 0;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field90 = -1;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "[Lta;")
    public static class190[] field89;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static final void method35(int arg0) {
        field85++;
        int var1 = class224.field3569;
        int var2 = class190.field3121;
        if (arg0 != 25125) {
            method35(58);
        }
        int var3 = class267.field4274;
        byte var4 = 20;
        int var5 = class66.field1088 - 3;
        if (class247.field3887 == null || class128.field2114 == null) {
            if (class35.field594.method899(class193.field3152, -87) && class35.field594.method899(class80.field1332, -94)) {
                class247.field3887 = class22.method177(true, class35.field594, class193.field3152, 0);
                class128.field2114 = class22.method177(true, class35.field594, class80.field1332, 0);
            } else {
                class63.method491(var1, var3, var2, var4, class278.field4409, 256 - class40.field686);
            }
        }
        if (class247.field3887 != null && class128.field2114 != null) {
            int var6 = (var2 - (class128.field2114.field1564 * 2)) / class247.field3887.field1564;
            for (int var7 = 0; var7 < var6; var7++) {
                class247.field3887.method124(class247.field3887.field1564 * var7 + class128.field2114.field1564 + var1, var3);
            }
            class128.field2114.method124(var1, var3);
            class128.field2114.method125(var1 + var2 - class128.field2114.field1564, var3);
        }
        class23.field362.method578(class139.field2332, var1 + 3, var3 + 14, class237.field3742, -1);
        class63.method491(var1, var3 + var4, var2, var5 - var4, class278.field4409, 256 - class40.field686);
        int var8 = class165.field2719;
        int var9 = class269.field4311;
        for (int var10 = 0; var10 < class42.field776; var10++) {
            int var18 = var3 - (-var4 - ((class42.field776 - var10 - 1) * 15 + 13));
            if (var9 > var1 && var1 + var2 > var9 && var8 > (var18 - 13) && var8 < var18 + 3) {
                class63.method491(var1, var18 - 12, var2, 15, class140.field2336, 256 - class56.field993);
            }
        }
        if ((class178.field2966 == null || class101.field1549 == null || class194.field3181 == null) && class35.field594.method899(class287.field4599, -108) && class35.field594.method899(class193.field3156, -93) && class35.field594.method899(class82.field1356, -101)) {
            class178.field2966 = class22.method177(true, class35.field594, class287.field4599, 0);
            class101.field1549 = class22.method177(true, class35.field594, class193.field3156, 0);
            class194.field3181 = class22.method177(true, class35.field594, class82.field1356, 0);
        }
        if (class178.field2966 != null && class101.field1549 != null && class194.field3181 != null) {
            int var11 = (var2 - (class194.field3181.field1564 * 2)) / class178.field2966.field1564;
            for (int var12 = 0; var12 < var11; var12++) {
                class178.field2966.method124(class178.field2966.field1564 * var12 + var1 + class194.field3181.field1564, var3 - (-var5 - -class178.field2966.field1560));
            }
            int var13 = (var5 - var4 - class194.field3181.field1560) / class101.field1549.field1560;
            for (int var14 = 0; var14 < var13; var14++) {
                class101.field1549.method124(var1, var3 - (-var4 - class101.field1549.field1560 * var14));
                class101.field1549.method125(var2 + var1 - class101.field1549.field1564, class101.field1549.field1560 * var14 + var3 + var4);
            }
            class194.field3181.method124(var1, var3 + var5 - class194.field3181.field1560);
            class194.field3181.method125(var1 + var2 - class194.field3181.field1564, var3 + var5 + -class194.field3181.field1560);
        }
        for (int var15 = 0; var15 < class42.field776; var15++) {
            int var16 = (class42.field776 - var15 - 1) * 15 + var4 + var3 + 13;
            int var17 = class237.field3742;
            if (var9 > var1 && var9 < var1 + var2 && var16 - 13 < var8 && var8 < var16 + 3) {
                var17 = class237.field3741;
            }
            class23.field362.method578(class55.method447(-45, var15), var1 + 3, var16, var17, 0);
        }
        class180.method1271(class190.field3121, class66.field1088, class267.field4274, class224.field3569, 0);
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public static void method36(int arg0) {
        field89 = null;
        if (arg0 != -1) {
            method37(-37, (byte) 76, 4);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBI)I")
    public static final int method37(int arg0, byte arg1, int arg2) {
        field86++;
        if (arg1 != -112) {
            method37(35, (byte) -105, 79);
        }
        int var3 = 0;
        while (arg2 > 0) {
            arg2--;
            var3 = arg0 & 0x1 | var3 << 1;
            arg0 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIB)V")
    public static final void method38(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        class224.method1504(arg4, arg1 + arg2, -arg2 + arg1, class114.field1841[arg0], 7);
        field87++;
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg3 * arg3;
        int var9 = arg2 * arg2;
        int var10 = var8 << 1;
        int var11 = arg3 << 1;
        int var12 = (1 - var11) * var9 + var10;
        int var13 = var9 << 1;
        int var14 = var8 - (var11 - 1) * var13;
        int var15 = var9 << 2;
        int var16 = var8 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        if (arg5 < 42) {
            method37(-105, (byte) 71, 111);
        }
        int var18 = (var6 + 1) * var16;
        int var19 = ((arg3 << 1) - 3) * var13;
        int var20 = (arg3 - 1) * var15;
        while (var7 > 0) {
            if (var12 < 0) {
                while (var12 < 0) {
                    var14 += var18;
                    var12 += var17;
                    var6++;
                    var18 += var16;
                    var17 += var16;
                }
            }
            var7--;
            int var21 = arg0 - var7;
            int var22 = arg0 + var7;
            if (var14 < 0) {
                var12 += var17;
                var6++;
                var17 += var16;
                var14 += var18;
                var18 += var16;
            }
            var14 += -var19;
            var12 += -var20;
            var19 -= var15;
            var20 -= var15;
            int var23 = arg1 + var6;
            int var24 = arg1 - var6;
            class224.method1504(arg4, var23, var24, class114.field1841[var21], 7);
            class224.method1504(arg4, var23, var24, class114.field1841[var22], 7);
        }
    }
}
