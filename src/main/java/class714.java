import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class714 {

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "Luw;")
    public static class208 field9402 = new class208(98, 6);

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
    public static int field9403;

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
    public static int field9404;

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "I")
    public static int field9405;

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "I")
    public static int field9407;

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "[[Z")
    public static boolean[][] field9406;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(III)I", line = 13)
    public static final int method3843(int arg0, int arg1, int arg2) {
        field9404++;
        int var3 = arg1 >>> 31;
        return arg2 <= 108 ? 75 : (arg1 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Llq;Z[[[BIB)Z", line = 26)
    public static final boolean method3844(class210 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class230.field3104) {
            return false;
        }
        int var5 = arg0.field2896 >> class88.field1221;
        int var6 = var5;
        int var7 = arg0.field2900 >> class88.field1221;
        int var8 = var7;
        if (arg0 instanceof class620) {
            var6 = ((class620) arg0).field7849;
            var8 = ((class620) arg0).field7850;
            var5 = ((class620) arg0).field7852;
            var7 = ((class620) arg0).field7844;
        }
        for (int var9 = var5; var9 <= var6; var9++) {
            for (int var10 = var7; var10 <= var8; var10++) {
                if (arg0.field2889 < class78.field1121 && var9 >= class141.field1853 && var9 < class70.field957 && var10 >= class61.field804 && var10 < class24.field206) {
                    if ((arg2 == null || arg0.field2895 < arg3 || arg2[arg0.field2895][var9][var10] != arg4) && arg0.method718(-122) && !arg0.method717(class398.field5275, 80)) {
                        return false;
                    }
                    if (!arg1 && var9 >= class454.field5914 - 16 && var9 <= class454.field5914 + 16 && var10 >= class309.field3875 - 16 && var10 <= class309.field3875 + 16) {
                        if (class70.field955) {
                            class520.field6609[class450.field5878++].method1870(arg0, (byte) -85);
                            class450.field5878 %= class106.field1448;
                        } else {
                            arg0.method182(class398.field5275, -107);
                        }
                    }
                }
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(BILih;II)V", line = 106)
    public static final void method3845(byte arg0, int arg1, class773 arg2, int arg3, int arg4) {
        field9405++;
        for (class53 var5 = (class53) class409.field5429.method3591(0); var5 != null; var5 = (class53) class409.field5429.method3600((byte) 103)) {
            if (var5.field679 == arg4 && (arg3 << 9) == var5.field673 && (arg1 << 9) == var5.field683 && var5.field668.field10531 == arg2.field10531) {
                if (var5.field686 != null) {
                    class1.field10.method30(var5.field686);
                    var5.field686 = null;
                }
                if (var5.field689 != null) {
                    class1.field10.method30(var5.field689);
                    var5.field689 = null;
                }
                var5.method1946(-10364);
                return;
            }
        }
        if (arg0 < 4) {
            field9402 = null;
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)V", line = 148)
    public static void method3846(byte arg0) {
        field9406 = null;
        if (arg0 != -45) {
            method3846((byte) -41);
        }
        field9402 = null;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIZIZ)I", line = 160)
    public static final int method3847(int arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        field9403++;
        class148 var5 = class398.method2306(arg1, arg4, (byte) 41);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5.field1892.length; var7++) {
            if (var5.field1892[var7] >= 0 && var5.field1892[var7] < class640.field8189.field1555) {
                class48 var8 = class640.field8189.method705(var5.field1892[var7], -11467);
                int var9 = var8.method295(arg0, (byte) -67, class761.field10377.method4101(arg0, 11).field7096);
                if (arg2) {
                    var6 += var5.field1884[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        if (arg3 == 1) {
            return var6;
        } else {
            return -68;
        }
    }
}
