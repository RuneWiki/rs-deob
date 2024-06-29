import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class504 extends class142 {

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "Z")
    private boolean field7026 = false;

    @OriginalMember(owner = "client!lk", name = "O", descriptor = "I")
    private int field7038 = 0;

    @OriginalMember(owner = "client!lk", name = "J", descriptor = "Z")
    public boolean field7034 = false;

    @OriginalMember(owner = "client!lk", name = "N", descriptor = "Ljw;")
    public class475 field7037;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "J")
    private long field7008;

    @OriginalMember(owner = "client!lk", name = "G", descriptor = "Lig;")
    public class203 field7031;

    @OriginalMember(owner = "client!lk", name = "P", descriptor = "Ltb;")
    public class337 field7039;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "Lit;")
    public class555 field7013;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
    public static int field7019 = 0;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    private int field7009;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    private int field7010;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    private int field7011;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    public static int field7012;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
    private int field7015;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    private int field7016;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    private int field7017;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "I")
    public int field7018;

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "I")
    private int field7020;

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "I")
    private int field7021;

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "I")
    public static int field7022;

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "I")
    private int field7023;

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "I")
    private int field7024;

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "I")
    private int field7025;

    @OriginalMember(owner = "client!lk", name = "C", descriptor = "I")
    private int field7027;

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "I")
    private int field7028;

    @OriginalMember(owner = "client!lk", name = "E", descriptor = "I")
    public int field7029;

    @OriginalMember(owner = "client!lk", name = "F", descriptor = "I")
    private int field7030;

    @OriginalMember(owner = "client!lk", name = "H", descriptor = "I")
    public static int field7032;

    @OriginalMember(owner = "client!lk", name = "I", descriptor = "I")
    public int field7033;

    @OriginalMember(owner = "client!lk", name = "K", descriptor = "I")
    public static int field7035;

    @OriginalMember(owner = "client!lk", name = "L", descriptor = "I")
    private int field7036;

    @OriginalMember(owner = "client!lk", name = "Q", descriptor = "I")
    private int field7040;

    @OriginalMember(owner = "client!lk", name = "R", descriptor = "I")
    public int field7041;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "Lqb;")
    public static class189 field7014;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lqa;JI)V")
    public final void method2916(class207 arg0, long arg1, int arg2) {
        field7035++;
        if (arg2 > 57) {
            for (class135 var5 = (class135) this.field7013.method3150(16); var5 != null; var5 = (class135) this.field7013.method3147(16)) {
                var5.method912(arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
    public static void method2917(byte arg0) {
        if (arg0 <= 41) {
            method2917((byte) -93);
        }
        field7014 = null;
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V")
    public final void method2918(int arg0) {
        this.field7030 = this.field7031.field2852;
        this.field7021 = this.field7031.field2847;
        this.field7040 = this.field7031.field2840;
        this.field7016 = this.field7031.field2846;
        this.field7027 = this.field7031.field2848;
        this.field7036 = this.field7031.field2851;
        field7032++;
        this.field7010 = this.field7031.field2849;
        if (arg0 >= -82) {
            this.field7017 = 39;
        }
        this.field7015 = this.field7031.field2844;
        this.field7020 = this.field7031.field2833;
        if (this.field7027 == this.field7015 && this.field7027 == this.field7020 && this.field7040 == this.field7016 && this.field7040 == this.field7010 && this.field7036 == this.field7030 && this.field7036 == this.field7021) {
            this.field7026 = true;
            return;
        }
        this.field7026 = false;
        int var2 = (this.field7027 + this.field7015 + this.field7020) / 3;
        int var3 = (this.field7040 + this.field7010 + this.field7016) / 3;
        int var4 = (this.field7036 + this.field7021 + this.field7030) / 3;
        if (this.field7041 == var2 && this.field7033 == var3 && this.field7018 == var4) {
            return;
        }
        this.field7018 = var4;
        this.field7033 = var3;
        this.field7041 = var2;
        int var5 = this.field7027 - this.field7015;
        int var6 = this.field7040 - this.field7016;
        int var7 = this.field7036 - this.field7030;
        int var8 = this.field7020 - this.field7015;
        int var9 = this.field7010 - this.field7016;
        int var10 = this.field7021 - this.field7030;
        this.field7011 = var6 * var10 - (var7 * var9);
        this.field7017 = var5 * var9 - (var6 * var8);
        for (this.field7025 = var7 * var8 - (var5 * var10); this.field7011 > 32767 || this.field7025 > 32767 || this.field7017 > 32767 || this.field7011 < -32767 || this.field7025 < -32767 || this.field7017 < -32767; this.field7025 >>= 0x1) {
            this.field7017 >>= 0x1;
            this.field7011 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field7025 * this.field7025 + (this.field7011 * this.field7011 + (this.field7017 * this.field7017))));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field7017 = this.field7017 * 32767 / var11;
        this.field7011 = this.field7011 * 32767 / var11;
        this.field7025 = this.field7025 * 32767 / var11;
        if (this.field7039.field4513 <= 0 && this.field7039.field4548 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field7017, (double) this.field7011) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field7025, Math.sqrt((double) (this.field7017 * this.field7017 + this.field7011 * this.field7011))) * 2607.5945876176133D);
        this.field7028 = this.field7039.field4513 - this.field7039.field4514;
        this.field7023 = this.field7039.field4548 - this.field7039.field4547;
        this.field7024 = this.field7039.field4514 + var12 - (this.field7028 >> 1);
        this.field7009 = this.field7039.field4547 + var13 - (this.field7023 >> 1);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IJLqa;IZ)V")
    public final void method2919(int arg0, long arg1, class207 arg2, int arg3, boolean arg4) {
        if (this.field7034) {
            arg4 = false;
        } else if (class265.field3701 < this.field7039.field4518) {
            arg4 = false;
        } else if (class466.field6568 > class317.field4307[class265.field3701]) {
            arg4 = false;
        } else if (this.field7026) {
            arg4 = false;
        } else if (this.field7039.field4523 != -1) {
            int var7 = (int) (arg1 - this.field7008);
            if (this.field7039.field4563 || this.field7039.field4523 >= var7) {
                var7 %= this.field7039.field4523;
            } else {
                arg4 = false;
            }
            if (!this.field7039.field4544 && var7 < this.field7039.field4543) {
                arg4 = false;
            }
            if (this.field7039.field4544 && this.field7039.field4543 <= var7) {
                arg4 = false;
            }
        }
        field7022++;
        if (arg4) {
            this.field7038 += (int) ((double) arg0 * ((double) this.field7039.field4552 + (double) (this.field7039.field4534 - this.field7039.field4552) * Math.random()));
            if (this.field7038 > 63) {
                int var8 = this.field7038 >> 6;
                this.field7038 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field7039.field4513 <= 0 && this.field7039.field4548 <= 0) {
                        var10 = this.field7011;
                        var11 = this.field7017;
                        var12 = this.field7025;
                    } else {
                        int var13 = this.field7024 + ((int) ((double) this.field7028 * Math.random()));
                        int var14 = var13 & 0x3FFF;
                        int var15 = class1.field2[var14];
                        int var16 = class1.field7[var14];
                        int var17 = this.field7009 + (int) ((double) this.field7023 * Math.random());
                        int var18 = var17 & 0x1FFF;
                        int var19 = class1.field2[var18];
                        int var20 = class1.field7[var18];
                        byte var21 = 15;
                        var10 = var16 * var19 >> var21;
                        var12 = (var20 << 0) * -1;
                        var11 = var15 * var19 >> var21;
                    }
                    int var22 = (int) (Math.random() * 65535.0D);
                    int var23 = (int) (Math.random() * 65535.0D);
                    if ((var22 + var23) > 65535) {
                        var22 = 65535 - var22;
                        var23 = 65535 - var23;
                    }
                    int var24 = 65535 - var22 - var23;
                    int var25 = (int) ((long) this.field7020 * (long) var24 + (long) this.field7027 * (long) var23 + (long) this.field7015 * (long) var22 >> 16);
                    int var26 = (int) ((long) this.field7010 * (long) var24 + (long) this.field7040 * (long) var23 + (long) this.field7016 * (long) var22 >> 16);
                    int var27 = (int) ((long) this.field7021 * (long) var24 + (long) this.field7036 * (long) var23 + (long) this.field7030 * (long) var22 >> 16);
                    int var28 = this.field7039.field4557 + (int) ((double) (this.field7039.field4509 - this.field7039.field4557) * Math.random());
                    int var29 = (int) ((double) (this.field7039.field4528 - this.field7039.field4530) * Math.random()) + this.field7039.field4530;
                    int var30 = (int) ((double) (this.field7039.field4539 - this.field7039.field4522) * Math.random()) + this.field7039.field4522;
                    int var31;
                    if (this.field7039.field4521) {
                        double var32 = Math.random();
                        var31 = (int) ((double) this.field7039.field4516 * var32 + (double) this.field7039.field4564) << 8 | (int) ((double) this.field7039.field4559 * var32 + (double) this.field7039.field4555) << 16 | (int) ((double) this.field7039.field4533 * var32 + (double) this.field7039.field4551) | (int) ((double) this.field7039.field4561 + Math.random() * (double) this.field7039.field4546) << 24;
                    } else {
                        var31 = (int) ((double) this.field7039.field4561 + (double) this.field7039.field4546 * Math.random()) << 24 | (int) ((double) this.field7039.field4551 + Math.random() * (double) this.field7039.field4533) | (int) ((double) this.field7039.field4516 * Math.random() + (double) this.field7039.field4564) << 8 | (int) (Math.random() * (double) this.field7039.field4559 + (double) this.field7039.field4555) << 16;
                    }
                    int var34 = this.field7039.field4508;
                    if (!arg2.method1304() && !this.field7039.field4545) {
                        var34 = -1;
                    }
                    if (class406.field5775 == class182.field2579) {
                        new class135(this, var25, var26, var27, var10, var12, var11, var28, var29, var31, var30, var34, this.field7039.field4541, this.field7039.field4525);
                    } else {
                        class135 var35 = class10.field113[class406.field5775];
                        class406.field5775 = class406.field5775 + 1 & 0x3FF;
                        var35.method913(this, var25, var26, var27, var10, var12, var11, var28, var29, var31, var30, var34, this.field7039.field4541, this.field7039.field4525);
                    }
                }
            }
        }
        this.field7029 = arg3;
        for (class135 var37 = (class135) this.field7013.method3150(16); var37 != null; var37 = (class135) this.field7013.method3147(arg3 ^ 0x10)) {
            var37.method914(arg1, arg0);
            this.field7029++;
        }
        class23.field329 += this.field7029;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lqa;Lig;Ljw;J)V")
    public class504(class207 arg0, class203 arg1, class475 arg2, long arg3) {
        this.field7037 = arg2;
        this.field7008 = arg3;
        this.field7031 = arg1;
        this.field7039 = this.field7031.method1229(-112);
        if (!arg0.method1304() && this.field7039.field4519 != -1) {
            this.field7039 = class184.method1152(-122, this.field7039.field4519);
        }
        this.field7013 = new class555();
        this.field7038 = (int) ((double) this.field7038 + Math.random() * 64.0D);
        this.method2918(-116);
    }
}
