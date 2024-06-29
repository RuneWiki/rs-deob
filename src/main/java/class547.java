import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public class class547 {

    @OriginalMember(owner = "client!hha", name = "i", descriptor = "Ljava/lang/String;")
    private String field7431 = "";

    @OriginalMember(owner = "client!hha", name = "o", descriptor = "I")
    private int field7437 = -1;

    @OriginalMember(owner = "client!hha", name = "r", descriptor = "I")
    public int field7440 = -1;

    @OriginalMember(owner = "client!hha", name = "e", descriptor = "I")
    public int field7427 = 0;

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "I")
    private int field7424 = -1;

    @OriginalMember(owner = "client!hha", name = "m", descriptor = "I")
    private int field7435 = -1;

    @OriginalMember(owner = "client!hha", name = "d", descriptor = "I")
    public int field7426 = 0;

    @OriginalMember(owner = "client!hha", name = "y", descriptor = "I")
    public int field7447 = 0;

    @OriginalMember(owner = "client!hha", name = "h", descriptor = "I")
    public int field7430 = -1;

    @OriginalMember(owner = "client!hha", name = "n", descriptor = "I")
    private int field7436 = -1;

    @OriginalMember(owner = "client!hha", name = "l", descriptor = "I")
    public int field7434 = 16777215;

    @OriginalMember(owner = "client!hha", name = "x", descriptor = "I")
    public int field7446 = 70;

    @OriginalMember(owner = "client!hha", name = "p", descriptor = "I")
    public int field7438 = -1;

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "I")
    public static int field7423;

    @OriginalMember(owner = "client!hha", name = "f", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!hha", name = "g", descriptor = "I")
    public static int field7429;

    @OriginalMember(owner = "client!hha", name = "j", descriptor = "I")
    public static int field7432;

    @OriginalMember(owner = "client!hha", name = "k", descriptor = "I")
    public static int field7433;

    @OriginalMember(owner = "client!hha", name = "q", descriptor = "I")
    public static int field7439;

    @OriginalMember(owner = "client!hha", name = "s", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!hha", name = "t", descriptor = "I")
    public static int field7442;

    @OriginalMember(owner = "client!hha", name = "u", descriptor = "I")
    public static int field7443;

    @OriginalMember(owner = "client!hha", name = "v", descriptor = "I")
    public static int field7444;

    @OriginalMember(owner = "client!hha", name = "w", descriptor = "I")
    public static int field7445;

    @OriginalMember(owner = "client!hha", name = "c", descriptor = "Lcba;")
    public class577 field7425;

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(ILfca;)V")
    public final void method3071(int arg0, class93 arg1) {
        while (true) {
            int var3 = arg1.method793((byte) 14);
            if (var3 == 0) {
                field7429++;
                if (arg0 != -14212) {
                    this.method3079(-47, null);
                    return;
                }
                return;
            }
            this.method3076((byte) -124, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(Lha;B)Lnf;")
    public final class604 method3072(class66 arg0, byte arg1) {
        field7444++;
        if (this.field7424 < 0) {
            return null;
        }
        int var3 = 1 % ((-arg1 - 25) / 43);
        class604 var4 = (class604) this.field7425.field8176.method266((byte) -128, (long) this.field7424);
        if (var4 == null) {
            this.method3078((byte) 116, arg0);
            var4 = (class604) this.field7425.field8176.method266((byte) -103, (long) this.field7424);
        }
        return var4;
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(IZBLjava/lang/String;I)V")
    public static final void method3073(int arg0, boolean arg1, byte arg2, String arg3, int arg4) {
        if (arg2 != 105) {
            field7439 = 84;
        }
        field7443++;
        class559.method3247(arg3, null, (byte) 54, arg0, arg4, arg1, false);
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(Lha;Z)Lnf;")
    public final class604 method3074(class66 arg0, boolean arg1) {
        field7441++;
        if (this.field7436 < 0) {
            return null;
        }
        class604 var3 = (class604) this.field7425.field8176.method266((byte) -110, (long) this.field7436);
        if (arg1) {
            this.field7434 = 90;
        }
        if (var3 == null) {
            this.method3078((byte) 116, arg0);
            var3 = (class604) this.field7425.field8176.method266((byte) -127, (long) this.field7436);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(ZLha;)Lnf;")
    public final class604 method3075(boolean arg0, class66 arg1) {
        field7423++;
        if (this.field7437 < 0) {
            return null;
        }
        class604 var3 = (class604) this.field7425.field8176.method266((byte) -117, (long) this.field7437);
        if (var3 == null) {
            this.method3078((byte) 116, arg1);
            var3 = (class604) this.field7425.field8176.method266((byte) -120, (long) this.field7437);
        }
        if (arg0) {
            field7439 = -47;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(BILfca;)V")
    private final void method3076(byte arg0, int arg1, class93 arg2) {
        if (arg1 == 1) {
            this.field7440 = arg2.method763(87);
        } else if (arg1 == 2) {
            this.field7434 = arg2.method767((byte) -125);
        } else if (arg1 == 3) {
            this.field7424 = arg2.method763(126);
        } else if (arg1 == 4) {
            this.field7435 = arg2.method763(94);
        } else if (arg1 == 5) {
            this.field7436 = arg2.method763(117);
        } else if (arg1 == 6) {
            this.field7437 = arg2.method763(112);
        } else if (arg1 == 7) {
            this.field7447 = arg2.method774(-4);
        } else if (arg1 == 8) {
            this.field7431 = arg2.method795(-15475);
        } else if (arg1 == 9) {
            this.field7446 = arg2.method763(106);
        } else if (arg1 == 10) {
            this.field7426 = arg2.method774(-4);
        } else if (arg1 == 11) {
            this.field7430 = 0;
        } else if (arg1 == 12) {
            this.field7438 = arg2.method793((byte) 97);
        } else if (arg1 == 13) {
            this.field7427 = arg2.method774(-4);
        } else if (arg1 == 14) {
            this.field7430 = arg2.method763(92);
        }
        field7442++;
        if (arg0 >= -121) {
            this.field7436 = -67;
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method3077(int arg0, int arg1) {
        if (arg0 != -30205) {
            return null;
        }
        field7433++;
        String var3 = this.field7431;
        while (true) {
            int var4 = var3.indexOf("%1");
            if (var4 < 0) {
                return var3;
            }
            var3 = var3.substring(0, var4) + class642.method3569(arg1, -73, false) + var3.substring(var4 + 2);
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(BLha;)V")
    private final void method3078(byte arg0, class66 arg1) {
        field7445++;
        class662 var3 = this.field7425.field8181;
        if (arg0 != 116) {
            this.field7438 = 85;
        }
        if (this.field7424 >= 0 && this.field7425.field8176.method266((byte) -119, (long) this.field7424) == null && var3.method3737(this.field7424, false)) {
            class49 var4 = class49.method370(var3, this.field7424);
            this.field7425.field8176.method270(arg1.method498(var4, true), (long) this.field7424, arg0 - 238);
        }
        if (this.field7436 >= 0 && this.field7425.field8176.method266((byte) -114, (long) this.field7436) == null && var3.method3737(this.field7436, false)) {
            class49 var5 = class49.method370(var3, this.field7436);
            this.field7425.field8176.method270(arg1.method498(var5, true), (long) this.field7436, -128);
        }
        if (this.field7435 >= 0 && this.field7425.field8176.method266((byte) -100, (long) this.field7435) == null && var3.method3737(this.field7435, false)) {
            class49 var6 = class49.method370(var3, this.field7435);
            this.field7425.field8176.method270(arg1.method498(var6, true), (long) this.field7435, -128);
        }
        if (this.field7437 >= 0 && this.field7425.field8176.method266((byte) -125, (long) this.field7437) == null && var3.method3737(this.field7437, false)) {
            class49 var7 = class49.method370(var3, this.field7437);
            this.field7425.field8176.method270(arg1.method498(var7, true), (long) this.field7437, -123);
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(ILha;)Lnf;")
    public final class604 method3079(int arg0, class66 arg1) {
        field7428++;
        if (arg0 > this.field7435) {
            return null;
        }
        class604 var3 = (class604) this.field7425.field8176.method266((byte) -113, (long) this.field7435);
        if (var3 == null) {
            this.method3078((byte) 116, arg1);
            var3 = (class604) this.field7425.field8176.method266((byte) -128, (long) this.field7435);
        }
        return var3;
    }
}
