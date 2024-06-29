import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class129 extends class14 {

    @OriginalMember(owner = "client!vb", name = "fb", descriptor = "Z")
    private boolean field3120 = false;

    @OriginalMember(owner = "client!vb", name = "tb", descriptor = "Z")
    private volatile boolean field3134 = false;

    @OriginalMember(owner = "client!vb", name = "wb", descriptor = "I")
    private int field3137 = -1;

    @OriginalMember(owner = "client!vb", name = "W", descriptor = "Lba;")
    private class8 field3111;

    @OriginalMember(owner = "client!vb", name = "nb", descriptor = "Lba;")
    private class8 field3128;

    @OriginalMember(owner = "client!vb", name = "ub", descriptor = "I")
    private int field3135;

    @OriginalMember(owner = "client!vb", name = "cb", descriptor = "I")
    public static int field3117 = -1;

    @OriginalMember(owner = "client!vb", name = "V", descriptor = "Lae;")
    private static class6 field3110 = class64.method474(113, "Hidden");

    @OriginalMember(owner = "client!vb", name = "kb", descriptor = "Lae;")
    private static class6 field3125 = class64.method474(113, "Your account has been disabled)3");

    @OriginalMember(owner = "client!vb", name = "hb", descriptor = "Lae;")
    public static class6 field3122 = class64.method474(111, "leuchten2:");

    @OriginalMember(owner = "client!vb", name = "ob", descriptor = "[I")
    public static int[] field3129 = new int[50];

    @OriginalMember(owner = "client!vb", name = "ib", descriptor = "I")
    public static int field3123 = 0;

    @OriginalMember(owner = "client!vb", name = "lb", descriptor = "Lae;")
    public static class6 field3126 = class64.method474(123, "Ihr Spielkonto wurde deaktiviert)3");

    @OriginalMember(owner = "client!vb", name = "X", descriptor = "I")
    public static int field3112 = 0;

    @OriginalMember(owner = "client!vb", name = "vb", descriptor = "Lae;")
    public static class6 field3136 = field3110;

    @OriginalMember(owner = "client!vb", name = "bb", descriptor = "Lae;")
    public static class6 field3116 = field3125;

    @OriginalMember(owner = "client!vb", name = "mb", descriptor = "Lae;")
    public static class6 field3127 = class64.method474(118, ":tradereq:");

    @OriginalMember(owner = "client!vb", name = "Bb", descriptor = "I")
    public static volatile int field3142 = 0;

    @OriginalMember(owner = "client!vb", name = "Cb", descriptor = "I")
    public static int field3143 = 0;

    @OriginalMember(owner = "client!vb", name = "Z", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!vb", name = "db", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!vb", name = "eb", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!vb", name = "gb", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!vb", name = "jb", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!vb", name = "qb", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!vb", name = "rb", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!vb", name = "sb", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!vb", name = "xb", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!vb", name = "yb", descriptor = "I")
    private int field3139;

    @OriginalMember(owner = "client!vb", name = "zb", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!vb", name = "Ab", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!vb", name = "ab", descriptor = "Lfb;")
    public static class34 field3115;

    @OriginalMember(owner = "client!vb", name = "pb", descriptor = "[Lva;")
    public static class128[] field3130;

    @OriginalMember(owner = "client!vb", name = "Y", descriptor = "[Z")
    private volatile boolean[] field3113;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)I", line = 13)
    public final int method1039(int arg0) {
        ++field3121;
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; super.field275.length > var4; ++var4) {
            if (~super.field270[var4] < -1) {
                var3 += this.method1041((byte) -114, var4);
                var2 += 100;
            }
        }
        if (~var2 == -1) {
            return 100;
        } else {
            if (arg0 < 60) {
                field3143 = -74;
            }
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(II)V", line = 54)
    public final void method1040(int arg0, int arg1) {
        if (arg0 <= 38) {
            method1042(9, -9);
        }
        ++field3138;
        this.field3139 = arg1;
        if (this.field3128 == null) {
            class96.method801(this.field3135, this, 255, true, this.field3139, (byte) 98, (byte) 0);
        } else {
            class138.method1115(this, (byte) -116, this.field3128, this.field3135);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZI)V", line = 71)
    public final void method142(boolean arg0, int arg1) {
        class41.method346(arg0, this.field3135, arg1);
        ++field3140;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(BI)I", line = 79)
    private final int method1041(byte arg0, int arg1) {
        ++field3131;
        if (arg0 > -98) {
            return -95;
        } else if (super.field275[arg1] != null) {
            return 100;
        } else {
            return this.field3113[arg1] ? 100 : class54.method421(this.field3135, arg1, -20500);
        }
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(II)Lib;", line = 99)
    public static final class51 method1042(int arg0, int arg1) {
        ++field3114;
        class51 var2 = (class51) class2.field9.method128((byte) -118, (long) arg0);
        if (arg1 != 3) {
            return null;
        } else if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class77.field1844.method160(arg1 + 30602, 3, arg0);
            class51 var4 = new class51();
            if (var3 != null) {
                var4.method410((byte) -9, new class77(var3));
            }
            class2.field9.method130(var4, (long) arg0, (byte) 98);
            return var4;
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lba;Lba;IZZZ)V", line = 323)
    public class129(class8 arg0, class8 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3111 = arg0;
        this.field3120 = arg5;
        this.field3128 = arg1;
        this.field3135 = arg2;
        class75.method598(30653, this, this.field3135);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI)V", line = 139)
    public final void method144(byte arg0, int arg1) {
        ++field3119;
        if (arg0 != 90) {
            this.method142(false, -85);
        }
        if (this.field3111 != null && this.field3113 != null && this.field3113[arg1]) {
            class138.method1115(this, (byte) -107, this.field3111, arg1);
        } else {
            class96.method801(arg1, this, this.field3135, true, super.field291[arg1], (byte) 118, (byte) 2);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([BIZLba;B)V", line = 168)
    public final void method1043(byte[] arg0, int arg1, boolean arg2, class8 arg3, byte arg4) {
        ++field3118;
        if (arg4 != -80) {
            field3125 = null;
        }
        if (this.field3128 == arg3) {
            if (this.field3134) {
                throw new RuntimeException();
            } else if (arg0 == null) {
                class96.method801(this.field3135, this, 255, true, this.field3139, (byte) 90, (byte) 0);
            } else {
                class37.field834.reset();
                class37.field834.update(arg0, 0, arg0.length);
                int var6 = (int) class37.field834.getValue();
                if (~this.field3139 != ~var6) {
                    class96.method801(this.field3135, this, 255, true, this.field3139, (byte) 74, (byte) 0);
                } else {
                    this.method163(arg0, (byte) -127);
                    this.method1048((byte) -29);
                }
            }
        } else {
            if (!arg2 && this.field3137 == arg1) {
                this.field3134 = true;
            }
            if (arg0 != null && arg0.length > 2) {
                class37.field834.reset();
                class37.field834.update(arg0, 0, arg0.length + -2);
                int var7 = (int) class37.field834.getValue();
                int var8 = ((arg0[arg0.length + -2] & 255) << 8) + (255 & arg0[arg0.length + -1]);
                if (super.field291[arg1] == var7 && super.field289[arg1] == var8) {
                    this.field3113[arg1] = true;
                    if (arg2) {
                        super.field275[arg1] = arg0;
                    }
                } else {
                    this.field3113[arg1] = false;
                    if (this.field3120 || arg2) {
                        class96.method801(arg1, this, this.field3135, arg2, super.field291[arg1], (byte) 99, (byte) 2);
                    }
                }
            } else {
                this.field3113[arg1] = false;
                if (this.field3120 || arg2) {
                    class96.method801(arg1, this, this.field3135, arg2, super.field291[arg1], (byte) 108, (byte) 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V", line = 263)
    public static final void method1044(int arg0) {
        class24.field616 = new class95();
        if (arg0 > -104) {
            method1042(72, -79);
        }
        ++field3133;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([BZBZI)V", line = 281)
    public final void method1045(byte[] arg0, boolean arg1, byte arg2, boolean arg3, int arg4) {
        ++field3141;
        if (arg3) {
            if (this.field3134) {
                throw new RuntimeException();
            }
            if (this.field3128 != null) {
                class137.method1111(this.field3128, false, this.field3135, arg0);
            }
            this.method163(arg0, (byte) -104);
            this.method1048((byte) -29);
        } else {
            arg0[arg0.length + -2] = (byte) (super.field289[arg4] >> 8);
            arg0[arg0.length - 1] = (byte) super.field289[arg4];
            if (this.field3111 != null) {
                class137.method1111(this.field3111, false, arg4, arg0);
                this.field3113[arg4] = true;
            }
            if (arg1) {
                super.field275[arg4] = arg0;
            }
        }
        if (arg2 >= -87) {
            this.method1047(57);
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)V", line = 351)
    public static void method1046(byte arg0) {
        field3136 = null;
        field3116 = null;
        if (arg0 < 38) {
            method1044(-105);
        }
        field3110 = null;
        field3127 = null;
        field3130 = null;
        field3126 = null;
        field3125 = null;
        field3122 = null;
        field3129 = null;
        field3115 = null;
    }

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)I", line = 388)
    public final int method1047(int arg0) {
        ++field3132;
        if (this.field3134) {
            return 100;
        } else if (super.field275 != null) {
            return 99;
        } else {
            if (arg0 != 0) {
                field3123 = -3;
            }
            int var2 = class54.method421(255, this.field3135, -20500);
            if (~var2 <= -101) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)V", line = 413)
    private final void method1048(byte arg0) {
        this.field3113 = new boolean[super.field275.length];
        for (int var2 = 0; this.field3113.length > var2; ++var2) {
            this.field3113[var2] = false;
        }
        ++field3124;
        if (this.field3111 == null) {
            this.field3134 = true;
        } else {
            this.field3137 = -1;
            if (arg0 == -29) {
                for (int var3 = 0; this.field3113.length > var3; ++var3) {
                    if (super.field270[var3] > 0) {
                        class61.method456(true, this.field3111, this, var3);
                        this.field3137 = var3;
                    }
                }
                if (~this.field3137 == 0) {
                    this.field3134 = true;
                }
            }
        }
    }
}
