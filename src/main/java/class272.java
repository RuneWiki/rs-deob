import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class272 {

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "Leg;")
    public static class37 field4770 = class174.method1167(")4p=", 113);

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field4772 = 0;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "Leg;")
    public static class37 field4769 = class174.method1167("Vous ne pouvez pas ajouter votre nom -9 votre liste noire)3", 63);

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4774;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public static void method1822(int arg0) {
        field4769 = null;
        if (arg0 != 0) {
            method1824((byte) -7);
        }
        field4774 = null;
        field4770 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IZLpe;)V")
    public static final void method1823(int arg0, boolean arg1, class237 arg2) {
        int var3 = arg2.field4132 == 0 ? arg2.field4067 : arg2.field4132;
        field4771++;
        int var4 = arg2.field4090 == 0 ? arg2.field4206 : arg2.field4090;
        class254.method1737(arg2.field4211, arg1, -5260, class232.field4000[arg2.field4211 >> 16], var3, var4);
        if (arg2.field4194 != null) {
            class254.method1737(arg2.field4211, arg1, -5260, arg2.field4194, var3, var4);
        }
        class190 var5 = (class190) class120.field2022.method992((byte) 125, (long) arg2.field4211);
        if (var5 != null) {
            class81.method549(var3, var4, var5.field3259, -1, arg1);
        }
        if (arg0 < 6) {
            field4772 = -120;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
    public static final void method1824(byte arg0) {
        int var1 = -107 / ((-arg0 - 43) / 52);
        field4768++;
        for (int var2 = 0; var2 < 5; var2++) {
            class69.field1102[var2] = false;
        }
        class213.field3682 = -1;
        class273.field4794 = 1;
        class100.field1548 = -1;
    }
}
