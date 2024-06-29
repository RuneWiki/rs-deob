import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class186 extends class83 {

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public int field3012;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
    public int field3021;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "[[I")
    public int[][] field3019;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "[Z")
    public boolean[] field3018;

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "[I")
    public int[] field3022;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "[I")
    public int[] field3011;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "[I")
    public static int[] field3015 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "Z")
    public static boolean field3017 = false;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "[[S")
    public static short[][] field3016 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "Lvh;")
    public static class108 field3020;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public static void method1222(byte arg0) {
        int var1 = 28 % ((arg0 - 13) / 45);
        field3015 = null;
        field3020 = null;
        field3016 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZ)V")
    public static final void method1223(int arg0, boolean arg1) {
        if (arg0 != 6554) {
            return;
        }
        for (class57 var2 = (class57) class254.field4154.method379(arg0 ^ 0x151); var2 != null; var2 = (class57) class254.field4154.method378(arg0 - 6524)) {
            if (var2.field1001 != null) {
                class10.field149.method259(var2.field1001);
                var2.field1001 = null;
            }
            if (var2.field1008 != null) {
                class10.field149.method259(var2.field1008);
                var2.field1008 = null;
            }
            var2.method547(10026);
        }
        if (arg1) {
            for (class57 var3 = (class57) class155.field2591.method379(6347); var3 != null; var3 = (class57) class155.field2591.method378(106)) {
                if (var3.field1001 != null) {
                    class10.field149.method259(var3.field1001);
                    var3.field1001 = null;
                }
                var3.method547(arg0 ^ 0x3EB0);
            }
            for (class57 var4 = (class57) class58.field1018.method782(0); var4 != null; var4 = (class57) class58.field1018.method788(true)) {
                if (var4.field1001 != null) {
                    class10.field149.method259(var4.field1001);
                    var4.field1001 = null;
                }
                var4.method547(arg0 ^ 0x3EB0);
            }
        }
        field3013++;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(I[B)V")
    public class186(int arg0, byte[] arg1) {
        this.field3012 = arg0;
        class101 var3 = new class101(arg1);
        this.field3021 = var3.method669((byte) 36);
        this.field3019 = new int[this.field3021][];
        this.field3018 = new boolean[this.field3021];
        this.field3022 = new int[this.field3021];
        this.field3011 = new int[this.field3021];
        for (int var4 = 0; var4 < this.field3021; var4++) {
            this.field3011[var4] = var3.method669((byte) 36);
        }
        for (int var5 = 0; var5 < this.field3021; var5++) {
            this.field3018[var5] = var3.method669((byte) 36) == 1;
        }
        for (int var6 = 0; var6 < this.field3021; var6++) {
            this.field3022[var6] = var3.method677(false);
        }
        for (int var7 = 0; var7 < this.field3021; var7++) {
            this.field3019[var7] = new int[var3.method669((byte) 36)];
        }
        for (int var8 = 0; var8 < this.field3021; var8++) {
            for (int var9 = 0; var9 < this.field3019[var8].length; var9++) {
                this.field3019[var8][var9] = var3.method669((byte) 36);
            }
        }
    }
}
