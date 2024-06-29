import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class3 {

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "Lqk;")
    public static class207 field43 = class24.method212(255, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "B")
    public static byte field54;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "[[[I")
    public static int[][][] field47;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V")
    public static final void method12(int arg0, int arg1, int arg2) {
        if (class123.field2125 != arg0 && arg2 != -1) {
            class245.method1723(0, class123.field2125, class88.field1594, false, -117, arg2);
            class223.field4081 = true;
        }
        field44++;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lmd;I)Z")
    public static final boolean method13(class220 arg0, int arg1) {
        if (arg1 != 250) {
            field43 = null;
        }
        field46++;
        if (arg0.field3960 == 205) {
            class51.field994 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)V")
    public static final void method14(int arg0, byte arg1) {
        if (arg1 != 94) {
            method17((byte[]) null, true);
        }
        field51++;
        class223.field4080.method1383(-8052, arg0);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZLmd;I)V")
    public static final void method15(int arg0, boolean arg1, class220 arg2, int arg3) {
        field45++;
        if (class33.field659 != null || class256.field4588 || arg2 == null || class82.method613((byte) 118, arg2) == null) {
            return;
        }
        class33.field659 = arg2;
        class154.field2673 = class82.method613((byte) 82, arg2);
        class255.field4567 = arg1;
        class248.field4496 = 0;
        class60.field1112 = arg0;
        class254.field4543 = arg3;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(IB)V")
    public static final void method16(int arg0, byte arg1) {
        field52++;
        if (class16.field256 == null) {
            class16.field256 = new byte[4][104][104];
        }
        if (arg0 != 104) {
            field54 = -1;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class16.field256[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([BZ)Z")
    public static final boolean method17(byte[] arg0, boolean arg1) {
        field49++;
        class149 var2 = new class149(arg0);
        int var3 = var2.method1045((byte) -48);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method1045((byte) -126) == 1;
        if (var4) {
            class179.method1281((byte) -93, var2);
        }
        if (arg1) {
            field54 = 119;
        }
        class189.method1319(var2, -21934);
        return true;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILsa;IZZLsa;B)I")
    public static final int method18(int arg0, class260 arg1, int arg2, boolean arg3, boolean arg4, class260 arg5, byte arg6) {
        field42++;
        int var7 = class220.method1558(-2018292363, arg1, arg5, arg4, arg0);
        if (var7 != 0) {
            return arg4 ? -var7 : var7;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var8 = -63 / ((arg6 + 23) / 61);
            int var9 = class220.method1558(-2018292363, arg1, arg5, arg3, arg2);
            return arg3 ? -var9 : var9;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static void method19(int arg0) {
        if (arg0 != 0) {
            method16(-10, (byte) -52);
        }
        field47 = null;
        field43 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILqk;)Z")
    public static final boolean method20(int arg0, class207 arg1) {
        field48++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class25.field534; var2++) {
            if (arg1.method1462(class129.field2240[var2], true)) {
                return true;
            }
        }
        if (arg1.method1462(class202.field3565.field209, true)) {
            return true;
        } else {
            if (arg0 > -111) {
                field43 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
    public static final void method21(int arg0) {
        field53++;
        class268.field4734.method1390((byte) 124);
        class125.field2174.method1390((byte) 122);
        if (arg0 < 74) {
            method16(113, (byte) 24);
        }
    }
}
