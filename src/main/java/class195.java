import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class195 {

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field2696 = 0;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "Llc;")
    public static class86 field2695 = new class86(100);

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Lhb;")
    public static class222 field2697 = new class222();

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "Z")
    public static boolean field2698 = false;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2700 = "Take";

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "Lhc;")
    public static class235 field2701;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "[Lq;")
    public static class128[] field2699;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public static void method1236(byte arg0) {
        field2697 = null;
        int var1 = 82 % ((32 - arg0) / 58);
        field2695 = null;
        field2701 = null;
        field2699 = null;
        field2700 = null;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)V")
    public static final void method1237(byte arg0) {
        field2694++;
        if (class146.method981(arg0 ^ 0xFFFFA197) != 2) {
            return;
        }
        int var1 = class159.field2222 % 104;
        byte var2 = (byte) (class159.field2222 - 4 & 0xFF);
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class86.field1176[var3][var1][var16] = var2;
            }
        }
        if (class295.field4642 == 3 || arg0 != 22) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class181.field2534[var4] = -1000000;
            class231.field3500[var4] = 1000000;
            class33.field502[var4] = 0;
            class222.field3333[var4] = 1000000;
            class137.field1921[var4] = 0;
        }
        if (class51.field734 != 1) {
            int var15 = class275.method1836(class295.field4642, class89.field1252, class41.field618, -128);
            if ((var15 - class246.field3773) >= 800 || (class230.field3489[class295.field4642][class41.field618 >> 7][class89.field1252 >> 7] & 0x4) == 0) {
                return;
            }
            class269.method1779(1, false, 1, class194.field2682, class89.field1252 >> 7, class41.field618 >> 7);
            return;
        }
        if ((class230.field3489[class295.field4642][class217.field3280.field4019 >> 7][class217.field3280.field4085 >> 7] & 0x4) != 0) {
            class269.method1779(1, false, 0, class194.field2682, class217.field3280.field4085 >> 7, class217.field3280.field4019 >> 7);
        }
        if (class275.field4265 >= 310) {
            return;
        }
        int var5 = class41.field618 >> 7;
        int var6 = class217.field3280.field4019 >> 7;
        int var7 = class89.field1252 >> 7;
        int var8;
        if (var5 < var6) {
            var8 = var6 - var5;
        } else {
            var8 = var5 - var6;
        }
        int var9 = class217.field3280.field4085 >> 7;
        int var10;
        if (var7 < var9) {
            var10 = var9 - var7;
        } else {
            var10 = var7 - var9;
        }
        if (var8 > var10) {
            int var11 = var10 * 65536 / var8;
            int var12 = 32768;
            while (var5 != var6) {
                if (var5 < var6) {
                    var5++;
                } else if (var5 > var6) {
                    var5--;
                }
                if ((class230.field3489[class295.field4642][var5][var7] & 0x4) != 0) {
                    class269.method1779(1, false, 1, class194.field2682, var7, var5);
                    return;
                }
                var12 += var11;
                if (var12 >= 65536) {
                    if (var9 > var7) {
                        var7++;
                    } else if (var9 < var7) {
                        var7--;
                    }
                    var12 -= 65536;
                    if ((class230.field3489[class295.field4642][var5][var7] & 0x4) != 0) {
                        class269.method1779(1, false, 1, class194.field2682, var7, var5);
                        return;
                    }
                }
            }
            return;
        }
        int var13 = var8 * 65536 / var10;
        int var14 = 32768;
        while (var7 != var9) {
            if (var7 < var9) {
                var7++;
            } else if (var9 < var7) {
                var7--;
            }
            if ((class230.field3489[class295.field4642][var5][var7] & 0x4) != 0) {
                class269.method1779(arg0 - 21, false, 1, class194.field2682, var7, var5);
                return;
            }
            var14 += var13;
            if (var14 >= 65536) {
                if (var6 > var5) {
                    var5++;
                } else if (var5 > var6) {
                    var5--;
                }
                var14 -= 65536;
                if ((class230.field3489[class295.field4642][var5][var7] & 0x4) != 0) {
                    class269.method1779(1, false, 1, class194.field2682, var7, var5);
                    return;
                }
            }
        }
        return;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILhc;I)Lug;")
    public static final class205 method1238(int arg0, class235 arg1, int arg2) {
        byte[] var3 = arg1.method1565(arg0, -115);
        field2693++;
        if (arg2 > -117) {
            return null;
        } else if (var3 == null) {
            return null;
        } else {
            return new class205(var3);
        }
    }
}
