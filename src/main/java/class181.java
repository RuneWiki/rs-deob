import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class181 {

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "Lpg;")
    public static class320 field2731 = new class320(64);

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2733 = "scroll:";

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "Lpg;")
    public static class320 field2732 = new class320(50);

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "J")
    public static long field2736 = 0L;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public static int field2734 = 0;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "C")
    public static char field2730;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "Lte;")
    public static class124 field2735;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "Ll;")
    public static class133 field2727;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZLl;II)Z", line = 5)
    public static final boolean method1296(boolean arg0, class133 arg1, int arg2, int arg3) {
        field2725++;
        byte[] var4 = arg1.method980(arg2, arg3, 5);
        if (var4 == null) {
            return false;
        }
        if (arg0) {
            method1297((byte) 35, -71);
        }
        class92.method663(2346, var4);
        return true;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)Lpj;", line = 35)
    public static final class332 method1297(byte arg0, int arg1) {
        field2728++;
        class332 var2 = (class332) class219.field3337.method2179(false, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class75.field1212.method980(16, arg1, 5);
        class332 var4 = new class332();
        if (var3 != null) {
            var4.method2301(new class166(var3), 0);
        }
        if (arg0 != -125) {
            field2730 = ']';
        }
        class219.field3337.method2173(var4, true, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V", line = 60)
    public static void method1298(byte arg0) {
        field2732 = null;
        if (arg0 != -102) {
            method1296(false, (class133) null, 43, -35);
        }
        field2731 = null;
        field2735 = null;
        field2733 = null;
        field2727 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I[Ljava/lang/String;IZ)Ljava/lang/String;", line = 76)
    public static final String method1299(int arg0, String[] arg1, int arg2, boolean arg3) {
        field2726++;
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var4 = arg1[arg0];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg2;
            int var6 = 0;
            if (arg3) {
                field2736 = -28L;
            }
            for (int var7 = arg0; var7 < var5; var7++) {
                String var8 = arg1[var7];
                if (var8 == null) {
                    var6 += 4;
                } else {
                    var6 += var8.length();
                }
            }
            StringBuffer var9 = new StringBuffer(var6);
            for (int var10 = arg0; var10 < var5; var10++) {
                String var11 = arg1[var10];
                if (var11 == null) {
                    var9.append("null");
                } else {
                    var9.append(var11);
                }
            }
            return var9.toString();
        }
    }
}
