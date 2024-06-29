import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class152 extends class224 {

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
    private int field2367;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "I")
    private int field2368;

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
    private int field2372;

    @OriginalMember(owner = "client!mm", name = "u", descriptor = "I")
    private int field2378;

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "I")
    public static int field2375 = 0;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!mm", name = "t", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "[Lgl;")
    public static class356[] field2373;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)V")
    public static void method1073(boolean arg0) {
        if (arg0) {
            field2373 = null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method1074(int arg0, int arg1, String arg2) {
        ++field2377;
        ++class287.field4599;
        class11.field139.method2224(205, (byte) 0);
        class11.field139.method1312(1 - -class317.method2110(true, arg2), -82);
        class11.field139.method1325(arg1 ^ arg1, arg0);
        class11.field139.method1301(arg2, 104);
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(IIIIIII)V")
    public class152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2367 = arg3;
        this.field2368 = arg2;
        this.field2372 = arg0;
        this.field2378 = arg1;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(III)V")
    public final void method299(int arg0, int arg1, int arg2) {
        ++field2369;
        int var4 = this.field2372 * arg0 >> 12;
        int var5 = this.field2368 * arg0 >> 12;
        int var6 = this.field2378 * arg1 >> 12;
        int var7 = this.field2367 * arg1 >> 12;
        if (arg2 != -1011) {
            this.field2368 = 126;
        }
        class129.method957(var6, super.field3731, super.field3734, var4, var5, var7, super.field3730, 1);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILe;)V")
    public static final void method1075(int arg0, class312 arg1) {
        ++field2371;
        arg1.method671(0, 0, class369.field5615, 350);
        arg1.method563(0, 0, class369.field5615, 350, arg0 | class217.field3550 << 24, 1);
        for (int var2 = 0; var2 < 100; ++var2) {
            int var13 = class377.field5697[var2];
            int var14 = class35.field430[var2];
            arg1.method563(var13, var14, 2, 2, 16777215 | class7.field91[var2] << 24, 1);
        }
        int var3 = 350 / class129.field2041;
        if (~class92.field1134 < -1) {
            int var4 = -class129.field2041 + 346 + -4;
            int var5 = var3 * var4 / (class92.field1134 + var3 + -1);
            int var6 = 4;
            if (~class92.field1134 < -2) {
                var6 += (class92.field1134 - 1 + -class316.field4967) * (-var5 + var4) / (class92.field1134 + -1);
            }
            arg1.method563(class369.field5615 + -16, var6, 12, var5, class217.field3550 << 24 | 3351159, 2);
            for (int var7 = class316.field4967; class316.field4967 + var3 > var7 && ~var7 > ~class92.field1134; ++var7) {
                String[] var8 = class63.method410(class314.field4939[var7], '\b', -1);
                int var9 = (class369.field5615 + -16 + -8) / var8.length;
                for (int var10 = 0; var10 < var8.length; ++var10) {
                    int var11 = 8 - -(var9 * var10);
                    arg1.method671(var11, 0, var11 + -8 + var9, 350);
                    class435.field6411.method2810(var11, -16777216, -1, -class413.field6107 + -2 + 350 + -((-class316.field4967 + var7) * class129.field2041) - class31.field383.field5108, true, var8[var10]);
                }
            }
        }
        arg1.method671(0, 0, class369.field5615, 350);
        arg1.method2087(-1, true, -class413.field6107 + 350, 0, class369.field5615);
        class11.field133.method2810(10, -16777216, -1, -class413.field6111.field5108 + 350 + -1, true, "--> " + class213.field3412);
        int var12 = -1;
        if (class183.field2987 % 30 > 15) {
            var12 = 16777215;
        }
        arg1.method2085(10 + class413.field6111.method2162("--> " + class213.field3412.substring(0, class128.field2028), 90), (byte) -101, 12, -class413.field6111.field5108 + 350 + -11, var12);
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(III)V")
    public final void method302(int arg0, int arg1, int arg2) {
        ++field2370;
        int var4 = this.field2372 * arg1 >> 12;
        int var5 = this.field2368 * arg1 >> 12;
        int var6 = this.field2378 * arg2 >> 12;
        int var7 = this.field2367 * arg2 >> 12;
        if (arg0 != -1011) {
            method1076(114, -97, -111, 1, -39);
        }
        class61.method399(-108, var5, var4, var7, var6, super.field3730, super.field3734);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIZ)V")
    public final void method298(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method1075(27, (class312) null);
        }
        ++field2376;
        int var4 = this.field2372 * arg0 >> 12;
        int var5 = this.field2368 * arg0 >> 12;
        int var6 = this.field2378 * arg1 >> 12;
        int var7 = this.field2367 * arg1 >> 12;
        class79.method498(var4, var6, arg2, var7, super.field3731, var5);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIII)V")
    public static final void method1076(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 350) {
            method1073(false);
        }
        ++field2374;
        class33 var5 = (class33) class126.field1937.method1770(-880, (long) arg2);
        if (var5 == null) {
            var5 = new class33();
            class126.field1937.method1766((long) arg2, var5, 87);
        }
        if (arg3 >= var5.field417.length) {
            int[] var6 = new int[arg3 + 1];
            int[] var7 = new int[arg3 + 1];
            for (int var8 = 0; ~var8 > ~var5.field417.length; ++var8) {
                var6[var8] = var5.field417[var8];
                var7[var8] = var5.field412[var8];
            }
            for (int var9 = var5.field417.length; ~arg3 < ~var9; ++var9) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field412 = var7;
            var5.field417 = var6;
        }
        var5.field417[arg3] = arg4;
        var5.field412[arg3] = arg0;
    }
}
