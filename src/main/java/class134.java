import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class134 extends Canvas {

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "Ljava/awt/Component;")
    private Component field3262;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "Ljd;")
    public static class58 field3260 = new class58();

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "[I")
    public static int[] field3267 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "Lgd;")
    private static class40 field3272 = class14.method90(false, "No response from server)3");

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "Lgd;")
    public static class40 field3269 = field3272;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "Lba;")
    public static class7 field3270 = new class7(30);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "Lrb;")
    public static class103 field3273;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "Lhd;")
    public static class46 field3274;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "[I")
    public static int[] field3271;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V", line = 9)
    public static final void method1047(int arg0, int arg1) {
        class112.field2704 = arg0;
        if (arg1 == 8) {
            field3266++;
        }
    }

    @OriginalMember(owner = "client!wc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 21)
    public final void paint(Graphics arg0) {
        this.field3262.paint(arg0);
        field3268++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V", line = 33)
    public static void method1048(boolean arg0) {
        field3260 = null;
        field3267 = null;
        field3272 = null;
        field3269 = null;
        field3271 = null;
        field3273 = null;
        field3270 = null;
        if (!arg0) {
            field3274 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)Z", line = 61)
    public static final boolean method1049(int arg0) {
        if (arg0 != 16681) {
            field3271 = null;
        }
        field3265++;
        return class114.field2744 != null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII)Z", line = 73)
    public static final boolean method1050(int arg0, int arg1, int arg2, int arg3) {
        field3264++;
        int var4 = arg3 >> 14 & 0x7FFF;
        int var5 = class21.field490.method957(class99.field2361, arg0, arg1, arg3);
        if (var5 == -1) {
            return false;
        }
        int var6 = var5 & 0x1F;
        int var7 = var5 >> 6 & 0x3;
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class14 var8 = class114.method884(var4, (byte) -56);
            int var9;
            int var10;
            if (var7 == 0 || var7 == 2) {
                var9 = var8.field363;
                var10 = var8.field370;
            } else {
                var9 = var8.field370;
                var10 = var8.field363;
            }
            int var11 = var8.field401;
            if (var7 != 0) {
                var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
            }
            class128.method1015(0, class13.field332.field803[0], arg0, arg1, class13.field332.field819[0], true, var10, 0, var9, 2, (byte) 111, var11);
        } else {
            class128.method1015(var6 + 1, class13.field332.field803[0], arg0, arg1, class13.field332.field819[0], true, 0, var7, 0, 2, (byte) 95, 0);
        }
        if (arg2 != 2048) {
            return true;
        }
        class92.field2096 = 0;
        class30.field653 = class132.field3191;
        class35.field895 = class90.field2041;
        class96.field2238 = 2;
        return true;
    }

    @OriginalMember(owner = "client!wc", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 127)
    public final void update(Graphics arg0) {
        this.field3262.update(arg0);
        field3258++;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 134)
    public class134(Component arg0) {
        this.field3262 = arg0;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLrb;)V", line = 147)
    public static final void method1051(byte arg0, class103 arg1) {
        if (arg0 != 66) {
            method1050(-80, -40, -116, -77);
        }
        class30.field681 = arg1;
        field3255++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V", line = 166)
    public static final void method1052(byte arg0) {
        field3257++;
        int var1 = 57 % ((arg0 - 19) / 62);
        int var2 = class128.field3020 * 128 + 64;
        int var3 = client.field464 * 128 + 64;
        int var4 = class58.method439(var3, var2, false, class99.field2361) - class16.field429;
        if (class24.field573 < var3) {
            class24.field573 += (var3 - class24.field573) * class125.field2978 / 1000 + class34.field875;
            if (class24.field573 > var3) {
                class24.field573 = var3;
            }
        }
        if (class24.field573 > var3) {
            class24.field573 -= (class24.field573 - var3) * class125.field2978 / 1000 + class34.field875;
            if (class24.field573 < var3) {
                class24.field573 = var3;
            }
        }
        int var5 = class42.field1058 * 128 + 64;
        if (class113.field2735 < var4) {
            class113.field2735 += (var4 - class113.field2735) * class125.field2978 / 1000 + class34.field875;
            if (var4 < class113.field2735) {
                class113.field2735 = var4;
            }
        }
        if (class64.field1561 < var2) {
            class64.field1561 += class34.field875 + (var2 - class64.field1561) * class125.field2978 / 1000;
            if (var2 < class64.field1561) {
                class64.field1561 = var2;
            }
        }
        if (class113.field2735 > var4) {
            class113.field2735 -= (class113.field2735 - var4) * class125.field2978 / 1000 + class34.field875;
            if (class113.field2735 < var4) {
                class113.field2735 = var4;
            }
        }
        if (class64.field1561 > var2) {
            class64.field1561 -= (class64.field1561 - var2) * class125.field2978 / 1000 + class34.field875;
            if (class64.field1561 < var2) {
                class64.field1561 = var2;
            }
        }
        int var6 = class108.field2636 * 128 + 64;
        int var7 = class58.method439(var5, var6, false, class99.field2361) - class54.field1361;
        int var8 = var5 - class24.field573;
        int var9 = var7 - class113.field2735;
        int var10 = var6 - class64.field1561;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 0x7FF;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        int var13 = (int) (Math.atan2((double) var10, (double) var8) * -325.949D) & 0x7FF;
        if (var12 > class53.field1350) {
            class53.field1350 += (var12 - class53.field1350) * class18.field434 / 1000 + class90.field2047;
            if (var12 < class53.field1350) {
                class53.field1350 = var12;
            }
        }
        if (class53.field1350 > var12) {
            class53.field1350 -= (class53.field1350 - var12) * class18.field434 / 1000 + class90.field2047;
            if (var12 > class53.field1350) {
                class53.field1350 = var12;
            }
        }
        int var14 = var13 - class128.field3073;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            class128.field3073 += class18.field434 * var14 / 1000 + class90.field2047;
            class128.field3073 &= 0x7FF;
        }
        if (var14 < 0) {
            class128.field3073 -= -var14 * class18.field434 / 1000 + class90.field2047;
            class128.field3073 &= 0x7FF;
        }
        int var15 = var13 - class128.field3073;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class128.field3073 = var13;
        }
    }
}
