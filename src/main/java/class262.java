import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class262 extends class388 {

    @OriginalMember(owner = "client!cfa", name = "v", descriptor = "Lkba;")
    public class185 field3770;

    @OriginalMember(owner = "client!cfa", name = "s", descriptor = "Lufa;")
    public static class740 field3767 = new class740(1, 4);

    @OriginalMember(owner = "client!cfa", name = "w", descriptor = "Lrf;")
    public static class749 field3771 = new class749();

    @OriginalMember(owner = "client!cfa", name = "r", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!cfa", name = "t", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!cfa", name = "u", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Ljf;Z)Z")
    public static final boolean method1734(class638 arg0, boolean arg1) {
        boolean var2 = class95.field1372 == class25.field221;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method1308(-680858839);
        if (arg0.field9038 < 0 || arg0.field9035 < 0 || arg0.field9036 >= class439.field6264 || arg0.field9042 >= class408.field5806) {
            return false;
        }
        short var6 = 0;
        for (int var7 = arg0.field9038; var7 <= arg0.field9036; var7++) {
            for (int var11 = arg0.field9035; var11 <= arg0.field9042; var11++) {
                class375 var12 = class211.method1494(arg0.field3920, var7, var11);
                if (var12 != null) {
                    class208 var13 = class640.method3695((byte) -72, arg0);
                    class208 var14 = var12.field5425;
                    if (var14 == null) {
                        var12.field5425 = var13;
                    } else {
                        while (var14.field3146 != null) {
                            var14 = var14.field3146;
                        }
                        var14.field3146 = var13;
                    }
                    if (var2 && (class346.field4951[var7][var11] & 0xFF000000) != 0) {
                        var3 = class346.field4951[var7][var11];
                        var4 = class167.field2372[var7][var11];
                        var5 = class609.field8690[var7][var11];
                    }
                    if (!arg1 && var12.field5422 != null && var12.field5422.field9265 > var6) {
                        var6 = var12.field5422.field9265;
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var8 = arg0.field9038; var8 <= arg0.field9036; var8++) {
                for (int var9 = arg0.field9035; var9 <= arg0.field9042; var9++) {
                    if ((class346.field4951[var8][var9] & 0xFF000000) == 0) {
                        class346.field4951[var8][var9] = var3;
                        class167.field2372[var8][var9] = var4;
                        class609.field8690[var8][var9] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class356.field5256[class594.field8445++] = arg0;
        } else {
            int var10 = class95.field1372 == class25.field221 ? 1 : 0;
            if (!arg0.method607((byte) 104)) {
                class399.field5714[var10][class145.field1963[var10]++] = arg0;
            } else if (arg0.method614((byte) -120)) {
                class499.field7174[var10][class575.field8273[var10]++] = arg0;
            } else {
                class132.field1818[var10][class355.field5248[var10]++] = arg0;
                class235.field3518 = true;
            }
        }
        if (arg1) {
            arg0.field3922 -= var6;
        }
        return true;
    }

    @OriginalMember(owner = "client!cfa", name = "c", descriptor = "(Z)V")
    public static void method1735(boolean arg0) {
        field3771 = null;
        field3767 = null;
        if (!arg0) {
            method1735(false);
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIIII[ILkw;Z)Lof;")
    public static final class9 method1736(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, class346 arg6, boolean arg7) {
        field3768++;
        if (arg2 != 19180) {
            return null;
        } else if (!arg6.field5021 && (!class211.method1496(0, arg0) || !class211.method1496(0, arg3))) {
            return arg6.field5035 ? new class9(arg6, 34037, arg0, arg3, arg7, arg5, arg1, arg4) : new class9(arg6, arg0, arg3, class68.method609(arg0, (byte) 87), class68.method609(arg3, (byte) -128), arg5);
        } else {
            return new class9(arg6, 3553, arg0, arg3, arg7, arg5, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!cfa", name = "c", descriptor = "(I)V")
    public static final void method1737(int arg0) {
        field3769++;
        if (arg0 != 0) {
            field3771 = null;
        }
        class231.field3473 = new class611();
    }

    @OriginalMember(owner = "client!cfa", name = "d", descriptor = "(I)Ljava/lang/String;")
    public static final String method1738(int arg0) {
        field3766++;
        if (class147.field2154 || class242.field3576 == null) {
            return "";
        } else {
            if (arg0 != 21578) {
                field3767 = null;
            }
            return (class242.field3576.field4158 == null || class242.field3576.field4158.length() == 0) && class242.field3576.field4160 != null && class242.field3576.field4160.length() > 0 ? class242.field3576.field4160 : class242.field3576.field4158;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(Lkba;)V")
    public class262(class185 arg0) {
        this.field3770 = arg0;
    }
}
