import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class41 extends class642 {

    @OriginalMember(owner = "client!qga", name = "H", descriptor = "I")
    private int field611 = 4096;

    @OriginalMember(owner = "client!qga", name = "D", descriptor = "I")
    private int field608 = 0;

    @OriginalMember(owner = "client!qga", name = "J", descriptor = "Lrf;")
    public static class157 field613 = new class157();

    @OriginalMember(owner = "client!qga", name = "I", descriptor = "F")
    public static float field612;

    @OriginalMember(owner = "client!qga", name = "B", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!qga", name = "C", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!qga", name = "E", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!qga", name = "F", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!qga", name = "K", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!qga", name = "L", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!qga", name = "M", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(II)[[I", line = 4)
    public final int[][] method138(int arg0, int arg1) {
        ++field606;
        int[][] var3 = super.field9211.method1068(0, arg1);
        if (arg0 != 21402) {
            this.method3(27, 61);
        }
        if (super.field9211.field2131) {
            int[][] var4 = this.method3657(arg1, true, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class338.field4909 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (this.field608 > var12) {
                    var8[var11] = this.field608;
                } else if (this.field611 >= var12) {
                    var8[var11] = var12;
                } else {
                    var8[var11] = this.field611;
                }
                if (this.field608 <= var13) {
                    if (~this.field611 <= ~var13) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field611;
                    }
                } else {
                    var9[var11] = this.field608;
                }
                if (var14 >= this.field608) {
                    if (this.field611 >= var14) {
                        var10[var11] = var14;
                    } else {
                        var10[var11] = this.field611;
                    }
                } else {
                    var10[var11] = this.field608;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qga", name = "<init>", descriptor = "()V", line = 81)
    public class41() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(ILgk;B)V", line = 90)
    public final void method1(int arg0, class540 arg1, byte arg2) {
        ++field607;
        if (arg2 <= 29) {
            method235(117, (int[]) null, 26, 42, 67);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field9207 = arg1.method3115(29871) == 1;
                }
            } else {
                this.field611 = arg1.method3169(26488);
            }
        } else {
            this.field608 = arg1.method3169(26488);
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(I[IIII)V", line = 135)
    public static final void method235(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        --arg0;
        if (arg2 != 0) {
            method236(50, 75, (class98) null);
        }
        ++field610;
        int var13 = arg3 - 1;
        int var5 = -7 + var13;
        while (arg0 < var5) {
            int var6 = arg0 + 1;
            arg1[var6] = arg4;
            int var7 = var6 + 1;
            arg1[var7] = arg4;
            int var8 = var7 + 1;
            arg1[var8] = arg4;
            int var9 = var8 + 1;
            arg1[var9] = arg4;
            int var10 = var9 + 1;
            arg1[var10] = arg4;
            int var11 = var10 + 1;
            arg1[var11] = arg4;
            int var12 = var11 + 1;
            arg1[var12] = arg4;
            arg0 = var12 + 1;
            arg1[arg0] = arg4;
        }
        while (var13 > arg0) {
            ++arg0;
            arg1[arg0] = arg4;
        }
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(II)[I", line = 163)
    public final int[] method3(int arg0, int arg1) {
        ++field614;
        int[] var3 = super.field9216.method1185(arg0, -127);
        if (super.field9216.field2418) {
            int[] var4 = this.method3658((byte) 85, arg0, 0);
            for (int var5 = 0; class338.field4909 > var5; ++var5) {
                int var6 = var4[var5];
                if (this.field608 > var6) {
                    var3[var5] = this.field608;
                } else if (this.field611 >= var6) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field611;
                }
            }
        }
        if (arg1 != -9) {
            method235(83, (int[]) null, -60, 13, -51);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(IILr;)V", line = 206)
    public static final void method236(int arg0, int arg1, class98 arg2) {
        ++field616;
        if (!class512.field7212) {
            class231.field3064 = 0;
        } else {
            if (class47.field745) {
                class652.field9329 = class549.field8093.method1934((byte) -60);
            }
            class607.field8766 = 0;
            class90.field1369 = 0;
            class541.field8022 = 0;
            int[] var3 = arg2.method625();
            class443.field6437 = (int) ((float) var3[2] / 3.0F);
            class111.field1636 = (int) ((float) var3[3] / 3.0F);
            arg2.method610(class353.field5247);
            if (~((int) ((float) class353.field5247[arg0] / 3.0F)) != ~class76.field1228 || (int) ((float) class353.field5247[1] / 3.0F) != class645.field9297) {
                class76.field1228 = (int) ((float) class353.field5247[0] / 3.0F);
                class645.field9297 = (int) ((float) class353.field5247[1] / 3.0F);
                class542.field8028 = class76.field1228 >> 1;
                class205.field2803 = class645.field9297 >> 1;
                class351.field5202 = new int[class76.field1228 * class645.field9297];
            }
            class311.field4577 = arg2.method658();
            class231.field3064 = 0;
            for (int var4 = 0; ~class218.field2907 < ~var4; ++var4) {
                class643.method3662(arg0 + -19717, class262.field3405[var4], arg2, arg1);
            }
            for (int var5 = 0; var5 < class264.field3450; ++var5) {
                class643.method3662(-19717, class405.field6060[var5], arg2, arg1);
            }
            for (int var6 = 0; ~class261.field3398 < ~var6; ++var6) {
                class643.method3662(-19717, class191.field2591[var6], arg2, arg1);
            }
            class56.field890 = 0;
            if (~class231.field3064 < -1) {
                int var7 = class351.field5202.length;
                int var8 = var7 - var7 & 7;
                int var9 = 0;
                while (var8 > var9) {
                    class351.field5202[var9++] = Integer.MAX_VALUE;
                    class351.field5202[var9++] = Integer.MAX_VALUE;
                    class351.field5202[var9++] = Integer.MAX_VALUE;
                    class351.field5202[var9++] = Integer.MAX_VALUE;
                    class351.field5202[var9++] = Integer.MAX_VALUE;
                    class351.field5202[var9++] = Integer.MAX_VALUE;
                    class351.field5202[var9++] = Integer.MAX_VALUE;
                    class351.field5202[var9++] = Integer.MAX_VALUE;
                }
                while (var7 > var9) {
                    class351.field5202[var9++] = Integer.MAX_VALUE;
                }
                class432.field6277 = 1;
                for (int var10 = 0; class231.field3064 > var10; ++var10) {
                    class203 var11 = class619.field8969[var10];
                    class379.method2353(var11.field2775[1], var11.field2773[1], var11.field2775[3], 107, var11.field2773[3], var11.field2775[0], var11.field2765[0], var11.field2773[0], var11.field2765[3], var11.field2765[1]);
                    class379.method2353(var11.field2775[2], var11.field2773[2], var11.field2775[3], 108, var11.field2773[3], var11.field2775[1], var11.field2765[1], var11.field2773[1], var11.field2765[3], var11.field2765[2]);
                }
                class432.field6277 = 2;
            }
            if (class47.field745) {
                class348.field5159 = class549.field8093.method1934((byte) -60) + -class652.field9329;
            }
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(ILpca;)I", line = 309)
    public static final int method237(int arg0, class529 arg1) {
        ++field609;
        if (class283.field3777 != arg1) {
            if (class443.field6428 != arg1) {
                if (class11.field273 != arg1) {
                    if (class475.field6812 == arg1) {
                        return 34166;
                    } else if (arg0 <= 19) {
                        return 15;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    return 34168;
                }
            } else {
                return 34167;
            }
        } else {
            return 5890;
        }
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(B)V", line = 344)
    public static void method238(byte arg0) {
        if (arg0 < 70) {
            field613 = null;
        }
        field613 = null;
    }
}
