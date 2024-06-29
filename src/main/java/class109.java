import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class109 extends class107 {

    @OriginalMember(owner = "client!sa", name = "db", descriptor = "Z")
    public boolean field2490 = false;

    @OriginalMember(owner = "client!sa", name = "cb", descriptor = "I")
    public int field2489 = -1;

    @OriginalMember(owner = "client!sa", name = "rb", descriptor = "[I")
    private int[] field2504 = new int[6];

    @OriginalMember(owner = "client!sa", name = "wb", descriptor = "[I")
    private int[] field2509 = new int[6];

    @OriginalMember(owner = "client!sa", name = "tb", descriptor = "[I")
    private int[] field2506 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!sa", name = "Z", descriptor = "Lrc;")
    private static class105 field2486 = class43.method374("Connection timed out)3", 0);

    @OriginalMember(owner = "client!sa", name = "bb", descriptor = "Lrc;")
    private static class105 field2488 = class43.method374("wishes to trade with you)3", 0);

    @OriginalMember(owner = "client!sa", name = "eb", descriptor = "Lrc;")
    public static class105 field2491 = field2486;

    @OriginalMember(owner = "client!sa", name = "sb", descriptor = "Lrc;")
    private static class105 field2505 = class43.method374("Please use a different world)3", 0);

    @OriginalMember(owner = "client!sa", name = "fb", descriptor = "Lrc;")
    public static class105 field2492 = field2505;

    @OriginalMember(owner = "client!sa", name = "ob", descriptor = "Lrc;")
    public static class105 field2501 = class43.method374("backvmid2", 0);

    @OriginalMember(owner = "client!sa", name = "yb", descriptor = "Lrc;")
    public static class105 field2511 = field2488;

    @OriginalMember(owner = "client!sa", name = "vb", descriptor = "[I")
    public static int[] field2508 = new int[25];

    @OriginalMember(owner = "client!sa", name = "ub", descriptor = "Lab;")
    public static class3 field2507 = new class3();

    @OriginalMember(owner = "client!sa", name = "Bb", descriptor = "Lrc;")
    private static class105 field2514 = class43.method374("Bad session id)3", 0);

    @OriginalMember(owner = "client!sa", name = "Ab", descriptor = "Lrc;")
    public static class105 field2513 = field2514;

    @OriginalMember(owner = "client!sa", name = "Cb", descriptor = "Lrc;")
    public static class105 field2515 = class43.method374("Menge eingeben:", 0);

    @OriginalMember(owner = "client!sa", name = "Eb", descriptor = "Lrc;")
    public static class105 field2517 = class43.method374(" )2> @yel@", 0);

    @OriginalMember(owner = "client!sa", name = "Fb", descriptor = "Lrc;")
    public static class105 field2518 = class43.method374("b12_full", 0);

    @OriginalMember(owner = "client!sa", name = "Hb", descriptor = "Z")
    public static boolean field2520 = false;

    @OriginalMember(owner = "client!sa", name = "Db", descriptor = "Lrc;")
    private static class105 field2516 = class43.method374("Invalid loginserver requested)3", 0);

    @OriginalMember(owner = "client!sa", name = "Gb", descriptor = "Z")
    public static boolean field2519 = false;

    @OriginalMember(owner = "client!sa", name = "Ib", descriptor = "Lrc;")
    public static class105 field2521 = field2516;

    @OriginalMember(owner = "client!sa", name = "ab", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!sa", name = "gb", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!sa", name = "hb", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!sa", name = "ib", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!sa", name = "jb", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!sa", name = "kb", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!sa", name = "mb", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!sa", name = "nb", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!sa", name = "pb", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!sa", name = "qb", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!sa", name = "xb", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!sa", name = "zb", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!sa", name = "lb", descriptor = "[I")
    private int[] field2498;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)V", line = 11)
    public static void method880(int arg0) {
        field2514 = null;
        field2505 = null;
        field2516 = null;
        field2515 = null;
        field2501 = null;
        field2521 = null;
        field2508 = null;
        field2492 = null;
        field2488 = null;
        field2518 = null;
        field2511 = null;
        field2513 = null;
        field2491 = null;
        if (arg0 != 0) {
            field2516 = null;
        }
        field2507 = null;
        field2517 = null;
        field2486 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLb;)V", line = 40)
    public final void method881(byte arg0, class7 arg1) {
        int var3 = -103 % ((arg0 - 20) / 34);
        field2510++;
        while (true) {
            int var4 = arg1.method96(27023);
            if (var4 == 0) {
                return;
            }
            this.method888(var4, -29, arg1);
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V", line = 60)
    public static final void method882(byte arg0) {
        field2497++;
        class105 var1 = null;
        for (int var2 = 0; var2 < class113.field2652; var2++) {
            if (class95.field2197[var2].method834((byte) 126, class134.field3263) != -1) {
                var1 = class95.field2197[var2].method862(class95.field2197[var2].method834((byte) 125, class134.field3263), (byte) -53);
                break;
            }
        }
        if (var1 == null) {
            class130.method1045(false);
            return;
        }
        int var3 = class51.field1075;
        int var4 = class10.field199;
        if (var3 < 0) {
            var3 = 0;
        }
        int var5 = class74.field1654;
        int var6 = class116.field2723;
        if (var6 > 190) {
            var6 = 190;
        }
        int var7 = 6116423;
        if (arg0 != 12) {
            return;
        }
        class69.method580(var3, var4, var6, var5, var7);
        class69.method580(var3 + 1, var4 + 1, var6 - 2, 16, 0);
        class69.method588(var3 + 1, var4 + 18, var6 - 2, var5 + -19, 0);
        class100.field2285.method658(var1, var3 + 3, var4 + 14, var7, false);
        int var8 = class75.field1664;
        int var9 = class35.field816;
        if (class1.field13 == 0) {
            var8 -= 4;
            var9 -= 4;
        }
        if (class1.field13 == 1) {
            var8 -= 553;
            var9 -= 205;
        }
        if (class1.field13 == 2) {
            var8 -= 17;
            var9 -= 357;
        }
        for (int var10 = 0; var10 < class113.field2652; var10++) {
            int var11 = var4 + (class113.field2652 + -1 + -var10) * 15 + 31;
            int var12 = 16777215;
            class105 var13 = class95.field2197[var10];
            if (var13.method855(var1, 0)) {
                var13 = var13.method860(0, false, var13.method863(arg0 - 138) - var1.method863(-124));
                if (var13.method855(class67.field1525, 0)) {
                    var13 = var13.method860(0, false, var13.method863(-126) - class67.field1525.method863(arg0 - 136));
                }
            }
            if (var8 > var3 && var3 + var6 > var8 && var11 - 13 < var9 && var11 + 3 > var9) {
                var12 = 16776960;
            }
            class100.field2285.method658(var13, var3 + 3, var11, var12, true);
        }
    }

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "(I)Z", line = 176)
    public final boolean method883(int arg0) {
        field2493++;
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2506[var3] != -1 && !class19.field456.method748(true, this.field2506[var3], 0)) {
                var2 = false;
            }
        }
        int var4 = 26 % ((2 - arg0) / 52);
        return var2;
    }

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "(I)Ljb;", line = 223)
    public final class56 method884(int arg0) {
        field2494++;
        class56[] var2 = new class56[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2506[var4] != -1) {
                var2[var3++] = class56.method448(class19.field456, this.field2506[var4], 0);
            }
        }
        if (arg0 <= 95) {
            this.method881((byte) -125, null);
        }
        class56 var5 = new class56(var2, var3);
        for (int var6 = 0; var6 < 6 && this.field2509[var6] != 0; var6++) {
            var5.method434(this.field2509[var6], this.field2504[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)Lka;", line = 267)
    public static final class61 method885(int arg0, int arg1) {
        field2499++;
        class61 var2 = (class61) class37.field844.method601((long) arg1, (byte) 118);
        if (var2 != null) {
            return var2;
        }
        class61 var3 = class133.method1050(arg1, false, class35.field821, class128.field3119, 0);
        if (var3 != null) {
            class37.field844.method608((long) arg1, var3, (byte) 122);
        }
        return arg0 < 69 ? null : var3;
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(B)Z", line = 289)
    public final boolean method886(byte arg0) {
        field2502++;
        if (this.field2498 == null) {
            return true;
        }
        int var2 = 22 / ((arg0 + 44) / 49);
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field2498.length; var4++) {
            if (!class19.field456.method748(true, this.field2498[var4], 0)) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)Ljb;", line = 333)
    public final class56 method887(boolean arg0) {
        field2487++;
        if (this.field2498 == null) {
            return null;
        }
        if (arg0) {
            this.method887(true);
        }
        class56[] var2 = new class56[this.field2498.length];
        for (int var3 = 0; var3 < this.field2498.length; var3++) {
            var2[var3] = class56.method448(class19.field456, this.field2498[var3], 0);
        }
        class56 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class56(var2, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field2509[var5] != 0; var5++) {
            var4.method434(this.field2509[var5], this.field2504[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILb;)V", line = 382)
    private final void method888(int arg0, int arg1, class7 arg2) {
        if (arg0 == 1) {
            this.field2489 = arg2.method96(27023);
        } else if (arg0 == 2) {
            int var4 = arg2.method96(27023);
            this.field2498 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2498[var5] = arg2.method101(2);
            }
        } else if (arg0 == 3) {
            this.field2490 = true;
        } else if (arg0 >= 40 && arg0 < 50) {
            this.field2509[arg0 - 40] = arg2.method101(2);
        } else if (arg0 >= 50 && arg0 < 60) {
            this.field2504[arg0 - 50] = arg2.method101(2);
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field2506[arg0 - 60] = arg2.method101(2);
        }
        int var6 = -56 % ((78 - arg1) / 32);
        field2496++;
    }
}
