import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class192 extends class80 {

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
    public int field3185;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
    private int field3181;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "[I")
    public int[] field3176;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "[Z")
    public boolean[] field3184;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "[[I")
    public int[][] field3175;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field3172 = 0;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "S")
    public static short field3178 = 256;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "Z")
    public static boolean field3180 = false;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "[[I")
    public static int[][] field3179 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "Lph;")
    public static class229 field3170 = class266.method1858(" )2>", 0);

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "Lph;")
    public static class229 field3182 = class266.method1858("gelb:", 0);

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "[[[I")
    public static int[][][] field3174;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V", line = 43)
    public static void method1348(int arg0) {
        field3170 = null;
        field3182 = null;
        if (arg0 != 0) {
            field3180 = true;
        }
        field3174 = (int[][][]) null;
        field3179 = (int[][]) null;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(I[B)V", line = 68)
    public class192(int arg0, byte[] arg1) {
        this.field3185 = arg0;
        class164 var3 = new class164(arg1);
        this.field3181 = var3.method1178(8);
        this.field3176 = new int[this.field3181];
        this.field3184 = new boolean[this.field3181];
        this.field3175 = new int[this.field3181][];
        for (int var4 = 0; var4 < this.field3181; var4++) {
            this.field3176[var4] = var3.method1178(8);
        }
        for (int var5 = 0; var5 < this.field3181; var5++) {
            this.field3184[var5] = var3.method1178(8) == 1;
        }
        for (int var6 = 0; var6 < this.field3181; var6++) {
            this.field3175[var6] = new int[var3.method1178(8)];
        }
        for (int var7 = 0; var7 < this.field3181; var7++) {
            for (int var8 = 0; var8 < this.field3175[var7].length; var8++) {
                this.field3175[var7][var8] = var3.method1178(8);
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZBI)V", line = 122)
    public static final void method1349(int arg0, boolean arg1, byte arg2, int arg3) {
        field3183++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        if (arg2 < 35) {
            field3173 = -73;
        }
        class255.field4264 = arg3;
        class222.field3657 = arg1;
        class110.field1861 = arg0;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLri;I)Lph;", line = 138)
    public static final class229 method1350(byte arg0, class301 arg1, int arg2) {
        field3171++;
        if (!class84.method624(false, client.method2168(arg1), arg2) && arg1.field5036 == null) {
            return null;
        } else if (arg1.field4902 == null || arg2 >= arg1.field4902.length || arg1.field4902[arg2] == null || arg1.field4902[arg2].method1638((byte) 47).method1642(26) == 0) {
            return class40.field647 ? class248.method1746(arg0 ^ 0x2118, new class229[] { class141.field2280, class50.method354(0, arg2) }) : null;
        } else {
            if (arg0 != 72) {
                method1350((byte) -86, (class301) null, 109);
            }
            return arg1.field4902[arg2];
        }
    }
}
