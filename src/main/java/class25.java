import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class25 extends class208 {

    @OriginalMember(owner = "client!na", name = "p", descriptor = "I")
    public int field384;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "[Z")
    public boolean[] field381;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "[I")
    public int[] field387;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "[[I")
    public int[][] field391;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "Lve;")
    public static class255 field382 = class87.method607(82, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!na", name = "u", descriptor = "Lve;")
    public static class255 field389 = class87.method607(29, "Ablegen");

    @OriginalMember(owner = "client!na", name = "r", descriptor = "I")
    public static int field386 = -1;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "Lve;")
    private static class255 field393 = class87.method607(108, "shake:");

    @OriginalMember(owner = "client!na", name = "z", descriptor = "Lve;")
    public static class255 field394 = class87.method607(44, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!na", name = "A", descriptor = "Lve;")
    public static class255 field395 = field393;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "Lve;")
    public static class255 field379 = field393;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "I")
    public static int field392 = 127;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "Lwl;")
    public static class81 field383 = new class81(30);

    @OriginalMember(owner = "client!na", name = "E", descriptor = "Lve;")
    private static class255 field399 = class87.method607(32, "Nov");

    @OriginalMember(owner = "client!na", name = "C", descriptor = "Lve;")
    public static class255 field397 = class87.method607(119, ")2");

    @OriginalMember(owner = "client!na", name = "G", descriptor = "Lve;")
    private static class255 field401 = class87.method607(113, "Apr");

    @OriginalMember(owner = "client!na", name = "I", descriptor = "Lve;")
    private static class255 field403 = class87.method607(30, "Feb");

    @OriginalMember(owner = "client!na", name = "D", descriptor = "Lve;")
    private static class255 field398 = class87.method607(86, "Dec");

    @OriginalMember(owner = "client!na", name = "L", descriptor = "[I")
    public static int[] field406 = new int[50];

    @OriginalMember(owner = "client!na", name = "B", descriptor = "Lve;")
    private static class255 field396 = class87.method607(41, "Jun");

    @OriginalMember(owner = "client!na", name = "M", descriptor = "Lve;")
    public static class255 field407 = class87.method607(68, "(R");

    @OriginalMember(owner = "client!na", name = "H", descriptor = "Lve;")
    private static class255 field402 = class87.method607(62, "Mar");

    @OriginalMember(owner = "client!na", name = "O", descriptor = "Lve;")
    private static class255 field409 = class87.method607(79, "May");

    @OriginalMember(owner = "client!na", name = "N", descriptor = "Lve;")
    public static class255 field408 = class87.method607(78, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!na", name = "J", descriptor = "Lve;")
    private static class255 field404 = class87.method607(43, "Aug");

    @OriginalMember(owner = "client!na", name = "K", descriptor = "Lve;")
    private static class255 field405 = class87.method607(60, "Jan");

    @OriginalMember(owner = "client!na", name = "S", descriptor = "Lve;")
    private static class255 field413 = class87.method607(91, "Sep");

    @OriginalMember(owner = "client!na", name = "P", descriptor = "[I")
    public static int[] field410 = new int[50];

    @OriginalMember(owner = "client!na", name = "R", descriptor = "Lve;")
    private static class255 field412 = class87.method607(26, "Oct");

    @OriginalMember(owner = "client!na", name = "F", descriptor = "Lve;")
    private static class255 field400 = class87.method607(64, "Jul");

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "[Lve;")
    public static class255[] field411 = new class255[] { field405, field403, field402, field401, field409, field396, field400, field404, field413, field412, field399, field398 };

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V", line = 7)
    public static final void method138(int arg0) {
        field388++;
        int var1 = class111.field1876 * 128 + 64;
        int var2 = class47.field696 * 128 + 64;
        int var3 = class113.method861((byte) -88, var1, var2, client.field4039) - class56.field876;
        if (class208.field3569 < 100) {
            if (class153.field2599 < var3) {
                class153.field2599 += class92.field1575 + ((var3 - class153.field2599) * class208.field3569 / 1000);
                if (var3 < class153.field2599) {
                    class153.field2599 = var3;
                }
            }
            if (var3 < class153.field2599) {
                class153.field2599 -= (class153.field2599 - var3) * class208.field3569 / 1000 + class92.field1575;
                if (var3 > class153.field2599) {
                    class153.field2599 = var3;
                }
            }
            if (var1 > class221.field3723) {
                class221.field3723 += (var1 - class221.field3723) * class208.field3569 / 1000 + class92.field1575;
                if (class221.field3723 > var1) {
                    class221.field3723 = var1;
                }
            }
            if (var1 < class221.field3723) {
                class221.field3723 -= (class221.field3723 - var1) * class208.field3569 / 1000 + class92.field1575;
                if (var1 > class221.field3723) {
                    class221.field3723 = var1;
                }
            }
            if (var2 > class256.field4373) {
                class256.field4373 += (var2 - class256.field4373) * class208.field3569 / 1000 + class92.field1575;
                if (var2 < class256.field4373) {
                    class256.field4373 = var2;
                }
            }
            if (class256.field4373 > var2) {
                class256.field4373 -= (class256.field4373 - var2) * class208.field3569 / 1000 + class92.field1575;
                if (class256.field4373 < var2) {
                    class256.field4373 = var2;
                }
            }
        } else {
            class256.field4373 = class47.field696 * 128 + 64;
            class221.field3723 = class111.field1876 * 128 + 64;
            class153.field2599 = class113.method861((byte) 124, class221.field3723, class256.field4373, client.field4039) - class56.field876;
        }
        int var4 = class93.field1605 * 128 + 64;
        if (arg0 >= -83) {
            field395 = (class255) null;
        }
        int var5 = class185.field2993 * 128 + 64;
        int var6 = class113.method861((byte) 125, var4, var5, client.field4039) - class156.field2654;
        int var7 = var4 - class221.field3723;
        int var8 = var6 - class153.field2599;
        int var9 = var5 - class256.field4373;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -325.949D) & 0x7FF;
        int var13 = var12 - class305.field5216;
        if (class260.field4409 < var11) {
            class260.field4409 += (var11 - class260.field4409) * class199.field3428 / 1000 + class49.field746;
            if (class260.field4409 > var11) {
                class260.field4409 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var11 < class260.field4409) {
            class260.field4409 -= (class260.field4409 - var11) * class199.field3428 / 1000 + class49.field746;
            if (class260.field4409 < var11) {
                class260.field4409 = var11;
            }
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class305.field5216 += class49.field746 + (class199.field3428 * var13 / 1000);
            class305.field5216 &= 0x7FF;
        }
        if (var13 < 0) {
            class305.field5216 -= -var13 * class199.field3428 / 1000 + class49.field746;
            class305.field5216 &= 0x7FF;
        }
        int var14 = var12 - class305.field5216;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class305.field5216 = var12;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lrg;Z)V", line = 163)
    public static final void method139(class88 arg0, boolean arg1) {
        class63.field960 = arg0.method619(class196.field3238, 20053);
        field390++;
        class75.field1239 = arg0.method619(class240.field4004, 20053);
        class123.field2046 = arg0.method619(class168.field2824, 20053);
        class124.field2061 = arg0.method619(class91.field1563, 20053);
        class128.field2111 = arg0.method619(class67.field1000, 20053);
        class191.field3052 = arg0.method619(class150.field2547, 20053);
        class208.field3564 = arg0.method619(class159.field2691, 20053);
        class96.field1650 = arg0.method619(class304.field5205, 20053);
        class280.field4790 = arg0.method619(class294.field5049, 20053);
        class24.field361 = arg0.method619(class33.field535, 20053);
        class58.field888 = arg0.method619(class232.field3841, 20053);
        class56.field875 = arg0.method619(class136.field2267, 20053);
        class30.field490 = arg0.method619(class70.field1053, 20053);
        class190.field3037 = arg0.method619(class6.field84, 20053);
        class268.field4595 = arg0.method619(class187.field3025, 20053);
        class123.field2048 = arg0.method619(class68.field1020, 20053);
        class287.field4924 = arg0.method619(class56.field878, 20053);
        class90.field1538 = arg0.method619(class194.field3207, 20053);
        if (arg1) {
            method140(-88, -12);
        }
        class295.field5069 = arg0.method619(class32.field525, 20053);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)I", line = 207)
    public static final int method140(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V", line = 219)
    public static void method141(int arg0) {
        field394 = null;
        field401 = null;
        field403 = null;
        field404 = null;
        field406 = null;
        field410 = null;
        if (arg0 != 0) {
            field398 = (class255) null;
        }
        field382 = null;
        field395 = null;
        field397 = null;
        field412 = null;
        field389 = null;
        field383 = null;
        field408 = null;
        field398 = null;
        field405 = null;
        field393 = null;
        field399 = null;
        field396 = null;
        field400 = null;
        field407 = null;
        field409 = null;
        field402 = null;
        field411 = null;
        field379 = null;
        field413 = null;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(I[B)V", line = 260)
    public class25(int arg0, byte[] arg1) {
        this.field384 = arg0;
        class70 var3 = new class70(arg1);
        this.field385 = var3.method481(0);
        this.field381 = new boolean[this.field385];
        this.field387 = new int[this.field385];
        this.field391 = new int[this.field385][];
        for (int var4 = 0; var4 < this.field385; var4++) {
            this.field387[var4] = var3.method481(0);
        }
        for (int var5 = 0; var5 < this.field385; var5++) {
            this.field381[var5] = var3.method481(0) == 1;
        }
        for (int var6 = 0; var6 < this.field385; var6++) {
            this.field391[var6] = new int[var3.method481(0)];
        }
        for (int var7 = 0; var7 < this.field385; var7++) {
            for (int var8 = 0; var8 < this.field391[var7].length; var8++) {
                this.field391[var7][var8] = var3.method481(0);
            }
        }
    }
}
