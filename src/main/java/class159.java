import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class159 extends class155 {

    @OriginalMember(owner = "client!hf", name = "E", descriptor = "I")
    public int field2466 = -1;

    @OriginalMember(owner = "client!hf", name = "I", descriptor = "Z")
    public boolean field2470 = false;

    @OriginalMember(owner = "client!hf", name = "D", descriptor = "Z")
    public boolean field2465 = false;

    @OriginalMember(owner = "client!hf", name = "J", descriptor = "Ljava/lang/String;")
    public static String field2471 = "Loaded defaults";

    @OriginalMember(owner = "client!hf", name = "F", descriptor = "Lpi;")
    public static class201 field2467 = new class201(500);

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field2478 = "scroll:";

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "Lie;")
    public static class2 field2475 = new class2();

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "Lpi;")
    public static class201 field2480 = new class201(64);

    @OriginalMember(owner = "client!hf", name = "G", descriptor = "I")
    public int field2468;

    @OriginalMember(owner = "client!hf", name = "H", descriptor = "I")
    public int field2469;

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "I")
    public int field2473;

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "I")
    public int field2474;

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "I")
    public int field2476;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!hf", name = "U", descriptor = "[B")
    public static byte[] field2482;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)V")
    public static final void method1158(byte arg0) {
        field2477++;
        int var1 = class71.field1125;
        int var2 = class171.field2587;
        int var3 = class137.field2226 - 3;
        int var4 = class253.field3817;
        byte var5 = 20;
        if (class293.field4664 == null || class23.field251 == null) {
            if (class191.field2827.method1885(2, class106.field1810) && class191.field2827.method1885(2, class299.field4826)) {
                class293.field4664 = class302.method2059(class191.field2827, 30858, 0, class106.field1810);
                class23.field251 = class302.method2059(class191.field2827, arg0 ^ 0xFFFF8754, 0, class299.field4826);
            } else {
                class130.method1003(var1, var2, var4, var5, class43.field568, 256 - class89.field1436);
            }
        }
        if (class293.field4664 != null && class23.field251 != null) {
            int var6 = (var4 - (class23.field251.field1585 * 2)) / class293.field4664.field1585;
            for (int var7 = 0; var7 < var6; var7++) {
                class293.field4664.method726(class293.field4664.field1585 * var7 + class23.field251.field1585 + var1, var2);
            }
            class23.field251.method726(var1, var2);
            class23.field251.method731(var1 + var4 - class23.field251.field1585, var2);
        }
        if (arg0 != -34) {
            return;
        }
        class208.field3084.method72(class143.field2310, var1 + 3, var2 - -14, class44.field575, -1);
        class130.method1003(var1, var2 + var5, var4, var3 - var5, class43.field568, 256 - class89.field1436);
        int var8 = class44.field584;
        int var9 = class204.field3017;
        for (int var10 = 0; var10 < class147.field2360; var10++) {
            int var18 = (class147.field2360 - var10 - 1) * 15 + var5 + var2 + 13;
            if (var1 < var9 && var9 < var1 + var4 && (var18 - 13) < var8 && var8 < var18 + 3) {
                class130.method1003(var1, var18 - 12, var4, 15, class296.field4760, 256 - class138.field2243);
            }
        }
        if ((class26.field290 == null || class165.field2537 == null || class305.field4935 == null) && class191.field2827.method1885(2, class102.field1771) && class191.field2827.method1885(2, class125.field2120) && class191.field2827.method1885(arg0 ^ 0xFFFFFFDC, class242.field3549)) {
            class26.field290 = class302.method2059(class191.field2827, 30858, 0, class102.field1771);
            class165.field2537 = class302.method2059(class191.field2827, 30858, 0, class125.field2120);
            class305.field4935 = class302.method2059(class191.field2827, 30858, 0, class242.field3549);
        }
        if (class26.field290 != null && class165.field2537 != null && class305.field4935 != null) {
            int var11 = (var4 - (class305.field4935.field1585 * 2)) / class26.field290.field1585;
            for (int var12 = 0; var12 < var11; var12++) {
                class26.field290.method726(class305.field4935.field1585 + (class26.field290.field1585 * var12) + var1, var2 - -var3 + -class26.field290.field1586);
            }
            int var13 = (var3 - var5 - class305.field4935.field1586) / class165.field2537.field1586;
            for (int var14 = 0; var14 < var13; var14++) {
                class165.field2537.method726(var1, class165.field2537.field1586 * var14 + var5 + var2);
                class165.field2537.method731(var1 + var4 - class165.field2537.field1585, class165.field2537.field1586 * var14 + (var2 - -var5));
            }
            class305.field4935.method726(var1, var2 + var3 - class305.field4935.field1586);
            class305.field4935.method731(var1 - (class305.field4935.field1585 - var4), -class305.field4935.field1586 + var3 + var2);
        }
        for (int var15 = 0; var15 < class147.field2360; var15++) {
            int var16 = (class147.field2360 - var15 - 1) * 15 + var2 + var5 + 13;
            int var17 = class44.field575;
            if (var9 > var1 && var1 + var4 > var9 && var8 > var16 - 13 && var16 + 3 > var8) {
                var17 = class301.field4880;
            }
            class208.field3084.method72(class207.method1462(var15, -1), var1 + 3, var16, var17, 0);
        }
        class191.method1359((byte) -102, class71.field1125, class171.field2587, class253.field3817, class137.field2226);
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(B)V")
    public static void method1159(byte arg0) {
        if (arg0 <= 54) {
            method1158((byte) 66);
        }
        field2478 = null;
        field2471 = null;
        field2482 = null;
        field2480 = null;
        field2475 = null;
        field2467 = null;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(III)V")
    public static final void method1160(int arg0, int arg1, int arg2) {
        field2472++;
        if (arg1 < 91) {
            field2467 = null;
        }
        class279 var3 = class111.method844(arg0, 12, -1780180960);
        var3.method1928(false);
        var3.field4505 = arg2;
    }
}
