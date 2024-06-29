import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class614 {

    @OriginalMember(owner = "client!sda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8778 = new String[] { method4533(method4532("=&!*If")), method4533(method4532("=&!*Jf")) };

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "Ltf;")
    public static class524 field8777 = new class524();

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "I")
    public static int field8776;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)V", line = 4)
    public static void method4530(int arg0) {
        try {
            field8777 = null;
            if (arg0 != 5583) {
                field8777 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8778[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)J", line = 17)
    public static final synchronized long method4531(int arg0) {
        try {
            field8776++;
            long var1 = System.currentTimeMillis();
            if (arg0 > -15) {
                method4531(23);
            }
            if (class743.field10557 > var1) {
                class486.field7131 += class743.field10557 - var1;
            }
            class743.field10557 = var1;
            return var1 + class486.field7131;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8778[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4532(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xB);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4533(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 78;
                    break;
                case 1:
                    var10005 = 66;
                    break;
                case 2:
                    var10005 = 64;
                    break;
                case 3:
                    var10005 = 4;
                    break;
                default:
                    var10005 = 11;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
