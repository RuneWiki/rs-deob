import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class45 extends class141 {

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "Z")
    public static boolean field1180 = false;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "Lkd;")
    public static class73 field1178 = class126.method1070((byte) -66, "und die Schaltfl-=che (WSpielkonto erstellen(W am");

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "I")
    public static int field1187 = 5063219;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "Lkd;")
    public static class73 field1179 = class126.method1070((byte) -66, "ams");

    @OriginalMember(owner = "client!gb", name = "Q", descriptor = "I")
    public static int field1194 = 0;

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "Lde;")
    public static class27 field1184;

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "Lgb;")
    public class45 field1181;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "Lgb;")
    public class45 field1183;

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "Z")
    public static boolean field1188;

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "[I")
    public static int[] field1186;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static void method334(int arg0) {
        if (arg0 != -1) {
            field1194 = 29;
        }
        field1178 = null;
        field1179 = null;
        field1186 = null;
        field1184 = null;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)La;")
    public static final class1 method335(int arg0, int arg1) {
        field1189++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class120.field3066[var2] == null || class120.field3066[var2][var3] == null) {
            boolean var4 = class80.method690(var2, -1);
            if (!var4) {
                return null;
            }
        }
        return arg1 > -58 ? null : class120.field3066[var2][var3];
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(B)V")
    public static final void method336(byte arg0) {
        class89.field2235.method1205(8);
        int var1 = class89.field2235.method1211(8, 7);
        if (client.field618 > var1) {
            for (int var2 = var1; var2 < client.field618; var2++) {
                class89.field2246[class58.field1547++] = class55.field1455[var2];
            }
        }
        field1185++;
        if (client.field618 < var1) {
            throw new RuntimeException("gnpov1");
        }
        client.field618 = 0;
        if (arg0 >= -22) {
            return;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class55.field1455[var3];
            class9 var5 = class133.field3345[var4];
            int var6 = class89.field2235.method1211(1, 7);
            if (var6 == 0) {
                class55.field1455[client.field618++] = var4;
                var5.field2270 = class49.field1308;
            } else {
                int var7 = class89.field2235.method1211(2, 7);
                if (var7 == 0) {
                    class55.field1455[client.field618++] = var4;
                    var5.field2270 = class49.field1308;
                    class137.field3422[class110.field2712++] = var4;
                } else if (var7 == 1) {
                    class55.field1455[client.field618++] = var4;
                    var5.field2270 = class49.field1308;
                    int var8 = class89.field2235.method1211(3, 7);
                    var5.method743(28077, var8, false);
                    int var9 = class89.field2235.method1211(1, 7);
                    if (var9 == 1) {
                        class137.field3422[class110.field2712++] = var4;
                    }
                } else if (var7 == 2) {
                    class55.field1455[client.field618++] = var4;
                    var5.field2270 = class49.field1308;
                    int var10 = class89.field2235.method1211(3, 7);
                    var5.method743(28077, var10, true);
                    int var11 = class89.field2235.method1211(3, 7);
                    var5.method743(28077, var11, true);
                    int var12 = class89.field2235.method1211(1, 7);
                    if (var12 == 1) {
                        class137.field3422[class110.field2712++] = var4;
                    }
                } else if (var7 == 3) {
                    class89.field2246[class58.field1547++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)V")
    public static final void method337(int arg0, byte arg1) {
        field1193++;
        if (class1.field35 == arg0) {
            return;
        }
        if (class1.field35 == 0) {
            class74.method648((byte) -20);
        }
        if (arg0 == 20 || arg0 == 40) {
            class20.field549 = 0;
            class107.field2656 = 0;
            class111.field2766 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && class105.field2622 != null) {
            class105.field2622.method1135(-119);
            class105.field2622 = null;
        }
        if (class1.field35 == 25 || class1.field35 == 40) {
            class136.method1115(8);
            class17.method140();
        }
        if (class1.field35 == 25) {
            class9.field308 = 1;
            class18.field529 = 1;
            class126.field3240 = 0;
            class81.field2053 = 0;
            class86.field2177 = 0;
        }
        if (arg0 == 0 || arg0 == 35) {
            class2.method15((byte) 15);
            class44.method331((byte) 124);
            if (class57.field1516 == null) {
                class57.field1516 = class72.method600(class18.field519, 765, 503, -30723);
            }
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class57.field1516 = null;
            class2.method15((byte) 118);
            class150.method1212(class18.field519, 0, class11.field362, class5.field180);
        }
        if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
            class57.field1516 = null;
            class44.method331((byte) 124);
            class47.method368(class5.field180, class18.field519, -109);
        }
        class140.field3479 = true;
        class1.field35 = arg0;
        if (arg1 > -56) {
            method338(122, 15, -38, -87, -72);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)V")
    public static final void method338(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 0) {
            return;
        }
        for (class23 var5 = (class23) class141.field3505.method514((byte) -79); var5 != null; var5 = (class23) class141.field3505.method517(-73)) {
            if (var5.field651 != -1 || var5.field657 != null) {
                int var6 = 0;
                if (var5.field678 < arg3) {
                    var6 += arg3 - var5.field678;
                } else if (arg3 < var5.field661) {
                    var6 += var5.field661 - arg3;
                }
                if (var5.field646 < arg1) {
                    var6 += arg1 - var5.field646;
                } else if (var5.field659 > arg1) {
                    var6 += var5.field659 - arg1;
                }
                if (var6 - 64 > var5.field648 || class99.field2492 == 0 || var5.field663 != arg2) {
                    if (var5.field668 != null) {
                        class21.field575.method916(var5.field668);
                        var5.field668 = null;
                    }
                    if (var5.field675 != null) {
                        class21.field575.method916(var5.field675);
                        var5.field675 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field648 - var6) * class99.field2492 / var5.field648;
                    if (var5.field668 != null) {
                        var5.field668.method489(var7);
                    } else if (var5.field651 >= 0) {
                        class93 var8 = class93.method777(class121.field3101, var5.field651, 0);
                        if (var8 != null) {
                            class108 var9 = var8.method776().method869(class109.field2672);
                            class56 var10 = class56.method483(var9, 100, var7);
                            var10.method455(-1);
                            class21.field575.method922(var10);
                            var5.field668 = var10;
                        }
                    }
                    if (var5.field675 != null) {
                        var5.field675.method489(var7);
                        if (!var5.field675.method1152((byte) -40)) {
                            var5.field675 = null;
                        }
                    } else if (var5.field657 != null && (var5.field681 -= arg4) <= 0) {
                        int var11 = (int) ((double) var5.field657.length * Math.random());
                        class93 var12 = class93.method777(class121.field3101, var5.field657[var11], 0);
                        if (var12 != null) {
                            class108 var13 = var12.method776().method869(class109.field2672);
                            class56 var14 = class56.method483(var13, 100, var7);
                            var14.method455(0);
                            class21.field575.method922(var14);
                            var5.field675 = var14;
                            var5.field681 = (int) (Math.random() * (double) (var5.field656 - var5.field645)) + var5.field645;
                        }
                    }
                }
            }
        }
        field1191++;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
    public final void method339(int arg0) {
        field1182++;
        if (this.field1181 == null) {
            return;
        }
        this.field1181.field1183 = this.field1183;
        this.field1183.field1181 = this.field1181;
        this.field1183 = null;
        if (arg0 < 84) {
            method335(0, 43);
        }
        this.field1181 = null;
    }
}
