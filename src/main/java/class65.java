import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class65 extends class775 {

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field901 = new String[] { method694(method693("\u0006W\u001et\u0006")), method694(method693("\u001f\u001d\u001e\u001bS")), method694(method693("\u0013\f\\6")), method694(method693("\u001f\u001d\u001e\u0019S")), method694(method693("\u001f\u001d\u001e\u0018S")) };

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIII)V", line = 7)
    public static final void method690(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            field899++;
            int var6 = arg5 - arg3;
            int var7 = arg4 - arg2;
            if (arg0 == var6) {
                if (var7 != 0) {
                    class466.method3599(arg4, -101, arg1, arg2, arg3);
                }
            } else if (var7 == 0) {
                class379.method3109(arg2, arg3, arg5, arg1, arg0 ^ 0x4);
            } else {
                int var8 = (var7 << 12) / var6;
                int var9 = arg2 - (arg3 * var8 >> 12);
                int var10;
                int var11;
                if (arg5 < class546.field8030) {
                    var10 = (class546.field8030 * var8 >> 12) + var9;
                    var11 = class546.field8030;
                } else if (class779.field11374 >= arg5) {
                    var11 = arg5;
                    var10 = arg4;
                } else {
                    var11 = class779.field11374;
                    var10 = (class779.field11374 * var8 >> 12) + var9;
                }
                int var12;
                int var13;
                if (class546.field8030 > arg3) {
                    var13 = (class546.field8030 * var8 >> 12) + var9;
                    var12 = class546.field8030;
                } else if (arg3 <= class779.field11374) {
                    var12 = arg3;
                    var13 = arg2;
                } else {
                    var12 = class779.field11374;
                    var13 = var9 + (class779.field11374 * var8 >> 12);
                }
                if (var13 < class310.field5088) {
                    var13 = class310.field5088;
                    var12 = (class310.field5088 - var9 << 12) / var8;
                } else if (class478.field7264 < var13) {
                    var12 = (class478.field7264 - var9 << 12) / var8;
                    var13 = class478.field7264;
                }
                if (var10 < class310.field5088) {
                    var11 = (class310.field5088 - var9 << 12) / var8;
                    var10 = class310.field5088;
                } else if (var10 > class478.field7264) {
                    var11 = (class478.field7264 - var9 << 12) / var8;
                    var10 = class478.field7264;
                }
                class149.method1355(var10, var13, var11, var12, arg1, false);
            }
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field901[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lvf;IIIII)Lub;", line = 111)
    public static final class20 method691(class159 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            field900++;
            if (arg4 > -25) {
                field897 = 36;
            }
            if (arg0.field2513 || class46.method469(arg2, 1010) && class46.method469(arg3, 1010)) {
                return new class20(arg0, 3553, arg1, arg5, arg2, arg3, true);
            } else if (arg0.field2481) {
                return new class20(arg0, 34037, arg1, arg5, arg2, arg3, true);
            } else {
                return new class20(arg0, arg1, arg5, arg2, arg3, class90.method883((byte) 62, arg2), class90.method883((byte) 110, arg3), true);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field901[1] + (arg0 == null ? field901[2] : field901[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLjava/lang/String;)I", line = 130)
    public static final int method692(byte arg0, String arg1) {
        try {
            if (arg0 != 51) {
                return -7;
            }
            field896++;
            for (int var2 = 0; var2 < class782.field11419.length; var2++) {
                if (class782.field11419[var2].equalsIgnoreCase(arg1)) {
                    return var2;
                }
            }
            return -1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field901[3] + arg0 + ',' + (arg1 == null ? field901[2] : field901[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method693(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method694(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 125;
                    break;
                case 1:
                    var10005 = 121;
                    break;
                case 2:
                    var10005 = 48;
                    break;
                case 3:
                    var10005 = 90;
                    break;
                default:
                    var10005 = 123;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
