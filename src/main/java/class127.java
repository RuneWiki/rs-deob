import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class127 {

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "Lec;")
    public static class28 field2744 = class28.method210(-46, "wishes to duel with you)3");

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "[I")
    public static int[] field2743 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "Lec;")
    public static class28 field2739 = class28.method210(-46, "Starting game engine)3)3)3");

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public static int field2750 = 0;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field2748 = -1;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "[[[Lh;")
    public static class42[][][] field2746 = new class42[4][104][104];

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "[I")
    public static int[] field2747;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    public static void method968(byte arg0) {
        field2739 = null;
        field2747 = null;
        if (arg0 >= 97) {
            field2744 = null;
            field2746 = null;
            field2743 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)I")
    public static final int method969(int arg0, int arg1) {
        field2740++;
        return arg1 < 12 ? -102 : (int) (Math.log((double) arg0 * 0.00390625D) * 868.5889638065036D + 0.5D);
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)Z")
    public static final boolean method970(int arg0, int arg1) {
        field2753++;
        if (~arg0 <= arg1 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)Lec;")
    public static final class28 method971(int arg0, int arg1) {
        field2741++;
        if (arg1 > class18.field371 + arg0) {
            return class114.field2441;
        }
        Calendar var2 = Calendar.getInstance();
        long var3 = ((long) arg1 + 11745L) * 86400000L;
        var2.setTime(new Date(var3));
        int var5 = var2.get(5);
        int var6 = var2.get(2);
        int var7 = var2.get(1);
        class28[] var8 = new class28[] { class79.field1830, class61.field1350, class70.field1563, class40.field872, class17.field322, class40.field861, class90.field1995, class63.field1401, class86.field1921, class64.field1419, class72.field1606, class98.field2166 };
        return class68.method537(arg0 - 9, new class28[] { class5.method25(6366, var5), class87.field1937, var8[var6], class87.field1937, class5.method25(6366, var7) });
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZIII)V")
    public static final void method972(boolean arg0, int arg1, int arg2, int arg3) {
        field2752++;
        if (arg1 < 128 || arg3 < 128 || arg1 > 13056 || arg3 > 13056) {
            class20.field434 = -1;
            class57.field1308 = -1;
            return;
        }
        int var4 = class18.method107(arg3, arg1, -2049, class122.field2657) - arg2;
        int var5 = arg3 - class94.field2079;
        int var6 = arg1 - class88.field1966;
        int var7 = class33.field736[class4.field72];
        int var8 = var4 - class64.field1423;
        if (!arg0) {
            method969(61, 93);
        }
        int var9 = class33.field736[class12.field196];
        int var10 = class33.field760[class12.field196];
        int var11 = var5 * var9 + var6 * var10 >> 16;
        int var12 = var5 * var10 - var6 * var9 >> 16;
        int var14 = class33.field760[class4.field72];
        int var15 = var8 * var14 - var7 * var12 >> 16;
        int var16 = var7 * var8 + var12 * var14 >> 16;
        if (var16 >= 50) {
            class20.field434 = (var11 << 9) / var16 + 256;
            class57.field1308 = (var15 << 9) / var16 + 167;
        } else {
            class20.field434 = -1;
            class57.field1308 = -1;
        }
    }
}
