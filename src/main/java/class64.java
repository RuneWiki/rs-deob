import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class64 extends RuntimeException {

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Ljava/lang/String;")
    public String field1045;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1050;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field1051 = 0;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "[I")
    public static int[] field1047 = new int[1000];

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Lvf;")
    public static class48 field1048 = new class48();

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "Laf;")
    public static class150 field1052;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "Lsb;")
    public static class98 field1053;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)Lnj;")
    public static final class82 method458(boolean arg0) {
        byte[] var1 = class204.field3491[0];
        int var2 = class245.field4326[0] * class164.field2958[0];
        field1049++;
        int[] var3 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = class33.field572[class214.method1427(255, var1[var4])];
        }
        class247 var5 = new class247(class144.field2538, class101.field1790, class253.field4422[0], class9.field207[0], class245.field4326[0], class164.field2958[0], var3);
        class125.method932(arg0);
        return var5;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method459(int arg0) {
        field1048 = null;
        field1052 = null;
        if (arg0 != 12662) {
            field1047 = null;
        }
        field1053 = null;
        field1047 = null;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
    public static final void method460(int arg0) {
        int var1 = 48 % ((arg0 + 39) / 38);
        class91.field1606.method1554((byte) -109);
        field1054++;
        class16.field315.method1554((byte) -109);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Loc;")
    public static final class64 method461(Throwable arg0, String arg1) {
        field1055++;
        class64 var2;
        if ((arg0 instanceof class64)) {
            var2 = (class64) arg0;
            var2.field1045 = var2.field1045 + ' ' + arg1;
        } else {
            var2 = new class64(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    private class64(Throwable arg0, String arg1) {
        this.field1045 = arg1;
        this.field1050 = arg0;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILui;)V")
    public static final void method462(int arg0, class73 arg1) {
        arg1.method543(class106.field1910, class121.field2227 / 2, class180.field3111 / 2 - 26, 16777215, -1);
        int var2 = class180.field3111 / 2 - 18;
        field1046++;
        class128.method963(class121.field2227 / 2 - 152, var2, 304, 34, 9179409);
        class128.method963(class121.field2227 / 2 - 151, var2 - -1, 302, 32, 0);
        class128.method967(class121.field2227 / 2 - 150, var2 + 2, class181.field3116 * arg0, 30, 9179409);
        class128.method967(class121.field2227 / 2 + ((class181.field3116 * 3) - 150), var2 + 2, 300 - (class181.field3116 * 3), 30, 0);
        arg1.method543(class250.field4386, class121.field2227 / 2, class180.field3111 / 2 + 4, 16777215, -1);
    }
}
