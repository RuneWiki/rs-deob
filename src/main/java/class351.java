import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class351 {

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "[Lbca;")
    public class689[] field5417 = null;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "Lbv;")
    public class322 field5424 = null;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "[Lbca;")
    public class689[] field5423 = null;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "Lbv;")
    public class322 field5421 = null;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "Lbv;")
    public class322 field5425 = null;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "Z")
    public boolean field5415;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5426 = new String[] { method2885(method2884("6h\u000fk")), method2885(method2884("#3M)\u0011")), method2885(method2884(":\u007fM;\u00056t\u00179D")), method2885(method2884(":\u007fMED")), method2885(method2884(":\u007fMFD")) };

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "[I")
    public static int[] field5418 = new int[2];

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "Lqea;")
    public static class139 field5420 = new class139();

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "Ltea;")
    public static class251 field5419;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIIIII)Z")
    public static final boolean method2882(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        try {
            field5416++;
            if (!class579.method4332(arg6, arg7, 5, arg2)) {
                return false;
            }
            int var18 = class376.field5724[1];
            int var17 = class376.field5724[0];
            int var13 = class376.field5724[2];
            if (arg0 < 111) {
                return false;
            } else if (class579.method4332(arg4, arg3, 5, arg9)) {
                int var20 = class376.field5724[2];
                int var14 = class376.field5724[1];
                int var15 = class376.field5724[0];
                if (class579.method4332(arg5, arg8, 5, arg1)) {
                    int var19 = class376.field5724[1];
                    int var12 = class376.field5724[2];
                    int var16 = class376.field5724[0];
                    return class282.method2310(var17, var19, var13, var18, -32280, var15, var20, var12, var14, var16);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field5426[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
    public static void method2883(boolean arg0) {
        try {
            field5420 = null;
            field5419 = null;
            if (!arg0) {
                field5418 = null;
            }
            field5418 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5426[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lffa;)V")
    public class351(class197 arg0) {
        try {
            this.field5415 = arg0.field2908;
            class785.method5678(arg0, (byte) -109);
            if (this.field5415) {
                byte[] var6 = class14.method102(false, class176.field2455, -1);
                this.field5421 = new class322(arg0, 6410, 128, 128, 16, var6, 6410);
                byte[] var7 = class14.method102(false, class238.field3613, -1);
                this.field5425 = new class322(arg0, 6410, 128, 128, 16, var7, 6410);
                class587 var8 = arg0.field2851;
                if (var8.method4378(-74)) {
                    byte[] var9 = class14.method102(false, class568.field8410, -1);
                    this.field5424 = new class322(arg0, 6408, 128, 128, 16);
                    class322 var10 = new class322(arg0, 6409, 128, 128, 16, var9, 6409);
                    if (var8.method4375((byte) -121, this.field5424, var10, 2.0F)) {
                        this.field5424.method3928(-18);
                    } else {
                        this.field5424.method3922(125);
                        this.field5424 = null;
                    }
                    var10.method3922(76);
                }
            } else {
                this.field5423 = new class689[16];
                for (int var2 = 0; var2 < 16; var2++) {
                    byte[] var3 = class786.method5693(var2 * 128 * 256, 32768, 5, class176.field2455);
                    this.field5423[var2] = new class689(arg0, 3553, 6410, 128, 128, true, var3, 6410, false);
                }
                this.field5417 = new class689[16];
                for (int var4 = 0; var4 < 16; var4++) {
                    byte[] var5 = class786.method5693(var4 * 128 * 256, 32768, 5, class238.field3613);
                    this.field5417[var4] = new class689(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
                }
            }
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field5426[2] + (arg0 == null ? field5426[0] : field5426[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2884(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2885(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 88;
                    break;
                case 1:
                    var10005 = 29;
                    break;
                case 2:
                    var10005 = 99;
                    break;
                case 3:
                    var10005 = 7;
                    break;
                default:
                    var10005 = 108;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
