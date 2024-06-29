import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public abstract class class34 {

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "Lbd;")
    public static class162 field552 = class17.method142(0, " loggt sich aus)3");

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public static int field551 = 0;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "Lbd;")
    public static class162 field553 = class17.method142(0, "Angreifen");

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "S")
    public static short field559 = 205;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    public static int field561 = 0;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "Lmb;")
    public static class10 field544 = class111.method896((byte) 68);

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public int field543;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public int field545;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public int field547;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public int field549;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public int field556;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public int field557;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "Lda;")
    public static class143 field546;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "Lda;")
    public static class143 field548;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "Lda;")
    public static class143 field554;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIZ)Lkg;", line = 7)
    public static final class172 method267(int arg0, int arg1, int arg2, boolean arg3) {
        field558++;
        class172 var4 = new class172();
        var4.field2987 = arg0;
        var4.field2985 = arg2;
        class137.field2440.method1674(var4, arg3, (long) arg1);
        client.method850(arg2, 21850);
        class78 var5 = class61.method419((byte) 28, arg1);
        if (var5 != null) {
            class55.method386(0, var5);
        }
        if (class243.field4040 != null) {
            class55.method386(0, class243.field4040);
            class243.field4040 = null;
        }
        int var6 = class293.field4931;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class279.method1917((byte) -40, class105.field1911[var7])) {
                class274.method1857(var7, (byte) 93);
            }
        }
        if (class293.field4931 == 1) {
            class32.field539 = false;
            class222.method1608(class240.field3984, class311.field5221, 112, class6.field58, class148.field2675);
        } else {
            class222.method1608(class240.field3984, class311.field5221, 104, class6.field58, class148.field2675);
            int var8 = class207.field3507.method1896(class9.field106);
            for (int var9 = 0; var9 < class293.field4931; var9++) {
                int var10 = class207.field3507.method1896(class180.method1370((byte) 123, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class6.field58 = var8 + 8;
            class311.field5221 = class293.field4931 * 15 + 22;
        }
        if (var5 != null) {
            class138.method1077(var5, 122, false);
        }
        class141.method1104(84374508, arg2);
        if (class265.field4412 != -1) {
            class30.method248(1, 23, class265.field4412);
        }
        return var4;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(IIIZ)V", line = 100)
    public static final void method268(int arg0, int arg1, int arg2, boolean arg3) {
        field560++;
        class78 var4 = class112.method903(arg2, arg0, -25988);
        if (var4 != null && var4.field1282 != null) {
            class180 var5 = new class180();
            var5.field3102 = var4.field1282;
            var5.field3099 = var4;
            class31.method257(-32581, var5);
        }
        class60.field930 = arg1;
        if (arg3) {
            method270((byte) -80);
        }
        class282.field4795 = arg2;
        class13.field213 = true;
        class46.field729 = arg0;
        class55.method386(0, var4);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V", line = 128)
    public static final void method269(int arg0) {
        int var1 = class162.field2878 * 128 + 64;
        field555++;
        int var2 = class13.field212 * 128 + 64;
        int var3 = class3.method15(var1, class157.field2765, var2, false) - class286.field4824;
        if (class257.field4265 < 100) {
            if (var2 > class67.field1083) {
                class67.field1083 += (var2 - class67.field1083) * class257.field4265 / 1000 + class126.field2293;
                if (var2 < class67.field1083) {
                    class67.field1083 = var2;
                }
            }
            if (var1 > class160.field2800) {
                class160.field2800 += class126.field2293 + ((var1 - class160.field2800) * class257.field4265 / 1000);
                if (var1 < class160.field2800) {
                    class160.field2800 = var1;
                }
            }
            if (var2 < class67.field1083) {
                class67.field1083 -= class126.field2293 + ((class67.field1083 - var2) * class257.field4265 / 1000);
                if (var2 > class67.field1083) {
                    class67.field1083 = var2;
                }
            }
            if (class160.field2800 > var1) {
                class160.field2800 -= class126.field2293 + ((class160.field2800 - var1) * class257.field4265 / 1000);
                if (var1 > class160.field2800) {
                    class160.field2800 = var1;
                }
            }
            if (class18.field294 < var3) {
                class18.field294 += (var3 - class18.field294) * class257.field4265 / 1000 + class126.field2293;
                if (class18.field294 > var3) {
                    class18.field294 = var3;
                }
            }
            if (var3 < class18.field294) {
                class18.field294 -= class126.field2293 + ((class18.field294 - var3) * class257.field4265 / 1000);
                if (var3 > class18.field294) {
                    class18.field294 = var3;
                }
            }
        } else {
            class160.field2800 = class162.field2878 * 128 + 64;
            class67.field1083 = class13.field212 * 128 + 64;
            class18.field294 = class3.method15(class160.field2800, class157.field2765, class67.field1083, false) - class286.field4824;
        }
        int var4 = class260.field4323 * 128 + 64;
        int var5 = class27.field457 * 128 + 64;
        int var6 = class3.method15(var4, class157.field2765, var5, false) - class224.field3747;
        int var7 = var4 - class160.field2800;
        int var8 = var5 - class67.field1083;
        int var9 = var6 - class18.field294;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
        if (arg0 > -9) {
            field553 = (class162) null;
        }
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (Math.atan2((double) var7, (double) var8) * -325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var13 = var12 - class180.field3088;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class180.field3088 += class261.field4348 * var13 / 1000 + class82.field1436;
            class180.field3088 &= 0x7FF;
        }
        if (class216.field3613 < var11) {
            class216.field3613 += class82.field1436 + ((var11 - class216.field3613) * class261.field4348 / 1000);
            if (class216.field3613 > var11) {
                class216.field3613 = var11;
            }
        }
        if (var13 < 0) {
            class180.field3088 -= -var13 * class261.field4348 / 1000 + class82.field1436;
            class180.field3088 &= 0x7FF;
        }
        int var14 = var12 - class180.field3088;
        if (var11 < class216.field3613) {
            class216.field3613 -= class82.field1436 + ((class216.field3613 - var11) * class261.field4348 / 1000);
            if (var11 > class216.field3613) {
                class216.field3613 = var11;
            }
        }
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class180.field3088 = var12;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)I", line = 283)
    public static final int method270(byte arg0) {
        field550++;
        int var1 = -105 / ((arg0 - 66) / 35);
        return ((class154.field2727 == 0 ? 0 : 1) << 20) + (class112.field2031 & 0x3 << 17) + ((class259.field4317 ? 1 : 0) << 16) + ((class27.field458 ? 1 : 0) << 15) + ((class92.field1634 ? 1 : 0) << 13) + ((class291.field4906 & 0x3) << 11) + ((class295.field4945 ? 1 : 0) << 8) + ((class261.field4362 ? 1 : 0) << 7) + ((class203.field3439 ? 1 : 0) << 6) + ((class267.field4461 ? 1 : 0) << 5) + ((class45.field724 ? 1 : 0) << 4) + ((class198.field3369 ? 1 : 0) << 3) + (class39.field639 & 0x7) + ((class247.field4090 ? 1 : 0) << 9) + (((class92.field1621 ? 1 : 0) << 10) - (-((class156.field2746 ? 1 : 0) << 19) - ((class135.field2413 == 0 ? 0 : 1) << 21) - ((class256.field4256 == 0 ? 0 : 1) << 22)));
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V", line = 299)
    public static void method271(int arg0) {
        field546 = null;
        if (arg0 != -17251) {
            field552 = (class162) null;
        }
        field554 = null;
        field552 = null;
        field544 = null;
        field553 = null;
        field548 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I[Lba;)V", line = 340)
    public static final void method273(int arg0, class26[] arg1) {
        class123.field2219[arg0] = arg1;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)V")
    public abstract void method266(int arg0, int arg1);

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)V")
    public abstract void method272(int arg0, int arg1, int arg2);
}
