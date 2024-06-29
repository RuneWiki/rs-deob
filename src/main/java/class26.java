import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class26 extends class53 {

    @OriginalMember(owner = "client!sd", name = "M", descriptor = "I")
    private int field330 = 0;

    @OriginalMember(owner = "client!sd", name = "fb", descriptor = "[S")
    private short[] field349 = new short[257];

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "Lwa;")
    private static class75 field331 = class66.method560("Type", false);

    @OriginalMember(owner = "client!sd", name = "Z", descriptor = "Lwa;")
    public static class75 field343 = field331;

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "Ljava/util/Random;")
    public static Random field342 = new Random();

    @OriginalMember(owner = "client!sd", name = "cb", descriptor = "I")
    public static int field346 = 0;

    @OriginalMember(owner = "client!sd", name = "hb", descriptor = "I")
    public static int field351 = 0;

    @OriginalMember(owner = "client!sd", name = "db", descriptor = "Lgb;")
    public static class158 field347 = new class158(64);

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!sd", name = "P", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!sd", name = "ab", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!sd", name = "gb", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!sd", name = "eb", descriptor = "Z")
    public static boolean field348;

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "[I")
    private int[] field337;

    @OriginalMember(owner = "client!sd", name = "bb", descriptor = "[I")
    private int[] field345;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "[[I")
    private int[][] field339;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "(I)[Lrg;", line = 11)
    public static final class89[] method171(int arg0) {
        field344++;
        if (arg0 != 16551) {
            field351 = 126;
        }
        if (class310.field5290 == null) {
            class89[] var1 = class176.method1298((byte) 122, class210.field3585);
            int var2 = 0;
            class89[] var3 = new class89[var1.length];
            label58: for (int var4 = 0; var4 < var1.length; var4++) {
                class89 var5 = var1[var4];
                if ((var5.field1463 <= 0 || var5.field1463 >= 24) && var5.field1474 >= 800 && var5.field1464 >= 600) {
                    for (int var6 = 0; var6 < var2; var6++) {
                        class89 var7 = var3[var6];
                        if (var5.field1474 == var7.field1474 && var5.field1464 == var7.field1464) {
                            if (var5.field1463 > var7.field1463) {
                                var3[var6] = var5;
                            }
                            continue label58;
                        }
                    }
                    var3[var2] = var5;
                    var2++;
                }
            }
            class310.field5290 = new class89[var2];
            class231.method1688(var3, 0, class310.field5290, 0, var2);
            int[] var8 = new int[class310.field5290.length];
            for (int var9 = 0; var9 < class310.field5290.length; var9++) {
                class89 var10 = class310.field5290[var9];
                var8[var9] = var10.field1474 * var10.field1464;
            }
            class169.method1249(class310.field5290, arg0 ^ 0x40F7, var8);
        }
        return class310.field5290;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILah;IIZI)V", line = 92)
    public static final void method172(int arg0, int arg1, class194 arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (!arg5) {
            field342 = (Random) null;
        }
        field350++;
        class161.method1206(arg6, arg1, arg2.field3259, 50, arg3, arg2.field3218, arg4, arg0);
    }

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "(I)V", line = 104)
    private final void method173(int arg0) {
        field333++;
        int[] var2 = this.field339[0];
        if (arg0 != 642061228) {
            this.field345 = (int[]) null;
        }
        int[] var3 = this.field339[1];
        int[] var4 = this.field339[this.field339.length - 1];
        int[] var5 = this.field339[this.field339.length - 2];
        this.field337 = new int[] { var2[0] - (var3[0] - var2[0]), var2[1] + -var3[1] + var2[1] };
        this.field345 = new int[] { var5[0] + var5[0] - var4[0], var5[1] - var4[1] - -var5[1] };
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V", line = 131)
    public class26() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)[I", line = 138)
    public final int[] method59(int arg0, int arg1) {
        if (arg0 != -15196) {
            method176(100);
        }
        int[] var3 = this.field878.method1603(arg1, (byte) 125);
        if (this.field878.field3749) {
            int[] var4 = this.method391(0, 0, arg1);
            for (int var5 = 0; var5 < class269.field4644; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field349[var6];
            }
        }
        field341++;
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(II)[I", line = 179)
    private final int[] method174(int arg0, int arg1) {
        field338++;
        if (arg1 != -17981) {
            return (int[]) null;
        } else if (arg0 < 0) {
            return this.field337;
        } else if (arg0 >= this.field339.length) {
            return this.field345;
        } else {
            return this.field339[arg0];
        }
    }

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "(I)V", line = 196)
    private final void method175(int arg0) {
        field340++;
        int var2 = this.field330;
        if (var2 == 2) {
            for (int var20 = 0; var20 < 257; var20++) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field339.length - 1 > var22 && this.field339[var22][0] <= var21; var22++) {
                }
                int[] var23 = this.field339[var22 - 1];
                int[] var24 = this.field339[var22];
                int var25 = this.method174(var22 - 2, -17981)[1];
                int var26 = var24[1];
                int var27 = var23[1];
                int var28 = this.method174(var22 + 1, -17981)[1];
                int var29 = (var21 - var23[0] << 12) / (var24[0] - var23[0]);
                int var30 = var29 * var29 >> 12;
                int var32 = var27 + var28 - var26 - var25;
                int var33 = var25 - (var27 + var32);
                int var34 = var26 - var25;
                int var35 = var30 * var33 >> 12;
                int var36 = var29 * var34 >> 12;
                int var37 = (var29 * var32 >> 12) * var30 >> 12;
                int var38 = var27 + var36 + var35 + var37;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field349[var20] = (short) var38;
            }
        } else if (var2 == 1) {
            for (int var11 = 0; var11 < 257; var11++) {
                int var12 = var11 << 4;
                int var13;
                for (var13 = 1; (this.field339.length - 1) > var13 && var12 >= this.field339[var13][0]; var13++) {
                }
                int[] var14 = this.field339[var13 - 1];
                int[] var15 = this.field339[var13];
                int var16 = (var12 - var14[0] << 12) / (var15[0] - var14[0]);
                int var17 = 4096 - class232.field3916[var16 >> 5 & 0xFF] >> 1;
                int var18 = 4096 - var17;
                int var19 = var14[1] * var18 + (var15[1] * var17) >> 12;
                if (var19 <= -32768) {
                    var19 = -32767;
                }
                if (var19 >= 32768) {
                    var19 = 32767;
                }
                this.field349[var11] = (short) var19;
            }
        } else {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; this.field339.length - 1 > var5 && this.field339[var5][0] <= var4; var5++) {
                }
                int[] var6 = this.field339[var5 - 1];
                int[] var7 = this.field339[var5];
                int var8 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                int var9 = 4096 - var8;
                int var10 = var6[1] * var9 + var7[1] * var8 >> 12;
                if (var10 <= -32768) {
                    var10 = -32767;
                }
                if (var10 >= 32768) {
                    var10 = 32767;
                }
                this.field349[var3] = (short) var10;
            }
        }
        if (arg0 != 0) {
            this.method56((byte) 71);
        }
    }

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "(I)V", line = 378)
    public static void method176(int arg0) {
        if (arg0 == -16907) {
            field347 = null;
            field343 = null;
            field331 = null;
            field342 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILja;Z)V", line = 401)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        field332++;
        if (arg0 == 0) {
            this.field330 = arg1.method501(0);
            this.field339 = new int[arg1.method501(0)][2];
            for (int var4 = 0; var4 < this.field339.length; var4++) {
                this.field339[var4][0] = arg1.method485((byte) -2);
                this.field339[var4][1] = arg1.method485((byte) -2);
            }
        }
        if (!arg2) {
            method171(53);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIBII)V", line = 427)
    public static final void method177(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field334++;
        if (arg0 >= class90.field1495 && arg0 <= class294.field5041) {
            int var5 = class14.method74(class288.field4956, arg1, -1178441849, class153.field2635);
            int var6 = class14.method74(class288.field4956, arg4, -1178441849, class153.field2635);
            class94.method729(arg0, arg3, var6, 2, var5);
        }
        int var7 = 24 % ((arg2 + 12) / 36);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)V", line = 444)
    public final void method56(byte arg0) {
        field336++;
        if (this.field339 == null) {
            this.field339 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        if (this.field339.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (arg0 != -79) {
            method177(108, -52, (byte) 23, -9, 59);
        }
        if (this.field330 == 2) {
            this.method173(642061228);
        }
        class203.method1511(arg0 ^ 0xFFFFFEB1);
        this.method175(arg0 ^ 0xFFFFFFB1);
    }
}
