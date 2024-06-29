import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class140 extends class22 {

    @OriginalMember(owner = "client!tk", name = "V", descriptor = "Ljava/lang/Object;")
    private Object field2469;

    @OriginalMember(owner = "client!tk", name = "P", descriptor = "[I")
    public static int[] field2463 = new int[2048];

    @OriginalMember(owner = "client!tk", name = "O", descriptor = "[I")
    public static int[] field2462 = new int[1000];

    @OriginalMember(owner = "client!tk", name = "R", descriptor = "Lke;")
    public static class256 field2465 = class316.method2202("Suche nach Updates )2 ", 27626);

    @OriginalMember(owner = "client!tk", name = "U", descriptor = "[Z")
    public static boolean[] field2468 = new boolean[112];

    @OriginalMember(owner = "client!tk", name = "Y", descriptor = "[I")
    public static int[] field2472 = new int[2];

    @OriginalMember(owner = "client!tk", name = "N", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!tk", name = "Q", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!tk", name = "S", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!tk", name = "T", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!tk", name = "W", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!tk", name = "X", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(III)I", line = 6)
    public static final int method1030(int arg0, int arg1, int arg2) {
        field2470++;
        int var3 = arg2 + (arg1 * 57);
        int var4 = 93 / ((arg0 - 20) / 44);
        int var5 = var3 << 13 ^ var3;
        int var6 = Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589;
        return var6 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(Z)V", line = 20)
    public static final void method1031(boolean arg0) {
        class76.method577((byte) -125, 5);
        class204.method1451(5, (byte) -106);
        class31.method223(5, -12876);
        class255.method1756(3, 5);
        field2471++;
        class67.method518(5, 5759);
        class1.method5(119, 5);
        class132.method898(arg0, 5);
        class242.method1616(false, 5);
        class243.method1631((byte) -96, 5);
        class40.method304(5, (byte) 37);
        class96.method691(2, 5);
        class261.method1831(116, 5);
        class192.method1393(50, false);
        class301.method2101(5, 1750290760);
        class138.method1009(5, (byte) 50);
        class76.field1446.method2075(5, 1);
        class40.field719.method2075(5, 1);
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(Z)Z", line = 50)
    public final boolean method146(boolean arg0) {
        field2461++;
        if (!arg0) {
            method1032(112, (byte) 2, (class188[]) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IB[Lla;)V", line = 62)
    public static final void method1032(int arg0, byte arg1, class188[] arg2) {
        field2466++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class188 var4 = arg2[var3];
            if (var4 != null && var4.field3468 == arg0 && (!var4.field3396 || !client.method827(var4))) {
                if (var4.field3467 == 0) {
                    if (!var4.field3396 && client.method827(var4) && class7.field112 != var4) {
                        continue;
                    }
                    method1032(var4.field3342, (byte) -118, arg2);
                    if (var4.field3368 != null) {
                        method1032(var4.field3342, (byte) -118, var4.field3368);
                    }
                    class316 var5 = (class316) class62.field1098.method1744((byte) 126, (long) var4.field3342);
                    if (var5 != null) {
                        class200.method1433(119, var5.field5453);
                    }
                }
                if (var4.field3467 == 6) {
                    if (var4.field3318 != -1 || var4.field3432 != -1) {
                        boolean var6 = class248.method1676((byte) -77, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field3432;
                        } else {
                            var7 = var4.field3318;
                        }
                        if (var7 != -1) {
                            class117 var8 = class250.method1682(var7, true);
                            if (var8 != null) {
                                var4.field3392 += class29.field398;
                                while (var4.field3392 > var8.field2064[var4.field3394]) {
                                    var4.field3392 -= var8.field2064[var4.field3394];
                                    var4.field3394++;
                                    if (var8.field2040.length <= var4.field3394) {
                                        var4.field3394 -= var8.field2044;
                                        if (var4.field3394 < 0 || var4.field3394 >= var8.field2040.length) {
                                            var4.field3394 = 0;
                                        }
                                    }
                                    class64.method500(var4, (byte) -117);
                                }
                            }
                        }
                    }
                    if (var4.field3388 != 0 && !var4.field3396) {
                        int var9 = var4.field3388 << 16 >> 16;
                        int var10 = var4.field3388 >> 16;
                        int var11 = class29.field398 * var10;
                        var4.field3353 = var4.field3353 + var11 & 0x7FF;
                        int var12 = class29.field398 * var9;
                        var4.field3313 = var4.field3313 + var12 & 0x7FF;
                        class64.method500(var4, (byte) -117);
                    }
                }
            }
        }
        if (arg1 != -118) {
            method1031(false);
        }
    }

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "(I)Ljava/lang/Object;", line = 180)
    public final Object method141(int arg0) {
        if (arg0 != -15111) {
            this.field2469 = (Object) null;
        }
        field2464++;
        return this.field2469;
    }

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "(I)V", line = 206)
    public static void method1033(int arg0) {
        field2468 = null;
        field2463 = null;
        field2472 = null;
        field2465 = null;
        field2462 = null;
        if (arg0 != 5) {
            field2467 = -128;
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 227)
    public class140(Object arg0) {
        this.field2469 = arg0;
    }
}
