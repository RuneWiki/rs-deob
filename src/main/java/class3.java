import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class3 extends class146 {

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "I")
    public static int field38 = 0;

    @OriginalMember(owner = "client!qd", name = "V", descriptor = "Lcc;")
    private static class209 field43 = class95.method669(121, "flash3:");

    @OriginalMember(owner = "client!qd", name = "T", descriptor = "Lcc;")
    public static class209 field41 = field43;

    @OriginalMember(owner = "client!qd", name = "eb", descriptor = "Lcc;")
    public static class209 field52 = field43;

    @OriginalMember(owner = "client!qd", name = "ab", descriptor = "B")
    public byte field48;

    @OriginalMember(owner = "client!qd", name = "S", descriptor = "I")
    public int field40;

    @OriginalMember(owner = "client!qd", name = "U", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!qd", name = "W", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!qd", name = "X", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!qd", name = "Y", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!qd", name = "cb", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!qd", name = "db", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "Ltf;")
    public class106 field39;

    @OriginalMember(owner = "client!qd", name = "bb", descriptor = "Lsj;")
    public static class49 field49;

    @OriginalMember(owner = "client!qd", name = "Z", descriptor = "[S")
    public static short[] field47;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "(I)I")
    public final int method11(int arg0) {
        if (arg0 != 100) {
            method14(true);
        }
        ++field44;
        return this.field39 == null ? 0 : this.field39.field2085 * 100 / (this.field39.field2108.length + -this.field48);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)[B")
    public final byte[] method12(boolean arg0) {
        if (arg0) {
            field52 = null;
        }
        ++field42;
        if (!super.field2685 && ~(this.field39.field2108.length + -this.field48) >= ~this.field39.field2085) {
            return this.field39.field2108;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "(I)V")
    public static final void method13(int arg0) {
        class50.field984 = new class42[class142.field2625.method359(108)][];
        if (arg0 == 3457795) {
            class59.field1189 = new boolean[class142.field2625.method359(125)];
            ++field45;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(Z)V")
    public static void method14(boolean arg0) {
        field52 = null;
        if (!arg0) {
            method14(false);
        }
        field49 = null;
        field41 = null;
        field47 = null;
        field43 = null;
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(II)I")
    public static int method15(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(IIIIII)V")
    public static final void method16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field50;
        long var6 = class227.method1598(arg1, arg2, arg4);
        if (~var6 != -1L) {
            int var8 = (int) var6 >> 20 & 3;
            int var9 = (517751 & (int) var6) >> 14;
            int var10 = (int) (var6 >>> 32) & Integer.MAX_VALUE;
            class218 var11 = class245.method1711(27093, var10);
            if (~var11.field3939 != 0) {
                int var12 = var11.field3912;
                class194 var13 = null;
                if (var11.field3924) {
                    if (var8 != 0) {
                        if (var8 == 1) {
                            var12 = var11.field3916;
                            var13 = class70.field1333[var11.field3939];
                        } else if (var8 == 2) {
                            var13 = class185.field3336[var11.field3939];
                        } else if (var8 == 3) {
                            var12 = var11.field3916;
                            var13 = class170.field3112[var11.field3939];
                        }
                    } else {
                        var13 = class264.field4737[var11.field3939];
                    }
                } else {
                    var13 = class264.field4737[var11.field3939];
                }
                if (var13 != null) {
                    var13.method1330(arg2 * 4 + 48, (-arg4 + 104 + -var12) * 4 + 48);
                }
            } else {
                int[] var14 = class4.field60;
                int var15 = arg0;
                int var16 = (-arg4 + 103) * 512 * 4 + 24624 - -(arg2 * 4);
                if (var6 > 0L) {
                    var15 = arg3;
                }
                if (~var9 == -1 || var9 == 2) {
                    if (var8 == 0) {
                        var14[var16] = var15;
                        var14[var16 + 512] = var15;
                        var14[var16 + 1024] = var15;
                        var14[var16 + 1536] = var15;
                    } else if (var8 != 1) {
                        if (~var8 == -3) {
                            var14[var16 - -3] = var15;
                            var14[var16 + 512 - -3] = var15;
                            var14[var16 - -1027] = var15;
                            var14[var16 - -3 + 1536] = var15;
                        } else if (~var8 == -4) {
                            var14[var16 - -1536] = var15;
                            var14[var16 + 1536 - -1] = var15;
                            var14[var16 + 2 - -1536] = var15;
                            var14[var16 + 3 - -1536] = var15;
                        }
                    } else {
                        var14[var16] = var15;
                        var14[var16 + 1] = var15;
                        var14[var16 + 2] = var15;
                        var14[var16 + 3] = var15;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var14[var16] = var15;
                    } else if (~var8 == -2) {
                        var14[var16 + 3] = var15;
                    } else if (~var8 == -3) {
                        var14[var16 + 3 + 1536] = var15;
                    } else if (~var8 == -4) {
                        var14[var16 + 1536] = var15;
                    }
                }
                if (~var9 == -3) {
                    if (var8 != 3) {
                        if (~var8 != -1) {
                            if (var8 == 1) {
                                var14[var16 + 3] = var15;
                                var14[var16 + 3 + 512] = var15;
                                var14[var16 + 3 + 1024] = var15;
                                var14[var16 - -3 - -1536] = var15;
                            } else if (var8 == 2) {
                                var14[var16 + 1536] = var15;
                                var14[var16 + 1536 + 1] = var15;
                                var14[var16 + 1536 + 2] = var15;
                                var14[var16 + 3 + 1536] = var15;
                            }
                        } else {
                            var14[var16] = var15;
                            var14[var16 + 1] = var15;
                            var14[var16 + 2] = var15;
                            var14[var16 + 3] = var15;
                        }
                    } else {
                        var14[var16] = var15;
                        var14[var16 + 512] = var15;
                        var14[var16 + 1024] = var15;
                        var14[var16 + 1536] = var15;
                    }
                }
            }
        }
        long var17 = class278.method1882(arg1, arg2, arg4);
        if (var17 != 0L) {
            int var19 = 3 & (int) var17 >> 20;
            int var20 = 31 & (int) var17 >> 14;
            int var21 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            class218 var22 = class245.method1711(27093, var21);
            if (~var22.field3939 == 0) {
                if (~var20 == -10) {
                    int var23 = 15658734;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int[] var24 = class4.field60;
                    int var25 = arg2 * 4 + (24624 - -((-arg4 + 103) * 4 * 512));
                    if (~var19 != -1 && ~var19 != -3) {
                        var24[var25] = var23;
                        var24[var25 + 1 + 512] = var23;
                        var24[var25 - -2 + 1024] = var23;
                        var24[var25 + 1536 + 3] = var23;
                    } else {
                        var24[var25 + 1536] = var23;
                        var24[var25 + 1024 - -1] = var23;
                        var24[var25 + 512 - -2] = var23;
                        var24[var25 - -3] = var23;
                    }
                }
            } else {
                class194 var26 = null;
                int var27 = var22.field3912;
                if (!var22.field3924) {
                    var26 = class264.field4737[var22.field3939];
                } else if (~var19 != -1) {
                    if (~var19 != -2) {
                        if (~var19 == -3) {
                            var26 = class185.field3336[var22.field3939];
                        } else if (var19 == 3) {
                            var27 = var22.field3916;
                            var26 = class170.field3112[var22.field3939];
                        }
                    } else {
                        var27 = var22.field3916;
                        var26 = class70.field1333[var22.field3939];
                    }
                } else {
                    var26 = class264.field4737[var22.field3939];
                }
                if (var26 != null) {
                    var26.method1330(48 - -(arg2 * 4), (104 - (arg4 - -var27)) * 4 + 48);
                }
            }
        }
        if (arg5 <= 18) {
            method13(-46);
        }
        long var28 = class275.method1870(arg1, arg2, arg4);
        if (var28 != 0L) {
            int var30 = (3457795 & (int) var28) >> 20;
            int var31 = (int) (var28 >>> 32) & Integer.MAX_VALUE;
            class218 var32 = class245.method1711(27093, var31);
            if (var32.field3939 != -1) {
                class194 var33 = null;
                int var34 = var32.field3912;
                if (var32.field3924) {
                    if (var30 == 0) {
                        var33 = class264.field4737[var32.field3939];
                    } else if (~var30 == -2) {
                        var34 = var32.field3916;
                        var33 = class70.field1333[var32.field3939];
                    } else if (var30 == 2) {
                        var33 = class185.field3336[var32.field3939];
                    } else if (var30 == 3) {
                        var33 = class170.field3112[var32.field3939];
                        var34 = var32.field3916;
                    }
                } else {
                    var33 = class264.field4737[var32.field3939];
                }
                if (var33 != null) {
                    var33.method1330(arg2 * 4 + 48, (-arg4 - var34 + 104) * 4 + 48);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V")
    public static final void method17(byte arg0) {
        if (arg0 > -23) {
            field38 = 4;
        }
        ++field51;
        int var1 = class209.field3779;
        int var2 = -class25.field442 + -var1 + class117.field2337;
        int var3 = class50.field989;
        int var4 = -class50.field981 + class234.field4220 - var3;
        if (var1 > 0 || ~var2 < -1 || var3 > 0 || var4 > 0) {
            try {
                Container var5;
                if (class84.field1682 == null) {
                    if (class230.field4176 != null) {
                        var5 = class230.field4176;
                    } else {
                        var5 = class230.field4187.field2638;
                    }
                } else {
                    var5 = class84.field1682;
                }
                int var6 = 0;
                int var7 = 0;
                if (class230.field4176 == var5) {
                    Insets var8 = class230.field4176.getInsets();
                    var6 = var8.left;
                    var7 = var8.top;
                }
                Graphics var9 = var5.getGraphics();
                var9.setColor(Color.black);
                if (~var1 < -1) {
                    var9.fillRect(var6, var7, var1, class234.field4220);
                }
                if (var3 > 0) {
                    var9.fillRect(var6, var7, class117.field2337, var3);
                }
                if (~var2 < -1) {
                    var9.fillRect(-var2 + class117.field2337 + var6, var7, var2, class234.field4220);
                }
                if (~var4 < -1) {
                    var9.fillRect(var6, var7 - -class234.field4220 + -var4, class117.field2337, var4);
                    return;
                }
            } catch (Exception var10) {
                return;
            }
        }
    }
}
