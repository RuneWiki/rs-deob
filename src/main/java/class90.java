import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class90 {

    @OriginalMember(owner = "client!in", name = "e", descriptor = "Lpca;")
    public static class714 field1079 = new class714(5);

    @OriginalMember(owner = "client!in", name = "b", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!in", name = "f", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "Lha;")
    public static class58 field1075;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IZ)V")
    public static final void method679(int arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        field1076++;
        class238.field3180.method4016(arg0, (byte) -73);
        class347.field4909.method4016(arg0, (byte) -73);
        class297.field4177.method4016(arg0, (byte) -73);
        class167.field2290.method4016(arg0, (byte) -73);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
    public static void method680(int arg0) {
        field1075 = null;
        if (arg0 != 2) {
            method681(-46);
        }
        field1079 = null;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(I)V")
    public static final void method681(int arg0) {
        field1077++;
        if (arg0 != 10343) {
            field1075 = null;
        }
        class68 var1 = null;
        try {
            class249 var2 = class202.field2644.method2048(true, "", arg0 ^ 0xFFFFD84C);
            while (var2.field3310 == 0) {
                class756.method4205(1L, 0);
            }
            if (var2.field3310 == 1) {
                var1 = (class68) var2.field3311;
                class675 var3 = class557.field7812.method2752((byte) -78);
                var1.method567(0, var3.field9146, var3.field9154, true);
            }
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method562(124);
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BLfp;)V")
    public static final void method682(byte arg0, class323 arg1) {
        if (arg0 < 70) {
            return;
        }
        field1080++;
        class191.field2551 = 0;
        class33.field436 = 0;
        class98.field1184 = new class360();
        class110.field1327 = new class259[1024];
        class750.field10404 = new class537[class360.field5114[class530.field7471] + 1];
        class237.field3179 = 0;
        class679.field9329 = 0;
        class338.method2193(34166, arg1);
        class20.method130(arg1, (byte) 106);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V")
    public static final void method683(byte arg0) {
        class540.field7569 = new String[500];
        class570.field8090 = class455.field6428.field2039 + class455.field6428.field2047 + 2;
        class676.field9233 = class119.field1441.field2047 + class119.field1441.field2039 + 2;
        field1078++;
        if (arg0 <= 100) {
            method680(109);
        }
        for (int var1 = 0; var1 < class540.field7569.length; var1++) {
            class540.field7569[var1] = "";
        }
        class559.method3221(class71.field892.method588((byte) 119, class549.field7669), (byte) 101);
    }
}
