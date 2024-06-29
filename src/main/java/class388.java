import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class388 extends class210 {

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "I")
    private int field5672 = 0;

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "[S")
    private short[] field5667 = new short[257];

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "Z")
    public static boolean field5663 = false;

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "I")
    public static int field5665 = 0;

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "Z")
    public static boolean field5673 = false;

    @OriginalMember(owner = "client!dc", name = "bb", descriptor = "I")
    public static int field5681 = 0;

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "I")
    public static int field5679;

    @OriginalMember(owner = "client!dc", name = "ab", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "Lfp;")
    public static class9 field5677;

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "[I")
    private int[] field5678;

    @OriginalMember(owner = "client!dc", name = "cb", descriptor = "[I")
    private int[] field5682;

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "[Lmj;")
    public static class177[] field5675;

    @OriginalMember(owner = "client!dc", name = "db", descriptor = "[[I")
    private int[][] field5683;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)V", line = 4)
    private final void method2448(byte arg0) {
        ++field5670;
        int[] var2 = this.field5683[0];
        int[] var3 = this.field5683[1];
        if (arg0 < 94) {
            method2451(85, 78);
        }
        int[] var4 = this.field5683[this.field5683.length + -2];
        int[] var5 = this.field5683[this.field5683.length + -1];
        this.field5678 = new int[] { var2[0] + var2[0] - var3[0], var2[1] + var2[1] + -var3[1] };
        this.field5682 = new int[] { -var5[0] - -var4[0] + var4[0], var4[1] + -var5[1] + var4[1] };
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)[I", line = 25)
    public final int[] method361(int arg0, byte arg1) {
        ++field5668;
        if (arg1 != -38) {
            this.method2452((byte) -15);
        }
        int[] var3 = super.field2950.method1892(arg0, (byte) -115);
        if (super.field2950.field4111) {
            int[] var4 = this.method1447(arg0, -113, 0);
            for (int var5 = 0; class202.field2852 > var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field5667[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZII)V", line = 66)
    public static final void method2449(boolean arg0, int arg1, int arg2) {
        ++field5674;
        class90 var3 = new class90(16);
        if (arg0) {
            field5663 = true;
        }
        for (class447 var4 = (class447) class200.field2828.method608((byte) 124); var4 != null; var4 = (class447) class200.field2828.method604(-110)) {
            var4.method1820(-25246);
            int var5 = (int) (var4.field3907 >> 28);
            int var6 = -arg2 + (int) (16383L & var4.field3907 >> 14);
            int var7 = (int) (16383L & var4.field3907) - arg1;
            if (~var7 <= -1 && var6 >= 0 && var7 < class195.field2745 && ~var6 > ~class78.field984) {
                var3.method606(1, var4, (long) (var5 << 28 | var6 << 14 | var7));
            }
        }
        class200.field2828 = var3;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)[I", line = 104)
    private final int[] method2450(int arg0, int arg1) {
        ++field5671;
        if (~arg0 > -1) {
            return this.field5678;
        } else if (~arg0 <= ~this.field5683.length) {
            return this.field5682;
        } else {
            return arg1 != 1468080068 ? null : this.field5683[arg0];
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(II)V", line = 125)
    public static final void method2451(int arg0, int arg1) {
        class390.field5701 = arg1;
        ++field5666;
        class363 var2 = class459.field6785;
        synchronized (class459.field6785) {
            class459.field6785.method2313(99);
        }
        if (arg0 == 0) {
            class363 var3 = class165.field2180;
            synchronized (class165.field2180) {
                class165.field2180.method2313(108);
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(B)V", line = 143)
    private final void method2452(byte arg0) {
        ++field5676;
        if (arg0 < 72) {
            field5665 = 76;
        }
        int var2 = this.field5672;
        if (var2 != 2) {
            if (~var2 == -2) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field5683.length + -1 && ~var4 <= ~this.field5683[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field5683[var5 + -1];
                    int[] var7 = this.field5683[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class311.field4580[var8 >> 5 & 255] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field5667[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field5683.length - 1 && ~var13 <= ~this.field5683[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field5683[var14 - 1];
                    int[] var16 = this.field5683[var14];
                    int var17 = (var13 - var15[0] << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field5667[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field5683.length + -1 && var21 >= this.field5683[var22][0]; ++var22) {
                }
                int[] var23 = this.field5683[var22 + -1];
                int[] var24 = this.field5683[var22];
                int var25 = this.method2450(var22 + -2, 1468080068)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method2450(var22 + 1, 1468080068)[1];
                int var29 = (var21 - var23[0] << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + var26 + var28 + -var27;
                int var32 = -var26 + var25 - var31;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 - -var36 + var26 + var37;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field5667[var20] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)I", line = 323)
    public static final int method2453(int arg0, int arg1, String arg2, String arg3) {
        ++field5664;
        int var4 = arg3.length();
        int var5 = arg2.length();
        int var6 = 0;
        int var7 = 0;
        if (arg1 != 32767) {
            method2453(-101, 89, (String) null, (String) null);
        }
        char var8 = 0;
        char var9 = 0;
        while (-var8 + var6 < var4 || -var9 + var7 < var5) {
            if (var6 - var8 >= var4) {
                return -1;
            }
            if (var5 <= -var9 + var7) {
                return 1;
            }
            char var22;
            if (~var8 == -1) {
                var22 = arg3.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (~var9 != -1) {
                var24 = var9;
                boolean var25 = false;
            } else {
                var24 = arg2.charAt(var7++);
            }
            var8 = class454.method2810(var22, 61);
            var9 = class454.method2810(var24, 125);
            char var26 = class253.method1670(var22, arg0, false);
            char var27 = class253.method1670(var24, arg0, false);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (~var28 != ~var29) {
                    return class33.method317(-50, var28, arg0) - class33.method317(-81, var29, arg0);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; ~var11 > ~var10; ++var11) {
            int var16;
            int var17;
            if (arg0 == 2) {
                var16 = var4 + -1 + -var11;
                var17 = var5 - (var11 + 1);
            } else {
                var17 = var11;
                var16 = var11;
            }
            char var18 = arg3.charAt(var16);
            char var19 = arg2.charAt(var17);
            if (~var18 != ~var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (~var20 != ~var21) {
                    return class33.method317(-49, var20, arg0) - class33.method317(arg1 + -32827, var21, arg0);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        } else {
            for (int var13 = 0; var10 > var13; ++var13) {
                char var14 = arg3.charAt(var13);
                char var15 = arg2.charAt(var13);
                if (~var14 != ~var15) {
                    return class33.method317(-92, var14, arg0) + -class33.method317(arg1 ^ -32672, var15, arg0);
                }
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V", line = 457)
    public class388() {
        super(1, true);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIZI)V", line = 468)
    public static final void method2454(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (~arg2 > ~arg4) {
            class381.method2419((byte) 24, arg0, arg2, class323.field4774[arg1], arg4);
        } else {
            class381.method2419((byte) 66, arg0, arg4, class323.field4774[arg1], arg2);
        }
        if (!arg3) {
            ++field5669;
        }
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)V", line = 490)
    public final void method363(int arg0) {
        ++field5662;
        if (this.field5683 == null) {
            this.field5683 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field5683.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field5672 == -3) {
                this.method2448((byte) 120);
            }
            class51.method392(arg0);
            this.method2452((byte) 107);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILat;)V", line = 509)
    public final void method56(int arg0, int arg1, class256 arg2) {
        ++field5680;
        if (arg1 == -11941) {
            if (arg0 == 0) {
                this.field5672 = arg2.method1738((byte) -104);
                this.field5683 = new int[arg2.method1738((byte) -111)][2];
                for (int var4 = 0; var4 < this.field5683.length; ++var4) {
                    this.field5683[var4][0] = arg2.method1767(1930493576);
                    this.field5683[var4][1] = arg2.method1767(class134.method895(arg1, -1930481709));
                }
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "(I)V", line = 538)
    public static void method2455(int arg0) {
        if (arg0 > -116) {
            field5673 = false;
        }
        field5677 = null;
        field5675 = null;
    }
}
