import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class281 extends class406 {

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
    public int field3981;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
    public int field3976;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "Lse;")
    public static class138 field3978 = new class138(64);

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "Liq;")
    public static class362 field3984 = new class362("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "Lva;")
    public static class288 field3985 = new class288(128);

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "Lwq;")
    public static class92 field3986 = new class92();

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "Ltq;")
    public static class376 field3980;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZ)Z")
    public final boolean method1854(int arg0, boolean arg1) {
        if (arg1) {
            field3984 = null;
        }
        field3974++;
        return (this.field3981 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)Z")
    public final boolean method1855(int arg0) {
        if (arg0 >= -26) {
            this.field3976 = 98;
        }
        field3979++;
        return (this.field3981 & 0x26CAA3) >> 21 != 0;
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)Z")
    public final boolean method1856(int arg0) {
        if (arg0 < 94) {
            this.field3981 = -73;
        }
        field3982++;
        return (this.field3981 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)Z")
    public final boolean method1857(byte arg0) {
        if (arg0 > -55) {
            return true;
        } else {
            field3983++;
            return (this.field3981 & 0x6FD4A5) >> 22 != 0;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lon;II)Ljava/lang/String;")
    public static final String method1858(class184 arg0, int arg1, int arg2) {
        if (arg1 != -17459) {
            return null;
        }
        field3977++;
        if (!client.method1121(arg0).method1854(arg2, false) && arg0.field2589 == null) {
            return null;
        } else if (arg0.field2622 == null || arg0.field2622.length <= arg2 || arg0.field2622[arg2] == null || arg0.field2622[arg2].trim().length() == 0) {
            return class367.field5204 ? "Hidden-" + arg2 : null;
        } else {
            return arg0.field2622[arg2];
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)V")
    public static final void method1859(int arg0, byte arg1) {
        class237 var2 = class135.field1670;
        synchronized (class135.field1670) {
            class135.field1670.method1629(arg0, 75);
            int var3 = -127 / ((arg1 - 49) / 42);
        }
        field3972++;
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)I")
    public final int method1860(int arg0) {
        if (arg0 != -1) {
            field3984 = null;
        }
        field3973++;
        return class313.method2067(arg0 - 95, this.field3981);
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)I")
    public final int method1861(int arg0) {
        if (arg0 == -6813) {
            field3975++;
            return this.field3981 >> 18 & 0x7;
        } else {
            return 78;
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(II)V")
    public class281(int arg0, int arg1) {
        this.field3981 = arg0;
        this.field3976 = arg1;
    }

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "(I)V")
    public static void method1862(int arg0) {
        field3985 = null;
        field3978 = null;
        field3980 = null;
        field3986 = null;
        if (arg0 != 1023) {
            field3986 = null;
        }
        field3984 = null;
    }

    static {
        new class362("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
    }
}
