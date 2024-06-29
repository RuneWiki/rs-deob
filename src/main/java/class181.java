import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class181 {

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "Z")
    public boolean field2501 = true;

    @OriginalMember(owner = "client!gw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2509 = new String[] { method1588(method1587("\u0016D\u000bPx")), method1588(method1587("\u001fFI~")), method1588(method1587("\n\u001d\u000b<-")), method1588(method1587("\u0016D\u000bTx")), method1588(method1587("\u0016D\u000bQx")), method1588(method1587("\u0016D\u000bVx")), method1588(method1587("\u0016D\u000bWx")) };

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "C")
    private char field2505;

    @OriginalMember(owner = "client!gw", name = "h", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!gw", name = "g", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "I")
    public int field2506;

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!gw", name = "f", descriptor = "Lcn;")
    public static class541 field2504;

    @OriginalMember(owner = "client!gw", name = "i", descriptor = "Ljava/lang/String;")
    public String field2507;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(ILib;)V", line = 7)
    public final void method1581(int arg0, class163 arg1) {
        try {
            while (true) {
                int var3 = arg1.method1455((byte) 62);
                if (var3 == 0) {
                    field2500++;
                    if (arg0 != 0) {
                        field2504 = null;
                        return;
                    }
                    return;
                }
                this.method1582(arg1, true, var3);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field2509[6] + arg0 + ',' + (arg1 == null ? field2509[1] : field2509[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lib;ZI)V", line = 27)
    private final void method1582(class163 arg0, boolean arg1, int arg2) {
        try {
            if (!arg1) {
                method1583(-70, -30, -14, (byte) 107, 107, null);
            }
            field2502++;
            if (arg2 == 1) {
                this.field2505 = class259.method2185(-161, arg0.method1414(1));
            } else if (arg2 == 2) {
                this.field2506 = arg0.method1453((byte) 120);
            } else if (arg2 == 4) {
                this.field2501 = false;
            } else if (arg2 == 5) {
                this.field2507 = arg0.method1423(-11);
                return;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field2509[4] + (arg0 == null ? field2509[1] : field2509[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IIIBILrn;)V", line = 58)
    public static final void method1583(int arg0, int arg1, int arg2, byte arg3, int arg4, class282 arg5) {
        try {
            field2508++;
            if (arg3 != -26) {
                method1583(-103, 27, -33, (byte) 11, -23, null);
            }
            class326 var6 = null;
            for (class326 var7 = (class326) class403.field6017.method3863((byte) 64); var7 != null; var7 = (class326) class403.field6017.method3862(-353)) {
                if (var7.field5140 == arg4 && var7.field5136 == arg1 && var7.field5148 == arg2 && var7.field5139 == arg0) {
                    var6 = var7;
                    break;
                }
            }
            if (var6 == null) {
                var6 = new class326();
                var6.field5148 = arg2;
                var6.field5139 = arg0;
                var6.field5140 = arg4;
                var6.field5136 = arg1;
                class403.field6017.method3868(95, var6);
            }
            var6.field5138 = arg5;
            var6.field5149 = false;
            var6.field5134 = true;
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field2509[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field2509[1] : field2509[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)V", line = 101)
    public static void method1584(int arg0) {
        try {
            field2504 = null;
            if (arg0 != 1) {
                method1586(null, 38, -61, 39);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2509[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)Z", line = 111)
    public final boolean method1585(int arg0) {
        try {
            field2503++;
            if (arg0 == -116) {
                return this.field2505 == 's';
            } else {
                return false;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2509[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Ldf;III)V", line = 127)
    public static final void method1586(class420 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class132.field1543) {
            class96 var4 = class734.field10683[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field1081 != null && var4.field1081.method625((byte) 94)) {
                arg0.method627(var4.field1081, 0, true, class358.field5488, 0, 0, class606.field8877);
            }
        }
        if (arg3 < class132.field1543) {
            class96 var5 = class734.field10683[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field1081 != null && var5.field1081.method625((byte) 94)) {
                arg0.method627(var5.field1081, class358.field5488, true, 0, 0, 0, class606.field8877);
            }
        }
        if (arg2 < class132.field1543 && arg3 < class216.field3296) {
            class96 var6 = class734.field10683[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field1081 != null && var6.field1081.method625((byte) 94)) {
                arg0.method627(var6.field1081, class358.field5488, true, class358.field5488, 0, 0, class606.field8877);
            }
        }
        if (arg2 < class132.field1543 && arg3 > 0) {
            class96 var7 = class734.field10683[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field1081 != null && var7.field1081.method625((byte) 94)) {
                arg0.method627(var7.field1081, -class358.field5488, true, class358.field5488, 0, 0, class606.field8877);
            }
        }
    }

    @OriginalMember(owner = "client!gw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1587(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x50);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1588(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 113;
                    break;
                case 1:
                    var10005 = 51;
                    break;
                case 2:
                    var10005 = 37;
                    break;
                case 3:
                    var10005 = 18;
                    break;
                default:
                    var10005 = 80;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
