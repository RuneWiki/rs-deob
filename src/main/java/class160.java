import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class160 {

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public int field2549 = -1;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Lwm;")
    public static class152 field2546 = class157.method1048("Nehmen", 122);

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field2556 = 0;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field2555 = 0;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "[I")
    public static int[] field2552 = new int[4096];

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "Lok;")
    public class150 field2558;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Lah;")
    public static class205 field2547;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "Lhh;")
    public static class209 field2559;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "[I")
    public int[] field2550;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "[Lwm;")
    public class152[] field2557;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IJ)Lwm;", line = 8)
    public static final class152 method1077(int arg0, long arg1) {
        field2554++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            int var6 = 109 / ((-arg0 - 41) / 48);
            byte[] var7 = new byte[var3];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var3--;
                var7[var3] = class192.field3023[(int) (var8 - (arg1 * 37L))];
            }
            class152 var10 = new class152();
            var10.field2389 = var7;
            var10.field2371 = var7.length;
            return var10;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IILah;I)[Ldc;", line = 59)
    public static final class109[] method1078(int arg0, int arg1, class205 arg2, int arg3) {
        field2548++;
        if (class86.method566(arg1, arg2, arg3, 1)) {
            return arg0 == 37 ? class22.method175(arg0 ^ 0xFFFF80B6) : (class109[]) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V", line = 74)
    public static void method1079(byte arg0) {
        if (arg0 != 27) {
            field2546 = (class152) null;
        }
        field2547 = null;
        field2552 = null;
        field2559 = null;
        field2546 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IZ)V", line = 87)
    public static final void method1080(int arg0, boolean arg1) {
        if (arg1) {
            method1078(-63, 105, (class205) null, 3);
        }
        field2560++;
        for (class273 var2 = class27.field456.method1585(-1506054736); var2 != null; var2 = class27.field456.method1581((byte) -123)) {
            if (((long) arg0) == (var2.field4689 >> 48 & 0xFFFFL)) {
                var2.method1880(-25368);
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)V", line = 124)
    public static final void method1081(int arg0, byte arg1) {
        class45.field717 = arg0;
        class312.field5357 = false;
        class193.field3072 = 0;
        int var2 = 57 / ((27 - arg1) / 41);
        class275.field4720 = -1;
        class89.field1252 = 1;
        class325.field5667 = -1;
        class65.field986 = null;
        field2553++;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(IB)V", line = 145)
    public static final void method1082(int arg0, byte arg1) {
        field2551++;
        class149.field2315.method1617(arg0, 50);
        class148.field2297.method1617(arg0, 50);
        class70.field1012.method1617(arg0, arg1 + 16);
        if (arg1 != 34) {
            method1079((byte) 43);
        }
    }
}
