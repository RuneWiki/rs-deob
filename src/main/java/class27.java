import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class27 extends class7 {

    @OriginalMember(owner = "client!cf", name = "V", descriptor = "I")
    private int field512 = 3072;

    @OriginalMember(owner = "client!cf", name = "U", descriptor = "I")
    private int field511 = 1024;

    @OriginalMember(owner = "client!cf", name = "W", descriptor = "I")
    private int field513 = 2048;

    @OriginalMember(owner = "client!cf", name = "X", descriptor = "Lob;")
    public static class141 field514 = class175.method1195(40, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!cf", name = "R", descriptor = "I")
    public static int field508 = -1;

    @OriginalMember(owner = "client!cf", name = "bb", descriptor = "Lob;")
    public static class141 field518 = class175.method1195(40, "Weiter");

    @OriginalMember(owner = "client!cf", name = "Y", descriptor = "Z")
    public static boolean field515 = false;

    @OriginalMember(owner = "client!cf", name = "cb", descriptor = "I")
    public static int field519 = 0;

    @OriginalMember(owner = "client!cf", name = "Z", descriptor = "J")
    public static long field516 = 0L;

    @OriginalMember(owner = "client!cf", name = "S", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!cf", name = "T", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!cf", name = "ab", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!cf", name = "db", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!cf", name = "eb", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!cf", name = "fb", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([IIIIII)V")
    public static final void method191(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class153 var6 = class131.field2506[arg3][arg4][arg5];
        if (var6 != null) {
            class76 var7 = var6.field2939;
            if (var7 == null) {
                class101 var10 = var6.field2932;
                if (var10 != null) {
                    int var11 = var10.field1968;
                    int var12 = var10.field1966;
                    int var13 = var10.field1971;
                    int var14 = var10.field1964;
                    int[] var15 = class201.field3797[var11];
                    int[] var16 = class100.field1949[var12];
                    int var17 = 0;
                    if (var13 != 0) {
                        for (int var18 = 0; var18 < 4; ++var18) {
                            arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg1 += arg2;
                        }
                    } else {
                        for (int var19 = 0; var19 < 4; ++var19) {
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 1] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 2] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 3] = var14;
                            }
                            arg1 += arg2;
                        }
                    }
                }
            } else {
                int var8 = var7.field1538;
                if (var8 != 0) {
                    for (int var9 = 0; var9 < 4; ++var9) {
                        arg0[arg1] = var8;
                        arg0[arg1 + 1] = var8;
                        arg0[arg1 + 2] = var8;
                        arg0[arg1 + 3] = var8;
                        arg1 += arg2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        if (arg0 < 13) {
            field514 = null;
        }
        ++field509;
        int[] var3 = super.field100.method842(arg1, 12);
        if (super.field100.field2534) {
            int[] var4 = this.method52(arg1, 0, 33);
            for (int var5 = 0; ~var5 > ~class117.field2272; ++var5) {
                var3[var5] = this.field511 - -(var4[var5] * this.field513 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
    public class27() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(IIIIII)V")
    public static final void method192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        if (arg0 != 2) {
            field519 = -79;
        }
        int var7 = arg3;
        int var8 = arg2 * arg2;
        int var9 = arg3 * arg3;
        ++field521;
        int var10 = var9 << 1;
        int var11 = arg3 << 1;
        int var12 = var8 << 1;
        int var13 = (-var11 + 1) * var8 - -var10;
        int var14 = -((var11 - 1) * var12) + var9;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) - -3) * var10;
        int var18 = (var6 + 1) * var16;
        int var19 = (arg3 + -1) * var15;
        int var20 = ((arg3 << 1) + -3) * var12;
        if (class35.field698 <= arg5 && ~class130.field2470 <= ~arg5) {
            int var21 = class106.method703(class68.field1323, class136.field2590, true, arg1 - -arg2);
            int var22 = class106.method703(class68.field1323, class136.field2590, true, arg1 - arg2);
            class180.method1217(var21, (byte) 52, var22, arg4, class41.field805[arg5]);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (~var13 > -1) {
                    var14 += var18;
                    var18 += var16;
                    ++var6;
                    var13 += var17;
                    var17 += var16;
                }
            }
            --var7;
            int var23 = -var7 + arg5;
            if (var14 < 0) {
                var13 += var17;
                var17 += var16;
                var14 += var18;
                var18 += var16;
                ++var6;
            }
            var13 += -var19;
            var14 += -var20;
            int var24 = arg5 + var7;
            var20 -= var15;
            if (~var24 <= ~class35.field698 && ~class130.field2470 <= ~var23) {
                int var25 = class106.method703(class68.field1323, class136.field2590, true, arg1 + var6);
                int var26 = class106.method703(class68.field1323, class136.field2590, true, arg1 - var6);
                if (~var23 <= ~class35.field698) {
                    class180.method1217(var25, (byte) 52, var26, arg4, class41.field805[var23]);
                }
                if (class130.field2470 >= var24) {
                    class180.method1217(var25, (byte) 52, var26, arg4, class41.field805[var24]);
                }
            }
            var19 -= var15;
        }
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)V")
    public final void method47(int arg0) {
        ++field522;
        this.field513 = -this.field511 + this.field512;
        if (arg0 != 1) {
            field514 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(IB)[[I")
    public final int[][] method51(int arg0, byte arg1) {
        int[][] var3 = super.field97.method1396(arg0, (byte) 45);
        int var4 = -15 / ((-42 - arg1) / 41);
        if (super.field97.field4093) {
            int[][] var5 = this.method42(arg0, 109, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; var12 < class117.field2272; ++var12) {
                var9[var12] = (var6[var12] * this.field513 >> 12) + this.field511;
                var10[var12] = this.field511 - -(var7[var12] * this.field513 >> 12);
                var11[var12] = (var8[var12] * this.field513 >> 12) + this.field511;
            }
        }
        ++field520;
        return var3;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(Z)V")
    public static void method193(boolean arg0) {
        field514 = null;
        if (arg0) {
            field518 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field99 = arg2.method991(255) == 1;
                }
            } else {
                this.field512 = arg2.method1007(43);
            }
        } else {
            this.field511 = arg2.method1007(57);
        }
        ++field510;
        int var5 = -86 / ((66 - arg1) / 57);
    }
}
