import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class338 {

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "I")
    public int field5354;

    @OriginalMember(owner = "client!vq", name = "l", descriptor = "[I")
    public int[] field5358;

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "[I")
    public int[] field5353;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
    public static int field5349 = 0;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "[[B")
    public static byte[][] field5352 = new byte[50][];

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "Lpg;")
    public static class492 field5351 = new class492(38, 28);

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "Lns;")
    public static class438 field5355;

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "Lpg;")
    public static class492 field5357;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
    public static void method2186(byte arg0) {
        field5351 = null;
        int var1 = 56 % ((arg0 + 22) / 60);
        field5355 = null;
        field5357 = null;
        field5352 = null;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(BLtf;[[B)V")
    public static final void method2187(byte arg0, class167 arg1, byte[][] arg2) {
        field5348++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = -100 % ((arg0 + 85) / 41);
        int var5 = arg2.length;
        for (int var6 = 0; var6 < var5; var6++) {
            byte[] var11 = arg2[var6];
            if (var11 != null) {
                class91 var12 = new class91(var11);
                int var13 = class253.field3509[var6] >> 8;
                int var14 = class253.field3509[var6] & 0xFF;
                int var15 = var13 * 64 - class82.field1105;
                int var16 = var14 * 64 - class437.field6477;
                class300.method1929((byte) -4);
                arg1.method2150(class444.field6605, class437.field6477, var16, var15, class82.field1105, var12, -8060);
                arg1.method1176(17459, var3, class337.field5242, var15, var16, var12);
                if (!arg1.field5190 && (class10.field163 / 8) == var13 && (class77.field1036 / 8) == var14 && var3[0] != -1) {
                    class429.field6384 = class296.field4391.method393(var3[2], class496.field7258, var3[3], var3[0], -91, var3[1]);
                    class21.field336 = var3[4];
                }
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = (class253.field3509[var7] >> 8) * 64 - class82.field1105;
            int var9 = (class253.field3509[var7] & 0xFF) * 64 - class437.field6477;
            byte[] var10 = arg2[var7];
            if (var10 == null && class77.field1036 < 800) {
                class300.method1929((byte) -4);
                arg1.method2155(64, 64, 3532, var8, var9);
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIB)I")
    public static final int method2188(int arg0, int arg1, int arg2, byte arg3) {
        field5350++;
        if (class369.field5668 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg0 - class135.field1969;
        int var7 = arg2 - class135.field1974;
        class5 var8 = (class5) class135.field1967.method1970(64);
        int var9 = -92 / ((-arg3 - 55) / 52);
        while (var8 != null) {
            if (var8.field65 == arg1) {
                int var10 = var8.field69;
                int var11 = var8.field66;
                int var12 = class135.field1969 + var10 << 14 | class135.field1974 + var11;
                int var13 = (var6 - var10) * (var6 - var10) + (var7 - var11) * (var7 - var11);
                if (var4 < 0 || var13 < var5) {
                    var5 = var13;
                    var4 = var12;
                }
            }
            var8 = (class5) class135.field1967.method1960(24);
        }
        return var4;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(BLjb;)V")
    public static final void method2189(byte arg0, class499 arg1) {
        field5347++;
        if (class336.field5233 == arg1.field7370) {
            class326.field5002[arg1.field7383] = true;
        }
        if (arg0 <= 76) {
            method2188(63, 54, 29, (byte) -10);
        }
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(I)V")
    public class338(int arg0) {
        this.field5354 = arg0;
        this.field5358 = new int[this.field5354];
        this.field5353 = new int[this.field5354];
    }
}
