import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class777 implements class763 {

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "Llga;")
    private class47 field11073;

    @OriginalMember(owner = "client!vba", name = "f", descriptor = "Ljava/lang/String;")
    private String field11077;

    @OriginalMember(owner = "client!vba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11079 = new String[] { method5597(method5596("z\u001c\u000b%O$")), method5597(method5596("z\u001c\u000b%I$")), method5597(method5596("z\u001c\u000b%1e\u0010\u0003\u007f3$")), method5597(method5596("b\u000b\u0006g")), method5597(method5596("wPD%p")), method5597(method5596("z\u001c\u000b%L$")) };

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "[I")
    public static int[] field11075 = new int[256];

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "I")
    public static int field11076;

    @OriginalMember(owner = "client!vba", name = "e", descriptor = "I")
    public static int field11078;

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "[I")
    public static int[] field11074;

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(I)I")
    public final int method1252(int arg0) {
        try {
            int var2 = -109 % ((-arg0 - 28) / 36);
            field11076++;
            return this.field11073.method503(3, this.field11077) ? 100 : this.field11073.method519(this.field11077, 0);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11079[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)Luw;")
    public final class706 method1254(int arg0) {
        try {
            if (arg0 >= -92) {
                this.field11073 = null;
            }
            field11078++;
            return class706.field9870;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11079[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)V")
    public static void method5595(byte arg0) {
        try {
            field11074 = null;
            field11075 = null;
            if (arg0 != -119) {
                field11075 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field11079[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Llga;Ljava/lang/String;)V")
    public class777(class47 arg0, String arg1) {
        try {
            this.field11073 = arg0;
            this.field11077 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11079[2] + (arg0 == null ? field11079[3] : field11079[4]) + ',' + (arg1 == null ? field11079[3] : field11079[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!vba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5596(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xD);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5597(char[] arg0) {
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
                    var10005 = 126;
                    break;
                case 2:
                    var10005 = 106;
                    break;
                case 3:
                    var10005 = 11;
                    break;
                default:
                    var10005 = 13;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
