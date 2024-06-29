import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class116 extends Canvas {

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "Ljava/awt/Component;")
    private Component field1782;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "Z")
    public static boolean field1774 = false;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "[I")
    public static int[] field1780 = new int[100];

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "Z")
    public static boolean field1776 = false;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!ok", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 10)
    public final void paint(Graphics arg0) {
        this.field1782.paint(arg0);
        field1778++;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLl;ZLl;)V", line = 27)
    public static final void method854(byte arg0, class133 arg1, boolean arg2, class133 arg3) {
        if (arg0 >= 11) {
            class123.field1899 = arg3;
            class175.field2649 = arg1;
            class201.field3025 = arg2;
            field1777++;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V", line = 43)
    public static void method855(int arg0) {
        field1780 = null;
        if (arg0 != 1) {
            method860(81, 120);
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V", line = 53)
    public static final void method856(int arg0) {
        field1773++;
        if (arg0 >= -32) {
            field1774 = false;
        }
        class30.field441.method2174(-10385);
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V", line = 64)
    public static final void method857(int arg0) {
        field1772++;
        if (class7.field82 == -1 || class7.field84 == -1) {
            return;
        }
        int var1 = ((class160.field2406 - class43.field692) * class78.field1262 >> 16) + class43.field692;
        class78.field1262 += var1;
        if (class78.field1262 >= 65535) {
            if (class83.field1299) {
                class48.field778 = false;
            } else {
                class48.field778 = true;
            }
            class83.field1299 = true;
            class78.field1262 = 65535;
        } else {
            class48.field778 = false;
            class83.field1299 = false;
        }
        float var2 = (float) class78.field1262 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class44.field715 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class18.field248[class7.field82][var4][var5] * 3;
            int var7 = class18.field248[class7.field82][var4 + 1][var5] * 3;
            int var8 = (class18.field248[class7.field82][var4 + 2][var5] + class18.field248[class7.field82][var4 + 2][var5] - class18.field248[class7.field82][var4 + 3][var5]) * 3;
            int var9 = class18.field248[class7.field82][var4][var5];
            int var10 = var7 - var6;
            int var11 = var6 + var8 - (var7 * 2);
            int var12 = class18.field248[class7.field82][var4 + 2][var5] + var7 - var9 - var8;
            var3[var5] = (((float) var12 * var2 + (float) var11) * var2 + (float) var10) * var2 + (float) var9;
        }
        class337.field5278 = (int) var3[0] - (class213.field3249 * 128);
        class265.field4116 = (int) var3[2] - (class342.field5328 * 128);
        class258.field4052 = (int) var3[1] * -1;
        float[] var13 = new float[3];
        if (arg0 >= -8) {
            return;
        }
        int var14 = class63.field1006 * 2;
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class18.field248[class7.field84][var14 + 1][var15] * 3;
            int var17 = class18.field248[class7.field84][var14][var15] * 3;
            int var18 = (class18.field248[class7.field84][var14 + 2][var15] + class18.field248[class7.field84][var14 + 2][var15] - class18.field248[class7.field84][var14 - -3][var15]) * 3;
            int var19 = class18.field248[class7.field84][var14][var15];
            int var20 = var17 + var18 - var16 * 2;
            int var21 = class18.field248[class7.field84][var14 + 2][var15] + var16 - var19 - var18;
            int var22 = var16 - var17;
            var13[var15] = (((float) var21 * var2 + (float) var20) * var2 + (float) var22) * var2 + (float) var19;
        }
        float var23 = var13[0] - var3[0];
        float var24 = (var13[1] - var3[1]) * -1.0F;
        float var25 = var13[2] - var3[2];
        double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
        class78.field1258 = (float) Math.atan2((double) var24, var26);
        class75.field1214 = -((float) Math.atan2((double) var23, (double) var25));
        class194.field2897 = (int) ((double) class78.field1258 * 325.949D) & 0x7FF;
        class218.field3323 = (int) ((double) class75.field1214 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!ok", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 174)
    public final void update(Graphics arg0) {
        field1779++;
        this.field1782.update(arg0);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIILwb;Lwb;IIJ)V", line = 182)
    public static final void method858(int arg0, int arg1, int arg2, int arg3, class253 arg4, class253 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class103 var10 = new class103();
        var10.field1602 = arg8;
        var10.field1604 = arg1 * 128 + 64;
        var10.field1601 = arg2 * 128 + 64;
        var10.field1608 = arg3;
        var10.field1598 = arg4;
        var10.field1600 = arg5;
        var10.field1595 = arg6;
        var10.field1605 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class256.field4013[var11][arg1][arg2] == null) {
                class256.field4013[var11][arg1][arg2] = new class142(var11, arg1, arg2);
            }
        }
        class256.field4013[arg0][arg1][arg2].field2213 = var10;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IC)Z", line = 208)
    public static final boolean method859(int arg0, char arg1) {
        field1775++;
        if (arg0 != 160) {
            method857(-81);
        }
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            int var2 = 0;
            char[] var3 = class297.field4586;
            while (var3.length > var2) {
                char var4 = var3[var2];
                if (arg1 == var4) {
                    return true;
                }
                var2++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 243)
    public class116(Component arg0) {
        this.field1782 = arg0;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)V", line = 255)
    public static final void method860(int arg0, int arg1) {
        class265.field4119 = arg0;
        class273.field4228 = -1;
        int var2 = -48 % ((-arg1 - 15) / 61);
        field1781++;
        class54.field911 = -1;
        class17.method137(-28707);
    }
}
