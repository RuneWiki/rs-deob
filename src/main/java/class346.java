import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class346 extends class89 {

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public static int field4439 = 0;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "I")
    public static int field4445 = 0;

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "S")
    public static short field4449 = 1;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "Lap;")
    public static class335 field4436 = new class335("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!pi", name = "I", descriptor = "Ldq;")
    public static class493 field4451 = new class493(30, 18);

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    public int field4434;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    public int field4435;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
    public int field4437;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
    public int field4438;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!pi", name = "H", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!pi", name = "J", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "Lcq;")
    public class328 field4447;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "Ljava/lang/String;")
    public String field4440;

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "[I")
    public int[] field4444;

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "[I")
    public int[] field4448;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "[Lek;")
    public class352[] field4443;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "[Ljava/lang/String;")
    public String[] field4442;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)Ldt;")
    public static final class160 method1983(int arg0) {
        field4441++;
        if (class241.field3099 == null || class157.field1997 == null) {
            return null;
        }
        if (arg0 != 30) {
            field4452 = 83;
        }
        class157.field1997.method510((byte) -34, class241.field3099);
        class160 var1 = (class160) class157.field1997.method514(-123);
        if (var1 == null) {
            return null;
        } else {
            class36 var2 = class241.field3097.method1620(var1.field2035, 36);
            return var2 != null && var2.field458 && var2.method265(class241.field3092, arg0 - 13) ? var1 : class154.method1008((byte) 106);
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(Z)V")
    public static void method1984(boolean arg0) {
        if (arg0) {
            field4446 = -67;
        }
        field4436 = null;
        field4451 = null;
    }
}
