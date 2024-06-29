import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class201 {

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "Ls;")
    private class194 field3730;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static volatile int field3721 = 0;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "Lqe;")
    public static class179 field3723 = class206.method1380("Gegenstand f-Ur Mitglieder", (byte) -128);

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "[[I")
    public static int[][] field3722 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "Lqe;")
    public static class179 field3729 = class206.method1380("Passwort: ", (byte) 13);

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    public static int field3732 = 0;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "[[[B")
    public static byte[][][] field3728;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(JI)Lrb;")
    public final class186 method1332(long arg0, int arg1) {
        field3731++;
        class148 var4 = (class148) this.field3730.method1299((byte) 31, arg0);
        if (arg1 != 0) {
            method1338(9);
        }
        return var4 == null ? null : var4.field2673;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BI)Lij;")
    public static final class96 method1333(byte arg0, int arg1) {
        field3719++;
        int var2 = 8 % ((arg0 - 58) / 60);
        class96 var3 = (class96) class18.field469.method1299((byte) 62, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class59.field1271.method342(arg1, 4, (byte) -95);
        class96 var5 = new class96();
        if (var4 != null) {
            var5.method620(new class185(var4), (byte) -98, arg1);
        }
        class18.field469.method1303(var5, (long) arg1, (byte) 77);
        return var5;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILae;III)V")
    public static final void method1334(int arg0, class6 arg1, int arg2, int arg3, int arg4) {
        int var5 = 21 / ((-arg4 - 22) / 58);
        field3726++;
        if (class194.field3618 >= 3) {
            class145.method921(arg0, arg2, 0, arg1.field225, arg1.field74);
        } else {
            ((class126) class159.field2865).method807(arg0, arg2, arg1.field169, arg1.field73, class159.field2865.field2607 / 2, class159.field2865.field2601 / 2, class236.field4342, 256, arg1.field225, arg1.field74);
        }
        class186.field3455[arg3] = true;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)Llg;")
    public static final class126 method1335(int arg0) {
        field3718++;
        byte[] var1 = class173.field3102[0];
        int var2 = class187.field3493[0] * class150.field2703[0];
        int[] var3 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = class175.field3185[class107.method696(255, var1[var4])];
        }
        class126 var5 = new class126(class22.field544, class9.field257, class31.field674[arg0], class143.field2611[0], class187.field3493[0], class150.field2703[0], var3);
        class17.method129((byte) -122);
        return var5;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(JI)V")
    public final void method1336(long arg0, int arg1) {
        field3720++;
        this.field3730.method1304(arg0, -125);
        if (arg1 != 6) {
            field3728 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)I")
    public static final int method1337(int arg0, int arg1, int arg2) {
        if (arg2 != 8) {
            method1335(62);
        }
        field3733++;
        int var3 = class95.method613(arg1 - 1, true, arg0 - 1) + class95.method613(arg1 + 1, true, arg0 - 1) + class95.method613(arg1 - 1, true, arg0 + 1) + class95.method613(arg1 + 1, true, arg0 + 1);
        int var4 = class95.method613(arg1 - 1, true, arg0) + class95.method613(arg1 + 1, true, arg0) + class95.method613(arg1, true, arg0 - 1) + class95.method613(arg1, true, arg0 + 1);
        int var5 = class95.method613(arg1, true, arg0);
        return var3 / 16 + var5 / 4 + var4 / 8;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
    public static void method1338(int arg0) {
        field3722 = null;
        field3729 = null;
        field3723 = null;
        field3728 = null;
        if (arg0 <= 80) {
            field3728 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public final void method1339(byte arg0) {
        this.field3730.method1297((byte) 89);
        field3734++;
        if (arg0 < 62) {
            field3721 = 73;
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(I)V")
    public class201(int arg0) {
        this.field3730 = new class194(arg0);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(JZLrb;)V")
    public final void method1340(long arg0, boolean arg1, class186 arg2) {
        if (arg1) {
            this.field3730 = null;
        }
        this.field3730.method1303(new class148(arg2), arg0, (byte) -117);
        field3724++;
    }
}
