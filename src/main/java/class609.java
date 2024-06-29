import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class609 {

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8728 = new String[] { method4497(method4496("\u00149U:")), method4497(method4496("\u0001b\u0017x2")), method4497(method4496("\u0010%\u0017\u0017g")), method4497(method4496("\u0010%\u0017\u0014g")) };

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public int field8723;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public int field8724;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public int field8725;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field8726;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field8727;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILjc;)V", line = 3)
    public final void method4494(int arg0, class711 arg1) {
        try {
            while (true) {
                int var3 = arg1.method5128(arg0);
                if (var3 == 0) {
                    field8727++;
                    if (arg0 != 0) {
                        this.method4495((byte) -103, null, -62);
                        return;
                    }
                    return;
                }
                this.method4495((byte) -127, arg1, var3);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8728[3] + arg0 + ',' + (arg1 == null ? field8728[0] : field8728[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BLjc;I)V", line = 31)
    private final void method4495(byte arg0, class711 arg1, int arg2) {
        try {
            field8726++;
            int var4 = 55 % ((-arg0 - 76) / 47);
            if (arg2 == 1) {
                this.field8723 = arg1.method5116((byte) -106);
                this.field8725 = arg1.method5128(0);
                this.field8724 = arg1.method5128(0);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field8728[2] + arg0 + ',' + (arg1 == null ? field8728[0] : field8728[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4496(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4497(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 122;
                    break;
                case 1:
                    var10005 = 76;
                    break;
                case 2:
                    var10005 = 57;
                    break;
                case 3:
                    var10005 = 86;
                    break;
                default:
                    var10005 = 79;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
