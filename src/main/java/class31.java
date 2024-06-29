import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class31 {

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "Z")
    public static boolean field371 = false;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "[[Z")
    public static boolean[][] field375 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "Loh;")
    public static class258 field370 = class153.method1046("mapdots", 94);

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "[I")
    public static int[] field373 = new int[64];

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public static int field376 = 0;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "[Lkl;")
    public static class65[] field372;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V", line = 7)
    public static void method227(int arg0) {
        field372 = null;
        field370 = null;
        field375 = (boolean[][]) null;
        if (arg0 != 0) {
            field376 = 51;
        }
        field373 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V", line = 21)
    public static final void method228(byte arg0) {
        if (arg0 != 45) {
            return;
        }
        field369++;
        for (int var1 = -1; var1 < class14.field177; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class140.field2390[var1];
            }
            class231 var3 = class38.field527[var2];
            if (var3 != null) {
                class239.method1640((byte) -90, var3.method447(18123), var3);
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)I", line = 57)
    public static final int method229(byte arg0) {
        if (arg0 != 0) {
            field376 = 62;
        }
        field374++;
        if (class168.field2855) {
            return 0;
        } else if (class110.method807(arg0 + 720049666)) {
            return class45.field672 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIBI)V", line = 102)
    public static final void method230(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field368++;
        for (int var5 = 0; var5 < class312.field5298; var5++) {
            if ((class276.field4763[var5] + class114.field2026[var5]) > arg0 && class276.field4763[var5] < (arg0 + arg1) && arg4 < class38.field517[var5] + class121.field2146[var5] && arg2 + arg4 > class121.field2146[var5]) {
                class74.field1292[var5] = true;
            }
        }
        if (arg3 != 19) {
            method227(-47);
        }
    }
}
