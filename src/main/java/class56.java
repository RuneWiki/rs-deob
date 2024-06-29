import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class56 {

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "[I")
    public static int[] field1018 = new int[256];

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "Lke;")
    private static class256 field1024 = class316.method2202("Cancel", 27626);

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "[I")
    public static int[] field1017 = new int[100];

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "Lke;")
    public static class256 field1022 = field1024;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public static int field1015 = 1;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "Lke;")
    public static class256 field1014 = class316.method2202(" <col=ffff00>", 27626);

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V", line = 13)
    public static void method441(byte arg0) {
        field1022 = null;
        field1014 = null;
        if (arg0 != 112) {
            field1024 = (class256) null;
        }
        field1018 = null;
        field1024 = null;
        field1017 = null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BLla;)Lla;", line = 39)
    public static final class188 method442(byte arg0, class188 arg1) {
        field1016++;
        if (arg1.field3468 != -1) {
            return class182.method1335((byte) 124, arg1.field3468);
        }
        int var2 = 54 % ((arg0 - 81) / 41);
        int var3 = arg1.field3342 >>> 16;
        class208 var4 = new class208(class62.field1098);
        for (class316 var5 = (class316) var4.method1469(6956); var5 != null; var5 = (class316) var4.method1473((byte) 14)) {
            if (var5.field5453 == var3) {
                return class182.method1335((byte) 114, (int) var5.field2895);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lic;", line = 83)
    public static final class303 method443(Throwable arg0, String arg1) {
        field1023++;
        class303 var2;
        if (arg0 instanceof class303) {
            var2 = (class303) arg0;
            var2.field5234 = var2.field5234 + ' ' + arg1;
        } else {
            var2 = new class303(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)Z", line = 116)
    public static final boolean method444(int arg0) {
        field1019++;
        if (arg0 != 16084) {
            return false;
        }
        if (class92.field1674) {
            try {
                return !(Boolean) class303.field5237.method1766(class272.field4658.field52, 0);
            } catch (Throwable var2) {
            }
        }
        return true;
    }
}
