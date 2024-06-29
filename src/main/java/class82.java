import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class82 {

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "Lmc;")
    public static class75 field2030 = class30.method234(true, "compass");

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "Lkc;")
    public static class63 field2039 = new class63(64);

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "Lmc;")
    private static class75 field2040 = class30.method234(true, "World");

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "Lmc;")
    public static class75 field2045 = class30.method234(true, "Menge eingeben:");

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "Z")
    public static boolean field2043 = false;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "Lmc;")
    public static class75 field2049 = field2040;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "Lmc;")
    public static class75 field2048 = class30.method234(true, "Geben Sie Ihren Benutzernamen");

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "Lmc;")
    public static class75 field2044 = class30.method234(true, "m");

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "Lmc;")
    public static class75 field2051 = class30.method234(true, "*6n");

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "Lmc;")
    public static class75 field2052 = class30.method234(true, "Schlie-8en");

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public static int field2046 = 0;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "Lmc;")
    private static class75 field2047 = class30.method234(true, "Use");

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "Lmc;")
    public static class75 field2041 = field2047;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "Lka;")
    public static class61 field2042;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "Lnc;")
    public static class81 field2031;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZI)V", line = 12)
    public static final void method689(boolean arg0, int arg1) {
        class127.field3110++;
        field2033++;
        if (class127.field3110 < 50 && !arg0) {
            return;
        }
        class127.field3110 = arg1;
        if (class34.field778 || class70.field1795 == null) {
            return;
        }
        class118.field2923.method707(arg1 ^ 0xFFFFFF92, 195);
        class85.field2101++;
        try {
            class70.field1795.method761(class118.field2923.field1556, 0, class118.field2923.field1577, 0);
            class118.field2923.field1556 = 0;
        } catch (IOException var2) {
            class34.field778 = true;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lqc;II)I", line = 50)
    public static final int method690(class99 arg0, int arg1, int arg2) {
        field2034++;
        if (arg0.field2537 == null || arg2 >= arg0.field2537.length) {
            return -2;
        }
        if (arg1 != 13) {
            field2030 = null;
        }
        try {
            int[] var3 = arg0.field2537[arg2];
            int var4 = 0;
            byte var5 = 0;
            int var6 = 0;
            while (true) {
                int var7 = var3[var4++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var6;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 1) {
                    var8 = class90.field2211[var3[var4++]];
                }
                if (var7 == 2) {
                    var8 = class130.field3160[var3[var4++]];
                }
                if (var7 == 3) {
                    var8 = class78.field1974[var3[var4++]];
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class99 var12 = class40.method305(65535, var11);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class43.method326(var13, arg1 - 13).field196 || class109.field2755)) {
                        for (int var14 = 0; var14 < var12.field2520.length; var14++) {
                            if (var13 + 1 == var12.field2520[var14]) {
                                var8 += var12.field2509[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class62.field1613[var3[var4++]];
                }
                if (var7 == 6) {
                    var8 = class63.field1666[class130.field3160[var3[var4++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class62.field1613[var3[var4++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class52.field1315.field2980;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class21.field417[var15]) {
                            var8 += class130.field3160[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class99 var18 = class40.method305(65535, var17);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class43.method326(var19, 0).field196 || class109.field2755)) {
                        for (int var20 = 0; var20 < var18.field2520.length; var20++) {
                            if (var19 + 1 == var18.field2520[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class62.field1636;
                }
                if (var7 == 12) {
                    var8 = class58.field1448;
                }
                if (var7 == 13) {
                    int var21 = class62.field1613[var3[var4++]];
                    int var22 = var3[var4++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var4++];
                    var8 = class63.method550(var23, false);
                }
                if (var7 == 18) {
                    var8 = (class52.field1315.field1233 >> 7) + class62.field1618;
                }
                if (var7 == 19) {
                    var8 = (class52.field1315.field1242 >> 7) + class55.field1367;
                }
                if (var7 == 20) {
                    var8 = var3[var4++];
                }
                if (var9 == 0) {
                    if (var5 == 0) {
                        var6 += var8;
                    }
                    if (var5 == 1) {
                        var6 -= var8;
                    }
                    if (var5 == 2 && var8 != 0) {
                        var6 /= var8;
                    }
                    if (var5 == 3) {
                        var6 *= var8;
                    }
                    var5 = 0;
                } else {
                    var5 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 253)
    public static final void method691(int arg0) {
        field2037++;
        class41.method316(15858);
        class44.method339(30392);
        class17.method119(118);
        class17.method116(false);
        if (arg0 > -94) {
            return;
        }
        class40.method307((byte) 103);
        class40.method308(24057);
        class17.method117(-31);
        class59.method481(126);
        class122.method956((byte) -116);
        class23.method164(-1);
        class7.method30((byte) 101);
        class92.method764(false);
        ((class16) class49.field1192).method110(-1);
        class71.field1799.method449(-98);
        class31.field693.method449(-71);
        class112.field2838.method449(-31);
        class10.field223.method449(-22);
        class40.field967.method449(-86);
        class10.field224.method449(-18);
        class45.field1101.method449(-93);
        class12.field248.method449(-88);
        class57.field1440.method449(-47);
        class32.field712.method449(-21);
        class100.field2587.method449(-87);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V", line = 298)
    public static void method692(int arg0) {
        field2031 = null;
        if (arg0 != -17328) {
            method693(98, 80, null, 25);
        }
        field2049 = null;
        field2051 = null;
        field2044 = null;
        field2042 = null;
        field2040 = null;
        field2047 = null;
        field2030 = null;
        field2041 = null;
        field2052 = null;
        field2045 = null;
        field2039 = null;
        field2048 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILja;I)Z", line = 326)
    public static final boolean method693(int arg0, int arg1, class55 arg2, int arg3) {
        if (arg0 != 2151) {
            method693(-56, 8, null, -31);
        }
        field2035++;
        byte[] var4 = arg2.method436(arg3, 5, arg1);
        if (var4 == null) {
            return false;
        } else {
            class30.method237(var4, arg0 ^ 0x811);
            return true;
        }
    }
}
