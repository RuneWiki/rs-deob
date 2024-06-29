import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class106 {

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "Z")
    public boolean field2542 = true;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public int field2541;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public int field2543;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public int field2532;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public int field2537;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public int field2539;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public int field2533;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "Ll;")
    public static class76 field2536 = new class76();

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Lu;")
    public static class135 field2544 = class87.method676((byte) -52, "M");

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field2545 = 500;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "Z")
    public static boolean field2548 = false;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "Le;")
    public static class29 field2546 = new class29(30);

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public static int field2549 = -1;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "Lu;")
    private static class135 field2551 = class87.method676((byte) -80, "Prepared visibility map");

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    public static volatile int field2550 = 0;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "Lu;")
    public static class135 field2554 = class87.method676((byte) -66, "mapedge");

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "Lu;")
    public static class135 field2553 = field2551;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "Lu;")
    public static class135 field2557 = class87.method676((byte) -67, "backvmid3");

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    public static int field2552 = -1;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "Lu;")
    public static class135 field2556 = class87.method676((byte) -72, "60 Sekunden noch einmal)3)3)3");

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "Lu;")
    public static class135 field2558 = class87.method676((byte) -65, "Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "Le;")
    public static class29 field2555 = new class29(64);

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "[I")
    public static int[] field2562 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "Lu;")
    private static class135 field2563 = class87.method676((byte) -40, "Members object");

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "Lu;")
    public static class135 field2561 = field2563;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "Lg;")
    public static class43 field2560;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "Lae;")
    public static class6 field2559;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Z")
    public static final boolean method857(int arg0, int arg1) {
        field2538++;
        if (arg1 != 2027616244) {
            field2560 = null;
        }
        return (arg0 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    public static void method858(byte arg0) {
        field2559 = null;
        field2555 = null;
        field2556 = null;
        field2544 = null;
        int var1 = 91 % ((-arg0 - 20) / 44);
        field2563 = null;
        field2553 = null;
        field2561 = null;
        field2536 = null;
        field2554 = null;
        field2551 = null;
        field2558 = null;
        field2562 = null;
        field2560 = null;
        field2557 = null;
        field2546 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZII)I")
    public static final int method859(boolean arg0, int arg1, int arg2) {
        field2540++;
        long var3 = (long) ((arg1 << 16) + arg2);
        if (class65.field1598 != null && class65.field1598.field951 == var3) {
            if (!arg0) {
                field2553 = null;
            }
            return class41.field961.field1485 * 99 / (class41.field961.field1495.length - class65.field1598.field3079) + 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIII)V")
    public static final void method860(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            field2562 = null;
        }
        field2535++;
        class146 var4 = class28.method227(arg1, (byte) -88, arg2);
        if (var4 != null && var4.field3594 != null) {
            class52.method399(var4, var4.field3594, 0, 0, null, -2147483645, 0);
        }
        class8.field143 = true;
        class79.field1887 = arg3;
        class53.field1274 = arg1;
        class47.field1117 = arg2;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIII)V")
    public static final void method861(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2547++;
        class69 var5 = (class69) class103.field2490.method842((long) arg2, 127);
        if (arg1 != -1) {
            field2557 = null;
        }
        if (var5 == null) {
            var5 = new class69();
            class103.field2490.method836((long) arg2, (byte) 74, var5);
        }
        if (var5.field1692.length <= arg3) {
            int[] var6 = new int[arg3 + 1];
            int[] var7 = new int[arg3 + 1];
            for (int var8 = 0; var8 < var5.field1692.length; var8++) {
                var7[var8] = var5.field1692[var8];
                var6[var8] = var5.field1698[var8];
            }
            for (int var9 = var5.field1692.length; var9 < arg3; var9++) {
                var7[var9] = -1;
                var6[var9] = 0;
            }
            var5.field1698 = var6;
            var5.field1692 = var7;
        }
        var5.field1692[arg3] = arg0;
        var5.field1698[arg3] = arg4;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZI)V")
    public static final void method862(boolean arg0, int arg1) {
        field2534++;
        if (class8.field153 == null) {
            return;
        }
        try {
            class59 var2 = new class59(4);
            var2.method452(arg0 ? 2 : 3, 255);
            var2.method478(true, 0);
            class8.field153.method870(4, 0, 0, var2.field1495);
        } catch (IOException var4) {
            try {
                class8.field153.method874((byte) -98);
            } catch (Exception var3) {
            }
            class8.field153 = null;
            class35.field823++;
        }
        if (arg1 != 20625) {
            method858((byte) 66);
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2541 = arg3;
        this.field2543 = arg0;
        this.field2532 = arg1;
        this.field2542 = arg6;
        this.field2537 = arg5;
        this.field2539 = arg2;
        this.field2533 = arg4;
    }
}
