import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class68 implements Runnable {

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "[Lab;")
    public volatile class3[] field1551 = new class3[2];

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Z")
    public volatile boolean field1544 = false;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "Z")
    public volatile boolean field1545 = false;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "Lv;")
    public static class146 field1549 = class159.method1226((byte) -37, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "Lvf;")
    public static class152 field1548 = new class152();

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "Lv;")
    public static class146 field1556 = class159.method1226((byte) -37, " <col=ffff00>");

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "Lv;")
    private static class146 field1555 = class159.method1226((byte) -37, "Too many connections from your address)3");

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "Lv;")
    public static class146 field1559 = field1555;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field1554 = -1;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "Lv;")
    public static class146 field1560 = class159.method1226((byte) -37, "b12_full");

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "Lv;")
    public static class146 field1561 = class159.method1226((byte) -37, "rot:");

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Lcf;")
    public class21 field1550;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "Ldc;")
    public static class25 field1557;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Lmb;")
    public static class85 field1552;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "Z")
    public static boolean field1558;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "[I")
    public static int[] field1541;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IBILdc;ZBI)V")
    public static final void method481(int arg0, byte arg1, int arg2, class25 arg3, boolean arg4, byte arg5, int arg6) {
        long var7 = (long) ((arg6 << 16) + arg0);
        class141 var9 = (class141) class134.field3045.method332((byte) -79, var7);
        field1543++;
        if (var9 != null) {
            return;
        }
        class141 var10 = (class141) class141.field3229.method332((byte) -79, var7);
        int var11 = -32 % ((-arg1 - 8) / 48);
        if (var10 != null) {
            return;
        }
        class141 var12 = (class141) class42.field970.method332((byte) -79, var7);
        if (var12 == null) {
            if (!arg4) {
                class141 var13 = (class141) class113.field2637.method332((byte) -79, var7);
                if (var13 != null) {
                    return;
                }
            }
            class141 var14 = new class141();
            var14.field3218 = arg3;
            var14.field3231 = arg5;
            var14.field3224 = arg2;
            if (arg4) {
                class134.field3045.method336(var7, var14, -8899);
                class71.field1644++;
            } else {
                class37.field831.method1230(34, var14);
                class42.field970.method336(var7, var14, -8899);
                class20.field303++;
            }
        } else if (arg4) {
            var12.method909((byte) -116);
            class134.field3045.method336(var7, var12, -8899);
            class20.field303--;
            class71.field1644++;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public static void method482(byte arg0) {
        field1557 = null;
        field1556 = null;
        int var1 = -113 / ((arg0 + 50) / 33);
        field1541 = null;
        field1559 = null;
        field1561 = null;
        field1549 = null;
        field1548 = null;
        field1555 = null;
        field1552 = null;
        field1560 = null;
    }

    @OriginalMember(owner = "client!jf", name = "run", descriptor = "()V")
    public final void run() {
        field1546++;
        this.field1545 = true;
        try {
            while (!this.field1544) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class3 var2 = this.field1551[var1];
                    if (var2 != null) {
                        var2.method31((byte) 113);
                    }
                }
                class6.method51(10L, -14344);
                class60.method420(this.field1550, (byte) 126, null);
            }
        } catch (Exception var9) {
            class122.method921((byte) 90, null, var9);
        } finally {
            Object var6 = null;
            this.field1545 = false;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IJ)Lv;")
    public static final class146 method483(int arg0, long arg1) {
        field1542++;
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
                var6[var3] = class34.field721[(int) (var8 - arg1 * 37L)];
            }
            class146 var7 = new class146();
            var7.field3365 = var6;
            var7.field3372 = var6.length;
            return var7;
        }
    }
}
