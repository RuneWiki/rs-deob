import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class371 {

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public int field5290 = 1;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "[[Z")
    public static boolean[][] field5288 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "[F")
    public static float[] field5286 = new float[4];

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Z")
    public static boolean field5285 = false;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "C")
    public char field5287;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "F")
    public static float field5292;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public static void method2360(byte arg0) {
        field5288 = null;
        field5286 = null;
        if (arg0 <= 11) {
            field5288 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lcea;I)V")
    public final void method2361(class215 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1535(255);
            if (var3 == 0) {
                if (arg1 != -1) {
                    field5285 = false;
                }
                field5284++;
                return;
            }
            this.method2362(-90, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILcea;)V")
    private final void method2362(int arg0, int arg1, class215 arg2) {
        field5291++;
        if (arg1 == 1) {
            this.field5287 = class216.method1548(arg2.method1536(-119), -128);
        } else if (arg1 == 2) {
            this.field5290 = 0;
        }
        if (arg0 >= -73) {
            this.method2361(null, -43);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)Z")
    public static final boolean method2363(int arg0, int arg1, int arg2) {
        if (arg0 > -23) {
            field5288 = null;
        }
        field5289++;
        return (arg2 & 0x20) != 0;
    }
}
