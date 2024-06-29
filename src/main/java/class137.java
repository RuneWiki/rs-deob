import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class137 extends class125 {

    @OriginalMember(owner = "client!te", name = "u", descriptor = "I")
    public int field3133;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    private int field3139;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "[[I")
    public int[][] field3142;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "[I")
    public int[] field3132;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "Lod;")
    private static class101 field3126 = class46.method335(-107, "Username: ");

    @OriginalMember(owner = "client!te", name = "s", descriptor = "Lod;")
    public static class101 field3131 = field3126;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "I")
    public static int field3141 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "Lod;")
    public static class101 field3136 = class46.method335(93, "gelb:");

    @OriginalMember(owner = "client!te", name = "w", descriptor = "Lod;")
    private static class101 field3135 = class46.method335(-89, "Enter your username (V password)3");

    @OriginalMember(owner = "client!te", name = "y", descriptor = "Lod;")
    public static class101 field3137 = field3135;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "[[[B")
    public static byte[][][] field3128;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)Lwb;")
    public static final class155 method1045(byte arg0, int arg1) {
        field3129++;
        class155 var2 = (class155) class92.field1979.method140(true, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 > -15) {
            field3135 = null;
        }
        byte[] var3 = class25.field653.method114((byte) -100, 10, arg1);
        class155 var4 = new class155();
        var4.field3529 = arg1;
        if (var3 != null) {
            var4.method1196(new class138(var3), -1);
        }
        var4.method1207((byte) 102);
        if (var4.field3517 != -1) {
            var4.method1203(method1045((byte) -53, var4.field3572), true, method1045((byte) -126, var4.field3517));
        }
        if (!class153.field3499 && var4.field3558) {
            var4.field3540 = null;
            var4.field3570 = class57.field1336;
            var4.field3523 = null;
            var4.field3520 = 0;
        }
        class92.field1979.method141(var4, (long) arg1, (byte) 70);
        return var4;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IBI)V")
    public static final void method1046(int arg0, byte arg1, int arg2) {
        long var3 = (long) ((arg0 << 16) + arg2);
        class87 var5 = (class87) class119.field2617.method1141(var3, -1);
        if (arg1 != 1) {
            method1048((byte) -98, 106);
        }
        field3138++;
        if (var5 != null) {
            class67.field1504.method684(var5, (byte) 63);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    public static void method1047(byte arg0) {
        field3137 = null;
        field3135 = null;
        if (arg0 <= 85) {
            method1046(21, (byte) 69, 16);
        }
        field3136 = null;
        field3131 = null;
        field3126 = null;
        field3128 = null;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(BI)Lhe;")
    public static final class54 method1048(byte arg0, int arg1) {
        field3127++;
        if (arg0 != -86) {
            field3141 = 0;
        }
        class54 var2 = (class54) class126.field2793.method140(true, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class158.field3628.method114((byte) 113, 1, arg1);
        class54 var4 = new class54();
        if (var3 != null) {
            var4.method385(arg1, 120, new class138(var3));
        }
        var4.method386((byte) 109);
        class126.field2793.method141(var4, (long) arg1, (byte) -122);
        return var4;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(I[B)V")
    public class137(int arg0, byte[] arg1) {
        this.field3133 = arg0;
        class138 var3 = new class138(arg1);
        this.field3139 = var3.method1055(118);
        this.field3142 = new int[this.field3139][];
        this.field3132 = new int[this.field3139];
        for (int var4 = 0; var4 < this.field3139; var4++) {
            this.field3132[var4] = var3.method1055(114);
        }
        for (int var5 = 0; var5 < this.field3139; var5++) {
            this.field3142[var5] = new int[var3.method1055(124)];
        }
        for (int var6 = 0; var6 < this.field3139; var6++) {
            for (int var7 = 0; var7 < this.field3142[var6].length; var7++) {
                this.field3142[var6][var7] = var3.method1055(118);
            }
        }
    }
}
