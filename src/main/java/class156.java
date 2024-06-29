import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class156 {

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "Lcc;")
    private class201 field2686 = new class201();

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field2680 = 0;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "Ljd;")
    public static class85 field2678 = class221.method1499(":chalreq:", (byte) -86);

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field2681 = 0;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "Ljd;")
    public static class85 field2684 = class221.method1499("AUS", (byte) 121);

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "Lcc;")
    private class201 field2689;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "[Lc;")
    public static class103[] field2675;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)Lcc;")
    public final class201 method1021(int arg0) {
        field2682++;
        int var2 = -94 % ((-arg0 - 20) / 62);
        class201 var3 = this.field2686.field3503;
        if (this.field2686 == var3) {
            return null;
        } else {
            var3.method1380(true);
            return var3;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIII)V")
    public static final void method1022(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2688++;
        if (class56.field976 < 100) {
            class5.method19(-1);
        }
        class179.method1216(arg3, arg1, arg3 + arg4, arg1 - -arg2);
        if (class56.field976 < 100) {
            byte var5 = 20;
            int var6 = arg4 / 2 + arg3;
            int var7 = arg1 + (arg2 / 2) - var5 - 18;
            class179.method1222(arg3, arg1, arg4, arg2, 0);
            class179.method1217(var6 - 152, var7, 304, 34, 9179409);
            class179.method1217(var6 - 151, var7 + 1, 302, 32, 0);
            class179.method1222(var6 - 150, var7 + 2, class56.field976 * 3, 30, 9179409);
            class179.method1222(var6 - (150 - (class56.field976 * 3)), var7 + 2, 300 - (class56.field976 * 3), 30, 0);
            class180.field3092.method71(class234.field4054, var6, var5 + var7, 16777215, -1);
            return;
        }
        class228.field3960 = (int) ((float) (arg2 * 2) / class99.field1779);
        class37.field571 = (int) ((float) (arg4 * 2) / class99.field1779);
        class18.field264 = class168.field2901 - ((int) ((float) arg2 / class99.field1779));
        class208.field3632 = class6.field75 - ((int) ((float) arg4 / class99.field1779));
        int var8 = class6.field75 - ((int) ((float) arg4 / class99.field1779));
        int var9 = class168.field2901 - ((int) ((float) arg2 / class99.field1779));
        int var10 = -103 % ((arg0 + 39) / 35);
        int var11 = (int) ((float) arg4 / class99.field1779) + class6.field75;
        int var12 = (int) ((float) arg2 / class99.field1779) + class168.field2901;
        class240.method1631(var9, var8, var12, arg3, var11, arg1, arg1 + arg2, arg3 + arg4, -116);
        class195.method1325(var12, arg1, arg3, arg1 + arg2, var9, var8, (byte) -119, var11, arg3 + arg4);
        class77.method536(var8, arg1, arg1 + arg2, arg3 + arg4, (byte) 14, var11, arg3, var9, var12);
        if (class268.field4776 > 0) {
            class268.field4776--;
        }
        if (!class28.field432) {
            return;
        }
        int var13 = arg3 + arg4 - 5;
        int var14 = arg1 + arg2 - 8;
        int var15 = 16776960;
        class30.field457.method62(class172.method1150(new class85[] { class168.field2891, class68.method451(class131.field2283, -12572) }, 0), var13, var14, 16776960, -1);
        int var18 = var14 - 15;
        Runtime var16 = Runtime.getRuntime();
        int var17 = (int) ((var16.totalMemory() - var16.freeMemory()) / 1024L);
        if (var17 > 65536) {
            var15 = 16711680;
        }
        class30.field457.method62(class172.method1150(new class85[] { class226.field3940, class68.method451(var17, -12572), class241.field4150 }, 0), var13, var18, var15, -1);
        var14 = var18 - 15;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method1023(byte arg0, Component arg1) {
        field2685++;
        Method var2 = class81.field1482;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        if (arg0 < 90) {
            method1024(-65);
        }
        arg1.addKeyListener(class79.field1450);
        arg1.addFocusListener(class79.field1450);
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
    public static void method1024(int arg0) {
        field2675 = null;
        field2684 = null;
        field2678 = null;
        if (arg0 != 0) {
            method1026(-91, 16, -33, 89);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILcc;)V")
    public final void method1025(int arg0, class201 arg1) {
        if (arg1.field3498 != null) {
            arg1.method1380(true);
        }
        arg1.field3503 = this.field2686;
        arg1.field3498 = this.field2686.field3498;
        field2690++;
        arg1.field3498.field3503 = arg1;
        if (arg0 != 29642) {
            field2680 = 49;
        }
        arg1.field3503.field3498 = arg1;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1026(int arg0, int arg1, int arg2, int arg3) {
        if (!class141.method925(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class245.field4193[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class221.field3877) {
                    if (!class264.method1817(var4, var6, var5)) {
                        return false;
                    }
                    if (!class264.method1817(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class264.method1817(var4, var7, var5)) {
                        return false;
                    }
                    if (!class264.method1817(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class264.method1817(var4, var8, var5)) {
                    return false;
                }
                if (!class264.method1817(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class237.field4097) {
                    if (!class264.method1817(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class264.method1817(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class264.method1817(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class264.method1817(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class264.method1817(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class264.method1817(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class221.field3877) {
                    if (!class264.method1817(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class264.method1817(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class264.method1817(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class264.method1817(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class264.method1817(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class264.method1817(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class237.field4097) {
                    if (!class264.method1817(var4, var6, var5)) {
                        return false;
                    }
                    if (!class264.method1817(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class264.method1817(var4, var7, var5)) {
                        return false;
                    }
                    if (!class264.method1817(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class264.method1817(var4, var8, var5)) {
                    return false;
                }
                if (!class264.method1817(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class264.method1817(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class264.method1817(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class264.method1817(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class264.method1817(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class264.method1817(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)I")
    public static final int method1027(int arg0, int arg1) {
        field2679++;
        if (arg1 != 16169) {
            method1022(-23, 28, -59, -76, 71);
        }
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)Lcc;")
    public final class201 method1028(int arg0) {
        if (arg0 < 6) {
            method1026(56, 32, 51, 1);
        }
        field2683++;
        class201 var2 = this.field2686.field3503;
        if (this.field2686 == var2) {
            this.field2689 = null;
            return null;
        } else {
            this.field2689 = var2.field3503;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
    public final void method1029(int arg0) {
        while (true) {
            class201 var2 = this.field2686.field3503;
            if (this.field2686 == var2) {
                field2687++;
                if (arg0 != 230) {
                    this.method1030(22);
                }
                this.field2689 = null;
                return;
            }
            var2.method1380(true);
        }
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)Lcc;")
    public final class201 method1030(int arg0) {
        field2677++;
        class201 var2 = this.field2689;
        if (this.field2686 == var2) {
            this.field2689 = null;
            return null;
        } else if (arg0 <= 122) {
            return null;
        } else {
            this.field2689 = var2.field3503;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class156() {
        this.field2686.field3498 = this.field2686;
        this.field2686.field3503 = this.field2686;
    }
}
