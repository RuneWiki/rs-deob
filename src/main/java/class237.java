import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class237 {

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "J")
    public long field4379 = 0L;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "[J")
    public static long[] field4358 = new long[100];

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "[Lqe;")
    public static class179[] field4372 = new class179[200];

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "Lqe;")
    public static class179 field4359 = class206.method1380("document)3cookie=(R", (byte) 10);

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "Lqe;")
    public static class179 field4368 = class206.method1380("::gc", (byte) -13);

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "Lqe;")
    public static class179 field4370 = class206.method1380("Welt", (byte) 67);

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "Lqe;")
    private static class179 field4369 = class206.method1380("You can(Wt add yourself to your own ignore list)3", (byte) -126);

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "Lqe;")
    public static class179 field4357 = field4369;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public int field4356;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public int field4360;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public int field4365;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public int field4375;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    public int field4376;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "Ljd;")
    public static class101 field4378;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Lrb;")
    public class186 field4362;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "Lrb;")
    public class186 field4382;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "Lee;")
    public static class49 field4380;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "[[[I")
    public static int[][][] field4371;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
    public static final void method1537(int arg0) {
        class221.field4085.method1297((byte) 89);
        if (arg0 <= -113) {
            class177.field3215.method1297((byte) 89);
            field4364++;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIBII)V")
    public static final void method1538(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 >= -114) {
            field4357 = null;
        }
        field4367++;
        if (arg4 < arg1) {
            for (int var5 = arg4; var5 < arg1; var5++) {
                class14.field331[var5][arg0] = arg3;
            }
        } else {
            for (int var6 = arg1; var6 < arg4; var6++) {
                class14.field331[var6][arg0] = arg3;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BJ)V")
    public static final void method1539(byte arg0, long arg1) {
        field4373++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0 > -39) {
            field4372 = null;
        }
        for (int var3 = 0; var3 < class202.field3741; var3++) {
            if (class160.field2908[var3] == arg1) {
                class202.field3741--;
                class113.field2127++;
                for (int var4 = var3; var4 < class202.field3741; var4++) {
                    class152.field2743[var4] = class152.field2743[var4 + 1];
                    class10.field288[var4] = class10.field288[var4 + 1];
                    field4372[var4] = field4372[var4 + 1];
                    class160.field2908[var4] = class160.field2908[var4 + 1];
                    class139.field2569[var4] = class139.field2569[var4 + 1];
                }
                class43.field936 = class32.field693;
                class81.field1564.method70((byte) -62, 71);
                class81.field1564.method1232(arg1, (byte) 124);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)Lnb;")
    public static final class143 method1540(boolean arg0) {
        field4366++;
        int var1 = class187.field3493[0] * class150.field2703[0];
        byte[] var2 = class173.field3102[0];
        if (arg0) {
            return null;
        }
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class175.field3185[class107.method696(255, var2[var4])];
        }
        class126 var5 = new class126(class22.field544, class9.field257, class31.field674[0], class143.field2611[0], class187.field3493[0], class150.field2703[0], var3);
        class17.method129((byte) -109);
        return var5;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V")
    public static final void method1541(int arg0, int arg1) {
        field4363++;
        if (arg0 == -1 || !class152.method976(true, arg0)) {
            return;
        }
        class6[] var2 = class199.field3710[arg0];
        int var3 = 0;
        if (arg1 >= -125) {
            return;
        }
        while (var2.length > var3) {
            class6 var4 = var2[var3];
            if (var4.field192 != null) {
                class19 var5 = new class19();
                var5.field499 = var4;
                var5.field491 = var4.field192;
                class11.method76(var5, 2000000, -125);
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    public static void method1542(byte arg0) {
        field4380 = null;
        field4370 = null;
        field4358 = null;
        field4378 = null;
        field4372 = null;
        field4357 = null;
        field4368 = null;
        field4359 = null;
        if (arg0 != 51) {
            method1538(-113, -35, (byte) -84, -73, -30);
        }
        field4371 = null;
        field4369 = null;
    }
}
