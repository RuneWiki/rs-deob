import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class411 {

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public int field5812 = -1;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public int field5817 = -1;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "Z")
    public boolean field5814 = false;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
    public int field5825 = 5;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
    public int field5822 = 99;

    @OriginalMember(owner = "client!jm", name = "s", descriptor = "Z")
    public boolean field5829 = false;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public int field5820 = -1;

    @OriginalMember(owner = "client!jm", name = "v", descriptor = "I")
    public int field5832 = 2;

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "Z")
    public boolean field5830 = false;

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "I")
    public int field5836 = -1;

    @OriginalMember(owner = "client!jm", name = "B", descriptor = "Z")
    public boolean field5838 = false;

    @OriginalMember(owner = "client!jm", name = "y", descriptor = "I")
    public int field5835 = -1;

    @OriginalMember(owner = "client!jm", name = "D", descriptor = "I")
    public static int field5840 = 2;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field5813;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
    public static int field5823;

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!jm", name = "u", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!jm", name = "w", descriptor = "I")
    public int field5833;

    @OriginalMember(owner = "client!jm", name = "x", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!jm", name = "A", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!jm", name = "C", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "[I")
    private int[] field5815;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "[I")
    public int[] field5819;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "[I")
    public int[] field5824;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "[Z")
    public boolean[] field5821;

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "[[I")
    public int[][] field5827;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILkh;)V")
    public final void method2572(int arg0, class11 arg1) {
        while (true) {
            int var3 = arg1.method172((byte) 52);
            if (var3 == 0) {
                if (arg0 != 0) {
                    this.method2577(77, -5, -31, (byte) 61, 35, (class394) null);
                }
                field5828++;
                return;
            }
            this.method2574(arg1, 86, var3);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZIII)I")
    public final int method2573(boolean arg0, int arg1, int arg2, int arg3) {
        field5839++;
        int var5 = 0;
        int var6 = 0;
        int var7 = -112 % ((arg1 + 46) / 40);
        int var8 = this.field5824[arg2];
        class386 var9 = null;
        class386 var10 = class171.method1127(var8 >> 16, false);
        int var11 = var8 & 0xFFFF;
        if (var10 == null) {
            return var5;
        }
        if ((this.field5838 || class40.field589) && arg3 != -1 && this.field5824.length > arg3) {
            int var12 = this.field5824[arg3];
            var9 = class171.method1127(var12 >> 16, false);
            var6 = var12 & 0xFFFF;
        }
        if (this.field5829) {
            var5 |= 0x200;
        }
        if (var10.method2444(var11, -122)) {
            var5 |= 0x80;
        }
        if (var10.method2443(var11, (byte) -109)) {
            var5 |= 0x100;
        }
        if (var9 != null) {
            if (var9.method2444(var6, -44)) {
                var5 |= 0x80;
            }
            if (var9.method2443(var6, (byte) -109)) {
                var5 |= 0x100;
            }
        }
        if (this.field5815 != null && arg0) {
            if (this.field5815.length > arg2) {
                int var13 = this.field5815[arg2];
                if (var13 != 65535) {
                    class386 var14 = class171.method1127(var13 >> 16, false);
                    int var15 = var13 & 0xFFFF;
                    if (var14 != null) {
                        if (var14.method2444(var15, 116)) {
                            var5 |= 0x80;
                        }
                        if (var14.method2443(var15, (byte) -109)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
            if ((this.field5838 || class40.field589) && arg3 != -1 && arg3 < this.field5815.length) {
                int var16 = this.field5815[arg3];
                if (var16 != 65535) {
                    class386 var17 = class171.method1127(var16 >> 16, false);
                    int var18 = var16 & 0xFFFF;
                    if (var17 != null) {
                        if (var17.method2444(var18, 103)) {
                            var5 |= 0x80;
                        }
                        if (var17.method2443(var18, (byte) -109)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lkh;II)V")
    private final void method2574(class11 arg0, int arg1, int arg2) {
        field5816++;
        int var4 = 35 % ((-arg1 - 79) / 41);
        if (arg2 == 1) {
            int var5 = arg0.method174(255);
            this.field5819 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field5819[var6] = arg0.method174(255);
            }
            this.field5824 = new int[var5];
            for (int var7 = 0; var7 < var5; var7++) {
                this.field5824[var7] = arg0.method174(255);
            }
            for (int var8 = 0; var8 < var5; var8++) {
                this.field5824[var8] = (arg0.method174(255) << 16) + this.field5824[var8];
            }
        } else if (arg2 == 2) {
            this.field5835 = arg0.method174(255);
        } else if (arg2 == 3) {
            this.field5821 = new boolean[256];
            int var16 = arg0.method172((byte) 52);
            for (int var17 = 0; var17 < var16; var17++) {
                this.field5821[arg0.method172((byte) 52)] = true;
            }
        } else if (arg2 == 4) {
            this.field5830 = true;
        } else if (arg2 == 5) {
            this.field5825 = arg0.method172((byte) 52);
        } else if (arg2 == 6) {
            this.field5836 = arg0.method174(255);
        } else if (arg2 == 7) {
            this.field5812 = arg0.method174(255);
        } else if (arg2 == 8) {
            this.field5822 = arg0.method172((byte) 52);
        } else if (arg2 == 9) {
            this.field5820 = arg0.method172((byte) 52);
        } else if (arg2 == 10) {
            this.field5817 = arg0.method172((byte) 52);
        } else if (arg2 == 11) {
            this.field5832 = arg0.method172((byte) 52);
        } else if (arg2 == 12) {
            int var13 = arg0.method172((byte) 52);
            this.field5815 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field5815[var14] = arg0.method174(255);
            }
            for (int var15 = 0; var15 < var13; var15++) {
                this.field5815[var15] += arg0.method174(255) << 16;
            }
        } else if (arg2 == 13) {
            int var9 = arg0.method174(255);
            this.field5827 = new int[var9][];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = arg0.method172((byte) 52);
                if (var11 > 0) {
                    this.field5827[var10] = new int[var11];
                    this.field5827[var10][0] = arg0.method208(27308);
                    for (int var12 = 1; var12 < var11; var12++) {
                        this.field5827[var10][var12] = arg0.method174(255);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field5829 = true;
        } else if (arg2 == 15) {
            this.field5838 = true;
        } else if (arg2 == 16) {
            this.field5814 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IBIILmj;BII)Lmj;")
    public final class394 method2575(int arg0, byte arg1, int arg2, int arg3, class394 arg4, byte arg5, int arg6, int arg7) {
        field5813++;
        int var9 = this.field5819[arg0];
        int var10 = this.field5824[arg0];
        class386 var11 = class171.method1127(var10 >> 16, false);
        int var12 = var10 & 0xFFFF;
        int var13 = -18 / ((-arg5 - 73) / 34);
        if (var11 == null) {
            return arg4.method1430(arg1, arg7, true);
        }
        class386 var14 = null;
        if ((this.field5838 || class40.field589) && arg3 != -1 && this.field5824.length > arg3) {
            int var15 = this.field5824[arg3];
            var14 = class171.method1127(var15 >> 16, false);
            arg3 = var15 & 0xFFFF;
        }
        if (this.field5829) {
            arg7 |= 0x200;
        }
        if (var11.method2444(var12, -54)) {
            arg7 |= 0x80;
        }
        if (var11.method2443(var12, (byte) -109)) {
            arg7 |= 0x100;
        }
        if (var14 != null) {
            if (var14.method2444(arg3, -105)) {
                arg7 |= 0x80;
            }
            if (var14.method2443(arg3, (byte) -109)) {
                arg7 |= 0x100;
            }
        }
        int var16 = arg7 | 0x20;
        class394 var17 = arg4.method1430(arg1, var16, true);
        var17.method2495(arg3, var11, this.field5829, var12, (byte) 122, var14, arg2, var9, arg6 - 1);
        return var17;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)Lks;")
    public static final class253 method2576(int arg0, int arg1) {
        field5818++;
        class253 var2 = (class253) class41.field593.method2637((long) arg0, arg1 + 18620);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class312.field4275.method1745(arg1, (byte) -118, arg0);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class253 var4 = class414.method2598(var3, (byte) -97);
            class41.field593.method2633((byte) -120, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIBILmj;)Lmj;")
    public final class394 method2577(int arg0, int arg1, int arg2, byte arg3, int arg4, class394 arg5) {
        field5834++;
        int var7 = this.field5819[arg2];
        int var8 = this.field5824[arg2];
        class386 var9 = class171.method1127(var8 >> 16, false);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg5.method1430((byte) 1, arg0, true);
        }
        class386 var11 = null;
        if ((this.field5838 || class40.field589) && arg4 != -1 && arg4 < this.field5824.length) {
            int var12 = this.field5824[arg4];
            var11 = class171.method1127(var12 >> 16, false);
            arg4 = var12 & 0xFFFF;
        }
        class386 var13 = null;
        class386 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (arg3 != -115) {
            this.method2578(10);
        }
        if (this.field5815 != null) {
            if (arg2 < this.field5815.length) {
                var15 = this.field5815[arg2];
                if (var15 != 65535) {
                    var13 = class171.method1127(var15 >> 16, false);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field5838 || class40.field589) && arg4 != -1 && arg4 < this.field5815.length) {
                var16 = this.field5815[arg4];
                if (var16 != 65535) {
                    var14 = class171.method1127(var16 >> 16, false);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field5829) {
            arg0 |= 0x200;
        }
        if (var9.method2444(var10, -106)) {
            arg0 |= 0x80;
        }
        if (var9.method2443(var10, (byte) -109)) {
            arg0 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method2444(var15, -76)) {
                arg0 |= 0x80;
            }
            if (var13.method2443(var15, (byte) -109)) {
                arg0 |= 0x100;
            }
        }
        if (var11 != null) {
            if (var11.method2444(arg4, 126)) {
                arg0 |= 0x80;
            }
            if (var11.method2443(arg4, (byte) -109)) {
                arg0 |= 0x100;
            }
        }
        if (var14 != null) {
            if (var14.method2444(var16, -55)) {
                arg0 |= 0x80;
            }
            if (var14.method2443(var16, (byte) -109)) {
                arg0 |= 0x100;
            }
        }
        int var17 = arg0 | 0x20;
        class394 var18 = arg5.method1430((byte) 1, var17, true);
        var18.method2495(arg4, var9, this.field5829, var10, (byte) -6, var11, 0, var7, arg1 - 1);
        if (var13 != null) {
            var18.method2495(var16, var13, this.field5829, var15, (byte) 92, var14, 0, var7, arg1 - 1);
        }
        return var18;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
    public final void method2578(int arg0) {
        field5811++;
        if (arg0 != 1) {
            return;
        }
        if (this.field5817 == -1) {
            if (this.field5821 == null) {
                this.field5817 = 0;
            } else {
                this.field5817 = 2;
            }
        }
        if (this.field5820 != -1) {
            return;
        }
        if (this.field5821 == null) {
            this.field5820 = 0;
        } else {
            this.field5820 = 2;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIII)I")
    public static final int method2579(int arg0, int arg1, int arg2, int arg3) {
        field5823++;
        int var4 = arg3 - arg1;
        int var5 = ((arg2 & 0xFF00) * arg1 & 0xFF0000 | (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) >>> 8;
        return (((arg0 & 0xFF00) * var4 & 0xFF0000 | (arg0 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method2580(String arg0, boolean arg1) {
        field5826++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + class14.method232(21381, arg0.charAt(var4)) - var3;
        }
        return arg1 ? -118 : var3;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I[I[III)V")
    public static final void method2581(int arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg4 != 1) {
            field5831 = -7;
        }
        field5837++;
        if (arg0 <= arg3) {
            return;
        }
        int var5 = (arg3 + arg0) / 2;
        int var6 = arg3;
        int var7 = arg1[var5];
        arg1[var5] = arg1[arg0];
        arg1[arg0] = var7;
        int var8 = arg2[var5];
        arg2[var5] = arg2[arg0];
        arg2[arg0] = var8;
        for (int var9 = arg3; var9 < arg0; var9++) {
            if (arg1[var9] < var7 + (var9 & 0x1)) {
                int var10 = arg1[var9];
                arg1[var9] = arg1[var6];
                arg1[var6] = var10;
                int var11 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6++] = var11;
            }
        }
        arg1[arg0] = arg1[var6];
        arg1[var6] = var7;
        arg2[arg0] = arg2[var6];
        arg2[var6] = var8;
        method2581(var6 - 1, arg1, arg2, arg3, 1);
        method2581(arg0, arg1, arg2, var6 + 1, 1);
    }
}
