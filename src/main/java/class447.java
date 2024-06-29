import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class447 {

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "Lrga;")
    public static class280 field5735 = new class280(18, 7);

    @OriginalMember(owner = "client!dea", name = "f", descriptor = "[F")
    public static float[] field5740 = new float[16384];

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "[F")
    public static float[] field5738 = new float[16384];

    @OriginalMember(owner = "client!dea", name = "g", descriptor = "[I")
    public static int[] field5741;

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!dea", name = "e", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!dea", name = "h", descriptor = "I")
    public static int field5742;

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "Loj;")
    public static class543 field5737;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2388(int arg0, String arg1) {
        field5736++;
        int var2 = arg1.length();
        int var3 = 0;
        if (arg0 != 19317) {
            field5742 = -63;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(II)Z")
    public static final boolean method2389(int arg0, int arg1) {
        if (arg1 != -4) {
            field5737 = null;
        }
        field5739++;
        return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)V")
    public static void method2390(int arg0) {
        field5740 = null;
        field5741 = null;
        if (arg0 != 16384) {
            method2389(45, 64);
        }
        field5737 = null;
        field5735 = null;
        field5738 = null;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field5738[var2] = (float) Math.sin((double) var2 * var0);
            field5740[var2] = (float) Math.cos((double) var2 * var0);
        }
        field5741 = new int[1000];
    }
}
