import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class753 extends class206 {

    @OriginalMember(owner = "client!cp", name = "k", descriptor = "Lpa;")
    public class388 field10955;

    @OriginalMember(owner = "client!cp", name = "q", descriptor = "I")
    public int field10964;

    @OriginalMember(owner = "client!cp", name = "m", descriptor = "Z")
    public boolean field10963;

    @OriginalMember(owner = "client!cp", name = "o", descriptor = "I")
    public int field10957;

    @OriginalMember(owner = "client!cp", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10967 = new String[] { method5474(method5473("JPQEy")), method5474(method5473("JPQFy")), method5474(method5473("JPQDy")), method5474(method5473("GU\u0013k")), method5474(method5473("R\u000eQ),")), method5474(method5473("JPQ;8GI\u000b9y")) };

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field10962 = new String[] { method5474(method5473("zU\u0011")), method5474(method5473("dO\u0011")), method5474(method5473("}U\u001a")), method5474(method5473("~E\u001b")), method5474(method5473("}H\n")), method5474(method5473("oR\u0016")), method5474(method5473("zA\u000b")) };

    @OriginalMember(owner = "client!cp", name = "r", descriptor = "[Lll;")
    public static class383[] field10966 = new class383[1024];

    @OriginalMember(owner = "client!cp", name = "t", descriptor = "F")
    public static float field10961;

    @OriginalMember(owner = "client!cp", name = "n", descriptor = "I")
    public static int field10952;

    @OriginalMember(owner = "client!cp", name = "l", descriptor = "I")
    public static int field10960;

    @OriginalMember(owner = "client!cp", name = "u", descriptor = "Lla;")
    public static class476 field10953;

    @OriginalMember(owner = "client!cp", name = "p", descriptor = "Lfs;")
    public static class581 field10959;

    @OriginalMember(owner = "client!cp", name = "x", descriptor = "Lhg;")
    public static class718 field10965;

    @OriginalMember(owner = "client!cp", name = "s", descriptor = "Z")
    public boolean field10954;

    @OriginalMember(owner = "client!cp", name = "v", descriptor = "Z")
    public boolean field10956;

    @OriginalMember(owner = "client!cp", name = "w", descriptor = "Z")
    public boolean field10958;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V")
    public static final void method5470(int arg0) {
        try {
            field10960++;
            if (arg0 > 72 && class360.field5498 != null) {
                class441[] var1 = class360.field5498;
                for (int var2 = 0; var2 < var1.length; var2++) {
                    class441 var3 = var1[var2];
                    var3.method3385((byte) -17);
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10967[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIIII)V")
    public static final void method5471(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            field10952++;
            int var6 = arg5;
            if (arg2 == 1024) {
                while (arg4 >= var6) {
                    class319.method2702(class243.field3731[var6], arg1, arg3, true, arg0);
                    var6++;
                }
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field10967[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)V")
    public static void method5472(byte arg0) {
        try {
            field10953 = null;
            if (arg0 != -44) {
                field10959 = null;
            }
            field10962 = null;
            field10959 = null;
            field10966 = null;
            field10965 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10967[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(ILpa;IZ)V")
    public class753(int arg0, class388 arg1, int arg2, boolean arg3) {
        try {
            this.field10955 = arg1;
            this.field10964 = arg0;
            this.field10963 = arg3;
            this.field10957 = arg2;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10967[5] + arg0 + ',' + (arg1 == null ? field10967[3] : field10967[4]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!cp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5473(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x51);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5474(char[] arg0) {
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
                    var10005 = 32;
                    break;
                case 2:
                    var10005 = 127;
                    break;
                case 3:
                    var10005 = 7;
                    break;
                default:
                    var10005 = 81;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
