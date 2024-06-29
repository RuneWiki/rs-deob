import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class126 extends class240 {

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "I")
    private int field1738;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
    private int field1737;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    private int field1724;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    private int field1731;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public static int field1721 = -1;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field1736 = new String[5];

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "I")
    public static int field1740 = 0;

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "I")
    public static int field1735 = 0;

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "I")
    public static int field1742 = 50;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "[I")
    public static int[] field1730 = new int[field1742];

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "[I")
    public static int[] field1733 = new int[field1742];

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "[I")
    public static int[] field1720 = new int[field1742];

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "[I")
    public static int[] field1729 = new int[field1742];

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field1722 = new String[field1742];

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "[I")
    public static int[] field1734 = new int[field1742];

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "[I")
    public static int[] field1744 = new int[field1742];

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "[I")
    public static int[] field1726 = new int[field1742];

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "F")
    public static float field1728;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!bk", name = "J", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "[[I")
    public static int[][] field1723;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(III)V", line = 13)
    public final void method495(int arg0, int arg1, int arg2) {
        field1739++;
        if (arg2 != 24998) {
            field1744 = (int[]) null;
        }
        int var4 = this.field1738 * arg1 >> 12;
        int var5 = this.field1731 * arg1 >> 12;
        int var6 = this.field1724 * arg0 >> 12;
        int var7 = this.field1737 * arg0 >> 12;
        class326.method2283(this.field3400, var5, var4, -14, var7, var6);
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(IIIIIII)V", line = 31)
    public class126(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1738 = arg2;
        this.field1737 = arg3;
        this.field1724 = arg1;
        this.field1731 = arg0;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(III)V", line = 56)
    public final void method501(int arg0, int arg1, int arg2) {
        field1743++;
        int var4 = this.field1724 * arg2 >> 12;
        int var5 = this.field1731 * arg1 >> 12;
        int var6 = this.field1737 * arg2 >> 12;
        int var7 = this.field1738 * arg1 >> 12;
        class26.method153(var5, (byte) -42, var6, var7, this.field3401, var4, this.field3402);
        if (arg0 != -4621) {
            this.field1731 = 83;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BIZLjava/lang/String;)I", line = 75)
    public static final int method911(byte arg0, int arg1, boolean arg2, String arg3) {
        field1725++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        int var5 = 0;
        boolean var6 = false;
        int var7 = arg3.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var6 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
                    continue;
                }
            }
            int var12;
            if (var9 >= '0' && var9 <= '9') {
                var12 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var12 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var12 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg1 <= var12) {
                throw new NumberFormatException();
            }
            if (var6) {
                var12 = -var12;
            }
            int var10 = arg1 * var5 + var12;
            if (var10 / arg1 != var5) {
                throw new NumberFormatException();
            }
            var4 = true;
            var5 = var10;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        int var11 = -76 / ((arg0 + 56) / 50);
        return var5;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V", line = 154)
    public static void method912(int arg0) {
        field1726 = null;
        field1722 = null;
        field1744 = null;
        field1723 = (int[][]) null;
        field1734 = null;
        field1730 = null;
        field1720 = null;
        field1729 = null;
        field1736 = null;
        if (arg0 == 36) {
            field1733 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIILdn;IJZ)Z", line = 172)
    public static final boolean method913(int arg0, int arg1, int arg2, int arg3, int arg4, class132 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class189.method1321(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IBIII)V", line = 207)
    public static final void method914(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1719++;
        if (class67.field908) {
            class102.method753(arg2, arg0, arg2 + arg4, arg0 + arg3);
            class102.method738(arg2, arg0, arg4, arg3, 0);
        } else {
            class38.method220(arg2, arg0, arg2 + arg4, arg0 - -arg3);
            class38.method224(arg2, arg0, arg4, arg3, 0);
        }
        if (class125.field1700 < 100) {
            return;
        }
        if (class20.field259 == null || class20.field259.field2323 != arg4 || class20.field259.field2317 != arg3) {
            class178 var5 = new class178(arg4, arg3);
            class38.method228(var5.field2403, arg4, arg3);
            class287.method1966(-799384912, class56.field765, arg3, class20.field258, 0, 0, 0, 0, arg4);
            if (class67.field908) {
                class20.field259 = new class328(var5);
            } else {
                class20.field259 = var5;
            }
            if (class67.field908) {
                class38.field429 = null;
            } else {
                class272.field4079.method1111((byte) 121);
            }
        }
        int var6 = 16711680;
        class20.field259.method844(arg2, arg0);
        int var7 = class207.field2981 * arg3 / class56.field765 + arg0;
        int var8 = class138.field1900 * arg3 / class56.field765;
        int var9 = arg2 + (class22.field289 * arg4 / class20.field258);
        int var10 = class31.field374 * arg4 / class20.field258;
        if (class39.field448 == 1) {
            var6 = 16777215;
        }
        if (arg1 <= 5) {
            method912(-23);
        }
        if (class67.field908) {
            class102.method745(var9, var7, var10, var8, var6, 128);
            class102.method750(var9, var7, var10, var8, var6);
        } else {
            class38.method231(var9, var7, var10, var8, var6, 128);
            class38.method216(var9, var7, var10, var8, var6);
        }
        if (class129.field1776 <= 0) {
            return;
        }
        int var11;
        if (class162.field2229 <= 10) {
            var11 = class162.field2229 * 25;
        } else {
            var11 = 500 - (class162.field2229 * 25);
        }
        for (class30 var12 = (class30) class204.field2931.method1335(1); var12 != null; var12 = (class30) class204.field2931.method1336(3)) {
            if (class61.field813 == var12.field365) {
                int var13 = arg2 + (var12.field367 * arg4 / class20.field258);
                int var14 = arg0 + (var12.field369 * arg3 / class56.field765);
                if (class67.field908) {
                    class102.method745(var13 - 2, var14 + -2, 4, 4, 16776960, var11);
                } else {
                    class38.method231(var13 - 2, var14 + -2, 4, 4, 16776960, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)V", line = 323)
    public final void method499(int arg0, int arg1, int arg2) {
        if (arg1 != 6893) {
            return;
        }
        int var4 = this.field1731 * arg2 >> 12;
        int var5 = this.field1724 * arg0 >> 12;
        field1732++;
        int var6 = this.field1737 * arg0 >> 12;
        int var7 = this.field1738 * arg2 >> 12;
        class324.method2273(false, var7, this.field3400, this.field3402, var5, var4, var6, this.field3401);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)Lbn;", line = 348)
    public static final class9 method915(int arg0, int arg1) {
        field1741++;
        if (arg0 != 1472219564) {
            method912(-79);
        }
        class9 var2 = (class9) class140.field1918.method716((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class256.field3708.method955(arg1, 0, -21853);
        class9 var4 = new class9(var3);
        var4.method1905(class141.field1935, (int[]) null);
        class140.field1918.method721((long) arg1, var4, 0);
        return var4;
    }
}
