import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class370 extends class443 {

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
    public int field5467 = 0;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "Ljava/lang/String;")
    public static String field5464 = "red:";

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
    public static int field5465 = -1;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "Luc;")
    public static class51 field5462 = new class51(5);

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!lm", name = "E", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!lm", name = "F", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!lm", name = "G", descriptor = "I")
    public static int field5473;

    @OriginalMember(owner = "client!lm", name = "H", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "[Lda;")
    public static class193[] field5469;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILfb;)V", line = 4)
    private final void method2432(int arg0, int arg1, class341 arg2) {
        if (arg0 == 2) {
            this.field5467 = arg2.method2239(-1076227960);
        }
        field5473++;
        int var4 = -116 % ((arg1 - 10) / 49);
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)V", line = 21)
    public static void method2433(int arg0) {
        field5462 = null;
        field5469 = null;
        if (arg0 != -1) {
            method2437(100, -120, (class162) null);
        }
        field5464 = null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIIZ)V", line = 42)
    public static final void method2434(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field5470++;
        boolean var10000 = !arg5;
        int var9 = arg4 + 1;
        class351.method2317(var10000, arg2, class444.field6416[arg4], arg0, arg1);
        boolean var10 = !arg5;
        int var8 = arg3 - 1;
        class351.method2317(var10, arg2, class444.field6416[arg3], arg0, arg1);
        if (arg5) {
            for (int var6 = var9; var6 <= var8; var6++) {
                int[] var7 = class444.field6416[var6];
                var7[arg0] = var7[arg2] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(Z)Z", line = 70)
    public static final boolean method2435(boolean arg0) {
        field5466++;
        try {
            if (!arg0) {
                return true;
            }
            if (class217.field3024 == 2) {
                if (class431.field6270 == null) {
                    class431.field6270 = class49.method349(class264.field3890, class144.field1824, class305.field4566);
                    if (class431.field6270 == null) {
                        return false;
                    }
                }
                if (class452.field6556 == null) {
                    class452.field6556 = new class386(class45.field691, class391.field5716);
                }
                if (class78.field1095.method186(22050, class452.field6556, class431.field6270, 73, class93.field1269)) {
                    class78.field1095.method159((byte) -49);
                    class78.field1095.method147(-20849, class444.field6414);
                    class78.field1095.method174(class431.field6270, (byte) 105, class195.field2697);
                    class264.field3890 = null;
                    class452.field6556 = null;
                    class431.field6270 = null;
                    class217.field3024 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class78.field1095.method177((byte) -85);
            class217.field3024 = 0;
            class452.field6556 = null;
            class264.field3890 = null;
            class431.field6270 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILfb;)V", line = 128)
    public final void method2436(int arg0, class341 arg1) {
        if (arg0 != -1) {
            return;
        }
        field5472++;
        while (true) {
            int var3 = arg1.method2233((byte) 104);
            if (var3 == 0) {
                return;
            }
            this.method2432(var3, -87, arg1);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILps;)V", line = 153)
    public static final void method2437(int arg0, int arg1, class162 arg2) {
        field5468++;
        int var3 = arg1;
        int var4 = 0;
        if (class231.field3179 < arg2.field2172) {
            class104.method787(arg2, 0);
        } else if (class231.field3179 <= arg2.field2115) {
            class149.method1028(128, arg2);
        } else {
            class422.method2658(arg2, (byte) -121, false);
            var3 = class247.field3475;
            var4 = class252.field3691;
        }
        if (arg2.field5921 < 128 || arg2.field5930 < 128 || arg2.field5921 >= ((class351.field5217 - 1) * 128) || class143.field1815 * 128 - 128 <= arg2.field5930) {
            arg2.field2115 = 0;
            arg2.field2148 = -1;
            arg2.field2142 = -1;
            arg2.field2172 = 0;
            arg2.field5921 = arg2.field2190[0] * 128 + (arg2.method1091((byte) -86) * 64);
            arg2.field5930 = arg2.field2189[0] * 128 + arg2.method1091((byte) 16) * 64;
            arg2.method1094(false);
        }
        if (class383.field5609 == arg2 && (arg2.field5921 < 1536 || arg2.field5930 < 1536 || (class351.field5217 - 12) * 128 <= arg2.field5921 || arg2.field5930 >= ((class143.field1815 - 12) * 128))) {
            arg2.field2115 = 0;
            arg2.field2172 = 0;
            arg2.field2148 = -1;
            arg2.field2142 = -1;
            arg2.field5921 = arg2.field2190[0] * 128 + (arg2.method1091((byte) -94) * 64);
            arg2.field5930 = arg2.field2189[0] * 128 + arg2.method1091((byte) -96) * 64;
            arg2.method1094(false);
        }
        int var5 = class39.method291(arg2, arg1 ^ 0x551F);
        class357.method2349(var4, arg1 ^ 0xFFFFFFE9, var3, var5, arg2);
        class140.method978(-1, arg2);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B[Ljava/lang/String;)[Ljava/lang/String;", line = 210)
    public static final String[] method2438(byte arg0, String[] arg1) {
        field5461++;
        String[] var2 = new String[5];
        if (arg0 != 124) {
            return null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZI)I", line = 237)
    public static final int method2439(boolean arg0, int arg1) {
        field5471++;
        long var2 = class98.method768((byte) 117);
        for (class283 var4 = arg0 ? (class283) class377.field5517.method2812(15710) : (class283) class377.field5517.method2819((byte) 103); var4 != null; var4 = (class283) class377.field5517.method2819((byte) 98)) {
            if ((var4.field4288 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field4288 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field6091;
                    class100.field1325[var5] = class385.field5632[var5];
                    var4.method2632(true);
                    return var5;
                }
                var4.method2632(true);
            }
        }
        if (arg1 != 26729) {
            field5464 = null;
        }
        return -1;
    }
}
