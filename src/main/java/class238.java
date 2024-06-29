import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public abstract class class238 extends class102 {

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "Z")
    public boolean field3424 = false;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "Z")
    public boolean field3427 = false;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
    public int field3426;

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "S")
    public short field3428;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
    public int field3429;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    public int field3425;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "Lh;")
    public static class572 field3430 = new class572("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "Llu;")
    public static class610 field3432 = new class610(35, -1);

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "I")
    public static int field3433 = 1;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)Z", line = 8)
    public static final boolean method1520(int arg0, int arg1) {
        if (arg1 > -32) {
            field3432 = null;
        }
        field3422++;
        return arg0 >= 12 && arg0 <= 17;
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(IIIIZZ)V", line = 52)
    public class238(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        this.field3426 = arg0;
        this.field3427 = arg5;
        this.field3424 = arg4;
        this.field3428 = (short) arg3;
        this.field3429 = arg2;
        this.field3425 = arg1;
    }

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "(I)V", line = 22)
    public static void method1521(int arg0) {
        field3430 = null;
        field3432 = null;
        if (arg0 <= 15) {
            method1523(-114);
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)Z", line = 36)
    public static final boolean method1522(int arg0, int arg1) {
        field3431++;
        if (arg0 >= -73) {
            method1522(-34, -24);
        }
        return arg1 == 9 || arg1 == 10 || arg1 == 11;
    }

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "(I)V", line = 65)
    public static final void method1523(int arg0) {
        field3423++;
        int var1 = (int) ((double) class146.field2125 * 34.46D);
        int var2 = var1 << 0;
        if (class99.field1445.method486()) {
            var2 += 128;
        }
        class99.field1445.method451(arg0, var2);
    }
}
