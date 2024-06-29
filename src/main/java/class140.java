import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class140 {

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "Z")
    public boolean field2052 = false;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field2045 = 0;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "Z")
    public static boolean field2047 = true;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "[Z")
    public static boolean[] field2048 = new boolean[112];

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "Ldi;")
    public static class179 field2050 = null;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field2053 = 1;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public int field2046;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public int field2049;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
    public static void method860(byte arg0) {
        if (arg0 >= 85) {
            field2050 = null;
            field2048 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZIB)Ldi;")
    public final class179 method861(boolean arg0, int arg1, byte arg2) {
        field2042++;
        if (arg2 != -42) {
            method860((byte) -36);
        }
        class179 var4 = (class179) class46.field751.method1777((long) (arg1 << 16 | this.field2046 | (arg0 ? 262144 : 0)), (byte) 112);
        if (var4 != null) {
            return var4;
        }
        class1.field9.method1960(this.field2046, (byte) 116);
        class179 var5 = class221.method1418(0, -1, this.field2046, class1.field9);
        if (var5 != null) {
            var5.method1113(class290.field4572, class162.field2492, class278.field4186);
            var5.field3881 = var5.field3887;
            var5.field3872 = var5.field3876;
            if (arg0) {
                var5.method1120();
            }
            for (int var6 = 0; var6 < arg1; var6++) {
                var5.method1117();
            }
            class46.field751.method1784((long) ((arg0 ? 262144 : 0) | arg1 << 16 | this.field2046), var5, 0);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
    public static final void method862(byte arg0) {
        if (arg0 != 85) {
            method865(-99, -85, -20);
        }
        field2043++;
        for (class224 var1 = (class224) class90.field1429.method983(7); var1 != null; var1 = (class224) class90.field1429.method985((byte) -99)) {
            class45 var2 = var1.field3351;
            if (class99.field1557 != var2.field741 || var2.field739 < class270.field4058) {
                var1.method538(arg0 ^ 0x1E);
            } else if (class270.field4058 >= var2.field726) {
                if (var2.field734 > 0) {
                    class61 var3 = class18.field220[var2.field734 - 1];
                    if (var3 != null && var3.field2251 >= 0 && var3.field2251 < 13312 && var3.field2234 >= 0 && var3.field2234 < 13312) {
                        var2.method305(class183.method1139(var2.field741, var3.field2234, var3.field2251, (byte) 117) - var2.field745, var3.field2251, class270.field4058, (byte) 126, var3.field2234);
                    }
                }
                if (var2.field734 < 0) {
                    int var4 = -var2.field734 - 1;
                    class107 var5;
                    if (class221.field3334 == var4) {
                        var5 = class165.field2537;
                    } else {
                        var5 = class96.field1521[var4];
                    }
                    if (var5 != null && var5.field2251 >= 0 && var5.field2251 < 13312 && var5.field2234 >= 0 && var5.field2234 < 13312) {
                        var2.method305(class183.method1139(var2.field741, var5.field2234, var5.field2251, (byte) 117) - var2.field745, var5.field2251, class270.field4058, (byte) 126, var5.field2234);
                    }
                }
                var2.method301((byte) 117, class180.field2741);
                class101.method653(class99.field1557, (int) var2.field730, (int) var2.field716, (int) var2.field723, 60, var2, var2.field729, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILfl;II)V")
    private final void method863(int arg0, class248 arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            this.field2046 = arg1.method1575(false);
        } else if (arg2 == 2) {
            this.field2049 = arg1.method1587(-119);
        } else if (arg2 == 3) {
            this.field2052 = true;
        } else if (arg2 == 4) {
            this.field2046 = -1;
        }
        int var5 = -58 % ((24 - arg3) / 44);
        field2044++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lfl;II)V")
    public final void method864(class248 arg0, int arg1, int arg2) {
        if (arg1 != 13312) {
            this.field2046 = 33;
        }
        while (true) {
            int var4 = arg0.method1593((byte) 27);
            if (var4 == 0) {
                field2051++;
                return;
            }
            this.method863(arg2, arg0, var4, arg1 - 13360);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)J")
    public static final long method865(int arg0, int arg1, int arg2) {
        class270 var3 = class33.field487[arg0][arg1][arg2];
        return var3 == null || var3.field4073 == null ? 0L : var3.field4073.field2766;
    }
}
