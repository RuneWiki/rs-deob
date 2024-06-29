import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class120 extends class196 {

    @OriginalMember(owner = "client!sm", name = "x", descriptor = "[[I")
    public static int[][] field1877 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!sm", name = "z", descriptor = "[Z")
    public static boolean[] field1879 = new boolean[112];

    @OriginalMember(owner = "client!sm", name = "O", descriptor = "[Z")
    public static boolean[] field1891 = new boolean[200];

    @OriginalMember(owner = "client!sm", name = "y", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!sm", name = "A", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!sm", name = "F", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!sm", name = "I", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!sm", name = "J", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!sm", name = "K", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!sm", name = "L", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!sm", name = "M", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!sm", name = "N", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!sm", name = "H", descriptor = "Lce;")
    public static class128 field1884;

    @OriginalMember(owner = "client!sm", name = "C", descriptor = "Ltd;")
    private class192 field1881;

    @OriginalMember(owner = "client!sm", name = "E", descriptor = "Llm;")
    public static class210 field1882;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lre;I)V", line = 5)
    public final void method872(class263 arg0, int arg1) {
        if (arg1 != 24368) {
            field1879 = (boolean[]) null;
        }
        field1888++;
        while (true) {
            int var3 = arg0.method1787(false);
            if (var3 == 0) {
                return;
            }
            this.method873(var3, (byte) 63, arg0);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IBLre;)V", line = 29)
    private final void method873(int arg0, byte arg1, class263 arg2) {
        if (arg0 == 249) {
            int var4 = arg2.method1787(false);
            if (this.field1881 == null) {
                int var5 = class104.method731(var4, -57);
                this.field1881 = new class192(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method1787(false) == 1;
                int var8 = arg2.method1824(false);
                class101 var9;
                if (var7) {
                    var9 = new class241(arg2.method1801(-30054));
                } else {
                    var9 = new class261(arg2.method1826(-206227536));
                }
                this.field1881.method1319(-103, (long) var8, var9);
            }
        }
        if (arg1 == 63) {
            field1883++;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lna;IIII)V", line = 81)
    public static final void method874(class22 arg0, int arg1, int arg2, int arg3, int arg4) {
        field1887++;
        for (class252 var5 = (class252) class162.field2444.method1109(arg3 ^ 0xDE); var5 != null; var5 = (class252) class162.field2444.method1115((byte) 104)) {
            if (var5.field3772 == arg2 && arg4 * 128 == var5.field3764 && arg1 * 128 == var5.field3762 && var5.field3767.field331 == arg0.field331) {
                if (var5.field3776 != null) {
                    class72.field936.method2230(var5.field3776);
                    var5.field3776 = null;
                }
                if (var5.field3777 != null) {
                    class72.field936.method2230(var5.field3777);
                    var5.field3777 = null;
                }
                var5.method714(-33);
                return;
            }
        }
        if (arg3 != 128) {
            method874((class22) null, 119, 127, -45, -32);
        }
    }

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "(I)V", line = 122)
    public static final void method875(int arg0) {
        field1880++;
        if (arg0 < 82) {
            field1886 = 111;
        }
        class56.field707.method2176((byte) -73);
        class183.field2734.method2176((byte) -114);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIB)I", line = 140)
    public final int method876(int arg0, int arg1, byte arg2) {
        field1885++;
        if (arg2 >= -36) {
            return 116;
        } else if (this.field1881 == null) {
            return arg0;
        } else {
            class261 var4 = (class261) this.field1881.method1320((long) arg1, 13002);
            return var4 == null ? arg0 : var4.field3954;
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(BILjava/lang/String;)Ljava/lang/String;", line = 162)
    public final String method877(byte arg0, int arg1, String arg2) {
        field1878++;
        if (this.field1881 == null) {
            return arg2;
        } else if (arg0 == -29) {
            class241 var4 = (class241) this.field1881.method1320((long) arg1, 13002);
            return var4 == null ? arg2 : var4.field3586;
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)Z", line = 189)
    public static final boolean method878(int arg0, int arg1) {
        field1889++;
        if (arg1 != 11770) {
            method874((class22) null, 77, 23, -124, 27);
        }
        return (arg0 & -arg0) == arg0;
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)V", line = 206)
    public static void method879(byte arg0) {
        field1884 = null;
        field1891 = null;
        int var1 = -105 / ((arg0 - 53) / 44);
        field1879 = null;
        field1882 = null;
        field1877 = (int[][]) null;
    }
}
