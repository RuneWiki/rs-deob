import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class281 extends class421 implements class210 {

    @OriginalMember(owner = "client!wp", name = "v", descriptor = "La;")
    public class421 field4037;

    @OriginalMember(owner = "client!wp", name = "x", descriptor = "Z")
    public static boolean field4039 = false;

    @OriginalMember(owner = "client!wp", name = "o", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!wp", name = "p", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!wp", name = "q", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!wp", name = "r", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!wp", name = "s", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!wp", name = "t", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!wp", name = "u", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!wp", name = "w", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!wp", name = "y", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!wp", name = "z", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!wp", name = "A", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!wp", name = "B", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!wp", name = "C", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!wp", name = "D", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!wp", name = "F", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!wp", name = "G", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!wp", name = "E", descriptor = "Z")
    public static boolean field4046;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILvc;II)Z", line = 3)
    public final boolean method77(int arg0, class89 arg1, int arg2, int arg3) {
        field4048++;
        return arg0 == 0 ? false : false;
    }

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "(B)V", line = 17)
    public final void method75(byte arg0) {
        if (arg0 == 111) {
            field4036++;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZLvc;)V", line = 29)
    public final void method78(boolean arg0, class89 arg1) {
        field4047++;
        if (!arg0) {
            field4039 = false;
        }
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)V", line = 39)
    public final void method84(int arg0) {
        field4033++;
        if (arg0 != 16805) {
            this.method80(-81);
        }
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(ZLvc;)V", line = 50)
    public final void method86(boolean arg0, class89 arg1) {
        if (arg0) {
            this.method68(108);
        }
        field4045++;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIIIIIIII)V", line = 64)
    public static final void method1872(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4038++;
        if (arg8 != 0) {
            method1873((byte) 106, 32);
        }
        if (arg9 >= class295.field4153 && arg9 <= class103.field1457 && arg1 >= class295.field4153 && class103.field1457 >= arg1 && arg5 >= class295.field4153 && arg5 <= class103.field1457 && class295.field4153 <= arg0 && arg0 <= class103.field1457 && class444.field6338 <= arg6 && arg6 <= class151.field2091 && arg2 >= class444.field6338 && class151.field2091 >= arg2 && arg3 >= class444.field6338 && class151.field2091 >= arg3 && arg7 >= class444.field6338 && arg7 <= class151.field2091) {
            class475.method2814(arg6, false, arg1, arg3, arg2, arg4, arg9, arg5, arg0, arg7);
        } else {
            class141.method1019(arg0, -22806, arg7, arg1, arg2, arg4, arg3, arg5, arg9, arg6);
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lvc;I)Lep;", line = 81)
    public final class309 method69(class89 arg0, int arg1) {
        field4034++;
        if (arg1 != 10228) {
            method1873((byte) 119, -107);
        }
        return null;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(BILvc;)Ln;", line = 92)
    public final class468 method76(byte arg0, int arg1, class89 arg2) {
        if (arg0 == -106) {
            field4040++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lvc;B)V", line = 104)
    public final void method85(class89 arg0, byte arg1) {
        field4042++;
        if (arg1 != -24) {
            this.method78(true, (class89) null);
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)I", line = 115)
    public final int method80(int arg0) {
        if (arg0 != 10143) {
            this.method86(true, (class89) null);
        }
        field4032++;
        return 0;
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(IIIIILa;)V", line = 126)
    public class281(int arg0, int arg1, int arg2, int arg3, int arg4, class421 arg5) {
        super(arg2, arg3, arg4, class225.method1536(arg1, arg0, 127));
        this.field4037 = arg5;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZILvc;IILuq;I)V", line = 135)
    public final void method70(boolean arg0, int arg1, class89 arg2, int arg3, int arg4, class316 arg5, int arg6) {
        field4044++;
        if (arg1 <= 40) {
            this.method83((byte) 79);
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(BI)V", line = 150)
    public static final void method1873(byte arg0, int arg1) {
        class336 var2 = class279.field4010;
        synchronized (class279.field4010) {
            class279.field4010.method2120((byte) -104, arg1);
        }
        field4035++;
        if (arg0 != 125) {
            method1872(43, 118, -78, 47, 112, 28, 15, 12, -5, 69);
        }
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(B)I", line = 163)
    public final int method83(byte arg0) {
        if (arg0 <= 70) {
            field4046 = true;
        }
        field4041++;
        return 0;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)I", line = 175)
    public final int method71(byte arg0) {
        if (arg0 <= 81) {
            this.method71((byte) 41);
        }
        field4043++;
        return 0;
    }

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "(I)Z", line = 188)
    public final boolean method68(int arg0) {
        field4031++;
        int var2 = -28 % ((2 - arg0) / 57);
        return false;
    }

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "(B)Z", line = 204)
    public final boolean method82(byte arg0) {
        if (arg0 <= 89) {
            return true;
        } else {
            field4030++;
            return false;
        }
    }
}
