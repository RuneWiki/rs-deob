import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class86 extends class138 {

    @OriginalMember(owner = "client!li", name = "M", descriptor = "Lck;")
    public static class119 field1297 = class298.method1987((byte) 26, "Fallen lassen");

    @OriginalMember(owner = "client!li", name = "U", descriptor = "[F")
    public static float[] field1304 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!li", name = "S", descriptor = "Lck;")
    public static class119 field1302 = class298.method1987((byte) 18, "weiss:");

    @OriginalMember(owner = "client!li", name = "H", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1293 = new CRC32();

    @OriginalMember(owner = "client!li", name = "Y", descriptor = "Lck;")
    public static class119 field1308 = class298.method1987((byte) 40, "xpress");

    @OriginalMember(owner = "client!li", name = "D", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!li", name = "F", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!li", name = "G", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!li", name = "I", descriptor = "I")
    private int field1294;

    @OriginalMember(owner = "client!li", name = "J", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!li", name = "N", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!li", name = "O", descriptor = "I")
    public int field1299;

    @OriginalMember(owner = "client!li", name = "P", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!li", name = "Q", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!li", name = "T", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!li", name = "V", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!li", name = "X", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!li", name = "L", descriptor = "Lck;")
    public class119 field1296;

    @OriginalMember(owner = "client!li", name = "W", descriptor = "Lva;")
    public static class36 field1306;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lfj;Z)V", line = 6)
    public final void method573(class3 arg0, boolean arg1) {
        field1295++;
        while (true) {
            int var3 = arg0.method64((byte) -119);
            if (var3 == 0) {
                if (!arg1) {
                    method575(-123);
                }
                return;
            }
            this.method581(arg0, var3, (byte) -111);
        }
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V", line = 28)
    public static final void method574(int arg0) {
        if (class44.field660 != null) {
            class44.field660.method1629(-82);
            class44.field660 = null;
        }
        field1298++;
        class3.field82 = class220.field3533.method1871(0, class215.field3443, class207.field3292);
        class154.field2448 = arg0;
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(I)V", line = 48)
    public static void method575(int arg0) {
        field1297 = null;
        if (arg0 != -28729) {
            method574(-17);
        }
        field1302 = null;
        field1306 = null;
        field1304 = null;
        field1308 = null;
        field1293 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "([[IIBLib;I[IZ[[F[[F[[FZIIZIZI[ZII[[II)V", line = 64)
    public static final void method576(int[][] arg0, int arg1, byte arg2, class145 arg3, int arg4, int[] arg5, boolean arg6, float[][] arg7, float[][] arg8, float[][] arg9, boolean arg10, int arg11, int arg12, boolean arg13, int arg14, boolean arg15, int arg16, boolean[] arg17, int arg18, int arg19, int[][] arg20, int arg21) {
        field1292++;
        if (arg12 != 1500477544) {
            method577(8, -32, 37, (byte) 105, -73);
        }
        int var22 = (arg13 ? 255 : 0) + (arg19 << 8);
        int var23 = (arg1 << 8) + (arg15 ? 255 : 0);
        int var24 = (arg6 ? 255 : 0) + (arg16 << 8);
        int var25 = (arg10 ? 255 : 0) + (arg21 << 8);
        int[] var26 = new int[arg5.length / 2];
        for (int var27 = 0; var27 < var26.length; var27++) {
            int var28 = arg5[var27 + var27];
            int[][] var29 = arg0 == null || arg17 == null || !arg17[var27] ? arg20 : arg0;
            int var30 = arg5[var27 + var27 + 1];
            var26[var27] = class211.method1321(arg4, var30, var29, arg0, var28, arg2, var25, arg14, var22, false, var24, (float) arg18, arg9, arg8, arg3, var23, 0, arg7);
        }
        arg3.method952(arg11, arg14, arg4, var26, (int[]) null, false);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIBI)V", line = 103)
    public static final void method577(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1300++;
        if (arg3 != 43) {
            method576((int[][]) ((int[][]) null), 124, (byte) 99, (class145) null, 106, (int[]) null, false, (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), false, -26, 91, false, 125, true, -72, (boolean[]) null, 63, 87, (int[][]) ((int[][]) null), -71);
        }
        for (int var5 = 0; var5 < class36.field499; var5++) {
            if (class46.field681[var5] + class164.field2586[var5] > arg0 && arg0 + arg2 > class46.field681[var5] && (class151.field2392[var5] + class139.field2235[var5]) > arg4 && class151.field2392[var5] < (arg1 + arg4)) {
                class212.field3379[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lva;Lva;I)I", line = 136)
    public static final int method578(class36 arg0, class36 arg1, int arg2) {
        field1289++;
        int var3 = arg2;
        if (arg1.method267((byte) 4, class44.field654)) {
            var3 = arg2 + 1;
        }
        if (arg1.method267((byte) 4, class124.field1912)) {
            var3++;
        }
        if (arg1.method267((byte) 4, class183.field2909)) {
            var3++;
        }
        if (arg0.method267((byte) 4, class44.field654)) {
            var3++;
        }
        if (arg0.method267((byte) 4, class124.field1912)) {
            var3++;
        }
        if (arg0.method267((byte) 4, class183.field2909)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIII)V", line = 167)
    public static final void method579(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1305++;
        class121.method804(arg3, arg1, arg3 + arg4, arg1 + arg2);
        class121.method811(arg3, arg1, arg4, arg2, 0);
        if (class198.field3166 < 100) {
            return;
        }
        if (class220.field3532 == null || class220.field3532.field1347 != arg4 || class220.field3532.field1345 != arg2) {
            class43 var5 = new class43(arg4, arg2);
            class286.method1920(var5.field652, arg4, arg2);
            class285.method1907(0, 0, 0, class126.field1938, arg2, arg4, class258.field4137, 125, 0);
            class220.field3532 = new class160(var5);
            class286.field4718 = null;
        }
        class220.field3532.method143(arg3, arg1);
        int var6 = class243.field3907 * arg4 / class126.field1938 + arg3;
        int var7 = class8.field164 * arg4 / class126.field1938;
        int var8 = class76.field1189 * arg2 / class258.field4137 + arg1;
        int var9 = class56.field903 * arg2 / class258.field4137;
        if (arg0 != 23909) {
            return;
        }
        class121.method807(var6, var8, var7, var9, 16711680, 128);
        class121.method813(var6, var8, var7, var9, 16711680);
        if (class25.field380 <= 0 || (class25.field380 % 10) >= 5) {
            return;
        }
        for (class224 var10 = (class224) class249.field4017.method995(1836596936); var10 != null; var10 = (class224) class249.field4017.method996(arg0 ^ 0x5D65)) {
            if (class182.field2892 == var10.field3594) {
                int var11 = var10.field3604 * arg2 / class258.field4137 + arg1;
                int var12 = arg3 + (var10.field3599 * arg4 / class126.field1938);
                class121.method811(var12 - 2, var11 + -2, 4, 4, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(I)Z", line = 245)
    public final boolean method580(int arg0) {
        if (arg0 < 1) {
            return true;
        } else {
            field1301++;
            return this.field1294 == 115;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lfj;IB)V", line = 267)
    private final void method581(class3 arg0, int arg1, byte arg2) {
        field1291++;
        if (arg1 == 1) {
            this.field1294 = arg0.method64((byte) 51);
        } else if (arg1 == 2) {
            this.field1299 = arg0.method71(-668527048);
        } else if (arg1 == 5) {
            this.field1296 = arg0.method41((byte) -122);
        }
        int var4 = 73 / ((arg2) / 48);
    }
}
