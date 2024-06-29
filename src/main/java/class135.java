import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class135 {

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field2327 = 2;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "[S")
    public static short[] field2333 = new short[500];

    @OriginalMember(owner = "client!db", name = "k", descriptor = "Lhi;")
    public static class82 field2337 = class95.method664((byte) -28, ":chalreq:");

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static volatile int field2332 = 0;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static volatile int field2335 = 0;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "Ldf;")
    public static class169 field2329;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "Lum;")
    public static class222 field2334;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2339;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)I", line = 26)
    public static final int method922(int arg0, int arg1) {
        field2328++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        if (arg0 != 21793) {
            method926((byte) 127);
        }
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 46)
    public static final void method923(byte arg0) {
        for (class241 var1 = (class241) class164.field2871.method1936(16173); var1 != null; var1 = (class241) class164.field2871.method1926((byte) 90)) {
            if (var1.field4170) {
                var1.method1732((byte) 87);
            }
        }
        class241 var2 = (class241) class131.field2276.method1936(16173);
        if (arg0 >= -14) {
            field2337 = (class82) null;
        }
        while (var2 != null) {
            if (var2.field4170) {
                var2.method1732((byte) 105);
            }
            var2 = (class241) class131.field2276.method1926((byte) 90);
        }
        field2338++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 80)
    public static final void method924(int arg0) {
        int var1 = class33.field495;
        int var2 = class28.field367;
        field2336++;
        int var3 = class88.field1563;
        int var4 = 6116423;
        int var5 = class164.field2874;
        if (class147.field2485) {
            class116.method784(var1, var2, var3, var5, var4);
            class116.method784(var1 + 1, var2 + 1, var3 - 2, 16, 0);
            class116.method786(var1 + 1, var2 - -18, var3 - 2, var5 + -19, 0);
        } else {
            class320.method2217(var1, var2, var3, var5, var4);
            class320.method2217(var1 + 1, var2 + 1, var3 - 2, 16, 0);
            class320.method2207(var1 + 1, var2 + 18, var3 - 2, var5 + -19, 0);
        }
        class253.field4354.method112(class287.field4831, var1 + 3, var2 + 14, var4, -1);
        int var6 = class211.field3702;
        int var7 = class202.field3471;
        if (arg0 != -25101) {
            method922(60, 27);
        }
        for (int var8 = 0; var8 < class309.field5262; var8++) {
            int var9 = ((class309.field5262 - var8 - 1) * 15) + var2 + 31;
            int var10 = 16777215;
            if (var1 < var6 && var1 + var3 > var6 && var7 > (var9 - 13) && (var9 + 3) > var7) {
                var10 = 16776960;
            }
            class253.field4354.method112(class207.method1484(var8, (byte) 30), var1 + 3, var9, var10, 0);
        }
        class69.method434(18643, class28.field367, class164.field2874, class33.field495, class88.field1563);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILme;)Z", line = 140)
    public static final boolean method925(int arg0, class75 arg1) {
        field2331++;
        if (arg1.field1221 == null) {
            return false;
        }
        int var2 = 0;
        if (arg0 < 35) {
            return true;
        }
        while (var2 < arg1.field1221.length) {
            int var3 = class98.method679(var2, arg1, -1);
            int var4 = arg1.field1141[var2];
            if (arg1.field1221[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field1221[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg1.field1221[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
            var2++;
        }
        return true;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V", line = 206)
    public static void method926(byte arg0) {
        field2333 = null;
        field2339 = null;
        field2329 = null;
        field2337 = null;
        field2334 = null;
        int var1 = -127 / ((arg0 - 33) / 50);
    }
}
