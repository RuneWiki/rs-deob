import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class39 extends class170 {

    @OriginalMember(owner = "client!ul", name = "bb", descriptor = "I")
    private int field834 = 32768;

    @OriginalMember(owner = "client!ul", name = "R", descriptor = "I")
    public static int field824 = 0;

    @OriginalMember(owner = "client!ul", name = "X", descriptor = "[I")
    public static int[] field830 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!ul", name = "eb", descriptor = "Ltb;")
    public static class210 field837 = new class210(64);

    @OriginalMember(owner = "client!ul", name = "gb", descriptor = "[I")
    public static int[] field839 = new int[32768];

    @OriginalMember(owner = "client!ul", name = "S", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!ul", name = "U", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!ul", name = "V", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!ul", name = "W", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!ul", name = "Y", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!ul", name = "Z", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!ul", name = "ab", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!ul", name = "cb", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!ul", name = "db", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!ul", name = "fb", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!ul", name = "T", descriptor = "Ldj;")
    public static class314 field826;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)V", line = 4)
    public static final void method265(int arg0) {
        if (arg0 != 6361) {
            return;
        }
        field829++;
        if (class109.field1853 != null && class61.field1151 != null) {
            return;
        }
        class109.field1853 = new int[256];
        class61.field1151 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class109.field1853[var1] = (int) (Math.sin(var2) * 4096.0D);
            class61.field1151[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BI)[I", line = 37)
    public final int[] method69(byte arg0, int arg1) {
        if (arg0 != 85) {
            method268(119);
        }
        field825++;
        int[] var3 = this.field2977.method1838(false, arg1);
        if (this.field2977.field4552) {
            int[] var4 = this.method1142((byte) 44, 1, arg1);
            int[] var5 = this.method1142((byte) 44, 2, arg1);
            for (int var6 = 0; var6 < class185.field3225; var6++) {
                int var7 = var4[var6] >> 4 & 0xFF;
                int var8 = var5[var6] * this.field834 >> 12;
                int var9 = class61.field1151[var7] * var8 >> 12;
                int var10 = class109.field1853[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class5.field94;
                int var12 = arg1 + (var10 >> 12) & class297.field5073;
                int[] var13 = this.method1142((byte) 44, 0, var12);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILbg;B)V", line = 88)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        if (arg2 != 13) {
            method269(50);
        }
        field832++;
        if (arg0 == 0) {
            this.field834 = arg1.method1308(-34) << 4;
        } else if (arg0 == 1) {
            this.field2970 = arg1.method1325(7627) == 1;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 123)
    public static final void method266(Component arg0, int arg1) {
        arg0.addMouseListener(class94.field1591);
        if (arg1 == 23963) {
            field835++;
            arg0.addMouseMotionListener(class94.field1591);
            arg0.addFocusListener(class94.field1591);
        }
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)V", line = 137)
    public final void method267(int arg0) {
        if (arg0 != -2718) {
            this.field834 = 117;
        }
        method265(6361);
        field838++;
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "()V", line = 155)
    public class39() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "(I)V", line = 170)
    public static void method268(int arg0) {
        field839 = null;
        field826 = null;
        field830 = null;
        if (arg0 != 383) {
            field836 = -78;
        }
        field837 = null;
    }

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "(I)V", line = 200)
    public static final void method269(int arg0) {
        field831++;
        int var1 = class276.field4781 * 128 + 64;
        int var2 = class162.field2770 * 128 + 64;
        int var3 = class64.method427(var2, var1, class133.field2315, (byte) 112) - class228.field3972;
        if (class157.field2693 >= 100) {
            class142.field2436 = class162.field2770 * 128 + 64;
            class143.field2445 = class276.field4781 * 128 + 64;
            class187.field3249 = class64.method427(class142.field2436, class143.field2445, class133.field2315, (byte) 110) - class228.field3972;
        } else {
            if (class142.field2436 < var2) {
                class142.field2436 += (var2 - class142.field2436) * class157.field2693 / 1000 + class129.field2260;
                if (var2 < class142.field2436) {
                    class142.field2436 = var2;
                }
            }
            if (class142.field2436 > var2) {
                class142.field2436 -= (class142.field2436 - var2) * class157.field2693 / 1000 + class129.field2260;
                if (class142.field2436 < var2) {
                    class142.field2436 = var2;
                }
            }
            if (class143.field2445 < var1) {
                class143.field2445 += (var1 - class143.field2445) * class157.field2693 / 1000 + class129.field2260;
                if (class143.field2445 > var1) {
                    class143.field2445 = var1;
                }
            }
            if (var1 < class143.field2445) {
                class143.field2445 -= (class143.field2445 - var1) * class157.field2693 / 1000 + class129.field2260;
                if (class143.field2445 < var1) {
                    class143.field2445 = var1;
                }
            }
            if (var3 > class187.field3249) {
                class187.field3249 += (var3 - class187.field3249) * class157.field2693 / 1000 + class129.field2260;
                if (class187.field3249 > var3) {
                    class187.field3249 = var3;
                }
            }
            if (var3 < class187.field3249) {
                class187.field3249 -= class129.field2260 + ((class187.field3249 - var3) * class157.field2693 / 1000);
                if (var3 > class187.field3249) {
                    class187.field3249 = var3;
                }
            }
        }
        int var4 = class309.field5246 * 128 + 64;
        int var5 = class125.field2103 * 128 + 64;
        int var6 = class64.method427(var4, var5, class133.field2315, (byte) 115) - class283.field4862;
        int var7 = var5 - class143.field2445;
        int var8 = var4 - class142.field2436;
        int var9 = var6 - class187.field3249;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var8, (double) var7)) & 0x7FF;
        int var13 = var12 - class33.field716;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (class311.field5271 < var11) {
            class311.field5271 += class204.field3605 + ((var11 - class311.field5271) * class120.field2030 / 1000);
            if (class311.field5271 > var11) {
                class311.field5271 = var11;
            }
        }
        if (var13 > 0) {
            class33.field716 += class120.field2030 * var13 / 1000 + class204.field3605;
            class33.field716 &= 0x7FF;
        }
        if (var13 < 0) {
            class33.field716 -= -var13 * class120.field2030 / 1000 + class204.field3605;
            class33.field716 &= 0x7FF;
        }
        if (class311.field5271 > var11) {
            class311.field5271 -= (class311.field5271 - var11) * class120.field2030 / 1000 + class204.field3605;
            if (var11 > class311.field5271) {
                class311.field5271 = var11;
            }
        }
        int var14 = var12 - class33.field716;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (arg0 > var14 && var13 > 0 || var14 > 0 && var13 < 0) {
            class33.field716 = var12;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)[[I", line = 363)
    public final int[][] method62(int arg0, int arg1) {
        field833++;
        int var3 = -24 % ((-arg1 - 24) / 46);
        int[][] var4 = this.field2976.method1098(arg0, -19544);
        if (this.field2976.field2883) {
            int[] var5 = this.method1142((byte) 44, 1, arg0);
            int[] var6 = this.method1142((byte) 44, 2, arg0);
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            int[] var9 = var4[0];
            for (int var10 = 0; var10 < class185.field3225; var10++) {
                int var11 = (var5[var10] * 255 & 0xFFCA6) >> 12;
                int var12 = var6[var10] * this.field834 >> 12;
                int var13 = class109.field1853[var11] * var12 >> 12;
                int var14 = class297.field5073 & arg0 + (var13 >> 12);
                int var15 = class61.field1151[var11] * var12 >> 12;
                int var16 = class5.field94 & (var15 >> 12) + var10;
                int[][] var17 = this.method1139(0, var14, 0);
                var9[var10] = var17[0][var16];
                var7[var10] = var17[1][var16];
                var8[var10] = var17[2][var16];
            }
        }
        return var4;
    }
}
