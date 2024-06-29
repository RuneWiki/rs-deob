import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class783 implements class285 {

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "Lvea;")
    public class288 field11405;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "I")
    public int field11413;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
    public int field11414;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "I")
    public int field11403;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
    public int field11416;

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "I")
    public int field11408;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "I")
    public int field11406;

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "Llk;")
    public class613 field11412;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "Z")
    public boolean field11402;

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "I")
    public int field11407;

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "I")
    public int field11404;

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11417 = new String[] { method5671(method5670("E506V")), method5671(method5670("G2r\u001b")), method5671(method5670("E50K\u0017G.jIV")), method5671(method5670("Ri0Y\u0003")), method5671(method5670("E505V")) };

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "Lwia;")
    public static class790 field11410 = new class790(73, 4);

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
    public static int field11409;

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "[Lom;")
    public static class392[] field11411;

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "[Lfs;")
    public static class581[] field11415;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)Lvaa;", line = 4)
    public final class494 method1226(int arg0) {
        try {
            field11409++;
            int var2 = 62 % ((57 - arg0) / 61);
            return class149.field1834;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11417[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V", line = 30)
    public static void method5669(int arg0) {
        try {
            if (arg0 >= 58) {
                field11410 = null;
                field11411 = null;
                field11415 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field11417[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(ILlk;Lvea;IIIIIIIZ)V", line = 49)
    public class783(int arg0, class613 arg1, class288 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        try {
            this.field11405 = arg2;
            this.field11413 = arg8;
            this.field11414 = arg9;
            this.field11403 = arg3;
            this.field11416 = arg5;
            this.field11408 = arg0;
            this.field11406 = arg4;
            this.field11412 = arg1;
            this.field11402 = arg10;
            this.field11407 = arg6;
            this.field11404 = arg7;
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field11417[2] + arg0 + ',' + (arg1 == null ? field11417[1] : field11417[3]) + ',' + (arg2 == null ? field11417[1] : field11417[3]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5670(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5671(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 41;
                    break;
                case 1:
                    var10005 = 71;
                    break;
                case 2:
                    var10005 = 30;
                    break;
                case 3:
                    var10005 = 119;
                    break;
                default:
                    var10005 = 126;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
