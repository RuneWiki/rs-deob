import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class490 extends class251 {

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "Lmq;")
    public class336 field7453;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public static int field7451 = 0;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "Loe;")
    public static class127 field7450 = new class127(95, 6);

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
    public static int field7454;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "Lvl;")
    public static class11 field7452;

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "Ltj;")
    public static class125 field7455;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "(I)V")
    public static void method2948(int arg0) {
        field7452 = null;
        field7455 = null;
        field7450 = null;
        if (arg0 < 7) {
            field7451 = 123;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)Lwt;")
    public static final class195 method2949(int arg0, int arg1) {
        if (arg1 != 22635) {
            return null;
        }
        field7454++;
        class195 var2 = (class195) class167.field2590.method1666(-126, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class375.field5474.method2715(0, arg0, false);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class195 var4 = class246.method1489(var3, (byte) 65);
            class167.field2590.method1668((byte) 123, (long) arg0, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lmq;)V")
    public class490(class336 arg0) {
        this.field7453 = arg0;
    }
}
