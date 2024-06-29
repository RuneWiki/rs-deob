import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class188 {

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field2547 = -1;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2552 = "Ok";

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "Z")
    public static boolean field2551 = false;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "[I")
    public static int[] field2554 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Lvn;")
    public static class169 field2550;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)[B", line = 14)
    public static final synchronized byte[] method1198(int arg0, int arg1) {
        if (arg0 != 40) {
            field2554 = null;
        }
        field2553++;
        if (arg1 == 100 && class315.field4491 > 0) {
            byte[] var2 = class155.field2208[--class315.field4491];
            class155.field2208[class315.field4491] = null;
            return var2;
        } else if (arg1 == 5000 && class211.field2860 > 0) {
            byte[] var3 = class186.field2529[--class211.field2860];
            class186.field2529[class211.field2860] = null;
            return var3;
        } else if (arg1 == 30000 && class175.field2438 > 0) {
            byte[] var4 = class211.field2856[--class175.field2438];
            class211.field2856[class175.field2438] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V", line = 51)
    public static void method1199(byte arg0) {
        field2550 = null;
        field2554 = null;
        field2552 = null;
        int var1 = 121 / ((arg0 - 45) / 41);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lam;BIIII)Ljava/awt/Frame;", line = 75)
    public static final Frame method1200(class378 arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field2549++;
        int var6 = -9 / ((arg1 + 32) / 57);
        if (!arg0.method2383(0)) {
            return null;
        }
        if (arg5 == 0) {
            class83[] var7 = class144.method850(-14773, arg0);
            if (var7 == null) {
                return null;
            }
            boolean var8 = false;
            for (int var9 = 0; var9 < var7.length; var9++) {
                if (var7[var9].field938 == arg3 && var7[var9].field933 == arg4 && (arg2 == 0 || var7[var9].field934 == arg2) && (!var8 || var7[var9].field931 > arg5)) {
                    var8 = true;
                    arg5 = var7[var9].field931;
                }
            }
            if (!var8) {
                return null;
            }
        }
        class241 var10 = arg0.method2390(arg4, 2548, arg2, arg5, arg3);
        while (var10.field3268 == 0) {
            class278.method1757(10L, 0);
        }
        Frame var11 = (Frame) var10.field3270;
        if (var11 == null) {
            return null;
        } else if (var10.field3268 == 2) {
            class19.method132(var11, arg0, (byte) 100);
            return null;
        } else {
            return var11;
        }
    }
}
