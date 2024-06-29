import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class676 {

    @OriginalMember(owner = "client!tp", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9473 = new String[] { method4846(method4845("0ZP\u0018-")), method4846(method4845("?\u0004Ptx")), method4846(method4845("%\u0001\u0012Z")), method4846(method4845("\u0003\u001d\u001aR5%Y")), method4846(method4845("?\u0004Pux")), method4846(method4845("?\u0004Pwx")) };

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
    public static int field9470;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public static int field9471;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
    public static int field9472;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILvo;I)Ljava/lang/String;", line = 4)
    public static final String method4842(int arg0, class782 arg1, int arg2) {
        try {
            field9471++;
            if (!client.method4957(arg1).method1181(arg0, arg2 + arg2) && arg1.field11254 == null) {
                return null;
            } else if (arg1.field11155 == null || arg0 >= arg1.field11155.length || arg1.field11155[arg0] == null || arg1.field11155[arg0].trim().length() == 0) {
                return class556.field8095 ? field9473[3] + arg0 : null;
            } else {
                return arg1.field11155[arg0];
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9473[1] + arg0 + ',' + (arg1 == null ? field9473[2] : field9473[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;", line = 27)
    public static final String method4843(int arg0, String[] arg1, int arg2, int arg3) {
        try {
            field9470++;
            if (arg2 == 0) {
                return "";
            } else if (arg2 == 1) {
                String var4 = arg1[arg3];
                return var4 == null ? field9473[2] : var4.toString();
            } else {
                int var5 = arg2 + arg3;
                int var6 = 0;
                for (int var7 = arg3; var7 < var5; var7++) {
                    String var8 = arg1[var7];
                    if (var8 == null) {
                        var6 += 4;
                    } else {
                        var6 += var8.length();
                    }
                }
                StringBuffer var9 = new StringBuffer(var6);
                int var10 = 105 % ((arg0 + 15) / 41);
                for (int var11 = arg3; var11 < var5; var11++) {
                    String var12 = arg1[var11];
                    if (var12 == null) {
                        var9.append(field9473[2]);
                    } else {
                        var9.append(var12);
                    }
                }
                return var9.toString();
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field9473[5] + arg0 + ',' + (arg1 == null ? field9473[2] : field9473[0]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IZIII)Z", line = 89)
    public static final boolean method4844(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        try {
            field9472++;
            if ((class76.field1089[0][arg2][arg0] & 0x2) != 0) {
                return true;
            } else if ((class76.field1089[arg4][arg2][arg0] & 0x10) != 0) {
                return false;
            } else if (class261.method2168(127, arg2, arg0, arg4) == arg3) {
                return true;
            } else if (arg1) {
                return false;
            } else {
                return false;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9473[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!tp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4845(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x50);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4846(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 75;
                    break;
                case 1:
                    var10005 = 116;
                    break;
                case 2:
                    var10005 = 126;
                    break;
                case 3:
                    var10005 = 54;
                    break;
                default:
                    var10005 = 80;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
