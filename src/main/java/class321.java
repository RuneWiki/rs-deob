import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class321 {

    @OriginalMember(owner = "client!j", name = "c", descriptor = "[I")
    public static int[] field4652 = new int[2];

    @OriginalMember(owner = "client!j", name = "b", descriptor = "Liu;")
    public static class517 field4651 = new class517(5, -1);

    @OriginalMember(owner = "client!j", name = "e", descriptor = "F")
    public static float field4654;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "Lvk;")
    public static class413 field4653;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V", line = 7)
    public static final void method2000(int arg0) {
        field4650++;
        class258 var1 = (class258) class25.field352.method427(true);
        if (arg0 <= 82) {
            field4651 = null;
        }
        while (var1 != null) {
            class642 var2 = var1.field3746;
            if (var2.field9303 < class310.field4553) {
                var1.method911(-52);
                var2.method3702(-19422);
            } else if (var2.field9298 <= class310.field4553) {
                if (var2.field9327 > 0) {
                    class181 var3 = (class181) class432.field6368.method740(0, (long) (var2.field9327 - 1));
                    if (var3 != null) {
                        class170 var4 = var3.field2623;
                        if (var4.field5108 >= 0 && (class146.field2247 * 128) > var4.field5108 && var4.field5109 >= 0 && var4.field5109 < class66.field990 * 128) {
                            var2.method3699(class355.method2160(var4.field5108, var4.field5109, var2.field5116, (byte) 103) - var2.field9319, var4.field5109, var4.field5108, class310.field4553, false);
                        }
                    }
                }
                if (var2.field9327 < 0) {
                    int var5 = -var2.field9327 - 1;
                    class400 var6;
                    if (class323.field4670 == var5) {
                        var6 = class644.field9367;
                    } else {
                        var6 = class39.field536[var5];
                    }
                    if (var6 != null && var6.field5108 >= 0 && var6.field5108 < (class146.field2247 * 128) && var6.field5109 >= 0 && var6.field5109 < (class66.field990 * 128)) {
                        var2.method3699(class355.method2160(var6.field5108, var6.field5109, var2.field5116, (byte) 103) - var2.field9319, var6.field5109, var6.field5108, class310.field4553, false);
                    }
                }
                var2.method3696(class303.field4378, 0);
                client.method3524(var2, true);
            }
            var1 = (class258) class25.field352.method420(false);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Ltv;)V", line = 76)
    public static final void method2001(class360 arg0) {
        for (int var1 = arg0.field5117; var1 <= arg0.field5119; var1++) {
            for (int var2 = arg0.field5113; var2 <= arg0.field5107; var2++) {
                class184 var3 = class277.field4051[arg0.field5116][var1][var2];
                if (var3 != null) {
                    class277 var4 = var3.field2675;
                    class277 var5 = null;
                    while (var4 != null) {
                        if (var4.field4044 == arg0) {
                            if (var5 == null) {
                                var3.field2675 = var4.field4045;
                            } else {
                                var5.field4045 = var4.field4045;
                            }
                            var4.method1782((byte) 82);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field4045;
                    }
                    var3.field2671 = 0;
                    for (class277 var6 = var3.field2675; var6 != null; var6 = var6.field4045) {
                        var3.field2671 = (byte) (var3.field2671 | var6.field4049);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljba;III)V", line = 129)
    public static final void method2002(class648 arg0, int arg1, int arg2, int arg3) {
        long var4 = class90.field1621[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field9393 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 0xFFFFL);
            if (var8 <= 0) {
                break;
            }
            arg0.field9399[arg0.field9393++] = class477.field6820[var8 - 1].field8805;
            var6 += 16L;
        }
        for (int var9 = arg0.field9393; var9 < 4; var9++) {
            arg0.field9399[var9] = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V", line = 160)
    public static void method2003(int arg0) {
        if (arg0 > 68) {
            field4653 = null;
            field4652 = null;
            field4651 = null;
        }
    }
}
