import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class741 {

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public int field10528;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10536 = new String[] { method5374(method5373(">\rv]")), method5374(method5373(">\r\u000b\u001c3\"W\t]")), method5374(method5373("0\r\u0019[ ")), method5374(method5373("%V[\u0019")), method5374(method5373(">\rs]")), method5374(method5373(">\ru]")), method5374(method5373(">\rt]")), method5374(method5373(">\rC\u001a\u000e?Q^\u001b:c")) };

    @OriginalMember(owner = "client!u", name = "g", descriptor = "Lsb;")
    public static class261 field10532 = new class261(128, 7);

    @OriginalMember(owner = "client!u", name = "d", descriptor = "[Ldm;")
    public static class274[] field10534 = new class274[300];

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field10535 = -1;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field10529;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field10530;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field10531;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field10533;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 3)
    public static void method5369(int arg0) {
        try {
            field10534 = null;
            field10532 = null;
            if (arg0 < 74) {
                method5372(68, 97, null, false, null, 31, true);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10536[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)Z", line = 14)
    public static final boolean method5370(int arg0, byte arg1) {
        try {
            if (arg1 == 25) {
                field10530++;
                return arg0 == 0 || arg0 == 1 || arg0 == 2;
            } else {
                return false;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10536[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!u", name = "toString", descriptor = "()Ljava/lang/String;", line = 25)
    public final String toString() {
        try {
            field10531++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10536[7] + ')');
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)[Lhj;", line = 36)
    public static final class671[] method5371(byte arg0) {
        try {
            if (arg0 == -112) {
                field10529++;
                return new class671[] { class274.field3886, class647.field9200, class336.field4868, class492.field7217, class533.field7720, class1.field20, class437.field6448, class632.field8978, class62.field944, class185.field2395, class261.field3698, class379.field5543, class564.field8246, class415.field5982 };
            } else {
                return null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10536[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IILlga;ZLng;IZ)V", line = 50)
    public static final void method5372(int arg0, int arg1, class47 arg2, boolean arg3, class429 arg4, int arg5, boolean arg6) {
        try {
            class772.method5562(arg5, arg0, arg2, arg1, (byte) 55, arg6);
            if (!arg3) {
                method5370(118, (byte) 102);
            }
            field10533++;
            class238.field3445 = arg4;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field10536[5] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field10536[3] : field10536[2]) + ',' + arg3 + ',' + (arg4 == null ? field10536[3] : field10536[2]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", line = 65)
    public class741(String arg0, String arg1, String arg2, int arg3) {
        try {
            this.field10528 = arg3;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10536[1] + (arg0 == null ? field10536[3] : field10536[2]) + ',' + (arg1 == null ? field10536[3] : field10536[2]) + ',' + (arg2 == null ? field10536[3] : field10536[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!u", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5373(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!u", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5374(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 75;
                    break;
                case 1:
                    var10005 = 35;
                    break;
                case 2:
                    var10005 = 55;
                    break;
                case 3:
                    var10005 = 117;
                    break;
                default:
                    var10005 = 93;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
