import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public abstract class class43 {

    @OriginalMember(owner = "client!di", name = "f", descriptor = "Z")
    public static boolean field951 = false;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "[Lf;")
    public static class56[] field950 = new class56[2048];

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field952 = 0;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "Lkh;")
    public static class117 field948 = class224.method1450((byte) 124, "details)3dat");

    @OriginalMember(owner = "client!di", name = "d", descriptor = "Lkh;")
    public static class117 field949 = class224.method1450((byte) 113, ":clan:");

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "J")
    public static long field946;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)I")
    public abstract int method360(byte arg0);

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)Llb;")
    public static final class122 method361(int arg0, int arg1) {
        field947++;
        class122 var2 = (class122) class175.field3162.method506(1, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        class122 var3 = class122.method854(false, class143.field2581, class1.field16, arg1, 16766395);
        if (var3 != null) {
            class175.field3162.method497((long) arg1, var3, -103);
        }
        if (arg0 >= -71) {
            method364(false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method362(Component arg0, int arg1);

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(B)V")
    public static void method363(byte arg0) {
        field948 = null;
        if (arg0 >= -60) {
            method363((byte) -23);
        }
        field950 = null;
        field949 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)V")
    public static final void method364(boolean arg0) {
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        System.exit(1);
        if (arg0) {
            field954++;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public abstract void method365(boolean arg0, Component arg1);

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public static final void method366(int arg0) {
        field955++;
        if (class167.field3021 && class228.field4104 != class203.field3675) {
            class77.method543(class93.field1712.field4266[0], 117, class38.field880, class93.field1712.field4259[0], class150.field2733, class203.field3675);
            return;
        }
        if (class203.field3675 != class202.field3658) {
            class202.field3658 = class203.field3675;
            class112.method756(class203.field3675, -35);
        }
        if (arg0 >= -12) {
            field949 = null;
        }
    }
}
