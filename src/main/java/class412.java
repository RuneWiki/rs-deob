import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class412 extends class341 {

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
    public static int field6101 = 1;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "Ljava/lang/String;")
    public static String field6098 = "Take";

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "Ljava/lang/String;")
    public static String field6104 = "Select";

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "[Lll;")
    public static class203[] field6105 = new class203[16];

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
    public static int field6099;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    public static int field6100;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    public static int field6102;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "Lmo;")
    public static class447 field6103;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
    public static void method2581(int arg0) {
        if (arg0 != -30472) {
            field6101 = -15;
        }
        field6098 = null;
        field6105 = null;
        field6104 = null;
        field6103 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BII[Ljava/lang/String;)Ljava/lang/String;")
    public static final String method2582(byte arg0, int arg1, int arg2, String[] arg3) {
        field6097++;
        if (arg2 == 0) {
            return "";
        } else if (arg0 != -124) {
            return null;
        } else if (arg2 == 1) {
            String var4 = arg3[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg2 + arg1;
            int var6 = 0;
            for (int var7 = arg1; var7 < var5; var7++) {
                String var11 = arg3[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg1; var9 < var5; var9++) {
                String var10 = arg3[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)V")
    public static final void method2583(int arg0, int arg1) {
        field6099++;
        class127.field1961 = arg1;
        class51.field625.method335((byte) -98);
        if (arg0 != 0) {
            method2582((byte) -53, -116, 19, (String[]) null);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I[S)[S")
    public static final short[] method2584(int arg0, short[] arg1) {
        field6100++;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class408.method2555(arg1, 0, var2, 0, arg1.length);
            return arg0 == 4 ? var2 : null;
        }
    }
}
