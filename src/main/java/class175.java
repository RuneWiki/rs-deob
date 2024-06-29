import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class175 {

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field3361 = 0;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "Lai;")
    public static class10 field3363 = class44.method278("Spiel)2Engine wird gestartet)3)3)3", -121);

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "[I")
    public static int[] field3365 = new int[128];

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Lai;")
    private static class10 field3366 = class44.method278("Welcome to RuneScape", 105);

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "Lai;")
    public static class10 field3362 = field3366;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "Lai;")
    public static class10 field3364 = class44.method278(")4lang)4de", 98);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public static final void method1145(int arg0) {
        field3360++;
        if (arg0 > ~class146.field2786) {
            class176.method1149((byte) -111);
        } else {
            class111.method710(121, 40);
            class75.field1289 = class188.field3593;
            class188.field3593 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V")
    public static final void method1146(boolean arg0) {
        field3367++;
        int var1 = class11.field184 * 128 + 64;
        int var2 = class201.field3932 * 128 + 64;
        int var3 = class145.method1003((byte) -100, var2, var1, class42.field687) - class148.field2844;
        if (class34.field520 < var1) {
            class34.field520 += (var1 - class34.field520) * class205.field3984 / 1000 + class6.field69;
            if (class34.field520 > var1) {
                class34.field520 = var1;
            }
        }
        if (class14.field226 < var3) {
            class14.field226 += class6.field69 + (var3 - class14.field226) * class205.field3984 / 1000;
            if (class14.field226 > var3) {
                class14.field226 = var3;
            }
        }
        if (class34.field520 > var1) {
            class34.field520 -= class6.field69 + (class34.field520 - var1) * class205.field3984 / 1000;
            if (class34.field520 < var1) {
                class34.field520 = var1;
            }
        }
        if (class119.field2294 < var2) {
            class119.field2294 += (var2 - class119.field2294) * class205.field3984 / 1000 + class6.field69;
            if (var2 < class119.field2294) {
                class119.field2294 = var2;
            }
        }
        if (arg0) {
            method1145(-18);
        }
        if (var2 < class119.field2294) {
            class119.field2294 -= (class119.field2294 - var2) * class205.field3984 / 1000 + class6.field69;
            if (var2 > class119.field2294) {
                class119.field2294 = var2;
            }
        }
        if (var3 < class14.field226) {
            class14.field226 -= (class14.field226 - var3) * class205.field3984 / 1000 + class6.field69;
            if (var3 > class14.field226) {
                class14.field226 = var3;
            }
        }
        int var4 = class2.field7 * 128 + 64;
        int var5 = class205.field3993 * 128 + 64;
        int var6 = class145.method1003((byte) -79, var4, var5, class42.field687) - class186.field3549;
        int var7 = var6 - class14.field226;
        int var8 = var5 - class34.field520;
        int var9 = var4 - class119.field2294;
        int var10 = (int) Math.sqrt((double) (var9 * var9 + var8 * var8));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = (int) (Math.atan2((double) var9, (double) var8) * -325.949D) & 0x7FF;
        int var13 = var12 - class207.field4044;
        if (var11 > 383) {
            var11 = 383;
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var11 > class120.field2306) {
            class120.field2306 += (var11 - class120.field2306) * class13.field208 / 1000 + class101.field1899;
            if (class120.field2306 > var11) {
                class120.field2306 = var11;
            }
        }
        if (class120.field2306 > var11) {
            class120.field2306 -= (class120.field2306 - var11) * class13.field208 / 1000 + class101.field1899;
            if (class120.field2306 < var11) {
                class120.field2306 = var11;
            }
        }
        if (var13 > 0) {
            class207.field4044 += class13.field208 * var13 / 1000 + class101.field1899;
            class207.field4044 &= 0x7FF;
        }
        if (var13 < 0) {
            class207.field4044 -= -var13 * class13.field208 / 1000 + class101.field1899;
            class207.field4044 &= 0x7FF;
        }
        int var14 = var12 - class207.field4044;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class207.field4044 = var12;
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(Z)V")
    public static void method1147(boolean arg0) {
        field3366 = null;
        field3362 = null;
        if (!arg0) {
            field3365 = null;
        }
        field3363 = null;
        field3364 = null;
        field3365 = null;
    }
}
