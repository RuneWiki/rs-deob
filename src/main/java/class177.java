import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class177 extends class184 {

    @OriginalMember(owner = "client!dca", name = "y", descriptor = "Ldi;")
    public static class127 field2746;

    @OriginalMember(owner = "client!dca", name = "o", descriptor = "Ldi;")
    public static class127 field2736 = field2746 = new class127(false);

    @OriginalMember(owner = "client!dca", name = "C", descriptor = "I")
    public static int field2750 = 0;

    @OriginalMember(owner = "client!dca", name = "A", descriptor = "[I")
    public static int[] field2748 = null;

    @OriginalMember(owner = "client!dca", name = "E", descriptor = "Lsca;")
    public static class46 field2752 = null;

    @OriginalMember(owner = "client!dca", name = "m", descriptor = "I")
    public int field2734;

    @OriginalMember(owner = "client!dca", name = "n", descriptor = "I")
    public int field2735;

    @OriginalMember(owner = "client!dca", name = "r", descriptor = "I")
    public int field2739;

    @OriginalMember(owner = "client!dca", name = "s", descriptor = "I")
    public int field2740;

    @OriginalMember(owner = "client!dca", name = "t", descriptor = "I")
    public int field2741;

    @OriginalMember(owner = "client!dca", name = "u", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!dca", name = "w", descriptor = "I")
    public int field2744;

    @OriginalMember(owner = "client!dca", name = "z", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!dca", name = "B", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!dca", name = "v", descriptor = "Lsca;")
    public class46 field2743;

    @OriginalMember(owner = "client!dca", name = "x", descriptor = "Lsca;")
    public class46 field2745;

    @OriginalMember(owner = "client!dca", name = "D", descriptor = "Ljava/lang/String;")
    public String field2751;

    @OriginalMember(owner = "client!dca", name = "q", descriptor = "Z")
    public boolean field2738;

    @OriginalMember(owner = "client!dca", name = "p", descriptor = "[Ljava/lang/Object;")
    public Object[] field2737;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "([SII)[S")
    public static final short[] method1259(short[] arg0, int arg1, int arg2) {
        field2742++;
        short[] var3 = new short[arg2];
        class319.method2020(arg0, 0, var3, arg1, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)V")
    public static void method1260(int arg0) {
        if (arg0 != 28442) {
            method1259(null, -69, 57);
        }
        field2752 = null;
        field2748 = null;
        field2746 = null;
        field2736 = null;
    }
}
