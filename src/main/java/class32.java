import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class32 {

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field390 = new String[] { method338(method337("|~s\u0002\u0011")), method338(method337("``1*")), method338(method337("u;shD")), method338(method337("g&ep")), method338(method337("v-ki")), method338(method337("v-k")), method338(method337("y|3")), method338(method337("|~s\u0007\u0011")), method338(method337("v-k\u0019\u000f::")), method338(method337("g ep")), method338(method337("b|33A")), method338(method337("~e>i")), method338(method337("~e>")), method338(method337("v-k\u0019\u000f:")), method338(method337("ct>")), method338(method337("ct>)J!")), method338(method337("b|33A!")), method338(method337("y|3\"Vyfr")), method338(method337("g!ep")), method338(method337("ox9p\r")), method338(method337("cf7'Oo:")), method338(method337("{{40\\|f<*\u0016")), method338(method337("|~s\u0004\u0011")), method338(method337("|~s\u0005\u0011")), method338(method337("{y")), method338(method337("{x")), method338(method337("|~s\u0003\u0011")) };

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "Z")
    public static boolean field387 = true;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "Lvn;")
    public static class330 field375 = new class330(80, 7);

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public int field370;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public int field371;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public int field372;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public int field373;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    public int field374;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public int field378;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public int field381;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public int field382;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    public int field383;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    public int field384;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public int field386;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "[[[B")
    public static byte[][][] field388;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V", line = 6)
    public static void method332(int arg0) {
        try {
            field388 = null;
            if (arg0 != 34379) {
                field389 = 42;
            }
            field375 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field390[22] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lgda;ZLtga;)V", line = 22)
    public static final void method333(class58 arg0, boolean arg1, class61 arg2) {
        try {
            class664.field9456 = arg2;
            field379++;
            class195.field3108 = "";
            class574.field8296 = arg0;
            if (!arg1) {
                method334(-37, null, false, null);
            }
            if (class726.field10649.startsWith(field390[6])) {
                class195.field3108 = class195.field3108 + field390[17];
            } else if (class726.field10649.startsWith(field390[10])) {
                class195.field3108 = class195.field3108 + field390[16];
            } else if (class726.field10649.startsWith(field390[14])) {
                class195.field3108 = class195.field3108 + field390[15];
            }
            if (class664.field9456.field808) {
                class195.field3108 = class195.field3108 + field390[20];
            } else if (class726.field10652.startsWith(field390[19]) || class726.field10652.startsWith(field390[13])) {
                class195.field3108 = class195.field3108 + field390[8];
            } else if (class726.field10652.startsWith(field390[3]) || class726.field10652.startsWith(field390[18]) || class726.field10652.startsWith(field390[9]) || class726.field10652.startsWith(field390[5])) {
                class195.field3108 = class195.field3108 + field390[4];
            } else if (class726.field10652.startsWith(field390[12])) {
                class195.field3108 = class195.field3108 + field390[11];
            } else {
                class195.field3108 = class195.field3108 + field390[21];
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field390[7] + (arg0 == null ? field390[1] : field390[2]) + ',' + arg1 + ',' + (arg2 == null ? field390[1] : field390[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILvf;ZLjava/lang/String;)Lnl;", line = 70)
    public static final class578 method334(int arg0, class159 arg1, boolean arg2, String arg3) {
        try {
            field377++;
            int var4 = OpenGL.glGenProgramARB();
            OpenGL.glBindProgramARB(arg0, var4);
            OpenGL.glProgramStringARB(arg0, 34933, arg3);
            OpenGL.glGetIntegerv(34379, class504.field7528, 0);
            if (class504.field7528[0] == -1) {
                OpenGL.glBindProgramARB(arg0, 0);
                return arg2 ? new class578(arg1, arg0, var4) : null;
            } else {
                OpenGL.glBindProgramARB(arg0, 0);
                return null;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field390[23] + arg0 + ',' + (arg1 == null ? field390[1] : field390[2]) + ',' + arg2 + ',' + (arg3 == null ? field390[1] : field390[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V", line = 105)
    public static final void method335(int arg0) {
        try {
            class507.field7569 = 0;
            field385++;
            class117 var1 = class185.field2948.field2660;
            int var2 = var1.method1670((byte) -112);
            int var3 = var1.method1636(-7543);
            int var4 = var1.method1634((byte) 117);
            boolean var5 = var1.method1684(true) == 1;
            class539.method4018(0);
            class152.method1380(var4, true);
            int var6 = (class185.field2948.field2663 - var1.field2799) / 16;
            class710.field10276 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var8 = 0; var8 < 4; var8++) {
                    class710.field10276[var7][var8] = var1.method1622(-18712);
                }
            }
            class325.field5293 = new int[var6];
            class382.field6143 = new byte[var6][];
            class548.field8055 = new byte[var6][];
            class641.field9196 = new int[var6];
            class221.field3483 = new byte[var6][];
            class395.field6269 = new byte[var6][];
            int var9 = 77 / ((-arg0 - 51) / 36);
            class426.field6724 = new int[var6];
            class380.field6122 = new int[var6];
            class543.field7995 = new int[var6];
            class620.field8953 = null;
            class74.field1067 = null;
            int var10 = 0;
            for (int var11 = (var3 - (class126.field1823 >> 4)) / 8; var11 <= ((class126.field1823 >> 4) + var3) / 8; var11++) {
                for (int var12 = (var2 - (class169.field2725 >> -708137916)) / 8; var12 <= (var2 + (class169.field2725 >> 4)) / 8; var12++) {
                    class543.field7995[var10] = (var11 << 8) + var12;
                    class380.field6122[var10] = class686.field9915.method585(-1, "m" + var11 + "_" + var12);
                    class426.field6724[var10] = class686.field9915.method585(-1, "l" + var11 + "_" + var12);
                    class325.field5293[var10] = class686.field9915.method585(-1, field390[25] + var11 + "_" + var12);
                    class641.field9196[var10] = class686.field9915.method585(-1, field390[24] + var11 + "_" + var12);
                    var10++;
                }
            }
            class796.method5716(var3, var5, -118, 12, var2);
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field390[26] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILrk;)Z", line = 184)
    public final boolean method336(int arg0, class32 arg1) {
        try {
            field380++;
            if (this.field373 == arg1.field373 && this.field383 == arg1.field383 && this.field372 == arg1.field372) {
                return true;
            } else {
                if (arg0 != -5) {
                    this.field373 = 115;
                }
                return false;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field390[0] + arg0 + ',' + (arg1 == null ? field390[1] : field390[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method337(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x39);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method338(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 14;
                    break;
                case 1:
                    var10005 = 21;
                    break;
                case 2:
                    var10005 = 93;
                    break;
                case 3:
                    var10005 = 70;
                    break;
                default:
                    var10005 = 57;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
