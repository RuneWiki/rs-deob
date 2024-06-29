import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class189 extends class29 {

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    public static int field3063 = 0;

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "[Z")
    public static boolean[] field3067 = new boolean[100];

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "Lph;")
    public static class229 field3074 = class266.method1858("http:)4)4", 0);

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
    public int field3064;

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "I")
    public int field3066;

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
    public int field3075;

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "I")
    public int field3076;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "Lph;")
    public class229 field3065;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "[I")
    public int[] field3062;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "[I")
    public int[] field3069;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "[Lph;")
    public class229[] field3061;

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "[Lfe;")
    public class97[] field3070;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(IZ)Lph;", line = 18)
    public static final class229 method1319(int arg0, boolean arg1) {
        field3073++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        class229 var2 = new class229();
        var2.field3772 = new byte[1];
        var2.field3785 = 1;
        var2.field3772[0] = (byte) arg0;
        if (arg1) {
            method1322((byte) -12);
        }
        return var2;
    }

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "(I)V", line = 57)
    public static final void method1320(int arg0) {
        field3068++;
        if (arg0 != 4096 || class198.field3288 != null && class51.field730 != null) {
            return;
        }
        class51.field730 = new int[256];
        class198.field3288 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class198.field3288[var1] = (int) (Math.sin(var2) * 4096.0D);
            class51.field730[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)V", line = 89)
    public static final void method1321(int arg0, int arg1) {
        if (arg0 == -1 && !class300.field4870) {
            class254.method1773(81);
        } else if (arg0 != -1 && (class187.field3048 != arg0 || !class249.method1747(0)) && class234.field3860 != 0 && !class300.field4870) {
            class174.method1256(arg0, 2, false, class234.field3860, 0, class219.field3599, arg1 ^ 0x1781);
        }
        field3071++;
        if (arg1 != -6130) {
            method1322((byte) -20);
        }
        class187.field3048 = arg0;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V", line = 118)
    public static void method1322(byte arg0) {
        if (arg0 != 80) {
            method1319(64, false);
        }
        field3074 = null;
        field3067 = null;
    }
}
