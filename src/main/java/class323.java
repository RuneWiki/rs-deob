import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class323 extends class467 implements class278 {

    @OriginalMember(owner = "client!bq", name = "z", descriptor = "Z")
    private boolean field4433;

    @OriginalMember(owner = "client!bq", name = "D", descriptor = "Z")
    private boolean field4437;

    @OriginalMember(owner = "client!bq", name = "B", descriptor = "S")
    private short field4435;

    @OriginalMember(owner = "client!bq", name = "K", descriptor = "Z")
    private boolean field4444;

    @OriginalMember(owner = "client!bq", name = "R", descriptor = "B")
    private byte field4451;

    @OriginalMember(owner = "client!bq", name = "W", descriptor = "B")
    private byte field4455;

    @OriginalMember(owner = "client!bq", name = "J", descriptor = "B")
    private byte field4443;

    @OriginalMember(owner = "client!bq", name = "F", descriptor = "Z")
    private boolean field4439;

    @OriginalMember(owner = "client!bq", name = "O", descriptor = "Lab;")
    public class232 field4448;

    @OriginalMember(owner = "client!bq", name = "T", descriptor = "Lmr;")
    private class173 field4453;

    @OriginalMember(owner = "client!bq", name = "E", descriptor = "I")
    public static int field4438 = -1;

    @OriginalMember(owner = "client!bq", name = "A", descriptor = "Ltm;")
    public static class112 field4434 = new class112("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!bq", name = "Y", descriptor = "[S")
    public static short[] field4457 = new short[256];

    @OriginalMember(owner = "client!bq", name = "u", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!bq", name = "v", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!bq", name = "w", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!bq", name = "x", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!bq", name = "y", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!bq", name = "C", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!bq", name = "G", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!bq", name = "H", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!bq", name = "I", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!bq", name = "L", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!bq", name = "M", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!bq", name = "N", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!bq", name = "P", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!bq", name = "Q", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!bq", name = "S", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!bq", name = "U", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!bq", name = "X", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lkm;IBZ)Llt;", line = 5)
    private final class172 method1944(class487 arg0, int arg1, byte arg2, boolean arg3) {
        if (arg2 != -96) {
            field4434 = null;
        }
        ++field4436;
        class475 var5 = class304.field4160.method2075(65535 & this.field4435, false);
        class269 var6;
        class269 var7;
        if (this.field4437) {
            var6 = class366.field5215[0];
            var7 = class8.field166[this.field4455];
        } else {
            var7 = class366.field5215[this.field4455];
            if (~this.field4455 > -4) {
                var6 = class366.field5215[this.field4455 + 1];
            } else {
                var6 = null;
            }
        }
        return var5.method2793(var6, super.field6545, this.field4451, var7, this.field4443, arg0, arg1, arg3, super.field6549, (byte) -109, super.field6547);
    }

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "(Lkm;I)Lto;", line = 39)
    public final class370 method193(class487 arg0, int arg1) {
        ++field4446;
        if (this.field4448 == null) {
            return null;
        } else {
            class250 var3 = arg0.method1105();
            if (arg1 >= -6) {
                this.method208((class487) null, -89, 38);
            }
            var3.method1382(super.field6545, super.field6547, super.field6549);
            class370 var4 = null;
            if (this.field4433) {
                var4 = class277.method1737((byte) 28, 1);
            }
            this.field4448.method41(var3, var4 == null ? null : var4.field5233[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(I)I", line = 69)
    public final int method219(int arg0) {
        ++field4429;
        return arg0 != -17942 ? -109 : this.field4451;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)I", line = 82)
    public final int method215(int arg0) {
        ++field4447;
        if (arg0 != -11524) {
            this.method214(-119);
        }
        return this.field4443;
    }

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "(I)V", line = 95)
    public static void method1945(int arg0) {
        field4434 = null;
        int var1 = 19 % ((arg0 - 46) / 36);
        field4457 = null;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lkm;I)V", line = 111)
    public final void method216(class487 arg0, int arg1) {
        ++field4442;
        Object var3 = null;
        class173 var5;
        if (this.field4453 == null && this.field4439) {
            class172 var4 = this.method1944(arg0, 131072, (byte) -96, true);
            var5 = var4 == null ? null : var4.field2554;
        } else {
            var5 = this.field4453;
            this.field4453 = null;
        }
        if (var5 != null) {
            class199.method1265(var5, this.field4455, super.field6545, super.field6549, (boolean[]) null);
        }
        int var6 = 50 % ((-12 - arg1) / 60);
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(Lkm;I)V", line = 138)
    public final void method197(class487 arg0, int arg1) {
        ++field4445;
        int var3 = -41 / ((64 - arg1) / 59);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lkm;II)Lab;", line = 150)
    public final class232 method208(class487 arg0, int arg1, int arg2) {
        int var4 = 20 % ((-12 - arg1) / 47);
        ++field4440;
        return this.method1946((byte) 126, arg2, arg0);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(BILkm;)Lab;", line = 161)
    private final class232 method1946(byte arg0, int arg1, class487 arg2) {
        ++field4456;
        if (this.field4448 != null && arg2.method1102(this.field4448.method50(), arg1) == 0) {
            return this.field4448;
        } else {
            if (arg0 <= 121) {
                this.field4439 = false;
            }
            class172 var4 = this.method1944(arg2, arg1, (byte) -96, false);
            return var4 != null ? var4.field2549 : null;
        }
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(Z)I", line = 182)
    public final int method211(boolean arg0) {
        ++field4449;
        if (!arg0) {
            field4434 = null;
        }
        return this.field4435 & 65535;
    }

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "(I)Z", line = 195)
    public final boolean method195(int arg0) {
        if (arg0 <= 91) {
            this.field4451 = 88;
        }
        ++field4450;
        return this.field4444;
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(I)Z", line = 209)
    public final boolean method214(int arg0) {
        if (arg0 <= 24) {
            this.field4453 = null;
        }
        ++field4428;
        return this.field4439;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(ILkm;IZILkj;B)V", line = 223)
    public final void method198(int arg0, class487 arg1, int arg2, boolean arg3, int arg4, class280 arg5, byte arg6) {
        if (arg6 != 59) {
            this.field4444 = true;
        }
        if (!(arg5 instanceof class323)) {
            if (arg5 instanceof class197) {
                class197 var8 = (class197) arg5;
                if (this.field4448 != null && var8.field2821 != null) {
                    this.field4448.method59(var8.field2821, arg0, arg2, arg4, arg3);
                }
            }
        } else {
            class323 var9 = (class323) arg5;
            if (this.field4448 != null && var9.field4448 != null) {
                this.field4448.method59(var9.field4448, arg0, arg2, arg4, arg3);
            }
        }
        ++field4432;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Llk;I)V", line = 256)
    public static final void method1947(class425 arg0, int arg1) {
        if (arg1 != 1024) {
            method1945(-22);
        }
        ++field4431;
        byte[] var2 = new byte[24];
        if (class491.field6929 != null) {
            try {
                class491.field6929.method1907(24675, 0L);
                class491.field6929.method1908(27075, var2);
                int var3;
                for (var3 = 0; ~var3 > -25 && var2[var3] == 0; ++var3) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; ++var4) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method2454(false, 24, var2, 0);
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lkm;Lcj;IIIIZIIZ)V", line = 301)
    public class323(class487 arg0, class475 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class441.method2557(arg7, true, arg8));
        this.field4433 = ~arg1.field6681 != -1 && !arg6;
        this.field4437 = arg6;
        this.field4435 = (short) arg1.field6705;
        this.field4444 = arg9;
        this.field4451 = (byte) arg7;
        this.field4455 = (byte) arg2;
        super.field6545 = (short) arg3;
        this.field4443 = (byte) arg8;
        super.field6549 = (short) arg5;
        this.field4439 = arg0.method1123() && arg1.field6697 && !this.field4437 && class47.field761 != 0;
        int var11 = 1024;
        if (this.field4444) {
            var11 |= 32768;
        }
        class172 var12 = this.method1944(arg0, var11, (byte) -96, this.field4439);
        if (var12 != null) {
            this.field4448 = var12.field2549;
            this.field4453 = var12.field2554;
            if (this.field4444) {
                this.field4448 = this.field4448.method51((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)V", line = 335)
    public final void method202(byte arg0) {
        if (arg0 < 42) {
            this.field4444 = false;
        }
        this.field4444 = false;
        ++field4441;
        if (this.field4448 != null) {
            this.field4448.method56(-32769 & this.field4448.method50());
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lkm;BII)Z", line = 351)
    public final boolean method199(class487 arg0, byte arg1, int arg2, int arg3) {
        ++field4454;
        if (arg1 <= 123) {
            method1947((class425) null, 89);
        }
        class232 var5 = this.method1946((byte) 124, 65536, arg0);
        if (var5 != null) {
            class250 var6 = arg0.method1105();
            var6.method1382(super.field6545, super.field6547, super.field6549);
            return var5.method75(arg3, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z)V", line = 372)
    public final void method217(boolean arg0) {
        if (this.field4448 != null) {
            this.field4448.method22();
        }
        ++field4430;
        if (arg0) {
            this.field4439 = true;
        }
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(Lkm;I)V", line = 390)
    public final void method218(class487 arg0, int arg1) {
        ++field4452;
        Object var3 = null;
        class173 var5;
        if (this.field4453 == null && this.field4439) {
            class172 var4 = this.method1944(arg0, 131072, (byte) -96, true);
            var5 = var4 == null ? null : var4.field2554;
        } else {
            var5 = this.field4453;
            this.field4453 = null;
        }
        if (arg1 > -73) {
            this.method1946((byte) -108, -46, (class487) null);
        }
        if (var5 != null) {
            class204.method1291(var5, this.field4455, super.field6545, super.field6549, (boolean[]) null);
        }
    }
}
