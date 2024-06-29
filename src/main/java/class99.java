import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class99 extends class217 {

    @OriginalMember(owner = "client!p", name = "B", descriptor = "[I")
    public int[] field1477 = new int[5];

    @OriginalMember(owner = "client!p", name = "v", descriptor = "[Lbb;")
    public class91[] field1471 = new class91[5];

    @OriginalMember(owner = "client!p", name = "I", descriptor = "I")
    public int field1483 = 0;

    @OriginalMember(owner = "client!p", name = "J", descriptor = "I")
    public int field1484;

    @OriginalMember(owner = "client!p", name = "N", descriptor = "I")
    public int field1487;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "I")
    public int field1469;

    @OriginalMember(owner = "client!p", name = "E", descriptor = "I")
    public int field1479;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "Z")
    public static boolean field1465 = false;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public static int field1467 = -1;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public static int field1464 = 0;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field1459 = 0;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field1463 = 0;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field1462 = 0;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "I")
    public int field1475;

    @OriginalMember(owner = "client!p", name = "F", descriptor = "I")
    public int field1480;

    @OriginalMember(owner = "client!p", name = "H", descriptor = "I")
    public int field1482;

    @OriginalMember(owner = "client!p", name = "O", descriptor = "I")
    public int field1488;

    @OriginalMember(owner = "client!p", name = "R", descriptor = "I")
    public int field1491;

    @OriginalMember(owner = "client!p", name = "S", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!p", name = "P", descriptor = "Lsf;")
    public class107 field1489;

    @OriginalMember(owner = "client!p", name = "M", descriptor = "Lwh;")
    public class10 field1486;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "Lhg;")
    public class173 field1472;

    @OriginalMember(owner = "client!p", name = "D", descriptor = "Lka;")
    public class189 field1478;

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "Lni;")
    public class24 field1490;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "Lwg;")
    public class290 field1474;

    @OriginalMember(owner = "client!p", name = "A", descriptor = "Lp;")
    public class99 field1476;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "Lclient;")
    public static client field1457;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "Z")
    public boolean field1466;

    @OriginalMember(owner = "client!p", name = "G", descriptor = "Z")
    public boolean field1481;

    @OriginalMember(owner = "client!p", name = "K", descriptor = "Z")
    public boolean field1485;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "[[B")
    public static byte[][] field1470;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(B)Ljava/lang/String;", line = 10)
    public static final String method774(byte arg0) {
        field1468++;
        String var1;
        if (class327.field5077 == 1 && class6.field62 < 2) {
            var1 = class307.field4792 + class37.field562 + class220.field3452 + " ->";
        } else if (class81.field1136 && class6.field62 < 2) {
            var1 = class309.field4805 + class37.field562 + class209.field3290 + " ->";
        } else if (class11.field116 && class50.field768[81] && class6.field62 > 2) {
            var1 = class189.method1365(false, class6.field62 - 2);
        } else {
            var1 = class189.method1365(false, class6.field62 - 1);
        }
        if (class6.field62 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class6.field62 - 2) + class242.field3648;
        }
        return arg0 == 61 ? var1 : (String) null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V", line = 41)
    public static void method775(int arg0) {
        if (arg0 != -13856) {
            field1464 = -8;
        }
        field1470 = (byte[][]) null;
        field1457 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZLlb;II)Lsd;", line = 57)
    public static final class27 method776(boolean arg0, class211 arg1, int arg2, int arg3) {
        field1458++;
        if (arg0) {
            field1461 = -38;
        }
        return class297.method2093(arg2, arg3, (byte) 107, arg1) ? class197.method1434(false) : null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V", line = 74)
    public static final void method777(int arg0, int arg1) {
        if (arg0 != 3196) {
            field1463 = 50;
        }
        field1460++;
        class147 var2 = class92.method731(-29125, arg1, 8);
        var2.method1099(arg0 - 3271);
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(III)V", line = 87)
    public class99(int arg0, int arg1, int arg2) {
        this.field1484 = arg2;
        this.field1487 = arg1;
        this.field1479 = this.field1469 = arg0;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)Ljh;", line = 111)
    public static final class269 method778(int arg0, int arg1) {
        field1492++;
        class269 var2 = (class269) class193.field3086.method1432((byte) 119, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 == 20951) {
            byte[] var3 = class22.field243.method1507(class62.method548((byte) 19, arg1), (byte) 118, class232.method1648(30003, arg1));
            class269 var4 = new class269();
            var4.field4048 = arg1;
            if (var3 != null) {
                var4.method1869(26802, new class35(var3));
            }
            class193.field3086.method1436(false, var4, (long) arg1);
            return var4;
        } else {
            return (class269) null;
        }
    }
}
