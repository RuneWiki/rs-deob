import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public abstract class class49 {

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field711 = new String[] { method546(method545("\u001c\bFr?")), method546(method545("\u001c\bFs?")), method546(method545("\u001c\bFu?")) };

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "Lop;")
    public static class574 field707 = new class574("", 21);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "S")
    public static short field708 = 320;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "[I")
    public static int[] field709 = new int[32];

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field710 = new String[100];

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lg;B)Lg;")
    public abstract class276 method541(class276 arg0, byte arg1);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public static final void method542(byte arg0) {
        try {
            if (arg0 != -120) {
                field707 = null;
            }
            class529.field7681 = true;
            field705++;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field711[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V")
    public static void method543(boolean arg0) {
        try {
            field707 = null;
            field710 = null;
            if (arg0) {
                field709 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field711[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIFIIZI)[I")
    public static final int[] method544(int arg0, int arg1, int arg2, float arg3, int arg4, int arg5, boolean arg6, int arg7) {
        try {
            field706++;
            int[] var8 = new int[arg7];
            class2 var9 = new class2();
            var9.field37 = arg6;
            var9.field27 = arg2;
            var9.field26 = arg0;
            var9.field36 = arg1;
            var9.field30 = (int) (arg3 * 4096.0F);
            var9.field41 = arg5;
            var9.method12(109);
            class184.method1518(arg7, (byte) 126, arg4);
            var9.method18(0, (byte) -7, var8);
            return var8;
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field711[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method545(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x17);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method546(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 127;
                    break;
                case 1:
                    var10005 = 97;
                    break;
                case 2:
                    var10005 = 104;
                    break;
                case 3:
                    var10005 = 49;
                    break;
                default:
                    var10005 = 23;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
