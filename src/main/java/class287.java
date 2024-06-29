import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class287 extends class182 {

    @OriginalMember(owner = "client!wf", name = "R", descriptor = "I")
    private int field4746 = 1;

    @OriginalMember(owner = "client!wf", name = "X", descriptor = "I")
    private int field4752 = 1;

    @OriginalMember(owner = "client!wf", name = "Q", descriptor = "I")
    public static int field4745 = 0;

    @OriginalMember(owner = "client!wf", name = "S", descriptor = "I")
    public static int field4747 = 0;

    @OriginalMember(owner = "client!wf", name = "U", descriptor = "Ljava/lang/String;")
    public static String field4749 = "Connected to update server";

    @OriginalMember(owner = "client!wf", name = "O", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!wf", name = "P", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!wf", name = "T", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!wf", name = "V", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!wf", name = "W", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!wf", name = "Y", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!wf", name = "Z", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!wf", name = "ab", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!wf", name = "bb", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI)[[I")
    public final int[][] method157(byte arg0, int arg1) {
        ++field4756;
        int var3 = -68 % ((-64 - arg0) / 49);
        int[][] var4 = super.field2905.method50(arg1, (byte) 118);
        if (super.field2905.field158) {
            int var5 = this.field4746 - -this.field4746 - -1;
            int var6 = 65536 / var5;
            int[][][] var7 = new int[var5][][];
            int var8 = this.field4752 + 1 + this.field4752;
            int var9 = 65536 / var8;
            for (int var10 = -this.field4746 + arg1; ~(this.field4746 + arg1) <= ~var10; ++var10) {
                int[][] var20 = this.method1327(0, 0, class107.field1749 & var10);
                int[][] var21 = new int[3][class4.field116];
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var20[0];
                int var25 = 0;
                int[] var26 = var20[1];
                int[] var27 = var20[2];
                for (int var28 = -this.field4752; ~var28 >= ~this.field4752; ++var28) {
                    int var38 = var28 & class103.field1644;
                    var23 += var26[var38];
                    var25 += var27[var38];
                    var22 += var24[var38];
                }
                int[] var29 = var21[1];
                int[] var30 = var21[2];
                int[] var31 = var21[0];
                int var32 = 0;
                while (var32 < class4.field116) {
                    var31[var32] = var9 * var22 >> 16;
                    var29[var32] = var9 * var23 >> 16;
                    var30[var32] = var9 * var25 >> 16;
                    int var33 = class103.field1644 & var32 - this.field4752;
                    ++var32;
                    int var34 = var25 - var27[var33];
                    int var35 = var23 - var26[var33];
                    int var36 = var22 - var24[var33];
                    int var37 = this.field4752 + var32 & class103.field1644;
                    var22 = var24[var37] + var36;
                    var23 = var26[var37] + var35;
                    var25 = var27[var37] + var34;
                }
                var7[this.field4746 + var10 + -arg1] = var21;
            }
            int[] var11 = var4[0];
            int[] var12 = var4[1];
            int[] var13 = var4[2];
            for (int var14 = 0; var14 < class4.field116; ++var14) {
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                for (int var18 = 0; var18 < var5; ++var18) {
                    int[][] var19 = var7[var18];
                    var15 += var19[0][var14];
                    var16 += var19[1][var14];
                    var17 += var19[2][var14];
                }
                var11[var14] = var6 * var15 >> 16;
                var12[var14] = var6 * var16 >> 16;
                var13[var14] = var6 * var17 >> 16;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Laj;BLaj;)V")
    public static final void method1998(class151 arg0, byte arg1, class151 arg2) {
        class151.field2486 = arg2;
        class259.field4358 = arg0;
        ++field4743;
        int var3 = (int) (Math.random() * 21.0D) - 10;
        if (arg1 != -85) {
            method2002(true, (byte) 68);
        }
        class259.field4358.method1132(16777215, 34);
        int var4 = (int) (Math.random() * 21.0D) - 10;
        int var5 = (int) (Math.random() * 21.0D) + -10;
        int var6 = -20 + (int) (41.0D * Math.random());
        class141.field2328 = var3 + var6;
        class277.field4621 = var5 + var6;
        class244.field4088 = var4 + var6;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
    public class287() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        int[] var3 = super.field2911.method77(arg1, -77);
        if (arg0) {
            method2004(2, -88, -18);
        }
        ++field4744;
        if (super.field2911.field287) {
            int var4 = this.field4746 + 1 + this.field4746;
            int var5 = 65536 / var4;
            int var6 = this.field4752 - -1 + this.field4752;
            int[][] var7 = new int[var4][];
            int var8 = 65536 / var6;
            for (int var9 = -this.field4746 + arg1; ~var9 >= ~(this.field4746 + arg1); ++var9) {
                int[] var13 = this.method1323(0, -17707, var9 & class107.field1749);
                int var14 = 0;
                for (int var15 = -this.field4752; var15 <= this.field4752; ++var15) {
                    var14 += var13[class103.field1644 & var15];
                }
                int[] var16 = new int[class4.field116];
                int var17 = 0;
                while (~var17 > ~class4.field116) {
                    var16[var17] = var8 * var14 >> 16;
                    int var18 = var14 - var13[-this.field4752 + var17 & class103.field1644];
                    ++var17;
                    var14 = var13[this.field4752 + var17 & class103.field1644] + var18;
                }
                var7[this.field4746 + var9 + -arg1] = var16;
            }
            for (int var10 = 0; class4.field116 > var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var12 > ~var4; ++var12) {
                    var11 += var7[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "(I)V")
    public static void method1999(int arg0) {
        if (arg0 != 65536) {
            field4749 = null;
        }
        field4749 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method2000(byte arg0, byte[] arg1) {
        if (arg0 != 105) {
            return null;
        } else {
            ++field4751;
            class249 var2 = new class249(arg1);
            int var3 = var2.method1802((byte) -98);
            int var4 = var2.method1800(-106);
            if (var4 >= 0 && (~class4.field112 == -1 || ~var4 >= ~class4.field112)) {
                if (~var3 == -1) {
                    byte[] var5 = new byte[var4];
                    var2.method1805((byte) -86, var4, 0, var5);
                    return var5;
                } else {
                    int var6 = var2.method1800(100);
                    if (var6 >= 0 && (class4.field112 == 0 || ~var6 >= ~class4.field112)) {
                        byte[] var7 = new byte[var6];
                        if (var3 != 1) {
                            class46.field806.method1729(-23857, var2, var7);
                        } else {
                            class48.method302(var7, var6, arg1, var4, 9);
                        }
                        return var7;
                    } else {
                        throw new RuntimeException();
                    }
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        ++field4754;
        if (arg0) {
            this.method155(true, (class249) null, -109);
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field2896 = ~arg1.method1802((byte) -110) == -2;
                }
            } else {
                this.field4746 = arg1.method1802((byte) -124);
            }
        } else {
            this.field4752 = arg1.method1802((byte) -121);
        }
    }

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "(I)V")
    public static final void method2001(int arg0) {
        ++field4753;
        if (arg0 != 3) {
            method1999(-85);
        }
        class136.field2239.method635(-31777);
        int var1 = class136.field2239.method641(false, 1);
        if (var1 != 0) {
            int var2 = class136.field2239.method641(false, 2);
            if (var2 == 0) {
                class41.field619[class289.field4761++] = 2047;
            } else if (~var2 == -2) {
                int var3 = class136.field2239.method641(false, 3);
                class16.field314.method285(var3, (byte) -115, 1);
                int var4 = class136.field2239.method641(false, 1);
                if (var4 == 1) {
                    class41.field619[class289.field4761++] = 2047;
                }
            } else if (~var2 == -3) {
                if (~class136.field2239.method641(false, 1) != -2) {
                    int var5 = class136.field2239.method641(false, 3);
                    class16.field314.method285(var5, (byte) -104, 0);
                } else {
                    int var6 = class136.field2239.method641(false, 3);
                    class16.field314.method285(var6, (byte) -93, 2);
                    int var7 = class136.field2239.method641(false, 3);
                    class16.field314.method285(var7, (byte) -93, 2);
                }
                int var8 = class136.field2239.method641(false, 1);
                if (var8 == 1) {
                    class41.field619[class289.field4761++] = 2047;
                }
            } else if (~var2 == -4) {
                int var9 = class136.field2239.method641(false, 1);
                int var10 = class136.field2239.method641(false, 1);
                if (~var10 == -2) {
                    class41.field619[class289.field4761++] = 2047;
                }
                int var11 = class136.field2239.method641(false, 7);
                int var12 = class136.field2239.method641(false, 7);
                class182.field2898 = class136.field2239.method641(false, 2);
                class16.field314.method919(var11, var12, var9 == 1, false);
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZB)V")
    public static final void method2002(boolean arg0, byte arg1) {
        ++field4750;
        class159.method1187(-659813974);
        if (class26.field458 == 30 || class26.field458 == 25) {
            ++class151.field2528;
            if (class151.field2528 >= 50 || arg0) {
                class151.field2528 = 0;
                int var2 = -38 % ((1 - arg1) / 53);
                if (!class273.field4575 && class159.field2609 != null) {
                    class236.field3980.method640((byte) 97, 5);
                    try {
                        class159.field2609.method1066(class236.field3980.field4182, -85, class236.field3980.field4160, 0);
                        class236.field3980.field4160 = 0;
                    } catch (IOException var3) {
                        class273.field4575 = true;
                    }
                    ++class310.field4988;
                }
                class159.method1187(-659813974);
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)I")
    public static final int method2003(byte arg0) {
        ++field4748;
        int var1 = 21 / ((-59 - arg0) / 37);
        return 6;
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(III)V")
    public static final void method2004(int arg0, int arg1, int arg2) {
        ++field4755;
        if (arg1 > -80) {
            method2002(false, (byte) -23);
        }
        class36 var3 = class136.method1013(7, arg0, (byte) -90);
        var3.method224(false);
        var3.field577 = arg2;
    }
}
