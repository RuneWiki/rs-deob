import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class406 implements class487 {

    @OriginalMember(owner = "client!maa", name = "d", descriptor = "Llk;")
    public static class510 field6124 = new class510();

    @OriginalMember(owner = "client!maa", name = "e", descriptor = "Los;")
    public static class379 field6125 = new class379();

    @OriginalMember(owner = "client!maa", name = "h", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field6128 = new Rectangle[100];

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "I")
    public static int field6121;

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!maa", name = "f", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!maa", name = "g", descriptor = "I")
    public static int field6127;

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "Loc;")
    public static class175 field6123;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)V")
    public static void method2573(int arg0) {
        field6124 = null;
        field6128 = null;
        field6125 = null;
        field6123 = null;
        if (arg0 != 0) {
            method2573(116);
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(IIIZLqb;)V")
    public static final void method2574(int arg0, int arg1, int arg2, boolean arg3, class191 arg4) {
        field6121++;
        class154 var5 = arg4.method1158((byte) -126);
        int var6 = arg4.field2444 - arg4.field2501.field1811 & 0x3FFF;
        if (arg2 == -1) {
            if (var6 != 0 || arg4.field2452 > 25) {
                arg4.field2432 = false;
                if (arg1 < 0 && var5.field1908 != -1) {
                    arg4.field2434 = var5.field1908;
                } else if (arg1 <= 0 || var5.field1899 == -1) {
                    arg4.field2434 = var5.field1909;
                } else {
                    arg4.field2434 = var5.field1899;
                }
            } else if (!arg4.field2432 || !var5.method899(arg4.field2434, false)) {
                arg4.field2434 = var5.method898(0);
                arg4.field2432 = arg4.field2434 != -1;
            }
        } else if (arg4.field2469 != -1 && var6 >= 10240 || var6 <= 2048) {
            int var7 = class24.field253[arg0] - arg4.field2501.field1811 & 0x3FFF;
            arg4.field2432 = false;
            if (arg2 == 2 && var5.field1905 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field1896 != -1) {
                    arg4.field2434 = var5.field1896;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field1910 != -1) {
                    arg4.field2434 = var5.field1910;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field1881 == -1) {
                    arg4.field2434 = var5.field1905;
                } else {
                    arg4.field2434 = var5.field1881;
                }
            } else if (arg2 == 0 && var5.field1886 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field1872 != -1) {
                    arg4.field2434 = var5.field1872;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field1888 != -1) {
                    arg4.field2434 = var5.field1888;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field1876 == -1) {
                    arg4.field2434 = var5.field1886;
                } else {
                    arg4.field2434 = var5.field1876;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field1878 != -1) {
                arg4.field2434 = var5.field1878;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field1894 != -1) {
                arg4.field2434 = var5.field1894;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field1870 == -1) {
                arg4.field2434 = var5.field1909;
            } else {
                arg4.field2434 = var5.field1870;
            }
        } else if (var6 == 0 && arg4.field2452 <= 25) {
            arg4.field2432 = false;
            if (arg2 == 2 && var5.field1905 != -1) {
                arg4.field2434 = var5.field1905;
            } else if (arg2 == 0 && var5.field1886 != -1) {
                arg4.field2434 = var5.field1886;
            } else {
                arg4.field2434 = var5.field1909;
            }
        } else {
            if (arg2 == 2 && var5.field1905 != -1) {
                if (arg1 < 0 && var5.field1877 != -1) {
                    arg4.field2434 = var5.field1877;
                } else if (arg1 <= 0 || var5.field1904 == -1) {
                    arg4.field2434 = var5.field1905;
                } else {
                    arg4.field2434 = var5.field1904;
                }
            } else if (arg2 == 0 && var5.field1886 != -1) {
                if (arg1 < 0 && var5.field1891 != -1) {
                    arg4.field2434 = var5.field1891;
                } else if (arg1 <= 0 || var5.field1883 == -1) {
                    arg4.field2434 = var5.field1886;
                } else {
                    arg4.field2434 = var5.field1883;
                }
            } else if (arg1 < 0 && var5.field1875 != -1) {
                arg4.field2434 = var5.field1875;
            } else if (arg1 <= 0 || var5.field1887 == -1) {
                arg4.field2434 = var5.field1909;
            } else {
                arg4.field2434 = var5.field1887;
            }
            arg4.field2432 = false;
        }
        if (arg3) {
            field6126 = 36;
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(Ldb;[IIJ)Ljava/lang/String;")
    public final String method2575(class272 arg0, int[] arg1, int arg2, long arg3) {
        field6122++;
        if (arg2 != 0) {
            method2573(64);
        }
        if (class299.field4413 == arg0) {
            class242 var6 = class573.field8276.method3539(arg1[0], (byte) -75);
            return var6.method1618((byte) 92, (int) arg3);
        } else if (class485.field7098 == arg0 || class456.field6831 == arg0) {
            class190 var7 = class622.field8999.method25((int) arg3, -18);
            return var7.field2408;
        } else if (class234.field3344 == arg0 || class410.field6249 == arg0 || class1.field8 == arg0) {
            return class573.field8276.method3539(arg1[0], (byte) -125).method1618((byte) -76, (int) arg3);
        } else {
            return null;
        }
    }
}
