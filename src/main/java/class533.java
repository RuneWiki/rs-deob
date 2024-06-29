import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class533 extends class315 {

    @OriginalMember(owner = "client!ek", name = "N", descriptor = "[Ljava/lang/String;")
    private static final String[] field7817 = new String[] { method4031(method4030("3h\u00006\u0005")), method4031(method4030("42\u001c\"K#oB")), method4031(method4030("--\u0000SP")), method4031(method4030("8vB\u0011")), method4031(method4030("3h\u00001\u0005")), method4031(method4030("&2\u001c\"K#oB")), method4031(method4030("&2\u001f\"K#oB")), method4031(method4030("3h\u00004\u0005")) };

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "I")
    public static int field7812 = 0;

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "Lel;")
    public static class573 field7813 = new class573(19, -2);

    @OriginalMember(owner = "client!ek", name = "K", descriptor = "Lcn;")
    public static class541 field7816 = null;

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "I")
    public static int field7814;

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "I")
    public static int field7815;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lla;I)V", line = 3)
    public static final void method4028(class476 arg0, int arg1) {
        try {
            class431.field6336 = arg0.method3627(field7817[6], 37);
            ++field7814;
            class647.field9376 = arg0.method3627(field7817[5], arg1 ^ 17192);
            if (arg1 != -17262) {
                field7816 = null;
            }
            class242.field3709 = arg0.method3627(field7817[1], -67);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7817[4] + (arg0 != null ? field7817[2] : field7817[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lla;Lla;Lph;)V", line = 16)
    public class533(class476 arg0, class476 arg1, class669 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIB)V", line = 24)
    public final void method2653(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        try {
            if (arg4 != 39) {
                method4028((class476) null, -1);
            }
            ++field7815;
            int var6 = super.field4988.method988();
            int var7 = ((class669) super.field5922).field9719 * class540.method4070((byte) 121) / 10 % var6;
            super.field4988.method4350(arg0 - -var7 + -var6, arg3, -var7 + arg1 - -var6, arg2);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field7817[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)V", line = 44)
    public static void method4029(byte arg0) {
        try {
            field7816 = null;
            field7813 = null;
            if (arg0 < 59) {
                field7812 = 10;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7817[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4030(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 45);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4031(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 86;
                    break;
                case 1:
                    var10005 = 3;
                    break;
                case 2:
                    var10005 = 46;
                    break;
                case 3:
                    var10005 = 125;
                    break;
                default:
                    var10005 = 45;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
