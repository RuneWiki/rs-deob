import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public abstract class class292 {

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "Lgb;")
    public static class212 field4990 = new class212(64);

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field4992 = -1;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "Ltl;")
    public static class59 field4993 = class85.method639("Null", 9588);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "[[Z")
    public static boolean[][] field4994;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V", line = 4)
    public static void method2019(byte arg0) {
        field4993 = null;
        field4990 = null;
        if (arg0 >= -121) {
            method2019((byte) 72);
        }
        field4994 = (boolean[][]) null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIIIII)V", line = 20)
    public static final void method2020(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = arg3 - arg0;
        field4991++;
        int var10 = arg6 - arg2;
        int var11 = (arg8 - arg1 << 16) / var9;
        int var12 = (arg7 - arg4 << 16) / var10;
        class306.method2121(0, 47, arg1, arg6, var12, arg2, arg5, var11, arg4, arg0, arg3);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V", line = 41)
    public static final void method2021(int arg0) {
        int var1 = 39 % ((13 - arg0) / 44);
        field4988++;
        int var2 = class222.field3607 * 128 + 64;
        int var3 = class88.field1381 * 128 + 64;
        int var4 = class73.method589(class247.field4119, true, var3, var2) - class206.field3367;
        if (class313.field5301 >= 100) {
            class226.field3640 = class88.field1381 * 128 + 64;
            class216.field3528 = class222.field3607 * 128 + 64;
            class185.field3109 = class73.method589(class247.field4119, true, class226.field3640, class216.field3528) - class206.field3367;
        } else {
            if (var3 > class226.field3640) {
                class226.field3640 += (var3 - class226.field3640) * class313.field5301 / 1000 + class314.field5315;
                if (var3 < class226.field3640) {
                    class226.field3640 = var3;
                }
            }
            if (class216.field3528 < var2) {
                class216.field3528 += (var2 - class216.field3528) * class313.field5301 / 1000 + class314.field5315;
                if (var2 < class216.field3528) {
                    class216.field3528 = var2;
                }
            }
            if (var4 > class185.field3109) {
                class185.field3109 += (var4 - class185.field3109) * class313.field5301 / 1000 + class314.field5315;
                if (class185.field3109 > var4) {
                    class185.field3109 = var4;
                }
            }
            if (class216.field3528 > var2) {
                class216.field3528 -= (class216.field3528 - var2) * class313.field5301 / 1000 + class314.field5315;
                if (class216.field3528 < var2) {
                    class216.field3528 = var2;
                }
            }
            if (var3 < class226.field3640) {
                class226.field3640 -= class314.field5315 + ((class226.field3640 - var3) * class313.field5301 / 1000);
                if (var3 > class226.field3640) {
                    class226.field3640 = var3;
                }
            }
            if (class185.field3109 > var4) {
                class185.field3109 -= (class185.field3109 - var4) * class313.field5301 / 1000 + class314.field5315;
                if (class185.field3109 < var4) {
                    class185.field3109 = var4;
                }
            }
        }
        int var5 = class283.field4866 * 128 + 64;
        int var6 = class73.field1158 * 128 + 64;
        int var7 = class73.method589(class247.field4119, true, var5, var6) - class310.field5267;
        int var8 = var6 - class216.field3528;
        int var9 = var7 - class185.field3109;
        int var10 = var5 - class226.field3640;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 0x7FF;
        int var13 = (int) (-325.949D * Math.atan2((double) var10, (double) var8)) & 0x7FF;
        int var14 = var13 - class58.field853;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            class58.field853 += class314.field5316 * var14 / 1000 + class120.field2003;
            class58.field853 &= 0x7FF;
        }
        if (var14 < 0) {
            class58.field853 -= class120.field2003 + (-var14 * class314.field5316 / 1000);
            class58.field853 &= 0x7FF;
        }
        int var15 = var13 - class58.field853;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var12 < 128) {
            var12 = 128;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class58.field853 = var13;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (class100.field1627 < var12) {
            class100.field1627 += (var12 - class100.field1627) * class314.field5316 / 1000 + class120.field2003;
            if (class100.field1627 > var12) {
                class100.field1627 = var12;
            }
        }
        if (class100.field1627 > var12) {
            class100.field1627 -= (class100.field1627 - var12) * class314.field5316 / 1000 + class120.field2003;
            if (var12 > class100.field1627) {
                class100.field1627 = var12;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lrl;I)Lrl;")
    public abstract class282 method874(class282 arg0, int arg1);
}
