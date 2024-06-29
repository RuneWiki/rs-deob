import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class109 extends class182 {

    @OriginalMember(owner = "client!fj", name = "W", descriptor = "I")
    private int field1795 = 10;

    @OriginalMember(owner = "client!fj", name = "X", descriptor = "I")
    private int field1796 = 0;

    @OriginalMember(owner = "client!fj", name = "cb", descriptor = "I")
    private int field1801 = 2048;

    @OriginalMember(owner = "client!fj", name = "Q", descriptor = "I")
    public static int field1789 = -1;

    @OriginalMember(owner = "client!fj", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field1798 = "Attack";

    @OriginalMember(owner = "client!fj", name = "S", descriptor = "Lhk;")
    public static class214 field1791 = new class214();

    @OriginalMember(owner = "client!fj", name = "O", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!fj", name = "P", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!fj", name = "T", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!fj", name = "U", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!fj", name = "V", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!fj", name = "Y", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!fj", name = "ab", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!fj", name = "db", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!fj", name = "eb", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!fj", name = "R", descriptor = "[I")
    private int[] field1790;

    @OriginalMember(owner = "client!fj", name = "bb", descriptor = "[I")
    private int[] field1800;

    @OriginalMember(owner = "client!fj", name = "fb", descriptor = "[Ljava/lang/String;")
    public static String[] field1804;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "(I)V")
    public static void method814(int arg0) {
        field1791 = null;
        if (arg0 > -43) {
            method814(19);
        }
        field1804 = null;
        field1798 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method815(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1787;
        if (arg1 >= 1 && arg5 >= 1 && arg1 <= 102 && arg5 <= 102) {
            if (!class136.method1011(false) && (2 & class67.field1132[0][arg1][arg5]) == 0) {
                int var8 = arg0;
                if (~(8 & class67.field1132[arg0][arg1][arg5]) != -1) {
                    var8 = 0;
                }
                if (class73.field1286 != var8) {
                    return;
                }
            }
            int var9 = arg0;
            if (~arg0 > -4 && (2 & class67.field1132[1][arg1][arg5]) == 2) {
                var9 = arg0 + 1;
            }
            class16.method92(arg1, arg5, arg2, var9, -1394, class225.field3790[arg0], arg0);
            if (~arg7 <= -1) {
                boolean var10 = class162.field2636;
                class162.field2636 = true;
                class72.method510(arg5, -114, false, arg0, arg1, false, class225.field3790[arg0], arg4, arg7, var9, arg3);
                class162.field2636 = var10;
            }
        }
        if (arg6 < 84) {
            method814(42);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method816(int arg0, String arg1) {
        ++field1799;
        if (arg0 < 5) {
            field1798 = null;
        }
        if (!arg1.equals("")) {
            ++class143.field2354;
            class236.field3980.method640((byte) 97, 255);
            class236.field3980.method1780(class73.method517(-1, arg1), 119);
            class236.field3980.method1786(-25149, arg1);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method817(int arg0, int arg1) {
        ++field1793;
        if (arg1 < 100000) {
            return "<col=ffff00>" + arg1 + "</col>";
        } else if (~arg1 > -10000001) {
            return "<col=ffffff>" + arg1 / 1000 + class115.field1957 + "</col>";
        } else {
            if (arg0 != -21832) {
                field1789 = 52;
            }
            return "<col=00ff80>" + arg1 / 1000000 + class296.field4850 + "</col>";
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        ++field1794;
        if (arg0) {
            this.field1795 = 34;
        }
        int[] var3 = super.field2911.method77(arg1, -85);
        if (super.field2911.field287) {
            int var4 = class66.field1112[arg1];
            if (~this.field1796 != -1) {
                for (int var5 = 0; ~class4.field116 < ~var5; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class207.field3415[var5];
                    int var9 = this.field1796;
                    if (var9 != 1) {
                        if (var9 != 2) {
                            if (~var9 == -4) {
                                var6 = 2048 - -(-var4 + var8 >> 1);
                            }
                        } else {
                            var6 = (var8 - (-var4 + 4096) >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; ~var10 > ~this.field1795; ++var10) {
                        if (~var6 <= ~this.field1800[var10] && ~var6 > ~this.field1800[var10 + 1]) {
                            if (~this.field1790[var10] < ~var6) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~this.field1795 < ~var12; ++var12) {
                    if (var4 >= this.field1800[var12] && ~var4 > ~this.field1800[var12 + 1]) {
                        if (~var4 > ~this.field1790[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class75.method535(var3, 0, class4.field116, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        ++field1797;
        if (arg0) {
            method814(88);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field1796 = arg1.method1802((byte) -116);
                }
            } else {
                this.field1801 = arg1.method1821((byte) 51);
            }
        } else {
            this.field1795 = arg1.method1802((byte) 29);
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
    public class109() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "(I)V")
    public final void method469(int arg0) {
        ++field1803;
        if (arg0 == -1) {
            this.method818((byte) -28);
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)V")
    private final void method818(byte arg0) {
        if (arg0 != -28) {
            field1802 = -43;
        }
        ++field1792;
        this.field1790 = new int[this.field1795 + 1];
        int var2 = 4096 / this.field1795;
        int var3 = 0;
        this.field1800 = new int[this.field1795 + 1];
        int var4 = this.field1801 * var2 >> 12;
        for (int var5 = 0; this.field1795 > var5; ++var5) {
            this.field1800[var5] = var3;
            this.field1790[var5] = var3 - -var4;
            var3 += var2;
        }
        this.field1800[this.field1795] = 4096;
        this.field1790[this.field1795] = this.field1790[0] + 4096;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILkm;)V")
    public static final void method819(int arg0, class230 arg1) {
        ++field1788;
        short var2 = 256;
        for (int var3 = 0; var3 < class160.field2616.length; ++var3) {
            class160.field2616[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; ++var4) {
            int var16 = (int) ((double) var2 * 128.0D * Math.random());
            class160.field2616[var16] = (int) (284.0D * Math.random());
        }
        if (arg0 >= -13) {
            method815(-83, 123, 113, 111, 82, 30, -72, -79);
        }
        for (int var5 = 0; ~var5 > -21; ++var5) {
            for (int var12 = 1; ~var12 > ~(var2 + -1); ++var12) {
                for (int var14 = 1; ~var14 > -128; ++var14) {
                    int var15 = var14 - -(var12 << 7);
                    class110.field1824[var15] = (class160.field2616[var15 - -128] + class160.field2616[var15 + -128] + class160.field2616[var15 - -1] + class160.field2616[var15 + -1]) / 4;
                }
            }
            int[] var13 = class160.field2616;
            class160.field2616 = class110.field1824;
            class110.field1824 = var13;
        }
        if (arg1 != null) {
            int var6 = 0;
            for (int var7 = 0; arg1.field4235 > var7; ++var7) {
                for (int var8 = 0; ~var8 > ~arg1.field4225; ++var8) {
                    if (~arg1.field3913[var6++] != -1) {
                        int var9 = var8 + 16 - -arg1.field4231;
                        int var10 = var7 + 16 + arg1.field4229;
                        int var11 = (var10 << 7) + var9;
                        class160.field2616[var11] = 0;
                    }
                }
            }
        }
    }
}
