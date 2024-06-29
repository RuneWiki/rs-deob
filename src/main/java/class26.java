import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class26 extends class134 {

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field439 = 0;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    public static int field441 = 0;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "[I")
    public static int[] field445 = new int[128];

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
    public static int field447 = 0;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "Ljava/lang/String;")
    public static String field446 = "Loading fonts - ";

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "[I")
    public static int[] field455 = new int[2048];

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    public int field442;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "I")
    public int field444;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
    public int field448;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "I")
    public int field449;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "I")
    public int field456;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "Lcc;")
    public class222 field443;

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "Lcc;")
    public class222 field453;

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "Ljava/lang/String;")
    public String field451;

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "Z")
    public boolean field452;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "[Ljava/lang/Object;")
    public Object[] field450;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZB)V")
    public static final void method218(boolean arg0, byte arg1) {
        field454++;
        class116.method851(arg0, class163.field2449, class298.field4803, class179.field2816, (byte) -72);
        if (arg1 >= -23) {
            method218(false, (byte) -96);
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V")
    public static void method219(int arg0) {
        field445 = null;
        field455 = null;
        if (arg0 != 2048) {
            field439 = -92;
        }
        field446 = null;
    }
}
