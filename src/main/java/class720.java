import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class720 {

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "Ljava/lang/String;")
    public String field10255;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "Ljava/lang/String;")
    public String field10254;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "Ljava/lang/String;")
    public String field10252;

    @OriginalMember(owner = "client!ln", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10257 = new String[] { method5216(method5215("b02\u001a")), method5216(method5215("`+pJfb,*H'")), method5216(method5215("wkpXr")), method5216(method5215("`+p4'")), method5216(method5215("`+p7'")) };

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "Llf;")
    public static class260 field10253 = new class260(4, 4);

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
    public static int field10256 = 0;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
    public static int field10250;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "Llga;")
    public static class47 field10251;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
    public static void method5213(int arg0) {
        try {
            if (arg0 == 6594) {
                field10251 = null;
                field10253 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10257[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class720(String arg0, String arg1, String arg2) {
        try {
            this.field10255 = arg2;
            this.field10254 = arg1;
            this.field10252 = arg0;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10257[1] + (arg0 == null ? field10257[0] : field10257[2]) + ',' + (arg1 == null ? field10257[0] : field10257[2]) + ',' + (arg2 == null ? field10257[0] : field10257[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IBI)I")
    public static final int method5214(int arg0, byte arg1, int arg2) {
        try {
            field10250++;
            if (arg1 < 7) {
                return 66;
            }
            int var3 = 0;
            while (arg2 > 0) {
                var3 = arg0 & 0x1 | var3 << 1;
                arg0 >>>= 0x1;
                arg2--;
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10257[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ln", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5215(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xF);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ln", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5216(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 12;
                    break;
                case 1:
                    var10005 = 69;
                    break;
                case 2:
                    var10005 = 94;
                    break;
                case 3:
                    var10005 = 118;
                    break;
                default:
                    var10005 = 15;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
