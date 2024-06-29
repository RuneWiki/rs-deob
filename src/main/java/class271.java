import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class271 {

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field4728 = -1;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "Laa;")
    public static class39 field4727 = new class39();

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field4729 = 0;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "Lha;")
    public static class46 field4733 = method1828(")4", -46);

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "Lha;")
    public static class46 field4734 = method1828("Texturen geladen)3", -46);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public int field4722;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public int field4725;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public int field4730;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "Lpi;")
    public static class181 field4731;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "[Lhh;")
    public static class263[] field4732;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lvd;B)V")
    public static final void method1826(class141 arg0, byte arg1) {
        arg0.field2537 = arg0.field2553;
        field4721++;
        if (arg0.field2547 == 0) {
            arg0.field2552 = 0;
            return;
        }
        if (arg0.field2575 != -1 && arg0.field2533 == 0) {
            class170 var2 = class119.method951(0, arg0.field2575);
            if (arg0.field2549 > 0 && var2.field3025 == 0) {
                arg0.field2552++;
                return;
            }
            if (arg0.field2549 <= 0 && var2.field3024 == 0) {
                arg0.field2552++;
                return;
            }
        }
        int var3 = arg0.field2585;
        int var4 = arg0.field2546;
        int var5 = arg0.field2523[arg0.field2547 - 1] * 128 + (arg0.method642(111) * 64);
        int var6 = arg0.field2517[arg0.field2547 - 1] * 128 + (arg0.method642(73) * 64);
        if (var5 - var3 > 256 || (var5 - var3) < -256 || var6 - var4 > 256 || var6 - var4 < -256) {
            arg0.field2585 = var5;
            arg0.field2546 = var6;
            return;
        }
        if (var3 >= var5) {
            if (var3 <= var5) {
                if (var4 < var6) {
                    arg0.field2526 = 1024;
                } else if (var6 < var4) {
                    arg0.field2526 = 0;
                }
            } else if (var6 > var4) {
                arg0.field2526 = 768;
            } else if (var4 > var6) {
                arg0.field2526 = 256;
            } else {
                arg0.field2526 = 512;
            }
        } else if (var6 > var4) {
            arg0.field2526 = 1280;
        } else if (var4 <= var6) {
            arg0.field2526 = 1536;
        } else {
            arg0.field2526 = 1792;
        }
        int var7 = arg0.field2526 - arg0.field2535 & 0x7FF;
        int var8 = arg0.field2541;
        int var9 = 4;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        boolean var10 = true;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field2561;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field2529;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field2550;
        }
        if (var8 == -1) {
            var8 = arg0.field2561;
        }
        arg0.field2537 = var8;
        if (arg0 instanceof class26) {
            var10 = ((class26) arg0).field511.field1469;
        }
        int var11 = -124 / ((27 - arg1) / 61);
        if (var10) {
            if (arg0.field2535 != arg0.field2526 && arg0.field2555 == -1 && arg0.field2568 != 0) {
                var9 = 2;
            }
            if (arg0.field2547 > 2) {
                var9 = 6;
            }
            if (arg0.field2547 > 3) {
                var9 = 8;
            }
            if (arg0.field2552 > 0 && arg0.field2547 > 1) {
                arg0.field2552--;
                var9 = 8;
            }
        } else {
            if (arg0.field2547 > 1) {
                var9 = 6;
            }
            if (arg0.field2547 > 2) {
                var9 = 8;
            }
            if (arg0.field2552 > 0 && arg0.field2547 > 1) {
                arg0.field2552--;
                var9 = 8;
            }
        }
        if (arg0.field2524[arg0.field2547 - 1]) {
            var9 <<= 0x1;
        }
        if (var5 > var3) {
            arg0.field2585 += var9;
            if (var5 < arg0.field2585) {
                arg0.field2585 = var5;
            }
        } else if (var3 > var5) {
            arg0.field2585 -= var9;
            if (var5 > arg0.field2585) {
                arg0.field2585 = var5;
            }
        }
        if (var6 > var4) {
            arg0.field2546 += var9;
            if (var6 < arg0.field2546) {
                arg0.field2546 = var6;
            }
        } else if (var6 < var4) {
            arg0.field2546 -= var9;
            if (arg0.field2546 < var6) {
                arg0.field2546 = var6;
            }
        }
        if (var9 >= 8 && arg0.field2561 == arg0.field2537 && arg0.field2540 != -1) {
            arg0.field2537 = arg0.field2540;
        }
        if (arg0.field2585 == var5 && arg0.field2546 == var6) {
            if (arg0.field2549 > 0) {
                arg0.field2549--;
            }
            arg0.field2547--;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
    public static final void method1827(byte arg0) {
        field4724++;
        for (int var1 = 0; var1 < 100; var1++) {
            class31.field592[var1] = true;
        }
        if (arg0 != -78) {
            field4732 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/lang/String;I)Lha;")
    public static final class46 method1828(String arg0, int arg1) {
        field4726++;
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        if (arg1 != -46) {
            method1830(-114);
        }
        class46 var4 = new class46();
        var4.field768 = new byte[var3];
        int var5 = 0;
        while (var5 < var3) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var5) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field768[var4.field762++] = (byte) ((var6 - 40) * 43 + (var7 - 48));
            } else if (var6 != 0) {
                var4.field768[var4.field762++] = (byte) var6;
            }
        }
        var4.method343(108);
        return var4.method320(true);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lpi;Lpi;I)I")
    public static final int method1829(class181 arg0, class181 arg1, int arg2) {
        field4720++;
        int var3 = 16 / ((66 - arg2) / 57);
        int var4 = 0;
        if (arg1.method1307((byte) -14, class141.field2563)) {
            var4++;
        }
        if (arg1.method1307((byte) -14, class202.field3613)) {
            var4++;
        }
        if (arg1.method1307((byte) -14, class147.field2648)) {
            var4++;
        }
        if (arg0.method1307((byte) -14, class141.field2563)) {
            var4++;
        }
        if (arg0.method1307((byte) -14, class202.field3613)) {
            var4++;
        }
        if (arg0.method1307((byte) -14, class147.field2648)) {
            var4++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static void method1830(int arg0) {
        int var1 = -8 % ((12 - arg0) / 36);
        field4732 = null;
        field4733 = null;
        field4727 = null;
        field4734 = null;
        field4731 = null;
    }
}
