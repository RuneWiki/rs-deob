import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class241 extends class34 {

    @OriginalMember(owner = "client!il", name = "Q", descriptor = "I")
    private int field3740 = 0;

    @OriginalMember(owner = "client!il", name = "P", descriptor = "I")
    private int field3739 = 2048;

    @OriginalMember(owner = "client!il", name = "W", descriptor = "I")
    private int field3746 = 5;

    @OriginalMember(owner = "client!il", name = "R", descriptor = "I")
    private int field3741 = 2;

    @OriginalMember(owner = "client!il", name = "ab", descriptor = "I")
    private int field3750 = 5;

    @OriginalMember(owner = "client!il", name = "V", descriptor = "I")
    private int field3745 = 1;

    @OriginalMember(owner = "client!il", name = "Z", descriptor = "[S")
    private short[] field3749 = new short[512];

    @OriginalMember(owner = "client!il", name = "gb", descriptor = "[B")
    private byte[] field3756 = new byte[512];

    @OriginalMember(owner = "client!il", name = "U", descriptor = "[I")
    public static int[] field3744 = new int[64];

    @OriginalMember(owner = "client!il", name = "eb", descriptor = "[I")
    public static int[] field3754 = new int[5];

    @OriginalMember(owner = "client!il", name = "T", descriptor = "Ljava/lang/String;")
    public static String field3743 = "Select";

    @OriginalMember(owner = "client!il", name = "fb", descriptor = "Z")
    public static boolean field3755 = true;

    @OriginalMember(owner = "client!il", name = "S", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!il", name = "Y", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!il", name = "cb", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!il", name = "db", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!il", name = "X", descriptor = "Lni;")
    public static class52 field3747;

    @OriginalMember(owner = "client!il", name = "bb", descriptor = "[[I")
    public static int[][] field3751;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(B)V")
    public static void method1648(byte arg0) {
        field3751 = null;
        field3744 = null;
        field3754 = null;
        field3743 = null;
        field3747 = null;
        if (arg0 != -2) {
            method1649(97, 3, -111, -103, -86, 67, -15, -33, -114, -40, -122, -48, -31, -96, -84, -37, -22, 53, -73, -125);
        }
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        ++field3748;
        if (arg0 <= 75) {
            return null;
        } else {
            int[] var3 = super.field610.method228(24856, arg1);
            if (super.field610.field597) {
                int var4 = class199.field2985[arg1] * this.field3750 + 2048;
                int var5 = var4 >> 12;
                int var6 = var5 + 1;
                for (int var7 = 0; ~class226.field3527 < ~var7; ++var7) {
                    class82.field1272 = Integer.MAX_VALUE;
                    class236.field3634 = Integer.MAX_VALUE;
                    class147.field2128 = Integer.MAX_VALUE;
                    class76.field1216 = Integer.MAX_VALUE;
                    int var8 = class112.field1716[var7] * this.field3746 + 2048;
                    int var9 = var8 >> 12;
                    int var10 = var9 + 1;
                    for (int var11 = var5 + -1; ~var11 >= ~var6; ++var11) {
                        int var13 = this.field3756[255 & (var11 < this.field3750 ? var11 : -this.field3750 + var11)] & 255;
                        for (int var14 = var9 + -1; ~var10 <= ~var14; ++var14) {
                            int var15 = (this.field3756[255 & (~this.field3746 < ~var14 ? var14 : var14 - this.field3746) + var13] & 255) * 2;
                            int var27 = var15 + 1;
                            int var16 = -this.field3749[var15] - ((var14 << 12) - var8);
                            int var17 = var4 - ((var11 << 12) + this.field3749[var27]);
                            int var18 = this.field3745;
                            int var19;
                            if (~var18 != -2) {
                                if (~var18 != -4) {
                                    if (var18 != 4) {
                                        if (var18 != 5) {
                                            if (~var18 == -3) {
                                                var19 = (~var16 > -1 ? -var16 : var16) + (~var17 <= -1 ? var17 : -var17);
                                            } else {
                                                var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)));
                                            }
                                        } else {
                                            int var20 = var16 * var16;
                                            int var21 = var17 * var17;
                                            var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 - -var21) / 1.6777216E7F))) * 4096.0D);
                                        }
                                    } else {
                                        int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)));
                                        int var23 = (int) (Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                        int var24 = var22 + var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = var17 < 0 ? -var17 : var17;
                                    int var26 = var16 >= 0 ? var16 : -var16;
                                    var19 = var26 <= var25 ? var25 : var26;
                                }
                            } else {
                                var19 = var16 * var16 + var17 * var17 >> 12;
                            }
                            if (~class76.field1216 >= ~var19) {
                                if (class147.field2128 > var19) {
                                    class82.field1272 = class236.field3634;
                                    class236.field3634 = class147.field2128;
                                    class147.field2128 = var19;
                                } else if (~class236.field3634 >= ~var19) {
                                    if (~class82.field1272 < ~var19) {
                                        class82.field1272 = var19;
                                    }
                                } else {
                                    class82.field1272 = class236.field3634;
                                    class236.field3634 = var19;
                                }
                            } else {
                                class82.field1272 = class236.field3634;
                                class236.field3634 = class147.field2128;
                                class147.field2128 = class76.field1216;
                                class76.field1216 = var19;
                            }
                        }
                    }
                    int var12 = this.field3741;
                    if (var12 != 0) {
                        if (var12 != 1) {
                            if (var12 != 3) {
                                if (var12 != 4) {
                                    if (~var12 == -3) {
                                        var3[var7] = class147.field2128 - class76.field1216;
                                    }
                                } else {
                                    var3[var7] = class82.field1272;
                                }
                            } else {
                                var3[var7] = class236.field3634;
                            }
                        } else {
                            var3[var7] = class147.field2128;
                        }
                    } else {
                        var3[var7] = class76.field1216;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field3750 = arg2.method407(255);
                                }
                            } else {
                                this.field3746 = arg2.method407(255);
                            }
                        } else {
                            this.field3745 = arg2.method407(arg0 + 249);
                        }
                    } else {
                        this.field3741 = arg2.method407(arg0 ^ 249);
                    }
                } else {
                    this.field3739 = arg2.method423(106);
                }
            } else {
                this.field3740 = arg2.method407(255);
            }
        } else {
            this.field3746 = this.field3750 = arg2.method407(arg0 + 249);
        }
        if (arg0 != 6) {
            this.field3740 = -68;
        }
        ++field3752;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method1649(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class205 var20 = new class205(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; --var21) {
                if (class3.field40[var21][arg1][arg2] == null) {
                    class3.field40[var21][arg1][arg2] = new class201(var21, arg1, arg2);
                }
            }
            class3.field40[arg0][arg1][arg2].field3023 = var20;
        } else if (arg3 != 1) {
            class291 var24 = new class291(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; --var25) {
                if (class3.field40[var25][arg1][arg2] == null) {
                    class3.field40[var25][arg1][arg2] = new class201(var25, arg1, arg2);
                }
            }
            class3.field40[arg0][arg1][arg2].field3015 = var24;
        } else {
            class205 var22 = new class205(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; --var23) {
                if (class3.field40[var23][arg1][arg2] == null) {
                    class3.field40[var23][arg1][arg2] = new class201(var23, arg1, arg2);
                }
            }
            class3.field40[arg0][arg1][arg2].field3023 = var22;
        }
    }

    @OriginalMember(owner = "client!il", name = "f", descriptor = "(I)V")
    private final void method1650(int arg0) {
        Random var2 = new Random((long) this.field3740);
        ++field3742;
        this.field3749 = new short[512];
        if (~this.field3739 < arg0) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field3749[var3] = (short) class18.method129(var2, arg0 + -117, this.field3739);
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "(I)V")
    public final void method62(int arg0) {
        int var2 = -120 % ((arg0 - -2) / 43);
        ++field3753;
        this.field3756 = class82.method641((byte) -102, this.field3740);
        this.method1650(-1);
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
    public class241() {
        super(0, true);
    }
}
