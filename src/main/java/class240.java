import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class240 extends class204 implements class36 {

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "I")
    private int field3942 = 50;

    @OriginalMember(owner = "client!tl", name = "L", descriptor = "Z")
    private boolean field3959 = false;

    @OriginalMember(owner = "client!tl", name = "N", descriptor = "Lvh;")
    private class108 field3961;

    @OriginalMember(owner = "client!tl", name = "J", descriptor = "Lvh;")
    private class108 field3957;

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "Lck;")
    private class1 field3946;

    @OriginalMember(owner = "client!tl", name = "G", descriptor = "Lck;")
    private class1 field3954;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    public static int field3939 = 0;

    @OriginalMember(owner = "client!tl", name = "A", descriptor = "Z")
    public static volatile boolean field3948 = true;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    public static int field3940 = 0;

    @OriginalMember(owner = "client!tl", name = "B", descriptor = "Ljava/lang/String;")
    public static String field3949 = "Choose Option";

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!tl", name = "C", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!tl", name = "D", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!tl", name = "E", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!tl", name = "F", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!tl", name = "H", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!tl", name = "I", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!tl", name = "K", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!tl", name = "M", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "Lmf;")
    public static class28 field3944;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)Z")
    public final boolean method236(int arg0, int arg1) {
        if (arg0 <= 59) {
            this.field3959 = true;
        }
        field3953++;
        return this.method1104((byte) -101, arg1).field2041;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(FII)[I")
    public final int[] method239(float arg0, int arg1, int arg2) {
        field3951++;
        class180 var4 = this.method1585(arg1, (byte) -58);
        if (var4 == null) {
            return null;
        }
        var4.field2956 = true;
        if (arg2 != 0) {
            this.method1348(-61, 11);
        }
        return var4.method1191(this, this.field3957, arg0, this.field3959 || this.method1104((byte) -123, arg1).field2034);
    }

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "(II)V")
    private final void method1582(int arg0, int arg1) {
        for (class180 var3 = (class180) this.field3946.method7(23635); var3 != null; var3 = (class180) this.field3946.method1((byte) -6)) {
            if (var3.field2956) {
                var3.method1192(arg1);
                var3.field2956 = false;
            }
        }
        if (arg0 != 4) {
            this.method236(-71, -11);
        }
        field3950++;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(IZ)V")
    public final void method1583(int arg0, boolean arg1) {
        this.field3959 = arg1;
        if (arg0 != 0) {
            this.method1583(79, false);
        }
        this.method1588(false);
        field3958++;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(Z)V")
    public static final void method1584(boolean arg0) {
        if (arg0) {
            class79.field1367 = class72.field1185;
            class95.field1642 = class31.field464;
        } else {
            class79.field1367 = class4.field56;
            class95.field1642 = class78.field1342;
        }
        class193.field3126 = class79.field1367.length;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(II)Z")
    public final boolean method238(int arg0, int arg1) {
        if (arg0 == 1) {
            field3941++;
            return this.field3959 || this.method1104((byte) -120, arg1).field2034;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IB)Lsg;")
    private final class180 method1585(int arg0, byte arg1) {
        field3956++;
        int var3 = -65 % ((arg1 - 6) / 62);
        class180 var4 = (class180) this.field3946.method3(32, (long) arg0);
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3961.method746(0, (byte) -128, arg0);
        if (var5 == null) {
            return null;
        } else {
            class180 var6 = new class180(new class101(var5));
            this.field3946.method4(0, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lvh;Lvh;Lvh;IZ)V")
    public class240(class108 arg0, class108 arg1, class108 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field3961 = arg0;
        this.field3959 = arg4;
        this.field3942 = arg3;
        this.field3957 = arg2;
        this.field3946 = new class1(this.field3942);
        this.field3954 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method1586(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3960++;
        class71.field1166++;
        class227.method1528(64);
        if (arg5) {
            class26.method174(false, (byte) -10, 0, false);
        } else {
            class134.method932(true, 0);
            class26.method174(true, (byte) -10, 0, false);
            if (class156.field2612 == 0) {
                for (int var7 = 1; var7 <= 5; var7++) {
                    class26.method174(false, (byte) -10, var7, false);
                    class26.method174(false, (byte) -10, var7, true);
                    class134.method932(true, var7);
                }
            } else {
                for (int var6 = 1; var6 <= 5; var6++) {
                    class134.method932(true, var6);
                    class26.method174(false, (byte) -10, var6, false);
                    class26.method174(false, (byte) -10, var6, true);
                }
            }
        }
        if (!arg5) {
            class66.method413(false);
        }
        class253.method1676(-25034);
        if (class241.field3970 == 1) {
            int var8 = (int) class195.field3151;
            if ((class216.field3644 / 256) > var8) {
                var8 = class216.field3644 / 256;
            }
            if (class201.field3306[4] && (class55.field957[4] + 128) > var8) {
                var8 = class55.field957[4] + 128;
            }
            int var9 = (int) class106.field1900 + class170.field2807 & 0x7FF;
            class92.method595(class10.method68(true, class176.field2886, class273.field4378.field1458, class273.field4378.field1397) - 50, arg2, var8, class77.field1251, var9, class216.field3637, -853521336, var8 * 3 + 600);
        } else if (class241.field3970 == 5) {
            class41.method273(arg2, arg1 ^ 0x104);
        }
        int var10 = class237.field3904;
        int var11 = class52.field914;
        int var12 = class250.field4093;
        int var13 = class228.field3844;
        int var14 = class56.field976;
        for (int var15 = 0; var15 < 5; var15++) {
            if (class201.field3306[var15]) {
                int var22 = (int) (Math.random() * (double) (class258.field4213[var15] * 2 + 1) + Math.sin((double) class21.field324[var15] / 100.0D * (double) class39.field583[var15]) * (double) class55.field957[var15] - (double) class258.field4213[var15]);
                if (var15 == 1) {
                    class250.field4093 += var22;
                }
                if (var15 == 0) {
                    class56.field976 += var22;
                }
                if (var15 == 4) {
                    class228.field3844 += var22;
                    if (class228.field3844 < 128) {
                        class228.field3844 = 128;
                    }
                    if (class228.field3844 > 383) {
                        class228.field3844 = 383;
                    }
                }
                if (var15 == 3) {
                    class52.field914 = class52.field914 + var22 & 0x7FF;
                }
                if (var15 == 2) {
                    class237.field3904 += var22;
                }
            }
        }
        class7.method43((byte) -79);
        class283.method1858(arg4, arg3, arg4 + arg0, arg2 + arg3);
        class287.method1936();
        if (class33.field480 < 0) {
            class283.method1855(arg4, arg3, arg0, arg2, 0);
        } else {
            class13 var16 = class127.method872(arg1 ^ 0xFFFFEFEE, class33.field480, class255.field4166, class67.field1118, class69.field1129);
            var16.method77(class245.field4026, arg4, arg3, arg0, arg2, class228.field3844, class52.field914, 0);
        }
        if (class248.field4074 || class199.field3266 < arg4 || class199.field3266 >= arg0 + arg4 || arg3 > class147.field2497 || class147.field2497 >= arg2 + arg3) {
            class227.field3824 = false;
            class55.field952 = 0;
        } else {
            class227.field3824 = true;
            class55.field952 = 0;
            int var17 = class109.field1960;
            int var18 = class215.field3628;
            int var19 = class296.field4703;
            class246.field4040 = (class199.field3266 - arg4) * (var17 - var18) / arg0 + var18;
            int var20 = class177.field2914;
            class147.field2505 = (class147.field2497 - arg3) * (var19 - var20) / arg2 + var20;
        }
        class97.method614(32067);
        byte var21 = class183.method1201(82) == 2 ? (byte) class71.field1166 : 1;
        class281.method1835(class56.field976, class250.field4093, class237.field3904, class228.field3844, class52.field914, class158.field2648, class78.field1337, class201.field3307, class4.field46, class217.field3665, class196.field3176, class176.field2886 + 1, var21, class273.field4378.field1397 >> 7, class273.field4378.field1458 >> 7);
        class97.method614(arg1 + 31811);
        class101.method665();
        class119.method817((byte) -99, 256, arg4, arg3, arg2, 256, arg0);
        class110.method764(arg0, arg4, 256, arg1, arg3, arg2, 10140);
        ((class240) class287.field4555).method1582(4, class191.field3087);
        class73.method445(arg3, arg4, arg0, (byte) 101, arg2);
        class56.field976 = var14;
        class52.field914 = var11;
        class237.field3904 = var10;
        class250.field4093 = var12;
        class228.field3844 = var13;
        if (class6.field69 && class91.field1610.method318((byte) -113) == 0) {
            class6.field69 = false;
        }
        if (class6.field69) {
            class283.method1855(arg4, arg3, arg0, arg2, 0);
            class229.method1539(0, false, class261.field4257);
        }
        if (!arg5 && !class6.field69 && !class248.field4074 && arg4 <= class199.field3266 && (arg4 + arg0) > class199.field3266 && arg3 <= class147.field2497 && arg2 + arg3 > class147.field2497) {
            class12.method74(arg3, class199.field3266, arg0, class147.field2497, arg4, true, arg2);
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V")
    public static void method1587(int arg0) {
        field3944 = null;
        field3949 = null;
        int var1 = -5 / ((-arg0 - 39) / 50);
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(II)Lhl;")
    public final class136 method1348(int arg0, int arg1) {
        field3943++;
        class180 var3 = this.method1585(arg1, (byte) 107);
        if (arg0 >= 0) {
            return null;
        } else if (var3 == null) {
            return null;
        } else {
            return var3.field2959;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZIBFI)Lda;")
    public final class197 method237(boolean arg0, int arg1, byte arg2, float arg3, int arg4) {
        field3955++;
        if (arg2 != -75) {
            this.method236(-12, 64);
        }
        class180 var6 = this.method1585(arg4, (byte) -93);
        if (var6 != null && var6.method1190(this, this.field3957)) {
            return arg0 ? var6.field2959.method953(this.field3957, (double) arg3, arg1, arg1, this, false, 40) : var6.field2959.method958(this.field3957, false, (double) arg3, 255, arg1, arg1, this);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZ)Z")
    public final boolean method235(int arg0, boolean arg1) {
        field3952++;
        if (!arg1) {
            this.field3942 = -123;
        }
        return !this.method1104((byte) -93, arg0).field2033;
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(Z)V")
    public final void method1588(boolean arg0) {
        this.field3946.method2(5);
        if (this.field3954 != null) {
            this.field3954.method2(5);
        }
        class180.field2964 = null;
        field3947++;
        if (arg0) {
            this.method1585(97, (byte) 44);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BI)I")
    public final int method234(byte arg0, int arg1) {
        field3945++;
        return arg0 > -8 ? -55 : this.method1104((byte) -124, arg1).field2047 & 0xFFFF;
    }
}
