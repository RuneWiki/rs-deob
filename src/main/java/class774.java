import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class774 {

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "S")
    public short field11323;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "Lika;")
    public class450 field11320;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "B")
    public byte field11324;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "B")
    public byte field11319;

    @OriginalMember(owner = "client!kn", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11325 = new String[] { method5578(method5577("d\u0016\u001fLo")), method5578(method5577("tV\u001f!:")), method5578(method5577("d\u0016\u001fNo")), method5578(method5577("a\r]c")), method5578(method5577("d\u0016\u001f3.a\u0011E1o")), method5578(method5577("d\u0016\u001fMo")) };

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field11318;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field11321;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field11322;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZFFLkda;FIIIFIF)[B")
    public static final byte[] method5574(boolean arg0, float arg1, float arg2, class410 arg3, float arg4, int arg5, int arg6, int arg7, float arg8, int arg9, float arg10) {
        try {
            field11322++;
            byte[] var11 = new byte[arg6 * arg7 * arg5];
            class141.method1317(arg8, arg1, arg9, arg4, arg2, arg10, var11, arg3, 0, arg5, -103, arg6, arg7);
            return arg0 ? null : var11;
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field11325[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field11325[3] : field11325[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)Z")
    public static final boolean method5575(byte arg0) {
        try {
            field11318++;
            if (class536.field7876 == null) {
                return false;
            }
            if (class536.field7876.field773 >= 2000) {
                class536.field7876.field773 -= 2000;
            }
            if (arg0 > -69) {
                return false;
            } else {
                return class536.field7876.field773 == 1007;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11325[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
    public static final void method5576(int arg0) {
        try {
            int var1 = -86 / ((arg0 - 83) / 37);
            class29 var2 = class223.field3499;
            synchronized (class223.field3499) {
                class223.field3499.method298(5);
            }
            field11321++;
            class29 var3 = class12.field137;
            synchronized (class12.field137) {
                class12.field137.method298(5);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field11325[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lika;III)V")
    public class774(class450 arg0, int arg1, int arg2, int arg3) {
        try {
            this.field11323 = (short) arg1;
            this.field11320 = arg0;
            this.field11324 = (byte) arg3;
            this.field11319 = (byte) arg2;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field11325[4] + (arg0 == null ? field11325[3] : field11325[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!kn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5577(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x47);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5578(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 15;
                    break;
                case 1:
                    var10005 = 120;
                    break;
                case 2:
                    var10005 = 49;
                    break;
                case 3:
                    var10005 = 15;
                    break;
                default:
                    var10005 = 71;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
