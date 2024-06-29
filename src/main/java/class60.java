import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class60 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZII)Z")
    public static final boolean method460(boolean arg0, int arg1, int arg2) {
        field621++;
        if (arg0) {
            return false;
        } else {
            return (arg1 & 0x84080) != 0;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static final void method461(int arg0) {
        if (class392.field5397 == 3) {
            class313.method1860(true, 4);
        } else if (class392.field5397 == 7) {
            class313.method1860(true, 8);
        } else if (class392.field5397 == 10) {
            class313.method1860(true, 11);
        }
        field620++;
        if (arg0 == -1) {
            ;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)Z")
    public static final boolean method462(int arg0, int arg1) {
        field619++;
        if (arg0 == 8) {
            return arg1 >= 4 && arg1 <= 8;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLig;)Lvr;")
    public static final class136 method463(boolean arg0, class244 arg1) {
        field622++;
        int var2 = arg1.method1423(-31);
        class388 var3 = class141.method888((byte) -35)[arg1.method1423(-8)];
        class219 var4 = class38.method181(119)[arg1.method1423(-37)];
        int var5 = arg1.method1466((byte) 31);
        int var6 = arg1.method1466((byte) 31);
        int var7 = arg1.method1476(-72);
        int var8 = arg1.method1476(-94);
        int var9 = arg1.method1438(91);
        int var10 = arg1.method1438(124);
        int var11 = arg1.method1438(100);
        if (arg0) {
            return null;
        } else {
            boolean var12 = arg1.method1423(-87) == 1;
            return new class136(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
    public static final void method464(int arg0) {
        field618++;
        int var1 = class163.field1827 * 512 + 256;
        int var2 = class398.field5452 * 512 + 256;
        int var3 = class676.method3845(var2, var1, 0, class122.field1278) - class702.field9898;
        if (class262.field3257 < 100) {
            if (var1 > class167.field1855) {
                class167.field1855 += (var1 - class167.field1855) * class262.field3257 / 1000 + class619.field8858;
                if (class167.field1855 > var1) {
                    class167.field1855 = var1;
                }
            }
            if (var3 > class204.field2409) {
                class204.field2409 += class619.field8858 + ((var3 - class204.field2409) * class262.field3257 / 1000);
                if (class204.field2409 > var3) {
                    class204.field2409 = var3;
                }
            }
            if (class167.field1855 > var1) {
                class167.field1855 -= (class167.field1855 - var1) * class262.field3257 / 1000 + class619.field8858;
                if (var1 > class167.field1855) {
                    class167.field1855 = var1;
                }
            }
            if (var3 < class204.field2409) {
                class204.field2409 -= (class204.field2409 - var3) * class262.field3257 / 1000 + class619.field8858;
                if (class204.field2409 < var3) {
                    class204.field2409 = var3;
                }
            }
            if (var2 > class590.field8319) {
                class590.field8319 += class619.field8858 + ((var2 - class590.field8319) * class262.field3257 / 1000);
                if (var2 < class590.field8319) {
                    class590.field8319 = var2;
                }
            }
            if (var2 < class590.field8319) {
                class590.field8319 -= (class590.field8319 - var2) * class262.field3257 / 1000 + class619.field8858;
                if (class590.field8319 < var2) {
                    class590.field8319 = var2;
                }
            }
        } else {
            class167.field1855 = class163.field1827 * 512 + 256;
            class590.field8319 = class398.field5452 * 512 + 256;
            class204.field2409 = class676.method3845(class590.field8319, class167.field1855, 0, class122.field1278) - class702.field9898;
        }
        int var4 = class277.field3403 * 512 + 256;
        int var5 = class450.field6492 * 512 + 256;
        int var6 = class676.method3845(var5, var4, 0, class122.field1278) - class504.field7092;
        int var7 = var4 - class167.field1855;
        int var8 = var6 - class204.field2409;
        int var9 = var5 - class590.field8319;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + (var9 * var9)));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (class27.field281 < var11) {
            class27.field281 += (var11 - class27.field281 >> 3) * class687.field9703 / 1000 + class711.field10016 << 3;
            if (class27.field281 > var11) {
                class27.field281 = var11;
            }
        }
        if (var11 < class27.field281) {
            class27.field281 -= class711.field10016 + ((class27.field281 - var11 >> 3) * class687.field9703 / 1000) << 3;
            if (var11 > class27.field281) {
                class27.field281 = var11;
            }
        }
        int var13 = var12 - class152.field1670;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class152.field1670 += class711.field10016 + (class687.field9703 * var14 / 1000) << 3;
            class152.field1670 &= 0x3FFF;
        }
        if (var14 < 0) {
            class152.field1670 -= -var14 * class687.field9703 / 1000 + class711.field10016 << 3;
            class152.field1670 &= 0x3FFF;
        }
        int var15 = var12 - class152.field1670;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (arg0 > 31) {
            if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
                class152.field1670 = var12;
            }
            class522.field7423 = 0;
        }
    }
}
