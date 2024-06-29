import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class68 {

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "Leg;")
    public static class37 field1072 = class174.method1167("tremblement:", -53);

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "Leg;")
    public static class37 field1080 = class174.method1167("Gestionnaire de saisie charg-B", -121);

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Leg;")
    public static class37 field1069 = class174.method1167("blinken3:", -89);

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "Leg;")
    public static class37 field1082 = class174.method1167("Chargement en cours)3)3)3", 64);

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "[J")
    public static long[] field1068 = new long[100];

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public static int field1088 = 3;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public int field1081;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public int field1083;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public int field1085;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public int field1086;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "J")
    public static long field1070;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "J")
    public long field1079;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "Ljl;")
    public static class101 field1076;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Lge;")
    public static class279 field1074;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "Lme;")
    public class67 field1075;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "Lme;")
    public class67 field1077;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "Lme;")
    public class67 field1087;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lj;B)V")
    public static final void method470(class206 arg0, byte arg1) {
        if (arg0.field3495 != null) {
            arg0.field3495.field2336 = 0;
        }
        arg0.field3494 = false;
        field1071++;
        for (class206 var2 = arg0.method411(); var2 != null; var2 = arg0.method395()) {
            method470(var2, (byte) -17);
        }
        if (arg1 != -17) {
            field1070 = -51L;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V")
    public static void method471(boolean arg0) {
        if (!arg0) {
            method472(-28, 8);
        }
        field1072 = null;
        field1068 = null;
        field1082 = null;
        field1074 = null;
        field1080 = null;
        field1069 = null;
        field1076 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)I")
    public static final int method472(int arg0, int arg1) {
        field1084++;
        return arg0 == 1338847880 ? arg1 >>> 8 : -93;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljl;BLjl;Lle;)V")
    public static final void method473(class101 arg0, byte arg1, class101 arg2, class114 arg3) {
        field1078++;
        class225.field3865 = arg2;
        if (arg1 >= -8) {
            method470((class206) null, (byte) -58);
        }
        class247.field4433 = arg0;
        class281.field4958 = arg3;
        if (class247.field4433 != null) {
            class242.field4358 = class247.field4433.method672(1, (byte) 127);
        }
        if (class225.field3865 != null) {
            class172.field2885 = class225.field3865.method672(1, (byte) 127);
        }
    }
}
