import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class26 extends class41 {

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public int field634;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    private int field631;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "[[I")
    public int[][] field641;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "[I")
    public int[] field623;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "Lu;")
    public static class135 field626 = class87.method676((byte) -74, "@cr2@");

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "Z")
    public static boolean field624 = true;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "[Lie;")
    public static class61[] field632 = new class61[50];

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "Lu;")
    public static class135 field630 = class87.method676((byte) -85, "@or3@");

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    public static int field628 = 0;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "Lu;")
    private static class135 field633 = class87.method676((byte) -50, "Please wait )2 attempting to reestablish");

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
    public static int field637 = 78;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "Lu;")
    public static class135 field635 = field633;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "Lu;")
    private static class135 field640 = class87.method676((byte) -58, "Members only world");

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "Lu;")
    public static class135 field627 = field640;

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
    public static int field642 = 0;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "Ljb;")
    public static class64 field636;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)V")
    public static final void method212(int arg0, int arg1) {
        field639++;
        class136.field3292 += arg0 * 128;
        short var2 = 256;
        if (class136.field3292 > class5.field130.length) {
            class136.field3292 -= class5.field130.length;
            int var3 = (int) (Math.random() * 12.0D);
            class148.method1209(-30847, class62.field1555[var3]);
        }
        int var4 = 0;
        int var5 = arg0 * 128;
        int var6 = (var2 - arg0) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var27 = class38.field879[var4 + var5] - class5.field130[class5.field130.length - 1 & var4 - -class136.field3292] * arg0 / 6;
            if (var27 < 0) {
                var27 = 0;
            }
            class38.field879[var4++] = var27;
        }
        for (int var8 = var2 - arg0; var8 < var2; var8++) {
            int var24 = var8 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class38.field879[var24 + var25] = 255;
                } else {
                    class38.field879[var24 + var25] = 0;
                }
            }
        }
        if (class107.field2570 > 0) {
            class107.field2570 -= arg0 * 4;
        }
        if (class117.field2802 > 0) {
            class117.field2802 -= arg0 * 4;
        }
        if (class107.field2570 == 0 && class117.field2802 == 0) {
            int var9 = (int) ((double) (2000 / arg0) * Math.random());
            if (var9 == 0) {
                class107.field2570 = 1024;
            }
            if (var9 == 1) {
                class117.field2802 = 1024;
            }
        }
        for (int var10 = 0; var10 < var2 - arg0; var10++) {
            class123.field2944[var10] = class123.field2944[var10 + arg0];
        }
        if (arg1 != 11166) {
            field625 = -41;
        }
        for (int var11 = var2 - arg0; var11 < var2; var11++) {
            class123.field2944[var11] = (int) (Math.sin((double) class48.field1134 / 14.0D) * 16.0D + Math.sin((double) class48.field1134 / 15.0D) * 14.0D + Math.sin((double) class48.field1134 / 16.0D) * 12.0D);
            class48.field1134++;
        }
        class32.field746 += arg0;
        int var12 = ((class126.field2998 & 0x1) + arg0) / 2;
        if (var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class32.field746 * 100; var13++) {
            int var22 = (int) (Math.random() * 124.0D) + 2;
            int var23 = (int) (Math.random() * 128.0D) + 128;
            class38.field879[var22 + (var23 << 7)] = 192;
        }
        class32.field746 = 0;
        for (int var14 = 0; var14 < var2; var14++) {
            int var19 = 0;
            int var20 = var14 * 128;
            for (int var21 = -var12; var21 < 128; var21++) {
                if (var12 + var21 < 128) {
                    var19 += class38.field879[var12 + var20 + var21];
                }
                if (var21 - var12 - 1 >= 0) {
                    var19 -= class38.field879[var21 + var20 - var12 - 1];
                }
                if (var21 >= 0) {
                    class59.field1507[var20 + var21] = var19 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var2; var17++) {
                int var18 = var17 * 128;
                if (var12 + var17 < var2) {
                    var16 += class59.field1507[var12 * 128 + var15 + var18];
                }
                if (var17 - var12 - 1 >= 0) {
                    var16 -= class59.field1507[var18 + var15 - (var12 + 1) * 128];
                }
                if (var17 >= 0) {
                    class38.field879[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
    public static final void method213(int arg0) {
        field638++;
        if (!class8.field143) {
            return;
        }
        int var1 = 95 % ((arg0 - 63) / 51);
        class146 var2 = class28.method227(class53.field1274, (byte) -100, class47.field1117);
        if (var2 != null && var2.field3576 != null) {
            class52.method399(var2, var2.field3576, 0, 0, null, -2147483645, 0);
        }
        class8.field143 = false;
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)V")
    public static void method214(int arg0) {
        field640 = null;
        field626 = null;
        field633 = null;
        field635 = null;
        if (arg0 <= 88) {
            method215((byte) 105, null, null, null, null);
        }
        field636 = null;
        field627 = null;
        field632 = null;
        field630 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLg;Lv;Lg;Lg;)Z")
    public static final boolean method215(byte arg0, class43 arg1, class141 arg2, class43 arg3, class43 arg4) {
        class17.field380 = arg2;
        class40.field924 = arg4;
        class60.field1518 = arg3;
        class97.field2353 = arg1;
        field629++;
        if (arg0 != -118) {
            field628 = 79;
        }
        return true;
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)V")
    public static final void method216(int arg0) {
        field622++;
        if (arg0 != 0) {
            method213(-42);
        }
        class90.field2106.method234(arg0 ^ 0xFFFFA776);
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(I[B)V")
    public class26(int arg0, byte[] arg1) {
        this.field634 = arg0;
        class59 var3 = new class59(arg1);
        this.field631 = var3.method480(0);
        this.field641 = new int[this.field631][];
        this.field623 = new int[this.field631];
        for (int var4 = 0; var4 < this.field631; var4++) {
            this.field623[var4] = var3.method480(0);
        }
        for (int var5 = 0; var5 < this.field631; var5++) {
            this.field641[var5] = new int[var3.method480(0)];
        }
        for (int var6 = 0; var6 < this.field631; var6++) {
            for (int var7 = 0; var7 < this.field641[var6].length; var7++) {
                this.field641[var6][var7] = var3.method480(0);
            }
        }
    }
}
