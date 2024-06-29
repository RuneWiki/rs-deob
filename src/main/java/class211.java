import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class211 {

    @OriginalMember(owner = "client!rfa", name = "e", descriptor = "Loo;")
    public class652 field3258 = new class652(20);

    @OriginalMember(owner = "client!rfa", name = "m", descriptor = "Loo;")
    private class652 field3266 = new class652(64);

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "Lwia;")
    public class791 field3255;

    @OriginalMember(owner = "client!rfa", name = "h", descriptor = "Lwia;")
    private class791 field3261;

    @OriginalMember(owner = "client!rfa", name = "k", descriptor = "Lne;")
    public static class336 field3264 = new class336("WTRC", "office", "_rc", 1);

    @OriginalMember(owner = "client!rfa", name = "l", descriptor = "Lfba;")
    public static class27 field3265 = new class27(79, 8);

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!rfa", name = "d", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!rfa", name = "f", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!rfa", name = "g", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!rfa", name = "i", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!rfa", name = "j", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!rfa", name = "n", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!rfa", name = "p", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!rfa", name = "o", descriptor = "[I")
    public static int[] field3268;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "([BZI)Ljava/lang/Object;", line = 3)
    public static final Object method1448(byte[] arg0, boolean arg1, int arg2) {
        field3263++;
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class613.field8616) {
            try {
                class734 var3 = (class734) Class.forName("ao").getDeclaredConstructor().newInstance();
                var3.method1951(arg0, (byte) 112);
                return var3;
            } catch (Throwable var4) {
                class613.field8616 = true;
            }
        }
        if (arg2 != 1908068769) {
            field3264 = null;
        }
        return arg1 ? class758.method4206(arg0, 19382) : arg0;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II)Log;", line = 36)
    public final class674 method1449(int arg0, int arg1) {
        field3254++;
        class652 var3 = this.field3266;
        class674 var4;
        synchronized (this.field3266) {
            var4 = (class674) this.field3266.method3742((byte) 67, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class791 var5 = this.field3261;
        byte[] var6;
        synchronized (this.field3261) {
            var6 = this.field3261.method4339(arg0, 0, 46);
        }
        class674 var7 = new class674();
        var7.field9403 = this;
        if (arg1 != 136) {
            this.method1453(-116, 121);
        }
        if (var6 != null) {
            var7.method3831((byte) -84, new class494(var6));
        }
        class652 var8 = this.field3266;
        synchronized (this.field3266) {
            this.field3266.method3739((long) arg0, (byte) 47, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)V", line = 74)
    public static void method1450(int arg0) {
        field3268 = null;
        int var1 = -93 % ((arg0 - 85) / 36);
        field3265 = null;
        field3264 = null;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Z)V", line = 88)
    public final void method1451(boolean arg0) {
        if (arg0) {
            return;
        }
        field3259++;
        class652 var2 = this.field3266;
        synchronized (this.field3266) {
            this.field3266.method3735(2);
        }
        class652 var3 = this.field3258;
        synchronized (this.field3258) {
            this.field3258.method3735(2);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(II)Z", line = 105)
    public static final boolean method1452(int arg0, int arg1) {
        field3256++;
        int var2 = 55 / ((arg1 + 45) / 63);
        return arg0 == 0 || arg0 == 2;
    }

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "(II)V", line = 119)
    public final void method1453(int arg0, int arg1) {
        class652 var3 = this.field3266;
        synchronized (this.field3266) {
            this.field3266.method3741(arg0, 0);
        }
        field3260++;
        class652 var4 = this.field3258;
        synchronized (this.field3258) {
            this.field3258.method3741(arg0, 0);
        }
        if (arg1 != 20) {
            method1450(-56);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIBIIII)V", line = 135)
    public static final void method1454(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field3257++;
        if (arg2 < 80) {
            return;
        }
        for (class544 var7 = (class544) class610.field8580.method2170(false); var7 != null; var7 = (class544) class610.field8580.method2176(-17754)) {
            if (class192.field2961 >= var7.field7821) {
                var7.method3358(97);
            } else {
                class363.method2280(arg3, 25959, var7.field7815 * 2, var7.field7816, (var7.field7820 << 9) + 256, arg5 >> 1, arg4, (var7.field7818 << 9) + 256, arg0 >> 1);
                class269.field3907.method566(var7.field7822, var7.field7819 | 0xFF000000, arg6 + class470.field6591[1], 0, 0, class470.field6591[0] + arg1);
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Ldt;ILwia;Lwia;)V", line = 194)
    public class211(class252 arg0, int arg1, class791 arg2, class791 arg3) {
        this.field3255 = arg3;
        this.field3261 = arg2;
        this.field3261.method4353(46, true);
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)V", line = 171)
    public final void method1455(byte arg0) {
        class652 var2 = this.field3266;
        synchronized (this.field3266) {
            this.field3266.method3743(arg0 ^ 0xFFFFFFD9);
        }
        field3262++;
        class652 var3 = this.field3258;
        synchronized (this.field3258) {
            this.field3258.method3743(arg0 + 55);
        }
        if (arg0 != -47) {
            method1454(35, 108, (byte) 7, 39, -56, -87, -70);
        }
    }
}
