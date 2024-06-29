import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class84 {

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    private int field1661 = 0;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "Lti;")
    private class5 field1666;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "Loh;")
    public static class263 field1660 = class253.method1681(-127, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "Loh;")
    public static class263 field1664 = class253.method1681(-123, "gleiten:");

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "Loh;")
    public static class263 field1663 = class253.method1681(-123, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "Lfj;")
    private class241 field1659;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public static final void method561(byte arg0) {
        field1668++;
        if (class100.method679((byte) -74) != 2) {
            return;
        }
        byte var1 = (byte) (class150.field2711 - 4 & 0xFF);
        int var2 = class150.field2711 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class214.field3812[var3][var2][var17] = var1;
            }
        }
        int var4 = 56 / ((arg0 - 2) / 52);
        if (class12.field321 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class154.field2783[var5] = -1000000;
            class145.field2651[var5] = 1000000;
            class187.field3364[var5] = 0;
            class41.field917[var5] = 1000000;
            class77.field1580[var5] = 0;
        }
        if (class89.field1772 != 1) {
            int var16 = class120.method781(class12.field321, class127.field2357, false, class152.field2738);
            if (var16 - class87.field1750 >= 800 || (class77.field1576[class12.field321][class127.field2357 >> 7][class152.field2738 >> 7] & 0x4) == 0) {
                return;
            }
            class86.method601(class127.field2357 >> 7, class18.field417, class152.field2738 >> 7, false, (byte) -106, 1);
            return;
        }
        if ((class77.field1576[class12.field321][class229.field4018.field4688 >> 7][class229.field4018.field4705 >> 7] & 0x4) != 0) {
            class86.method601(class229.field4018.field4688 >> 7, class18.field417, class229.field4018.field4705 >> 7, false, (byte) 119, 0);
        }
        if (class73.field1528 >= 310) {
            return;
        }
        int var6 = class127.field2357 >> 7;
        int var7 = class152.field2738 >> 7;
        int var8 = class229.field4018.field4688 >> 7;
        int var9 = class229.field4018.field4705 >> 7;
        int var10;
        if (var8 <= var6) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        int var11;
        if (var9 > var7) {
            var11 = var9 - var7;
        } else {
            var11 = var7 - var9;
        }
        if (var10 > var11) {
            int var12 = 32768;
            int var13 = var11 * 65536 / var10;
            while (var6 != var8) {
                if (var8 > var6) {
                    var6++;
                } else if (var8 < var6) {
                    var6--;
                }
                if ((class77.field1576[class12.field321][var6][var7] & 0x4) != 0) {
                    class86.method601(var6, class18.field417, var7, false, (byte) 108, 1);
                    return;
                }
                var12 += var13;
                if (var12 >= 65536) {
                    var12 -= 65536;
                    if (var7 < var9) {
                        var7++;
                    } else if (var9 < var7) {
                        var7--;
                    }
                    if ((class77.field1576[class12.field321][var6][var7] & 0x4) != 0) {
                        class86.method601(var6, class18.field417, var7, false, (byte) -69, 1);
                        return;
                    }
                }
            }
            return;
        }
        int var14 = var10 * 65536 / var11;
        int var15 = 32768;
        while (var7 != var9) {
            if (var7 < var9) {
                var7++;
            } else if (var7 > var9) {
                var7--;
            }
            if ((class77.field1576[class12.field321][var6][var7] & 0x4) != 0) {
                class86.method601(var6, class18.field417, var7, false, (byte) 111, 1);
                return;
            }
            var15 += var14;
            if (var15 >= 65536) {
                var15 -= 65536;
                if (var8 > var6) {
                    var6++;
                } else if (var8 < var6) {
                    var6--;
                }
                if ((class77.field1576[class12.field321][var6][var7] & 0x4) != 0) {
                    class86.method601(var6, class18.field417, var7, false, (byte) 124, 1);
                    return;
                }
            }
        }
        return;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)Lfj;")
    public final class241 method562(byte arg0) {
        field1662++;
        this.field1661 = 0;
        int var2 = 35 % ((arg0 - 72) / 49);
        return this.method566((byte) -33);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)Lri;")
    public static final class64 method563(int arg0, int arg1, int arg2) {
        field1669++;
        int var3 = 30 % ((arg2 - 7) / 44);
        class64 var4 = (class64) class153.field2775.method31(-32665, (long) arg1 | (long) arg0 << 32);
        if (var4 == null) {
            var4 = new class64(arg0, arg1);
            class153.field2775.method33(var4, var4.field4226, -109);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(B)V")
    public static void method564(byte arg0) {
        field1664 = null;
        field1660 = null;
        if (arg0 == 106) {
            field1663 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public static final void method565(int arg0) {
        field1658++;
        if (class50.field1077) {
            int var1 = 38 % ((arg0 - 5) / 50);
            class200.field3620 = null;
            class50.field1077 = false;
            class91.field1802 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(B)Lfj;")
    public final class241 method566(byte arg0) {
        field1665++;
        if (this.field1661 > 0 && this.field1666.field103[this.field1661 - 1] != this.field1659) {
            class241 var2 = this.field1659;
            this.field1659 = var2.field4235;
            return var2;
        }
        while (this.field1661 < this.field1666.field104) {
            class241 var3 = this.field1666.field103[this.field1661++].field4235;
            if (this.field1666.field103[this.field1661 - 1] != var3) {
                this.field1659 = var3.field4235;
                return var3;
            }
        }
        if (arg0 > -30) {
            method561((byte) -65);
        }
        return null;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lti;)V")
    public class84(class5 arg0) {
        this.field1666 = arg0;
    }
}
