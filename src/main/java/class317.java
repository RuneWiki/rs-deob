import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class317 extends class424 {

    @OriginalMember(owner = "client!fm", name = "Z", descriptor = "I")
    private int field4323 = -1;

    @OriginalMember(owner = "client!fm", name = "P", descriptor = "I")
    public static int field4313 = 0;

    @OriginalMember(owner = "client!fm", name = "N", descriptor = "I")
    public static int field4311 = 0;

    @OriginalMember(owner = "client!fm", name = "ab", descriptor = "Z")
    public static boolean field4324 = false;

    @OriginalMember(owner = "client!fm", name = "L", descriptor = "I")
    private int field4309;

    @OriginalMember(owner = "client!fm", name = "M", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!fm", name = "Q", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!fm", name = "R", descriptor = "I")
    private int field4315;

    @OriginalMember(owner = "client!fm", name = "S", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!fm", name = "T", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!fm", name = "U", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!fm", name = "V", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!fm", name = "W", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!fm", name = "X", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!fm", name = "O", descriptor = "Lij;")
    public static class316 field4312;

    @OriginalMember(owner = "client!fm", name = "Y", descriptor = "[I")
    private int[] field4322;

    static {
        new class368("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZLvg;III)V", line = 5)
    public static final void method1938(boolean arg0, class108 arg1, int arg2, int arg3, int arg4) {
        if (arg4 == -6754) {
            ++field4317;
            int var5 = arg1.field1568;
            int var6 = arg1.field1577;
            if (arg1.field1608 == 0) {
                arg1.field1568 = arg1.field1583;
            } else if (arg1.field1608 == 1) {
                arg1.field1568 = -arg1.field1583 + arg2;
            } else if (~arg1.field1608 == -3) {
                arg1.field1568 = arg1.field1583 * arg2 >> 14;
            }
            if (arg1.field1536 == 0) {
                arg1.field1577 = arg1.field1522;
            } else if (~arg1.field1536 == -2) {
                arg1.field1577 = -arg1.field1522 + arg3;
            } else if (arg1.field1536 == 2) {
                arg1.field1577 = arg1.field1522 * arg3 >> 14;
            }
            if (~arg1.field1608 == -5) {
                arg1.field1568 = arg1.field1617 * arg1.field1577 / arg1.field1638;
            }
            if (~arg1.field1536 == -5) {
                arg1.field1577 = arg1.field1638 * arg1.field1568 / arg1.field1617;
            }
            if (class42.field542 && (~client.method1634(arg1).field4209 != -1 || arg1.field1666 == 0)) {
                if (arg1.field1577 < 5 && ~arg1.field1568 > -6) {
                    arg1.field1577 = 5;
                    arg1.field1568 = 5;
                } else {
                    if (arg1.field1568 <= 0) {
                        arg1.field1568 = 5;
                    }
                    if (arg1.field1577 <= 0) {
                        arg1.field1577 = 5;
                    }
                }
            }
            if (arg1.field1660 == 1337) {
                class244.field3451 = arg1;
            }
            if (arg0 && arg1.field1673 != null) {
                if (arg1.field1568 != var5 || ~arg1.field1577 != ~var6) {
                    class101 var7 = new class101();
                    var7.field1393 = arg1.field1673;
                    var7.field1403 = arg1;
                    class90.field1262.method1162(116, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZ)[[I", line = 84)
    public final int[][] method21(int arg0, boolean arg1) {
        ++field4318;
        int[][] var3 = super.field5896.method693(arg1, arg0);
        if (super.field5896.field1228) {
            int var4 = this.field4309 * (class423.field5866 == this.field4315 ? arg0 : this.field4315 * arg0 / class423.field5866);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class303.field4135 != this.field4309) {
                for (int var8 = 0; var8 < class303.field4135; ++var8) {
                    int var9 = this.field4309 * var8 / class303.field4135;
                    int var10 = this.field4322[var4 + var9];
                    var7[var8] = class187.method1301(var10 << 4, 4080);
                    var6[var8] = class187.method1301(var10 >> 4, 4080);
                    var5[var8] = class187.method1301(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; class303.field4135 > var11; ++var11) {
                    int var12 = this.field4322[var4++];
                    var7[var11] = class187.method1301(255, var12) << 4;
                    var6[var11] = class187.method1301(var12 >> 4, 4080);
                    var5[var11] = class187.method1301(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lrg;BI)V", line = 151)
    public final void method19(class366 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            this.field4323 = arg0.method2297(arg1 + 13400);
        }
        if (arg1 == -48) {
            ++field4320;
        }
    }

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "(I)V", line = 165)
    public static void method1939(int arg0) {
        field4312 = null;
        if (arg0 != 0) {
            method1938(true, (class108) null, -49, 106, -51);
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V", line = 181)
    public class317() {
        super(0, false);
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)V", line = 184)
    public final void method1940(byte arg0) {
        if (arg0 <= 25) {
            this.field4322 = null;
        }
        super.method1940((byte) 93);
        ++field4310;
        this.field4322 = null;
    }

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "(I)I", line = 200)
    public final int method1941(int arg0) {
        ++field4316;
        if (arg0 != -32563) {
            method1939(-30);
        }
        return this.field4323;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(III)V", line = 220)
    public final void method1942(int arg0, int arg1, int arg2) {
        ++field4314;
        super.method1942(arg0, arg1, arg2);
        if (this.field4323 >= 0 && class232.field3260 != null) {
            int var4 = !class232.field3260.method1366(this.field4323, -11039).field708 ? 128 : 64;
            this.field4322 = class232.field3260.method1367(var4, var4, this.field4323, false, 1.0F, -9882);
            this.field4315 = var4;
            this.field4309 = var4;
        }
    }
}
