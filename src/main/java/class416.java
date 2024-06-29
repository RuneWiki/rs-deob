import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class416 {

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "B")
    public byte field5835;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "Lmp;")
    public static class758 field5830 = new class758(32);

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "Lcu;")
    public class217 field5844;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "Lmf;")
    public class416 field5834;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "Lwr;")
    public class455 field5838;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "Lwr;")
    public class455 field5840;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "Lrc;")
    public class535 field5845;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "Lrc;")
    public class535 field5847;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "Lht;")
    public class578 field5846;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "Lqn;")
    public class63 field5841;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "S")
    public short field5833;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "S")
    public short field5836;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "S")
    public short field5837;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "S")
    public short field5839;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public final void method2535(int arg0) {
        field5832++;
        if (arg0 != 24358) {
            this.field5837 = -125;
        }
        while (this.field5844 != null) {
            class217 var2 = this.field5844.field3091;
            this.field5844.method1511((byte) -60);
            this.field5844 = var2;
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
    public static void method2536(int arg0) {
        if (arg0 <= -122) {
            field5830 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(I)V")
    public class416(int arg0) {
        this.field5835 = (byte) arg0;
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V")
    public static final void method2537(int arg0) {
        field5831++;
        if (arg0 != 5079) {
            method2538(-61, 69, -86);
        }
        class603.field8761 = (int) ((double) class174.field2540 * 34.46D);
        class573.field8122 = 200;
        class603.field8761 <<= 0x2;
        if (class359.field5046.method563()) {
            class603.field8761 += 512;
        }
        class334.method2138(false, false);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)Lqn;")
    public static final class63 method2538(int arg0, int arg1, int arg2) {
        class416 var3 = class390.field5454[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class63 var4 = var3.field5841;
            var3.field5841 = null;
            class260.method1768(var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/lang/String;IIZ)V")
    public static final void method2539(String arg0, int arg1, int arg2, boolean arg3) {
        field5842++;
        class389.method2426(-100);
        class256.method1739(-13957);
        class66.method694(28633);
        class150.method1156(arg0, arg3, arg2, 268435456);
        class303.method1964((byte) -59);
        if (arg1 != 8) {
            method2537(67);
        }
        class570.method3329(class359.field5046, (byte) 124);
        class335.method2141(class359.field5046, 88);
        class269.method1795(class501.field7161, class359.field5046, 19974);
        class376.method2361((byte) 4);
        class543.method3212(class237.field3358, (byte) 73);
        class237.method1608(true);
        class685.method3857(true);
        if (class611.field8839 == 3) {
            class19.method122(1, 4);
        } else if (class611.field8839 == 7) {
            class19.method122(arg1 - 7, 8);
        } else if (class611.field8839 == 10) {
            class19.method122(1, 11);
        } else if (class611.field8839 == 1 || class611.field8839 == 2) {
            class105.method906((byte) -127);
        }
    }
}
