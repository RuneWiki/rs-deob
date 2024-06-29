import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class20 {

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "[Loia;")
    public class51[] field242 = null;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "Lco;")
    public class722 field244 = null;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "[Loia;")
    private class51[] field241 = null;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "Lco;")
    public class722 field243 = null;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "Lpga;")
    private class492 field240;

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "Z")
    public boolean field247;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "Lg;")
    public static class594 field246 = new class594("RC", 1);

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lpga;)V", line = 290)
    public class20(class492 arg0) {
        this.field240 = arg0;
        this.field247 = this.field240.field6865;
        if (this.field247 && !this.field240.method591(class720.field10164, class442.field6065, -118)) {
            this.field247 = false;
        }
        if (this.field247 || this.field240.method616(class442.field6065, class720.field10164, (byte) -115)) {
            class640.method3719(false);
            if (this.field247) {
                byte[] var2 = class379.method2314(false, class356.field4572, (byte) -124);
                this.field244 = this.field240.method611(true, var2, 128, class442.field6065, 16, 128);
                byte[] var3 = class379.method2314(false, class19.field238, (byte) -128);
                this.field240.method611(true, var3, 128, class442.field6065, 16, 128);
            } else {
                this.field242 = new class51[16];
                for (int var4 = 0; var4 < 16; var4++) {
                    byte[] var7 = class435.method2615(class356.field4572, 32768, 13997, var4 * 128 * 256);
                    this.field242[var4] = this.field240.method2883(true, 128, 128, (byte) -113, var7, class442.field6065);
                }
                this.field241 = new class51[16];
                for (int var5 = 0; var5 < 16; var5++) {
                    byte[] var6 = class435.method2615(class19.field238, 32768, 13997, var5 * 128 * 128 * 2);
                    this.field241[var5] = this.field240.method2883(true, 128, 128, (byte) -86, var6, class442.field6065);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)Z", line = 25)
    public final boolean method96(int arg0) {
        field245++;
        if (arg0 >= -105) {
            return false;
        } else if (this.field247) {
            return this.field244 != null;
        } else {
            return this.field242 != null;
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V", line = 36)
    public static final void method97(int arg0) {
        field248++;
        int var1 = class651.field9208 * 512 + 256;
        int var2 = class676.field9532 * 512 + 256;
        int var3 = class438.method2628(var1, class392.field5459, var2, (byte) -114) - class646.field9156;
        if (class559.field7944 >= 100) {
            class235.field3250 = class676.field9532 * 512 + 256;
            class24.field266 = class651.field9208 * 512 + 256;
            class57.field798 = class438.method2628(class24.field266, class392.field5459, class235.field3250, (byte) -116) - class646.field9156;
        } else {
            if (class24.field266 < var1) {
                class24.field266 += (var1 - class24.field266) * class559.field7944 / 1000 + class252.field3483;
                if (var1 < class24.field266) {
                    class24.field266 = var1;
                }
            }
            if (class57.field798 < var3) {
                class57.field798 += (var3 - class57.field798) * class559.field7944 / 1000 + class252.field3483;
                if (var3 < class57.field798) {
                    class57.field798 = var3;
                }
            }
            if (class24.field266 > var1) {
                class24.field266 -= (class24.field266 - var1) * class559.field7944 / 1000 + class252.field3483;
                if (var1 > class24.field266) {
                    class24.field266 = var1;
                }
            }
            if (class235.field3250 < var2) {
                class235.field3250 += (var2 - class235.field3250) * class559.field7944 / 1000 + class252.field3483;
                if (class235.field3250 > var2) {
                    class235.field3250 = var2;
                }
            }
            if (class57.field798 > var3) {
                class57.field798 -= (class57.field798 - var3) * class559.field7944 / 1000 + class252.field3483;
                if (class57.field798 < var3) {
                    class57.field798 = var3;
                }
            }
            if (var2 < class235.field3250) {
                class235.field3250 -= (class235.field3250 - var2) * class559.field7944 / 1000 + class252.field3483;
                if (class235.field3250 < var2) {
                    class235.field3250 = var2;
                }
            }
        }
        int var4 = class584.field8361 * 512 + 256;
        int var5 = class93.field1343 * 512 + 256;
        int var6 = class438.method2628(var4, class392.field5459, var5, (byte) 92) - class333.field4271;
        if (arg0 != -30512) {
            method97(-111);
        }
        int var7 = var4 - class24.field266;
        int var8 = var6 - class57.field798;
        int var9 = var5 - class235.field3250;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 0x3FFF;
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class403.field5594) {
            class403.field5594 += (var11 - class403.field5594 >> 3) * class641.field9111 / 1000 + class590.field8466 << 3;
            if (class403.field5594 > var11) {
                class403.field5594 = var11;
            }
        }
        if (var11 < class403.field5594) {
            class403.field5594 -= (class403.field5594 - var11 >> 3) * class641.field9111 / 1000 + class590.field8466 << 3;
            if (class403.field5594 < var11) {
                class403.field5594 = var11;
            }
        }
        int var13 = var12 - class645.field9148;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class645.field9148 += class641.field9111 * var14 / 1000 + class590.field8466 << 3;
            class645.field9148 &= 0x3FFF;
        }
        if (var14 < 0) {
            class645.field9148 -= -var14 * class641.field9111 / 1000 + class590.field8466 << 3;
            class645.field9148 &= 0x3FFF;
        }
        int var15 = var12 - class645.field9148;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        class520.field7268 = 0;
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class645.field9148 = var12;
        }
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)Z", line = 195)
    public final boolean method98(int arg0) {
        int var2 = -103 / ((-arg0 - 27) / 36);
        if (this.field243 == null) {
            if (class272.field3673 == null) {
                byte[] var3 = class295.method1729(16.0F, 128, 4.0F, 8, 128, 0.6F, 0.5F, 16, 4.0F, 98, new class431(419684));
                class272.field3673 = class192.method1273(false, -108, var3);
            }
            byte[] var4 = class379.method2314(false, class272.field3673, (byte) -107);
            byte[] var5 = new byte[var4.length * 4];
            int var6 = 0;
            for (int var7 = 0; var7 < 16; var7++) {
                int var8 = var7 * 128 * 128;
                int var9 = var8;
                for (int var10 = 0; var10 < 128; var10++) {
                    int var11 = var10 * 128 + var9;
                    int var12 = var9 + ((var10 - 1 & 0x7F) * 128);
                    int var13 = (var10 + 1 & 0x7F) * 128 + var9;
                    for (int var14 = 0; var14 < 128; var14++) {
                        float var15 = (float) ((var4[var12 + var14] & 0xFF) - (var4[var13 + var14] & 0xFF));
                        float var16 = (float) ((var4[(var14 - 1 & 0x7F) + var11] & 0xFF) - (var4[(var14 + 1 & 0x7F) + var11] & 0xFF));
                        float var17 = (float) (128.0D / Math.sqrt((double) (var15 * var15 + var16 * var16 + 16384.0F)));
                        var5[var6++] = (byte) ((int) (var16 * var17 + 127.0F));
                        var5[var6++] = (byte) ((int) (var17 * 128.0F + 127.0F));
                        var5[var6++] = (byte) ((int) (var15 * var17 + 127.0F));
                        var5[var6++] = var4[var8++];
                    }
                }
            }
            this.field243 = this.field240.method611(true, var5, 128, class4.field10, 16, 128);
        }
        field239++;
        return this.field243 != null;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V", line = 277)
    public static void method99(byte arg0) {
        if (arg0 >= 115) {
            field246 = null;
        }
    }
}
