import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class200 {

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "I")
    public int field2725 = 0;

    @OriginalMember(owner = "client!oq", name = "J", descriptor = "I")
    public int field2753 = 0;

    @OriginalMember(owner = "client!oq", name = "F", descriptor = "I")
    public int field2749 = 0;

    @OriginalMember(owner = "client!oq", name = "E", descriptor = "B")
    public byte field2748 = 0;

    @OriginalMember(owner = "client!oq", name = "U", descriptor = "I")
    public int field2764 = 0;

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "[I")
    public int[] field2729;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "[S")
    public short[] field2721;

    @OriginalMember(owner = "client!oq", name = "H", descriptor = "[I")
    public int[] field2751;

    @OriginalMember(owner = "client!oq", name = "y", descriptor = "[B")
    public byte[] field2742;

    @OriginalMember(owner = "client!oq", name = "O", descriptor = "[S")
    public short[] field2758;

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "[S")
    public short[] field2722;

    @OriginalMember(owner = "client!oq", name = "q", descriptor = "[S")
    public short[] field2734;

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "[B")
    public byte[] field2726;

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "[B")
    public byte[] field2728;

    @OriginalMember(owner = "client!oq", name = "S", descriptor = "[S")
    public short[] field2762;

    @OriginalMember(owner = "client!oq", name = "N", descriptor = "[B")
    public byte[] field2757;

    @OriginalMember(owner = "client!oq", name = "u", descriptor = "[B")
    public byte[] field2738;

    @OriginalMember(owner = "client!oq", name = "I", descriptor = "[S")
    public short[] field2752;

    @OriginalMember(owner = "client!oq", name = "M", descriptor = "[B")
    public byte[] field2756;

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "[B")
    public byte[] field2723;

    @OriginalMember(owner = "client!oq", name = "w", descriptor = "[B")
    public byte[] field2740;

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "[S")
    public short[] field2724;

    @OriginalMember(owner = "client!oq", name = "C", descriptor = "[S")
    public short[] field2746;

    @OriginalMember(owner = "client!oq", name = "B", descriptor = "[S")
    public short[] field2745;

    @OriginalMember(owner = "client!oq", name = "t", descriptor = "[S")
    public short[] field2737;

    @OriginalMember(owner = "client!oq", name = "v", descriptor = "[B")
    public byte[] field2739;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "[I")
    public int[] field2720;

    @OriginalMember(owner = "client!oq", name = "r", descriptor = "[I")
    public int[] field2735;

    @OriginalMember(owner = "client!oq", name = "R", descriptor = "[S")
    public short[] field2761;

    @OriginalMember(owner = "client!oq", name = "T", descriptor = "[I")
    public int[] field2763;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "[B")
    public byte[] field2718;

    @OriginalMember(owner = "client!oq", name = "W", descriptor = "[Lor;")
    public class382[] field2766;

    @OriginalMember(owner = "client!oq", name = "Z", descriptor = "[Lnr;")
    public class35[] field2769;

    @OriginalMember(owner = "client!oq", name = "K", descriptor = "[S")
    public short[] field2754;

    @OriginalMember(owner = "client!oq", name = "L", descriptor = "[S")
    public short[] field2755;

    @OriginalMember(owner = "client!oq", name = "s", descriptor = "Ljf;")
    public static class119 field2736 = null;

    @OriginalMember(owner = "client!oq", name = "z", descriptor = "Ljava/lang/String;")
    public static String field2743 = "Prepared sound engine";

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!oq", name = "m", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!oq", name = "o", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!oq", name = "p", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!oq", name = "x", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!oq", name = "A", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!oq", name = "D", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!oq", name = "G", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!oq", name = "P", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!oq", name = "Q", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!oq", name = "V", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!oq", name = "X", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!oq", name = "Y", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(BIII)V", line = 5)
    public final void method1271(byte arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            int var5 = class286.field4025[arg3];
            int var6 = class286.field4035[arg3];
            for (int var7 = 0; var7 < this.field2749; var7++) {
                int var8 = this.field2735[var7] * var5 + (this.field2720[var7] * var6) >> 15;
                this.field2735[var7] = this.field2735[var7] * var6 - (this.field2720[var7] * var5) >> 15;
                this.field2720[var7] = var8;
            }
        }
        field2719++;
        if (arg2 != 0) {
            int var9 = class286.field4025[arg2];
            int var10 = class286.field4035[arg2];
            for (int var11 = 0; var11 < this.field2749; var11++) {
                int var12 = this.field2735[var11] * var10 - this.field2751[var11] * var9 >> 15;
                this.field2751[var11] = this.field2751[var11] * var10 + this.field2735[var11] * var9 >> 15;
                this.field2735[var11] = var12;
            }
        }
        if (arg1 != 0) {
            int var13 = class286.field4025[arg1];
            int var14 = class286.field4035[arg1];
            for (int var15 = 0; var15 < this.field2749; var15++) {
                int var16 = this.field2751[var15] * var13 + this.field2720[var15] * var14 >> 15;
                this.field2751[var15] = this.field2751[var15] * var14 - (this.field2720[var15] * var13) >> 15;
                this.field2720[var15] = var16;
            }
        }
        if (arg0 != 21) {
            this.method1278(99);
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)V", line = 78)
    public static final void method1272(int arg0) {
        field2727++;
        int var1 = 0;
        for (int var2 = 0; var2 < class279.field3935; var2++) {
            for (int var3 = 0; var3 < class164.field2287; var3++) {
                if (class343.method2197(4095, var1, true, class19.field202, var2, var3)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        if (arg0 <= 84) {
            field2743 = null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)[[I", line = 116)
    public final int[][] method1273(int arg0) {
        field2768++;
        int[] var2 = new int[256];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2753; var4++) {
            int var9 = this.field2729[var4];
            if (var9 >= 0) {
                int var10002 = var2[var9]++;
                if (var3 < var9) {
                    var3 = var9;
                }
            }
        }
        int[][] var5 = new int[var3 - arg0][];
        for (int var6 = 0; var6 <= var3; var6++) {
            var5[var6] = new int[var2[var6]];
            var2[var6] = 0;
        }
        for (int var7 = 0; var7 < this.field2753; var7++) {
            int var8 = this.field2729[var7];
            if (var8 >= 0) {
                var5[var8][var2[var8]++] = var7;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V", line = 191)
    public static void method1274(byte arg0) {
        field2736 = null;
        field2743 = null;
        if (arg0 != -74) {
            method1280(18);
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIII)V", line = 203)
    public final void method1275(int arg0, int arg1, int arg2, int arg3) {
        int var5 = -15 / ((-arg2 - 52) / 50);
        for (int var6 = 0; var6 < this.field2749; var6++) {
            this.field2720[var6] += arg0;
            this.field2735[var6] += arg1;
            this.field2751[var6] += arg3;
        }
        field2733++;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(BSSBSSSSBB)B", line = 223)
    public final byte method1276(byte arg0, short arg1, short arg2, byte arg3, short arg4, short arg5, short arg6, short arg7, byte arg8, byte arg9) {
        field2731++;
        if (this.field2764 >= 255) {
            throw new IllegalStateException();
        }
        this.field2740[this.field2764] = 3;
        this.field2762[this.field2764] = arg6;
        this.field2724[this.field2764] = arg4;
        this.field2746[this.field2764] = arg5;
        this.field2752[this.field2764] = arg1;
        this.field2745[this.field2764] = arg7;
        this.field2737[this.field2764] = arg2;
        this.field2738[this.field2764] = arg8;
        this.field2728[this.field2764] = arg9;
        if (arg3 == -55) {
            this.field2723[this.field2764] = arg0;
            return (byte) (this.field2764++);
        } else {
            return 13;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(SBS)V", line = 251)
    public final void method1277(short arg0, byte arg1, short arg2) {
        field2744++;
        if (arg1 < 34) {
            this.method1278(-99);
        }
        if (this.field2721 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field2725; var4++) {
            if (this.field2721[var4] == arg0) {
                this.field2721[var4] = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "(I)[[I", line = 289)
    public final int[][] method1278(int arg0) {
        field2765++;
        int[] var2 = new int[256];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2725; var4++) {
            int var9 = this.field2763[var4];
            if (var9 >= 0) {
                int var10002 = var2[var9]++;
                if (var3 < var9) {
                    var3 = var9;
                }
            }
        }
        int[][] var5 = new int[var3 + 1][];
        int var6 = 0;
        if (arg0 < 53) {
            this.field2738 = null;
        }
        while (var3 >= var6) {
            var5[var6] = new int[var2[var6]];
            var2[var6] = 0;
            var6++;
        }
        for (int var7 = 0; var7 < this.field2725; var7++) {
            int var8 = this.field2763[var7];
            if (var8 >= 0) {
                var5[var8][var2[var8]++] = var7;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(BIBSIBSBI)I", line = 355)
    public final int method1279(byte arg0, int arg1, byte arg2, short arg3, int arg4, byte arg5, short arg6, byte arg7, int arg8) {
        field2750++;
        this.field2758[this.field2725] = (short) arg4;
        this.field2722[this.field2725] = (short) arg8;
        if (arg2 != -61) {
            return 101;
        }
        this.field2761[this.field2725] = (short) arg1;
        this.field2742[this.field2725] = arg7;
        this.field2739[this.field2725] = arg5;
        this.field2734[this.field2725] = arg3;
        this.field2718[this.field2725] = arg0;
        this.field2721[this.field2725] = arg6;
        return this.field2725++;
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "([B)V", line = 1779)
    public class200(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1283(arg0, (byte) 34);
        } else {
            this.method1284(16868, arg0);
        }
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(III)V", line = 1790)
    public class200(int arg0, int arg1, int arg2) {
        this.field2729 = new int[arg0];
        this.field2721 = new short[arg1];
        this.field2751 = new int[arg0];
        this.field2742 = new byte[arg1];
        this.field2758 = new short[arg1];
        this.field2722 = new short[arg1];
        this.field2734 = new short[arg1];
        this.field2726 = new byte[arg1];
        if (arg2 > 0) {
            this.field2728 = new byte[arg2];
            this.field2762 = new short[arg2];
            this.field2757 = new byte[arg2];
            this.field2738 = new byte[arg2];
            this.field2752 = new short[arg2];
            this.field2756 = new byte[arg2];
            this.field2723 = new byte[arg2];
            this.field2740 = new byte[arg2];
            this.field2724 = new short[arg2];
            this.field2746 = new short[arg2];
            this.field2745 = new short[arg2];
            this.field2737 = new short[arg2];
        }
        this.field2739 = new byte[arg1];
        this.field2720 = new int[arg0];
        this.field2735 = new int[arg0];
        this.field2761 = new short[arg1];
        this.field2763 = new int[arg1];
        this.field2718 = new byte[arg1];
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "([Loq;I)V", line = 1826)
    public class200(class200[] arg0, int arg1) {
        this.field2725 = 0;
        this.field2764 = 0;
        this.field2749 = 0;
        int var3 = 0;
        int var4 = 0;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        this.field2748 = -1;
        boolean var10 = false;
        for (int var11 = 0; var11 < arg1; var11++) {
            class200 var31 = arg0[var11];
            if (var31 != null) {
                this.field2725 += var31.field2725;
                this.field2749 += var31.field2749;
                this.field2764 += var31.field2764;
                if (var31.field2766 != null) {
                    var4 += var31.field2766.length;
                }
                if (var31.field2769 != null) {
                    var3 += var31.field2769.length;
                }
                var5 |= var31.field2742 != null;
                var7 |= var31.field2718 != null;
                if (var31.field2726 == null) {
                    if (this.field2748 == -1) {
                        this.field2748 = var31.field2748;
                    }
                    if (this.field2748 != var31.field2748) {
                        var6 = true;
                    }
                } else {
                    var6 = true;
                }
                var9 |= var31.field2721 != null;
                var8 |= var31.field2739 != null;
                var10 |= var31.field2763 != null;
            }
        }
        this.field2761 = new short[this.field2725];
        if (var7) {
            this.field2718 = new byte[this.field2725];
        }
        if (var9) {
            this.field2721 = new short[this.field2725];
        }
        if (var4 > 0) {
            this.field2766 = new class382[var4];
        }
        if (var10) {
            this.field2763 = new int[this.field2725];
        }
        this.field2758 = new short[this.field2725];
        this.field2735 = new int[this.field2749];
        this.field2734 = new short[this.field2725];
        if (var5) {
            this.field2742 = new byte[this.field2725];
        }
        if (var3 > 0) {
            this.field2769 = new class35[var3];
        }
        if (var8) {
            this.field2739 = new byte[this.field2725];
        }
        this.field2720 = new int[this.field2749];
        if (var6) {
            this.field2726 = new byte[this.field2725];
        }
        this.field2729 = new int[this.field2749];
        this.field2754 = new short[this.field2725];
        this.field2722 = new short[this.field2725];
        if (this.field2764 > 0) {
            this.field2737 = new short[this.field2764];
            this.field2724 = new short[this.field2764];
            this.field2746 = new short[this.field2764];
            this.field2740 = new byte[this.field2764];
            this.field2762 = new short[this.field2764];
            this.field2752 = new short[this.field2764];
            this.field2738 = new byte[this.field2764];
            this.field2723 = new byte[this.field2764];
            this.field2757 = new byte[this.field2764];
            this.field2756 = new byte[this.field2764];
            this.field2728 = new byte[this.field2764];
            this.field2745 = new short[this.field2764];
        }
        this.field2751 = new int[this.field2749];
        this.field2755 = new short[this.field2749];
        this.field2749 = 0;
        this.field2764 = 0;
        int var12 = 0;
        int var13 = 0;
        this.field2725 = 0;
        for (int var14 = 0; var14 < arg1; var14++) {
            short var22 = (short) (0x1 << var14);
            class200 var23 = arg0[var14];
            if (var23 != null) {
                for (int var24 = 0; var24 < var23.field2725; var24++) {
                    if (var5 && var23.field2742 != null) {
                        this.field2742[this.field2725] = var23.field2742[var24];
                    }
                    if (var6) {
                        if (var23.field2726 == null) {
                            this.field2726[this.field2725] = var23.field2748;
                        } else {
                            this.field2726[this.field2725] = var23.field2726[var24];
                        }
                    }
                    if (var7 && var23.field2718 != null) {
                        this.field2718[this.field2725] = var23.field2718[var24];
                    }
                    if (var9) {
                        if (var23.field2721 == null) {
                            this.field2721[this.field2725] = -1;
                        } else {
                            this.field2721[this.field2725] = var23.field2721[var24];
                        }
                    }
                    if (var10) {
                        if (var23.field2763 == null) {
                            this.field2763[this.field2725] = -1;
                        } else {
                            this.field2763[this.field2725] = var23.field2763[var24];
                        }
                    }
                    this.field2758[this.field2725] = (short) this.method1281(var23.field2758[var24], (byte) -33, var22, var23);
                    this.field2722[this.field2725] = (short) this.method1281(var23.field2722[var24], (byte) 49, var22, var23);
                    this.field2761[this.field2725] = (short) this.method1281(var23.field2761[var24], (byte) -53, var22, var23);
                    this.field2754[this.field2725] = var22;
                    this.field2734[this.field2725] = var23.field2734[var24];
                    this.field2725++;
                }
                if (var23.field2769 != null) {
                    for (int var25 = 0; var25 < var23.field2769.length; var25++) {
                        int var26 = this.method1281(var23.field2769[var25].field350, (byte) -101, var22, var23);
                        int var27 = this.method1281(var23.field2769[var25].field339, (byte) 44, var22, var23);
                        int var28 = this.method1281(var23.field2769[var25].field342, (byte) -117, var22, var23);
                        this.field2769[var13] = new class35(var23.field2769[var25].field357, var26, var27, var28, var23.field2769[var25].field345);
                        var13++;
                    }
                }
                if (var23.field2766 != null) {
                    for (int var29 = 0; var29 < var23.field2766.length; var29++) {
                        int var30 = this.method1281(var23.field2766[var29].field5601, (byte) 72, var22, var23);
                        this.field2766[var12] = new class382(var23.field2766[var29].field5603, var30);
                        var12++;
                    }
                }
            }
        }
        int var15 = 0;
        this.field2753 = this.field2749;
        for (int var16 = 0; var16 < arg1; var16++) {
            short var17 = (short) (0x1 << var16);
            class200 var18 = arg0[var16];
            if (var18 != null) {
                for (int var19 = 0; var19 < var18.field2725; var19++) {
                    if (var8) {
                        this.field2739[var15++] = (byte) (var18.field2739 == null || var18.field2739[var19] == -1 ? -1 : var18.field2739[var19] + this.field2764);
                    }
                }
                for (int var20 = 0; var20 < var18.field2764; var20++) {
                    byte var21 = this.field2740[this.field2764] = var18.field2740[var20];
                    if (var21 == 0) {
                        this.field2762[this.field2764] = (short) this.method1281(var18.field2762[var20], (byte) -47, var17, var18);
                        this.field2724[this.field2764] = (short) this.method1281(var18.field2724[var20], (byte) 104, var17, var18);
                        this.field2746[this.field2764] = (short) this.method1281(var18.field2746[var20], (byte) -70, var17, var18);
                    }
                    if (var21 >= 1 && var21 <= 3) {
                        this.field2762[this.field2764] = var18.field2762[var20];
                        this.field2724[this.field2764] = var18.field2724[var20];
                        this.field2746[this.field2764] = var18.field2746[var20];
                        this.field2752[this.field2764] = var18.field2752[var20];
                        this.field2745[this.field2764] = var18.field2745[var20];
                        this.field2737[this.field2764] = var18.field2737[var20];
                        this.field2738[this.field2764] = var18.field2738[var20];
                        this.field2728[this.field2764] = var18.field2728[var20];
                        this.field2723[this.field2764] = var18.field2723[var20];
                    }
                    if (var21 == 2) {
                        this.field2757[this.field2764] = var18.field2757[var20];
                        this.field2756[this.field2764] = var18.field2756[var20];
                    }
                    this.field2764++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "(I)V", line = 378)
    public static final void method1280(int arg0) {
        field2747++;
        if (class248.field3363 == 0 || class248.field3363 == 5) {
            return;
        }
        try {
            if (arg0 >= 83) {
                if (++class162.field2281 > 2000) {
                    if (class330.field4719 != null) {
                        class330.field4719.method1503(false);
                        class330.field4719 = null;
                    }
                    if (class297.field4235 >= 1) {
                        class159.field2251 = -5;
                        class248.field3363 = 0;
                        return;
                    }
                    class248.field3363 = 1;
                    class297.field4235++;
                    if (class375.field5469 == class249.field3394) {
                        class375.field5469 = class2.field23;
                    } else {
                        class375.field5469 = class249.field3394;
                    }
                    class162.field2281 = 0;
                }
                if (class248.field3363 == 1) {
                    class103.field1176 = class323.field4554.method2380(class375.field5469, -88, class85.field950);
                    class248.field3363 = 2;
                }
                if (class248.field3363 == 2) {
                    if (class103.field1176.field3268 == 2) {
                        throw new IOException();
                    }
                    if (class103.field1176.field3268 != 1) {
                        return;
                    }
                    class330.field4719 = new class236((Socket) class103.field1176.field3270, class323.field4554);
                    class103.field1176 = null;
                    long var1 = class37.field376 = class190.method1215(-1, class93.field1033);
                    class169.field2360.field2888 = 0;
                    int var3 = (int) (var1 >> 16 & 0x1FL);
                    class169.field2360.method1396(21375, 14);
                    class169.field2360.method1396(21375, var3);
                    class330.field4719.method1511(2, 28067, 0, class169.field2360.field2867);
                    if (class225.field3064 != null) {
                        class225.field3064.method1861((byte) -51);
                    }
                    if (class444.field6488 != null) {
                        class444.field6488.method1861((byte) -51);
                    }
                    int var4 = class330.field4719.method1509((byte) 26);
                    if (class225.field3064 != null) {
                        class225.field3064.method1861((byte) -51);
                    }
                    if (class444.field6488 != null) {
                        class444.field6488.method1861((byte) -51);
                    }
                    if (var4 != 0) {
                        class248.field3363 = 0;
                        class159.field2251 = var4;
                        class330.field4719.method1503(false);
                        class330.field4719 = null;
                        return;
                    }
                    class248.field3363 = 3;
                }
                if (class248.field3363 == 3) {
                    if (class330.field4719.method1508((byte) -53) < 8) {
                        return;
                    }
                    class330.field4719.method1502(class249.field3379.field2867, -1, 8, 0);
                    class249.field3379.field2888 = 0;
                    class248.field3367 = class249.field3379.method1394(true);
                    int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class248.field3367 >> 32), (int) class248.field3367 };
                    class169.field2360.field2888 = 0;
                    class169.field2360.method1396(21375, 10);
                    class169.field2360.method1361((byte) -124, var5[0]);
                    class169.field2360.method1361((byte) -121, var5[1]);
                    class169.field2360.method1361((byte) -120, var5[2]);
                    class169.field2360.method1361((byte) -121, var5[3]);
                    class169.field2360.method1381(1024975824, class190.method1215(-1, class93.field1033));
                    class169.field2360.method1359((byte) 0, class289.field4101);
                    class169.field2360.method1369(class221.field3027, -52, class301.field4285);
                    class418.field6008.field2888 = 0;
                    if (class105.field1191 == 40) {
                        class418.field6008.method1396(21375, 18);
                    } else {
                        class418.field6008.method1396(21375, 16);
                    }
                    class418.field6008.method1380(class169.field2360.field2888 + class233.method1488(-19285, class100.field1130) + 161, (byte) -8);
                    class418.field6008.method1361((byte) -118, 560);
                    class418.field6008.method1396(21375, class261.field3605);
                    class418.field6008.method1396(21375, class23.method151((byte) -77));
                    class418.field6008.method1380(class38.field389, (byte) -8);
                    class418.field6008.method1380(class222.field3039, (byte) -8);
                    class418.field6008.method1396(21375, class384.field5630);
                    class437.method2715(class418.field6008, 0);
                    class418.field6008.method1359((byte) 0, class100.field1130);
                    class418.field6008.method1361((byte) -120, class404.field5884);
                    class418.field6008.method1361((byte) -119, class338.method2177(-127));
                    class174.field2418 = true;
                    class418.field6008.method1380(class164.field2292, (byte) -8);
                    class418.field6008.method1361((byte) -123, class350.field5114.method335(-96));
                    class418.field6008.method1361((byte) -126, class335.field4932.method335(58));
                    class418.field6008.method1361((byte) -125, class324.field4574.method335(-128));
                    class418.field6008.method1361((byte) -122, class220.field3018.method335(-118));
                    class418.field6008.method1361((byte) -127, class151.field2113.method335(-113));
                    class418.field6008.method1361((byte) -121, class282.field3968.method335(65));
                    class418.field6008.method1361((byte) -120, class354.field5165.method335(-126));
                    class418.field6008.method1361((byte) -118, class144.field2031.method335(-90));
                    class418.field6008.method1361((byte) -122, class92.field1012.method335(-104));
                    class418.field6008.method1361((byte) -124, class105.field1199.method335(53));
                    class418.field6008.method1361((byte) -119, class118.field1403.method335(118));
                    class418.field6008.method1361((byte) -124, class213.field2919.method335(91));
                    class418.field6008.method1361((byte) -122, class78.field889.method335(-78));
                    class418.field6008.method1361((byte) -125, class323.field4546.method335(-70));
                    class418.field6008.method1361((byte) -125, class3.field41.method335(-109));
                    class418.field6008.method1361((byte) -125, class303.field4336.method335(-69));
                    class418.field6008.method1361((byte) -122, class162.field2280.method335(-107));
                    class418.field6008.method1361((byte) -122, class151.field2129.method335(65));
                    class418.field6008.method1361((byte) -125, class364.field5295.method335(69));
                    class418.field6008.method1361((byte) -118, class362.field5273.method335(18));
                    class418.field6008.method1361((byte) -120, class6.field70.method335(122));
                    class418.field6008.method1361((byte) -126, class8.field98.method335(120));
                    class418.field6008.method1361((byte) -128, class318.field4502.method335(33));
                    class418.field6008.method1361((byte) -122, class54.field611.method335(89));
                    class418.field6008.method1361((byte) -122, class101.field1133.method335(-75));
                    class418.field6008.method1361((byte) -121, class97.field1093.method335(39));
                    class418.field6008.method1361((byte) -125, class134.field1883.method335(-122));
                    class418.field6008.method1361((byte) -122, class132.field1809.method335(-124));
                    class418.field6008.method1361((byte) -124, class341.field5016.method335(90));
                    class418.field6008.method1360(0, class169.field2360.field2867, class169.field2360.field2888, 1);
                    class330.field4719.method1511(class418.field6008.field2888, 28067, 0, class418.field6008.field2867);
                    class169.field2360.method808(var5, -7);
                    for (int var6 = 0; var6 < 4; var6++) {
                        var5[var6] += 50;
                    }
                    class249.field3379.method808(var5, -7);
                    class248.field3363 = 4;
                }
                if (class248.field3363 == 4) {
                    if (class330.field4719.method1508((byte) -3) < 1) {
                        return;
                    }
                    int var7 = class330.field4719.method1509((byte) 26);
                    if (var7 == 21) {
                        class248.field3363 = 7;
                    } else if (var7 == 29) {
                        class248.field3363 = 10;
                    } else if (var7 == 1) {
                        class248.field3363 = 5;
                        class159.field2251 = var7;
                        return;
                    } else if (var7 == 2) {
                        class248.field3363 = 8;
                    } else if (var7 == 15) {
                        class159.field2251 = var7;
                        class248.field3363 = 0;
                        return;
                    } else if (var7 == 23 && class297.field4235 < 1) {
                        class162.field2281 = 0;
                        class248.field3363 = 1;
                        class297.field4235++;
                        class330.field4719.method1503(false);
                        class330.field4719 = null;
                        return;
                    } else {
                        class159.field2251 = var7;
                        class248.field3363 = 0;
                        class330.field4719.method1503(false);
                        class330.field4719 = null;
                        return;
                    }
                }
                if (class248.field3363 == 6) {
                    class169.field2360.field2888 = 0;
                    class169.field2360.method809(17, -28022);
                    class330.field4719.method1511(class169.field2360.field2888, 28067, 0, class169.field2360.field2867);
                    class248.field3363 = 4;
                } else if (class248.field3363 == 7) {
                    if (class330.field4719.method1508((byte) -78) >= 1) {
                        class135.field1894 = class330.field4719.method1509((byte) 26) * 60 + 180;
                        class248.field3363 = 0;
                        class159.field2251 = 21;
                        class330.field4719.method1503(false);
                        class330.field4719 = null;
                    }
                } else if (class248.field3363 != 10) {
                    if (class248.field3363 == 8) {
                        if (class330.field4719.method1508((byte) 111) < 14) {
                            return;
                        }
                        class330.field4719.method1502(class249.field3379.field2867, -1, 14, 0);
                        class249.field3379.field2888 = 0;
                        class56.field642 = class249.field3379.method1342((byte) -128);
                        class144.field2032 = class249.field3379.method1342((byte) -126);
                        class149.field2095 = class249.field3379.method1342((byte) -128) == 1;
                        class303.field4330 = class249.field3379.method1342((byte) -127) == 1;
                        class54.field618 = class249.field3379.method1342((byte) -127) == 1;
                        class24.field239 = class249.field3379.method1342((byte) -128) == 1;
                        class278.field3917 = class249.field3379.method1342((byte) -127) == 1;
                        class188.field2547 = class249.field3379.method1355(32136);
                        class63.field727 = class249.field3379.method1342((byte) -126) == 1;
                        class166.field2325 = class249.field3379.method1342((byte) -127) == 1;
                        class42.method263(false, class166.field2325);
                        class315.method1968(false, class166.field2325);
                        class173.method1144(14130, class166.field2325);
                        if ((!class149.field2095 || class54.field618) && !class63.field727) {
                            try {
                                class250.method1569("unzap", class323.field4554.field5559, 18050);
                            } catch (Throwable var9) {
                            }
                        } else {
                            try {
                                class250.method1569("zap", class323.field4554.field5559, 18050);
                            } catch (Throwable var10) {
                            }
                        }
                        if (class213.field2908 == 0) {
                            try {
                                class250.method1569("loggedin", class323.field4554.field5559, 18050);
                            } catch (Throwable var8) {
                            }
                        }
                        class367.field5358 = class249.field3379.method816(46);
                        class290.field4131 = class249.field3379.method1355(32136);
                        class248.field3363 = 9;
                    }
                    if (class248.field3363 == 9 && class330.field4719.method1508((byte) -39) >= class290.field4131) {
                        class249.field3379.field2888 = 0;
                        class330.field4719.method1502(class249.field3379.field2867, -1, class290.field4131, 0);
                        class159.field2251 = 2;
                        class248.field3363 = 0;
                        class232.method1478((byte) -102);
                        class426.field6175 = -1;
                        class424.method2629(false, (byte) 123);
                        class367.field5358 = -1;
                    }
                } else if (class330.field4719.method1508((byte) -25) >= 1) {
                    class123.field1639 = class330.field4719.method1509((byte) 26);
                    class159.field2251 = 29;
                    class248.field3363 = 0;
                    class330.field4719.method1503(false);
                    class330.field4719 = null;
                }
            }
        } catch (IOException var11) {
            if (class330.field4719 != null) {
                class330.field4719.method1503(false);
                class330.field4719 = null;
            }
            if (class297.field4235 < 1) {
                if (class375.field5469 == class249.field3394) {
                    class375.field5469 = class2.field23;
                } else {
                    class375.field5469 = class249.field3394;
                }
                class297.field4235++;
                class162.field2281 = 0;
                class248.field3363 = 1;
            } else {
                class248.field3363 = 0;
                class159.field2251 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IBSLoq;)I", line = 757)
    private final int method1281(int arg0, byte arg1, short arg2, class200 arg3) {
        field2760++;
        int var5 = arg3.field2720[arg0];
        int var6 = arg3.field2735[arg0];
        int var7 = arg3.field2751[arg0];
        int var8 = -83 % ((5 - arg1) / 35);
        for (int var9 = 0; var9 < this.field2749; var9++) {
            if (this.field2720[var9] == var5 && this.field2735[var9] == var6 && this.field2751[var9] == var7) {
                this.field2755[var9] = (short) class164.method1059(this.field2755[var9], arg2);
                return var9;
            }
        }
        this.field2720[this.field2749] = var5;
        this.field2735[this.field2749] = var6;
        this.field2751[this.field2749] = var7;
        this.field2755[this.field2749] = arg2;
        this.field2729[this.field2749] = arg3.field2729 == null ? -1 : arg3.field2729[arg0];
        return this.field2749++;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILra;)V", line = 805)
    public static final void method1282(int arg0, class57 arg1) {
        class302.field4325 = arg1.method332("titlebg", -1);
        if (arg0 != -8291) {
            method1272(124);
        }
        field2741++;
        class382.field5605 = arg1.method332("logo", -1);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "([BB)V", line = 827)
    private final void method1283(byte[] arg0, byte arg1) {
        field2730++;
        class211 var3 = new class211(arg0);
        class211 var4 = new class211(arg0);
        class211 var5 = new class211(arg0);
        class211 var6 = new class211(arg0);
        class211 var7 = new class211(arg0);
        class211 var8 = new class211(arg0);
        class211 var9 = new class211(arg0);
        var3.field2888 = arg0.length - 23;
        this.field2749 = var3.method1355(32136);
        this.field2725 = var3.method1355(arg1 ^ 0x7DAA);
        this.field2764 = var3.method1342((byte) -126);
        int var10 = var3.method1342((byte) -127);
        boolean var11 = (var10 & 0x1) == 1;
        boolean var12 = (var10 & 0x2) == 2;
        int var13 = var3.method1342((byte) -126);
        int var14 = var3.method1342((byte) -126);
        int var15 = var3.method1342((byte) -127);
        int var16 = var3.method1342((byte) -127);
        int var17 = var3.method1342((byte) -126);
        int var18 = var3.method1355(32136);
        int var19 = var3.method1355(32136);
        int var20 = var3.method1355(32136);
        int var21 = var3.method1355(32136);
        int var22 = var3.method1355(arg1 + 32102);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (this.field2764 > 0) {
            this.field2740 = new byte[this.field2764];
            var3.field2888 = 0;
            for (int var26 = 0; var26 < this.field2764; var26++) {
                byte var27 = this.field2740[var26] = var3.method1373((byte) 30);
                if (var27 == 2) {
                    var25++;
                }
                if (var27 == 0) {
                    var23++;
                }
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
            }
        }
        int var28 = this.field2764;
        int var30 = this.field2749 + var28;
        int var31 = var30;
        if (var11) {
            var30 += this.field2725;
        }
        int var33 = this.field2725 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += this.field2725;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += this.field2725;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += this.field2749;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += this.field2725;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += this.field2725 * 2;
        }
        int var42 = var22 + var39;
        int var44 = this.field2725 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var24 + (var25 * 2) + var60;
        if (var11) {
            this.field2742 = new byte[this.field2725];
        }
        if (var15 == 1) {
            this.field2763 = new int[this.field2725];
        }
        this.field2734 = new short[this.field2725];
        if (var16 == 1 && this.field2764 > 0) {
            this.field2739 = new byte[this.field2725];
        }
        this.field2735 = new int[this.field2749];
        if (var17 == 1) {
            this.field2729 = new int[this.field2749];
        }
        this.field2722 = new short[this.field2725];
        this.field2761 = new short[this.field2725];
        if (this.field2764 > 0) {
            this.field2762 = new short[this.field2764];
            this.field2746 = new short[this.field2764];
            this.field2724 = new short[this.field2764];
            if (var24 > 0) {
                this.field2723 = new byte[var24];
                this.field2728 = new byte[var24];
                this.field2752 = new short[var24];
                this.field2738 = new byte[var24];
                this.field2737 = new short[var24];
                this.field2745 = new short[var24];
            }
            if (var25 > 0) {
                this.field2757 = new byte[var25];
                this.field2756 = new byte[var25];
            }
        }
        this.field2758 = new short[this.field2725];
        var3.field2888 = var28;
        if (var16 == 1) {
            this.field2721 = new short[this.field2725];
        }
        this.field2751 = new int[this.field2749];
        this.field2720 = new int[this.field2749];
        if (var14 == 1) {
            this.field2718 = new byte[this.field2725];
        }
        if (var13 == 255) {
            this.field2726 = new byte[this.field2725];
        } else {
            this.field2748 = (byte) var13;
        }
        var4.field2888 = var44;
        var5.field2888 = var46;
        var6.field2888 = var48;
        var7.field2888 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        int var67 = 0;
        if (arg1 != 34) {
            this.field2761 = null;
        }
        while (var67 < this.field2749) {
            int var87 = var3.method1342((byte) -126);
            int var88 = 0;
            if ((var87 & 0x1) != 0) {
                var88 = var4.method1364(76);
            }
            int var89 = 0;
            if ((var87 & 0x2) != 0) {
                var89 = var5.method1364(arg1 + 46);
            }
            int var90 = 0;
            if ((var87 & 0x4) != 0) {
                var90 = var6.method1364(114);
            }
            this.field2720[var67] = var64 + var88;
            this.field2735[var67] = var65 + var89;
            this.field2751[var67] = var66 + var90;
            var66 = this.field2751[var67];
            var64 = this.field2720[var67];
            var65 = this.field2735[var67];
            if (var17 == 1) {
                this.field2729[var67] = var7.method1342((byte) -128);
            }
            var67++;
        }
        var3.field2888 = var42;
        var4.field2888 = var31;
        var5.field2888 = var34;
        var6.field2888 = var37;
        var7.field2888 = var35;
        var8.field2888 = var40;
        var9.field2888 = var39;
        for (int var68 = 0; var68 < this.field2725; var68++) {
            this.field2734[var68] = (short) var3.method1355(32136);
            if (var11) {
                this.field2742[var68] = var4.method1373((byte) 30);
            }
            if (var13 == 255) {
                this.field2726[var68] = var5.method1373((byte) 30);
            }
            if (var14 == 1) {
                this.field2718[var68] = var6.method1373((byte) 30);
            }
            if (var15 == 1) {
                this.field2763[var68] = var7.method1342((byte) -126);
            }
            if (var16 == 1) {
                this.field2721[var68] = (short) (var8.method1355(32136) - 1);
            }
            if (this.field2739 != null) {
                if (this.field2721[var68] == -1) {
                    this.field2739[var68] = -1;
                } else {
                    this.field2739[var68] = (byte) (var9.method1342((byte) -128) - 1);
                }
            }
        }
        var3.field2888 = var33;
        this.field2753 = -1;
        var4.field2888 = var30;
        short var69 = 0;
        short var70 = 0;
        short var71 = 0;
        short var72 = 0;
        for (int var73 = 0; var73 < this.field2725; var73++) {
            int var83 = var4.method1342((byte) -128);
            if (var83 == 1) {
                var69 = (short) (var72 + var3.method1364(87));
                var70 = (short) (var3.method1364(92) + var69);
                var71 = (short) (var3.method1364(95) + var70);
                this.field2758[var73] = var69;
                var72 = var71;
                this.field2722[var73] = var70;
                this.field2761[var73] = var71;
                if (var69 > this.field2753) {
                    this.field2753 = var69;
                }
                if (var70 > this.field2753) {
                    this.field2753 = var70;
                }
                if (this.field2753 < var71) {
                    this.field2753 = var71;
                }
            }
            if (var83 == 2) {
                var70 = var71;
                var71 = (short) (var3.method1364(127) + var72);
                this.field2758[var73] = var69;
                var72 = var71;
                this.field2722[var73] = var70;
                this.field2761[var73] = var71;
                if (var71 > this.field2753) {
                    this.field2753 = var71;
                }
            }
            if (var83 == 3) {
                var69 = var71;
                var71 = (short) (var72 + var3.method1364(102));
                var72 = var71;
                this.field2758[var73] = var69;
                this.field2722[var73] = var70;
                this.field2761[var73] = var71;
                if (this.field2753 < var71) {
                    this.field2753 = var71;
                }
            }
            if (var83 == 4) {
                short var86 = var69;
                var69 = var70;
                var70 = var86;
                var71 = (short) (var72 + var3.method1364(98));
                this.field2758[var73] = var69;
                var72 = var71;
                this.field2722[var73] = var86;
                this.field2761[var73] = var71;
                if (this.field2753 < var71) {
                    this.field2753 = var71;
                }
            }
        }
        this.field2753++;
        var3.field2888 = var50;
        var4.field2888 = var52;
        var5.field2888 = var54;
        var6.field2888 = var56;
        var7.field2888 = var58;
        var8.field2888 = var60;
        for (int var74 = 0; var74 < this.field2764; var74++) {
            int var82 = this.field2740[var74] & 0xFF;
            if (var82 == 0) {
                this.field2762[var74] = (short) var3.method1355(32136);
                this.field2724[var74] = (short) var3.method1355(32136);
                this.field2746[var74] = (short) var3.method1355(class97.method519(arg1, 32170));
            }
            if (var82 == 1) {
                this.field2762[var74] = (short) var4.method1355(32136);
                this.field2724[var74] = (short) var4.method1355(32136);
                this.field2746[var74] = (short) var4.method1355(class97.method519(arg1, 32170));
                this.field2752[var74] = (short) var5.method1355(32136);
                this.field2745[var74] = (short) var5.method1355(32136);
                this.field2737[var74] = (short) var5.method1355(32136);
                this.field2738[var74] = var6.method1373((byte) 30);
                this.field2728[var74] = var7.method1373((byte) 30);
                this.field2723[var74] = var8.method1373((byte) 30);
            }
            if (var82 == 2) {
                this.field2762[var74] = (short) var4.method1355(arg1 + 32102);
                this.field2724[var74] = (short) var4.method1355(32136);
                this.field2746[var74] = (short) var4.method1355(32136);
                this.field2752[var74] = (short) var5.method1355(32136);
                this.field2745[var74] = (short) var5.method1355(class97.method519(arg1, 32170));
                this.field2737[var74] = (short) var5.method1355(32136);
                this.field2738[var74] = var6.method1373((byte) 30);
                this.field2728[var74] = var7.method1373((byte) 30);
                this.field2723[var74] = var8.method1373((byte) 30);
                this.field2757[var74] = var8.method1373((byte) 30);
                this.field2756[var74] = var8.method1373((byte) 30);
            }
            if (var82 == 3) {
                this.field2762[var74] = (short) var4.method1355(32136);
                this.field2724[var74] = (short) var4.method1355(32136);
                this.field2746[var74] = (short) var4.method1355(32136);
                this.field2752[var74] = (short) var5.method1355(arg1 + 32102);
                this.field2745[var74] = (short) var5.method1355(class97.method519(arg1, 32170));
                this.field2737[var74] = (short) var5.method1355(32136);
                this.field2738[var74] = var6.method1373((byte) 30);
                this.field2728[var74] = var7.method1373((byte) 30);
                this.field2723[var74] = var8.method1373((byte) 30);
            }
        }
        if (!var12) {
            return;
        }
        var3.field2888 = var62;
        int var75 = var3.method1342((byte) -126);
        if (var75 > 0) {
            this.field2769 = new class35[var75];
            for (int var76 = 0; var76 < var75; var76++) {
                int var77 = var3.method1355(32136);
                int var78 = var3.method1355(32136);
                byte var79;
                if (var13 == 255) {
                    var79 = this.field2726[var78];
                } else {
                    var79 = (byte) var13;
                }
                this.field2769[var76] = new class35(var77, this.field2758[var78], this.field2722[var78], this.field2761[var78], var79);
            }
        }
        int var80 = var3.method1342((byte) -128);
        if (var80 <= 0) {
            return;
        }
        this.field2766 = new class382[var80];
        for (int var81 = 0; var81 < var80; var81++) {
            this.field2766[var81] = new class382(var3.method1355(arg1 + 32102), var3.method1355(32136));
        }
        return;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I[B)V", line = 1345)
    private final void method1284(int arg0, byte[] arg1) {
        field2759++;
        boolean var3 = false;
        boolean var4 = false;
        class211 var5 = new class211(arg1);
        class211 var6 = new class211(arg1);
        class211 var7 = new class211(arg1);
        class211 var8 = new class211(arg1);
        class211 var9 = new class211(arg1);
        var5.field2888 = arg1.length - 18;
        this.field2749 = var5.method1355(32136);
        this.field2725 = var5.method1355(32136);
        this.field2764 = var5.method1342((byte) -127);
        int var10 = var5.method1342((byte) -128);
        int var11 = var5.method1342((byte) -127);
        int var12 = var5.method1342((byte) -128);
        int var13 = var5.method1342((byte) -127);
        int var14 = var5.method1342((byte) -128);
        int var15 = var5.method1355(32136);
        int var16 = var5.method1355(arg0 ^ 0x3C6C);
        int var17 = var5.method1355(32136);
        int var18 = var5.method1355(32136);
        byte var19 = 0;
        int var21 = this.field2749 + var19;
        int var23 = this.field2725 + var21;
        int var24 = var23;
        if (var11 == 255) {
            var23 += this.field2725;
        }
        int var25 = var23;
        if (var13 == 1) {
            var23 += this.field2725;
        }
        int var26 = var23;
        if (var10 == 1) {
            var23 += this.field2725;
        }
        int var27 = var23;
        if (var14 == 1) {
            var23 += this.field2749;
        }
        int var28 = var23;
        if (var12 == 1) {
            var23 += this.field2725;
        }
        int var30 = var18 + var23;
        if (arg0 != 16868) {
            this.method1286((byte) -6, (short) -50, (short) -83);
        }
        int var32 = this.field2725 * 2 + var30;
        int var34 = this.field2764 * 6 + var32;
        int var36 = var15 + var34;
        int var38 = var16 + var36;
        if (var13 == 1) {
            this.field2763 = new int[this.field2725];
        }
        int var10000 = var17 + var38;
        this.field2761 = new short[this.field2725];
        if (var12 == 1) {
            this.field2718 = new byte[this.field2725];
        }
        if (var14 == 1) {
            this.field2729 = new int[this.field2749];
        }
        if (var11 == 255) {
            this.field2726 = new byte[this.field2725];
        } else {
            this.field2748 = (byte) var11;
        }
        this.field2720 = new int[this.field2749];
        this.field2751 = new int[this.field2749];
        this.field2758 = new short[this.field2725];
        this.field2735 = new int[this.field2749];
        var5.field2888 = var19;
        if (var10 == 1) {
            this.field2739 = new byte[this.field2725];
            this.field2742 = new byte[this.field2725];
            this.field2721 = new short[this.field2725];
        }
        this.field2722 = new short[this.field2725];
        this.field2734 = new short[this.field2725];
        if (this.field2764 > 0) {
            this.field2740 = new byte[this.field2764];
            this.field2724 = new short[this.field2764];
            this.field2762 = new short[this.field2764];
            this.field2746 = new short[this.field2764];
        }
        var6.field2888 = var34;
        var7.field2888 = var36;
        var8.field2888 = var38;
        var9.field2888 = var27;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        for (int var44 = 0; var44 < this.field2749; var44++) {
            int var60 = var5.method1342((byte) -126);
            int var61 = 0;
            if ((var60 & 0x1) != 0) {
                var61 = var6.method1364(104);
            }
            int var62 = 0;
            if ((var60 & 0x2) != 0) {
                var62 = var7.method1364(57);
            }
            int var63 = 0;
            if ((var60 & 0x4) != 0) {
                var63 = var8.method1364(126);
            }
            this.field2720[var44] = var41 + var61;
            this.field2735[var44] = var42 + var62;
            this.field2751[var44] = var43 + var63;
            var42 = this.field2735[var44];
            var41 = this.field2720[var44];
            var43 = this.field2751[var44];
            if (var14 == 1) {
                this.field2729[var44] = var9.method1342((byte) -128);
            }
        }
        var5.field2888 = var30;
        var6.field2888 = var26;
        var7.field2888 = var24;
        var8.field2888 = var28;
        var9.field2888 = var25;
        for (int var45 = 0; var45 < this.field2725; var45++) {
            this.field2734[var45] = (short) var5.method1355(32136);
            if (var10 == 1) {
                int var59 = var6.method1342((byte) -126);
                if ((var59 & 0x1) == 1) {
                    var3 = true;
                    this.field2742[var45] = 1;
                } else {
                    this.field2742[var45] = 0;
                }
                if ((var59 & 0x2) == 2) {
                    this.field2739[var45] = (byte) (var59 >> 2);
                    this.field2721[var45] = this.field2734[var45];
                    this.field2734[var45] = 127;
                    if (this.field2721[var45] != -1) {
                        var4 = true;
                    }
                } else {
                    this.field2739[var45] = -1;
                    this.field2721[var45] = -1;
                }
            }
            if (var11 == 255) {
                this.field2726[var45] = var7.method1373((byte) 30);
            }
            if (var12 == 1) {
                this.field2718[var45] = var8.method1373((byte) 30);
            }
            if (var13 == 1) {
                this.field2763[var45] = var9.method1342((byte) -127);
            }
        }
        this.field2753 = -1;
        var5.field2888 = var23;
        var6.field2888 = var21;
        short var46 = 0;
        short var47 = 0;
        short var48 = 0;
        short var49 = 0;
        for (int var50 = 0; var50 < this.field2725; var50++) {
            int var55 = var6.method1342((byte) -127);
            if (var55 == 1) {
                var46 = (short) (var49 + var5.method1364(56));
                var47 = (short) (var5.method1364(82) + var46);
                var48 = (short) (var47 + var5.method1364(99));
                var49 = var48;
                this.field2758[var50] = var46;
                this.field2722[var50] = var47;
                this.field2761[var50] = var48;
                if (var46 > this.field2753) {
                    this.field2753 = var46;
                }
                if (this.field2753 < var47) {
                    this.field2753 = var47;
                }
                if (var48 > this.field2753) {
                    this.field2753 = var48;
                }
            }
            if (var55 == 2) {
                var47 = var48;
                var48 = (short) (var5.method1364(127) + var49);
                this.field2758[var50] = var46;
                var49 = var48;
                this.field2722[var50] = var47;
                this.field2761[var50] = var48;
                if (var48 > this.field2753) {
                    this.field2753 = var48;
                }
            }
            if (var55 == 3) {
                var46 = var48;
                var48 = (short) (var5.method1364(84) + var49);
                this.field2758[var50] = var46;
                var49 = var48;
                this.field2722[var50] = var47;
                this.field2761[var50] = var48;
                if (var48 > this.field2753) {
                    this.field2753 = var48;
                }
            }
            if (var55 == 4) {
                short var58 = var46;
                var46 = var47;
                var48 = (short) (var5.method1364(arg0 ^ 0x41D6) + var49);
                var47 = var58;
                this.field2758[var50] = var46;
                var49 = var48;
                this.field2722[var50] = var58;
                this.field2761[var50] = var48;
                if (var48 > this.field2753) {
                    this.field2753 = var48;
                }
            }
        }
        this.field2753++;
        var5.field2888 = var32;
        for (int var51 = 0; var51 < this.field2764; var51++) {
            this.field2740[var51] = 0;
            this.field2762[var51] = (short) var5.method1355(arg0 + 15268);
            this.field2724[var51] = (short) var5.method1355(32136);
            this.field2746[var51] = (short) var5.method1355(class97.method519(arg0, 15468));
        }
        if (this.field2739 != null) {
            boolean var52 = false;
            for (int var53 = 0; var53 < this.field2725; var53++) {
                int var54 = this.field2739[var53] & 0xFF;
                if (var54 != 255) {
                    if ((this.field2762[var54] & 0xFFFF) == this.field2758[var53] && (this.field2724[var54] & 0xFFFF) == this.field2722[var53] && (this.field2746[var54] & 0xFFFF) == this.field2761[var53]) {
                        this.field2739[var53] = -1;
                    } else {
                        var52 = true;
                    }
                }
            }
            if (!var52) {
                this.field2739 = null;
            }
        }
        if (!var4) {
            this.field2721 = null;
        }
        if (!var3) {
            this.field2742 = null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(IIII)I", line = 1724)
    public final int method1285(int arg0, int arg1, int arg2, int arg3) {
        field2732++;
        for (int var5 = arg0; var5 < this.field2749; var5++) {
            if (this.field2720[var5] == arg3 && this.field2735[var5] == arg1 && this.field2751[var5] == arg2) {
                return var5;
            }
        }
        this.field2720[this.field2749] = arg3;
        this.field2735[this.field2749] = arg1;
        this.field2751[this.field2749] = arg2;
        this.field2753 = this.field2749 + 1;
        return this.field2749++;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(BSS)V", line = 1751)
    public final void method1286(byte arg0, short arg1, short arg2) {
        if (arg0 != -116) {
            method1282(-98, (class57) null);
        }
        for (int var4 = 0; var4 < this.field2725; var4++) {
            if (this.field2734[var4] == arg2) {
                this.field2734[var4] = arg1;
            }
        }
        field2767++;
    }
}
