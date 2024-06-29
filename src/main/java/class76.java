import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class76 {

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    private int field1070;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "Laa;")
    public static class76 field1077;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "[Ll;")
    public static class127[] field1074;

    @OriginalMember(owner = "client!aa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1072++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static void method557(int arg0) {
        field1077 = null;
        if (arg0 != 3) {
            method557(71);
        }
        field1074 = null;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)[Lpe;")
    public static final class123[] method558(int arg0) {
        if (arg0 == 3) {
            field1073++;
            return new class123[] { class445.field6549, class445.field6550, class445.field6551, class445.field6552, class445.field6553, class445.field6554, class445.field6555, class445.field6556, class445.field6557, class445.field6558, class445.field6559, class445.field6560 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)V")
    public static final void method559(int arg0) {
        field1071++;
        class56.field773.method2293(false);
        if (arg0 != 31260) {
            method558(33);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)I")
    public final int method560(byte arg0) {
        if (arg0 < 46) {
            return 45;
        } else {
            field1075++;
            return this.field1070;
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(II)V")
    public class76(int arg0, int arg1) {
        this.field1070 = arg0;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)I")
    public static final int method561(int arg0, int arg1) {
        if (arg1 != 21012) {
            method559(125);
        }
        field1076++;
        return arg0 >>> 8;
    }

    static {
        new class347("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
        field1077 = new class76(46, 3);
    }
}
