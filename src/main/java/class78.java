import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class78 {

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "Ldc;")
    public static class36 field1509 = new class36();

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field1515 = 0;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "Z")
    public static boolean field1517 = false;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field1518 = -1;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "Lqe;")
    private static class179 field1524 = class206.method1380("Please use a different world)3", (byte) -127);

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public static int field1521 = 0;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "Lqe;")
    public static class179 field1526 = field1524;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "[Lqe;")
    public static class179[] field1529 = new class179[1000];

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "Lqe;")
    public static class179 field1516 = field1524;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "Lqe;")
    public static class179 field1527 = class206.method1380("<col=ffb000>", (byte) 82);

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "Lqe;")
    private static class179 field1534 = class206.method1380("Password: ", (byte) -33);

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
    public static int field1530 = 50;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "[Lqe;")
    public static class179[] field1525 = new class179[field1530];

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "[I")
    public static int[] field1531 = new int[field1530];

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "Lqe;")
    public static class179 field1512 = field1534;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "[I")
    public static int[] field1519 = new int[field1530];

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "[I")
    public static int[] field1522 = new int[field1530];

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "[I")
    public static int[] field1532 = new int[field1530];

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "[I")
    public static int[] field1513 = new int[field1530];

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "[I")
    public static int[] field1520 = new int[field1530];

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "[I")
    public static int[] field1533 = new int[field1530];

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "Lwh;")
    public static class242 field1514;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "Ljava/awt/Frame;")
    public static Frame field1523;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "[[[B")
    public static byte[][][] field1510;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILra;)Lqi;")
    public static final class183 method500(int arg0, class185 arg1) {
        field1511++;
        class183 var2 = new class183();
        int var3 = -126 / ((-arg0 - 33) / 33);
        var2.field3375 = arg1.method1252(2);
        var2.field3377 = class238.method1543(107, var2.field3375);
        return var2;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
    public static void method501(byte arg0) {
        field1512 = null;
        field1525 = null;
        field1527 = null;
        field1533 = null;
        field1519 = null;
        field1532 = null;
        field1516 = null;
        field1523 = null;
        field1529 = null;
        field1520 = null;
        if (arg0 != 115) {
            field1533 = null;
        }
        field1514 = null;
        field1522 = null;
        field1524 = null;
        field1513 = null;
        field1534 = null;
        field1510 = null;
        field1531 = null;
        field1509 = null;
        field1526 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B[Lqe;)Lqe;")
    public static final class179 method502(byte arg0, class179[] arg1) {
        field1507++;
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        } else if (arg0 >= -79) {
            return null;
        } else {
            return class223.method1447(arg1.length, 16736, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBILkg;)V")
    public static final void method503(int arg0, byte arg1, int arg2, class115 arg3) {
        if (arg1 < 70) {
            field1527 = null;
        }
        if (arg3.field3182 == arg2 && arg2 != -1) {
            class117 var4 = class239.method1550(arg2, (byte) 107);
            int var5 = var4.field2197;
            if (var5 == 1) {
                arg3.field3148 = 0;
                arg3.field3140 = arg0;
                arg3.field3156 = 0;
                arg3.field3170 = 0;
                class226.method1481(class61.field1298 == arg3, arg3.field3198, 15, arg3.field3156, arg3.field3159, var4);
            }
            if (var5 == 2) {
                arg3.field3170 = 0;
            }
        } else if (arg2 == -1 || arg3.field3182 == -1 || class239.method1550(arg2, (byte) 107).field2228 >= class239.method1550(arg3.field3182, (byte) 107).field2228) {
            arg3.field3180 = arg3.field3176;
            arg3.field3156 = 0;
            arg3.field3170 = 0;
            arg3.field3182 = arg2;
            arg3.field3148 = 0;
            arg3.field3140 = arg0;
            if (arg3.field3182 != -1) {
                class226.method1481(class61.field1298 == arg3, arg3.field3198, 15, arg3.field3156, arg3.field3159, class239.method1550(arg3.field3182, (byte) 107));
            }
        }
        field1528++;
    }
}
