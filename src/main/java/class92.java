import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class92 {

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "[I")
    public static int[] field2193 = new int[2000];

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "Lr;")
    public static class118 field2195 = class153.method1136(90, "<col=00ff00>");

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "J")
    public static long field2200 = 0L;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "Lr;")
    private static class118 field2212 = class153.method1136(89, "Too many connections from your address)3");

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Lr;")
    public static class118 field2192 = field2212;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "Z")
    public static boolean field2197 = false;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "Lr;")
    private static class118 field2205 = class153.method1136(86, "Connection timed out)3");

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "Lr;")
    public static class118 field2208 = field2205;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "Lge;")
    public static class47 field2204 = new class47(64);

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    public static int field2216 = 0;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    public static int field2218 = 2;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "Z")
    public static boolean field2217 = false;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public int field2196;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public int field2198;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public int field2199;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public int field2201;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public int field2202;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public int field2206;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    public int field2211;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "Lff;")
    public static class42 field2219;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "Ljf;")
    public static class68 field2220;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "[B")
    public byte[] field2190;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "[B")
    public byte[] field2191;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBI)V")
    public static final void method733(int arg0, byte arg1, int arg2) {
        if (arg1 != -87) {
            method738(114);
        }
        field2207++;
        long var3 = (long) ((arg2 << 16) + arg0);
        class31 var5 = (class31) class25.field614.method297(var3, -1);
        if (var5 != null) {
            class74.field1799.method1235(var5, true);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)Z")
    public static final boolean method734(int arg0, byte arg1) {
        field2203++;
        if (arg0 < 0) {
            return false;
        } else if (arg1 > -116) {
            return false;
        } else {
            int var2 = class42.field1015[arg0];
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            return var2 == 1004;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILvd;III)V")
    public static final void method735(int arg0, int arg1, class150 arg2, int arg3, int arg4, int arg5) {
        field2213++;
        if (arg2 == null) {
            return;
        }
        int var6 = class153.field3460 + class103.field2375 & 0x7FF;
        int var7 = arg0 * arg0 + arg1 * arg1;
        if (var7 > 6400) {
            return;
        }
        int var8 = class58.field1354[var6];
        int var9 = arg3 * var8 / (class153.field3452 + 256);
        int var10 = class58.field1346[var6];
        int var11 = var10 * 256 / (class153.field3452 + 256);
        int var12 = arg0 * var11 + arg1 * var9 >> 16;
        int var13 = arg1 * var11 - arg0 * var9 >> 16;
        if (var7 <= 2500) {
            arg2.method1109(arg4 + var12 + 94 + 4 - arg2.field3368 / 2, -var13 - arg2.field3369 / 2 + arg5 + 83 + -4);
        } else {
            arg2.method1104(class87.field2112, arg4 + var12 + 98 - arg2.field3368 / 2, arg5 - (-83 - -(arg2.field3369 / 2)) - 4 + -var13);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Z")
    public static final boolean method736(int arg0, int arg1) {
        if (arg1 != 0) {
            method735(-109, 113, null, 27, 70, 63);
        }
        field2194++;
        return (arg0 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILff;)Ln;")
    public static final class90 method737(int arg0, int arg1, class42 arg2) {
        field2209++;
        if (class78.method663(arg0, arg2, 256)) {
            if (arg1 != 0) {
                field2195 = null;
            }
            return class106.method850(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method738(int arg0) {
        field2220 = null;
        field2204 = null;
        field2205 = null;
        field2212 = null;
        if (arg0 != 0) {
            field2216 = 73;
        }
        field2193 = null;
        field2208 = null;
        field2219 = null;
        field2195 = null;
        field2192 = null;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)V")
    public static final void method739(int arg0, int arg1) {
        field2214++;
        if (arg0 == arg1 || !class115.field2680[arg0]) {
            return;
        }
        class121.field2805.method340((byte) 2, arg0);
        if (class63.field1446[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class63.field1446[arg0].length; var3++) {
            if (class63.field1446[arg0][var3] != null) {
                if (class63.field1446[arg0][var3].field1807 == 2) {
                    var2 = false;
                } else {
                    class63.field1446[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class63.field1446[arg0] = null;
        }
        class115.field2680[arg0] = false;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljc;ZLjf;I)V")
    public static final void method740(class65 arg0, boolean arg1, class68 arg2, int arg3) {
        byte[] var4 = null;
        field2210++;
        class113 var5 = class62.field1432;
        synchronized (class62.field1432) {
            if (arg1) {
                method739(-124, 80);
            }
            for (class34 var6 = (class34) class62.field1432.method889(127); var6 != null; var6 = (class34) class62.field1432.method884(true)) {
                if ((long) arg3 == var6.field2295 && var6.field865 == arg0 && var6.field862 == 0) {
                    var4 = var6.field845;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var7 = arg0.method564(arg3, 6944);
            arg2.method582(arg0, var7, arg3, true, (byte) -101);
        } else {
            arg2.method582(arg0, var4, arg3, true, (byte) -109);
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
    public static final void method741(int arg0) {
        class33.field828 = -1;
        class11.field254 = 0;
        class2.field51 = 0;
        class110.field2561 = 0;
        class39.field950 = 0;
        class99.field2296 = 0;
        class80.field1947 = -1;
        class1.field22.field2404 = 0;
        class99.field2298 = -1;
        class88.field2140 = 0;
        class138.field3144 = false;
        class149.field3361 = arg0;
        class53.field1253.field2404 = 0;
        field2215++;
        for (int var1 = 0; var1 < class108.field2526.length; var1++) {
            if (class108.field2526[var1] != null) {
                class108.field2526[var1].field731 = -1;
            }
        }
        for (int var2 = 0; var2 < class74.field1833.length; var2++) {
            if (class74.field1833[var2] != null) {
                class74.field1833[var2].field731 = -1;
            }
        }
        class46.method385(false);
        class39.method326(arg0 + 22078, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class54.field1274[var3] = true;
        }
    }
}
