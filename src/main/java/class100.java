import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class100 {

    @OriginalMember(owner = "client!ida", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1355 = new String[] { method982(method981("\u00040`3@E")), method982(method981("\u00040`3DE")), method982(method981("\u00040`3BE")), method982(method981("\u000b>`")), method982(method981("\u00040`3EE")), method982(method981("\u0016z/3|")), method982(method981("\u0003!mq")), method982(method981("\u00040`3CE")) };

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "Lsb;")
    public static class261 field1350 = new class261(62, 4);

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!ida", name = "e", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!ida", name = "d", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)V", line = 4)
    public static void method976(int arg0) {
        try {
            int var1 = 95 / ((arg0 - 19) / 56);
            field1350 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1355[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIII)I", line = 17)
    public static final int method977(int arg0, int arg1, int arg2, int arg3) {
        try {
            field1353++;
            if (class107.field1413 == null) {
                return 0;
            }
            int var4 = arg3 >> 9;
            int var5 = arg1 >> 9;
            if (~var4 > arg0 || var5 < 0 || (class625.field8929 - 1) < var4 || class14.field187 - 1 < var5) {
                return 0;
            }
            int var6 = arg2;
            if (arg2 < 3 && (class76.field1089[1][var4][var5] & 0x2) != 0) {
                var6 = arg2 + 1;
            }
            return class107.field1413[var6].method5440((byte) 15, arg3, arg1);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field1355[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(I)V", line = 47)
    public static final void method978(int arg0) {
        try {
            field1351++;
            if (arg0 == -1) {
                for (class576 var1 = (class576) class614.field8777.method3977((byte) -109); var1 != null; var1 = (class576) class614.field8777.method3987(0)) {
                    if (var1.field8342) {
                        var1.method4279(-1);
                    }
                }
                for (class576 var2 = (class576) class364.field5278.method3977((byte) -103); var2 != null; var2 = (class576) class364.field5278.method3987(0)) {
                    if (var2.field8342) {
                        var2.method4279(-1);
                    }
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1355[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(Z)Lsh;", line = 80)
    public static final class207 method979(boolean arg0) {
        try {
            if (arg0) {
                field1350 = null;
            }
            field1352++;
            try {
                return (class207) Class.forName(field1355[3]).getDeclaredConstructor().newInstance();
            } catch (Throwable var2) {
                return new class307();
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1355[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 98)
    public static final long method980(String arg0, int arg1) {
        try {
            field1354++;
            int var2 = arg0.length();
            long var3 = 0L;
            for (int var5 = 0; var5 < var2; var5++) {
                var3 = (long) arg0.charAt(var5) + (var3 << 5) - var3;
            }
            return arg1 == 2 ? var3 : 56L;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field1355[7] + (arg0 == null ? field1355[6] : field1355[5]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ida", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method981(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ida", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method982(char[] arg0) {
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
                    var10005 = 84;
                    break;
                case 2:
                    var10005 = 1;
                    break;
                case 3:
                    var10005 = 29;
                    break;
                default:
                    var10005 = 1;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
