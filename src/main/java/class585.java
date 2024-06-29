import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class585 {

    @OriginalMember(owner = "client!po", name = "k", descriptor = "I")
    public int field8482;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "Ljava/lang/String;")
    public String field8483;

    @OriginalMember(owner = "client!po", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8491 = new String[] { method4303(method4302("nw\u001e@\u0010MlB]\u0011y0")), method4303(method4302("nw\u001evW")), method4303(method4302("e6\u001e\u001a\u0002")), method4303(method4302("pm\\X")), method4303(method4302("nw\u001euW")), method4303(method4302("nw\u001eqW")), method4303(method4302("nw\u001epW")), method4303(method4302("nw\u001ewW")), method4303(method4302("nw\u001e\b\u0016pqD\nW")) };

    @OriginalMember(owner = "client!po", name = "g", descriptor = "I")
    public static int field8485 = 0;

    @OriginalMember(owner = "client!po", name = "j", descriptor = "Lse;")
    public static class267 field8484 = new class267();

    @OriginalMember(owner = "client!po", name = "b", descriptor = "Lhl;")
    public static class556 field8489 = new class556(86, -1);

    @OriginalMember(owner = "client!po", name = "d", descriptor = "Lhl;")
    public static class556 field8490 = new class556(62, -1);

    @OriginalMember(owner = "client!po", name = "a", descriptor = "I")
    public static int field8480;

    @OriginalMember(owner = "client!po", name = "l", descriptor = "I")
    public static int field8481;

    @OriginalMember(owner = "client!po", name = "i", descriptor = "I")
    public static int field8486;

    @OriginalMember(owner = "client!po", name = "h", descriptor = "I")
    public static int field8487;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    public static int field8488;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field8479;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BILjava/lang/String;Ljava/lang/String;I)V", line = 4)
    public static final void method4297(String arg0, String arg1, byte arg2, int arg3, String arg4, String arg5, int arg6) {
        try {
            int var7 = 76 % ((arg2 - 34) / 51);
            field8480++;
            class427.method3387(16, arg1, arg6, arg4, arg3, -1, arg0, null, arg5);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field8491[5] + (arg0 == null ? field8491[3] : field8491[2]) + ',' + (arg1 == null ? field8491[3] : field8491[2]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field8491[3] : field8491[2]) + ',' + (arg5 == null ? field8491[3] : field8491[2]) + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!po", name = "toString", descriptor = "()Ljava/lang/String;", line = 19)
    public final String toString() {
        try {
            field8486++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8491[0] + ')');
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(III)Z", line = 28)
    public static final boolean method4298(int arg0, int arg1, int arg2) {
        try {
            if (arg1 != 2048) {
                method4299(null, null, null, -110, -22, 89);
            }
            field8481++;
            return (arg2 & 0x20) != 0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8491[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "([ILgca;[IIII)Lqo;", line = 41)
    public static final class22 method4299(int[] arg0, class261 arg1, int[] arg2, int arg3, int arg4, int arg5) {
        try {
            field8488++;
            if (arg3 != 0) {
                return null;
            } else if (arg1.method1058(6, class544.field8004, class335.field5466)) {
                byte[] var6 = new byte[arg4 * arg5];
                for (int var7 = 0; var7 < arg4; var7++) {
                    int var8 = arg5 * var7 + arg2[var7];
                    for (int var9 = 0; var9 < arg0[var7]; var9++) {
                        var6[var8++] = -1;
                    }
                }
                return new class22(arg1, arg5, arg4, var6);
            } else {
                int[] var10 = new int[arg4 * arg5];
                for (int var11 = 0; var11 < arg4; var11++) {
                    int var12 = arg5 * var11 + arg2[var11];
                    for (int var13 = 0; var13 < arg0[var11]; var13++) {
                        var10[var12++] = -16777216;
                    }
                }
                return new class22(arg1, arg5, arg4, var10);
            }
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field8491[4] + (arg0 == null ? field8491[3] : field8491[2]) + ',' + (arg1 == null ? field8491[3] : field8491[2]) + ',' + (arg2 == null ? field8491[3] : field8491[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V", line = 104)
    public static void method4300(int arg0) {
        try {
            if (arg0 != -1) {
                field8489 = null;
            }
            field8490 = null;
            field8479 = null;
            field8489 = null;
            field8484 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8491[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V", line = 116)
    public class585(String arg0, String arg1, int arg2) {
        try {
            this.field8482 = arg2;
            this.field8483 = arg0;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8491[8] + (arg0 == null ? field8491[3] : field8491[2]) + ',' + (arg1 == null ? field8491[3] : field8491[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V", line = 127)
    public static final void method4301(int arg0) {
        try {
            field8487++;
            class148.method1348((byte) -107, arg0, 2, class623.field8996.field6389.method5170(true) == 1);
            class254.field3874 = class768.method5535(class393.field6256, 0, 0, 22050, class442.field6902);
            class535.method3990(class409.method3285(arg0 ^ 0xFFFFA22A, null), true, (byte) -111);
            class477.field7261 = class768.method5535(class393.field6256, 0, 1, 2048, class442.field6902);
            class476.field7253 = new class301();
            class477.field7261.method5702((byte) 99, class476.field7253);
            class275.field4407 = new class648(22050, class210.field3321);
            class201.method1831((byte) -117);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8491[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!po", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4302(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!po", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4303(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 30;
                    break;
                case 1:
                    var10005 = 24;
                    break;
                case 2:
                    var10005 = 48;
                    break;
                case 3:
                    var10005 = 52;
                    break;
                default:
                    var10005 = 127;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
