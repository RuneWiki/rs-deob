import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class225 extends class80 {

    @OriginalMember(owner = "client!vu", name = "L", descriptor = "I")
    private int field3515 = 10;

    @OriginalMember(owner = "client!vu", name = "T", descriptor = "I")
    private int field3523 = 0;

    @OriginalMember(owner = "client!vu", name = "S", descriptor = "I")
    private int field3522 = 2048;

    @OriginalMember(owner = "client!vu", name = "U", descriptor = "Los;")
    public static class309 field3524 = new class309("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!vu", name = "J", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!vu", name = "M", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!vu", name = "O", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!vu", name = "P", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!vu", name = "R", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!vu", name = "V", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!vu", name = "W", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!vu", name = "X", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!vu", name = "N", descriptor = "[I")
    private int[] field3517;

    @OriginalMember(owner = "client!vu", name = "Q", descriptor = "[I")
    private int[] field3520;

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "()V", line = 262)
    public class225() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "(Z)V", line = 9)
    public static void method1500(boolean arg0) {
        field3524 = null;
        if (!arg0) {
            field3524 = null;
        }
    }

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "(B)V", line = 19)
    private final void method1501(byte arg0) {
        ++field3519;
        int var2 = 0;
        this.field3517 = new int[this.field3515 + 1];
        this.field3520 = new int[this.field3515 + 1];
        int var3 = 4096 / this.field3515;
        int var4 = this.field3522 * var3 >> 12;
        if (arg0 <= 124) {
            field3524 = null;
        }
        for (int var5 = 0; this.field3515 > var5; ++var5) {
            this.field3520[var5] = var2;
            this.field3517[var5] = var2 - -var4;
            var2 += var3;
        }
        this.field3520[this.field3515] = 4096;
        this.field3517[this.field3515] = this.field3517[0] + 4096;
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(II)[I", line = 51)
    public final int[] method25(int arg0, int arg1) {
        ++field3521;
        int[] var3 = super.field1601.method48(arg0, (byte) 0);
        if (arg1 != -16828) {
            field3524 = null;
        }
        if (super.field1601.field124) {
            int var4 = class44.field795[arg0];
            if (this.field3523 == 0) {
                short var5 = 0;
                for (int var6 = 0; ~this.field3515 < ~var6; ++var6) {
                    if (~this.field3520[var6] >= ~var4 && var4 < this.field3520[var6 + 1]) {
                        if (var4 < this.field3517[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class394.method2451(var3, 0, class137.field2308, var5);
            } else {
                for (int var7 = 0; var7 < class137.field2308; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class460.field6860[var7];
                    int var11 = this.field3523;
                    if (~var11 != -2) {
                        if (~var11 != -3) {
                            if (var11 == 3) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = (var10 - 4096 - -var4 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; ~var12 > ~this.field3515; ++var12) {
                        if (~var8 <= ~this.field3520[var12] && ~var8 > ~this.field3520[var12 + 1]) {
                            if (var8 < this.field3517[var12]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(BI)Z", line = 170)
    public static final boolean method1502(byte arg0, int arg1) {
        ++field3518;
        if (arg0 != -45) {
            field3524 = null;
        }
        return ~arg1 <= -5 && arg1 <= 8;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IILnn;)V", line = 182)
    public final void method26(int arg0, int arg1, class289 arg2) {
        ++field3525;
        int var4 = -79 % ((arg1 - 28) / 53);
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field3523 = arg2.method1858(-3256);
                }
            } else {
                this.field3522 = arg2.method1841((byte) 34);
            }
        } else {
            this.field3515 = arg2.method1858(-3256);
        }
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(Z)V", line = 225)
    public final void method23(boolean arg0) {
        if (!arg0) {
            this.field3522 = -14;
        }
        this.method1501((byte) 125);
        ++field3527;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIII)V", line = 238)
    public static final void method1503(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 << 3;
        int var5 = arg0 << arg1;
        ++field3516;
        int var6 = arg2 << 3;
        if (~class510.field7435 == -3) {
            class41.field577 = var6;
            class311.field4707 = var4;
            class139.field2325 = var5;
        }
        class113.field2041 = (float) var6;
        class525.field7631 = (float) var5;
        class380.method2337(786432);
        class23.field339 = true;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIIIIIII)V", line = 278)
    public static final void method1504(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3526;
        if (~arg0 == ~arg5) {
            class87.method805(arg4, arg2, arg1, 16777215, arg0, arg7, arg6);
        } else if (arg3 == 3) {
            if (~class467.field6940 >= ~(-arg0 + arg6) && class43.field600 >= arg0 + arg6 && ~(-arg5 + arg7) <= ~class372.field5455 && ~class216.field3415 <= ~(arg7 - -arg5)) {
                class268.method1706(-62, arg2, arg5, arg7, arg1, arg0, arg4, arg6);
            } else {
                class325.method2068(arg4, arg5, arg0, arg6, -75, arg1, arg2, arg7);
            }
        }
    }
}
