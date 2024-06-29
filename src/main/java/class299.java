import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class299 {

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field4814 = 0;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "[[B")
    public static byte[][] field4811;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)Lid;")
    public static final class153 method2003(int arg0, int arg1, int arg2) {
        class22 var3 = class149.field2210[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class153 var4 = var3.field361;
            var3.field361 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)Lnl;")
    public static final class98 method2004(byte arg0) {
        class226.field3622 = 0;
        if (arg0 >= 0) {
            field4811 = null;
        }
        field4813++;
        return class82.method641(false);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lub;I)V")
    public static final void method2005(class92 arg0, int arg1) {
        if (arg1 >= 102) {
            class246.field3920 = arg0;
            field4815++;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZI)V")
    public static final void method2006(boolean arg0, int arg1) {
        field4812++;
        if (arg0) {
            return;
        }
        int var2 = class226.field3616;
        int var3 = class118.field1787;
        int var4 = class8.field128;
        int var5 = class250.field4007;
        int var6 = class82.field1244;
        int var7 = (int) class248.field3941;
        if (class35.field616 / 256 > var7) {
            var7 = class35.field616 / 256;
        }
        int var8 = (int) class50.field818 + class280.field4432 & 0x7FF;
        if (class137.field2066[4] && var7 < class24.field417[4] + 128) {
            var7 = class24.field417[4] + 128;
        }
        class204.method1434(class135.field2025, 19495, var7, var7 * 3 + 600, arg1, var8, class254.method1721(-580808345, class130.field1941, class263.field4168.field4709, class263.field4168.field4725) - 50, class223.field3573);
        if (class226.field3616 == var2 && class250.field4007 == var5 && class118.field1787 == var3 && class8.field128 == var4 && class82.field1244 == var6) {
            class175.field2704 = 1;
            return;
        }
        class218.field3333 = 10;
        class230.field3647 = 10;
        class76.field1173 = 10;
        if (class118.field1787 > var3) {
            var3 += (class118.field1787 - var3) * class230.field3647 / 1000 + class76.field1173;
            if (class118.field1787 > var3) {
                class118.field1787 = var3;
            }
        }
        if (class226.field3616 > var2) {
            var2 += class76.field1173 + ((class226.field3616 - var2) * class230.field3647 / 1000);
            if (var2 < class226.field3616) {
                class226.field3616 = var2;
            }
        }
        if (class226.field3616 < var2) {
            int var9 = var2 - ((var2 - class226.field3616) * class230.field3647 / 1000 + class76.field1173);
            if (class226.field3616 < var9) {
                class226.field3616 = var9;
            }
        }
        if (var5 < class250.field4007) {
            var5 += (class250.field4007 - var5) * class230.field3647 / 1000 + class76.field1173;
            if (class250.field4007 > var5) {
                class250.field4007 = var5;
            }
        }
        int var10 = class82.field1244 - var6;
        if (var10 > 1024) {
            var10 -= 2048;
        }
        if (var3 > class118.field1787) {
            int var11 = var3 - ((var3 - class118.field1787) * class230.field3647 / 1000 + class76.field1173);
            if (var11 > class118.field1787) {
                class118.field1787 = var11;
            }
        }
        if (var10 < -1024) {
            var10 += 2048;
        }
        if (var5 > class250.field4007) {
            int var12 = var5 - ((var5 - class250.field4007) * class230.field3647 / 1000 + class76.field1173);
            if (var12 > class250.field4007) {
                class250.field4007 = var12;
            }
        }
        class269.field4261 = 10;
        if (class8.field128 > var4) {
            var4 += class269.field4261 + ((class8.field128 - var4) * class218.field3333 / 1000);
            if (class8.field128 > var4) {
                class8.field128 = var4;
            }
        }
        if (class8.field128 < var4) {
            int var13 = var4 - ((var4 - class8.field128) * class218.field3333 / 1000 + class269.field4261);
            if (var13 > class8.field128) {
                class8.field128 = var13;
            }
        }
        if (var10 > 0) {
            int var14 = class269.field4261 + (class218.field3333 * var10 / 1000) + var6;
            var6 = var14 & 0x7FF;
        }
        if (var10 < 0) {
            int var15 = var6 - (-var10 * class218.field3333 / 1000 + class269.field4261);
            var6 = var15 & 0x7FF;
        }
        int var16 = class82.field1244 - var6;
        if (var16 > 1024) {
            var16 -= 2048;
        }
        if (var16 < -1024) {
            var16 += 2048;
        }
        if (var16 >= 0 || var10 <= 0 || var16 > 0 && var10 < 0) {
            class82.field1244 = var6;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)V")
    public static void method2007(byte arg0) {
        field4811 = null;
        if (arg0 != -121) {
            method2004((byte) 7);
        }
    }
}
