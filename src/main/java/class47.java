import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class47 {

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "Lvd;")
    public static class222 field960 = class212.method1357("Freie Welt", 10731);

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field962 = 0;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "Lvd;")
    public static class222 field956 = class212.method1357("Zu viele Anmelde)2Versuche von Ihrer Adresse", 10731);

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "Lvd;")
    public static class222 field961 = class212.method1357("Einloggen", 10731);

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "Lvd;")
    private static class222 field964 = class212.method1357("Hidden", 10731);

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "Lvd;")
    public static class222 field959 = field964;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "Lvd;")
    public static class222 field966 = class212.method1357("(Y<)4col>", 10731);

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "[I")
    public static int[] field967 = new int[256];

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "Lbh;")
    public static class20 field963;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "Lva;")
    public static class219 field957;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)V")
    public static final void method341(int arg0, int arg1) {
        field965++;
        if (arg1 == -1 && !class176.field3293) {
            class43.method323((byte) -51);
        } else if (arg1 != -1 && (class192.field3537 != arg1 || !class84.method545(0)) && class25.field567 != 0 && !class176.field3293) {
            class103.method637(arg1, (byte) -97, class25.field567, 2, 0, false, class187.field3466);
        }
        class192.field3537 = arg1;
        if (arg0 > -91) {
            field961 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lab;I)V")
    public static final void method342(class3 arg0, int arg1) {
        int var2 = -64 / ((arg1 + 15) / 32);
        class102.field1898 = arg0;
        field952++;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
    public static void method343(boolean arg0) {
        field964 = null;
        field961 = null;
        field966 = null;
        field960 = null;
        field956 = null;
        if (arg0) {
            field957 = null;
            field959 = null;
            field963 = null;
            field967 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lab;III)Z")
    public static final boolean method344(class3 arg0, int arg1, int arg2, int arg3) {
        byte[] var4 = arg0.method33(-29616, arg3, arg1);
        int var5 = 123 % ((38 - arg2) / 44);
        field958++;
        if (var4 == null) {
            return false;
        } else {
            class80.method525(var4, (byte) -72);
            return true;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)V")
    public static final void method345(boolean arg0) {
        class96.field1794 = null;
        field954++;
        class210.field3896 = null;
        class37.field810 = null;
        class14.field391 = null;
        class208.field3871 = null;
        class216.field4014 = null;
        class62.field1151 = null;
        class87.field1657 = null;
        class113.field2120 = null;
        class86.field1619 = null;
        class130.field2522 = null;
        if (arg0) {
            method344(null, -103, 17, 60);
        }
    }
}
