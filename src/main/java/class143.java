import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class143 extends class14 {

    @OriginalMember(owner = "client!q", name = "M", descriptor = "Z")
    public static boolean field2978 = false;

    @OriginalMember(owner = "client!q", name = "O", descriptor = "I")
    public static int field2980 = 0;

    @OriginalMember(owner = "client!q", name = "N", descriptor = "Lea;")
    private static class38 field2979 = class9.method46((byte) 121, "Click to switch");

    @OriginalMember(owner = "client!q", name = "T", descriptor = "Lea;")
    public static class38 field2985 = field2979;

    @OriginalMember(owner = "client!q", name = "U", descriptor = "Z")
    public static boolean field2986 = false;

    @OriginalMember(owner = "client!q", name = "V", descriptor = "[I")
    public static int[] field2987 = new int[50];

    @OriginalMember(owner = "client!q", name = "J", descriptor = "B")
    public byte field2975;

    @OriginalMember(owner = "client!q", name = "K", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!q", name = "L", descriptor = "I")
    public int field2977;

    @OriginalMember(owner = "client!q", name = "P", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!q", name = "Q", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!q", name = "R", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!q", name = "W", descriptor = "Lob;")
    public class127 field2988;

    @OriginalMember(owner = "client!q", name = "S", descriptor = "Lef;")
    public static class43 field2984;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III)V")
    public static final void method1031(int arg0, int arg1, int arg2) {
        field2976++;
        class23 var3 = class67.method547(arg1, 9199);
        int var4 = var3.field490;
        int var5 = var3.field492;
        int var6 = var3.field488;
        int var7 = class83.field1973[var6 - var5];
        if (arg0 >= -60) {
            field2985 = null;
        }
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class195.field3845[var4] = class94.method794(class52.method380(~var8, class195.field3845[var4]), class52.method380(arg2 << var5, var8));
    }

    @OriginalMember(owner = "client!q", name = "g", descriptor = "(I)V")
    public static void method1032(int arg0) {
        field2979 = null;
        field2984 = null;
        field2985 = null;
        field2987 = null;
        if (arg0 != -4587) {
            method1033(72);
        }
    }

    @OriginalMember(owner = "client!q", name = "h", descriptor = "(I)V")
    public static final void method1033(int arg0) {
        class57 var1 = class94.field2113;
        synchronized (class94.field2113) {
            if (arg0 != 112) {
                field2986 = false;
            }
            class136.field2858 = class97.field2174;
            if (class29.field585 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class50.field1244[var2] = false;
                }
                class29.field585 = class162.field3370;
            } else {
                while (class29.field585 != class162.field3370) {
                    int var3 = class125.field2698[class162.field3370];
                    class162.field3370 = class162.field3370 + 1 & 0x7F;
                    if (var3 < 0) {
                        class50.field1244[~var3] = false;
                    } else {
                        class50.field1244[var3] = true;
                    }
                }
            }
            class97.field2174 = class100.field2243;
        }
        field2983++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IJ)Lea;")
    public static final class38 method1034(int arg0, long arg1) {
        field2982++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % (long) arg0 == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var3--;
                var6[var3] = class141.field2955[(int) (var8 - arg1 * 37L)];
            }
            class38 var7 = new class38();
            var7.field821 = var6;
            var7.field802 = var6.length;
            return var7;
        }
    }
}
