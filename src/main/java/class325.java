import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class325 extends class224 {

    @OriginalMember(owner = "client!qj", name = "I", descriptor = "[I")
    public static int[] field4680 = new int[1000];

    @OriginalMember(owner = "client!qj", name = "M", descriptor = "Lus;")
    public static class1 field4683 = new class1(91, 2);

    @OriginalMember(owner = "client!qj", name = "U", descriptor = "Z")
    public static boolean field4690 = false;

    @OriginalMember(owner = "client!qj", name = "Y", descriptor = "[[S")
    public static short[][] field4694 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!qj", name = "Z", descriptor = "Z")
    public static boolean field4695 = false;

    @OriginalMember(owner = "client!qj", name = "T", descriptor = "B")
    public byte field4689;

    @OriginalMember(owner = "client!qj", name = "H", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!qj", name = "J", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!qj", name = "K", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!qj", name = "P", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!qj", name = "Q", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!qj", name = "R", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!qj", name = "S", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!qj", name = "V", descriptor = "I")
    public int field4691;

    @OriginalMember(owner = "client!qj", name = "ab", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!qj", name = "W", descriptor = "Lb;")
    public static class201 field4692;

    @OriginalMember(owner = "client!qj", name = "O", descriptor = "Lrp;")
    public class276 field4684;

    @OriginalMember(owner = "client!qj", name = "X", descriptor = "[[B")
    public static byte[][] field4693;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)V")
    public static final void method2058(int arg0, int arg1, int arg2) {
        ++field4681;
        int var3 = class37.field488.method860(arg0 ^ -7778, class20.field272.method2065(arg0 ^ -7704, class326.field4711));
        for (class451 var4 = (class451) class160.field2365.method2843(arg0 + 1123219856); var4 != null; var4 = (class451) class160.field2365.method2842(1673506446)) {
            int var8 = class450.method2624(var4, (byte) 75);
            if (~var3 > ~var8) {
                var3 = var8;
            }
        }
        var3 += 8;
        if (arg0 != 7756) {
            field4692 = null;
        }
        int var5 = class476.field6690 * 16 + 21;
        int var6 = -(var3 / 2) + arg1;
        if (~class144.field1900 > ~(var6 - -var3)) {
            var6 = -var3 + class144.field1900;
        }
        if (~var6 > -1) {
            var6 = 0;
        }
        int var7 = arg2;
        if (~(arg2 - -var5) < ~class244.field3634) {
            var7 = class244.field3634 - var5;
        }
        if (~var7 > -1) {
            var7 = 0;
        }
        class142.field1888 = var6;
        class19.field260 = true;
        class151.field2246 = var7;
        class104.field1324 = var3;
        class467.field6587 = class476.field6690 * 16 - -(!class103.field1317 ? 22 : 26);
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "(I)V")
    public static final void method2059(int arg0) {
        if (arg0 < 64) {
            field4692 = null;
        }
        class135.field1783.method682(class368.field5322, class314.field4438.field5772 ? class260.field3804 + 256 : -1);
        ++field4696;
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "(B)[B")
    public final byte[] method289(byte arg0) {
        if (arg0 >= -104) {
            method2061(59, true, -1.3249782F, -22, 68, 65, -100, -65);
        }
        ++field4685;
        if (!super.field3393 && this.field4684.field4021 >= this.field4684.field4064.length + -this.field4689) {
            return this.field4684.field4064;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(III[Ldt;ZZ)V")
    public static final void method2060(int arg0, int arg1, int arg2, class145[] arg3, boolean arg4, boolean arg5) {
        if (!arg4) {
            method2063((byte) 59);
        }
        for (int var6 = 0; ~arg3.length < ~var6; ++var6) {
            class145 var7 = arg3[var6];
            if (var7 != null && var7.field1947 == arg0) {
                class345.method2166(arg1, arg2, (byte) 104, var7, arg5);
                class204.method1277(arg2, var7, -32368, arg1);
                if (-var7.field2010 + var7.field2045 < var7.field2072) {
                    var7.field2072 = var7.field2045 - var7.field2010;
                }
                if (~var7.field2072 > -1) {
                    var7.field2072 = 0;
                }
                if (var7.field1938 > -var7.field2021 + var7.field1993) {
                    var7.field1938 = -var7.field2021 + var7.field1993;
                }
                if (~var7.field1938 > -1) {
                    var7.field1938 = 0;
                }
                if (var7.field2073 == 0) {
                    class88.method495(arg5, var7, (byte) 92);
                }
            }
        }
        ++field4688;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZFIIIII)[I")
    public static final int[] method2061(int arg0, boolean arg1, float arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field4682;
        int[] var8 = new int[arg5];
        class437 var9 = new class437();
        var9.field6084 = arg4;
        if (arg7 != 4698) {
            field4690 = true;
        }
        var9.field6066 = arg6;
        var9.field6081 = arg0;
        var9.field6065 = arg1;
        var9.field6069 = (int) (arg2 * 4096.0F);
        var9.field6063 = arg3;
        var9.method23(7);
        class488.method2860(arg5, -1, 1);
        var9.method2575(arg7 + -4698, 0, var8);
        return var8;
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)I")
    public final int method288(int arg0) {
        ++field4687;
        if (this.field4684 == null) {
            return 0;
        } else {
            return arg0 != 0 ? -67 : this.field4684.field4021 * 100 / (this.field4684.field4064.length - this.field4689);
        }
    }

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "(I)V")
    public static void method2062(int arg0) {
        field4680 = null;
        field4683 = null;
        field4693 = null;
        field4692 = null;
        if (arg0 <= 15) {
            method2059(-128);
        }
        field4694 = null;
    }

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "(B)V")
    public static final void method2063(byte arg0) {
        ++field4679;
        for (int var1 = 0; ~var1 > ~class286.field4169.length; ++var1) {
            for (int var2 = 0; var2 < class286.field4169[var1].length; ++var2) {
                class286.field4169[var1][var2] = class266.field3894;
            }
        }
        if (arg0 < 106) {
            method2063((byte) -19);
        }
    }
}
