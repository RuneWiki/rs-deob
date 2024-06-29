import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class125 extends class333 {

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "[S")
    public static short[] field1416 = new short[256];

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "Lcq;")
    public static class110 field1408 = new class110(17, 0);

    @OriginalMember(owner = "client!bk", name = "L", descriptor = "Lsb;")
    public static class305 field1419 = new class305(25, 7);

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public int field1394;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public int field1396;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    public int field1398;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    public int field1399;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public int field1400;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    public int field1401;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
    public int field1402;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "I")
    public int field1403;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "I")
    public int field1404;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "I")
    public int field1405;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    public int field1406;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "I")
    public int field1407;

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "I")
    public int field1411;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
    public int field1412;

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "I")
    public int field1413;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "I")
    public int field1414;

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "I")
    public int field1417;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "Lbn;")
    public class410 field1395;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "Lug;")
    public class450 field1393;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "Lrj;")
    public class646 field1397;

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "Lam;")
    public class704 field1418;

    @OriginalMember(owner = "client!bk", name = "M", descriptor = "[[[B")
    public static byte[][][] field1420;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V", line = 3)
    public final void method714(byte arg0) {
        this.field1418 = null;
        this.field1395 = null;
        if (arg0 <= 88) {
            method716((byte) -34, -7);
        }
        this.field1397 = null;
        this.field1393 = null;
        field1415++;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lr;B)V", line = 24)
    public static final void method715(class564 arg0, byte arg1) {
        field1409++;
        if (!(class661.field9266 >= 2 || class348.field4665) || class497.field7199 != null) {
            return;
        }
        int var2 = -11 % ((arg1 + 50) / 46);
        String var3;
        if (class348.field4665 && class661.field9266 < 2) {
            var3 = class286.field3580 + class198.field2317.method1195((byte) 62, class504.field7267) + class679.field9566 + " ->";
        } else if (class701.field9845 && class140.field1549.method1945(81, false) && class661.field9266 > 2) {
            var3 = class203.method1210((class336) class694.field9730.field8677.field4174.field4174, 103);
        } else {
            class336 var4 = (class336) class694.field9730.field8677.field4174;
            var3 = class203.method1210(var4, 126);
            int[] var5 = null;
            if (class151.method822(var4.field4231, false)) {
                var5 = class19.field153.method272((int) var4.field4226, -11824).field7033;
            } else if (var4.field4229 != -1) {
                var5 = class19.field153.method272(var4.field4229, -11824).field7033;
            } else if (class231.method1388(27, var4.field4231)) {
                class214 var6 = (class214) class274.field3433.method3669((long) ((int) var4.field4226), -1);
                if (var6 != null) {
                    class600 var7 = var6.field2601;
                    class210 var8 = var7.field8461;
                    if (var8.field2492 != null) {
                        var8 = var8.method1247((byte) 119, class628.field8859);
                    }
                    if (var8 != null) {
                        var5 = var8.field2504;
                    }
                }
            } else if (class638.method3598(var4.field4231, 0)) {
                Object var9 = null;
                class638 var10;
                if (var4.field4231 == 1011) {
                    var10 = class364.field4891.method2134((int) var4.field4226, true);
                } else {
                    var10 = class364.field4891.method2134((int) (var4.field4226 >>> 32 & 0x7FFFFFFFL), true);
                }
                if (var10.field8974 != null) {
                    var10 = var10.method3597(-1, class628.field8859);
                }
                if (var10 != null) {
                    var5 = var10.field8998;
                }
            }
            if (var5 != null) {
                var3 = var3 + class243.method1439(var5, 0);
            }
        }
        if (class661.field9266 > 2) {
            var3 = var3 + "<col=ffffff> / " + (class661.field9266 - 2) + class198.field2310.method1195((byte) 62, class504.field7267);
        }
        if (class247.field3065 != null) {
            class413 var11 = class247.field3065.method2612(arg0, (byte) -89);
            if (var11 == null) {
                var11 = class282.field3535;
            }
            var11.method2314(class420.field5596, class247.field3065.field6449, var3, (byte) -14, class247.field3065.field6338, class247.field3065.field6336, class91.field915, class247.field3065.field6443, class182.field2048, class247.field3065.field6352, class73.field763, class681.field9604, class73.field766, class587.field8315, class247.field3065.field6483);
            class556.method3151(class182.field2048[2], class182.field2048[1], class182.field2048[0], 0, class182.field2048[3]);
        } else if (class239.field2969 != null && class616.field8685 == class246.field3031) {
            int var12 = class282.field3535.method2324(class73.field763, 0, class201.field2381 + 4, var3, (byte) 123, 16777215, class628.field8857 + 16, class587.field8315, class681.field9604, class420.field5596);
            class556.method3151(class488.field7097.method2657((byte) 62, var3) + var12, class628.field8857, class201.field2381 + 4, 0, 16);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)V", line = 137)
    public static final void method716(byte arg0, int arg1) {
        field1410++;
        int var2 = 83 % ((71 - arg0) / 38);
        if (!class639.field9075.field6785) {
            arg1 = -1;
        }
        if (class5.field58 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class590 var3 = class693.field9725.method2469(arg1, -120);
            class550 var4 = var3.method3325(-95);
            if (var4 == null) {
                arg1 = -1;
            } else {
                class353.field4757.method2684(var4.method3112(), new Point(var3.field8334, var3.field8336), var4.method3111(), class41.field407, -49, var4.method3120());
                class5.field58 = arg1;
            }
        }
        if (arg1 == -1 && class5.field58 != -1) {
            class353.field4757.method2684(-1, new Point(), null, class41.field407, 65, -1);
            class5.field58 = -1;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V", line = 183)
    public static void method717(int arg0) {
        if (arg0 != -1973385120) {
            method715(null, (byte) 34);
        }
        field1416 = null;
        field1408 = null;
        field1419 = null;
        field1420 = null;
    }
}
