import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class546 extends class756 {

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    private int field8155 = -1;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8159 = new String[] { method4121(method4120("\u000b!:(I")), method4121(method4120("\u0013m:E\u001c")), method4121(method4120("\u001ezxj")), method4121(method4120("\u0013m:B\u001c")), method4121(method4120("\u0013m:G\u001c")), method4121(method4120("\u0013m:D\u001c")) };

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "Lni;")
    public static class547 field8150 = new class547(method4121(method4120("'FD")), 2);

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field8151;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field8152;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public static int field8153;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field8154;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "Lqga;")
    public static class196 field8157;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "Lbu;")
    public static class21 field8156;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "[[[J")
    public static long[][][] field8158;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLib;)V")
    public final void method38(byte arg0, class163 arg1) {
        try {
            this.field8155 = arg1.method1445((byte) 106);
            if (arg0 >= 32) {
                field8154++;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8159[5] + arg0 + ',' + (arg1 == null ? field8159[2] : field8159[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIII)Z")
    public static final boolean method4118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field8151++;
            int var7 = arg4 + arg6;
            if (arg0 > -124) {
                return true;
            }
            int var8 = arg1 + arg2;
            int var9 = arg3 + arg5;
            if (!class351.method2882(126, var9, arg3, var8, var7, arg4, arg4, var8, var8, var9)) {
                return false;
            } else if (class351.method2882(124, var9, arg3, var8, var7, var7, arg4, var8, var8, arg3)) {
                if (class595.field8733 > arg4) {
                    if (!class351.method2882(120, var9, var9, var8, arg4, arg4, arg4, arg1, var8, arg3)) {
                        return false;
                    }
                    if (!class351.method2882(120, arg3, var9, arg1, arg4, arg4, arg4, arg1, var8, arg3)) {
                        return false;
                    }
                } else if (!class351.method2882(115, var9, var9, var8, var7, var7, var7, arg1, var8, arg3)) {
                    return false;
                } else if (!class351.method2882(123, arg3, var9, arg1, var7, var7, var7, arg1, var8, arg3)) {
                    return false;
                }
                if (class317.field5029 > arg3) {
                    if (!class351.method2882(112, arg3, arg3, var8, var7, arg4, arg4, arg1, var8, arg3)) {
                        return false;
                    }
                    if (!class351.method2882(112, arg3, arg3, arg1, var7, var7, arg4, arg1, var8, arg3)) {
                        return false;
                    }
                } else if (!class351.method2882(121, var9, var9, var8, var7, arg4, arg4, arg1, var8, var9)) {
                    return false;
                } else if (!class351.method2882(119, var9, var9, arg1, var7, var7, arg4, arg1, var8, var9)) {
                    return false;
                }
                return true;
            } else {
                return false;
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field8159[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
    public static void method4119(byte arg0) {
        try {
            field8156 = null;
            field8158 = null;
            field8157 = null;
            int var1 = 22 / ((48 - arg0) / 38);
            field8150 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8159[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lkp;I)V")
    public final void method41(class514 arg0, int arg1) {
        try {
            field8153++;
            if (arg1 != 9893) {
                field8158 = null;
            }
            arg0.method3893(1, this.field8155);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8159[1] + (arg0 == null ? field8159[2] : field8159[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4120(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x34);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4121(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 112;
                    break;
                case 1:
                    var10005 = 15;
                    break;
                case 2:
                    var10005 = 20;
                    break;
                case 3:
                    var10005 = 6;
                    break;
                default:
                    var10005 = 52;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
