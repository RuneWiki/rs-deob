import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class82 extends class259 {

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    private int field1306;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
    public int field1312;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public int field1307;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "I")
    private int field1316;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    private int field1305;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "I")
    private int field1319;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
    private int field1313;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
    private int field1315;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public int field1303;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public int field1308;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "Lpi;")
    public static class201 field1314 = new class201(20);

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
    public static volatile int field1322 = 0;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "Lnh;")
    public static class312 field1320 = new class312(64);

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "[I")
    public static int[] field1327 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "[I")
    public static int[] field1323 = new int[3];

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "[Z")
    public static boolean[] field1326 = new boolean[112];

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "Lud;")
    public static class16 field1324;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(III)Z")
    public final boolean method612(int arg0, int arg1, int arg2) {
        field1304++;
        if (arg1 != 64) {
            this.method617(123, 18, (int[]) null, -38);
        }
        return arg2 >= this.field1307 && this.field1303 >= arg2 && arg0 >= this.field1308 && this.field1312 >= arg0;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZI[I)V")
    public final void method613(int arg0, boolean arg1, int arg2, int[] arg3) {
        field1310++;
        arg3[0] = this.field1305;
        arg3[1] = this.field1307 + arg0 - this.field1315;
        arg3[2] = arg2 - (this.field1306 - this.field1308);
        if (!arg1) {
            this.method617(43, -50, (int[]) null, 50);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIII)Z")
    public final boolean method614(int arg0, int arg1, int arg2, int arg3) {
        field1311++;
        if (arg2 != 8004) {
            method619(-111);
        }
        return this.field1313 == arg1 && this.field1315 <= arg0 && arg0 <= this.field1316 && this.field1306 <= arg3 && this.field1319 >= arg3;
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V")
    public static void method615(int arg0) {
        if (arg0 <= 64) {
            method618(74, -101, -3, 88, -85, 25, (class4) null, -18, 17L);
        }
        field1314 = null;
        field1327 = null;
        field1323 = null;
        field1324 = null;
        field1320 = null;
        field1326 = null;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(III)Z")
    public final boolean method616(int arg0, int arg1, int arg2) {
        if (arg1 == -24061) {
            field1309++;
            return this.field1315 <= arg2 && arg2 <= this.field1316 && arg0 >= this.field1306 && arg0 <= this.field1319;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II[II)V")
    public final void method617(int arg0, int arg1, int[] arg2, int arg3) {
        field1321++;
        arg2[0] = this.field1313;
        if (arg1 != -12801) {
            field1323 = null;
        }
        arg2[1] = this.field1315 + arg0 - this.field1307;
        arg2[2] = this.field1306 + arg3 - this.field1308;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1306 = arg3;
        this.field1312 = arg9;
        this.field1307 = arg6;
        this.field1316 = arg4;
        this.field1305 = arg1;
        this.field1319 = arg5;
        this.field1313 = arg0;
        this.field1315 = arg2;
        this.field1303 = arg8;
        this.field1308 = arg7;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIILff;IJ)Z")
    public static final boolean method618(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class4 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class1.method1(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)V")
    public static final void method619(int arg0) {
        field1317++;
        if (~class30.field319 > arg0) {
            class39.field521 = -1;
            class30.field319 = 0;
            class270.field4342 = -1;
        }
        if (class46.field619 < class30.field319) {
            class270.field4342 = -1;
            class30.field319 = class46.field619;
            class39.field521 = -1;
        }
        if (class121.field1989 < 0) {
            class39.field521 = -1;
            class270.field4342 = -1;
            class121.field1989 = 0;
        }
        if (class121.field1989 > class46.field620) {
            class270.field4342 = -1;
            class39.field521 = -1;
            class121.field1989 = class46.field620;
        }
    }
}
