import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class201 extends class182 {

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "I")
    public static int field3645 = 0;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "Lkh;")
    public static class117 field3653 = class224.method1450((byte) -86, "Untersuchen");

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "Lkh;")
    public static class117 field3652 = class224.method1450((byte) -30, "<)4col>");

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!sd", name = "L", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!sd", name = "M", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!sd", name = "P", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "Lff;")
    private class62 field3646;

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field3648;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
    public static final void method1337(int arg0) {
        class100.field1825 = 0;
        class30.field722 = 0;
        class61.field1233 = 0;
        class195.field3487 = -1;
        class8.field131 = -1;
        class105.field1911.field2643 = 0;
        field3650++;
        class18.field511.field2643 = 0;
        field3645 = 0;
        class10.field357 = 0;
        class44.field964 = arg0;
        class56.field1161 = -1;
        class182.field3289 = false;
        class181.field3277 = -1;
        for (int var1 = 0; var1 < class43.field950.length; var1++) {
            if (class43.field950[var1] != null) {
                class43.field950[var1].field4280 = -1;
            }
        }
        for (int var2 = 0; var2 < class1.field18.length; var2++) {
            if (class1.field18[var2] != null) {
                class1.field18[var2].field4280 = -1;
            }
        }
        class98.method666(-36);
        class94.method647(30, (byte) 83);
        for (int var3 = 0; var3 < 100; var3++) {
            class173.field3126[var3] = true;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BZLah;)V")
    public static final void method1338(byte arg0, boolean arg1, class9 arg2) {
        field3642++;
        int var3 = arg2.field170 == 0 ? arg2.field256 : arg2.field170;
        if (arg0 != -87) {
            method1345(null, (byte) -31);
        }
        int var4 = arg2.field294 == 0 ? arg2.field207 : arg2.field294;
        class117.method806(arg2.field218, arg1, true, class90.field1675[arg2.field218 >> 16], var3, var4);
        if (arg2.field157 != null) {
            class117.method806(arg2.field218, arg1, true, arg2.field157, var3, var4);
        }
        class73 var5 = (class73) class11.field371.method460((long) arg2.field218, arg0 ^ 0xFFFFFFA8);
        if (var5 != null) {
            class6.method45(arg1, (byte) -128, var3, var5.field1397, var4);
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V")
    public static void method1339(int arg0) {
        field3653 = null;
        field3648 = null;
        if (arg0 == -1) {
            field3652 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lnc;Z)V")
    public final void method1340(class145 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method998(89);
            if (var3 == 0) {
                field3643++;
                if (arg1) {
                    this.method1342(-119, -107, null);
                    return;
                }
                return;
            }
            this.method1343(arg0, var3, (byte) -87);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)I")
    public final int method1341(int arg0, int arg1, int arg2) {
        field3654++;
        if (this.field3646 == null) {
            return arg2;
        }
        class123 var4 = (class123) this.field3646.method460((long) arg0, 1);
        if (var4 == null) {
            return arg2;
        } else {
            int var5 = 112 / ((-arg1 - 4) / 56);
            return var4.field2304;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILkh;)Lkh;")
    public final class117 method1342(int arg0, int arg1, class117 arg2) {
        field3641++;
        if (arg1 < 61) {
            method1344(null, -79);
        }
        if (this.field3646 == null) {
            return arg2;
        } else {
            class33 var4 = (class33) this.field3646.method460((long) arg0, 1);
            return var4 == null ? arg2 : var4.field768;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lnc;IB)V")
    private final void method1343(class145 arg0, int arg1, byte arg2) {
        if (arg2 != -87) {
            field3645 = 111;
        }
        if (arg1 == 249) {
            int var4 = arg0.method998(arg2 + 186);
            if (this.field3646 == null) {
                int var5 = class68.method479(var4, 90);
                this.field3646 = new class62(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method998(121) == 1;
                int var8 = arg0.method1023(arg2 ^ 0xF4CA1);
                class12 var9;
                if (var7) {
                    var9 = new class33(arg0.method1038(92));
                } else {
                    var9 = new class123(arg0.method1018(-1068451600));
                }
                this.field3646.method461((long) var8, (byte) -105, var9);
            }
        }
        field3651++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lai;I)V")
    public static final void method1344(class10 arg0, int arg1) {
        field3649++;
        if (arg1 == -10966) {
            class99.field1815 = arg0;
            class55.field1124 = class99.field1815.method108(4, 0);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lah;B)V")
    public static final void method1345(class9 arg0, byte arg1) {
        field3647++;
        int var2 = 105 % ((10 - arg1) / 58);
        class9 var3 = class147.method1059(-126, arg0);
        int var4;
        int var5;
        if (var3 == null) {
            var4 = class97.field1793;
            var5 = class124.field2324;
        } else {
            var4 = var3.field256;
            var5 = var3.field207;
        }
        class44.method369(arg0, var5, 33, var4);
    }
}
