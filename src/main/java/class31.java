import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class31 {

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "Ltj;")
    public static class31 field436 = new class31();

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "Ltj;")
    public static class31 field440 = new class31();

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "Ltj;")
    public static class31 field441 = new class31();

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "Ltj;")
    public static class31 field442 = new class31();

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "Lkp;")
    public static class507 field443 = null;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "Lrca;")
    public static class34 field444 = new class34();

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method209(int arg0, int arg1, int arg2) {
        field437++;
        if (arg1 != 55) {
            method211(-21);
        }
        return (arg2 & 0x800) != 0 && (arg0 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V", line = 18)
    public static void method210(int arg0) {
        field443 = null;
        field444 = null;
        field440 = null;
        field436 = null;
        field441 = null;
        if (arg0 != -1743) {
            field442 = null;
        }
        field442 = null;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)Lvb;", line = 40)
    public static final class316 method211(int arg0) {
        field439++;
        if (class656.field9247 == null || class351.field4488 == null) {
            return null;
        }
        class351.field4488.method2632((byte) -104, class656.field9247);
        if (arg0 != 2048) {
            method210(66);
        }
        class316 var1 = (class316) class351.field4488.method2635(arg0 ^ 0x85F);
        if (var1 == null) {
            return null;
        } else {
            class647 var2 = class656.field9234.method3771(var1.field4057, arg0 ^ 0x83E);
            return var2 != null && var2.field9097 && var2.method3617(class656.field9241, false) ? var1 : class491.method2646(-126);
        }
    }

    @OriginalMember(owner = "client!tj", name = "toString", descriptor = "()Ljava/lang/String;", line = 72)
    public final String toString() {
        field438++;
        throw new IllegalStateException();
    }
}
