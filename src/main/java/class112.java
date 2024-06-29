import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class112 {

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public int field2441 = 0;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public int field2450 = 0;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "Llc;")
    public static class69 field2431 = class69.method470((byte) -120, "Enter name:");

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "[Lm;")
    public static class72[] field2434 = new class72[16384];

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Llc;")
    public static class69 field2436 = class69.method470((byte) -120, "Loaded input handler");

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "Llc;")
    public static class69 field2432 = class69.method470((byte) -109, "(Y");

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "Llc;")
    public static class69 field2438 = class69.method470((byte) -111, " more options");

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "Llc;")
    public static class69 field2447 = class69.method470((byte) -113, "Last password change:*6n@gre@");

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "[Llc;")
    public static class69[] field2435 = new class69[5];

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public int field2439;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public int field2442;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public int field2443;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public int field2446;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
    public int field2448;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "Lcb;")
    public static class15 field2444;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "Lcb;")
    public static class15 field2449;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "Lea;")
    public class26 field2440;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "Lea;")
    public class26 field2451;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
    public static void method824(byte arg0) {
        if (arg0 < 10) {
            method825((byte) 111, null);
        }
        field2432 = null;
        field2435 = null;
        field2436 = null;
        field2449 = null;
        field2431 = null;
        field2447 = null;
        field2438 = null;
        field2434 = null;
        field2444 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLkc;)V")
    public static final void method825(byte arg0, class63 arg1) {
        if (arg0 > -8) {
            method826(25);
        }
        class83.field1869 = arg1;
        field2433++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static final void method826(int arg0) {
        field2437++;
        int var1 = class82.field1861.method298(class18.field375);
        for (int var2 = 0; var2 < class72.field1604; var2++) {
            int var10 = class82.field1861.method304(class101.field2197[var2]);
            if (var10 > var1) {
                var1 = var10;
            }
        }
        var1 += 8;
        int var3 = class72.field1604 * 15 + 21;
        if (arg0 != -8116) {
            field2430 = 62;
        }
        if (class127.field2733 > 4 && class19.field417 > 4 && class127.field2733 < 516 && class19.field417 < 338) {
            class77.field1718 = 0;
            class19.field419 = var1;
            class127.field2738 = true;
            field2430 = class72.field1604 * 15 + 22;
            int var4 = class127.field2733 - var1 / 2 - 4;
            if (var1 + var4 > 512) {
                var4 = 512 - var1;
            }
            int var5 = class19.field417 - 4;
            if (var4 < 0) {
                var4 = 0;
            }
            if (var3 + var5 > 334) {
                var5 = 334 - var3;
            }
            class33.field656 = var4;
            if (var5 < 0) {
                var5 = 0;
            }
            class121.field2600 = var5;
        }
        if (class127.field2733 > 553 && class19.field417 > 205 && class127.field2733 < 743 && class19.field417 < 466) {
            field2430 = class72.field1604 * 15 + 22;
            class77.field1718 = 1;
            class19.field419 = var1;
            class127.field2738 = true;
            int var6 = class127.field2733 - var1 / 2 - 553;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 + var1 > 190) {
                var6 = 190 - var1;
            }
            class33.field656 = var6;
            int var7 = class19.field417 - 205;
            if (var7 < 0) {
                var7 = 0;
            } else if (var3 + var7 > 261) {
                var7 = 261 - var3;
            }
            class121.field2600 = var7;
        }
        if (class127.field2733 <= 17 || class19.field417 <= 357 || class127.field2733 >= 496 || class19.field417 >= 453) {
            return;
        }
        class127.field2738 = true;
        field2430 = class72.field1604 * 15 + 22;
        class19.field419 = var1;
        int var8 = class127.field2733 - var1 / 2 - 17;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 + var1 > 479) {
            var8 = 479 - var1;
        }
        class77.field1718 = 2;
        int var9 = class19.field417 - 357;
        class33.field656 = var8;
        if (var9 < 0) {
            var9 = 0;
        } else if (var3 + var9 > 96) {
            var9 = 96 - var3;
        }
        class121.field2600 = var9;
    }
}
