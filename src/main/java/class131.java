import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class131 {

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "[Leh;")
    public static class335[] field2156 = new class335[2048];

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "[I")
    public static int[] field2161 = new int[8];

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "Z")
    public static boolean field2159;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "[B")
    public byte[] field2160;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "[S")
    public short[] field2155;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "[S")
    public short[] field2162;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "[S")
    public short[] field2163;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method989(String arg0, int arg1) {
        if (arg1 != 1) {
            method990(34);
        }
        field2157++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class166.method1138(arg0, arg1 ^ 0xCF4);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class18.field311; var3++) {
            String var4 = class3.field38[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class166.method1138(var4, 3317);
            if (var5 != null && var5.equals(var2)) {
                class18.field311--;
                for (int var6 = var3; var6 < class18.field311; var6++) {
                    class3.field38[var6] = class3.field38[var6 + 1];
                    class236.field3318[var6] = class236.field3318[var6 + 1];
                    class260.field3574[var6] = class260.field3574[var6 + 1];
                    class25.field426[var6] = class25.field426[var6 + 1];
                    class135.field2196[var6] = class135.field2196[var6 + 1];
                }
                class410.field5544 = class367.field4959;
                class586.field7762++;
                class402 var7 = class390.method2252(class398.field5287, -87, class262.field3644);
                var7.field5354.method1980(arg1 ^ 0xEB6B7B21, class580.method3186(95, arg0));
                var7.field5354.method2019(-89, arg0);
                class36.method278(0, var7);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
    public static void method990(int arg0) {
        field2161 = null;
        if (arg0 <= 78) {
            field2161 = null;
        }
        field2156 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lej;I[I[III)Loh;")
    public static final class376 method991(class111 arg0, int arg1, int[] arg2, int[] arg3, int arg4, int arg5) {
        if (arg1 > -92) {
            method991(null, -91, null, null, 42, -78);
        }
        field2158++;
        if (!arg0.method69(class616.field8164, true, class294.field4160)) {
            int[] var10 = new int[arg4 * arg5];
            for (int var11 = 0; var11 < arg4; var11++) {
                int var12 = arg5 * var11 + arg2[var11];
                for (int var13 = 0; var13 < arg3[var11]; var13++) {
                    var10[var12++] = -16777216;
                }
            }
            return new class376(arg0, arg5, arg4, var10);
        }
        byte[] var6 = new byte[arg4 * arg5];
        for (int var7 = 0; var7 < arg4; var7++) {
            int var8 = arg5 * var7 + arg2[var7];
            for (int var9 = 0; var9 < arg3[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class376(arg0, arg5, arg4, var6);
    }
}
