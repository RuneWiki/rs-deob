import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class50 extends class271 {

    @OriginalMember(owner = "client!hga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field719 = new String[] { method552(method551("|h-PS<")), method552(method551("|h-PU<")), method552(method551("|h-PP<")), method552(method551("|h-PR<")) };

    @OriginalMember(owner = "client!hga", name = "o", descriptor = "I")
    public static int field717 = 100;

    @OriginalMember(owner = "client!hga", name = "r", descriptor = "Lsb;")
    public static class261 field715 = new class261(13, 1);

    @OriginalMember(owner = "client!hga", name = "q", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!hga", name = "s", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!hga", name = "p", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!hga", name = "t", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!hga", name = "n", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "(B)V")
    public static void method547(byte arg0) {
        try {
            if (arg0 <= 81) {
                method547((byte) 51);
            }
            field715 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field719[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Llga;Llga;Lcja;)V")
    public class50(class47 arg0, class47 arg1, class753 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIZIIIIII)Z")
    public static final boolean method548(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            ++field716;
            int var9 = class203.field2988.field2252[0];
            int var10 = class203.field2988.field2256[0];
            if (arg7 != -31017) {
                return false;
            } else if (~var9 <= -1 && ~var9 > ~class625.field8929 && var10 >= 0 && class14.field187 > var10) {
                if (~arg4 <= -1 && class625.field8929 > arg4 && ~arg5 <= -1 && ~class14.field187 < ~arg5) {
                    int var11 = class670.method4825(arg8, class203.field2988.method1437((byte) -28), var10, var9, arg4, class480.field7073, class584.field8433, arg0, 15705, class195.field2919[class203.field2988.field2981], arg1, arg2, arg6, arg3, arg5);
                    if (~var11 > -2) {
                        return false;
                    } else {
                        class477.field7028 = class480.field7073[var11 + -1];
                        class346.field5032 = class584.field8433[var11 - 1];
                        class369.field5344 = false;
                        class236.method1957(12936);
                        return true;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field719[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(BIZI)V")
    public final void method549(byte arg0, int arg1, boolean arg2, int arg3) {
        try {
            ++field713;
            if (arg0 <= 60) {
                field712 = -109;
            }
            int var5 = this.method2217(false) * super.field3830.field10543 / 10000;
            class236.field3418.method237(arg3, arg1 + 2, var5, super.field3830.field10541 - 2, ((class753) super.field3830).field10764, 0);
            class236.field3418.method237(arg3 + var5, arg1 + 2, super.field3830.field10543 - var5, super.field3830.field10541 + -2, 0, 0);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field719[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIBZ)V")
    public final void method550(int arg0, int arg1, byte arg2, boolean arg3) {
        try {
            if (arg2 != -35) {
                field718 = -24;
            }
            class236.field3418.method212(arg0 + -2, arg1, super.field3830.field10543 + 4, super.field3830.field10541 - -2, ((class753) super.field3830).field10765, 0);
            ++field714;
            class236.field3418.method212(arg0 - 1, arg1 + 1, super.field3830.field10543 + 2, super.field3830.field10541, 0, 0);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field719[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!hga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method551(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 17);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method552(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 20;
                    break;
                case 1:
                    var10005 = 15;
                    break;
                case 2:
                    var10005 = 76;
                    break;
                case 3:
                    var10005 = 126;
                    break;
                default:
                    var10005 = 17;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
