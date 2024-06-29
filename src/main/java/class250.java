import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class250 {

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    private int field3187;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field3189 = 0;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "Lpi;")
    public static class340 field3192;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)I")
    public final int method1564(byte arg0) {
        if (arg0 < 17) {
            return -47;
        } else {
            field3190++;
            return this.field3187;
        }
    }

    @OriginalMember(owner = "client!hb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3191++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
    public static void method1565(byte arg0) {
        field3192 = null;
        if (arg0 != -3) {
            field3189 = 76;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)Z")
    public static final boolean method1566(int arg0, int arg1, int arg2) {
        field3188++;
        if (arg2 != -1) {
            method1565((byte) -44);
        }
        return (arg1 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static final void method1567(int arg0) {
        class103.field1419++;
        field3186++;
        class420.method2472((byte) -101, class270.field3425);
        class319.field4112.method565(114, class144.method1008((byte) 109));
        class319.field4112.method609(class23.field419, arg0 - 86);
        class319.field4112.method609(class92.field1281, -110);
        class319.field4112.method565(arg0 + 95, class421.field5647.field7728);
        if (arg0 != 6) {
            method1567(-4);
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(II)V")
    public class250(int arg0, int arg1) {
        this.field3187 = arg0;
    }

    static {
        new class169("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
        field3192 = new class340(80, 6);
    }
}
