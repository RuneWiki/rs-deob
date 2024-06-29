import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public abstract class class181 {

    @OriginalMember(owner = "client!os", name = "b", descriptor = "Lbt;")
    public static class437 field2464 = new class437(6, 7);

    @OriginalMember(owner = "client!os", name = "l", descriptor = "I")
    public static int field2474 = 0;

    @OriginalMember(owner = "client!os", name = "h", descriptor = "Lrn;")
    public static class633 field2470 = new class633(29, 2);

    @OriginalMember(owner = "client!os", name = "n", descriptor = "I")
    public static int field2476 = 4;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!os", name = "f", descriptor = "I")
    public int field2468;

    @OriginalMember(owner = "client!os", name = "i", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!os", name = "j", descriptor = "I")
    public int field2472;

    @OriginalMember(owner = "client!os", name = "k", descriptor = "I")
    public int field2473;

    @OriginalMember(owner = "client!os", name = "m", descriptor = "Lqj;")
    public static class628 field2475;

    @OriginalMember(owner = "client!os", name = "g", descriptor = "Ljava/lang/Thread;")
    public static Thread field2469;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)Z")
    public final boolean method1209(int arg0) {
        field2463++;
        if (arg0 != 4) {
            field2476 = 25;
        }
        return (this.field2472 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZB)V")
    public static final void method1210(String arg0, String arg1, boolean arg2, byte arg3) {
        class506.field6471 = arg1;
        class614.field7750 = arg0;
        if (arg3 != 37) {
            method1213(95);
        }
        field2471++;
        class461.field6003 = arg2;
        if (!class461.field6003 && class506.field6471.equals("") || class614.field7750.equals("")) {
            class620.method3316(false, 3);
            return;
        }
        class711.field9392 = false;
        if (class1.field6 != 1) {
            class135.field1792 = -1;
            class553.field7021 = 0;
        }
        class620.method3316(false, -3);
        class592.field7507 = 0;
        class203.field2816 = 1;
        class351.field4288 = 0;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)Z")
    public final boolean method1211(byte arg0) {
        if (arg0 < 37) {
            this.method1212((byte) 123);
        }
        field2467++;
        return (this.field2472 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(B)Z")
    public final boolean method1212(byte arg0) {
        if (arg0 >= -5) {
            field2476 = -74;
        }
        field2465++;
        return (this.field2472 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(I)V")
    public static void method1213(int arg0) {
        if (arg0 != 0) {
            field2469 = null;
        }
        field2475 = null;
        field2469 = null;
        field2470 = null;
        field2464 = null;
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(I)Z")
    public final boolean method1214(int arg0) {
        if (arg0 != 18979) {
            this.method1214(-4);
        }
        field2466++;
        return (this.field2472 & 0x2) != 0;
    }
}
