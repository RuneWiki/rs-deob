import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class41 extends class131 {

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "[J")
    private long[] field953 = new long[10];

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    private int field949 = 256;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    private int field955 = 0;

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "I")
    private int field963 = 1;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "J")
    private long field944 = class27.method233((byte) 103);

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "Ltd;")
    public static class136 field947 = class145.method1172("Sie befinden sich in einem Mitglieder)2Gebiet(Q", 45);

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "Ltd;")
    public static class136 field960 = class145.method1172("Weiter", 45);

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "Ltd;")
    public static class136 field961 = class145.method1172("<col=ff9040>", 45);

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "Ltd;")
    public static class136 field956 = class145.method1172(" steht bereits auf Ihrer Freunde)2Liste(Q", 45);

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "Lk;")
    public static class69 field958 = new class69();

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "Lc;")
    public static class15 field964 = new class15(4096);

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "Ltd;")
    public static class136 field968 = class145.method1172("Bitte versuchen Sie es erneut)3", 45);

    @OriginalMember(owner = "client!fe", name = "F", descriptor = "Ltd;")
    public static class136 field966 = class145.method1172("Verbindung abgebrochen)3", 45);

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "I")
    public static int field969 = 0;

    @OriginalMember(owner = "client!fe", name = "G", descriptor = "I")
    public static int field967 = 0;

    @OriginalMember(owner = "client!fe", name = "J", descriptor = "Ltd;")
    public static class136 field970 = class145.method1172("Ausw-=hlen", 45);

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    private int field951;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "Lfa;")
    public static class37 field946;

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "[I")
    public static int[] field965;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIZ)I")
    public final int method340(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field955 = 87;
        }
        int var4 = this.field949;
        int var5 = this.field963;
        this.field963 = 1;
        this.field949 = 300;
        this.field944 = class27.method233((byte) -7);
        if (this.field953[this.field951] == 0L) {
            this.field949 = var4;
            this.field963 = var5;
        } else if (this.field953[this.field951] < this.field944) {
            this.field949 = (int) ((long) (arg1 * 2560) / (this.field944 - this.field953[this.field951]));
        }
        if (this.field949 < 25) {
            this.field949 = 25;
        }
        field959++;
        if (this.field949 > 256) {
            this.field949 = 256;
            this.field963 = (int) ((long) arg1 - (this.field944 - this.field953[this.field951]) / 10L);
        }
        if (arg1 < this.field963) {
            this.field963 = arg1;
        }
        this.field953[this.field951] = this.field944;
        this.field951 = (this.field951 + 1) % 10;
        if (this.field963 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field953[var6] != 0L) {
                    this.field953[var6] -= -((long) this.field963);
                }
            }
        }
        if (this.field963 < arg0) {
            this.field963 = arg0;
        }
        class9.method42(0, (long) this.field963);
        int var7 = 0;
        while (this.field955 < 256) {
            var7++;
            this.field955 += this.field949;
        }
        this.field955 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V")
    public static void method341(int arg0) {
        field968 = null;
        field946 = null;
        field956 = null;
        field966 = null;
        field958 = null;
        field947 = null;
        field970 = null;
        if (arg0 == -27724) {
            field960 = null;
            field965 = null;
            field964 = null;
            field961 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method342(int arg0, Component arg1) {
        field962++;
        Method var2 = class22.field470;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class79.field1808);
        if (arg0 <= 2) {
            method347(-124);
        }
        arg1.addFocusListener(class79.field1808);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IILo;[B[Lm;I)V")
    public static final void method343(int arg0, int arg1, class97 arg2, byte[] arg3, class83[] arg4, int arg5) {
        if (arg5 != 8) {
            method343(-24, -21, null, null, null, -10);
        }
        field948++;
        int var6 = -1;
        class127 var7 = new class127(arg3);
        while (true) {
            int var8 = var7.method1027(false);
            if (var8 == 0) {
                return;
            }
            int var9 = 0;
            var6 += var8;
            while (true) {
                int var10 = var7.method1027(false);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var7.method1011(47);
                int var13 = var12 >> 2;
                int var14 = var9 >> 12;
                int var15 = var12 & 0x3;
                int var16 = var9 >> 6 & 0x3F;
                int var17 = arg1 + var16;
                int var18 = arg0 + var11;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    int var19 = var14;
                    if ((class125.field2895[1][var17][var18] & 0x2) == 2) {
                        var19 = var14 - 1;
                    }
                    class83 var20 = null;
                    if (var19 >= 0) {
                        var20 = arg4[var19];
                    }
                    class29.method251(var20, var14, var18, var15, var17, true, var6, var13, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILv;)V")
    public static final void method344(int arg0, class144 arg1) {
        field952++;
        if (arg1.field3331 != null) {
            arg1.field3331.field3221 = 0;
        }
        arg1.field3329 = false;
        for (class144 var2 = arg1.method83(); var2 != null; var2 = arg1.method79()) {
            method344(-1, var2);
        }
        if (arg0 != -1) {
            method342(-61, null);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIIIIZIIZ)Z")
    public static final boolean method345(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, boolean arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class61.field1300[var12][var36] = 0;
                class74.field1643[var12][var36] = 99999999;
            }
        }
        field943++;
        class61.field1300[arg6][arg4] = 99;
        int var13 = arg6;
        class74.field1643[arg6][arg4] = 0;
        byte var14 = 0;
        class74.field1656[var14] = arg6;
        int var15 = arg4;
        int var37 = var14 + 1;
        class53.field1182[var14] = arg4;
        int var16 = 0;
        boolean var17 = arg11;
        int var18 = class74.field1656.length;
        int[][] var19 = class4.field83[class62.field1331].field1972;
        while (var37 != var16) {
            var15 = class53.field1182[var16];
            var13 = class74.field1656[var16];
            var16 = (var16 + 1) % var18;
            if (arg10 == var13 && arg7 == var15) {
                var17 = true;
                break;
            }
            if (arg9 != 0) {
                if ((arg9 < 5 || arg9 == 10) && class4.field83[class62.field1331].method622(arg9 - 1, arg3, var13, true, arg10, var15, arg7)) {
                    var17 = true;
                    break;
                }
                if (arg9 < 10 && class4.field83[class62.field1331].method618(arg9 - 1, arg3, 128, var13, var15, arg10, arg7)) {
                    var17 = true;
                    break;
                }
            }
            if (arg1 != 0 && arg0 != 0 && class4.field83[class62.field1331].method613(arg2, var15, arg1, arg0, var13, (byte) -118, arg7, arg10)) {
                var17 = true;
                break;
            }
            int var35 = class74.field1643[var13][var15] + 1;
            if (var13 > 0 && class61.field1300[var13 - 1][var15] == 0 && (var19[var13 - 1][var15] & 0x12C0108) == 0) {
                class74.field1656[var37] = var13 - 1;
                class53.field1182[var37] = var15;
                var37 = (var37 + 1) % var18;
                class61.field1300[var13 - 1][var15] = 2;
                class74.field1643[var13 - 1][var15] = var35;
            }
            if (var13 < 103 && class61.field1300[var13 + 1][var15] == 0 && (var19[var13 + 1][var15] & 0x12C0180) == 0) {
                class74.field1656[var37] = var13 + 1;
                class53.field1182[var37] = var15;
                class61.field1300[var13 + 1][var15] = 8;
                class74.field1643[var13 + 1][var15] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var15 > 0 && class61.field1300[var13][var15 - 1] == 0 && (var19[var13][var15 - 1] & 0x12C0102) == 0) {
                class74.field1656[var37] = var13;
                class53.field1182[var37] = var15 - 1;
                class61.field1300[var13][var15 - 1] = 1;
                class74.field1643[var13][var15 - 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var15 < 103 && class61.field1300[var13][var15 + 1] == 0 && (var19[var13][var15 + 1] & 0x12C0120) == 0) {
                class74.field1656[var37] = var13;
                class53.field1182[var37] = var15 + 1;
                class61.field1300[var13][var15 + 1] = 4;
                class74.field1643[var13][var15 + 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var13 > 0 && var15 > 0 && class61.field1300[var13 - 1][var15 - 1] == 0 && (var19[var13 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var15] & 0x12C0108) == 0 && (var19[var13][var15 - 1] & 0x12C0102) == 0) {
                class74.field1656[var37] = var13 - 1;
                class53.field1182[var37] = var15 - 1;
                var37 = (var37 + 1) % var18;
                class61.field1300[var13 - 1][var15 - 1] = 3;
                class74.field1643[var13 - 1][var15 - 1] = var35;
            }
            if (var13 < 103 && var15 > 0 && class61.field1300[var13 + 1][var15 - 1] == 0 && (var19[var13 + 1][var15 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var15] & 0x12C0180) == 0 && (var19[var13][var15 - 1] & 0x12C0102) == 0) {
                class74.field1656[var37] = var13 + 1;
                class53.field1182[var37] = var15 - 1;
                class61.field1300[var13 + 1][var15 - 1] = 9;
                class74.field1643[var13 + 1][var15 - 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var13 > 0 && var15 < 103 && class61.field1300[var13 - 1][var15 + 1] == 0 && (var19[var13 - 1][var15 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var15] & 0x12C0108) == 0 && (var19[var13][var15 + 1] & 0x12C0120) == 0) {
                class74.field1656[var37] = var13 - 1;
                class53.field1182[var37] = var15 + 1;
                class61.field1300[var13 - 1][var15 + 1] = 6;
                class74.field1643[var13 - 1][var15 + 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var13 < 103 && var15 < 103 && class61.field1300[var13 + 1][var15 + 1] == 0 && (var19[var13 + 1][var15 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var15] & 0x12C0180) == 0 && (var19[var13][var15 + 1] & 0x12C0120) == 0) {
                class74.field1656[var37] = var13 + 1;
                class53.field1182[var37] = var15 + 1;
                class61.field1300[var13 + 1][var15 + 1] = 12;
                class74.field1643[var13 + 1][var15 + 1] = var35;
                var37 = (var37 + 1) % var18;
            }
        }
        class29.field640 = 0;
        if (!var17) {
            if (!arg8) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg10 - var22; var23 <= arg10 + var22; var23++) {
                for (int var24 = arg7 - var22; var24 <= arg7 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class74.field1643[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg10 > var23) {
                            var25 = arg10 - var23;
                        } else if (arg1 + arg10 - 1 < var23) {
                            var25 = var23 + 1 - arg10 - arg1;
                        }
                        int var26 = 0;
                        if (var24 < arg7) {
                            var26 = arg7 - var24;
                        } else if (arg0 + arg7 - 1 < var24) {
                            var26 = var24 + 1 - arg0 - arg7;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && var21 > class74.field1643[var23][var24]) {
                            var13 = var23;
                            var21 = class74.field1643[var23][var24];
                            var15 = var24;
                            var20 = var27;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg6 == var13 && arg4 == var15) {
                return false;
            }
            class29.field640 = 1;
        }
        byte var28 = 0;
        class74.field1656[var28] = var13;
        int var38 = var28 + 1;
        class53.field1182[var28] = var15;
        int var29;
        int var30 = var29 = class61.field1300[var13][var15];
        while (arg6 != var13 || arg4 != var15) {
            if (var29 != var30) {
                class74.field1656[var38] = var13;
                var29 = var30;
                class53.field1182[var38++] = var15;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            if ((var30 & 0x1) != 0) {
                var15++;
            } else if ((var30 & 0x4) != 0) {
                var15--;
            }
            var30 = class61.field1300[var13][var15];
        }
        if (var38 > 0) {
            int var31 = var38--;
            if (var31 > 25) {
                var31 = 25;
            }
            int var32 = class74.field1656[var38];
            int var33 = class53.field1182[var38];
            if (arg5 == 0) {
                class15.field304.method867(143, true);
                class15.field304.method1026(var31 + var31 + 3, (byte) 127);
                class139.field3243++;
            }
            if (arg5 == 1) {
                class15.field304.method867(201, true);
                class15.field304.method1026(var31 + var31 + 3 + 14, (byte) 127);
                class47.field1079++;
            }
            if (arg5 == 2) {
                class51.field1152++;
                class15.field304.method867(147, true);
                class15.field304.method1026(var31 + var31 + 3, (byte) 127);
            }
            class15.field304.method1000(class99.field2379[82] ? 1 : 0, -89);
            class15.field304.method1042(219, var32 + class91.field2145);
            class15.field304.method997(var33 + class52.field1176, !arg11);
            class108.field2554 = class53.field1182[0];
            class18.field369 = class74.field1656[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class15.field304.method1040(class74.field1656[var38] - var32, (byte) 106);
                class15.field304.method1000(class53.field1182[var38] - var33, -114);
            }
            return true;
        } else if (arg5 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
    public final void method346(int arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            this.field953[var2] = 0L;
        }
        if (arg0 != -724) {
            method344(96, null);
        }
        field950++;
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)[Lnb;")
    public static final class92[] method347(int arg0) {
        field954++;
        class92[] var1 = new class92[class76.field1717];
        int var2 = 0;
        if (arg0 >= -20) {
            method341(114);
        }
        while (class76.field1717 > var2) {
            class92 var3 = var1[var2] = new class92();
            var3.field2164 = class96.field2252;
            var3.field2168 = class64.field1381;
            var3.field2165 = class71.field1511[var2];
            var3.field2166 = class81.field1905[var2];
            var3.field2170 = class3.field59[var2];
            var3.field2163 = class65.field1408[var2];
            var3.field2167 = class127.field2953;
            var3.field2169 = class124.field2887[var2];
            var2++;
        }
        class124.method957(127);
        return var1;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
    public class41() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field953[var1] = this.field944;
        }
    }
}
