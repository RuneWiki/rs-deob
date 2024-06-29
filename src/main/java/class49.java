import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class49 {

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "[[I")
    public int[][] field946 = new int[6][258];

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "[[I")
    public int[][] field948 = new int[6][258];

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
    public int field967 = 0;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "[B")
    public byte[] field963 = new byte[18002];

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "[B")
    public byte[] field958 = new byte[4096];

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "[B")
    public byte[] field962 = new byte[256];

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "[I")
    public int[] field955 = new int[257];

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "[[B")
    public byte[][] field977 = new byte[6][258];

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "[I")
    public int[] field953 = new int[256];

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "[B")
    public byte[] field976 = new byte[18002];

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "[I")
    public int[] field980 = new int[6];

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public int field947 = 0;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "[[I")
    public int[][] field950 = new int[6][258];

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "[Z")
    public boolean[] field983 = new boolean[256];

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "[I")
    public int[] field974 = new int[16];

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "[Z")
    public boolean[] field961 = new boolean[16];

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "Z")
    public static boolean field966 = true;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Z")
    public static boolean field949 = true;

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "B")
    public byte field969;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public int field944;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public int field951;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public int field954;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
    public int field964;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
    public int field965;

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "I")
    public int field968;

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "I")
    public int field972;

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "I")
    public int field975;

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "I")
    public int field978;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
    public int field979;

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "I")
    public int field981;

    @OriginalMember(owner = "client!fb", name = "N", descriptor = "I")
    public int field982;

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "Lgf;")
    public static class7 field952;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "[B")
    public byte[] field943;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "[B")
    public byte[] field960;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)I")
    public static final int method296(boolean arg0) {
        field970++;
        try {
            if (class175.field3134 == 0) {
                if (class32.field553 > class205.method1403(-23) - 5000L) {
                    return 0;
                }
                class126.field2233 = class4.field62.method461(class164.field2940, field945, (byte) -46);
                class261.field4667 = class205.method1403(105);
                class175.field3134 = 1;
            }
            if (arg0) {
                method296(false);
            }
            if (class261.field4667 + 30000L < class205.method1403(-19)) {
                return class3.method10(1000, true);
            }
            if (class175.field3134 == 1) {
                if (class126.field2233.field3241 == 2) {
                    return class3.method10(1001, true);
                }
                if (class126.field2233.field3241 != 1) {
                    return -1;
                }
                class17.field298 = new class255((Socket) class126.field2233.field3239, class4.field62);
                int var1 = 0;
                if (class270.field4825) {
                    var1 = class154.field2777;
                }
                class126.field2233 = null;
                class285.field5010.field3487 = 0;
                class285.field5010.method1276(844519173, 51);
                class285.field5010.method1280(-123, var1);
                class17.field298.method1685(class285.field5010.field3465, class285.field5010.field3487, false, 0);
                if (class185.field3366 != null) {
                    class185.field3366.method1647(0);
                }
                if (class231.field4232 != null) {
                    class231.field4232.method1647(0);
                }
                int var2 = class17.field298.method1679(false);
                if (class185.field3366 != null) {
                    class185.field3366.method1647(0);
                }
                if (class231.field4232 != null) {
                    class231.field4232.method1647(0);
                }
                if (var2 != 0) {
                    return class3.method10(var2, true);
                }
                class175.field3134 = 2;
            }
            if (class175.field3134 == 2) {
                if (class17.field298.method1681((byte) -122) < 2) {
                    return -1;
                }
                class167.field2994 = class17.field298.method1679(false);
                class167.field2994 <<= 0x8;
                class167.field2994 += class17.field298.method1679(arg0);
                class175.field3134 = 3;
                class240.field4342 = new byte[class167.field2994];
                class59.field1140 = 0;
            }
            if (class175.field3134 != 3) {
                return -1;
            }
            int var3 = class17.field298.method1681((byte) -121);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > (class167.field2994 - class59.field1140)) {
                var3 = class167.field2994 - class59.field1140;
            }
            class17.field298.method1684(var3, -83, class59.field1140, class240.field4342);
            class59.field1140 += var3;
            if (class167.field2994 > class59.field1140) {
                return -1;
            } else if (class14.method113(class240.field4342, (byte) 91)) {
                int var4 = 0;
                class212.field3943 = new class133[class112.field1969];
                for (int var5 = class158.field2854; var5 <= class234.field4268; var5++) {
                    class133 var6 = class207.method1448(123, var5);
                    if (var6 != null) {
                        class212.field3943[var4++] = var6;
                    }
                }
                class17.field298.method1682(1);
                class175.field3134 = 0;
                class245.field4394 = 0;
                class240.field4342 = null;
                class17.field298 = null;
                class32.field553 = class205.method1403(-100);
                return 0;
            } else {
                return class3.method10(1002, true);
            }
        } catch (IOException var7) {
            return class3.method10(1003, true);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lh;I)Lwc;")
    public static final class86 method297(class190 arg0, int arg1) {
        field957++;
        if (arg1 != -11324) {
            field959 = 100;
        }
        return new class86(arg0.method1274((byte) -37), arg0.method1274((byte) 126), arg0.method1274((byte) -26), arg0.method1274((byte) 82), arg0.method1282(114), arg0.method1265(115));
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)Llc;")
    public static final class143 method298(int arg0, int arg1) {
        field971++;
        if (arg1 != -32621) {
            method299(109);
        }
        return class25.method179(0, new class143[] { class274.method1806(arg0 >> 24 & 0xFF, true), class43.field729, class274.method1806((arg0 & 0xFF6792) >> 16, true), class43.field729, class274.method1806((arg0 & 0xFF92) >> 8, true), class43.field729, class274.method1806(arg0 & 0xFF, true) });
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static void method299(int arg0) {
        if (arg0 == 0) {
            field952 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)Lrd;")
    public static final class149 method300(int arg0, int arg1) {
        class149 var2 = (class149) class39.field667.method826((long) arg1, false);
        field984++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class157.field2818.method41(arg0 ^ 0xFFFFB86A, class255.method1680(arg1, (byte) -85), class208.method1454((byte) 93, arg1));
        class149 var4 = new class149();
        if (var3 != null) {
            var4.method969(47, new class190(var3));
        }
        if (arg0 != 2) {
            method298(-48, -13);
        }
        class39.field667.method827(-3, var4, (long) arg1);
        return var4;
    }
}
