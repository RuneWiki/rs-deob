import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class110 {

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "[I")
    private int[] field1439;

    @OriginalMember(owner = "client!cs", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1440 = new String[] { method1040(method1039("X\u0010Z<!")), method1040(method1039("U\u0016\u0018\u0011")), method1040(method1039("@MZSt")), method1040(method1039("X\u0010Z>!")), method1040(method1039("X\u0010Z?!")), method1040(method1039("X\u0010ZA`U\n\u0000C!")) };

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "[S")
    public static short[] field1437 = new short[256];

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "Lmv;")
    public static class125 field1434 = new class125(86, 7);

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V", line = 4)
    public static void method1036(byte arg0) {
        try {
            field1437 = null;
            field1434 = null;
            int var1 = -111 / ((-arg0 - 29) / 58);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1440[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)I", line = 14)
    public final int method1037(int arg0, int arg1) {
        try {
            field1438++;
            if (arg0 != 0) {
                method1036((byte) 42);
            }
            int var3 = (this.field1439.length >> 1) - 1;
            int var4 = var3 & arg1;
            while (true) {
                int var5 = this.field1439[var4 + var4 + 1];
                if (var5 == -1) {
                    return -1;
                }
                if (this.field1439[var4 + var4] == arg1) {
                    return var5;
                }
                var4 = var4 + 1 & var3;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field1440[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIZII[Lvo;)V", line = 45)
    public static final void method1038(int arg0, int arg1, boolean arg2, int arg3, int arg4, class782[] arg5) {
        try {
            field1435++;
            for (int var6 = arg3; var6 < arg5.length; var6++) {
                class782 var7 = arg5[var6];
                if (var7 != null && var7.field11136 == arg1) {
                    class237.method1964(true, var7, arg2, arg0, arg4);
                    class349.method2788(arg4, arg3 ^ 0xFFFFAFC7, arg0, var7);
                    if ((var7.field11177 - var7.field11295) < var7.field11252) {
                        var7.field11252 = var7.field11177 - var7.field11295;
                    }
                    if (var7.field11263 - var7.field11244 < var7.field11262) {
                        var7.field11262 = var7.field11263 - var7.field11244;
                    }
                    if (var7.field11252 < 0) {
                        var7.field11252 = 0;
                    }
                    if (var7.field11262 < 0) {
                        var7.field11262 = 0;
                    }
                    if (var7.field11291 == 0) {
                        class530.method4011(arg2, false, var7);
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field1440[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field1440[1] : field1440[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "([I)V", line = 99)
    public class110(int[] arg0) {
        try {
            int var2;
            for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
            }
            this.field1439 = new int[var2 + var2];
            for (int var3 = 0; var3 < var2 + var2; var3++) {
                this.field1439[var3] = -1;
            }
            int var4 = 0;
            while (arg0.length > var4) {
                int var5;
                for (var5 = arg0[var4] & var2 - 1; this.field1439[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
                }
                this.field1439[var5 + var5] = arg0[var4];
                this.field1439[var5 + var5 + 1] = var4++;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field1440[5] + (arg0 == null ? field1440[1] : field1440[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!cs", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1039(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x9);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cs", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1040(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 59;
                    break;
                case 1:
                    var10005 = 99;
                    break;
                case 2:
                    var10005 = 116;
                    break;
                case 3:
                    var10005 = 125;
                    break;
                default:
                    var10005 = 9;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
