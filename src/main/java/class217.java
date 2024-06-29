import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class217 extends class276 {

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "I")
    private int field3657 = 0;

    @OriginalMember(owner = "client!n", name = "O", descriptor = "I")
    private int field3655 = 0;

    @OriginalMember(owner = "client!n", name = "W", descriptor = "I")
    private int field3663 = 1;

    @OriginalMember(owner = "client!n", name = "N", descriptor = "Ljava/lang/String;")
    public static String field3654 = "glow1:";

    @OriginalMember(owner = "client!n", name = "Y", descriptor = "[I")
    public static int[] field3665 = new int[2];

    @OriginalMember(owner = "client!n", name = "M", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!n", name = "P", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!n", name = "R", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!n", name = "T", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!n", name = "U", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!n", name = "V", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!n", name = "X", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!n", name = "S", descriptor = "[Z")
    public static boolean[] field3659;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(II)V")
    public static final void method1441(int arg0, int arg1) {
        ++field3653;
        if (~class59.field1026 != ~arg0) {
            if (arg1 != -31239) {
                method1443(27, (class101) null);
            }
            boolean var2 = arg0 == 5 || ~arg0 == -11 || arg0 == 28;
            if (class59.field1026 == 0) {
                class85.method555((byte) 69);
            }
            if (~arg0 == -41) {
                class204.method1347(1);
            }
            if (~arg0 != -41 && class93.field1638 != null) {
                class93.field1638.method1380(true);
                class93.field1638 = null;
            }
            if (arg0 == 25 || arg0 == 28) {
                class122.field2148 = 0;
                class119.field2112 = 1;
                class165.field2708 = 0;
                class82.field1492 = 1;
                class33.field483 = 0;
                class268.method1765(true, 30);
            }
            if (arg0 == 25 || ~arg0 == -11) {
                class157.method1076((byte) -103);
            }
            if (arg0 == 5) {
                class177.method1177(class33.field471, true);
            } else {
                class264.method1747((byte) -36);
            }
            boolean var3 = class59.field1026 == 5 || ~class59.field1026 == -11 || ~class59.field1026 == -29;
            if (!var3 != !var2) {
                if (!var2) {
                    class161.method1093((byte) -99, 2);
                    class91.field1610.method315(true, 30445);
                } else {
                    class155.field2590 = class199.field3240;
                    if (~class50.field872 != -1) {
                        class52.method327(255, (byte) -98, 2, 0, false, class199.field3240, class56.field972);
                    } else {
                        class161.method1093((byte) -70, 2);
                    }
                    class91.field1610.method315(false, 30445);
                }
            }
            class59.field1026 = arg0;
        }
    }

    @OriginalMember(owner = "client!n", name = "g", descriptor = "(I)V")
    public static final void method1442(int arg0) {
        ++field3664;
        class159.field2664.method58(0);
        if (arg0 != 13056) {
            method1443(-125, (class101) null);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILeh;)V")
    public static final void method1443(int arg0, class101 arg1) {
        if (arg0 != 520085025) {
            method1441(98, -9);
        }
        while (true) {
            while (arg1.field1762 < arg1.field1730.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (~arg1.method669((byte) 36) == -2) {
                    var3 = arg1.method669((byte) 36);
                    var2 = true;
                    var4 = arg1.method669((byte) 36);
                }
                int var5 = arg1.method669((byte) 36);
                int var6 = arg1.method669((byte) 36);
                int var7 = var5 * 64 + -class124.field2184;
                int var8 = class83.field1514 + -1 + class193.field3114 + -(var6 * 64);
                if (var7 >= 0 && ~(var8 - 63) <= -1 && ~class203.field3318 < ~(var7 - -63) && var8 < class83.field1514) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; ++var11) {
                        for (int var12 = 0; ~var12 > -65; ++var12) {
                            if (!var2 || ~(var3 * 8) >= ~var11 && var11 < var3 * 8 + 8 && var4 * 8 <= var12 && var12 < var4 * 8 + 8) {
                                byte var13 = arg1.method646(122);
                                if (var13 != 0) {
                                    if (class211.field3567[var10][var9] == null) {
                                        class211.field3567[var10][var9] = new byte[4096];
                                    }
                                    class211.field3567[var10][var9][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method646(-95);
                                    if (class24.field384[var10][var9] == null) {
                                        class24.field384[var10][var9] = new byte[4096];
                                    }
                                    class24.field384[var10][var9][(-var12 + 63 << 6) - -var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; ~(var2 ? 64 : 4096) < ~var15; ++var15) {
                        byte var16 = arg1.method646(76);
                        if (var16 != 0) {
                            ++arg1.field1762;
                        }
                    }
                }
            }
            ++field3656;
            return;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        if (arg2 != -1) {
            method1441(28, -112);
        }
        ++field3661;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 3) {
                    this.field3663 = arg1.method669((byte) 36);
                }
            } else {
                this.field3657 = arg1.method669((byte) 36);
            }
        } else {
            this.field3655 = arg1.method669((byte) 36);
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
    public class217() {
        super(0, true);
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V")
    public final void method22(int arg0) {
        if (arg0 > 66) {
            class76.method465(96);
            ++field3658;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        ++field3662;
        if (arg0 < 39) {
            return null;
        } else {
            int[] var3 = super.field4425.method992(17118, arg1);
            if (super.field4425.field2448) {
                int var4 = class206.field3389[arg1];
                int var5 = var4 + -2048 >> 1;
                for (int var6 = 0; class53.field929 > var6; ++var6) {
                    int var7 = class175.field2883[var6];
                    int var8 = var7 + -2048 >> 1;
                    int var9;
                    if (~this.field3655 == -1) {
                        var9 = (-var4 + var7) * this.field3663;
                    } else {
                        int var10 = var8 * var8 - -(var5 * var5) >> 12;
                        int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                        var9 = (int) ((double) (this.field3663 * var11) * 3.141592653589793D);
                    }
                    int var12 = var9 - (-4096 & var9);
                    if (~this.field3657 == -1) {
                        var12 = class156.field2613[var12 >> 4 & 255] + 4096 >> 1;
                    } else if (~this.field3657 == -3) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                    var3[var6] = var12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
    public static void method1444(boolean arg0) {
        field3665 = null;
        field3659 = null;
        if (arg0) {
            field3665 = null;
        }
        field3654 = null;
    }
}
