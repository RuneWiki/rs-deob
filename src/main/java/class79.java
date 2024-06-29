import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class79 extends class445 {

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
    public static int field1058 = 0;

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "Lbc;")
    public static class225 field1069 = new class225("", 15);

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public int field1059;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
    public int field1066;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "[I")
    public int[] field1062;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "[I")
    public int[] field1064;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "[I")
    public int[] field1065;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "[Lcc;")
    public class474[] field1061;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "[Lcc;")
    public class474[] field1063;

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "[[[B")
    public byte[][][] field1068;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 7)
    public static final void method520(String arg0, int arg1) {
        class441.field5949 = arg0;
        field1067++;
        if (class251.field3359.field3209 == null) {
            return;
        }
        try {
            if (arg1 < 115) {
                method520((String) null, -71);
            }
            String var2 = class251.field3359.field3209.getParameter("cookieprefix");
            String var3 = class251.field3359.field3209.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class444.method2605(10, class440.method2583(25267) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class361.method2208((byte) -45, "document.cookie=\"" + var5 + "\"", class251.field3359.field3209);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIIII)V", line = 45)
    public static final void method521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1060++;
        int var8 = class309.method1706(class221.field2942, arg2, 6798, class205.field2784);
        int var9 = class309.method1706(class221.field2942, arg6, 6798, class205.field2784);
        int var10 = class309.method1706(class425.field5751, arg5, 6798, class136.field1985);
        int var11 = class309.method1706(class425.field5751, arg0, 6798, class136.field1985);
        int var12 = class309.method1706(class221.field2942, arg2 + arg3, 6798, class205.field2784);
        int var13 = class309.method1706(class221.field2942, arg6 - arg3, 6798, class205.field2784);
        for (int var14 = var8; var14 < var12; var14++) {
            class330.method1834(var11, class102.field1472[var14], arg1, var10, 25084);
        }
        if (arg4 != -15104) {
            return;
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class330.method1834(var11, class102.field1472[var15], arg1, var10, arg4 ^ 0xFFFFA4FC);
        }
        int var16 = class309.method1706(class425.field5751, arg3 + arg5, 6798, class136.field1985);
        int var17 = class309.method1706(class425.field5751, arg0 - arg3, 6798, class136.field1985);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class102.field1472[var18];
            class330.method1834(var16, var19, arg1, var10, 25084);
            class330.method1834(var17, var19, arg7, var16, 25084);
            class330.method1834(var11, var19, arg1, var17, 25084);
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V", line = 103)
    public static void method522(int arg0) {
        field1069 = null;
        if (arg0 != 15) {
            method521(34, 119, 109, 1, -14, -10, -14, 127);
        }
    }
}
