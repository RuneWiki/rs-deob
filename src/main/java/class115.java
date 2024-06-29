import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class115 {

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "Lac;")
    private class135 field1700 = new class135();

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "Lce;")
    private class216 field1715 = new class216();

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
    private int field1714;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
    private int field1712;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "Lpk;")
    private class100 field1713;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field1695 = new String[100];

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "S")
    public static short field1696 = 1;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field1697 = 10;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "[[B")
    public static byte[][] field1703 = new byte[1000][];

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public static int field1707 = 500;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1704 = "Loaded input handler";

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "[I")
    public static int[] field1698;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)Ldh;")
    public final class120 method761(int arg0) {
        if (arg0 == 2) {
            field1701++;
            return this.field1713.method671(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)Ldh;")
    public final class120 method762(int arg0) {
        if (arg0 != 1) {
            field1703 = null;
        }
        field1709++;
        return this.field1713.method666(-124);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILac;J)V")
    public final void method763(int arg0, class135 arg1, long arg2) {
        field1711++;
        int var5 = 121 / ((19 - arg0) / 46);
        if (this.field1714 == 0) {
            class135 var6 = this.field1715.method1464(true);
            var6.method784(false);
            var6.method912(-120);
            if (this.field1700 == var6) {
                class135 var7 = this.field1715.method1464(true);
                var7.method784(false);
                var7.method912(-127);
            }
        } else {
            this.field1714--;
        }
        this.field1713.method662(0, arg1, arg2);
        this.field1715.method1466(arg1, -120);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method764(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(JI)Lac;")
    public final class135 method765(long arg0, int arg1) {
        class135 var4 = (class135) this.field1713.method665((byte) -83, arg0);
        if (var4 != null) {
            this.field1715.method1466(var4, -107);
        }
        if (arg1 != 0) {
            this.method761(7);
        }
        field1706++;
        return var4;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V")
    public static final void method766(int arg0) {
        field1710++;
        if (arg0 > 19) {
            class23.field287.method1420(-1);
        }
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)V")
    public final void method767(int arg0) {
        field1702++;
        this.field1715.method1465((byte) 105);
        this.field1713.method670(72);
        this.field1700 = new class135();
        this.field1714 = this.field1712;
        if (arg0 != 18345) {
            this.method763(42, (class135) null, 8L);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ldl;B)V")
    public static final void method768(class123 arg0, byte arg1) {
        field1694++;
        if (class192.field3036) {
            return;
        }
        class127.method865();
        class121.field1758 = class248.method1669((byte) 14, class170.field2662, arg0);
        int var2 = class98.field1510;
        int var3 = var2 * 956 / 503;
        class121.field1758.method91((class135.field1960 - var3) / 2, 0, var3, var2);
        class66.field915 = class242.method1638(arg0, class131.field1921, (byte) -107);
        int var4 = 88 % ((arg1 + 79) / 35);
        class66.field915.method106(class135.field1960 / 2 - (class66.field915.field2148 / 2), 18);
        class192.field3036 = true;
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(I)V")
    public static void method769(int arg0) {
        field1703 = null;
        field1695 = null;
        if (arg0 != -1) {
            field1697 = -52;
        }
        field1698 = null;
        field1704 = null;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(I)V")
    public class115(int arg0) {
        this.field1714 = arg0;
        this.field1712 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field1713 = new class100(var2);
    }
}
