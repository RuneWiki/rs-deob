import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class53 {

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "Lqi;")
    private class216 field844 = new class216();

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "Lbd;")
    private static class162 field839 = class17.method142(0, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field841 = 0;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Lbd;")
    public static class162 field843 = field839;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "Lqi;")
    private class216 field853;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "[I")
    public static int[] field842;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V", line = 5)
    public static void method372(byte arg0) {
        field843 = null;
        field842 = null;
        int var1 = 83 % ((arg0 + 34) / 49);
        field839 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)Lqi;", line = 23)
    public final class216 method373(boolean arg0) {
        field840++;
        class216 var2 = this.field844.field3607;
        if (this.field844 == var2) {
            this.field853 = null;
            return null;
        }
        this.field853 = var2.field3607;
        if (!arg0) {
            method375(false, (class143) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)Lqi;", line = 62)
    public final class216 method374(int arg0) {
        field848++;
        class216 var2 = this.field844.field3607;
        if (this.field844 == var2) {
            return null;
        }
        if (arg0 != 1348) {
            field839 = (class162) null;
        }
        var2.method1573(arg0 ^ 0xFFFFDF44);
        return var2;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZLda;)I", line = 81)
    public static final int method375(boolean arg0, class143 arg1) {
        field845++;
        int var2 = 0;
        if (arg1.method1118(class51.field818, 26604)) {
            var2++;
        }
        if (arg0) {
            field842 = (int[]) null;
        }
        if (arg1.method1118(class42.field676, 26604)) {
            var2++;
        }
        if (arg1.method1118(class250.field4181, 26604)) {
            var2++;
        }
        if (arg1.method1118(class207.field3497, 26604)) {
            var2++;
        }
        if (arg1.method1118(class10.field119, 26604)) {
            var2++;
        }
        if (arg1.method1118(class295.field4944, 26604)) {
            var2++;
        }
        if (arg1.method1118(class314.field5291, 26604)) {
            var2++;
        }
        if (arg1.method1118(class172.field2981, 26604)) {
            var2++;
        }
        if (arg1.method1118(class115.field2043, 26604)) {
            var2++;
        }
        if (arg1.method1118(class110.field1994, 26604)) {
            var2++;
        }
        if (arg1.method1118(class213.field3571, 26604)) {
            var2++;
        }
        if (arg1.method1118(class233.field3881, 26604)) {
            var2++;
        }
        if (arg1.method1118(class205.field3462, 26604)) {
            var2++;
        }
        if (arg1.method1118(class278.field4670, 26604)) {
            var2++;
        }
        if (arg1.method1118(class106.field1929, 26604)) {
            var2++;
        }
        if (arg1.method1118(class162.field2833, 26604)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)Lqi;", line = 152)
    public final class216 method376(boolean arg0) {
        field847++;
        if (!arg0) {
            return (class216) null;
        }
        class216 var2 = this.field853;
        if (this.field844 == var2) {
            this.field853 = null;
            return null;
        } else {
            this.field853 = var2.field3607;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V", line = 184)
    public static final void method377(int arg0) {
        field846++;
        if (class237.method1680(true) != 2) {
            return;
        }
        int var1 = class279.field4702 % 104;
        byte var2 = (byte) (class279.field4702 - 4 & 0xFF);
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class201.field3421[var3][var1][var4] = var2;
            }
        }
        if (arg0 != -244493849) {
            method381(45, (int[]) null, true, 110L);
        }
        if (class157.field2765 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class315.field5324[var5] = -1000000;
            class70.field1123[var5] = 1000000;
            class296.field4954[var5] = 0;
            class278.field4680[var5] = 1000000;
            class25.field414[var5] = 0;
        }
        if (class302.field5085 != 1) {
            int var6 = class3.method15(class160.field2800, class157.field2765, class67.field1083, false);
            if ((var6 - class18.field294) < 800 && (class213.field3580[class157.field2765][class160.field2800 >> 7][class67.field1083 >> 7] & 0x4) != 0) {
                class259.method1790(1, false, false, class288.field4856, class160.field2800 >> 7, class67.field1083 >> 7);
            }
            return;
        }
        if ((class213.field3580[class157.field2765][class122.field2215.field5013 >> 7][class122.field2215.field5047 >> 7] & 0x4) != 0) {
            class259.method1790(0, false, false, class288.field4856, class122.field2215.field5013 >> 7, class122.field2215.field5047 >> 7);
        }
        if (class216.field3613 >= 310) {
            return;
        }
        int var7 = class160.field2800 >> 7;
        int var8 = class67.field1083 >> 7;
        int var9 = class122.field2215.field5013 >> 7;
        int var10 = class122.field2215.field5047 >> 7;
        int var11;
        if (var7 >= var9) {
            var11 = var7 - var9;
        } else {
            var11 = var9 - var7;
        }
        int var12;
        if (var10 > var8) {
            var12 = var10 - var8;
        } else {
            var12 = var8 - var10;
        }
        if (var11 > var12) {
            int var15 = var12 * 65536 / var11;
            int var16 = 32768;
            while (var7 != var9) {
                if (var9 > var7) {
                    var7++;
                } else if (var9 < var7) {
                    var7--;
                }
                if ((class213.field3580[class157.field2765][var7][var8] & 0x4) != 0) {
                    class259.method1790(1, false, false, class288.field4856, var7, var8);
                    break;
                }
                var16 += var15;
                if (var16 >= 65536) {
                    var16 -= 65536;
                    if (var10 > var8) {
                        var8++;
                    } else if (var10 < var8) {
                        var8--;
                    }
                    if ((class213.field3580[class157.field2765][var7][var8] & 0x4) != 0) {
                        class259.method1790(1, false, false, class288.field4856, var7, var8);
                        break;
                    }
                }
            }
            return;
        }
        int var13 = var11 * 65536 / var12;
        int var14 = 32768;
        while (var8 != var10) {
            if (var10 > var8) {
                var8++;
            } else if (var8 > var10) {
                var8--;
            }
            if ((class213.field3580[class157.field2765][var7][var8] & 0x4) != 0) {
                class259.method1790(1, false, false, class288.field4856, var7, var8);
                break;
            }
            var14 += var13;
            if (var14 >= 65536) {
                if (var7 < var9) {
                    var7++;
                } else if (var9 < var7) {
                    var7--;
                }
                var14 -= 65536;
                if ((class213.field3580[class157.field2765][var7][var8] & 0x4) != 0) {
                    class259.method1790(1, false, false, class288.field4856, var7, var8);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V", line = 375)
    public final void method378(int arg0) {
        field838++;
        if (arg0 > -20) {
            return;
        }
        while (true) {
            class216 var2 = this.field844.field3607;
            if (this.field844 == var2) {
                this.field853 = null;
                return;
            }
            var2.method1573(-9728);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lqi;I)V", line = 402)
    public final void method379(class216 arg0, int arg1) {
        field852++;
        if (arg0.field3611 != null) {
            arg0.method1573(-9728);
        }
        arg0.field3607 = this.field844;
        if (arg1 == 255) {
            arg0.field3611 = this.field844.field3611;
            arg0.field3611.field3607 = arg0;
            arg0.field3607.field3611 = arg0;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V", line = 480)
    public class53() {
        this.field844.field3611 = this.field844;
        this.field844.field3607 = this.field844;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)I", line = 431)
    public final int method380(byte arg0) {
        int var2 = 0;
        if (arg0 >= -14) {
            field839 = (class162) null;
        }
        class216 var3 = this.field844.field3607;
        field851++;
        while (this.field844 != var3) {
            var2++;
            var3 = var3.field3607;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I[IZJ)Lbd;", line = 453)
    public static final class162 method381(int arg0, int[] arg1, boolean arg2, long arg3) {
        field849++;
        if (class242.field4016 != null) {
            class162 var5 = class242.field4016.method485(arg0, arg1, arg3, false);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg0 == 5) {
            return class317.method2178(arg3, (byte) -123).method1265((byte) 46);
        } else if (arg2) {
            return class67.method482(-124, arg3);
        } else {
            return (class162) null;
        }
    }
}
