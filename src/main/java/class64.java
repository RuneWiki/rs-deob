import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class64 extends class388 {

    @OriginalMember(owner = "client!iv", name = "n", descriptor = "Z")
    public boolean field983 = false;

    @OriginalMember(owner = "client!iv", name = "j", descriptor = "Z")
    private boolean field979 = false;

    @OriginalMember(owner = "client!iv", name = "L", descriptor = "I")
    private int field1007 = 0;

    @OriginalMember(owner = "client!iv", name = "G", descriptor = "Llr;")
    public class527 field1002;

    @OriginalMember(owner = "client!iv", name = "F", descriptor = "Lqm;")
    public class96 field1001;

    @OriginalMember(owner = "client!iv", name = "M", descriptor = "J")
    private long field1008;

    @OriginalMember(owner = "client!iv", name = "A", descriptor = "Laf;")
    public class298 field996;

    @OriginalMember(owner = "client!iv", name = "J", descriptor = "Los;")
    public class305 field1005;

    @OriginalMember(owner = "client!iv", name = "E", descriptor = "I")
    private int field1000;

    @OriginalMember(owner = "client!iv", name = "H", descriptor = "I")
    private int field1003;

    @OriginalMember(owner = "client!iv", name = "K", descriptor = "I")
    private int field1006;

    @OriginalMember(owner = "client!iv", name = "N", descriptor = "I")
    private int field1009;

    @OriginalMember(owner = "client!iv", name = "O", descriptor = "I")
    private int field1010;

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "I")
    public int field978;

    @OriginalMember(owner = "client!iv", name = "k", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!iv", name = "l", descriptor = "I")
    public int field981;

    @OriginalMember(owner = "client!iv", name = "m", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!iv", name = "o", descriptor = "I")
    public int field984;

    @OriginalMember(owner = "client!iv", name = "p", descriptor = "I")
    private int field985;

    @OriginalMember(owner = "client!iv", name = "q", descriptor = "I")
    private int field986;

    @OriginalMember(owner = "client!iv", name = "r", descriptor = "I")
    private int field987;

    @OriginalMember(owner = "client!iv", name = "s", descriptor = "I")
    private int field988;

    @OriginalMember(owner = "client!iv", name = "t", descriptor = "I")
    private int field989;

    @OriginalMember(owner = "client!iv", name = "u", descriptor = "I")
    private int field990;

    @OriginalMember(owner = "client!iv", name = "v", descriptor = "I")
    private int field991;

    @OriginalMember(owner = "client!iv", name = "w", descriptor = "I")
    private int field992;

    @OriginalMember(owner = "client!iv", name = "x", descriptor = "I")
    private int field993;

    @OriginalMember(owner = "client!iv", name = "y", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!iv", name = "z", descriptor = "I")
    private int field995;

    @OriginalMember(owner = "client!iv", name = "B", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!iv", name = "C", descriptor = "I")
    public int field998;

    @OriginalMember(owner = "client!iv", name = "D", descriptor = "I")
    private int field999;

    @OriginalMember(owner = "client!iv", name = "I", descriptor = "Lia;")
    public static class414 field1004;

    static {
        new class304("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)V", line = 5)
    public static final void method439(byte arg0) {
        field982++;
        int var1 = 80 % ((-arg0 - 61) / 61);
        class164 var2 = null;
        try {
            class446 var3 = class389.field5281.method1366(16, "2");
            while (var3.field6100 == 0) {
                class94.method674(1L, 1);
            }
            if (var3.field6100 == 1) {
                var2 = (class164) var3.field6104;
                byte[] var4 = new byte[(int) var2.method1112(112)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method1110(var4, var5, 15596, var4.length - var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class195.method1247(new class379(var4), -69);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1109((byte) -63);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lqa;Lqm;Llr;J)V", line = 376)
    public class64(class162 arg0, class96 arg1, class527 arg2, long arg3) {
        this.field1002 = arg2;
        this.field1001 = arg1;
        this.field1008 = arg3;
        this.field996 = this.field1001.method686((byte) 94);
        if (!arg0.method520() && this.field996.field3899 != -1) {
            this.field996 = class419.method2416(false, this.field996.field3899);
        }
        this.field1005 = new class305();
        this.field1007 = (int) ((double) this.field1007 + Math.random() * 64.0D);
        this.method440(-126);
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)V", line = 63)
    public final void method440(int arg0) {
        this.field991 = this.field1001.field1444;
        this.field992 = this.field1001.field1456;
        this.field990 = this.field1001.field1450;
        this.field999 = this.field1001.field1445;
        this.field985 = this.field1001.field1436;
        this.field1010 = this.field1001.field1438;
        field980++;
        this.field1009 = this.field1001.field1458;
        this.field989 = this.field1001.field1448;
        this.field1006 = this.field1001.field1432;
        if (this.field999 == this.field991 && this.field999 == this.field989 && this.field985 == this.field1009 && this.field1009 == this.field1006 && this.field992 == this.field990 && this.field990 == this.field1010) {
            this.field979 = true;
            return;
        }
        this.field979 = false;
        int var2 = (this.field991 + this.field989 + this.field999) / 3;
        int var3 = (this.field985 + this.field1009 + this.field1006) / 3;
        int var4 = (this.field992 + this.field1010 + this.field990) / 3;
        if (this.field998 != var2 || this.field978 != var3 || this.field981 != var4) {
            this.field981 = var4;
            this.field978 = var3;
            this.field998 = var2;
            int var5 = this.field999 - this.field991;
            int var6 = this.field1009 - this.field985;
            int var7 = this.field990 - this.field992;
            int var8 = this.field989 - this.field991;
            int var9 = this.field1006 - this.field985;
            int var10 = this.field1010 - this.field992;
            this.field987 = var7 * var8 - (var5 * var10);
            this.field993 = var5 * var9 - (var6 * var8);
            this.field1000 = var6 * var10 - (var7 * var9);
            while (this.field1000 > 32767 || this.field987 > 32767 || this.field993 > 32767 || this.field1000 < -32767 || this.field987 < -32767 || this.field993 < -32767) {
                this.field1000 >>= 0x1;
                this.field993 >>= 0x1;
                this.field987 >>= 0x1;
            }
            int var11 = (int) Math.sqrt((double) (this.field993 * this.field993 + this.field987 * this.field987 + this.field1000 * this.field1000));
            if (var11 <= 0) {
                var11 = 1;
            }
            this.field987 = this.field987 * 32767 / var11;
            this.field1000 = this.field1000 * 32767 / var11;
            this.field993 = this.field993 * 32767 / var11;
            if (this.field996.field3914 > 0 || this.field996.field3948 > 0) {
                int var12 = (int) (Math.atan2((double) this.field993, (double) this.field1000) * 2607.5945876176133D);
                int var13 = (int) (Math.atan2((double) this.field987, Math.sqrt((double) (this.field993 * this.field993 + this.field1000 * this.field1000))) * 2607.5945876176133D);
                this.field986 = this.field996.field3914 - this.field996.field3891;
                this.field995 = this.field996.field3948 - this.field996.field3947;
                this.field988 = var12 - ((this.field986 >> 1) - this.field996.field3891);
                this.field1003 = this.field996.field3947 + var13 - (this.field995 >> 1);
            }
        }
        if (arg0 > -96) {
            method439((byte) 92);
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(BJ)V", line = 147)
    public final void method441(byte arg0, long arg1) {
        field994++;
        if (arg0 != 98) {
            this.field999 = -64;
        }
        for (class398 var4 = (class398) this.field1005.method1771(arg0 - 80); var4 != null; var4 = (class398) this.field1005.method1774((byte) -123)) {
            var4.method2322(arg1);
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lqa;ZIIJ)V", line = 178)
    public final void method442(class162 arg0, boolean arg1, int arg2, int arg3, long arg4) {
        if (this.field983) {
            arg1 = false;
        } else if (this.field996.field3909 > class349.field4708) {
            arg1 = false;
        } else if (class287.field3751[class349.field4708] < class347.field4687) {
            arg1 = false;
        } else if (this.field979) {
            arg1 = false;
        } else if (this.field996.field3894 != -1) {
            int var7 = (int) (arg4 - this.field1008);
            if (this.field996.field3949 || this.field996.field3894 >= var7) {
                var7 %= this.field996.field3894;
            } else {
                arg1 = false;
            }
            if (!this.field996.field3950 && var7 < this.field996.field3953) {
                arg1 = false;
            }
            if (this.field996.field3950 && var7 >= this.field996.field3953) {
                arg1 = false;
            }
        }
        field997++;
        if (arg1) {
            this.field1007 += (int) ((double) arg2 * (Math.random() * (double) (this.field996.field3940 - this.field996.field3905) + (double) this.field996.field3905));
            if (this.field1007 > 63) {
                int var8 = this.field1007 >> 6;
                this.field1007 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field996.field3914 <= 0 && this.field996.field3948 <= 0) {
                        var10 = this.field993;
                        var11 = this.field1000;
                        var12 = this.field987;
                    } else {
                        int var13 = (int) ((double) this.field986 * Math.random()) + this.field988;
                        int var14 = var13 & 0x3FFF;
                        int var15 = class305.field4019[var14];
                        int var16 = class305.field4022[var14];
                        int var17 = this.field1003 + ((int) (Math.random() * (double) this.field995));
                        int var18 = var17 & 0x1FFF;
                        int var19 = class305.field4019[var18];
                        int var20 = class305.field4022[var18];
                        byte var21 = 15;
                        var11 = var16 * var19 >> var21;
                        var12 = (var20 << 0) * -1;
                        var10 = var15 * var19 >> var21;
                    }
                    int var22 = (int) (Math.random() * 65535.0D);
                    int var23 = (int) (Math.random() * 65535.0D);
                    if ((var22 + var23) > 65535) {
                        var22 = 65535 - var22;
                        var23 = 65535 - var23;
                    }
                    int var24 = 65535 - var23 - var22;
                    int var25 = this.field991 * var22 + this.field999 * var23 + this.field989 * var24 >> 16;
                    int var26 = this.field1006 * var24 + this.field985 * var22 + this.field1009 * var23 >> 16;
                    int var27 = this.field992 * var22 + (this.field990 * var23 + (this.field1010 * var24)) >> 16;
                    int var28 = this.field996.field3920 + (int) (Math.random() * (double) (this.field996.field3938 - this.field996.field3920));
                    int var29 = this.field996.field3887 + (int) ((double) (this.field996.field3902 - this.field996.field3887) * Math.random());
                    int var30 = (int) (Math.random() * (double) (this.field996.field3934 - this.field996.field3944)) + this.field996.field3944;
                    int var31;
                    if (this.field996.field3930) {
                        double var32 = Math.random();
                        var31 = (int) ((double) this.field996.field3898 * var32 + (double) this.field996.field3951) << 16 | (int) ((double) this.field996.field3931 * var32 + (double) this.field996.field3939) << 8 | (int) ((double) this.field996.field3892 * var32 + (double) this.field996.field3952) | (int) ((double) this.field996.field3917 + Math.random() * (double) this.field996.field3910) << 24;
                    } else {
                        var31 = (int) ((double) this.field996.field3939 + (double) this.field996.field3931 * Math.random()) << 8 | (int) ((double) this.field996.field3898 * Math.random() + (double) this.field996.field3951) << 16 | (int) (Math.random() * (double) this.field996.field3892 + (double) this.field996.field3952) | (int) ((double) this.field996.field3917 + Math.random() * (double) this.field996.field3910) << 24;
                    }
                    int var34 = this.field996.field3893;
                    if (!arg0.method520() && !this.field996.field3901) {
                        var34 = -1;
                    }
                    if (class511.field7311 == class183.field2609) {
                        new class398(this, var25, var26, var27, var11, var12, var10, var28, var29, var31, var30, var34, this.field996.field3884, this.field996.field3946);
                    } else {
                        class398 var36 = class242.field3236[class511.field7311];
                        class511.field7311 = class511.field7311 + 1 & 0x3FF;
                        var36.method2324(this, var25, var26, var27, var11, var12, var10, var28, var29, var31, var30, var34, this.field996.field3884, this.field996.field3946);
                    }
                }
            }
        }
        this.field984 = 0;
        for (class398 var37 = (class398) this.field1005.method1771(arg3 ^ 0xFFFFDB45); var37 != null; var37 = (class398) this.field1005.method1774((byte) -27)) {
            var37.method2325(arg4, arg2);
            this.field984++;
        }
        if (arg3 != 9429) {
            this.field992 = 65;
        }
        class232.field3128 += this.field984;
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(Z)V", line = 364)
    public static void method443(boolean arg0) {
        if (!arg0) {
            field1004 = null;
        }
    }
}
