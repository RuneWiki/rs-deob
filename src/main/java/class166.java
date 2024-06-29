import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class166 extends class202 {

    @OriginalMember(owner = "client!gk", name = "V", descriptor = "[Lpc;")
    public class241[] field2973;

    @OriginalMember(owner = "client!gk", name = "P", descriptor = "[I")
    public static int[] field2967 = new int[2];

    @OriginalMember(owner = "client!gk", name = "O", descriptor = "I")
    public static int field2966 = 0;

    @OriginalMember(owner = "client!gk", name = "W", descriptor = "I")
    public static int field2974 = 7759444;

    @OriginalMember(owner = "client!gk", name = "N", descriptor = "Lsb;")
    private static class98 field2965 = class47.method368("Walk here", 0);

    @OriginalMember(owner = "client!gk", name = "Q", descriptor = "I")
    public static int field2968 = -1;

    @OriginalMember(owner = "client!gk", name = "R", descriptor = "Lsb;")
    public static class98 field2969 = field2965;

    @OriginalMember(owner = "client!gk", name = "Y", descriptor = "Lsb;")
    public static class98 field2976 = class47.method368("(U0a )2 non)2existant gosub script)2num: ", 0);

    @OriginalMember(owner = "client!gk", name = "S", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!gk", name = "T", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!gk", name = "U", descriptor = "Lhh;")
    public static class38 field2972;

    @OriginalMember(owner = "client!gk", name = "X", descriptor = "[[[B")
    public static byte[][][] field2975;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "(B)V")
    public static void method1187(byte arg0) {
        field2972 = null;
        field2967 = null;
        field2965 = null;
        field2969 = null;
        field2976 = null;
        field2975 = null;
        if (arg0 >= -47) {
            field2972 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Ltg;Ltg;IZ)V")
    public class166(class75 arg0, class75 arg1, int arg2, boolean arg3) {
        class48 var5 = new class48();
        int var6 = arg0.method550(-1757152080, arg2);
        this.field2973 = new class241[var6];
        int[] var7 = arg0.method554(0, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class11 var9 = null;
            byte[] var10 = arg0.method571(arg2, var7[var8], 124);
            int var11 = var10[1] & 0xFF | (var10[0] & 0xFF) << 8;
            for (class11 var12 = (class11) var5.method371((byte) 61); var12 != null; var12 = (class11) var5.method370(true)) {
                if (var12.field231 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method570(0, false, var11);
                } else {
                    var13 = arg1.method570(var11, false, 0);
                }
                var9 = new class11(var11, var13);
                var5.method376((byte) 13, var9);
            }
            this.field2973[var7[var8]] = new class241(var10, var9);
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(II)Z")
    public final boolean method1188(int arg0, int arg1) {
        field2971++;
        int var3 = -103 % ((arg0 + 18) / 40);
        return this.field2973[arg1].field4183;
    }
}
