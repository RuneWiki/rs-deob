import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class164 extends class114 {

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2125 = new String[] { method1399(method1398("\\%\u00025Y")), method1399(method1398("Af\u0002Z\f")), method1399(method1398("T=@\u0018")), method1399(method1398("\\%\u00021Y")), method1399(method1398("\\%\u00020Y")), method1399(method1398("\\%\u00026Y")) };

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "J")
    public static long field2117 = -1L;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field2122 = new String[] { method1399(method1398("i=B")), method1399(method1398("w'B")), method1399(method1398("n=I")), method1399(method1398("m-H")), method1399(method1398("n Y")), method1399(method1398("|:E")), method1399(method1398("i)X")) };

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
    private int field2119;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
    private int field2120;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "Lqp;")
    public static class277 field2121;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "Llga;")
    public static class47 field2118;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V", line = 3)
    public static final void method1395(byte arg0) {
        try {
            class346.field5032 = -1;
            class232.field3348 = -1;
            class345.field5028 = 0;
            field2123++;
            class477.field7028 = -1;
            int var1 = -89 / ((58 - arg0) / 55);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2125[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lr;III[Z)Z", line = 25)
    public static final boolean method1396(class412 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class677.field9474 != class107.field1413) {
            int var6 = class213.field3124[arg1].method5440((byte) 15, arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class751 var8 = class213.field3124[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method5440((byte) 15, arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method2473(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method2479(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ljc;I)V", line = 63)
    public final void method116(class711 arg0, int arg1) {
        try {
            if (arg1 != -27800) {
                method1395((byte) -1);
            }
            this.field2119 = arg0.method5113(18443);
            field2116++;
            this.field2120 = arg0.method5113(18443);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2125[0] + (arg0 == null ? field2125[2] : field2125[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V", line = 78)
    public static void method1397(int arg0) {
        try {
            field2122 = null;
            if (arg0 != -1) {
                method1395((byte) 49);
            }
            field2118 = null;
            field2121 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2125[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILwfa;)V", line = 98)
    public final void method115(int arg0, class286 arg1) {
        try {
            arg1.method2308(4, this.field2120, this.field2119);
            if (arg0 == 95) {
                field2124++;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2125[4] + arg0 + ',' + (arg1 == null ? field2125[2] : field2125[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1398(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x71);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1399(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 58;
                    break;
                case 1:
                    var10005 = 72;
                    break;
                case 2:
                    var10005 = 44;
                    break;
                case 3:
                    var10005 = 116;
                    break;
                default:
                    var10005 = 113;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
