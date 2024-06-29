import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class571 {

    @OriginalMember(owner = "client!md", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8276 = new String[] { method4211(method4210("N4I(c")), method4211(method4210("X~ID6")), method4211(method4210("M%\u000b\u0006")), method4211(method4210("N4I+c")), method4211(method4210("N4I)c")) };

    @OriginalMember(owner = "client!md", name = "a", descriptor = "[Lwc;")
    public static class71[] field8275 = new class71[5];

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field8272;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field8273;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field8274;

    static {
        for (int var0 = 0; var0 < field8275.length; var0++) {
            field8275[var0] = new class71();
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BJII)V", line = 3)
    public static final void method4207(byte arg0, long arg1, int arg2, int arg3) {
        try {
            if (arg0 < 42) {
                method4208(88);
            }
            field8272++;
            int var5 = ((int) arg1 & 0x7FFBF) >> 14;
            int var6 = (int) arg1 >> 20 & 0x3;
            int var7 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
            if (var5 == 10 || var5 == 11 || var5 == 22) {
                class362 var8 = class370.field5999.method4002(-100, var7);
                int var9;
                int var10;
                if (var6 == 0 || var6 == 2) {
                    var9 = var8.field5842;
                    var10 = var8.field5894;
                } else {
                    var10 = var8.field5842;
                    var9 = var8.field5894;
                }
                int var11 = var8.field5903;
                if (var6 != 0) {
                    var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
                }
                class101.method959(var11, arg3, arg2, var9, 626, var10, 0, true, 0);
            } else {
                class101.method959(0, arg3, arg2, 0, 626, 0, var6, true, var5);
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field8276[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V", line = 46)
    public static void method4208(int arg0) {
        try {
            field8275 = null;
            if (arg0 <= 118) {
                field8275 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8276[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILip;)V", line = 56)
    public static final void method4209(int arg0, class738 arg1) {
        try {
            field8273++;
            class195 var2 = (class195) class787.field11511.method737((byte) -39, (long) arg1.field1129);
            int var3 = -22 % ((arg0 - 64) / 32);
            if (var2 == null) {
                class615.method4474(null, null, (byte) -77, 0, arg1.field9975, arg1.field1201[0], arg1, arg1.field1200[0]);
            } else {
                var2.method1799((byte) -37);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8276[3] + arg0 + ',' + (arg1 == null ? field8276[2] : field8276[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!md", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4210(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!md", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4211(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 35;
                    break;
                case 1:
                    var10005 = 80;
                    break;
                case 2:
                    var10005 = 103;
                    break;
                case 3:
                    var10005 = 106;
                    break;
                default:
                    var10005 = 75;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
