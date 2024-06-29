import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pja")
public class class43 {

    @OriginalMember(owner = "client!pja", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field512 = new String[] { method296(method295("\u0003>p\u0011+[")), method296(method295("\u0003>p\u0011*[")), method296(method295("\u0003>p\u0011/[")), method296(method295("05s]\u000f\u00141")), method296(method295("\u001d!}S")), method296(method295("\bz?\u0011\u0013")), method296(method295("\u0003>p\u0011-[")), method296(method295("\u0003>p\u0011,[")), method296(method295("\u0003>p\u0011([")) };

    @OriginalMember(owner = "client!pja", name = "e", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!pja", name = "g", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!pja", name = "b", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!pja", name = "c", descriptor = "I")
    public int field508;

    @OriginalMember(owner = "client!pja", name = "d", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!pja", name = "h", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "Lclient;")
    public static client field504;

    @OriginalMember(owner = "client!pja", name = "f", descriptor = "Ljava/lang/String;")
    public String field510;

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(IZIIII)V")
    public static final void method289(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            if (arg0 == 22804) {
                field507++;
                long var6 = (long) (arg5 | (arg1 ? Integer.MIN_VALUE : 0));
                class495 var8 = (class495) class143.field1719.method977(var6, 1);
                if (var8 == null) {
                    var8 = new class495();
                    class143.field1719.method968((byte) -111, var6, var8);
                }
                if (var8.field7103.length <= arg3) {
                    int[] var9 = new int[arg3 + 1];
                    int[] var10 = new int[arg3 + 1];
                    for (int var11 = 0; var11 < var8.field7103.length; var11++) {
                        var9[var11] = var8.field7103[var11];
                        var10[var11] = var8.field7108[var11];
                    }
                    for (int var12 = var8.field7103.length; var12 < arg3; var12++) {
                        var9[var12] = -1;
                        var10[var12] = 0;
                    }
                    var8.field7108 = var10;
                    var8.field7103 = var9;
                }
                var8.field7103[arg3] = arg2;
                var8.field7108[arg3] = arg4;
            }
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field512[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(I)V")
    public static void method290(int arg0) {
        try {
            if (arg0 == 0) {
                field504 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field512[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pja", name = "b", descriptor = "(I)V")
    public static final void method291(int arg0) {
        try {
            field509++;
            if (class722.field10460 != null) {
                class768.field11101 = new class717();
                class768.field11101.method5230(class520.field7619, false, class722.field10460, class722.field10460.field9159, class722.field10460.field9150.method2616(false, class167.field2300));
                class663.field9581 = new Thread(class768.field11101, "");
                if (arg0 == -26770) {
                    class663.field9581.start();
                }
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field512[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pja", name = "c", descriptor = "(I)[Lbl;")
    public static final class675[] method292(int arg0) {
        try {
            if (arg0 != 0) {
                field504 = null;
            }
            field511++;
            return new class675[] { class27.field328, class27.field329, class27.field330, class27.field331, class27.field332, class27.field333, class27.field334, class27.field335, class27.field336, class27.field337, class27.field338, class27.field339, class27.field340 };
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field512[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(IILib;)Ljava/lang/String;")
    public static final String method293(int arg0, int arg1, class163 arg2) {
        try {
            field505++;
            try {
                int var3 = arg2.method1425(68);
                int var4 = 79 % ((73 - arg0) / 51);
                if (arg1 < var3) {
                    var3 = arg1;
                }
                byte[] var5 = new byte[var3];
                arg2.field2201 += class419.field6176.method2809(arg2.field2209, 0, var5, (byte) -32, var3, arg2.field2201);
                return class209.method1842((byte) 84, var5, 0, var3);
            } catch (Exception var8) {
                return field512[3];
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field512[2] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field512[4] : field512[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(BI)V")
    public static final void method294(byte arg0, int arg1) {
        try {
            field506++;
            class178 var2 = class514.field7406;
            synchronized (class514.field7406) {
                class514.field7406.method1557(arg1, (byte) -115);
            }
            class178 var3 = class548.field8184;
            synchronized (class548.field8184) {
                class548.field8184.method1557(arg1, (byte) -112);
            }
            int var4 = -120 % ((arg0 - 19) / 57);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field512[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method295(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method296(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 115;
                    break;
                case 1:
                    var10005 = 84;
                    break;
                case 2:
                    var10005 = 17;
                    break;
                case 3:
                    var10005 = 63;
                    break;
                default:
                    var10005 = 110;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
