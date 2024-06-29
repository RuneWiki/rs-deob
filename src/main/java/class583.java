import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class583 {

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public int field8384;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "Ljava/lang/String;")
    public String field8386;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "Ljava/lang/String;")
    public String field8389;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "Ljava/lang/String;")
    public String field8388;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public int field8391;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public int field8387;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public int field8390;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "Ljava/lang/String;")
    public String field8385;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public int field8394;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "Ljava/lang/String;")
    public String field8383;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8395 = new String[] { method4276(method4275("\u000eKc?\u0003")), method4276(method4275("\u0013\fc-\u0017\u001b\f9/V")), method4276(method4275("\u001b\u0010!}")), method4276(method4275("\u0013\fcPV")) };

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field8392 = 0;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field8393;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", line = 6)
    public final void method4274(String arg0, byte arg1, String arg2, int arg3, String arg4, int arg5, int arg6, String arg7, String arg8) {
        try {
            this.field8384 = class419.method3341((byte) 121);
            field8393++;
            this.field8383 = arg0;
            this.field8385 = arg7;
            this.field8391 = arg6;
            this.field8387 = arg3;
            this.field8389 = arg8;
            this.field8386 = arg2;
            this.field8388 = arg4;
            if (arg1 < 10) {
                this.method4274(null, (byte) 102, null, 74, null, 3, -79, null, null);
            }
            this.field8390 = arg5;
            this.field8394 = class431.field6776;
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field8395[3] + (arg0 == null ? field8395[2] : field8395[0]) + ',' + arg1 + ',' + (arg2 == null ? field8395[2] : field8395[0]) + ',' + arg3 + ',' + (arg4 == null ? field8395[2] : field8395[0]) + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field8395[2] : field8395[0]) + ',' + (arg8 == null ? field8395[2] : field8395[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 39)
    public class583(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        try {
            this.field8384 = class419.method3341((byte) 121);
            this.field8386 = arg3;
            this.field8389 = arg5;
            this.field8388 = arg2;
            this.field8391 = arg1;
            this.field8387 = arg6;
            this.field8390 = arg0;
            this.field8385 = arg7;
            this.field8394 = class431.field6776;
            this.field8383 = arg4;
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field8395[1] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field8395[2] : field8395[0]) + ',' + (arg3 == null ? field8395[2] : field8395[0]) + ',' + (arg4 == null ? field8395[2] : field8395[0]) + ',' + (arg5 == null ? field8395[2] : field8395[0]) + ',' + arg6 + ',' + (arg7 == null ? field8395[2] : field8395[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4275(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4276(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 117;
                    break;
                case 1:
                    var10005 = 101;
                    break;
                case 2:
                    var10005 = 77;
                    break;
                case 3:
                    var10005 = 17;
                    break;
                default:
                    var10005 = 126;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
