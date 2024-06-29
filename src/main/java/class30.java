import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LQFHJGYA")
public class class30 {

    @OriginalMember(owner = "client!LQFHJGYA", name = "a", descriptor = "Ljava/lang/String;")
    public String field973 = "null";

    @OriginalMember(owner = "client!LQFHJGYA", name = "b", descriptor = "Z")
    private boolean field974 = false;

    @OriginalMember(owner = "client!LQFHJGYA", name = "c", descriptor = "I")
    public int field975 = -1;

    @OriginalMember(owner = "client!LQFHJGYA", name = "d", descriptor = "I")
    public int field976 = -1;

    @OriginalMember(owner = "client!LQFHJGYA", name = "e", descriptor = "Z")
    public boolean field977 = true;

    @OriginalMember(owner = "client!LQFHJGYA", name = "f", descriptor = "I")
    public int field978 = -1;

    @OriginalMember(owner = "client!LQFHJGYA", name = "g", descriptor = "I")
    public int field979 = -1;

    @OriginalMember(owner = "client!LQFHJGYA", name = "h", descriptor = "I")
    private int field980 = 128;

    @OriginalMember(owner = "client!LQFHJGYA", name = "i", descriptor = "I")
    public int field981 = -1;

    @OriginalMember(owner = "client!LQFHJGYA", name = "j", descriptor = "I")
    public int field982 = -1;

    @OriginalMember(owner = "client!LQFHJGYA", name = "l", descriptor = "I")
    public int field984 = -1;

    @OriginalMember(owner = "client!LQFHJGYA", name = "m", descriptor = "I")
    private int field985 = -560;

    @OriginalMember(owner = "client!LQFHJGYA", name = "x", descriptor = "J")
    public long field996 = -1L;

    @OriginalMember(owner = "client!LQFHJGYA", name = "y", descriptor = "I")
    private int field997 = 587;

    @OriginalMember(owner = "client!LQFHJGYA", name = "z", descriptor = "I")
    private int field998 = 128;

    @OriginalMember(owner = "client!LQFHJGYA", name = "B", descriptor = "Z")
    public boolean field1000 = false;

    @OriginalMember(owner = "client!LQFHJGYA", name = "C", descriptor = "I")
    public int field1001 = -1;

    @OriginalMember(owner = "client!LQFHJGYA", name = "F", descriptor = "I")
    public int field1004 = 32;

    @OriginalMember(owner = "client!LQFHJGYA", name = "G", descriptor = "B")
    public byte field1005 = 1;

    @OriginalMember(owner = "client!LQFHJGYA", name = "H", descriptor = "I")
    public int field1006 = -1;

    @OriginalMember(owner = "client!LQFHJGYA", name = "J", descriptor = "I")
    public int field1008 = -1;

    @OriginalMember(owner = "client!LQFHJGYA", name = "L", descriptor = "Z")
    public boolean field1010 = true;

    @OriginalMember(owner = "client!LQFHJGYA", name = "M", descriptor = "I")
    public int field1011 = -1;

    @OriginalMember(owner = "client!LQFHJGYA", name = "N", descriptor = "I")
    public int field1012 = -1;

    @OriginalMember(owner = "client!LQFHJGYA", name = "t", descriptor = "LWUMSOEQS;")
    public static class65 field992 = new class65((byte) 5, 30);

    @OriginalMember(owner = "client!LQFHJGYA", name = "I", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!LQFHJGYA", name = "K", descriptor = "I")
    private static int field1009;

    @OriginalMember(owner = "client!LQFHJGYA", name = "n", descriptor = "I")
    private int field986;

    @OriginalMember(owner = "client!LQFHJGYA", name = "o", descriptor = "I")
    private int field987;

    @OriginalMember(owner = "client!LQFHJGYA", name = "D", descriptor = "LMVHXDWGI;")
    private static class38 field1002;

    @OriginalMember(owner = "client!LQFHJGYA", name = "u", descriptor = "Lclient;")
    public static client field993;

    @OriginalMember(owner = "client!LQFHJGYA", name = "k", descriptor = "[B")
    public byte[] field983;

    @OriginalMember(owner = "client!LQFHJGYA", name = "E", descriptor = "[I")
    private int[] field1003;

    @OriginalMember(owner = "client!LQFHJGYA", name = "p", descriptor = "[I")
    public int[] field988;

    @OriginalMember(owner = "client!LQFHJGYA", name = "q", descriptor = "[I")
    private int[] field989;

    @OriginalMember(owner = "client!LQFHJGYA", name = "v", descriptor = "[I")
    private int[] field994;

    @OriginalMember(owner = "client!LQFHJGYA", name = "w", descriptor = "[I")
    private int[] field995;

    @OriginalMember(owner = "client!LQFHJGYA", name = "A", descriptor = "[I")
    private static int[] field999;

    @OriginalMember(owner = "client!LQFHJGYA", name = "r", descriptor = "[LLQFHJGYA;")
    private static class30[] field990;

    @OriginalMember(owner = "client!LQFHJGYA", name = "s", descriptor = "[Ljava/lang/String;")
    public String[] field991;

    @OriginalMember(owner = "client!LQFHJGYA", name = "a", descriptor = "(I)LLQFHJGYA;")
    public static final class30 method315(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field990[var1].field996) {
                return field990[var1];
            }
        }
        field1009 = (field1009 + 1) % 20;
        class30 var2 = field990[field1009] = new class30();
        field1002.field1161 = field999[arg0];
        var2.field996 = arg0;
        var2.method322(403, field1002);
        return var2;
    }

    @OriginalMember(owner = "client!LQFHJGYA", name = "a", descriptor = "(Z)LLQFHJGYA;")
    public final class30 method316(boolean arg0) {
        if (!arg0) {
            this.field974 = !this.field974;
        }
        int var2 = -1;
        if (this.field1008 != -1) {
            class47 var3 = class47.field1405[this.field1008];
            int var4 = var3.field1407;
            int var5 = var3.field1408;
            int var6 = var3.field1409;
            int var7 = client.field421[var6 - var5];
            var2 = field993.field528[var4] >> var5 & var7;
        } else if (this.field1012 != -1) {
            var2 = field993.field528[this.field1012];
        }
        return var2 < 0 || var2 >= this.field988.length || this.field988[var2] == -1 ? null : method315(this.field988[var2]);
    }

    @OriginalMember(owner = "client!LQFHJGYA", name = "a", descriptor = "([IBII)LPDVZPZLT;")
    public final class42 method317(int[] arg0, byte arg1, int arg2, int arg3) {
        if (this.field988 != null) {
            class30 var5 = this.method316(true);
            return var5 == null ? null : var5.method317(arg0, (byte) -57, arg2, arg3);
        }
        class42 var6 = (class42) field992.method586(this.field996);
        if (arg1 != -57) {
            this.field985 = -4;
        }
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field995.length; var8++) {
                if (!class42.method415(this.field995[var8])) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class42[] var9 = new class42[this.field995.length];
            for (int var10 = 0; var10 < this.field995.length; var10++) {
                var9[var10] = class42.method414(this.field995[var10]);
            }
            if (var9.length == 1) {
                var6 = var9[0];
            } else {
                var6 = new class42(var9, var9.length, 0);
            }
            if (this.field994 != null) {
                for (int var11 = 0; var11 < this.field994.length; var11++) {
                    var6.method428(this.field994[var11], this.field1003[var11]);
                }
            }
            var6.method421(0);
            var6.method431(this.field986 + 64, this.field987 + 850, -30, -50, -30, true);
            field992.method587(0, this.field996, var6);
        }
        class42 var12 = class42.field1292;
        var12.method416(0, class71.method602(arg2, true) & class71.method602(arg3, true), var6);
        if (arg2 != -1 && arg3 != -1) {
            var12.method423(true, arg2, arg3, arg0);
        } else if (arg2 != -1) {
            var12.method422(0, arg2);
        }
        if (this.field980 != 128 || this.field998 != 128) {
            var12.method430(this.field980, this.field998, this.field980, (byte) 6);
        }
        var12.method418(false);
        var12.field1328 = null;
        var12.field1327 = null;
        if (this.field1005 == 1) {
            var12.field1329 = true;
        }
        return var12;
    }

    @OriginalMember(owner = "client!LQFHJGYA", name = "a", descriptor = "(B)Z")
    public boolean method318(byte arg0) {
        if (arg0 != 97) {
            throw new NullPointerException();
        } else if (this.field988 == null) {
            return true;
        } else {
            int var2 = -1;
            if (this.field1008 != -1) {
                class47 var3 = class47.field1405[this.field1008];
                int var4 = var3.field1407;
                int var5 = var3.field1408;
                int var6 = var3.field1409;
                int var7 = client.field421[var6 - var5];
                var2 = field993.field528[var4] >> var5 & var7;
            } else if (this.field1012 != -1) {
                var2 = field993.field528[this.field1012];
            }
            return var2 >= 0 && var2 < this.field988.length && this.field988[var2] != -1;
        }
    }

    @OriginalMember(owner = "client!LQFHJGYA", name = "b", descriptor = "(Z)V")
    public static final void method319(boolean arg0) {
        if (arg0) {
            field992 = null;
            field999 = null;
            field990 = null;
            field1002 = null;
        }
    }

    @OriginalMember(owner = "client!LQFHJGYA", name = "a", descriptor = "(LIEMHZJLX;)V")
    public static final void method320(class23 arg0) {
        field1002 = new class38(0, arg0.method242("npc.dat", null));
        class38 var1 = new class38(0, arg0.method242("npc.idx", null));
        field1007 = var1.method359();
        field999 = new int[field1007];
        int var2 = 2;
        for (int var3 = 0; var3 < field1007; var3++) {
            field999[var3] = var2;
            var2 += var1.method359();
        }
        field990 = new class30[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field990[var4] = new class30();
        }
    }

    @OriginalMember(owner = "client!LQFHJGYA", name = "b", descriptor = "(I)LPDVZPZLT;")
    public final class42 method321(int arg0) {
        int var2 = 50 / arg0;
        if (this.field988 != null) {
            class30 var3 = this.method316(true);
            return var3 == null ? null : var3.method321(this.field997);
        } else if (this.field989 == null) {
            return null;
        } else {
            boolean var4 = false;
            for (int var5 = 0; var5 < this.field989.length; var5++) {
                if (!class42.method415(this.field989[var5])) {
                    var4 = true;
                }
            }
            if (var4) {
                return null;
            }
            class42[] var6 = new class42[this.field989.length];
            for (int var7 = 0; var7 < this.field989.length; var7++) {
                var6[var7] = class42.method414(this.field989[var7]);
            }
            class42 var8;
            if (var6.length == 1) {
                var8 = var6[0];
            } else {
                var8 = new class42(var6, var6.length, 0);
            }
            if (this.field994 != null) {
                for (int var9 = 0; var9 < this.field994.length; var9++) {
                    var8.method428(this.field994[var9], this.field1003[var9]);
                }
            }
            return var8;
        }
    }

    @OriginalMember(owner = "client!LQFHJGYA", name = "a", descriptor = "(ILMVHXDWGI;)V")
    private final void method322(int arg0, class38 arg1) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method357();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg1.method357();
                    this.field995 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field995[var5] = arg1.method359();
                    }
                } else if (var3 == 2) {
                    this.field973 = arg1.method364();
                } else if (var3 == 3) {
                    this.field983 = arg1.method365(true);
                } else if (var3 == 12) {
                    this.field1005 = arg1.method358();
                } else if (var3 == 13) {
                    this.field1011 = arg1.method359();
                } else if (var3 == 14) {
                    this.field1001 = arg1.method359();
                } else if (var3 == 17) {
                    this.field1001 = arg1.method359();
                    this.field984 = arg1.method359();
                    this.field1006 = arg1.method359();
                    this.field978 = arg1.method359();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field991 == null) {
                        this.field991 = new String[5];
                    }
                    this.field991[var3 - 30] = arg1.method364();
                    if (this.field991[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field991[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg1.method357();
                    this.field994 = new int[var6];
                    this.field1003 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field994[var7] = arg1.method359();
                        this.field1003[var7] = arg1.method359();
                    }
                } else if (var3 == 60) {
                    int var8 = arg1.method357();
                    this.field989 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field989[var9] = arg1.method359();
                    }
                } else if (var3 == 90) {
                    this.field976 = arg1.method359();
                } else if (var3 == 91) {
                    this.field979 = arg1.method359();
                } else if (var3 == 92) {
                    this.field982 = arg1.method359();
                } else if (var3 == 93) {
                    this.field1010 = false;
                } else if (var3 == 95) {
                    this.field981 = arg1.method359();
                } else if (var3 == 97) {
                    this.field980 = arg1.method359();
                } else if (var3 == 98) {
                    this.field998 = arg1.method359();
                } else if (var3 == 99) {
                    this.field1000 = true;
                } else if (var3 == 100) {
                    this.field986 = arg1.method358();
                } else if (var3 == 101) {
                    this.field987 = arg1.method358() * 5;
                } else if (var3 == 102) {
                    this.field975 = arg1.method359();
                } else if (var3 == 103) {
                    this.field1004 = arg1.method359();
                } else if (var3 == 106) {
                    this.field1008 = arg1.method359();
                    if (this.field1008 == 65535) {
                        this.field1008 = -1;
                    }
                    this.field1012 = arg1.method359();
                    if (this.field1012 == 65535) {
                        this.field1012 = -1;
                    }
                    int var10 = arg1.method357();
                    this.field988 = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.field988[var11] = arg1.method359();
                        if (this.field988[var11] == 65535) {
                            this.field988[var11] = -1;
                        }
                    }
                } else if (var3 == 107) {
                    this.field977 = false;
                }
            }
        }
    }
}
