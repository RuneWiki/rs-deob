import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class335 extends class295 {

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "Ljava/lang/Object;")
    private Object field4612;

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "Lic;")
    public static class417 field4613;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILnq;)V")
    public static final void method2146(int arg0, class268 arg1) {
        field4610++;
        class403.field5721 = arg1.method1751(37, "p11_full");
        class157.field2215 = arg1.method1751(74, "p12_full");
        class403.field5717 = arg1.method1751(105, "b12_full");
        class223.field3119 = arg1.method1751(74, "hitmarks");
        class224.field3175 = arg1.method1751(27, "hitbar_default");
        if (arg0 >= -48) {
            field4614 = 23;
        }
        class99.field1375 = arg1.method1751(89, "timerbar_default");
        class205.field2823 = arg1.method1751(91, "headicons_pk");
        class9.field173 = arg1.method1751(119, "headicons_prayer");
        class436.field6142 = arg1.method1751(121, "hint_headicons");
        class159.field2227 = arg1.method1751(32, "hint_mapmarkers");
        class377.field5397 = arg1.method1751(99, "mapflag");
        class214.field2986 = arg1.method1751(97, "cross");
        class273.field3783 = arg1.method1751(85, "mapdots");
        class70.field1023 = arg1.method1751(96, "scrollbar");
        class328.field4546 = arg1.method1751(76, "name_icons");
        class18.field324 = arg1.method1751(92, "floorshadows");
        class416.field5914 = arg1.method1751(67, "compass");
        class292.field4081 = arg1.method1751(109, "hint_mapedge");
    }

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "(I)Z")
    public final boolean method1209(int arg0) {
        field4611++;
        return arg0 != -7;
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1208(int arg0) {
        if (arg0 < 98) {
            method2147(53, 12);
        }
        field4607++;
        return this.field4612;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)I")
    public static final int method2147(int arg0, int arg1) {
        field4608++;
        return arg1 > -123 ? -89 : arg0 >>> 7;
    }

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "(I)V")
    public static void method2148(int arg0) {
        if (arg0 > -8) {
            field4609 = 1;
        }
        field4613 = null;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class335(Object arg0) {
        this.field4612 = arg0;
    }

    static {
        new class442("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
    }
}
