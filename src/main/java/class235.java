import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class235 {

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "J")
    public long field3967 = 0L;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "Lwa;")
    public static class75 field3957 = class66.method560("sl_arrows", false);

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "Z")
    public static boolean field3966 = false;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "Lwa;")
    private static class75 field3959 = class66.method560("flash3:", false);

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "Lwa;")
    public static class75 field3971 = field3959;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "[J")
    public static long[] field3973 = new long[32];

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Lwa;")
    public static class75 field3961 = class66.method560("welle:", false);

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "Lwa;")
    public static class75 field3974 = field3959;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "Lwa;")
    public static class75 field3969 = class66.method560(")1 ", false);

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public int field3960;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public int field3964;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public int field3965;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public int field3970;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    public int field3972;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public int field3975;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    public int field3979;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Lpj;")
    public class171 field3963;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "Lpj;")
    public class171 field3977;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "Z")
    public static boolean field3968;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IJ)V", line = 5)
    public static final void method1708(int arg0, long arg1) {
        field3958++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg0 <= 58) {
            field3961 = (class75) null;
        }
        if (arg1 % 10L == 0L) {
            class204.method1516(arg1 - 1L, (byte) -107);
            class204.method1516(1L, (byte) -104);
        } else {
            class204.method1516(arg1, (byte) -108);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)Lwa;", line = 35)
    public static final class75 method1709(int arg0, int arg1) {
        field3978++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        class75 var2 = new class75();
        var2.field1280 = 1;
        if (arg1 != 25204) {
            method1712(66, -111);
        }
        var2.field1296 = new byte[1];
        var2.field1296[0] = (byte) arg0;
        return var2;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)I", line = 58)
    public static int method1710(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 77)
    public static void method1711(int arg0) {
        field3971 = null;
        field3957 = null;
        int var1 = 55 / ((arg0 - 1) / 45);
        field3973 = null;
        field3961 = null;
        field3959 = null;
        field3969 = null;
        field3974 = null;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(II)I", line = 96)
    public static final int method1712(int arg0, int arg1) {
        field3976++;
        if (arg0 != -1004767097) {
            method1711(-77);
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V", line = 152)
    public static final void method1713(int arg0) {
        class42.field687 = (byte[][]) null;
        class232.field3934 = null;
        class191.field3184 = null;
        class287.field4936 = null;
        if (arg0 != 0) {
            field3973 = (long[]) null;
        }
        class85.field1404 = null;
        class210.field3590 = null;
        field3962++;
    }
}
