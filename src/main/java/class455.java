import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class455 {

    @OriginalMember(owner = "client!pea", name = "f", descriptor = "Z")
    public boolean field6638;

    @OriginalMember(owner = "client!pea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6646 = new String[] { method3517(method3516("%)\u00141\u0002}")), method3517(method3516("%)\u00141\u0000}")), method3517(method3516("%)\u00141\u0001}")), method3517(method3516("%)\u00141\u007f<\"\u001ck}}")) };

    @OriginalMember(owner = "client!pea", name = "g", descriptor = "I")
    public static int field6642 = 4;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!pea", name = "d", descriptor = "I")
    public static int field6641;

    @OriginalMember(owner = "client!pea", name = "e", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "Lbl;")
    public class719 field6640;

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "Lbl;")
    public class719 field6644;

    @OriginalMember(owner = "client!pea", name = "h", descriptor = "Z")
    public boolean field6645;

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(I)V", line = 7)
    public static final void method3513(int arg0) {
        try {
            field6639++;
            if (arg0 != 4) {
                field6642 = -110;
            }
            class191.field2530.method3690((byte) 70);
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6646[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(B)Z", line = 20)
    public final boolean method3514(byte arg0) {
        try {
            if (arg0 == 123) {
                field6641++;
                return this.field6645 && !this.field6638;
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6646[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Z)V", line = 34)
    public class455(boolean arg0) {
        try {
            this.field6638 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6646[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(I)V", line = 46)
    public final void method3515(int arg0) {
        try {
            field6643++;
            if (this.field6640 != null) {
                this.field6640.method2342(true);
            }
            if (arg0 != 4) {
                this.field6644 = null;
            }
            this.field6645 = false;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6646[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3516(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x43);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3517(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 85;
                    break;
                case 1:
                    var10005 = 76;
                    break;
                case 2:
                    var10005 = 117;
                    break;
                case 3:
                    var10005 = 31;
                    break;
                default:
                    var10005 = 67;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
