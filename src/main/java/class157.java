import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class157 {

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public int field2567 = -1;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public int field2571 = -1;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
    public int field2576 = 5;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public int field2572 = -1;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "I")
    public int field2583 = 99;

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "Z")
    public boolean field2590 = false;

    @OriginalMember(owner = "client!dh", name = "D", descriptor = "I")
    public int field2594 = -1;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "I")
    public int field2584 = -1;

    @OriginalMember(owner = "client!dh", name = "B", descriptor = "I")
    public int field2592 = 2;

    @OriginalMember(owner = "client!dh", name = "F", descriptor = "Z")
    private boolean field2596 = false;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field2565 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "[Lbe;")
    public static class283[] field2575 = new class283[100];

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field2569 = -1;

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "Lbe;")
    public static class283 field2589 = class153.method941(-108, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "[J")
    public static long[] field2586 = new long[32];

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!dh", name = "A", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "[I")
    public int[] field2568;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "[I")
    private int[] field2570;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "[I")
    public int[] field2578;

    @OriginalMember(owner = "client!dh", name = "E", descriptor = "[I")
    private int[] field2595;

    @OriginalMember(owner = "client!dh", name = "C", descriptor = "[[I")
    public int[][] field2593;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIII)V", line = 6)
    public static final void method957(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2573++;
        int var10000 = arg0 + 1952;
        int var9 = arg3 + 1;
        class114.method742(var10000, arg5, class97.field1636[arg3], arg2, arg4);
        int var10 = arg0 ^ 0x1BA0;
        int var8 = arg1 - 1;
        class114.method742(var10, arg5, class97.field1636[arg1], arg2, arg4);
        if (arg0 != 28245) {
            method969(31, 117, 72);
        }
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class97.field1636[var6];
            var7[arg5] = var7[arg2] = arg4;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V", line = 45)
    public final void method958(int arg0) {
        if (this.field2572 == -1) {
            if (this.field2570 == null) {
                this.field2572 = 0;
            } else {
                this.field2572 = 2;
            }
        }
        int var2 = 63 / ((arg0) / 56);
        if (this.field2571 == -1) {
            if (this.field2570 == null) {
                this.field2571 = 0;
            } else {
                this.field2571 = 2;
            }
        }
        field2579++;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BILhk;)Lhk;", line = 81)
    public final class289 method959(byte arg0, int arg1, class289 arg2) {
        field2574++;
        int var4 = this.field2578[arg1];
        if (arg0 >= -35) {
            this.field2595 = (int[]) null;
        }
        class42 var5 = class242.method1635(0, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method1373(true, true);
        }
        class42 var7 = null;
        int var8 = 0;
        if (this.field2595 != null && arg1 < this.field2595.length) {
            int var9 = this.field2595[arg1];
            var7 = class242.method1635(0, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class289 var11 = arg2.method1373(!var5.method257(12, var6), !this.field2596);
            var11.method1364(var5, var6, this.field2596);
            return var11;
        } else {
            class289 var10 = arg2.method1373(!var5.method257(12, var6) & !var7.method257(12, var8), !this.field2596);
            var10.method1364(var5, var6, this.field2596);
            var10.method1364(var7, var8, this.field2596);
            return var10;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lfe;B)V", line = 126)
    public final void method960(class229 arg0, byte arg1) {
        if (arg1 != -81) {
            this.field2578 = (int[]) null;
        }
        field2582++;
        while (true) {
            int var3 = arg0.method1535((byte) 119);
            if (var3 == 0) {
                return;
            }
            this.method963(arg0, var3, (byte) -119);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lhk;IB)Lhk;", line = 149)
    public final class289 method961(class289 arg0, int arg1, byte arg2) {
        int var4 = this.field2578[arg1];
        field2581++;
        class42 var5 = class242.method1635(0, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (arg2 <= 81) {
            return (class289) null;
        } else if (var5 == null) {
            return arg0.method1365(true, true);
        } else {
            class289 var7 = arg0.method1365(!var5.method257(12, var6), !this.field2596);
            var7.method1364(var5, var6, this.field2596);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V", line = 189)
    public static void method962(byte arg0) {
        if (arg0 != -90) {
            method957(-56, 63, -114, -42, 32, -18);
        }
        field2586 = null;
        field2575 = null;
        field2589 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lfe;IB)V", line = 201)
    private final void method963(class229 arg0, int arg1, byte arg2) {
        field2577++;
        if (arg2 >= -103) {
            this.method965((class289) null, (byte) 74, (class157) null, 86, -80);
        }
        if (arg1 == 1) {
            int var4 = arg0.method1496(true);
            this.field2568 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2568[var5] = arg0.method1496(true);
            }
            this.field2578 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field2578[var6] = arg0.method1496(true);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field2578[var7] += arg0.method1496(true) << 16;
            }
        } else if (arg1 == 2) {
            this.field2567 = arg0.method1496(true);
        } else if (arg1 == 3) {
            int var15 = arg0.method1535((byte) 88);
            this.field2570 = new int[var15 + 1];
            for (int var16 = 0; var16 < var15; var16++) {
                this.field2570[var16] = arg0.method1535((byte) 124);
            }
            this.field2570[var15] = 9999999;
        } else if (arg1 == 4) {
            this.field2590 = true;
        } else if (arg1 == 5) {
            this.field2576 = arg0.method1535((byte) 70);
        } else if (arg1 == 6) {
            this.field2584 = arg0.method1496(true);
        } else if (arg1 == 7) {
            this.field2594 = arg0.method1496(true);
        } else if (arg1 == 8) {
            this.field2583 = arg0.method1535((byte) 120);
        } else if (arg1 == 9) {
            this.field2571 = arg0.method1535((byte) 87);
        } else if (arg1 == 10) {
            this.field2572 = arg0.method1535((byte) 100);
        } else if (arg1 == 11) {
            this.field2592 = arg0.method1535((byte) 126);
        } else if (arg1 == 12) {
            int var8 = arg0.method1535((byte) 119);
            this.field2595 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2595[var9] = arg0.method1496(true);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field2595[var10] = (arg0.method1496(true) << 16) + this.field2595[var10];
            }
        } else if (arg1 == 13) {
            int var11 = arg0.method1496(true);
            this.field2593 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg0.method1535((byte) 88);
                if (var13 > 0) {
                    this.field2593[var12] = new int[var13];
                    this.field2593[var12][0] = arg0.method1551(-127);
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field2593[var12][var14] = arg0.method1496(true);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field2596 = true;
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V", line = 359)
    public static final void method964(int arg0) {
        class69.field1015 = 0;
        field2580++;
        class103.field1740 = 0;
        class225.method1471((byte) -126);
        class38.method243(1);
        class214.method1417((byte) -108);
        if (arg0 < 92) {
            method957(76, -94, 109, 94, -45, 101);
        }
        for (int var1 = 0; var1 < class103.field1740; var1++) {
            int var2 = class15.field170[var1];
            if (class75.field1309 != class33.field493[var2].field1186) {
                if (class33.field493[var2].field822.method813(-1)) {
                    class1.method1(0, class33.field493[var2]);
                }
                class33.field493[var2].field822 = null;
                class33.field493[var2] = null;
            }
        }
        if (class260.field4419 != class262.field4462.field3905) {
            throw new RuntimeException("gnp1 pos:" + class262.field4462.field3905 + " psize:" + class260.field4419);
        }
        for (int var3 = 0; var3 < class242.field4078; var3++) {
            if (class33.field493[class219.field3698[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class242.field4078);
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lhk;BLdh;II)Lhk;", line = 411)
    public final class289 method965(class289 arg0, byte arg1, class157 arg2, int arg3, int arg4) {
        int var6 = this.field2578[arg3];
        field2588++;
        class42 var7 = class242.method1635(0, var6 >> 16);
        int var8 = -54 / ((-arg1 - 54) / 49);
        int var9 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg2.method968((byte) 103, arg4, arg0);
        }
        int var10 = arg2.field2578[arg4];
        class42 var11 = class242.method1635(0, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            class289 var13 = arg0.method1373(!var7.method257(12, var9), !this.field2596);
            var13.method1364(var7, var9, this.field2596);
            return var13;
        } else {
            class289 var14 = arg0.method1373(!var7.method257(12, var9) & !var11.method257(12, var12), !arg2.field2596 & !this.field2596);
            var14.method1374(var7, var9, var11, var12, this.field2570, arg2.field2596 | this.field2596);
            return var14;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lek;BLek;)I", line = 454)
    public static final int method966(class172 arg0, byte arg1, class172 arg2) {
        int var3 = 0;
        field2587++;
        if (arg0.method1109((byte) -113, class278.field4650)) {
            var3++;
        }
        if (arg0.method1109((byte) -120, class301.field5077)) {
            var3++;
        }
        if (arg0.method1109((byte) -99, class286.field4879)) {
            var3++;
        }
        if (arg2.method1109((byte) -111, class278.field4650)) {
            var3++;
        }
        if (arg1 < 84) {
            method969(14, 7, 11);
        }
        if (arg2.method1109((byte) -114, class301.field5077)) {
            var3++;
        }
        if (arg2.method1109((byte) 29, class286.field4879)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILhk;II)Lhk;", line = 490)
    public final class289 method967(int arg0, class289 arg1, int arg2, int arg3) {
        int var5 = this.field2578[arg0];
        field2566++;
        class42 var6 = class242.method1635(0, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg1.method1373(true, true);
        }
        int var8 = arg3 & arg2;
        class289 var9 = arg1.method1373(!var6.method257(12, var7), !this.field2596);
        if (var8 == 1) {
            var9.method1339();
        } else if (var8 == 2) {
            var9.method1360();
        } else if (var8 == 3) {
            var9.method1368();
        }
        var9.method1364(var6, var7, this.field2596);
        if (var8 == 1) {
            var9.method1368();
        } else if (var8 == 2) {
            var9.method1360();
        } else if (var8 == 3) {
            var9.method1339();
        }
        return var9;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(BILhk;)Lhk;", line = 543)
    public final class289 method968(byte arg0, int arg1, class289 arg2) {
        field2591++;
        int var4 = this.field2578[arg1];
        if (arg0 <= 71) {
            return (class289) null;
        }
        class42 var5 = class242.method1635(0, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method1373(true, true);
        } else {
            class289 var7 = arg2.method1373(!var5.method257(12, var6), !this.field2596);
            var7.method1364(var5, var6, this.field2596);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)V", line = 574)
    public static final void method969(int arg0, int arg1, int arg2) {
        int var3 = 121 / ((-arg1 - 58) / 63);
        field2585++;
        class72 var4 = class25.method174(arg0, (byte) 122, 13);
        var4.method477(-101);
        var4.field1265 = arg2;
    }
}
