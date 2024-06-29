import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class270 extends class170 {

    @OriginalMember(owner = "client!vi", name = "D", descriptor = "I")
    private int field4159 = 0;

    @OriginalMember(owner = "client!vi", name = "S", descriptor = "Z")
    public boolean field4174 = false;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "Z")
    public boolean field4153 = true;

    @OriginalMember(owner = "client!vi", name = "P", descriptor = "Lem;")
    public class273 field4171;

    @OriginalMember(owner = "client!vi", name = "X", descriptor = "Lwb;")
    public class287 field4179;

    @OriginalMember(owner = "client!vi", name = "ab", descriptor = "Lge;")
    public class233 field4182;

    @OriginalMember(owner = "client!vi", name = "R", descriptor = "J")
    private long field4173;

    @OriginalMember(owner = "client!vi", name = "K", descriptor = "Lso;")
    public class121 field4166;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    public static int field4150 = 0;

    @OriginalMember(owner = "client!vi", name = "M", descriptor = "I")
    public static int field4168 = 0;

    @OriginalMember(owner = "client!vi", name = "L", descriptor = "[F")
    public static float[] field4167 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
    public static int field4155 = -1;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    private int field4144;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
    private int field4146;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    private int field4147;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
    private int field4148;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
    public int field4149;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
    private int field4152;

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "I")
    private int field4154;

    @OriginalMember(owner = "client!vi", name = "A", descriptor = "I")
    public int field4156;

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "I")
    private int field4157;

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "I")
    private int field4158;

    @OriginalMember(owner = "client!vi", name = "E", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!vi", name = "F", descriptor = "I")
    private int field4161;

    @OriginalMember(owner = "client!vi", name = "H", descriptor = "I")
    public int field4163;

    @OriginalMember(owner = "client!vi", name = "I", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!vi", name = "J", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!vi", name = "N", descriptor = "I")
    private int field4169;

    @OriginalMember(owner = "client!vi", name = "O", descriptor = "I")
    private int field4170;

    @OriginalMember(owner = "client!vi", name = "Q", descriptor = "I")
    private int field4172;

    @OriginalMember(owner = "client!vi", name = "T", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!vi", name = "U", descriptor = "I")
    private int field4176;

    @OriginalMember(owner = "client!vi", name = "V", descriptor = "I")
    public int field4177;

    @OriginalMember(owner = "client!vi", name = "W", descriptor = "I")
    private int field4178;

    @OriginalMember(owner = "client!vi", name = "Y", descriptor = "I")
    private int field4180;

    @OriginalMember(owner = "client!vi", name = "Z", descriptor = "I")
    private int field4181;

    @OriginalMember(owner = "client!vi", name = "G", descriptor = "[S")
    public static short[] field4162;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V", line = 5)
    public static final void method1978(byte arg0) {
        field4165++;
        class4.field47.method655(-1);
        if (arg0 >= -24) {
            method1982(98, (class125[]) null);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BIIJZI)V", line = 20)
    public final void method1979(byte arg0, int arg1, int arg2, long arg3, boolean arg4, int arg5) {
        field4145++;
        if (this.field4174) {
            arg4 = false;
        } else if (class273.field4221 < this.field4166.field1884) {
            arg4 = false;
        } else if (class273.field4200 > class355.field5656[class273.field4221]) {
            arg4 = false;
        } else if (this.field4157 == this.field4146 && this.field4146 == this.field4144 && this.field4161 == this.field4148 && this.field4178 == this.field4148 && this.field4181 == this.field4169 && this.field4176 == this.field4169) {
            arg4 = false;
        } else if (this.field4166.field1922 != -1) {
            int var8 = (int) (arg3 - this.field4173);
            if (this.field4166.field1931 || var8 <= this.field4166.field1922) {
                var8 %= this.field4166.field1922;
            } else {
                arg4 = false;
            }
            if (!this.field4166.field1895 && this.field4166.field1918 > var8) {
                arg4 = false;
            }
            if (this.field4166.field1895 && var8 >= this.field4166.field1918) {
                arg4 = false;
            }
        }
        if (arg4) {
            this.field4159 += (int) ((double) arg1 * ((double) this.field4166.field1893 + (double) (this.field4166.field1880 - this.field4166.field1893) * Math.random()));
            if (this.field4159 > 63) {
                int var9 = this.field4159 >> 6;
                this.field4159 &= 0x3F;
                if (this.field4153) {
                    int var10 = this.field4148 - this.field4161;
                    int var11 = this.field4169 - this.field4181;
                    int var12 = this.field4146 - this.field4157;
                    int var13 = this.field4144 - this.field4157;
                    int var14 = this.field4178 - this.field4161;
                    this.field4172 = var12 * var14 - (var10 * var13);
                    int var15 = this.field4176 - this.field4181;
                    this.field4154 = var11 * var13 - (var12 * var15);
                    this.field4147 = var10 * var15 - (var11 * var14);
                    while (true) {
                        if (this.field4147 <= 32767 && this.field4154 <= 32767 && this.field4172 <= 32767 && this.field4147 >= -32767 && this.field4154 >= -32767 && this.field4172 >= -32767) {
                            int var16 = (int) Math.sqrt((double) (this.field4172 * this.field4172 + this.field4154 * this.field4154 + this.field4147 * this.field4147));
                            if (var16 <= 0) {
                                var16 = 1;
                            }
                            this.field4147 = this.field4147 * 32767 / var16;
                            this.field4172 = this.field4172 * 32767 / var16;
                            this.field4154 = this.field4154 * 32767 / var16;
                            if (this.field4166.field1879 > 0 || this.field4166.field1877 > 0) {
                                int var18 = (int) (Math.atan2((double) this.field4172, (double) this.field4147) * 2047.0D / 6.283185307179586D);
                                int var19 = (int) (Math.atan2((double) this.field4154, Math.sqrt((double) (this.field4172 * this.field4172 + this.field4147 * this.field4147))) * 2047.0D / 6.283185307179586D);
                                this.field4158 = this.field4166.field1879 - this.field4166.field1940;
                                this.field4180 = this.field4166.field1877 - this.field4166.field1927;
                                this.field4152 = this.field4166.field1927 + var19 - (this.field4180 / 2);
                                int var20 = var18 - this.field4171.field4233;
                                this.field4170 = var20 + this.field4166.field1940 - (this.field4158 / 2);
                            } else if (this.field4171.field4233 != 0) {
                                int var17 = this.field4172 * arg2 + (this.field4147 * arg5) >> 16;
                                this.field4172 = this.field4172 * arg5 - this.field4147 * arg2 >> 16;
                                this.field4147 = var17;
                            }
                            this.field4153 = false;
                            break;
                        }
                        this.field4172 >>= 0x1;
                        this.field4147 >>= 0x1;
                        this.field4154 >>= 0x1;
                    }
                }
                for (int var21 = 0; var21 < var9; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field4166.field1879 <= 0 && this.field4166.field1877 <= 0) {
                        var22 = this.field4147;
                        var23 = this.field4154;
                        var24 = this.field4172;
                    } else {
                        int var25 = this.field4170 + ((int) ((double) this.field4158 * Math.random()));
                        int var26 = var25 & 0x7FF;
                        int var27 = (int) (Math.random() * (double) this.field4180) + this.field4152;
                        int var28 = class107.field1605[var26] >> 1;
                        int var29 = var27 & 0x3FF;
                        int var30 = class107.field1605[var29] >> 1;
                        var23 = var30 * -1;
                        int var31 = class107.field1604[var29] >> 1;
                        var22 = var28 * var31 >> 15;
                        int var32 = class107.field1604[var26] >> 1;
                        var24 = var31 * var32 >> 15;
                    }
                    int var33 = (int) (Math.random() * 255.0D);
                    int var34 = (int) (Math.random() * 255.0D);
                    int var35 = (255 - var33) * var34 >> 8;
                    int var36 = 255 - var33 - var35;
                    int var37 = this.field4178 * var36 + this.field4161 * var33 + this.field4148 * var35 >> 8;
                    int var38 = this.field4181 * var33 + this.field4176 * var36 + this.field4169 * var35 >> 8;
                    int var39 = this.field4144 * var36 + (this.field4157 * var33 + (this.field4146 * var35)) >> 8;
                    if (this.field4171.field4233 != 0) {
                        int var40 = arg2 * var38 + arg5 * var39 >> 16;
                        var38 = arg5 * var38 - (arg2 * var39) >> 16;
                        var39 = var40;
                    }
                    int var41 = this.field4166.field1939 + (int) ((double) (this.field4166.field1934 - this.field4166.field1939) * Math.random());
                    int var42;
                    if (this.field4166.field1883) {
                        double var43 = Math.random();
                        var42 = (int) ((double) this.field4166.field1885 * var43 + (double) this.field4166.field1897) << 8 | (int) ((double) this.field4166.field1900 * var43 + (double) this.field4166.field1909) << 16 | (int) ((double) this.field4166.field1881 * var43 + (double) this.field4166.field1930) | (int) ((double) this.field4166.field1938 * var43 + (double) this.field4166.field1892) << 24;
                    } else {
                        var42 = (int) ((double) this.field4166.field1897 + (double) this.field4166.field1885 * Math.random()) << 8 | (int) ((double) this.field4166.field1909 + Math.random() * (double) this.field4166.field1900) << 16 | (int) ((double) this.field4166.field1881 * Math.random() + (double) this.field4166.field1930) | (int) ((double) this.field4166.field1892 + (double) this.field4166.field1938 * Math.random()) << 24;
                    }
                    int var45 = this.field4166.field1919 + ((int) ((double) (this.field4166.field1933 - this.field4166.field1919) * Math.random()));
                    if (class273.field4210 == class273.field4203) {
                        new class137(this, this.field4171.field4245 + var39, this.field4171.field4247 + var37, this.field4171.field4248 + var38, var22, var23, var24, var41, var45, var42);
                    } else {
                        class137 var47 = class273.field4213[class273.field4210];
                        class273.field4210 = class273.field4210 + 1 & 0x3FF;
                        var47.method1144(this, this.field4171.field4245 + var39, this.field4171.field4247 + var37, this.field4171.field4248 + var38, var22, var23, var24, var41, var45, var42);
                    }
                }
            }
        }
        this.field4149 = 0;
        for (class137 var48 = (class137) this.field4182.method1746((byte) -25); var48 != null; var48 = (class137) this.field4182.method1740((byte) -118)) {
            var48.method1146(arg3, arg1);
            this.field4149++;
        }
        class273.field4216 += this.field4149;
        int var49 = -36 % ((-arg0 - 56) / 60);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIIIIIII)V", line = 238)
    public final void method1980(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field4181 = arg8;
        this.field4157 = arg7;
        this.field4161 = arg9;
        this.field4148 = arg6;
        this.field4176 = arg4;
        if (arg2 != 1268) {
            this.method1980(52, 18, -95, 4, 71, 35, 20, -43, 126, -3);
        }
        this.field4146 = arg1;
        this.field4144 = arg0;
        this.field4178 = arg3;
        int var11 = (this.field4178 + this.field4161 + this.field4148) / 3 + this.field4171.field4247;
        field4151++;
        int var12 = (this.field4157 + this.field4144 + this.field4146) / 3 + this.field4171.field4245;
        this.field4169 = arg5;
        int var13 = (this.field4181 + this.field4169 + this.field4176) / 3 + this.field4171.field4248;
        if (this.field4163 != var12 || this.field4177 != var11 || this.field4156 != var13) {
            this.field4177 = var11;
            this.field4153 = true;
            this.field4156 = var13;
            this.field4163 = var12;
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(B)V", line = 272)
    public static void method1981(byte arg0) {
        if (arg0 == -102) {
            field4167 = null;
            field4162 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I[Lmi;)V", line = 283)
    public static final void method1982(int arg0, class125[] arg1) {
        class37.field557[arg0] = arg1;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([II)[I", line = 295)
    public static final int[] method1983(int[] arg0, int arg1) {
        field4160++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != -1) {
            method1983((int[]) null, 51);
        }
        int[] var2 = new int[arg0.length];
        class65.method641(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lwb;Lem;J)V", line = 395)
    public class270(class287 arg0, class273 arg1, long arg2) {
        this.field4171 = arg1;
        this.field4179 = arg0;
        this.field4182 = new class233();
        this.field4173 = arg2;
        this.field4166 = this.field4179.field4458;
        this.field4159 = (int) ((double) this.field4159 + Math.random() * 64.0D);
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V", line = 335)
    public static final void method1984(int arg0) {
        field4164++;
        if (arg0 != -3223) {
            method1981((byte) -49);
        }
        for (int var1 = 0; var1 < class6.field80; var1++) {
            int var2 = class126.field2114[var1];
            class244 var3 = class110.field1683[var2];
            if (var3 != null) {
                class353.method2488(var3.field3802.field2192, var3, 11776);
            }
        }
    }
}
