import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class149 extends class151 {

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public int field2676;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
    private int field2683;

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "[[I")
    public int[][] field2682;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "[I")
    public int[] field2685;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "[Z")
    public boolean[] field2687;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "[Lfj;")
    public static class222[] field2679 = new class222[4];

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "I")
    public static int field2680 = 0;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
    public static int field2681 = 0;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "I")
    public static int field2686 = 0;

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "Lbd;")
    public static class162 field2684 = class17.method142(0, "");

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "Lli;")
    public static class18 field2678 = new class18();

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "Lbd;")
    public static class162 field2690 = class17.method142(0, "Wordpack geladen)3");

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "F")
    public static float field2689;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I[I[J)V", line = 4)
    public static final void method1178(int arg0, int[] arg1, long[] arg2) {
        field2677++;
        class313.method2137(arg1, arg0, arg2, arg2.length - 1, -114);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 16)
    public static void method1179(int arg0) {
        field2684 = null;
        field2679 = null;
        if (arg0 > -94) {
            field2681 = 73;
        }
        field2690 = null;
        field2678 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIBII)V", line = 39)
    public static final void method1180(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field2688++;
        if (arg3 >= class303.field5106 && arg3 <= class298.field4989) {
            int var5 = class19.method172(class112.field2028, arg0, class82.field1426, false);
            int var6 = class19.method172(class112.field2028, arg1, class82.field1426, false);
            class268.method1837(var6, var5, arg4, true, arg3);
        }
        if (arg2 < 96) {
            method1179(-61);
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(I[B)V", line = 75)
    public class149(int arg0, byte[] arg1) {
        this.field2676 = arg0;
        class94 var3 = new class94(arg1);
        this.field2683 = var3.method756(915905888);
        this.field2682 = new int[this.field2683][];
        this.field2685 = new int[this.field2683];
        this.field2687 = new boolean[this.field2683];
        for (int var4 = 0; var4 < this.field2683; var4++) {
            this.field2685[var4] = var3.method756(915905888);
        }
        for (int var5 = 0; var5 < this.field2683; var5++) {
            this.field2687[var5] = var3.method756(915905888) == 1;
        }
        for (int var6 = 0; var6 < this.field2683; var6++) {
            this.field2682[var6] = new int[var3.method756(915905888)];
        }
        for (int var7 = 0; var7 < this.field2683; var7++) {
            for (int var8 = 0; var8 < this.field2682[var7].length; var8++) {
                this.field2682[var7][var8] = var3.method756(915905888);
            }
        }
    }
}
