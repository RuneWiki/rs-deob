import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class124 extends class115 {

    @OriginalMember(owner = "client!d", name = "M", descriptor = "I")
    private int field1790 = 0;

    @OriginalMember(owner = "client!d", name = "K", descriptor = "I")
    private int field1789 = 2000;

    @OriginalMember(owner = "client!d", name = "P", descriptor = "I")
    private int field1793 = 0;

    @OriginalMember(owner = "client!d", name = "T", descriptor = "I")
    private int field1797 = 4096;

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "I")
    private int field1794 = 16;

    @OriginalMember(owner = "client!d", name = "R", descriptor = "[S")
    public static short[] field1795 = new short[256];

    @OriginalMember(owner = "client!d", name = "X", descriptor = "Lh;")
    public static class190 field1801 = new class190(16);

    @OriginalMember(owner = "client!d", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field1802 = "Hidden";

    @OriginalMember(owner = "client!d", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field1805 = "shake:";

    @OriginalMember(owner = "client!d", name = "eb", descriptor = "Ljava/lang/String;")
    public static String field1808 = null;

    @OriginalMember(owner = "client!d", name = "cb", descriptor = "I")
    public static int field1806 = 0;

    @OriginalMember(owner = "client!d", name = "fb", descriptor = "Ljava/lang/String;")
    public static String field1809 = "Loading config - ";

    @OriginalMember(owner = "client!d", name = "ab", descriptor = "Lmd;")
    public static class220 field1804 = new class220();

    @OriginalMember(owner = "client!d", name = "N", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!d", name = "O", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!d", name = "S", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!d", name = "U", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!d", name = "V", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!d", name = "W", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!d", name = "Z", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!d", name = "gb", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!d", name = "db", descriptor = "Ljj;")
    public static class130 field1807;

    @OriginalMember(owner = "client!d", name = "J", descriptor = "[I")
    public static int[] field1788;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(B)V")
    public final void method170(byte arg0) {
        int var2 = 120 / ((arg0 - 78) / 42);
        ++field1798;
        class276.method1856((byte) 48);
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V")
    public class124() {
        super(0, true);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        if (arg0 == -1) {
            ++field1791;
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (~arg2 != -3) {
                        if (~arg2 != -4) {
                            if (~arg2 == -5) {
                                this.field1797 = arg1.method756(-29901);
                            }
                        } else {
                            this.field1790 = arg1.method756(-29901);
                        }
                    } else {
                        this.field1794 = arg1.method760(false);
                    }
                } else {
                    this.field1789 = arg1.method756(arg0 + -29900);
                }
            } else {
                this.field1793 = arg1.method760(false);
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IILha;IZ)V")
    public static final void method836(int arg0, int arg1, class267 arg2, int arg3, boolean arg4) {
        class270.method1804(10288);
        class144.method950(arg0, arg1, arg2.field4177 + arg0, arg2.field4051 + arg1);
        ++field1799;
        if (~class30.field423 != -3 && ~class30.field423 != -6 && class277.field4443 != null) {
            int var5 = 464 - class55.field847.field94 / 32;
            int var6 = class55.field847.field45 / 32 + 48;
            int var7 = class245.field3667 - -class183.field2611 & 2047;
            ((class244) class277.field4443).method1302(arg0, arg1, arg2.field4177, arg2.field4051, var6, var5, var7, class282.field4495 + 256, arg2.field4163, arg2.field4136);
            if (class200.field2890 != null) {
                for (int var8 = 0; var8 < class200.field2890.field1204; ++var8) {
                    if (class200.field2890.method515(-1, var8)) {
                        int var9 = (class200.field2890.field1200[var8] + -class113.field1615) * 4 + 2 - class55.field847.field45 / 32;
                        int var10 = (class200.field2890.field1201[var8] + -class95.field1445) * 4 + -(class55.field847.field94 / 32) + 2;
                        int var11 = class18.field261[var7];
                        int var12 = var11 * 256 / (class282.field4495 - -256);
                        int var13 = class18.field259[var7];
                        class198 var14 = class134.field1948;
                        int var15 = var13 * 256 / (class282.field4495 + 256);
                        int var16 = var10 * var15 - var9 * var12 >> 16;
                        int var17 = var9 * var15 + var10 * var12 >> 16;
                        if (class200.field2890.method514(-24866, var8) == 1) {
                            var14 = class258.field3914;
                        }
                        if (~class200.field2890.method514(-24866, var8) == -3) {
                            var14 = class179.field2556;
                        }
                        int var18 = var14.method1264(class200.field2890.field1203[var8], 100);
                        int var19 = var17 - var18 / 2;
                        if (~(-arg2.field4177) >= ~var19 && var19 <= arg2.field4177 && ~(-arg2.field4051) >= ~var16 && arg2.field4051 >= var16) {
                            int var20 = 16777215;
                            if (class200.field2890.field1213[var8] != -1) {
                                var20 = class200.field2890.field1213[var8];
                            }
                            class144.method967(arg2.field4163, arg2.field4136);
                            var14.method1276(class200.field2890.field1203[var8], arg2.field4177 / 2 + var19 + arg0, arg2.field4051 / 2 + arg1 - var16, var18, 50, var20, 0, 256, 1, 0, 0);
                            class144.method957();
                        }
                    }
                }
            }
            for (int var21 = 0; ~var21 > ~class221.field3276; ++var21) {
                int var56 = class26.field367[var21] * 4 + 2 + -(class55.field847.field45 / 32);
                int var57 = class45.field633[var21] * 4 - -2 - class55.field847.field94 / 32;
                class250 var58 = class91.method618(109, class88.field1348[var21]);
                if (var58.field3817 != null) {
                    var58 = var58.method1639(-1);
                    if (var58 == null || ~var58.field3811 == 0) {
                        continue;
                    }
                }
                class61.method404(arg0, var56, arg2, arg1, var57, class37.field556[var58.field3811], 2);
            }
            for (int var22 = 0; var22 < 104; ++var22) {
                for (int var52 = 0; ~var52 > -105; ++var52) {
                    class97 var53 = class162.field2335[class163.field2364][var22][var52];
                    if (var53 != null) {
                        int var54 = var22 * 4 + (2 - class55.field847.field45 / 32);
                        int var55 = var52 * 4 + 2 + -(class55.field847.field94 / 32);
                        class61.method404(arg0, var54, arg2, arg1, var55, class64.field1016[0], 2);
                    }
                }
            }
            for (int var23 = 0; var23 < class51.field756; ++var23) {
                class72 var48 = class82.field1268[class67.field1049[var23]];
                if (var48 != null && var48.method71(false)) {
                    class271 var49 = var48.field1119;
                    if (var49 != null && var49.field4291 != null) {
                        var49 = var49.method1812(0);
                    }
                    if (var49 != null && var49.field4268 && var49.field4240) {
                        int var50 = var48.field45 / 32 - class55.field847.field45 / 32;
                        int var51 = var48.field94 / 32 + -(class55.field847.field94 / 32);
                        if (var49.field4255 == -1) {
                            class61.method404(arg0, var50, arg2, arg1, var51, class64.field1016[1], 2);
                        } else {
                            class61.method404(arg0, var50, arg2, arg1, var51, class37.field556[var49.field4255], 2);
                        }
                    }
                }
            }
            for (int var24 = 0; ~var24 > ~class193.field2770; ++var24) {
                class53 var38 = class194.field2777[class110.field1589[var24]];
                if (var38 != null && var38.method71(false)) {
                    int var39 = var38.field45 / 32 - class55.field847.field45 / 32;
                    int var40 = var38.field94 / 32 + -(class55.field847.field94 / 32);
                    boolean var41 = false;
                    long var42 = class109.method712((byte) -127, var38.field766);
                    for (int var44 = 0; ~class55.field836 < ~var44; ++var44) {
                        if (class95.field1452[var44] == var42 && ~class95.field1439[var44] != -1) {
                            var41 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    for (int var46 = 0; ~class206.field2988 < ~var46; ++var46) {
                        if (class213.field3068[var46].field3851 == var42) {
                            var45 = true;
                            break;
                        }
                    }
                    boolean var47 = false;
                    if (~class55.field847.field788 != -1 && ~var38.field788 != -1 && class55.field847.field788 == var38.field788) {
                        var47 = true;
                    }
                    if (!var41) {
                        if (var45) {
                            class61.method404(arg0, var39, arg2, arg1, var40, class64.field1016[5], 2);
                        } else if (!var47) {
                            class61.method404(arg0, var39, arg2, arg1, var40, class64.field1016[2], 2);
                        } else {
                            class61.method404(arg0, var39, arg2, arg1, var40, class64.field1016[4], 2);
                        }
                    } else {
                        class61.method404(arg0, var39, arg2, arg1, var40, class64.field1016[3], 2);
                    }
                }
            }
            class39[] var25 = class210.field3024;
            for (int var26 = 0; ~var25.length < ~var26; ++var26) {
                class39 var29 = var25[var26];
                if (var29 != null && var29.field574 != 0 && ~(class82.field1267 % 20) > -11) {
                    if (var29.field574 == 1 && ~var29.field578 <= -1 && var29.field578 < class82.field1268.length) {
                        class72 var30 = class82.field1268[var29.field578];
                        if (var30 != null) {
                            int var31 = var30.field45 / 32 - class55.field847.field45 / 32;
                            int var32 = var30.field94 / 32 + -(class55.field847.field94 / 32);
                            class289.method1932(-10, arg1, var31, arg0, var29.field573, var32, arg2);
                        }
                    }
                    if (var29.field574 == 2) {
                        int var33 = (var29.field584 - class113.field1615) * 4 + 2 + -(class55.field847.field45 / 32);
                        int var34 = (-class95.field1445 + var29.field576) * 4 - -2 + -(class55.field847.field94 / 32);
                        class289.method1932(-10, arg1, var33, arg0, var29.field573, var34, arg2);
                    }
                    if (var29.field574 == 10 && ~var29.field578 <= -1 && ~var29.field578 > ~class194.field2777.length) {
                        class53 var35 = class194.field2777[var29.field578];
                        if (var35 != null) {
                            int var36 = var35.field45 / 32 - class55.field847.field45 / 32;
                            int var37 = var35.field94 / 32 + -(class55.field847.field94 / 32);
                            class289.method1932(-10, arg1, var36, arg0, var29.field573, var37, arg2);
                        }
                    }
                }
            }
            if (class103.field1539 != 0) {
                int var27 = class214.field3091 * 4 + 2 + -(class55.field847.field94 / 32);
                int var28 = class103.field1539 * 4 + 2 + -(class55.field847.field45 / 32);
                class61.method404(arg0, var28, arg2, arg1, var27, class27.field398, 2);
            }
            class144.method955(arg2.field4177 / 2 + arg0 + -1, arg1 - (-(arg2.field4051 / 2) - -1), 3, 3, 16777215);
        } else {
            class144.method949(arg0, arg1, 0, arg2.field4163, arg2.field4136);
        }
        class119.field1753[arg3] = arg4;
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        ++field1810;
        if (arg0 != 242152972) {
            return null;
        } else {
            int[] var3 = super.field1705.method463(arg1, false);
            if (super.field1705.field1072) {
                int var4 = this.field1797 >> 1;
                int[][] var5 = super.field1705.method462((byte) -83);
                Random var6 = new Random((long) this.field1793);
                for (int var7 = 0; ~this.field1789 < ~var7; ++var7) {
                    int var8 = this.field1797 > 0 ? this.field1790 + -var4 + class259.method1734(this.field1797, false, var6) : this.field1790;
                    int var9 = class259.method1734(class77.field1178, false, var6);
                    int var10 = (var8 & 4091) >> 4;
                    int var11 = class259.method1734(class192.field2753, false, var6);
                    int var12 = (field1788[var10] * this.field1794 >> 12) + var9;
                    int var13 = var11 - -(class32.field471[var10] * this.field1794 >> 12);
                    int var14 = var12 - var9;
                    int var15 = -var11 + var13;
                    if (~var14 != -1 || ~var15 != -1) {
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (~var14 > -1) {
                            var14 = -var14;
                        }
                        boolean var16 = var14 < var15;
                        if (var16) {
                            int var17 = var12;
                            int var18 = var9;
                            var12 = var13;
                            var13 = var17;
                            var9 = var11;
                            var11 = var18;
                        }
                        if (var12 < var9) {
                            int var19 = var9;
                            int var20 = var11;
                            var9 = var12;
                            var12 = var19;
                            var11 = var13;
                            var13 = var20;
                        }
                        int var21 = var11;
                        int var22 = -var9 + var12;
                        int var23 = -var11 + var13;
                        if (~var23 > -1) {
                            var23 = -var23;
                        }
                        int var24 = 2048 / var22;
                        int var25 = -var22 / 2;
                        int var26 = var11 >= var13 ? -1 : 1;
                        int var27 = -(class259.method1734(4096, false, var6) >> 2) + 1024;
                        for (int var28 = var9; ~var12 < ~var28; ++var28) {
                            var25 += var23;
                            int var29 = (-var9 + var28) * var24 + var27 + 1024;
                            int var30 = var28 & class207.field2992;
                            int var31 = class5.field136 & var21;
                            if (!var16) {
                                var5[var30][var31] = var29;
                            } else {
                                var5[var31][var30] = var29;
                            }
                            if (var25 > 0) {
                                var25 += -var22;
                                var21 += var26;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/lang/String;)Lik;")
    public static final class225 method837(int arg0, String arg1) {
        ++field1800;
        for (class225 var2 = (class225) class14.field216.method656(arg0 + 105); var2 != null; var2 = (class225) class14.field216.method650(125)) {
            if (var2.field3381.equals(arg1)) {
                return var2;
            }
        }
        if (arg0 != 3) {
            method839((byte) 91);
        }
        return null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIBIII)Z")
    public static final boolean method838(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        ++field1792;
        long var8 = class155.method1052(arg3, arg0 + arg7, arg5 - -arg6);
        if (var8 != 0L) {
            int var10 = (3914814 & (int) var8) >> 20;
            int var11 = (int) var8 >> 14 & 31;
            int var12 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
            class250 var13 = class91.method618(115, var12);
            if (var13.field3771 == -1) {
                int var14 = (52736 - arg5 * 512) * 4 + (24624 - -(arg7 * 4));
                int var15 = arg1;
                int[] var16 = class144.field2070;
                if (~var8 < -1L) {
                    var15 = arg2;
                }
                if (var11 == 0 || var11 == 2) {
                    if (~var10 != -1) {
                        if (~var10 != -2) {
                            if (~var10 != -3) {
                                if (~var10 == -4) {
                                    var16[var14 + 1536] = var15;
                                    var16[var14 + 1537] = var15;
                                    var16[var14 + 2 + 1536] = var15;
                                    var16[var14 + 1539] = var15;
                                }
                            } else {
                                var16[var14 + 3] = var15;
                                var16[var14 + 515] = var15;
                                var16[var14 + 1027] = var15;
                                var16[var14 - -3 - -1536] = var15;
                            }
                        } else {
                            var16[var14] = var15;
                            var16[var14 + 1] = var15;
                            var16[var14 + 2] = var15;
                            var16[var14 + 3] = var15;
                        }
                    } else {
                        var16[var14] = var15;
                        var16[var14 + 512] = var15;
                        var16[var14 + 1024] = var15;
                        var16[var14 + 1536] = var15;
                    }
                }
                if (~var11 == -4) {
                    if (var10 != 0) {
                        if (var10 == 1) {
                            var16[var14 + 3] = var15;
                        } else if (~var10 != -3) {
                            if (var10 == 3) {
                                var16[var14 - -1536] = var15;
                            }
                        } else {
                            var16[var14 - -3 + 1536] = var15;
                        }
                    } else {
                        var16[var14] = var15;
                    }
                }
                if (var11 == 2) {
                    if (var10 == 3) {
                        var16[var14] = var15;
                        var16[var14 + 512] = var15;
                        var16[var14 + 1024] = var15;
                        var16[var14 + 1536] = var15;
                    } else if (~var10 == -1) {
                        var16[var14] = var15;
                        var16[var14 + 1] = var15;
                        var16[var14 - -2] = var15;
                        var16[var14 + 3] = var15;
                    } else if (~var10 != -2) {
                        if (~var10 == -3) {
                            var16[var14 + 1536] = var15;
                            var16[var14 + 1536 - -1] = var15;
                            var16[var14 + 1536 - -2] = var15;
                            var16[var14 + 1539] = var15;
                        }
                    } else {
                        var16[var14 + 3] = var15;
                        var16[var14 + 515] = var15;
                        var16[var14 - -3 + 1024] = var15;
                        var16[var14 + 1539] = var15;
                    }
                }
            } else if (!class128.method890(arg6, (byte) -41, arg7, var13, arg5, arg0, var10)) {
                return false;
            }
        }
        if (arg4 != 114) {
            field1807 = null;
        }
        long var17 = class161.method1079(arg3, arg0 + arg7, arg5 + arg6);
        if (var17 != 0L) {
            int var19 = ((int) var17 & 3896430) >> 20;
            int var20 = (517411 & (int) var17) >> 14;
            int var21 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            class250 var22 = class91.method618(arg4 ^ 2, var21);
            if (var22.field3771 == -1) {
                if (~var20 == -10) {
                    int[] var23 = class144.field2070;
                    int var24 = 15658734;
                    int var25 = (-arg5 + 103) * 2048 + arg7 * 4 + 24624;
                    if (~var17 < -1L) {
                        var24 = 15597568;
                    }
                    if (var19 != 0 && ~var19 != -3) {
                        var23[var25] = var24;
                        var23[var25 - -512 + 1] = var24;
                        var23[var25 + 2 + 1024] = var24;
                        var23[var25 + 1539] = var24;
                    } else {
                        var23[var25 + 1536] = var24;
                        var23[var25 + 1025] = var24;
                        var23[var25 + 514] = var24;
                        var23[var25 + 3] = var24;
                    }
                }
            } else if (!class128.method890(arg6, (byte) -41, arg7, var22, arg5, arg0, var19)) {
                return false;
            }
        }
        long var26 = class24.method176(arg3, arg0 + arg7, arg5 + arg6);
        if (var26 != 0L) {
            int var28 = (3919602 & (int) var26) >> 20;
            int var29 = Integer.MAX_VALUE & (int) (var26 >>> 32);
            class250 var30 = class91.method618(121, var29);
            if (~var30.field3771 != 0 && !class128.method890(arg6, (byte) -41, arg7, var30, arg5, arg0, var28)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(B)V")
    public static void method839(byte arg0) {
        field1795 = null;
        field1801 = null;
        field1804 = null;
        field1808 = null;
        field1788 = null;
        field1807 = null;
        if (arg0 == 113) {
            field1802 = null;
            field1805 = null;
            field1809 = null;
        }
    }
}
