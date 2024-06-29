import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class31 extends class89 {

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    private int field669;

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "[[I")
    public int[][] field676;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "[Z")
    private boolean[] field668;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "[I")
    public int[] field675;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "Lqe;")
    public static class179 field670 = class206.method1380("(Z", (byte) -127);

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "Lqe;")
    public static class179 field667 = class206.method1380(" )2> <col=ffff00>", (byte) -127);

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "Lqe;")
    public static class179 field672 = class206.method1380("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", (byte) -126);

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "I")
    public static int field678 = -1;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "Lqe;")
    public static class179 field679 = class206.method1380("<br>", (byte) -126);

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "Z")
    public static boolean field680 = false;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "[I")
    public static int[] field674;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V")
    public static void method202(int arg0) {
        int var1 = -62 / ((90 - arg0) / 34);
        field679 = null;
        field674 = null;
        field670 = null;
        field667 = null;
        field672 = null;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(I[B)V")
    public class31(int arg0, byte[] arg1) {
        this.field671 = arg0;
        class185 var3 = new class185(arg1);
        this.field669 = var3.method1243(3);
        this.field676 = new int[this.field669][];
        this.field668 = new boolean[this.field669];
        this.field675 = new int[this.field669];
        for (int var4 = 0; var4 < this.field669; var4++) {
            this.field675[var4] = var3.method1243(3);
        }
        for (int var5 = 0; var5 < this.field669; var5++) {
            this.field668[var5] = var3.method1243(3) == 1;
        }
        for (int var6 = 0; var6 < this.field669; var6++) {
            this.field676[var6] = new int[var3.method1243(3)];
        }
        for (int var7 = 0; var7 < this.field669; var7++) {
            for (int var8 = 0; var8 < this.field676[var7].length; var8++) {
                this.field676[var7][var8] = var3.method1243(3);
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIII)Lja;")
    public static final class98 method203(int arg0, int arg1, int arg2, int arg3) {
        field677++;
        class98 var4 = new class98();
        var4.field1831 = arg0;
        if (arg2 >= -116) {
            return null;
        }
        var4.field1829 = arg1;
        class36.field797.method914((long) arg3, var4, true);
        class164.method1051((byte) 111, arg0);
        class6 var5 = class87.method580(arg3, 125);
        if (var5 != null) {
            class139.method880(var5, 103);
        }
        if (class120.field2249 != null) {
            class139.method880(class120.field2249, 107);
            class120.field2249 = null;
        }
        class113.field2118 = 0;
        class182.field3358 = false;
        class143.method900(class186.field3459, class183.field3378, (byte) -100, class49.field1051, class202.field3749);
        if (var5 != null) {
            class54.method380(var5, (byte) 25);
        }
        class237.method1541(arg0, -128);
        if (class159.field2899 != -1) {
            class193.method1296(class159.field2899, (byte) 96, 1);
        }
        return var4;
    }
}
