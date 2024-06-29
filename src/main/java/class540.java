import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class540 extends class529 {

    @OriginalMember(owner = "client!nt", name = "v", descriptor = "Lcw;")
    public static class96 field7897 = class190.method1186(true);

    @OriginalMember(owner = "client!nt", name = "w", descriptor = "[I")
    public static int[] field7898 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!nt", name = "m", descriptor = "I")
    public int field7888;

    @OriginalMember(owner = "client!nt", name = "o", descriptor = "I")
    public static int field7890;

    @OriginalMember(owner = "client!nt", name = "r", descriptor = "I")
    public int field7893;

    @OriginalMember(owner = "client!nt", name = "s", descriptor = "I")
    public static int field7894;

    @OriginalMember(owner = "client!nt", name = "x", descriptor = "Lvt;")
    public static class522 field7899;

    @OriginalMember(owner = "client!nt", name = "q", descriptor = "[I")
    public int[] field7892;

    @OriginalMember(owner = "client!nt", name = "t", descriptor = "[I")
    public int[] field7895;

    @OriginalMember(owner = "client!nt", name = "u", descriptor = "[I")
    public int[] field7896;

    @OriginalMember(owner = "client!nt", name = "l", descriptor = "[Ljl;")
    public class495[] field7887;

    @OriginalMember(owner = "client!nt", name = "n", descriptor = "[Ljl;")
    public class495[] field7889;

    @OriginalMember(owner = "client!nt", name = "p", descriptor = "[[[B")
    public byte[][][] field7891;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
    public static void method3190(int arg0) {
        field7899 = null;
        field7897 = null;
        int var1 = -72 % ((arg0 + 50) / 42);
        field7898 = null;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lqc;B)I")
    public static final int method3191(class140 arg0, byte arg1) {
        field7890++;
        String var2 = class169.method1071(arg0, (byte) -5);
        int var3 = 62 / ((arg1 + 29) / 48);
        int[] var4 = null;
        if (class518.method3108((byte) -66, arg0.field1894)) {
            var4 = class337.field5262.method2077((byte) -65, (int) arg0.field1895).field2995;
        } else if (arg0.field1898 != -1) {
            var4 = class337.field5262.method2077((byte) -65, arg0.field1898).field2995;
        } else if (class433.method2725((byte) -70, arg0.field1894)) {
            class38 var5 = (class38) class365.field5659.method1122((byte) 59, (long) ((int) arg0.field1895));
            if (var5 != null) {
                class378 var6 = var5.field378;
                class191 var7 = var6.field5809;
                if (var7.field2798 != null) {
                    var7 = var7.method1190(-1, class96.field1394);
                }
                if (var7 != null) {
                    var4 = var7.field2837;
                }
            }
        } else if (class61.method454(arg0.field1894, 1002)) {
            Object var8 = null;
            class156 var9;
            if (arg0.field1894 == 1007) {
                var9 = class454.field7029.method3002(-1, (int) arg0.field1895);
            } else {
                var9 = class454.field7029.method3002(-1, (int) (arg0.field1895 >>> 32 & 0x7FFFFFFFL));
            }
            if (var9.field2134 != null) {
                var9 = var9.method962((byte) 56, class96.field1394);
            }
            if (var9 != null) {
                var4 = var9.field2101;
            }
        }
        if (var4 != null) {
            var2 = var2 + class326.method2180(var4, -33);
        }
        int var10 = class306.field4807.method2255(var2, class243.field3946, 169);
        if (arg0.field1904) {
            var10 += class120.field1645.method626() + 4;
        }
        return var10;
    }
}
