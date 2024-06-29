import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class80 {

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field2130 = 0;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "Lke;")
    public static class65 field2131 = class1.method17("Regeln versto-8en hat)3", -114);

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static volatile int field2129 = 0;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public static int field2133 = 1;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "Lke;")
    private static class65 field2126 = class1.method17("RuneScape is loading )2 please wait)3)3)3", -118);

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "[I")
    public static int[] field2123 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "[J")
    public static long[] field2139 = new long[100];

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field2128 = 0;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "[I")
    public static int[] field2124 = new int[5];

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "Lke;")
    private static class65 field2135 = class1.method17("Report abuse", -128);

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "Lke;")
    public static class65 field2137 = field2135;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "Lke;")
    public static class65 field2136 = field2126;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "Ljava/awt/Image;")
    public static Image field2125;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "[[[B")
    public static byte[][][] field2140;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V", line = 5)
    public static void method699(byte arg0) {
        field2126 = null;
        field2140 = null;
        field2137 = null;
        field2125 = null;
        field2139 = null;
        if (arg0 != -51) {
            method701(-29L, 113);
        }
        field2131 = null;
        field2123 = null;
        field2124 = null;
        field2136 = null;
        field2135 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 41)
    public static final void method700(int arg0) {
        class92.field2427.method834(5875);
        class50.field1274.method834(5875);
        field2132++;
        int var1 = 39 % ((-arg0 - 33) / 60);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(JI)V", line = 54)
    public static final void method701(long arg0, int arg1) {
        field2127++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = arg1; var3 < class87.field2317; var3++) {
            if (class4.field82[var3] == arg0) {
                class116.field2910 = true;
                class3.field64++;
                class87.field2317--;
                for (int var4 = var3; var4 < class87.field2317; var4++) {
                    class86.field2286[var4] = class86.field2286[var4 + 1];
                    class52.field1325[var4] = class52.field1325[var4 + 1];
                    class4.field82[var4] = class4.field82[var4 + 1];
                }
                class56.field1453.method642(139, false);
                class56.field1453.method323(arg0, 30);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)Laa;", line = 96)
    public static final class1 method702(int arg0, int arg1) {
        field2134++;
        class1 var2 = (class1) class128.field3090.method833((byte) -53, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class43.field1142.method477(12, (byte) 127, arg1);
        if (arg0 < 90) {
            method702(39, 49);
        }
        class1 var4 = new class1();
        if (var3 != null) {
            var4.method4(0, new class39(var3));
        }
        var4.method15(98);
        class128.field3090.method836((long) arg1, var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILjd;Ljd;)V", line = 168)
    public static final void method703(int arg0, class58 arg1, class58 arg2) {
        class90.field2379 = arg1;
        field2121++;
        class70.field1821 = arg2;
        int var3 = -48 / ((58 - arg0) / 60);
    }
}
