import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("sc")
public class class169 extends class147 {

    @OriginalMember(owner = "sc", name = "ab", descriptor = "Z")
    public boolean field3143 = false;

    @OriginalMember(owner = "sc", name = "N", descriptor = "Lwg;")
    private class209 field3130;

    @OriginalMember(owner = "sc", name = "W", descriptor = "Z")
    public boolean field3139;

    @OriginalMember(owner = "sc", name = "L", descriptor = "Z")
    public boolean field3128;

    @OriginalMember(owner = "sc", name = "T", descriptor = "I")
    public int field3136;

    @OriginalMember(owner = "sc", name = "Z", descriptor = "I")
    public int field3142;

    @OriginalMember(owner = "sc", name = "I", descriptor = "I")
    private int field3125;

    @OriginalMember(owner = "sc", name = "U", descriptor = "I")
    private int field3137;

    @OriginalMember(owner = "sc", name = "S", descriptor = "I")
    private int field3135;

    @OriginalMember(owner = "sc", name = "V", descriptor = "I")
    private int field3138;

    @OriginalMember(owner = "sc", name = "R", descriptor = "[S")
    public static short[] field3134 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "sc", name = "P", descriptor = "Llf;")
    public static class109 field3132 = class35.method275(" <col=ffffff>", 2);

    @OriginalMember(owner = "sc", name = "O", descriptor = "F")
    private float field3131;

    @OriginalMember(owner = "sc", name = "G", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "sc", name = "J", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "sc", name = "K", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "sc", name = "M", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "sc", name = "X", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "sc", name = "Y", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "sc", name = "bb", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "sc", name = "cb", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "sc", name = "Q", descriptor = "Z")
    public static boolean field3133;

    @OriginalMember(owner = "sc", name = "H", descriptor = "[I")
    private int[] field3124;

    @OriginalMember(owner = "sc", name = "db", descriptor = "[[Lvg;")
    public static class200[][] field3146;

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lbg;ILaa;)Z")
    public final boolean method1128(class18 arg0, int arg1, class2 arg2) {
        int var4 = 117 % ((-arg1 - 83) / 43);
        field3129++;
        return this.field3130.method1360(0, arg2, arg0);
    }

    @OriginalMember(owner = "sc", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field3144++;
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(I)V")
    public static final void method1129(int arg0) {
        field3145++;
        int var1 = class131.field2532 * 128 + 64;
        int var2 = class13.field194 * 128 + 64;
        int var3 = class19.method180(var1, false, class72.field1405, var2) - class85.field1741;
        if (var2 > class39.field836) {
            class39.field836 += (var2 - class39.field836) * class31.field739 / 1000 + class187.field3614;
            if (class39.field836 > var2) {
                class39.field836 = var2;
            }
        }
        if (var1 > class114.field2267) {
            class114.field2267 += (var1 - class114.field2267) * class31.field739 / 1000 + class187.field3614;
            if (var1 < class114.field2267) {
                class114.field2267 = var1;
            }
        }
        if (var3 > class125.field2419) {
            class125.field2419 += (var3 - class125.field2419) * class31.field739 / 1000 + class187.field3614;
            if (var3 < class125.field2419) {
                class125.field2419 = var3;
            }
        }
        if (var2 < class39.field836) {
            class39.field836 -= (class39.field836 - var2) * class31.field739 / 1000 + class187.field3614;
            if (class39.field836 < var2) {
                class39.field836 = var2;
            }
        }
        if (class114.field2267 > var1) {
            class114.field2267 -= class187.field3614 + (class114.field2267 - var1) * class31.field739 / 1000;
            if (class114.field2267 < var1) {
                class114.field2267 = var1;
            }
        }
        if (var3 < class125.field2419) {
            class125.field2419 -= (class125.field2419 - var3) * class31.field739 / 1000 + class187.field3614;
            if (class125.field2419 < var3) {
                class125.field2419 = var3;
            }
        }
        int var4 = class121.field2349 * 128 + 64;
        int var5 = class164.field3077 * 128 + 64;
        int var6 = class19.method180(var5, false, class72.field1405, var4) - class21.field476;
        int var7 = var6 - class125.field2419;
        int var8 = var5 - class114.field2267;
        int var9 = var4 - class39.field836;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (-325.949D * Math.atan2((double) var9, (double) var8)) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var13 = var12 - class143.field2748;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        int var14 = -51 % ((arg0 + 17) / 54);
        if (var11 > class72.field1397) {
            class72.field1397 += (var11 - class72.field1397) * class156.field2942 / 1000 + class182.field3435;
            if (class72.field1397 > var11) {
                class72.field1397 = var11;
            }
        }
        if (var13 > 0) {
            class143.field2748 += class182.field3435 + class156.field2942 * var13 / 1000;
            class143.field2748 &= 0x7FF;
        }
        if (var13 < 0) {
            class143.field2748 -= class182.field3435 + -var13 * class156.field2942 / 1000;
            class143.field2748 &= 0x7FF;
        }
        int var15 = var12 - class143.field2748;
        if (var11 < class72.field1397) {
            class72.field1397 -= (class72.field1397 - var11) * class156.field2942 / 1000 + class182.field3435;
            if (class72.field1397 < var11) {
                class72.field1397 = var11;
            }
        }
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var13 > 0 || var15 > 0 && var13 < 0) {
            class143.field2748 = var12;
        }
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "(I)V")
    public static void method1130(int arg0) {
        if (arg0 == 2047) {
            field3134 = null;
            field3132 = null;
            field3146 = null;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(FILaa;Lbg;I)[I")
    public final int[] method1131(float arg0, int arg1, class2 arg2, class18 arg3, int arg4) {
        if (arg1 != 0) {
            this.method1131(-1.6882112F, 53, null, null, -102);
        }
        field3141++;
        if (this.field3124 == null || this.field3131 != arg0) {
            if (!this.field3130.method1360(0, arg2, arg3)) {
                return null;
            }
            int var6 = this.field3136 <= arg4 ? this.field3136 : arg4;
            this.field3124 = this.field3130.method1365((double) arg0, 0, var6, var6, true, arg3, arg2);
            this.field3131 = arg0;
        }
        return this.field3124;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(IIIILka;J)V")
    public static final void method1132(int arg0, int arg1, int arg2, int arg3, class95 arg4, long arg5) {
        if (arg4 == null) {
            return;
        }
        class50 var7 = new class50();
        var7.field1027 = arg4;
        var7.field1029 = arg1 * 128 + 64;
        var7.field1024 = arg2 * 128 + 64;
        var7.field1020 = arg3;
        var7.field1030 = arg5;
        if (class78.field1550[arg0][arg1][arg2] == null) {
            class78.field1550[arg0][arg1][arg2] = new class3(arg0, arg1, arg2);
        }
        class78.field1550[arg0][arg1][arg2].field27 = var7;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lja;ZLlf;)I")
    public static final int method1133(class86 arg0, boolean arg1, class109 arg2) {
        int var3 = arg0.field1773;
        arg0.method586(arg2.field2176, arg1);
        arg0.field1773 += class19.field417.method20(8, 0, arg0.field1808, arg0.field1773, arg2.field2182, arg2.field2176);
        field3140++;
        if (!arg1) {
            field3134 = null;
        }
        return arg0.field1773 - var3;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(IBLaa;Lbg;)[I")
    public final int[] method1134(int arg0, byte arg1, class2 arg2, class18 arg3) {
        field3127++;
        int var5 = 59 / ((arg1 - 13) / 63);
        if (this.field3130.method1360(0, arg2, arg3)) {
            int var6 = this.field3136 <= arg0 ? this.field3136 : arg0;
            return this.field3130.method1365(1.0D, 0, var6, var6, false, arg3, arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(II)V")
    public final void method1135(int arg0, int arg1) {
        if (arg0 != 64) {
            field3146 = null;
        }
        field3123++;
        if (this.field3124 == null) {
            return;
        }
        if (this.field3137 != 0) {
            if (class131.field2525 == null || class131.field2525.length < this.field3124.length) {
                class131.field2525 = new int[this.field3124.length];
            }
            int var3 = this.field3124.length;
            short var4;
            if (this.field3124.length == 4096) {
                var4 = 64;
            } else {
                var4 = 128;
            }
            int var5 = arg1 * var4 * this.field3135;
            if (this.field3137 == 2) {
                var5 = -var5;
            }
            int var6 = var3 - 1;
            for (int var7 = 0; var7 < var3; var7++) {
                int var9 = var6 & var5 + var7;
                class131.field2525[var7] = this.field3124[var9];
            }
            int[] var8 = this.field3124;
            this.field3124 = class131.field2525;
            class131.field2525 = var8;
        }
        if (this.field3138 == 0) {
            return;
        }
        if (class131.field2525 == null || class131.field2525.length < this.field3124.length) {
            class131.field2525 = new int[this.field3124.length];
        }
        short var10;
        if (this.field3124.length == 4096) {
            var10 = 64;
        } else {
            var10 = 128;
        }
        int var11 = this.field3124.length;
        int var12 = var10 - 1;
        int var13 = this.field3135 * arg1;
        if (this.field3138 == 1) {
            var13 = -var13;
        }
        for (int var14 = 0; var14 < var11; var14 += var10) {
            for (int var16 = 0; var16 < var10; var16++) {
                int var17 = var14 + var16;
                int var18 = (var12 & var13 + var16) + var14;
                class131.field2525[var17] = this.field3124[var18];
            }
        }
        int[] var15 = this.field3124;
        this.field3124 = class131.field2525;
        class131.field2525 = var15;
    }

    @OriginalMember(owner = "sc", name = "<init>", descriptor = "(Lja;)V")
    public class169(class86 arg0) {
        this.field3130 = new class209(arg0);
        int var2 = arg0.method598((byte) 113);
        this.field3139 = (var2 & 0x2) != 0;
        this.field3128 = (var2 & 0x1) != 0;
        this.field3136 = arg0.method598((byte) 125);
        this.field3142 = arg0.method569(true);
        this.field3125 = arg0.method598((byte) 120);
        if (this.field3125 == 255) {
            this.field3125 = 256;
        }
        int var3 = arg0.method598((byte) 84);
        int var4 = arg0.method598((byte) 74);
        this.field3137 = var4 >> 6 & 0x3;
        this.field3135 = (var4 & 0x3F) - 6;
        this.field3138 = var3 >> 6 & 0x3;
        arg0.method598((byte) 100);
        arg0.method598((byte) 78);
    }

    @OriginalMember(owner = "sc", name = "<init>", descriptor = "()V")
    public class169() {
        this.field3130 = new class209();
        this.field3136 = 1;
        this.field3128 = true;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(IZI)Llf;")
    public static final class109 method1136(int arg0, boolean arg1, int arg2) {
        if (arg0 <= 8) {
            method1132(-58, 87, 1, 103, null, -49L);
        }
        field3126++;
        return class164.method1110(10, -19865, arg1, arg2);
    }
}
