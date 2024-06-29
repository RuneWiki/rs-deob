import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class150 {

    @OriginalMember(owner = "client!up", name = "e", descriptor = "I")
    private int field2122;

    @OriginalMember(owner = "client!up", name = "j", descriptor = "[Lpn;")
    private class446[] field2127;

    @OriginalMember(owner = "client!up", name = "f", descriptor = "[S")
    public static short[] field2123 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!up", name = "l", descriptor = "Lkn;")
    public static class442 field2129;

    @OriginalMember(owner = "client!up", name = "m", descriptor = "[Z")
    public static boolean[] field2130;

    @OriginalMember(owner = "client!up", name = "n", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!up", name = "b", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!up", name = "h", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!up", name = "i", descriptor = "J")
    private long field2126;

    @OriginalMember(owner = "client!up", name = "k", descriptor = "Lnq;")
    public static class268 field2128;

    @OriginalMember(owner = "client!up", name = "g", descriptor = "Lpn;")
    private class446 field2124;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(JILpn;)V")
    public final void method1014(long arg0, int arg1, class446 arg2) {
        field2121++;
        int var5 = 90 % ((arg1 + 47) / 50);
        if (arg2.field6251 != null) {
            arg2.method2783((byte) -122);
        }
        class446 var6 = this.field2127[(int) ((long) (this.field2122 - 1) & arg0)];
        arg2.field6254 = var6;
        arg2.field6251 = var6.field6251;
        arg2.field6251.field6254 = arg2;
        arg2.field6253 = arg0;
        arg2.field6254.field6251 = arg2;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)Lpn;")
    public final class446 method1015(int arg0) {
        field2125++;
        if (arg0 != -22032) {
            field2129 = null;
        }
        if (this.field2124 == null) {
            return null;
        }
        class446 var2 = this.field2127[(int) ((long) (this.field2122 - 1) & this.field2126)];
        while (this.field2124 != var2) {
            if (this.field2124.field6253 == this.field2126) {
                class446 var3 = this.field2124;
                this.field2124 = this.field2124.field6254;
                return var3;
            }
            this.field2124 = this.field2124.field6254;
        }
        this.field2124 = null;
        return null;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(BIIII)V")
    public static final void method1016(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field2118++;
        float var5 = (float) class354.field4857 / (float) class354.field4841;
        int var6 = arg1;
        int var7 = arg4;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg1 * var5);
        } else {
            var6 = (int) ((float) arg4 / var5);
        }
        int var8 = arg2 - (arg1 - var6) / 2;
        int var9 = arg3 - (arg4 - var7) / 2;
        class222.field3100 = class354.field4841 * var8 / var6;
        class277.field3854 = -1;
        class254.field3580 = class354.field4857 - (class354.field4857 * var9 / var7);
        class192.field2649 = -1;
        class410.method2564((byte) -42);
        if (arg0 != -56) {
            field2123 = null;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)V")
    public static void method1017(byte arg0) {
        field2128 = null;
        field2123 = null;
        field2129 = null;
        if (arg0 != 109) {
            method1016((byte) -42, -101, 22, 92, -117);
        }
        field2130 = null;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(JZ)Lpn;")
    public final class446 method1018(long arg0, boolean arg1) {
        this.field2126 = arg0;
        field2119++;
        class446 var4 = this.field2127[(int) ((long) (this.field2122 - 1) & arg0)];
        this.field2124 = var4.field6254;
        if (arg1) {
            return null;
        }
        while (this.field2124 != var4) {
            if (this.field2124.field6253 == arg0) {
                class446 var5 = this.field2124;
                this.field2124 = this.field2124.field6254;
                return var5;
            }
            this.field2124 = this.field2124.field6254;
        }
        this.field2124 = null;
        return null;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IILja;ILuo;IZ)V")
    public static final void method1019(int arg0, int arg1, class152 arg2, int arg3, class345 arg4, int arg5, boolean arg6) {
        field2120++;
        if (class89.field1244 < 100) {
            class192.method1251(arg2, 37, arg4);
        }
        arg4.method136(arg1, arg0, arg1 + arg3, arg0 + arg5);
        if (class89.field1244 < 100) {
            byte var7 = 20;
            int var8 = arg1 + (arg3 / 2);
            arg4.method56(arg1, arg0, arg3, arg5, -16777216, 0);
            int var9 = arg0 + (arg5 / 2) - (18 - -var7);
            arg4.method59(var8 - 152, var9, 304, 34, class429.field6076[class74.field1065].getRGB(), 0);
            arg4.method56(var8 - 150, var9 - -2, class89.field1244 * 3, 30, class295.field4133[class74.field1065].getRGB(), 0);
            class279.field3915.method2283((byte) -93, var8, var7 + var9, -1, class16.field296.method2763(61, class210.field2935), class431.field6090[class74.field1065].getRGB());
            return;
        }
        int var10 = class222.field3100 - (int) ((float) arg3 / class354.field4834);
        int var11 = (int) ((float) arg5 / class354.field4834) + class254.field3580;
        int var12 = (int) ((float) arg3 / class354.field4834) + class222.field3100;
        class181.field2485 = (int) ((float) (arg3 * 2) / class354.field4834);
        class75.field1077 = class222.field3100 - ((int) ((float) arg3 / class354.field4834));
        int var13 = class254.field3580 - ((int) ((float) arg5 / class354.field4834));
        class34.field536 = (int) ((float) (arg5 * 2) / class354.field4834);
        class94.field1304 = class254.field3580 - ((int) ((float) arg5 / class354.field4834));
        if (arg6) {
            method1016((byte) 46, -118, -109, 87, -120);
        }
        class354.method2260(class354.field4843 + var10, class354.field4858 + var11, var12 + class354.field4843, class354.field4858 + var13, arg1, arg0, arg1 + arg3, arg5 - -1 + arg0);
        class354.method2273(arg4);
        class90 var14 = class354.method2265(arg4);
        class230.method1586(var14, 0, 0, arg4, (byte) -71);
        if (class222.field3105 > 0) {
            class377.field5396--;
            if (class377.field5396 == 0) {
                class377.field5396 = 20;
                class222.field3105--;
            }
        }
        if (!class420.field5963) {
            return;
        }
        int var15 = arg3 + arg1 - 5;
        int var16 = arg0 + arg5 - 8;
        class159.field2234.method2284(var15, 0, var16, 16776960, -1, "Fps:" + class70.field1030);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class159.field2234.method2284(var15, 0, var20, var19, -1, "Mem:" + var18 + "k");
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(I)V")
    public class150(int arg0) {
        this.field2122 = arg0;
        this.field2127 = new class446[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class446 var3 = this.field2127[var2] = new class446();
            var3.field6251 = var3;
            var3.field6254 = var3;
        }
    }

    static {
        new class442("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        field2129 = new class442(" more options", " weitere Optionen", " autres options", " mais opções");
        field2130 = new boolean[8];
        field2131 = 0;
    }
}
