import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public abstract class class243 extends class55 {

    @OriginalMember(owner = "client!dt", name = "v", descriptor = "Z")
    public boolean field3159;

    @OriginalMember(owner = "client!dt", name = "o", descriptor = "[Ldt;")
    public class243[] field3152;

    @OriginalMember(owner = "client!dt", name = "k", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!dt", name = "l", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!dt", name = "m", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!dt", name = "n", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!dt", name = "p", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!dt", name = "q", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!dt", name = "t", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!dt", name = "u", descriptor = "I")
    public int field3158;

    @OriginalMember(owner = "client!dt", name = "w", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!dt", name = "x", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!dt", name = "z", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!dt", name = "B", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!dt", name = "C", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!dt", name = "s", descriptor = "Loea;")
    public class598 field3156;

    @OriginalMember(owner = "client!dt", name = "A", descriptor = "Lbca;")
    public class661 field3164;

    @OriginalMember(owner = "client!dt", name = "r", descriptor = "Z")
    public static boolean field3155;

    @OriginalMember(owner = "client!dt", name = "y", descriptor = "Z")
    public static boolean field3162;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)[I", line = 3)
    public int[] method5(int arg0, int arg1) {
        if (arg0 != 255) {
            this.field3152 = null;
        }
        field3150++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILji;B)V", line = 17)
    public void method1(int arg0, class611 arg1, byte arg2) {
        if (arg2 <= -92) {
            field3151++;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)I", line = 31)
    public int method1455(int arg0) {
        field3166++;
        int var2 = 27 / ((arg0 + 20) / 33);
        return -1;
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)V", line = 43)
    public void method1456(int arg0) {
        field3163++;
        if (arg0 != 1002) {
            field3162 = true;
        }
        if (this.field3159) {
            this.field3164.method3741(34);
            this.field3164 = null;
        } else {
            this.field3156.method3309(0);
            this.field3156 = null;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(III)[[I", line = 73)
    public final int[][] method1457(int arg0, int arg1, int arg2) {
        if (arg1 != 24431) {
            this.field3164 = null;
        }
        field3157++;
        if (this.field3152[arg2].field3159) {
            int[] var4 = this.field3152[arg2].method5(arg1 - 24176, arg0);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field3152[arg2].method2(-119, arg0);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lcea;BZ)V", line = 107)
    public static final void method1458(class215 arg0, byte arg1, boolean arg2) {
        field3165++;
        if (class43.field470 >= 400) {
            return;
        }
        class274 var3 = arg0.field2589;
        if (arg1 != 55) {
            field3155 = true;
        }
        if (var3.field3616 != null) {
            var3 = var3.method1637(class386.field5455, (byte) 120);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field3624) {
            return;
        }
        String var4 = var3.field3656;
        if (var3.field3623 != 0) {
            String var5 = class639.field8868 == class51.field541 ? class755.field10510.method4201(class723.field10095, (byte) 25) : class755.field10508.method4201(class723.field10095, (byte) 25);
            var4 = var4 + class45.method274(class653.field9086.field1122, var3.field3623, arg1 + 16328) + " (" + var5 + var3.field3623 + ")";
        }
        if (class595.field8291 && !arg2) {
            class135 var6 = class77.field944 == -1 ? null : class482.field6654.method296((byte) 31, class77.field944);
            if ((class372.field5190 & 0x2) != 0 && (var6 == null || var3.method1642(class77.field944, var6.field1718, (byte) 125) != var6.field1718)) {
                class259.field3395++;
                class218.method1237(false, true, (long) arg0.field817, class387.field5461, 0, class719.field10067 + " -> <col=ffff00>" + var4, false, 0, 48, (long) arg0.field817, -1, false, class702.field9857);
            }
        }
        if (!arg2) {
            String[] var7 = var3.field3662;
            if (class219.field2837) {
                var7 = class167.method979(arg1 ^ 0xFFFFFC84, var7);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (var3.field3641 == 0 || !var7[var8].equalsIgnoreCase(class755.field10503.method4201(class723.field10095, (byte) 25)))) {
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 10;
                        }
                        int var10 = class457.field6330;
                        if (var8 == 1) {
                            var9 = 25;
                        }
                        if (var8 == 2) {
                            var9 = 11;
                        }
                        if (var8 == 3) {
                            var9 = 12;
                        }
                        if (var3.field3655 == var8) {
                            var10 = var3.field3670;
                        }
                        if (var8 == 4) {
                            var9 = 17;
                        }
                        if (var3.field3622 == var8) {
                            var10 = var3.field3617;
                        }
                        class388.field5474++;
                        class218.method1237(false, true, (long) arg0.field817, var7[var8].equalsIgnoreCase(class755.field10503.method4201(class723.field10095, (byte) 25)) ? var3.field3604 : var10, 0, "<col=ffff00>" + var4, false, 0, var9, (long) arg0.field817, -1, false, var7[var8]);
                    }
                }
            }
            if (var3.field3641 == 1 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class755.field10503.method4201(class723.field10095, (byte) 25))) {
                        short var12 = 0;
                        if (class653.field9086.field1122 < var3.field3623) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 10;
                        }
                        if (var11 == 1) {
                            var13 = 25;
                        }
                        if (var11 == 2) {
                            var13 = 11;
                        }
                        if (var11 == 3) {
                            var13 = 12;
                        }
                        if (var11 == 4) {
                            var13 = 17;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class218.method1237(false, true, (long) arg0.field817, var3.field3604, 0, "<col=ffff00>" + var4, false, 0, var13, (long) arg0.field817, -1, false, var7[var11]);
                        class205.field2428++;
                    }
                }
            }
        }
        class218.method1237(false, true, (long) arg0.field817, class661.field9240, 0, "<col=ffff00>" + var4, false, 0, 1002, (long) arg0.field817, -1, arg2, class755.field10502.method4201(class723.field10095, (byte) 25));
        class320.field4303++;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)I", line = 268)
    public int method1459(byte arg0) {
        field3160++;
        return arg0 > -119 ? 85 : -1;
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(II)[[I", line = 283)
    public int[][] method2(int arg0, int arg1) {
        field3161++;
        if (arg0 > -76) {
            method1461((byte) 1);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(III)V", line = 295)
    public void method1460(int arg0, int arg1, int arg2) {
        field3153++;
        int var4 = ~this.field3158 == arg2 ? arg0 : this.field3158;
        if (this.field3159) {
            this.field3164 = new class661(var4, arg0, arg1);
        } else {
            this.field3156 = new class598(var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "(B)V", line = 322)
    public static final void method1461(byte arg0) {
        field3148++;
        if (class713.field9949 == 3) {
            class237.method1429(4, false);
        } else if (class713.field9949 == 7) {
            class237.method1429(8, false);
        } else if (class713.field9949 == 10) {
            class237.method1429(11, false);
        }
        int var1 = 83 / ((arg0 - 56) / 55);
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(IZ)V", line = 344)
    public class243(int arg0, boolean arg1) {
        this.field3159 = arg1;
        this.field3152 = new class243[arg0];
    }

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "(III)[I", line = 364)
    public final int[] method1462(int arg0, int arg1, int arg2) {
        field3149++;
        if (arg2 != 0) {
            this.method1456(-48);
        }
        return this.field3152[arg1].field3159 ? this.field3152[arg1].method5(255, arg0) : this.field3152[arg1].method2(-94, arg0)[0];
    }

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "(B)V", line = 386)
    public void method85(byte arg0) {
        if (arg0 != 66) {
            this.field3158 = 121;
        }
        field3154++;
    }
}
