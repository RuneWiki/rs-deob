import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class105 {

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Lvd;")
    public class148 field2427 = new class148();

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "Lja;")
    public static class62 field2423 = class30.method243(43, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Lja;")
    public static class62 field2424 = class30.method243(43, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "[Lic;")
    public static class58[] field2428 = new class58[1000];

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "Lja;")
    public static class62 field2429 = class30.method243(43, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "Lja;")
    public static class62 field2436 = class30.method243(43, "Ung-Ultige Session)2ID)3");

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "Lja;")
    public static class62 field2444 = class30.method243(43, ")4lang)4de");

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "Lja;")
    public static class62 field2443 = class30.method243(43, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "Lpd;")
    public static class108 field2432;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "Lvd;")
    private class148 field2440;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Lma;")
    public static class83 field2419;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)Lvd;")
    public final class148 method839(byte arg0) {
        field2435++;
        class148 var2 = this.field2440;
        if (this.field2427 == var2) {
            this.field2440 = null;
            return null;
        } else {
            this.field2440 = var2.field3491;
            int var3 = -62 % ((-arg0 - 70) / 54);
            return var2;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)Lvd;")
    public final class148 method840(boolean arg0) {
        field2420++;
        class148 var2 = this.field2427.field3485;
        if (this.field2427 == var2) {
            this.field2440 = null;
            return null;
        }
        this.field2440 = var2.field3485;
        if (!arg0) {
            this.method846((byte) 27);
        }
        return var2;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)Lvd;")
    public final class148 method841(byte arg0) {
        class148 var2 = this.field2440;
        field2441++;
        if (arg0 != 18) {
            this.method840(false);
        }
        if (this.field2427 == var2) {
            this.field2440 = null;
            return null;
        } else {
            this.field2440 = var2.field3485;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static final void method842(int arg0) {
        class143 var1 = (class143) class98.field2274.method840(true);
        field2431++;
        if (arg0 != 0) {
            method848(-88, (byte) -65);
        }
        while (var1 != null) {
            if (class155.field3598 != var1.field3346 || var1.field3332) {
                var1.method1176((byte) -123);
            } else if (class86.field2060 >= var1.field3330) {
                var1.method1131(class45.field1024, 110);
                if (var1.field3332) {
                    var1.method1176((byte) 93);
                } else {
                    class119.field2703.method576(var1.field3346, var1.field3327, var1.field3350, var1.field3343, 60, var1, 0, -1, false);
                }
            }
            var1 = (class143) class98.field2274.method841((byte) 18);
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(B)Lvd;")
    public final class148 method843(byte arg0) {
        int var2 = 57 % ((51 - arg0) / 36);
        field2438++;
        class148 var3 = this.field2427.field3491;
        if (this.field2427 == var3) {
            return null;
        } else {
            var3.method1176((byte) -127);
            return var3;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lvd;Z)V")
    public final void method844(class148 arg0, boolean arg1) {
        field2425++;
        if (arg0.field3491 != null) {
            arg0.method1176((byte) -125);
        }
        if (arg1) {
            method850(56);
        }
        arg0.field3485 = this.field2427.field3485;
        arg0.field3491 = this.field2427;
        arg0.field3491.field3485 = arg0;
        arg0.field3485.field3491 = arg0;
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(B)V")
    public final void method845(byte arg0) {
        field2421++;
        if (arg0 > -75) {
            method842(-8);
        }
        while (true) {
            class148 var2 = this.field2427.field3485;
            if (this.field2427 == var2) {
                return;
            }
            var2.method1176((byte) 40);
        }
    }

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "(B)Lvd;")
    public final class148 method846(byte arg0) {
        field2434++;
        class148 var2 = this.field2427.field3491;
        if (this.field2427 == var2) {
            this.field2440 = null;
            return null;
        }
        this.field2440 = var2.field3491;
        if (arg0 >= -33) {
            this.method841((byte) 13);
        }
        return var2;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lvd;B)V")
    public final void method847(class148 arg0, byte arg1) {
        if (arg1 <= 91) {
            return;
        }
        if (arg0.field3491 != null) {
            arg0.method1176((byte) -128);
        }
        field2437++;
        arg0.field3485 = this.field2427;
        arg0.field3491 = this.field2427.field3491;
        arg0.field3491.field3485 = arg0;
        arg0.field3485.field3491 = arg0;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)Lua;")
    public static final class138 method848(int arg0, byte arg1) {
        field2442++;
        class138 var2 = (class138) class59.field1442.method129((long) arg0, 24838);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class15.field361.method867(9, 15, arg0);
        class138 var4 = new class138();
        var4.field3198 = arg0;
        if (arg1 != 21) {
            return null;
        }
        if (var3 != null) {
            var4.method1102(false, new class128(var3));
        }
        var4.method1109(-110);
        class59.field1442.method128((byte) -122, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILvd;Lvd;)V")
    public final void method849(int arg0, class148 arg1, class148 arg2) {
        field2439++;
        if (arg1.field3491 != null) {
            arg1.method1176((byte) -127);
        }
        int var4 = 49 % ((arg0 + 35) / 43);
        arg1.field3485 = arg2;
        arg1.field3491 = arg2.field3491;
        arg1.field3491.field3485 = arg1;
        arg1.field3485.field3491 = arg1;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
    public static void method850(int arg0) {
        field2432 = null;
        field2428 = null;
        field2443 = null;
        field2444 = null;
        if (arg0 != 0) {
            field2419 = null;
        }
        field2429 = null;
        field2419 = null;
        field2436 = null;
        field2423 = null;
        field2424 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)Lia;")
    public static final class56 method851(byte arg0, int arg1) {
        field2426++;
        if (arg0 >= -60) {
            return null;
        }
        class56 var2 = (class56) class6.field194.method129((long) arg1, 24838);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class31.field752.method867(16, 15, arg1);
        class56 var4 = new class56();
        if (var3 != null) {
            var4.method381(new class128(var3), false);
        }
        class6.field194.method128((byte) -78, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B[B)V")
    public static final void method852(byte arg0, byte[] arg1) {
        field2430++;
        class128 var2 = new class128(arg1);
        var2.field2873 = arg1.length - 2;
        class56.field1380 = var2.method1041(212464720);
        class23.field539 = new int[class56.field1380];
        class143.field3335 = new int[class56.field1380];
        class82.field1986 = new byte[class56.field1380][];
        class57.field1397 = new int[class56.field1380];
        class17.field395 = new int[class56.field1380];
        var2.field2873 = arg1.length - class56.field1380 * 8 - 7;
        class16.field377 = var2.method1041(212464720);
        class10.field256 = var2.method1041(212464720);
        int var3 = (var2.method1025(255) & 0xFF) + 1;
        for (int var4 = 0; var4 < class56.field1380; var4++) {
            class57.field1397[var4] = var2.method1041(212464720);
        }
        for (int var5 = 0; var5 < class56.field1380; var5++) {
            class143.field3335[var5] = var2.method1041(212464720);
        }
        for (int var6 = 0; var6 < class56.field1380; var6++) {
            class23.field539[var6] = var2.method1041(212464720);
        }
        if (arg0 >= -79) {
            method850(-16);
        }
        for (int var7 = 0; var7 < class56.field1380; var7++) {
            class17.field395[var7] = var2.method1041(212464720);
        }
        var2.field2873 = arg1.length + 3 - class56.field1380 * 8 - var3 * 3 - 7;
        class136.field3146 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class136.field3146[var8] = var2.method1026((byte) 104);
            if (class136.field3146[var8] == 0) {
                class136.field3146[var8] = 1;
            }
        }
        var2.field2873 = 0;
        for (int var9 = 0; var9 < class56.field1380; var9++) {
            int var10 = class17.field395[var9];
            int var11 = class23.field539[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class82.field1986[var9] = var13;
            int var14 = var2.method1025(255);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method1028(-115487256);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var11; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var13[var15 + var11 * var16] = var2.method1028(-115487256);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)Lvd;")
    public final class148 method853(int arg0) {
        field2433++;
        class148 var2 = this.field2427.field3485;
        if (this.field2427 == var2) {
            return null;
        } else {
            var2.method1176((byte) 127);
            return arg0 > -11 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
    public class105() {
        this.field2427.field3491 = this.field2427;
        this.field2427.field3485 = this.field2427;
    }
}
