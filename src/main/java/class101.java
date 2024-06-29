import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public abstract class class101 {

    @OriginalMember(owner = "client!jo", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1363 = new String[] { method990(method989("BU6|\u001c")), method990(method989("BU6z\u001c")), method990(method989("BU6{\u001c")), method990(method989("BU6y\u001c")), method990(method989("BU6~\u001c")), method990(method989("FOtT")), method990(method989("S\u00146\u0016I")) };

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "Lhh;")
    public static class250 field1356 = new class250(1);

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "Lho;")
    public static class354 field1359;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)V")
    public static final void method983(int arg0, int arg1) {
        try {
            if (arg0 == 21996) {
                field1361++;
                class788.field11377 = arg1;
                class550.field8037.method2043(false);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1363[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lbs;I)Lbs;")
    public abstract class683 method984(class683 arg0, int arg1);

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(B)Z")
    public static final boolean method985(byte arg0) {
        try {
            field1358++;
            int var1 = -90 % ((arg0 + 37) / 35);
            return class451.field6614;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1363[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method986(String arg0, int arg1) {
        try {
            if (arg1 != 6743) {
                field1359 = null;
            }
            field1362++;
            return arg0.length() + 1;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1363[4] + (arg0 == null ? field1363[5] : field1363[6]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(BIIIIIIIII)V")
    public static final void method987(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        try {
            if (arg0 != -16) {
                method987((byte) 18, 120, 57, -116, -56, 103, -62, -119, 64, 12);
            }
            field1357++;
            if (class335.field4844 <= arg5 && class507.field7453 >= arg5 && arg7 >= class335.field4844 && class507.field7453 >= arg7 && class335.field4844 <= arg6 && arg6 <= class507.field7453 && arg4 >= class335.field4844 && arg4 <= class507.field7453 && arg2 >= class557.field8113 && arg2 <= class50.field717 && arg3 >= class557.field8113 && arg3 <= class50.field717 && arg9 >= class557.field8113 && class50.field717 >= arg9 && arg8 >= class557.field8113 && arg8 <= class50.field717) {
                class669.method4815(true, arg3, arg4, arg5, arg1, arg6, arg8, arg9, arg7, arg2);
            } else {
                class707.method5067(arg5, arg7, false, arg6, arg2, arg1, arg3, arg8, arg9, arg4);
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field1363[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V")
    public static void method988(byte arg0) {
        try {
            if (arg0 != 85) {
                field1356 = null;
            }
            field1359 = null;
            field1356 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1363[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jo", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method989(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x34);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jo", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method990(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 40;
                    break;
                case 1:
                    var10005 = 58;
                    break;
                case 2:
                    var10005 = 24;
                    break;
                case 3:
                    var10005 = 56;
                    break;
                default:
                    var10005 = 52;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
