import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class373 {

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field5450 = 0;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field5452 = 0;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "Lbn;")
    public static class160 field5454;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "Z")
    public static boolean field5455;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "[I")
    public static int[] field5456;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "Lct;")
    public static class104 field5445;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "[Loc;")
    public static class96[] field5448;

    static {
        new class409("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
        field5454 = new class160(0, 0);
        field5455 = true;
        field5456 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII)V", line = 3)
    public static final void method2367(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 1008) {
            class107.method763(class166.field2192, arg2, arg0);
        } else if (arg1 == 1003) {
            class107.method763(class349.field5128, arg2, arg0);
        } else if (arg1 == 1009) {
            class107.method763(class429.field6237, arg2, arg0);
        } else if (arg1 == 1007) {
            class107.method763(class184.field2589, arg2, arg0);
        } else if (arg1 == 1012) {
            class107.method763(class308.field4553, arg2, arg0);
        }
        int var4 = -122 % ((arg3 + 63) / 56);
        field5447++;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 42)
    public static final String method2368(String arg0, int arg1, String arg2, String arg3) {
        field5449++;
        int var4 = arg2.indexOf(arg0);
        if (arg1 != 0) {
            field5452 = -61;
        }
        while (var4 != -1) {
            arg2 = arg2.substring(0, var4) + arg3 + arg2.substring(var4 + arg0.length());
            var4 = arg2.indexOf(arg0, arg3.length() + var4);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V", line = 65)
    public static void method2369(boolean arg0) {
        field5445 = null;
        field5454 = null;
        if (arg0) {
            field5448 = null;
            field5456 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)Z", line = 78)
    public static final boolean method2370(byte arg0) {
        field5451++;
        if (arg0 != -108) {
            field5454 = null;
        }
        return class237.field3532 > 0;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lwe;B)V", line = 99)
    public static final void method2371(class26 arg0, byte arg1) {
        if (arg1 > -33) {
            method2372(109, -54, 6, -91, 16);
        }
        field5446++;
        for (class138 var2 = (class138) class422.field6101.method2478(1603); var2 != null; var2 = (class138) class422.field6101.method2486((byte) -82)) {
            if (var2.field1881 == arg0) {
                if (var2.field1898 != null) {
                    class452.field6671.method278(var2.field1898);
                    var2.field1898 = null;
                }
                var2.method1820(-25246);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIII)V", line = 138)
    public static final void method2372(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5444++;
        int var5 = 0;
        if (arg0 != -99554687) {
            return;
        }
        int var6 = arg1;
        int var7 = -arg1;
        class381.method2419((byte) 90, arg2, arg3 - arg1, class323.field4774[arg4], arg3 + arg1);
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class323.field4774[arg4 + var6];
                int[] var10 = class323.field4774[arg4 - var6];
                int var11 = arg3 + var5;
                int var12 = arg3 - var5;
                class381.method2419((byte) 5, arg2, var12, var9, var11);
                class381.method2419((byte) 117, arg2, var12, var10, var11);
            }
            int var13 = arg3 + var6;
            int var14 = arg3 - var6;
            int[] var15 = class323.field4774[arg4 + var5];
            int[] var16 = class323.field4774[arg4 - var5];
            class381.method2419((byte) 8, arg2, var14, var15, var13);
            class381.method2419((byte) 67, arg2, var14, var16, var13);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 196)
    public static final void method2373(int arg0) {
        class363 var1 = class42.field555;
        synchronized (class42.field555) {
            class42.field555.method2313(126);
        }
        field5453++;
        class363 var2 = class83.field1019;
        synchronized (class83.field1019) {
            class83.field1019.method2313(117);
        }
        class363 var3 = class18.field293;
        synchronized (class18.field293) {
            int var4 = -33 / ((-arg0 - 66) / 45);
            class18.field293.method2313(116);
        }
        class363 var5 = class329.field4898;
        synchronized (class329.field4898) {
            class329.field4898.method2313(94);
        }
    }
}
