import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class73 {

    @OriginalMember(owner = "client!v", name = "b", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1386 = Calendar.getInstance();

    @OriginalMember(owner = "client!v", name = "f", descriptor = "Z")
    public static boolean field1390 = false;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "Ljf;")
    private static class229 field1391 = class212.method1457((byte) 118, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Ljf;")
    public static class229 field1388 = field1391;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "Ljf;")
    public static class229 field1387 = class212.method1457((byte) 121, "Card:");

    @OriginalMember(owner = "client!v", name = "j", descriptor = "Ljf;")
    public static class229 field1394 = class212.method1457((byte) 120, ": ");

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field1395 = 0;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Lni;")
    public static class24 field1392 = new class24(64);

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public static int field1396 = 0;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)V", line = 21)
    public static final void method533(int arg0, int arg1, int arg2, int arg3) {
        class125 var4 = class312.field5246[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class232 var5 = var4.field2192;
        if (var5 != null) {
            var5.field4021 = var5.field4021 * arg3 / 16;
            var5.field4029 = var5.field4029 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II[BI)I", line = 59)
    public static final int method534(int arg0, int arg1, byte[] arg2, int arg3) {
        field1393++;
        int var4 = -1;
        for (int var5 = arg0; var5 < arg1; var5++) {
            var4 = var4 >>> 8 ^ class214.field3673[(arg2[var5] ^ var4) & 0xFF];
        }
        return var4 ^ arg3;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V", line = 78)
    public static void method535(byte arg0) {
        field1392 = null;
        field1387 = null;
        field1394 = null;
        field1386 = null;
        if (arg0 == 82) {
            field1388 = null;
            field1391 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V", line = 93)
    public static final void method536(byte arg0) {
        class217.field3730.method226((byte) -99);
        int var1 = 14 / ((28 - arg0) / 47);
        field1385++;
        class206.field3596.method226((byte) -113);
        class306.field5172.method226((byte) -110);
        class144.field2513.method226((byte) -114);
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(B)Lmb;", line = 129)
    public static final class105 method537(byte arg0) {
        field1389++;
        int var1 = -107 % ((79 - arg0) / 36);
        try {
            return (class105) Class.forName("ce").getDeclaredConstructor().newInstance();
        } catch (Throwable var3) {
            return null;
        }
    }
}
