import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class649 extends class546 {

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "Z")
    public boolean field8993 = false;

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "I")
    private int field8996 = 0;

    @OriginalMember(owner = "client!dq", name = "r", descriptor = "Llb;")
    public class503 field9001 = new class503();

    @OriginalMember(owner = "client!dq", name = "w", descriptor = "Llb;")
    private class503 field9006 = new class503();

    @OriginalMember(owner = "client!dq", name = "y", descriptor = "Z")
    private boolean field9008 = false;

    @OriginalMember(owner = "client!dq", name = "u", descriptor = "Lns;")
    public class369 field9004;

    @OriginalMember(owner = "client!dq", name = "t", descriptor = "J")
    private long field9003;

    @OriginalMember(owner = "client!dq", name = "q", descriptor = "Loa;")
    public class646 field9000;

    @OriginalMember(owner = "client!dq", name = "n", descriptor = "Ldf;")
    public class366 field8997;

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "Lkr;")
    public class693 field8995;

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "I")
    public static int field8992;

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "I")
    public static int field8994;

    @OriginalMember(owner = "client!dq", name = "o", descriptor = "I")
    public static int field8998;

    @OriginalMember(owner = "client!dq", name = "p", descriptor = "I")
    public int field8999;

    @OriginalMember(owner = "client!dq", name = "s", descriptor = "I")
    public static int field9002;

    @OriginalMember(owner = "client!dq", name = "v", descriptor = "I")
    public static int field9005;

    @OriginalMember(owner = "client!dq", name = "x", descriptor = "I")
    private int field9007;

    @OriginalMember(owner = "client!dq", name = "z", descriptor = "I")
    private int field9009;

    @OriginalMember(owner = "client!dq", name = "A", descriptor = "I")
    private int field9010;

    @OriginalMember(owner = "client!dq", name = "B", descriptor = "I")
    private int field9011;

    @OriginalMember(owner = "client!dq", name = "C", descriptor = "I")
    private int field9012;

    @OriginalMember(owner = "client!dq", name = "D", descriptor = "I")
    private int field9013;

    @OriginalMember(owner = "client!dq", name = "E", descriptor = "I")
    private int field9014;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(JILr;)V", line = 4)
    public final void method3656(long arg0, int arg1, class166 arg2) {
        for (class421 var5 = (class421) this.field8995.method3898((byte) -114); var5 != null; var5 = (class421) this.field8995.method3902(true)) {
            var5.method2440(arg2, arg0);
        }
        field8992++;
        if (arg1 != 4000) {
            this.field9014 = 44;
        }
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lr;Lns;Loa;J)V", line = 370)
    public class649(class166 arg0, class369 arg1, class646 arg2, long arg3) {
        this.field9004 = arg1;
        this.field9003 = arg3;
        this.field9000 = arg2;
        this.field8997 = this.field9004.method2131(32745);
        if (!arg0.method132() && this.field8997.field4887 != -1) {
            this.field8997 = class412.method2395((byte) -28, this.field8997.field4887);
        }
        this.field8995 = new class693();
        this.field8996 = (int) ((double) this.field8996 + Math.random() * 64.0D);
        this.method3658(true);
        this.field9006.field6901 = this.field9001.field6901;
        this.field9006.field6899 = this.field9001.field6899;
        this.field9006.field6910 = this.field9001.field6910;
        this.field9006.field6906 = this.field9001.field6906;
        this.field9006.field6902 = this.field9001.field6902;
        this.field9006.field6916 = this.field9001.field6916;
        this.field9006.field6914 = this.field9001.field6914;
        this.field9006.field6912 = this.field9001.field6912;
        this.field9006.field6909 = this.field9001.field6909;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILr;IZJ)V", line = 28)
    public final void method3657(int arg0, class166 arg1, int arg2, boolean arg3, long arg4) {
        if (this.field8993) {
            arg3 = false;
        } else if (class139.field1970 < this.field8997.field4886) {
            arg3 = false;
        } else if (class192.field2728 > class521.field7088[class139.field1970]) {
            arg3 = false;
        } else if (this.field9008) {
            arg3 = false;
        } else if (this.field8997.field4931 != -1) {
            int var7 = (int) (arg4 - this.field9003);
            if (this.field8997.field4873 || this.field8997.field4931 >= var7) {
                var7 %= this.field8997.field4931;
            } else {
                arg3 = false;
            }
            if (!this.field8997.field4927 && this.field8997.field4908 > var7) {
                arg3 = false;
            }
            if (this.field8997.field4927 && this.field8997.field4908 <= var7) {
                arg3 = false;
            }
        }
        field8998++;
        if (arg3) {
            class319.field4375++;
            int var8 = (this.field9001.field6902 + this.field9001.field6906 + this.field9001.field6916) / 3;
            int var9 = (this.field9001.field6912 + this.field9001.field6901 + this.field9001.field6899) / 3;
            int var10 = (this.field9001.field6910 + this.field9001.field6909 + this.field9001.field6914) / 3;
            if (this.field9001.field6904 != var8 || this.field9001.field6903 != var9 || this.field9001.field6905 != var10) {
                this.field9001.field6904 = var8;
                this.field9001.field6903 = var9;
                this.field9001.field6905 = var10;
                int var11 = this.field9001.field6906 - this.field9001.field6902;
                int var12 = this.field9001.field6899 - this.field9001.field6912;
                int var13 = this.field9001.field6910 - this.field9001.field6909;
                int var14 = this.field9001.field6916 - this.field9001.field6902;
                int var15 = this.field9001.field6901 - this.field9001.field6912;
                int var16 = this.field9001.field6914 - this.field9001.field6909;
                this.field9009 = var11 * var15 - (var12 * var14);
                this.field9011 = var12 * var16 - (var13 * var15);
                this.field9010 = var13 * var14 - (var11 * var16);
                while (true) {
                    if (this.field9011 <= 32767 && this.field9010 <= 32767 && this.field9009 <= 32767 && this.field9011 >= -32767 && this.field9010 >= -32767 && this.field9009 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field9011 * this.field9011 + (this.field9010 * this.field9010 + (this.field9009 * this.field9009))));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field9009 = this.field9009 * 32767 / var17;
                        this.field9011 = this.field9011 * 32767 / var17;
                        this.field9010 = this.field9010 * 32767 / var17;
                        if (this.field8997.field4888 > 0 || this.field8997.field4868 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field9009, (double) this.field9011) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field9010, Math.sqrt((double) (this.field9011 * this.field9011 + this.field9009 * this.field9009))) * 2607.5945876176133D);
                            this.field9012 = this.field8997.field4888 - this.field8997.field4877;
                            this.field9007 = var18 + this.field8997.field4877 - (this.field9012 >> 1);
                            this.field9014 = this.field8997.field4868 - this.field8997.field4933;
                            this.field9013 = this.field8997.field4933 + var19 - (this.field9014 >> 1);
                        }
                        break;
                    }
                    this.field9010 >>= 0x1;
                    this.field9009 >>= 0x1;
                    this.field9011 >>= 0x1;
                }
            }
            this.field8996 += (int) ((double) arg2 * ((double) (this.field8997.field4904 - this.field8997.field4863) * Math.random() + (double) this.field8997.field4863));
            if (this.field8996 > 63) {
                int var20 = this.field8996 >> 6;
                this.field8996 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field8997.field4888 <= 0 && this.field8997.field4868 <= 0) {
                        var22 = this.field9011;
                        var23 = this.field9009;
                        var24 = this.field9010;
                    } else {
                        int var25 = this.field9007 + (int) (Math.random() * (double) this.field9012);
                        int var26 = var25 & 0x3FFF;
                        int var27 = class597.field8342[var26];
                        int var28 = class597.field8344[var26];
                        int var29 = this.field9013 + (int) (Math.random() * (double) this.field9014);
                        int var30 = var29 & 0x1FFF;
                        int var31 = class597.field8342[var30];
                        int var32 = class597.field8344[var30];
                        byte var33 = 13;
                        var24 = (var32 << 1) * -1;
                        var22 = var28 * var31 >> var33;
                        var23 = var27 * var31 >> var33;
                    }
                    float var34 = (float) Math.random();
                    float var35 = (float) Math.random();
                    if (var34 + var35 > 1.0F) {
                        var34 = 1.0F - var34;
                        var35 = 1.0F - var35;
                    }
                    float var36 = 1.0F - (var34 + var35);
                    int var37 = (int) ((float) this.field9001.field6916 * var36 + (float) this.field9001.field6906 * var35 + (float) this.field9001.field6902 * var34);
                    int var38 = (int) ((float) this.field9001.field6901 * var36 + (float) this.field9001.field6912 * var34 + (float) this.field9001.field6899 * var35);
                    int var39 = (int) ((float) this.field9001.field6914 * var36 + (float) this.field9001.field6910 * var35 + (float) this.field9001.field6909 * var34);
                    int var40 = (int) ((float) this.field9006.field6916 * var36 + (float) this.field9006.field6906 * var35 + (float) this.field9006.field6902 * var34);
                    int var41 = (int) ((float) this.field9006.field6901 * var36 + (float) this.field9006.field6912 * var34 + (float) this.field9006.field6899 * var35);
                    int var42 = (int) ((float) this.field9006.field6914 * var36 + (float) this.field9006.field6910 * var35 + (float) this.field9006.field6909 * var34);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) ((double) var40 + Math.random() * (double) var43);
                    int var47 = (int) ((double) var44 * Math.random() + (double) var41);
                    int var48 = (int) ((double) var42 + Math.random() * (double) var45);
                    int var49 = (int) ((double) (this.field8997.field4883 - this.field8997.field4861) * Math.random()) + this.field8997.field4861;
                    int var50 = (int) (Math.random() * (double) (this.field8997.field4885 - this.field8997.field4880)) + this.field8997.field4880;
                    int var51 = this.field8997.field4897 + (int) ((double) (this.field8997.field4909 - this.field8997.field4897) * Math.random());
                    int var52;
                    if (this.field8997.field4925) {
                        double var53 = Math.random();
                        var52 = (int) ((double) this.field8997.field4884 * var53 + (double) this.field8997.field4902) | (int) ((double) this.field8997.field4890 * var53 + (double) this.field8997.field4907) << 16 | (int) ((double) this.field8997.field4874 * var53 + (double) this.field8997.field4918) << 8 | (int) ((double) this.field8997.field4896 * Math.random() + (double) this.field8997.field4878) << 24;
                    } else {
                        var52 = (int) ((double) this.field8997.field4884 * Math.random() + (double) this.field8997.field4902) | (int) (Math.random() * (double) this.field8997.field4874 + (double) this.field8997.field4918) << 8 | (int) ((double) this.field8997.field4907 + (double) this.field8997.field4890 * Math.random()) << 16 | (int) ((double) this.field8997.field4896 * Math.random() + (double) this.field8997.field4878) << 24;
                    }
                    int var55 = this.field8997.field4892;
                    if (!arg1.method132() && !this.field8997.field4867) {
                        var55 = -1;
                    }
                    if (class90.field1293 == class705.field9968) {
                        new class421(this, var46, var47, var48, var22, var24, var23, var49, var50, var52, var51, var55, this.field8997.field4879, this.field8997.field4919);
                    } else {
                        class421 var56 = class39.field458[class90.field1293];
                        class90.field1293 = class90.field1293 + 1 & 0x3FF;
                        var56.method2439(this, var46, var47, var48, var22, var24, var23, var49, var50, var52, var51, var55, this.field8997.field4879, this.field8997.field4919);
                    }
                }
            }
        }
        if (!this.field9001.method2884(false, this.field9006)) {
            class503 var58 = this.field9006;
            this.field9006 = this.field9001;
            this.field9001 = var58;
            this.field9001.field6916 = this.field9004.field4977;
            this.field9001.field6910 = this.field9004.field4979;
            this.field9001.field6909 = this.field9004.field4983;
            this.field9001.field6912 = this.field9004.field4980;
            this.field9001.field6902 = this.field9004.field4982;
            this.field9001.field6901 = this.field9004.field4969;
            this.field9001.field6906 = this.field9004.field4970;
            this.field9001.field6899 = this.field9004.field4975;
            this.field9001.field6914 = this.field9004.field4981;
        }
        int var59 = 127 % ((arg0 + 14) / 33);
        this.field8999 = 0;
        for (class421 var60 = (class421) this.field8995.method3898((byte) -61); var60 != null; var60 = (class421) this.field8995.method3902(true)) {
            var60.method2441(arg4, arg2);
            this.field8999++;
        }
        class201.field2849 += this.field8999;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z)V", line = 292)
    public final void method3658(boolean arg0) {
        this.field9001.field6901 = this.field9004.field4969;
        this.field9001.field6916 = this.field9004.field4977;
        this.field9001.field6906 = this.field9004.field4970;
        this.field9001.field6910 = this.field9004.field4979;
        field9005++;
        this.field9001.field6902 = this.field9004.field4982;
        if (!arg0) {
            return;
        }
        this.field9001.field6914 = this.field9004.field4981;
        this.field9001.field6912 = this.field9004.field4980;
        this.field9001.field6899 = this.field9004.field4975;
        this.field9001.field6909 = this.field9004.field4983;
        if (this.field9001.field6906 == this.field9001.field6902 && this.field9001.field6916 == this.field9001.field6906 && this.field9001.field6912 == this.field9001.field6899 && this.field9001.field6901 == this.field9001.field6899 && this.field9001.field6910 == this.field9001.field6909 && this.field9001.field6914 == this.field9001.field6910) {
            this.field9008 = true;
        } else if (this.field9008) {
            this.field9006.field6914 = this.field9001.field6914;
            this.field9006.field6912 = this.field9001.field6912;
            this.field9008 = false;
            this.field9006.field6901 = this.field9001.field6901;
            this.field9006.field6910 = this.field9001.field6910;
            this.field9006.field6899 = this.field9001.field6899;
            this.field9006.field6909 = this.field9001.field6909;
            this.field9006.field6902 = this.field9001.field6902;
            this.field9006.field6906 = this.field9001.field6906;
            this.field9006.field6916 = this.field9001.field6916;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIB)Z", line = 332)
    public static final boolean method3659(int arg0, int arg1, byte arg2) {
        if (arg2 != -64) {
            method3659(-80, -20, (byte) 26);
        }
        field8994++;
        return false;
    }
}
