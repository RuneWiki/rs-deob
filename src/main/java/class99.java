import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class99 extends class138 {

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "[I")
    public static int[] field1660 = new int[2048];

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "[B")
    public static byte[] field1666;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "Lhc;")
    public static class235 field1662;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V")
    public static final void method723(int arg0) {
        if (arg0 != 21379) {
            field1670 = 59;
        }
        class236.field3814.method537(false);
        field1665++;
        int var1 = class236.field3814.method535(8, 104);
        if (var1 < class70.field1119) {
            for (int var2 = var1; var2 < class70.field1119; var2++) {
                class100.field1689[class82.field1392++] = class284.field4506[var2];
            }
        }
        if (class70.field1119 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class70.field1119 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class284.field4506[var3];
            class45 var5 = class255.field4082[var4];
            int var6 = class236.field3814.method535(1, 104);
            if (var6 == 0) {
                class284.field4506[class70.field1119++] = var4;
                var5.field2279 = class192.field2978;
            } else {
                int var7 = class236.field3814.method535(2, 104);
                if (var7 == 0) {
                    class284.field4506[class70.field1119++] = var4;
                    var5.field2279 = class192.field2978;
                    class244.field3972[class141.field2155++] = var4;
                } else if (var7 == 1) {
                    class284.field4506[class70.field1119++] = var4;
                    var5.field2279 = class192.field2978;
                    int var8 = class236.field3814.method535(3, 104);
                    var5.method974(1, var8, -32049);
                    int var9 = class236.field3814.method535(1, 104);
                    if (var9 == 1) {
                        class244.field3972[class141.field2155++] = var4;
                    }
                } else if (var7 == 2) {
                    class284.field4506[class70.field1119++] = var4;
                    var5.field2279 = class192.field2978;
                    if (class236.field3814.method535(1, 104) == 1) {
                        int var11 = class236.field3814.method535(3, arg0 - 21275);
                        var5.method974(2, var11, arg0 - 53428);
                        int var12 = class236.field3814.method535(3, 104);
                        var5.method974(2, var12, -32049);
                    } else {
                        int var10 = class236.field3814.method535(3, arg0 - 21275);
                        var5.method974(0, var10, -32049);
                    }
                    int var13 = class236.field3814.method535(1, 104);
                    if (var13 == 1) {
                        class244.field3972[class141.field2155++] = var4;
                    }
                } else if (var7 == 3) {
                    class100.field1689[class82.field1392++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V")
    public static void method724(int arg0) {
        field1666 = null;
        if (arg0 >= 41) {
            field1662 = null;
            field1660 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILhc;)V")
    public static final void method725(int arg0, class235 arg1) {
        if (arg0 != 0) {
            field1669 = 79;
        }
        class34.field514 = arg1;
        field1663++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lhc;III)Ljb;")
    public static final class276 method726(class235 arg0, int arg1, int arg2, int arg3) {
        field1661++;
        if (class212.method1440(arg3, arg0, arg2, 41)) {
            if (arg1 != 3) {
                method723(-107);
            }
            return class192.method1295(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIII)V")
    public static final void method727(int arg0, int arg1, int arg2, int arg3) {
        field1667++;
        class41 var4 = class221.method1492((byte) -42, arg1, 11);
        var4.method301(arg2 ^ 0xFFFFF932);
        var4.field583 = arg3;
        var4.field584 = arg0;
        if (arg2 != -9366) {
            method723(-38);
        }
    }

    static {
        int var0 = 0;
        field1666 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field1666[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }
}
