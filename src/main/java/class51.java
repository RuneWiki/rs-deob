import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class51 {

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field988 = 0;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "Leh;")
    public static class47 field984 = class195.method1282((byte) -4, "Fps:");

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "Leh;")
    public static class47 field992 = class195.method1282((byte) -4, "Spiel)2Engine wird gestartet)3)3)3");

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field993 = 0;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field985 = 0;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Lwf;")
    public static class204 field995 = new class204(4096);

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "Lea;")
    public static class40 field996 = new class40();

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "[[Lgf;")
    public static class61[][] field986;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static void method450(int arg0) {
        field995 = null;
        field986 = null;
        field992 = null;
        field996 = null;
        field984 = null;
        if (arg0 != 4309) {
            field986 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)V")
    public static final void method451(boolean arg0, int arg1) {
        int var2 = class130.field2575;
        if (arg0) {
            var2 = 1;
        }
        if (class123.field2489.field3291 >> 7 == class25.field488 && class123.field2489.field3281 >> 7 == class47.field926) {
            class25.field488 = 0;
        }
        for (int var3 = arg1; var3 < var2; var3++) {
            class32 var4;
            long var5;
            if (arg0) {
                var4 = class123.field2489;
                var5 = 8791798054912L;
            } else {
                var4 = class40.field795[class146.field2853[var3]];
                var5 = (long) class146.field2853[var3] << 32;
            }
            if (var4 != null && var4.method280(-112)) {
                var4.field609 = false;
                if ((class204.field4029 && class130.field2575 > 50 || class130.field2575 > 200) && !arg0 && var4.field3323 == var4.field3314) {
                    var4.field609 = true;
                }
                int var7 = var4.field3291 >> 7;
                int var8 = var4.field3281 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var4.field601 == null || class18.field362 < var4.field610 || var4.field624 <= class18.field362) {
                        if ((var4.field3291 & 0x7F) == 64 && (var4.field3281 & 0x7F) == 64) {
                            if (class130.field2553[var7][var8] == class53.field1033) {
                                continue;
                            }
                            class130.field2553[var7][var8] = class53.field1033;
                        }
                        var4.field3301 = class39.method335(var4.field3291, class196.field3827, var4.field3281, 20896);
                        class74.method652(class196.field3827, var4.field3291, var4.field3281, var4.field3301, 60, var4, var4.field3286, var5, var4.field3333);
                    } else {
                        var4.field609 = false;
                        var4.field3301 = class39.method335(var4.field3291, class196.field3827, var4.field3281, 20896);
                        class144.method1027(class196.field3827, var4.field3291, var4.field3281, var4.field3301, var4, var4.field3286, var5, var4.field602, var4.field625, var4.field618, var4.field600);
                    }
                }
            }
        }
        field989++;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZILjava/util/Random;)I")
    public static final int method452(boolean arg0, int arg1, Random arg2) {
        field991++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class52.method460(121, arg1)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else if (arg0) {
            return -125;
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            return class92.method742(false, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Leh;Leh;Leh;I)V")
    public static final void method453(class47 arg0, class47 arg1, class47 arg2, int arg3) {
        field990++;
        class161.field3144 = arg2;
        if (arg3 < -74) {
            class161.field3146 = arg1;
            class161.field3121 = arg0;
        }
    }
}
