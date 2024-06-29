import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class14 {

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "Lsea;")
    private class648 field140;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "Lsea;")
    private class648 field148;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "Lem;")
    public static class206 field143 = new class206(65, 28);

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "Z")
    public static boolean field147 = false;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "Llga;")
    public static class663 field146 = new class663(64);

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
    public static int field152 = -1;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "F")
    public static float field150;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "Lmaa;")
    private class435 field145;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)Lmaa;", line = 5)
    private final class435 method68(int arg0) {
        if (this.field145 == null) {
            this.field145 = new class435();
        }
        if (arg0 <= 84) {
            this.method69(null, 115);
        }
        field139++;
        return this.field145;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lcea;I)Lco;", line = 21)
    public final class104 method69(class196 arg0, int arg1) {
        field144++;
        if (arg0 == null) {
            return null;
        }
        class370 var3 = arg0.method640(58);
        if (class417.field5884 == var3) {
            return new class556((class358) arg0);
        } else if (class364.field4801 == var3) {
            return new class138(this.method68(arg1 - 1953), (class452) arg0);
        } else if (class444.field6144 == var3) {
            return new class88(this.field140, (class282) arg0);
        } else if (class129.field1846 == var3) {
            return new class425(this.field140, (class687) arg0);
        } else if (arg1 != 2048) {
            return null;
        } else if (class543.field7377 == var3) {
            return new class86(this.field140, this.field148, (class85) arg0);
        } else if (class373.field5025 == var3) {
            return new class187(this.field140, this.field148, (class396) arg0);
        } else if (class643.field8874 == var3) {
            return new class57(this.field140, this.field148, (class566) arg0);
        } else if (class198.field2803 == var3) {
            return new class655(this.field140, this.field148, (class224) arg0);
        } else if (client.field3715 == var3) {
            return new class327(this.field140, (class213) arg0);
        } else if (class659.field9161 == var3) {
            return new class267(this.field140, this.field148, (class167) arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)Z", line = 75)
    public static final boolean method70(int arg0, int arg1, int arg2) {
        if (arg1 != 28) {
            method71(106);
        }
        field141++;
        return class671.method3790(arg1 - 29, arg2, arg0) & class289.method1779(false, arg2, arg0);
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)V", line = 93)
    public static void method71(int arg0) {
        field143 = null;
        field146 = null;
        if (arg0 != -16104) {
            field151 = 101;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(BII)Z", line = 106)
    public static final boolean method72(byte arg0, int arg1, int arg2) {
        field142++;
        if (arg0 != -57) {
            method70(-98, 95, -76);
        }
        return (arg1 & 0x800) != 0 && (arg2 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lsea;Lsea;)V", line = 120)
    public class14(class648 arg0, class648 arg1) {
        this.field140 = arg0;
        this.field148 = arg1;
    }
}
