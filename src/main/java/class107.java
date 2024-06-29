import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class107 extends class285 {

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "Lve;")
    private static class255 field1793 = class87.method607(44, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "I")
    public static int field1804 = 50;

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "[I")
    public static int[] field1805 = new int[field1804];

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "[I")
    public static int[] field1795 = new int[field1804];

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "[I")
    public static int[] field1802 = new int[field1804];

    @OriginalMember(owner = "client!nh", name = "T", descriptor = "[Lve;")
    public static class255[] field1808 = new class255[field1804];

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "[I")
    public static int[] field1801 = new int[field1804];

    @OriginalMember(owner = "client!nh", name = "S", descriptor = "I")
    public static int field1807 = 20;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "[I")
    public static int[] field1788 = new int[field1804];

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "[I")
    public static int[] field1806 = new int[field1804];

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "Lve;")
    public static class255 field1803 = field1793;

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "[I")
    public static int[] field1792 = new int[field1804];

    @OriginalMember(owner = "client!nh", name = "V", descriptor = "Lfe;")
    public static class231 field1810 = new class231();

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!nh", name = "X", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!nh", name = "Y", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!nh", name = "U", descriptor = "Ltk;")
    public static class239 field1809;

    @OriginalMember(owner = "client!nh", name = "W", descriptor = "Lff;")
    private class47 field1811;

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "[I")
    public static int[] field1800;

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "[S")
    public static short[] field1789;

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "[Z")
    public static boolean[] field1794;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(B)V", line = 13)
    public static void method824(byte arg0) {
        if (arg0 != -72) {
            method828((byte) 103, -81);
        }
        field1794 = null;
        field1805 = null;
        field1810 = null;
        field1803 = null;
        field1793 = null;
        field1789 = null;
        field1800 = null;
        field1788 = null;
        field1809 = null;
        field1808 = null;
        field1801 = null;
        field1792 = null;
        field1795 = null;
        field1802 = null;
        field1806 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)I", line = 40)
    public final int method825(int arg0, int arg1, int arg2) {
        field1796++;
        if (this.field1811 == null) {
            return arg2;
        }
        class172 var4 = (class172) this.field1811.method280((long) arg0, 29153);
        if (arg1 > -28) {
            field1802 = (int[]) null;
        }
        return var4 == null ? arg2 : var4.field2849;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BILve;)Lve;", line = 61)
    public final class255 method826(byte arg0, int arg1, class255 arg2) {
        if (arg0 > -46) {
            field1789 = (short[]) null;
        }
        field1812++;
        if (this.field1811 == null) {
            return arg2;
        } else {
            class50 var4 = (class50) this.field1811.method280((long) arg1, 29153);
            return var4 == null ? arg2 : var4.field751;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lpb;I)V", line = 100)
    public final void method827(class70 arg0, int arg1) {
        field1797++;
        while (true) {
            int var3 = arg0.method481(arg1 ^ 0xFFFFFF06);
            if (var3 == 0) {
                if (arg1 != -250) {
                    field1806 = (int[]) null;
                }
                return;
            }
            this.method829(arg0, -88, var3);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BI)Lmf;", line = 123)
    public static final class42 method828(byte arg0, int arg1) {
        field1813++;
        if (arg0 != -40) {
            method824((byte) 42);
        }
        class42 var2 = (class42) class259.field4392.method558((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        class42 var3 = class29.method162(arg1, false, arg0 ^ 0xFFFFD052, class120.field2003, class165.field2782);
        if (var3 != null) {
            class259.field4392.method555(var3, (long) arg1, 0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lpb;II)V", line = 161)
    private final void method829(class70 arg0, int arg1, int arg2) {
        int var4 = 45 / ((arg1 + 20) / 39);
        field1791++;
        if (arg2 != 249) {
            return;
        }
        int var5 = arg0.method481(0);
        if (this.field1811 == null) {
            int var6 = class287.method2033(var5, -1410546649);
            this.field1811 = new class47(var6);
        }
        for (int var7 = 0; var7 < var5; var7++) {
            boolean var8 = arg0.method481(0) == 1;
            int var9 = arg0.method465(true);
            class208 var10;
            if (var8) {
                var10 = new class50(arg0.method479(-1));
            } else {
                var10 = new class172(arg0.method469(85));
            }
            this.field1811.method284(true, (long) var9, var10);
        }
    }
}
