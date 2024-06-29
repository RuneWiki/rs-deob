import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class257 extends class110 {

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "Ljava/lang/String;")
    public static String field3892 = " has logged out.";

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!ia", name = "N", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!ia", name = "M", descriptor = "Llm;")
    public static class210 field3889;

    @OriginalMember(owner = "client!ia", name = "S", descriptor = "[I")
    public static int[] field3895;

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "[S")
    public static short[] field3898;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(III)V", line = 5)
    public static final void method1741(int arg0, int arg1, int arg2) {
        if (class124.field1936 != arg2) {
            class249.field3714 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class249.field3714[var3] = (var3 << 12) / arg2;
            }
            class124.field1936 = arg2;
            class196.field2949 = arg2 - 1;
            class305.field4654 = arg2 == 64 ? 2048 : 4096;
        }
        if (class295.field4523 != arg0) {
            if (class124.field1936 == arg0) {
                class177.field2615 = class249.field3714;
            } else {
                class177.field2615 = new int[arg0];
                for (int var4 = 0; var4 < arg0; var4++) {
                    class177.field2615[var4] = (var4 << 12) / arg0;
                }
            }
            class295.field4523 = arg0;
            class154.field2320 = arg0 - 1;
        }
        field3894++;
        if (arg1 != 31497) {
            method1742((byte) 20, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B[B)V", line = 52)
    public static final void method1742(byte arg0, byte[] arg1) {
        field3888++;
        class263 var2 = new class263(arg1);
        var2.field4025 = arg1.length - 2;
        class96.field1444 = var2.method1830((byte) -77);
        class203.field3051 = new int[class96.field1444];
        if (arg0 != -124) {
            field3892 = (String) null;
        }
        class203.field3039 = new int[class96.field1444];
        class160.field2403 = new int[class96.field1444];
        class205.field3083 = new byte[class96.field1444][];
        class278.field4233 = new byte[class96.field1444][];
        class184.field2754 = new int[class96.field1444];
        class74.field961 = new boolean[class96.field1444];
        var2.field4025 = arg1.length - (class96.field1444 * 8) - 7;
        class12.field136 = var2.method1830((byte) -77);
        class132.field2034 = var2.method1830((byte) -77);
        int var3 = (var2.method1787(false) & 0xFF) + 1;
        for (int var4 = 0; var4 < class96.field1444; var4++) {
            class203.field3039[var4] = var2.method1830((byte) -77);
        }
        for (int var5 = 0; var5 < class96.field1444; var5++) {
            class184.field2754[var5] = var2.method1830((byte) -77);
        }
        for (int var6 = 0; var6 < class96.field1444; var6++) {
            class203.field3051[var6] = var2.method1830((byte) -77);
        }
        for (int var7 = 0; var7 < class96.field1444; var7++) {
            class160.field2403[var7] = var2.method1830((byte) -77);
        }
        var2.field4025 = arg1.length - (class96.field1444 * 8) - (var3 * 3 + -3 + 7);
        class66.field865 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class66.field865[var8] = var2.method1824(false);
            if (class66.field865[var8] == 0) {
                class66.field865[var8] = 1;
            }
        }
        var2.field4025 = 0;
        for (int var9 = 0; var9 < class96.field1444; var9++) {
            int var10 = class160.field2403[var9];
            int var11 = class203.field3051[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            byte[] var14 = new byte[var12];
            class205.field3083[var9] = var14;
            class278.field4233[var9] = var13;
            boolean var15 = false;
            int var16 = var2.method1787(false);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var12; var22++) {
                    var14[var22] = var2.method1810((byte) 123);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var12; var23++) {
                        byte var24 = var13[var23] = var2.method1810((byte) 100);
                        var15 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label92: while (true) {
                    if (var17 >= var11) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var19 = 0;
                        while (true) {
                            if (var19 >= var11) {
                                break label92;
                            }
                            for (int var20 = 0; var20 < var10; var20++) {
                                byte var21 = var13[var19 + (var11 * var20)] = var2.method1810((byte) 99);
                                var15 |= var21 != -1;
                            }
                            var19++;
                        }
                    }
                    for (int var18 = 0; var18 < var10; var18++) {
                        var14[var11 * var18 + var17] = var2.method1810((byte) 106);
                    }
                    var17++;
                }
            }
            class74.field961[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V", line = 215)
    public class257() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)[I", line = 226)
    public final int[] method46(int arg0, int arg1) {
        int[] var3 = this.field1695.method440((byte) -60, arg1);
        if (this.field1695.field875) {
            int[][] var4 = this.method770(arg1, (byte) 41, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class124.field1936; var8++) {
                var3[var8] = (var5[var8] - (-var6[var8] - var7[var8])) / 3;
            }
        }
        field3891++;
        if (arg0 != 1) {
            method1743(-71, false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(IZ)V", line = 263)
    public static final void method1743(int arg0, boolean arg1) {
        if (arg0 == 0) {
            field3897++;
            class212.field3227 = arg1;
            class307.field4679 = !class80.method540(-115);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIZIII)V", line = 280)
    public static final void method1744(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 334) {
            return;
        }
        field3896++;
        if (arg5 < 1) {
            arg5 = 1;
        }
        if (arg4 < 1) {
            arg4 = 1;
        }
        if (class117.field1817) {
            int var6 = arg4 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = (class288.field4345 - class57.field715) * var6 / 100 + class57.field715;
            if (var7 < class106.field1658) {
                var7 = class106.field1658;
            } else if (class252.field3756 < var7) {
                var7 = class252.field3756;
            }
            int var8 = arg4 * var7 * 512 / (arg5 * 334);
            if (class236.field3543 > var8) {
                short var12 = class236.field3543;
                var7 = arg5 * var12 * 334 / (arg4 * 512);
                if (var7 > class252.field3756) {
                    var7 = class252.field3756;
                    int var13 = arg4 * var7 * 512 / (var12 * 334);
                    int var14 = (arg5 - var13) / 2;
                    if (arg2) {
                        class308.method2133();
                        class308.method2126(arg0, arg1, var14, arg4, 0);
                        class308.method2126(arg5 + arg0 - var14, arg1, var14, arg4, 0);
                    }
                    arg0 += var14;
                    arg5 -= var14 * 2;
                }
            } else if (var8 > class213.field3237) {
                short var9 = class213.field3237;
                var7 = arg5 * var9 * 334 / (arg4 * 512);
                if (class106.field1658 > var7) {
                    var7 = class106.field1658;
                    int var10 = var9 * 334 * arg5 / (var7 * 512);
                    int var11 = (arg4 - var10) / 2;
                    if (arg2) {
                        class308.method2133();
                        class308.method2126(arg0, arg1, arg5, var11, 0);
                        class308.method2126(arg0, arg1 + arg4 - var11, arg5, var11, 0);
                    }
                    arg4 -= var11 * 2;
                    arg1 += var11;
                }
            }
            class30.field405 = arg4 * var7 / 334;
        }
        class176.field2603 = (short) arg4;
        class187.field2785 = arg0;
        class126.field1972 = (short) arg5;
        class123.field1929 = arg1;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/lang/String;BC)[Ljava/lang/String;", line = 381)
    public static final String[] method1745(String arg0, byte arg1, char arg2) {
        field3884++;
        int var3 = class130.method966(arg2, arg0, (byte) -22);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 31 / ((arg1 + 23) / 35);
        while (var3 > var7) {
            int var9;
            for (var9 = var6; arg0.charAt(var9) != arg2; var9++) {
            }
            var4[var5++] = arg0.substring(var6, var9);
            var6 = var9 + 1;
            var7++;
        }
        var4[var3] = arg0.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "(I)V", line = 417)
    public static void method1746(int arg0) {
        field3898 = null;
        if (arg0 != 21347) {
            field3889 = (class210) null;
        }
        field3895 = null;
        field3889 = null;
        field3892 = null;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(IBI)I", line = 447)
    public static final int method1747(int arg0, byte arg1, int arg2) {
        field3886++;
        if (arg1 != 34) {
            method1747(99, (byte) 54, 3);
        }
        int var3 = 0;
        while (arg2 > 0) {
            arg2--;
            var3 = var3 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
        }
        return var3;
    }
}
