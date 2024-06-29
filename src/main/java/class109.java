import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class109 extends class240 {

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
    private int field2010 = 4096;

    @OriginalMember(owner = "client!eb", name = "X", descriptor = "Z")
    private boolean field2018 = true;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "Lcd;")
    public static class64 field2009 = class44.method335((byte) 71, "Abbrechen");

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "Z")
    public static boolean field2015 = true;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIII)Z", line = 9)
    public static final boolean method791(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class233.field3945 * arg3 + class216.field3630 * arg0 >> 16;
        int var6 = class216.field3630 * arg3 - class233.field3945 * arg0 >> 16;
        int var7 = class296.field5101 * var6 + class172.field2965 * arg1 >> 16;
        int var8 = class296.field5101 * arg1 - class172.field2965 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class296.field5101 * var6 + class172.field2965 * arg2 >> 16;
        int var12 = class296.field5101 * arg2 - class172.field2965 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class290.field4964 && var13 < class290.field4964) {
            return false;
        } else if (var9 > class181.field3113 && var13 > class181.field3113) {
            return false;
        } else if (var10 < class61.field1186 && var14 < class61.field1186) {
            return false;
        } else {
            return var10 <= class66.field1307 || var14 <= class66.field1307;
        }
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(III)Lrd;", line = 56)
    public static final class162 method792(int arg0, int arg1, int arg2) {
        class295 var3 = class304.field5203[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class162 var4 = var3.field5092;
            var3.field5092 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V", line = 68)
    public class109() {
        super(1, false);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZ)V", line = 72)
    public static final void method793(int arg0, boolean arg1) {
        field2014++;
        byte[][] var2;
        byte var3;
        if (class123.field2216 && arg1) {
            var2 = class97.field1768;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class13.field268;
        }
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = (class89.field1611[var5] >> 8) * 64 - class190.field3269;
            int var7 = (class89.field1611[var5] & 0xFF) * 64 - class121.field2184;
            byte[] var8 = var2[var5];
            if (var8 != null) {
                class246.method1778(5);
                class189.method1339(var8, var7, true, (class295.field5066 - 6) * 8, class91.field1637, class233.field3931 * 8 - 48, arg1, var6);
            }
        }
        int var9 = 0;
        if (arg0 >= -98) {
            return;
        }
        while (var4 > var9) {
            int var10 = (class89.field1611[var9] >> 8) * 64 - class190.field3269;
            int var11 = (class89.field1611[var9] & 0xFF) * 64 - class121.field2184;
            byte[] var12 = var2[var9];
            if (var12 == null && class233.field3931 < 800) {
                class246.method1778(5);
                for (int var13 = 0; var13 < var3; var13++) {
                    class60.method464(false, var11, var10, 64, 64, var13);
                }
            }
            var9++;
        }
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(III)Log;", line = 144)
    public static final class195 method794(int arg0, int arg1, int arg2) {
        class295 var3 = class304.field5203[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field5075; var4++) {
            class195 var5 = var3.field5090[var4];
            if ((var5.field3324 >> 29 & 0x3L) == 2L && var5.field3313 == arg1 && var5.field3322 == arg2) {
                class220.method1570(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)V", line = 169)
    public static final void method795(int arg0) {
        field2017++;
        int var1 = class2.field14;
        if (arg0 != 0) {
            method797(100, 23, -115);
        }
        int var2 = class277.field4774;
        int var3 = class2.field7 - class58.field960 - var2;
        int var4 = class34.field549 - class13.field290 - var1;
        if (var1 <= 0 && var4 <= 0 && var2 <= 0 && var3 <= 0) {
            return;
        }
        try {
            int var5 = 0;
            int var6 = 0;
            Container var7;
            if (class263.field4514 != null) {
                var7 = class263.field4514;
            } else if (class27.field441 == null) {
                var7 = class228.field3876.field4845;
            } else {
                var7 = class27.field441;
            }
            if (class27.field441 == var7) {
                Insets var8 = class27.field441.getInsets();
                var5 = var8.left;
                var6 = var8.top;
            }
            Graphics var9 = var7.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var5, var6, var1, class2.field7);
            }
            if (var2 > 0) {
                var9.fillRect(var5, var6, class34.field549, var2);
            }
            if (var4 > 0) {
                var9.fillRect(class34.field549 + var5 - var4, var6, var4, class2.field7);
            }
            if (var3 > 0) {
                var9.fillRect(var5, class2.field7 + var6 - var3, class34.field549, var3);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "(I)V", line = 236)
    public static void method796(int arg0) {
        if (arg0 != 9) {
            method795(93);
        }
        field2009 = null;
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(III)Luc;", line = 246)
    public static final class180 method797(int arg0, int arg1, int arg2) {
        class295 var3 = class304.field5203[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class180 var4 = var3.field5083;
            var3.field5083 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILkh;)V", line = 257)
    public final void method16(int arg0, int arg1, class13 arg2) {
        field2013++;
        if (arg1 == 0) {
            this.field2010 = arg2.method112((byte) 92);
        } else if (arg1 == 1) {
            this.field2018 = arg2.method152((byte) -99) == 1;
        }
        if (arg0 != 2) {
            method795(76);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)[[I", line = 316)
    public final int[][] method286(byte arg0, int arg1) {
        field2011++;
        if (arg0 < 34) {
            method797(-9, 56, -31);
        }
        int[][] var3 = this.field4095.method1797(arg1, -92);
        if (this.field4095.field4355) {
            int[] var4 = this.method1745(class74.field1407 & arg1 - 1, 0, (byte) 115);
            int[] var5 = this.method1745(arg1, 0, (byte) 114);
            int[] var6 = this.method1745(arg1 + 1 & class74.field1407, 0, (byte) 122);
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            for (int var10 = 0; var10 < class169.field2936; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field2010;
                int var12 = (var5[class132.field2356 & var10 + 1] - var5[var10 - 1 & class132.field2356]) * this.field2010;
                int var13 = var11 >> 12;
                int var14 = var12 >> 12;
                int var15 = var14 * var14 >> 12;
                int var16 = var13 * var13 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var19 = 0;
                    var20 = 0;
                    var18 = 0;
                } else {
                    var18 = var12 / var17;
                    var19 = var11 / var17;
                    var20 = 16777216 / var17;
                }
                if (this.field2018) {
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var9[var10] = var18;
                var8[var10] = var19;
                var7[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIZIII)V", line = 400)
    public static final void method798(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field2016++;
        int var7 = class160.method1155(class201.field3444, class180.field3098, 268435455, arg6);
        int var8 = class160.method1155(class201.field3444, class180.field3098, 268435455, arg0);
        int var9 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg4);
        int var10 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg1);
        int var11 = class160.method1155(class201.field3444, class180.field3098, 268435455, arg6 + arg2);
        int var12 = class160.method1155(class201.field3444, class180.field3098, 268435455, arg0 - arg2);
        for (int var13 = var7; var13 < var11; var13++) {
            class31.method268(var10, 119, var9, class124.field2241[var13], arg5);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class31.method268(var10, 123, var9, class124.field2241[var14], arg5);
        }
        int var15 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg4 + arg2);
        int var16 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg1 - arg2);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class124.field2241[var17];
            class31.method268(var15, 125, var9, var18, arg5);
            class31.method268(var10, 125, var16, var18, arg5);
        }
        if (!arg3) {
            field2015 = false;
        }
    }
}
