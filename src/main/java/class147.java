import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class147 {

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Lrg;")
    private class217 field2643 = new class217();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    private int field2640;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    private int field2642;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "Laj;")
    private class46 field2654;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "Leb;")
    private static class230 field2651 = class68.method589(0, "Connection lost)3");

    @OriginalMember(owner = "client!v", name = "j", descriptor = "Leb;")
    public static class230 field2649 = field2651;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "[I")
    public static int[] field2653 = new int[4096];

    @OriginalMember(owner = "client!v", name = "q", descriptor = "Leb;")
    private static class230 field2656;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "Leb;")
    public static class230 field2657;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "Leb;")
    public static class230 field2658;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILeh;ILka;IIB)V")
    public static final void method1120(int arg0, class80 arg1, int arg2, class245 arg3, int arg4, int arg5, byte arg6) {
        field2646++;
        if (arg1 == null) {
            return;
        }
        int var7 = class34.field641 + class167.field2953 & 0x7FF;
        int var8 = Math.max(arg3.field4325 / 2, arg3.field4307 / 2) + 10;
        int var9 = arg2 * arg2 + (arg0 * arg0);
        if (var8 * var8 < var9) {
            return;
        }
        int var10 = class3.field21[var7];
        int var11 = class3.field24[var7];
        int var12 = var11 * 256 / (class163.field2911 + 256);
        int var13 = var10 * 256 / (class163.field2911 + 256);
        int var14 = arg0 * var13 + (arg2 * var12) >> 16;
        int var15 = arg0 * var12 - (arg2 * var13) >> 16;
        ((class10) arg1).method111(arg3.field4325 / 2 + arg5 - (arg1.field1450 / 2 + -var14), arg4 - var15 + arg3.field4307 / 2 + -(arg1.field1451 / 2), arg3.field4314, arg3.field4241);
        if (arg6 <= 92) {
            field2653 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V")
    public final void method1121(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field2640 = -50;
        }
        field2645++;
        if (class21.field426 == null) {
            return;
        }
        for (class172 var3 = (class172) this.field2643.method1497(true); var3 != null; var3 = (class172) this.field2643.method1495((byte) 36)) {
            if (var3.method1227(false)) {
                if (var3.method1229(90) == null) {
                    var3.method518(108);
                    var3.method1785(-80);
                    this.field2642++;
                }
            } else if (((long) arg1) < (++var3.field4534)) {
                class172 var4 = class21.field426.method242((byte) 82, var3);
                this.field2654.method388(arg0 - 1, var3.field1166, var4);
                class151.method1139(var4, var3, (byte) 104);
                var3.method518(88);
                var3.method1785(arg0 - 92);
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public final void method1122(int arg0) {
        if (arg0 != 10) {
            this.method1125(37L, true);
        }
        for (class172 var2 = (class172) this.field2643.method1497(true); var2 != null; var2 = (class172) this.field2643.method1495((byte) 36)) {
            if (var2.method1227(false)) {
                var2.method518(126);
                var2.method1785(-122);
                this.field2642++;
            }
        }
        field2647++;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)V")
    public static final void method1123(int arg0, int arg1) {
        field2655++;
        if (arg0 != -3741) {
            field2658 = null;
        }
        class197 var2 = class164.method1228(6, arg1, arg0 ^ 0x634B3483);
        var2.method1407(-108);
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
    public final void method1124(int arg0) {
        this.field2643.method1496((byte) -59);
        field2652++;
        if (arg0 != 0) {
            this.method1128((byte) -124, -11L);
        }
        this.field2654.method389((byte) 67);
        this.field2642 = this.field2640;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(JZ)Ljava/lang/Object;")
    public final Object method1125(long arg0, boolean arg1) {
        class172 var4 = (class172) this.field2654.method394(arg0, -21083);
        field2644++;
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method1229(82);
        if (var5 == null) {
            var4.method518(96);
            var4.method1785(-103);
            this.field2642++;
            return null;
        }
        if (var4.method1227(false)) {
            class164 var6 = new class164(var5);
            this.field2654.method388(-1, var4.field1166, var6);
            this.field2643.method1494(119, var6);
            var6.field4534 = 0L;
            var4.method518(88);
            var4.method1785(-86);
        } else {
            this.field2643.method1494(-126, var4);
            var4.field4534 = 0L;
        }
        if (!arg1) {
            field2658 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
    public static void method1126(byte arg0) {
        field2656 = null;
        field2649 = null;
        field2653 = null;
        field2657 = null;
        field2658 = null;
        if (arg0 != 45) {
            method1126((byte) -49);
        }
        field2651 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZ)I")
    public static final int method1127(int arg0, boolean arg1) {
        field2641++;
        if (arg1) {
            method1123(118, -7);
        }
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BJ)V")
    public final void method1128(byte arg0, long arg1) {
        int var4 = 97 / ((40 - arg0) / 45);
        field2648++;
        class172 var5 = (class172) this.field2654.method394(arg1, -21083);
        if (var5 != null) {
            var5.method518(94);
            var5.method1785(-91);
            this.field2642++;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(JZLjava/lang/Object;)V")
    public final void method1129(long arg0, boolean arg1, Object arg2) {
        this.method1128((byte) -62, arg0);
        field2650++;
        if (this.field2642 == 0) {
            class172 var5 = (class172) this.field2643.method1498(0);
            var5.method518(95);
            var5.method1785(-117);
        } else {
            this.field2642--;
        }
        class164 var6 = new class164(arg2);
        if (!arg1) {
            field2657 = null;
        }
        this.field2654.method388(-1, arg0, var6);
        this.field2643.method1494(55, var6);
        var6.field4534 = 0L;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(I)V")
    public class147(int arg0) {
        this.field2640 = arg0;
        int var2 = 1;
        this.field2642 = arg0;
        while (arg0 > var2 + var2) {
            var2 += var2;
        }
        this.field2654 = new class46(var2);
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field2653[var0] = class209.method1456(var0, (byte) 111);
        }
        field2656 = class68.method589(0, "Your ignore list is full)3 Max of 100 users)3");
        field2657 = class68.method589(0, "Clientscript error in: ");
        field2658 = field2656;
    }
}
