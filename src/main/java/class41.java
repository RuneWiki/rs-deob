import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class41 extends class30 {

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "[Lng;")
    public class136[] field846;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "Lrd;")
    public static class173 field845 = class133.method843("Benutzen Sie bitte eine andere Welt)3", -111);

    @OriginalMember(owner = "client!e", name = "O", descriptor = "Lrd;")
    public static class173 field844 = class133.method843("-5berpr-Ufen Sie Ihr Mitteilungsfach)3", 14);

    @OriginalMember(owner = "client!e", name = "T", descriptor = "I")
    public static int field849 = 0;

    @OriginalMember(owner = "client!e", name = "U", descriptor = "Lrd;")
    private static class173 field850 = class133.method843("Members only world", -76);

    @OriginalMember(owner = "client!e", name = "V", descriptor = "I")
    public static int field851 = 0;

    @OriginalMember(owner = "client!e", name = "M", descriptor = "Lrd;")
    public static class173 field842 = field850;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "Lrd;")
    public static class173 field847 = class133.method843("event_opbase", 14);

    @OriginalMember(owner = "client!e", name = "W", descriptor = "Lrd;")
    public static class173 field852 = class133.method843("Lade Texturen )2 ", -95);

    @OriginalMember(owner = "client!e", name = "K", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!e", name = "L", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!e", name = "N", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!e", name = "S", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(B)V")
    public static void method301(byte arg0) {
        field852 = null;
        field842 = null;
        field850 = null;
        field845 = null;
        field847 = null;
        field844 = null;
        int var1 = 89 % ((arg0 + 86) / 38);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BI)Ltg;")
    public static final class196 method302(byte arg0, int arg1) {
        field840++;
        class196 var2 = (class196) class181.field3549.method46((long) arg1, 26580);
        if (arg0 <= 83) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class37.field795.method142(3, arg1, (byte) 2);
            class196 var4 = new class196();
            if (var3 != null) {
                var4.method1299(new class121(var3), false);
            }
            class181.field3549.method52(-3583, var4, (long) arg1);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(II)Z")
    public final boolean method303(int arg0, int arg1) {
        if (arg1 == 0) {
            field843++;
            return this.field846[arg0].field2570;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lbc;Lbc;IZ)V")
    public class41(class14 arg0, class14 arg1, int arg2, boolean arg3) {
        class145 var5 = new class145();
        int var6 = arg0.method138(arg2, true);
        this.field846 = new class136[var6];
        int[] var7 = arg0.method119(arg2, false);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method142(arg2, var7[var8], (byte) 2);
            class104 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class104 var12 = (class104) var5.method915(-1); var12 != null; var12 = (class104) var5.method910((byte) 88)) {
                if (var12.field1928 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method141(0, var11, (byte) 103);
                } else {
                    var13 = arg1.method141(var11, 0, (byte) 104);
                }
                var10 = new class104(var11, var13);
                var5.method920(false, var10);
            }
            this.field846[var7[var8]] = new class136(var9, var10);
        }
    }
}
