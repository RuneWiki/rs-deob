import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class99 extends class106 {

    @OriginalMember(owner = "client!l", name = "M", descriptor = "I")
    public int field2094 = 0;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "I")
    public static int field2090 = -1;

    @OriginalMember(owner = "client!l", name = "O", descriptor = "Z")
    public static boolean field2096 = false;

    @OriginalMember(owner = "client!l", name = "R", descriptor = "J")
    public static volatile long field2099 = 0L;

    @OriginalMember(owner = "client!l", name = "H", descriptor = "I")
    public static int field2089 = 0;

    @OriginalMember(owner = "client!l", name = "J", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!l", name = "L", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!l", name = "N", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!l", name = "P", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!l", name = "S", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V")
    public static final void method800(int arg0) {
        field2091++;
        class35.method302((byte) -87);
        class124.method945(0);
        class56.method487((byte) 109);
        class62.method526(-100);
        class52.method461((byte) 88);
        class186.method1238(true);
        class18.method197(1);
        class40.method341((byte) -115);
        client.method260((byte) 50);
        class117.method917(-94);
        class122.method935((byte) 119);
        class115.method905(2047);
        ((class91) class17.field354).method736(-16);
        class151.field2962.method993(1);
        class206.field4048.method59(123);
        class91.field1908.method59(112);
        class165.field3205.method59(116);
        class147.field2882.method59(115);
        class87.field1862.method59(125);
        class189.field3667.method59(126);
        class47.field936.method59(118);
        class3.field45.method59(124);
        class25.field491.method59(126);
        class72.field1548.method59(121);
        if (arg0 < -119) {
            class147.field2880.method59(121);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lhd;Z)V")
    public final void method801(class68 arg0, boolean arg1) {
        field2092++;
        if (!arg1) {
            method802(-56, -110);
        }
        while (true) {
            int var3 = arg0.method604((byte) -3);
            if (var3 == 0) {
                return;
            }
            this.method804(arg0, 5, var3);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Lma;")
    public static final class109 method802(int arg0, int arg1) {
        field2093++;
        if (arg0 != 17582) {
            field2096 = true;
        }
        class109 var2 = (class109) class204.field4014.method986((byte) 50, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        class109 var3 = class183.method1220(2101587688, class90.field1891, arg1, false, class153.field3011);
        if (var3 != null) {
            class204.field4014.method987((long) arg1, var3, 28842);
        }
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V")
    public static final void method803(int arg0) {
        field2097++;
        class27 var1 = class147.field2881;
        synchronized (class147.field2881) {
            class153.field3008 = class57.field1127;
            if (class106.field2216 >= 0) {
                while (class82.field1758 != class106.field2216) {
                    int var3 = class149.field2915[class82.field1758];
                    class82.field1758 = class82.field1758 + 1 & 0x7F;
                    if (var3 < 0) {
                        class90.field1892[~var3] = false;
                    } else {
                        class90.field1892[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class90.field1892[var2] = false;
                }
                class106.field2216 = class82.field1758;
            }
            class57.field1127 = class61.field1269;
        }
        if (arg0 <= 22) {
            method800(-120);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lhd;II)V")
    private final void method804(class68 arg0, int arg1, int arg2) {
        field2100++;
        if (arg1 == arg2) {
            this.field2094 = arg0.method569(arg1 + 26491);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lgd;)V")
    public static final void method805(class60 arg0) {
        for (int var1 = arg0.field1172; var1 <= arg0.field1153; var1++) {
            for (int var2 = arg0.field1170; var2 <= arg0.field1168; var2++) {
                class152 var3 = class173.field3351[arg0.field1155][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field2975; var4++) {
                        if (var3.field2979[var4] == arg0) {
                            var3.field2975--;
                            for (int var5 = var4; var5 < var3.field2975; var5++) {
                                var3.field2979[var5] = var3.field2979[var5 + 1];
                                var3.field2986[var5] = var3.field2986[var5 + 1];
                            }
                            var3.field2979[var3.field2975] = null;
                            break;
                        }
                    }
                    var3.field2993 = 0;
                    for (int var6 = 0; var6 < var3.field2975; var6++) {
                        var3.field2993 |= var3.field2986[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(II)Lwd;")
    public static final class202 method806(int arg0, int arg1) {
        field2098++;
        class202 var2 = (class202) class81.field1752.method986((byte) 50, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class167.field3249.method67(6, -1, arg1);
        class202 var4 = new class202();
        var4.field3972 = arg1;
        if (arg0 != 0) {
            return null;
        }
        if (var3 != null) {
            var4.method1328(-21077, new class68(var3));
        }
        var4.method1319(-1);
        if (var4.field3971) {
            var4.field3962 = false;
            var4.field3969 = 0;
        }
        class81.field1752.method987((long) arg1, var4, 28842);
        return var4;
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "(I)V")
    public static final void method807(int arg0) {
        if (arg0 != -23927) {
            field2096 = true;
        }
        while (class22.field418.method654(class14.field304, arg0 + 23935) >= 11) {
            int var1 = class22.field418.method655(11, 720);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class40.field795[var1] == null) {
                var2 = true;
                class40.field795[var1] = new class32();
                if (class158.field3070[var1] != null) {
                    class40.field795[var1].method282(class158.field3070[var1], -8);
                }
            }
            class146.field2853[class130.field2575++] = var1;
            class32 var3 = class40.field795[var1];
            var3.field3326 = class18.field362;
            int var4 = class22.field418.method655(5, arg0 ^ 0xFFFFA059);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class22.field418.method655(1, 720);
            int var6 = class59.field1135[class22.field418.method655(3, 720)];
            if (var2) {
                var3.field3282 = var3.field3286 = var6;
            }
            int var7 = class22.field418.method655(1, arg0 ^ 0xFFFFA059);
            if (var7 == 1) {
                class196.field3810[class94.field1942++] = var1;
            }
            int var8 = class22.field418.method655(5, arg0 ^ 0xFFFFA059);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method1156(true, class123.field2489.field3317[0] + var4, var5 == 1, class123.field2489.field3310[0] + var8);
        }
        class22.field418.method661(false);
        field2095++;
    }
}
