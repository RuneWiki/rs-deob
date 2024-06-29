import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class62 {

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "Ljn;")
    private class668 field1002;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
    private int field1014;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "[[I")
    private int[][] field1015;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "[Z")
    private boolean[] field996;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "[I")
    public static int[] field997 = new int[4096];

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "[I")
    public static int[] field1006 = new int[] { 7500, 500 };

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Z")
    public static boolean field999 = false;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "Z")
    public static boolean field1008 = false;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "Ljn;")
    public static class668 field1012;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1000;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method598(int arg0, int arg1, int arg2) {
        field1005++;
        if (arg1 == 5093) {
            boolean var3 = (arg2 & 0x37) == 0 ? class681.method3861(arg0, arg2, (byte) 119) : class630.method3611(arg2, (byte) 30, arg0);
            return var3 | class215.method1316(arg0, arg1 ^ 0x7753, arg2) | (arg0 & 0x10000) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IB)[I", line = 16)
    public final int[] method599(int arg0, byte arg1) {
        field1003++;
        if (arg0 < 0 || arg0 >= this.field1015.length) {
            return this.field1014 == -1 ? new int[0] : new int[] { this.field1014 };
        } else if (this.field996[arg0] && this.field1015[arg0].length > 1) {
            int var3 = this.field1014 == -1 ? 0 : 1;
            Random var4 = new Random();
            int[] var5 = new int[this.field1015[arg0].length];
            class252.method1544(this.field1015[arg0], 0, var5, 0, var5.length);
            if (arg1 > -83) {
                return null;
            }
            for (int var6 = var3; var6 < var5.length; var6++) {
                int var7 = class517.method3062(var4, 26100, var5.length - var3) + var3;
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
            }
            return var5;
        } else {
            return this.field1015[arg0];
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)Lne;", line = 62)
    public final class290 method600(int arg0, int arg1) {
        field1004++;
        byte[] var3 = this.field1002.method3800(arg1, arg0, (byte) -92);
        class290 var4 = new class290();
        var4.method1725((byte) 72, new class389(var3));
        return var4;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V", line = 75)
    public static final void method601(byte arg0) {
        field1007++;
        if (arg0 <= 22) {
            return;
        }
        for (class32 var1 = (class32) class440.field6267.method1132((byte) -92); var1 != null; var1 = (class32) class440.field6267.method1134(8446)) {
            if (var1.field657 > 0) {
                var1.field657--;
            }
            if (var1.field657 != 0) {
                if (var1.field654 > 0) {
                    var1.field654--;
                }
                if (var1.field654 == 0 && var1.field647 >= 1 && var1.field661 >= 1 && (class473.field6604 - 2) >= var1.field647 && var1.field661 <= class205.field2465 - 2 && (var1.field660 < 0 || class380.method2199(var1.field655, var1.field660, (byte) 66))) {
                    class21.method342(var1.field660, var1.field662, var1.field655, var1.field661, 3, -1, var1.field647, var1.field648, var1.field651);
                    var1.field654 = -1;
                    if (var1.field660 == var1.field650 && var1.field650 == -1) {
                        var1.method3045(true);
                    } else if (var1.field660 == var1.field650 && var1.field652 == var1.field651 && var1.field658 == var1.field655) {
                        var1.method3045(true);
                    }
                }
            } else if (var1.field650 < 0 || class380.method2199(var1.field658, var1.field650, (byte) 66)) {
                class21.method342(var1.field650, var1.field662, var1.field658, var1.field661, 3, -1, var1.field647, var1.field648, var1.field652);
                var1.method3045(true);
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IILjn;I)Lhw;", line = 138)
    public static final class114 method602(int arg0, int arg1, class668 arg2, int arg3) {
        field1010++;
        class389 var4 = new class389(arg2.method3800(arg1, arg3, (byte) -92));
        if (arg0 != -21609) {
            field1012 = null;
        }
        class114 var5 = new class114(arg1, var4.method2244((byte) -71), var4.method2244((byte) -100), var4.method2255(255), var4.method2255(255), var4.method2229(255) == 1, var4.method2229(255), var4.method2229(255));
        int var6 = var4.method2229(arg0 ^ 0xFFFFAB68);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field1469.method1129(new class395(var4.method2229(255), var4.method2260(-54), var4.method2260(-122), var4.method2260(-52), var4.method2260(-115), var4.method2260(-79), var4.method2260(-25), var4.method2260(-123), var4.method2260(-54)), 262144);
        }
        var5.method816(-18457);
        return var5;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)Z", line = 166)
    public final boolean method603(int arg0) {
        field1009++;
        if (arg0 > -48) {
            return true;
        } else {
            return this.field1014 != -1;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIII)V", line = 180)
    public static final void method604(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class587.field8513 <= arg2 && arg4 <= class221.field2866 && arg6 >= class598.field8632 && class288.field3883 >= arg1) {
            if (arg3 == 1) {
                class220.method1332(arg4, arg2, 0, arg1, arg6, arg0);
            } else {
                class579.method3379(arg2, arg0, arg3, arg1, arg4, arg6, (byte) -76);
            }
        } else if (arg3 == 1) {
            class555.method3247(arg6, arg1, arg2, arg4, arg0, 3622);
        } else {
            class205.method1237((byte) -124, arg4, arg0, arg1, arg6, arg2, arg3);
        }
        field1013++;
        int var7 = 42 % ((50 - arg5) / 35);
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)V", line = 219)
    public static final void method605(byte arg0) {
        class677.field9710 = 0;
        class549.field7968 = 0;
        field1011++;
        class389.method2259(-2);
        class149.method955((byte) -39);
        class405.method2448(0);
        boolean var1 = false;
        int var2 = 42 / ((24 - arg0) / 34);
        for (int var3 = 0; var3 < class549.field7968; var3++) {
            int var5 = class15.field271[var3];
            class633 var6 = (class633) class522.field7662.method3678((long) var5, -128);
            class557 var7 = var6.field9097;
            if (class361.field4805 && class299.method1775(true, var5)) {
                class404.method2437((byte) 5);
            }
            if (class543.field7882 != var7.field2606) {
                if (var7.field8052.method1878((byte) 98)) {
                    class164.method1036(var7, (byte) -50);
                }
                var7.method3251(null, 0);
                var1 = true;
                var6.method3045(true);
            }
        }
        if (var1) {
            class59.field928 = class522.field7662.method3673(17467);
            class522.field7662.method3675(class671.field9657, -95);
        }
        if (class283.field3848 != class29.field617.field5195) {
            throw new RuntimeException("gnp1 pos:" + class29.field617.field5195 + " psize:" + class283.field3848);
        }
        for (int var4 = 0; var4 < class99.field1332; var4++) {
            if (class522.field7662.method3678((long) class600.field8658[var4], -127) == null) {
                throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class99.field1332);
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lke;I)V", line = 288)
    public static final void method606(class553 arg0, int arg1) {
        arg0.field8027 = null;
        field998++;
        if (arg1 < ~class530.field7744) {
            class703.field9927.method2071((byte) -77, arg0);
            class530.field7744++;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BI)Z", line = 313)
    public static final boolean method607(byte arg0, int arg1) {
        if (arg0 != -106) {
            field1000 = null;
        }
        field1001++;
        if (class299.field4032[arg1]) {
            return true;
        } else if (class568.field8304.method3797(arg1, (byte) 66)) {
            int var2 = class568.field8304.method3805(arg1, false);
            if (var2 == 0) {
                class299.field4032[arg1] = true;
                return true;
            }
            if (class516.field7555[arg1] == null) {
                class516.field7555[arg1] = new class17[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class516.field7555[arg1][var3] == null) {
                    byte[] var4 = class568.field8304.method3800(var3, arg1, (byte) -92);
                    if (var4 != null) {
                        class17 var5 = class516.field7555[arg1][var3] = new class17();
                        var5.field465 = (arg1 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method208(9593, new class389(var4));
                    }
                }
            }
            class299.field4032[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Ler;ILjn;)V", line = 378)
    public class62(class90 arg0, int arg1, class668 arg2) {
        this.field1002 = arg2;
        this.field1002.method3805(1, false);
        class389 var4 = new class389(this.field1002.method3800(0, 0, (byte) -92));
        int var5 = var4.method2229(255);
        if (var5 > 3) {
            this.field1014 = -1;
            this.field1015 = new int[0][];
            this.field996 = new boolean[0];
        } else {
            int var6 = var4.method2229(255);
            class161[] var7 = class676.method3840(125);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method2229(255);
                    if (var7[var9].field1987 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method2229(255);
                int var12 = var4.method2229(255);
                if (var5 > 2) {
                    this.field1014 = var4.method2270((byte) 71);
                } else {
                    this.field1014 = -1;
                }
                this.field996 = new boolean[var12 + 1];
                this.field1015 = new int[var12 + 1][];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method2229(255);
                    this.field996[var15] = var4.method2229(255) == 1;
                    int var16 = var4.method2260(-54);
                    if (this.field1014 == -1) {
                        this.field1015[var15] = new int[var16];
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field1015[var15][var18] = var4.method2260(-84);
                        }
                    } else {
                        this.field1015[var15] = new int[var16 + 1];
                        this.field1015[var15][0] = this.field1014;
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field1015[var15][var17 + 1] = var4.method2260(-54);
                        }
                    }
                }
                for (int var14 = 0; var14 < (var12 + 1); var14++) {
                    if (this.field1015[var14] == null) {
                        if (this.field1014 == -1) {
                            this.field1015[var14] = new int[0];
                        } else {
                            this.field1015[var14] = new int[] { this.field1014 };
                        }
                    }
                }
            } else {
                this.field1014 = -1;
                this.field996 = new boolean[0];
                this.field1015 = new int[0][];
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V", line = 519)
    public static void method608(int arg0) {
        if (arg0 != 1928) {
            field997 = null;
        }
        field1006 = null;
        field1000 = null;
        field997 = null;
        field1012 = null;
    }
}
