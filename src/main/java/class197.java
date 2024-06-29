import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class197 extends class9 {

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "Lwa;")
    public static class75 field3307 = null;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "Lwa;")
    private static class75 field3305 = class66.method560("cyan:", false);

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "Lwa;")
    public static class75 field3310 = class66.method560("sl_flags", false);

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "Lwa;")
    public static class75 field3306 = field3305;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "Lwa;")
    public static class75 field3301 = field3305;

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "[[S")
    public static short[][] field3309 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "I")
    public static int field3304 = 0;

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "[[I")
    public static int[][] field3300;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIIII)V", line = 11)
    public static final void method1468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3303++;
        int var8 = class14.method74(class294.field5041, arg6, -1178441849, class90.field1495);
        int var9 = class14.method74(class294.field5041, arg0, -1178441849, class90.field1495);
        int var10 = class14.method74(class288.field4956, arg2, -1178441849, class153.field2635);
        int var11 = class14.method74(class288.field4956, arg1, -1178441849, class153.field2635);
        if (arg5 < 26) {
            field3307 = (class75) null;
        }
        int var12 = class14.method74(class294.field5041, arg6 + arg7, -1178441849, class90.field1495);
        int var13 = class14.method74(class294.field5041, arg0 - arg7, -1178441849, class90.field1495);
        for (int var14 = var8; var14 < var12; var14++) {
            class150.method1151(7, class63.field1096[var14], var10, arg4, var11);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class150.method1151(7, class63.field1096[var15], var10, arg4, var11);
        }
        int var16 = class14.method74(class288.field4956, arg2 + arg7, -1178441849, class153.field2635);
        int var17 = class14.method74(class288.field4956, arg1 - arg7, -1178441849, class153.field2635);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class63.field1096[var18];
            class150.method1151(7, var19, var10, arg4, var16);
            class150.method1151(7, var19, var16, arg3, var17);
            class150.method1151(7, var19, var17, arg4, var11);
        }
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)V", line = 74)
    public static void method1469(int arg0) {
        if (arg0 != 1) {
            field3301 = (class75) null;
        }
        field3310 = null;
        field3309 = (short[][]) null;
        field3300 = (int[][]) null;
        field3307 = null;
        field3305 = null;
        field3301 = null;
        field3306 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII)I", line = 95)
    public static final int method1470(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 24466) {
            method1469(-79);
        }
        int var4 = arg2 & 0x3;
        field3308++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 1023 - arg0;
        } else if (var4 == 2) {
            return 1023 - arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)V", line = 128)
    public static final void method1471(int arg0, int arg1) {
        class223.field3783 = new int[arg0];
        class198.field3316 = new int[arg0];
        field3302++;
        class145.field2500 = new int[arg0];
        class5.field59 = new int[arg0];
        if (arg1 != 10429) {
            field3304 = -114;
        }
        class176.field2957 = new int[arg0];
    }
}
