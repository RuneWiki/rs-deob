import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public abstract class class140 {

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "Lqk;")
    public static class1 field1785 = new class1(28, 3);

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "I")
    public static int field1789 = 0;

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!aba", name = "h", descriptor = "Lho;")
    public static class318 field1792;

    @OriginalMember(owner = "client!aba", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1790;

    @OriginalMember(owner = "client!aba", name = "g", descriptor = "[[[S")
    public static short[][][] field1791;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(ILpja;)I", line = 3)
    public static final int method928(int arg0, class171 arg1) {
        field1787++;
        String var2 = class298.method1949(arg1, -106);
        int[] var3 = null;
        if (arg0 != -1) {
            method928(-55, null);
        }
        if (class557.method3281(arg1.field2174, arg0 - 105)) {
            var3 = class35.field367.method3051((byte) -20, (int) arg1.field2179).field8162;
        } else if (arg1.field2171 != -1) {
            var3 = class35.field367.method3051((byte) -20, arg1.field2171).field8162;
        } else if (class651.method3728((byte) 76, arg1.field2174)) {
            class685 var6 = (class685) class450.field6288.method3669(false, (long) ((int) arg1.field2179));
            if (var6 != null) {
                class359 var7 = var6.field9573;
                class636 var8 = var7.field5172;
                if (var8.field8872 != null) {
                    var8 = var8.method3650(class173.field2192, (byte) 55);
                }
                if (var8 != null) {
                    var3 = var8.field8921;
                }
            }
        } else if (class593.method3465(arg1.field2174, (byte) -117)) {
            Object var4 = null;
            class286 var5;
            if (arg1.field2174 == 1003) {
                var5 = class390.field5558.method3065(arg0 ^ 0x76, (int) arg1.field2179);
            } else {
                var5 = class390.field5558.method3065(-123, (int) (arg1.field2179 >>> 32 & 0x7FFFFFFFL));
            }
            if (var5.field4136 != null) {
                var5 = var5.method1889(class173.field2192, false);
            }
            if (var5 != null) {
                var3 = var5.field4174;
            }
        }
        if (var3 != null) {
            var2 = var2 + class468.method2797(116, var3);
        }
        int var9 = class705.field9812.method1956(class492.field6782, var2, false);
        if (arg1.field2173) {
            var9 += class208.field2898.method737() + 4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(B)V", line = 76)
    public static void method929(byte arg0) {
        field1792 = null;
        if (arg0 == 123) {
            field1790 = null;
            field1791 = null;
            field1785 = null;
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(III)Z", line = 92)
    public static final boolean method930(int arg0, int arg1, int arg2) {
        if (arg2 == -20667) {
            field1786++;
            return (arg0 & 0x84080) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)V")
    public abstract void method267(int arg0);

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(I)V")
    public abstract void method270(int arg0);

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(II)Z")
    public abstract boolean method273(int arg0, int arg1);

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(B)Loj;")
    public abstract class659 method272(byte arg0);
}
