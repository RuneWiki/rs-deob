import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class44 {

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "Lub;")
    private static class227 field730 = class257.method1749("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", 17263);

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "Lub;")
    private static class227 field728 = class257.method1749("Loaded update list", 17263);

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "Lub;")
    public static class227 field726 = field730;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "Lub;")
    public static class227 field725 = class257.method1749("(U(Y", 17263);

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "Lub;")
    public static class227 field732 = class257.method1749("hint_mapmarkers", 17263);

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "Lub;")
    public static class227 field735 = class257.method1749("<img=1>", 17263);

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "Lub;")
    public static class227 field738 = field728;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
    public static void method234(byte arg0) {
        field730 = null;
        field726 = null;
        field738 = null;
        field725 = null;
        int var1 = 120 % ((19 - arg0) / 55);
        field735 = null;
        field732 = null;
        field728 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ln;I)V")
    public static final void method235(class138 arg0, int arg1) {
        field727++;
        class201.field3453 = arg0;
        if (arg1 < 78) {
            method238(126, (byte) 34);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)Z")
    public static final boolean method236(int arg0) {
        field736++;
        long var1 = class12.method57(arg0 - 100);
        int var3 = (int) (var1 - class166.field2783);
        if (var3 > 200) {
            var3 = 200;
        }
        class166.field2783 = var1;
        class216.field3638 += var3;
        if (class63.field1159 == arg0 && class56.field1013 == 0 && class254.field4471 == 0 && class56.field1014 == 0) {
            return true;
        } else if (class149.field2596 == null) {
            return false;
        } else {
            try {
                if (class216.field3638 > 30000) {
                    throw new IOException();
                }
                while (class56.field1013 < 20 && class56.field1014 > 0) {
                    class214 var4 = (class214) class176.field2930.method1299((byte) 106);
                    class226 var5 = new class226(4);
                    var5.method1443(1, 0);
                    var5.method1429(116, (int) var4.field1113);
                    class149.field2596.method94(4, (byte) -24, var5.field3901, 0);
                    class236.field4093.method1300(var4, var4.field1113, arg0 - 2875);
                    class56.field1014--;
                    class56.field1013++;
                }
                while (class63.field1159 < 20 && class254.field4471 > 0) {
                    class214 var6 = (class214) class100.field1750.method209(16711680);
                    class226 var7 = new class226(4);
                    var7.method1443(0, 0);
                    var7.method1429(114, (int) var6.field1113);
                    class149.field2596.method94(4, (byte) -24, var7.field3901, 0);
                    var6.method727((byte) 2);
                    class99.field1728.method1300(var6, var6.field1113, -2875);
                    class63.field1159++;
                    class254.field4471--;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class149.field2596.method93(arg0);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class216.field3638 = 0;
                    byte var10 = 0;
                    if (class153.field2664 == null) {
                        var10 = 8;
                    } else if (class47.field844 == 0) {
                        var10 = 1;
                    }
                    if (var10 <= 0) {
                        int var11 = class193.field3291.field3901.length - class153.field2664.field3617;
                        int var12 = 512 - class47.field844;
                        if (var11 - class193.field3291.field3879 < var12) {
                            var12 = var11 - class193.field3291.field3879;
                        }
                        if (var12 > var9) {
                            var12 = var9;
                        }
                        class149.field2596.method99(var12, class193.field3291.field3879, class193.field3291.field3901, 116);
                        if (class238.field4137 != 0) {
                            for (int var13 = 0; var13 < var12; var13++) {
                                class193.field3291.field3901[class193.field3291.field3879 + var13] = (byte) class249.method1666(class193.field3291.field3901[class193.field3291.field3879 + var13], class238.field4137);
                            }
                        }
                        class47.field844 += var12;
                        class193.field3291.field3879 += var12;
                        if (class193.field3291.field3879 == var11) {
                            if (class153.field2664.field1113 == 16711935L) {
                                class214.field3619 = class193.field3291;
                                for (int var14 = 0; var14 < 256; var14++) {
                                    class57 var15 = class182.field3117[var14];
                                    if (var15 != null) {
                                        class214.field3619.field3879 = var14 * 8 + 5;
                                        int var16 = class214.field3619.method1478(arg0 ^ 0xFFFF82CB);
                                        int var17 = class214.field3619.method1478(-32053);
                                        var15.method346((byte) 0, var17, var16);
                                    }
                                }
                            } else {
                                class238.field4122.reset();
                                class238.field4122.update(class193.field3291.field3901, 0, var11);
                                int var18 = (int) class238.field4122.getValue();
                                if (class153.field2664.field3618 != var18) {
                                    try {
                                        class149.field2596.method97(0);
                                    } catch (Exception var30) {
                                    }
                                    class149.field2596 = null;
                                    class238.field4137 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    class57.field1044++;
                                    return false;
                                }
                                class29.field469 = 0;
                                class57.field1044 = 0;
                                class153.field2664.field3609.method349(class193.field3291.field3901, (byte) 2, (class153.field2664.field1113 & 0xFF0000L) == 16711680L, (int) (class153.field2664.field1113 & 0xFFFFL), class227.field3960);
                            }
                            class153.field2664.method369(-73);
                            if (class227.field3960) {
                                class56.field1013--;
                            } else {
                                class63.field1159--;
                            }
                            class153.field2664 = null;
                            class193.field3291 = null;
                            class47.field844 = 0;
                        } else {
                            if (class47.field844 != 512) {
                                break;
                            }
                            class47.field844 = 0;
                        }
                    } else {
                        int var19 = var10 - class253.field4438.field3879;
                        if (var19 > var9) {
                            var19 = var9;
                        }
                        class149.field2596.method99(var19, class253.field4438.field3879, class253.field4438.field3901, -27);
                        if (class238.field4137 != 0) {
                            for (int var20 = 0; var20 < var19; var20++) {
                                class253.field4438.field3901[class253.field4438.field3879 + var20] = (byte) class249.method1666(class253.field4438.field3901[class253.field4438.field3879 + var20], class238.field4137);
                            }
                        }
                        class253.field4438.field3879 += var19;
                        if (var10 > class253.field4438.field3879) {
                            break;
                        }
                        if (class153.field2664 == null) {
                            class253.field4438.field3879 = 0;
                            int var21 = class253.field4438.method1471(255);
                            int var22 = class253.field4438.method1447(0);
                            int var23 = class253.field4438.method1471(255);
                            long var24 = (long) ((var21 << 16) + var22);
                            int var26 = class253.field4438.method1478(-32053);
                            class214 var27 = (class214) class236.field4093.method1298(-110, var24);
                            class227.field3960 = true;
                            if (var27 == null) {
                                var27 = (class214) class99.field1728.method1298(arg0 ^ 0xFFFFFF8A, var24);
                                class227.field3960 = false;
                            }
                            if (var27 == null) {
                                throw new IOException();
                            }
                            class153.field2664 = var27;
                            int var28 = var23 == 0 ? 5 : 9;
                            class193.field3291 = new class226(var26 + var28 + class153.field2664.field3617);
                            class193.field3291.method1443(var23, 0);
                            class193.field3291.method1427(var26, (byte) -118);
                            class253.field4438.field3879 = 0;
                            class47.field844 = 8;
                        } else if (class47.field844 == 0) {
                            if (class253.field4438.field3901[0] == -1) {
                                class253.field4438.field3879 = 0;
                                class47.field844 = 1;
                            } else {
                                class153.field2664 = null;
                            }
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class149.field2596.method97(0);
                } catch (Exception var29) {
                }
                class149.field2596 = null;
                class29.field469++;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)V")
    public static final void method237(int arg0, int arg1, int arg2) {
        if (arg2 != -31668) {
            return;
        }
        if (class179.field3072 != 0 && arg0 != -1) {
            class205.method1312(arg0, class149.field2602, (byte) 42, 0, class179.field3072, false);
            class171.field2869 = true;
        }
        field733++;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)I")
    public static final int method238(int arg0, byte arg1) {
        if (arg0 <= 19) {
            return 20;
        }
        field731++;
        if (arg1 >= 65 && arg1 <= 90) {
            return arg1 - 65;
        } else if (arg1 >= 97 && arg1 <= 122) {
            return arg1 + 26 - 97;
        } else if (arg1 >= 48 && arg1 <= 57) {
            return arg1 + 52 - 48;
        } else if (arg1 == 43) {
            return 62;
        } else if (arg1 == 42) {
            return 62;
        } else if (arg1 == 47) {
            return 63;
        } else if (arg1 == 45) {
            return 63;
        } else {
            return -1;
        }
    }
}
