import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class258 extends class30 {

    @OriginalMember(owner = "client!uf", name = "Q", descriptor = "I")
    private int field4179 = 1;

    @OriginalMember(owner = "client!uf", name = "R", descriptor = "I")
    private int field4180 = 1;

    @OriginalMember(owner = "client!uf", name = "K", descriptor = "[I")
    public static int[] field4173 = new int[16384];

    @OriginalMember(owner = "client!uf", name = "O", descriptor = "[I")
    public static int[] field4177 = new int[16384];

    @OriginalMember(owner = "client!uf", name = "U", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!uf", name = "J", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!uf", name = "L", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!uf", name = "M", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!uf", name = "N", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!uf", name = "P", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!uf", name = "S", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!uf", name = "T", descriptor = "I")
    public static int field4182;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; ~var2 > -16385; ++var2) {
            field4177[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field4173[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
        field4183 = -14475237;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IBIII)V", line = 5)
    public static final void method1783(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field4182;
        int var5 = 0;
        int var6 = arg4;
        if (arg1 > 44) {
            int var7 = -arg4;
            int var8 = -1;
            class256.method1769(arg3 + arg4, class277.field4414[arg0], (byte) 122, arg2, -arg4 + arg3);
            while (var5 < var6) {
                var8 += 2;
                var7 += var8;
                ++var5;
                if (~var7 <= -1) {
                    --var6;
                    var7 -= var6 << 1;
                    int[] var9 = class277.field4414[arg0 + var6];
                    int[] var10 = class277.field4414[-var6 + arg0];
                    int var11 = arg3 + var5;
                    int var12 = -var5 + arg3;
                    class256.method1769(var11, var9, (byte) 68, arg2, var12);
                    class256.method1769(var11, var10, (byte) 113, arg2, var12);
                }
                int var13 = arg3 + var6;
                int var14 = -var6 + arg3;
                int[] var15 = class277.field4414[arg0 + var5];
                int[] var16 = class277.field4414[-var5 + arg0];
                class256.method1769(var13, var15, (byte) 89, arg2, var14);
                class256.method1769(var13, var16, (byte) 95, arg2, var14);
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V", line = 60)
    public class258() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(IB)V", line = 65)
    public static final void method1784(int arg0, byte arg1) {
        ++field4181;
        if (arg1 == 100) {
            class211 var2 = class281.method1921(14, arg0, (byte) -94);
            var2.method1489((byte) -100);
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(Z)V", line = 79)
    public static void method1785(boolean arg0) {
        field4173 = null;
        field4177 = null;
        if (!arg0) {
            method1784(-95, (byte) -30);
        }
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(B)V", line = 95)
    public static final void method1786(byte arg0) {
        ++field4178;
        int var1 = class196.field3175 * 128 - -64;
        int var2 = class326.field5116 * 128 - -64;
        int var3 = class58.method386(class266.field4286, (byte) -128, var1, var2) + -class196.field3183;
        if (~class13.field184 > -101) {
            if (class427.field6301 < var1) {
                class427.field6301 += class216.field3544 - -((var1 - class427.field6301) * class13.field184 / 1000);
                if (class427.field6301 > var1) {
                    class427.field6301 = var1;
                }
            }
            if (class379.field5733 < var3) {
                class379.field5733 += class216.field3544 - -((var3 - class379.field5733) * class13.field184 / 1000);
                if (var3 < class379.field5733) {
                    class379.field5733 = var3;
                }
            }
            if (var1 < class427.field6301) {
                class427.field6301 -= (-var1 + class427.field6301) * class13.field184 / 1000 + class216.field3544;
                if (var1 > class427.field6301) {
                    class427.field6301 = var1;
                }
            }
            if (~class379.field5733 < ~var3) {
                class379.field5733 -= (-var3 + class379.field5733) * class13.field184 / 1000 + class216.field3544;
                if (~class379.field5733 > ~var3) {
                    class379.field5733 = var3;
                }
            }
            if (class290.field4631 < var2) {
                class290.field4631 += (var2 - class290.field4631) * class13.field184 / 1000 + class216.field3544;
                if (var2 < class290.field4631) {
                    class290.field4631 = var2;
                }
            }
            if (class290.field4631 > var2) {
                class290.field4631 -= (-var2 + class290.field4631) * class13.field184 / 1000 + class216.field3544;
                if (class290.field4631 < var2) {
                    class290.field4631 = var2;
                }
            }
        } else {
            class290.field4631 = class326.field5116 * 128 + 64;
            class427.field6301 = class196.field3175 * 128 - -64;
            class379.field5733 = class58.method386(class266.field4286, (byte) -104, class427.field6301, class290.field4631) - class196.field3183;
        }
        int var4 = class136.field2123 * 128 + 64;
        int var5 = class364.field5541 * 128 + 64;
        int var6 = class58.method386(class266.field4286, (byte) -95, var5, var4) + -class89.field1120;
        int var7 = -class427.field6301 + var5;
        int var8 = -class379.field5733 + var6;
        int var9 = -class290.field4631 + var4;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) var8, (double) var10));
        int var12 = 16383 & (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D);
        if (~var11 > -1025) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (~class396.field5928 > ~var11) {
            class396.field5928 += (var11 - class396.field5928 >> 3) * class181.field2966 / 1000 + class217.field3557 << 3;
            if (~var11 > ~class396.field5928) {
                class396.field5928 = var11;
            }
        }
        if (arg0 != -36) {
            field4173 = null;
        }
        if (var11 < class396.field5928) {
            class396.field5928 -= (-var11 + class396.field5928 >> 3) * class181.field2966 / 1000 + class217.field3557 << 3;
            if (var11 > class396.field5928) {
                class396.field5928 = var11;
            }
        }
        int var13 = var12 - class108.field1516;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (~var14 < -1) {
            class108.field1516 += class181.field2966 * var14 / 1000 + class217.field3557 << 3;
            class108.field1516 &= 16383;
        }
        if (~var14 > -1) {
            class108.field1516 -= -var14 * class181.field2966 / 1000 + class217.field3557 << 3;
            class108.field1516 &= 16383;
        }
        int var15 = -class108.field1516 + var12;
        if (~var15 < -8193) {
            var15 -= 16384;
        }
        if (~var15 > 8191) {
            var15 += 16384;
        }
        if (var15 < 0 && ~var14 < -1 || var15 > 0 && ~var14 > -1) {
            class108.field1516 = var12;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BIIILq;Lne;Lgl;I)V", line = 252)
    public static final void method1787(byte arg0, int arg1, int arg2, int arg3, class245 arg4, class172 arg5, class356 arg6, int arg7) {
        ++field4175;
        if (arg6 != null) {
            int var8;
            if (class13.field194 == 4) {
                var8 = (int) class329.field5153 & 16383;
            } else {
                var8 = 16383 & (int) class329.field5153 + class52.field650;
            }
            int var9 = 10 + Math.max(arg5.field2705 / 2, arg5.field2834 / 2);
            int var10 = arg2 * arg2 + arg7 * arg7;
            if (arg0 != -110) {
                field4183 = -15;
            }
            if (var10 <= var9 * var9) {
                int var11 = field4177[var8];
                int var12 = field4173[var8];
                if (~class13.field194 != -5) {
                    var11 = var11 * 256 / (class367.field5561 + 256);
                    var12 = var12 * 256 / (class367.field5561 + 256);
                }
                int var13 = arg2 * var12 + arg7 * var11 >> 15;
                int var14 = arg7 * var12 - arg2 * var11 >> 15;
                arg6.method418(arg5.field2705 / 2 + arg3 - (-var13 + arg6.method2318() / 2), arg1 + arg5.field2834 / 2 - var14 + -(arg6.method2315() / 2), arg4, arg3, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)[[I", line = 296)
    public final int[][] method203(byte arg0, int arg1) {
        ++field4176;
        int[][] var3 = super.field360.method2803(arg1, true);
        if (super.field360.field6566) {
            int var4 = this.field4180 + 1 + this.field4180;
            int var5 = 65536 / var4;
            int var6 = this.field4179 + 1 + this.field4179;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field4180 + arg1; var9 <= arg1 - -this.field4180; ++var9) {
                int[][] var19 = this.method206(var9 & class246.field4033, arg0 + 95, 0);
                int[][] var20 = new int[3][class369.field5610];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field4179; this.field4179 >= var27; ++var27) {
                    int var37 = var27 & class106.field1492;
                    var21 += var24[var37];
                    var23 += var26[var37];
                    var22 += var25[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (class369.field5610 > var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = class106.field1492 & -this.field4179 + var31;
                    ++var31;
                    int var33 = var21 - var24[var32];
                    int var34 = var22 - var25[var32];
                    int var35 = var23 - var26[var32];
                    int var36 = var31 - -this.field4179 & class106.field1492;
                    var23 = var26[var36] + var35;
                    var22 = var25[var36] + var34;
                    var21 = var24[var36] + var33;
                }
                var8[this.field4180 + var9 - arg1] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~class369.field5610 < ~var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var17 < var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var15 += var18[1][var13];
                    var16 += var18[2][var13];
                    var14 += var18[0][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        if (arg0 != -93) {
            method1787((byte) -48, 94, 79, -79, (class245) null, (class172) null, (class356) null, -41);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljg;II)V", line = 437)
    public final void method115(class186 arg0, int arg1, int arg2) {
        if (arg1 != 6456) {
            field4183 = 17;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field376 = arg0.method1322(false) == 1;
                }
            } else {
                this.field4180 = arg0.method1322(false);
            }
        } else {
            this.field4179 = arg0.method1322(false);
        }
        ++field4172;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)[I", line = 487)
    public final int[] method116(int arg0, byte arg1) {
        if (arg1 < 49) {
            method1786((byte) 123);
        }
        ++field4174;
        int[] var3 = super.field371.method2367((byte) -85, arg0);
        if (super.field371.field5586) {
            int var4 = this.field4180 - -1 + this.field4180;
            int var5 = 65536 / var4;
            int var6 = this.field4179 + this.field4179 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg0 - this.field4180; var9 <= this.field4180 + arg0; ++var9) {
                int[] var13 = this.method210((byte) 50, 0, class246.field4033 & var9);
                int[] var14 = new int[class369.field5610];
                int var15 = 0;
                for (int var16 = -this.field4179; ~var16 >= ~this.field4179; ++var16) {
                    var15 += var13[var16 & class106.field1492];
                }
                int var17 = 0;
                while (var17 < class369.field5610) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field4179 + var17 & class106.field1492];
                    ++var17;
                    var15 = var13[this.field4179 + var17 & class106.field1492] + var18;
                }
                var8[this.field4180 + var9 + -arg0] = var14;
            }
            for (int var10 = 0; class369.field5610 > var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var4 > var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }
}
