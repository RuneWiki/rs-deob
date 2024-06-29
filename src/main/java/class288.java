import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class288 {

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "[I")
    private int[] field4534 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "Z")
    public boolean field4548 = false;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    public int field4543 = -1;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4533 = "Loading - please wait.";

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public static int field4537 = 0;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field4531 = -1;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "Z")
    public static boolean field4549 = false;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "J")
    public static volatile long field4550 = 0L;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4536 = "Loaded sprites";

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "[I")
    private int[] field4539;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "[S")
    private short[] field4530;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "[S")
    private short[] field4535;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "[S")
    private short[] field4538;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "[S")
    private short[] field4551;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILim;Z)V", line = 7)
    private final void method2020(int arg0, class192 arg1, boolean arg2) {
        if (arg2) {
            this.field4543 = -112;
        }
        if (arg0 == 1) {
            this.field4543 = arg1.method1399(-1172389784);
        } else if (arg0 == 2) {
            int var4 = arg1.method1399(-1172389784);
            this.field4539 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4539[var5] = arg1.method1396(-54);
            }
        } else if (arg0 == 3) {
            this.field4548 = true;
        } else if (arg0 == 40) {
            int var8 = arg1.method1399(-1172389784);
            this.field4530 = new short[var8];
            this.field4551 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4530[var9] = (short) arg1.method1396(-99);
                this.field4551[var9] = (short) arg1.method1396(-111);
            }
        } else if (arg0 == 41) {
            int var6 = arg1.method1399(-1172389784);
            this.field4535 = new short[var6];
            this.field4538 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4535[var7] = (short) arg1.method1396(-41);
                this.field4538[var7] = (short) arg1.method1396(-23);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field4534[arg0 - 60] = arg1.method1396(-126);
        }
        field4546++;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)Lle;", line = 89)
    public final class259 method2021(int arg0) {
        field4532++;
        if (arg0 >= -127) {
            this.method2021(-84);
        }
        class259[] var2 = new class259[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field4534[var4] != -1) {
                var2[var3++] = class259.method1835(class24.field347, this.field4534[var4], 0);
            }
        }
        class259 var5 = new class259(var2, var3);
        if (this.field4530 != null) {
            for (int var6 = 0; var6 < this.field4530.length; var6++) {
                var5.method1860(this.field4530[var6], this.field4551[var6]);
            }
        }
        if (this.field4535 != null) {
            for (int var7 = 0; var7 < this.field4535.length; var7++) {
                var5.method1832(this.field4535[var7], this.field4538[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILch;IIIIIZI)V", line = 145)
    public static final void method2022(int arg0, class149 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        field4541++;
        int var9 = arg4 & 0x3;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var10 = arg1.field2253;
            var11 = arg1.field2278;
        } else {
            var10 = arg1.field2278;
            var11 = arg1.field2253;
        }
        int var12;
        int var13;
        if ((arg5 + var11) <= 104) {
            var12 = (var11 >> 1) + arg5;
            var13 = arg5 + (var11 + 1 >> 1);
        } else {
            var12 = arg5;
            var13 = arg5 + 1;
        }
        int var14;
        int var15;
        if (arg0 + var10 <= 104) {
            var14 = (var10 >> 1) + arg0;
            var15 = (var10 + 1 >> 1) + arg0;
        } else {
            var14 = arg0;
            var15 = arg0 + 1;
        }
        int var16 = (arg5 << 7) + (var11 << 6);
        int var17 = (arg0 << 7) + (var10 << 6);
        int[][] var18 = class84.field1282[arg2];
        int var19 = var18[var12][var14] + var18[var13][var14] + var18[var12][var15] + var18[var13][var15] >> 2;
        int var20 = 0;
        if (arg2 != 0) {
            int[][] var21 = class84.field1282[0];
            var20 = var19 - (var21[var12][var14] + var21[var13][var14] - (-var21[var12][var15] - var21[var13][var15]) >> 2);
        }
        int[][] var22 = (int[][]) null;
        if (arg2 < 3) {
            var22 = class84.field1282[arg2 + 1];
        }
        class266 var23 = arg1.method1046((class123) null, var18, var22, arg4, var17, false, var16, -18, var19, arg7, arg3);
        class32.method207(var23.field4198, var16 - arg8, var20, var17 - arg6);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)Lle;", line = 222)
    public final class259 method2023(int arg0) {
        field4544++;
        if (this.field4539 == null) {
            return null;
        }
        class259[] var2 = new class259[this.field4539.length];
        for (int var3 = arg0; var3 < this.field4539.length; var3++) {
            var2[var3] = class259.method1835(class24.field347, this.field4539[var3], 0);
        }
        class259 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class259(var2, var2.length);
        }
        if (this.field4530 != null) {
            for (int var5 = 0; var5 < this.field4530.length; var5++) {
                var4.method1860(this.field4530[var5], this.field4551[var5]);
            }
        }
        if (this.field4535 != null) {
            for (int var6 = 0; var6 < this.field4535.length; var6++) {
                var4.method1832(this.field4535[var6], this.field4538[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V", line = 277)
    public static void method2024(int arg0) {
        field4536 = null;
        if (arg0 <= 106) {
            field4531 = -63;
        }
        field4533 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLim;)V", line = 304)
    public final void method2025(byte arg0, class192 arg1) {
        while (true) {
            int var3 = arg1.method1399(-1172389784);
            if (var3 == 0) {
                if (arg0 >= -23) {
                    return;
                }
                field4542++;
                return;
            }
            this.method2020(var3, arg1, false);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILkb;I)Z", line = 325)
    public static final boolean method2026(int arg0, int arg1, class39 arg2, int arg3) {
        field4545++;
        byte[] var4 = arg2.method250(true, arg0, arg1);
        if (var4 == null) {
            return false;
        }
        if (arg3 > -32) {
            method2026(31, 113, (class39) null, -115);
        }
        class129.method887(false, var4);
        return true;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)Z", line = 354)
    public final boolean method2027(boolean arg0) {
        if (arg0) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field4534[var3] != -1 && !class24.field347.method243(0, false, this.field4534[var3])) {
                var2 = false;
            }
        }
        field4552++;
        return var2;
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)Z", line = 377)
    public final boolean method2028(int arg0) {
        field4540++;
        if (arg0 != 12110) {
            method2026(47, -91, (class39) null, -71);
        }
        if (this.field4539 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field4539.length; var3++) {
            if (!class24.field347.method243(0, false, this.field4539[var3])) {
                var2 = false;
            }
        }
        return var2;
    }
}
