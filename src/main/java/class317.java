import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class317 extends class243 {

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "[[S")
    public static short[][] field5363 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
    public static int field5369 = 0;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "Lqd;")
    public static class40 field5366 = class147.method1106("Spielwelt erstellt)3", (byte) -110);

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "Lqd;")
    public static class40 field5368 = class147.method1106("Lade Texturen )2 ", (byte) -55);

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "Lqd;")
    public static class40 field5371 = class147.method1106("Versteckt", (byte) -54);

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZILjava/lang/Object;)[B", line = 6)
    public static final byte[] method2188(boolean arg0, int arg1, Object arg2) {
        if (arg1 != 1) {
            return (byte[]) null;
        }
        field5365++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) ((byte[]) arg2);
            return arg0 ? class153.method1196(false, var3) : var3;
        } else if ((arg2 instanceof class25)) {
            class25 var4 = (class25) arg2;
            return var4.method187(0);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V", line = 53)
    public static void method2189(int arg0) {
        field5366 = null;
        field5363 = (short[][]) null;
        if (arg0 != 3658) {
            field5363 = (short[][]) ((short[][]) null);
        }
        field5371 = null;
        field5368 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIII)V", line = 100)
    public static final void method2190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5364++;
        int var7 = arg0 + arg2;
        if (arg3 != -12820) {
            return;
        }
        int var8 = arg0 + arg1;
        int var9 = arg4 - arg0;
        for (int var10 = arg2; var10 < var7; var10++) {
            class150.method1124(arg5, arg1, arg6, true, class37.field694[var10]);
        }
        int var11 = arg5 - arg0;
        for (int var12 = arg4; var12 > var9; var12--) {
            class150.method1124(arg5, arg1, arg6, true, class37.field694[var12]);
        }
        for (int var13 = var7; var13 <= var9; var13++) {
            int[] var14 = class37.field694[var13];
            class150.method1124(var8, arg1, arg6, true, var14);
            class150.method1124(arg5, var11, arg6, true, var14);
        }
    }
}
