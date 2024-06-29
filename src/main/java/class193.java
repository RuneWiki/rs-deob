import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class193 extends class416 {

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
    private int field3195 = 0;

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "Z")
    public boolean field3204 = false;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "Ltc;")
    public class322 field3199 = new class322();

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "Ltc;")
    private class322 field3206 = new class322();

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "Z")
    private boolean field3207 = false;

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "J")
    private long field3200;

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "Lti;")
    public class406 field3201;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "Liu;")
    public class536 field3191;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "Lwg;")
    public class391 field3192;

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "Lqe;")
    public class433 field3202;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "Z")
    public static boolean field3197 = false;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "Lpw;")
    public static class656 field3198 = new class656();

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
    public static int field3205 = 0;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
    public int field3194;

    @OriginalMember(owner = "client!ik", name = "D", descriptor = "I")
    private int field3208;

    @OriginalMember(owner = "client!ik", name = "E", descriptor = "I")
    private int field3209;

    @OriginalMember(owner = "client!ik", name = "F", descriptor = "I")
    private int field3210;

    @OriginalMember(owner = "client!ik", name = "G", descriptor = "I")
    private int field3211;

    @OriginalMember(owner = "client!ik", name = "H", descriptor = "I")
    private int field3212;

    @OriginalMember(owner = "client!ik", name = "I", descriptor = "I")
    private int field3213;

    @OriginalMember(owner = "client!ik", name = "J", descriptor = "I")
    private int field3214;

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "J")
    public static long field3203;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "Lri;")
    public static class97 field3196;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V", line = 3)
    public static final void method1531(byte arg0) {
        int var1 = 71 / ((43 - arg0) / 58);
        field3190++;
        if (!class119.field1921) {
            return;
        }
        while (true) {
            while (class11.field187 < class231.field3683.length) {
                class226 var2 = class231.field3683[class11.field187];
                if (var2 != null && var2.field3642 == -1) {
                    if (class691.field9691 == null) {
                        class691.field9691 = class217.field3566.method1507((byte) 69, var2.field3635);
                    }
                    int var3 = class691.field9691.field8137;
                    if (var3 == -1) {
                        return;
                    }
                    class691.field9691 = null;
                    class11.field187++;
                    var2.field3642 = var3;
                } else {
                    class11.field187++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)V", line = 50)
    public static void method1532(boolean arg0) {
        field3198 = null;
        if (arg0) {
            field3196 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 65)
    public final void method1533(int arg0) {
        if (arg0 > -43) {
            return;
        }
        this.field3199.field5034 = this.field3201.field6256;
        this.field3199.field5039 = this.field3201.field6274;
        this.field3199.field5046 = this.field3201.field6255;
        this.field3199.field5040 = this.field3201.field6261;
        this.field3199.field5047 = this.field3201.field6270;
        this.field3199.field5042 = this.field3201.field6272;
        this.field3199.field5037 = this.field3201.field6257;
        this.field3199.field5044 = this.field3201.field6265;
        this.field3199.field5045 = this.field3201.field6258;
        field3189++;
        if (this.field3199.field5046 == this.field3199.field5045 && this.field3199.field5046 == this.field3199.field5037 && this.field3199.field5044 == this.field3199.field5034 && this.field3199.field5044 == this.field3199.field5042 && this.field3199.field5047 == this.field3199.field5040 && this.field3199.field5040 == this.field3199.field5039) {
            this.field3207 = true;
        } else if (this.field3207) {
            this.field3206.field5047 = this.field3199.field5047;
            this.field3206.field5046 = this.field3199.field5046;
            this.field3206.field5039 = this.field3199.field5039;
            this.field3206.field5040 = this.field3199.field5040;
            this.field3206.field5034 = this.field3199.field5034;
            this.field3206.field5045 = this.field3199.field5045;
            this.field3206.field5037 = this.field3199.field5037;
            this.field3206.field5044 = this.field3199.field5044;
            this.field3207 = false;
            this.field3206.field5042 = this.field3199.field5042;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IJILr;Z)V", line = 106)
    public final void method1534(int arg0, long arg1, int arg2, class167 arg3, boolean arg4) {
        if (arg2 != 1853) {
            this.field3199 = null;
        }
        if (this.field3204) {
            arg4 = false;
        } else if (this.field3192.field6097 > class165.field2779) {
            arg4 = false;
        } else if (field3205 > class202.field3269[class165.field2779]) {
            arg4 = false;
        } else if (this.field3207) {
            arg4 = false;
        } else if (this.field3192.field6080 != -1) {
            int var7 = (int) (arg1 - this.field3200);
            if (this.field3192.field6117 || this.field3192.field6080 >= var7) {
                var7 %= this.field3192.field6080;
            } else {
                arg4 = false;
            }
            if (!this.field3192.field6106 && var7 < this.field3192.field6056) {
                arg4 = false;
            }
            if (this.field3192.field6106 && this.field3192.field6056 <= var7) {
                arg4 = false;
            }
        }
        field3188++;
        if (arg4) {
            class71.field896++;
            int var8 = (this.field3199.field5045 - (-this.field3199.field5046 - this.field3199.field5037)) / 3;
            int var9 = (this.field3199.field5044 + this.field3199.field5042 + this.field3199.field5034) / 3;
            int var10 = (this.field3199.field5047 - (-this.field3199.field5040 - this.field3199.field5039)) / 3;
            if (this.field3199.field5035 != var8 || this.field3199.field5048 != var9 || this.field3199.field5043 != var10) {
                this.field3199.field5043 = var10;
                this.field3199.field5048 = var9;
                this.field3199.field5035 = var8;
                int var11 = this.field3199.field5046 - this.field3199.field5045;
                int var12 = this.field3199.field5044 - this.field3199.field5034;
                int var13 = this.field3199.field5040 - this.field3199.field5047;
                int var14 = this.field3199.field5037 - this.field3199.field5045;
                int var15 = this.field3199.field5042 - this.field3199.field5034;
                int var16 = this.field3199.field5039 - this.field3199.field5047;
                this.field3211 = var12 * var16 - (var13 * var15);
                this.field3208 = var13 * var14 - (var11 * var16);
                this.field3212 = var11 * var15 - (var12 * var14);
                while (true) {
                    if (this.field3211 <= 32767 && this.field3208 <= 32767 && this.field3212 <= 32767 && this.field3211 >= -32767 && this.field3208 >= -32767 && this.field3212 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field3211 * this.field3211 + this.field3212 * this.field3212 + this.field3208 * this.field3208));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field3212 = this.field3212 * 32767 / var17;
                        this.field3208 = this.field3208 * 32767 / var17;
                        this.field3211 = this.field3211 * 32767 / var17;
                        if (this.field3192.field6058 > 0 || this.field3192.field6078 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field3212, (double) this.field3211) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field3208, Math.sqrt((double) (this.field3211 * this.field3211 + (this.field3212 * this.field3212)))) * 2607.5945876176133D);
                            this.field3213 = this.field3192.field6058 - this.field3192.field6094;
                            this.field3210 = this.field3192.field6078 - this.field3192.field6059;
                            this.field3209 = var18 + this.field3192.field6094 - (this.field3213 >> 1);
                            this.field3214 = this.field3192.field6059 + var19 - (this.field3210 >> 1);
                        }
                        break;
                    }
                    this.field3208 >>= 0x1;
                    this.field3212 >>= 0x1;
                    this.field3211 >>= 0x1;
                }
            }
            this.field3195 += (int) (((double) (this.field3192.field6102 - this.field3192.field6113) * Math.random() + (double) this.field3192.field6113) * (double) arg0);
            if (this.field3195 > 63) {
                int var20 = this.field3195 >> 6;
                this.field3195 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field3192.field6058 <= 0 && this.field3192.field6078 <= 0) {
                        var22 = this.field3212;
                        var23 = this.field3211;
                        var24 = this.field3208;
                    } else {
                        int var25 = this.field3209 + (int) ((double) this.field3213 * Math.random());
                        int var26 = var25 & 0x3FFF;
                        int var27 = class567.field8139[var26];
                        int var28 = class567.field8138[var26];
                        int var29 = this.field3214 + ((int) ((double) this.field3210 * Math.random()));
                        int var30 = var29 & 0x1FFF;
                        int var31 = class567.field8139[var30];
                        int var32 = class567.field8138[var30];
                        byte var33 = 13;
                        var24 = (var32 << 1) * -1;
                        var23 = var28 * var31 >> var33;
                        var22 = var27 * var31 >> var33;
                    }
                    float var34 = (float) Math.random();
                    float var35 = (float) Math.random();
                    if (var34 + var35 > 1.0F) {
                        var34 = 1.0F - var34;
                        var35 = 1.0F - var35;
                    }
                    float var36 = 1.0F - var34 - var35;
                    int var37 = (int) ((float) this.field3199.field5037 * var36 + (float) this.field3199.field5046 * var35 + (float) this.field3199.field5045 * var34);
                    int var38 = (int) ((float) this.field3199.field5042 * var36 + (float) this.field3199.field5044 * var35 + (float) this.field3199.field5034 * var34);
                    int var39 = (int) ((float) this.field3199.field5039 * var36 + (float) this.field3199.field5047 * var34 + (float) this.field3199.field5040 * var35);
                    int var40 = (int) ((float) this.field3206.field5037 * var36 + (float) this.field3206.field5046 * var35 + (float) this.field3206.field5045 * var34);
                    int var41 = (int) ((float) this.field3206.field5042 * var36 + (float) this.field3206.field5044 * var35 + (float) this.field3206.field5034 * var34);
                    int var42 = (int) ((float) this.field3206.field5039 * var36 + (float) this.field3206.field5047 * var34 + (float) this.field3206.field5040 * var35);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) ((double) var40 + Math.random() * (double) var43);
                    int var47 = (int) ((double) var41 + Math.random() * (double) var44);
                    int var48 = (int) (Math.random() * (double) var45 + (double) var42);
                    int var49 = this.field3192.field6068 + (int) (Math.random() * (double) (this.field3192.field6074 - this.field3192.field6068));
                    int var50 = this.field3192.field6100 + (int) (Math.random() * (double) (this.field3192.field6075 - this.field3192.field6100));
                    int var51 = (int) ((double) (this.field3192.field6083 - this.field3192.field6053) * Math.random()) + this.field3192.field6053;
                    int var54;
                    if (this.field3192.field6121) {
                        double var52 = Math.random();
                        var54 = (int) ((double) this.field3192.field6093 + (double) this.field3192.field6088 * Math.random()) << 24 | (int) ((double) this.field3192.field6118 * var52 + (double) this.field3192.field6063) | (int) ((double) this.field3192.field6116 * var52 + (double) this.field3192.field6109) << 8 | (int) ((double) this.field3192.field6057 * var52 + (double) this.field3192.field6099) << 16;
                    } else {
                        var54 = (int) ((double) this.field3192.field6063 + (double) this.field3192.field6118 * Math.random()) | (int) ((double) this.field3192.field6099 + (double) this.field3192.field6057 * Math.random()) << 16 | (int) ((double) this.field3192.field6109 + (double) this.field3192.field6116 * Math.random()) << 8 | (int) ((double) this.field3192.field6093 + Math.random() * (double) this.field3192.field6088) << 24;
                    }
                    int var55 = this.field3192.field6089;
                    if (!arg3.method288() && !this.field3192.field6108) {
                        var55 = -1;
                    }
                    if (class599.field8541 == class275.field4417) {
                        new class77(this, var46, var47, var48, var23, var24, var22, var49, var50, var54, var51, var55, this.field3192.field6082, this.field3192.field6064);
                    } else {
                        class77 var57 = class582.field8278[class599.field8541];
                        class599.field8541 = class599.field8541 + 1 & 0x3FF;
                        var57.method762(this, var46, var47, var48, var23, var24, var22, var49, var50, var54, var51, var55, this.field3192.field6082, this.field3192.field6064);
                    }
                }
            }
        }
        if (!this.field3199.method2185(this.field3206, 1)) {
            class322 var58 = this.field3206;
            this.field3206 = this.field3199;
            this.field3199 = var58;
            this.field3199.field5047 = this.field3201.field6270;
            this.field3199.field5044 = this.field3201.field6265;
            this.field3199.field5034 = this.field3201.field6256;
            this.field3199.field5045 = this.field3201.field6258;
            this.field3199.field5040 = this.field3201.field6261;
            this.field3199.field5037 = this.field3201.field6257;
            this.field3199.field5046 = this.field3201.field6255;
            this.field3199.field5042 = this.field3201.field6272;
            this.field3199.field5039 = this.field3201.field6274;
        }
        this.field3194 = 0;
        for (class77 var59 = (class77) this.field3202.method2754((byte) 125); var59 != null; var59 = (class77) this.field3202.method2759(1486415172)) {
            var59.method760(arg1, arg0);
            this.field3194++;
        }
        class429.field6545 += this.field3194;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IB)I", line = 361)
    public static final int method1535(int arg0, byte arg1) {
        field3187++;
        int var2 = -21 % ((arg1 - 41) / 46);
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(JLr;I)V", line = 374)
    public final void method1536(long arg0, class167 arg1, int arg2) {
        field3193++;
        if (arg2 != -60643368) {
            this.field3200 = 6L;
        }
        for (class77 var5 = (class77) this.field3202.method2754((byte) -35); var5 != null; var5 = (class77) this.field3202.method2759(1486415172)) {
            var5.method761(arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lr;Lti;Liu;J)V", line = 434)
    public class193(class167 arg0, class406 arg1, class536 arg2, long arg3) {
        this.field3200 = arg3;
        this.field3201 = arg1;
        this.field3191 = arg2;
        this.field3192 = this.field3201.method2604((byte) 97);
        if (!arg0.method288() && this.field3192.field6081 != -1) {
            this.field3192 = class251.method1787((byte) -23, this.field3192.field6081);
        }
        this.field3202 = new class433();
        this.field3195 = (int) ((double) this.field3195 + Math.random() * 64.0D);
        this.method1533(-50);
        this.field3206.field5040 = this.field3199.field5040;
        this.field3206.field5047 = this.field3199.field5047;
        this.field3206.field5046 = this.field3199.field5046;
        this.field3206.field5042 = this.field3199.field5042;
        this.field3206.field5034 = this.field3199.field5034;
        this.field3206.field5037 = this.field3199.field5037;
        this.field3206.field5045 = this.field3199.field5045;
        this.field3206.field5039 = this.field3199.field5039;
        this.field3206.field5044 = this.field3199.field5044;
    }
}
