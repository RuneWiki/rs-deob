import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class273 extends class104 {

    @OriginalMember(owner = "client!f", name = "B", descriptor = "I")
    public int field4823;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "I")
    private int field4827;

    @OriginalMember(owner = "client!f", name = "C", descriptor = "[[I")
    public int[][] field4824;

    @OriginalMember(owner = "client!f", name = "J", descriptor = "[Z")
    public boolean[] field4830;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "[I")
    public int[] field4826;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "Le;")
    private static class191 field4821 = class54.method368(" is already on your friend list)3", 2047);

    @OriginalMember(owner = "client!f", name = "x", descriptor = "Le;")
    public static class191 field4819 = field4821;

    @OriginalMember(owner = "client!f", name = "H", descriptor = "Le;")
    public static class191 field4828 = class54.method368(" )2>", 2047);

    @OriginalMember(owner = "client!f", name = "D", descriptor = "I")
    public static int field4825 = 0;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "Lwe;")
    public static class147 field4822 = new class147(64);

    @OriginalMember(owner = "client!f", name = "M", descriptor = "Le;")
    private static class191 field4833 = class54.method368("Free world", 2047);

    @OriginalMember(owner = "client!f", name = "L", descriptor = "[[[I")
    public static int[][][] field4832 = new int[4][13][13];

    @OriginalMember(owner = "client!f", name = "K", descriptor = "Le;")
    public static class191 field4831 = field4833;

    @OriginalMember(owner = "client!f", name = "P", descriptor = "I")
    public static int field4836 = 0;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "Lng;")
    public static class121 field4834;

    @OriginalMember(owner = "client!f", name = "O", descriptor = "[I")
    public static int[] field4835;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Le;I)Z")
    public static final boolean method1863(class191 arg0, int arg1) {
        field4820++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class270.field4759; var2++) {
            if (arg0.method1351(-23098, class252.field4466[var2])) {
                return true;
            }
        }
        return arg0.method1351(-23098, class175.field2946.field1315);
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
    public static void method1864(int arg0) {
        field4821 = null;
        field4819 = null;
        field4835 = null;
        field4822 = null;
        if (arg0 != -2) {
            return;
        }
        field4833 = null;
        field4834 = null;
        field4828 = null;
        field4832 = null;
        field4831 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IBI)I")
    public static final int method1865(int arg0, byte arg1, int arg2) {
        field4829++;
        if (arg1 == -42) {
            int var3 = arg2 * 57 + arg0;
            int var4 = var3 ^ var3 << 13;
            int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
            return var5 >> 19 & 0xFF;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(I[B)V")
    public class273(int arg0, byte[] arg1) {
        this.field4823 = arg0;
        class225 var3 = new class225(arg1);
        this.field4827 = var3.method1580(-115);
        this.field4824 = new int[this.field4827][];
        this.field4830 = new boolean[this.field4827];
        this.field4826 = new int[this.field4827];
        for (int var4 = 0; var4 < this.field4827; var4++) {
            this.field4826[var4] = var3.method1580(-28);
        }
        for (int var5 = 0; var5 < this.field4827; var5++) {
            this.field4830[var5] = var3.method1580(-110) == 1;
        }
        for (int var6 = 0; var6 < this.field4827; var6++) {
            this.field4824[var6] = new int[var3.method1580(-82)];
        }
        for (int var7 = 0; var7 < this.field4827; var7++) {
            for (int var8 = 0; var8 < this.field4824[var7].length; var8++) {
                this.field4824[var7][var8] = var3.method1580(-83);
            }
        }
    }
}
