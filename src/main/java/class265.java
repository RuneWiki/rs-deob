import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class265 extends class241 {

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "Loh;")
    public class263 field4630;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "Loh;")
    public static class263 field4631 = class253.method1681(-120, "Ablegen");

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "Z")
    public static boolean field4633 = false;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    public static int field4632 = 127;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "Z")
    public static boolean field4635 = false;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "Loh;")
    public static class263 field4634 = class253.method1681(-123, "::gc");

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "Loh;")
    public static class263 field4636 = class253.method1681(-127, "Konfig geladen)3");

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "Loh;")
    public static class263 field4637 = class253.method1681(-124, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)V")
    public static final void method1793(int arg0) {
        class47.field1009 = arg0;
        for (int var1 = 0; var1 < class254.field4425; var1++) {
            for (int var2 = 0; var2 < class85.field1678; var2++) {
                if (class18.field417[arg0][var1][var2] == null) {
                    class18.field417[arg0][var1][var2] = new class2(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(I)V")
    public static void method1794(int arg0) {
        field4631 = null;
        field4637 = null;
        field4636 = null;
        if (arg0 != 127) {
            method1795(119, 7, -87, 56, -65);
        }
        field4634 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIII)V")
    public static final void method1795(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4629++;
        if (arg3 != 0) {
            field4637 = null;
        }
        class198.field3587 = arg4;
        class276.field4831 = arg1;
        class51.field1099 = arg0;
        class11.field249 = arg2;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
    public class265() {
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)V")
    public static final void method1796(int arg0, int arg1) {
        if (class177.field3242 == 0) {
            class63.field1275.method1166(true, arg0);
        } else {
            class139.field2561 = arg0;
        }
        field4638++;
        if (arg1 != 127) {
            method1794(60);
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Loh;I)V")
    public class265(class263 arg0, int arg1) {
        this.field4630 = arg0;
    }
}
