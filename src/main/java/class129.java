import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class129 {

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    private int field2008;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
    private int field2018;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    private int field2005;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "Z")
    private boolean field2021;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
    private int field2013;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    private int field2019;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    private int field2011;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
    private int field2022;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "[I")
    private static int[] field2016 = new int[4];

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    private int field2006;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    private int field2007;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public int field2012;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    private int field2015;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    private int field2020;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "Lka;")
    private static class336 field2017;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "Laa;")
    private static class343 field2009;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "Laa;")
    private class343 field2010;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "Laa;")
    private static class343 field2014;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lqa;)V", line = 4)
    private static final void method946(class167 arg0) {
        if (field2017 != null) {
            return;
        }
        class330 var1 = new class330(580, 1104, 1);
        var1.method2094((short) 1024, (short) 1024, (byte) 0, -256, (short) 0, (byte) 0, (short) 1024, (short) 0, (short) 32767, (byte) 0);
        var1.method2084((byte) -105, 0, 0, 128);
        var1.method2084((byte) 94, 0, 0, -128);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class358.field5204[var3];
            int var5 = class358.field5203[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class358.field5203[var12] >> 8;
                int var14 = class358.field5204[var12] * var4 >> 23;
                int var15 = class358.field5204[var12] * var5 >> 23;
                var1.method2084((byte) -128, var15, -var14, var13);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method2088(0, var7, (short) 0, var8, (byte) 0, (byte) 0, (byte) 0, 1, (short) 127);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method2088(var8, var7, (short) 0, var10, (byte) 0, (byte) 0, (byte) 0, 1, (short) 127);
                    var1.method2088(var10, var7, (short) 0, var11, (byte) 0, (byte) 0, (byte) 0, 1, (short) 127);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method2088(var7, 1, (short) 0, var8, (byte) 0, (byte) 0, (byte) 0, 1, (short) 127);
            }
        }
        var1.field4853 = var1.field4877;
        var1.field4890 = null;
        var1.field4893 = null;
        var1.field4876 = null;
        field2017 = arg0.method225(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIII)Z", line = 95)
    public final boolean method947(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field2021) {
            this.field2012 = 1073741823;
            var8 = this.field2008;
            var9 = this.field2018;
            var10 = this.field2005;
        } else {
            int var5 = this.field2008 - arg0;
            int var6 = this.field2018 - arg1;
            int var7 = this.field2005 - arg2;
            this.field2012 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field2012 == 0) {
                this.field2012 = 1;
            }
            var8 = (var5 << 8) / this.field2012;
            var9 = (var6 << 8) / this.field2012;
            var10 = (var7 << 8) / this.field2012;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field2006 = this.field2011 * arg3 / (this.field2021 ? 1024 : this.field2012);
        } else {
            this.field2006 = 0;
        }
        if (this.field2006 < 8) {
            this.field2010 = null;
            return false;
        }
        int var12 = class487.method2869(1366891568, this.field2006);
        if (var12 > arg3) {
            var12 = class285.method1834(-105, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field2007 != var12) {
            this.field2007 = var12;
        }
        this.field2020 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field2015 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field2010 = null;
        return true;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lqa;Lkk;)Z", line = 155)
    public final boolean method948(class167 arg0, class129 arg1) {
        return this.field2010 != null || this.method950(arg0, arg1);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "()V", line = 158)
    public static void method949() {
        field2017 = null;
        field2009 = null;
        field2014 = null;
        field2016 = null;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(Lqa;Lkk;)Z", line = 166)
    private final boolean method950(class167 arg0, class129 arg1) {
        if (this.field2010 == null) {
            if (this.field2022 == 0) {
                if (class483.field7009.method92(12624, this.field2013)) {
                    int[] var3 = class483.field7009.method91(this.field2007, false, this.field2007, this.field2013, 0.7F, (byte) 26);
                    this.field2010 = arg0.method284(var3, 0, this.field2007, this.field2007, this.field2007);
                }
            } else if (this.field2022 == 2) {
                this.method956(arg0, arg1);
            } else if (this.field2022 == 1) {
                this.method953(arg0, arg1);
            }
        }
        return this.field2010 != null;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "()V", line = 201)
    public final void method951() {
        this.field2010 = null;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(Lqa;)V", line = 205)
    private static final void method952(class167 arg0) {
        if (field2014 != null) {
            return;
        }
        int[] var1 = new int[16384];
        int[] var2 = new int[16384];
        for (int var3 = 0; var3 < 64; var3++) {
            int var4 = 64 - var3;
            int var5 = var4 * var4;
            int var6 = 128 - var3 - 1;
            int var7 = var3 * 128;
            int var8 = var6 * 128;
            for (int var9 = 0; var9 < 64; var9++) {
                int var10 = 64 - var9;
                int var11 = var10 * var10;
                int var12 = 128 - var9 - 1;
                int var13 = 256 - (var5 + var11 << 8) / 4096;
                int var14 = var13 * 16 * 192 / 1536;
                if (var14 < 0) {
                    var14 = 0;
                } else if (var14 > 255) {
                    var14 = 255;
                }
                int var15 = var14 / 2;
                var2[var7 + var9] = var2[var7 + var12] = var2[var8 + var9] = var2[var8 + var12] = var14 | 0xFF00 << 16;
                var1[var7 + var9] = var1[var7 + var12] = var1[var8 + var9] = var1[var8 + var12] = 127 - var15 << 24 | 0xFFFFFF;
            }
        }
        field2014 = arg0.method284(var2, 0, 128, 128, 128);
        field2009 = arg0.method284(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(Lqa;Lkk;)V", line = 269)
    private final void method953(class167 arg0, class129 arg1) {
        method946(arg0);
        method952(arg0);
        arg0.method246(field2016);
        arg0.method345(0, 0, this.field2007, this.field2007);
        arg0.method268();
        arg0.method215(0, 0, this.field2007, this.field2007, this.field2019 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field2021) {
                var3 = -arg1.field2008;
                var4 = -arg1.field2018;
                var5 = -arg1.field2005;
            } else {
                var3 = arg1.field2008 - this.field2008;
                var4 = arg1.field2018 - this.field2018;
                var5 = arg1.field2005 - this.field2005;
            }
        }
        if (this.field2020 != 0) {
            int var6 = class358.field5204[this.field2020];
            int var7 = class358.field5203[this.field2020];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field2015 != 0) {
            int var9 = class358.field5204[this.field2015];
            int var10 = class358.field5203[this.field2015];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class336 var12 = field2017.method1154((byte) 0, 51200, true);
        if (arg0.method329()) {
            var12.method1138((short) 0, (short) this.field2013);
        } else {
            var12.method1163((short) 127, class483.field7009.method93((byte) -122, this.field2013).field828);
            var12.method1138((short) 0, (short) -1);
        }
        arg0.method331(1.0F);
        arg0.method194(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field2007 * 1024 / (var12.method1164() - var12.method1137());
        if (this.field2019 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method325(this.field2007 / 2, this.field2007 / 2, var13, var13);
        arg0.method209(arg0.method245());
        class15 var14 = arg0.method245();
        var14.method47(0, 0, arg0.method197() - var12.method1139());
        var12.method1153(var14, null, 1024, 1);
        int var15 = this.field2007 * 13 / 16;
        int var16 = (this.field2007 - var15) / 2;
        field2009.method372(var16, var16, var15, var15, 0, this.field2019 | 0xFF000000, 1);
        this.field2010 = arg0.method255(0, 0, this.field2007, this.field2007, true);
        arg0.method268();
        arg0.method215(0, 0, this.field2007, this.field2007, 0, 0);
        field2014.method372(0, 0, this.field2007, this.field2007, 1, 0, 0);
        this.field2010.method369(0, 0, 0);
        arg0.method345(field2016[0], field2016[1], field2016[2], field2016[3]);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lqa;IIIIII)V", line = 363)
    public final void method954(class167 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field2010 == null) {
            return;
        }
        int var8 = this.field2020 - arg5 & 0x3FFF;
        int var9 = this.field2015 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field2006) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field2006) / 2;
        if (var10 < arg4 && this.field2006 + var10 > 0 && var11 < arg3 && this.field2006 + var11 > 0) {
            this.field2010.method2169(arg1 + var11, arg2 + var10, this.field2006, this.field2006);
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "()V", line = 390)
    public static final void method955() {
        field2017 = null;
        field2014 = null;
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(Lqa;Lkk;)V", line = 396)
    private final void method956(class167 arg0, class129 arg1) {
        class330 var3 = class494.method2904(class83.field1320, 0, this.field2013, -3808);
        if (var3 == null) {
            return;
        }
        arg0.method246(field2016);
        arg0.method345(0, 0, this.field2007, this.field2007);
        arg0.method215(0, 0, this.field2007, this.field2007, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field2021) {
                var4 = -arg1.field2008;
                var5 = -arg1.field2018;
                var6 = -arg1.field2005;
            } else {
                var4 = this.field2008 - arg1.field2008;
                var5 = this.field2018 - arg1.field2018;
                var6 = this.field2005 - arg1.field2005;
            }
        }
        if (this.field2020 != 0) {
            int var7 = -this.field2020 & 0x3FFF;
            int var8 = class358.field5204[var7];
            int var9 = class358.field5203[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field2015 != 0) {
            int var11 = -this.field2015 & 0x3FFF;
            int var12 = class358.field5204[var11];
            int var13 = class358.field5203[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method331(1.0F);
        arg0.method194(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class336 var15 = arg0.method225(var3, 2048, 0, 64, 768);
        int var16 = var15.method1164() - var15.method1137();
        int var17 = var15.method1147() - var15.method1130();
        int var18 = var15.method1137() + var16 / 2;
        int var19 = var15.method1130() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method325(var18, var19, var20, var20);
        arg0.method209(arg0.method245());
        class15 var21 = arg0.method312();
        var21.method47(0, 0, arg0.method197() - var15.method1139());
        var15.method1153(var21, null, arg0.method197(), 1);
        this.field2010 = arg0.method255(0, 0, this.field2007, this.field2007, true);
        this.field2010.method369(0, 0, 3);
        arg0.method345(field2016[0], field2016[1], field2016[2], field2016[3]);
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 478)
    public class129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field2008 = arg2;
        this.field2018 = arg3;
        this.field2005 = arg4;
        this.field2021 = arg7;
        this.field2013 = arg1;
        this.field2019 = arg6;
        this.field2011 = arg5;
        this.field2022 = arg0;
    }
}
