import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class339 {

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "I")
    public int field4836 = 128;

    @OriginalMember(owner = "client!jba", name = "k", descriptor = "I")
    public int field4845 = 128;

    @OriginalMember(owner = "client!jba", name = "m", descriptor = "I")
    public int field4847;

    @OriginalMember(owner = "client!jba", name = "e", descriptor = "I")
    public int field4839;

    @OriginalMember(owner = "client!jba", name = "g", descriptor = "I")
    public int field4841;

    @OriginalMember(owner = "client!jba", name = "h", descriptor = "I")
    public int field4842;

    @OriginalMember(owner = "client!jba", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4848 = null;

    @OriginalMember(owner = "client!jba", name = "l", descriptor = "Ldb;")
    public static class272 field4846 = new class272(2, 4, 4, 0);

    @OriginalMember(owner = "client!jba", name = "p", descriptor = "Lkp;")
    public static class421 field4850 = new class421(1);

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "I")
    public int field4837;

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "I")
    public int field4838;

    @OriginalMember(owner = "client!jba", name = "f", descriptor = "I")
    public int field4840;

    @OriginalMember(owner = "client!jba", name = "i", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!jba", name = "j", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!jba", name = "o", descriptor = "I")
    public int field4849;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(ZB)V")
    public static final void method2184(boolean arg0, byte arg1) {
        if (arg0) {
            if (class518.field7542 != -1) {
                class200.method1271(class518.field7542, -127);
            }
            for (class563 var2 = (class563) class234.field3309.method523(-34); var2 != null; var2 = (class563) class234.field3309.method530(12714)) {
                if (!var2.method2109(11574)) {
                    var2 = (class563) class234.field3309.method523(60);
                    if (var2 == null) {
                        break;
                    }
                }
                class292.method1885(false, true, (byte) -72, var2);
            }
            class518.field7542 = -1;
            class234.field3309 = new class80(8);
            class613.method3543((byte) -23);
            class518.field7542 = class512.field7479;
            class599.method3480(-106, false);
            class410.method2598(arg1 + 58);
            class604.method3508(class518.field7542);
        }
        field4843++;
        if (arg1 != 40) {
            field4848 = null;
        }
        class111.field1363 = "";
        class498.field7259 = "";
        class242.field3435 = false;
        class193.method1173(0);
        class595.field8697 = -1;
        class279.method1822(class398.field6048, -1);
        class439.field6548 = new class655();
        class439.field6548.field1764 = class90.field1032 * 512 / 2;
        class439.field6548.field2515[0] = class90.field1032 / 2;
        class439.field6548.field1768 = class30.field349 * 512 / 2;
        class207.field2781 = 0;
        class337.field4821 = 0;
        class439.field6548.field2524[0] = class30.field349 / 2;
        if (class236.field3384 == 2) {
            class207.field2781 = class438.field6516 << 9;
            class337.field4821 = class112.field1382 << 9;
        } else {
            class59.method421(512);
        }
        class329.method2148((byte) 55);
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILjba;)V")
    public final void method2185(int arg0, class339 arg1) {
        this.field4842 = arg1.field4842;
        this.field4836 = arg1.field4836;
        if (arg0 != 2) {
            return;
        }
        this.field4845 = arg1.field4845;
        this.field4839 = arg1.field4839;
        field4835++;
        this.field4841 = arg1.field4841;
        this.field4847 = arg1.field4847;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)Ljba;")
    public final class339 method2186(byte arg0) {
        if (arg0 <= 30) {
            field4850 = null;
        }
        field4844++;
        return new class339(this.field4847, this.field4836, this.field4845, this.field4839, this.field4842, this.field4841);
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(B)V")
    public static void method2187(byte arg0) {
        field4846 = null;
        if (arg0 != -109) {
            method2184(true, (byte) -4);
        }
        field4850 = null;
        field4848 = null;
    }

    @OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(I)V")
    public class339(int arg0) {
        this.field4847 = arg0;
    }

    @OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(IIIIII)V")
    private class339(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4839 = arg3;
        this.field4841 = arg5;
        this.field4845 = arg2;
        this.field4847 = arg0;
        this.field4836 = arg1;
        this.field4842 = arg4;
    }
}
