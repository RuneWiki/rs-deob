import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class257 extends class72 {

    @OriginalMember(owner = "client!qc", name = "S", descriptor = "Z")
    public boolean field3482 = false;

    @OriginalMember(owner = "client!qc", name = "R", descriptor = "Z")
    public boolean field3481 = false;

    @OriginalMember(owner = "client!qc", name = "bb", descriptor = "Lfr;")
    public static class497 field3491 = new class497();

    @OriginalMember(owner = "client!qc", name = "db", descriptor = "Lfp;")
    public static class437 field3493 = new class437(13, 0, 1, 0);

    @OriginalMember(owner = "client!qc", name = "eb", descriptor = "Lfp;")
    public static class437 field3494 = new class437(1, 2, 2, 0);

    @OriginalMember(owner = "client!qc", name = "fb", descriptor = "[I")
    public static int[] field3495 = new int[13];

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!qc", name = "T", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!qc", name = "U", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!qc", name = "V", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!qc", name = "W", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!qc", name = "X", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!qc", name = "Y", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!qc", name = "Z", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!qc", name = "ab", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!qc", name = "cb", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V")
    public static void method1525(byte arg0) {
        field3491 = null;
        field3495 = null;
        field3494 = null;
        field3493 = null;
        int var1 = 85 % ((17 - arg0) / 37);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lgk;B)V")
    public static final void method1526(class468 arg0, byte arg1) {
        if (arg1 == -84) {
            ++field3480;
            if (~(arg0.field6868.length + -arg0.field6830) <= -2) {
                int var2 = arg0.method2765(58);
                if (var2 >= 0 && ~var2 >= -2) {
                    if (~(arg0.field6868.length + -arg0.field6830) <= -3) {
                        int var3 = arg0.method2727((byte) 43);
                        if (arg0.field6868.length + -arg0.field6830 >= var3 * 6) {
                            for (int var4 = 0; var3 > var4; ++var4) {
                                int var5 = arg0.method2727((byte) 43);
                                int var6 = arg0.method2722(false);
                                if (class466.field6795.length > var5 && class409.field6170[var5] && (class27.field392.method1838((byte) 24, var5).field6404 != '1' || var6 >= -1 && var6 <= 1)) {
                                    class466.field6795[var5] = var6;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILgk;)V")
    private final void method1527(int arg0, class468 arg1) {
        ++field3484;
        if (~(arg1.field6868.length + -arg1.field6830) <= -2) {
            int var3 = arg1.method2765(88);
            if (var3 >= 0 && var3 <= 17) {
                byte var4;
                if (~var3 == -18) {
                    var4 = 40;
                } else if (~var3 != -17) {
                    if (var3 != 15) {
                        if (var3 == 14) {
                            var4 = 36;
                        } else if (~var3 == -14) {
                            var4 = 35;
                        } else if (var3 == 12) {
                            var4 = 34;
                        } else if (~var3 == -12) {
                            var4 = 33;
                        } else if (var3 == 10) {
                            var4 = 32;
                        } else if (var3 == 9) {
                            var4 = 31;
                        } else if (var3 != 8) {
                            if (var3 != 7) {
                                if (~var3 == -7) {
                                    var4 = 28;
                                } else if (~var3 != -6) {
                                    if (~var3 == -5) {
                                        var4 = 24;
                                    } else if (var3 == 3) {
                                        var4 = 23;
                                    } else if (var3 != 2) {
                                        if (~var3 == -2) {
                                            var4 = 23;
                                        } else {
                                            var4 = 19;
                                        }
                                    } else {
                                        var4 = 22;
                                    }
                                } else {
                                    var4 = 28;
                                }
                            } else {
                                var4 = 29;
                            }
                        } else {
                            var4 = 30;
                        }
                    } else {
                        var4 = 37;
                    }
                } else {
                    var4 = 38;
                }
                if (var4 <= arg1.field6868.length + -arg1.field6830) {
                    super.field1006 = arg1.method2765(60);
                    if (super.field1006 < 1) {
                        super.field1006 = 1;
                    } else if (~super.field1006 < -5) {
                        super.field1006 = 4;
                    }
                    this.method1535(~arg1.method2765(106) == -2, -5);
                    super.field994 = arg1.method2765(60) == 1;
                    super.field991 = ~arg1.method2765(66) == -2;
                    super.field981 = arg1.method2765(76) == 1;
                    super.field978 = ~arg1.method2765(108) == -2 ? 1 : 0;
                    super.field1005 = arg1.method2765(104) == 1;
                    super.field995 = ~arg1.method2765(102) == -2;
                    super.field996 = arg1.method2765(49) == 1;
                    super.field1001 = arg1.method2765(86);
                    if (super.field1001 > 2) {
                        super.field1001 = 2;
                    }
                    if (~var3 <= -18) {
                        super.field972 = arg1.method2765(56);
                    }
                    if (var3 >= 2) {
                        super.field987 = ~arg1.method2765(106) == -2;
                        if (~var3 <= -18) {
                            super.field984 = arg1.method2765(115) == 1;
                        }
                    } else {
                        super.field987 = arg1.method2765(98) == 1;
                        arg1.method2765(68);
                    }
                    super.field983 = arg1.method2765(106) == 1;
                    super.field985 = arg1.method2765(99) == 1;
                    super.field989 = arg1.method2765(105);
                    if (super.field989 > 2) {
                        super.field989 = 2;
                    }
                    super.field993 = super.field989;
                    super.field986 = arg1.method2765(91) == 1;
                    super.field976 = arg1.method2765(84);
                    if (super.field976 > 127) {
                        super.field976 = 127;
                    }
                    super.field980 = arg1.method2765(107);
                    super.field1000 = arg1.method2765(92);
                    if (super.field1000 > 127) {
                        super.field1000 = 127;
                    }
                    if (var3 >= 1) {
                        super.field982 = arg1.method2727((byte) 43);
                        super.field979 = arg1.method2727((byte) 43);
                    }
                    if (~var3 <= -4 && ~var3 > -7) {
                        arg1.method2765(109);
                    }
                    if (~var3 <= -5) {
                        int var5 = arg1.method2765(74);
                        if (~var5 > -1 || ~var5 < -3) {
                            var5 = 0;
                        }
                        if (~class521.field7648 > -97) {
                            var5 = 0;
                        }
                        class146.method1059(var5, (byte) -123);
                    }
                    int var6 = 10 / ((arg0 - 16) / 54);
                    if (var3 >= 5) {
                        super.field967 = arg1.method2722(false);
                    }
                    int var7 = 0;
                    if (var3 >= 6) {
                        super.field970 = var7 = arg1.method2765(55);
                    }
                    if (~super.field970 != -2 && super.field970 != 2) {
                        super.field970 = 2;
                    }
                    if (~var3 <= -8) {
                        super.field977 = arg1.method2765(107) == 1;
                    }
                    if (var3 >= 8) {
                        super.field969 = ~arg1.method2765(79) == -2;
                    }
                    if (~var3 <= -10) {
                        super.field971 = arg1.method2765(113);
                    }
                    if (super.field971 < 0 || super.field971 > class188.method1262(29293, class521.field7648)) {
                        super.field971 = 0;
                    }
                    if (var3 >= 10) {
                        super.field997 = arg1.method2765(57) != 0;
                    }
                    if (var3 >= 11) {
                        super.field1004 = arg1.method2765(85) != 0;
                    }
                    if (~var3 <= -13) {
                        super.field978 = arg1.method2765(54);
                    }
                    if (~super.field978 > -1 || ~super.field978 < -3) {
                        super.field978 = 1;
                    }
                    if (var3 >= 13) {
                        super.field992 = arg1.method2765(80) == 1;
                    }
                    if (var3 >= 14) {
                        super.field999 = arg1.method2765(59);
                    } else if (~var7 != -1) {
                        super.field999 = 1;
                    } else {
                        super.field999 = 2;
                    }
                    if (~super.field999 > -1 || ~super.field999 < -4) {
                        super.field999 = 2;
                    }
                    if (var3 >= 15) {
                        super.field966 = arg1.method2765(106);
                        if (~super.field966 > -1 || super.field966 > 4) {
                            super.field966 = class117.field1763 == 1 ? 2 : 4;
                        }
                    }
                    if (var3 >= 16) {
                        super.field975 = arg1.method2765(90) == 1;
                        try {
                            if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
                                super.field975 = false;
                            }
                        } catch (Throwable var8) {
                        }
                    }
                    if (var3 < 17 && super.field999 == 0) {
                        super.field999 = 2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLok;)V")
    public static final void method1528(byte arg0, class74 arg1) {
        ++field3492;
        class172.field2523 = arg1.method539((byte) 27, "p11_full");
        if (arg0 == -70) {
            class89.field1391 = arg1.method539((byte) 27, "p12_full");
            class261.field3902 = arg1.method539((byte) 27, "b12_full");
            class31.field439 = arg1.method539((byte) 27, "hitmarks");
            class103.field1554 = arg1.method539((byte) 27, "hitbar_default");
            class141.field2131 = arg1.method539((byte) 27, "timerbar_default");
            class351.field5404 = arg1.method539((byte) 27, "headicons_pk");
            class356.field5463 = arg1.method539((byte) 27, "headicons_prayer");
            class187.field2747 = arg1.method539((byte) 27, "hint_headicons");
            class123.field1865 = arg1.method539((byte) 27, "hint_mapmarkers");
            class126.field1898 = arg1.method539((byte) 27, "mapflag");
            class238.field3332 = arg1.method539((byte) 27, "cross");
            class180.field2669 = arg1.method539((byte) 27, "mapdots");
            class280.field4225 = arg1.method539((byte) 27, "scrollbar");
            class44.field576 = arg1.method539((byte) 27, "name_icons");
            class289.field4339 = arg1.method539((byte) 27, "floorshadows");
            class293.field4383 = arg1.method539((byte) 27, "compass");
            class121.field1841 = arg1.method539((byte) 27, "otherlevel");
            class24.field358 = arg1.method539((byte) 27, "hint_mapedge");
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)Lgk;")
    public final class468 method1529(int arg0) {
        ++field3489;
        class468 var2 = new class468(41);
        var2.method2754(17, 5574);
        var2.method2754(super.field1006, 5574);
        var2.method2754(super.field988 ? 1 : 0, 5574);
        var2.method2754(super.field994 ? 1 : 0, arg0 + 5574);
        var2.method2754(super.field991 ? 1 : 0, 5574);
        var2.method2754(!super.field981 ? 0 : 1, 5574);
        var2.method2754(arg0, 5574);
        var2.method2754(!super.field1005 ? 0 : 1, 5574);
        var2.method2754(super.field995 ? 1 : 0, 5574);
        var2.method2754(super.field996 ? 1 : 0, arg0 + 5574);
        var2.method2754(super.field1001, 5574);
        var2.method2754(super.field972, arg0 + 5574);
        var2.method2754(!super.field987 ? 0 : 1, 5574);
        var2.method2754(!super.field984 ? 0 : 1, arg0 + 5574);
        var2.method2754(!super.field983 ? 0 : 1, arg0 ^ 5574);
        var2.method2754(super.field985 ? 1 : 0, arg0 + 5574);
        var2.method2754(super.field989, 5574);
        var2.method2754(!super.field986 ? 0 : 1, 5574);
        var2.method2754(super.field976, 5574);
        var2.method2754(super.field980, 5574);
        var2.method2754(super.field1000, 5574);
        var2.method2777((byte) 74, super.field982);
        var2.method2777((byte) 74, super.field979);
        var2.method2754(class342.method2085(arg0 ^ -128), arg0 ^ 5574);
        var2.method2717(super.field967, arg0 + 496598568);
        var2.method2754(super.field970, 5574);
        var2.method2754(!super.field977 ? 0 : 1, 5574);
        var2.method2754(super.field969 ? 1 : 0, arg0 ^ 5574);
        var2.method2754(super.field971, 5574);
        var2.method2754(!super.field997 ? 0 : 1, 5574);
        var2.method2754(super.field1004 ? 1 : 0, 5574);
        var2.method2754(super.field978, 5574);
        var2.method2754(super.field992 ? 1 : 0, 5574);
        var2.method2754(super.field999, 5574);
        var2.method2754(super.field966, arg0 + 5574);
        var2.method2754(super.field975 ? 1 : 0, 5574);
        return var2;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1530(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field3486;
        if (class113.field1723 != arg0) {
            class317.field4892 = class113.field1723;
            class264.method1650(0, -87);
        } else {
            class151.method1090(false, (byte) 61);
        }
        class486.field7237 = arg2;
        class53.field704 = arg4;
        class46.field597 = arg3;
        class137.method1010(arg1);
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(II)Z")
    public final boolean method1531(int arg0, int arg1) {
        ++field3490;
        if (arg0 > -57) {
            this.method1527(-57, (class468) null);
        }
        return ~arg1 == -1 ? super.field988 : true;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lec;I)V")
    public final void method1532(class109 arg0, int arg1) {
        ++field3487;
        class415 var3 = null;
        try {
            class533 var4 = arg0.method825(0, "", true);
            while (var4.field7848 == 0) {
                class389.method2332(75, 1L);
            }
            if (~var4.field7848 == -2) {
                var3 = (class415) var4.field7849;
                class468 var5 = this.method1529(arg1 ^ 2);
                var3.method2489(0, 0, var5.field6830, var5.field6868);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method2485(122);
            }
            if (arg1 != 2) {
                field3493 = null;
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(II)Z")
    public final boolean method1533(int arg0, int arg1) {
        ++field3485;
        return ~arg1 == arg0 && !this.field3481 ? super.field988 : true;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)I")
    public final int method1534(int arg0, byte arg1) {
        ++field3488;
        if (arg1 < 80) {
            field3493 = null;
        }
        if (this.field3482) {
            return 0;
        } else if (!this.method1533(-1, arg0)) {
            return 1;
        } else {
            return !super.field994 ? 1 : 2;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZI)V")
    public final void method1535(boolean arg0, int arg1) {
        super.field988 = arg0;
        ++field3483;
        if (arg1 != -5) {
            this.field3482 = true;
        }
        if (class119.field1824 != null) {
            class119.field1824.method250(-1151, !this.method1533(-1, class113.field1723));
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lec;)V")
    public class257(class109 arg0) {
        super.field1006 = 3;
        this.method1535(true, -5);
        super.field996 = true;
        super.field995 = true;
        super.field976 = 127;
        super.field982 = 0;
        super.field985 = true;
        super.field972 = 0;
        super.field978 = 1;
        super.field1005 = true;
        super.field993 = 0;
        super.field981 = true;
        super.field980 = 255;
        super.field991 = true;
        super.field984 = false;
        super.field986 = true;
        super.field987 = true;
        super.field983 = true;
        super.field1000 = 127;
        super.field994 = true;
        super.field989 = 0;
        super.field1001 = 2;
        super.field979 = 0;
        if (~class521.field7648 > -97) {
            class146.method1059(0, (byte) -123);
        } else {
            class146.method1059(2, (byte) -123);
        }
        super.field969 = false;
        super.field999 = 2;
        super.field970 = 2;
        super.field971 = 0;
        super.field977 = false;
        super.field1004 = true;
        super.field992 = true;
        super.field967 = 0;
        super.field966 = class117.field1763 == 1 ? 2 : 4;
        super.field997 = false;
        class415 var2 = null;
        try {
            class533 var3 = arg0.method825(0, "", true);
            while (var3.field7848 == 0) {
                class389.method2332(94, 1L);
            }
            if (~var3.field7848 == -2) {
                var2 = (class415) var3.field7849;
                byte[] var4 = new byte[(int) var2.method2484(107)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method2488(var5, var4, 0, var4.length - var5);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                this.method1527(72, new class468(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2485(94);
            }
        } catch (Exception var7) {
        }
    }
}
