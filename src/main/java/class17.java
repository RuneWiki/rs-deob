import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class17 implements class106 {

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "Z")
    private boolean field209 = false;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    private int field215 = 50;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "Lsi;")
    private class66 field229;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "Lsi;")
    private class66 field232;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "Lja;")
    private class143 field241;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "Lja;")
    private class143 field211;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "[Z")
    private boolean[] field236;

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "[B")
    private byte[] field243;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "[Z")
    private boolean[] field216;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "[Z")
    private boolean[] field204;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "[Z")
    private boolean[] field227;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "[B")
    private byte[] field233;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "[B")
    private byte[] field240;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "[S")
    private short[] field219;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "[B")
    private byte[] field237;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "[Z")
    private boolean[] field203;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "Lph;")
    public static class229 field207 = class266.method1858("<col=ff7000>", 0);

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "[I")
    public static int[] field225 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "Lph;")
    public static class229 field239 = class266.method1858("clignotant2:", 0);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "Lck;")
    public static class1 field205;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "Lsi;")
    public static class66 field222;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(II)I", line = 10)
    public final int method90(int arg0, int arg1) {
        if (arg0 > -51) {
            this.field215 = -1;
        }
        field221++;
        return this.field233[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "(II)Z", line = 28)
    public static final boolean method91(int arg0, int arg1) {
        int var2 = 86 / ((57 - arg1) / 37);
        field235++;
        return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
    }

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "(II)Z", line = 42)
    public final boolean method92(int arg0, int arg1) {
        field206++;
        class54 var3 = this.method96(arg1 - 17242, arg0);
        if (var3 == null) {
            return false;
        } else if (arg1 == 0) {
            return var3.method365(-22752, this.field229, this);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(IB)V", line = 59)
    public final void method93(int arg0, byte arg1) {
        this.field215 = arg0;
        if (arg1 < 89) {
            this.field240 = (byte[]) null;
        }
        field200++;
        this.field241 = new class143(this.field215);
        if (class99.field1675) {
            this.field211 = new class143(this.field215);
        } else {
            this.field211 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "(II)I", line = 76)
    public static final int method94(int arg0, int arg1) {
        field230++;
        if (!(arg0 < 65 || arg0 > 90) || !(arg0 < 192 || arg0 > 222 || arg0 == 215)) {
            return arg0 + 32;
        } else if (arg0 == 159) {
            return 255;
        } else if (arg0 == 140) {
            return 156;
        } else {
            if (arg1 != 0) {
                method105(-12, 122, 59, -93, 34, 85, -36);
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)I", line = 98)
    public final int method95(int arg0, byte arg1) {
        if (arg1 != 33) {
            this.field219 = (short[]) null;
        }
        field212++;
        return this.field240[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "(II)Lie;", line = 118)
    private final class54 method96(int arg0, int arg1) {
        if (arg0 != -17242) {
            this.method96(30, -21);
        }
        class54 var3 = (class54) this.field241.method1027(arg0 + 17151, (long) arg1);
        field210++;
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field232.method523(-60, 0, arg1);
        if (var4 == null) {
            return null;
        } else {
            class164 var5 = new class164(var4);
            class54 var6 = new class54(var5);
            this.field241.method1026(var6, 120, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ)V", line = 144)
    public final void method97(int arg0, boolean arg1) {
        if (arg0 != -2459) {
            method94(-123, 35);
        }
        field223++;
        this.field209 = arg1;
        this.method107(false);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V", line = 160)
    public static void method98(int arg0) {
        field205 = null;
        if (arg0 < 56) {
            method91(-13, -83);
        }
        field222 = null;
        field225 = null;
        field207 = null;
        field239 = null;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(II)[I", line = 175)
    public final int[] method99(int arg0, int arg1) {
        field213++;
        int var3 = -128 / ((arg1 - 67) / 42);
        class54 var4 = this.method96(-17242, arg0);
        return var4 == null ? null : var4.method368(this.field209 || this.field203[arg0], this.field229, this, -1689);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)Lrg;", line = 191)
    private final class289 method100(boolean arg0, int arg1) {
        field220++;
        class289 var3 = (class289) this.field211.method1027(-96, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        class289 var4 = new class289(this.field219[arg1] & 0xFFFF);
        if (arg0) {
            return (class289) null;
        } else {
            this.field211.method1026(var4, 120, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "(II)V", line = 214)
    public final void method101(int arg0, int arg1) {
        for (class54 var3 = (class54) this.field241.method1022(25); var3 != null; var3 = (class54) this.field241.method1021(arg1)) {
            if (var3.field780) {
                var3.method370(arg0, 0);
                var3.field780 = false;
            }
        }
        if (arg1 != 1) {
            this.method111(70, -42);
        }
        field234++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(FBI)[I", line = 237)
    public final int[] method102(float arg0, byte arg1, int arg2) {
        if (arg1 != -97) {
            return (int[]) null;
        }
        class54 var4 = this.method96(arg1 - 17145, arg2);
        field201++;
        if (var4 == null) {
            return null;
        } else {
            var4.field780 = true;
            return var4.method367(arg0, this.field209 || this.field203[arg2], this.field229, 255, this);
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lsi;Lsi;Lsi;IZ)V", line = 601)
    public class17(class66 arg0, class66 arg1, class66 arg2, int arg3, boolean arg4) {
        this.field209 = arg4;
        this.field229 = arg2;
        this.field232 = arg0;
        this.field215 = arg3;
        this.field241 = new class143(this.field215);
        if (class99.field1675) {
            this.field211 = new class143(this.field215);
        } else {
            this.field211 = null;
        }
        class164 var6 = new class164(arg1.method523(-97, 0, 0));
        int var7 = var6.method1161(true);
        this.field236 = new boolean[var7];
        this.field243 = new byte[var7];
        this.field216 = new boolean[var7];
        this.field204 = new boolean[var7];
        this.field227 = new boolean[var7];
        this.field233 = new byte[var7];
        this.field240 = new byte[var7];
        this.field219 = new short[var7];
        this.field237 = new byte[var7];
        this.field203 = new boolean[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field236[var8] = var6.method1178(8) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field236[var9]) {
                this.field204[var9] = var6.method1178(8) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field236[var10]) {
                this.field216[var10] = var6.method1178(8) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field236[var11]) {
                this.field203[var11] = var6.method1178(8) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field236[var12]) {
                this.field227[var12] = var6.method1178(8) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field236[var13]) {
                this.field240[var13] = var6.method1163(864348104);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field236[var14]) {
                this.field237[var14] = var6.method1163(864348104);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field236[var15]) {
                this.field233[var15] = var6.method1163(864348104);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field236[var16]) {
                this.field243[var16] = var6.method1163(864348104);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field236[var17]) {
                this.field219[var17] = (short) var6.method1161(true);
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(IB)Z", line = 264)
    public final boolean method103(int arg0, byte arg1) {
        field238++;
        int var3 = 106 % ((-arg1 - 25) / 40);
        return this.field227[arg0];
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(BI)I", line = 276)
    public final int method104(byte arg0, int arg1) {
        if (arg0 >= -101) {
            return -64;
        } else {
            field217++;
            return this.field243[arg1] & 0xFF;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIII)V", line = 294)
    public static final void method105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class263.method1828((byte) -78, arg6);
        int var7 = arg6;
        int var8 = arg2;
        field202++;
        int var9 = -arg6;
        int var10 = arg6 - arg5;
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = var10;
        int var12 = -var10;
        int var13 = -1;
        if (class206.field3398 <= arg0 && arg0 <= class214.field3533) {
            int[] var14 = class202.field3337[arg0];
            int var15 = class178.method1278(class77.field1289, arg3 - arg6, arg2 ^ 0xFFFFB666, class192.field3172);
            int var16 = class178.method1278(class77.field1289, arg3 + arg6, -18842, class192.field3172);
            int var17 = class178.method1278(class77.field1289, arg3 - var10, -18842, class192.field3172);
            int var18 = class178.method1278(class77.field1289, arg3 + var10, -18842, class192.field3172);
            class193.method1354((byte) -37, var17, var15, arg1, var14);
            class193.method1354((byte) -37, var18, var17, arg4, var14);
            class193.method1354((byte) -37, var16, var18, arg1, var14);
        }
        int var19 = -1;
        while (var8 < var7) {
            var19 += 2;
            var12 += var19;
            var13 += 2;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class161.field2602[var11] = var8;
            }
            var8++;
            var9 += var13;
            if (var9 >= 0) {
                var7--;
                int var20 = arg0 - var7;
                var9 -= var7 << 1;
                int var21 = arg0 + var7;
                if (class206.field3398 <= var21 && class214.field3533 >= var20) {
                    if (var7 >= var10) {
                        int var22 = class178.method1278(class77.field1289, arg3 + var8, -18842, class192.field3172);
                        int var23 = class178.method1278(class77.field1289, arg3 - var8, -18842, class192.field3172);
                        if (class214.field3533 >= var21) {
                            class193.method1354((byte) -37, var22, var23, arg1, class202.field3337[var21]);
                        }
                        if (class206.field3398 <= var20) {
                            class193.method1354((byte) -37, var22, var23, arg1, class202.field3337[var20]);
                        }
                    } else {
                        int var24 = class161.field2602[var7];
                        int var25 = class178.method1278(class77.field1289, arg3 + var8, -18842, class192.field3172);
                        int var26 = class178.method1278(class77.field1289, arg3 - var8, -18842, class192.field3172);
                        int var27 = class178.method1278(class77.field1289, arg3 + var24, -18842, class192.field3172);
                        int var28 = class178.method1278(class77.field1289, arg3 - var24, -18842, class192.field3172);
                        if (var21 <= class214.field3533) {
                            int[] var29 = class202.field3337[var21];
                            class193.method1354((byte) -37, var28, var26, arg1, var29);
                            class193.method1354((byte) -37, var27, var28, arg4, var29);
                            class193.method1354((byte) -37, var25, var27, arg1, var29);
                        }
                        if (var20 >= class206.field3398) {
                            int[] var30 = class202.field3337[var20];
                            class193.method1354((byte) -37, var28, var26, arg1, var30);
                            class193.method1354((byte) -37, var27, var28, arg4, var30);
                            class193.method1354((byte) -37, var25, var27, arg1, var30);
                        }
                    }
                }
            }
            int var31 = arg0 + var8;
            int var32 = arg0 - var8;
            if (class206.field3398 <= var31 && var32 <= class214.field3533) {
                int var33 = arg3 - var7;
                int var34 = arg3 + var7;
                if (var34 >= class192.field3172 && var33 <= class77.field1289) {
                    int var35 = class178.method1278(class77.field1289, var34, arg2 - 18842, class192.field3172);
                    int var36 = class178.method1278(class77.field1289, var33, -18842, class192.field3172);
                    if (var8 < var10) {
                        int var37 = var8 > var11 ? class161.field2602[var8] : var11;
                        int var38 = class178.method1278(class77.field1289, arg3 + var37, arg2 + -18842, class192.field3172);
                        int var39 = class178.method1278(class77.field1289, arg3 - var37, arg2 ^ 0xFFFFB666, class192.field3172);
                        if (var31 <= class214.field3533) {
                            int[] var40 = class202.field3337[var31];
                            class193.method1354((byte) -37, var39, var36, arg1, var40);
                            class193.method1354((byte) -37, var38, var39, arg4, var40);
                            class193.method1354((byte) -37, var35, var38, arg1, var40);
                        }
                        if (class206.field3398 <= var32) {
                            int[] var41 = class202.field3337[var32];
                            class193.method1354((byte) -37, var39, var36, arg1, var41);
                            class193.method1354((byte) -37, var38, var39, arg4, var41);
                            class193.method1354((byte) -37, var35, var38, arg1, var41);
                        }
                    } else {
                        if (class214.field3533 >= var31) {
                            class193.method1354((byte) -37, var35, var36, arg1, class202.field3337[var31]);
                        }
                        if (var32 >= class206.field3398) {
                            class193.method1354((byte) -37, var35, var36, arg1, class202.field3337[var32]);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)Z", line = 478)
    public final boolean method106(int arg0, int arg1) {
        field208++;
        if (arg0 != 0) {
            field239 = (class229) null;
        }
        return this.field204[arg1];
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V", line = 497)
    public final void method107(boolean arg0) {
        this.field241.method1023(arg0);
        field224++;
        if (this.field211 != null) {
            this.field211.method1023(false);
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(IB)I", line = 508)
    public final int method108(int arg0, byte arg1) {
        if (arg1 > -87) {
            return 65;
        } else {
            field228++;
            return this.field237[arg0] & 0xFF;
        }
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(II)I", line = 520)
    public final int method109(int arg0, int arg1) {
        field214++;
        if (arg0 <= 92) {
            this.method102(0.3440525F, (byte) 116, 120);
        }
        return this.field219[arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(IB)Z", line = 541)
    public final boolean method110(int arg0, byte arg1) {
        field218++;
        if (this.field209 || this.field203[arg0]) {
            return true;
        } else {
            if (arg1 > -53) {
                this.field236 = (boolean[]) null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)V", line = 558)
    public final void method111(int arg0, int arg1) {
        field226++;
        class285.method1964(116, this.field233[arg1] & 0xFF, this.field243[arg1] & 0xFF);
        boolean var3 = false;
        int var4 = 56 / ((-arg0 - 3) / 34);
        class54 var5 = this.method96(-17242, arg1);
        if (var5 != null) {
            var3 = var5.method366(this.field229, 4, this.field209 || this.field203[arg1], this);
        }
        if (!var3) {
            class289 var6 = this.method100(false, arg1);
            var6.method1979((byte) -126);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)Z", line = 591)
    public final boolean method112(byte arg0, int arg1) {
        field231++;
        return arg0 == -59 ? this.field216[arg1] : true;
    }
}
