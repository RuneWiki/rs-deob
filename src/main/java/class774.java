import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class774 extends class260 {

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "Z")
    public boolean field10658 = false;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "Z")
    private boolean field10660 = true;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "Lmga;")
    public static class739 field10665 = new class739(5, 4);

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field10652;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field10653;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field10654;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field10655;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field10656;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field10657;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public static int field10659;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public static int field10661;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field10662;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public static int field10663;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    public static int field10664;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "I")
    public static int field10666;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
    public static final void method4288(int arg0) {
        class584.field7794 = true;
        if (arg0 != -1) {
            field10665 = null;
        }
        ++field10655;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lfca;)V")
    public class774(class92 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZI)V")
    public final void method4289(boolean arg0, int arg1) {
        this.field10660 = arg0;
        if (arg1 == -23343) {
            ++field10653;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)I")
    public final int method4(int arg0, byte arg1) {
        ++field10664;
        if (!super.field3867.method733(-113).method3992((byte) -37)) {
            return 3;
        } else if (arg0 == 3 && !class250.method1676("jagdx", 4096)) {
            return 3;
        } else {
            int var3 = -35 / ((-53 - arg1) / 50);
            return 2;
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)Z")
    public final boolean method4290(int arg0) {
        int var2 = 52 / ((56 - arg0) / 53);
        ++field10657;
        return super.field3867.method733(-113).method3992((byte) -37);
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)Z")
    public final boolean method4291(int arg0) {
        if (arg0 != 8192) {
            return true;
        } else {
            ++field10662;
            return this.field10660;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)I")
    public final int method8(byte arg0) {
        this.field10658 = true;
        if (arg0 != 4) {
            this.field10658 = true;
        }
        ++field10663;
        return !super.field3867.method733(118).method3992((byte) -37) ? 0 : 2;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIILbh;II)V")
    public static final void method4292(int arg0, int arg1, int arg2, class39 arg3, int arg4, int arg5) {
        ++field10654;
        if (arg3.field592 != -1 || arg3.field620 != null) {
            int var6 = 0;
            if (arg2 > -22) {
                field10661 = 54;
            }
            int var7 = arg3.field594 * class712.field9959.field1280.method3352(78) >> 8;
            if (arg0 > arg3.field604) {
                var6 += -arg3.field604 + arg0;
            } else if (arg0 < arg3.field627) {
                var6 += arg3.field627 - arg0;
            }
            if (~arg5 < ~arg3.field597) {
                var6 += -arg3.field597 + arg5;
            } else if (~arg3.field612 < ~arg5) {
                var6 += arg3.field612 - arg5;
            }
            if (arg3.field617 != 0 && arg3.field617 >= var6 + -256 && ~class712.field9959.field1280.method3352(69) != -1 && arg3.field618 == arg4) {
                var6 -= 256;
                if (~var6 > -1) {
                    var6 = 0;
                }
                int var8 = -arg3.field607 + arg3.field617;
                if (~var8 > -1) {
                    var8 = arg3.field617;
                }
                int var9 = var7;
                int var10 = -arg3.field607 + var6;
                if (var10 > 0 && var8 > 0) {
                    var9 = (var8 - var10) * var7 / var8;
                }
                class551.field7456.method655(-127);
                int var11 = 8192;
                int var12 = (arg3.field627 + arg3.field604) / 2 - arg0;
                int var13 = (arg3.field612 + arg3.field597) / 2 + -arg5;
                if (var12 != 0 || var13 != 0) {
                    int var14 = -class718.field10019 + -4096 + -((int) (Math.atan2((double) var12, (double) var13) * 2607.5945876176133D)) & 16383;
                    if (var14 > 8192) {
                        var14 = -var14 + 16384;
                    }
                    int var15;
                    if (var6 <= 0) {
                        var15 = 8192;
                    } else if (var6 < 4096) {
                        var15 = 8192 - -(var6 * 8192 / 4096);
                    } else {
                        var15 = 16384;
                    }
                    var11 = var14 * var15 / 8192 - -(16384 - var15 >> 1);
                }
                if (arg3.field611 == null) {
                    if (arg3.field592 >= 0) {
                        int var16 = arg3.field613 == 256 && ~arg3.field608 == -257 ? 256 : class791.method4363(arg3.field608, arg3.field613, 2);
                        if (arg3.field595) {
                            if (arg3.field596 == null) {
                                arg3.field596 = class61.method423(class396.field5819, arg3.field592);
                            }
                            if (arg3.field596 != null) {
                                if (arg3.field600 == null) {
                                    arg3.field600 = arg3.field596.method426(new int[] { 22050 });
                                }
                                if (arg3.field600 != null) {
                                    class699 var17 = class699.method3855(arg3.field600, var16, var9 << 6, var11);
                                    var17.method3888(-1);
                                    class686.field9647.method598(var17);
                                    arg3.field611 = var17;
                                }
                            }
                        } else {
                            class14 var18 = class14.method102(class11.field175, arg3.field592, 0);
                            if (var18 != null) {
                                class465 var19 = var18.method105().method2752(class533.field7260);
                                class699 var20 = class699.method3855(var19, var16, var9 << 6, var11);
                                var20.method3888(-1);
                                class686.field9647.method598(var20);
                                arg3.field611 = var20;
                            }
                        }
                    }
                } else {
                    arg3.field611.method3884(var9);
                    arg3.field611.method3889(var11);
                }
                if (arg3.field616 == null) {
                    if (arg3.field620 != null && ~(arg3.field599 -= arg1) >= -1) {
                        int var21 = ~arg3.field613 == -257 && arg3.field608 == 256 ? 256 : (int) (Math.random() * (double) (-arg3.field608 + arg3.field613)) + arg3.field608;
                        if (arg3.field603) {
                            if (arg3.field609 == null) {
                                int var22 = (int) ((double) arg3.field620.length * Math.random());
                                arg3.field609 = class61.method423(class396.field5819, arg3.field620[var22]);
                            }
                            if (arg3.field609 != null) {
                                if (arg3.field621 == null) {
                                    arg3.field621 = arg3.field609.method426(new int[] { 22050 });
                                }
                                if (arg3.field621 != null) {
                                    class699 var23 = class699.method3855(arg3.field621, var21, var9 << 6, var11);
                                    var23.method3888(0);
                                    class686.field9647.method598(var23);
                                    arg3.field599 = arg3.field626 - -((int) ((double) (arg3.field602 - arg3.field626) * Math.random()));
                                    arg3.field616 = var23;
                                    return;
                                }
                            }
                            return;
                        }
                        int var24 = (int) (Math.random() * (double) arg3.field620.length);
                        class14 var25 = class14.method102(class11.field175, arg3.field620[var24], 0);
                        if (var25 != null) {
                            class465 var26 = var25.method105().method2752(class533.field7260);
                            class699 var27 = class699.method3855(var26, var21, var9 << 6, var11);
                            var27.method3888(0);
                            class686.field9647.method598(var27);
                            arg3.field616 = var27;
                            arg3.field599 = arg3.field626 + (int) ((double) (-arg3.field626 + arg3.field602) * Math.random());
                            return;
                        }
                    }
                } else {
                    arg3.field616.method3884(var9);
                    arg3.field616.method3889(var11);
                    if (arg3.field616.method790(1)) {
                        return;
                    }
                    arg3.field616 = null;
                    arg3.field621 = null;
                    arg3.field609 = null;
                }
            } else {
                if (arg3.field611 != null) {
                    class686.field9647.method590(arg3.field611);
                    arg3.field600 = null;
                    arg3.field596 = null;
                    arg3.field611 = null;
                }
                if (arg3.field616 != null) {
                    class686.field9647.method590(arg3.field616);
                    arg3.field609 = null;
                    arg3.field616 = null;
                    arg3.field621 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(ILfca;)V")
    public class774(int arg0, class92 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)I")
    public final int method4293(int arg0) {
        if (arg0 < 3) {
            this.method4293(26);
        }
        ++field10666;
        return super.field3868;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(IB)V")
    public final void method9(int arg0, byte arg1) {
        ++field10656;
        if (arg1 != -107) {
            field10665 = null;
        }
        super.field3868 = arg0;
        this.field10658 = false;
    }

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "(I)V")
    public static void method4294(int arg0) {
        if (arg0 == -32728) {
            field10665 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
    public final void method2(boolean arg0) {
        if (arg0) {
            this.field10658 = true;
        }
        if (!super.field3867.method733(67).method3992((byte) -37)) {
            super.field3868 = 0;
        }
        ++field10659;
        if (super.field3868 < 0 || ~super.field3868 < -6) {
            super.field3868 = this.method8((byte) 4);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[IIIIIII)V")
    public static final void method4295(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 == 5056) {
            ++field10652;
            if (~arg2 < -1 && !class117.method957(-6602, arg2)) {
                throw new IllegalArgumentException("");
            } else if (~arg3 < -1 && !class117.method957(-6602, arg3)) {
                throw new IllegalArgumentException("");
            } else if (~arg4 != -32994) {
                throw new IllegalArgumentException("");
            } else {
                int var8 = 0;
                int var9 = arg2 >= arg3 ? arg3 : arg2;
                int var10 = arg2 >> 1;
                int var11 = arg3 >> 1;
                int[] var12 = arg1;
                int[] var13 = new int[var10 * var11];
                while (true) {
                    OpenGL.glTexImage2Di(arg0, var8, arg7, arg2, arg3, 0, arg4, arg5, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = arg2 + var15;
                    int[] var17 = var13;
                    for (int var18 = 0; var18 < var11; ++var18) {
                        for (int var19 = 0; var19 < var10; ++var19) {
                            int var20 = var12[var15++];
                            int var21 = var12[var16++];
                            int var22 = var12[var15++];
                            int var23 = var20 >> 16 & 255;
                            int var24 = var12[var16++];
                            int var25 = 255 & var20 >> 8;
                            int var26 = var20 & 255;
                            int var27 = var20 >> 24 & 255;
                            int var28 = (255 & var22) + var26;
                            int var29 = (var22 >> 24 & 255) + var27;
                            int var30 = ((var22 & 65507) >> 8) + var25;
                            int var31 = (var22 >> 16 & 255) + var23;
                            int var32 = (var21 >> 24 & 255) + var29;
                            int var33 = ((65493 & var21) >> 8) + var30;
                            int var34 = (var21 >> 16 & 255) + var31;
                            int var35 = (255 & var21) + var28;
                            int var36 = (var24 >> 8 & 255) + var33;
                            int var37 = (255 & var24) + var35;
                            int var38 = (var24 >> 16 & 255) + var34;
                            int var39 = (255 & var24 >> 24) + var32;
                            var13[var14++] = class213.method1409(class440.method2643(var37, 1020) >> 2, class213.method1409(class213.method1409(class440.method2643(var38 << 14, 16711680), class440.method2643(1020, var39) << 22), class440.method2643(65280, var36 << 6)));
                        }
                        var15 += arg2;
                        var16 += arg2;
                    }
                    var13 = var12;
                    arg3 = var11;
                    var12 = var17;
                    arg2 = var10;
                    ++var8;
                    var10 >>= 1;
                    var9 >>= 1;
                    var11 >>= 1;
                }
            }
        }
    }
}
