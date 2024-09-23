import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KFUEEJVZ")
public class class33 {

    @OriginalMember(owner = "KFUEEJVZ", name = "a", descriptor = "I")
    public int field969 = -1;

    @OriginalMember(owner = "KFUEEJVZ", name = "b", descriptor = "Z")
    private boolean field970 = true;

    @OriginalMember(owner = "KFUEEJVZ", name = "e", descriptor = "I")
    public int field973 = -1;

    @OriginalMember(owner = "KFUEEJVZ", name = "g", descriptor = "B")
    public byte field975 = 1;

    @OriginalMember(owner = "KFUEEJVZ", name = "i", descriptor = "I")
    public int field977 = -1;

    @OriginalMember(owner = "KFUEEJVZ", name = "j", descriptor = "I")
    private int field978 = 128;

    @OriginalMember(owner = "KFUEEJVZ", name = "l", descriptor = "I")
    private int field980 = 4006;

    @OriginalMember(owner = "KFUEEJVZ", name = "m", descriptor = "I")
    public int field981 = -1;

    @OriginalMember(owner = "KFUEEJVZ", name = "o", descriptor = "Z")
    public boolean field983 = false;

    @OriginalMember(owner = "KFUEEJVZ", name = "p", descriptor = "I")
    public int field984 = -1;

    @OriginalMember(owner = "KFUEEJVZ", name = "q", descriptor = "I")
    public int field985 = -1;

    @OriginalMember(owner = "KFUEEJVZ", name = "s", descriptor = "I")
    public int field987 = 32;

    @OriginalMember(owner = "KFUEEJVZ", name = "u", descriptor = "I")
    public int field989 = -1;

    @OriginalMember(owner = "KFUEEJVZ", name = "x", descriptor = "Z")
    public boolean field992 = true;

    @OriginalMember(owner = "KFUEEJVZ", name = "y", descriptor = "I")
    public int field993 = -1;

    @OriginalMember(owner = "KFUEEJVZ", name = "B", descriptor = "I")
    public int field996 = -1;

    @OriginalMember(owner = "KFUEEJVZ", name = "D", descriptor = "I")
    public int field998 = -1;

    @OriginalMember(owner = "KFUEEJVZ", name = "E", descriptor = "I")
    private int field999 = -42286;

    @OriginalMember(owner = "KFUEEJVZ", name = "F", descriptor = "Z")
    public boolean field1000 = true;

    @OriginalMember(owner = "KFUEEJVZ", name = "G", descriptor = "I")
    public int field1001 = -1;

    @OriginalMember(owner = "KFUEEJVZ", name = "I", descriptor = "I")
    public int field1003 = -1;

    @OriginalMember(owner = "KFUEEJVZ", name = "J", descriptor = "J")
    public long field1004 = -1L;

    @OriginalMember(owner = "KFUEEJVZ", name = "P", descriptor = "I")
    private int field1010 = 128;

    @OriginalMember(owner = "KFUEEJVZ", name = "w", descriptor = "Z")
    private static boolean field991 = true;

    @OriginalMember(owner = "KFUEEJVZ", name = "M", descriptor = "LDMOAMUBS;")
    public static class14 field1007 = new class14(30, true);

    @OriginalMember(owner = "KFUEEJVZ", name = "H", descriptor = "I")
    private static int field1002;

    @OriginalMember(owner = "KFUEEJVZ", name = "K", descriptor = "I")
    private static int field1005;

    @OriginalMember(owner = "KFUEEJVZ", name = "L", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "KFUEEJVZ", name = "f", descriptor = "I")
    private int field974;

    @OriginalMember(owner = "KFUEEJVZ", name = "C", descriptor = "I")
    private int field997;

    @OriginalMember(owner = "KFUEEJVZ", name = "r", descriptor = "LXGRGMPUQ;")
    private static class69 field986;

    @OriginalMember(owner = "KFUEEJVZ", name = "h", descriptor = "Lclient;")
    public static client field976;

    @OriginalMember(owner = "KFUEEJVZ", name = "t", descriptor = "Ljava/lang/String;")
    public String field988;

    @OriginalMember(owner = "KFUEEJVZ", name = "N", descriptor = "[B")
    public byte[] field1008;

    @OriginalMember(owner = "KFUEEJVZ", name = "O", descriptor = "[I")
    private int[] field1009;

    @OriginalMember(owner = "KFUEEJVZ", name = "c", descriptor = "[I")
    public int[] field971;

    @OriginalMember(owner = "KFUEEJVZ", name = "d", descriptor = "[I")
    private static int[] field972;

    @OriginalMember(owner = "KFUEEJVZ", name = "k", descriptor = "[I")
    private int[] field979;

    @OriginalMember(owner = "KFUEEJVZ", name = "z", descriptor = "[I")
    private int[] field994;

    @OriginalMember(owner = "KFUEEJVZ", name = "A", descriptor = "[I")
    private int[] field995;

    @OriginalMember(owner = "KFUEEJVZ", name = "v", descriptor = "[LKFUEEJVZ;")
    private static class33[] field990;

    @OriginalMember(owner = "KFUEEJVZ", name = "n", descriptor = "[Ljava/lang/String;")
    public String[] field982;

    @OriginalMember(owner = "KFUEEJVZ", name = "a", descriptor = "(B)LKFUEEJVZ;")
    public final class33 method262(byte arg0) {
        if (arg0 == 9) {
            boolean var2 = false;
        } else {
            this.field999 = -433;
        }
        int var3 = -1;
        if (this.field973 != -1) {
            class23 var4 = class23.field884[this.field973];
            int var5 = var4.field886;
            int var6 = var4.field887;
            int var7 = var4.field888;
            int var8 = client.field385[var7 - var6];
            var3 = field976.field320[var5] >> var6 & var8;
        } else if (this.field977 != -1) {
            var3 = field976.field320[this.field977];
        }
        return var3 < 0 || var3 >= this.field971.length || this.field971[var3] == -1 ? null : method267(this.field971[var3]);
    }

    @OriginalMember(owner = "KFUEEJVZ", name = "a", descriptor = "(Z)LVYUQHOMO;")
    public final class66 method263(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (this.field971 != null) {
            class33 var3 = this.method262((byte) 9);
            return var3 == null ? null : var3.method263(true);
        } else if (this.field979 == null) {
            return null;
        } else {
            boolean var4 = false;
            for (int var5 = 0; var5 < this.field979.length; var5++) {
                if (!class66.method408(this.field979[var5])) {
                    var4 = true;
                }
            }
            if (var4) {
                return null;
            }
            class66[] var6 = new class66[this.field979.length];
            for (int var7 = 0; var7 < this.field979.length; var7++) {
                var6[var7] = class66.method407(this.field979[var7]);
            }
            class66 var8;
            if (var6.length == 1) {
                var8 = var6[0];
            } else {
                var8 = new class66(var6, this.field980, var6.length);
            }
            if (this.field994 != null) {
                for (int var9 = 0; var9 < this.field994.length; var9++) {
                    var8.method421(this.field994[var9], this.field1009[var9]);
                }
            }
            return var8;
        }
    }

    @OriginalMember(owner = "KFUEEJVZ", name = "a", descriptor = "(I[III)LVYUQHOMO;")
    public final class66 method264(int arg0, int[] arg1, int arg2, int arg3) {
        if (this.field971 != null) {
            class33 var5 = this.method262((byte) 9);
            return var5 == null ? null : var5.method264(arg0, arg1, arg2, 2);
        }
        class66 var6 = (class66) field1007.method193(this.field1004);
        if (arg3 != 2) {
            throw new NullPointerException();
        }
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field995.length; var8++) {
                if (!class66.method408(this.field995[var8])) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class66[] var9 = new class66[this.field995.length];
            for (int var10 = 0; var10 < this.field995.length; var10++) {
                var9[var10] = class66.method407(this.field995[var10]);
            }
            if (var9.length == 1) {
                var6 = var9[0];
            } else {
                var6 = new class66(var9, this.field980, var9.length);
            }
            if (this.field994 != null) {
                for (int var11 = 0; var11 < this.field994.length; var11++) {
                    var6.method421(this.field994[var11], this.field1009[var11]);
                }
            }
            var6.method414((byte) 56);
            var6.method424(this.field974 + 64, this.field997 + 850, -30, -50, -30, true);
            field1007.method194(this.field1004, (byte) -80, var6);
        }
        class66 var12 = class66.field1474;
        var12.method409((byte) 118, var6, class2.method11((byte) 85, arg0) & class2.method11((byte) 85, arg2));
        if (arg0 != -1 && arg2 != -1) {
            var12.method416(arg1, arg2, 29038, arg0);
        } else if (arg0 != -1) {
            var12.method415(arg0, 3);
        }
        if (this.field1010 != 128 || this.field978 != 128) {
            var12.method423(this.field1010, this.field978, this.field1010, 0);
        }
        var12.method411(true);
        var12.field1511 = null;
        var12.field1510 = null;
        if (this.field975 == 1) {
            var12.field1512 = true;
        }
        return var12;
    }

    @OriginalMember(owner = "KFUEEJVZ", name = "a", descriptor = "(ZLXGRGMPUQ;)V")
    private final void method265(boolean arg0, class69 arg1) {
        if (!arg0) {
            this.field999 = -210;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method465();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg1.method465();
                    this.field995 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field995[var5] = arg1.method467();
                    }
                } else if (var3 == 2) {
                    this.field988 = arg1.method472();
                } else if (var3 == 3) {
                    this.field1008 = arg1.method473(-211);
                } else if (var3 == 12) {
                    this.field975 = arg1.method466();
                } else if (var3 == 13) {
                    this.field998 = arg1.method467();
                } else if (var3 == 14) {
                    this.field1001 = arg1.method467();
                } else if (var3 == 17) {
                    this.field1001 = arg1.method467();
                    this.field989 = arg1.method467();
                    this.field969 = arg1.method467();
                    this.field985 = arg1.method467();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field982 == null) {
                        this.field982 = new String[5];
                    }
                    this.field982[var3 - 30] = arg1.method472();
                    if (this.field982[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field982[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg1.method465();
                    this.field994 = new int[var6];
                    this.field1009 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field994[var7] = arg1.method467();
                        this.field1009[var7] = arg1.method467();
                    }
                } else if (var3 == 60) {
                    int var8 = arg1.method465();
                    this.field979 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field979[var9] = arg1.method467();
                    }
                } else if (var3 == 90) {
                    this.field984 = arg1.method467();
                } else if (var3 == 91) {
                    this.field981 = arg1.method467();
                } else if (var3 == 92) {
                    this.field993 = arg1.method467();
                } else if (var3 == 93) {
                    this.field992 = false;
                } else if (var3 == 95) {
                    this.field1003 = arg1.method467();
                } else if (var3 == 97) {
                    this.field1010 = arg1.method467();
                } else if (var3 == 98) {
                    this.field978 = arg1.method467();
                } else if (var3 == 99) {
                    this.field983 = true;
                } else if (var3 == 100) {
                    this.field974 = arg1.method466();
                } else if (var3 == 101) {
                    this.field997 = arg1.method466() * 5;
                } else if (var3 == 102) {
                    this.field996 = arg1.method467();
                } else if (var3 == 103) {
                    this.field987 = arg1.method467();
                } else if (var3 == 106) {
                    this.field973 = arg1.method467();
                    if (this.field973 == 65535) {
                        this.field973 = -1;
                    }
                    this.field977 = arg1.method467();
                    if (this.field977 == 65535) {
                        this.field977 = -1;
                    }
                    int var10 = arg1.method465();
                    this.field971 = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.field971[var11] = arg1.method467();
                        if (this.field971[var11] == 65535) {
                            this.field971[var11] = -1;
                        }
                    }
                } else if (var3 == 107) {
                    this.field1000 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "KFUEEJVZ", name = "a", descriptor = "(LMJLXHQTQ;)V")
    public static final void method266(class44 arg0) {
        field986 = new class69(arg0.method317("npc.dat", null), -82);
        class69 var1 = new class69(arg0.method317("npc.idx", null), -82);
        field1006 = var1.method467();
        field972 = new int[field1006];
        int var2 = 2;
        for (int var3 = 0; var3 < field1006; var3++) {
            field972[var3] = var2;
            var2 += var1.method467();
        }
        field990 = new class33[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field990[var4] = new class33();
        }
    }

    @OriginalMember(owner = "KFUEEJVZ", name = "a", descriptor = "(I)LKFUEEJVZ;")
    public static final class33 method267(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field990[var1].field1004) {
                return field990[var1];
            }
        }
        field1002 = (field1002 + 1) % 20;
        class33 var2 = field990[field1002] = new class33();
        field986.field1652 = field972[arg0];
        var2.field1004 = arg0;
        var2.method265(field991, field986);
        return var2;
    }

    @OriginalMember(owner = "KFUEEJVZ", name = "b", descriptor = "(I)Z")
    public boolean method268(int arg0) {
        if (this.field971 == null) {
            return true;
        }
        int var2 = -1;
        if (arg0 < 2 || arg0 > 2) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field973 != -1) {
            class23 var4 = class23.field884[this.field973];
            int var5 = var4.field886;
            int var6 = var4.field887;
            int var7 = var4.field888;
            int var8 = client.field385[var7 - var6];
            var2 = field976.field320[var5] >> var6 & var8;
        } else if (this.field977 != -1) {
            var2 = field976.field320[this.field977];
        }
        return var2 >= 0 && var2 < this.field971.length && this.field971[var2] != -1;
    }

    @OriginalMember(owner = "KFUEEJVZ", name = "b", descriptor = "(B)V")
    public static final void method269(byte arg0) {
        field1007 = null;
        field972 = null;
        field990 = null;
        if (arg0 != -117) {
            field1005 = 240;
        }
        field986 = null;
    }
}
