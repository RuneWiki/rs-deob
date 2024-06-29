import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class183 extends class35 {

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    private int field2883 = 0;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Lmo;")
    private class482 field2876 = new class482(16);

    @OriginalMember(owner = "client!o", name = "N", descriptor = "I")
    private int field2911 = 0;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "Lau;")
    private class692 field2910 = new class692();

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "J")
    private long field2914 = 0L;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "I")
    private int field2898;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "Lvm;")
    private class195 field2886;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "Z")
    private boolean field2912;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "Lau;")
    private class692 field2908;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "Ldga;")
    private class231 field2892;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    private int field2904;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "Lms;")
    private class44 field2897;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "Lvm;")
    private class195 field2875;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "Z")
    private boolean field2913;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "[B")
    private byte[] field2899;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    private int field2885;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "Lhv;")
    private class201 field2880;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "[I")
    public static int[] field2881 = new int[16];

    @OriginalMember(owner = "client!o", name = "h", descriptor = "Z")
    public static volatile boolean field2879 = false;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "Lpda;")
    public static class138 field2894;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "Lpq;")
    private class171 field2884;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "Lvo;")
    public static class345 field2905;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "Ltj;")
    public static class614 field2887;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "Z")
    private boolean field2909;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "[B")
    private byte[] field2878;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(II)V")
    public final void method306(int arg0, int arg1) {
        field2888++;
        if (arg0 > -9) {
            this.field2880 = null;
        }
        if (this.field2886 == null) {
            return;
        }
        for (class435 var3 = this.field2910.method3905(-109); var3 != null; var3 = this.field2910.method3899(0)) {
            if (((long) arg1) == var3.field6265) {
                return;
            }
        }
        class435 var4 = new class435();
        var4.field6265 = arg1;
        this.field2910.method3904(var4, 0);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(II)[B")
    public final byte[] method304(int arg0, int arg1) {
        if (arg1 <= 97) {
            return null;
        }
        field2889++;
        class201 var3 = this.method1313((byte) 16, 0, arg0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method1400(32);
            var3.method2549((byte) -44);
            return var4;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)I")
    public final int method1311(byte arg0) {
        field2903++;
        int var2 = -114 / ((9 - arg0) / 57);
        return this.field2884 == null ? 0 : this.field2884.field2771;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(II)Z")
    public static final boolean method1312(int arg0, int arg1) {
        if (arg0 == -5) {
            field2895++;
            return arg1 == 4 || arg1 == 8 || arg1 == 11;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)Lpq;")
    public final class171 method305(int arg0) {
        field2901++;
        if (this.field2884 != null) {
            return this.field2884;
        }
        if (arg0 >= -13) {
            method1314(-30);
        }
        if (this.field2880 == null) {
            if (this.field2892.method1525((byte) 33)) {
                return null;
            }
            this.field2880 = this.field2892.method1511(this.field2898, (byte) 0, 255, true, -756730288);
        }
        if (this.field2880.field3107) {
            return null;
        }
        byte[] var2 = this.field2880.method1400(32);
        if (this.field2880 instanceof class603) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2884 = new class171(var2, this.field2904, this.field2899);
                if (this.field2884.field2764 != this.field2885) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field2884 = null;
                if (this.field2892.method1525((byte) 19)) {
                    this.field2880 = null;
                } else {
                    this.field2880 = this.field2892.method1511(this.field2898, (byte) 0, 255, true, -756730288);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2884 = new class171(var2, this.field2904, this.field2899);
            } catch (RuntimeException var4) {
                this.field2892.method1516((byte) 15);
                this.field2884 = null;
                if (this.field2892.method1525((byte) 46)) {
                    this.field2880 = null;
                } else {
                    this.field2880 = this.field2892.method1511(this.field2898, (byte) 0, 255, true, -756730288);
                }
                return null;
            }
            if (this.field2875 != null) {
                this.field2897.method355(var2, 2, this.field2875, this.field2898);
            }
        }
        if (this.field2886 != null) {
            this.field2883 = 0;
            this.field2878 = new byte[this.field2884.field2759];
        }
        this.field2880 = null;
        return this.field2884;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BII)Lhv;")
    private final class201 method1313(byte arg0, int arg1, int arg2) {
        if (arg0 != 16) {
            return null;
        }
        field2906++;
        class201 var4 = (class201) this.field2876.method2818(-22803, (long) arg2);
        if (var4 != null && arg1 == 0 && !var4.field3100 && var4.field3107) {
            var4.method2549((byte) -76);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field2886 == null || this.field2878[arg2] == -1) {
                    if (this.field2892.method1525((byte) -93)) {
                        return null;
                    }
                    var4 = this.field2892.method1511(arg2, (byte) 2, this.field2898, true, -756730288);
                } else {
                    var4 = this.field2897.method356(20682, arg2, this.field2886);
                }
            } else if (arg1 == 1) {
                if (this.field2886 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field2897.method357(this.field2886, (byte) -50, arg2);
            } else if (arg1 == 2) {
                if (this.field2886 == null) {
                    throw new RuntimeException();
                }
                if (this.field2878[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field2892.method1517(false)) {
                    return null;
                }
                var4 = this.field2892.method1511(arg2, (byte) 2, this.field2898, false, -756730288);
            } else {
                throw new RuntimeException();
            }
            this.field2876.method2816(var4, (long) arg2, false);
        }
        if (var4.field3107) {
            return null;
        }
        byte[] var5 = var4.method1400(32);
        if (!(var4 instanceof class603)) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class435.field6257.reset();
                class435.field6257.update(var5, 0, var5.length - 2);
                int var6 = (int) class435.field6257.getValue();
                if (this.field2884.field2762[arg2] != var6) {
                    throw new RuntimeException();
                }
                if (this.field2884.field2769 != null && this.field2884.field2769[arg2] != null) {
                    byte[] var7 = this.field2884.field2769[arg2];
                    byte[] var8 = class77.method607(var5.length - 2, 51, var5, 0);
                    for (int var9 = 0; var9 < 64; var9++) {
                        if (var7[var9] != var8[var9]) {
                            throw new RuntimeException();
                        }
                    }
                }
                this.field2892.field3440 = 0;
                this.field2892.field3441 = 0;
            } catch (RuntimeException var17) {
                this.field2892.method1516((byte) 15);
                var4.method2549((byte) -68);
                if (var4.field3100 && !this.field2892.method1525((byte) 27)) {
                    class226 var10 = this.field2892.method1511(arg2, (byte) 2, this.field2898, true, arg0 - 756730304);
                    this.field2876.method2816(var10, (long) arg2, false);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field2884.field2774[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field2884.field2774[arg2];
            if (this.field2886 != null) {
                this.field2897.method355(var5, 2, this.field2886, arg2);
                if (this.field2878[arg2] != 1) {
                    this.field2883++;
                    this.field2878[arg2] = 1;
                }
            }
            if (!var4.field3100) {
                var4.method2549((byte) 32);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class435.field6257.reset();
            class435.field6257.update(var5, 0, var5.length - 2);
            int var11 = (int) class435.field6257.getValue();
            if (this.field2884.field2762[arg2] != var11) {
                throw new RuntimeException();
            }
            if (this.field2884.field2769 != null && this.field2884.field2769[arg2] != null) {
                byte[] var12 = this.field2884.field2769[arg2];
                byte[] var13 = class77.method607(var5.length - 2, arg0 ^ 0x21, var5, 0);
                for (int var14 = 0; var14 < 64; var14++) {
                    if (var12[var14] != var13[var14]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var15 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field2884.field2774[arg2] & 0xFFFF) != var15) {
                throw new RuntimeException();
            }
            if (this.field2878[arg2] != 1) {
                this.field2883++;
                this.field2878[arg2] = 1;
            }
            if (!var4.field3100) {
                var4.method2549((byte) -112);
            }
            return var4;
        } catch (Exception var18) {
            this.field2878[arg2] = -1;
            var4.method2549((byte) -49);
            if (var4.field3100 && !this.field2892.method1525((byte) 14)) {
                class226 var16 = this.field2892.method1511(arg2, (byte) 2, this.field2898, true, arg0 ^ 0xD2E53640);
                this.field2876.method2816(var16, (long) arg2, false);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
    public static void method1314(int arg0) {
        field2881 = null;
        field2894 = null;
        field2887 = null;
        if (arg0 <= 31) {
            method1312(84, 21);
        }
        field2905 = null;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)I")
    public final int method1315(int arg0) {
        if (arg0 >= -127) {
            this.method1313((byte) 109, -106, -98);
        }
        field2893++;
        return this.field2883;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
    public final void method1316(byte arg0) {
        field2907++;
        if (this.field2908 != null) {
            if (this.method305(-110) == null) {
                return;
            }
            if (this.field2912) {
                boolean var6 = true;
                for (class435 var7 = this.field2908.method3905(-124); var7 != null; var7 = this.field2908.method3899(0)) {
                    int var9 = (int) var7.field6265;
                    if (this.field2878[var9] == 0) {
                        this.method1313((byte) 16, 1, var9);
                    }
                    if (this.field2878[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method2549((byte) 119);
                    }
                }
                while (this.field2884.field2772.length > this.field2911) {
                    if (this.field2884.field2772[this.field2911] == 0) {
                        this.field2911++;
                    } else {
                        if (this.field2897.field600 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field2878[this.field2911] == 0) {
                            this.method1313((byte) 16, 1, this.field2911);
                        }
                        if (this.field2878[this.field2911] == 0) {
                            class435 var8 = new class435();
                            var8.field6265 = this.field2911;
                            var6 = false;
                            this.field2908.method3904(var8, 0);
                        }
                        this.field2911++;
                    }
                }
                if (var6) {
                    this.field2911 = 0;
                    this.field2912 = false;
                }
            } else if (this.field2909) {
                boolean var2 = true;
                for (class435 var3 = this.field2908.method3905(-105); var3 != null; var3 = this.field2908.method3899(0)) {
                    int var5 = (int) var3.field6265;
                    if (this.field2878[var5] != 1) {
                        this.method1313((byte) 16, 2, var5);
                    }
                    if (this.field2878[var5] == 1) {
                        var3.method2549((byte) 85);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field2884.field2772.length > this.field2911) {
                    if (this.field2884.field2772[this.field2911] == 0) {
                        this.field2911++;
                    } else {
                        if (this.field2892.method1517(false)) {
                            var2 = false;
                            break;
                        }
                        if (this.field2878[this.field2911] != 1) {
                            this.method1313((byte) 16, 2, this.field2911);
                        }
                        if (this.field2878[this.field2911] != 1) {
                            class435 var4 = new class435();
                            var4.field6265 = this.field2911;
                            var2 = false;
                            this.field2908.method3904(var4, 0);
                        }
                        this.field2911++;
                    }
                }
                if (var2) {
                    this.field2911 = 0;
                    this.field2909 = false;
                }
            } else {
                this.field2908 = null;
            }
        }
        if (arg0 >= -98) {
            field2887 = null;
        }
        if (!this.field2913 || this.field2914 > class254.method1619(true)) {
            return;
        }
        for (class201 var10 = (class201) this.field2876.method2815(0); var10 != null; var10 = (class201) this.field2876.method2814(4)) {
            if (!var10.field3107) {
                if (var10.field3103) {
                    if (!var10.field3100) {
                        throw new RuntimeException();
                    }
                    var10.method2549((byte) -78);
                } else {
                    var10.field3103 = true;
                }
            }
        }
        this.field2914 = class254.method1619(true) + 1000L;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V")
    public final void method1317(int arg0) {
        field2877++;
        if (this.field2908 == null || this.method305(-125) == null) {
            return;
        }
        for (class435 var2 = this.field2910.method3905(-112); var2 != null; var2 = this.field2910.method3899(0)) {
            int var3 = (int) var2.field6265;
            if (var3 < 0 || this.field2884.field2759 <= var3 || this.field2884.field2772[var3] == 0) {
                var2.method2549((byte) -70);
            } else {
                if (this.field2878[var3] == 0) {
                    this.method1313((byte) 16, 1, var3);
                }
                if (this.field2878[var3] == -1) {
                    this.method1313((byte) 16, 2, var3);
                }
                if (this.field2878[var3] == 1) {
                    var2.method2549((byte) -120);
                }
            }
        }
        if (arg0 != 0) {
            field2891 = 69;
        }
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(I)I")
    public final int method1318(int arg0) {
        field2890++;
        if (this.method305(-54) == null) {
            return this.field2880 == null ? 0 : this.field2880.method1402(100);
        } else if (arg0 == 19997) {
            return 100;
        } else {
            return -37;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)I")
    public final int method303(int arg0, int arg1) {
        field2902++;
        class201 var3 = (class201) this.field2876.method2818(-22803, (long) arg0);
        if (arg1 > -72) {
            this.method1316((byte) -22);
        }
        return var3 == null ? 0 : var3.method1402(100);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)I")
    public final int method1319(boolean arg0) {
        field2896++;
        if (this.field2884 == null) {
            return 0;
        } else if (!arg0) {
            return -13;
        } else if (this.field2912) {
            class435 var2 = this.field2908.method3905(-118);
            return var2 == null ? 0 : (int) var2.field6265;
        } else {
            return this.field2884.field2771;
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V")
    public final void method1320(byte arg0) {
        field2882++;
        if (this.field2886 == null) {
            return;
        }
        if (arg0 != -1) {
            this.method304(-107, 24);
        }
        this.field2909 = true;
        if (this.field2908 == null) {
            this.field2908 = new class692();
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(ILvm;Lvm;Ldga;Lms;I[BIZ)V")
    public class183(int arg0, class195 arg1, class195 arg2, class231 arg3, class44 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field2898 = arg0;
        this.field2886 = arg1;
        if (this.field2886 == null) {
            this.field2912 = false;
        } else {
            this.field2912 = true;
            this.field2908 = new class692();
        }
        this.field2892 = arg3;
        this.field2904 = arg5;
        this.field2897 = arg4;
        this.field2875 = arg2;
        this.field2913 = arg8;
        this.field2899 = arg6;
        this.field2885 = arg7;
        if (this.field2875 != null) {
            this.field2880 = this.field2897.method356(20682, this.field2898, this.field2875);
        }
    }
}
