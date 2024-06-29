import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class689 extends class529 {

    @OriginalMember(owner = "client!bg", name = "G", descriptor = "I")
    private int field9790 = 0;

    @OriginalMember(owner = "client!bg", name = "P", descriptor = "[S")
    private short[] field9798 = new short[257];

    @OriginalMember(owner = "client!bg", name = "F", descriptor = "Lhp;")
    public static class350 field9789 = null;

    @OriginalMember(owner = "client!bg", name = "O", descriptor = "Lfq;")
    public static class141 field9797 = new class141(7, 0, 1, 1);

    @OriginalMember(owner = "client!bg", name = "D", descriptor = "I")
    public static int field9787;

    @OriginalMember(owner = "client!bg", name = "I", descriptor = "I")
    public static int field9791;

    @OriginalMember(owner = "client!bg", name = "L", descriptor = "I")
    public static int field9794;

    @OriginalMember(owner = "client!bg", name = "M", descriptor = "I")
    public static int field9795;

    @OriginalMember(owner = "client!bg", name = "N", descriptor = "I")
    public static int field9796;

    @OriginalMember(owner = "client!bg", name = "Q", descriptor = "I")
    public static int field9799;

    @OriginalMember(owner = "client!bg", name = "R", descriptor = "I")
    public static int field9800;

    @OriginalMember(owner = "client!bg", name = "S", descriptor = "I")
    public static int field9801;

    @OriginalMember(owner = "client!bg", name = "T", descriptor = "I")
    public static int field9802;

    @OriginalMember(owner = "client!bg", name = "U", descriptor = "I")
    public static int field9803;

    @OriginalMember(owner = "client!bg", name = "E", descriptor = "Ljava/lang/Object;")
    public static Object field9788;

    @OriginalMember(owner = "client!bg", name = "J", descriptor = "[I")
    private int[] field9792;

    @OriginalMember(owner = "client!bg", name = "K", descriptor = "[I")
    private int[] field9793;

    @OriginalMember(owner = "client!bg", name = "V", descriptor = "[[I")
    private int[][] field9804;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method3852(String arg0, byte arg1) {
        ++field9799;
        if (arg0 != null) {
            if ((class727.field10184 < 200 || class737.field10330) && ~class727.field10184 > -201) {
                String var3 = class165.method1022((byte) 110, arg0);
                if (var3 != null) {
                    if (arg1 < -122) {
                        for (int var4 = 0; ~class727.field10184 < ~var4; ++var4) {
                            String var9 = class165.method1022((byte) 117, class4.field34[var4]);
                            if (var9 != null && var9.equals(var3)) {
                                class395.method2352(arg0 + class586.field8163.method3261(class416.field5920, (byte) 82), 4, -128);
                                return;
                            }
                            if (class17.field238[var4] != null) {
                                String var10 = class165.method1022((byte) 101, class17.field238[var4]);
                                if (var10 != null && var10.equals(var3)) {
                                    class395.method2352(arg0 + class586.field8163.method3261(class416.field5920, (byte) 82), 4, -128);
                                    return;
                                }
                            }
                        }
                        for (int var5 = 0; var5 < class497.field7034; ++var5) {
                            String var7 = class165.method1022((byte) 114, class736.field10317[var5]);
                            if (var7 != null && var7.equals(var3)) {
                                class395.method2352(class586.field8168.method3261(class416.field5920, (byte) 82) + arg0 + class586.field8169.method3261(class416.field5920, (byte) 82), 4, -128);
                                return;
                            }
                            if (class415.field5866[var5] != null) {
                                String var8 = class165.method1022((byte) 126, class415.field5866[var5]);
                                if (var8 != null && var8.equals(var3)) {
                                    class395.method2352(class586.field8168.method3261(class416.field5920, (byte) 82) + arg0 + class586.field8169.method3261(class416.field5920, (byte) 82), 4, -128);
                                    return;
                                }
                            }
                        }
                        if (class165.method1022((byte) 124, class339.field4374.field7690).equals(var3)) {
                            class395.method2352(class586.field8166.method3261(class416.field5920, (byte) 82), 4, -128);
                        } else {
                            ++class619.field8666;
                            class650 var6 = class314.method1837(class315.field4034, true, class625.field8727);
                            var6.field8928.method1141(class663.method3588(0, arg0), 67);
                            var6.field8928.method1110(arg0, -30452);
                            class108.method745(var6, -96);
                        }
                    }
                }
            } else {
                class395.method2352(class586.field8135.method3261(class416.field5920, (byte) 82), 4, -128);
                String var2 = class586.field8136.method3261(class416.field5920, (byte) 82);
                if (var2 != null) {
                    class395.method2352(var2, 4, -128);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(IB)[I")
    private final int[] method3853(int arg0, byte arg1) {
        ++field9787;
        if (~arg0 > -1) {
            return this.field9793;
        } else if (arg1 != -27) {
            return null;
        } else {
            return arg0 >= this.field9804.length ? this.field9792 : this.field9804[arg0];
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(CZ)Z")
    public static final boolean method3854(char arg0, boolean arg1) {
        if (!arg1) {
            field9789 = null;
        }
        ++field9795;
        if (arg0 >= ' ' && ~arg0 >= -127) {
            return true;
        } else if (~arg0 <= -161 && arg0 <= 255) {
            return true;
        } else {
            return ~arg0 == -8365 || ~arg0 == -339 || ~arg0 == -8213 || ~arg0 == -340 || ~arg0 == -377;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
    private final void method3855(boolean arg0) {
        if (arg0) {
            this.method3855(true);
        }
        ++field9802;
        int[] var2 = this.field9804[0];
        int[] var3 = this.field9804[1];
        int[] var4 = this.field9804[this.field9804.length - 2];
        int[] var5 = this.field9804[this.field9804.length - 1];
        this.field9793 = new int[] { var2[0] - var3[0] + var2[0], var2[1] - (var3[1] - var2[1]) };
        this.field9792 = new int[] { var4[0] - var5[0] - -var4[0], var4[1] + var4[1] + -var5[1] };
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)Ljava/lang/String;")
    public static final String method3856(int arg0, int arg1) {
        ++field9796;
        if (arg0 != 256) {
            method3854((char) 65527, false);
        }
        return (arg1 >> 24 & 255) + "." + ((16740280 & arg1) >> 16) + "." + ((65521 & arg1) >> 8) + "." + (255 & arg1);
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
    public class689() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
    public final void method303(int arg0) {
        if (this.field9804 == null) {
            this.field9804 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field9791;
        if (arg0 >= -92) {
            field9797 = null;
        }
        if (~this.field9804.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field9790 == 2) {
                this.method3855(false);
            }
            class713.method3947((byte) -82);
            this.method3858(-15539);
        }
    }

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "(B)V")
    public static void method3857(byte arg0) {
        field9788 = null;
        if (arg0 != -102) {
            field9788 = null;
        }
        field9797 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB)[I")
    public final int[] method191(int arg0, byte arg1) {
        ++field9803;
        int[] var3 = super.field7456.method1635(arg0, -58);
        if (super.field7456.field3449) {
            int[] var4 = this.method3028((byte) 111, arg0, 0);
            for (int var5 = 0; ~class304.field3909 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field9798[var6];
            }
        }
        int var7 = 33 / ((27 - arg1) / 49);
        return var3;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IBLtn;)V")
    public final void method190(int arg0, byte arg1, class179 arg2) {
        if (arg1 <= 45) {
            this.method190(42, (byte) -67, (class179) null);
        }
        if (~arg0 == -1) {
            this.field9790 = arg2.method1094(255);
            this.field9804 = new int[arg2.method1094(255)][2];
            for (int var4 = 0; this.field9804.length > var4; ++var4) {
                this.field9804[var4][0] = arg2.method1107(false);
                this.field9804[var4][1] = arg2.method1107(false);
            }
        }
        ++field9794;
    }

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "(I)V")
    private final void method3858(int arg0) {
        ++field9800;
        int var2 = this.field9790;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~(this.field9804.length + -1) < ~var5 && ~this.field9804[var5][0] >= ~var4; ++var5) {
                    }
                    int[] var6 = this.field9804[var5 + -1];
                    int[] var7 = this.field9804[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] + -var6[0]);
                    int var9 = -class132.field1574[(8163 & var8) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field9798[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field9804.length - 1 && var13 >= this.field9804[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field9804[var14 - 1];
                    int[] var16 = this.field9804[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = 4096 - var17;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field9798[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~(this.field9804.length + -1) < ~var22 && this.field9804[var22][0] <= var21; ++var22) {
                }
                int[] var23 = this.field9804[var22 - 1];
                int[] var24 = this.field9804[var22];
                int var25 = this.method3853(var22 - 2, (byte) -27)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method3853(var22 + 1, (byte) -27)[1];
                int var29 = (var21 - var23[0] << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var28 - var25 + -var27 + var26;
                int var32 = -var26 + var25 + -var31;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var37 - -var26 + var35 + var36;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field9798[var20] = (short) var38;
            }
        }
        if (arg0 != -15539) {
            this.field9804 = null;
        }
    }
}
