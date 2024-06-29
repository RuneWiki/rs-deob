import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 {

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "[Lic;")
    public static class59[] field120 = new class59[500];

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "Lic;")
    public static class59 field121 = class59.method433(0, "blinken1:");

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "[I")
    public static int[] field125 = new int[100];

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "J")
    public static long field123;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "[[[B")
    public static byte[][][] field124;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
    public static void method29(byte arg0) {
        field125 = null;
        field121 = null;
        field124 = null;
        if (arg0 > -109) {
            method31(53, 119, 35);
        }
        field120 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII)V")
    public static final void method30(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 52 / ((arg3 + 5) / 50);
        field129++;
        for (int var5 = 0; var5 < 8; var5++) {
            for (int var8 = 0; var8 < 8; var8++) {
                class26.field695[arg2][arg0 + var5][arg1 + var8] = 0;
            }
        }
        if (arg0 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class26.field695[arg2][arg0][arg1 + var6] = class26.field695[arg2][arg0 - 1][arg1 + var6];
            }
        }
        if (arg1 > 0) {
            for (int var7 = 1; var7 < 8; var7++) {
                class26.field695[arg2][arg0 + var7][arg1] = class26.field695[arg2][arg0 + var7][arg1 - 1];
            }
        }
        if (arg0 > 0 && class26.field695[arg2][arg0 - 1][arg1] != 0) {
            class26.field695[arg2][arg0][arg1] = class26.field695[arg2][arg0 - 1][arg1];
        } else if (arg1 > 0 && class26.field695[arg2][arg0][arg1 - 1] != 0) {
            class26.field695[arg2][arg0][arg1] = class26.field695[arg2][arg0][arg1 - 1];
        } else if (arg0 > 0 && arg1 > 0 && class26.field695[arg2][arg0 - 1][arg1 - 1] != 0) {
            class26.field695[arg2][arg0][arg1] = class26.field695[arg2][arg0 - 1][arg1 - 1];
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)V")
    public static final void method31(int arg0, int arg1, int arg2) {
        field127++;
        long var3 = (long) ((arg1 << 16) + arg0);
        class35 var5 = (class35) class61.field1557.method35(var3, 105);
        if (var5 != null) {
            if (arg2 != -32904304) {
                method31(-3, 48, 105);
            }
            class85.field2139.method828(var5, -57);
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V")
    public static final void method32(byte arg0) {
        try {
            if (class54.field1337 == null) {
                class54.field1337 = new class55(class102.field2497, class46.method358(new class59[] { class16.field306, class38.field996, class8.field168 }, (byte) -75).method449(127));
            } else {
                byte[] var1 = class54.field1337.method407(true);
                if (var1 != null) {
                    class157 var2 = new class157(var1);
                    class137.field3060 = var2.method1161((byte) 60);
                    class99.field2463 = new class2[class137.field3060];
                    for (int var3 = 0; var3 < class137.field3060; var3++) {
                        class2 var4 = class99.field2463[var3] = new class2();
                        int var5 = var2.method1161((byte) 60);
                        var4.field40 = (var5 & 0x8000) != 0;
                        var4.field38 = var5 & 0x7FFF;
                        var4.field46 = var2.method1214((byte) -46);
                        var4.field33 = var2.method1178((byte) -33);
                        var4.field50 = var3;
                        var4.field39 = class47.method372(108, var4.field46);
                    }
                    class136.method1041((byte) -91, 0, class99.field2463, class99.field2463.length - 1, class115.field2714, class75.field1857);
                    class54.field1337 = null;
                    class136.field3021 = true;
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class54.field1337 = null;
        }
        if (arg0 != 96) {
            field120 = null;
        }
        field130++;
    }
}
