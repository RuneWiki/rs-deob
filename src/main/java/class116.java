import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class116 extends class168 {

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "[I")
    public static int[] field2197 = new int[100];

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field2200 = 0;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "[J")
    public static long[] field2207 = new long[100];

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public static int field2205 = 0;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2201;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "[[[B")
    public static byte[][][] field2206;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)I")
    public static final int method925(int arg0) {
        field2199++;
        if (arg0 != 20680) {
            method926((class2) null, -66);
        }
        return 2;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lnk;I)I")
    public static final int method926(class2 arg0, int arg1) {
        class181 var2 = arg0.field41;
        field2198++;
        if (var2.field3329 != null) {
            var2 = var2.method1330(-1);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field3270;
        if (arg1 != 10) {
            return 14;
        }
        if (arg0.field3670 == arg0.field3664) {
            var3 = var2.field3273;
        } else if (arg0.field3664 == arg0.field3638) {
            var3 = var2.field3316;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lpa;Lpa;Lpa;BLpa;)V")
    public static final void method927(class123 arg0, class123 arg1, class123 arg2, byte arg3, class123 arg4) {
        class191.field3498 = arg0;
        field2203++;
        class8.field140 = arg4;
        class231.field4147 = arg2;
        class216.field3935 = arg1;
        int var5 = -104 % ((arg3 + 28) / 55);
        class109.field2060 = new class69[class8.field140.method967(-28151)][];
        class29.field458 = new boolean[class8.field140.method967(-28151)];
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)V")
    public static void method928(byte arg0) {
        field2207 = null;
        field2201 = null;
        if (arg0 > 110) {
            field2197 = null;
            field2206 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lpa;Lpa;III)Loh;")
    public static final class79 method929(class123 arg0, class123 arg1, int arg2, int arg3, int arg4) {
        field2204++;
        if (class85.method677(arg4, arg0, 20888, arg2)) {
            if (arg3 < 30) {
                method925(3);
            }
            return class22.method149(arg1.method973(arg2, true, arg4), (byte) 103);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public static final void method930(int arg0) {
        field2202++;
        class193.field3521 = class238.field4238;
        class243.method1677(72, false);
        class217.method1541(true);
        class233.method1615(class193.field3521, 84);
        class235.field4203 = new class126();
        class235.field4203.field3633 = 3000;
        class235.field4203.field3615 = 3000;
        class114.method905(class94.field1786, -86);
        class174.method1292(10, true);
        int var1 = -79 / ((arg0 - 12) / 52);
    }
}
