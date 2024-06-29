import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class288 extends class209 {

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    private int field4565;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
    private int field4571;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    private int field4575;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
    private int field4576;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "Lnj;")
    public static class144 field4566 = new class144(16);

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "Ljava/lang/String;")
    public static String field4578 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
    public static int field4577 = 0;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
    public static int field4580 = 0;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
    public static final void method1957(byte arg0) {
        ++field4572;
        int var1 = -35 % ((arg0 - 48) / 50);
        class57.field812.method1556((byte) 76);
        class264.field4282.method1556((byte) 121);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)Luf;")
    public static final class177 method1958(int arg0, int arg1) {
        ++field4570;
        if (arg0 != -28264) {
            method1960(46);
        }
        class177 var2 = (class177) class131.field2146.method310(-24190, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3;
            if (arg1 < 32768) {
                var3 = class183.field2947.method643(arg1, 1, false);
            } else {
                var3 = class34.field428.method643(arg1 & 32767, 1, false);
            }
            class177 var4 = new class177();
            if (var3 != null) {
                var4.method1322(new class152(var3), 16295);
            }
            if (arg1 >= 32768) {
                var4.method1318((byte) -50);
            }
            class131.field2146.method312((long) arg1, var4, (byte) -35);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V")
    public static void method1959(int arg0) {
        if (arg0 >= -23) {
            field4578 = null;
        }
        field4566 = null;
        field4578 = null;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(IIIIII)V")
    public class288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field4565 = arg3;
        this.field4571 = arg0;
        this.field4575 = arg2;
        this.field4576 = arg1;
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V")
    public static final void method1960(int arg0) {
        ++field4569;
        int var1 = class192.field3096;
        int var2 = class116.field1670;
        int var3 = class101.field1500;
        int var4 = class98.field1440 + -3;
        byte var5 = 20;
        if (class5.field39 == null || class210.field3368 == null) {
            if (class90.field1337.method634(class228.field3658, 0) && class90.field1337.method634(class80.field1169, 0)) {
                class5.field39 = class169.method1243((byte) -114, class228.field3658, 0, class90.field1337);
                class210.field3368 = class169.method1243((byte) -123, class80.field1169, 0, class90.field1337);
            } else {
                class70.method515(var1, var2, var3, var5, class282.field4489, -class88.field1312 + 256);
            }
        }
        if (class5.field39 != null && class210.field3368 != null) {
            int var6 = (var3 - class210.field3368.field3270 * 2) / class5.field39.field3270;
            for (int var7 = 0; ~var6 < ~var7; ++var7) {
                class5.field39.method60(var1 - -(class5.field39.field3270 * var7) + class210.field3368.field3270, var2);
            }
            class210.field3368.method60(var1, var2);
            class210.field3368.method72(var1 - class210.field3368.field3270 + var3, var2);
        }
        class285.field4511.method1254(class280.field4466, var1 + 3, var2 + 14, class250.field4154, -1);
        class70.method515(var1, var2 + var5, var3, -var5 + var4, class282.field4489, -class88.field1312 + 256);
        int var8 = class169.field2731;
        int var9 = class296.field4680;
        for (int var10 = 0; class243.field3890 > var10; ++var10) {
            int var18 = var2 - (-((-var10 + -1 + class243.field3890) * 15) + -var5) + 13;
            if (~var1 > ~var8 && var8 < var1 + var3 && var9 > var18 + -13 && var9 < var18 - -3) {
                class70.method515(var1, var18 + -12, var3, 15, class139.field2245, -class297.field4706 + 256);
            }
        }
        if (arg0 != 18263) {
            field4578 = null;
        }
        if ((class133.field2194 == null || class256.field4217 == null || class6.field44 == null) && class90.field1337.method634(class126.field1851, arg0 + -18263) && class90.field1337.method634(class105.field1534, arg0 + -18263) && class90.field1337.method634(class80.field1149, 0)) {
            class133.field2194 = class169.method1243((byte) -125, class126.field1851, 0, class90.field1337);
            class256.field4217 = class169.method1243((byte) -94, class105.field1534, 0, class90.field1337);
            class6.field44 = class169.method1243((byte) -122, class80.field1149, 0, class90.field1337);
        }
        if (class133.field2194 != null && class256.field4217 != null && class6.field44 != null) {
            int var11 = (-(class6.field44.field3270 * 2) + var3) / class133.field2194.field3270;
            for (int var12 = 0; var12 < var11; ++var12) {
                class133.field2194.method60(class133.field2194.field3270 * var12 + (var1 - -class6.field44.field3270), var2 + var4 + -class133.field2194.field3271);
            }
            int var13 = (-class6.field44.field3271 + -var5 + var4) / class256.field4217.field3271;
            for (int var14 = 0; var14 < var13; ++var14) {
                class256.field4217.method60(var1, var2 - (-(class256.field4217.field3271 * var14) + -var5));
                class256.field4217.method72(var1 - (-var3 + class256.field4217.field3270), class256.field4217.field3271 * var14 + var2 + var5);
            }
            class6.field44.method60(var1, -class6.field44.field3271 + var2 + var4);
            class6.field44.method72(-class6.field44.field3270 + var1 + var3, -class6.field44.field3271 + var2 + var4);
        }
        for (int var15 = 0; ~var15 > ~class243.field3890; ++var15) {
            int var16 = (class243.field3890 + -1 + -var15) * 15 + var5 + 13 + var2;
            int var17 = class250.field4154;
            if (var8 > var1 && ~var8 > ~(var1 - -var3) && var16 - 13 < var9 && ~var9 > ~(var16 - -3)) {
                var17 = class174.field2825;
            }
            class285.field4511.method1254(class188.method1401(2, var15), var1 + 3, var16, var17, 0);
        }
        class46.method346(class116.field1670, class192.field3096, class101.field1500, class98.field1440, 29262);
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(III)V")
    public final void method319(int arg0, int arg1, int arg2) {
        ++field4568;
        int var4 = this.field4571 * arg0 >> 12;
        int var5 = this.field4575 * arg0 >> 12;
        int var6 = this.field4565 * arg2 >> 12;
        int var7 = this.field4576 * arg2 >> 12;
        class156.method1154(var7, var4, arg1 ^ 1347847571, var6, super.field3349, var5);
        if (arg1 != -1) {
            this.field4565 = 101;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(III)V")
    public final void method318(int arg0, int arg1, int arg2) {
        int var4 = 25 / ((arg0 - -72) / 54);
        ++field4579;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILlc;I)Lak;")
    public static final class140 method1961(int arg0, class86 arg1, int arg2) {
        ++field4573;
        if (!class149.method1060(arg2, -73, arg1)) {
            return null;
        } else {
            if (arg0 != 3) {
                field4566 = null;
            }
            return class156.method1158(90);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIB)V")
    public final void method322(int arg0, int arg1, byte arg2) {
        ++field4581;
        int var4 = -98 / ((arg2 - -55) / 60);
    }
}
