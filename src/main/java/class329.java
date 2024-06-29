import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class329 extends class540 {

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public int field4912;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public int field4914;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)[Lfda;")
    public static final class336[] method2126(boolean arg0) {
        field4910++;
        return arg0 ? new class336[] { class180.field2729, class196.field2877, class291.field4413 } : null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)Z")
    public static final boolean method2127(byte arg0, int arg1) {
        field4915++;
        int var2 = -12 / ((-arg0 - 24) / 33);
        return arg1 == 0 || arg1 == 2;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIII[F[IZII[FII[I)V")
    public static final void method2128(int arg0, int arg1, int arg2, int arg3, float[] arg4, int[] arg5, boolean arg6, int arg7, int arg8, float[] arg9, int arg10, int arg11, int[] arg12) {
        if (!arg6) {
            return;
        }
        field4913++;
        int var13 = arg7 * arg10 + arg0;
        int var14 = arg3 * arg8 + arg1;
        int var15 = arg10 - arg11;
        int var16 = arg3 - arg11;
        if (arg5 == null) {
            for (int var17 = 0; var17 < arg2; var17++) {
                int var18 = arg11 + var13;
                while (var13 < var18) {
                    arg4[var14++] = arg9[var13++];
                }
                var14 += var16;
                var13 += var15;
            }
        } else if (arg9 == null) {
            for (int var21 = 0; var21 < arg2; var21++) {
                int var22 = arg11 + var13;
                while (var13 < var22) {
                    arg12[var14++] = arg5[var13++];
                }
                var14 += var16;
                var13 += var15;
            }
        } else {
            for (int var19 = 0; var19 < arg2; var19++) {
                int var20 = arg11 + var13;
                while (var20 > var13) {
                    arg12[var14] = arg5[var13];
                    arg4[var14++] = arg9[var13++];
                }
                var14 += var16;
                var13 += var15;
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/Throwable;)V")
    public static final void method2129(String arg0, boolean arg1, Throwable arg2) {
        field4911++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class282.method1906(arg2, 0);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            if (!arg1) {
                class347.method2197(!arg1, var3);
                String var4 = class225.method1555(var3, "%3a", 0, ":");
                String var5 = class225.method1555(var4, "%40", 0, "@");
                String var6 = class225.method1555(var5, "%26", 0, "&");
                String var7 = class225.method1555(var6, "%23", 0, "#");
                if (class269.field3782 != null) {
                    class370 var8 = class617.field8708.method3429(new URL(class269.field3782.getCodeBase(), "clienterror.ws?c=" + class717.field10085 + "&u=" + (class511.field7309 == null ? String.valueOf(class554.field7883) : class511.field7309) + "&v1=" + class590.field8336 + "&v2=" + class590.field8326 + "&e=" + var7), (byte) -33);
                    while (var8.field5314 == 0) {
                        class117.method820(false, 1L);
                    }
                    if (var8.field5314 == 1) {
                        DataInputStream var9 = (DataInputStream) var8.field5317;
                        var9.read();
                        var9.close();
                    }
                }
            }
        } catch (Exception var10) {
        }
    }
}
