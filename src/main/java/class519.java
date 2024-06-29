import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class519 {

    @OriginalMember(owner = "client!po", name = "k", descriptor = "I")
    private int field7067 = -1;

    @OriginalMember(owner = "client!po", name = "n", descriptor = "Z")
    public boolean field7070 = true;

    @OriginalMember(owner = "client!po", name = "p", descriptor = "I")
    private int field7072;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "Lnv;")
    private class382 field7058;

    @OriginalMember(owner = "client!po", name = "i", descriptor = "Lg;")
    private class140 field7065;

    @OriginalMember(owner = "client!po", name = "u", descriptor = "I")
    private int field7077;

    @OriginalMember(owner = "client!po", name = "m", descriptor = "I")
    public int field7069;

    @OriginalMember(owner = "client!po", name = "j", descriptor = "Lcm;")
    private class679 field7066;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "I")
    private int field7057;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "I")
    private int field7061;

    @OriginalMember(owner = "client!po", name = "l", descriptor = "Ljea;")
    private class415 field7068;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "S")
    public static short field7062 = 256;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    public static int field7059;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public static int field7060;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "I")
    public static int field7063;

    @OriginalMember(owner = "client!po", name = "h", descriptor = "I")
    public static int field7064;

    @OriginalMember(owner = "client!po", name = "o", descriptor = "I")
    public static int field7071;

    @OriginalMember(owner = "client!po", name = "q", descriptor = "I")
    public static int field7073;

    @OriginalMember(owner = "client!po", name = "r", descriptor = "I")
    public static int field7074;

    @OriginalMember(owner = "client!po", name = "s", descriptor = "I")
    public static int field7075;

    @OriginalMember(owner = "client!po", name = "t", descriptor = "I")
    public static int field7076;

    @OriginalMember(owner = "client!po", name = "v", descriptor = "[I")
    public static int[] field7078;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(III)Z", line = 6)
    public static final boolean method2954(int arg0, int arg1, int arg2) {
        field7060++;
        int var3 = 91 / ((34 - arg1) / 33);
        return class649.method3659(arg2, arg0, (byte) -64) || class628.method3513(134, arg2, arg0);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V", line = 19)
    public static void method2955(int arg0) {
        if (arg0 != -20729) {
            method2962(-105, null);
        }
        field7078 = null;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ILjea;I)V", line = 30)
    public final void method2956(int arg0, class415 arg1, int arg2) {
        if (arg0 <= 65) {
            return;
        }
        if (arg2 > 0) {
            this.method2958(0);
            this.field7058.method2241(this.field7066, (byte) 44);
            this.field7058.method1065(class345.field4628, this.field7057 + 1 - this.field7061, this.field7061, arg2, 0, arg1, (byte) -104);
        }
        field7059++;
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V", line = 55)
    public final void method2957(int arg0) {
        if (arg0 <= 90) {
            method2955(5);
        }
        field7071++;
        this.method2956(105, this.field7068, this.field7069);
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V", line = 69)
    private final void method2958(int arg0) {
        field7076++;
        if (!this.field7070) {
            return;
        }
        this.field7070 = false;
        byte[] var2 = this.field7065.field1988;
        int var3 = 0;
        int var4 = this.field7065.field1999;
        int var5 = this.field7065.field1999 * this.field7077 + this.field7072;
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field7066 != null && this.field7067 == var3) {
            this.field7070 = false;
            return;
        }
        this.field7067 = var3;
        int var7 = this.field7077 * var4 + this.field7072;
        int var8 = arg0;
        if (!this.field7058.method1054(class309.field4271, class559.field7539, 122)) {
            if (class64.field778 == null) {
                class64.field778 = new int[16384];
            }
            int[] var13 = class64.field778;
            for (int var14 = -128; var14 < 0; var14++) {
                for (int var15 = -128; var15 < 0; var15++) {
                    if (var2[var7] == 0) {
                        int var16 = 0;
                        if (var2[var7 - 1] != 0) {
                            var16++;
                        }
                        if (var2[var7 + 1] != 0) {
                            var16++;
                        }
                        if (var2[var7 - var4] != 0) {
                            var16++;
                        }
                        if (var2[var4 + var7] != 0) {
                            var16++;
                        }
                        var13[var8++] = var16 * 17 << 24;
                    } else {
                        var13[var8++] = 1140850688;
                    }
                    var7++;
                }
                var7 += this.field7065.field1999 - 128;
            }
            if (this.field7066 == null) {
                this.field7066 = this.field7058.method2206(false, class64.field778, 128, 128, -12482);
                this.field7066.method2137(false, arg0 ^ 0x1D, false);
            } else {
                this.field7066.method2134(0, 128, arg0 ^ 0x4BBE, class64.field778, 0, 0, 128, 128);
            }
            return;
        }
        if (class430.field6015 == null) {
            class430.field6015 = new byte[16384];
        }
        byte[] var9 = class430.field6015;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var7] == 0) {
                    int var12 = 0;
                    if (var2[var7 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var7 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var7 - var4] != 0) {
                        var12++;
                    }
                    if (var2[var7 + var4] != 0) {
                        var12++;
                    }
                    var9[var8++] = (byte) (var12 * 17);
                } else {
                    var9[var8++] = 68;
                }
                var7++;
            }
            var7 += this.field7065.field1999 - 128;
        }
        if (this.field7066 == null) {
            this.field7066 = this.field7058.method2236(class559.field7539, class430.field6015, (byte) 88, 128, false, 128);
            this.field7066.method2137(false, 125, false);
        } else {
            this.field7066.method2136(128, 128, 0, 0, true, 0, class559.field7539, 128, class430.field6015);
        }
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lnv;Lg;Lida;IIIII)V", line = 321)
    public class519(class382 arg0, class140 arg1, class214 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field7072 = arg6;
        this.field7058 = arg0;
        this.field7065 = arg1;
        this.field7077 = arg7;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field446 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field2998[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field7069 = 0;
            this.field7066 = null;
        } else {
            this.field7057 = Integer.MIN_VALUE;
            this.field7061 = Integer.MAX_VALUE;
            this.field7068 = this.field7058.method1062(false, 18554);
            this.field7068.method1116(var10, -124);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field7068.method1119(121, true);
                if (var15 != null) {
                    Stream var16 = this.field7058.method2238(var15, -125);
                    if (Stream.method3484()) {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field446 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field2998[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (this.field7061 > var28) {
                                            this.field7061 = var28;
                                        }
                                        if (this.field7057 < var28) {
                                            this.field7057 = var28;
                                        }
                                        var16.method3476(var28);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field446 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field2998[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (var22 < this.field7061) {
                                            this.field7061 = var22;
                                        }
                                        if (this.field7057 < var22) {
                                            this.field7057 = var22;
                                        }
                                        var16.method3479(var22);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3477();
                    if (this.field7068.method1121(false)) {
                        break;
                    }
                }
            }
            this.field7069 = var10 / 3;
        }
    }

    @OriginalMember(owner = "client!po", name = "d", descriptor = "(I)V", line = 241)
    public static final void method2959(int arg0) {
        field7075++;
        int var1 = -70 / ((arg0 - 70) / 36);
        class293.field4024.method3749(7648);
        class462.field6369.method3749(7648);
        class143.field2058.method3749(7648);
        class281.field3840.method3749(7648);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IJ)V", line = 255)
    public static final void method2960(int arg0, long arg1) {
        field7074++;
        if (arg1 <= 0L) {
            return;
        }
        int var3 = -73 % ((arg0 - 16) / 49);
        if (arg1 % 10L == 0L) {
            class283.method1735(arg1 - 1L, -1);
            class283.method1735(1L, -1);
        } else {
            class283.method1735(arg1, -1);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IB)V", line = 277)
    public static final void method2961(int arg0, byte arg1) {
        field7064++;
        class51 var2 = class703.method3938(arg1 ^ 0x896E009B, arg0, 6);
        var2.method404(82);
        if (arg1 != 59) {
            field7078 = null;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ILhb;)V", line = 294)
    public static final void method2962(int arg0, class677 arg1) {
        field7073++;
        class389 var2 = (class389) class122.field1683.method970((byte) 89, (long) arg1.field1697);
        if (arg0 <= 39) {
            method2959(-106);
        }
        if (var2 == null) {
            return;
        }
        if (var2.field5499 != null) {
            class61.field680.method1464(var2.field5499);
            var2.field5499 = null;
        }
        var2.method2340(-81);
    }
}
