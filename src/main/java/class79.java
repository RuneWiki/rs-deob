import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class79 extends class134 {

    @OriginalMember(owner = "client!gea", name = "s", descriptor = "J")
    private long field1218 = -1L;

    @OriginalMember(owner = "client!gea", name = "w", descriptor = "Ljava/lang/String;")
    private String field1219 = null;

    @OriginalMember(owner = "client!gea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1226 = new String[] { method826(method825("\u001bE1sVT")), method826(method825("\u001bE1sST")), method826(method825("\u0011E=?q\u000eH1.|F")), method826(method825("\u0012U<1")), method826(method825("\u0007\u000e~si")), method826(method825("\\M50v\u0019R><y\u0019\u001a")), method826(method825("\u001bE1sPT")), method826(method825("\u001bE1sWT")), method826(method825("\u001bE1sUT")) };

    @OriginalMember(owner = "client!gea", name = "t", descriptor = "Z")
    public static boolean field1220 = false;

    @OriginalMember(owner = "client!gea", name = "q", descriptor = "[Z")
    public static boolean[] field1225 = new boolean[8];

    @OriginalMember(owner = "client!gea", name = "u", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!gea", name = "v", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!gea", name = "p", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!gea", name = "r", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIIIII)I", line = 8)
    public static final int method822(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            int var7 = 65 % ((arg2 - 22) / 38);
            int var11 = arg0 & 0x3;
            if ((arg1 & 0x1) == 1) {
                int var8 = arg5;
                arg5 = arg6;
                arg6 = var8;
            }
            field1223++;
            if (var11 == 0) {
                return arg3;
            } else if (var11 == 1) {
                return arg4;
            } else if (var11 == 2) {
                return 7 + 1 - arg5 - arg3;
            } else {
                return 7 - (arg4 - (1 - arg6));
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field1226[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lsca;I)V", line = 39)
    public final void method100(class47 arg0, int arg1) {
        try {
            if (arg1 > -81) {
                field1220 = false;
            }
            arg0.method488((byte) 1, this.field1218, this.field1219);
            field1224++;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1226[7] + (arg0 == null ? field1226[3] : field1226[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(I)V", line = 52)
    public static void method823(int arg0) {
        try {
            field1225 = null;
            if (arg0 != -2) {
                method822(57, -73, -111, -38, 22, 45, 78);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1226[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILwq;)V", line = 73)
    public final void method102(int arg0, class176 arg1) {
        try {
            if (arg1.method1645((byte) -93) != 255) {
                arg1.field2799--;
                this.field1218 = arg1.method1658(-24862);
            }
            int var3 = -64 % ((83 - arg0) / 34);
            field1222++;
            this.field1219 = arg1.method1666(-84);
            if (class275.field4413) {
                System.out.println(field1226[2] + this.field1218 + field1226[5] + this.field1219);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1226[6] + arg0 + ',' + (arg1 == null ? field1226[3] : field1226[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "(I)I", line = 101)
    public static final int method824(int arg0) {
        try {
            field1221++;
            if (class16.field177) {
                return 6;
            } else if (class750.field11049 == null) {
                return 0;
            } else {
                int var1 = class750.field11049.field773;
                if (class545.method4048(var1, 9)) {
                    return 1;
                }
                if (arg0 >= -75) {
                    method822(47, -85, 111, -95, 53, -27, -102);
                }
                if (class772.method5571((byte) -54, var1)) {
                    return 2;
                } else if (class252.method2138(-1, var1)) {
                    return 3;
                } else if (class738.method5357(12, var1)) {
                    return 4;
                } else {
                    return 5;
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1226[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method825(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x14);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method826(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 124;
                    break;
                case 1:
                    var10005 = 32;
                    break;
                case 2:
                    var10005 = 80;
                    break;
                case 3:
                    var10005 = 93;
                    break;
                default:
                    var10005 = 20;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
