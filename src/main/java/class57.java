import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class57 {

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "S")
    public static short field715 = 256;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "Ljava/lang/String;")
    public static String field716 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "Ljava/lang/String;")
    public static String field721 = "Continue";

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Llm;IB)Lmi;", line = 9)
    public static final class207 method374(class210 arg0, int arg1, byte arg2) {
        field717++;
        byte[] var3 = arg0.method1458((byte) -96, arg1);
        if (arg2 <= 0) {
            method378(125, -97, -33, 99, -89, -82);
        }
        return var3 == null ? null : new class207(var3);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 27)
    public static final void method375(int arg0, String arg1, int arg2) {
        class101.field1594++;
        class234.field3507.method28(88, false);
        class234.field3507.method1816(class242.method1638(arg1, -14393), 21054);
        if (arg0 != -8) {
            field721 = (String) null;
        }
        field714++;
        class234.field3507.method1842(true, arg2);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 41)
    public static final String method376(int arg0, byte arg1) {
        field720++;
        String var2 = Integer.toString(arg0);
        if (arg1 != -65) {
            field715 = 61;
        }
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class179.field2657 + " (" + var2 + ")</col>";
        } else if (var2.length() <= 6) {
            return " <col=ffff00>" + var2 + "</col>";
        } else {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class98.field1506 + " (" + var2 + ")</col>";
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(DB)V", line = 70)
    public static final void method377(double arg0, byte arg1) {
        if (arg1 <= 111) {
            field716 = (String) null;
        }
        if (class194.field2903 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class185.field2765[var3] = var4 <= 255 ? var4 : 255;
            }
            class194.field2903 = arg0;
        }
        field719++;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIII)Z", line = 100)
    public static final boolean method378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class3.field18[arg0][var8][var9] == -class170.field2557) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class294.field4502[arg0][arg1][arg3] + arg5;
            if (!class3.method7(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class3.method7(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class3.method7(var10, var12, var14)) {
                return false;
            } else if (class3.method7(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class310.method2143(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class3.method7(var6 + 1, class294.field4502[arg0][arg1][arg3] + arg5, var7 + 1) && class3.method7(var6 + 128 - 1, class294.field4502[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class3.method7(var6 + 128 - 1, class294.field4502[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class3.method7(var6 + 1, class294.field4502[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V", line = 166)
    public static void method379(boolean arg0) {
        if (arg0) {
            method378(123, 9, -12, -13, -13, -9);
        }
        field716 = null;
        field721 = null;
    }
}
