import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class153 extends class293 {

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "Lqb;")
    public static class209 field2717 = new class209(200);

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
    public static int field2721 = 0;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "[[S")
    public static short[][] field2723;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V", line = 17)
    public static final void method1191(byte arg0) {
        class55.method386(0, class17.field284);
        class231.field3861++;
        if (arg0 != -56) {
            return;
        }
        field2722++;
        if (class230.field3839 && class58.field909) {
            int var1 = class109.field1961;
            int var2 = var1 - class250.field4171;
            if (var2 < class84.field1513) {
                var2 = class84.field1513;
            }
            if (class17.field284.field1340 + var2 > class84.field1513 + class205.field3464.field1340) {
                var2 = class84.field1513 - (class17.field284.field1340 - class205.field3464.field1340);
            }
            int var3 = class274.field4554;
            int var4 = var3 - class30.field506;
            int var5 = var2 - class207.field3499;
            if (var4 < class46.field737) {
                var4 = class46.field737;
            }
            int var6 = class17.field284.field1295;
            if ((class46.field737 + class205.field3464.field1367) < (class17.field284.field1367 + var4)) {
                var4 = class205.field3464.field1367 + class46.field737 - class17.field284.field1367;
            }
            int var7 = class205.field3464.field1258 + var4 - class46.field737;
            int var8 = var2 - (class84.field1513 - class205.field3464.field1326);
            int var9 = var4 - class258.field4300;
            if (class17.field284.field1350 < class231.field3861 && (var5 > var6 || var5 < (-var6) || var9 > var6 || -var6 > var9)) {
                class25.field405 = true;
            }
            if (class17.field284.field1284 != null && class25.field405) {
                class180 var10 = new class180();
                var10.field3102 = class17.field284.field1284;
                var10.field3083 = var7;
                var10.field3099 = class17.field284;
                var10.field3090 = var8;
                class31.method257(-32581, var10);
            }
            if (class92.field1628 == 0) {
                if (class25.field405) {
                    if (class17.field284.field1228 != null) {
                        class180 var11 = new class180();
                        var11.field3102 = class17.field284.field1228;
                        var11.field3092 = class277.field4635;
                        var11.field3099 = class17.field284;
                        var11.field3083 = var7;
                        var11.field3090 = var8;
                        class31.method257(-32581, var11);
                    }
                    if (class277.field4635 != null && client.method863(class17.field284) != null) {
                        class89.field1595++;
                        class187.field3229.method338(194, (byte) 8);
                        class187.field3229.method704(false, class277.field4635.field1235);
                        class187.field3229.method737(-124, class277.field4635.field1276);
                        class187.field3229.method737(-128, class17.field284.field1276);
                        class187.field3229.method704(false, class17.field284.field1235);
                    }
                } else if ((class207.field3495 == 1 || method1198(class293.field4931 - 1, arg0 + 2056)) && class293.field4931 > 2) {
                    class178.method1346((byte) 8);
                } else if (class293.field4931 > 0) {
                    class289.method2002(arg0 + 55);
                }
                class17.field284 = null;
            }
        } else if (class231.field3861 > 1) {
            class17.field284 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)V", line = 146)
    public static final void method1192(int arg0, int arg1, int arg2) {
        field2720++;
        class263.field4389[arg0] = arg2;
        if (arg1 != -3917) {
            field2717 = (class209) null;
        }
        class156 var3 = (class156) class235.field3925.method1672((long) arg0, 19760);
        if (var3 == null) {
            class156 var4 = new class156(4611686018427387905L);
            class235.field3925.method1674(var4, false, (long) arg0);
        } else if (var3.field2747 != 4611686018427387905L) {
            var3.field2747 = class300.method2048((byte) 18) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lb;I)Ldh;", line = 178)
    public static final class177 method1193(class94 arg0, int arg1) {
        field2718++;
        class177 var2 = new class177(arg0.method744((byte) 81), arg0.method744((byte) 54), arg0.method761((byte) 108), arg0.method761((byte) 108), arg0.method747(false), arg0.method756(915905888) == 1);
        int var3 = arg0.method756(915905888);
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field3033.method167(false, new class48(arg0.method761((byte) 108), arg0.method761((byte) 108), arg0.method761((byte) 108), arg0.method761((byte) 108)));
        }
        if (arg1 >= -73) {
            field2717 = (class209) null;
        }
        var2.method1344((byte) -85);
        return var2;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)[Lgg;", line = 219)
    public static final class34[] method1194(int arg0) {
        class34[] var1 = new class34[class129.field2334];
        field2715++;
        if (arg0 != 2000) {
            method1193((class94) null, 74);
        }
        for (int var2 = 0; var2 < class129.field2334; var2++) {
            if (class117.field2159) {
                var1[var2] = new class249(class238.field3962, class277.field4637, class127.field2312[var2], class40.field646[var2], class190.field3253[var2], class260.field4333[var2], class317.field5350[var2], class306.field5152);
            } else {
                var1[var2] = new class99(class238.field3962, class277.field4637, class127.field2312[var2], class40.field646[var2], class190.field3253[var2], class260.field4333[var2], class317.field5350[var2], class306.field5152);
            }
        }
        class247.method1738(54);
        return var1;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BI)I", line = 246)
    public static final int method1195(byte arg0, int arg1) {
        class70 var2 = class111.method897((byte) -60, arg1);
        field2719++;
        int var3 = var2.field1116;
        int var4 = var2.field1122;
        int var5 = var2.field1118;
        if (arg0 <= 109) {
            return 18;
        } else {
            int var6 = class129.field2332[var3 - var5];
            return class129.field2329[var4] >> var5 & var6;
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V", line = 266)
    public static void method1196(int arg0) {
        field2717 = null;
        field2723 = (short[][]) null;
        if (arg0 != -19725) {
            method1193((class94) null, 119);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lda;ZII)Lud;", line = 282)
    public static final class79 method1197(class143 arg0, boolean arg1, int arg2, int arg3) {
        field2716++;
        if (class94.method757(arg0, arg2, -1908303920, arg3)) {
            if (!arg1) {
                field2717 = (class209) null;
            }
            return class286.method1974(false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)Z", line = 305)
    public static final boolean method1198(int arg0, int arg1) {
        field2713++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class105.field1911[arg0];
        if (var2 >= arg1) {
            var2 -= 2000;
        }
        return var2 == 1003;
    }
}
