import java.awt.Container;
import java.awt.Insets;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class95 {

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "Lrh;")
    private class170 field1516 = new class170();

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1518 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "[S")
    public static short[] field1525 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "Lsc;")
    public static class181 field1526 = class149.method967(255, " weitere Optionen");

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "Lsc;")
    public static class181 field1529 = class149.method967(255, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "Lrh;")
    private class170 field1522;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILrh;)V")
    public final void method624(int arg0, class170 arg1) {
        field1524++;
        if (arg1.field2853 != null) {
            arg1.method1128((byte) 20);
        }
        if (arg0 != -585) {
            field1518 = null;
        }
        arg1.field2853 = this.field1516;
        arg1.field2850 = this.field1516.field2850;
        arg1.field2853.field2850 = arg1;
        arg1.field2850.field2853 = arg1;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)V")
    public static final void method625(int arg0, int arg1) {
        field1523++;
        Container var2;
        if (client.field2692 != null) {
            var2 = client.field2692;
        } else if (class43.field677 == null) {
            var2 = class224.field3870.field2285;
        } else {
            var2 = class43.field677;
        }
        class165.field2799 = var2.getSize().width;
        class213.field3675 = var2.getSize().height;
        if (class43.field677 == var2) {
            Insets var3 = class43.field677.getInsets();
            class213.field3675 -= var3.top + var3.bottom;
            class165.field2799 -= var3.right + var3.left;
        }
        class143.field2321 = 765;
        class41.field620 = 503;
        class182.field3207 = (class165.field2799 - 765) / arg1;
        class140.field2261 = class90.field1437;
        class107.field1740.setSize(class143.field2321, class41.field620);
        if (class43.field677 == var2) {
            Insets var4 = class43.field677.getInsets();
            class107.field1740.setLocation(class182.field3207 + var4.left, class140.field2261 + var4.top);
        } else {
            class107.field1740.setLocation(class182.field3207, class140.field2261);
        }
        if (class243.field4227 != -1) {
            class165.method1101(8, true);
        }
        class232.method1603(-17957);
        if (class142.field2305.startsWith("mac")) {
            class255.field4463 = (long) arg0 + class213.method1414(-9292);
        }
        class258.field4509 = class213.method1414(arg1 ^ 0xFFFFDBB6) + ((long) arg0);
        if (arg0 == 0 && class216.field3713 != null && class5.field106 == 30 || class5.field106 == 25) {
            class115.method763((byte) 102);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)Lrh;")
    public final class170 method626(byte arg0) {
        if (arg0 != -117) {
            return null;
        }
        field1515++;
        class170 var2 = this.field1516.field2850;
        if (this.field1516 == var2) {
            this.field1522 = null;
            return null;
        } else {
            this.field1522 = var2.field2850;
            return var2;
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)Lbb;")
    public static final class52 method627(int arg0, int arg1) {
        field1520++;
        class52 var2 = (class52) class83.field1328.method1794(-1, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class18.field317.method89(arg1, 1, 98);
        class52 var4 = new class52();
        if (var3 != null) {
            var4.method392(new class230(var3), arg0 ^ 0x225A, arg1);
        }
        if (arg0 == 8741) {
            class83.field1328.method1795(14177, (long) arg1, var4);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
    public final void method628(int arg0) {
        while (true) {
            class170 var2 = this.field1516.field2850;
            if (this.field1516 == var2) {
                if (arg0 > -46) {
                    field1529 = null;
                }
                field1514++;
                this.field1522 = null;
                return;
            }
            var2.method1128((byte) 20);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)Lrh;")
    public final class170 method629(boolean arg0) {
        if (!arg0) {
            field1518 = null;
        }
        field1528++;
        class170 var2 = this.field1522;
        if (this.field1516 == var2) {
            this.field1522 = null;
            return null;
        } else {
            this.field1522 = var2.field2850;
            return var2;
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)Lrh;")
    public final class170 method630(int arg0) {
        field1517++;
        class170 var2 = this.field1516.field2850;
        if (this.field1516 == var2) {
            return null;
        }
        var2.method1128((byte) 20);
        if (arg0 != 6798) {
            this.field1522 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)V")
    public static void method631(byte arg0) {
        field1526 = null;
        field1529 = null;
        field1525 = null;
        field1518 = null;
        if (arg0 < 37) {
            field1526 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZJ)V")
    public static final void method632(boolean arg0, long arg1) {
        field1521++;
        if (!arg0) {
            method627(-82, -33);
        }
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class114.method754(arg1 - 1L, 26934);
            class114.method754(1L, 26934);
        } else {
            class114.method754(arg1, 26934);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lrh;I)V")
    public final void method633(class170 arg0, int arg1) {
        field1519++;
        int var3 = 123 / ((arg1 + 14) / 34);
        if (arg0.field2853 != null) {
            arg0.method1128((byte) 20);
        }
        arg0.field2850 = this.field1516;
        arg0.field2853 = this.field1516.field2853;
        arg0.field2853.field2850 = arg0;
        arg0.field2850.field2853 = arg0;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
    public class95() {
        this.field1516.field2850 = this.field1516;
        this.field1516.field2853 = this.field1516;
    }
}
