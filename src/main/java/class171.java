import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class171 extends class59 {

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "I")
    private int field2812 = 32768;

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "Lph;")
    public static class229 field2806 = class266.method1858("Null", 0);

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "Z")
    public static boolean field2807 = true;

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "I")
    public static int field2817 = 0;

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "[I")
    public static int[] field2819 = new int[25];

    @OriginalMember(owner = "client!wd", name = "T", descriptor = "[I")
    public static int[] field2816 = new int[128];

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!wd", name = "Q", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!wd", name = "V", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "Lsi;")
    public static class66 field2811;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZI)[I", line = 7)
    public final int[] method63(boolean arg0, int arg1) {
        if (!arg0) {
            method1245(-88, 10L);
        }
        field2808++;
        int[] var3 = this.field846.method383(3583, arg1);
        if (this.field846.field811) {
            int[] var4 = this.method394(arg1, 1, (byte) 121);
            int[] var5 = this.method394(arg1, 2, (byte) -85);
            for (int var6 = 0; var6 < class293.field4789; var6++) {
                int var7 = (var4[var6] & 0xFFA) >> 4;
                int var8 = var5[var6] * this.field2812 >> 12;
                int var9 = class198.field3288[var7] * var8 >> 12;
                int var10 = class51.field730[var7] * var8 >> 12;
                int var11 = class33.field544 & (var9 >> 12) + arg1;
                int var12 = (var10 >> 12) + var6 & class4.field51;
                int[] var13 = this.method394(var11, 0, (byte) -35);
                var3[var6] = var13[var12];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V", line = 54)
    public class171() {
        super(3, false);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BILhb;)V", line = 59)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        field2818++;
        if (arg1 == 0) {
            this.field2812 = arg2.method1161(true) << 4;
        } else if (arg1 == 1) {
            this.field841 = arg2.method1178(8) == 1;
        }
        if (arg0 != 115) {
            method1244(-46, -119);
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V", line = 96)
    public static void method1242(byte arg0) {
        field2819 = null;
        field2806 = null;
        field2811 = null;
        field2816 = null;
        if (arg0 != -124) {
            method1242((byte) -110);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)V", line = 109)
    public static final void method1243(byte arg0, int arg1) {
        field2809++;
        short var2 = 256;
        if (var2 < arg1) {
            arg1 = var2;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class113.field1923 += arg1 * 128;
        if (class316.field5374.length < class113.field1923) {
            class113.field1923 -= class316.field5374.length;
            int var3 = (int) (Math.random() * 12.0D);
            class129.method932(-97, class19.field256[var3]);
        }
        int var4 = arg1 * 128;
        int var5 = (var2 - arg1) * 128;
        int var6 = 0;
        if (arg0 < 54) {
            return;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = class208.field3432[var4 + var6] - class316.field5374[class316.field5374.length - 1 & var6 - -class113.field1923] * arg1 / 6;
            if (var8 < 0) {
                var8 = 0;
            }
            class208.field3432[var6++] = var8;
        }
        for (int var9 = var2 - arg1; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class208.field3432[var10 + var11] = 255;
                } else {
                    class208.field3432[var11 + var10] = 0;
                }
            }
        }
        for (int var13 = 0; var13 < (var2 - arg1); var13++) {
            class243.field4003[var13] = class243.field4003[arg1 + var13];
        }
        for (int var14 = var2 - arg1; var14 < var2; var14++) {
            class243.field4003[var14] = (int) (Math.sin((double) class306.field5123 / 14.0D) * 16.0D + Math.sin((double) class306.field5123 / 15.0D) * 14.0D + Math.sin((double) class306.field5123 / 16.0D) * 12.0D);
            class306.field5123++;
        }
        class170.field2799 += arg1;
        int var15 = ((class319.field5393 & 0x1) + arg1) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class170.field2799; var16++) {
            int var17 = (int) (Math.random() * 128.0D) + 128;
            int var18 = (int) (Math.random() * 124.0D) + 2;
            class208.field3432[(var17 << 7) + var18] = 192;
        }
        class170.field2799 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = var19 * 128;
            int var21 = 0;
            for (int var22 = -var15; var22 < 128; var22++) {
                if ((var22 + var15) < 128) {
                    var21 += class208.field3432[var20 + var22 + var15];
                }
                if ((var22 - var15 - 1) >= 0) {
                    var21 -= class208.field3432[var20 + var22 - var15 - 1];
                }
                if (var22 >= 0) {
                    class193.field3187[var20 + var22] = var21 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if ((var15 + var25) < var2) {
                    var24 += class193.field3187[var23 + var26 + (var15 * 128)];
                }
                if (var25 - var15 - 1 >= 0) {
                    var24 -= class193.field3187[var26 + var23 - ((var15 + 1) * 128)];
                }
                if (var25 >= 0) {
                    class208.field3432[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)V", line = 291)
    public static final void method1244(int arg0, int arg1) {
        class235.field3882.method1418((byte) -17, arg0);
        class119.field1996.method1418((byte) -17, arg0);
        class12.field165.method1418((byte) -17, arg0);
        field2815++;
        if (arg1 != 255) {
            field2807 = true;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IJ)Lph;", line = 306)
    public static final class229 method1245(int arg0, long arg1) {
        class162.field2617.setTime(new Date(arg1));
        field2813++;
        if (arg0 != 10) {
            method1245(-54, 14L);
        }
        int var3 = class162.field2617.get(7);
        int var4 = class162.field2617.get(5);
        int var5 = class162.field2617.get(2);
        int var6 = class162.field2617.get(1);
        int var7 = class162.field2617.get(11);
        int var8 = class162.field2617.get(12);
        int var9 = class162.field2617.get(13);
        return class248.method1746(8528, new class229[] { class174.field2867[var3 - 1], class168.field2773, class50.method354(0, var4 / 10), class50.method354(0, var4 % 10), class328.field5588, class323.field5506[var5], class328.field5588, class50.method354(arg0 - 10, var6), class232.field3832, class50.method354(arg0 ^ 0xA, var7 / 10), class50.method354(0, var7 % 10), class299.field4861, class50.method354(0, var8 / 10), class50.method354(0, var8 % 10), class299.field4861, class50.method354(0, var9 / 10), class50.method354(0, var9 % 10), class26.field348 });
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(II)I", line = 333)
    public static final int method1246(int arg0, int arg1) {
        if (arg1 == 255) {
            field2810++;
            return arg0 & 0xFF;
        } else {
            return 93;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)[[I", line = 348)
    public final int[][] method116(int arg0, int arg1) {
        if (arg1 != 4588) {
            this.method63(true, 41);
        }
        int[][] var3 = this.field838.method1796(true, arg0);
        if (this.field838.field4334) {
            int[] var4 = this.method394(arg0, 1, (byte) -121);
            int[] var5 = this.method394(arg0, 2, (byte) 104);
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            int[] var8 = var3[0];
            for (int var9 = 0; var9 < class293.field4789; var9++) {
                int var10 = var4[var9] * 255 >> 12 & 0xFF;
                int var11 = var5[var9] * this.field2812 >> 12;
                int var12 = class51.field730[var10] * var11 >> 12;
                int var13 = class4.field51 & (var12 >> 12) + var9;
                int var14 = class198.field3288[var10] * var11 >> 12;
                int var15 = (var14 >> 12) + arg0 & class33.field544;
                int[][] var16 = this.method397(1, 0, var15);
                var8[var9] = var16[0][var13];
                var6[var9] = var16[1][var13];
                var7[var9] = var16[2][var13];
            }
        }
        field2805++;
        return var3;
    }

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "(I)V", line = 407)
    public final void method65(int arg0) {
        if (arg0 >= 110) {
            class189.method1320(4096);
            field2814++;
        }
    }
}
