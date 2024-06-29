import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class566 extends class514 {

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "[I")
    public int[] field8234;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "[I")
    public int[] field8231;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8236 = new String[] { method4165(method4164("#+@\u0004_")), method4165(method4164("?=\u0002)")), method4165(method4164("#+@\u0006_")), method4165(method4164("*f@k\n")), method4165(method4164("#+@y\u001e?!\u001a{_")), method4165(method4164("#+@\u0007_")) };

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "[I")
    public static int[] field8233 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field8230;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field8235;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "[Lje;")
    public static class424[] field8232;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 13)
    public static final String method4161(long arg0, int arg1) {
        try {
            field8230++;
            if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
                return null;
            } else if ((arg0 % 37L) == 0L) {
                return null;
            } else {
                int var3 = 0;
                long var4 = arg0;
                if (arg1 != -15453) {
                    field8233 = null;
                }
                while (var4 != 0L) {
                    var3++;
                    var4 /= 37L;
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (arg0 != 0L) {
                    long var7 = arg0;
                    arg0 /= 37L;
                    var6.append(class278.field4470[(int) (var7 - arg0 * 37L)]);
                }
                return var6.reverse().toString();
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field8236[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(II[I[I)V", line = 57)
    public class566(int arg0, int arg1, int[] arg2, int[] arg3) {
        try {
            this.field8234 = arg2;
            this.field8231 = arg3;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field8236[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field8236[1] : field8236[3]) + ',' + (arg3 == null ? field8236[1] : field8236[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lgda;IZIIJII)V", line = 70)
    public static final void method4162(class58 arg0, int arg1, boolean arg2, int arg3, int arg4, long arg5, int arg6, int arg7) {
        try {
            field8235++;
            class328.field5391 = arg6;
            if (arg4 < 23) {
                field8232 = null;
            }
            class312.field5115 = arg5;
            class516.field7614 = 1;
            class32.field389 = arg3;
            class550.field8070 = null;
            class787.field11509 = arg0;
            class714.field10341 = arg1;
            class60.field780 = arg2;
            class458.field7069 = 10000;
            class785.field11466 = arg7;
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field8236[2] + (arg0 == null ? field8236[1] : field8236[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 92)
    public static void method4163(int arg0) {
        try {
            field8232 = null;
            field8233 = null;
            if (arg0 != 31303) {
                field8232 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8236[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4164(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x77);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4165(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 81;
                    break;
                case 1:
                    var10005 = 72;
                    break;
                case 2:
                    var10005 = 110;
                    break;
                case 3:
                    var10005 = 69;
                    break;
                default:
                    var10005 = 119;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
