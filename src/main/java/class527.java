import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class527 extends class578 {

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "Lih;")
    public class717 field7672;

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7673 = new String[] { method4005(method4004("+}b \u0000")), method4005(method4004("39bOU")), method4005(method4004("+}b]A&~8_\u0000")), method4005(method4004("&b \r")) };

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
    public static int field7668 = 0;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field7667 = 0;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "J")
    public static long field7669 = 0L;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public static int field7670;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public static int field7671;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIBI)V")
    public static final void method4003(int arg0, int arg1, byte arg2, int arg3) {
        try {
            int var7 = arg1 << 3;
            if (arg2 != 59) {
                field7670 = -8;
            }
            int var6 = arg0 << 3;
            field7671++;
            int var8 = arg3 << 3;
            class349.field5057 = var6;
            if (class596.field8579 == 2) {
                class57.field802 = var6;
                class355.field5151 = var7;
                class282.field3974 = var8;
            }
            class607.field8706 = var7;
            class626.method4600(arg2 - 20615);
            class669.field9440 = true;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7673[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lih;)V")
    public class527(class717 arg0) {
        try {
            this.field7672 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7673[2] + (arg0 == null ? field7673[3] : field7673[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4004(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x28);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4005(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 72;
                    break;
                case 1:
                    var10005 = 23;
                    break;
                case 2:
                    var10005 = 76;
                    break;
                case 3:
                    var10005 = 97;
                    break;
                default:
                    var10005 = 40;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
