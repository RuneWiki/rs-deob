import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class133 extends class607 {

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "Lig;")
    public static class206 field1671 = new class206(47, -2);

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "Lhp;")
    public static class277 field1672 = new class277(8);

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    public static int field1673 = 0;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)Z")
    public final boolean method814(byte arg0) {
        if (arg0 != -97) {
            method819(59, 68, -112, (String[]) null);
        }
        ++field1667;
        return false;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)V")
    public final void method815(int arg0, int arg1, int arg2) {
        ++field1665;
        if (arg0 != 12868) {
            this.method810(-28, (byte) -118, (class502) null);
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(B)V")
    public final void method805(byte arg0) {
        if (arg0 != -58) {
            method819(39, -29, -51, (String[]) null);
        }
        ++field1664;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Ltu;)V")
    public class133(class294 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZB)V")
    public final void method811(boolean arg0, byte arg1) {
        if (arg1 != 91) {
            field1672 = null;
        }
        ++field1669;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III[Ljava/lang/String;)Ljava/lang/String;")
    public static final String method819(int arg0, int arg1, int arg2, String[] arg3) {
        ++field1668;
        if (arg1 == 0) {
            return "";
        } else if (arg1 == 1) {
            String var4 = arg3[arg2];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg2;
            int var6 = 0;
            for (int var7 = arg2; ~var7 > ~var5; ++var7) {
                String var11 = arg3[var7];
                if (var11 != null) {
                    var6 += var11.length();
                } else {
                    var6 += 4;
                }
            }
            if (arg0 < 73) {
                field1673 = -112;
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg2; ~var5 < ~var9; ++var9) {
                String var10 = arg3[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)V")
    public static void method820(int arg0) {
        field1671 = null;
        field1672 = null;
        if (arg0 != 1) {
            field1673 = -103;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBLiu;)V")
    public final void method810(int arg0, byte arg1, class502 arg2) {
        ++field1666;
        if (arg1 <= -73) {
            super.field8870.method1971((byte) -90, arg2);
            super.field8870.method1904(arg0, -127);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZ)V")
    public final void method808(int arg0, boolean arg1) {
        ++field1670;
        if (arg0 != 993) {
            field1672 = null;
        }
    }
}
