import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class187 {

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "Lhd;")
    public static class117 field3108 = new class117(30);

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "Lhf;")
    public static class195 field3111 = new class195(64);

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
    public static int field3116 = -2;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "[J")
    public static long[] field3119 = new long[32];

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "Lok;")
    public static class146 field3117 = class235.method1724(-12908, "http:)4)4");

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "S")
    public static short field3121 = 1;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "Lok;")
    private static class146 field3120 = class235.method1724(-12908, "Cancel");

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "Lok;")
    public static class146 field3118 = field3120;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "Lwi;")
    public static class256 field3110;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "Lih;")
    public static class30 field3109;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V", line = 7)
    public static final void method1457(int arg0) {
        field3112++;
        if (class144.field2390 == 0) {
            return;
        }
        if (arg0 != 16650) {
            field3109 = (class30) null;
        }
        try {
            if ((++class70.field1154) > 2000) {
                if (class98.field1582 != null) {
                    class98.field1582.method284((byte) -82);
                    class98.field1582 = null;
                }
                if (class60.field1030 >= 1) {
                    field3116 = -5;
                    class144.field2390 = 0;
                    return;
                }
                class60.field1030++;
                class144.field2390 = 1;
                if (class71.field1158 == class128.field2067) {
                    class71.field1158 = class267.field4599;
                } else {
                    class71.field1158 = class128.field2067;
                }
                class70.field1154 = 0;
            }
            if (class144.field2390 == 1) {
                class78.field1248 = class232.field3876.method931(class17.field343, (byte) 43, class71.field1158);
                class144.field2390 = 2;
            }
            if (class144.field2390 == 2) {
                if (class78.field1248.field4265 == 2) {
                    throw new IOException();
                }
                if (class78.field1248.field4265 != 1) {
                    return;
                }
                class98.field1582 = new class40((Socket) class78.field1248.field4269, class232.field3876);
                class78.field1248 = null;
                class98.field1582.method279(25, 0, class47.field820.field857, class47.field820.field860);
                if (class142.field2369 != null) {
                    class142.field2369.method1483(true);
                }
                if (class138.field2303 != null) {
                    class138.field2303.method1483(true);
                }
                int var1 = class98.field1582.method280((byte) -36);
                if (class142.field2369 != null) {
                    class142.field2369.method1483(true);
                }
                if (class138.field2303 != null) {
                    class138.field2303.method1483(true);
                }
                if (var1 != 21) {
                    field3116 = var1;
                    class144.field2390 = 0;
                    class98.field1582.method284((byte) -58);
                    class98.field1582 = null;
                    return;
                }
                class144.field2390 = 3;
            }
            if (class144.field2390 == 3) {
                if (class98.field1582.method288(0) < 1) {
                    return;
                }
                class199.field3328 = new class146[class98.field1582.method280((byte) -36)];
                class144.field2390 = 4;
            }
            if (class144.field2390 == 4) {
                if (class98.field1582.method288(0) < (class199.field3328.length * 8)) {
                    return;
                }
                client.field4080.field857 = 0;
                class98.field1582.method277(client.field4080.field860, 66, class199.field3328.length * 8, 0);
                for (int var2 = 0; var2 < class199.field3328.length; var2++) {
                    class199.field3328[var2] = class267.method1938(arg0 - 16612, client.field4080.method329((byte) -118));
                }
                field3116 = 21;
                class144.field2390 = 0;
                class98.field1582.method284((byte) 89);
                class98.field1582 = null;
                return;
            }
        } catch (IOException var4) {
            if (class98.field1582 != null) {
                class98.field1582.method284((byte) 116);
                class98.field1582 = null;
            }
            if (class60.field1030 < 1) {
                class144.field2390 = 1;
                class70.field1154 = 0;
                if (class71.field1158 == class128.field2067) {
                    class71.field1158 = class267.field4599;
                } else {
                    class71.field1158 = class128.field2067;
                }
                class60.field1030++;
            } else {
                class144.field2390 = 0;
                field3116 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIII)I", line = 168)
    public static final int method1458(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -193) {
            field3120 = (class146) null;
        }
        if (arg3 > 243) {
            arg1 >>= 0x4;
        } else if (arg3 > 217) {
            arg1 >>= 0x3;
        } else if (arg3 > 192) {
            arg1 >>= 0x2;
        } else if (arg3 > 179) {
            arg1 >>= 0x1;
        }
        field3115++;
        return (arg0 >> 2 << 10) - (-(arg1 >> 5 << 7) - (arg3 >> 1));
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V", line = 200)
    public static final void method1459(int arg0) {
        field3107++;
        class195.method1505();
        if (arg0 != 2629) {
            field3120 = (class146) null;
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class251.field4202[var1].method1062(false);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V", line = 223)
    public static final void method1460(int arg0) {
        class194.field3235.method801(arg0);
        class168.field2845.method1196((byte) 82);
        class230.field3847.method1196((byte) 82);
        field3114++;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V", line = 241)
    public static void method1461(byte arg0) {
        field3111 = null;
        field3110 = null;
        field3109 = null;
        field3117 = null;
        field3108 = null;
        if (arg0 == -108) {
            field3119 = null;
            field3118 = null;
            field3120 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILok;)Lci;", line = 259)
    public static final class194 method1462(int arg0, class146 arg1) {
        field3113++;
        class194 var2 = (class194) class32.field601.method1251(105);
        if (arg0 != 15087) {
            return (class194) null;
        }
        while (var2 != null) {
            if (var2.field3236.method1100((byte) -43, arg1)) {
                return var2;
            }
            var2 = (class194) class32.field601.method1253(73);
        }
        return null;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Loh;B)V", line = 282)
    public static final void method1463(class15 arg0, byte arg1) {
        class124.field2042 = class322.method2238(class83.field1319, -90, arg0, 0);
        class175.field2926 = new class315[class124.field2042.length];
        if (arg1 <= 112) {
            method1460(110);
        }
        class190.field3149 = new class315[class124.field2042.length];
        class25.field448 = new class315[class124.field2042.length];
        for (int var2 = 0; var2 < class124.field2042.length; var2++) {
            class124.field2042[var2].method2201();
            class175.field2926[var2] = class124.field2042[var2].method2202();
            class124.field2042[var2].method2201();
            class190.field3149[var2] = class124.field2042[var2].method2202();
            class124.field2042[var2].method2201();
            class25.field448[var2] = class124.field2042[var2].method2202();
            class124.field2042[var2].method2201();
        }
        class66.field1121 = class319.method2223(class99.field1608, arg0, 118, 0);
        class124.field2027 = class296.method2105(4961, arg0, 0, class76.field1231);
        class75.field1216 = class296.method2105(4961, arg0, 0, class249.field4176);
        class227.field3786 = class296.method2105(4961, arg0, 0, class62.field1059);
        class35.field657 = class296.method2105(4961, arg0, 0, class168.field2839);
        class126.field2056 = class296.method2105(4961, arg0, 0, class134.field2245);
        field3106++;
        class46.field794 = class296.method2105(4961, arg0, 0, class1.field3);
        class179.field3012 = class20.method143(arg0, class239.field3984, 29944, 0);
        class21.field406 = class311.method2185(0, class222.field3697, arg0, 0);
        class39.field691 = class311.method2185(0, class211.field3499, arg0, 0);
        class99.field1604 = class74.method544((byte) 107, 0, arg0, class91.field1447);
        class102.field1651 = class74.method544((byte) 119, 0, arg0, class160.field2700);
        class274.field4725.method219(class102.field1651, (int[]) null);
        field3109.method219(class102.field1651, (int[]) null);
        class39.field695.method219(class102.field1651, (int[]) null);
        if (class271.field4640) {
            class48.field892 = class322.method2238(class311.field5303, -82, arg0, 0);
            for (int var3 = 0; var3 < class48.field892.length; var3++) {
                class48.field892[var3].method2207();
            }
        }
        class307 var4 = class161.method1265((byte) 106, class140.field2335, arg0, 0);
        var4.method2164();
        if (class271.field4640) {
            class91.field1439 = new class8(var4);
        } else {
            class91.field1439 = var4;
        }
        class307[] var5 = class319.method2223(class189.field3135, arg0, 77, 0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6].method2164();
        }
        if (class271.field4640) {
            class195.field3250 = new class70[var5.length];
            for (int var7 = 0; var7 < var5.length; var7++) {
                class195.field3250[var7] = new class8(var5[var7]);
            }
        } else {
            class195.field3250 = var5;
        }
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 41.0D) - 20;
        int var11 = (int) (Math.random() * 21.0D) - 10;
        for (int var12 = 0; var12 < class66.field1121.length; var12++) {
            class66.field1121[var12].method2160(var8 + var10, var9 + var10, var10 + var11);
        }
        class124.field2042[0].method2199(var8 + var10, var9 - -var10, var11 + var10);
        if (class271.field4640) {
            class268.field4613 = new class70[class66.field1121.length];
            for (int var13 = 0; var13 < class66.field1121.length; var13++) {
                class268.field4613[var13] = new class8(class66.field1121[var13]);
            }
        } else {
            class268.field4613 = class66.field1121;
        }
    }
}
