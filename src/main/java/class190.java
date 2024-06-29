import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class190 {

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2526 = new String[] { method1594(method1593("C?)3w")), method1594(method1593("C?)2w")), method1594(method1593("C?)1w")), method1594(method1593("]v)^\"")), method1594(method1593("H-k\u001c")) };

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "[I")
    public static int[] field2523 = new int[8];

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field2522 = 0;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V", line = 8)
    public static void method1590(int arg0) {
        try {
            if (arg0 < 38) {
                field2523 = null;
            }
            field2523 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2526[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)V", line = 23)
    public static final void method1591(byte arg0, int arg1) {
        try {
            field2525++;
            int var2 = class694.field9700 - class647.field9204;
            if (var2 >= 100) {
                class596.field8579 = 1;
                class301.field4188 = -1;
                class171.field2267 = -1;
            } else {
                int var3 = 112 % ((arg0 - 22) / 45);
                int var4 = (int) class607.field8706;
                if (var4 < class477.field7032 >> 8) {
                    var4 = class477.field7032 >> 8;
                }
                if (class318.field4350[4] && (class786.field11358[4] + 128) > var4) {
                    var4 = class786.field11358[4] + 128;
                }
                int var5 = (int) class349.field5057 + class113.field1461 & 0x3FFF;
                class479.method3710((var4 >> 3) * 3 + 600 << 2, class222.field3217, var5, var4, arg1, class604.field8658, false, class100.method977(-1, class203.field2988.field2984, class693.field9689, class203.field2988.field2969) - 200);
                float var6 = 1.0F - ((float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F);
                class355.field5151 = (int) ((float) (class355.field5151 - class84.field1195) * var6 + (float) class84.field1195);
                class670.field9442 = (int) ((float) (class670.field9442 - class712.field10005) * var6 + (float) class712.field10005);
                class688.field9635 = (int) ((float) (class688.field9635 - class710.field9928) * var6 + (float) class710.field9928);
                class525.field7650 = (int) ((float) (class525.field7650 - class667.field9420) * var6 + (float) class667.field9420);
                int var7 = class57.field802 - class375.field5482;
                if (var7 > 8192) {
                    var7 -= 16384;
                } else if (var7 < -8192) {
                    var7 += 16384;
                }
                class57.field802 = (int) ((float) var7 * var6 + (float) class375.field5482);
                class57.field802 &= 0x3FFF;
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field2526[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIILjava/lang/String;III)V", line = 73)
    public static final void method1592(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6, int arg7) {
        try {
            field2524++;
            class472 var8 = new class472();
            var8.field6918 = arg5;
            var8.field6917 = arg2;
            var8.field6921 = arg4;
            var8.field6915 = arg1;
            var8.field6914 = arg6;
            var8.field6913 = class694.field9700 + arg3;
            if (arg7 != 16384) {
                field2523 = null;
            }
            var8.field6920 = arg0;
            class211.field3097.method3618(var8, 65);
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field2526[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field2526[4] : field2526[3]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1593(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1594(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 38;
                    break;
                case 1:
                    var10005 = 88;
                    break;
                case 2:
                    var10005 = 7;
                    break;
                case 3:
                    var10005 = 112;
                    break;
                default:
                    var10005 = 95;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
