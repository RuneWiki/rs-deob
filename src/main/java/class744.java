import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class744 extends class281 {

    @OriginalMember(owner = "client!nea", name = "z", descriptor = "Lpda;")
    public class657 field10274;

    @OriginalMember(owner = "client!nea", name = "x", descriptor = "[F")
    public static float[] field10272 = new float[16384];

    @OriginalMember(owner = "client!nea", name = "A", descriptor = "[F")
    public static float[] field10275 = new float[16384];

    @OriginalMember(owner = "client!nea", name = "C", descriptor = "[I")
    public static int[] field10277;

    @OriginalMember(owner = "client!nea", name = "y", descriptor = "I")
    public static int field10273;

    @OriginalMember(owner = "client!nea", name = "B", descriptor = "I")
    public static int field10276;

    @OriginalMember(owner = "client!nea", name = "D", descriptor = "Lija;")
    public static class366 field10278;

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(BI[B)I")
    public static final int method4120(byte arg0, int arg1, byte[] arg2) {
        int var3 = -14 / ((83 - arg0) / 42);
        field10273++;
        return class122.method1002(arg1, arg2, false, 0);
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)V")
    public static void method4121(int arg0) {
        field10278 = null;
        if (arg0 > -25) {
            field10278 = null;
        }
        field10272 = null;
        field10275 = null;
        field10277 = null;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IIBII)V")
    public static final void method4122(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != 53) {
            method4121(-46);
        }
        field10276++;
        int var5 = 0;
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = -1;
        int var9 = class573.method3204(arg0 + arg1, class174.field2335, arg2 + 124915023, class751.field10402);
        int var10 = class573.method3204(arg1 - arg0, class174.field2335, arg2 ^ 0x7720DB1, class751.field10402);
        class138.method1069(class785.field10808[arg3], (byte) -107, var10, var9, arg4);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg3 - var6;
                int var12 = arg3 + var6;
                if (var12 >= class523.field7178 && class495.field6845 >= var11) {
                    int var13 = class573.method3204(arg1 + var5, class174.field2335, 124915076, class751.field10402);
                    int var14 = class573.method3204(arg1 - var5, class174.field2335, 124915076, class751.field10402);
                    if (var12 <= class495.field6845) {
                        class138.method1069(class785.field10808[var12], (byte) -87, var14, var13, arg4);
                    }
                    if (class523.field7178 <= var11) {
                        class138.method1069(class785.field10808[var11], (byte) 126, var14, var13, arg4);
                    }
                }
            }
            var5++;
            int var15 = arg3 - var5;
            int var16 = arg3 + var5;
            if (class523.field7178 <= var16 && class495.field6845 >= var15) {
                int var17 = class573.method3204(arg1 + var6, class174.field2335, arg2 ^ 0x7720DB1, class751.field10402);
                int var18 = class573.method3204(arg1 - var6, class174.field2335, 124915076, class751.field10402);
                if (var16 <= class495.field6845) {
                    class138.method1069(class785.field10808[var16], (byte) 98, var18, var17, arg4);
                }
                if (class523.field7178 <= var15) {
                    class138.method1069(class785.field10808[var15], (byte) -109, var18, var17, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Lpda;)V")
    public class744(class657 arg0) {
        this.field10274 = arg0;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field10272[var2] = (float) Math.sin((double) var2 * var0);
            field10275[var2] = (float) Math.cos((double) var2 * var0);
        }
        field10277 = new int[3];
    }
}
