import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class49 extends class55 {

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "Z")
    public boolean field1013 = false;

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "Lo;")
    public class84 field1019 = class67.field1463;

    @OriginalMember(owner = "client!ia", name = "gb", descriptor = "Z")
    private boolean field1031 = false;

    @OriginalMember(owner = "client!ia", name = "fb", descriptor = "Z")
    public boolean field1030 = true;

    @OriginalMember(owner = "client!ia", name = "W", descriptor = "Z")
    public boolean field1021 = true;

    @OriginalMember(owner = "client!ia", name = "nb", descriptor = "I")
    private int field1038 = 128;

    @OriginalMember(owner = "client!ia", name = "xb", descriptor = "I")
    public int field1048 = -1;

    @OriginalMember(owner = "client!ia", name = "db", descriptor = "I")
    public int field1028 = 1;

    @OriginalMember(owner = "client!ia", name = "Fb", descriptor = "I")
    private int field1056 = 0;

    @OriginalMember(owner = "client!ia", name = "eb", descriptor = "Z")
    private boolean field1029 = false;

    @OriginalMember(owner = "client!ia", name = "Y", descriptor = "I")
    private int field1023 = -1;

    @OriginalMember(owner = "client!ia", name = "Bb", descriptor = "Z")
    public boolean field1052 = true;

    @OriginalMember(owner = "client!ia", name = "tb", descriptor = "I")
    private int field1044 = -1;

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "I")
    public int field1016 = -1;

    @OriginalMember(owner = "client!ia", name = "jb", descriptor = "I")
    public int field1034 = -1;

    @OriginalMember(owner = "client!ia", name = "rb", descriptor = "I")
    private int field1042 = 0;

    @OriginalMember(owner = "client!ia", name = "Ib", descriptor = "I")
    public int field1059 = -1;

    @OriginalMember(owner = "client!ia", name = "kb", descriptor = "I")
    public int field1035 = 1;

    @OriginalMember(owner = "client!ia", name = "Eb", descriptor = "I")
    private int field1055 = 128;

    @OriginalMember(owner = "client!ia", name = "bb", descriptor = "I")
    public int field1026 = -1;

    @OriginalMember(owner = "client!ia", name = "Lb", descriptor = "I")
    private int field1062 = 0;

    @OriginalMember(owner = "client!ia", name = "Db", descriptor = "I")
    public int field1054 = 16;

    @OriginalMember(owner = "client!ia", name = "Kb", descriptor = "I")
    private int field1061 = 0;

    @OriginalMember(owner = "client!ia", name = "ob", descriptor = "Z")
    public boolean field1039 = false;

    @OriginalMember(owner = "client!ia", name = "Nb", descriptor = "I")
    private int field1064 = 128;

    @OriginalMember(owner = "client!ia", name = "Sb", descriptor = "[Lo;")
    public class84[] field1069 = new class84[5];

    @OriginalMember(owner = "client!ia", name = "Ub", descriptor = "I")
    private int field1071 = 0;

    @OriginalMember(owner = "client!ia", name = "Tb", descriptor = "Z")
    public boolean field1070 = false;

    @OriginalMember(owner = "client!ia", name = "Vb", descriptor = "Z")
    public boolean field1072 = false;

    @OriginalMember(owner = "client!ia", name = "Wb", descriptor = "I")
    private int field1073 = 0;

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "Lo;")
    public static class84 field1018 = class15.method124("You have only just left another world", 255);

    @OriginalMember(owner = "client!ia", name = "ib", descriptor = "I")
    public static int field1033 = 0;

    @OriginalMember(owner = "client!ia", name = "mb", descriptor = "Lo;")
    public static class84 field1037 = class15.method124(" unread messages", 255);

    @OriginalMember(owner = "client!ia", name = "sb", descriptor = "Lo;")
    public static class84 field1043 = class15.method124("backtop1", 255);

    @OriginalMember(owner = "client!ia", name = "yb", descriptor = "Lo;")
    public static class84 field1049 = class15.method124("Nov", 255);

    @OriginalMember(owner = "client!ia", name = "pb", descriptor = "Lo;")
    public static class84 field1040 = class15.method124("It(Ws a ", 255);

    @OriginalMember(owner = "client!ia", name = "Ab", descriptor = "Lo;")
    public static class84 field1051 = class15.method124("Examine @yel@", 255);

    @OriginalMember(owner = "client!ia", name = "Qb", descriptor = "Lo;")
    public static class84 field1067 = class15.method124("@cr1@", 255);

    @OriginalMember(owner = "client!ia", name = "zb", descriptor = "Lo;")
    public static class84 field1050 = class15.method124("yesterday", 255);

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!ia", name = "Z", descriptor = "I")
    public int field1024;

    @OriginalMember(owner = "client!ia", name = "cb", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!ia", name = "hb", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!ia", name = "lb", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!ia", name = "ub", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!ia", name = "vb", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!ia", name = "wb", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!ia", name = "Cb", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!ia", name = "Hb", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!ia", name = "Jb", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!ia", name = "Rb", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!ia", name = "Pb", descriptor = "Leb;")
    public static class27 field1066;

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "Lfc;")
    public static class34 field1020;

    @OriginalMember(owner = "client!ia", name = "ab", descriptor = "Lo;")
    public class84 field1025;

    @OriginalMember(owner = "client!ia", name = "S", descriptor = "[I")
    private int[] field1017;

    @OriginalMember(owner = "client!ia", name = "qb", descriptor = "[I")
    public int[] field1041;

    @OriginalMember(owner = "client!ia", name = "Gb", descriptor = "[I")
    private int[] field1057;

    @OriginalMember(owner = "client!ia", name = "Mb", descriptor = "[I")
    private int[] field1063;

    @OriginalMember(owner = "client!ia", name = "Ob", descriptor = "[I")
    private int[] field1065;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIII)Lne;", line = 15)
    public final class83 method414(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1068++;
        long var8;
        if (this.field1057 == null) {
            var8 = (this.field1024 << 10) + arg0;
        } else {
            var8 = (this.field1024 << 10) + (arg4 << 3) + arg0;
        }
        class83 var10 = (class83) class48.field998.method737(var8, (byte) -86);
        if (arg5 >= -37) {
            this.method425(41, -126, null);
        }
        if (var10 == null) {
            var10 = this.method420(-21201, !this.field1031, arg4, false, arg0);
            if (var10 == null) {
                return null;
            }
            class48.field998.method744(-126, var8, var10);
        }
        if (this.field1072 || this.field1031) {
            var10 = new class83(var10, this.field1072, this.field1031);
        }
        if (this.field1072) {
            int var11 = (arg1 + arg2 + arg3 + arg6) / 4;
            for (int var12 = 0; var12 < var10.field1821; var12++) {
                int var13 = var10.field1823[var12];
                int var14 = var10.field1800[var12];
                int var15 = arg3 + (arg1 - arg3) * (var14 + 64) / 128;
                int var16 = (arg6 - arg2) * (var14 + 64) / 128 + arg2;
                int var17 = (var16 - var15) * (var13 + 64) / 128 + var15;
                var10.field1808[var12] += var17 - var11;
            }
        }
        return var10;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(Z)Lia;", line = 72)
    public final class49 method415(boolean arg0) {
        if (arg0) {
            return null;
        }
        field1053++;
        int var2 = -1;
        if (this.field1023 != -1) {
            var2 = class128.method995(-23573, this.field1023);
        } else if (this.field1044 != -1) {
            var2 = class79.field1692[this.field1044];
        }
        return var2 < 0 || var2 >= this.field1041.length || this.field1041[var2] == -1 ? null : class110.method856((byte) -107, this.field1041[var2]);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLeb;)V", line = 110)
    public final void method416(byte arg0, class27 arg1) {
        if (arg0 != -3) {
            this.field1062 = -1;
        }
        field1046++;
        while (true) {
            int var3 = arg1.method231(arg0 ^ 0xFFFFFF02);
            if (var3 == 0) {
                return;
            }
            this.method425(arg0 ^ 0x75DB, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILjava/awt/Graphics;)V", line = 135)
    public static final void method417(int arg0, Graphics arg1) {
        field1045++;
        if (arg0 != 0) {
            method424(-55);
        }
        class48.field1007.method705(arg0, arg1, 0, 4);
        class36.field703.method705(0, arg1, 0, 357);
        class97.field2080.method705(0, arg1, 722, 4);
        class35.field691.method705(arg0, arg1, 743, 205);
        class111.field2419.method705(arg0, arg1, 0, 0);
        class25.field436.method705(0, arg1, 516, 4);
        class1.field27.method705(0, arg1, 516, 205);
        class51.field1094.method705(arg0, arg1, 496, 357);
        class24.field400.method705(arg0, arg1, 0, 338);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)Z", line = 167)
    public final boolean method418(int arg0, int arg1) {
        if (arg1 != 65535) {
            return false;
        }
        field1047++;
        if (this.field1057 != null) {
            for (int var5 = 0; var5 < this.field1057.length; var5++) {
                if (this.field1057[var5] == arg0) {
                    return class28.field564.method905(50, 0, this.field1065[var5] & 0xFFFF);
                }
            }
            return true;
        } else if (this.field1065 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var3 = true;
            for (int var4 = 0; var4 < this.field1065.length; var4++) {
                var3 &= class28.field564.method905(50, 0, this.field1065[var4] & 0xFFFF);
            }
            return var3;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII)Z", line = 220)
    public static final boolean method419(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -22936) {
            return false;
        }
        field1036++;
        int var4 = arg2 >> 14 & 0x7FFF;
        int var5 = class112.field2427.method835(class1.field11, arg3, arg1, arg2);
        if (var5 == -1) {
            return false;
        }
        int var6 = var5 >> 6 & 0x3;
        int var7 = var5 & 0x1F;
        if (var7 == 10 || var7 == 11 || var7 == 22) {
            class49 var8 = class110.method856((byte) -114, var4);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var10 = var8.field1028;
                var9 = var8.field1035;
            } else {
                var9 = var8.field1028;
                var10 = var8.field1035;
            }
            int var11 = var8.field1062;
            if (var6 != 0) {
                var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
            }
            class101.method761(arg1, (byte) -40, 0, class107.field2271.field1374[0], var9, var11, 2, true, 0, class107.field2271.field1436[0], var10, arg3);
        } else {
            class101.method761(arg1, (byte) 109, var6, class107.field2271.field1374[0], 0, 0, 2, true, var7 + 1, class107.field2271.field1436[0], 0, arg3);
        }
        class74.field1553 = class128.field2820;
        class54.field1128 = 2;
        class122.field2717 = class109.field2367;
        class120.field2674 = 0;
        return true;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZIZI)Lne;", line = 286)
    private final class83 method420(int arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        if (arg0 != -21201) {
            method423(false, 122);
        }
        class83 var6 = null;
        field1014++;
        if (this.field1057 == null) {
            if (arg2 != 10) {
                return null;
            }
            if (this.field1065 == null) {
                return null;
            }
            boolean var11 = arg4 > 3 ^ this.field1029;
            int var12 = this.field1065.length;
            for (int var13 = 0; var13 < var12; var13++) {
                int var19 = this.field1065[var13];
                if (var11) {
                    var19 += 65536;
                }
                var6 = (class83) class111.field2391.method737((long) var19, (byte) -124);
                if (var6 == null) {
                    var6 = class83.method633(class28.field564, var19 & 0xFFFF, 0);
                    if (var6 == null) {
                        return null;
                    }
                    if (var11) {
                        var6.method606();
                    }
                    class111.field2391.method744(arg0 + 21077, (long) var19, var6);
                }
                if (var12 > 1) {
                    class117.field2555[var13] = var6;
                }
            }
            if (var12 > 1) {
                var6 = new class83(class117.field2555, var12);
            }
        } else {
            int var7 = -1;
            for (int var8 = 0; var8 < this.field1057.length; var8++) {
                if (this.field1057[var8] == arg2) {
                    var7 = var8;
                    break;
                }
            }
            if (var7 == -1) {
                return null;
            }
            int var9 = this.field1065[var7];
            boolean var10 = arg4 > 3 ^ this.field1029;
            if (var10) {
                var9 += 65536;
            }
            var6 = (class83) class111.field2391.method737((long) var9, (byte) -92);
            if (var6 == null) {
                var6 = class83.method633(class28.field564, var9 & 0xFFFF, 0);
                if (var6 == null) {
                    return null;
                }
                if (var10) {
                    var6.method606();
                }
                class111.field2391.method744(arg0 + 21079, (long) var9, var6);
            }
        }
        boolean var14;
        if (this.field1038 == 128 && this.field1064 == 128 && this.field1055 == 128) {
            var14 = false;
        } else {
            var14 = true;
        }
        boolean var15;
        if (this.field1042 == 0 && this.field1061 == 0 && this.field1071 == 0) {
            var15 = false;
        } else {
            var15 = true;
        }
        class83 var16 = new class83(var6, arg4 == 0 && !var14 && !var15, this.field1063 == null, true);
        int var17 = arg4 & 0x3;
        if (var17 == 1) {
            var16.method618();
        } else if (var17 == 2) {
            var16.method619();
        } else if (var17 == 3) {
            var16.method616();
        }
        if (this.field1063 != null) {
            for (int var18 = 0; var18 < this.field1063.length; var18++) {
                var16.method610(this.field1063[var18], this.field1017[var18]);
            }
        }
        if (var14) {
            var16.method626(this.field1038, this.field1064, this.field1055);
        }
        if (var15) {
            var16.method607(this.field1042, this.field1061, this.field1071);
        }
        if (arg3) {
            var16.method630();
        }
        var16.method623(this.field1073 + 64, this.field1056 * 5 + 768, -50, -10, -50, arg1);
        return var16;
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V", line = 460)
    public final void method421(int arg0) {
        if (~this.field1059 == arg0) {
            this.field1059 = 0;
            if (this.field1065 != null && (this.field1057 == null || this.field1057[0] == 10)) {
                this.field1059 = 1;
            }
            for (int var2 = 0; var2 < 5; var2++) {
                if (this.field1069[var2] != null) {
                    this.field1059 = 1;
                }
            }
        }
        if (this.field1016 == -1) {
            this.field1016 = this.field1021 ? 1 : 0;
        }
        field1058++;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)Z", line = 494)
    public final boolean method422(byte arg0) {
        field1027++;
        if (this.field1065 == null) {
            return true;
        } else if (arg0 <= 18) {
            return false;
        } else {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field1065.length; var3++) {
                var2 &= class28.field564.method905(50, 0, this.field1065[var3] & 0xFFFF);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)V", line = 528)
    public static final void method423(boolean arg0, int arg1) {
        field1032++;
        if (arg1 == -1 || !class111.field2418[arg1]) {
            return;
        }
        class63.field1315.method908(arg1, 0);
        if (class60.field1254[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class60.field1254[arg1].length; var3++) {
            if (class60.field1254[arg1][var3] != null) {
                if (class60.field1254[arg1][var3].field1627 == 2) {
                    var2 = false;
                } else {
                    class60.field1254[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class60.field1254[arg1] = null;
        }
        class111.field2418[arg1] = arg0;
    }

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "(I)V", line = 589)
    public static void method424(int arg0) {
        field1049 = null;
        field1067 = null;
        field1037 = null;
        field1051 = null;
        field1050 = null;
        field1020 = null;
        field1040 = null;
        if (arg0 != 128) {
            method419(-37, -39, 67, -97);
        }
        field1066 = null;
        field1043 = null;
        field1018 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILeb;)V", line = 622)
    private final void method425(int arg0, int arg1, class27 arg2) {
        if (arg0 != -30170) {
            this.field1030 = false;
        }
        field1015++;
        if (arg1 == 1) {
            int var4 = arg2.method231(255);
            if (var4 > 0) {
                if (this.field1065 != null && !class44.field881) {
                    arg2.field482 += var4 * 3;
                    return;
                }
                this.field1065 = new int[var4];
                this.field1057 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1065[var5] = arg2.method227(127);
                    this.field1057[var5] = arg2.method231(255);
                }
                return;
            }
        } else if (arg1 == 2) {
            this.field1019 = arg2.method244((byte) 127);
        } else if (arg1 == 3) {
            this.field1025 = arg2.method244((byte) 127);
            return;
        } else {
            if (arg1 == 5) {
                int var6 = arg2.method231(255);
                if (var6 > 0) {
                    if (this.field1065 != null && !class44.field881) {
                        arg2.field482 += var6 * 2;
                        return;
                    }
                    this.field1065 = new int[var6];
                    this.field1057 = null;
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1065[var7] = arg2.method227(arg0 + 30297);
                    }
                    return;
                }
            } else if (arg1 == 14) {
                this.field1028 = arg2.method231(255);
            } else if (arg1 == 15) {
                this.field1035 = arg2.method231(255);
                return;
            } else if (arg1 == 17) {
                this.field1021 = false;
                return;
            } else if (arg1 == 18) {
                this.field1030 = false;
                return;
            } else if (arg1 == 19) {
                this.field1059 = arg2.method231(255);
                return;
            } else if (arg1 == 21) {
                this.field1072 = true;
                return;
            } else {
                if (arg1 == 22) {
                    this.field1031 = true;
                } else if (arg1 == 23) {
                    this.field1039 = true;
                    return;
                } else if (arg1 == 24) {
                    this.field1048 = arg2.method227(127);
                    if (this.field1048 == 65535) {
                        this.field1048 = -1;
                        return;
                    }
                } else if (arg1 == 28) {
                    this.field1054 = arg2.method231(255);
                    return;
                } else if (arg1 == 29) {
                    this.field1073 = arg2.method219(arg0 + 56839);
                    return;
                } else if (arg1 == 39) {
                    this.field1056 = arg2.method219(26669) * 5;
                    return;
                } else {
                    if (arg1 >= 30 && arg1 < 35) {
                        this.field1069[arg1 - 30] = arg2.method244((byte) 127);
                        if (this.field1069[arg1 - 30].method669(class57.field1188, true)) {
                            this.field1069[arg1 - 30] = null;
                            return;
                        }
                    } else if (arg1 == 40) {
                        int var8 = arg2.method231(arg0 ^ 0xFFFF8AD9);
                        this.field1017 = new int[var8];
                        this.field1063 = new int[var8];
                        for (int var9 = 0; var9 < var8; var9++) {
                            this.field1063[var9] = arg2.method227(class82.method595(arg0, -30119));
                            this.field1017[var9] = arg2.method227(arg0 + 30297);
                        }
                        return;
                    } else if (arg1 == 60) {
                        this.field1026 = arg2.method227(127);
                        return;
                    } else if (arg1 == 62) {
                        this.field1029 = true;
                        return;
                    } else if (arg1 == 64) {
                        this.field1052 = false;
                    } else if (arg1 == 65) {
                        this.field1038 = arg2.method227(127);
                        return;
                    } else if (arg1 == 66) {
                        this.field1064 = arg2.method227(127);
                        return;
                    } else if (arg1 == 67) {
                        this.field1055 = arg2.method227(arg0 ^ 0xFFFF8A59);
                        return;
                    } else if (arg1 == 68) {
                        this.field1034 = arg2.method227(arg0 + 30297);
                        return;
                    } else if (arg1 == 69) {
                        this.field1062 = arg2.method231(255);
                        return;
                    } else if (arg1 == 70) {
                        this.field1042 = arg2.method224((byte) -122);
                        return;
                    } else if (arg1 == 71) {
                        this.field1061 = arg2.method224((byte) -122);
                        return;
                    } else if (arg1 == 72) {
                        this.field1071 = arg2.method224((byte) -122);
                        return;
                    } else if (arg1 == 73) {
                        this.field1013 = true;
                        return;
                    } else if (arg1 == 74) {
                        this.field1070 = true;
                        return;
                    } else {
                        if (arg1 == 75) {
                            this.field1016 = arg2.method231(255);
                        } else if (arg1 == 77) {
                            this.field1023 = arg2.method227(127);
                            if (this.field1023 == 65535) {
                                this.field1023 = -1;
                            }
                            this.field1044 = arg2.method227(127);
                            if (this.field1044 == 65535) {
                                this.field1044 = -1;
                            }
                            int var10 = arg2.method231(arg0 + 30425);
                            this.field1041 = new int[var10 + 1];
                            for (int var11 = 0; var11 <= var10; var11++) {
                                this.field1041[var11] = arg2.method227(127);
                                if (this.field1041[var11] == 65535) {
                                    this.field1041[var11] = -1;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIILf;IIIIB)Lne;", line = 873)
    public final class83 method426(int arg0, int arg1, int arg2, class31 arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        field1022++;
        long var10;
        if (this.field1057 == null) {
            var10 = (this.field1024 << 10) + arg0;
        } else {
            var10 = (this.field1024 << 10) + (arg4 << 3) + arg0;
        }
        if (arg8 >= -55) {
            this.field1029 = true;
        }
        class83 var12 = (class83) class3.field43.method737(var10, (byte) -92);
        if (var12 == null) {
            var12 = this.method420(-21201, true, arg4, true, arg0);
            if (var12 == null) {
                return null;
            }
            class3.field43.method744(-122, var10, var12);
        }
        if (arg3 == null && !this.field1072) {
            return var12;
        }
        class83 var13;
        if (arg3 == null) {
            var13 = var12.method612(true);
        } else {
            var13 = arg3.method275(var12, arg5, (byte) 81, arg0);
        }
        if (this.field1072) {
            int var14 = (arg6 + arg2 + arg1 + arg7) / 4;
            for (int var15 = 0; var15 < var13.field1821; var15++) {
                int var16 = var13.field1800[var15];
                int var17 = (arg2 - arg6) * (var16 + 64) / 128 + arg6;
                int var18 = arg7 + (arg1 - arg7) * (var16 + 64) / 128;
                int var19 = var13.field1823[var15];
                int var20 = (var18 - var17) * (var19 + 64) / 128 + var17;
                var13.field1808[var15] += var20 - var14;
            }
        }
        return var13;
    }
}
