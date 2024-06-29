import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class366 extends class371 implements class210 {

    @OriginalMember(owner = "client!ar", name = "C", descriptor = "Lip;")
    public class371 field5032;

    @OriginalMember(owner = "client!ar", name = "v", descriptor = "S")
    public static short field5025 = 32767;

    @OriginalMember(owner = "client!ar", name = "w", descriptor = "I")
    public static int field5026 = -1;

    @OriginalMember(owner = "client!ar", name = "u", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!ar", name = "x", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!ar", name = "y", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!ar", name = "z", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!ar", name = "A", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!ar", name = "B", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!ar", name = "D", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!ar", name = "E", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!ar", name = "F", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!ar", name = "G", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!ar", name = "H", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!ar", name = "I", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!ar", name = "J", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(B)Z")
    public final boolean method82(byte arg0) {
        if (arg0 < 89) {
            this.method80(-126);
        }
        field5034++;
        return false;
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(IIIIILip;)V")
    public class366(int arg0, int arg1, int arg2, int arg3, int arg4, class371 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class209.method1424(arg1, 256, arg0));
        this.field5032 = arg5;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lvc;B)V")
    public final void method85(class89 arg0, byte arg1) {
        if (arg1 == -24) {
            field5035++;
        }
    }

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "(I)I")
    public final int method803(int arg0) {
        field5037++;
        if (arg0 != -15823) {
            this.method76((byte) 119, -20, (class89) null);
        }
        return 0;
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(ZLvc;)V")
    public final void method86(boolean arg0, class89 arg1) {
        if (arg0) {
            field5026 = -21;
        }
        field5027++;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZLvc;)V")
    public final void method78(boolean arg0, class89 arg1) {
        field5039++;
        if (!arg0) {
            this.method69((class89) null, 97);
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(B)I")
    public final int method83(byte arg0) {
        if (arg0 < 70) {
            return 81;
        } else {
            field5038++;
            return 0;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILvc;II)Z")
    public final boolean method77(int arg0, class89 arg1, int arg2, int arg3) {
        field5036++;
        if (arg0 != 0) {
            this.method80(-104);
        }
        return false;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)I")
    public final int method71(byte arg0) {
        field5031++;
        return arg0 < 81 ? -120 : 0;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(BILvc;)Ln;")
    public final class468 method76(byte arg0, int arg1, class89 arg2) {
        if (arg0 != -106) {
            this.field5032 = null;
        }
        field5033++;
        return null;
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)V")
    public final void method84(int arg0) {
        field5030++;
        if (arg0 != 16805) {
            this.method78(true, (class89) null);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lvc;I)Lep;")
    public final class309 method69(class89 arg0, int arg1) {
        field5024++;
        if (arg1 != 10228) {
            field5026 = 4;
        }
        return null;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)I")
    public final int method80(int arg0) {
        if (arg0 != 10143) {
            field5026 = 98;
        }
        field5029++;
        return 0;
    }
}
