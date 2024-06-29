import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public class class646 {

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "I")
    public int field9351;

    @OriginalMember(owner = "client!kia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9361 = new String[] { method4759(method4758("\u0006\u0016H<\u0015E")), method4759(method4758("\u0003\nE~")), method4759(method4758("\u0016Q\u0007<,")), method4759(method4758("$\u0011_s=\u0004\u001b\t`0\t\u0016Q(")), method4759(method4758("\u0006\u0016H<\u0010E")), method4759(method4758("\u0006\u0016H<%\u0002,]`8\u0003\u0018\u0001")), method4759(method4758("\u0006\u0016H<m\u0004\u0011@foE")), method4759(method4758("\u0006\u0016H<\u0012E")), method4759(method4758("\u0006\u0016H<\u0013E")) };

    @OriginalMember(owner = "client!kia", name = "i", descriptor = "[I")
    public static int[] field9356 = new int[5];

    @OriginalMember(owner = "client!kia", name = "g", descriptor = "[[I")
    public static int[][] field9352 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!kia", name = "b", descriptor = "I")
    public static int field9358 = 0;

    @OriginalMember(owner = "client!kia", name = "h", descriptor = "I")
    public static int field9354;

    @OriginalMember(owner = "client!kia", name = "f", descriptor = "I")
    public static int field9355;

    @OriginalMember(owner = "client!kia", name = "j", descriptor = "I")
    public static int field9357;

    @OriginalMember(owner = "client!kia", name = "d", descriptor = "I")
    public static int field9359;

    @OriginalMember(owner = "client!kia", name = "c", descriptor = "I")
    public static int field9360;

    @OriginalMember(owner = "client!kia", name = "e", descriptor = "Ljq;")
    public static class537 field9353;

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(Ldf;Z[[[BIB)Z")
    public static final boolean method4753(class420 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class121.field1431) {
            return false;
        }
        int var5 = arg0.field6197 >> class602.field8828;
        int var6 = var5;
        int var7 = arg0.field6211 >> class602.field8828;
        int var8 = var7;
        if (arg0 instanceof class343) {
            var6 = ((class343) arg0).field5335;
            var8 = ((class343) arg0).field5325;
            var5 = ((class343) arg0).field5330;
            var7 = ((class343) arg0).field5329;
        }
        for (int var9 = var5; var9 <= var6; var9++) {
            for (int var10 = var7; var10 <= var8; var10++) {
                if (arg0.field6205 < class501.field7246 && var9 >= class265.field4055 && var9 < class143.field1716 && var10 >= class550.field8200 && var10 < class598.field8806) {
                    if ((arg2 == null || arg0.field6200 < arg3 || arg2[arg0.field6200][var9][var10] != arg4) && arg0.method629(0) && !arg0.method631(-10204, class606.field8877)) {
                        return false;
                    }
                    if (!arg1 && var9 >= class247.field3811 - 16 && var9 <= class247.field3811 + 16 && var10 >= class5.field52 - 16 && var10 <= class5.field52 + 16) {
                        if (class329.field5187) {
                            class180.field2498[class171.field2382++].method2148(arg0, (byte) -101);
                            class171.field2382 %= class574.field8475;
                        } else {
                            arg0.method1081(0, class606.field8877);
                        }
                    }
                }
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kia", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field9355++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9361[5] + ')');
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(III[BIII)Z")
    public static final boolean method4754(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        try {
            field9357++;
            int var7 = arg0 % arg4;
            int var8 = 47 % ((28 - arg1) / 54);
            int var9;
            if (var7 == 0) {
                var9 = 0;
            } else {
                var9 = arg4 - var7;
            }
            int var10 = -((arg5 + arg4 - 1) / arg4);
            int var11 = -((arg4 + arg0 - 1) / arg4);
            for (int var12 = var10; var12 < 0; var12++) {
                for (int var13 = var11; var13 < 0; var13++) {
                    if (arg3[arg6] == 0) {
                        return true;
                    }
                    arg6 += arg4;
                }
                arg6 -= var9;
                if (arg3[arg6 - 1] == 0) {
                    return true;
                }
                arg6 += arg2;
            }
            return false;
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field9361[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field9361[1] : field9361[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(BILjava/lang/String;Z)Z")
    public static final boolean method4755(byte arg0, int arg1, String arg2, boolean arg3) {
        try {
            int var4 = 94 % ((-arg0 - 47) / 42);
            field9354++;
            if (arg1 < 2 || arg1 > 36) {
                throw new IllegalArgumentException(field9361[3] + arg1);
            }
            boolean var5 = false;
            boolean var6 = false;
            int var7 = 0;
            int var8 = arg2.length();
            for (int var9 = 0; var9 < var8; var9++) {
                char var10 = arg2.charAt(var9);
                if (var9 == 0) {
                    if (var10 == '-') {
                        var5 = true;
                        continue;
                    }
                    if (var10 == '+' && arg3) {
                        continue;
                    }
                }
                int var14;
                if (var10 >= '0' && var10 <= '9') {
                    var14 = var10 - '0';
                } else if (var10 >= 'A' && var10 <= 'Z') {
                    var14 = var10 - '7';
                } else if (var10 >= 'a' && var10 <= 'z') {
                    var14 = var10 - 'W';
                } else {
                    return false;
                }
                if (var14 >= arg1) {
                    return false;
                }
                if (var5) {
                    var14 = -var14;
                }
                int var11 = arg1 * var7 + var14;
                if ((var11 / arg1) != var7) {
                    return false;
                }
                var6 = true;
                var7 = var11;
            }
            return var6;
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field9361[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field9361[1] : field9361[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public class646(String arg0, String arg1, String arg2, int arg3) {
        try {
            this.field9351 = arg3;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9361[6] + (arg0 == null ? field9361[1] : field9361[2]) + ',' + (arg1 == null ? field9361[1] : field9361[2]) + ',' + (arg2 == null ? field9361[1] : field9361[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(Lib;Lko;I)Lrja;")
    public static final class116 method4756(class163 arg0, class530 arg1, int arg2) {
        try {
            field9360++;
            class116 var3 = new class116(arg1);
            int var4 = arg0.method1455((byte) 62);
            boolean var5 = (var4 & 0x1) != 0;
            boolean var6 = (var4 & 0x2) != 0;
            boolean var7 = (var4 & 0x4) != 0;
            if (var5) {
                var3.field1381[0] = arg0.method1445((byte) 112);
                var3.field1385[0] = arg0.method1445((byte) 121);
                if (arg1.field7794 != -1 || arg1.field7783 != -1) {
                    var3.field1381[1] = arg0.method1445((byte) 124);
                    var3.field1385[1] = arg0.method1445((byte) 118);
                }
                if (arg1.field7710 != -1 || arg1.field7785 != -1) {
                    var3.field1381[2] = arg0.method1445((byte) 118);
                    var3.field1385[2] = arg0.method1445((byte) 110);
                }
            }
            boolean var8 = (var4 & 0x8) != 0;
            if (var6) {
                var3.field1376[0] = arg0.method1445((byte) 119);
                var3.field1382[0] = arg0.method1445((byte) 121);
                if (arg1.field7762 != -1 || arg1.field7713 != -1) {
                    var3.field1376[1] = arg0.method1445((byte) 125);
                    var3.field1382[1] = arg0.method1445((byte) 121);
                }
            }
            int var9 = 67 / ((arg2 - 15) / 33);
            if (var7) {
                int var10 = arg0.method1445((byte) 110);
                int[] var11 = new int[] { class291.method2359(15, var10), class291.method2359(15, var10 >> 4), class291.method2359(var10 >> 8, 15), class291.method2359(var10 >> 12, 15) };
                for (int var12 = 0; var12 < 4; var12++) {
                    if (var11[var12] != 15) {
                        var3.field1378[var11[var12]] = (short) arg0.method1445((byte) 118);
                    }
                }
            }
            if (var8) {
                int var13 = arg0.method1455((byte) 62);
                int[] var14 = new int[] { class291.method2359(15, var13), class291.method2359(var13, 255) >> 4 };
                for (int var15 = 0; var15 < 2; var15++) {
                    if (var14[var15] != 15) {
                        var3.field1374[var14[var15]] = (short) arg0.method1445((byte) 116);
                    }
                }
            }
            return var3;
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field9361[7] + (arg0 == null ? field9361[1] : field9361[2]) + ',' + (arg1 == null ? field9361[1] : field9361[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(B)V")
    public static void method4757(byte arg0) {
        try {
            field9352 = null;
            if (arg0 == -110) {
                field9353 = null;
                field9356 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9361[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4758(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x51);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4759(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 109;
                    break;
                case 1:
                    var10005 = 127;
                    break;
                case 2:
                    var10005 = 41;
                    break;
                case 3:
                    var10005 = 18;
                    break;
                default:
                    var10005 = 81;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
