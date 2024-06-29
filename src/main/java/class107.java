import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class107 extends class74 {

    @OriginalMember(owner = "client!c", name = "P", descriptor = "I")
    private int field1706 = 10;

    @OriginalMember(owner = "client!c", name = "W", descriptor = "I")
    private int field1713 = 2048;

    @OriginalMember(owner = "client!c", name = "Z", descriptor = "I")
    private int field1716 = 0;

    @OriginalMember(owner = "client!c", name = "U", descriptor = "[Ljava/lang/String;")
    public static String[] field1711 = new String[100];

    @OriginalMember(owner = "client!c", name = "M", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!c", name = "O", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!c", name = "R", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!c", name = "S", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!c", name = "T", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!c", name = "X", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!c", name = "V", descriptor = "[I")
    private int[] field1712;

    @OriginalMember(owner = "client!c", name = "Y", descriptor = "[I")
    private int[] field1715;

    @OriginalMember(owner = "client!c", name = "ab", descriptor = "[I")
    public static int[] field1717;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "(I)V")
    public static void method809(int arg0) {
        field1711 = null;
        field1717 = null;
        if (arg0 != 4096) {
            field1711 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        if (arg0 != -79) {
            this.field1712 = null;
        }
        ++field1714;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field1716 = arg1.method333((byte) -59);
                }
            } else {
                this.field1713 = arg1.method293(93);
            }
        } else {
            this.field1706 = arg1.method333((byte) -59);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(CI)Z")
    public static final boolean method810(char arg0, int arg1) {
        ++field1703;
        if (~arg0 <= -33 && ~arg0 >= -127) {
            return true;
        } else if (arg1 >= ~arg0 && arg0 <= 255) {
            return true;
        } else {
            return ~arg0 == -8365 || arg0 == 338 || arg0 == 8212 || ~arg0 == -340 || ~arg0 == -377;
        }
    }

    @OriginalMember(owner = "client!c", name = "g", descriptor = "(I)V")
    private final void method811(int arg0) {
        int var2 = -73 % ((-5 - arg0) / 42);
        ++field1705;
        this.field1715 = new int[this.field1706 + 1];
        int var3 = 0;
        this.field1712 = new int[this.field1706 + 1];
        int var4 = 4096 / this.field1706;
        int var5 = this.field1713 * var4 >> 12;
        for (int var6 = 0; this.field1706 > var6; ++var6) {
            this.field1712[var6] = var3;
            this.field1715[var6] = var3 + var5;
            var3 += var4;
        }
        this.field1712[this.field1706] = 4096;
        this.field1715[this.field1706] = this.field1715[0] + 4096;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(Z)V")
    public final void method493(boolean arg0) {
        this.method811(-112);
        ++field1710;
        if (arg0) {
            this.field1713 = 36;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        ++field1708;
        if (arg0 != 4) {
            return null;
        } else {
            int[] var3 = super.field1254.method1328((byte) -108, arg1);
            if (super.field1254.field3118) {
                int var4 = class207.field3212[arg1];
                if (~this.field1716 == -1) {
                    short var5 = 0;
                    for (int var6 = 0; this.field1706 > var6; ++var6) {
                        if (this.field1712[var6] <= var4 && ~var4 > ~this.field1712[var6 + 1]) {
                            if (var4 < this.field1715[var6]) {
                                var5 = 4096;
                            }
                            break;
                        }
                    }
                    class236.method1587(var3, 0, class178.field2662, var5);
                } else {
                    for (int var7 = 0; ~var7 > ~class178.field2662; ++var7) {
                        short var8 = 0;
                        int var9 = class224.field3522[var7];
                        int var10 = 0;
                        int var11 = this.field1716;
                        if (~var11 != -2) {
                            if (var11 != 2) {
                                if (~var11 == -4) {
                                    var10 = (-var4 + var9 >> 1) + 2048;
                                }
                            } else {
                                var10 = (var4 - 4096 + var9 >> 1) + 2048;
                            }
                        } else {
                            var10 = var9;
                        }
                        for (int var12 = 0; this.field1706 > var12; ++var12) {
                            if (this.field1712[var12] <= var10 && ~var10 > ~this.field1712[var12 + 1]) {
                                if (this.field1715[var12] > var10) {
                                    var8 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var7] = var8;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIII)V")
    public static final void method812(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1707;
        if (arg5 != -4) {
            method809(-54);
        }
        if (~arg4 <= ~class75.field1265 && class261.field4025 >= arg0 && ~arg3 <= ~class271.field4289 && ~arg1 >= ~class113.field1779) {
            class242.method1641(arg2, arg1, arg3, true, arg4, arg0);
        } else {
            class289.method1950((byte) 22, arg1, arg3, arg4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(IB)I")
    public static final int method813(int arg0, byte arg1) {
        if (arg1 <= 117) {
            return -30;
        } else {
            ++field1704;
            return arg0 >>> 7;
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
    public class107() {
        super(0, true);
    }
}
