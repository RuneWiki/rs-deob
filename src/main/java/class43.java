import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class43 extends class88 {

    @OriginalMember(owner = "client!g", name = "A", descriptor = "I")
    public static int field977 = 0;

    @OriginalMember(owner = "client!g", name = "w", descriptor = "Ltd;")
    private static class136 field973 = class145.method1172("as it was used to break our rules)3", 45);

    @OriginalMember(owner = "client!g", name = "O", descriptor = "Ltd;")
    private static class136 field991 = class145.method1172("Your account has been disabled)3", 45);

    @OriginalMember(owner = "client!g", name = "v", descriptor = "Ltd;")
    public static class136 field972 = field973;

    @OriginalMember(owner = "client!g", name = "U", descriptor = "I")
    public static int field997 = 0;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "Ltd;")
    public static class136 field979 = field991;

    @OriginalMember(owner = "client!g", name = "L", descriptor = "[J")
    public static long[] field988 = new long[100];

    @OriginalMember(owner = "client!g", name = "K", descriptor = "Ltd;")
    private static class136 field987 = class145.method1172("Connecting to update server", 45);

    @OriginalMember(owner = "client!g", name = "X", descriptor = "Ltd;")
    public static class136 field1000 = class145.method1172(" <col=ffff00>", 45);

    @OriginalMember(owner = "client!g", name = "bb", descriptor = "Ltd;")
    public static class136 field1004 = class145.method1172("60 Sekunden noch einmal)3)3)3", 45);

    @OriginalMember(owner = "client!g", name = "fb", descriptor = "Ltd;")
    public static class136 field1008 = field987;

    @OriginalMember(owner = "client!g", name = "gb", descriptor = "Ltd;")
    public static class136 field1009 = class145.method1172("Update)2Liste geladen)3", 45);

    @OriginalMember(owner = "client!g", name = "Y", descriptor = "I")
    public int field1001;

    @OriginalMember(owner = "client!g", name = "Z", descriptor = "I")
    public int field1002;

    @OriginalMember(owner = "client!g", name = "cb", descriptor = "I")
    public int field1005;

    @OriginalMember(owner = "client!g", name = "db", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!g", name = "eb", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!g", name = "x", descriptor = "I")
    public int field974;

    @OriginalMember(owner = "client!g", name = "y", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!g", name = "z", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!g", name = "B", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!g", name = "E", descriptor = "I")
    public int field981;

    @OriginalMember(owner = "client!g", name = "G", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!g", name = "I", descriptor = "I")
    public int field985;

    @OriginalMember(owner = "client!g", name = "J", descriptor = "I")
    public int field986;

    @OriginalMember(owner = "client!g", name = "M", descriptor = "I")
    public int field989;

    @OriginalMember(owner = "client!g", name = "Q", descriptor = "I")
    public int field993;

    @OriginalMember(owner = "client!g", name = "R", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!g", name = "T", descriptor = "I")
    public int field996;

    @OriginalMember(owner = "client!g", name = "H", descriptor = "Lsc;")
    public class128 field984;

    @OriginalMember(owner = "client!g", name = "P", descriptor = "Ld;")
    public static class22 field992;

    @OriginalMember(owner = "client!g", name = "D", descriptor = "Lgd;")
    public class46 field980;

    @OriginalMember(owner = "client!g", name = "S", descriptor = "Lgd;")
    public class46 field995;

    @OriginalMember(owner = "client!g", name = "ab", descriptor = "Lke;")
    public static class74 field1003;

    @OriginalMember(owner = "client!g", name = "N", descriptor = "Lnb;")
    public static class92 field990;

    @OriginalMember(owner = "client!g", name = "V", descriptor = "Lne;")
    public static class95 field998;

    @OriginalMember(owner = "client!g", name = "F", descriptor = "Ljava/lang/String;")
    public static String field982;

    @OriginalMember(owner = "client!g", name = "W", descriptor = "[I")
    public int[] field999;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lmd;ILtd;Ltd;)[Lbb;")
    public static final class10[] method348(class87 arg0, int arg1, class136 arg2, class136 arg3) {
        if (arg1 == 1674879824) {
            int var4 = arg0.method645(arg3, true);
            int var5 = arg0.method656(var4, arg2, -107);
            field1007++;
            return class118.method928(arg0, -40, var5, var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(B)V")
    public final void method349(byte arg0) {
        if (arg0 != 24) {
            field982 = null;
        }
        field1006++;
        int var2 = this.field1001;
        class128 var3 = this.field984.method1044(-12536);
        if (var3 == null) {
            this.field974 = 0;
            this.field999 = null;
            this.field1001 = -1;
            this.field1002 = 0;
            this.field996 = 0;
        } else {
            this.field996 = var3.field3034;
            this.field1001 = var3.field3063;
            this.field999 = var3.field3027;
            this.field974 = var3.field3050;
            this.field1002 = var3.field3024 * 128;
        }
        if (this.field1001 != var2 && this.field995 != null) {
            class55.field1228.method789(this.field995);
            this.field995 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(B)I")
    public static final int method350(byte arg0) {
        field983++;
        if (arg0 < 38) {
            method353(-8, -7);
        }
        return class154.field3520++;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
    public static void method351(int arg0) {
        field979 = null;
        field1009 = null;
        field982 = null;
        field1003 = null;
        field1000 = null;
        field1004 = null;
        field973 = null;
        field991 = null;
        int var1 = -119 / ((44 - arg0) / 56);
        field992 = null;
        field998 = null;
        field987 = null;
        field1008 = null;
        field972 = null;
        field988 = null;
        field990 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V")
    public static final void method352(int arg0, int arg1) {
        field994++;
        if (arg1 != 1743297272) {
            return;
        }
        for (class85 var2 = (class85) class113.field2617.method107((byte) -122); var2 != null; var2 = (class85) class113.field2617.method104(63)) {
            if ((var2.field2090 >> 48 & 0xFFFFL) == (long) arg0) {
                var2.method674(32);
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(II)Ltd;")
    public static final class136 method353(int arg0, int arg1) {
        field978++;
        return arg1 == 1674879824 ? class79.method570(0, new class136[] { class19.method140(arg0 >> 24 & 0xFF, -93), class129.field3090, class19.method140(arg0 >> 16 & 0xFF, -123), class129.field3090, class19.method140(arg0 >> 8 & 0xFF, -119), class129.field3090, class19.method140(arg0 & 0xFF, -114) }) : null;
    }
}
