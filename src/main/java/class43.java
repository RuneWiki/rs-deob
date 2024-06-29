import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class43 {

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "Lvd;")
    private class39 field468;

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "Lvd;")
    private class39 field470;

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "Lqe;")
    public static class469 field469 = new class469(120, 3);

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "I")
    public static int field471 = 0;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "Lkv;")
    private class271 field466;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILria;)Z", line = 3)
    public static final boolean method298(int arg0, class286 arg1) {
        if (arg0 != 120) {
            method299(1);
        }
        field467++;
        return arg1 == null ? false : class81.method653((byte) 127, arg1.field4066, arg1.field4062 - arg1.field4064, -arg1.field4069 + arg1.field4060, arg1.field4069, arg1.field4071 - arg1.field4066, arg1.field4064);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V", line = 25)
    public static void method299(int arg0) {
        field469 = null;
        if (arg0 < 45) {
            field471 = -63;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)[Log;", line = 38)
    public static final class651[] method300(boolean arg0) {
        field462++;
        if (arg0) {
            field469 = null;
        }
        return new class651[] { class434.field6450, class8.field103, class509.field7246 };
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)Lkv;", line = 50)
    private final class271 method301(int arg0) {
        field464++;
        if (arg0 != 0) {
            this.field470 = null;
        }
        if (this.field466 == null) {
            this.field466 = new class271();
        }
        return this.field466;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ltb;Z)Lqd;", line = 65)
    public final class450 method302(class401 arg0, boolean arg1) {
        field465++;
        if (arg0 == null) {
            return null;
        }
        class439 var3 = arg0.method69((byte) 27);
        if (class622.field8731 == var3) {
            return new class335((class742) arg0);
        } else if (class307.field4353 == var3) {
            return new class633(this.method301(0), (class132) arg0);
        } else if (class247.field3593 == var3) {
            return new class382(this.field470, (class80) arg0);
        } else if (class575.field8145 == var3) {
            return new class454(this.field470, (class279) arg0);
        } else if (class529.field7543 == var3) {
            return new class683(this.field470, this.field468, (class107) arg0);
        } else {
            if (arg1) {
                this.method302(null, false);
            }
            if (class463.field6817 == var3) {
                return new class185(this.field470, this.field468, (class202) arg0);
            } else if (class76.field1065 == var3) {
                return new class588(this.field470, this.field468, (class478) arg0);
            } else if (class457.field6746 == var3) {
                return new class353(this.field470, this.field468, (class647) arg0);
            } else if (class189.field2867 == var3) {
                return new class222(this.field470, (class10) arg0);
            } else if (class45.field500 == var3) {
                return new class188(this.field470, this.field468, (class521) arg0);
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lvd;Lvd;)V", line = 116)
    public class43(class39 arg0, class39 arg1) {
        this.field468 = arg1;
        this.field470 = arg0;
    }
}
