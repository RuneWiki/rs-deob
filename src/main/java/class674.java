import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class674 {

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public int field9387 = 70;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public int field9383 = -1;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    private int field9385 = -1;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    private int field9388 = -1;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    private int field9392 = -1;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public int field9391 = -1;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public int field9386 = 0;

    @OriginalMember(owner = "client!og", name = "r", descriptor = "Ljava/lang/String;")
    private String field9400 = "";

    @OriginalMember(owner = "client!og", name = "o", descriptor = "I")
    private int field9397 = -1;

    @OriginalMember(owner = "client!og", name = "v", descriptor = "I")
    public int field9404 = 16777215;

    @OriginalMember(owner = "client!og", name = "x", descriptor = "I")
    public int field9406 = -1;

    @OriginalMember(owner = "client!og", name = "w", descriptor = "I")
    public int field9405 = 0;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public int field9389 = 0;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "Lbu;")
    public static class21 field9395 = new class21(126, 2);

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field9384;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field9390;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public static int field9393;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public static int field9394;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "I")
    public static int field9396;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "I")
    public static int field9398;

    @OriginalMember(owner = "client!og", name = "q", descriptor = "I")
    public static int field9399;

    @OriginalMember(owner = "client!og", name = "s", descriptor = "I")
    public static int field9401;

    @OriginalMember(owner = "client!og", name = "t", descriptor = "I")
    public static int field9402;

    @OriginalMember(owner = "client!og", name = "y", descriptor = "I")
    public static int field9407;

    @OriginalMember(owner = "client!og", name = "z", descriptor = "I")
    public static int field9408;

    @OriginalMember(owner = "client!og", name = "A", descriptor = "I")
    public static int field9409;

    @OriginalMember(owner = "client!og", name = "u", descriptor = "Lrfa;")
    public class211 field9403;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lha;B)Ljd;")
    public final class241 method3828(class65 arg0, byte arg1) {
        if (arg1 != -83) {
            this.field9391 = -118;
        }
        field9390++;
        if (this.field9385 < 0) {
            return null;
        }
        class241 var3 = (class241) this.field9403.field3258.method3742((byte) 67, (long) this.field9385);
        if (var3 == null) {
            this.method3837(0, arg0);
            var3 = (class241) this.field9403.field3258.method3742((byte) 67, (long) this.field9385);
        }
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BLha;)Ljd;")
    public final class241 method3829(byte arg0, class65 arg1) {
        if (arg0 > -63) {
            return null;
        }
        field9399++;
        if (this.field9392 < 0) {
            return null;
        }
        class241 var3 = (class241) this.field9403.field3258.method3742((byte) 67, (long) this.field9392);
        if (var3 == null) {
            this.method3837(0, arg1);
            var3 = (class241) this.field9403.field3258.method3742((byte) 67, (long) this.field9392);
        }
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILha;)Ljd;")
    public final class241 method3830(int arg0, class65 arg1) {
        field9401++;
        if (this.field9397 < 0) {
            return null;
        }
        class241 var3 = (class241) this.field9403.field3258.method3742((byte) 67, (long) this.field9397);
        if (var3 == null) {
            this.method3837(0, arg1);
            var3 = (class241) this.field9403.field3258.method3742((byte) 67, (long) this.field9397);
        }
        int var4 = -62 / ((arg0 - 16) / 42);
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BLso;)V")
    public final void method3831(byte arg0, class494 arg1) {
        field9396++;
        while (true) {
            int var3 = arg1.method2964((byte) 68);
            if (var3 == 0) {
                if (arg0 > -2) {
                    this.method3830(-41, null);
                    return;
                } else {
                    return;
                }
            }
            this.method3839(-99, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
    public static void method3832(byte arg0) {
        field9395 = null;
        if (arg0 > -125) {
            method3835(null, (byte) -63);
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(Lha;B)Ljd;")
    public final class241 method3833(class65 arg0, byte arg1) {
        field9408++;
        if (arg1 >= -109) {
            return null;
        } else if (this.field9388 < 0) {
            return null;
        } else {
            class241 var3 = (class241) this.field9403.field3258.method3742((byte) 67, (long) this.field9388);
            if (var3 == null) {
                this.method3837(0, arg0);
                var3 = (class241) this.field9403.field3258.method3742((byte) 67, (long) this.field9388);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public static final void method3834(int arg0) {
        int var1 = 48 / ((17 - arg0) / 63);
        field9398++;
        class260.method1694(9016);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lav;B)V")
    public static final void method3835(class665 arg0, byte arg1) {
        field9393++;
        if (arg1 >= -84) {
            method3832((byte) -98);
        }
        for (class513 var2 = (class513) class376.field5192.method1731((byte) -127); var2 != null; var2 = (class513) class376.field5192.method1724(0)) {
            if (var2.field7248 == arg0) {
                if (var2.field7236 != null) {
                    class184.field2828.method426(var2.field7236);
                    var2.field7236 = null;
                }
                var2.method3387((byte) 122);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZLha;)V")
    public static final void method3836(boolean arg0, class65 arg1) {
        field9409++;
        for (class593 var2 = (class593) class20.field339.method2170(false); var2 != null; var2 = (class593) class20.field339.method2176(-17754)) {
            if (var2.field8354) {
                var2.method3454(arg1);
            }
        }
        if (!arg0) {
            field9395 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(ILha;)V")
    private final void method3837(int arg0, class65 arg1) {
        field9394++;
        class791 var3 = this.field9403.field3255;
        if (this.field9392 >= 0 && this.field9403.field3258.method3742((byte) 67, (long) this.field9392) == null && var3.method4349((byte) -102, this.field9392)) {
            class1 var4 = class1.method8(var3, this.field9392);
            this.field9403.field3258.method3739((long) this.field9392, (byte) 79, arg1.method551(var4, true));
        }
        if (this.field9397 >= 0 && this.field9403.field3258.method3742((byte) 67, (long) this.field9397) == null && var3.method4349((byte) -102, this.field9397)) {
            class1 var5 = class1.method8(var3, this.field9397);
            this.field9403.field3258.method3739((long) this.field9397, (byte) 65, arg1.method551(var5, true));
        }
        if (this.field9388 >= 0 && this.field9403.field3258.method3742((byte) 67, (long) this.field9388) == null && var3.method4349((byte) -102, this.field9388)) {
            class1 var6 = class1.method8(var3, this.field9388);
            this.field9403.field3258.method3739((long) this.field9388, (byte) 24, arg1.method551(var6, true));
        }
        if (this.field9385 >= arg0 && this.field9403.field3258.method3742((byte) 67, (long) this.field9385) == null && var3.method4349((byte) -102, this.field9385)) {
            class1 var7 = class1.method8(var3, this.field9385);
            this.field9403.field3258.method3739((long) this.field9385, (byte) 55, arg1.method551(var7, true));
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method3838(int arg0, int arg1) {
        field9384++;
        String var3 = this.field9400;
        while (true) {
            int var4 = var3.indexOf("%1");
            if (var4 < 0) {
                if (arg1 != -1) {
                    method3834(47);
                }
                return var3;
            }
            var3 = var3.substring(0, var4) + class788.method4315(arg0, -116, false) + var3.substring(var4 + 2);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILso;I)V")
    private final void method3839(int arg0, class494 arg1, int arg2) {
        field9402++;
        if (arg0 >= -71) {
            this.method3838(29, -55);
        }
        if (arg2 == 1) {
            this.field9383 = arg1.method2998(true);
        } else if (arg2 == 2) {
            this.field9404 = arg1.method2960((byte) 94);
        } else if (arg2 == 3) {
            this.field9392 = arg1.method2998(true);
        } else if (arg2 == 4) {
            this.field9388 = arg1.method2998(true);
        } else if (arg2 == 5) {
            this.field9397 = arg1.method2998(true);
        } else if (arg2 == 6) {
            this.field9385 = arg1.method2998(true);
        } else if (arg2 == 7) {
            this.field9386 = arg1.method2988(-3);
        } else if (arg2 == 8) {
            this.field9400 = arg1.method3001((byte) 17);
        } else if (arg2 == 9) {
            this.field9387 = arg1.method2998(true);
        } else if (arg2 == 10) {
            this.field9405 = arg1.method2988(-3);
        } else if (arg2 == 11) {
            this.field9391 = 0;
        } else if (arg2 == 12) {
            this.field9406 = arg1.method2964((byte) 99);
        } else if (arg2 == 13) {
            this.field9389 = arg1.method2988(-3);
            return;
        } else if (arg2 == 14) {
            this.field9391 = arg1.method2998(true);
            return;
        }
    }
}
