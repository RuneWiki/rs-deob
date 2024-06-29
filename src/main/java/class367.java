import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class367 {

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "Lhu;")
    private class76 field5054 = new class76(64);

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "Lr;")
    private class110 field5050;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "[I")
    public static int[] field5044 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "J")
    public static long field5047 = 0L;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "Lcm;")
    public static class472 field5048 = new class472();

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field5055 = 0;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Let;", line = 4)
    public final class387 method2238(int arg0, int arg1) {
        field5045++;
        if (arg1 < 86) {
            return null;
        }
        class76 var3 = this.field5054;
        class387 var4;
        synchronized (this.field5054) {
            var4 = (class387) this.field5054.method493((byte) 19, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5050.method702((byte) 122, arg0, 31);
        class387 var6 = new class387();
        if (var5 != null) {
            var6.method2376(new class32(var5), 4);
        }
        class76 var7 = this.field5054;
        synchronized (this.field5054) {
            this.field5054.method505((long) arg0, var6, 92);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)V", line = 36)
    public final void method2239(int arg0, byte arg1) {
        field5049++;
        class76 var3 = this.field5054;
        synchronized (this.field5054) {
            if (arg1 >= -103) {
                method2240(-84);
            }
            this.field5054.method496(arg0, 119);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 49)
    public static void method2240(int arg0) {
        field5044 = null;
        if (arg0 < 44) {
            field5051 = -87;
        }
        field5048 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILci;IIIILwm;)V", line = 61)
    public static final void method2241(int arg0, class287 arg1, int arg2, int arg3, int arg4, int arg5, class364 arg6) {
        field5046++;
        if (class373.field5100 < 100) {
            class117.method737(-104, arg6, arg1);
        }
        arg6.method1981(arg5, arg3, arg4 + arg5, arg3 - -arg2);
        if (class373.field5100 < 100) {
            byte var7 = 20;
            int var8 = arg4 / 2 + arg5;
            int var9 = arg2 / 2 + arg3 - var7 - 18;
            arg6.method2003(arg5, arg3, arg4, arg2, -16777216, 0);
            arg6.method1973(var8 - 152, var9, 304, 34, class306.field4052[class3.field44].getRGB(), 0);
            arg6.method2003(var8 - 150, var9 - -2, class373.field5100 * 3, 30, class449.field6107[class3.field44].getRGB(), 0);
            class93.field1366.method2127(class246.field3288.method1176(class110.field1676, (byte) -103), -1, true, var9 + var7, class14.field204[class3.field44].getRGB(), var8);
            return;
        }
        int var10 = class370.field5065 - (int) ((float) arg4 / class55.field739);
        int var11 = (int) ((float) arg2 / class55.field739) + class432.field5889;
        int var12 = (int) ((float) arg4 / class55.field739) + class370.field5065;
        class11.field146 = (int) ((float) (arg2 * 2) / class55.field739);
        class28.field367 = class432.field5889 - (int) ((float) arg2 / class55.field739);
        class160.field2210 = (int) ((float) (arg4 * 2) / class55.field739);
        int var13 = class432.field5889 - ((int) ((float) arg2 / class55.field739));
        class152.field2137 = class370.field5065 - (int) ((float) arg4 / class55.field739);
        if (arg0 != -9274) {
            field5051 = -90;
        }
        class55.method405(class55.field757 + var10, var11 - -class55.field754, class55.field757 + var12, class55.field754 + var13, arg5, arg3, arg4 + arg5, arg3 - (-arg2 - 1));
        class55.method397(arg6);
        class105 var14 = class55.method399(arg6);
        class259.method1457(var14, (byte) -80, arg6, 0, 0);
        if (class134.field1953 > 0) {
            class308.field4076--;
            if (class308.field4076 == 0) {
                class308.field4076 = 20;
                class134.field1953--;
            }
        }
        if (!class165.field2286) {
            return;
        }
        int var15 = arg4 + arg5 - 5;
        int var16 = arg2 + arg3 - 8;
        class284.field3828.method2125(var15, var16, -1, "Fps:" + class437.field5935, 0, 16776960);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class284.field3828.method2125(var15, var20, -1, "Mem:" + var18 + "k", 0, var19);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZI)Z", line = 147)
    public static final boolean method2242(boolean arg0, int arg1) {
        field5053++;
        if (arg1 != -5) {
            field5044 = null;
        }
        boolean var2 = class98.field1432.method2109();
        if (arg0 == var2) {
            return true;
        }
        if (!arg0) {
            class98.field1432.method1964();
        } else if (!class98.field1432.method1968()) {
            arg0 = false;
        }
        if (arg0 == var2) {
            return false;
        } else {
            class488.field6789.field6679 = arg0;
            class488.field6789.method2417(51, class251.field3359);
            return true;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lnk;ZI)Ljava/lang/String;", line = 189)
    public static final String method2243(class464 arg0, boolean arg1, int arg2) {
        if (arg1) {
            field5051 = -31;
        }
        field5056++;
        if (!client.method1046(arg0).method1258(arg2, -22114) && arg0.field6395 == null) {
            return null;
        } else if (arg0.field6338 == null || arg2 >= arg0.field6338.length || arg0.field6338[arg2] == null || arg0.field6338[arg2].trim().length() == 0) {
            return class200.field2704 ? "Hidden-" + arg2 : null;
        } else {
            return arg0.field6338[arg2];
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V", line = 225)
    public final void method2244(boolean arg0) {
        class76 var2 = this.field5054;
        synchronized (this.field5054) {
            this.field5054.method502(0);
            if (!arg0) {
                method2242(false, -68);
            }
        }
        field5043++;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Ldn;ILr;)V", line = 259)
    public class367(class329 arg0, int arg1, class110 arg2) {
        this.field5050 = arg2;
        this.field5050.method694(31, (byte) 119);
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V", line = 244)
    public final void method2245(int arg0) {
        class76 var2 = this.field5054;
        synchronized (this.field5054) {
            this.field5054.method495(-102);
        }
        field5052++;
        if (arg0 < 53) {
            this.field5054 = null;
        }
    }
}
