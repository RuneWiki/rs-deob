import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class177 {

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "[I")
    public static int[] field3276 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "Lsg;")
    public static class30 field3280 = class167.method1221((byte) 33, "um");

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "Z")
    public static boolean field3277 = true;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public int field3278;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public int field3279;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public int field3282;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public int field3284;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "J")
    public long field3285;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "Lni;")
    public class20 field3281;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "Lni;")
    public class20 field3286;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "Lni;")
    public class20 field3290;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "[[[I")
    public static int[][][] field3289;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)I")
    public static final int method1294(int arg0, byte arg1) {
        field3287++;
        int var2 = 34 % ((15 - arg1) / 47);
        int var8 = arg0 - 1;
        int var3 = var8 | var8 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return var7 + 1;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public static void method1295(int arg0) {
        field3280 = null;
        if (arg0 == -25284) {
            field3289 = null;
            field3276 = null;
        }
    }
}
