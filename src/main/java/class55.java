import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class55 {

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "S")
    public static short field674 = 32767;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V", line = 11)
    public static final void method329(int arg0) {
        int var1 = class332.field5072 * 128 + 64;
        field673++;
        int var2 = class329.field5021 * 128 + 64;
        int var3 = class184.method1278(class138.field1940, -13660, var2, var1) - class312.field4824;
        if (class221.field3122 >= 100) {
            class109.field1506 = class329.field5021 * 128 + 64;
            class130.field1792 = class332.field5072 * 128 + 64;
            class301.field4704 = class184.method1278(class138.field1940, -13660, class109.field1506, class130.field1792) - class312.field4824;
        } else {
            if (class130.field1792 < var1) {
                class130.field1792 += (var1 - class130.field1792) * class221.field3122 / 1000 + class216.field3028;
                if (class130.field1792 > var1) {
                    class130.field1792 = var1;
                }
            }
            if (var3 > class301.field4704) {
                class301.field4704 += (var3 - class301.field4704) * class221.field3122 / 1000 + class216.field3028;
                if (var3 < class301.field4704) {
                    class301.field4704 = var3;
                }
            }
            if (class130.field1792 > var1) {
                class130.field1792 -= class216.field3028 + ((class130.field1792 - var1) * class221.field3122 / 1000);
                if (var1 > class130.field1792) {
                    class130.field1792 = var1;
                }
            }
            if (class301.field4704 > var3) {
                class301.field4704 -= (class301.field4704 - var3) * class221.field3122 / 1000 + class216.field3028;
                if (class301.field4704 < var3) {
                    class301.field4704 = var3;
                }
            }
            if (var2 > class109.field1506) {
                class109.field1506 += (var2 - class109.field1506) * class221.field3122 / 1000 + class216.field3028;
                if (class109.field1506 > var2) {
                    class109.field1506 = var2;
                }
            }
            if (class109.field1506 > var2) {
                class109.field1506 -= (class109.field1506 - var2) * class221.field3122 / 1000 + class216.field3028;
                if (class109.field1506 < var2) {
                    class109.field1506 = var2;
                }
            }
        }
        int var4 = class296.field4621 * 128 + 64;
        int var5 = class345.field5356 * 128 + 64;
        if (arg0 > -92) {
            return;
        }
        int var6 = class184.method1278(class138.field1940, -13660, var5, var4) - class153.field2107;
        int var7 = var6 - class301.field4704;
        int var8 = var5 - class109.field1506;
        int var9 = var4 - class130.field1792;
        int var10 = (int) Math.sqrt((double) (var9 * var9 + (var8 * var8)));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var9, (double) var8)) & 0x7FF;
        if (var11 > class30.field380) {
            class30.field380 += (var11 - class30.field380) * class149.field2066 / 1000 + class68.field897;
            if (class30.field380 > var11) {
                class30.field380 = var11;
            }
        }
        int var13 = var12 - class323.field4975;
        if (var11 < class30.field380) {
            class30.field380 -= (class30.field380 - var11) * class149.field2066 / 1000 + class68.field897;
            if (class30.field380 < var11) {
                class30.field380 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class323.field4975 += class149.field2066 * var13 / 1000 + class68.field897;
            class323.field4975 &= 0x7FF;
        }
        if (var13 < 0) {
            class323.field4975 -= class68.field897 + (-var13 * class149.field2066 / 1000);
            class323.field4975 &= 0x7FF;
        }
        int var14 = var12 - class323.field4975;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class323.field4975 = var12;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)V", line = 182)
    public static final void method330(boolean arg0) {
        for (class343 var1 = (class343) class292.field4585.method1540(5); var1 != null; var1 = (class343) class292.field4585.method1544(-73)) {
            int var2 = var1.field5329;
            if (class285.method2039(var2, -32660)) {
                boolean var3 = true;
                class263[] var4 = class175.field2535[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field3993;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field5065;
                    class263 var7 = class91.method530(var6, 10989328);
                    if (var7 != null) {
                        class239.method1712(0, var7);
                    }
                }
            }
        }
        if (!arg0) {
            method330(true);
        }
        field670++;
    }
}
