import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class77 extends class28 {

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
    private final int field1309;

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
    private final int field1308;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "I")
    private final int field1313;

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "I")
    private final int field1310;

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "I")
    private final int field1312;

    @OriginalMember(owner = "client!tj", name = "U", descriptor = "I")
    private final int field1325;

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "I")
    private final int field1306;

    @OriginalMember(owner = "client!tj", name = "Q", descriptor = "I")
    private final int field1321;

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "[I")
    public static int[] field1311 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "Lhi;")
    public static class82 field1316 = class95.method664((byte) -62, "k");

    @OriginalMember(owner = "client!tj", name = "P", descriptor = "Z")
    public static boolean field1320 = true;

    @OriginalMember(owner = "client!tj", name = "R", descriptor = "Lhi;")
    public static class82 field1322 = class95.method664((byte) -93, "0");

    @OriginalMember(owner = "client!tj", name = "N", descriptor = "I")
    public static int field1318 = 0;

    @OriginalMember(owner = "client!tj", name = "T", descriptor = "I")
    public static int field1324 = 0;

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!tj", name = "M", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!tj", name = "O", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!tj", name = "S", descriptor = "[[[B")
    public static byte[][][] field1323;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)V", line = 10)
    public static final void method490(byte arg0) {
        class221.method1565(5, 0);
        class80.method511(1, 5);
        class302.method2080(5, true);
        class264.method1880(5, 28812);
        field1315++;
        class259.method1848(5, 2);
        class281.method1955(5, (byte) -121);
        class260.method1861(5, -51);
        class244.method1751(2, 5);
        class95.method661(5, 126);
        if (arg0 >= -14) {
            return;
        }
        class42.method319(5, -5);
        class79.method501(5, (byte) 104);
        class9.method53(50, (byte) 20);
        class238.method1680(5, (byte) 105);
        class20.method138(5, (byte) -82);
        class150.field2553.method2177(5, -121);
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(III)V", line = 48)
    public final void method26(int arg0, int arg1, int arg2) {
        field1317++;
        int var4 = this.field1321 * arg0 >> 12;
        int var5 = this.field1308 * arg1 >> 12;
        int var6 = this.field1310 * arg0 >> 12;
        int var7 = this.field1312 * arg0 >> 12;
        int var8 = this.field1313 * arg1 >> 12;
        if (arg2 != 0) {
            method491(-14);
        }
        int var9 = this.field1306 * arg1 >> 12;
        int var10 = this.field1325 * arg1 >> 12;
        int var11 = this.field1309 * arg0 >> 12;
        class160.method1165(var11, var10, var8, var9, var6, var4, this.field370, var7, -122, var5);
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(III)V", line = 75)
    public final void method24(int arg0, int arg1, int arg2) {
        field1314++;
        if (arg2 != 0) {
            field1323 = (byte[][][]) ((byte[][][]) null);
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 95)
    public class77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field1309 = arg7;
        this.field1308 = arg0;
        this.field1313 = arg2;
        this.field1310 = arg3;
        this.field1312 = arg5;
        this.field1325 = arg4;
        this.field1306 = arg6;
        this.field1321 = arg1;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(III)V", line = 118)
    public final void method22(int arg0, int arg1, int arg2) {
        field1319++;
        if (arg2 < 24) {
            this.method26(97, 105, 106);
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V", line = 137)
    public static void method491(int arg0) {
        field1322 = null;
        field1311 = null;
        field1316 = null;
        if (arg0 == 7503) {
            field1323 = (byte[][][]) null;
        }
    }
}
