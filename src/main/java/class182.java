import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class182 extends class621 {

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "I")
    public static int field2225 = 0;

    @OriginalMember(owner = "client!cw", name = "h", descriptor = "[I")
    public static int[] field2229 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!cw", name = "g", descriptor = "[I")
    public static int[] field2228 = new int[1];

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "Lea;")
    public static class547 field2226 = new class547(33, -2);

    @OriginalMember(owner = "client!cw", name = "j", descriptor = "[Ljava/awt/Color;")
    public static Color[] field2231 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

    @OriginalMember(owner = "client!cw", name = "f", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!cw", name = "i", descriptor = "Lni;")
    public static class522 field2230;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 15)
    public static final String method1033(int arg0, String arg1) {
        field2227++;
        String var2 = null;
        if (arg0 != 0) {
            method1034(-70);
        }
        int var3 = arg1.indexOf("--> ");
        if (var3 >= 0) {
            var2 = arg1.substring(0, var3 + 4);
            arg1 = arg1.substring(var3 + 4);
        }
        if (arg1.startsWith("directlogin ")) {
            int var4 = arg1.indexOf(" ", "directlogin ".length());
            if (var4 >= 0) {
                int var5 = arg1.length();
                arg1 = arg1.substring(0, var4) + " ";
                for (int var6 = var4 + 1; var6 < var5; var6++) {
                    arg1 = arg1 + "*";
                }
            }
        }
        return var2 == null ? arg1 : var2 + arg1;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V", line = 66)
    public static void method1034(int arg0) {
        field2230 = null;
        field2229 = null;
        field2231 = null;
        field2228 = null;
        if (arg0 != -15870) {
            method1033(56, null);
        }
        field2226 = null;
    }
}
