import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class355 extends class188 {

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    public int field5645;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public int field5640;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "[[I")
    public int[][] field5649;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "[I")
    public int[] field5650;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "[I")
    public int[] field5646;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "[Z")
    public boolean[] field5643;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    public static int field5641 = 0;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "[J")
    public static long[] field5651 = new long[32];

    @OriginalMember(owner = "client!al", name = "r", descriptor = "Ljava/lang/String;")
    public static String field5647 = "Starting 3d Library";

    @OriginalMember(owner = "client!al", name = "s", descriptor = "Ljava/lang/String;")
    public static String field5648 = "level: ";

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "Lnk;")
    public static class16 field5644;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III)Z", line = 8)
    public static final boolean method2451(int arg0, int arg1, int arg2) {
        int var3 = class231.field3495[arg0][arg1][arg2];
        if (-class262.field4160 == var3) {
            return false;
        } else if (class262.field4160 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class186.method1282(var4 + 1, class72.field902[arg0][arg1][arg2], var5 + 1) && class186.method1282(var4 + 128 - 1, class72.field902[arg0][arg1 + 1][arg2], var5 + 1) && class186.method1282(var4 + 128 - 1, class72.field902[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class186.method1282(var4 + 1, class72.field902[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class231.field3495[arg0][arg1][arg2] = class262.field4160;
                return true;
            } else {
                class231.field3495[arg0][arg1][arg2] = -class262.field4160;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lnk;ILnk;)V", line = 33)
    public static final void method2452(class16 arg0, int arg1, class16 arg2) {
        class337.field5379 = arg0;
        if (arg1 > 21) {
            field5642++;
            class196.field2975 = arg2;
            class55.field660 = class196.field2975.method110(false, 3);
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V", line = 64)
    public static void method2453(byte arg0) {
        field5651 = null;
        field5648 = null;
        field5644 = null;
        field5647 = null;
        int var1 = -117 / ((-arg0 - 22) / 41);
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(I[B)V", line = 80)
    public class355(int arg0, byte[] arg1) {
        this.field5645 = arg0;
        class143 var3 = new class143(arg1);
        this.field5640 = var3.method1043(true);
        this.field5649 = new int[this.field5640][];
        this.field5650 = new int[this.field5640];
        this.field5646 = new int[this.field5640];
        this.field5643 = new boolean[this.field5640];
        for (int var4 = 0; var4 < this.field5640; var4++) {
            this.field5650[var4] = var3.method1043(true);
        }
        for (int var5 = 0; var5 < this.field5640; var5++) {
            this.field5643[var5] = var3.method1043(true) == 1;
        }
        for (int var6 = 0; var6 < this.field5640; var6++) {
            this.field5646[var6] = var3.method1051(1);
        }
        for (int var7 = 0; var7 < this.field5640; var7++) {
            this.field5649[var7] = new int[var3.method1043(true)];
        }
        for (int var8 = 0; var8 < this.field5640; var8++) {
            for (int var9 = 0; var9 < this.field5649[var8].length; var9++) {
                this.field5649[var8][var9] = var3.method1043(true);
            }
        }
    }
}
