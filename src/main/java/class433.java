import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class433 extends class683 {

    @OriginalMember(owner = "client!iaa", name = "x", descriptor = "Ljava/lang/Object;")
    private Object field6272;

    @OriginalMember(owner = "client!iaa", name = "G", descriptor = "[Ljava/lang/String;")
    private static final String[] field6282 = new String[] { method3376(method3375("<8\u001e^M}")), method3376(method3375(".wQ^r")), method3376(method3375("<8\u001e^3<7\u0016\u00041}")), method3376(method3375(";,\u0013\u001c")), method3376(method3375("<8\u001e^K}")), method3376(method3375("<8\u001e^L}")), method3376(method3375("<8\u001e^N}")) };

    @OriginalMember(owner = "client!iaa", name = "y", descriptor = "I")
    public static int field6278 = -1;

    @OriginalMember(owner = "client!iaa", name = "F", descriptor = "I")
    public static int field6273 = 0;

    @OriginalMember(owner = "client!iaa", name = "A", descriptor = "Lkl;")
    public static class740 field6275 = new class740();

    @OriginalMember(owner = "client!iaa", name = "z", descriptor = "I")
    public static int field6280 = 1;

    @OriginalMember(owner = "client!iaa", name = "B", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!iaa", name = "w", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!iaa", name = "E", descriptor = "I")
    public static int field6277;

    @OriginalMember(owner = "client!iaa", name = "C", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!iaa", name = "D", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "(B)V")
    public static void method3371(byte arg0) {
        try {
            field6275 = null;
            if (arg0 != -42) {
                field6275 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6282[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIII)V")
    public static final void method3372(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg1 >= -88) {
                field6280 = -54;
            }
            field6276++;
            class294 var4 = class146.method1261((long) arg0, -98, 11);
            var4.method2378(-88);
            var4.field4136 = arg3;
            var4.field4133 = arg2;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field6282[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class433(Object arg0, int arg1) {
        super(arg1);
        try {
            this.field6272 = arg0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6282[2] + (arg0 == null ? field6282[3] : field6282[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)Z")
    public final boolean method3373(int arg0) {
        try {
            field6279++;
            return arg0 <= 39;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6282[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method3374(byte arg0) {
        try {
            if (arg0 != 26) {
                field6280 = 109;
            }
            field6274++;
            return this.field6272;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6282[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iaa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3375(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xF);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!iaa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3376(char[] arg0) {
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
                    var10005 = 89;
                    break;
                case 2:
                    var10005 = 127;
                    break;
                case 3:
                    var10005 = 112;
                    break;
                default:
                    var10005 = 15;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
