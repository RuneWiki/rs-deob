import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class182 {

    @OriginalMember(owner = "client!q", name = "e", descriptor = "J")
    public long field3106 = 0L;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "Lhi;")
    public static class82 field3113 = class95.method664((byte) -87, "(R");

    @OriginalMember(owner = "client!q", name = "n", descriptor = "Z")
    public static boolean field3115 = false;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "Z")
    public static boolean field3114 = false;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "Z")
    public static boolean field3112 = false;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "F")
    public static float field3110;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public int field3102;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public int field3105;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public int field3109;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public int field3111;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    public int field3116;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "I")
    public int field3118;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public int field3119;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Lrm;")
    public class175 field3103;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "Lrm;")
    public class175 field3107;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "Lum;")
    public static class222 field3117;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BZ)V", line = 20)
    public static final void method1266(byte arg0, boolean arg1) {
        field3104++;
        byte var2;
        byte[][] var3;
        if (class147.field2485 && arg1) {
            var2 = 1;
            var3 = class123.field2147;
        } else {
            var3 = class36.field590;
            var2 = 4;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class283.method1968(32);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class89.field1600[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3610488) >> 24;
                        if (!arg1 || var8 == 0) {
                            int var9 = (var7 & 0x7) >> 1;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class93.field1664.length; var13++) {
                                if (class93.field1664[var13] == var12 && var3[var13] != null) {
                                    class232.method1643((var11 & 0x7) * 8, class180.field3071, var8, arg1, var3[var13], var6 * 8, (var10 & 0x7) * 8, arg0 + 40888, var5 * 8, var4, var9);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 72) {
            field3112 = true;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V", line = 106)
    public static final void method1267(byte arg0) {
        class81.method513((byte) 63);
        field3108++;
        class232.method1648(105);
        class275.method1920(false);
        class275.method1915((byte) -16);
        if (arg0 < 126) {
            return;
        }
        class124.method845(-126);
        class160.method1166(8);
        class189.method1299(-1);
        class9.method57(2171);
        class227.method1623(true);
        class273.method1906((byte) -71);
        class296.method2053((byte) -56);
        class181.method1263(10206);
        class44.method326(0);
        class242.method1742(255);
        class150.field2553.method2168(0);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V", line = 160)
    public static void method1268(int arg0) {
        field3117 = null;
        if (arg0 != 8) {
            method1266((byte) 111, false);
        }
        field3113 = null;
    }
}
