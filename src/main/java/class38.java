import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class38 extends class43 {

    @OriginalMember(owner = "client!dd", name = "Y", descriptor = "I")
    private int field624 = 4096;

    @OriginalMember(owner = "client!dd", name = "X", descriptor = "I")
    private int field623 = 0;

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!dd", name = "W", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!dd", name = "Z", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!dd", name = "ab", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!dd", name = "bb", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!dd", name = "cb", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "[Lvi;")
    public static class233[] field619;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([BB)[B")
    public static final byte[] method269(byte[] arg0, byte arg1) {
        ++field622;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        int var4 = -110 / ((arg1 - -55) / 59);
        class80.method495(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)[I")
    public final int[] method64(int arg0, int arg1) {
        ++field626;
        int[] var3 = super.field768.method1123(arg1, arg0);
        if (super.field768.field3219) {
            int[] var4 = this.method300(101, 0, arg0);
            for (int var5 = 0; ~class131.field2427 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field623 && ~var6 >= ~this.field624 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        ++field620;
        if (arg1 != -73) {
            field621 = 77;
        }
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field624 = arg2.method739(-128);
            }
        } else {
            this.field623 = arg2.method739(61);
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
    public class38() {
        super(1, true);
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(Z)V")
    public static void method270(boolean arg0) {
        if (!arg0) {
            field619 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)V")
    public static final void method271(byte arg0, int arg1) {
        ++field627;
        if (arg1 != -1) {
            if (class137.method933(256, arg1)) {
                if (arg0 != -17) {
                    field619 = null;
                }
                class96[] var2 = class97.field1866[arg1];
                for (int var3 = 0; var3 < var2.length; ++var3) {
                    class96 var4 = var2[var3];
                    if (var4.field1829 != null) {
                        class123 var5 = new class123();
                        var5.field2310 = var4.field1829;
                        var5.field2299 = var4;
                        class82.method502(2000000, var5, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(Z)V")
    public static final void method272(boolean arg0) {
        if (~class83.field1404.toLowerCase().indexOf("microsoft") == 0) {
            class42.field675[45] = 26;
            if (class83.field1387 == null) {
                class42.field675[222] = 59;
                class42.field675[192] = 58;
            } else {
                class42.field675[192] = 28;
                class42.field675[520] = 59;
                class42.field675[222] = 58;
            }
            class42.field675[61] = 27;
            class42.field675[47] = 73;
            class42.field675[46] = 72;
            class42.field675[59] = 57;
            class42.field675[93] = 43;
            class42.field675[92] = 74;
            class42.field675[91] = 42;
            class42.field675[44] = 71;
        } else {
            class42.field675[191] = 73;
            class42.field675[189] = 26;
            class42.field675[190] = 72;
            class42.field675[222] = 59;
            class42.field675[223] = 28;
            class42.field675[187] = 27;
            class42.field675[188] = 71;
            class42.field675[186] = 57;
            class42.field675[221] = 43;
            class42.field675[220] = 74;
            class42.field675[192] = 58;
            class42.field675[219] = 42;
        }
        if (!arg0) {
            field625 = -71;
        }
        ++field628;
    }
}
