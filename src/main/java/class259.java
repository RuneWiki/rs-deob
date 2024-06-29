import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class259 extends class34 {

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "Lcc;")
    public static class209 field4669 = class95.method669(108, "0");

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "Lcc;")
    public static class209 field4675 = class95.method669(107, "Null");

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "Lcc;")
    private static class209 field4671 = class95.method669(94, "Loading textures )2 ");

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "Z")
    public static boolean field4673 = false;

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "Lcc;")
    public static class209 field4680 = class95.method669(117, "welle2:");

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "Lcc;")
    public static class209 field4677 = field4671;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!mi", name = "B", descriptor = "J")
    public long field4681;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "Lmi;")
    public class259 field4668;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "Lmi;")
    public class259 field4674;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lve;ZI)V")
    public static final void method1792(class188 arg0, boolean arg1, int arg2) {
        if (arg1) {
            int var3 = class50.field981;
            int var4 = var3 * 956 / 503;
            class166.field2996.method235((class25.field442 - var4) / 2, 0, var4, var3);
            class84.field1668.method1330(class25.field442 / 2 - (class84.field1668.field4078 / 2), 18);
        }
        arg0.method1291(class14.field260, class25.field442 / 2, class50.field981 / 2 - 26, 16777215, -1);
        field4667++;
        int var5 = class50.field981 / 2 - 18;
        class4.method41(class25.field442 / 2 - 152, var5, 304, 34, 9179409);
        class4.method41(class25.field442 / 2 - 151, var5 + 1, arg2, 32, 0);
        class4.method39(class25.field442 / 2 - 150, var5 - -2, class146.field2691 * 3, 30, 9179409);
        class4.method39(class25.field442 / 2 + (class146.field2691 * 3) - 150, var5 + 2, 300 - (class146.field2691 * 3), 30, 0);
        arg0.method1291(class239.field4325, class25.field442 / 2, class50.field981 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)V")
    public static final void method1793(int arg0, int arg1, int arg2) {
        field4672++;
        class284.field4997[arg2] = arg0;
        class173 var3 = (class173) class94.field1859.method1755((long) arg2, (byte) -80);
        if (var3 == null) {
            class173 var4 = new class173(4611686018427387905L);
            class94.field1859.method1762(var4, (long) arg2, (byte) 73);
        } else if (var3.field3161 != 4611686018427387905L) {
            var3.field3161 = class180.method1236(-54) + 500L | 0x4000000000000000L;
        }
        if (arg1 != -7265) {
            field4669 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(I)Z")
    public final boolean method1794(int arg0) {
        field4679++;
        if (arg0 >= -108) {
            return false;
        } else {
            return this.field4668 != null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
    public static void method1795(byte arg0) {
        field4675 = null;
        field4671 = null;
        field4677 = null;
        field4669 = null;
        field4680 = null;
        if (arg0 >= -37) {
            field4677 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "(I)V")
    public final void method1796(int arg0) {
        field4682++;
        if (this.field4668 == null) {
            return;
        }
        this.field4668.field4674 = this.field4674;
        this.field4674.field4668 = this.field4668;
        this.field4668 = null;
        this.field4674 = null;
        if (arg0 >= -27) {
            this.field4674 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)Leg;")
    public static final class226 method1797(int arg0, int arg1) {
        if (arg0 <= 89) {
            return null;
        }
        field4670++;
        class226 var2 = (class226) class131.field2503.method670((byte) -112, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class47.field911.method353(class35.method271(-3236, arg1), -113, class18.method174((byte) -120, arg1));
        class226 var4 = new class226();
        var4.field4114 = arg1;
        if (var3 != null) {
            var4.method1588(new class106(var3), 14937);
        }
        class131.field2503.method673((long) arg1, -5087, var4);
        return var4;
    }

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "(I)V")
    public static final void method1798(int arg0) {
        class290.field5107 = arg0;
        for (int var1 = 0; var1 < class56.field1154; var1++) {
            for (int var2 = 0; var2 < class277.field4879; var2++) {
                if (class106.field2089[arg0][var1][var2] == null) {
                    class106.field2089[arg0][var1][var2] = new class109(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(II)Lcc;")
    public static final class209 method1799(int arg0, int arg1) {
        field4678++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        if (arg1 != -2) {
            field4673 = false;
        }
        class209 var2 = new class209();
        var2.field3811 = 1;
        var2.field3786 = new byte[1];
        var2.field3786[0] = (byte) arg0;
        return var2;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(II)[B")
    public static final byte[] method1800(int arg0, int arg1) {
        field4676++;
        if (arg0 != -256) {
            return null;
        }
        class206 var2 = (class206) class98.field1920.method1257((long) arg1, arg0 ^ 0xC9);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class39.method295(arg0 ^ 0xC3, var4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class206(var3);
            class98.field1920.method1259((long) arg1, var2, false);
        }
        return var2.field3685;
    }
}
