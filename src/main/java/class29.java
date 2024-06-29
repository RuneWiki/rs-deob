import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class29 {

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "Lhe;")
    private class19 field558 = new class19(256);

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "Lhe;")
    private class19 field562 = new class19(256);

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "Ltg;")
    private class180 field546;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "Ltg;")
    private class180 field553;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Lp;")
    public static class280 field537 = class18.method140((byte) -123, "Fps:");

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "Lp;")
    public static class280 field539 = class18.method140((byte) -128, "Choisir une option");

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Lp;")
    public static class280 field542 = class18.method140((byte) -123, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "Z")
    public static boolean field541 = false;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "Lp;")
    public static class280 field552 = class18.method140((byte) -126, "::breakcon");

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Lp;")
    public static class280 field545 = class18.method140((byte) -121, "Liste des mises -9 jour charg-Be");

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Lp;")
    public static class280 field547 = class18.method140((byte) -119, "; Expires=");

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "Lp;")
    public static class280 field559 = class18.method140((byte) -117, "unzap");

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "Lp;")
    public static class280 field561 = class18.method140((byte) -118, "Lade Liste der Welten");

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "[I")
    public static int[] field554;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
    public static final void method254(byte arg0) {
        field560++;
        int var1 = class161.field2821.length;
        int var2 = 0;
        int var3 = 51 % ((arg0 + 5) / 56);
        while (var2 < var1) {
            if (class161.field2821[var2] != null) {
                int var4 = -1;
                for (int var5 = 0; var5 < class246.field4313; var5++) {
                    if (class3.field93[var2] == class263.field4640[var5]) {
                        var4 = var5;
                        break;
                    }
                }
                if (var4 == -1) {
                    class263.field4640[class246.field4313] = class3.field93[var2];
                    var4 = class246.field4313++;
                }
                int var6 = 0;
                class25 var7 = new class25(class161.field2821[var2]);
                while (var7.field481 < class161.field2821[var2].length && var6 < 511) {
                    int var8 = var4 | var6++ << 6;
                    int var9 = var7.method193((byte) 77);
                    int var10 = var9 & 0x3F;
                    int var11 = var9 >> 7 & 0x3F;
                    int var12 = var9 >> 14;
                    int var13 = (class3.field93[var2] >> 8) * 64 - (class49.field806 - var11);
                    int var14 = (class3.field93[var2] & 0xFF) * 64 + var10 - class91.field1480;
                    class255 var15 = class265.method1785(var7.method193((byte) 77), true);
                    if (class46.field756[var8] == null && (var15.field4486 & 0x1) > 0 && class23.field427 == var12 && var13 >= 0 && (var13 + var15.field4489) < 104 && var14 >= 0 && var15.field4489 + var14 < 104) {
                        class46.field756[var8] = new class61();
                        class61 var16 = class46.field756[var8];
                        class46.field767[class112.field1845++] = var8;
                        var16.field4848 = class117.field2104;
                        var16.method432(var15, 1);
                        var16.method1843(-62, var16.field987.field4489);
                        var16.field4863 = var16.field4809 = class122.field2143[var16.field987.field4505];
                        var16.field4860 = var16.field987.field4475;
                        var16.field4858 = var16.field987.field4468;
                        var16.field4855 = var16.field987.field4479;
                        var16.field4850 = var16.field987.field4510;
                        var16.field4854 = var16.field987.field4520;
                        var16.field4822 = var16.field987.field4462;
                        var16.field4843 = var16.field987.field4499;
                        var16.field4834 = var16.field987.field4472;
                        if (var16.field4843 == 0) {
                            var16.field4809 = 0;
                        }
                        var16.method1834(var14, 0, var16.method984((byte) -34), true, var13);
                    }
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([IIZI)Lei;")
    private final class171 method255(int[] arg0, int arg1, boolean arg2, int arg3) {
        field557++;
        int var5 = arg3 ^ (arg1 >>> 12 | arg1 & 0xFFF << 4);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class171 var9 = (class171) this.field562.method150(var7, 101);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            if (!arg2) {
                method257((byte) -67);
            }
            class270 var10 = class270.method1809(this.field546, arg1, arg3);
            if (var10 == null) {
                return null;
            }
            class171 var11 = var10.method1808();
            this.field562.method148(-1, var11, var7);
            if (arg0 != null) {
                arg0[0] -= var11.field2999.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II[I)Lei;")
    public final class171 method256(int arg0, int arg1, int[] arg2) {
        field551++;
        if (arg1 > -29) {
            this.method256(-112, -80, (int[]) null);
        }
        if (this.field553.method1228(true) == 1) {
            return this.method258(0, arg2, 1866994886, arg0);
        } else if (this.field553.method1259(arg0, 37) == 1) {
            return this.method258(arg0, arg2, 1866994886, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
    public static void method257(byte arg0) {
        field559 = null;
        field554 = null;
        field545 = null;
        int var1 = -25 % ((arg0 - 29) / 48);
        field542 = null;
        field547 = null;
        field561 = null;
        field552 = null;
        field539 = null;
        field537 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I[III)Lei;")
    private final class171 method258(int arg0, int[] arg1, int arg2, int arg3) {
        int var5 = arg3 ^ (arg0 >>> 12 | arg0 << 4 & 0xFFF3);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class171 var9 = (class171) this.field562.method150(var7, arg2 - 1866994797);
        field538++;
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class170 var10 = (class170) this.field558.method150(var7, 104);
            if (var10 == null) {
                var10 = class170.method1185(this.field553, arg0, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field558.method148(arg2 ^ 0x90B7EB39, var10, var7);
            }
            class171 var11 = var10.method1187(arg1);
            if (var11 == null) {
                return null;
            }
            var10.method1146(arg2 ^ 0x6F4872E9);
            if (arg2 != 1866994886) {
                this.method255((int[]) null, 73, false, -13);
            }
            this.field562.method148(arg2 ^ 0x90B7EB39, var11, var7);
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)Z")
    public static final boolean method259(int arg0, int arg1) {
        field543++;
        if (arg1 == -25777) {
            return (arg0 >> 22 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II[I)Lei;")
    public final class171 method260(int arg0, int arg1, int[] arg2) {
        field549++;
        if (this.field546.method1228(true) == 1) {
            return this.method255(arg2, 0, true, arg0);
        } else if (arg1 != -16241) {
            return null;
        } else if (this.field546.method1259(arg0, 80) == 1) {
            return this.method255(arg2, arg0, true, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)V")
    public static final void method261(int arg0, byte arg1) {
        field555++;
        class154.field2674.method1478(arg0, 97);
        if (arg1 >= 30) {
            class19.field349.method1478(arg0, 85);
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Ltg;Ltg;)V")
    public class29(class180 arg0, class180 arg1) {
        this.field546 = arg0;
        this.field553 = arg1;
    }
}
