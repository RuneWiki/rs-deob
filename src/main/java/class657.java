import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class657 {

    @OriginalMember(owner = "client!mq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9314 = new String[] { method4770(method4769("\u001a\u0019\u0004o/$\u001cXr.\u0010@")), method4770(method4769("\u001a\u0019\u0004Xh")), method4770(method4769("\u001a\u0019\u0004Yh")), method4770(method4769("\u001a\u0019\u0004Zh")) };

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "I")
    public static int field9309;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
    public static int field9310;

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "I")
    public static int field9311;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
    public static int field9312;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
    public static int field9313;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)I", line = 11)
    public static final int method4766(int arg0) {
        try {
            if (arg0 > -51) {
                return 90;
            } else {
                field9311++;
                return class139.field1812;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9314[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(III)I", line = 23)
    public final int method4767(int arg0, int arg1, int arg2) {
        try {
            if (arg0 != 23467) {
                method4766(61);
            }
            field9313++;
            int var4 = arg2 >= class711.field9998 ? arg2 : class711.field9998;
            if (class121.field1529 == this) {
                return 0;
            } else if (class731.field10446 == this) {
                return var4 - arg1;
            } else if (class130.field1614 == this) {
                return (var4 - arg1) / 2;
            } else {
                return 0;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9314[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mq", name = "toString", descriptor = "()Ljava/lang/String;", line = 46)
    public final String toString() {
        try {
            field9312++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9314[0] + ')');
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)[Lhn;", line = 54)
    public static final class357[] method4768(int arg0) {
        try {
            field9309++;
            return arg0 == 2 ? new class357[] { class414.field5949, class414.field5952, class414.field5953, class414.field5954, class414.field5955, class414.field5956, class414.field5957, class414.field5958, class414.field5959, class414.field5960, class414.field5961, class414.field5962, class414.field5963 } : null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9314[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4769(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x40);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4770(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 119;
                    break;
                case 1:
                    var10005 = 104;
                    break;
                case 2:
                    var10005 = 42;
                    break;
                case 3:
                    var10005 = 27;
                    break;
                default:
                    var10005 = 64;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
