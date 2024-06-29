import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class759 {

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11160 = new String[] { method5488(method5487("X3U{")), method5488(method5487("Mh\u00179~")), method5488(method5487("^$\u0017U+")), method5488(method5487("^$\u0017S+")), method5488(method5487("^$\u0017V+")), method5488(method5487("^$\u0017T+")), method5488(method5487("^$\u0017R+")) };

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "Lhl;")
    public static class556 field11154 = new class556(82, -1);

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "[Lnq;")
    public static class487[] field11156 = new class487[300];

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field11157 = -1;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field11150;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static int field11151;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public int field11152;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public int field11153;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public int field11155;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field11158;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field11159;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lmj;Lha;I)V")
    public static final void method5482(class683 arg0, class63 arg1, int arg2) {
        try {
            field11159++;
            boolean var3 = class229.field3563.method537(arg2 + 16777124, arg0.field9888, arg0.field9807, arg0.field9736 ? class438.field6846.field10798 : null, arg0.field9740, arg1, arg0.field9826 | arg2, arg0.field9864) == null;
            if (var3) {
                class336.field5471.method3220(new class632(arg0.field9807, arg0.field9864, arg0.field9888, arg0.field9826 | 0xFF000000, arg0.field9740, arg0.field9736), 0);
                class454.method3525((byte) 27, arg0);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field11160[3] + (arg0 == null ? field11160[0] : field11160[1]) + ',' + (arg1 == null ? field11160[0] : field11160[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZLwq;)V")
    private final void method5483(int arg0, boolean arg1, class176 arg2) {
        try {
            if (!arg1) {
                this.method5483(-121, false, null);
            }
            if (arg0 == 1) {
                this.field11155 = arg2.method1687((byte) -55);
                this.field11153 = arg2.method1645((byte) -90);
                this.field11152 = arg2.method1645((byte) -94);
            }
            field11150++;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field11160[6] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field11160[0] : field11160[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static void method5484(int arg0) {
        try {
            field11154 = null;
            if (arg0 != 32157) {
                method5482(null, null, 120);
            }
            field11156 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11160[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(JIZIB)Ljava/lang/String;")
    public static final String method5485(long arg0, int arg1, boolean arg2, int arg3, byte arg4) {
        try {
            field11151++;
            if (arg4 != -12) {
                field11156 = null;
            }
            char var6 = ',';
            char var7 = '.';
            if (arg3 == 0) {
                var6 = '.';
                var7 = ',';
            }
            if (arg3 == 2) {
                var7 = ' ';
            }
            boolean var8 = false;
            if (arg0 < 0L) {
                arg0 = -arg0;
                var8 = true;
            }
            StringBuffer var9 = new StringBuffer(26);
            if (arg1 > 0) {
                for (int var10 = 0; var10 < arg1; var10++) {
                    int var11 = (int) arg0;
                    arg0 /= 10L;
                    var9.append((char) (var11 + 48 - (int) arg0 * 10));
                }
                var9.append(var6);
            }
            int var12 = 0;
            while (true) {
                int var13 = (int) arg0;
                arg0 /= 10L;
                var9.append((char) (var13 + 48 - ((int) arg0 * 10)));
                if (arg0 == 0L) {
                    if (var8) {
                        var9.append('-');
                    }
                    return var9.reverse().toString();
                }
                if (arg2) {
                    var12++;
                    if (var12 % 3 == 0) {
                        var9.append(var7);
                    }
                }
            }
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field11160[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lwq;I)V")
    public final void method5486(class176 arg0, int arg1) {
        try {
            if (arg1 < 14) {
                this.method5483(117, true, null);
            }
            while (true) {
                int var3 = arg0.method1645((byte) -72);
                if (var3 == 0) {
                    field11158++;
                    return;
                }
                this.method5483(var3, true, arg0);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field11160[2] + (arg0 == null ? field11160[0] : field11160[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5487(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5488(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 54;
                    break;
                case 1:
                    var10005 = 70;
                    break;
                case 2:
                    var10005 = 57;
                    break;
                case 3:
                    var10005 = 23;
                    break;
                default:
                    var10005 = 3;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
