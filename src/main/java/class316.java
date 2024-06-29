import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class316 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "Lpk;")
    public static class120 field4984;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "[[[Lwn;")
    public static class30[][][] field4985;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)Z", line = 33)
    public static final boolean method2230(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class111.field1807; var3++) {
            class47 var4 = class86.field1386[var3];
            if (var4.field734 == 1) {
                int var5 = var4.field713 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field720 * var5 >> 8) + var4.field723;
                    int var7 = (var4.field716 * var5 >> 8) + var4.field735;
                    int var8 = (var4.field736 * var5 >> 8) + var4.field724;
                    int var9 = (var4.field731 * var5 >> 8) + var4.field728;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field734 == 2) {
                int var10 = arg0 - var4.field713;
                if (var10 > 0) {
                    int var11 = (var4.field720 * var10 >> 8) + var4.field723;
                    int var12 = (var4.field716 * var10 >> 8) + var4.field735;
                    int var13 = (var4.field736 * var10 >> 8) + var4.field724;
                    int var14 = (var4.field731 * var10 >> 8) + var4.field728;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field734 == 3) {
                int var15 = var4.field723 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field722 * var15 >> 8) + var4.field713;
                    int var17 = (var4.field726 * var15 >> 8) + var4.field717;
                    int var18 = (var4.field736 * var15 >> 8) + var4.field724;
                    int var19 = (var4.field731 * var15 >> 8) + var4.field728;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field734 == 4) {
                int var20 = arg2 - var4.field723;
                if (var20 > 0) {
                    int var21 = (var4.field722 * var20 >> 8) + var4.field713;
                    int var22 = (var4.field726 * var20 >> 8) + var4.field717;
                    int var23 = (var4.field736 * var20 >> 8) + var4.field724;
                    int var24 = (var4.field731 * var20 >> 8) + var4.field728;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field734 == 5) {
                int var25 = arg1 - var4.field724;
                if (var25 > 0) {
                    int var26 = (var4.field722 * var25 >> 8) + var4.field713;
                    int var27 = (var4.field726 * var25 >> 8) + var4.field717;
                    int var28 = (var4.field720 * var25 >> 8) + var4.field723;
                    int var29 = (var4.field716 * var25 >> 8) + var4.field735;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V", line = 156)
    public static void method2231(byte arg0) {
        field4985 = (class30[][][]) null;
        if (arg0 != -116) {
            method2234(true);
        }
        field4984 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V", line = 170)
    public static final void method2232(int arg0) {
        field4986++;
        for (class43 var1 = (class43) class181.field2876.method268(-1); var1 != null; var1 = (class43) class181.field2876.method278(1)) {
            if (var1.field682 > 0) {
                var1.field682--;
            }
            if (var1.field682 != 0) {
                if (var1.field685 > 0) {
                    var1.field685--;
                }
                if (var1.field685 == 0 && var1.field686 >= 1 && var1.field688 >= 1 && var1.field686 <= 102 && var1.field688 <= 102 && (var1.field676 < 0 || class314.method2222(var1.field678, true, var1.field676))) {
                    class124.method985(var1.field687, var1.field677, var1.field676, var1.field680, var1.field688, var1.field686, -23831, var1.field678);
                    var1.field685 = -1;
                    if (var1.field684 == var1.field676 && var1.field684 == -1) {
                        var1.method489(false);
                    } else if (var1.field684 == var1.field676 && var1.field679 == var1.field677 && var1.field689 == var1.field678) {
                        var1.method489(false);
                    }
                }
            } else if (var1.field684 < 0 || class314.method2222(var1.field689, true, var1.field684)) {
                class124.method985(var1.field687, var1.field679, var1.field684, var1.field680, var1.field688, var1.field686, -23831, var1.field689);
                var1.method489(false);
            }
        }
        if (arg0 >= -59) {
            field4984 = (class120) null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Leh;III)V", line = 252)
    public static final void method2233(class179 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class91.field1449) {
            class42 var4 = class34.field521[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field655 != null && var4.field655.field3609.method115()) {
                arg0.method104(var4.field655.field3609, 128, 0, 0, true);
            }
        }
        if (arg3 < class91.field1449) {
            class42 var5 = class34.field521[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field655 != null && var5.field655.field3609.method115()) {
                arg0.method104(var5.field655.field3609, 0, 0, 128, true);
            }
        }
        if (arg2 < class91.field1449 && arg3 < class327.field5110) {
            class42 var6 = class34.field521[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field655 != null && var6.field655.field3609.method115()) {
                arg0.method104(var6.field655.field3609, 128, 0, 128, true);
            }
        }
        if (arg2 < class91.field1449 && arg3 > 0) {
            class42 var7 = class34.field521[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field655 != null && var7.field655.field3609.method115()) {
                arg0.method104(var7.field655.field3609, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V", line = 302)
    public static final void method2234(boolean arg0) {
        class244.field3656 = null;
        class74.field1141 = null;
        class152.field2496 = null;
        field4983++;
        class26.field441 = null;
        if (!arg0) {
            field4985 = (class30[][][]) ((class30[][][]) null);
        }
        class4.field107 = null;
    }
}
