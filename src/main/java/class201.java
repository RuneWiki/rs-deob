import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class201 extends class82 {

    @OriginalMember(owner = "client!lb", name = "E", descriptor = "I")
    private final int field3450;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    private final int field3437;

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
    private final int field3448;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    private final int field3438;

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "Lcd;")
    public static class64 field3446 = class44.method335((byte) 71, "unzap");

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "[[S")
    public static short[][] field3443 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
    public static int field3444 = 100;

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "I")
    public static int field3451 = 0;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
    public static int field3441 = 3;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZII)V", line = 4)
    public final void method433(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field3446 = (class64) null;
        }
        field3442++;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(IIIIII)V", line = 13)
    public class201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3450 = arg0;
        this.field3437 = arg1;
        this.field3448 = arg3;
        this.field3438 = arg2;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II[ZZZLfg;[[IIZ[[FI[[F[[FBII[I[[IIZIZ)V", line = 32)
    public static final void method1409(int arg0, int arg1, boolean[] arg2, boolean arg3, boolean arg4, class204 arg5, int[][] arg6, int arg7, boolean arg8, float[][] arg9, int arg10, float[][] arg11, float[][] arg12, byte arg13, int arg14, int arg15, int[] arg16, int[][] arg17, int arg18, boolean arg19, int arg20, boolean arg21) {
        int var22 = (arg20 << 8) + (arg3 ? 255 : 0);
        int var23 = (arg0 << 8) + (arg19 ? 255 : 0);
        field3452++;
        int var24 = (arg14 << 8) + (arg21 ? 255 : 0);
        int[] var25 = new int[arg16.length / 2];
        int var26 = (arg4 ? 255 : 0) + (arg10 << 8);
        for (int var27 = 0; var27 < var25.length; var27++) {
            int[][] var28 = arg6 == null || arg2 == null || !arg2[var27] ? arg17 : arg6;
            int var29 = arg16[var27 + var27];
            int var30 = arg16[var27 + var27 + 1];
            var25[var27] = class213.method1503(var26, arg12, false, var23, var30, arg5, arg9, var24, arg1, (float) arg18, var29, arg6, var22, arg13, var28, arg7, arg11, 16988);
        }
        arg5.method1429(arg15, arg7, arg1, var25, (int[]) null, arg8);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLnm;)V", line = 66)
    public static final void method1410(boolean arg0, class176 arg1) {
        field3439++;
        short var2 = 256;
        if (arg0) {
            method1409(-28, -120, (boolean[]) null, true, false, (class204) null, (int[][]) ((int[][]) null), 126, true, (float[][]) ((float[][]) null), 17, (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), (byte) 106, -52, -5, (int[]) null, (int[][]) ((int[][]) null), -18, false, -22, true);
        }
        for (int var3 = 0; var3 < class85.field1579.length; var3++) {
            class85.field1579[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) ((double) var2 * 128.0D * Math.random());
            class85.field1579[var5] = (int) (Math.random() * 284.0D);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < var2 - 1; var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = (var7 << 7) + var8;
                    class82.field1513[var9] = (class85.field1579[var9 - 128] + class85.field1579[var9 - 1] + class85.field1579[var9 - -128] + class85.field1579[var9 + 1]) / 4;
                }
            }
            int[] var10 = class85.field1579;
            class85.field1579 = class82.field1513;
            class82.field1513 = var10;
        }
        if (arg1 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg1.field3011; var12++) {
            for (int var13 = 0; var13 < arg1.field3008; var13++) {
                if (arg1.field3012[var11++] != 0) {
                    int var14 = var13 + arg1.field3009 + 16;
                    int var15 = var12 - (-arg1.field3007 - 16);
                    int var16 = (var15 << 7) + var14;
                    class85.field1579[var16] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BII)V", line = 165)
    public final void method434(byte arg0, int arg1, int arg2) {
        field3449++;
        if (arg0 > -96) {
            field3444 = -33;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 182)
    public static void method1411(int arg0) {
        field3443 = (short[][]) null;
        field3446 = null;
        if (arg0 >= -27) {
            method1409(-43, -94, (boolean[]) null, true, false, (class204) null, (int[][]) ((int[][]) null), -9, true, (float[][]) ((float[][]) null), 86, (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), (byte) -105, -79, 114, (int[]) null, (int[][]) ((int[][]) null), 50, false, 66, true);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIB)V", line = 194)
    public final void method435(int arg0, int arg1, byte arg2) {
        field3440++;
        int var4 = this.field3450 * arg0 >> 12;
        int var5 = this.field3438 * arg0 >> 12;
        if (arg2 != 111) {
            field3447 = -14;
        }
        int var6 = this.field3448 * arg1 >> 12;
        int var7 = this.field3437 * arg1 >> 12;
        class85.method651(this.field1510, var6, var7, var4, var5, -124);
    }
}
