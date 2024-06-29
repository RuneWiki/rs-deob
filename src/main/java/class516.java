import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class class516 {

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "Z")
    public static boolean field7249 = false;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field7248;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field7251;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field7252;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "Loba;")
    public static class219 field7250;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "Lgba;")
    public static class573 field7253;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI)I")
    public abstract int method1728(byte arg0, int arg1);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
    public static void method2979(byte arg0) {
        int var1 = -84 / ((arg0 - 26) / 49);
        field7253 = null;
        field7250 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
    public static final void method2980(int arg0) {
        field7251++;
        class571 var1 = class263.field3675;
        synchronized (class263.field3675) {
            class263.field3675.method3248(0);
            if (arg0 > -88) {
                field7250 = null;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lan;III)Lfi;")
    public static final class477 method2981(class21 arg0, int arg1, int arg2, int arg3) {
        field7248++;
        class11 var4 = new class11(arg0.method240(arg2, arg1, (byte) -124));
        class477 var5 = new class477(arg1, var4.method100((byte) 67), var4.method100((byte) 73), var4.method119(-112), var4.method119(-62), var4.method110((byte) 73) == 1, var4.method110((byte) 59), var4.method110((byte) 115));
        int var6 = var4.method110((byte) 66);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field6728.method463(new class355(var4.method110((byte) 79), var4.method93((byte) 97), var4.method93((byte) 73), var4.method93((byte) 116), var4.method93((byte) 119), var4.method93((byte) 126), var4.method93((byte) 78), var4.method93((byte) 98), var4.method93((byte) 123)), -127);
        }
        var5.method2783(74);
        if (arg3 >= -83) {
            field7249 = false;
        }
        return var5;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)Lpd;")
    public abstract class215 method1732(boolean arg0);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)[B")
    public abstract byte[] method1730(int arg0, int arg1);

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)I")
    public static final int method2982(byte arg0) {
        field7252++;
        if ((double) class413.field5812 == 3.0D) {
            return 37;
        } else if ((double) class413.field5812 == 4.0D) {
            return 50;
        } else if ((double) class413.field5812 == 6.0D) {
            return 75;
        } else if ((double) class413.field5812 == 8.0D) {
            return 100;
        } else if (arg0 == 25) {
            return 200;
        } else {
            return -6;
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(II)V")
    public abstract void method1724(int arg0, int arg1);
}
