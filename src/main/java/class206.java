import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class206 extends class128 {

    @OriginalMember(owner = "client!rl", name = "Q", descriptor = "I")
    private int field2887 = 1365;

    @OriginalMember(owner = "client!rl", name = "L", descriptor = "I")
    private int field2882 = 0;

    @OriginalMember(owner = "client!rl", name = "O", descriptor = "I")
    private int field2885 = 0;

    @OriginalMember(owner = "client!rl", name = "M", descriptor = "I")
    private int field2883 = 20;

    @OriginalMember(owner = "client!rl", name = "T", descriptor = "Ljava/lang/String;")
    public static String field2890 = "yellow:";

    @OriginalMember(owner = "client!rl", name = "V", descriptor = "[I")
    public static int[] field2892 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!rl", name = "I", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!rl", name = "N", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!rl", name = "U", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!rl", name = "J", descriptor = "Llc;")
    public static class175 field2881;

    @OriginalMember(owner = "client!rl", name = "S", descriptor = "Llc;")
    public static class175 field2889;

    @OriginalMember(owner = "client!rl", name = "R", descriptor = "[I")
    public static int[] field2888;

    @OriginalMember(owner = "client!rl", name = "P", descriptor = "[[I")
    public static int[][] field2886;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(BI)[I", line = 11)
    public final int[] method126(byte arg0, int arg1) {
        int[] var3 = this.field1748.method902(arg1, true);
        if (arg0 <= 100) {
            return (int[]) null;
        }
        field2891++;
        if (this.field1748.field1878) {
            for (int var4 = 0; var4 < class10.field141; var4++) {
                int var5 = (class334.field5157[var4] << 12) / this.field2887 + this.field2885;
                int var6 = (class49.field600[arg1] << 12) / this.field2887 + this.field2882;
                int var7 = var6;
                int var8 = var5;
                int var9 = var5;
                int var10 = var6 * var6 >> 12;
                int var11 = var6;
                int var12 = var5 * var5 >> 12;
                int var13;
                for (var13 = 0; var10 + var12 < 16384 && this.field2883 > var13; var13++) {
                    var11 = (var9 * var11 >> 12) * 2 + var7;
                    var9 = var12 + var8 - var10;
                    var12 = var9 * var9 >> 12;
                    var10 = var11 * var11 >> 12;
                }
                var3[var4] = var13 < (this.field2883 - 1) ? (var13 << 12) / this.field2883 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)V", line = 69)
    public static void method1398(byte arg0) {
        field2892 = null;
        field2888 = null;
        field2886 = (int[][]) null;
        if (arg0 > -84) {
            method1399(-73, 84, 111);
        }
        field2890 = null;
        field2881 = null;
        field2889 = null;
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(III)V", line = 87)
    public static final void method1399(int arg0, int arg1, int arg2) {
        class226.field3235[arg0] = arg1;
        field2884++;
        if (arg2 > -7) {
            method1399(110, -72, -39);
        }
        class231 var3 = (class231) class187.field2697.method1537((long) arg0, -22708);
        if (var3 == null) {
            class231 var4 = new class231(class200.method1375(-16185) + 500L);
            class187.field2697.method1541(false, var4, (long) arg0);
        } else {
            var3.field3372 = class200.method1375(-16185) + 500L;
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V", line = 118)
    public class206() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lp;II)V", line = 140)
    public final void method107(class107 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field2887 = arg0.method624(14612);
        } else if (arg1 == 1) {
            this.field2883 = arg0.method624(14612);
        } else if (arg1 == 2) {
            this.field2885 = arg0.method624(14612);
        } else if (arg1 == 3) {
            this.field2882 = arg0.method624(14612);
        }
        if (arg2 >= -85) {
            field2892 = (int[]) null;
        }
        field2880++;
    }
}
