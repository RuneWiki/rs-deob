import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class584 {

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "J")
    public long field8430;

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "Lml;")
    private class194 field8429;

    @OriginalMember(owner = "client!vr", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8434 = new String[] { method4325(method4324("+H\u0014^}3[VQn8\u0012")), method4325(method4324("+H\u0014z<")), method4325(method4324("3OVT")), method4325(method4324("&\u0014\u0014\u0016i")), method4325(method4324("+H\u0014\u0004}3SN\u0006<")), method4325(method4324("+H\u0014y<")) };

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "Z")
    public static volatile boolean field8425 = true;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "[I")
    public static int[] field8428 = new int[1];

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "[Z")
    public static boolean[] field8431 = new boolean[8];

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "Ljava/util/Calendar;")
    public static Calendar field8427 = Calendar.getInstance(TimeZone.getTimeZone(method4325(method4324("\u001awn"))));

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "[I")
    public static int[] field8433 = new int[50];

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "I")
    public static int field8423;

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
    public static int field8424;

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
    public static int field8426;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "Lft;")
    public static class188 field8432;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Leea;I)V", line = 4)
    public static final void method4322(class476 arg0, int arg1) {
        try {
            if (arg1 < -85) {
                for (int var2 = 0; var2 < class176.field2305; var2++) {
                    int var3 = class570.field8265[var2];
                    class339 var4 = class748.field10666[var3];
                    int var5 = arg0.method5128(0);
                    if ((var5 & 0x8) != 0) {
                        var5 += arg0.method5128(0) << 8;
                    }
                    if ((var5 & 0x400) != 0) {
                        var5 += arg0.method5128(0) << 16;
                    }
                    class709.method5074(var4, var5, -1, var3, arg0);
                }
                field8424++;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field8434[1] + (arg0 == null ? field8434[2] : field8434[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vr", name = "finalize", descriptor = "()V", line = 48)
    protected final void finalize() throws Throwable {
        try {
            this.field8429.method1607(-58, this.field8430);
            field8426++;
            super.finalize();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8434[0] + ')');
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V", line = 61)
    public static void method4323(int arg0) {
        try {
            field8427 = null;
            field8431 = null;
            if (arg0 < -44) {
                field8433 = null;
                field8428 = null;
                field8432 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8434[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lml;J[Luk;)V", line = 78)
    public class584(class194 arg0, long arg1, class506[] arg2) {
        try {
            this.field8430 = arg1;
            this.field8429 = arg0;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field8434[4] + (arg0 == null ? field8434[2] : field8434[3]) + ',' + arg1 + ',' + (arg2 == null ? field8434[2] : field8434[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!vr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4324(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x14);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4325(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 93;
                    break;
                case 1:
                    var10005 = 58;
                    break;
                case 2:
                    var10005 = 58;
                    break;
                case 3:
                    var10005 = 56;
                    break;
                default:
                    var10005 = 20;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
