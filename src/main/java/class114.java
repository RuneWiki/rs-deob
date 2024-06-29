import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class114 {

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "[I")
    private int[] field2849;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "[I")
    private int[] field2848;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "[B")
    private byte[] field2839;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field2840 = 500;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "Loc;")
    public static class99 field2838 = class48.method402((byte) -104, "::noclip");

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "Loc;")
    private static class99 field2833 = class48.method402((byte) -104, "and choose the (Wcreate account(W");

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "Loc;")
    public static class99 field2847 = class48.method402((byte) -104, "@gr2@");

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "Loc;")
    private static class99 field2846 = class48.method402((byte) -104, "Examine");

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "Loc;")
    public static class99 field2836 = field2833;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "Loc;")
    public static class99 field2857 = class48.method402((byte) -104, "sich mit einer anderen Welt zu verbinden)3");

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "Loc;")
    public static class99 field2834 = field2846;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "Loc;")
    private static class99 field2842 = class48.method402((byte) -104, "flash2:");

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "Loc;")
    public static class99 field2856 = field2842;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "J")
    public static long field2851 = 0L;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field2852 = 0;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "Loc;")
    public static class99 field2854 = field2842;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "Lub;")
    public static class134 field2853;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "Ldc;")
    public static class24 field2845;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "Ldc;")
    public static class24 field2850;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "[I")
    public static int[] field2841;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZI[B[BI)I")
    public final int method960(int arg0, boolean arg1, int arg2, byte[] arg3, byte[] arg4, int arg5) {
        field2858++;
        if (!arg1) {
            return -53;
        } else if (arg0 == 0) {
            return 0;
        } else {
            int var7 = arg0 + arg2;
            int var8 = 0;
            int var9 = arg5;
            while (true) {
                byte var10 = arg3[var9];
                if (var10 >= 0) {
                    var8++;
                } else {
                    var8 = this.field2848[var8];
                }
                int var11;
                if ((var11 = this.field2848[var8]) < 0) {
                    arg4[arg2++] = (byte) ~var11;
                    if (var7 <= arg2) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x40) == 0) {
                    var8++;
                } else {
                    var8 = this.field2848[var8];
                }
                int var12;
                if ((var12 = this.field2848[var8]) < 0) {
                    arg4[arg2++] = (byte) ~var12;
                    if (var7 <= arg2) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x20) == 0) {
                    var8++;
                } else {
                    var8 = this.field2848[var8];
                }
                int var13;
                if ((var13 = this.field2848[var8]) < 0) {
                    arg4[arg2++] = (byte) ~var13;
                    if (arg2 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x10) == 0) {
                    var8++;
                } else {
                    var8 = this.field2848[var8];
                }
                int var14;
                if ((var14 = this.field2848[var8]) < 0) {
                    arg4[arg2++] = (byte) ~var14;
                    if (var7 <= arg2) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x8) == 0) {
                    var8++;
                } else {
                    var8 = this.field2848[var8];
                }
                int var15;
                if ((var15 = this.field2848[var8]) < 0) {
                    arg4[arg2++] = (byte) ~var15;
                    if (var7 <= arg2) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x4) == 0) {
                    var8++;
                } else {
                    var8 = this.field2848[var8];
                }
                int var16;
                if ((var16 = this.field2848[var8]) < 0) {
                    arg4[arg2++] = (byte) ~var16;
                    if (var7 <= arg2) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x2) == 0) {
                    var8++;
                } else {
                    var8 = this.field2848[var8];
                }
                int var17;
                if ((var17 = this.field2848[var8]) < 0) {
                    arg4[arg2++] = (byte) ~var17;
                    if (arg2 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x1) == 0) {
                    var8++;
                } else {
                    var8 = this.field2848[var8];
                }
                int var18;
                if ((var18 = this.field2848[var8]) < 0) {
                    arg4[arg2++] = (byte) ~var18;
                    if (arg2 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                var9++;
            }
            return var9 + 1 - arg5;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
    public static void method961(byte arg0) {
        field2853 = null;
        field2850 = null;
        field2841 = null;
        field2856 = null;
        field2833 = null;
        field2838 = null;
        field2854 = null;
        field2834 = null;
        field2847 = null;
        field2842 = null;
        field2836 = null;
        field2857 = null;
        field2846 = null;
        field2845 = null;
        if (arg0 != -57) {
            field2836 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static final void method962(int arg0) {
        field2835++;
        class141.field3493 = 0;
        if (arg0 != 31961) {
            field2833 = null;
        }
        class91.field2224 = 0;
        client.method195((byte) -118);
        class5.method29(arg0 ^ 0xFFFF8329);
        class125.method1027(arg0 - 31833);
        for (int var1 = 0; var1 < class91.field2224; var1++) {
            int var3 = class140.field3471[var1];
            if (class101.field2444 != class149.field3691[var3].field3068) {
                class149.field3691[var3].field3689 = null;
                class149.field3691[var3] = null;
            }
        }
        if (class77.field1903 != class39.field965.field1477) {
            throw new RuntimeException("gnp1 pos:" + class39.field965.field1477 + " psize:" + class77.field1903);
        }
        for (int var2 = 0; var2 < class86.field2151; var2++) {
            if (class149.field3691[class9.field232[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class86.field2151);
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V")
    public static final void method963(boolean arg0) {
        field2843++;
        if (arg0) {
            return;
        }
        while (class39.field965.method863(class77.field1903, -30878) >= 11) {
            int var1 = class39.field965.method864(11, -25644);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class59.field1571[var1] == null) {
                class59.field1571[var1] = new class126();
                var2 = true;
                if (class58.field1524[var1] != null) {
                    class59.field1571[var1].method1031(class58.field1524[var1], 1);
                }
            }
            class67.field1729[class101.field2446++] = var1;
            class126 var3 = class59.field1571[var1];
            var3.field3068 = class101.field2444;
            int var4 = class39.field965.method864(5, -25644);
            int var5 = class39.field965.method864(5, -25644);
            if (var5 > 15) {
                var5 -= 32;
            }
            if (var4 > 15) {
                var4 -= 32;
            }
            int var6 = class46.field1136[class39.field965.method864(3, -25644)];
            if (var2) {
                var3.field3107 = var6;
            }
            int var7 = class39.field965.method864(1, -25644);
            int var8 = class39.field965.method864(1, -25644);
            if (var8 == 1) {
                class126.field3041[class141.field3493++] = var1;
            }
            var3.method1038(var7 == 1, class69.field1770.field3096[0] + var4, 25363, class69.field1770.field3100[0] + var5);
        }
        class39.field965.method872((byte) 102);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([BIII[BB)I")
    public final int method964(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4, byte arg5) {
        field2837++;
        int var7 = arg1 + arg3;
        int var8 = 0;
        int var9 = 68 % ((-arg5 - 74) / 52);
        int var10 = arg2 << 3;
        while (arg3 < var7) {
            int var11 = arg4[arg3] & 0xFF;
            int var12 = this.field2849[var11];
            byte var13 = this.field2839[var11];
            if (var13 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var10 & 0x7;
            int var15 = var10 >> 3;
            int var16 = var8 & -var14 >> 31;
            int var17 = var15 + (var13 + var14 - 1 >> 3);
            int var18 = var14 + 24;
            arg0[var15] = (byte) (var8 = class88.method744(var16, var12 >>> var18));
            if (var17 > var15) {
                var14 = var18 - 8;
                var15++;
                arg0[var15] = (byte) (var8 = var12 >>> var14);
                if (var15 < var17) {
                    var15++;
                    var14 -= 8;
                    arg0[var15] = (byte) (var8 = var12 >>> var14);
                    if (var17 > var15) {
                        var14 -= 8;
                        var15++;
                        arg0[var15] = (byte) (var8 = var12 >>> var14);
                        if (var15 < var17) {
                            var15++;
                            var14 -= 8;
                            arg0[var15] = (byte) (var8 = var12 << -var14);
                        }
                    }
                }
            }
            var10 += var13;
            arg3++;
        }
        return (var10 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILpc;)I")
    public static final int method965(int arg0, class105 arg1) {
        field2855++;
        int var2 = 0;
        if (arg1.method906(class99.field2402, (byte) -82, class137.field3405)) {
            var2++;
        }
        if (arg0 != 731141025) {
            method963(true);
        }
        if (arg1.method906(class110.field2744, (byte) -36, class137.field3405)) {
            var2++;
        }
        if (arg1.method906(class104.field2529, (byte) -103, class137.field3405)) {
            var2++;
        }
        if (arg1.method906(class93.field2270, (byte) -117, class137.field3405)) {
            var2++;
        }
        if (arg1.method906(class20.field489, (byte) -13, class137.field3405)) {
            var2++;
        }
        if (arg1.method906(class94.field2293, (byte) -128, class137.field3405)) {
            var2++;
        }
        if (arg1.method906(class37.field938, (byte) -55, class137.field3405)) {
            var2++;
        }
        if (arg1.method906(class148.field3658, (byte) -20, class137.field3405)) {
            var2++;
        }
        if (arg1.method906(class121.field2952, (byte) -119, class137.field3405)) {
            var2++;
        }
        if (arg1.method906(class126.field3048, (byte) -53, class137.field3405)) {
            var2++;
        }
        if (arg1.method906(class46.field1133, (byte) -16, class137.field3405)) {
            var2++;
        }
        if (arg1.method906(class79.field1950, (byte) -72, class137.field3405)) {
            var2++;
        }
        if (arg1.method906(class109.field2694, (byte) -55, class137.field3405)) {
            var2++;
        }
        if (arg1.method906(class105.field2552, (byte) -114, class137.field3405)) {
            var2++;
        }
        if (arg1.method906(class27.field681, (byte) -126, class137.field3405)) {
            var2++;
        }
        if (arg1.method906(class73.field1856, (byte) -95, class137.field3405)) {
            var2++;
        }
        if (arg1.method906(class1.field12, (byte) -81, class137.field3405)) {
            var2++;
        }
        if (arg1.method906(class119.field2917, (byte) -81, class137.field3405)) {
            var2++;
        }
        if (arg1.method906(class55.field1429, (byte) -69, class137.field3405)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "([B)V")
    public class114(byte[] arg0) {
        int var2 = arg0.length;
        this.field2849 = new int[var2];
        this.field2848 = new int[8];
        int[] var3 = new int[33];
        this.field2839 = arg0;
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = var3[var6];
                int var8 = 0x1 << 32 - var6;
                this.field2849[var5] = var7;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var7 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class88.method744(var11, var12);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var7) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var7 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field2848[var14] == 0) {
                            this.field2848[var14] = var4;
                        }
                        var14 = this.field2848[var14];
                    }
                    if (var14 >= this.field2848.length) {
                        int[] var17 = new int[this.field2848.length * 2];
                        for (int var18 = 0; var18 < this.field2848.length; var18++) {
                            var17[var18] = this.field2848[var18];
                        }
                        this.field2848 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field2848[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
