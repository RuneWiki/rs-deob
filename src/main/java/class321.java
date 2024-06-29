import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class321 {

    @OriginalMember(owner = "client!hfa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4382 = new String[] { method2546(method2545("\u001f\u0018\u001c\u0002x_")), method2546(method2545("\u001f\u0018\u001c\u0002y_")), method2546(method2545("\u0019\u000b\u0011@")), method2546(method2545("\fPS\u0002G")), method2546(method2545("\u001f\u0018\u001c\u0002{_")) };

    @OriginalMember(owner = "client!hfa", name = "e", descriptor = "I")
    public static int field4377 = 0;

    @OriginalMember(owner = "client!hfa", name = "g", descriptor = "Lmv;")
    public static class125 field4375 = new class125(89, 3);

    @OriginalMember(owner = "client!hfa", name = "d", descriptor = "I")
    public static int field4381 = 0;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "I")
    public static int field4380 = -1;

    @OriginalMember(owner = "client!hfa", name = "f", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "Lhq;")
    public static class56 field4379;

    @OriginalMember(owner = "client!hfa", name = "h", descriptor = "Ljava/awt/Frame;")
    public static Frame field4374;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method2542(boolean arg0) {
        try {
            field4376++;
            if (arg0 && class387.field5654 != null) {
                for (int var1 = 0; var1 < class387.field5654.length; var1++) {
                    for (int var2 = 0; var2 < class387.field5654[var1].length; var2++) {
                        class387.field5654[var1][var2] = class164.field2121;
                    }
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4382[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(B)V", line = 38)
    public static void method2543(byte arg0) {
        try {
            field4374 = null;
            field4375 = null;
            if (arg0 >= -91) {
                method2544(60, null, null, 114, -117, -6);
            }
            field4379 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4382[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ILha;Lfw;III)V", line = 52)
    public static final void method2544(int arg0, class18 arg1, class789 arg2, int arg3, int arg4, int arg5) {
        try {
            field4378++;
            class596 var6 = class123.field1553.method2205(102, arg2.field11416);
            if (var6.field8573 != -1) {
                if (arg2.field11437) {
                    int var14 = arg2.field11468 + arg5;
                    arg5 = var14 & 0x3;
                } else {
                    arg5 = 0;
                }
                class392 var7 = var6.method4401(arg3 ^ 0xFFFF8E, arg2.field11421, arg1, arg5);
                if (var7 != null) {
                    int var8 = arg2.field11452;
                    int var9 = arg2.field11390;
                    if ((arg5 & 0x1) == 1) {
                        var8 = arg2.field11390;
                        var9 = arg2.field11452;
                    }
                    if (arg3 != -16777216) {
                        field4377 = -53;
                    }
                    int var10 = var7.method1378();
                    int var11 = var7.method1380();
                    if (var6.field8576) {
                        var10 = var8 * 4;
                        var11 = var9 * 4;
                    }
                    if (var6.field8575 == 0) {
                        var7.method3069(arg0, arg4 - ((var9 - 1) * 4), var10, var11);
                    } else {
                        var7.method3073(arg0, arg4 + 4 - (var9 * 4), var10, var11, 0, var6.field8575 | 0xFF000000, 1);
                    }
                }
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field4382[4] + arg0 + ',' + (arg1 == null ? field4382[2] : field4382[3]) + ',' + (arg2 == null ? field4382[2] : field4382[3]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!hfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2545(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2546(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 119;
                    break;
                case 1:
                    var10005 = 126;
                    break;
                case 2:
                    var10005 = 125;
                    break;
                case 3:
                    var10005 = 44;
                    break;
                default:
                    var10005 = 58;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
