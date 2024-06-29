import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class360 extends class263 {

    @OriginalMember(owner = "client!fk", name = "Y", descriptor = "Lte;")
    public static class357 field5335 = new class357(16);

    @OriginalMember(owner = "client!fk", name = "X", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!fk", name = "Z", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!fk", name = "ab", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!fk", name = "bb", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!fk", name = "cb", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lri;I)V")
    public static final void method2368(class372 arg0, int arg1) {
        arg0.field5490 = null;
        ++field5339;
        int var2 = -67 / ((22 - arg1) / 60);
        int var3 = arg0.field5481.length;
        for (int var4 = 0; ~var4 > ~var3; ++var4) {
            arg0.field5481[var4].field1774 = false;
        }
        class8[] var5 = class280.field4114;
        synchronized (class280.field4114) {
            if (~class280.field4114.length < ~var3 && ~class430.field6246[var3] > -201) {
                class280.field4114[var3].method50(arg0, (byte) -64);
                int var10002 = class430.field6246[var3]++;
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lwh;ILir;)V")
    public static final void method2369(class288 arg0, int arg1, class185 arg2) {
        if (arg1 != 160) {
            method2369((class288) null, -34, (class185) null);
        }
        class264.field3896 = arg0;
        class174.field2367 = arg2;
        ++field5334;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZLde;Ljava/lang/String;ZB)V")
    public static final void method2370(boolean arg0, class364 arg1, String arg2, boolean arg3, byte arg4) {
        if (arg4 != 45) {
            field5335 = null;
        }
        ++field5337;
        if (!arg3) {
            class185.method1231(arg2, arg1, 15196, 3);
        } else {
            if (class364.field5378.startsWith("win") && class364.field5387 != 3) {
                String var5 = null;
                if (arg1.field5381 != null) {
                    var5 = arg1.field5381.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class225 var6 = class185.method1231(arg2, arg1, 15196, 0);
                    class6.field78 = arg1;
                    class342.field5116 = var6;
                    class395.field5744 = arg2;
                    return;
                }
            }
            if (class364.field5378.startsWith("mac")) {
                String var7 = null;
                if (arg1.field5381 != null) {
                    var7 = arg1.field5381.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg0) {
                    class185.method1231(arg2, arg1, arg4 + 15151, 1);
                    return;
                }
            }
            class185.method1231(arg2, arg1, 15196, 2);
        }
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(II)[[I")
    public final int[][] method287(int arg0, int arg1) {
        ++field5336;
        if (arg1 >= -3) {
            return null;
        } else {
            int[][] var3 = super.field5170.method2701(0, arg0);
            if (super.field5170.field6288 && this.method1761(false)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = arg0 % super.field3852 * super.field3852;
                for (int var8 = 0; class134.field1753 > var8; ++var8) {
                    int var9 = super.field3854[var8 % super.field3860 + var7];
                    var6[var8] = class394.method2529(255, var9) << 4;
                    var5[var8] = class394.method2529(65280, var9) >> 4;
                    var4[var8] = class394.method2529(var9 >> 12, 4080);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IC)Z")
    public static final boolean method2371(int arg0, char arg1) {
        if (arg0 != 128) {
            field5335 = null;
        }
        ++field5338;
        if ((~arg1 >= -1 || arg1 >= 128) && (arg1 < 160 || ~arg1 < -256)) {
            if (~arg1 != -1) {
                char[] var2 = class437.field6350;
                for (int var3 = 0; var3 < var2.length; ++var3) {
                    char var4 = var2[var3];
                    if (~arg1 == ~var4) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(B)V")
    public static void method2372(byte arg0) {
        int var1 = 46 / ((arg0 - -61) / 36);
        field5335 = null;
    }
}
