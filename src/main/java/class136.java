import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class136 {

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Lle;")
    public static class104 field2656 = new class104();

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Lsd;")
    public static class166 field2659 = class135.method935("bevor Sie den Vorgang wiederholen)3", 0);

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field2660 = 0;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "[I")
    public static int[] field2657;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILf;II)Lkf;")
    public static final class96 method942(int arg0, class47 arg1, int arg2, int arg3) {
        field2658++;
        if (class146.method1003(arg0, arg2, arg1, false)) {
            if (arg3 != -98049) {
                field2656 = null;
            }
            return class199.method1312(false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V")
    public static void method943(boolean arg0) {
        field2656 = null;
        field2659 = null;
        if (arg0) {
            field2657 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static final void method944(int arg0) {
        if (class195.field3859[98]) {
            class2.field28 += (12 - class2.field28) / 2;
        } else if (class195.field3859[99]) {
            class2.field28 += (-class2.field28 - 12) / 2;
        } else {
            class2.field28 /= 2;
        }
        field2655++;
        class95.field1833 += class2.field28 / 2;
        if (class195.field3859[96]) {
            class9.field177 += (-class9.field177 - 24) / 2;
        } else if (class195.field3859[97]) {
            class9.field177 += (24 - class9.field177) / 2;
        } else {
            class9.field177 /= 2;
        }
        int var1 = class169.field3245 + class41.field728.field3526;
        client.field515 = client.field515 + class9.field177 / 2 & 0x7FF;
        if (class95.field1833 < 128) {
            class95.field1833 = 128;
        }
        int var2 = field2660 + class41.field728.field3513;
        if (class48.field886 - var1 < -500 || class48.field886 - var1 > 500 || class31.field571 - var2 < -500 || class31.field571 - var2 > 500) {
            class31.field571 = var2;
            class48.field886 = var1;
        }
        if (class95.field1833 > 383) {
            class95.field1833 = 383;
        }
        int var3 = 0;
        if (class48.field886 != var1) {
            class48.field886 += (var1 - class48.field886) / 16;
        }
        int var4 = class48.field886 >> 7;
        if (class31.field571 != var2) {
            class31.field571 += (var2 - class31.field571) / 16;
        }
        int var5 = class31.field571 >> 7;
        int var6 = class119.method864(class48.field886, class31.field571, class165.field3130, true);
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var7 = var4 - 4; var7 <= var4 + 4; var7++) {
                for (int var8 = var5 - 4; var8 <= var5 + 4; var8++) {
                    int var9 = class165.field3130;
                    if (var9 < 3 && (class122.field2387[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class74.field1511[var9][var7][var8];
                    if (var10 > var3) {
                        var3 = var10;
                    }
                }
            }
        }
        int var11 = var3 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        int var12 = -13 / ((arg0 - 25) / 55);
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (class54.field1011 < var11) {
            class54.field1011 += (var11 - class54.field1011) / 24;
        } else if (var11 < class54.field1011) {
            class54.field1011 += (var11 - class54.field1011) / 80;
        }
    }
}
