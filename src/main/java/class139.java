import java.awt.Canvas;
import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class139 {

    @OriginalMember(owner = "client!qea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1660 = new String[] { method1198(method1197("d\u0015\u0015p\u0019=")), method1198(method1197("{\u0005\u00182")), method1198(method1197("n^Zp\"")), method1198(method1197("d\u0015\u0015p\u001d=")), method1198(method1197("d\u0015\u0015p\u001e=")), method1198(method1197("q\u0005\u0019.\u0017p\u0011\u0004")), method1198(method1197("d\u0015\u0015p\u0018=")), method1198(method1197("v\u001f\u0019p,`\u001eZ3>{\u0011\u0013;2p\u001e\u0000p\u0017z\u0004'.0a4\u001d?8{\u001f\u0007*6v=,\u001c:t\u001e")), method1198(method1197("]\u0015\u0015.\u001b`\u001d\u0004~:g\u0002\u001b,e")), method1198(method1197("\u007f\u0011\u0002?qy\u0011\u001a9qF\u0004\u000671r")), method1198(method1197("d\u0015\u0015p\u001c=")), method1198(method1197("d\u0015\u0015p+z#\u0000,6{\u0017\\")), method1198(method1197("d\u0015\u0015p\u001b=")), method1198(method1197("d\u0015\u0015p\u001a=")) };

    @OriginalMember(owner = "client!qea", name = "e", descriptor = "Lwia;")
    public static class790 field1650 = new class790(75, 3);

    @OriginalMember(owner = "client!qea", name = "h", descriptor = "I")
    public static int field1657 = 0;

    @OriginalMember(owner = "client!qea", name = "g", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!qea", name = "f", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!qea", name = "i", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!qea", name = "j", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "I")
    public static int field1658;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qea", name = "d", descriptor = "Ljava/lang/Class;")
    public static Class field1659;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(IIII)V")
    public static final void method1189(int arg0, int arg1, int arg2, int arg3) {
        try {
            field1653++;
            if (arg2 != 5992) {
                field1657 = -76;
            }
            int var6 = class289.field4305.field837.method4492(false) * arg1 >> 8;
            if (arg0 == -1 && !class719.field10416) {
                class726.method5300(-41);
            } else if (arg0 != -1 && (class96.field1077 != arg0 || !class562.method4198(0)) && var6 != 0 && !class719.field10416) {
                class117.method1032(class232.field3503, var6, false, arg3, true, arg0, 0);
                class297.method2506(255);
            }
            if (class96.field1077 != arg0) {
                class48.field548 = null;
            }
            class96.field1077 = arg0;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1660[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!qea", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field1651++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1660[11] + ')');
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)V")
    public static void method1190(int arg0) {
        try {
            field1650 = null;
            if (arg0 != -38140856) {
                method1194(-26, -47, false, 20, -120, -76, -48);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1660[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(Ljava/awt/Canvas;IIILd;)Lha;")
    public static final class66 method1191(Canvas arg0, int arg1, int arg2, int arg3, class160 arg4) {
        try {
            if (arg2 != 0) {
                field1650 = null;
            }
            field1658++;
            return new class721(arg0, arg4, arg3, arg1);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field1660[0] + (arg0 == null ? field1660[1] : field1660[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field1660[1] : field1660[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(BIIIIILha;I)V")
    public static final void method1192(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class66 arg6, int arg7) {
        try {
            arg6.method593(arg3, arg5, (byte) -82, arg7, arg1, arg4);
            field1652++;
            arg6.method593(arg2, arg5 + 1, (byte) -82, 16, arg1 - 2, arg4 + 1);
            arg6.method580(arg5 + 1, arg7 + -19, arg2, arg1 - 2, arg4 + 18, 1);
            if (arg0 != 18) {
                method1193(21, true, null);
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field1660[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field1660[1] : field1660[2]) + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(IZLjava/io/File;)V")
    public static final void method1193(int arg0, boolean arg1, File arg2) {
        try {
            field1655++;
            if (class170.field2335 == null) {
                class140.method1201(22257);
            }
            if (arg0 != -1) {
                method1194(2, -95, false, 40, -111, 58, 121);
            }
            try {
                Class var3 = Class.forName(field1660[7]);
                Method var4 = var3.getDeclaredMethod(field1660[5], field1659 == null ? (field1659 = method1196(field1660[9])) : field1659, Boolean.TYPE);
                var4.invoke(class170.field2335, arg2.getAbsolutePath(), Boolean.valueOf(arg1));
            } catch (Exception var7) {
                System.out.println(field1660[8]);
                var7.printStackTrace();
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field1660[6] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1660[1] : field1660[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(IIZIIII)V")
    public static final void method1194(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            if (class289.field4305.field838.method4492(arg2) != 0 && arg6 != 0 && class86.field958 < 50 && arg5 != -1) {
                class534.field7826[class86.field958++] = new class305((byte) 1, arg5, arg6, arg3, arg1, arg0, arg4, null);
            }
            field1656++;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field1660[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(B)Z")
    public final boolean method1195(byte arg0) {
        try {
            field1654++;
            int var2 = 119 % ((arg0 - 1) / 61);
            return class463.field6741 == this | class316.field4996 == this;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1660[4] + arg0 + ')');
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1196(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1197(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1198(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 21;
                    break;
                case 1:
                    var10005 = 112;
                    break;
                case 2:
                    var10005 = 116;
                    break;
                case 3:
                    var10005 = 94;
                    break;
                default:
                    var10005 = 95;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
