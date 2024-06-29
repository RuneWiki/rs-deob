import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class75 extends class205 implements class185 {

    @OriginalMember(owner = "client!gm", name = "B", descriptor = "B")
    private byte field1330;

    @OriginalMember(owner = "client!gm", name = "R", descriptor = "B")
    private byte field1346;

    @OriginalMember(owner = "client!gm", name = "J", descriptor = "B")
    private byte field1338;

    @OriginalMember(owner = "client!gm", name = "Q", descriptor = "S")
    private short field1345;

    @OriginalMember(owner = "client!gm", name = "O", descriptor = "Z")
    private boolean field1343;

    @OriginalMember(owner = "client!gm", name = "v", descriptor = "Z")
    private boolean field1324;

    @OriginalMember(owner = "client!gm", name = "G", descriptor = "Z")
    private boolean field1335;

    @OriginalMember(owner = "client!gm", name = "w", descriptor = "Z")
    private boolean field1325;

    @OriginalMember(owner = "client!gm", name = "H", descriptor = "Lh;")
    private class452 field1336;

    @OriginalMember(owner = "client!gm", name = "E", descriptor = "Lcd;")
    public class198 field1333;

    @OriginalMember(owner = "client!gm", name = "P", descriptor = "[Z")
    public static boolean[] field1344 = new boolean[8];

    @OriginalMember(owner = "client!gm", name = "X", descriptor = "Z")
    public static boolean field1352;

    @OriginalMember(owner = "client!gm", name = "Y", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!gm", name = "x", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!gm", name = "y", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!gm", name = "z", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!gm", name = "A", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!gm", name = "C", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!gm", name = "D", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!gm", name = "F", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!gm", name = "I", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!gm", name = "K", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!gm", name = "L", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!gm", name = "M", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!gm", name = "N", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!gm", name = "S", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!gm", name = "T", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!gm", name = "U", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!gm", name = "V", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!gm", name = "W", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!gm", name = "Z", descriptor = "I")
    public static int field1354;

    static {
        new class423("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        field1352 = false;
        field1353 = -1;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILqq;Lps;ZZII)V", line = 3)
    public final void method165(int arg0, class318 arg1, class59 arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        if (arg4) {
            if (!(arg2 instanceof class98)) {
                if (arg2 instanceof class75) {
                    class75 var8 = (class75) arg2;
                    if (this.field1333 != null && var8.field1333 != null) {
                        this.field1333.method474(var8.field1333, arg6, arg0, arg5, arg3);
                    }
                }
            } else {
                class98 var9 = (class98) arg2;
                if (this.field1333 != null && var9.field1772 != null) {
                    this.field1333.method474(var9.field1772, arg6, arg0, arg5, arg3);
                }
            }
            ++field1331;
        }
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V", line = 37)
    public final void method163(int arg0) {
        if (arg0 != 8793) {
            this.method558(40);
        }
        ++field1326;
        if (this.field1333 != null) {
            this.field1333.method503();
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)I", line = 52)
    public final int method170(boolean arg0) {
        if (!arg0) {
            this.method165(-80, (class318) null, (class59) null, false, false, 58, -57);
        }
        ++field1342;
        return this.field1346;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IZLqq;Z)Ldi;", line = 69)
    private final class78 method556(int arg0, boolean arg1, class318 arg2, boolean arg3) {
        ++field1334;
        if (arg1) {
            this.field1346 = 28;
        }
        class56 var5 = class128.field2070.method916((byte) -15, this.field1345 & 65535);
        class343 var6;
        class343 var7;
        if (this.field1335) {
            var6 = class201.field3195[0];
            var7 = class262.field3978[this.field1330];
        } else {
            var7 = class201.field3195[this.field1330];
            if (~this.field1330 <= -4) {
                var6 = null;
            } else {
                var6 = class201.field3195[this.field1330 + 1];
            }
        }
        return var5.method391(~this.field1346 != -12 ? this.field1338 : this.field1338 + 4, super.field3222, true, super.field3218, var6, super.field3214, arg0, ~this.field1346 != -12 ? this.field1346 : 10, arg2, var7, arg3);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lqq;I)V", line = 99)
    public final void method171(class318 arg0, int arg1) {
        ++field1329;
        if (arg1 != 1577) {
            this.method163(-94);
        }
        Object var3 = null;
        class452 var5;
        if (this.field1336 == null && this.field1325) {
            class78 var4 = this.method556(262144, false, arg0, true);
            var5 = var4 == null ? null : var4.field1381;
        } else {
            var5 = this.field1336;
            this.field1336 = null;
        }
        if (var5 != null) {
            class208.method1275(var5, this.field1330, super.field3218, super.field3222, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "(I)V", line = 131)
    public static void method557(int arg0) {
        field1344 = null;
        if (arg0 != -18905) {
            method557(13);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)I", line = 141)
    public final int method174(byte arg0) {
        if (arg0 < 113) {
            return 33;
        } else {
            ++field1350;
            return 65535 & this.field1345;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZLqq;)V", line = 152)
    public final void method176(boolean arg0, class318 arg1) {
        if (!arg0) {
            this.method173(-121);
        }
        ++field1347;
        Object var3 = null;
        class452 var5;
        if (this.field1336 == null && this.field1325) {
            class78 var4 = this.method556(262144, !arg0, arg1, true);
            var5 = var4 == null ? null : var4.field1381;
        } else {
            var5 = this.field1336;
            this.field1336 = null;
        }
        if (var5 != null) {
            class90.method668(var5, this.field1330, super.field3218, super.field3222, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "(I)V", line = 180)
    public final void method168(int arg0) {
        this.field1324 = false;
        ++field1328;
        int var2 = -109 / ((-53 - arg0) / 62);
        if (this.field1333 != null) {
            this.field1333.method504(-65537 & this.field1333.method489());
        }
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lqq;Lin;IIIIIZIIIIIIZ)V", line = 193)
    public class75(class318 arg0, class56 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field960 == -2, class143.method943((byte) -32, arg12, arg13));
        this.field1330 = (byte) arg3;
        this.field1346 = (byte) arg12;
        this.field1338 = (byte) arg13;
        this.field1345 = (short) arg1.field958;
        this.field1343 = ~arg1.field895 != -1 && !arg7;
        this.field1324 = arg14;
        this.field1335 = arg7;
        this.field1325 = arg0.method1934() && arg1.field921 && !this.field1335 && ~class463.field7116.field2974 != -1;
        int var16 = 2048;
        if (this.field1324) {
            var16 |= 65536;
        }
        class78 var17 = this.method556(var16, false, arg0, this.field1325);
        if (var17 != null) {
            this.field1336 = var17.field1381;
            this.field1333 = var17.field1385;
            if (this.field1324) {
                this.field1333 = this.field1333.method511((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "(I)I", line = 224)
    public final int method558(int arg0) {
        ++field1351;
        if (arg0 != 14583) {
            return 6;
        } else {
            return this.field1333 == null ? 15 : this.field1333.method479() / 4;
        }
    }

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "(I)I", line = 235)
    public final int method333(int arg0) {
        ++field1339;
        if (arg0 != 0) {
            return 69;
        } else {
            return this.field1333 == null ? 0 : this.field1333.method492();
        }
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(I)I", line = 247)
    public final int method173(int arg0) {
        ++field1341;
        if (arg0 != 1438) {
            this.method173(-58);
        }
        return this.field1338;
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(I)Z", line = 258)
    public final boolean method164(int arg0) {
        if (arg0 != 0) {
            method559(-43, 1, -59, 3, -43);
        }
        ++field1323;
        return this.field1324;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIII)V", line = 270)
    public static final void method559(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class280.field4251 != null) {
            class280.field4251[arg0][arg1] = -16777216 | arg2;
        }
        if (class226.field3467 != null) {
            class226.field3467[arg0][arg1] = (byte) (arg3 >> 3);
        }
        if (class31.field407 != null) {
            class31.field407[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BLqq;)Lkm;", line = 284)
    public final class227 method169(byte arg0, class318 arg1) {
        ++field1340;
        if (this.field1333 == null) {
            return null;
        } else {
            if (arg0 > -11) {
                this.field1330 = 92;
            }
            class496 var3 = arg1.method1976();
            var3.method198(super.field3218, super.field3214, super.field3222);
            class227 var4 = null;
            if (this.field1343) {
                var4 = class145.method951(1, 0);
            }
            this.field1333.method461(var3, var4 == null ? null : var4.field3476[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILqq;I)Lcd;", line = 314)
    private final class198 method560(int arg0, class318 arg1, int arg2) {
        if (arg2 != 4701) {
            return null;
        } else {
            ++field1354;
            if (this.field1333 != null && ~arg1.method1944(this.field1333.method489(), arg0) == -1) {
                return this.field1333;
            } else {
                class78 var4 = this.method556(arg0, false, arg1, false);
                return var4 == null ? null : var4.field1385;
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(ZLqq;)V", line = 339)
    public final void method172(boolean arg0, class318 arg1) {
        if (arg0) {
            field1344 = null;
        }
        ++field1337;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)Z", line = 358)
    public final boolean method161(int arg0) {
        ++field1348;
        return arg0 != 15275 ? false : this.field1325;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lqq;BII)Z", line = 371)
    public final boolean method162(class318 arg0, byte arg1, int arg2, int arg3) {
        ++field1327;
        class198 var5 = this.method560(131072, arg0, 4701);
        if (var5 != null) {
            class496 var6 = arg0.method1976();
            var6.method198(super.field3218, super.field3214, super.field3222);
            return var5.method495(arg2, arg3, var6, false);
        } else {
            if (arg1 != -44) {
                field1353 = 104;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lqq;ZI)Lcd;", line = 398)
    public final class198 method167(class318 arg0, boolean arg1, int arg2) {
        ++field1332;
        if (arg1) {
            this.field1325 = true;
        }
        return this.method560(arg2, arg0, 4701);
    }
}
