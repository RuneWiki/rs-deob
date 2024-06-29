import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class259 implements class156 {

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "Lmi;")
    public static class128 field4530 = new class128();

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "Lhh;")
    public static class163 field4538 = class137.method1065("gelb:", 17);

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "Z")
    public static volatile boolean field4534 = true;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "Lhh;")
    public static class163 field4535 = class137.method1065("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", 17);

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field4536 = 0;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "[S")
    public static short[] field4544;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "[[[Leg;")
    public static class144[][][] field4542;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "([IBIJ)Lhh;")
    public final class163 method1153(int[] arg0, byte arg1, int arg2, long arg3) {
        field4532++;
        if (arg1 != -118) {
            method1755((byte) -55);
        }
        if (arg2 == 0) {
            class157 var6 = class123.method964(true, arg0[0]);
            return var6.method1155((byte) 124, (int) arg3);
        } else if (arg2 == 1 || arg2 == 10) {
            class99 var7 = class120.method939(22952, (int) arg3);
            return var7.field1903;
        } else if (arg2 == 6 || arg2 == 7) {
            return class123.method964(true, arg0[0]).method1155((byte) 124, (int) arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
    public static final void method1748(int arg0) {
        if (class57.field940 != null) {
            class237 var1 = class57.field940;
            synchronized (class57.field940) {
                class57.field940 = null;
            }
        }
        field4540++;
        if (arg0 != -11) {
            field4543 = 37;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II[IJ)Lhh;")
    public static final class163 method1749(int arg0, int arg1, int[] arg2, long arg3) {
        field4545++;
        if (class14.field214 != null) {
            class163 var5 = class14.field214.method1153(arg2, (byte) -118, arg1, arg3);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg0 != 0) {
            field4534 = false;
        }
        return arg1 == 5 ? class12.method76(arg3, (byte) 29).method1190((byte) 73) : class129.method1026(arg3, (byte) 15);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
    public static void method1750(byte arg0) {
        field4535 = null;
        if (arg0 != -72) {
            field4544 = null;
        }
        field4538 = null;
        field4544 = null;
        field4542 = null;
        field4530 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)V")
    public static final void method1751(int arg0, int arg1) {
        class75.field1404 = arg0;
        class226.field4091 = -1;
        class49.field817 = 0;
        class134.field2590 = -1;
        class221.field4030 = false;
        class13.field212 = null;
        field4541++;
        class157.field2919 = arg1;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(JI)V")
    public static final void method1752(long arg0, int arg1) {
        class191.field3499.field1541 = 0;
        class191.field3499.method655(0, 173);
        class191.field3499.method651(-645765520, arg0);
        class244.field4321 = -3;
        class58.field955 = 0;
        int var3 = -1 / ((-arg1 - 45) / 44);
        class75.field1403 = 0;
        field4539++;
        class31.field481 = 1;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1753(int arg0, int arg1, int arg2, long arg3) {
        class144 var5 = field4542[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field2731 != null && var5.field2731.field2920 == arg3) {
            return true;
        } else if (var5.field2742 != null && var5.field2742.field1755 == arg3) {
            return true;
        } else if (var5.field2736 != null && var5.field2736.field3817 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field2741; var6++) {
                if (var5.field2746[var6].field2568 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lpa;ILhh;)Lkc;")
    public static final class227 method1754(class123 arg0, int arg1, class163 arg2) {
        field4531++;
        int var3 = arg0.method983(24108, arg2);
        if (var3 == -1) {
            return new class227(0);
        }
        int[] var4 = arg0.method958((byte) 16, var3);
        class227 var5 = new class227(var4.length);
        for (int var6 = arg1; var6 < var5.field4096; var6++) {
            class81 var7 = new class81(arg0.method973(var3, true, var4[var6]));
            var5.field4098[var6] = var7.method605(true);
            var5.field4101[var6] = var7.method635(87);
            var5.field4105[var6] = (short) var7.method658(-113);
            var5.field4097[var6] = (short) var7.method658(-114);
            var5.field4106[var6] = var7.method620((byte) -82);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V")
    public static final void method1755(byte arg0) {
        int var1 = class24.field389 >> 7;
        if (class132.field2560 < 128) {
            class132.field2560 = 128;
        }
        field4537++;
        int var2 = class29.field448 >> 7;
        class93.field1750 &= 0x7FF;
        if (class132.field2560 > 383) {
            class132.field2560 = 383;
        }
        int var3 = class127.method1011(class29.field448, class24.field389, class20.field323, 29908);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class20.field323;
                    if (var7 < 3 && (class123.field2344[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var3 - class228.field4107[var7][var5][var6];
                    if (var4 < var8) {
                        var4 = var8;
                    }
                }
            }
        }
        if (arg0 < 119) {
            field4543 = 3;
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class145.field2759 < var9) {
            class145.field2759 += (var9 - class145.field2759) / 24;
        } else if (class145.field2759 > var9) {
            class145.field2759 += (var9 - class145.field2759) / 80;
            return;
        }
    }
}
