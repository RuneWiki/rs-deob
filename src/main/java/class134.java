import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class134 extends class665 {

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "S")
    public short field1974;

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "Lnea;")
    public static class664 field1972 = new class664(116, 4);

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "Lrca;")
    public static class418 field1976 = new class418("RC", 1);

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!ho", name = "p", descriptor = "Ljava/lang/Object;")
    public static Object field1977;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(Z)V", line = 6)
    public static void method982(boolean arg0) {
        field1977 = null;
        field1976 = null;
        if (!arg0) {
            field1972 = null;
        }
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "()V", line = 19)
    public class134() {
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(S)V", line = 21)
    public class134(short arg0) {
        this.field1974 = arg0;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIZIZ)V", line = 29)
    public static final void method983(int arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        field1973++;
        class635.field8984 = 0L;
        int var5 = class488.method2836(3);
        if (arg0 == 3 || var5 == 3) {
            arg2 = true;
        }
        if (!class282.field4228.method161()) {
            arg2 = true;
        }
        class86.method751(arg2, (byte) 50, arg1, arg3, arg0, var5);
        if (arg4) {
            method983(107, 101, false, 85, false);
        }
    }
}
