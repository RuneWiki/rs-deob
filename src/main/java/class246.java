import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class246 extends class192 {

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "Lwc;")
    public class162 field4274;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
    public static volatile int field4267 = 0;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "Loh;")
    private static class258 field4268 = class153.method1046("<col=ff3000>", 118);

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "[Loh;")
    public static class258[] field4273 = new class258[100];

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "I")
    public static int field4275 = -2;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "[Lvi;")
    public static class129[] field4269;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V", line = 5)
    public static void method1681(int arg0) {
        field4273 = null;
        field4269 = null;
        field4268 = null;
        if (arg0 != 6) {
            method1683(-35, 90, -45);
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)I", line = 22)
    public static final int method1682(int arg0, int arg1) {
        if (arg0 != -119354228) {
            method1682(-90, -34);
        }
        field4276++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)Loh;", line = 45)
    public static final class258 method1683(int arg0, int arg1, int arg2) {
        field4272++;
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return class253.field4360;
        } else if (var3 < -6) {
            return field4268;
        } else if (var3 < -3) {
            return class11.field136;
        } else if (var3 < 0) {
            return class159.field2714;
        } else if (var3 > 9) {
            return class249.field4301;
        } else if (var3 > 6) {
            return class228.field3925;
        } else if (var3 > 3) {
            return class60.field1004;
        } else if (var3 <= 0) {
            int var4 = -48 / ((41 - arg2) / 60);
            return class98.field1748;
        } else {
            return class94.field1655;
        }
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(B)V", line = 85)
    public static final void method1684(byte arg0) {
        field4270++;
        if (class31.method229((byte) 0) != 2) {
            return;
        }
        int var1 = class61.field1035 % 104;
        byte var2 = (byte) (class61.field1035 - 4 & 0xFF);
        if (arg0 != 107) {
            method1681(-33);
        }
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class8.field101[var3][var1][var4] = var2;
            }
        }
        if (class272.field4704 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class70.field1224[var5] = -1000000;
            class227.field3904[var5] = 1000000;
            class16.field210[var5] = 0;
            class176.field3162[var5] = 1000000;
            class188.field3338[var5] = 0;
        }
        if (class109.field1926 != 1) {
            int var16 = class228.method1525(true, class272.field4704, class61.field1086, class285.field4906);
            if ((var16 - class245.field4258) < 800 && (class94.field1653[class272.field4704][class285.field4906 >> 7][class61.field1086 >> 7] & 0x4) != 0) {
                class117.method870(class178.field3180, -1, 1, false, class285.field4906 >> 7, class61.field1086 >> 7);
            }
            return;
        }
        if ((class94.field1653[class272.field4704][class152.field2606.field912 >> 7][class152.field2606.field934 >> 7] & 0x4) != 0) {
            class117.method870(class178.field3180, -1, 0, false, class152.field2606.field912 >> 7, class152.field2606.field934 >> 7);
        }
        if (class106.field1894 >= 310) {
            return;
        }
        int var6 = class152.field2606.field934 >> 7;
        int var7 = class285.field4906 >> 7;
        int var8 = class61.field1086 >> 7;
        int var9 = class152.field2606.field912 >> 7;
        int var10;
        if (var9 > var7) {
            var10 = var9 - var7;
        } else {
            var10 = var7 - var9;
        }
        int var11;
        if (var6 > var8) {
            var11 = var6 - var8;
        } else {
            var11 = var8 - var6;
        }
        if (var11 >= var10) {
            int var14 = var10 * 65536 / var11;
            int var15 = 32768;
            while (var6 != var8) {
                if (var8 < var6) {
                    var8++;
                } else if (var6 < var8) {
                    var8--;
                }
                if ((class94.field1653[class272.field4704][var7][var8] & 0x4) != 0) {
                    class117.method870(class178.field3180, -1, 1, false, var7, var8);
                    break;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var7 < var9) {
                        var7++;
                    } else if (var9 < var7) {
                        var7--;
                    }
                    if ((class94.field1653[class272.field4704][var7][var8] & 0x4) != 0) {
                        class117.method870(class178.field3180, arg0 ^ 0xFFFFFF94, 1, false, var7, var8);
                        break;
                    }
                }
            }
            return;
        }
        int var12 = var11 * 65536 / var10;
        int var13 = 32768;
        while (var7 != var9) {
            if (var9 > var7) {
                var7++;
            } else if (var7 > var9) {
                var7--;
            }
            if ((class94.field1653[class272.field4704][var7][var8] & 0x4) != 0) {
                class117.method870(class178.field3180, arg0 - 108, 1, false, var7, var8);
                break;
            }
            var13 += var12;
            if (var13 >= 65536) {
                if (var6 > var8) {
                    var8++;
                } else if (var6 < var8) {
                    var8--;
                }
                var13 -= 65536;
                if ((class94.field1653[class272.field4704][var7][var8] & 0x4) != 0) {
                    class117.method870(class178.field3180, -1, 1, false, var7, var8);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lwc;)V", line = 270)
    public class246(class162 arg0) {
        this.field4274 = arg0;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBI)V", line = 288)
    public static final void method1685(int arg0, byte arg1, int arg2) {
        field4271++;
        class286 var3 = class48.method389(arg0, 12, 10738);
        if (arg1 != -128) {
            field4269 = (class129[]) null;
        }
        var3.method2017(-72);
        var3.field4932 = arg2;
    }
}
