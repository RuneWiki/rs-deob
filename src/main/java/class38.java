import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class38 extends class118 {

    @OriginalMember(owner = "client!fb", name = "N", descriptor = "I")
    public int field1021 = 0;

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "Lfc;")
    public static class39 field1020 = class90.method774("title_mute", -100);

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "Lfc;")
    private static class39 field1027 = class90.method774("Prepared visibility map", -124);

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "Lfc;")
    public static class39 field1022 = field1027;

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "Z")
    public static boolean field1026 = false;

    @OriginalMember(owner = "client!fb", name = "X", descriptor = "I")
    public static int field1031 = 0;

    @OriginalMember(owner = "client!fb", name = "bb", descriptor = "Lfc;")
    public static class39 field1035 = class90.method774("Versteckt", -108);

    @OriginalMember(owner = "client!fb", name = "cb", descriptor = "I")
    public static int field1036 = 1;

    @OriginalMember(owner = "client!fb", name = "ab", descriptor = "Lfc;")
    private static class39 field1034 = class90.method774(" ", -88);

    @OriginalMember(owner = "client!fb", name = "W", descriptor = "Lfc;")
    public static class39 field1030 = field1034;

    @OriginalMember(owner = "client!fb", name = "db", descriptor = "I")
    public static int field1037 = 0;

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "I")
    public static int field1025 = 0;

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!fb", name = "V", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!fb", name = "Z", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!fb", name = "eb", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!fb", name = "fb", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!fb", name = "gb", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!fb", name = "Y", descriptor = "Loc;")
    public static class100 field1032;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILoc;Loc;)I", line = 3)
    public static final int method426(int arg0, class100 arg1, class100 arg2) {
        field1023++;
        int var3 = 0;
        if (arg0 != 13859) {
            return 113;
        }
        if (arg1.method843(class16.field478, class93.field2175, -20)) {
            var3++;
        }
        if (arg2.method843(class72.field1694, class93.field2175, -20)) {
            var3++;
        }
        if (arg2.method843(class116.field3064, class93.field2175, arg0 - 13879)) {
            var3++;
        }
        if (arg2.method843(class111.field2924, class93.field2175, arg0 ^ 0xFFFFC9CF)) {
            var3++;
        }
        if (arg2.method843(class58.field1436, class93.field2175, -20)) {
            var3++;
        }
        if (arg2.method843(field1020, class93.field2175, -20)) {
            var3++;
        }
        arg2.method843(class89.field2094, class93.field2175, -20);
        arg2.method843(class3.field95, class93.field2175, -20);
        arg2.method843(class72.field1682, class93.field2175, -20);
        arg2.method843(class45.field1228, class93.field2175, -20);
        arg2.method843(class27.field781, class93.field2175, -20);
        return var3;
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)I", line = 48)
    public static final int method427(int arg0) {
        field1024++;
        int var1 = class153.method1225(128, class78.field1778, class24.field661, class87.field2022);
        if (arg0 == -1146) {
            return var1 - class104.field2631 >= 800 || (class137.field3424[class24.field661][class87.field2022 >> 7][class78.field1778 >> 7] & 0x4) == 0 ? 3 : class24.field661;
        } else {
            return 99;
        }
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)V", line = 71)
    public static void method428(int arg0) {
        field1035 = null;
        field1030 = null;
        field1020 = null;
        field1022 = null;
        field1032 = null;
        if (arg0 != 29190) {
            field1034 = null;
        }
        field1034 = null;
        field1027 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)Z", line = 92)
    public static final boolean method429(int arg0, int arg1) {
        if (arg1 != 0) {
            field1030 = null;
        }
        field1039++;
        return (arg0 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)Lqe;", line = 128)
    public static final class116 method430(int arg0, int arg1) {
        class116 var2 = (class116) class115.field3008.method931(false, (long) arg1);
        field1040++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = client.field553.method839(5, 12, arg1);
        class116 var4 = new class116();
        if (arg0 != 2238) {
            return null;
        }
        if (var3 != null) {
            var4.method1013(new class25(var3), (byte) 98);
        }
        var4.method1004((byte) 126);
        class115.field3008.method934(0, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZLoc;I)Z", line = 159)
    public static final boolean method431(boolean arg0, class100 arg1, int arg2) {
        field1033++;
        byte[] var3 = arg1.method850(true, arg2);
        if (var3 == null) {
            return false;
        }
        if (arg0) {
            method427(-80);
        }
        class6.method88(var3, 87);
        return true;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZLdc;)V", line = 194)
    public final void method432(boolean arg0, class25 arg1) {
        field1028++;
        if (arg0) {
            method428(51);
        }
        while (true) {
            int var3 = arg1.method322((byte) -50);
            if (var3 == 0) {
                return;
            }
            this.method433(-6, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IILdc;)V", line = 222)
    private final void method433(int arg0, int arg1, class25 arg2) {
        if (~arg1 == arg0) {
            this.field1021 = arg2.method301(arg0 - 4847);
        }
        field1029++;
    }
}
