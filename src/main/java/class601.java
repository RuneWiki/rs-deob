import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public class class601 extends class36 {

    @OriginalMember(owner = "client!bha", name = "t", descriptor = "I")
    private int field8703 = -1;

    @OriginalMember(owner = "client!bha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8704 = new String[] { method4408(method4407("\u001bD`X\u0002Q")), method4408(method4407("\u0002\u0002/X<")), method4408(method4407("\u001bD`X\u0005Q")), method4408(method4407("\u0017Ym\u001a")), method4408(method4407("\u001bD`X\u0003Q")), method4408(method4407("\u001bD`X\u0000Q")) };

    @OriginalMember(owner = "client!bha", name = "r", descriptor = "B")
    private byte field8700;

    @OriginalMember(owner = "client!bha", name = "u", descriptor = "I")
    private int field8697;

    @OriginalMember(owner = "client!bha", name = "v", descriptor = "I")
    public static int field8698;

    @OriginalMember(owner = "client!bha", name = "s", descriptor = "I")
    public static int field8701;

    @OriginalMember(owner = "client!bha", name = "q", descriptor = "I")
    public static int field8702;

    @OriginalMember(owner = "client!bha", name = "o", descriptor = "Lpea;")
    public static class758 field8699;

    @OriginalMember(owner = "client!bha", name = "p", descriptor = "Ljava/lang/String;")
    private String field8696;

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(Lwt;I)V", line = 3)
    public final void method359(class328 arg0, int arg1) {
        try {
            field8702++;
            if (arg1 != 1984) {
                field8699 = null;
            }
            class432 var3 = arg0.field5376[this.field8703];
            var3.field6784 = this.field8697;
            var3.field6785 = this.field8700;
            var3.field6783 = this.field8696;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8704[5] + (arg0 == null ? field8704[3] : field8704[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 25)
    public static final boolean method4405(String arg0, int arg1) {
        try {
            field8698++;
            if (arg0 == null) {
                return false;
            }
            for (int var2 = arg1; var2 < class223.field3504; var2++) {
                if (arg0.equalsIgnoreCase(class15.field175[var2])) {
                    return true;
                }
                if (arg0.equalsIgnoreCase(class242.field3741[var2])) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8704[4] + (arg0 == null ? field8704[3] : field8704[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(Lwq;I)V", line = 57)
    public final void method361(class176 arg0, int arg1) {
        try {
            this.field8703 = arg0.method1687((byte) -126);
            field8701++;
            this.field8700 = arg0.method1672(-58);
            this.field8697 = arg0.method1687((byte) -64);
            arg0.method1658(-24862);
            if (arg1 < 0) {
                this.field8696 = null;
            }
            this.field8696 = arg0.method1635((byte) 96);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8704[2] + (arg0 == null ? field8704[3] : field8704[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(B)V", line = 81)
    public static void method4406(byte arg0) {
        try {
            if (arg0 != -31) {
                field8699 = null;
            }
            field8699 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8704[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4407(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x41);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4408(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 121;
                    break;
                case 1:
                    var10005 = 44;
                    break;
                case 2:
                    var10005 = 1;
                    break;
                case 3:
                    var10005 = 118;
                    break;
                default:
                    var10005 = 65;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
