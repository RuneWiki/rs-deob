import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class256 extends class694 {

    @OriginalMember(owner = "client!sm", name = "J", descriptor = "I")
    private int field3596 = 16;

    @OriginalMember(owner = "client!sm", name = "N", descriptor = "I")
    private int field3600 = 0;

    @OriginalMember(owner = "client!sm", name = "K", descriptor = "I")
    private int field3597 = 2000;

    @OriginalMember(owner = "client!sm", name = "H", descriptor = "I")
    private int field3594 = 0;

    @OriginalMember(owner = "client!sm", name = "O", descriptor = "I")
    private int field3601 = 4096;

    @OriginalMember(owner = "client!sm", name = "F", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!sm", name = "G", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!sm", name = "I", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!sm", name = "L", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!sm", name = "M", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!sm", name = "P", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        ++field3595;
        if (arg0 <= 112) {
            this.field3594 = -81;
        }
        int[] var3 = super.field9751.method2712(arg1, (byte) 118);
        if (super.field9751.field6674) {
            int var4 = this.field3601 >> 1;
            int[][] var5 = super.field9751.method2717(0);
            Random var6 = new Random((long) this.field3600);
            for (int var7 = 0; ~this.field3597 < ~var7; ++var7) {
                int var8 = ~this.field3601 >= -1 ? this.field3594 : this.field3594 + -var4 + class433.method2492((byte) 0, var6, this.field3601);
                int var9 = (var8 & 4084) >> 4;
                int var10 = class433.method2492((byte) 0, var6, class465.field6544);
                int var11 = class433.method2492((byte) 0, var6, class250.field3529);
                int var12 = (class388.field5445[var9] * this.field3596 >> 12) + var10;
                int var13 = (class391.field5476[var9] * this.field3596 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = var12 - var10;
                if (var15 != 0 || var14 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (var10 > var12) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = var13 - var11;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 - (class433.method2492((byte) 0, var6, 4096) >> 2);
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var27 = var13 <= var11 ? -1 : 1;
                    for (int var28 = var10; ~var28 > ~var12; ++var28) {
                        int var29 = var26 - (-((-var10 + var28) * var25) + -1024);
                        int var30 = var28 & class168.field2537;
                        int var31 = class384.field5383 & var21;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        var24 += var23;
                        if (var24 > 0) {
                            var24 += -var22;
                            var21 -= -var27;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZZI)V")
    public static final void method1570(boolean arg0, boolean arg1, int arg2) {
        if (arg1) {
            ++class114.field1539;
            class18.method94(true);
        }
        ++field3593;
        if (arg2 <= -2) {
            if (arg0) {
                ++class654.field9231;
                class220.method1416((byte) 102);
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "(I)V")
    public final void method40(int arg0) {
        if (arg0 > 5) {
            class280.method1698(123);
            ++field3598;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILjr;B)V")
    public final void method19(int arg0, class96 arg1, byte arg2) {
        int var4 = 54 / ((arg2 - 58) / 63);
        ++field3592;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 == -5) {
                            this.field3601 = arg1.method743((byte) -89);
                        }
                    } else {
                        this.field3594 = arg1.method743((byte) -30);
                    }
                } else {
                    this.field3596 = arg1.method718(85);
                }
            } else {
                this.field3597 = arg1.method743((byte) -20);
            }
        } else {
            this.field3600 = arg1.method718(-107);
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V")
    public class256() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZIILoo;II)V")
    public static final void method1571(boolean arg0, int arg1, int arg2, class572 arg3, int arg4, int arg5) {
        ++field3599;
        if (arg3.field7688 != -1 || arg3.field7683 != null) {
            int var6 = 0;
            int var7 = class274.field3872.field905 * arg3.field7696 >> 8;
            if (~arg3.field7693 > ~arg4) {
                var6 += -arg3.field7693 + arg4;
            } else if (~arg3.field7691 < ~arg4) {
                var6 += arg3.field7691 - arg4;
            }
            if (arg3.field7685 >= arg1) {
                if (arg3.field7701 > arg1) {
                    var6 += -arg1 + arg3.field7701;
                }
            } else {
                var6 += arg1 - arg3.field7685;
            }
            if (~arg3.field7686 != -1 && ~(var6 + -256) >= ~arg3.field7686 && ~class274.field3872.field905 != -1 && arg3.field7708 == arg5) {
                var6 -= 256;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (arg0) {
                    int var8 = (-var6 + arg3.field7686) * var7 / arg3.field7686;
                    if (arg3.field7702 == null) {
                        if (~arg3.field7688 <= -1) {
                            if (!arg3.field7707) {
                                class90 var9 = class90.method671(class417.field5882, arg3.field7688, 0);
                                if (var9 != null) {
                                    class59 var10 = var9.method672().method504(class182.field2682);
                                    class559 var11 = class559.method3078(var10, 100, var8);
                                    var11.method3100(-1);
                                    class135.field1907.method3310(var11);
                                    arg3.field7702 = var11;
                                }
                            } else {
                                if (arg3.field7687 == null) {
                                    arg3.field7687 = class111.method834(class465.field6542, arg3.field7688);
                                }
                                if (arg3.field7687 != null) {
                                    if (arg3.field7703 == null) {
                                        arg3.field7703 = arg3.field7687.method830(new int[] { 22050 });
                                    }
                                    if (arg3.field7703 != null) {
                                        class559 var12 = class559.method3078(arg3.field7703, 100, var8);
                                        var12.method3100(-1);
                                        class135.field1907.method3310(var12);
                                        arg3.field7702 = var12;
                                    }
                                }
                            }
                        }
                    } else {
                        arg3.field7702.method3099(var8);
                    }
                    if (arg3.field7704 == null) {
                        if (arg3.field7683 != null && ~(arg3.field7681 -= arg2) >= -1) {
                            if (arg3.field7709) {
                                if (arg3.field7705 == null) {
                                    int var13 = (int) (Math.random() * (double) arg3.field7683.length);
                                    arg3.field7705 = class111.method834(class465.field6542, arg3.field7683[var13]);
                                }
                                if (arg3.field7705 != null) {
                                    if (arg3.field7684 == null) {
                                        arg3.field7684 = arg3.field7705.method830(new int[] { 22050 });
                                    }
                                    if (arg3.field7684 != null) {
                                        class559 var14 = class559.method3078(arg3.field7684, 100, var8);
                                        var14.method3100(0);
                                        class135.field1907.method3310(var14);
                                        arg3.field7704 = var14;
                                        arg3.field7681 = (int) (Math.random() * (double) (-arg3.field7697 + arg3.field7694)) + arg3.field7697;
                                        return;
                                    }
                                }
                            } else {
                                int var15 = (int) (Math.random() * (double) arg3.field7683.length);
                                class90 var16 = class90.method671(class417.field5882, arg3.field7683[var15], 0);
                                if (var16 == null) {
                                    return;
                                }
                                class59 var17 = var16.method672().method504(class182.field2682);
                                class559 var18 = class559.method3078(var17, 100, var8);
                                var18.method3100(0);
                                class135.field1907.method3310(var18);
                                arg3.field7704 = var18;
                                arg3.field7681 = (int) ((double) (-arg3.field7697 + arg3.field7694) * Math.random()) + arg3.field7697;
                            }
                            return;
                        }
                    } else {
                        arg3.field7704.method3099(var8);
                        if (arg3.field7704.method2972(1)) {
                            return;
                        }
                        arg3.field7704 = null;
                        arg3.field7705 = null;
                        arg3.field7684 = null;
                    }
                }
            } else {
                if (arg3.field7702 != null) {
                    class135.field1907.method3309(arg3.field7702);
                    arg3.field7703 = null;
                    arg3.field7687 = null;
                    arg3.field7702 = null;
                }
                if (arg3.field7704 != null) {
                    class135.field1907.method3309(arg3.field7704);
                    arg3.field7705 = null;
                    arg3.field7704 = null;
                    arg3.field7684 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZZZ)V")
    public static final void method1572(boolean arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            --class654.field9231;
            if (~class654.field9231 == -1) {
                class35.field433 = null;
            }
        }
        if (arg2) {
            --class114.field1539;
            if (~class114.field1539 == -1) {
                class145.field2153 = null;
            }
        }
        if (!arg0) {
            ++field3602;
        }
    }
}
