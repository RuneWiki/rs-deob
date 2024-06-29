import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public class class280 extends class206 {

    @OriginalMember(owner = "client!tia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4205 = new String[] { method2298(method2297(")j3t6u")), method2298(method2297("3v>6")), method2298(method2297("&-|t\n")), method2298(method2297(")j3t5u")) };

    @OriginalMember(owner = "client!tia", name = "s", descriptor = "I")
    public static int field4202 = 100;

    @OriginalMember(owner = "client!tia", name = "k", descriptor = "I")
    public static int field4201 = 0;

    @OriginalMember(owner = "client!tia", name = "r", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!tia", name = "n", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!tia", name = "l", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!tia", name = "p", descriptor = "I")
    public int field4200;

    @OriginalMember(owner = "client!tia", name = "q", descriptor = "I")
    public int field4203;

    @OriginalMember(owner = "client!tia", name = "j", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!tia", name = "o", descriptor = "Lub;")
    public class22 field4197;

    @OriginalMember(owner = "client!tia", name = "m", descriptor = "Lwia;")
    public class790 field4195;

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(I)V")
    public final void method2295(int arg0) {
        try {
            if (arg0 != -24822) {
                field4199 = -35;
            }
            field4198++;
            if (class22.field267 < class385.field5825.length) {
                class385.field5825[class22.field267++] = this;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4205[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(Lte;Lte;Z)V")
    public static final void method2296(class640 arg0, class640 arg1, boolean arg2) {
        try {
            if (arg0.field9295 != null) {
                arg0.method4696(89);
            }
            field4204++;
            arg0.field9295 = arg1.field9295;
            arg0.field9298 = arg1;
            arg0.field9295.field9298 = arg0;
            if (arg2) {
                field4201 = 23;
            }
            arg0.field9298.field9295 = arg0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4205[0] + (arg0 == null ? field4205[1] : field4205[2]) + ',' + (arg1 == null ? field4205[1] : field4205[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2297(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x77);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2298(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 93;
                    break;
                case 1:
                    var10005 = 3;
                    break;
                case 2:
                    var10005 = 82;
                    break;
                case 3:
                    var10005 = 90;
                    break;
                default:
                    var10005 = 119;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
