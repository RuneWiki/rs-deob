import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class95 {

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field1681 = 0;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Lvf;")
    public static class265 field1677 = class87.method582(-46, "Annuler");

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Lvf;")
    public static class265 field1682 = class87.method582(-46, "::gc");

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field1679 = 0;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "Lsb;")
    public static class92 field1680;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "[Loe;")
    public static class108[] field1678;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static void method641(int arg0) {
        field1677 = null;
        field1678 = null;
        int var1 = -104 / ((arg0 + 72) / 36);
        field1680 = null;
        field1682 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZI)Lqa;")
    public static final class110 method642(boolean arg0, int arg1) {
        field1683++;
        if (arg0) {
            field1681 = 18;
        }
        class110 var2 = (class110) class193.field3476.method1887(124, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class243.field4242.method1332(true, arg1, 4);
        class110 var4 = new class110();
        if (var3 != null) {
            var4.method727(arg1, new class135(var3), 13);
        }
        class193.field3476.method1892(var4, (long) arg1, (byte) -128);
        return var4;
    }
}
