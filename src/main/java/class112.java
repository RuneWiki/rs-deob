import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class112 {

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Z")
    public boolean field2689 = true;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public int field2693;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public int field2688;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public int field2681;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public int field2690;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public int field2684;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public int field2687;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Lqd;")
    public static class115 field2685 = new class115(64);

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "Lid;")
    public static class60 field2695 = class11.method72("rot:", (byte) 100);

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Ljd;")
    public static class66 field2686 = new class66();

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public static int field2696 = 0;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "J")
    public static long field2698;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "Lie;")
    public static class61 field2697;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZLe;)V")
    public static final void method902(boolean arg0, class29 arg1) {
        field2694++;
        short var2 = 256;
        for (int var3 = 0; var3 < class48.field1263.length; var3++) {
            class48.field1263[var3] = 0;
        }
        if (arg0) {
            method902(false, null);
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var2 * 128.0D * Math.random());
            class48.field1263[var16] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class64.field1606[var15] = (class48.field1263[var15 - 1] + class48.field1263[var15 + 128] + class48.field1263[var15 + 1] + class48.field1263[var15 + -128]) / 4;
                }
            }
            int[] var13 = class48.field1263;
            class48.field1263 = class64.field1606;
            class64.field1606 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field695; var7++) {
            for (int var8 = 0; var8 < arg1.field698; var8++) {
                if (arg1.field693[var6++] != 0) {
                    int var9 = var7 + arg1.field696 + 16;
                    int var10 = var8 + arg1.field692 + 16;
                    int var11 = (var9 << 7) + var10;
                    class48.field1263[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lid;I)I")
    public static final int method903(class60 arg0, int arg1) {
        field2692++;
        if (class145.field3273 == 1) {
            return 7;
        } else if (arg0.method450((byte) 75, class86.field2153)) {
            return 1;
        } else if (arg0.method450((byte) 125, class9.field153)) {
            return 1;
        } else if (arg0.method450((byte) 94, class31.field736)) {
            return 2;
        } else if (arg0.method450((byte) -83, class141.field3212)) {
            return 2;
        } else if (arg0.method450((byte) 53, class50.field1290)) {
            return 3;
        } else if (arg0.method450((byte) 117, class25.field620)) {
            return 4;
        } else if (arg1 != -18746) {
            return 93;
        } else if (arg0.method450((byte) 72, class152.field3412)) {
            return 4;
        } else if (arg0.method450((byte) -56, class2.field52)) {
            return 5;
        } else if (arg0.method450((byte) -73, class48.field1257)) {
            return 6;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
    public static void method904(byte arg0) {
        field2697 = null;
        field2686 = null;
        if (arg0 != 61) {
            field2697 = null;
        }
        field2695 = null;
        field2685 = null;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2693 = arg1;
        this.field2688 = arg5;
        this.field2681 = arg3;
        this.field2690 = arg2;
        this.field2684 = arg0;
        this.field2689 = arg6;
        this.field2687 = arg4;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB)V")
    public static final void method905(int arg0, byte arg1) {
        if (class106.field2626 == 0) {
            class23.field567.method122(arg0, false);
        } else {
            class14.field291 = arg0;
        }
        field2683++;
        if (arg1 > -2) {
            method904((byte) 116);
        }
    }
}
