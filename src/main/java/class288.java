import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class288 {

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public int field4900;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public int field4894;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public int field4893;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public int field4903;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "Lbe;")
    public static class283 field4901 = class153.method941(-38, "Hierhin gehen");

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "[I")
    public static int[] field4895 = new int[100];

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "[I")
    public static int[] field4891;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IB)Lbe;", line = 6)
    public static final class283 method1969(int arg0, byte arg1) {
        field4890++;
        class283 var2 = class296.method2012(arg0, (byte) -21);
        for (int var3 = var2.method1925((byte) -44) - 3; var3 > 0; var3 -= 3) {
            var2 = class299.method2022(new class283[] { var2.method1936(-63, 0, var3), class58.field799, var2.method1914((byte) -126, var3) }, (byte) 93);
        }
        if (arg1 > -112) {
            field4902 = 112;
        }
        if (var2.method1925((byte) -44) > 9) {
            return class299.method2022(new class283[] { class172.field2920, var2.method1936(-63, 0, var2.method1925((byte) -44) - 8), class222.field3730, class18.field224, var2, class30.field450 }, (byte) 125);
        } else if (var2.method1925((byte) -44) <= 6) {
            return class299.method2022(new class283[] { class117.field1979, var2, class215.field3653 }, (byte) 10);
        } else {
            return class299.method2022(new class283[] { class123.field2043, var2.method1936(-63, 0, var2.method1925((byte) -44) - 4), class237.field3976, class18.field224, var2, class30.field450 }, (byte) 108);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lbe;Z)Z", line = 53)
    public static final boolean method1970(class283 arg0, boolean arg1) {
        field4898++;
        if (arg0 == null) {
            return false;
        }
        int var2 = 0;
        if (!arg1) {
            field4891 = (int[]) null;
        }
        while (var2 < class195.field3330) {
            if (arg0.method1910(16369, class127.field2102[var2])) {
                return true;
            }
            var2++;
        }
        return false;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZ)V", line = 79)
    public static final void method1971(int arg0, boolean arg1) {
        field4899++;
        class114.field1913.method1637(true, arg0);
        class303.field5120.method1637(true, arg0);
        class134.field2251.method1637(true, arg0);
        if (arg1) {
            method1969(-106, (byte) 98);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)J", line = 100)
    public static final long method1972(int arg0, int arg1, int arg2) {
        class160 var3 = class86.field1459[arg0][arg1][arg2];
        return var3 == null || var3.field2632 == null ? 0L : var3.field2632.field3362;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)V", line = 109)
    public static final void method1973(int arg0, int arg1) {
        if (arg0 == -1) {
            class72 var2 = class25.method174(arg1, (byte) 79, 6);
            field4905++;
            var2.method479(125);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 130)
    public static void method1974(int arg0) {
        field4895 = null;
        field4891 = null;
        if (arg0 != -17954) {
            method1972(91, -108, -66);
        }
        field4901 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZIIIIIII)V", line = 143)
    public static final void method1975(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4892++;
        if (arg2 < 128 || arg1 < 128 || arg2 > 13056 || arg1 > 13056) {
            class208.field3566 = -1;
            class61.field858 = -1;
            return;
        }
        int var8 = class42.method254(class61.field850, arg1, arg2, -20341) - arg4;
        int var9 = class139.field2316[class150.field2450];
        if (arg0) {
            return;
        }
        int var10 = arg2 - class116.field1976;
        int var11 = class139.field2309[class295.field5011];
        int var12 = class139.field2309[class150.field2450];
        int var13 = var8 - class63.field876;
        int var14 = arg1 - class135.field2273;
        int var15 = class139.field2316[class295.field5011];
        int var16 = var10 * var15 + var11 * var14 >> 16;
        int var17 = var14 * var15 - (var10 * var11) >> 16;
        int var19 = var9 * var13 - (var12 * var17) >> 16;
        int var20 = var9 * var17 + var12 * var13 >> 16;
        if (var20 >= 50) {
            int var22 = arg7 * 512 >> 8;
            class61.field858 = var19 * var22 / var20 + arg5;
            int var23 = arg6 * 512 >> 8;
            class208.field3566 = var16 * var23 / var20 + arg3;
        } else {
            class208.field3566 = -1;
            class61.field858 = -1;
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V", line = 200)
    public class288() {
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lha;)V", line = 204)
    public class288(class288 arg0) {
        this.field4900 = arg0.field4900;
        this.field4894 = arg0.field4894;
        this.field4893 = arg0.field4893;
        this.field4903 = arg0.field4903;
    }
}
