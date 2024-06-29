import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public abstract class class184 {

    @OriginalMember(owner = "client!br", name = "b", descriptor = "[[Z")
    public static boolean[][] field2352 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!br", name = "a", descriptor = "Z")
    public static boolean field2351 = false;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!br", name = "d", descriptor = "[[B")
    public static byte[][] field2354;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Lpk;I)Lpk;")
    public abstract class101 method613(class101 arg0, int arg1);

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
    public static void method1125(int arg0) {
        field2354 = null;
        field2352 = null;
        int var1 = -12 % ((9 - arg0) / 54);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIBI)I")
    public static final int method1126(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var5 = 52 / ((arg3 + 70) / 50);
        field2353++;
        int var6 = arg2 & 0xF;
        int var7 = var6 >= 8 ? arg1 : arg0;
        int var8 = var6 >= 4 ? (var6 == 12 || var6 == 14 ? arg0 : arg4) : arg1;
        return ((var6 & 0x1) == 0 ? var7 : -var7) + ((var6 & 0x2) == 0 ? var8 : -var8);
    }
}
