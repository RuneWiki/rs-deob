import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class75 {

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "Leg;")
    public static class37 field1174 = class174.method1167("(U0a )2 via: ", 122);

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "Leg;")
    public static class37 field1173 = class174.method1167("Choisir une option", -65);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "Ljl;")
    public static class101 field1172;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)Lja;")
    public static final class105 method498(byte arg0) {
        field1175++;
        if (arg0 >= -19) {
            method502((byte) 96);
        }
        byte[] var1 = class170.field2848[0];
        int var2 = class224.field3852[0] * class125.field2101[0];
        int[] var3 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = class262.field4617[class96.method626(var1[var4], 255)];
        }
        class195 var5 = new class195(class257.field4567, class126.field2118, class249.field4476[0], class158.field2636[0], class224.field3852[0], class125.field2101[0], var3);
        class5.method33(24094);
        return var5;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)Z")
    public static final boolean method499(byte arg0) {
        field1178++;
        try {
            if (class120.field2029 == 2) {
                if (class244.field4397 == null) {
                    class244.field4397 = class65.method453(class269.field4697, class47.field737, class56.field874);
                    if (class244.field4397 == null) {
                        return false;
                    }
                }
                if (class33.field478 == null) {
                    class33.field478 = new class32(class234.field4045, class55.field843);
                }
                if (class73.field1158.method736(class98.field1527, class33.field478, 22050, class244.field4397, -1)) {
                    class73.field1158.method751((byte) 72);
                    class73.field1158.method754(-5758, class156.field2607);
                    class73.field1158.method729(class116.field1979, class244.field4397, 0);
                    class269.field4697 = null;
                    class120.field2029 = 0;
                    class33.field478 = null;
                    class244.field4397 = null;
                    return true;
                }
            }
            if (arg0 != -27) {
                method501(false);
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class73.field1158.method755(false);
            class120.field2029 = 0;
            class244.field4397 = null;
            class33.field478 = null;
            class269.field4697 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
    public static final void method500(int arg0) {
        class238.field4233.method1403(45);
        if (arg0 != 7362) {
            field1172 = null;
        }
        field1170++;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)V")
    public static void method501(boolean arg0) {
        field1174 = null;
        field1173 = null;
        field1172 = null;
        if (!arg0) {
            field1174 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(B)I")
    public static final int method502(byte arg0) {
        field1177++;
        int var1 = 61 % ((47 - arg0) / 35);
        return ((class156.field2602 == 0 ? 0 : 1) << 20) + ((class78.field1217 ? 1 : 0) << 16) + ((class120.field2034 ? 1 : 0) << 13) + ((class232.field4013 ? 1 : 0) << 10) + ((class40.field646 ? 1 : 0) << 9) + ((class124.field2083 ? 1 : 0) << 8) + ((client.field1895 ? 1 : 0) << 7) + ((class31.field461 ? 1 : 0) << 6) + ((class198.field3366 ? 1 : 0) << 4) + (class68.field1088 & 0x7) - (-((class154.field2600 ? 1 : 0) << 3) + -((class271.field4754 ? 1 : 0) << 5) - (((class23.field300 & 0x3) << 11) - -((class36.field517 ? 1 : 0) << 15) + ((class144.field2467 ? 1 : 0) << 19))) - (-((class252.field4507 == 0 ? 0 : 1) << 21) + -((class151.field2544 == 0 ? 0 : 1) << 22) - (class193.method1339() << 23));
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)V")
    public static final void method503(int arg0, int arg1) {
        field1176++;
        for (class62 var2 = class179.field2984.method993(-15322); var2 != null; var2 = class179.field2984.method988(4586)) {
            if ((var2.field1027 >> 48 & 0xFFFFL) == ((long) arg1)) {
                var2.method441(16773377);
            }
        }
        if (arg0 >= -32) {
            method503(90, -88);
        }
    }
}
