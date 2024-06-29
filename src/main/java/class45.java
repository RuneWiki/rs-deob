import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class45 extends class361 {

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
    public static int field506 = 50;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "[I")
    public static int[] field509 = new int[field506];

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "[I")
    public static int[] field511 = new int[field506];

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "[I")
    public static int[] field508 = new int[field506];

    @OriginalMember(owner = "client!bd", name = "I", descriptor = "[I")
    public static int[] field514 = new int[field506];

    @OriginalMember(owner = "client!bd", name = "H", descriptor = "[I")
    public static int[] field513 = new int[field506];

    @OriginalMember(owner = "client!bd", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field521 = new String[field506];

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "[I")
    public static int[] field507 = new int[field506];

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    public int field504;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
    public int field510;

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!bd", name = "J", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "I")
    public int field516;

    @OriginalMember(owner = "client!bd", name = "L", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!bd", name = "M", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!bd", name = "O", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!bd", name = "Q", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "Ljava/lang/String;")
    public String field503;

    @OriginalMember(owner = "client!bd", name = "N", descriptor = "[I")
    public static int[] field519;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 4)
    public static void method256(int arg0) {
        field511 = null;
        field509 = null;
        field508 = null;
        field513 = null;
        field514 = null;
        field519 = null;
        field521 = null;
        if (arg0 != -13) {
            method257((byte) 120, (class290) null);
        }
        field507 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLza;)V", line = 30)
    public static final void method257(byte arg0, class290 arg1) {
        ++field517;
        int var2 = class123.field1679;
        int var3 = class250.field3725;
        int var4 = class388.field5445;
        if (arg0 >= -127) {
            method256(-26);
        }
        int var5 = class2.field56 - 3;
        byte var6 = 20;
        if (class411.field5805 == null || class186.field2682 == null) {
            if (class61.field761.method424(0, class392.field5516) && class61.field761.method424(0, class217.field3131)) {
                class411.field5805 = arg1.method312(class506.method3018(class61.field761, class392.field5516, 0), true);
                class506 var7 = class506.method3018(class61.field761, class217.field3131, 0);
                class186.field2682 = arg1.method312(var7, true);
                var7.method3016();
                class215.field3119 = arg1.method312(var7, true);
            } else {
                arg1.method325(var2, var3, var4, var6, -class147.field1957 + 255 << 24 | class214.field3097, 1);
            }
        }
        if (class411.field5805 != null && class186.field2682 != null) {
            int var8 = (-(2 * class186.field2682.method146()) + var4) / class411.field5805.method146();
            for (int var9 = 0; var8 > var9; ++var9) {
                class411.field5805.method151(class186.field2682.method146() + var2 - -(class411.field5805.method146() * var9), var3);
            }
            class186.field2682.method151(var2, var3);
            class215.field3119.method151(var4 + var2 + -class215.field3119.method146(), var3);
        }
        class107.field1431.method1914(var3 - -14, var2 + 3, class362.field5170.method3116(class149.field1979, (byte) 110), -16777216 | class198.field2817, 16144, -1);
        arg1.method325(var2, var3 + var6, var4, -var6 + var5, class214.field3097 | -class147.field1957 + 255 << 24, 1);
        int var10 = class22.field277.method1192(true);
        int var11 = class22.field277.method1194(36);
        int var12 = 0;
        for (class214 var13 = (class214) class363.field5190.method2655(15152); var13 != null; var13 = (class214) class363.field5190.method2660((byte) 67)) {
            int var31 = var6 - (-((class37.field408 + -1 + -var12) * 16) + -13) + var3;
            ++var12;
            if (var10 > var2 && var2 + var4 > var10 && var11 > var31 + -13 && var31 + 4 > var11 && var13.field3095) {
                arg1.method325(var2, var31 - 12, var4, 16, class220.field3176 | -class434.field6106 + 255 << 24, 1);
            }
        }
        if ((class68.field862 == null || class422.field5952 == null || class431.field6091 == null) && class61.field761.method424(0, class191.field2729) && class61.field761.method424(0, class511.field7560) && class61.field761.method424(0, class26.field324)) {
            class506 var14 = class506.method3018(class61.field761, class511.field7560, 0);
            class422.field5952 = arg1.method312(var14, true);
            var14.method3016();
            class138.field1809 = arg1.method312(var14, true);
            class68.field862 = arg1.method312(class506.method3018(class61.field761, class191.field2729, 0), true);
            class506 var15 = class506.method3018(class61.field761, class26.field324, 0);
            class431.field6091 = arg1.method312(var15, true);
            var15.method3016();
            class102.field1357 = arg1.method312(var15, true);
        }
        int var16 = 0;
        if (class68.field862 != null && class422.field5952 != null && class431.field6091 != null) {
            int var17 = (-(2 * class431.field6091.method146()) + var4) / class68.field862.method146();
            for (int var18 = 0; ~var17 < ~var18; ++var18) {
                class68.field862.method151(var2 - -class431.field6091.method146() - -(var18 * class68.field862.method146()), -class68.field862.method155() + var3 - -var5);
            }
            int var19 = (-var6 + var5 + -class431.field6091.method155()) / class422.field5952.method155();
            for (int var20 = 0; var20 < var19; ++var20) {
                class422.field5952.method151(var2, var3 + var6 + class422.field5952.method155() * var20);
                class138.field1809.method151(-class138.field1809.method146() + var2 + var4, var20 * class422.field5952.method155() + var3 - -var6);
            }
            class431.field6091.method151(var2, var3 - (-var5 + class431.field6091.method155()));
            class102.field1357.method151(var2 + var4 - class431.field6091.method146(), -class431.field6091.method155() + var5 + var3);
        }
        for (class214 var21 = (class214) class363.field5190.method2655(15152); var21 != null; var21 = (class214) class363.field5190.method2660((byte) 67)) {
            int var22 = (class37.field408 - 1 + -var16) * 16 + (var3 + var6 - -13);
            int var23 = class198.field2817 | -16777216;
            if (~var10 < ~var2 && ~(var2 + var4) < ~var10 && var11 > var22 + -13 && var22 + 4 > var11 && var21.field3095) {
                var23 = -16777216 | class300.field4387;
            }
            int[] var24 = null;
            if (class308.method1869(var21.field3094, (byte) 95)) {
                var24 = class344.field5000.method993((int) var21.field3089, true).field5534;
            } else if (~var21.field3085 != 0) {
                var24 = class344.field5000.method993(var21.field3085, true).field5534;
            } else if (!class26.method168(var21.field3094, 205)) {
                if (class350.method2072(var21.field3094, (byte) 125)) {
                    Object var25 = null;
                    class270 var26;
                    if (var21.field3094 == 1002) {
                        var26 = class377.field5338.method1901(50, (int) var21.field3089);
                    } else {
                        var26 = class377.field5338.method1901(50, (int) (2147483647L & var21.field3089 >>> 32));
                    }
                    if (var26.field3998 != null) {
                        var26 = var26.method1704((byte) 22, class163.field2413);
                    }
                    if (var26 != null) {
                        var24 = var26.field3934;
                    }
                }
            } else {
                class378 var27 = (class378) class125.field1687.method2405((long) ((int) var21.field3089), -66);
                if (var27 != null) {
                    class429 var28 = var27.field5353;
                    class322 var29 = var28.field6055;
                    if (var29.field4693 != null) {
                        var29 = var29.method1939(15964, class163.field2413);
                    }
                    if (var29 != null) {
                        var24 = var29.field4680;
                    }
                }
            }
            String var30 = class120.method809(-32060, var21);
            if (var24 != null) {
                var30 = var30 + class440.method2579(var24, false);
            }
            class107.field1431.method1918(var23, 0, var2 + 3, class81.field1048, var30, 0, class487.field6796, var22);
            if (var21.field3086) {
                class328.field4785.method151(class113.field1536.method2430(var30, (byte) -117) + 5 + var2, var22 - 12);
            }
            ++var16;
        }
        class36.method202(class2.field56, class123.field1679, false, class250.field3725, class388.field5445);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)I", line = 233)
    public final int method258(byte arg0) {
        ++field515;
        if (arg0 < 17) {
            field513 = null;
        }
        return (int) super.field7060;
    }

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "(I)V", line = 247)
    public static final void method259(int arg0) {
        ++field505;
        class324.field4729 = class113.field1536.field5804 - (-class113.field1536.field5813 - 2);
        int var1 = 2 / ((arg0 - -75) / 51);
        class133.field1752 = new String[500];
        class471.field6570 = class431.field6093.field5804 + 2 - -class431.field6093.field5813;
        for (int var2 = 0; var2 < class133.field1752.length; ++var2) {
            class133.field1752[var2] = "";
        }
    }

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "(I)V", line = 268)
    public final void method260(int arg0) {
        ++field522;
        super.field5164 |= Long.MIN_VALUE;
        if (arg0 != 9188) {
            this.field503 = null;
        }
        if (this.method262(12) == 0L) {
            class156.field2349.method2118(this, true);
        }
    }

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "(I)V", line = 282)
    public final void method261(int arg0) {
        super.field5164 = Long.MIN_VALUE & super.field5164 | class465.method2699((byte) 14) + 500L;
        ++field518;
        class408.field5775.method2118(this, true);
        if (arg0 != 4) {
            this.method263(-102);
        }
    }

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "(I)J", line = 296)
    public final long method262(int arg0) {
        if (arg0 != 12) {
            this.method258((byte) -43);
        }
        ++field512;
        return Long.MAX_VALUE & super.field5164;
    }

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "(I)I", line = 308)
    public final int method263(int arg0) {
        ++field520;
        int var2 = -97 / ((arg0 - -45) / 51);
        return (int) (super.field7060 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(II)V", line = 330)
    public class45(int arg0, int arg1) {
        super.field7060 = (long) arg1 | (long) arg0 << 32;
    }
}
