import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 {

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public int field7 = 16777215;

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
    public int field17 = 8;

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "[I")
    public static int[] field19 = new int[8];

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "I")
    public int field12;

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "I")
    public int field13;

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "I")
    public int field16;

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
    public int field18;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public int field6;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "Z")
    public boolean field9;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILsl;B)V", line = 3)
    private final void method4(int arg0, class461 arg1, byte arg2) {
        int var4 = 110 / ((arg2 + 20) / 52);
        field10++;
        if (arg0 == 1) {
            this.field17 = arg1.method2566(-2);
        } else if (arg0 == 2) {
            this.field9 = true;
        } else if (arg0 == 3) {
            this.field6 = arg1.method2577(2);
            this.field12 = arg1.method2577(2);
            this.field16 = arg1.method2577(2);
        } else if (arg0 == 4) {
            this.field13 = arg1.method2600((byte) -125);
        } else if (arg0 == 5) {
            this.field18 = arg1.method2566(-2);
        } else if (arg0 == 6) {
            this.field7 = arg1.method2576((byte) 52);
            return;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V", line = 51)
    public static final void method5(int arg0) {
        if (arg0 != 11336) {
            method9(100, null, 71);
        }
        field11++;
        if (class465.field6245.toLowerCase().indexOf("microsoft") != -1) {
            class589.field8254[187] = 27;
            class589.field8254[192] = 58;
            class589.field8254[188] = 71;
            class589.field8254[220] = 74;
            class589.field8254[186] = 57;
            class589.field8254[223] = 28;
            class589.field8254[189] = 26;
            class589.field8254[222] = 59;
            class589.field8254[219] = 42;
            class589.field8254[221] = 43;
            class589.field8254[191] = 73;
            class589.field8254[190] = 72;
            return;
        }
        class589.field8254[44] = 71;
        class589.field8254[93] = 43;
        class589.field8254[61] = 27;
        class589.field8254[46] = 72;
        class589.field8254[47] = 73;
        class589.field8254[92] = 74;
        class589.field8254[59] = 57;
        class589.field8254[45] = 26;
        if (class465.field6238 == null) {
            class589.field8254[222] = 59;
            class589.field8254[192] = 58;
        } else {
            class589.field8254[520] = 59;
            class589.field8254[192] = 28;
            class589.field8254[222] = 58;
        }
        class589.field8254[91] = 42;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lsl;I)V", line = 102)
    public final void method6(class461 arg0, int arg1) {
        field8++;
        if (arg1 >= -115) {
            return;
        }
        while (true) {
            int var3 = arg0.method2600((byte) -124);
            if (var3 == 0) {
                return;
            }
            this.method4(var3, arg0, (byte) 57);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V", line = 132)
    public static void method7(byte arg0) {
        if (arg0 >= -17) {
            field19 = null;
        }
        field19 = null;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZI)V", line = 144)
    public static final void method8(boolean arg0, int arg1) {
        field14++;
        if (arg0) {
            if (class540.field7482 != -1) {
                class173.method1194(class540.field7482, (byte) -17);
            }
            for (class491 var2 = (class491) class290.field3804.method1156(arg1 ^ 0xDC); var2 != null; var2 = (class491) class290.field3804.method1158(22706)) {
                if (!var2.method1176((byte) 68)) {
                    var2 = (class491) class290.field3804.method1156(0);
                    if (var2 == null) {
                        break;
                    }
                }
                class178.method1218(256, false, var2, true);
            }
            class540.field7482 = -1;
            class290.field3804 = new class165(8);
            class662.method3720(arg1 - 305);
            class540.field7482 = class416.field5299;
            class203.method1317(false, false);
            class433.method2476(-67);
            class188.method1270(class540.field7482);
        }
        class159.field2165 = true;
        if (arg1 != 220) {
            field19 = null;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I[BI)[B", line = 191)
    public static final byte[] method9(int arg0, byte[] arg1, int arg2) {
        field15++;
        byte[] var3 = new byte[arg0];
        if (arg2 > -74) {
            field19 = null;
        }
        class135.method999(arg1, 0, var3, 0, arg0);
        return var3;
    }
}
