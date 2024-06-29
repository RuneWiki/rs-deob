import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class308 extends class68 {

    @OriginalMember(owner = "client!os", name = "v", descriptor = "Z")
    public boolean field3923 = false;

    @OriginalMember(owner = "client!os", name = "n", descriptor = "I")
    private int field3915 = 0;

    @OriginalMember(owner = "client!os", name = "C", descriptor = "Z")
    private boolean field3930 = false;

    @OriginalMember(owner = "client!os", name = "y", descriptor = "Lhk;")
    public class67 field3926;

    @OriginalMember(owner = "client!os", name = "J", descriptor = "J")
    private long field3937;

    @OriginalMember(owner = "client!os", name = "N", descriptor = "Lew;")
    public class342 field3941;

    @OriginalMember(owner = "client!os", name = "x", descriptor = "Ljb;")
    public class343 field3925;

    @OriginalMember(owner = "client!os", name = "l", descriptor = "Lum;")
    public class365 field3913;

    @OriginalMember(owner = "client!os", name = "D", descriptor = "I")
    public static int field3931 = 0;

    @OriginalMember(owner = "client!os", name = "A", descriptor = "I")
    public static int field3928 = 2;

    @OriginalMember(owner = "client!os", name = "G", descriptor = "I")
    public static int field3934 = 0;

    @OriginalMember(owner = "client!os", name = "Q", descriptor = "I")
    public static int field3944 = 0;

    @OriginalMember(owner = "client!os", name = "U", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!os", name = "k", descriptor = "I")
    public int field3912;

    @OriginalMember(owner = "client!os", name = "m", descriptor = "I")
    private int field3914;

    @OriginalMember(owner = "client!os", name = "o", descriptor = "I")
    private int field3916;

    @OriginalMember(owner = "client!os", name = "p", descriptor = "I")
    private int field3917;

    @OriginalMember(owner = "client!os", name = "q", descriptor = "I")
    private int field3918;

    @OriginalMember(owner = "client!os", name = "r", descriptor = "I")
    private int field3919;

    @OriginalMember(owner = "client!os", name = "s", descriptor = "I")
    private int field3920;

    @OriginalMember(owner = "client!os", name = "t", descriptor = "I")
    private int field3921;

    @OriginalMember(owner = "client!os", name = "u", descriptor = "I")
    public int field3922;

    @OriginalMember(owner = "client!os", name = "w", descriptor = "I")
    public int field3924;

    @OriginalMember(owner = "client!os", name = "z", descriptor = "I")
    private int field3927;

    @OriginalMember(owner = "client!os", name = "B", descriptor = "I")
    private int field3929;

    @OriginalMember(owner = "client!os", name = "E", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!os", name = "F", descriptor = "I")
    private int field3933;

    @OriginalMember(owner = "client!os", name = "H", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!os", name = "I", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!os", name = "K", descriptor = "I")
    private int field3938;

    @OriginalMember(owner = "client!os", name = "L", descriptor = "I")
    private int field3939;

    @OriginalMember(owner = "client!os", name = "O", descriptor = "I")
    private int field3942;

    @OriginalMember(owner = "client!os", name = "P", descriptor = "I")
    private int field3943;

    @OriginalMember(owner = "client!os", name = "R", descriptor = "I")
    private int field3945;

    @OriginalMember(owner = "client!os", name = "S", descriptor = "I")
    private int field3946;

    @OriginalMember(owner = "client!os", name = "T", descriptor = "I")
    public int field3947;

    @OriginalMember(owner = "client!os", name = "M", descriptor = "Lus;")
    public static class1 field3940;

    static {
        new class335(null, "der Spieler ist momentan nicht verfügbar.", null, null);
        field3948 = 0;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(JB)V", line = 10)
    public final void method1796(long arg0, byte arg1) {
        for (class485 var4 = (class485) this.field3913.method2097((byte) 86); var4 != null; var4 = (class485) this.field3913.method2091(-1)) {
            var4.method2943(arg0);
        }
        field3936++;
        if (arg1 != 28) {
            this.method1797(-97);
        }
    }

    @OriginalMember(owner = "client!os", name = "e", descriptor = "(I)V", line = 31)
    public final void method1797(int arg0) {
        field3932++;
        this.field3939 = this.field3941.field4316;
        if (arg0 != 849482625) {
            this.method1796(-39L, (byte) 11);
        }
        this.field3929 = this.field3941.field4311;
        this.field3938 = this.field3941.field4310;
        this.field3933 = this.field3941.field4319;
        this.field3945 = this.field3941.field4314;
        this.field3916 = this.field3941.field4327;
        this.field3946 = this.field3941.field4324;
        this.field3921 = this.field3941.field4308;
        this.field3927 = this.field3941.field4325;
        if (this.field3933 == this.field3921 && this.field3938 == this.field3921 && this.field3946 == this.field3916 && this.field3946 == this.field3927 && this.field3945 == this.field3939 && this.field3945 == this.field3929) {
            this.field3930 = true;
            return;
        }
        this.field3930 = false;
        int var2 = (this.field3938 + this.field3933 + this.field3921) / 3;
        int var3 = (this.field3946 + this.field3927 + this.field3916) / 3;
        int var4 = (this.field3939 + this.field3929 + this.field3945) / 3;
        if (this.field3922 == var2 && this.field3924 == var3 && this.field3947 == var4) {
            return;
        }
        this.field3924 = var3;
        this.field3947 = var4;
        this.field3922 = var2;
        int var5 = this.field3921 - this.field3933;
        int var6 = this.field3946 - this.field3916;
        int var7 = this.field3945 - this.field3939;
        int var8 = this.field3938 - this.field3933;
        int var9 = this.field3927 - this.field3916;
        int var10 = this.field3929 - this.field3939;
        this.field3919 = var6 * var10 - (var7 * var9);
        this.field3943 = var7 * var8 - (var5 * var10);
        this.field3920 = var5 * var9 - var6 * var8;
        while (this.field3919 > 32767 || this.field3943 > 32767 || this.field3920 > 32767 || this.field3919 < -32767 || this.field3943 < -32767 || this.field3920 < -32767) {
            this.field3943 >>= 0x1;
            this.field3920 >>= 0x1;
            this.field3919 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field3919 * this.field3919 - (-(this.field3943 * this.field3943) - (this.field3920 * this.field3920))));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field3920 = this.field3920 * 32767 / var11;
        this.field3919 = this.field3919 * 32767 / var11;
        this.field3943 = this.field3943 * 32767 / var11;
        if (this.field3925.field4341 <= 0 && this.field3925.field4387 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field3920, (double) this.field3919) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field3943, Math.sqrt((double) (this.field3920 * this.field3920 + this.field3919 * this.field3919))) * 2607.5945876176133D);
        this.field3914 = this.field3925.field4341 - this.field3925.field4378;
        this.field3918 = this.field3925.field4387 - this.field3925.field4397;
        this.field3942 = this.field3925.field4378 + var12 - (this.field3914 >> 1);
        this.field3917 = this.field3925.field4397 + var13 - (this.field3918 >> 1);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZIJZLya;)V", line = 120)
    public final void method1798(boolean arg0, int arg1, long arg2, boolean arg3, class38 arg4) {
        field3935++;
        if (!arg3) {
            this.method1796(-53L, (byte) -27);
        }
        if (this.field3923) {
            arg0 = false;
        } else if (class198.field2587 < this.field3925.field4353) {
            arg0 = false;
        } else if (class382.field5036[class198.field2587] < class505.field7282) {
            arg0 = false;
        } else if (this.field3930) {
            arg0 = false;
        } else if (this.field3925.field4328 != -1) {
            int var7 = (int) (arg2 - this.field3937);
            if (this.field3925.field4381 || this.field3925.field4328 >= var7) {
                var7 %= this.field3925.field4328;
            } else {
                arg0 = false;
            }
            if (!this.field3925.field4340 && var7 < this.field3925.field4352) {
                arg0 = false;
            }
            if (this.field3925.field4340 && var7 >= this.field3925.field4352) {
                arg0 = false;
            }
        }
        if (arg0) {
            this.field3915 += (int) ((double) arg1 * ((double) this.field3925.field4357 + Math.random() * (double) (this.field3925.field4382 - this.field3925.field4357)));
            if (this.field3915 > 63) {
                int var8 = this.field3915 >> 6;
                this.field3915 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field3925.field4341 <= 0 && this.field3925.field4387 <= 0) {
                        var10 = this.field3919;
                        var11 = this.field3943;
                        var12 = this.field3920;
                    } else {
                        int var13 = this.field3942 + ((int) ((double) this.field3914 * Math.random()));
                        int var14 = var13 & 0x3FFF;
                        int var15 = class36.field443[var14];
                        int var16 = class36.field478[var14];
                        int var17 = this.field3917 + ((int) ((double) this.field3918 * Math.random()));
                        int var18 = var17 & 0x1FFF;
                        int var19 = class36.field443[var18];
                        int var20 = class36.field478[var18];
                        byte var21 = 15;
                        var10 = var16 * var19 >> var21;
                        var11 = (var20 << 0) * -1;
                        var12 = var15 * var19 >> var21;
                    }
                    int var22 = (int) (Math.random() * 65535.0D);
                    int var23 = (int) (Math.random() * 65535.0D);
                    if (var22 + var23 > 65535) {
                        var23 = 65535 - var23;
                        var22 = 65535 - var22;
                    }
                    int var24 = 65535 - var22 - var23;
                    int var25 = this.field3938 * var24 + (this.field3933 * var22 + (this.field3921 * var23)) >> 16;
                    int var26 = this.field3927 * var24 + this.field3916 * var22 + (this.field3946 * var23) >> 16;
                    int var27 = this.field3945 * var23 + (this.field3939 * var22 + (this.field3929 * var24)) >> 16;
                    int var28 = this.field3925.field4360 + ((int) ((double) (this.field3925.field4386 - this.field3925.field4360) * Math.random()));
                    int var29 = this.field3925.field4336 + (int) ((double) (this.field3925.field4330 - this.field3925.field4336) * Math.random());
                    int var30 = this.field3925.field4366 + (int) (Math.random() * (double) (this.field3925.field4374 - this.field3925.field4366));
                    int var31;
                    if (this.field3925.field4385) {
                        double var32 = Math.random();
                        var31 = (int) ((double) this.field3925.field4384 * var32 + (double) this.field3925.field4383) | (int) ((double) this.field3925.field4361 * var32 + (double) this.field3925.field4369) << 16 | (int) ((double) this.field3925.field4376 * var32 + (double) this.field3925.field4355) << 8 | (int) (Math.random() * (double) this.field3925.field4358 + (double) this.field3925.field4377) << 24;
                    } else {
                        var31 = (int) (Math.random() * (double) this.field3925.field4358 + (double) this.field3925.field4377) << 24 | (int) ((double) this.field3925.field4383 + Math.random() * (double) this.field3925.field4384) | (int) ((double) this.field3925.field4355 + (double) this.field3925.field4376 * Math.random()) << 8 | (int) ((double) this.field3925.field4361 * Math.random() + (double) this.field3925.field4369) << 16;
                    }
                    int var34 = this.field3925.field4348;
                    if (!arg4.method354() && !this.field3925.field4354) {
                        var34 = -1;
                    }
                    if (class226.field2878 == class151.field1898) {
                        new class485(this, var25, var26, var27, var10, var11, var12, var28, var29, var31, var30, var34, this.field3925.field4367, this.field3925.field4345);
                    } else {
                        class485 var35 = class47.field576[class226.field2878];
                        class226.field2878 = class226.field2878 + 1 & 0x3FF;
                        var35.method2945(this, var25, var26, var27, var10, var11, var12, var28, var29, var31, var30, var34, this.field3925.field4367, this.field3925.field4345);
                    }
                }
            }
        }
        this.field3912 = 0;
        for (class485 var37 = (class485) this.field3913.method2097((byte) 86); var37 != null; var37 = (class485) this.field3913.method2091(-1)) {
            var37.method2944(arg2, arg1);
            this.field3912++;
        }
        class347.field4460 += this.field3912;
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lya;Lew;Lhk;J)V", line = 336)
    public class308(class38 arg0, class342 arg1, class67 arg2, long arg3) {
        this.field3926 = arg2;
        this.field3937 = arg3;
        this.field3941 = arg1;
        this.field3925 = this.field3941.method1967(0);
        if (!arg0.method354() && this.field3925.field4362 != -1) {
            this.field3925 = class226.method1377((byte) -82, this.field3925.field4362);
        }
        this.field3913 = new class365();
        this.field3915 = (int) ((double) this.field3915 + Math.random() * 64.0D);
        this.method1797(849482625);
    }

    @OriginalMember(owner = "client!os", name = "f", descriptor = "(I)V", line = 298)
    public static void method1799(int arg0) {
        if (arg0 != 3) {
            method1799(96);
        }
        field3940 = null;
    }
}
