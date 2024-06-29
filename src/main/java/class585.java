import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public abstract class class585 {

    @OriginalMember(owner = "client!si", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8628 = new String[] { method4369(method4368("x%v<\bo$u4")), method4369(method4368("x%v=\br\"u4")), method4369(method4368("x%v?\bo$u4")), method4369(method4368("l\"(L\u0000")), method4369(method4368("x%v:\bj <")), method4369(method4368("?8otM%")), method4369(method4368("?;ugRzq")) };

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field8627;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V", line = 5)
    public static final void method4367(byte arg0) {
        try {
            class172.field2402 = 0;
            class190.field2585++;
            field8627++;
            class454.field6638 = 0;
            class356.method2916((byte) 122);
            class177.method1553(2);
            class322.method2728(-30856);
            boolean var1 = false;
            for (int var2 = 0; var2 < class454.field6638; var2++) {
                int var3 = class749.field10904[var2];
                class383 var4 = (class383) class207.field3184.method977((long) var3, 1);
                class612 var5 = var4.field5799;
                if (class216.field3297 && class100.method825(true, var3)) {
                    class1.method5(121);
                }
                if (class190.field2585 != var5.field3840) {
                    if (var5.field8947.method3747(arg0 ^ 0xFFFF94F8)) {
                        class136.method1153((byte) 111, var5);
                    }
                    var5.method4519(true, null);
                    var4.method1824(1);
                    var1 = true;
                }
            }
            if (arg0 != -28) {
                method4367((byte) -27);
            }
            if (var1) {
                class750.field10912 = class207.field3184.method979(false);
                class207.field3184.method974(0, class753.field10966);
            }
            if (class476.field6930 != class430.field6332.field2201) {
                throw new RuntimeException(field8628[2] + class430.field6332.field2201 + field8628[6] + class476.field6930);
            }
            for (int var6 = 0; var6 < class6.field60; var6++) {
                if (class207.field3184.method977((long) class590.field8680[var6], arg0 + 29) == null) {
                    throw new RuntimeException(field8628[0] + var6 + field8628[5] + class6.field60);
                }
            }
            if (class750.field10912 - class6.field60 != 0) {
                throw new RuntimeException(field8628[1] + (class750.field10912 - class6.field60));
            }
            for (int var7 = 0; var7 < class750.field10912; var7++) {
                if (class190.field2585 != class753.field10966[var7].field5799.field3840) {
                    throw new RuntimeException(field8628[4] + class753.field10966[var7].field5799.field3780);
                }
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field8628[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljs;B)Ljs;")
    public abstract class349 method3482(class349 arg0, byte arg1);

    @OriginalMember(owner = "client!si", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4368(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x28);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!si", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4369(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 31;
                    break;
                case 1:
                    var10005 = 75;
                    break;
                case 2:
                    var10005 = 6;
                    break;
                case 3:
                    var10005 = 14;
                    break;
                default:
                    var10005 = 40;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
