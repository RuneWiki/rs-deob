import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class140 {

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field3177 = 2;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "Lr;")
    public static class118 field3185 = class153.method1136(76, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lr;")
    public static class118 field3183 = class153.method1136(105, "Unerwartete Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Lqb;")
    public static class113 field3186 = new class113();

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "Lr;")
    public static class118 field3190 = class153.method1136(84, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "Lr;")
    public static class118 field3191 = class153.method1136(116, "compass");

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "Lbd;")
    public static class12 field3189;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "[Lvd;")
    public static class150[] field3187;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Z")
    public static final boolean method1045(int arg0, int arg1) {
        field3182++;
        if (arg0 != 0) {
            method1046(37);
        }
        return (arg1 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static void method1046(int arg0) {
        field3183 = null;
        field3190 = null;
        field3189 = null;
        if (arg0 == 81) {
            field3185 = null;
            field3191 = null;
            field3187 = null;
            field3186 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZIII)Lmd;")
    public static final class87 method1047(boolean arg0, int arg1, int arg2, int arg3) {
        class87 var4 = new class87();
        var4.field2107 = arg3;
        field3179++;
        var4.field2114 = arg1;
        class31.field797.method288(var4, (long) arg2, (byte) -91);
        class130.method1008((byte) -111, arg1);
        class75.method632(arg1, arg0);
        class74 var5 = class99.method770(-4894, arg2);
        if (var5 != null) {
            class26.method232((byte) 54, var5);
        }
        if (class101.field2351 != null) {
            class26.method232((byte) 94, class101.field2351);
            class101.field2351 = null;
        }
        class39.field950 = 0;
        class138.field3144 = false;
        if (!arg0) {
            return null;
        }
        class121.method947(class138.field3157, class151.field3418, 92, class71.field1651, class89.field2141);
        if (class48.field1167 != -1) {
            class113.method882((byte) 97, 1, class48.field1167);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static final void method1048(byte arg0) {
        if (arg0 != 38) {
            field3183 = null;
        }
        try {
            if (class139.field3167 == null) {
                class139.field3167 = new class1(class95.field2247, class144.method1066(true, new class118[] { class71.field1655, class110.field2547, class14.field346 }).method931(77));
            } else {
                byte[] var1 = class139.field3167.method5(false);
                if (var1 != null) {
                    class105 var2 = new class105(var1);
                    class100.field2305 = var2.method838((byte) 5);
                    class43.field1024 = new class32[class100.field2305];
                    for (int var3 = 0; var3 < class100.field2305; var3++) {
                        class32 var4 = class43.field1024[var3] = new class32();
                        int var5 = var2.method838((byte) 5);
                        var4.field804 = (var5 & 0x8000) != 0;
                        var4.field805 = var5 & 0x7FFF;
                        var4.field802 = var2.method810(1347010600);
                        var4.field799 = var2.method790((byte) 127);
                        var4.field807 = var3;
                        var4.field806 = class127.method985(var4.field802, 0);
                    }
                    class41.method333(class43.field1024.length - 1, class77.field1863, class43.field1024, 0, class83.field1993, (byte) 20);
                    class139.field3167 = null;
                    class108.field2508 = true;
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class139.field3167 = null;
        }
        field3176++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lpa;IIIIIII)V")
    public static final void method1049(class105 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3178++;
        if (arg4 >= 0 && arg4 < 104 && arg5 >= 0 && arg5 < 104) {
            class33.field830[arg3][arg4][arg5] = 0;
            while (true) {
                int var8 = arg0.method831((byte) 76);
                if (var8 == 0) {
                    if (arg3 == 0) {
                        class72.field1668[0][arg4][arg5] = -class133.method1024(class47.method392(arg6, 13607), arg2 + arg5 + 556238, 932731 - -arg4 + arg7) * 8;
                    } else {
                        class72.field1668[arg3][arg4][arg5] = class72.field1668[arg3 - 1][arg4][arg5] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg0.method831((byte) 76);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg3 == 0) {
                        class72.field1668[0][arg4][arg5] = -var9 * 8;
                    } else {
                        class72.field1668[arg3][arg4][arg5] = class72.field1668[arg3 - 1][arg4][arg5] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class128.field2933[arg3][arg4][arg5] = arg0.method807(false);
                    class87.field2100[arg3][arg4][arg5] = (byte) ((var8 - 2) / 4);
                    class54.field1273[arg3][arg4][arg5] = (byte) class79.method669(arg1 + var8 - 2, 3);
                } else if (var8 <= 81) {
                    class33.field830[arg3][arg4][arg5] = (byte) (var8 - 49);
                } else {
                    class82.field1977[arg3][arg4][arg5] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg0.method831((byte) 76);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg0.method831((byte) 76);
                    break;
                }
                if (var10 <= 49) {
                    arg0.method831((byte) 76);
                }
            }
        }
        if (arg6 != 29571) {
            field3189 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)V")
    public static final void method1050(int arg0, int arg1, int arg2) {
        field3188++;
        if (class39.field950 < 2 && class144.field3245 == 0 && !class35.field884) {
            return;
        }
        class118 var3;
        if (class144.field3245 == 1 && class39.field950 < 2) {
            var3 = class144.method1066(true, new class118[] { class33.field834, class85.field2097, class95.field2241, class23.field558 });
        } else if (class35.field884 && class39.field950 < 2) {
            var3 = class144.method1066(true, new class118[] { class103.field2378, class85.field2097, class56.field1334, class23.field558 });
        } else {
            var3 = class95.method747((byte) -113, class39.field950 - 1);
        }
        if (class39.field950 > 2) {
            var3 = class144.method1066(true, new class118[] { var3, class149.field3351, class43.method359(class39.field950 - 2, (byte) -122), class77.field1873 });
        }
        int var4 = class115.field2699.method43(var3, arg0 + 4, arg2 + 15, 16777215, 0, class105.field2438, class108.field2527);
        if (arg1 <= 41) {
            method1048((byte) 120);
        }
        class121.method947(arg0 + 4, class115.field2699.method33(var3) + var4, 90, 15, arg2);
    }
}
