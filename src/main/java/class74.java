import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class74 {

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "Lad;")
    private static class5 field1763 = class88.method674("shake:", -59);

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "Lad;")
    private static class5 field1781 = class88.method674("Service unavailable)3", 101);

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "Lad;")
    public static class5 field1776 = field1781;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "Lad;")
    public static class5 field1785 = class88.method674("Lade Spiel)2Fenster )2 ", -108);

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "Lad;")
    public static class5 field1777 = class88.method674("Angreifen", 107);

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "Lad;")
    public static class5 field1770 = class88.method674("Spiel)2Fenster geladen)3", 47);

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "Lad;")
    public static class5 field1778 = class88.method674("Ung-Ultiges Anmelde)2Paket)3", 76);

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "Lad;")
    public static class5 field1786 = field1763;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public int field1764;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public int field1765;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public int field1769;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public int field1773;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    public int field1784;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "Lra;")
    public class103 field1768;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "Lra;")
    public class103 field1775;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "Lra;")
    public class103 field1780;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "[I")
    public static int[] field1779;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "[Luc;")
    public static class123[] field1761;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIBIIII)I", line = 5)
    public static final int method587(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg0;
            arg0 = var7;
        }
        int var8 = arg6 & 0x3;
        field1774++;
        if (arg2 != 96) {
            method588(-78L, (byte) -4);
        }
        if (var8 == 0) {
            return arg1;
        } else if (var8 == 1) {
            return arg3;
        } else if (var8 == 2) {
            return 7 + 1 - arg1 - arg4;
        } else {
            return 1 + 7 - arg0 - arg3;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(JB)V", line = 58)
    public static final void method588(long arg0, byte arg1) {
        int var3 = -80 % ((arg1 - 71) / 38);
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var4) {
        }
        field1767++;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V", line = 71)
    public static void method589(byte arg0) {
        if (arg0 > -47) {
            return;
        }
        field1779 = null;
        field1781 = null;
        field1785 = null;
        field1776 = null;
        field1786 = null;
        field1761 = null;
        field1777 = null;
        field1770 = null;
        field1778 = null;
        field1763 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIII)V", line = 92)
    public static final void method590(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1782++;
        if (!class116.method928(-119, arg0)) {
            return;
        }
        class99.method795(arg5, arg4, -1, 0, arg3, 0, arg2, class121.field3013[arg0], 19670, arg6);
        int var7 = 59 / ((arg1 - 86) / 38);
        if (class90.field2120 == null) {
            return;
        }
        class105 var8 = class90.field2120;
        class105 var9 = class16.method129((byte) -127, var8);
        if (var9 == null) {
            return;
        }
        int[] var10 = class4.method29(var9, (byte) 44);
        int[] var11 = class4.method29(var8, (byte) 72);
        int var12 = class22.field564 + var11[0] - var10[0] - class99.field2406;
        int var13 = class91.field2131 + var11[1] - var10[1] - class23.field591;
        if (var13 < 0) {
            var13 = 0;
        }
        if (var8.field2611 + var13 > var9.field2611) {
            var13 = var9.field2611 - var8.field2611;
        }
        if (var12 < 0) {
            var12 = 0;
        }
        if (var9.field2636 < var8.field2636 + var12) {
            var12 = var9.field2636 - var8.field2636;
        }
        if (class90.field2120.field2544 != null && (arg4 & 0x200) != 0) {
            class50.method428(var13, var12, var8, var8.field2544, -4073, 0);
        }
        if (class54.field1346 != 0 || (arg4 & 0x400) == 0) {
            return;
        }
        if (class90.field2120.field2576 != null) {
            class50.method428(var13, var12, var8, var8.field2576, -4073, 0);
        }
        class90.field2120 = null;
        return;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)V", line = 174)
    public static final void method591(byte arg0) {
        class1.field4.method101((byte) -103);
        if (arg0 >= -88) {
            method588(-3L, (byte) 47);
        }
        field1762++;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLrd;Lrd;)V", line = 189)
    public static final void method592(byte arg0, class106 arg1, class106 arg2) {
        if (arg0 <= 59) {
            field1770 = null;
        }
        field1766++;
        class6.field226 = arg1;
        class30.field724 = arg2;
    }
}
