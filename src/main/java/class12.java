import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class12 {

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field227 = 0;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "Lsd;")
    public static class166 field218 = class135.method935("title)3jpg", 0);

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "[I")
    public static int[] field220 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "Lsd;")
    private static class166 field217 = class135.method935("white:", 0);

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "[I")
    public static int[] field233 = new int[5];

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "Lsd;")
    public static class166 field219 = field217;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "Lsd;")
    public static class166 field230 = field217;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "[I")
    public static int[] field238 = new int[25];

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "Lsd;")
    public static class166 field225 = class135.method935("", 0);

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "Lsd;")
    public static class166 field236 = field225;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "Lsd;")
    public static class166 field222 = field225;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "Lsd;")
    public static class166 field231 = field225;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "Lsd;")
    public static class166 field228 = field225;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "Lsd;")
    public static class166 field239 = field225;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "Lsd;")
    public static class166 field235 = field225;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "[Lre;")
    public static class158[] field234;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "[Lkf;")
    public static class96[] field232;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static final void method72(int arg0) {
        boolean var1 = false;
        if (arg0 != -26544) {
            return;
        }
        field224++;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class160.field3064 - 1; var2++) {
                if (class200.field3970[var2] < 1000 && class200.field3970[var2 + 1] > 1000) {
                    class166 var3 = class182.field3462[var2];
                    class182.field3462[var2] = class182.field3462[var2 + 1];
                    class182.field3462[var2 + 1] = var3;
                    class166 var4 = class11.field197[var2];
                    class11.field197[var2] = class11.field197[var2 + 1];
                    class11.field197[var2 + 1] = var4;
                    int var5 = class200.field3970[var2];
                    var1 = false;
                    class200.field3970[var2] = class200.field3970[var2 + 1];
                    class200.field3970[var2 + 1] = var5;
                    int var6 = class16.field262[var2];
                    class16.field262[var2] = class16.field262[var2 + 1];
                    class16.field262[var2 + 1] = var6;
                    int var7 = class56.field1092[var2];
                    class56.field1092[var2] = class56.field1092[var2 + 1];
                    class56.field1092[var2 + 1] = var7;
                    int var8 = class161.field3081[var2];
                    class161.field3081[var2] = class161.field3081[var2 + 1];
                    class161.field3081[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)[Lkf;")
    public static final class96[] method73(byte arg0) {
        field221++;
        class96[] var1 = new class96[class108.field2097];
        if (arg0 <= 52) {
            field219 = null;
        }
        for (int var2 = 0; var2 < class108.field2097; var2++) {
            class96 var3 = new class96();
            var3.field1850 = class98.field1870;
            var3.field1851 = class63.field1315;
            var3.field1853 = class47.field884[var2];
            var3.field1856 = class82.field1664[var2];
            var3.field1852 = class41.field723[var2];
            var3.field1849 = class161.field3083[var2];
            var3.field1854 = class9.field176;
            var3.field1855 = class137.field2669[var2];
            var1[var2] = var3;
        }
        class102.method773(96);
        return var1;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lf;I)V")
    public static final void method74(class47 arg0, int arg1) {
        field223++;
        if (arg1 == 5) {
            class41.field733 = arg0;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/util/Random;BI)I")
    public static final int method75(Random arg0, byte arg1, int arg2) {
        field229++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class184.method1249(arg2, false)) {
            return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg2);
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var3 <= var4);
            if (arg1 > -124) {
                field235 = null;
            }
            return class79.method645(var4, -31889, arg2);
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
    public static void method76(int arg0) {
        field225 = null;
        field236 = null;
        field222 = null;
        field235 = null;
        field217 = null;
        field220 = null;
        field234 = null;
        field219 = null;
        field231 = null;
        field233 = null;
        field218 = null;
        field228 = null;
        field230 = null;
        field239 = null;
        field232 = null;
        field238 = null;
        if (arg0 != 11184) {
            field236 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)Ln;")
    public static final class117 method77(int arg0, int arg1) {
        field226++;
        class117 var2 = (class117) class10.field190.method64((byte) 28, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class180.field3407.method353(arg1, arg0, -81);
        class117 var4 = new class117();
        var4.field2267 = arg0;
        if (var3 != null) {
            var4.method842(new class53(var3), (byte) -27);
        }
        class10.field190.method67(var4, 15266, (long) arg0);
        return var4;
    }
}
