import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class28 extends class431 {

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
    private int field590 = 0;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "Lqf;")
    private class478 field584 = new class478();

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "Lmq;")
    public static class350 field579 = null;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "Lbu;")
    public static class17 field580;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lrn;I)V", line = 4)
    public static final void method321(class174 arg0, int arg1) {
        ++field583;
        if (arg1 != -5001) {
            field580 = null;
        }
        class410.field6141.method2694(arg0.method1253((byte) -69), false);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLiq;)V", line = 19)
    public final void method322(byte arg0, class429 arg1) {
        int var3 = -62 / ((-34 - arg0) / 41);
        ++field591;
        --super.field6405;
        if (super.field6405 < 0) {
            super.field6405 = 4999;
        }
        super.field6414[super.field6405] = 21;
        super.field6408[super.field6405] = arg1;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Liq;B)V", line = 38)
    public final void method323(class429 arg0, byte arg1) {
        ++field585;
        super.field6414[super.field6409] = 21;
        super.field6408[super.field6409] = arg0;
        ++super.field6409;
        if (arg1 < 20) {
            field579 = null;
        }
        if (super.field6409 >= 5000) {
            super.field6409 = 0;
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(BLiq;)V", line = 57)
    public final void method324(byte arg0, class429 arg1) {
        ++field582;
        super.field6414[super.field6409] = 20;
        if (arg0 != 36) {
            this.method327(-125);
        }
        super.field6408[super.field6409] = arg1;
        ++super.field6409;
        if (~super.field6409 <= -5001) {
            super.field6409 = 0;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)V", line = 75)
    public static final void method325(int arg0, int arg1, int arg2) {
        class429 var3 = class380.field5761[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field6366 != null) {
                var3.field6366 = null;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIIIIII)V", line = 84)
    public static final void method326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field587;
        if (arg7 == arg9 && ~arg3 == ~arg6 && ~arg1 == ~arg8 && arg2 == arg5) {
            class286.method1819(arg8, arg6, (byte) 91, arg4, arg5, arg7);
        } else {
            int var10 = arg7;
            int var11 = arg6;
            int var12 = arg7 * 3;
            int var13 = arg6 * 3;
            int var14 = arg9 * 3;
            int var15 = arg3 * 3;
            int var16 = arg1 * 3;
            int var17 = arg2 * 3;
            int var18 = -var16 + arg8 - -var14 + -arg7;
            int var19 = -var17 + var15 + arg5 - arg6;
            int var20 = var16 - var14 + -var14 + var12;
            int var21 = var17 - var15 - -var13 + -var15;
            int var22 = var14 - var12;
            int var23 = -var13 + var15;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var31 - -var29 >> 12) + arg7;
                int var34 = (var28 - -var32 + var30 >> 12) + arg6;
                class286.method1819(var33, var11, (byte) 93, arg4, var34, var10);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg0 != 16417) {
            method321((class174) null, -105);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V", line = 163)
    public final void method327(int arg0) {
        if (arg0 == 1) {
            ++field592;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V", line = 173)
    public final void method328(int arg0, int arg1) {
        ++field588;
        if (arg0 != 0) {
            this.method323((class429) null, (byte) 11);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V", line = 186)
    public final void method329(byte arg0) {
        if (arg0 >= 32) {
            ++field581;
            while (super.field6409 != super.field6405) {
                this.method330((byte) -88);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V", line = 199)
    private final void method330(byte arg0) {
        ++field586;
        if (arg0 >= -5) {
            this.field590 = -57;
        }
        int var2 = super.field6405++;
        if (~super.field6405 <= -5001) {
            super.field6405 = 0;
        }
        this.field590 = super.field6414[var2];
        Object var3 = super.field6408[var2];
        super.field6408[var2] = null;
        if (~this.field590 == -22) {
            class337.method2162(this.field584, (class429) var3);
        } else if (this.field590 != 20) {
            if (this.field590 >= 30 && this.field590 <= 33) {
                class95.field1609.method300(3000.0F, super.field6407[var2] * 1.5F);
                ((class35) var3).method375(class267.field3846, class388.field5834, class369.field5579, class62.field1078, this.field590 + -30 == 0);
            } else if (this.field590 >= 40 && this.field590 <= 43) {
                class95.field1609.method300(3000.0F, super.field6407[var2] * 1.5F);
                ((class35) var3).method375(class267.field3846, class388.field5834, class369.field5579, class20.field352, ~(this.field590 + -40) == -1);
            } else {
                if (~this.field590 != -23) {
                    if (this.field590 == 23) {
                        class95.field1609.method222();
                        return;
                    }
                    if (~this.field590 == -25) {
                        class95.field1609.method289(0, (class462[]) null);
                        return;
                    }
                } else {
                    class95.field1609.method266(-1, 1583160, 40, 127);
                }
            }
        } else {
            class429 var4 = (class429) var3;
            if (var4.field6370 != null) {
                var4.field6370.method25((byte) 73, class95.field1609);
            }
            if (var4.field6365 != null) {
                var4.field6365.method25((byte) -106, class95.field1609);
            }
            if (var4.field6380 != null) {
                var4.field6380.method25((byte) -110, class95.field1609);
            }
            if (var4.field6367 != null) {
                var4.field6367.method25((byte) -93, class95.field1609);
            }
            if (var4.field6366 != null) {
                var4.field6366.method25((byte) 56, class95.field1609);
            }
            for (class166 var5 = var4.field6364; var5 != null; var5 = var5.field2572) {
                var5.field2576.method25((byte) -106, class95.field1609);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)V", line = 290)
    public final void method331(int arg0, int arg1) {
        ++field589;
        super.field6414[super.field6409] = (byte) arg1;
        int var3 = -9 / ((arg0 - 30) / 48);
        ++super.field6409;
        if (~super.field6409 <= -5001) {
            super.field6409 = 0;
        }
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V", line = 304)
    public static void method332(int arg0) {
        field579 = null;
        if (arg0 <= -37) {
            field580 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(FZILna;B)V", line = 316)
    public final void method333(float arg0, boolean arg1, int arg2, class35 arg3, byte arg4) {
        super.field6414[super.field6409] = (byte) (arg1 ? arg2 + 40 : arg2 + 30);
        int var6 = 85 / ((-63 - arg4) / 57);
        ++field578;
        super.field6408[super.field6409] = arg3;
        super.field6407[super.field6409] = arg0;
        ++super.field6409;
        if (super.field6409 >= 5000) {
            super.field6409 = 0;
        }
    }
}
