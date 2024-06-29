import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class44 {

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Lrf;")
    public static class163 field886 = class53.method392(-94, "<img=1>");

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "Z")
    public static boolean field891 = false;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "[[S")
    public static short[][] field889 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "[I")
    public static int[] field895 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "Lrf;")
    public static class163 field897 = class53.method392(-127, "Fallen lassen");

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public static int field900 = 10;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "[Lfa;")
    public static class52[] field899 = new class52[2048];

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "Lrh;")
    public static class165 field890;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lbe;Lue;IB)V")
    public static final void method268(class16 arg0, class189 arg1, int arg2, byte arg3) {
        field887++;
        byte[] var4 = null;
        class5 var5 = class96.field2046;
        synchronized (class96.field2046) {
            for (class82 var6 = (class82) class96.field2046.method46(70); var6 != null; var6 = (class82) class96.field2046.method53(7759444)) {
                if ((long) arg2 == var6.field1950 && var6.field1663 == arg0 && var6.field1666 == 0) {
                    var4 = var6.field1657;
                    break;
                }
            }
        }
        if (var4 != null) {
            arg1.method1274(arg0, var4, -3, arg2, true);
        } else if (arg3 > 94) {
            byte[] var7 = arg0.method109(false, arg2);
            arg1.method1274(arg0, var7, -3, arg2, true);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILrh;IILig;IB)V")
    public static final void method269(int arg0, class165 arg1, int arg2, int arg3, class84 arg4, int arg5, byte arg6) {
        field892++;
        int var7 = 55 / ((arg6 + 57) / 41);
        int var8 = arg2 * arg2 + arg3 * arg3;
        int var9 = Math.min(arg4.field1746 / 2, arg4.field1815 / 2);
        if (var9 * var9 >= var8 || var8 >= 90000) {
            class61.method448(-1, arg0, arg4, arg3, arg2, arg1, arg5);
            return;
        }
        int var10 = class77.field1593 + class54.field1114 & 0x7FF;
        var9 -= 10;
        int var11 = class1.field8[var10];
        int var12 = class1.field21[var10];
        int var13 = var12 * 256 / (class26.field468 + 256);
        int var14 = var11 * 256 / (class26.field468 + 256);
        int var15 = arg3 * var13 + arg2 * var14 >> 16;
        int var16 = arg3 * var14 - arg2 * var13 >> 16;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var9 * Math.sin(var17));
        int var20 = (int) ((double) var9 * Math.cos(var17));
        class195.field3853.method1104(arg4.field1746 / 2 + arg5 + var19 - 10, arg0 - (-(arg4.field1815 / 2) - -var20) + -10, 20, 20, 15, 15, var17, 256);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZIZI)V")
    public static final void method270(boolean arg0, int arg1, boolean arg2, int arg3) {
        field893++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class10.field195 = arg0;
        class188.field3736 = arg3;
        if (arg2) {
            field895 = null;
        }
        class147.field3018 = arg1;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static void method271(byte arg0) {
        field889 = null;
        field886 = null;
        field890 = null;
        if (arg0 == 111) {
            field895 = null;
            field897 = null;
            field899 = null;
        }
    }
}
