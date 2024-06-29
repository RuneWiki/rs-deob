import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class205 extends class106 {

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "Lwa;")
    public static class75 field3467 = class66.method560("Speicher wird zugewiesen)3", false);

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "[I")
    public static int[] field3470 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "I")
    public static int field3472 = 0;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "F")
    public static float field3468;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "Lbc;")
    public static class110 field3473;

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "Lre;")
    public static class262 field3474;

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "[Lje;")
    public static class68[] field3476;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V", line = 11)
    public static void method1519(byte arg0) {
        field3476 = null;
        if (arg0 <= 58) {
            field3476 = (class68[]) null;
        }
        field3467 = null;
        field3470 = null;
        field3474 = null;
        field3473 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)V", line = 33)
    public static final void method1520(boolean arg0) {
        field3475++;
        if (class81.field1361 != -1) {
            class153.method1173(class81.field1361, false);
        }
        for (int var1 = 0; var1 < class273.field4720; var1++) {
            if (class226.field3815[var1]) {
                class219.field3743[var1] = true;
            }
            class218.field3727[var1] = class226.field3815[var1];
            class226.field3815[var1] = false;
        }
        class214.field3640 = arg0;
        class217.field3720 = class143.field2463;
        class39.field618 = -1;
        class180.field3019 = null;
        class61.field1069 = -1;
        if (class81.field1361 != -1) {
            class273.field4720 = 0;
            class79.method674(0, -1, class81.field1361, (byte) 55, 0, 0, 0, class188.field3141, class244.field4111);
        }
        class222.method1633();
        class250.field4208 = 0;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZIBI)Lwa;", line = 91)
    public static final class75 method1521(boolean arg0, int arg1, byte arg2, int arg3) {
        field3469++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        int var4 = arg3 / arg1;
        int var5 = 1;
        while (var4 != 0) {
            var5++;
            var4 /= arg1;
        }
        int var6 = var5;
        if (arg3 < 0 || arg0) {
            var6 = var5 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg3 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        if (arg2 != 45) {
            return (class75) null;
        }
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = arg3 % arg1;
            arg3 /= arg1;
            if (var9 < 0) {
                var9 = -var9;
            }
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        class75 var10 = new class75();
        var10.field1280 = var6;
        var10.field1296 = var7;
        return var10;
    }
}
