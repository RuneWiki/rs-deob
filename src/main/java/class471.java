import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public abstract class class471 extends class206 {

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public int field6839;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    private int field6835;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public int field6837;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    private int field6844;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "F")
    public float field6838;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public int field6846;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6848 = new String[] { method3584(method3583("'\u0012p-V")), method3584(method3583("'\u0012p\"V")), method3584(method3583("'\u0012p/V")), method3584(method3583("'\u0012pY\u0017<\u001d*[V")), method3584(method3583("'\u0012p.V")), method3584(method3583("'\u0012p)V")), method3584(method3583("'\u0012p,V")), method3584(method3583("'\u0012p#V")) };

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public static int field6836;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    public static int field6840;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    public static int field6841;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field6842;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field6843;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "I")
    public static int field6845;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field6847;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)F")
    public final float method3576(byte arg0) {
        try {
            field6842++;
            if (arg0 > -86) {
                this.method3579((byte) -92);
            }
            return this.field6838;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6848[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)I")
    public final int method3577(int arg0) {
        try {
            field6843++;
            if (arg0 != -32630) {
                this.field6846 = 32;
            }
            return this.field6846;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6848[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIII)V")
    public abstract void method1836(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)I")
    public final int method3578(int arg0) {
        try {
            field6841++;
            int var2 = -96 % ((-arg0 - 9) / 43);
            return this.field6835;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6848[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)I")
    public final int method3579(byte arg0) {
        try {
            field6845++;
            if (arg0 < 123) {
                this.method1835(-0.9108857F, (byte) 113);
            }
            return this.field6844;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6848[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)I")
    public final int method3580(byte arg0) {
        try {
            int var2 = 54 / ((arg0 + 65) / 55);
            field6836++;
            return this.field6837;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6848[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(FB)V")
    public abstract void method1835(float arg0, byte arg1);

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)I")
    public final int method3581(int arg0) {
        try {
            field6840++;
            if (arg0 >= -58) {
                this.method3580((byte) 119);
            }
            return this.field6839;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6848[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZIIIIIIII)Z")
    public static final boolean method3582(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            field6847++;
            int var9 = class225.field3446.field3859[0];
            int var10 = class225.field3446.field3863[0];
            if (var9 < 0 || var9 >= class648.field9378 || var10 < 0 || var10 >= class659.field9506) {
                return false;
            } else if (arg5 >= 0 && arg5 < class648.field9378 && arg2 >= 0 && arg2 < class659.field9506) {
                int var11 = class377.method3040(var10, class429.field6298[class225.field3446.field6200], arg2, (byte) 79, arg1, arg8, class660.field9543, class225.field3446.method2101(31463), arg4, class85.field953, arg6, arg5, arg7, arg0, var9);
                if (var11 < 1) {
                    return false;
                }
                class492.field7065 = class85.field953[var11 - 1];
                class153.field1893 = class660.field9543[var11 - arg3];
                class649.field9397 = false;
                class204.method1812(0);
                return true;
            } else {
                return false;
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field6848[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(IIIIIF)V")
    public class471(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        try {
            this.field6839 = arg1;
            this.field6835 = arg4;
            this.field6837 = arg2;
            this.field6844 = arg3;
            this.field6838 = arg5;
            this.field6846 = arg0;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field6848[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3583(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3584(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 82;
                    break;
                case 1:
                    var10005 = 116;
                    break;
                case 2:
                    var10005 = 94;
                    break;
                case 3:
                    var10005 = 101;
                    break;
                default:
                    var10005 = 126;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
