import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class347 extends class435 {

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
    private int field4891 = 0;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "Z")
    public boolean field4886 = false;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "Z")
    private boolean field4888 = false;

    @OriginalMember(owner = "client!lm", name = "K", descriptor = "Lbl;")
    public class54 field4904;

    @OriginalMember(owner = "client!lm", name = "H", descriptor = "J")
    private long field4901;

    @OriginalMember(owner = "client!lm", name = "W", descriptor = "Loo;")
    public class383 field4916;

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "Lpn;")
    public class66 field4898;

    @OriginalMember(owner = "client!lm", name = "I", descriptor = "Ljl;")
    public class391 field4902;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    private int field4883;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
    private int field4884;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    public int field4885;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
    private int field4889;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    private int field4890;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    public int field4892;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
    private int field4893;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
    private int field4894;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
    public int field4895;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!lm", name = "F", descriptor = "I")
    private int field4899;

    @OriginalMember(owner = "client!lm", name = "G", descriptor = "I")
    private int field4900;

    @OriginalMember(owner = "client!lm", name = "J", descriptor = "I")
    private int field4903;

    @OriginalMember(owner = "client!lm", name = "L", descriptor = "I")
    private int field4905;

    @OriginalMember(owner = "client!lm", name = "N", descriptor = "I")
    private int field4907;

    @OriginalMember(owner = "client!lm", name = "O", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!lm", name = "P", descriptor = "I")
    private int field4909;

    @OriginalMember(owner = "client!lm", name = "R", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!lm", name = "S", descriptor = "I")
    private int field4912;

    @OriginalMember(owner = "client!lm", name = "T", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!lm", name = "U", descriptor = "I")
    private int field4914;

    @OriginalMember(owner = "client!lm", name = "V", descriptor = "I")
    private int field4915;

    @OriginalMember(owner = "client!lm", name = "X", descriptor = "I")
    private int field4917;

    @OriginalMember(owner = "client!lm", name = "Y", descriptor = "I")
    public int field4918;

    @OriginalMember(owner = "client!lm", name = "Q", descriptor = "Ldp;")
    public static class174 field4910;

    @OriginalMember(owner = "client!lm", name = "M", descriptor = "[[B")
    public static byte[][] field4906;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V", line = 16)
    public static final void method2233(int arg0) {
        if (arg0 != -8835) {
            method2239(-45, 60, 70, 32, 124, (byte) -22, -66, -23, -12, -8);
        }
        field4908++;
        int var1 = 0;
        for (int var2 = 0; var2 < class183.field2703; var2++) {
            for (int var3 = 0; var3 < class66.field1056; var3++) {
                if (class152.method1168(var2, var3, class443.field6447, true, var1, (byte) -51)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lja;Loo;Lbl;J)V", line = 397)
    public class347(class90 arg0, class383 arg1, class54 arg2, long arg3) {
        this.field4904 = arg2;
        this.field4901 = arg3;
        this.field4916 = arg1;
        this.field4898 = class258.method1857(this.field4916.field5476, (byte) -126);
        if (!arg0.method760() && this.field4898.field1073 != -1) {
            this.field4898 = class258.method1857(this.field4898.field1073, (byte) -126);
        }
        this.field4902 = new class391();
        this.field4891 = (int) ((double) this.field4891 + Math.random() * 64.0D);
        this.method2237((byte) 71);
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)V", line = 56)
    public static void method2234(int arg0) {
        field4910 = null;
        field4906 = null;
        if (arg0 != -24556) {
            field4906 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)V", line = 72)
    public static final void method2235(int arg0, int arg1) {
        class18 var2 = class105.field1744;
        synchronized (class105.field1744) {
            class105.field1744.method104(arg0, (byte) -34);
        }
        field4913++;
        class18 var3 = class398.field5858;
        synchronized (class398.field5858) {
            class398.field5858.method104(arg0, (byte) -34);
        }
        if (arg1 != -1) {
            field4911 = 42;
        }
        class18 var4 = class413.field5992;
        synchronized (class413.field5992) {
            class413.field5992.method104(arg0, (byte) -34);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIJLja;Z)V", line = 100)
    public final void method2236(int arg0, int arg1, long arg2, class90 arg3, boolean arg4) {
        field4897++;
        if (this.field4886) {
            arg4 = false;
        } else if (class102.field1572 < this.field4898.field1109) {
            arg4 = false;
        } else if (class230.field3367[class102.field1572] < class351.field4983) {
            arg4 = false;
        } else if (this.field4888) {
            arg4 = false;
        } else if (this.field4898.field1064 != -1) {
            int var7 = (int) (arg2 - this.field4901);
            if (this.field4898.field1103 || this.field4898.field1064 >= var7) {
                var7 %= this.field4898.field1064;
            } else {
                arg4 = false;
            }
            if (!this.field4898.field1076 && var7 < this.field4898.field1045) {
                arg4 = false;
            }
            if (this.field4898.field1076 && this.field4898.field1045 <= var7) {
                arg4 = false;
            }
        }
        if (arg4) {
            this.field4891 += (int) ((double) arg0 * (Math.random() * (double) (this.field4898.field1089 - this.field4898.field1090) + (double) this.field4898.field1090));
            if (this.field4891 > 63) {
                int var8 = this.field4891 >> 6;
                this.field4891 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field4898.field1049 <= 0 && this.field4898.field1075 <= 0) {
                        var10 = this.field4889;
                        var11 = this.field4884;
                        var12 = this.field4914;
                    } else {
                        int var13 = (int) ((double) this.field4903 * Math.random()) + this.field4915;
                        int var14 = var13 & 0x3FFF;
                        int var15 = class56.field897[var14];
                        int var16 = class56.field898[var14];
                        int var17 = (int) ((double) this.field4909 * Math.random()) + this.field4893;
                        int var18 = var17 & 0x1FFF;
                        int var19 = class56.field897[var18];
                        int var20 = class56.field898[var18];
                        var11 = var16 * var19 >> 15;
                        var12 = var15 * var19 >> 15;
                        var10 = var20 * -1;
                    }
                    int var21 = (int) (Math.random() * 65535.0D);
                    int var22 = (int) (Math.random() * 65535.0D);
                    if (var21 + var22 > 65535) {
                        var22 = 65535 - var22;
                        var21 = 65535 - var21;
                    }
                    int var23 = -var21 - (var22 - 65535);
                    int var24 = this.field4899 * var21 + this.field4917 * var22 + this.field4890 * var23 >> 16;
                    int var25 = this.field4894 * var23 + (this.field4912 * var21 + (this.field4883 * var22)) >> 16;
                    int var26 = this.field4907 * var21 + (this.field4900 * var22) + (this.field4905 * var23) >> 16;
                    int var27 = (int) (Math.random() * (double) (this.field4898.field1051 - this.field4898.field1113)) + this.field4898.field1113;
                    int var28 = this.field4898.field1114 + (int) (Math.random() * (double) (this.field4898.field1111 - this.field4898.field1114));
                    int var29 = this.field4898.field1084 + ((int) ((double) (this.field4898.field1101 - this.field4898.field1084) * Math.random()));
                    int var32;
                    if (this.field4898.field1098) {
                        double var30 = Math.random();
                        var32 = (int) ((double) this.field4898.field1050 * var30 + (double) this.field4898.field1048) << 24 | (int) ((double) this.field4898.field1059 * var30 + (double) this.field4898.field1081) << 16 | (int) ((double) this.field4898.field1106 * var30 + (double) this.field4898.field1093) << 8 | (int) ((double) this.field4898.field1095 * var30 + (double) this.field4898.field1070);
                    } else {
                        var32 = (int) (Math.random() * (double) this.field4898.field1050 + (double) this.field4898.field1048) << 24 | (int) ((double) this.field4898.field1059 * Math.random() + (double) this.field4898.field1081) << 16 | (int) ((double) this.field4898.field1093 + (double) this.field4898.field1106 * Math.random()) << 8 | (int) ((double) this.field4898.field1070 + Math.random() * (double) this.field4898.field1095);
                    }
                    int var33 = this.field4898.field1061;
                    if (!arg3.method760() && !this.field4898.field1068) {
                        var33 = -1;
                    }
                    if (class207.field3036 == class185.field2723) {
                        new class251(this, var24, var25, var26, var11, var10, var12, var27, var28, var32, var29, var33, this.field4898.field1086);
                    } else {
                        class251 var34 = class196.field2867[class207.field3036];
                        class207.field3036 = class207.field3036 + 1 & 0x3FF;
                        var34.method1804(this, var24, var25, var26, var11, var10, var12, var27, var28, var32, var29, var33, this.field4898.field1086);
                    }
                }
            }
        }
        this.field4892 = 0;
        for (class251 var36 = (class251) this.field4902.method2496(86); var36 != null; var36 = (class251) this.field4902.method2487(0)) {
            var36.method1802(arg2, arg0);
            this.field4892++;
        }
        if (arg1 == -941343039) {
            class198.field2888 += this.field4892;
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V", line = 265)
    public final void method2237(byte arg0) {
        this.field4907 = this.field4916.field5494;
        this.field4917 = this.field4916.field5489;
        this.field4905 = this.field4916.field5487;
        this.field4890 = this.field4916.field5472;
        this.field4899 = this.field4916.field5478;
        int var2 = -38 / ((arg0 + 16) / 44);
        this.field4900 = this.field4916.field5474;
        field4882++;
        this.field4912 = this.field4916.field5479;
        this.field4894 = this.field4916.field5496;
        this.field4883 = this.field4916.field5477;
        if (this.field4917 == this.field4899 && this.field4917 == this.field4890 && this.field4912 == this.field4883 && this.field4894 == this.field4883 && this.field4907 == this.field4900 && this.field4905 == this.field4900) {
            this.field4888 = true;
            return;
        }
        this.field4888 = false;
        int var3 = (this.field4899 + this.field4890 + this.field4917) / 3;
        int var4 = (this.field4912 + this.field4894 + this.field4883) / 3;
        int var5 = (this.field4907 + this.field4900 + this.field4905) / 3;
        if (this.field4895 == var3 && this.field4918 == var4 && this.field4885 == var5) {
            return;
        }
        this.field4918 = var4;
        this.field4885 = var5;
        this.field4895 = var3;
        int var6 = this.field4917 - this.field4899;
        int var7 = this.field4883 - this.field4912;
        int var8 = this.field4900 - this.field4907;
        int var9 = this.field4890 - this.field4899;
        int var10 = this.field4894 - this.field4912;
        int var11 = this.field4905 - this.field4907;
        this.field4884 = var7 * var11 - (var8 * var10);
        this.field4889 = var8 * var9 - (var6 * var11);
        this.field4914 = var6 * var10 - (var7 * var9);
        while (this.field4884 > 32767 || this.field4889 > 32767 || this.field4914 > 32767 || this.field4884 < -32767 || this.field4889 < -32767 || this.field4914 < -32767) {
            this.field4884 >>= 0x1;
            this.field4914 >>= 0x1;
            this.field4889 >>= 0x1;
        }
        int var12 = (int) Math.sqrt((double) (this.field4914 * this.field4914 + this.field4884 * this.field4884 + (this.field4889 * this.field4889)));
        if (var12 <= 0) {
            var12 = 1;
        }
        this.field4884 = this.field4884 * 32767 / var12;
        this.field4889 = this.field4889 * 32767 / var12;
        this.field4914 = this.field4914 * 32767 / var12;
        if (this.field4898.field1049 <= 0 && this.field4898.field1075 <= 0) {
            return;
        }
        int var13 = (int) (Math.atan2((double) this.field4914, (double) this.field4884) * 2607.5945876176133D);
        int var14 = (int) (Math.atan2((double) this.field4889, Math.sqrt((double) (this.field4914 * this.field4914 + this.field4884 * this.field4884))) * 2607.5945876176133D);
        this.field4903 = this.field4898.field1049 - this.field4898.field1072;
        this.field4909 = this.field4898.field1075 - this.field4898.field1071;
        this.field4915 = var13 + this.field4898.field1072 - (this.field4903 >> 1);
        this.field4893 = var14 - ((this.field4909 >> 1) - this.field4898.field1071);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IJ)V", line = 348)
    public final void method2238(int arg0, long arg1) {
        field4896++;
        if (arg0 != 65535) {
            this.method2237((byte) -11);
        }
        for (class251 var4 = (class251) this.field4902.method2496(arg0 ^ 0xFF81); var4 != null; var4 = (class251) this.field4902.method2487(0)) {
            var4.method1806(arg1);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIIBIIII)V", line = 368)
    public static final void method2239(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        field4887++;
        if (arg5 != 13) {
            field4906 = null;
        }
        if (class185.field2727 <= arg1 && class278.field4184 >= arg1 && class185.field2727 <= arg9 && class278.field4184 >= arg9 && arg4 >= class185.field2727 && class278.field4184 >= arg4 && class185.field2727 <= arg3 && class278.field4184 >= arg3 && class308.field4507 <= arg7 && class383.field5497 >= arg7 && class308.field4507 <= arg0 && class383.field5497 >= arg0 && class308.field4507 <= arg8 && class383.field5497 >= arg8 && arg6 >= class308.field4507 && arg6 <= class383.field5497) {
            class365.method2330(arg2, arg6, arg3, arg4, (byte) 127, arg1, arg9, arg8, arg7, arg0);
        } else {
            class192.method1480(arg7, arg6, arg4, arg0, arg9, (byte) -3, arg1, arg8, arg3, arg2);
        }
    }
}
