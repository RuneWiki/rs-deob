import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class224 extends class106 {

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "Loc;")
    private static class151 field3904 = class137.method873(2, "Players");

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "Loc;")
    public static class151 field3902 = class137.method873(2, "Einloggen");

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "Loc;")
    public static class151 field3901 = field3904;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "Ljava/lang/Object;")
    public static Object field3898 = new Object();

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "[J")
    public static long[] field3909 = new long[100];

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "[Z")
    public static boolean[] field3911 = new boolean[100];

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "[[S")
    public static short[][] field3912 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    public int field3893;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    public int field3894;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "I")
    public int field3897;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
    public int field3899;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
    public int field3900;

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "Loc;")
    public class151 field3906;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "Loh;")
    public static class156 field3896;

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "Lwd;")
    public class232 field3905;

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "Lwd;")
    public class232 field3907;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "[Lhh;")
    public static class84[] field3910;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "[Ljava/lang/Object;")
    public Object[] field3895;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "()V")
    public static final void method1409() {
        for (int var0 = 0; var0 < class116.field2100; var0++) {
            for (int var5 = 0; var5 < class228.field4032; var5++) {
                for (int var6 = 0; var6 < class225.field3924; var6++) {
                    class95.field1776[var0][var5][var6] = null;
                }
            }
        }
        for (int var1 = 0; var1 < class166.field3005; var1++) {
            for (int var4 = 0; var4 < class166.field3006[var1]; var4++) {
                class166.field3023[var1][var4] = null;
            }
            class166.field3006[var1] = 0;
        }
        for (int var2 = 0; var2 < class44.field919; var2++) {
            class219.field3817[var2] = null;
        }
        class44.field919 = 0;
        for (int var3 = 0; var3 < class2.field52.length; var3++) {
            class2.field52[var3] = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
    public static void method1410(int arg0) {
        field3902 = null;
        if (arg0 != -6882) {
            method1409();
        }
        field3896 = null;
        field3901 = null;
        field3904 = null;
        field3912 = null;
        field3898 = null;
        field3909 = null;
        field3911 = null;
        field3910 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "([BI)V")
    public static final void method1411(byte[] arg0, int arg1) {
        if (arg1 <= 108) {
            return;
        }
        field3903++;
        int var2 = 0;
        while (true) {
            while (var2 < arg0.length) {
                int var3 = (arg0[var2++] & 0xFF) * 64 - class63.field1228;
                int var4 = (arg0[var2++] & 0xFF) * 64 - class36.field759;
                if (var3 > 0 && var4 > 0 && var3 + 64 < class217.field3788 && class27.field581 > var4 + 64) {
                    int var5 = var3 >> 6;
                    int var6 = class27.field581 - var4 - 1 >> 6;
                    for (int var7 = 0; var7 < 64; var7++) {
                        for (int var8 = -64; var8 < 0; var8++) {
                            byte var9 = arg0[var2++];
                            if (var9 != 0) {
                                if (class160.field2900[var5][var6] == null) {
                                    class160.field2900[var5][var6] = new byte[4096];
                                }
                                class160.field2900[var5][var6][(-(var8 + 1) << 6) + var7] = var9;
                                byte var10 = arg0[var2++];
                                if (class152.field2751[var5][var6] == null) {
                                    class152.field2751[var5][var6] = new byte[4096];
                                }
                                class152.field2751[var5][var6][(-(var8 + 1) << 6) + var7] = var10;
                            }
                        }
                    }
                } else {
                    for (int var11 = -4096; var11 < 0; var11++) {
                        byte var12 = arg0[var2++];
                        if (var12 != 0) {
                            var2++;
                        }
                    }
                }
            }
            return;
        }
    }
}
