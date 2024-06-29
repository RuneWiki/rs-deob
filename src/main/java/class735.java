import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class735 {

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "Lbh;")
    private class538 field10287 = new class538(256);

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Lpga;")
    private class492 field10281;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "Ld;")
    private class268 field10282;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "Lqk;")
    public static class148 field10288 = new class148(95, 6);

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "Lju;")
    public static class102 field10290 = new class102(21, 8);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field10280;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field10283;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field10284;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field10285;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field10286;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Z")
    public static boolean field10289;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)Loia;")
    public final class51 method4078(boolean arg0, int arg1) {
        field10280++;
        Object var3 = this.field10287.method3200((long) arg1, -19983);
        if (var3 != null) {
            return (class51) var3;
        }
        if (!arg0) {
            field10290 = null;
        }
        if (!this.field10282.method86((byte) 117, arg1)) {
            return null;
        }
        class468 var4 = this.field10282.method91(arg1, -22805);
        int var5 = var4.field6391 ? 64 : this.field10281.field6837;
        class51 var7;
        if (var4.field6379 && this.field10281.method569()) {
            float[] var6 = this.field10282.method92(var5, false, arg1, 0.7F, var5, (byte) 122);
            var7 = this.field10281.method2892(var4.field6397 != 0, var5, (byte) 25, var5, var6, class4.field10);
        } else {
            int[] var8;
            if (var4.field6393 != 2 && class646.method3743(120, var4.field6386)) {
                var8 = this.field10282.method87(true, var5, 0.7F, var5, arg0, arg1);
            } else {
                var8 = this.field10282.method89(0.7F, arg0, false, var5, arg1, var5);
            }
            var7 = this.field10281.method2936(var4.field6397 != 0, var5, var5, var8, (byte) 103);
        }
        var7.method355(var4.field6387, (byte) -125, var4.field6380);
        this.field10287.method3199((byte) 78, var7, (long) arg1);
        return var7;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZLjava/lang/String;ZI)V")
    public static final void method4079(boolean arg0, String arg1, boolean arg2, int arg3) {
        class71.method450((byte) 109);
        field10284++;
        if (arg3 == 0) {
            class96.field1401 = class524.method3130(0, class674.field9500.field5155.method133(0) * 2, class746.field10393, 25632, class438.field6016, class387.field5400);
            if (arg1 != null) {
                class96.field1401.method563(0);
                class742 var12 = class378.method2286(class448.field6168, -112, 0, class688.field9641);
                class400 var13 = class96.field1401.method2085(var12, class320.method1860(class323.field4156, class688.field9641, 0), true);
                class183.method1221(0);
                class665.method3817(var12, -120, arg1, var13, true, class96.field1401);
            }
        } else {
            class545 var4 = null;
            if (arg1 != null) {
                var4 = class524.method3130(0, 0, class746.field10393, 25632, class438.field6016, class387.field5400);
                var4.method563(0);
                class742 var5 = class378.method2286(class448.field6168, -34, 0, class688.field9641);
                class400 var6 = var4.method2085(var5, class320.method1860(class323.field4156, class688.field9641, 0), true);
                class183.method1221(0);
                class665.method3817(var5, -126, arg1, var6, true, var4);
            }
            try {
                class96.field1401 = class524.method3130(arg3, class674.field9500.field5155.method133(0) * 2, class746.field10393, 25632, class438.field6016, class387.field5400);
                if (arg1 != null) {
                    var4.method563(0);
                    class742 var7 = class378.method2286(class448.field6168, 98, 0, class688.field9641);
                    class400 var8 = var4.method2085(var7, class320.method1860(class323.field4156, class688.field9641, 0), true);
                    class183.method1221(0);
                    class665.method3817(var7, -124, arg1, var8, true, var4);
                }
                if (class96.field1401.method2157()) {
                    boolean var9 = true;
                    try {
                        var9 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var15) {
                    }
                    class256 var10;
                    if (var9) {
                        var10 = class96.field1401.method2226(146800640);
                    } else {
                        var10 = class96.field1401.method2226(104857600);
                    }
                    class96.field1401.method2177(var10);
                }
            } catch (Throwable var16) {
                int var11 = class674.field9500.field5158.method1006(0);
                class674.field9500.method2250((byte) 92, 0, class674.field9500.field5158);
                method4079(false, arg1, arg2, var11);
                return;
            }
            if (var4 != null) {
                try {
                    var4.method3253(-6102);
                } catch (Throwable var14) {
                }
            }
        }
        class674.field9500.field5158.method1007(!arg2, 0);
        class674.field9500.method2250((byte) 83, arg3, class674.field9500.field5158);
        class570.method3407((byte) -72);
        class96.field1401.method2098(10000);
        class96.field1401.method2104(32);
        class123.field1685 = class96.field1401.method2141();
        class383.field5374 = class96.field1401.method2141();
        class183.method1226(true);
        class96.field1401.method2149(class674.field9500.field5157.method2594(0) == 1);
        if (class96.field1401.method2174()) {
            class191.method1269(-1, class674.field9500.field5132.method3744(0) == 1);
        }
        class95.method650(class96.field1401, class514.field7179 >> 3, (byte) -127, class456.field6281 >> 3);
        class507.method3027(-1);
        class83.field1158 = arg0;
        class641.field9109 = null;
        class295.field3852 = true;
        class48.method331((byte) 27);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZ)I")
    public static final int method4080(int arg0, boolean arg1) {
        field10286++;
        return arg1 ? arg0 & 0x7F : -104;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public static void method4081(int arg0) {
        if (arg0 != -32722) {
            method4080(-120, true);
        }
        field10290 = null;
        field10288 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
    public final void method4082(boolean arg0) {
        field10285++;
        this.field10287.method3204((byte) 113, 5);
        if (arg0) {
            method4079(false, null, true, 46);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
    public final void method4083(int arg0) {
        if (arg0 == 0) {
            this.field10287.method3210(false);
            field10283++;
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lpga;Ld;)V")
    public class735(class492 arg0, class268 arg1) {
        this.field10281 = arg0;
        this.field10282 = arg1;
    }
}
