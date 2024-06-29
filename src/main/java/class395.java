import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class395 {

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "Z")
    public static volatile boolean field5927 = true;

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "Lwe;")
    public static class24 field5932 = new class24(8);

    @OriginalMember(owner = "client!ps", name = "k", descriptor = "[I")
    public static int[] field5936 = new int[5];

    @OriginalMember(owner = "client!ps", name = "n", descriptor = "Lld;")
    public static class117 field5939 = class50.method344((byte) 118);

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!ps", name = "h", descriptor = "I")
    public static int field5933;

    @OriginalMember(owner = "client!ps", name = "i", descriptor = "I")
    public int field5934;

    @OriginalMember(owner = "client!ps", name = "j", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!ps", name = "l", descriptor = "I")
    public int field5937;

    @OriginalMember(owner = "client!ps", name = "m", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!ps", name = "o", descriptor = "I")
    public int field5940;

    @OriginalMember(owner = "client!ps", name = "p", descriptor = "[[I")
    public static int[][] field5941;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Z)V", line = 5)
    public static void method2582(boolean arg0) {
        if (!arg0) {
            field5932 = null;
            field5936 = null;
            field5941 = null;
            field5939 = null;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(BLil;)V", line = 21)
    public final void method2583(byte arg0, class265 arg1) {
        field5926++;
        if (arg0 != -9) {
            this.field5934 = 50;
        }
        while (true) {
            int var3 = arg1.method1697(99);
            if (var3 == 0) {
                return;
            }
            this.method2588(arg1, var3, -4531);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lqj;I)V", line = 57)
    public static final void method2584(class238 arg0, int arg1) {
        class242.field3395 = arg0;
        if (arg1 != 2) {
            method2585(true, (class194) null);
        }
        field5938++;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZLvp;)V", line = 72)
    public static final void method2585(boolean arg0, class194 arg1) {
        if (!arg0) {
            return;
        }
        field5933++;
        class166 var2 = (class166) class84.field1175.method954(-124, (long) arg1.field249);
        if (var2 == null) {
            class280.method1794(arg1, 0, arg1.field306[0], (class129) null, false, class193.field2688, (class404) null, arg1.field303[0]);
        } else {
            var2.method1036(true);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)Lll;", line = 96)
    public static final class333 method2586(int arg0, int arg1) {
        field5929++;
        class24 var2 = class79.field1080;
        class333 var3;
        synchronized (class79.field1080) {
            var3 = (class333) class79.field1080.method209(127, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class363.field5315.method1472(class86.method537(arg0, arg1 - 35566055), class100.method682(arg0, (byte) -43), 0);
        class333 var5 = new class333();
        var5.field4926 = arg0;
        if (var4 != null) {
            var5.method2211(0, new class265(var4));
        }
        if (arg1 != -6861) {
            return null;
        }
        class24 var6 = class79.field1080;
        synchronized (class79.field1080) {
            class79.field1080.method202(true, var5, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V", line = 124)
    public static final void method2587(int arg0) {
        field5931++;
        if (arg0 != -1) {
            return;
        }
        try {
            if (class24.field428 == 1) {
                int var1 = class413.field6182.method2281((byte) 39);
                if (var1 > 0 && class413.field6182.method2284(arg0 ^ 0xFFF0BDBF)) {
                    int var2 = var1 - class158.field2073;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class413.field6182.method2285(1570943944, var2);
                } else {
                    class413.field6182.method2276(false);
                    class413.field6182.method2282(-128);
                    if (class347.field5148 == null) {
                        class24.field428 = 0;
                    } else {
                        class24.field428 = 2;
                    }
                    class103.field1392 = null;
                    class54.field802 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class413.field6182.method2276(false);
            class24.field428 = 0;
            class103.field1392 = null;
            class347.field5148 = null;
            class54.field802 = null;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lil;II)V", line = 173)
    private final void method2588(class265 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field5934 = arg0.method1685(8104);
            this.field5940 = arg0.method1697(113);
            this.field5937 = arg0.method1697(-23);
        }
        field5928++;
        if (arg2 != -4531) {
            field5927 = true;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "([BZIILnr;I[Lbi;)V", line = 193)
    public static final void method2589(byte[] arg0, boolean arg1, int arg2, int arg3, class437 arg4, int arg5, class138[] arg6) {
        field5930++;
        class265 var7 = new class265(arg0);
        if (arg2 > -23) {
            field5941 = null;
        }
        int var8 = -1;
        while (true) {
            int var9 = var7.method1700(32767);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method1680(-1647926640);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method1697(114);
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg5 + var13;
                int var19 = var12 + arg3;
                if (var18 > 0 && var19 > 0 && class324.field4652 - 1 > var18 && var19 < (class336.field4964 - 1)) {
                    class138 var20 = null;
                    if (!arg1) {
                        int var21 = var14;
                        if ((class37.field606[1][var18][var19] & 0x2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg6[var21];
                        }
                    }
                    class391.method2560(true, var8, arg4, (byte) -91, var14, var20, var16, var14, var18, var17, var19, -1, arg1);
                }
            }
        }
    }
}
