import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class51 {

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field1292 = -1;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field1295 = 0;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "Z")
    public static boolean field1291 = false;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "[I")
    public static int[] field1297 = new int[128];

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)I")
    public static final int method383(int arg0, int arg1, int arg2) {
        int var3 = class107.method887(-117, arg2 - 1, arg1 + -1) + class107.method887(-119, arg2 - 1, arg1 + 1) + class107.method887(-126, arg2 - -1, arg1 + -1) + class107.method887(88, arg2 - -1, arg1 + 1);
        int var4 = class107.method887(-125, arg2, arg1 - 1) + class107.method887(-126, arg2, arg1 + 1) + class107.method887(-126, arg2 - 1, arg1) + class107.method887(-128, arg2 - -1, arg1);
        field1296++;
        if (arg0 <= 69) {
            return -83;
        } else {
            int var5 = class107.method887(115, arg2, arg1);
            return var3 / 16 + var5 / 4 + var4 / 8;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static void method384(int arg0) {
        int var1 = 116 % ((-arg0 - 20) / 60);
        field1297 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
    public static final void method385(byte arg0) {
        field1293++;
        if (arg0 < 97) {
            method386(1);
        }
        while (class56.field1393.method1213(class94.field2310, (byte) 18) >= 11) {
            int var1 = class56.field1393.method1205(false, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class81.field2016[var1] == null) {
                var2 = true;
                class81.field2016[var1] = new class1();
                if (class106.field2618[var1] != null) {
                    class81.field2016[var1].method4(2, class106.field2618[var1]);
                }
            }
            class121.field2781[class44.field1170++] = var1;
            class1 var3 = class81.field2016[var1];
            var3.field863 = class82.field2065;
            int var4 = class56.field1393.method1205(false, 1);
            int var5 = class56.field1393.method1205(false, 5);
            int var6 = class48.field1269[class56.field1393.method1205(false, 3)];
            if (var5 > 15) {
                var5 -= 32;
            }
            if (var2) {
                var3.field822 = var3.field864 = var6;
            }
            int var7 = class56.field1393.method1205(false, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class56.field1393.method1205(false, 1);
            if (var8 == 1) {
                class19.field471[class35.field884++] = var1;
            }
            var3.method266(class107.field2640.field827[0] + var5, class107.field2640.field841[0] + var7, var4 == 1, -17715);
        }
        class56.field1393.method1204(false);
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
    public static final void method386(int arg0) {
        field1294++;
        if (arg0 > -100) {
            field1292 = -109;
        }
        if (class133.field3041 != null) {
            class145 var1 = class133.field3041;
            synchronized (class133.field3041) {
                class133.field3041 = null;
            }
        }
    }
}
