import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class536 {

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "[Ljava/awt/Color;")
    public static Color[] field6981 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "Lra;")
    public static class361 field6982 = new class361(53, 0);

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
    public static int field6978;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
    public static int field6980;

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "Lkv;")
    public static class16 field6983;

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "Lpe;")
    public static class615 field6979;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(II)I", line = 28)
    public static final int method2852(int arg0, int arg1) {
        if (arg0 == 10002) {
            field6978++;
            return arg1 & 0x3FF;
        } else {
            return -79;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(II[Ljava/lang/String;Z)Ljava/lang/String;", line = 41)
    public static final String method2853(int arg0, int arg1, String[] arg2, boolean arg3) {
        field6980++;
        if (arg1 == 0) {
            return "";
        } else if (arg1 == 1) {
            String var4 = arg2[arg0];
            return var4 == null ? "null" : var4.toString();
        } else {
            if (arg3) {
                field6979 = null;
            }
            int var5 = arg1 + arg0;
            int var6 = 0;
            for (int var7 = arg0; var7 < var5; var7++) {
                String var11 = arg2[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg0; var9 < var5; var9++) {
                String var10 = arg2[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V", line = 117)
    public static void method2854(byte arg0) {
        field6981 = null;
        field6982 = null;
        field6983 = null;
        int var1 = -19 % ((19 - arg0) / 54);
        field6979 = null;
    }
}
