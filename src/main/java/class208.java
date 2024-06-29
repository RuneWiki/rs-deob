import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class class208 {

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3323 = "white:";

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "[J")
    public static long[] field3325 = new long[32];

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "[I")
    public static int[] field3327 = new int[25];

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "[B")
    public static byte[] field3322;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)Lq;")
    public static final class165 method1458(byte arg0, int arg1) {
        field3320++;
        class165 var2 = (class165) class274.field4382.method1693((long) arg1, 90);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class67.field852.method928(class163.method1134(8570, arg1), (byte) 116, class138.method960(arg1, false));
        class165 var4 = new class165();
        var4.field2628 = arg1;
        if (var3 != null) {
            var4.method1142(new class96(var3), -88);
        }
        var4.method1138((byte) 58);
        class274.field4382.method1694(true, (long) arg1, var4);
        int var5 = 36 / ((arg0 - 21) / 61);
        return var4;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)Z")
    public static final boolean method1459(byte arg0) {
        field3326++;
        if (arg0 != 34) {
            return true;
        }
        if (class239.field3945) {
            try {
                class277.method1848(class194.field3107.field609, 2795, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static final void method1460(int arg0) {
        if (arg0 != 25) {
            method1460(36);
        }
        field3321++;
        class19.field243.method1699(0);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
    public static void method1461(int arg0) {
        if (arg0 < -100) {
            field3327 = null;
            field3323 = null;
            field3322 = null;
            field3325 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
    public abstract void method1462(int arg0);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZII)I")
    public abstract int method1463(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1464(int arg0, String arg1) {
        field3319++;
        if (arg0 != -1) {
            field3327 = null;
        }
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class88.field1091; var2++) {
            if (arg1.equalsIgnoreCase(class143.field2256[var2])) {
                return var2;
            }
        }
        return -1;
    }
}
