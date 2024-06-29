import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class132 {

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "[I")
    public static int[] field1970 = new int[128];

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "Lok;")
    private static class41 field1973 = class137.method956("Please wait)3)3)3", 45);

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public static int field1971 = 0;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "[[I")
    public static int[][] field1976 = new int[104][104];

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "D")
    public static double field1979 = -1.0D;

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "Lok;")
    public static class41 field1978 = class137.method956("blinken1:", 45);

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "Lok;")
    public static class41 field1975 = field1973;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "Lok;")
    public static class41 field1980 = class137.method956(")1o", 45);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "[Lok;")
    public static class41[] field1974;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)V", line = 8)
    public static final void method924(int arg0, int arg1) {
        for (class55 var2 = (class55) class292.field4723.method609(109); var2 != null; var2 = (class55) class292.field4723.method616(123)) {
            if (((long) arg0) == (var2.field844 >> 48 & 0xFFFFL)) {
                var2.method418(6971);
            }
        }
        if (arg1 != -1929723600) {
            field1974 = (class41[]) null;
        }
        field1969++;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Llb;Z)Llm;", line = 31)
    public static final class151 method925(class112 arg0, boolean arg1) {
        field1972++;
        if (!arg1) {
            field1974 = (class41[]) null;
        }
        return new class151(arg0.method771(-67), arg0.method771(-128), arg0.method771(-113), arg0.method771(-66), arg0.method771(-84), arg0.method771(-115), arg0.method771(-86), arg0.method771(-58), arg0.method757(11997), arg0.method792(2));
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIILag;I)Ljava/awt/Frame;", line = 47)
    public static final Frame method926(int arg0, int arg1, int arg2, int arg3, class211 arg4, int arg5) {
        field1977++;
        if (!arg4.method1491(52)) {
            return null;
        }
        if (arg3 == 0) {
            class83[] var6 = class81.method576(101, arg4);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field1209 == arg1 && var6[var8].field1204 == arg5 && (arg2 == 0 || var6[var8].field1206 == arg2) && (!var7 || var6[var8].field1207 > arg3)) {
                    var7 = true;
                    arg3 = var6[var8].field1207;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class182 var9 = arg4.method1476(arg2, arg3, (byte) -115, arg5, arg1);
        while (var9.field2948 == 0) {
            class300.method2068(127, 10L);
        }
        Frame var10 = (Frame) var9.field2945;
        if (var10 == null) {
            return null;
        }
        if (arg0 <= 125) {
            field1974 = (class41[]) null;
        }
        if (var9.field2948 == 2) {
            class147.method1018(var10, arg4, 1);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(II)I", line = 121)
    public static final int method927(int arg0, int arg1) {
        field1968++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        if (arg0 != 860920833) {
            return 3;
        }
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        double var10 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        if (var2 < var4) {
            var10 = var4;
        }
        double var12 = 0.0D;
        if (var6 > var10) {
            var10 = var6;
        }
        double var14 = (var8 + var10) / 2.0D;
        double var16 = 0.0D;
        if (var8 != var10) {
            if (var14 < 0.5D) {
                var12 = (var10 - var8) / (var8 + var10);
            }
            if (var14 >= 0.5D) {
                var12 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var16 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var16 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var16 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var16 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var12 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var14 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var20 >> 2 << 10) + ((var21 >> 5 << 7) + (var22 >> 1));
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 241)
    public static void method928(int arg0) {
        field1975 = null;
        field1980 = null;
        field1976 = (int[][]) null;
        field1970 = null;
        field1978 = null;
        field1974 = null;
        if (arg0 != 243) {
            method927(-5, -109);
        }
        field1973 = null;
    }
}
