import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class63 extends class33 implements class55 {

    @OriginalMember(owner = "client!qu", name = "O", descriptor = "Lbt;")
    public class33 field869;

    @OriginalMember(owner = "client!qu", name = "M", descriptor = "Ljm;")
    public static class485 field867 = new class485(72, -1);

    @OriginalMember(owner = "client!qu", name = "x", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!qu", name = "y", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!qu", name = "z", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!qu", name = "A", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!qu", name = "B", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!qu", name = "C", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!qu", name = "D", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!qu", name = "E", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!qu", name = "F", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!qu", name = "G", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!qu", name = "H", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!qu", name = "I", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!qu", name = "J", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!qu", name = "K", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!qu", name = "L", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!qu", name = "N", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!qu", name = "P", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!qu", name = "Q", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!qu", name = "R", descriptor = "Lvh;")
    public static class240 field872;

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(IIIIIIIIIILbt;)V")
    public class63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class33 arg10) {
        super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, class292.method1672(arg1, 0, arg0));
        this.field869 = arg10;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IILco;ILqa;ZZ)V")
    public final void method394(int arg0, int arg1, class76 arg2, int arg3, class162 arg4, boolean arg5, boolean arg6) {
        field866++;
        if (!arg6) {
            field872 = null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)I")
    public final int method355(int arg0) {
        field865++;
        return arg0 == 13599 ? 0 : -128;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IILqa;)Lc;")
    public final class121 method358(int arg0, int arg1, class162 arg2) {
        if (arg0 != 4586) {
            method401(117);
        }
        field857++;
        return null;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(BLvh;Lsf;Lvh;Lvh;)Z")
    public static final boolean method395(byte arg0, class240 arg1, class362 arg2, class240 arg3, class240 arg4) {
        class45.field638 = arg2;
        class511.field7519 = arg4;
        class123.field1686 = arg3;
        int var5 = 0 % ((53 - arg0) / 62);
        class454.field6636 = arg1;
        field870++;
        return true;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)I")
    public static int method396(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILss;B)I")
    public static final int method397(int arg0, class295 arg1, byte arg2) {
        field862++;
        if (!client.method1191(arg1).method1226(-18308, arg0) && arg1.field4029 == null) {
            return -1;
        } else {
            int var3 = 39 / ((arg2 + 19) / 50);
            return arg1.field4062 == null || arg1.field4062.length <= arg0 ? -1 : arg1.field4062[arg0];
        }
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(B)I")
    public final int method359(byte arg0) {
        field860++;
        return arg0 == -8 ? 0 : -103;
    }

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "(I)V")
    public final void method398(int arg0) {
        field861++;
        if (arg0 < 74) {
            this.method403(null, -4, -72, 51);
        }
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(ILqa;)V")
    public final void method357(int arg0, class162 arg1) {
        if (arg0 < 41) {
            field871 = 27;
        }
        field858++;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Z)Z")
    public final boolean method399(boolean arg0) {
        field863++;
        if (arg0) {
            this.method400(30, null);
        }
        return false;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILqa;)V")
    public final void method356(int arg0, class162 arg1) {
        if (arg0 < 100) {
            this.method354((byte) -15);
        }
        field868++;
    }

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "(I)I")
    public final int method215(int arg0) {
        field855++;
        if (arg0 != 0) {
            this.field869 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "(ILqa;)V")
    public final void method400(int arg0, class162 arg1) {
        int var3 = 4 / ((-arg0 - 29) / 33);
        field854++;
    }

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "(I)V")
    public static void method401(int arg0) {
        field872 = null;
        int var1 = -74 / ((17 - arg0) / 54);
        field867 = null;
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)Z")
    public final boolean method360(int arg0) {
        field856++;
        return arg0 < 34 ? false : false;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)I")
    public final int method354(byte arg0) {
        int var2 = -118 % ((arg0 - 61) / 53);
        field852++;
        return 0;
    }

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "(I)V")
    public final void method361(int arg0) {
        field853++;
        int var2 = -78 / ((arg0 + 36) / 36);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lqa;I)Lip;")
    public final class498 method402(class162 arg0, int arg1) {
        field859++;
        if (arg1 != 16562) {
            this.method394(98, 18, null, 81, null, false, false);
        }
        return null;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lqa;III)Z")
    public final boolean method403(class162 arg0, int arg1, int arg2, int arg3) {
        field864++;
        return arg2 != 24130;
    }
}
