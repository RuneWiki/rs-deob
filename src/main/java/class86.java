import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class86 {

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "J")
    public static long field2053 = 0L;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "Lu;")
    private static class135 field2055 = class87.method676((byte) -47, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field2045 = 0;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Lu;")
    public static class135 field2052 = field2055;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Lu;")
    public static class135 field2054 = class87.method676((byte) -110, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "Lu;")
    public static class135 field2046 = class87.method676((byte) -101, "Verbindung mit");

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    public static int field2062 = 0;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "Lbc;")
    public static class11 field2058;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "[I")
    public static int[] field2061;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "[Lbc;")
    public static class11[] field2048;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public static void method668(byte arg0) {
        if (arg0 <= 68) {
            return;
        }
        field2058 = null;
        field2054 = null;
        field2055 = null;
        field2061 = null;
        field2046 = null;
        field2048 = null;
        field2052 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static final void method669(int arg0) {
        field2056++;
        class23.field581.method936(-1);
        int var1 = class23.field581.method934((byte) 109, 1);
        if (var1 == 0 || arg0 != 4917) {
            return;
        }
        int var2 = class23.field581.method934((byte) 106, 2);
        if (var2 == 0) {
            class97.field2358[class126.field3009++] = 2047;
        } else if (var2 == 1) {
            int var3 = class23.field581.method934((byte) 113, 3);
            class116.field2789.method47(var3, false, false);
            int var4 = class23.field581.method934((byte) 127, 1);
            if (var4 == 1) {
                class97.field2358[class126.field3009++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class23.field581.method934((byte) 112, 3);
            class116.field2789.method47(var5, false, true);
            int var6 = class23.field581.method934((byte) 123, 3);
            class116.field2789.method47(var6, false, true);
            int var7 = class23.field581.method934((byte) 104, 1);
            if (var7 == 1) {
                class97.field2358[class126.field3009++] = 2047;
            }
        } else if (var2 == 3) {
            class136.field3301 = class23.field581.method934((byte) 104, 2);
            int var8 = class23.field581.method934((byte) 121, 7);
            int var9 = class23.field581.method934((byte) 117, 1);
            if (var9 == 1) {
                class97.field2358[class126.field3009++] = 2047;
            }
            int var10 = class23.field581.method934((byte) 126, 1);
            int var11 = class23.field581.method934((byte) 121, 7);
            class116.field2789.method51(var10 == 1, arg0 ^ 0x131D, var8, var11);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
    public static final void method670(boolean arg0) {
        field2057++;
        class126.field3008.method966(-110);
        class51.method395();
        if (arg0) {
            method675(108);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)I")
    public static final int method671(int arg0, int arg1, int arg2) {
        field2051++;
        if (arg0 != -25735) {
            method671(91, -48, -34);
        }
        if (arg1 >= 2) {
            int var3 = method671(arg0, arg1 >> 1, arg2 * arg2);
            if ((arg1 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            return var3;
        } else if (arg1 == 1) {
            return arg2;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IJ)V")
    public static final void method672(int arg0, long arg1) {
        field2060++;
        if (arg1 == 0L) {
            return;
        }
        int var3 = -2 / (arg0 / 59);
        for (int var4 = 0; var4 < class79.field1885; var4++) {
            if (class8.field148[var4] == arg1) {
                class55.field1328++;
                class135.field3239 = true;
                class79.field1885--;
                for (int var5 = var4; var5 < class79.field1885; var5++) {
                    class23.field563[var5] = class23.field563[var5 + 1];
                    class94.field2281[var5] = class94.field2281[var5 + 1];
                    class8.field148[var5] = class8.field148[var5 + 1];
                    class28.field667[var5] = class28.field667[var5 + 1];
                }
                class53.field1257 = class126.field2998 + 1;
                class152.field3751.method929(134, -14044);
                class152.field3751.method461(11739, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIII)I")
    public static final int method673(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg0 != 1) {
            return 103;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        int var4 = (arg3 / 4 << 10) + (arg1 / 32 << 7) + arg2 / 2;
        field2047++;
        return var4;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z[BB)Ljava/lang/Object;")
    public static final Object method674(boolean arg0, byte[] arg1, byte arg2) {
        int var3 = 53 / ((arg2 + 64) / 39);
        field2059++;
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class90.field2120) {
            try {
                class1 var4 = (class1) Class.forName("qc").getDeclaredConstructor().newInstance();
                var4.method1(26278, arg1);
                return var4;
            } catch (Throwable var5) {
                class90.field2120 = true;
            }
        }
        return arg0 ? class136.method1103((byte) -121, arg1) : arg1;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
    public static final void method675(int arg0) {
        class65.method529((byte) 118);
        field2049++;
        class46.method354((byte) 62);
        class26.method216(0);
        class141.method1136(true);
        class62.method516(8);
        class115.method925(false);
        class101.method833(33);
        class117.method930(8);
        class34.method265((byte) 80);
        class148.method1210(-7);
        class119.method945(0);
        class126.method985(7187);
        ((class85) class51.field1209).method665(arg0 ^ arg0);
        class19.field437.method234(-22666);
        class37.field847.method336((byte) 11);
        class28.field681.method336((byte) 11);
        class109.field2647.method336((byte) 11);
        class98.field2374.method336((byte) 11);
        class141.field3473.method336((byte) 11);
        class41.field956.method336((byte) 11);
        class15.field352.method336((byte) 11);
        class58.field1435.method336((byte) 11);
        class122.field2917.method336((byte) 11);
        class65.field1601.method336((byte) 11);
        class68.field1670.method336((byte) 11);
        class62.field1557.method336((byte) 11);
    }
}
