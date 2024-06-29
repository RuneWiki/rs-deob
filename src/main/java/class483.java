import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class483 {

    @OriginalMember(owner = "client!sl", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6983 = new String[] { method3686(method3685("\u0014\u000b*WW")), method3686(method3685("\u0014\u000b*VW")), method3686(method3685("\u0014\u000b*QW")), method3686(method3685("\u001cI*;\u0002")), method3686(method3685("\t\u0012hy")) };

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "S")
    public static short field6979 = 1;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "[C")
    private static char[] field6980 = new char[64];

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field6978;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field6981;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "Luea;")
    public static class334 field6982;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(Z)V")
    public static final void method3681(boolean arg0) {
        try {
            field6981++;
            if (class335.field5235) {
                if (arg0) {
                    field6982 = null;
                }
                while (true) {
                    while (class433.field6361 < class192.field2592.length) {
                        class604 var1 = class192.field2592[class433.field6361];
                        if (var1 != null && var1.field8856 == -1) {
                            if (class40.field475 == null) {
                                class40.field475 = class624.field9131.method3918(arg0, var1.field8850);
                            }
                            int var2 = class40.field475.field5069;
                            if (var2 == -1) {
                                return;
                            }
                            class433.field6361++;
                            var1.field8856 = var2;
                            class40.field475 = null;
                        } else {
                            class433.field6361++;
                        }
                    }
                    return;
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6983[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IILnw;IILic;ILc;)V")
    public static final void method3682(int arg0, int arg1, class612 arg2, int arg3, int arg4, class726 arg5, int arg6, class198 arg7) {
        try {
            field6978++;
            class142 var8 = new class142();
            var8.field1714 = arg4;
            var8.field1689 = arg0 << 9;
            if (arg3 == 29075) {
                var8.field1694 = arg6 << 9;
                if (arg7 != null) {
                    var8.field1699 = arg7;
                    int var10 = arg7.field3093;
                    int var11 = arg7.field3087;
                    if (arg1 == 1 || arg1 == 3) {
                        var11 = arg7.field3093;
                        var10 = arg7.field3087;
                    }
                    var8.field1686 = arg7.field3075 << 9;
                    var8.field1693 = arg6 + var11 << 9;
                    var8.field1698 = arg7.field3067;
                    var8.field1684 = arg7.field3099 << 9;
                    var8.field1707 = arg7.field3035;
                    var8.field1705 = arg7.field3084;
                    var8.field1696 = arg7.field3092;
                    var8.field1701 = arg7.field3056;
                    var8.field1706 = arg7.field3086;
                    var8.field1687 = arg0 + var10 << 9;
                    var8.field1695 = arg7.field3091;
                    var8.field1710 = arg7.field3005;
                    var8.field1685 = arg7.field3012;
                    if (arg7.field3017 != null) {
                        var8.field1704 = true;
                        var8.method1211(1733170857);
                    }
                    if (var8.field1706 != null) {
                        var8.field1690 = var8.field1696 + ((int) (Math.random() * (double) (var8.field1695 - var8.field1696)));
                    }
                    class743.field10807.method3868(87, var8);
                } else if (arg2 != null) {
                    var8.field1702 = arg2;
                    class496 var9 = arg2.field8947;
                    if (var9.field7110 != null) {
                        var8.field1704 = true;
                        var9 = var9.method3742(arg3 ^ 0xFFFF8E6C, class276.field4168);
                    }
                    if (var9 != null) {
                        var8.field1687 = var9.field7159 + arg0 << 9;
                        var8.field1693 = var9.field7159 + arg6 << 9;
                        var8.field1698 = class555.method4175(-1, arg2);
                        var8.field1684 = var9.field7138 << 9;
                        var8.field1686 = var9.field7167 << 9;
                        var8.field1710 = var9.field7160;
                        var8.field1685 = var9.field7158;
                        var8.field1701 = var9.field7140;
                        var8.field1707 = var9.field7131;
                    }
                    class278.field4182.method3868(-81, var8);
                } else if (arg5 != null) {
                    var8.field1688 = arg5;
                    var8.field1687 = arg5.method2101(31463) + arg0 << 9;
                    var8.field1693 = arg5.method2101(31463) + arg6 << 9;
                    var8.field1698 = class538.method4057(4, arg5);
                    var8.field1684 = 0;
                    var8.field1686 = arg5.field10488 << 9;
                    var8.field1707 = arg5.field10517;
                    var8.field1701 = arg5.field10525;
                    var8.field1710 = 256;
                    var8.field1685 = 256;
                    class761.field11026.method968((byte) -111, (long) arg5.field3780, var8);
                    return;
                }
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field6983[2] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field6983[4] : field6983[3]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field6983[4] : field6983[3]) + ',' + arg6 + ',' + (arg7 == null ? field6983[4] : field6983[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)Liia;")
    public static final class96 method3683(int arg0, int arg1, int arg2) {
        if (class734.field10683[arg0][arg1][arg2] == null) {
            boolean var3 = class734.field10683[0][arg1][arg2] != null && class734.field10683[0][arg1][arg2].field1088 != null;
            if (var3 && arg0 >= class501.field7246 - 1) {
                return null;
            }
            class366.method2963(arg0, arg1, arg2);
        }
        return class734.field10683[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)V")
    public static void method3684(boolean arg0) {
        try {
            if (arg0) {
                field6982 = null;
            }
            field6980 = null;
            field6982 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6983[1] + arg0 + ')');
        }
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field6980[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field6980[var1] = (char) (var1 + 71);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field6980[var2] = (char) (var2 + 48 - 52);
        }
        field6980[62] = '*';
        field6980[63] = '-';
    }

    @OriginalMember(owner = "client!sl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3685(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3686(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 103;
                    break;
                case 1:
                    var10005 = 103;
                    break;
                case 2:
                    var10005 = 4;
                    break;
                case 3:
                    var10005 = 21;
                    break;
                default:
                    var10005 = 127;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
