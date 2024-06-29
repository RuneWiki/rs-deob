import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class392 extends class371 {

    @OriginalMember(owner = "client!ug", name = "K", descriptor = "Z")
    public boolean field5924 = false;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "Z")
    private boolean field5901 = false;

    @OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
    private int field5928 = 0;

    @OriginalMember(owner = "client!ug", name = "P", descriptor = "Lu;")
    public class52 field5929;

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "J")
    private long field5913;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "Lce;")
    public class201 field5900;

    @OriginalMember(owner = "client!ug", name = "T", descriptor = "Lkb;")
    public class485 field5933;

    @OriginalMember(owner = "client!ug", name = "R", descriptor = "Lst;")
    public class296 field5931;

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
    public static int field5916 = 1403;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field5898 = new String[100];

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    private int field5899;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    private int field5902;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    private int field5904;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    private int field5905;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
    private int field5906;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
    public int field5907;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    private int field5908;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    private int field5909;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    private int field5910;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "I")
    private int field5911;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "I")
    public int field5914;

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
    public static int field5915;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "I")
    private int field5919;

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "I")
    private int field5921;

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
    private int field5922;

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "I")
    private int field5923;

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
    private int field5925;

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "I")
    private int field5926;

    @OriginalMember(owner = "client!ug", name = "N", descriptor = "I")
    public int field5927;

    @OriginalMember(owner = "client!ug", name = "Q", descriptor = "I")
    private int field5930;

    @OriginalMember(owner = "client!ug", name = "S", descriptor = "I")
    public int field5932;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "[Lf;")
    public static class529[] field5903;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(JI)V")
    public final void method2382(long arg0, int arg1) {
        field5917++;
        for (class55 var4 = (class55) this.field5931.method1873((byte) -128); var4 != null; var4 = (class55) this.field5931.method1880(-61)) {
            var4.method337(arg0);
        }
        if (arg1 != 32767) {
            this.method2386(true);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ltd;[[BB)V")
    public static final void method2383(class314 arg0, byte[][] arg1, byte arg2) {
        if (arg2 >= -59) {
            method2384(false);
        }
        field5918++;
        int var3 = class234.field3482.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg1[var4];
            if (var5 != null) {
                int var6 = (class331.field4689[var4] >> 8) * 64 - class68.field1038;
                int var7 = (class331.field4689[var4] & 0xFF) * 64 - class24.field259;
                class110.method675(19315);
                arg0.method1957(var5, class348.field5015, var6, var7, class434.field6500, (byte) 113);
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V")
    public static void method2384(boolean arg0) {
        field5898 = null;
        field5903 = null;
        if (!arg0) {
            method2383(null, null, (byte) 74);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IJZLqa;B)V")
    public final void method2385(int arg0, long arg1, boolean arg2, class162 arg3, byte arg4) {
        if (this.field5924) {
            arg2 = false;
        } else if (this.field5933.field7140 > class142.field2119) {
            arg2 = false;
        } else if (class473.field6969 > class101.field1466[class142.field2119]) {
            arg2 = false;
        } else if (this.field5901) {
            arg2 = false;
        } else if (this.field5933.field7148 != -1) {
            int var7 = (int) (arg1 - this.field5913);
            if (this.field5933.field7179 || this.field5933.field7148 >= var7) {
                var7 %= this.field5933.field7148;
            } else {
                arg2 = false;
            }
            if (!this.field5933.field7135 && var7 < this.field5933.field7107) {
                arg2 = false;
            }
            if (this.field5933.field7135 && this.field5933.field7107 <= var7) {
                arg2 = false;
            }
        }
        field5920++;
        if (arg2) {
            this.field5928 += (int) ((double) arg0 * ((double) (this.field5933.field7137 - this.field5933.field7109) * Math.random() + (double) this.field5933.field7109));
            if (this.field5928 > 63) {
                int var8 = this.field5928 >> 6;
                this.field5928 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field5933.field7136 <= 0 && this.field5933.field7110 <= 0) {
                        var10 = this.field5904;
                        var11 = this.field5905;
                        var12 = this.field5923;
                    } else {
                        int var13 = this.field5906 + (int) (Math.random() * (double) this.field5910);
                        int var14 = var13 & 0x3FFF;
                        int var15 = class457.field6760[var14];
                        int var16 = class457.field6759[var14];
                        int var17 = (int) ((double) this.field5921 * Math.random()) + this.field5922;
                        int var18 = var17 & 0x1FFF;
                        int var19 = class457.field6760[var18];
                        int var20 = class457.field6759[var18];
                        byte var21 = 15;
                        var10 = (var20 << 0) * -1;
                        var11 = var16 * var19 >> var21;
                        var12 = var15 * var19 >> var21;
                    }
                    int var22 = (int) (Math.random() * 65535.0D);
                    int var23 = (int) (Math.random() * 65535.0D);
                    if ((var22 + var23) > 65535) {
                        var23 = 65535 - var23;
                        var22 = 65535 - var22;
                    }
                    int var24 = 65535 - var22 - var23;
                    int var25 = this.field5930 * var22 + this.field5909 * var24 + (this.field5899 * var23) >> 16;
                    int var26 = this.field5925 * var23 + (this.field5919 * var22 + (this.field5902 * var24)) >> 16;
                    int var27 = this.field5911 * var22 - (-(this.field5926 * var24) - (this.field5908 * var23)) >> 16;
                    int var28 = this.field5933.field7171 + (int) ((double) (this.field5933.field7147 - this.field5933.field7171) * Math.random());
                    int var29 = (int) ((double) (this.field5933.field7159 - this.field5933.field7131) * Math.random()) + this.field5933.field7131;
                    int var30 = (int) (Math.random() * (double) (this.field5933.field7111 - this.field5933.field7150)) + this.field5933.field7150;
                    int var31;
                    if (this.field5933.field7151) {
                        double var32 = Math.random();
                        var31 = (int) (Math.random() * (double) this.field5933.field7126 + (double) this.field5933.field7134) << 24 | (int) ((double) this.field5933.field7176 * var32 + (double) this.field5933.field7154) << 16 | (int) ((double) this.field5933.field7127 * var32 + (double) this.field5933.field7163) << 8 | (int) ((double) this.field5933.field7155 * var32 + (double) this.field5933.field7146);
                    } else {
                        var31 = (int) (Math.random() * (double) this.field5933.field7155 + (double) this.field5933.field7146) | (int) (Math.random() * (double) this.field5933.field7176 + (double) this.field5933.field7154) << 16 | (int) ((double) this.field5933.field7163 + Math.random() * (double) this.field5933.field7127) << 8 | (int) ((double) this.field5933.field7134 + Math.random() * (double) this.field5933.field7126) << 24;
                    }
                    int var34 = this.field5933.field7139;
                    if (!arg3.method1121() && !this.field5933.field7130) {
                        var34 = -1;
                    }
                    if (class476.field6999 == class20.field226) {
                        new class55(this, var25, var26, var27, var11, var10, var12, var28, var29, var31, var30, var34, this.field5933.field7117, this.field5933.field7145);
                    } else {
                        class55 var35 = class70.field1063[class20.field226];
                        class20.field226 = class20.field226 + 1 & 0x3FF;
                        var35.method334(this, var25, var26, var27, var11, var10, var12, var28, var29, var31, var30, var34, this.field5933.field7117, this.field5933.field7145);
                    }
                }
            }
        }
        this.field5914 = 0;
        for (class55 var37 = (class55) this.field5931.method1873((byte) 82); var37 != null; var37 = (class55) this.field5931.method1880(-61)) {
            var37.method336(arg1, arg0);
            this.field5914++;
        }
        int var38 = 37 % ((arg4 + 54) / 50);
        class204.field2945 += this.field5914;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(Z)V")
    public final void method2386(boolean arg0) {
        this.field5919 = this.field5929.field809;
        field5912++;
        this.field5930 = this.field5929.field813;
        this.field5902 = this.field5929.field830;
        this.field5899 = this.field5929.field812;
        this.field5908 = this.field5929.field828;
        this.field5911 = this.field5929.field818;
        this.field5926 = this.field5929.field816;
        this.field5925 = this.field5929.field827;
        this.field5909 = this.field5929.field826;
        if (this.field5930 == this.field5899 && this.field5909 == this.field5899 && this.field5925 == this.field5919 && this.field5925 == this.field5902 && this.field5911 == this.field5908 && this.field5926 == this.field5908) {
            this.field5901 = true;
            return;
        }
        this.field5901 = false;
        if (!arg0) {
            method2383(null, null, (byte) 22);
        }
        int var2 = (this.field5909 + this.field5899 + this.field5930) / 3;
        int var3 = (this.field5919 + this.field5902 + this.field5925) / 3;
        int var4 = (this.field5911 + this.field5908 + this.field5926) / 3;
        if (this.field5907 == var2 && this.field5932 == var3 && this.field5927 == var4) {
            return;
        }
        this.field5932 = var3;
        this.field5907 = var2;
        this.field5927 = var4;
        int var5 = this.field5899 - this.field5930;
        int var6 = this.field5925 - this.field5919;
        int var7 = this.field5908 - this.field5911;
        int var8 = this.field5909 - this.field5930;
        int var9 = this.field5902 - this.field5919;
        int var10 = this.field5926 - this.field5911;
        this.field5905 = var6 * var10 - (var7 * var9);
        this.field5923 = var5 * var9 - (var6 * var8);
        this.field5904 = var7 * var8 - var5 * var10;
        while (this.field5905 > 32767 || this.field5904 > 32767 || this.field5923 > 32767 || this.field5905 < -32767 || this.field5904 < -32767 || this.field5923 < -32767) {
            this.field5904 >>= 0x1;
            this.field5905 >>= 0x1;
            this.field5923 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field5905 * this.field5905 + this.field5904 * this.field5904 + (this.field5923 * this.field5923)));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field5904 = this.field5904 * 32767 / var11;
        this.field5923 = this.field5923 * 32767 / var11;
        this.field5905 = this.field5905 * 32767 / var11;
        if (this.field5933.field7136 <= 0 && this.field5933.field7110 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field5923, (double) this.field5905) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field5904, Math.sqrt((double) (this.field5923 * this.field5923 + this.field5905 * this.field5905))) * 2607.5945876176133D);
        this.field5910 = this.field5933.field7136 - this.field5933.field7115;
        this.field5921 = this.field5933.field7110 - this.field5933.field7122;
        this.field5906 = this.field5933.field7115 + var12 - (this.field5910 >> 1);
        this.field5922 = this.field5933.field7122 + var13 - (this.field5921 >> 1);
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lqa;Lu;Lce;J)V")
    public class392(class162 arg0, class52 arg1, class201 arg2, long arg3) {
        this.field5929 = arg1;
        this.field5913 = arg3;
        this.field5900 = arg2;
        this.field5933 = this.field5929.method322(19332);
        if (!arg0.method1121() && this.field5933.field7165 != -1) {
            this.field5933 = class301.method1899(55, this.field5933.field7165);
        }
        this.field5931 = new class296();
        this.field5928 = (int) ((double) this.field5928 + Math.random() * 64.0D);
        this.method2386(true);
    }
}
