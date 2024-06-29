import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class150 extends class262 {

    @OriginalMember(owner = "client!e", name = "u", descriptor = "Z")
    private boolean field2648 = false;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    public int field2653 = 0;

    @OriginalMember(owner = "client!e", name = "D", descriptor = "I")
    public int field2657 = 0;

    @OriginalMember(owner = "client!e", name = "eb", descriptor = "B")
    public byte field2684 = 0;

    @OriginalMember(owner = "client!e", name = "fb", descriptor = "[I")
    public int[] field2685;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "[I")
    public int[] field2652;

    @OriginalMember(owner = "client!e", name = "O", descriptor = "[I")
    public int[] field2668;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "[I")
    public int[] field2637;

    @OriginalMember(owner = "client!e", name = "K", descriptor = "[I")
    public int[] field2664;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "[I")
    public int[] field2669;

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "[I")
    public int[] field2679;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "[B")
    public byte[] field2643;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "[B")
    public byte[] field2647;

    @OriginalMember(owner = "client!e", name = "bb", descriptor = "[B")
    public byte[] field2681;

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "[S")
    public short[] field2678;

    @OriginalMember(owner = "client!e", name = "S", descriptor = "[S")
    public short[] field2672;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "[B")
    public byte[] field2649;

    @OriginalMember(owner = "client!e", name = "G", descriptor = "[I")
    public int[] field2660;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "[B")
    public byte[] field2650;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "[S")
    public short[] field2640;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "[S")
    public short[] field2656;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "[S")
    public short[] field2663;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "[S")
    public short[] field2641;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "[S")
    public short[] field2671;

    @OriginalMember(owner = "client!e", name = "U", descriptor = "[S")
    public short[] field2674;

    @OriginalMember(owner = "client!e", name = "ab", descriptor = "[B")
    public byte[] field2680;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "[B")
    public byte[] field2651;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "[B")
    public byte[] field2655;

    @OriginalMember(owner = "client!e", name = "X", descriptor = "[B")
    public byte[] field2677;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "[B")
    public byte[] field2644;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "I")
    public int field2673;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "[[I")
    public int[][] field2658;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "[[I")
    public int[][] field2646;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "[Lfm;")
    public class42[] field2670;

    @OriginalMember(owner = "client!e", name = "V", descriptor = "[Lj;")
    public class272[] field2675;

    @OriginalMember(owner = "client!e", name = "L", descriptor = "[Lfm;")
    public class42[] field2665;

    @OriginalMember(owner = "client!e", name = "M", descriptor = "S")
    public short field2666;

    @OriginalMember(owner = "client!e", name = "N", descriptor = "S")
    public short field2667;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "[I")
    private static int[] field2639 = class50.field826;

    @OriginalMember(owner = "client!e", name = "H", descriptor = "[I")
    private static int[] field2661 = class50.field820;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "I")
    private static int field2654 = 0;

    @OriginalMember(owner = "client!e", name = "cb", descriptor = "[I")
    private static int[] field2682 = new int[10000];

    @OriginalMember(owner = "client!e", name = "db", descriptor = "[I")
    private static int[] field2683 = new int[10000];

    @OriginalMember(owner = "client!e", name = "k", descriptor = "S")
    private short field2638;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "S")
    private short field2642;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "S")
    private short field2645;

    @OriginalMember(owner = "client!e", name = "F", descriptor = "S")
    private short field2659;

    @OriginalMember(owner = "client!e", name = "I", descriptor = "S")
    private short field2662;

    @OriginalMember(owner = "client!e", name = "W", descriptor = "S")
    private short field2676;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "()V", line = 3)
    public final void method1061() {
        this.field2637 = null;
        this.field2660 = null;
        this.field2658 = (int[][]) null;
        this.field2646 = (int[][]) null;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(III)V", line = 14)
    public final void method1062(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2653; var4++) {
            this.field2685[var4] += arg0;
            this.field2652[var4] += arg1;
            this.field2668[var4] += arg2;
        }
        this.method1074();
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "()I", line = 28)
    public final int method48() {
        if (!this.field2648) {
            this.method1063();
        }
        return this.field2638;
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "()V", line = 34)
    private final void method1063() {
        if (this.field2648) {
            return;
        }
        this.field2648 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field2653; var7++) {
            int var8 = this.field2685[var7];
            int var9 = this.field2652[var7];
            int var10 = this.field2668[var7];
            if (var8 < var1) {
                var1 = var8;
            }
            if (var8 > var4) {
                var4 = var8;
            }
            if (var9 < var2) {
                var2 = var9;
            }
            if (var9 > var5) {
                var5 = var9;
            }
            if (var10 < var3) {
                var3 = var10;
            }
            if (var10 > var6) {
                var6 = var10;
            }
        }
        this.field2645 = (short) var1;
        this.field2642 = (short) var4;
        this.field2638 = (short) var2;
        this.field2659 = (short) var5;
        this.field2676 = (short) var3;
        this.field2662 = (short) var6;
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "()V", line = 92)
    public final void method1064() {
        for (int var1 = 0; var1 < this.field2653; var1++) {
            this.field2668[var1] = -this.field2668[var1];
        }
        for (int var2 = 0; var2 < this.field2657; var2++) {
            int var3 = this.field2664[var2];
            this.field2664[var2] = this.field2679[var2];
            this.field2679[var2] = var3;
        }
        this.method1074();
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([B)V", line = 114)
    private final void method1065(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class13 var4 = new class13(arg0);
        class13 var5 = new class13(arg0);
        class13 var6 = new class13(arg0);
        class13 var7 = new class13(arg0);
        class13 var8 = new class13(arg0);
        var4.field281 = arg0.length - 18;
        int var9 = var4.method112((byte) 92);
        int var10 = var4.method112((byte) 92);
        int var11 = var4.method152((byte) -90);
        int var12 = var4.method152((byte) -112);
        int var13 = var4.method152((byte) -104);
        int var14 = var4.method152((byte) -79);
        int var15 = var4.method152((byte) -98);
        int var16 = var4.method152((byte) -125);
        int var17 = var4.method112((byte) 92);
        int var18 = var4.method112((byte) 92);
        int var19 = var4.method112((byte) 92);
        int var20 = var4.method112((byte) 92);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field2653 = var9;
        this.field2657 = var10;
        this.field2673 = var11;
        this.field2685 = new int[var9];
        this.field2652 = new int[var9];
        this.field2668 = new int[var9];
        this.field2664 = new int[var10];
        this.field2669 = new int[var10];
        this.field2679 = new int[var10];
        if (var11 > 0) {
            this.field2650 = new byte[var11];
            this.field2640 = new short[var11];
            this.field2656 = new short[var11];
            this.field2663 = new short[var11];
        }
        if (var16 == 1) {
            this.field2637 = new int[var9];
        }
        if (var12 == 1) {
            this.field2643 = new byte[var10];
            this.field2649 = new byte[var10];
            this.field2672 = new short[var10];
        }
        if (var13 == 255) {
            this.field2647 = new byte[var10];
        } else {
            this.field2684 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2681 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2660 = new int[var10];
        }
        this.field2678 = new short[var10];
        var4.field281 = var21;
        var5.field281 = var36;
        var6.field281 = var38;
        var7.field281 = var40;
        var8.field281 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method152((byte) -110);
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method134(5525);
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method134(5525);
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method134(5525);
            }
            this.field2685[var46] = var43 + var48;
            this.field2652[var46] = var44 + var49;
            this.field2668[var46] = var45 + var50;
            var43 = this.field2685[var46];
            var44 = this.field2652[var46];
            var45 = this.field2668[var46];
            if (var16 == 1) {
                this.field2637[var46] = var8.method152((byte) -109);
            }
        }
        var4.field281 = var32;
        var5.field281 = var28;
        var6.field281 = var26;
        var7.field281 = var30;
        var8.field281 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2678[var51] = (short) var4.method112((byte) 92);
            if (var12 == 1) {
                int var52 = var5.method152((byte) -70);
                if ((var52 & 0x1) == 1) {
                    this.field2643[var51] = 1;
                    var2 = true;
                } else {
                    this.field2643[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2649[var51] = (byte) (var52 >> 2);
                    this.field2672[var51] = this.field2678[var51];
                    this.field2678[var51] = 127;
                    if (this.field2672[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2649[var51] = -1;
                    this.field2672[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2647[var51] = var6.method150((byte) 126);
            }
            if (var14 == 1) {
                this.field2681[var51] = var7.method150((byte) 102);
            }
            if (var15 == 1) {
                this.field2660[var51] = var8.method152((byte) -124);
            }
        }
        var4.field281 = var25;
        var5.field281 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method152((byte) -94);
            if (var58 == 1) {
                var53 = var4.method134(5525) + var56;
                var54 = var4.method134(5525) + var53;
                var55 = var4.method134(5525) + var54;
                var56 = var55;
                this.field2664[var57] = var53;
                this.field2669[var57] = var54;
                this.field2679[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method134(5525) + var56;
                var56 = var55;
                this.field2664[var57] = var53;
                this.field2669[var57] = var54;
                this.field2679[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method134(5525) + var56;
                var56 = var55;
                this.field2664[var57] = var53;
                this.field2669[var57] = var54;
                this.field2679[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method134(5525) + var56;
                var56 = var55;
                this.field2664[var57] = var53;
                this.field2669[var57] = var61;
                this.field2679[var57] = var55;
            }
        }
        var4.field281 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2650[var62] = 0;
            this.field2640[var62] = (short) var4.method112((byte) 92);
            this.field2656[var62] = (short) var4.method112((byte) 92);
            this.field2663[var62] = (short) var4.method112((byte) 92);
        }
        if (this.field2649 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2649[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2640[var65] & 0xFFFF) == this.field2664[var64] && (this.field2656[var65] & 0xFFFF) == this.field2669[var64] && (this.field2663[var65] & 0xFFFF) == this.field2679[var64]) {
                        this.field2649[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2649 = null;
            }
        }
        if (!var3) {
            this.field2672 = null;
        }
        if (!var2) {
            this.field2643 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "()V", line = 457)
    public static void method1066() {
        field2683 = null;
        field2682 = null;
        field2639 = null;
        field2661 = null;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V", line = 471)
    public final void method1067(int arg0) {
        int var2 = field2639[arg0];
        int var3 = field2661[arg0];
        for (int var4 = 0; var4 < this.field2653; var4++) {
            int var5 = this.field2685[var4] * var3 + this.field2668[var4] * var2 >> 16;
            this.field2668[var4] = this.field2668[var4] * var3 - this.field2685[var4] * var2 >> 16;
            this.field2685[var4] = var5;
        }
        this.method1074();
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(SS)V", line = 492)
    public final void method1068(short arg0, short arg1) {
        if (this.field2672 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2657; var3++) {
            if (this.field2672[var3] == arg0) {
                this.field2672[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V", line = 1974)
    private class150() {
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "([B)V", line = 1976)
    private class150(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1084(arg0);
        } else {
            this.method1065(arg0);
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(III)V", line = 1986)
    public class150(int arg0, int arg1, int arg2) {
        this.field2685 = new int[arg0];
        this.field2652 = new int[arg0];
        this.field2668 = new int[arg0];
        this.field2637 = new int[arg0];
        this.field2664 = new int[arg1];
        this.field2669 = new int[arg1];
        this.field2679 = new int[arg1];
        this.field2643 = new byte[arg1];
        this.field2647 = new byte[arg1];
        this.field2681 = new byte[arg1];
        this.field2678 = new short[arg1];
        this.field2672 = new short[arg1];
        this.field2649 = new byte[arg1];
        this.field2660 = new int[arg1];
        if (arg2 > 0) {
            this.field2650 = new byte[arg2];
            this.field2640 = new short[arg2];
            this.field2656 = new short[arg2];
            this.field2663 = new short[arg2];
            this.field2641 = new short[arg2];
            this.field2671 = new short[arg2];
            this.field2674 = new short[arg2];
            this.field2680 = new byte[arg2];
            this.field2651 = new byte[arg2];
            this.field2655 = new byte[arg2];
            this.field2677 = new byte[arg2];
            this.field2644 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "([Le;I)V", line = 2018)
    public class150(class150[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2653 = 0;
        this.field2657 = 0;
        this.field2673 = 0;
        this.field2684 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class150 var10 = arg0[var9];
            if (var10 != null) {
                this.field2653 += var10.field2653;
                this.field2657 += var10.field2657;
                this.field2673 += var10.field2673;
                if (var10.field2647 == null) {
                    if (this.field2684 == -1) {
                        this.field2684 = var10.field2684;
                    }
                    if (this.field2684 != var10.field2684) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field2643 != null;
                var5 |= var10.field2681 != null;
                var6 |= var10.field2660 != null;
                var7 |= var10.field2672 != null;
                var8 |= var10.field2649 != null;
            }
        }
        this.field2685 = new int[this.field2653];
        this.field2652 = new int[this.field2653];
        this.field2668 = new int[this.field2653];
        this.field2637 = new int[this.field2653];
        this.field2664 = new int[this.field2657];
        this.field2669 = new int[this.field2657];
        this.field2679 = new int[this.field2657];
        if (var3) {
            this.field2643 = new byte[this.field2657];
        }
        if (var4) {
            this.field2647 = new byte[this.field2657];
        }
        if (var5) {
            this.field2681 = new byte[this.field2657];
        }
        if (var6) {
            this.field2660 = new int[this.field2657];
        }
        if (var7) {
            this.field2672 = new short[this.field2657];
        }
        if (var8) {
            this.field2649 = new byte[this.field2657];
        }
        this.field2678 = new short[this.field2657];
        if (this.field2673 > 0) {
            this.field2650 = new byte[this.field2673];
            this.field2640 = new short[this.field2673];
            this.field2656 = new short[this.field2673];
            this.field2663 = new short[this.field2673];
            this.field2641 = new short[this.field2673];
            this.field2671 = new short[this.field2673];
            this.field2674 = new short[this.field2673];
            this.field2680 = new byte[this.field2673];
            this.field2651 = new byte[this.field2673];
            this.field2655 = new byte[this.field2673];
            this.field2677 = new byte[this.field2673];
            this.field2644 = new byte[this.field2673];
        }
        this.field2653 = 0;
        this.field2657 = 0;
        this.field2673 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class150 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field2657; var13++) {
                    if (var3 && var12.field2643 != null) {
                        this.field2643[this.field2657] = var12.field2643[var13];
                    }
                    if (var4) {
                        if (var12.field2647 == null) {
                            this.field2647[this.field2657] = var12.field2684;
                        } else {
                            this.field2647[this.field2657] = var12.field2647[var13];
                        }
                    }
                    if (var5 && var12.field2681 != null) {
                        this.field2681[this.field2657] = var12.field2681[var13];
                    }
                    if (var6 && var12.field2660 != null) {
                        this.field2660[this.field2657] = var12.field2660[var13];
                    }
                    if (var7) {
                        if (var12.field2672 == null) {
                            this.field2672[this.field2657] = -1;
                        } else {
                            this.field2672[this.field2657] = var12.field2672[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field2649 == null || var12.field2649[var13] == -1) {
                            this.field2649[this.field2657] = -1;
                        } else {
                            this.field2649[this.field2657] = (byte) (var12.field2649[var13] + this.field2673);
                        }
                    }
                    this.field2678[this.field2657] = var12.field2678[var13];
                    this.field2664[this.field2657] = this.method1081(var12, var12.field2664[var13]);
                    this.field2669[this.field2657] = this.method1081(var12, var12.field2669[var13]);
                    this.field2679[this.field2657] = this.method1081(var12, var12.field2679[var13]);
                    this.field2657++;
                }
                for (int var14 = 0; var14 < var12.field2673; var14++) {
                    byte var15 = this.field2650[this.field2673] = var12.field2650[var14];
                    if (var15 == 0) {
                        this.field2640[this.field2673] = (short) this.method1081(var12, var12.field2640[var14]);
                        this.field2656[this.field2673] = (short) this.method1081(var12, var12.field2656[var14]);
                        this.field2663[this.field2673] = (short) this.method1081(var12, var12.field2663[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field2640[this.field2673] = var12.field2640[var14];
                        this.field2656[this.field2673] = var12.field2656[var14];
                        this.field2663[this.field2673] = var12.field2663[var14];
                        this.field2641[this.field2673] = var12.field2641[var14];
                        this.field2671[this.field2673] = var12.field2671[var14];
                        this.field2674[this.field2673] = var12.field2674[var14];
                        this.field2680[this.field2673] = var12.field2680[var14];
                        this.field2651[this.field2673] = var12.field2651[var14];
                        this.field2655[this.field2673] = var12.field2655[var14];
                    }
                    if (var15 == 2) {
                        this.field2677[this.field2673] = var12.field2677[var14];
                        this.field2644[this.field2673] = var12.field2644[var14];
                    }
                    this.field2673++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Le;ZZZZ)V", line = 2227)
    public class150(class150 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2653 = arg0.field2653;
        this.field2657 = arg0.field2657;
        this.field2673 = arg0.field2673;
        if (arg1) {
            this.field2685 = arg0.field2685;
            this.field2652 = arg0.field2652;
            this.field2668 = arg0.field2668;
        } else {
            this.field2685 = new int[this.field2653];
            this.field2652 = new int[this.field2653];
            this.field2668 = new int[this.field2653];
            for (int var6 = 0; var6 < this.field2653; var6++) {
                this.field2685[var6] = arg0.field2685[var6];
                this.field2652[var6] = arg0.field2652[var6];
                this.field2668[var6] = arg0.field2668[var6];
            }
        }
        if (arg2) {
            this.field2678 = arg0.field2678;
        } else {
            this.field2678 = new short[this.field2657];
            for (int var7 = 0; var7 < this.field2657; var7++) {
                this.field2678[var7] = arg0.field2678[var7];
            }
        }
        if (arg3 || arg0.field2672 == null) {
            this.field2672 = arg0.field2672;
        } else {
            this.field2672 = new short[this.field2657];
            for (int var8 = 0; var8 < this.field2657; var8++) {
                this.field2672[var8] = arg0.field2672[var8];
            }
        }
        if (arg4) {
            this.field2681 = arg0.field2681;
        } else {
            this.field2681 = new byte[this.field2657];
            if (arg0.field2681 == null) {
                for (int var9 = 0; var9 < this.field2657; var9++) {
                    this.field2681[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2657; var10++) {
                    this.field2681[var10] = arg0.field2681[var10];
                }
            }
        }
        this.field2664 = arg0.field2664;
        this.field2669 = arg0.field2669;
        this.field2679 = arg0.field2679;
        this.field2643 = arg0.field2643;
        this.field2647 = arg0.field2647;
        this.field2649 = arg0.field2649;
        this.field2684 = arg0.field2684;
        this.field2650 = arg0.field2650;
        this.field2640 = arg0.field2640;
        this.field2656 = arg0.field2656;
        this.field2663 = arg0.field2663;
        this.field2641 = arg0.field2641;
        this.field2671 = arg0.field2671;
        this.field2674 = arg0.field2674;
        this.field2680 = arg0.field2680;
        this.field2651 = arg0.field2651;
        this.field2655 = arg0.field2655;
        this.field2677 = arg0.field2677;
        this.field2644 = arg0.field2644;
        this.field2637 = arg0.field2637;
        this.field2660 = arg0.field2660;
        this.field2658 = arg0.field2658;
        this.field2646 = arg0.field2646;
        this.field2670 = arg0.field2670;
        this.field2675 = arg0.field2675;
        this.field2665 = arg0.field2665;
        this.field2666 = arg0.field2666;
        this.field2667 = arg0.field2667;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "()Z", line = 515)
    public final boolean method1069() {
        return true;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIBSB)I", line = 530)
    public final int method1070(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field2664[this.field2657] = arg0;
        this.field2669[this.field2657] = arg1;
        this.field2679[this.field2657] = arg2;
        this.field2643[this.field2657] = arg3;
        this.field2649[this.field2657] = -1;
        this.field2678[this.field2657] = arg4;
        this.field2672[this.field2657] = -1;
        this.field2681[this.field2657] = arg5;
        return this.field2657++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(La;IIIZ)V", line = 542)
    public final void method1071(class262 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class150 var6 = (class150) arg0;
        var6.method1063();
        var6.method1083();
        field2654++;
        int var7 = 0;
        int[] var8 = var6.field2685;
        int var9 = var6.field2653;
        for (int var10 = 0; var10 < this.field2653; var10++) {
            class42 var11 = this.field2670[var10];
            if (var11.field685 != 0) {
                int var12 = this.field2652[var10] - arg2;
                if (var12 >= var6.field2638 && var12 <= var6.field2659) {
                    int var13 = this.field2685[var10] - arg1;
                    if (var13 >= var6.field2645 && var13 <= var6.field2642) {
                        int var14 = this.field2668[var10] - arg3;
                        if (var14 >= var6.field2676 && var14 <= var6.field2662) {
                            for (int var15 = 0; var15 < var9; var15++) {
                                class42 var16 = var6.field2670[var15];
                                if (var8[var15] == var13 && var6.field2668[var15] == var14 && var6.field2652[var15] == var12 && var16.field685 != 0) {
                                    if (this.field2665 == null) {
                                        this.field2665 = new class42[this.field2653];
                                    }
                                    if (var6.field2665 == null) {
                                        var6.field2665 = new class42[var9];
                                    }
                                    class42 var17 = this.field2665[var10];
                                    if (var17 == null) {
                                        var17 = this.field2665[var10] = new class42(var11);
                                    }
                                    class42 var18 = var6.field2665[var15];
                                    if (var18 == null) {
                                        var18 = var6.field2665[var15] = new class42(var16);
                                    }
                                    var17.field683 += var16.field683;
                                    var17.field694 += var16.field694;
                                    var17.field688 += var16.field688;
                                    var17.field685 += var16.field685;
                                    var18.field683 += var11.field683;
                                    var18.field694 += var11.field694;
                                    var18.field688 += var11.field688;
                                    var18.field685 += var11.field685;
                                    var7++;
                                    field2683[var10] = field2654;
                                    field2682[var15] = field2654;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg4) {
            return;
        }
        for (int var19 = 0; var19 < this.field2657; var19++) {
            if (field2683[this.field2664[var19]] == field2654 && field2683[this.field2669[var19]] == field2654 && field2683[this.field2679[var19]] == field2654) {
                if (this.field2643 == null) {
                    this.field2643 = new byte[this.field2657];
                }
                this.field2643[var19] = 2;
            }
        }
        for (int var20 = 0; var20 < var6.field2657; var20++) {
            if (field2682[var6.field2664[var20]] == field2654 && field2682[var6.field2669[var20]] == field2654 && field2682[var6.field2679[var20]] == field2654) {
                if (var6.field2643 == null) {
                    var6.field2643 = new byte[var6.field2657];
                }
                var6.field2643[var20] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "g", descriptor = "()V", line = 658)
    public final void method1072() {
        int var10002;
        if (this.field2637 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2653; var3++) {
                int var4 = this.field2637[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2658 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2658[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2653) {
                int var7 = this.field2637[var6];
                this.field2658[var7][var1[var7]++] = var6++;
            }
            this.field2637 = null;
        }
        if (this.field2660 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2657; var10++) {
            int var11 = this.field2660[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2646 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2646[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2657) {
            int var14 = this.field2660[var13];
            this.field2646[var14][var8[var14]++] = var13++;
        }
        this.field2660 = null;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(IIIII)Lvi;", line = 750)
    public final class5 method1073(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class5(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!e", name = "h", descriptor = "()V", line = 760)
    private final void method1074() {
        this.field2670 = null;
        this.field2665 = null;
        this.field2675 = null;
        this.field2648 = false;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIIIIJ)V", line = 766)
    public final void method43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(III)V", line = 777)
    public final void method1075(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field2639[arg2];
            int var5 = field2661[arg2];
            for (int var6 = 0; var6 < this.field2653; var6++) {
                int var7 = this.field2685[var6] * var5 + this.field2652[var6] * var4 >> 16;
                this.field2652[var6] = this.field2652[var6] * var5 - this.field2685[var6] * var4 >> 16;
                this.field2685[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field2639[arg0];
            int var9 = field2661[arg0];
            for (int var10 = 0; var10 < this.field2653; var10++) {
                int var11 = this.field2652[var10] * var9 - this.field2668[var10] * var8 >> 16;
                this.field2668[var10] = this.field2668[var10] * var9 + this.field2652[var10] * var8 >> 16;
                this.field2652[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field2639[arg1];
        int var13 = field2661[arg1];
        for (int var14 = 0; var14 < this.field2653; var14++) {
            int var15 = this.field2685[var14] * var13 + this.field2668[var14] * var12 >> 16;
            this.field2668[var14] = this.field2668[var14] * var13 - this.field2685[var14] * var12 >> 16;
            this.field2685[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(IIIII)Lam;", line = 840)
    public final class243 method1076(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class123.field2216) {
            class217 var6 = new class217(this, arg0, arg1, true);
            var6.method1553();
            return var6;
        } else {
            return new class5(this, arg0, arg1, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([[III)I", line = 852)
    private static final int method1077(int[][] arg0, int arg1, int arg2) {
        int var3 = arg1 >> 7;
        int var4 = arg2 >> 7;
        if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
            return 0;
        }
        int var5 = arg1 & 0x7F;
        int var6 = arg2 & 0x7F;
        int var7 = (128 - var5) * arg0[var3][var4] + arg0[var3 + 1][var4] * var5 >> 7;
        int var8 = (128 - var5) * arg0[var3][var4 + 1] + arg0[var3 + 1][var4 + 1] * var5 >> 7;
        return (128 - var6) * var7 + var6 * var8 >> 7;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V", line = 874)
    private final void method1078(int arg0) {
        int var2 = field2639[arg0];
        int var3 = field2661[arg0];
        for (int var4 = 0; var4 < this.field2653; var4++) {
            int var5 = this.field2652[var4] * var3 - this.field2668[var4] * var2 >> 16;
            this.field2668[var4] = this.field2668[var4] * var3 + this.field2652[var4] * var2 >> 16;
            this.field2652[var4] = var5;
        }
        this.method1074();
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([[IIIIII)V", line = 894)
    private final void method1079(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1077(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1077(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1077(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1077(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1078(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1089(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1062(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(III)I", line = 959)
    public final int method1080(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2653; var4++) {
            if (this.field2685[var4] == arg0 && this.field2652[var4] == arg1 && this.field2668[var4] == arg2) {
                return var4;
            }
        }
        this.field2685[this.field2653] = arg0;
        this.field2652[this.field2653] = arg1;
        this.field2668[this.field2653] = arg2;
        return this.field2653++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Le;I)I", line = 977)
    private final int method1081(class150 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2685[arg1];
        int var5 = arg0.field2652[arg1];
        int var6 = arg0.field2668[arg1];
        for (int var7 = 0; var7 < this.field2653; var7++) {
            if (this.field2685[var7] == var4 && this.field2652[var7] == var5 && this.field2668[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2685[this.field2653] = var4;
            this.field2652[this.field2653] = var5;
            this.field2668[this.field2653] = var6;
            if (arg0.field2637 != null) {
                this.field2637[this.field2653] = arg0.field2637[arg1];
            }
            var3 = this.field2653++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(III)V", line = 1015)
    public final void method1082(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2653; var4++) {
            this.field2685[var4] = this.field2685[var4] * arg0 / 128;
            this.field2652[var4] = this.field2652[var4] * arg1 / 128;
            this.field2668[var4] = this.field2668[var4] * arg2 / 128;
        }
        this.method1074();
    }

    @OriginalMember(owner = "client!e", name = "i", descriptor = "()V", line = 1027)
    public final void method1083() {
        if (this.field2670 != null) {
            return;
        }
        this.field2670 = new class42[this.field2653];
        for (int var1 = 0; var1 < this.field2653; var1++) {
            this.field2670[var1] = new class42();
        }
        for (int var2 = 0; var2 < this.field2657; var2++) {
            int var3 = this.field2664[var2];
            int var4 = this.field2669[var2];
            int var5 = this.field2679[var2];
            int var6 = this.field2685[var4] - this.field2685[var3];
            int var7 = this.field2652[var4] - this.field2652[var3];
            int var8 = this.field2668[var4] - this.field2668[var3];
            int var9 = this.field2685[var5] - this.field2685[var3];
            int var10 = this.field2652[var5] - this.field2652[var3];
            int var11 = this.field2668[var5] - this.field2668[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field2643 == null) {
                var19 = 0;
            } else {
                var19 = this.field2643[var2];
            }
            if (var19 == 0) {
                class42 var20 = this.field2670[var3];
                var20.field683 += var16;
                var20.field694 += var17;
                var20.field688 += var18;
                var20.field685++;
                class42 var21 = this.field2670[var4];
                var21.field683 += var16;
                var21.field694 += var17;
                var21.field688 += var18;
                var21.field685++;
                class42 var22 = this.field2670[var5];
                var22.field683 += var16;
                var22.field694 += var17;
                var22.field688 += var18;
                var22.field685++;
            } else if (var19 == 1) {
                if (this.field2675 == null) {
                    this.field2675 = new class272[this.field2657];
                }
                class272 var23 = this.field2675[var2] = new class272();
                var23.field4676 = var16;
                var23.field4673 = var17;
                var23.field4668 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "([B)V", line = 1129)
    private final void method1084(byte[] arg0) {
        class13 var2 = new class13(arg0);
        class13 var3 = new class13(arg0);
        class13 var4 = new class13(arg0);
        class13 var5 = new class13(arg0);
        class13 var6 = new class13(arg0);
        class13 var7 = new class13(arg0);
        class13 var8 = new class13(arg0);
        var2.field281 = arg0.length - 23;
        int var9 = var2.method112((byte) 92);
        int var10 = var2.method112((byte) 92);
        int var11 = var2.method152((byte) -110);
        int var12 = var2.method152((byte) -91);
        int var13 = var2.method152((byte) -92);
        int var14 = var2.method152((byte) -116);
        int var15 = var2.method152((byte) -70);
        int var16 = var2.method152((byte) -83);
        int var17 = var2.method152((byte) -79);
        int var18 = var2.method112((byte) 92);
        int var19 = var2.method112((byte) 92);
        int var20 = var2.method112((byte) 92);
        int var21 = var2.method112((byte) 92);
        int var22 = var2.method112((byte) 92);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2650 = new byte[var11];
            var2.field281 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2650[var26] = var2.method150((byte) 90);
                if (var27 == 0) {
                    var23++;
                }
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
                if (var27 == 2) {
                    var25++;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        this.field2653 = var9;
        this.field2657 = var10;
        this.field2673 = var11;
        this.field2685 = new int[var9];
        this.field2652 = new int[var9];
        this.field2668 = new int[var9];
        this.field2664 = new int[var10];
        this.field2669 = new int[var10];
        this.field2679 = new int[var10];
        if (var17 == 1) {
            this.field2637 = new int[var9];
        }
        if (var12 == 1) {
            this.field2643 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2647 = new byte[var10];
        } else {
            this.field2684 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2681 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2660 = new int[var10];
        }
        if (var16 == 1) {
            this.field2672 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2649 = new byte[var10];
        }
        this.field2678 = new short[var10];
        if (var11 > 0) {
            this.field2640 = new short[var11];
            this.field2656 = new short[var11];
            this.field2663 = new short[var11];
            if (var24 > 0) {
                this.field2641 = new short[var24];
                this.field2671 = new short[var24];
                this.field2674 = new short[var24];
                this.field2680 = new byte[var24];
                this.field2651 = new byte[var24];
                this.field2655 = new byte[var24];
            }
            if (var25 > 0) {
                this.field2677 = new byte[var25];
                this.field2644 = new byte[var25];
            }
        }
        var2.field281 = var11;
        var3.field281 = var44;
        var4.field281 = var46;
        var5.field281 = var48;
        var6.field281 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var67 = var2.method152((byte) -100);
            int var68 = 0;
            if ((var67 & 0x1) != 0) {
                var68 = var3.method134(5525);
            }
            int var69 = 0;
            if ((var67 & 0x2) != 0) {
                var69 = var4.method134(5525);
            }
            int var70 = 0;
            if ((var67 & 0x4) != 0) {
                var70 = var5.method134(5525);
            }
            this.field2685[var66] = var63 + var68;
            this.field2652[var66] = var64 + var69;
            this.field2668[var66] = var65 + var70;
            var63 = this.field2685[var66];
            var64 = this.field2652[var66];
            var65 = this.field2668[var66];
            if (var17 == 1) {
                this.field2637[var66] = var6.method152((byte) -120);
            }
        }
        var2.field281 = var42;
        var3.field281 = var31;
        var4.field281 = var34;
        var5.field281 = var37;
        var6.field281 = var35;
        var7.field281 = var40;
        var8.field281 = var39;
        for (int var71 = 0; var71 < var10; var71++) {
            this.field2678[var71] = (short) var2.method112((byte) 92);
            if (var12 == 1) {
                this.field2643[var71] = var3.method150((byte) 87);
            }
            if (var13 == 255) {
                this.field2647[var71] = var4.method150((byte) 88);
            }
            if (var14 == 1) {
                this.field2681[var71] = var5.method150((byte) 110);
            }
            if (var15 == 1) {
                this.field2660[var71] = var6.method152((byte) -102);
            }
            if (var16 == 1) {
                this.field2672[var71] = (short) (var7.method112((byte) 92) - 1);
            }
            if (this.field2649 != null) {
                if (this.field2672[var71] == -1) {
                    this.field2649[var71] = -1;
                } else {
                    this.field2649[var71] = (byte) (var8.method152((byte) -126) - 1);
                }
            }
        }
        var2.field281 = var33;
        var3.field281 = var30;
        int var72 = 0;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        for (int var76 = 0; var76 < var10; var76++) {
            int var77 = var3.method152((byte) -92);
            if (var77 == 1) {
                var72 = var2.method134(5525) + var75;
                var73 = var2.method134(5525) + var72;
                var74 = var2.method134(5525) + var73;
                var75 = var74;
                this.field2664[var76] = var72;
                this.field2669[var76] = var73;
                this.field2679[var76] = var74;
            }
            if (var77 == 2) {
                var73 = var74;
                var74 = var2.method134(5525) + var75;
                var75 = var74;
                this.field2664[var76] = var72;
                this.field2669[var76] = var73;
                this.field2679[var76] = var74;
            }
            if (var77 == 3) {
                var72 = var74;
                var74 = var2.method134(5525) + var75;
                var75 = var74;
                this.field2664[var76] = var72;
                this.field2669[var76] = var73;
                this.field2679[var76] = var74;
            }
            if (var77 == 4) {
                int var80 = var72;
                var72 = var73;
                var73 = var80;
                var74 = var2.method134(5525) + var75;
                var75 = var74;
                this.field2664[var76] = var72;
                this.field2669[var76] = var80;
                this.field2679[var76] = var74;
            }
        }
        var2.field281 = var50;
        var3.field281 = var52;
        var4.field281 = var54;
        var5.field281 = var56;
        var6.field281 = var58;
        var7.field281 = var60;
        for (int var81 = 0; var81 < var11; var81++) {
            int var82 = this.field2650[var81] & 0xFF;
            if (var82 == 0) {
                this.field2640[var81] = (short) var2.method112((byte) 92);
                this.field2656[var81] = (short) var2.method112((byte) 92);
                this.field2663[var81] = (short) var2.method112((byte) 92);
            }
            if (var82 == 1) {
                this.field2640[var81] = (short) var3.method112((byte) 92);
                this.field2656[var81] = (short) var3.method112((byte) 92);
                this.field2663[var81] = (short) var3.method112((byte) 92);
                this.field2641[var81] = (short) var4.method112((byte) 92);
                this.field2671[var81] = (short) var4.method112((byte) 92);
                this.field2674[var81] = (short) var4.method112((byte) 92);
                this.field2680[var81] = var5.method150((byte) 122);
                this.field2651[var81] = var6.method150((byte) 105);
                this.field2655[var81] = var7.method150((byte) 99);
            }
            if (var82 == 2) {
                this.field2640[var81] = (short) var3.method112((byte) 92);
                this.field2656[var81] = (short) var3.method112((byte) 92);
                this.field2663[var81] = (short) var3.method112((byte) 92);
                this.field2641[var81] = (short) var4.method112((byte) 92);
                this.field2671[var81] = (short) var4.method112((byte) 92);
                this.field2674[var81] = (short) var4.method112((byte) 92);
                this.field2680[var81] = var5.method150((byte) 118);
                this.field2651[var81] = var6.method150((byte) 95);
                this.field2655[var81] = var7.method150((byte) 84);
                this.field2677[var81] = var7.method150((byte) 123);
                this.field2644[var81] = var7.method150((byte) 105);
            }
            if (var82 == 3) {
                this.field2640[var81] = (short) var3.method112((byte) 92);
                this.field2656[var81] = (short) var3.method112((byte) 92);
                this.field2663[var81] = (short) var3.method112((byte) 92);
                this.field2641[var81] = (short) var4.method112((byte) 92);
                this.field2671[var81] = (short) var4.method112((byte) 92);
                this.field2674[var81] = (short) var4.method112((byte) 92);
                this.field2680[var81] = var5.method150((byte) 90);
                this.field2651[var81] = var6.method150((byte) 90);
                this.field2655[var81] = var7.method150((byte) 100);
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "j", descriptor = "()Le;", line = 1551)
    public final class150 method1085() {
        class150 var1 = new class150();
        if (this.field2643 != null) {
            var1.field2643 = new byte[this.field2657];
            for (int var2 = 0; var2 < this.field2657; var2++) {
                var1.field2643[var2] = this.field2643[var2];
            }
        }
        var1.field2653 = this.field2653;
        var1.field2657 = this.field2657;
        var1.field2673 = this.field2673;
        var1.field2685 = this.field2685;
        var1.field2652 = this.field2652;
        var1.field2668 = this.field2668;
        var1.field2664 = this.field2664;
        var1.field2669 = this.field2669;
        var1.field2679 = this.field2679;
        var1.field2647 = this.field2647;
        var1.field2681 = this.field2681;
        var1.field2649 = this.field2649;
        var1.field2678 = this.field2678;
        var1.field2672 = this.field2672;
        var1.field2684 = this.field2684;
        var1.field2650 = this.field2650;
        var1.field2640 = this.field2640;
        var1.field2656 = this.field2656;
        var1.field2663 = this.field2663;
        var1.field2641 = this.field2641;
        var1.field2671 = this.field2671;
        var1.field2674 = this.field2674;
        var1.field2680 = this.field2680;
        var1.field2651 = this.field2651;
        var1.field2655 = this.field2655;
        var1.field2677 = this.field2677;
        var1.field2644 = this.field2644;
        var1.field2637 = this.field2637;
        var1.field2660 = this.field2660;
        var1.field2658 = this.field2658;
        var1.field2646 = this.field2646;
        var1.field2670 = this.field2670;
        var1.field2675 = this.field2675;
        var1.field2666 = this.field2666;
        var1.field2667 = this.field2667;
        return var1;
    }

    @OriginalMember(owner = "client!e", name = "k", descriptor = "()V", line = 1606)
    public final void method1086() {
        for (int var1 = 0; var1 < this.field2653; var1++) {
            int var2 = this.field2685[var1];
            this.field2685[var1] = this.field2668[var1];
            this.field2668[var1] = -var2;
        }
        this.method1074();
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(SS)V", line = 1623)
    public final void method1087(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2657; var3++) {
            if (this.field2678[var3] == arg0) {
                this.field2678[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)La;", line = 1635)
    public final class262 method1088(int arg0, int arg1, int arg2) {
        return this.method1076(this.field2666, this.field2667, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V", line = 1639)
    private final void method1089(int arg0) {
        int var2 = field2639[arg0];
        int var3 = field2661[arg0];
        for (int var4 = 0; var4 < this.field2653; var4++) {
            int var5 = this.field2685[var4] * var3 + this.field2652[var4] * var2 >> 16;
            this.field2652[var4] = this.field2652[var4] * var3 - this.field2685[var4] * var2 >> 16;
            this.field2685[var4] = var5;
        }
        this.method1074();
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lqm;II)Le;", line = 1662)
    public static final class150 method1090(class222 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1580(0, arg2, arg1);
        return var3 == null ? null : new class150(var3);
    }

    @OriginalMember(owner = "client!e", name = "l", descriptor = "()V", line = 1680)
    public final void method1091() {
        for (int var1 = 0; var1 < this.field2653; var1++) {
            int var2 = this.field2668[var1];
            this.field2668[var1] = this.field2685[var1];
            this.field2685[var1] = -var2;
        }
        this.method1074();
    }

    @OriginalMember(owner = "client!e", name = "m", descriptor = "()V", line = 1701)
    public final void method1092() {
        for (int var1 = 0; var1 < this.field2653; var1++) {
            this.field2685[var1] = -this.field2685[var1];
            this.field2668[var1] = -this.field2668[var1];
        }
        this.method1074();
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II[[I[[IIIIZZ)Le;", line = 1712)
    public final class150 method1093(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method1063();
        int var10 = this.field2645 + arg4;
        int var11 = this.field2642 + arg4;
        int var12 = this.field2676 + arg6;
        int var13 = this.field2662 + arg6;
        if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length)) {
            return this;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return this;
            }
            if (var10 < 0 || var11 + 128 >> 7 >= arg3.length || var12 < 0 || var13 + 128 >> 7 >= arg3[0].length) {
                return this;
            }
        } else {
            int var14 = var10 >> 7;
            int var15 = var11 + 127 >> 7;
            int var16 = var12 >> 7;
            int var17 = var13 + 127 >> 7;
            if (arg2[var14][var16] == arg5 && arg2[var15][var16] == arg5 && arg2[var14][var17] == arg5 && arg2[var15][var17] == arg5) {
                return this;
            }
        }
        class150 var18;
        if (arg7) {
            var18 = new class150();
            var18.field2653 = this.field2653;
            var18.field2657 = this.field2657;
            var18.field2673 = this.field2673;
            var18.field2664 = this.field2664;
            var18.field2669 = this.field2669;
            var18.field2679 = this.field2679;
            var18.field2643 = this.field2643;
            var18.field2647 = this.field2647;
            var18.field2681 = this.field2681;
            var18.field2649 = this.field2649;
            var18.field2678 = this.field2678;
            var18.field2672 = this.field2672;
            var18.field2684 = this.field2684;
            var18.field2650 = this.field2650;
            var18.field2640 = this.field2640;
            var18.field2656 = this.field2656;
            var18.field2663 = this.field2663;
            var18.field2641 = this.field2641;
            var18.field2671 = this.field2671;
            var18.field2674 = this.field2674;
            var18.field2680 = this.field2680;
            var18.field2651 = this.field2651;
            var18.field2655 = this.field2655;
            var18.field2677 = this.field2677;
            var18.field2644 = this.field2644;
            var18.field2637 = this.field2637;
            var18.field2660 = this.field2660;
            var18.field2658 = this.field2658;
            var18.field2646 = this.field2646;
            var18.field2666 = this.field2666;
            var18.field2667 = this.field2667;
            var18.field2670 = this.field2670;
            var18.field2675 = this.field2675;
            var18.field2665 = this.field2665;
            if (arg0 == 3) {
                var18.field2685 = class71.method588(0, this.field2685);
                var18.field2652 = class71.method588(0, this.field2652);
                var18.field2668 = class71.method588(0, this.field2668);
            } else {
                var18.field2685 = this.field2685;
                var18.field2652 = new int[var18.field2653];
                var18.field2668 = this.field2668;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field2653; var19++) {
                int var20 = this.field2685[var19] + arg4;
                int var21 = this.field2668[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field2652[var19] = this.field2652[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field2653; var29++) {
                int var30 = (this.field2652[var29] << 16) / this.field2638;
                if (var30 < arg1) {
                    int var31 = this.field2685[var29] + arg4;
                    int var32 = this.field2668[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field2652[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field2652[var29];
                } else {
                    var18.field2652[var29] = this.field2652[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method1079(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field2659 - this.field2638;
            for (int var43 = 0; var43 < this.field2653; var43++) {
                int var44 = this.field2685[var43] + arg4;
                int var45 = this.field2668[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field2652[var43] = var52 + this.field2652[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field2659 - this.field2638;
            for (int var54 = 0; var54 < this.field2653; var54++) {
                int var55 = this.field2685[var54] + arg4;
                int var56 = this.field2668[var54] + arg6;
                int var57 = var55 & 0x7F;
                int var58 = var56 & 0x7F;
                int var59 = var55 >> 7;
                int var60 = var56 >> 7;
                int var61 = (128 - var57) * arg2[var59][var60] + arg2[var59 + 1][var60] * var57 >> 7;
                int var62 = (128 - var57) * arg2[var59][var60 + 1] + arg2[var59 + 1][var60 + 1] * var57 >> 7;
                int var63 = (128 - var58) * var61 + var58 * var62 >> 7;
                int var64 = (128 - var57) * arg3[var59][var60] + arg3[var59 + 1][var60] * var57 >> 7;
                int var65 = (128 - var57) * arg3[var59][var60 + 1] + arg3[var59 + 1][var60 + 1] * var57 >> 7;
                int var66 = (128 - var58) * var64 + var58 * var65 >> 7;
                int var67 = var63 - var66;
                var18.field2652[var54] = ((this.field2652[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method1074();
        } else {
            this.field2648 = false;
        }
        return var18;
    }
}
