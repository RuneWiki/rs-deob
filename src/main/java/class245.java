import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class245 extends class276 {

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "I")
    private int field3887 = 0;

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "I")
    private int field3892 = -32768;

    @OriginalMember(owner = "client!sb", name = "Z", descriptor = "Z")
    private boolean field3907 = false;

    @OriginalMember(owner = "client!sb", name = "hb", descriptor = "Z")
    private boolean field3915 = false;

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "I")
    private int field3891 = -1;

    @OriginalMember(owner = "client!sb", name = "lb", descriptor = "I")
    private int field3919 = 0;

    @OriginalMember(owner = "client!sb", name = "ab", descriptor = "I")
    public int field3908;

    @OriginalMember(owner = "client!sb", name = "K", descriptor = "I")
    private int field3893;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    private int field3878;

    @OriginalMember(owner = "client!sb", name = "T", descriptor = "I")
    private int field3901;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
    public int field3888;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public int field3876;

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "I")
    private int field3895;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    private int field3875;

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "I")
    public int field3899;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
    private int field3880;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
    public int field3879;

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "Ldj;")
    private class200 field3886;

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "Ljava/lang/String;")
    public static String field3900 = "Allocating memory";

    @OriginalMember(owner = "client!sb", name = "db", descriptor = "[I")
    public static int[] field3911 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "D")
    private double field3882;

    @OriginalMember(owner = "client!sb", name = "L", descriptor = "D")
    private double field3894;

    @OriginalMember(owner = "client!sb", name = "O", descriptor = "D")
    public double field3897;

    @OriginalMember(owner = "client!sb", name = "U", descriptor = "D")
    public double field3902;

    @OriginalMember(owner = "client!sb", name = "V", descriptor = "D")
    private double field3903;

    @OriginalMember(owner = "client!sb", name = "bb", descriptor = "D")
    public double field3909;

    @OriginalMember(owner = "client!sb", name = "gb", descriptor = "D")
    private double field3914;

    @OriginalMember(owner = "client!sb", name = "kb", descriptor = "D")
    private double field3918;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "I")
    private int field3889;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!sb", name = "W", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!sb", name = "X", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!sb", name = "Y", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!sb", name = "cb", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!sb", name = "eb", descriptor = "I")
    public int field3912;

    @OriginalMember(owner = "client!sb", name = "ib", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!sb", name = "jb", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!sb", name = "P", descriptor = "Lfa;")
    public static class273 field3898;

    @OriginalMember(owner = "client!sb", name = "fb", descriptor = "Lgd;")
    private class77 field3913;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(IIIII)V")
    public final void method1710(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3910++;
        if (!this.field3915) {
            double var6 = (double) (arg3 - this.field3875);
            double var8 = (double) (arg1 - this.field3895);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field3902 = (double) this.field3901 * var6 / var10 + (double) this.field3875;
            this.field3909 = (double) this.field3901 * var8 / var10 + (double) this.field3895;
            this.field3897 = (double) this.field3878;
        }
        double var12 = (double) (this.field3908 + 1 - arg4);
        this.field3914 = ((double) arg1 - this.field3909) / var12;
        this.field3882 = ((double) arg3 - this.field3902) / var12;
        this.field3894 = Math.sqrt(this.field3914 * this.field3914 + this.field3882 * this.field3882);
        if (arg2 != 4290) {
            this.method1710(123, -20, 12, 56, -24);
        }
        if (this.field3880 == -1) {
            this.field3903 = ((double) arg0 - this.field3897) / var12;
        } else {
            if (!this.field3915) {
                this.field3903 = -this.field3894 * Math.tan((double) this.field3880 * 0.02454369D);
            }
            this.field3918 = ((double) arg0 - this.field3897 - (this.field3903 * var12)) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(IIIII)V")
    public final void method209(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3905++;
        if (!this.field3907) {
            class293 var6 = this.method1713(-6454);
            if (var6 == null) {
                return;
            }
            this.method1712(var6, -13274);
        }
        if (this.field3913 != null) {
            this.field3913.method516(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public static final void method1711(int arg0) {
        class109.field1671.method144(0);
        class219.field3502.method144(0);
        if (arg0 != 2047) {
            field3898 = null;
        }
        field3896++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lrk;I)V")
    private final void method1712(class293 arg0, int arg1) {
        field3883++;
        class191 var3 = (class191) arg0;
        if ((this.field3913 == null || this.field3913.field1207) && (var3.field2976 != null || var3.field2946 != null)) {
            this.field3913 = new class77(class4.field32, 1, 1);
        }
        if (arg1 != -13274) {
            method1715((String) null, false, (byte) -34);
        }
        if (this.field3913 != null) {
            this.field3913.method519(var3.field2976, var3.field2946, false, var3.field2944, var3.field2965, var3.field2973);
        }
        this.field3907 = true;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)Lrk;")
    private final class293 method1713(int arg0) {
        if (arg0 != -6454) {
            method1720(126, -45, 97, 44);
        }
        class119 var2 = class278.method1939(this.field3893, (byte) -125);
        field3877++;
        class293 var3 = var2.method774((byte) 71, this.field3891, this.field3919, this.field3887);
        if (var3 == null) {
            return null;
        } else {
            var3.method1304(this.field3889);
            return var3;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method1714(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (arg7 != 87) {
            return;
        }
        field3881++;
        if (arg2 < 1 || arg6 < 1 || arg2 > 102 || arg6 > 102) {
            return;
        }
        if (!class165.method1108(0) && (class128.field1972[0][arg2][arg6] & 0x2) == 0) {
            int var8 = arg0;
            if ((class128.field1972[arg0][arg2][arg6] & 0x8) != 0) {
                var8 = 0;
            }
            if (class102.field1537 != var8) {
                return;
            }
        }
        int var9 = arg0;
        if (arg0 < 3 && (class128.field1972[1][arg2][arg6] & 0x2) == 2) {
            var9 = arg0 + 1;
        }
        class15.method101(var9, arg0, class183.field2841[arg0], arg1, 122, arg2, arg6);
        if (arg3 < 0) {
            return;
        }
        boolean var10 = class123.field1878;
        class123.field1878 = true;
        class51.method309(arg3, class183.field2841[arg0], arg6, 27371, arg2, arg5, arg4, arg0, false, false, var9);
        class123.field1878 = var10;
        return;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
    public static final void method1715(String arg0, boolean arg1, byte arg2) {
        field3906++;
        if (arg0 == null) {
            return;
        }
        if (class20.field270 >= 100) {
            class286.method2013((byte) -94, class35.field444);
            return;
        }
        String var3 = class304.method2088(arg0, 2);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class20.field270; var4++) {
            String var8 = class304.method2088(class143.field2257[var4], 2);
            if (var8 != null && var8.equals(var3)) {
                class286.method2013((byte) -97, arg0 + class232.field3706);
                return;
            }
            if (class296.field4876[var4] != null) {
                String var9 = class304.method2088(class296.field4876[var4], 2);
                if (var9 != null && var9.equals(var3)) {
                    class286.method2013((byte) -99, arg0 + class232.field3706);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class140.field2164; var5++) {
            String var6 = class304.method2088(class120.field1848[var5], 2);
            if (var6 != null && var6.equals(var3)) {
                class286.method2013((byte) -107, class82.field1305 + arg0 + class160.field2530);
                return;
            }
            if (class241.field3808[var5] != null) {
                String var7 = class304.method2088(class241.field3808[var5], 2);
                if (var7 != null && var7.equals(var3)) {
                    class286.method2013((byte) -92, class82.field1305 + arg0 + class160.field2530);
                    return;
                }
            }
        }
        if (class304.method2088(class309.field5006.field3329, 2).equals(var3)) {
            class286.method2013((byte) -106, class159.field2516);
            return;
        }
        class276.field4572.method1391(0, 68);
        class67.field980++;
        class276.field4572.method1446((byte) 116, class187.method1270((byte) -48, arg0) + 1);
        class276.field4572.method1409(arg0, (byte) 77);
        if (arg2 >= 58) {
            class276.field4572.method1446((byte) 83, arg1 ? 1 : 0);
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(III)Z")
    public static final boolean method1716(int arg0, int arg1, int arg2) {
        field3917++;
        if (!class220.field3525) {
            return false;
        }
        int var3 = arg0 & 0xFFFF;
        int var4 = arg0 >> 16;
        if (arg2 < 8) {
            field3911 = null;
        }
        if (class283.field4741[var4] == null || class283.field4741[var4][var3] == null) {
            return false;
        }
        class254 var5 = class283.field4741[var4][var3];
        if (arg1 == -1 && var5.field4052 == 0) {
            for (int var6 = 0; var6 < class18.field251; var6++) {
                if (class70.field1016[var6] == 24 || class70.field1016[var6] == 1011 || class70.field1016[var6] == 42 || class70.field1016[var6] == 36 || class70.field1016[var6] == 20) {
                    for (class254 var7 = class80.method534(124, class175.field2739[var6]); var7 != null; var7 = class76.method497(var7, (byte) 60)) {
                        if (var5.field4077 == var7.field4077) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < class18.field251; var8++) {
                if (class283.field4737[var8] == arg1 && class175.field2739[var8] == var5.field4077 && (class70.field1016[var8] == 24 || class70.field1016[var8] == 1011 || class70.field1016[var8] == 42 || class70.field1016[var8] == 36 || class70.field1016[var8] == 20)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(IB)V")
    public final void method1717(int arg0, byte arg1) {
        this.field3915 = true;
        this.field3909 += (double) arg0 * this.field3914;
        this.field3902 += (double) arg0 * this.field3882;
        if (this.field3880 == -1) {
            this.field3897 += (double) arg0 * this.field3903;
        } else {
            this.field3897 += this.field3918 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field3903;
            this.field3903 += (double) arg0 * this.field3918;
        }
        int var3 = -18 % ((-arg1 - 1) / 42);
        this.field3912 = (int) (Math.atan2(this.field3882, this.field3914) * 325.949D) + 1024 & 0x7FF;
        field3904++;
        this.field3889 = (int) (Math.atan2(this.field3903, this.field3894) * 325.949D) & 0x7FF;
        if (this.field3886 == null) {
            return;
        }
        this.field3919 += arg0;
        while (true) {
            do {
                do {
                    if (this.field3919 <= this.field3886.field3168[this.field3887]) {
                        return;
                    }
                    this.field3919 -= this.field3886.field3168[this.field3887];
                    this.field3887++;
                    if (this.field3887 >= this.field3886.field3167.length) {
                        this.field3887 -= this.field3886.field3191;
                        if (this.field3887 < 0 || this.field3887 >= this.field3886.field3167.length) {
                            this.field3887 = 0;
                        }
                    }
                    this.field3891 = this.field3887 + 1;
                } while (this.field3886.field3167.length > this.field3891);
                this.field3891 -= this.field3886.field3191;
            } while (this.field3891 >= 0 && this.field3886.field3167.length > this.field3891);
            this.field3891 = -1;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIIIIJILgd;)V")
    public final void method205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class77 arg10) {
        field3890++;
        class293 var13 = this.method1713(-6454);
        if (var13 != null) {
            this.method1712(var13, -13274);
            var13.method205(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3913);
            this.field3892 = var13.method206();
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
    public static void method1718(boolean arg0) {
        field3911 = null;
        field3900 = null;
        if (!arg0) {
            method1716(87, -8, 51);
        }
        field3898 = null;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "()I")
    public final int method206() {
        field3885++;
        return this.field3892;
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)V")
    public static final void method1719(int arg0) {
        int var1 = 96 / ((arg0 - 56) / 63);
        field3884++;
        class192.field3042.method1390((byte) -6);
        int var2 = class192.field3042.method1394((byte) 77, 1);
        if (var2 == 0) {
            return;
        }
        int var3 = class192.field3042.method1394((byte) 97, 2);
        if (var3 == 0) {
            class208.field3323[class70.field1018++] = 2047;
        } else if (var3 == 1) {
            int var4 = class192.field3042.method1394((byte) 100, 3);
            class309.field5006.method351(var4, -1834, 1);
            int var5 = class192.field3042.method1394((byte) 96, 1);
            if (var5 == 1) {
                class208.field3323[class70.field1018++] = 2047;
            }
        } else if (var3 == 2) {
            if (class192.field3042.method1394((byte) 123, 1) == 1) {
                int var6 = class192.field3042.method1394((byte) 102, 3);
                class309.field5006.method351(var6, -1834, 2);
                int var7 = class192.field3042.method1394((byte) 116, 3);
                class309.field5006.method351(var7, -1834, 2);
            } else {
                int var8 = class192.field3042.method1394((byte) 80, 3);
                class309.field5006.method351(var8, -1834, 0);
            }
            int var9 = class192.field3042.method1394((byte) 110, 1);
            if (var9 == 1) {
                class208.field3323[class70.field1018++] = 2047;
            }
        } else if (var3 == 3) {
            class165.field2600 = class192.field3042.method1394((byte) 101, 2);
            int var10 = class192.field3042.method1394((byte) 117, 7);
            int var11 = class192.field3042.method1394((byte) 96, 1);
            if (var11 == 1) {
                class208.field3323[class70.field1018++] = 2047;
            }
            int var12 = class192.field3042.method1394((byte) 94, 7);
            int var13 = class192.field3042.method1394((byte) 73, 1);
            class309.field5006.method1480(var12, var13 == 1, false, var10);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII)I")
    public static final int method1720(int arg0, int arg1, int arg2, int arg3) {
        field3916++;
        if (arg1 > -35) {
            method1719(-1);
        }
        if (arg2 < arg0) {
            return arg0;
        } else if (arg3 < arg2) {
            return arg3;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class245(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field3908 = arg6;
        this.field3893 = arg0;
        this.field3878 = arg4;
        this.field3901 = arg8;
        this.field3888 = arg5;
        this.field3876 = arg9;
        this.field3895 = arg3;
        this.field3875 = arg2;
        this.field3899 = arg1;
        this.field3880 = arg7;
        this.field3915 = false;
        this.field3879 = arg10;
        int var12 = class278.method1939(this.field3893, (byte) -106).field1810;
        if (var12 == -1) {
            this.field3886 = null;
        } else {
            this.field3886 = class196.method1359(var12, (byte) 21);
        }
    }
}
