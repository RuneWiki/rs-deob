import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class412 {

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "Lad;")
    public static class11 field5493 = new class11(20);

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field5496 = -1;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "[Liu;")
    public static class424[] field5497 = new class424[14];

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "Loe;")
    public static class98 field5498 = new class98(16);

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field5499 = 0;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
    public static void method2433(boolean arg0) {
        if (arg0) {
            field5496 = -106;
        }
        field5493 = null;
        field5497 = null;
        field5498 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static final void method2434(int arg0) {
        if (arg0 != 3863) {
            return;
        }
        for (int var1 = 0; var1 < class16.field264; var1++) {
            int var2 = class414.field5507[var1];
            class295 var3 = class527.field7791[var2];
            if (var3 != null) {
                class487.method2913(100, var3.field3831.field128, var3);
            }
        }
        field5494++;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
    public static final void method2435(int arg0) {
        field5492++;
        if (class421.field5647.method651(true, class520.field7690) != 2) {
            return;
        }
        byte var1 = (byte) (class398.field5291 - 4 & 0xFF);
        int var2 = class398.field5291 % class200.field2594;
        if (arg0 != 22084) {
            method2435(115);
        }
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class118.field1647; var16++) {
                class478.field6978[var3][var2][var16] = var1;
            }
        }
        if (class366.field4715 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class138.field1840[var4] = -1000000;
            class63.field808[var4] = 1000000;
            class78.field998[var4] = 0;
            class438.field6106[var4] = 1000000;
            class261.field3306[var4] = 0;
        }
        if (class396.field5271 != 1) {
            int var5 = class366.method2145(class366.field4715, (byte) 18, class299.field3885, class291.field3724);
            if (var5 - class53.field730 < 800 && (class8.field76[class366.field4715][class299.field3885 >> 7][class291.field3724 >> 7] & 0x4) != 0) {
                class95.method646(false, class299.field3885 >> 7, class470.field6877, class291.field3724 >> 7, false, 1);
                return;
            }
            return;
        }
        if ((class8.field76[class366.field4715][class37.field573.field6239 >> 7][class37.field573.field6241 >> 7] & 0x4) != 0) {
            class95.method646(false, class37.field573.field6239 >> 7, class470.field6877, class37.field573.field6241 >> 7, false, 0);
        }
        if (class430.field5935 >= 2560) {
            return;
        }
        int var6 = class299.field3885 >> 7;
        int var7 = class291.field3724 >> 7;
        int var8 = class37.field573.field6239 >> 7;
        int var9 = class37.field573.field6241 >> 7;
        int var10;
        if (var6 < var8) {
            var10 = var8 - var6;
        } else {
            var10 = var6 - var8;
        }
        int var11;
        if (var9 > var7) {
            var11 = var9 - var7;
        } else {
            var11 = var7 - var9;
        }
        if (var10 == 0 && var11 == 0 || var10 <= -class200.field2594 || var10 >= class200.field2594 || var11 <= (-class118.field1647) || class118.field1647 <= var11) {
            class375.method2192((byte) 33, null, "RC: " + var6 + "," + var7 + " " + var8 + "," + var9 + " " + class35.field545 + "," + class336.field4299);
            return;
        }
        if (var10 > var11) {
            int var12 = var11 * 65536 / var10;
            int var13 = 32768;
            while (var6 != var8) {
                if (var6 < var8) {
                    var6++;
                } else if (var8 < var6) {
                    var6--;
                }
                if ((class8.field76[class366.field4715][var6][var7] & 0x4) != 0) {
                    class95.method646(false, var6, class470.field6877, var7, false, 1);
                    return;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var9 > var7) {
                        var7++;
                    } else if (var7 > var9) {
                        var7--;
                    }
                    if ((class8.field76[class366.field4715][var6][var7] & 0x4) != 0) {
                        class95.method646(false, var6, class470.field6877, var7, false, 1);
                        return;
                    }
                }
            }
            return;
        }
        int var14 = var10 * 65536 / var11;
        int var15 = 32768;
        while (var7 != var9) {
            if (var9 > var7) {
                var7++;
            } else if (var9 < var7) {
                var7--;
            }
            if ((class8.field76[class366.field4715][var6][var7] & 0x4) != 0) {
                class95.method646(false, var6, class470.field6877, var7, false, 1);
                return;
            }
            var15 += var14;
            if (var15 >= 65536) {
                if (var8 > var6) {
                    var6++;
                } else if (var6 > var8) {
                    var6--;
                }
                var15 -= 65536;
                if ((class8.field76[class366.field4715][var6][var7] & 0x4) != 0) {
                    class95.method646(false, var6, class470.field6877, var7, false, 1);
                    return;
                }
            }
        }
    }
}
