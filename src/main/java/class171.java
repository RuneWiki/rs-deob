import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class171 {

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "Loi;")
    private class53 field2479;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public int field2483;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field2480 = 0;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "[[I")
    public static int[][] field2484 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "Ll;")
    public static class16 field2485;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILrk;BII)V")
    public static final void method1069(int arg0, class25 arg1, byte arg2, int arg3, int arg4) {
        if (arg2 <= 119) {
            return;
        }
        field2486++;
        long var5 = (long) (arg3 << 14 | arg4 << 28 | arg0);
        class176 var7 = (class176) class62.field773.method2405(var5, -120);
        if (var7 == null) {
            class176 var8 = new class176();
            class62.field773.method2413(var5, var8, -1);
            var8.field2531.method2657(8492, arg1);
            return;
        }
        class395 var9 = class344.field5000.method993(arg1.field309, true);
        int var10 = var9.field5555;
        if (var9.field5554 == 1) {
            var10 = (arg1.field311 + 1) * var10;
        }
        for (class25 var11 = (class25) var7.field2531.method2655(15152); var11 != null; var11 = (class25) var7.field2531.method2660((byte) 67)) {
            class395 var12 = class344.field5000.method993(var11.field309, true);
            int var13 = var12.field5555;
            if (var12.field5554 == 1) {
                var13 = (var11.field311 + 1) * var13;
            }
            if (var10 > var13) {
                class443.method2597((byte) 51, arg1, var11);
                return;
            }
        }
        var7.field2531.method2657(8492, arg1);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB[Ljava/lang/Object;[JI)V")
    public static final void method1070(int arg0, byte arg1, Object[] arg2, long[] arg3, int arg4) {
        if (arg0 > arg4) {
            int var5 = (arg4 + arg0) / 2;
            int var6 = arg4;
            long var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            Object var9 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg4; var11 < arg0; var11++) {
                if ((var7 + ((long) (var10 & var11))) > arg3[var11]) {
                    long var12 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6] = var12;
                    Object var14 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6++] = var14;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg2[arg0] = arg2[var6];
            arg2[var6] = var9;
            method1070(var6 - 1, (byte) 125, arg2, arg3, arg4);
            method1070(arg0, (byte) 120, arg2, arg3, var6 + 1);
        }
        field2481++;
        int var15 = -101 / ((44 - arg1) / 63);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)V")
    public static final void method1071(int arg0, int arg1, int arg2) {
        field2482++;
        if (arg1 != 2) {
            field2480 = -3;
        }
        if (class120.method807(arg1 - 8812, arg0)) {
            class486.method2804(arg2, class494.field6988[arg0], (byte) -41);
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lle;ILoi;)V")
    public class171(class205 arg0, int arg1, class53 arg2) {
        new class174(64);
        this.field2479 = arg2;
        this.field2483 = this.field2479.method435(15, 0);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static void method1072(int arg0) {
        if (arg0 > 13) {
            field2485 = null;
            field2484 = null;
        }
    }
}
