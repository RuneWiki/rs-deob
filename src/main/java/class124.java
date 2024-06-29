import java.io.UnsupportedEncodingException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class124 extends class202 {

    @OriginalMember(owner = "client!eh", name = "Q", descriptor = "Lue;")
    public class76 field2247;

    @OriginalMember(owner = "client!eh", name = "N", descriptor = "Lsb;")
    public static class98 field2244 = class47.method368(")4g", 0);

    @OriginalMember(owner = "client!eh", name = "T", descriptor = "I")
    public static int field2250 = 0;

    @OriginalMember(owner = "client!eh", name = "R", descriptor = "Llb;")
    public static class190 field2248 = new class190(64);

    @OriginalMember(owner = "client!eh", name = "V", descriptor = "I")
    public static int field2252 = 1;

    @OriginalMember(owner = "client!eh", name = "W", descriptor = "Lsb;")
    private static class98 field2253 = class47.method368("showVideoAd", 0);

    @OriginalMember(owner = "client!eh", name = "O", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!eh", name = "S", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!eh", name = "U", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lq;Lsb;I)Lsb;")
    public static final class98 method923(class148 arg0, class98 arg1, int arg2) {
        int var3 = 95 % ((arg2 - 43) / 62);
        field2245++;
        if (arg1.method710(-111, class136.field2406) == -1) {
            return arg1;
        }
        while (true) {
            int var4 = arg1.method710(-59, class217.field3734);
            if (var4 == -1) {
                while (true) {
                    int var5 = arg1.method710(-109, class181.field3126);
                    if (var5 == -1) {
                        while (true) {
                            int var6 = arg1.method710(-114, class202.field3442);
                            if (var6 == -1) {
                                while (true) {
                                    int var7 = arg1.method710(-85, class82.field1451);
                                    if (var7 == -1) {
                                        while (true) {
                                            int var8 = arg1.method710(-78, class217.field3737);
                                            if (var8 == -1) {
                                                while (true) {
                                                    int var9 = arg1.method710(-110, class238.field4103);
                                                    if (var9 == -1) {
                                                        return arg1;
                                                    }
                                                    class98 var10 = class233.field4011;
                                                    if (class146.field2562 != null) {
                                                        var10 = class146.method1078(class146.field2562.field446, 43);
                                                        try {
                                                            if (class146.field2562.field447 != null) {
                                                                byte[] var11 = ((String) class146.field2562.field447).getBytes("ISO-8859-1");
                                                                var10 = class186.method1285(0, var11, var11.length, 0);
                                                            }
                                                        } catch (UnsupportedEncodingException var12) {
                                                        }
                                                    }
                                                    arg1 = class186.method1288(new class98[] { arg1.method742(-90, 0, var9), var10, arg1.method740(var9 + 4, true) }, 31618);
                                                }
                                            }
                                            arg1 = class186.method1288(new class98[] { arg1.method742(90, 0, var8), class155.method1125(class206.method1392(4, arg0, 31546), -109), arg1.method740(var8 + 2, true) }, 31618);
                                        }
                                    }
                                    arg1 = class186.method1288(new class98[] { arg1.method742(-90, 0, var7), class155.method1125(class206.method1392(3, arg0, 31546), -54), arg1.method740(var7 + 2, true) }, 31618);
                                }
                            }
                            arg1 = class186.method1288(new class98[] { arg1.method742(-114, 0, var6), class155.method1125(class206.method1392(2, arg0, 31546), 9), arg1.method740(var6 + 2, true) }, 31618);
                        }
                    }
                    arg1 = class186.method1288(new class98[] { arg1.method742(-119, 0, var5), class155.method1125(class206.method1392(1, arg0, 31546), 7), arg1.method740(var5 + 2, true) }, 31618);
                }
            }
            arg1 = class186.method1288(new class98[] { arg1.method742(-73, 0, var4), class155.method1125(class206.method1392(0, arg0, 31546), 126), arg1.method740(var4 + 2, true) }, 31618);
        }
    }

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "(B)V")
    public static void method924(byte arg0) {
        field2248 = null;
        field2244 = null;
        if (arg0 == 30) {
            field2253 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLtg;)I")
    public static final int method925(byte arg0, class75 arg1) {
        field2251++;
        int var2 = 0;
        if (arg1.method575(class246.field4333, 0)) {
            var2++;
        }
        if (arg1.method575(class41.field682, 0)) {
            var2++;
        }
        if (arg1.method575(class43.field705, 0)) {
            var2++;
        }
        if (arg1.method575(class229.field3944, arg0 + 27)) {
            var2++;
        }
        if (arg1.method575(class28.field524, arg0 + 27)) {
            var2++;
        }
        if (arg1.method575(class43.field730, 0)) {
            var2++;
        }
        if (arg1.method575(class134.field2364, arg0 ^ 0xFFFFFFE5)) {
            var2++;
        }
        if (arg1.method575(class28.field515, 0)) {
            var2++;
        }
        if (arg1.method575(class121.field2224, arg0 ^ 0xFFFFFFE5)) {
            var2++;
        }
        if (arg1.method575(class113.field2017, 0)) {
            var2++;
        }
        if (arg1.method575(class75.field1326, 0)) {
            var2++;
        }
        if (arg1.method575(class161.field2914, arg0 ^ 0xFFFFFFE5)) {
            var2++;
        }
        if (arg1.method575(class169.field2990, 0)) {
            var2++;
        }
        var2++;
        if (arg0 != -27) {
            field2253 = null;
        }
        if (arg1.method575(class86.field1513, 0)) {
            var2++;
        }
        if (arg1.method575(class180.field3100, 0)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILjava/util/Random;)I")
    public static final int method926(int arg0, int arg1, Random arg2) {
        field2246++;
        int var3 = 3 / ((24 - arg0) / 32);
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class144.method1069(arg1, (byte) -25)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else {
            int var4 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
            int var5;
            do {
                var5 = arg2.nextInt();
            } while (var5 >= var4);
            return class36.method301(arg1, 0, var5);
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lue;)V")
    public class124(class76 arg0) {
        this.field2247 = arg0;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)Z")
    public static final boolean method927(int arg0) {
        field2249++;
        if (field2252 != arg0) {
            try {
                field2253.method707(59, class119.field2145.field76);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }
}
