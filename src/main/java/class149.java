import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class149 {

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public int field2158 = 8;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public int field2159 = 16777215;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "S")
    public static short field2161 = 256;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field2156 = 0;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2160 = "";

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field2165 = 0;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public int field2152;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public int field2154;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public int field2157;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public int field2162;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public int field2164;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Z")
    public boolean field2155;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILca;)V")
    public final void method1008(int arg0, int arg1, class54 arg2) {
        field2166++;
        if (arg1 != -1) {
            return;
        }
        while (true) {
            int var4 = arg2.method407(255);
            if (var4 == 0) {
                return;
            }
            this.method1011(var4, arg2, arg0, (byte) -93);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
    public static void method1009(byte arg0) {
        field2160 = null;
        int var1 = 55 / ((arg0 - 19) / 43);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIBIII)V")
    public static final void method1010(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 18) {
            return;
        }
        class148.field2147[0].method368(arg0, arg1);
        int var6 = (arg4 - 32) * arg4 / arg3;
        if (var6 < 8) {
            var6 = 8;
        }
        class148.field2147[1].method368(arg0, arg1 + arg4 - 16);
        field2153++;
        int var7 = (arg4 - var6 - 32) * arg5 / (arg3 - arg4);
        class72.method576(arg0, arg1 + 16, 16, arg4 - 32, class236.field3635);
        class72.method576(arg0, arg1 + var7 + 16, 16, var6, class117.field1765);
        class72.method579(arg0, arg1 + var7 + 16, var6, class102.field1494);
        class72.method579(arg0 + 1, arg1 + 16 - -var7, var6, class102.field1494);
        class72.method572(arg0, arg1 + var7 + 16, 16, class102.field1494);
        class72.method572(arg0, arg1 + var7 + 17, 16, class102.field1494);
        class72.method579(arg0 + 15, arg1 + 16 + var7, var6, class251.field3889);
        class72.method579(arg0 + 14, arg1 + var7 - -17, var6 - 1, class251.field3889);
        class72.method572(arg0, arg1 + var6 + var7 + 15, 16, class251.field3889);
        class72.method572(arg0 + 1, 14 - -var7 + arg1 + var6, 15, class251.field3889);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILca;IB)V")
    private final void method1011(int arg0, class54 arg1, int arg2, byte arg3) {
        if (arg0 == 1) {
            this.field2158 = arg1.method423(90);
        } else if (arg0 == 2) {
            this.field2155 = true;
        } else if (arg0 == 3) {
            this.field2157 = arg1.method457((byte) 115);
            this.field2154 = arg1.method457((byte) 93);
            this.field2162 = arg1.method457((byte) 59);
        } else if (arg0 == 4) {
            this.field2152 = arg1.method407(255);
        } else if (arg0 == 5) {
            this.field2164 = arg1.method423(83);
        } else if (arg0 == 6) {
            this.field2159 = arg1.method408(8);
        }
        field2167++;
        if (arg3 >= -49) {
            field2165 = 96;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static final void method1012(int arg0) {
        field2163++;
        class30.field551 = null;
        class67.method532(0, class85.field1311, class184.field2677, -112, -1, class126.field1854, 0, 0, 0);
        if (class30.field551 != null) {
            class103.method751(class185.field2699, class208.field3121, 0, arg0 ^ 0xFFFF84E9, 0, class260.field3988.field4567, -1412584499, class85.field1311, class126.field1854, class30.field551);
            class30.field551 = null;
        }
        if (arg0 != -31601) {
            method1009((byte) 91);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)Lqf;")
    public static final class293 method1013(int arg0, boolean arg1) {
        field2168++;
        if (!arg1) {
            field2165 = -48;
        }
        return class49.field807 && class136.field1987 <= arg0 && class172.field2523 >= arg0 ? class47.field788[arg0 - class136.field1987] : null;
    }
}
