import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class258 {

    @OriginalMember(owner = "client!h", name = "a", descriptor = "Lpj;")
    public static class237 field4428 = class33.method353("Bitte warten Sie)3)3)3", 62);

    @OriginalMember(owner = "client!h", name = "c", descriptor = "Lpj;")
    public static class237 field4430 = class33.method353("Nehmen", 107);

    @OriginalMember(owner = "client!h", name = "k", descriptor = "Lpj;")
    private static class237 field4438 = class33.method353("flash2:", 91);

    @OriginalMember(owner = "client!h", name = "e", descriptor = "Lpj;")
    public static class237 field4432 = field4438;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "Lpj;")
    public static class237 field4434 = field4438;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "I")
    public static int field4439 = 0;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "Lpj;")
    public static class237 field4441 = class33.method353("huffman", 48);

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "[I")
    public static int[] field4440;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public static final void method1739(int arg0) {
        field4435++;
        if (class186.method1273(true) != 2) {
            return;
        }
        if (arg0 > -86) {
            field4440 = null;
        }
        byte var1 = (byte) (class152.field2698 - 4 & 0xFF);
        int var2 = class152.field2698 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class186.field3257[var3][var2][var16] = var1;
            }
        }
        if (class274.field4798 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class185.field3243[var4] = -1000000;
            class61.field1223[var4] = 1000000;
            class37.field837[var4] = 0;
            class174.field3056[var4] = 1000000;
            class33.field720[var4] = 0;
        }
        if (class163.field2899 != 1) {
            int var15 = class23.method216(-120, class167.field2957, class20.field380, class274.field4798);
            if (var15 - class112.field1957 >= 800 || (class73.field1410[class274.field4798][class20.field380 >> 7][class167.field2957 >> 7] & 0x4) == 0) {
                return;
            }
            class235.method1574(false, 1, class20.field380 >> 7, 4095, class167.field2957 >> 7, class274.field4775);
            return;
        }
        if ((class73.field1410[class274.field4798][class229.field3911.field3710 >> 7][class229.field3911.field3700 >> 7] & 0x4) != 0) {
            class235.method1574(false, 0, class229.field3911.field3710 >> 7, 4095, class229.field3911.field3700 >> 7, class274.field4775);
        }
        if (class214.field3654 >= 310) {
            return;
        }
        int var5 = class20.field380 >> 7;
        int var6 = class167.field2957 >> 7;
        int var7 = class229.field3911.field3710 >> 7;
        int var8 = class229.field3911.field3700 >> 7;
        int var9;
        if (var7 > var5) {
            var9 = var7 - var5;
        } else {
            var9 = var5 - var7;
        }
        int var10;
        if (var8 <= var6) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        if (var10 < var9) {
            int var11 = var10 * 65536 / var9;
            int var12 = 32768;
            while (var5 != var7) {
                if (var7 > var5) {
                    var5++;
                } else if (var7 < var5) {
                    var5--;
                }
                if ((class73.field1410[class274.field4798][var5][var6] & 0x4) != 0) {
                    class235.method1574(false, 1, var5, 4095, var6, class274.field4775);
                    return;
                }
                var12 += var11;
                if (var12 >= 65536) {
                    if (var6 < var8) {
                        var6++;
                    } else if (var8 < var6) {
                        var6--;
                    }
                    var12 -= 65536;
                    if ((class73.field1410[class274.field4798][var5][var6] & 0x4) != 0) {
                        class235.method1574(false, 1, var5, 4095, var6, class274.field4775);
                        return;
                    }
                }
            }
            return;
        }
        int var13 = var9 * 65536 / var10;
        int var14 = 32768;
        while (var6 != var8) {
            if (var6 < var8) {
                var6++;
            } else if (var6 > var8) {
                var6--;
            }
            if ((class73.field1410[class274.field4798][var5][var6] & 0x4) != 0) {
                class235.method1574(false, 1, var5, 4095, var6, class274.field4775);
                return;
            }
            var14 += var13;
            if (var14 >= 65536) {
                var14 -= 65536;
                if (var7 > var5) {
                    var5++;
                } else if (var7 < var5) {
                    var5--;
                }
                if ((class73.field1410[class274.field4798][var5][var6] & 0x4) != 0) {
                    class235.method1574(false, 1, var5, 4095, var6, class274.field4775);
                    return;
                }
            }
        }
        return;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)Lhk;")
    public static final class122 method1740(byte arg0) {
        field4436++;
        if (arg0 != -8) {
            method1741(80);
        }
        return class146.field2610.length > class216.field3759 ? class146.field2610[class216.field3759++] : null;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
    public static void method1741(int arg0) {
        field4430 = null;
        field4434 = null;
        field4440 = null;
        field4441 = null;
        field4438 = null;
        field4428 = null;
        if (arg0 != 5563) {
            method1742(true);
        }
        field4432 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
    public static final void method1742(boolean arg0) {
        field4437++;
        class273.field4730.method934((byte) 62);
        if (!arg0) {
            field4429 = -11;
        }
    }
}
