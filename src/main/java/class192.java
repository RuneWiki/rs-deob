import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class192 extends class298 {

    @OriginalMember(owner = "client!go", name = "V", descriptor = "I")
    private int field2637 = 0;

    @OriginalMember(owner = "client!go", name = "Q", descriptor = "[S")
    private short[] field2633 = new short[257];

    @OriginalMember(owner = "client!go", name = "Y", descriptor = "Z")
    public static boolean field2640 = false;

    @OriginalMember(owner = "client!go", name = "bb", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!go", name = "fb", descriptor = "Ljava/lang/String;")
    public static String field2647;

    @OriginalMember(owner = "client!go", name = "cb", descriptor = "Lec;")
    public static class40 field2644;

    @OriginalMember(owner = "client!go", name = "gb", descriptor = "Lre;")
    public static class388 field2648;

    @OriginalMember(owner = "client!go", name = "K", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!go", name = "L", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!go", name = "M", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!go", name = "N", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!go", name = "O", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!go", name = "P", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!go", name = "T", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!go", name = "U", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!go", name = "W", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!go", name = "Z", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!go", name = "ab", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!go", name = "eb", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!go", name = "S", descriptor = "[I")
    private int[] field2634;

    @OriginalMember(owner = "client!go", name = "db", descriptor = "[I")
    private int[] field2645;

    @OriginalMember(owner = "client!go", name = "X", descriptor = "[[I")
    private int[][] field2639;

    static {
        Math.sqrt(8192.0D);
        field2643 = 0;
        field2647 = "";
        field2644 = new class40(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");
        field2648 = new class388();
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IZ)[I", line = 6)
    public final int[] method13(int arg0, boolean arg1) {
        ++field2627;
        int[] var3 = super.field4443.method2877(arg0, 1);
        if (!arg1) {
            this.field2637 = 1;
        }
        if (super.field4443.field6915) {
            int[] var4 = this.method1882(0, -2594, arg0);
            for (int var5 = 0; class158.field1877 > var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field2633[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIIIII)I", line = 49)
    public static final int method1044(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2638;
        if (~(1 & arg3) == -2) {
            int var7 = arg4;
            arg4 = arg6;
            arg6 = var7;
        }
        int var8 = arg0 & 3;
        if (~var8 == -1) {
            return arg5;
        } else {
            int var9 = -128 % ((67 - arg1) / 33);
            if (~var8 == -2) {
                return 1 - arg4 + -arg2 + 7;
            } else {
                return ~var8 == -3 ? -arg6 - (-1 - -arg5) + 7 : arg2;
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(I)Z", line = 79)
    public static final boolean method1045(int arg0) {
        ++field2632;
        if (arg0 <= 15) {
            return true;
        } else {
            try {
                return class364.method2207(-1123708880);
            } catch (IOException var4) {
                class96.method471((byte) -72);
                return true;
            } catch (Exception var5) {
                String var2 = "T2 - " + (class233.field3240 == null ? -1 : class233.field3240.method378(0)) + "," + (class24.field333 != null ? class24.field333.method378(0) : -1) + "," + (class358.field5166 == null ? -1 : class358.field5166.method378(0)) + " - " + class361.field5203 + "," + (class19.field258.field2539[0] + class93.field1163) + "," + (class19.field258.field2536[0] + class349.field5023) + " - ";
                for (int var3 = 0; ~var3 > ~class361.field5203 && ~var3 > -51; ++var3) {
                    var2 = var2 + class79.field939.field2159[var3] + ",";
                }
                class144.method678(var5, true, var2);
                class100.method491((byte) 123);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V", line = 112)
    public class192() {
        super(1, true);
    }

    @OriginalMember(owner = "client!go", name = "d", descriptor = "(I)V", line = 115)
    public static void method1046(int arg0) {
        if (arg0 != 32768) {
            method1046(55);
        }
        field2644 = null;
        field2647 = null;
        field2648 = null;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZZB)V", line = 127)
    public static final void method1047(boolean arg0, boolean arg1, byte arg2) {
        ++field2646;
        int var3 = 117 % ((72 - arg2) / 50);
        if (arg0) {
            ++class160.field1928;
            class234.method1293(10);
        }
        if (arg1) {
            ++class40.field474;
            class3.method8(64519);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IB)[I", line = 150)
    private final int[] method1048(int arg0, byte arg1) {
        if (arg1 > -21) {
            field2643 = -51;
        }
        ++field2628;
        if (arg0 < 0) {
            return this.field2634;
        } else {
            return this.field2639.length <= arg0 ? this.field2645 : this.field2639[arg0];
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BIIIIIIIII)V", line = 170)
    public static final void method1049(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field2636;
        if (~arg9 <= -129 && arg6 >= 128 && ~(class159.field1895 * 128 - 256) <= ~arg9 && ~arg6 >= ~(class289.field4316 * 128 + -256)) {
            int var10 = class375.method2264(-1547, arg6, arg4, arg9) - arg8;
            class29.field379.method550(arg1, 0, 0);
            class231.field3205.method1404(class29.field379);
            class231.field3205.method1478(arg9, var10, arg6, class398.field5662);
            if (arg0 != 116) {
                field2648 = null;
            }
            class29.field379.method550(-arg1, 0, 0);
            class231.field3205.method1404(class29.field379);
        } else {
            class398.field5662[0] = class398.field5662[1] = -1;
        }
    }

    @OriginalMember(owner = "client!go", name = "e", descriptor = "(I)V", line = 195)
    private final void method1050(int arg0) {
        ++field2635;
        int[] var2 = this.field2639[0];
        int[] var3 = this.field2639[1];
        int[] var4 = this.field2639[this.field2639.length + -2];
        if (arg0 < 64) {
            method1046(-12);
        }
        int[] var5 = this.field2639[this.field2639.length + -1];
        this.field2645 = new int[] { var4[0] + var4[0] + -var5[0], var4[1] + -var5[1] + var4[1] };
        this.field2634 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] - (var3[1] + -var2[1]) };
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IILvt;)V", line = 215)
    public final void method10(int arg0, int arg1, class179 arg2) {
        if (arg0 > -44) {
            method1047(false, true, (byte) -57);
        }
        ++field2629;
        if (arg1 == 0) {
            this.field2637 = arg2.method895((byte) -87);
            this.field2639 = new int[arg2.method895((byte) -92)][2];
            for (int var4 = 0; var4 < this.field2639.length; ++var4) {
                this.field2639[var4][0] = arg2.method916(21933);
                this.field2639[var4][1] = arg2.method916(21933);
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "f", descriptor = "(I)V", line = 242)
    private final void method1051(int arg0) {
        int var2 = this.field2637;
        if (~var2 != -3) {
            if (~var2 == -2) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; this.field2639.length + -1 > var5 && this.field2639[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field2639[var5 + -1];
                    int[] var7 = this.field2639[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] + -var6[0]);
                    int var9 = 4096 - class159.field1909[(8165 & var8) >> 5] >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field2633[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field2639.length - 1 && this.field2639[var14][0] <= var13; ++var14) {
                    }
                    int[] var15 = this.field2639[var14 - 1];
                    int[] var16 = this.field2639[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 - -(var16[1] * var17) >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field2633[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~var22 > ~(this.field2639.length + -1) && this.field2639[var22][0] <= var21; ++var22) {
                }
                int[] var23 = this.field2639[var22 + -1];
                int[] var24 = this.field2639[var22];
                int var25 = this.method1048(var22 + -2, (byte) -79)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1048(var22 + 1, (byte) -31)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + -var27 + var26 + var28;
                int var32 = -var26 + -var31 + var25;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var36 + var37 + var35 + var26;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field2633[var20] = (short) var38;
            }
        }
        if (arg0 != 0) {
            field2647 = null;
        }
        ++field2630;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 431)
    public static final String method1052(int arg0, long arg1) {
        class262.field3771.setTime(new Date(arg1));
        ++field2641;
        int var3 = class262.field3771.get(7);
        int var4 = class262.field3771.get(5);
        int var5 = class262.field3771.get(2);
        int var6 = class262.field3771.get(1);
        int var7 = class262.field3771.get(11);
        int var8 = class262.field3771.get(12);
        int var9 = class262.field3771.get(13);
        int var10 = -83 % ((3 - arg0) / 63);
        return class294.field4366[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + class404.field5749[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!go", name = "e", descriptor = "(B)V", line = 456)
    public static final void method1053(byte arg0) {
        class122.field1512.method1959(0);
        if (arg0 > -9) {
            method1044(-59, -101, -5, -70, 70, 124, 88);
        }
        ++field2642;
        for (int var1 = 0; var1 < 32; ++var1) {
            class357.field5164[var1] = 0L;
        }
        for (int var2 = 0; ~var2 > -33; ++var2) {
            class66.field832[var2] = 0L;
        }
        class430.field6228 = 0;
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V", line = 500)
    public final void method15(int arg0) {
        if (arg0 >= -41) {
            this.field2639 = null;
        }
        ++field2631;
        if (this.field2639 == null) {
            this.field2639 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field2639.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field2637 == -3) {
                this.method1050(78);
            }
            class292.method1836(6090);
            this.method1051(0);
        }
    }
}
