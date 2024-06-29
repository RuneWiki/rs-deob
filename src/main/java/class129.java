import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class129 {

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public int field2299;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public int field2295;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public int field2301;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public int field2300;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Lsb;")
    public static class98 field2296 = class47.method368("Zugewiesener Speicher)3", 0);

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "[I")
    public static int[] field2302 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "[I")
    public static int[] field2309 = new int[500];

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "[Llj;")
    public static class216[] field2304 = new class216[2048];

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "Ltg;")
    public static class75 field2303;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
    public static final void method978(byte arg0) {
        field2308++;
        int var1 = class173.field3031.method381(6776);
        if (var1 == 0) {
            return;
        }
        class32.field561++;
        class237.field4084.method490(161, -71);
        class237.field4084.method1477(0, -26755);
        if (arg0 <= 97) {
            field2304 = null;
        }
        int var2 = class237.field4084.field3728;
        int var3 = 0;
        class224 var4 = (class224) class173.field3031.method372(63);
        class237.field4084.method1470((byte) -122, var4.field3858);
        int var5 = var4.field3858;
        class224 var6;
        while ((var6 = (class224) class173.field3031.method372(63)) != null) {
            if (var3 < 255 && (var5 + 1) == var6.field3858) {
                var3++;
            } else {
                class237.field4084.method1477(var3, -26755);
                var3 = 0;
                class237.field4084.method1470((byte) -122, var6.field3858);
            }
            var5 = var6.field3858;
        }
        class237.field4084.method1477(var3, -26755);
        class237.field4084.method1476(class237.field4084.field3728 - var2, -120);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZI)V")
    public static final void method979(boolean arg0, int arg1) {
        field2298++;
        if (arg0) {
            class173.field3031.method376((byte) 13, new class224(arg1));
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
    public static final void method980(int arg0) {
        try {
            if (class252.field4416 == null) {
                class252.field4416 = new class212(class119.field2145, class186.method1288(new class98[] { class191.method1324((byte) -44), class69.field1103 }, arg0 + 31874).method735(true));
            }
            if (arg0 != -256) {
                method980(-68);
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class252.field4416 = null;
        }
        field2307++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILtg;)V")
    public static final void method981(int arg0, class75 arg1) {
        class169.field2992 = class90.method660(field2297, 60, arg1);
        field2306++;
        class205.field3512 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var4 = (float) ((class234.field4047[var2] & 0xFF0000) >> 16);
            int var5 = (class234.field4047[var2 + 1] & 0xFF0000) >> 16;
            float var6 = ((float) var5 - var4) / 64.0F;
            int var7 = class234.field4047[var2 + 1] >> 8 & 0xFF;
            int var8 = class234.field4047[var2 + 1] & 0xFF;
            float var9 = (float) ((class234.field4047[var2] & 0xFF00) >> 8);
            float var10 = ((float) var7 - var9) / 64.0F;
            float var11 = (float) (class234.field4047[var2] & 0xFF);
            float var12 = ((float) var8 - var11) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class205.field3512[var2 * 64 + var13] = class67.method471((int) var11, class67.method471((int) var9 << 8, (int) var4 << 16));
                var4 += var6;
                var9 += var10;
                var11 += var12;
            }
        }
        if (arg0 > -31) {
            field2304 = null;
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class205.field3512[var3] = class234.field4047[3];
        }
        class47.field784 = new int[32768];
        class146.field2565 = new int[32768];
        class219.method1507((class24) null, 110);
        class112.field1990 = new int[32768];
        class87.field1549 = new int[32768];
        class1.field3 = new class247(128, 254);
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)V")
    public static void method982(byte arg0) {
        field2309 = null;
        if (arg0 >= -45) {
            field2304 = null;
        }
        field2296 = null;
        field2303 = null;
        field2302 = null;
        field2304 = null;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V")
    public class129() {
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)Lpg;")
    public static final class260 method983(int arg0, int arg1) {
        field2305++;
        class260 var2 = (class260) class252.field4406.method1564((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class115.field2058.method571(arg0, arg1, 121);
        class260 var4 = new class260();
        if (var3 != null) {
            var4.method1780(new class216(var3), (byte) -84);
        }
        class252.field4406.method1563((long) arg1, 21771, var4);
        return var4;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)J")
    public static final long method984(int arg0, int arg1, int arg2) {
        class71 var3 = class31.field553[arg0][arg1][arg2];
        return var3 == null || var3.field1141 == null ? 0L : var3.field1141.field3874;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Loj;)V")
    public class129(class129 arg0) {
        this.field2299 = arg0.field2299;
        this.field2295 = arg0.field2295;
        this.field2301 = arg0.field2301;
        this.field2300 = arg0.field2300;
    }
}
