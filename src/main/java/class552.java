import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class552 {

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    private int field7666 = -1;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public int field7661 = -1;

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "I")
    public int field7672 = 0;

    @OriginalMember(owner = "client!hr", name = "o", descriptor = "I")
    private int field7674 = -1;

    @OriginalMember(owner = "client!hr", name = "x", descriptor = "I")
    public int field7683 = -1;

    @OriginalMember(owner = "client!hr", name = "v", descriptor = "I")
    public int field7681 = 70;

    @OriginalMember(owner = "client!hr", name = "w", descriptor = "I")
    private int field7682 = -1;

    @OriginalMember(owner = "client!hr", name = "r", descriptor = "I")
    private int field7677 = -1;

    @OriginalMember(owner = "client!hr", name = "y", descriptor = "Ljava/lang/String;")
    private String field7684 = "";

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
    public int field7668 = 0;

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
    public int field7671 = -1;

    @OriginalMember(owner = "client!hr", name = "D", descriptor = "I")
    public int field7687 = 16777215;

    @OriginalMember(owner = "client!hr", name = "z", descriptor = "I")
    public int field7685 = 0;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
    public static int field7660;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
    public static int field7662;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
    public static int field7663;

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
    public static int field7664;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public static int field7665;

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
    public static int field7667;

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
    public static int field7669;

    @OriginalMember(owner = "client!hr", name = "n", descriptor = "I")
    public static int field7673;

    @OriginalMember(owner = "client!hr", name = "p", descriptor = "I")
    public static int field7675;

    @OriginalMember(owner = "client!hr", name = "q", descriptor = "I")
    public static int field7676;

    @OriginalMember(owner = "client!hr", name = "s", descriptor = "I")
    public static int field7678;

    @OriginalMember(owner = "client!hr", name = "t", descriptor = "I")
    public static int field7679;

    @OriginalMember(owner = "client!hr", name = "B", descriptor = "I")
    public static int field7686;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "Luda;")
    public class476 field7670;

    @OriginalMember(owner = "client!hr", name = "u", descriptor = "[[[I")
    public static int[][][] field7680;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Les;Z)V")
    public final void method3230(class403 arg0, boolean arg1) {
        if (!arg1) {
            method3234(69, 91);
        }
        while (true) {
            int var3 = arg0.method2396((byte) 52);
            if (var3 == 0) {
                field7673++;
                return;
            }
            this.method3231(var3, arg0, (byte) -8);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILes;B)V")
    private final void method3231(int arg0, class403 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field7671 = arg1.method2390((byte) 86);
        } else if (arg0 == 2) {
            this.field7687 = arg1.method2358(78);
        } else if (arg0 == 3) {
            this.field7677 = arg1.method2390((byte) 97);
        } else if (arg0 == 4) {
            this.field7666 = arg1.method2390((byte) 103);
        } else if (arg0 == 5) {
            this.field7674 = arg1.method2390((byte) 105);
        } else if (arg0 == 6) {
            this.field7682 = arg1.method2390((byte) -103);
        } else if (arg0 == 7) {
            this.field7685 = arg1.method2365(true);
        } else if (arg0 == 8) {
            this.field7684 = arg1.method2375((byte) 113);
        } else if (arg0 == 9) {
            this.field7681 = arg1.method2390((byte) 85);
        } else if (arg0 == 10) {
            this.field7672 = arg1.method2365(true);
        } else if (arg0 == 11) {
            this.field7683 = 0;
        } else if (arg0 == 12) {
            this.field7661 = arg1.method2396((byte) -99);
        } else if (arg0 == 13) {
            this.field7668 = arg1.method2365(true);
        } else if (arg0 == 14) {
            this.field7683 = arg1.method2390((byte) 78);
        }
        if (arg2 != -8) {
            this.field7661 = 0;
        }
        field7664++;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IBLha;Z)Llt;")
    public static final class705 method3232(int arg0, byte arg1, class66 arg2, boolean arg3) {
        if (arg1 > -30) {
            return null;
        }
        field7678++;
        if (arg0 == -1) {
            return null;
        }
        if (class208.field2473 != null) {
            for (int var4 = 0; var4 < class208.field2473.length; var4++) {
                if (class208.field2473[var4] == arg0) {
                    return class100.field1308[var4];
                }
            }
        }
        class705 var5 = (class705) class408.field5349.method1684((long) arg0, -359);
        if (var5 != null) {
            if (arg3 && var5.field9917 == null) {
                class307 var6 = class779.method4323(-1, class755.field10461, arg0);
                if (var6 == null) {
                    return null;
                }
                var5.field9917 = var6;
            }
            return var5;
        }
        class600[] var7 = class600.method3419(class459.field6468, arg0);
        if (var7 == null) {
            return null;
        }
        class307 var8 = class779.method4323(-1, class755.field10461, arg0);
        if (var8 == null) {
            return null;
        }
        class705 var9;
        if (arg3) {
            var9 = new class705(arg2.method579(var8, var7, true), var8);
        } else {
            var9 = new class705(arg2.method579(var8, var7, true));
        }
        class408.field5349.method1686(-25638, (long) arg0, var9);
        return var9;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V")
    public static final void method3233(byte arg0) {
        field7679++;
        if (!class421.field5616) {
            return;
        }
        if (arg0 >= -127) {
            method3239(62);
        }
        while (true) {
            while (class603.field8145 < class780.field10754.length) {
                class631 var1 = class780.field10754[class603.field8145];
                if (var1 != null && var1.field8618 == -1) {
                    if (class669.field9185 == null) {
                        class669.field9185 = class456.field6432.method3019(var1.field8619, 16383);
                    }
                    int var2 = class669.field9185.field2914;
                    if (var2 == -1) {
                        return;
                    }
                    var1.field8618 = var2;
                    class669.field9185 = null;
                    class603.field8145++;
                } else {
                    class603.field8145++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)V")
    public static final void method3234(int arg0, int arg1) {
        class683.field9348 = -1;
        class62.field850 = arg0;
        field7669++;
        class683.field9348 = -1;
        class448.method2641(-1);
        if (arg1 != -29711) {
            method3232(-69, (byte) 17, null, false);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)[Lpn;")
    public static final class776[] method3235(int arg0) {
        if (arg0 != 3879) {
            field7680 = null;
        }
        field7675++;
        return new class776[] { class588.field8006, class358.field4434, class576.field7867 };
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lha;B)V")
    private final void method3236(class66 arg0, byte arg1) {
        if (arg1 < 91) {
            this.method3241(-20, null);
        }
        field7676++;
        class48 var3 = this.field7670.field6611;
        if (this.field7677 >= 0 && this.field7670.field6609.method1684((long) this.field7677, -359) == null && var3.method433((byte) -75, this.field7677)) {
            class600 var4 = class600.method3431(var3, this.field7677);
            this.field7670.field6609.method1686(-25638, (long) this.field7677, arg0.method640(var4, true));
        }
        if (this.field7674 >= 0 && this.field7670.field6609.method1684((long) this.field7674, -359) == null && var3.method433((byte) -94, this.field7674)) {
            class600 var5 = class600.method3431(var3, this.field7674);
            this.field7670.field6609.method1686(-25638, (long) this.field7674, arg0.method640(var5, true));
        }
        if (this.field7666 >= 0 && this.field7670.field6609.method1684((long) this.field7666, -359) == null && var3.method433((byte) -85, this.field7666)) {
            class600 var6 = class600.method3431(var3, this.field7666);
            this.field7670.field6609.method1686(-25638, (long) this.field7666, arg0.method640(var6, true));
        }
        if (this.field7682 >= 0 && this.field7670.field6609.method1684((long) this.field7682, -359) == null && var3.method433((byte) -125, this.field7682)) {
            class600 var7 = class600.method3431(var3, this.field7682);
            this.field7670.field6609.method1686(-25638, (long) this.field7682, arg0.method640(var7, true));
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lbt;B)V")
    public static final void method3237(class48 arg0, byte arg1) {
        field7686++;
        if (arg1 != -116) {
            method3237(null, (byte) -20);
        }
        class39.field571 = arg0;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lha;I)Ltf;")
    public final class312 method3238(class66 arg0, int arg1) {
        field7660++;
        if (this.field7674 < 0) {
            return null;
        }
        class312 var3 = (class312) this.field7670.field6609.method1684((long) this.field7674, -359);
        if (arg1 != -1) {
            this.field7683 = 38;
        }
        if (var3 == null) {
            this.method3236(arg0, (byte) 107);
            var3 = (class312) this.field7670.field6609.method1684((long) this.field7674, arg1 ^ 0x166);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)V")
    public static void method3239(int arg0) {
        field7680 = null;
        if (arg0 <= 9) {
            field7680 = null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public final String method3240(int arg0, boolean arg1) {
        if (arg1) {
            this.field7672 = -78;
        }
        field7663++;
        String var3 = this.field7684;
        while (true) {
            int var4 = var3.indexOf("%1");
            if (var4 < 0) {
                return var3;
            }
            var3 = var3.substring(0, var4) + class355.method2085((byte) 97, false, arg0) + var3.substring(var4 + 2);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILha;)Ltf;")
    public final class312 method3241(int arg0, class66 arg1) {
        field7665++;
        if (this.field7682 < 0) {
            return null;
        }
        if (arg0 > -108) {
            this.method3243(null, 116);
        }
        class312 var3 = (class312) this.field7670.field6609.method1684((long) this.field7682, -359);
        if (var3 == null) {
            this.method3236(arg1, (byte) 95);
            var3 = (class312) this.field7670.field6609.method1684((long) this.field7682, -359);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLha;)Ltf;")
    public final class312 method3242(byte arg0, class66 arg1) {
        field7662++;
        if (this.field7677 < 0) {
            return null;
        }
        if (arg0 >= -104) {
            this.field7666 = -47;
        }
        class312 var3 = (class312) this.field7670.field6609.method1684((long) this.field7677, -359);
        if (var3 == null) {
            this.method3236(arg1, (byte) 108);
            var3 = (class312) this.field7670.field6609.method1684((long) this.field7677, -359);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(Lha;I)Ltf;")
    public final class312 method3243(class66 arg0, int arg1) {
        field7667++;
        if (~this.field7666 > arg1) {
            return null;
        }
        class312 var3 = (class312) this.field7670.field6609.method1684((long) this.field7666, arg1 - 358);
        if (var3 == null) {
            this.method3236(arg0, (byte) 106);
            var3 = (class312) this.field7670.field6609.method1684((long) this.field7666, -359);
        }
        return var3;
    }
}
