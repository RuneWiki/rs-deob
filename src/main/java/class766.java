import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class766 implements class70 {

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11221 = new String[] { method5524(method5523("lg_B\\")), method5524(method5523("g._-\t")), method5524(method5523("y<\u001d\u0000")), method5524(method5523("g._/\t")), method5524(method5523("g._.\t")) };

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "[I")
    public static int[] field11218 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field11216;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field11220;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "Lda;")
    public static class64 field11217;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "[Lhk;")
    public static class107[] field11219;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V", line = 4)
    public static void method5521(int arg0) {
        try {
            field11218 = null;
            field11217 = null;
            if (arg0 != -3639) {
                method5521(-8);
            }
            field11219 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11221[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)I", line = 28)
    public static final int method5522(boolean arg0, int arg1) {
        try {
            field11220++;
            if (arg1 == 6406) {
                return 1;
            } else if (arg1 == 6409) {
                return 1;
            } else if (arg1 == 32841) {
                return 1;
            } else if (arg1 == 6410) {
                return 2;
            } else if (arg1 == 6407) {
                return 3;
            } else if (arg1 == 6408) {
                return 4;
            } else {
                if (arg0) {
                    field11219 = null;
                }
                throw new IllegalArgumentException("");
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11221[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lpe;[IJZ)Ljava/lang/String;", line = 63)
    public final String method742(class636 arg0, int[] arg1, long arg2, boolean arg3) {
        try {
            field11216++;
            if (class366.field5965 == arg0) {
                class740 var6 = class793.field11596.method5400(arg1[0], (byte) -55);
                return var6.method5393((int) arg2, 123);
            } else if (class662.field9435 == arg0 || class459.field7079 == arg0) {
                class584 var7 = class229.field3563.method531((int) arg2, (byte) 36);
                return var7.field8423;
            } else if (class738.field10828 == arg0 || class261.field4005 == arg0 || class358.field5778 == arg0) {
                return class793.field11596.method5400(arg1[0], (byte) -105).method5393((int) arg2, 126);
            } else if (arg3) {
                return null;
            } else {
                return null;
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field11221[1] + (arg0 == null ? field11221[2] : field11221[0]) + ',' + (arg1 == null ? field11221[2] : field11221[0]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5523(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x21);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5524(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 23;
                    break;
                case 1:
                    var10005 = 73;
                    break;
                case 2:
                    var10005 = 113;
                    break;
                case 3:
                    var10005 = 108;
                    break;
                default:
                    var10005 = 33;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
