import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class85 extends class72 {

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "I")
    public int field2041 = 99;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "I")
    public int field2036 = 5;

    @OriginalMember(owner = "client!ne", name = "mb", descriptor = "I")
    public int field2057 = -1;

    @OriginalMember(owner = "client!ne", name = "lb", descriptor = "I")
    public int field2056 = -1;

    @OriginalMember(owner = "client!ne", name = "ib", descriptor = "I")
    public int field2053 = -1;

    @OriginalMember(owner = "client!ne", name = "jb", descriptor = "I")
    public int field2054 = -1;

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "I")
    public int field2042 = 2;

    @OriginalMember(owner = "client!ne", name = "kb", descriptor = "Z")
    public boolean field2055 = false;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
    public int field2033 = -1;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "I")
    public static int field2039 = 2;

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
    public static int field2037 = 0;

    @OriginalMember(owner = "client!ne", name = "gb", descriptor = "Lsb;")
    public static class111 field2051 = new class111(5000);

    @OriginalMember(owner = "client!ne", name = "ob", descriptor = "Lae;")
    public static class6 field2059 = class64.method474(110, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!ne", name = "nb", descriptor = "I")
    public static int field2058 = 0;

    @OriginalMember(owner = "client!ne", name = "qb", descriptor = "I")
    public static int field2061 = 1;

    @OriginalMember(owner = "client!ne", name = "rb", descriptor = "Lbd;")
    public static class12 field2062 = new class12(64);

    @OriginalMember(owner = "client!ne", name = "ub", descriptor = "[I")
    public static int[] field2065 = new int[128];

    @OriginalMember(owner = "client!ne", name = "tb", descriptor = "Lae;")
    private static class6 field2064 = class64.method474(103, "Create a free account");

    @OriginalMember(owner = "client!ne", name = "sb", descriptor = "Lae;")
    public static class6 field2063 = field2064;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!ne", name = "db", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!ne", name = "fb", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!ne", name = "pb", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "[I")
    public int[] field2043;

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "[I")
    private int[] field2046;

    @OriginalMember(owner = "client!ne", name = "eb", descriptor = "[I")
    public int[] field2049;

    @OriginalMember(owner = "client!ne", name = "hb", descriptor = "[I")
    private int[] field2052;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lm;I)V", line = 3)
    public final void method721(class77 arg0, int arg1) {
        field2048++;
        while (true) {
            int var3 = arg0.method620((byte) -8);
            if (var3 == 0) {
                if (arg1 == 17877) {
                    return;
                } else {
                    method727((byte) -44);
                    return;
                }
            }
            this.method723(arg0, var3, 0);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)I", line = 31)
    public static final int method722(byte arg0) {
        field2050++;
        if (arg0 < 46) {
            field2058 = 67;
        }
        return class65.field1420++;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lm;II)V", line = 45)
    private final void method723(class77 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            return;
        }
        field2044++;
        if (arg1 == 1) {
            int var4 = arg0.method620((byte) -8);
            this.field2043 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2043[var5] = arg0.method636(-108);
            }
            this.field2049 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field2049[var6] = arg0.method636(class2.method7(arg2, -27));
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field2049[var7] += arg0.method636(116) << 16;
            }
        } else if (arg1 == 2) {
            this.field2056 = arg0.method636(-23);
        } else if (arg1 == 3) {
            int var8 = arg0.method620((byte) -8);
            this.field2052 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2052[var9] = arg0.method620((byte) -8);
            }
            this.field2052[var8] = 9999999;
        } else if (arg1 == 4) {
            this.field2055 = true;
        } else if (arg1 == 5) {
            this.field2036 = arg0.method620((byte) -8);
        } else if (arg1 == 6) {
            this.field2033 = arg0.method636(-92);
        } else if (arg1 == 7) {
            this.field2053 = arg0.method636(-95);
        } else if (arg1 == 8) {
            this.field2041 = arg0.method620((byte) -8);
        } else if (arg1 == 9) {
            this.field2057 = arg0.method620((byte) -8);
        } else if (arg1 == 10) {
            this.field2054 = arg0.method620((byte) -8);
        } else if (arg1 == 11) {
            this.field2042 = arg0.method620((byte) -8);
        } else if (arg1 == 12) {
            int var10 = arg0.method620((byte) -8);
            this.field2046 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field2046[var11] = arg0.method636(-75);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field2046[var12] += arg0.method636(93) << 16;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILv;Lne;II)Lv;", line = 161)
    public final class131 method724(int arg0, class131 arg1, class85 arg2, int arg3, int arg4) {
        int var6 = this.field2049[arg0];
        field2035++;
        class90 var7 = class108.method913((byte) 110, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg2.method726(arg1, arg4, true);
        }
        int var9 = arg2.field2049[arg4];
        class90 var10 = class108.method913((byte) 81, var9 >> arg3);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class131 var12 = arg1.method1087(!var7.method757(var8, (byte) 52));
            var12.method1077(var7, var8);
            return var12;
        } else {
            class131 var13 = arg1.method1087(!var7.method757(var8, (byte) 52) & !var10.method757(var11, (byte) 52));
            var13.method1058(var7, var8, var10, var11, this.field2052);
            return var13;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V", line = 193)
    public final void method725(byte arg0) {
        if (this.field2054 == -1) {
            if (this.field2052 == null) {
                this.field2054 = 0;
            } else {
                this.field2054 = 2;
            }
        }
        field2060++;
        if (this.field2057 == -1) {
            if (this.field2052 == null) {
                this.field2057 = 0;
            } else {
                this.field2057 = 2;
            }
        }
        if (arg0 > -86) {
            this.field2043 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lv;IZ)Lv;", line = 245)
    public final class131 method726(class131 arg0, int arg1, boolean arg2) {
        int var4 = this.field2049[arg1];
        class90 var5 = class108.method913((byte) 90, var4 >> 16);
        field2040++;
        int var6 = var4 & 0xFFFF;
        if (!arg2) {
            this.method724(98, null, null, 31, 1);
        }
        if (var5 == null) {
            return arg0.method1087(true);
        } else {
            class131 var7 = arg0.method1087(!var5.method757(var6, (byte) 52));
            var7.method1077(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V", line = 268)
    public static void method727(byte arg0) {
        field2065 = null;
        field2059 = null;
        if (arg0 != -58) {
            method722((byte) -80);
        }
        field2063 = null;
        field2064 = null;
        field2062 = null;
        field2051 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lv;II)Lv;", line = 284)
    public final class131 method728(class131 arg0, int arg1, int arg2) {
        int var4 = this.field2049[arg1];
        field2045++;
        class90 var5 = class108.method913((byte) 94, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1067(true);
        }
        class131 var7 = arg0.method1067(!var5.method757(var6, (byte) 52));
        if (arg2 >= -14) {
            this.method721(null, -117);
        }
        var7.method1077(var5, var6);
        return var7;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILv;I)Lv;", line = 309)
    public final class131 method729(int arg0, class131 arg1, int arg2) {
        field2034++;
        int var4 = this.field2049[arg2];
        class90 var5 = class108.method913((byte) 113, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method1087(true);
        }
        class90 var7 = null;
        if (arg0 != -2058442128) {
            field2061 = -113;
        }
        int var8 = 0;
        if (this.field2046 != null && arg2 < this.field2046.length) {
            int var9 = this.field2046[arg2];
            var7 = class108.method913((byte) 85, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class131 var11 = arg1.method1087(!var5.method757(var6, (byte) 52));
            var11.method1077(var5, var6);
            return var11;
        } else {
            class131 var10 = arg1.method1087(!var5.method757(var6, (byte) 52) & !var7.method757(var8, (byte) 52));
            var10.method1077(var5, var6);
            var10.method1077(var7, var8);
            return var10;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lv;III)Lv;", line = 363)
    public final class131 method730(class131 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -3) {
            field2065 = null;
        }
        field2038++;
        int var5 = this.field2049[arg2];
        class90 var6 = class108.method913((byte) 109, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg0.method1087(true);
        }
        class131 var8 = arg0.method1087(!var6.method757(var7, (byte) 52));
        int var9 = arg3 & 0x3;
        if (var9 == 1) {
            var8.method1071();
        } else if (var9 == 2) {
            var8.method1082();
        } else if (var9 == 3) {
            var8.method1075();
        }
        var8.method1077(var6, var7);
        if (var9 == 1) {
            var8.method1075();
        } else if (var9 == 2) {
            var8.method1082();
        } else if (var9 == 3) {
            var8.method1071();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([Lae;I)Lae;", line = 433)
    public static final class6 method731(class6[] arg0, int arg1) {
        field2047++;
        if (arg1 != 14569) {
            field2039 = 5;
        }
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class92.method766(arg0.length, arg0, (byte) -93, 0);
    }
}
