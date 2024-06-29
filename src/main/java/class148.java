import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class148 {

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "[[S")
    public static short[][] field1729 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "[I")
    public static int[] field1731 = new int[] { 6144, 8192, 10240, 4096, 12288, 2048, 0, 14336 };

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field1733 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V", line = 16)
    public static void method954(int arg0) {
        field1733 = null;
        field1731 = null;
        field1729 = null;
        if (arg0 != 192) {
            method954(108);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZILjava/lang/String;)V", line = 28)
    public static final void method955(boolean arg0, int arg1, String arg2) {
        class267.field3455.field3759 = 1;
        field1732++;
        String var3 = arg2.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class126.field1413; var6++) {
            class59 var9 = class131.method843((byte) 5, var6);
            if ((!arg0 || var9.field686) && var9.field719 == -1 && var9.field723 == -1 && var9.field738 == 0 && var9.field736.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class118.field1355 = null;
                    class401.field5534 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class396.field5385 = 0;
        class118.field1355 = var4;
        class401.field5534 = var5;
        String[] var7 = new String[class401.field5534];
        if (arg1 != -15697) {
            field1729 = null;
        }
        for (int var8 = 0; var8 < class401.field5534; var8++) {
            var7[var8] = class131.method843((byte) 5, var4[var8]).field736;
        }
        class8.method35((byte) -60, class118.field1355, var7);
        class267.field3455.method1802((byte) -103);
        class267.field3455.field3759 = 2;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "([Laq;II)V", line = 106)
    public static final void method956(class453[] arg0, int arg1, int arg2) {
        int var3 = 0;
        if (arg1 != 3610) {
            return;
        }
        while (var3 < arg0.length) {
            class453 var4 = arg0[var3];
            if (var4 != null && var4.field6462 == arg2 && !client.method2686(var4)) {
                if (var4.field6383 == 0) {
                    method956(arg0, 3610, var4.field6475);
                    if (var4.field6350 != null) {
                        method956(var4.field6350, 3610, var4.field6475);
                    }
                    class244 var5 = (class244) class282.field3678.method2218(arg1 ^ 0xE1B, (long) var4.field6475);
                    if (var5 != null) {
                        class320.method1999(var5.field3245, (byte) 67);
                    }
                }
                if (var4.field6383 == 6 && var4.field6426 != -1) {
                    class156 var6 = class430.method2621((byte) -57, var4.field6426);
                    if (var6 != null) {
                        var4.field6439 += class439.field6032;
                        while (var6.field1817[var4.field6315] < var4.field6439) {
                            var4.field6439 -= var6.field1817[var4.field6315];
                            var4.field6315++;
                            if (var4.field6315 >= var6.field1821.length) {
                                var4.field6315 -= var6.field1801;
                                if (var4.field6315 < 0 || var4.field6315 >= var6.field1821.length) {
                                    var4.field6315 = 0;
                                }
                            }
                            var4.field6331 = var4.field6315 + 1;
                            if (var4.field6331 >= var6.field1821.length) {
                                var4.field6331 -= var6.field1801;
                                if (var4.field6331 < 0 || var4.field6331 >= var6.field1821.length) {
                                    var4.field6331 = -1;
                                }
                            }
                            class303.method1923(var4, 10240);
                        }
                    }
                }
            }
            var3++;
        }
        field1734++;
    }
}
