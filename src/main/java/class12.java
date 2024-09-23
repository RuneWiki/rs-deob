import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GALAVQEJ")
public class class12 {

    @OriginalMember(owner = "GALAVQEJ", name = "c", descriptor = "I")
    public int field713 = -1;

    @OriginalMember(owner = "GALAVQEJ", name = "d", descriptor = "I")
    public int field714 = -1;

    @OriginalMember(owner = "GALAVQEJ", name = "e", descriptor = "Z")
    public boolean field715 = false;

    @OriginalMember(owner = "GALAVQEJ", name = "g", descriptor = "I")
    public int field717 = -1;

    @OriginalMember(owner = "GALAVQEJ", name = "k", descriptor = "I")
    private int field721 = 5;

    @OriginalMember(owner = "GALAVQEJ", name = "o", descriptor = "I")
    public int field725 = -1;

    @OriginalMember(owner = "GALAVQEJ", name = "p", descriptor = "I")
    private int field726 = 128;

    @OriginalMember(owner = "GALAVQEJ", name = "r", descriptor = "I")
    public int field728 = 32;

    @OriginalMember(owner = "GALAVQEJ", name = "u", descriptor = "Z")
    public boolean field731 = true;

    @OriginalMember(owner = "GALAVQEJ", name = "v", descriptor = "I")
    public int field732 = -1;

    @OriginalMember(owner = "GALAVQEJ", name = "x", descriptor = "J")
    public long field734 = -1L;

    @OriginalMember(owner = "GALAVQEJ", name = "y", descriptor = "I")
    public int field735 = -1;

    @OriginalMember(owner = "GALAVQEJ", name = "z", descriptor = "B")
    public byte field736 = 1;

    @OriginalMember(owner = "GALAVQEJ", name = "C", descriptor = "I")
    public int field739 = -1;

    @OriginalMember(owner = "GALAVQEJ", name = "E", descriptor = "I")
    public int field741 = -1;

    @OriginalMember(owner = "GALAVQEJ", name = "F", descriptor = "Z")
    private boolean field742 = false;

    @OriginalMember(owner = "GALAVQEJ", name = "H", descriptor = "Z")
    public boolean field744 = true;

    @OriginalMember(owner = "GALAVQEJ", name = "I", descriptor = "I")
    public int field745 = -1;

    @OriginalMember(owner = "GALAVQEJ", name = "J", descriptor = "I")
    private int field746 = 128;

    @OriginalMember(owner = "GALAVQEJ", name = "K", descriptor = "I")
    public int field747 = -1;

    @OriginalMember(owner = "GALAVQEJ", name = "L", descriptor = "I")
    public int field748 = -1;

    @OriginalMember(owner = "GALAVQEJ", name = "M", descriptor = "I")
    public int field749 = -1;

    @OriginalMember(owner = "GALAVQEJ", name = "b", descriptor = "LZPNSJLZE;")
    public static class69 field712 = new class69(30, false);

    @OriginalMember(owner = "GALAVQEJ", name = "i", descriptor = "I")
    private int field719;

    @OriginalMember(owner = "GALAVQEJ", name = "m", descriptor = "I")
    private static int field723;

    @OriginalMember(owner = "GALAVQEJ", name = "t", descriptor = "I")
    private int field730;

    @OriginalMember(owner = "GALAVQEJ", name = "D", descriptor = "I")
    private int field740;

    @OriginalMember(owner = "GALAVQEJ", name = "N", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "GALAVQEJ", name = "j", descriptor = "LNHEPCMLW;")
    private static class35 field720;

    @OriginalMember(owner = "GALAVQEJ", name = "n", descriptor = "Lclient;")
    public static client field724;

    @OriginalMember(owner = "GALAVQEJ", name = "A", descriptor = "Ljava/lang/String;")
    public String field737;

    @OriginalMember(owner = "GALAVQEJ", name = "a", descriptor = "[B")
    public byte[] field711;

    @OriginalMember(owner = "GALAVQEJ", name = "f", descriptor = "[I")
    private static int[] field716;

    @OriginalMember(owner = "GALAVQEJ", name = "h", descriptor = "[I")
    private int[] field718;

    @OriginalMember(owner = "GALAVQEJ", name = "l", descriptor = "[I")
    private int[] field722;

    @OriginalMember(owner = "GALAVQEJ", name = "w", descriptor = "[I")
    private int[] field733;

    @OriginalMember(owner = "GALAVQEJ", name = "B", descriptor = "[I")
    public int[] field738;

    @OriginalMember(owner = "GALAVQEJ", name = "G", descriptor = "[I")
    private int[] field743;

    @OriginalMember(owner = "GALAVQEJ", name = "q", descriptor = "[LGALAVQEJ;")
    private static class12[] field727;

    @OriginalMember(owner = "GALAVQEJ", name = "s", descriptor = "[Ljava/lang/String;")
    public String[] field729;

    @OriginalMember(owner = "GALAVQEJ", name = "a", descriptor = "(I)LGALAVQEJ;")
    public static final class12 method203(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field727[var1].field734) {
                return field727[var1];
            }
        }
        field723 = (field723 + 1) % 20;
        class12 var2 = field727[field723] = new class12();
        field720.field1107 = field716[arg0];
        var2.field734 = arg0;
        var2.method207(false, field720);
        return var2;
    }

    @OriginalMember(owner = "GALAVQEJ", name = "b", descriptor = "(I)LCSGBDGDY;")
    public final class4 method204(int arg0) {
        label71: while (true) {
            if (arg0 >= 0) {
                int var9 = 1;
                while (true) {
                    if (var9 <= 0) {
                        continue label71;
                    }
                    var9++;
                }
            }
            if (this.field738 != null) {
                class12 var2 = this.method206(0);
                if (var2 == null) {
                    return null;
                }
                return var2.method204(-366);
            }
            if (this.field718 == null) {
                return null;
            }
            boolean var3 = false;
            for (int var4 = 0; var4 < this.field718.length; var4++) {
                if (!class4.method161(this.field718[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class4[] var5 = new class4[this.field718.length];
            for (int var6 = 0; var6 < this.field718.length; var6++) {
                var5[var6] = class4.method160(this.field718[var6]);
            }
            class4 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class4(var5.length, -39808, var5);
            }
            if (this.field743 != null) {
                for (int var8 = 0; var8 < this.field743.length; var8++) {
                    var7.method174(this.field743[var8], this.field722[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "GALAVQEJ", name = "a", descriptor = "(II[II)LCSGBDGDY;")
    public final class4 method205(int arg0, int arg1, int[] arg2, int arg3) {
        int var5 = 57 / arg0;
        if (this.field738 != null) {
            class12 var6 = this.method206(0);
            return var6 == null ? null : var6.method205(426, arg1, arg2, arg3);
        }
        class4 var7 = (class4) field712.method586(this.field734);
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field733.length; var9++) {
                if (!class4.method161(this.field733[var9])) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class4[] var10 = new class4[this.field733.length];
            for (int var11 = 0; var11 < this.field733.length; var11++) {
                var10[var11] = class4.method160(this.field733[var11]);
            }
            if (var10.length == 1) {
                var7 = var10[0];
            } else {
                var7 = new class4(var10.length, -39808, var10);
            }
            if (this.field743 != null) {
                for (int var12 = 0; var12 < this.field743.length; var12++) {
                    var7.method174(this.field743[var12], this.field722[var12]);
                }
            }
            var7.method167(7);
            var7.method177(this.field740 + 64, this.field719 + 850, -30, -50, -30, true);
            field712.method587(var7, this.field730, this.field734);
        }
        class4 var13 = class4.field564;
        var13.method162(8, var7, class25.method285(0, arg1) & class25.method285(0, arg3));
        if (arg1 != -1 && arg3 != -1) {
            var13.method169(arg1, arg2, 1, arg3);
        } else if (arg1 != -1) {
            var13.method168(false, arg1);
        }
        if (this.field726 != 128 || this.field746 != 128) {
            var13.method176(this.field726, this.field746, this.field726, 1);
        }
        var13.method164(true);
        var13.field601 = null;
        var13.field600 = null;
        if (this.field736 == 1) {
            var13.field602 = true;
        }
        return var13;
    }

    @OriginalMember(owner = "GALAVQEJ", name = "c", descriptor = "(I)LGALAVQEJ;")
    public final class12 method206(int arg0) {
        if (arg0 != 0) {
            this.field742 = !this.field742;
        }
        int var2 = -1;
        if (this.field717 != -1) {
            class39 var3 = class39.field1195[this.field717];
            int var4 = var3.field1197;
            int var5 = var3.field1198;
            int var6 = var3.field1199;
            int var7 = client.field405[var6 - var5];
            var2 = field724.field134[var4] >> var5 & var7;
        } else if (this.field735 != -1) {
            var2 = field724.field134[this.field735];
        }
        return var2 < 0 || var2 >= this.field738.length || this.field738[var2] == -1 ? null : method203(this.field738[var2]);
    }

    @OriginalMember(owner = "GALAVQEJ", name = "a", descriptor = "(ZLNHEPCMLW;)V")
    private final void method207(boolean arg0, class35 arg1) {
        if (arg0) {
            this.field721 = 172;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method349();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg1.method349();
                    this.field733 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field733[var5] = arg1.method351();
                    }
                } else if (var3 == 2) {
                    this.field737 = arg1.method356();
                } else if (var3 == 3) {
                    this.field711 = arg1.method357(5841);
                } else if (var3 == 12) {
                    this.field736 = arg1.method350();
                } else if (var3 == 13) {
                    this.field747 = arg1.method351();
                } else if (var3 == 14) {
                    this.field714 = arg1.method351();
                } else if (var3 == 17) {
                    this.field714 = arg1.method351();
                    this.field739 = arg1.method351();
                    this.field713 = arg1.method351();
                    this.field725 = arg1.method351();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field729 == null) {
                        this.field729 = new String[5];
                    }
                    this.field729[var3 - 30] = arg1.method356();
                    if (this.field729[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field729[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg1.method349();
                    this.field743 = new int[var6];
                    this.field722 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field743[var7] = arg1.method351();
                        this.field722[var7] = arg1.method351();
                    }
                } else if (var3 == 60) {
                    int var8 = arg1.method349();
                    this.field718 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field718[var9] = arg1.method351();
                    }
                } else if (var3 == 90) {
                    this.field748 = arg1.method351();
                } else if (var3 == 91) {
                    this.field741 = arg1.method351();
                } else if (var3 == 92) {
                    this.field749 = arg1.method351();
                } else if (var3 == 93) {
                    this.field731 = false;
                } else if (var3 == 95) {
                    this.field732 = arg1.method351();
                } else if (var3 == 97) {
                    this.field726 = arg1.method351();
                } else if (var3 == 98) {
                    this.field746 = arg1.method351();
                } else if (var3 == 99) {
                    this.field715 = true;
                } else if (var3 == 100) {
                    this.field740 = arg1.method350();
                } else if (var3 == 101) {
                    this.field719 = arg1.method350() * 5;
                } else if (var3 == 102) {
                    this.field745 = arg1.method351();
                } else if (var3 == 103) {
                    this.field728 = arg1.method351();
                } else if (var3 == 106) {
                    this.field717 = arg1.method351();
                    if (this.field717 == 65535) {
                        this.field717 = -1;
                    }
                    this.field735 = arg1.method351();
                    if (this.field735 == 65535) {
                        this.field735 = -1;
                    }
                    int var10 = arg1.method349();
                    this.field738 = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.field738[var11] = arg1.method351();
                        if (this.field738[var11] == 65535) {
                            this.field738[var11] = -1;
                        }
                    }
                } else if (var3 == 107) {
                    this.field744 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "GALAVQEJ", name = "a", descriptor = "(Z)Z")
    public boolean method208(boolean arg0) {
        if (this.field738 == null) {
            return true;
        }
        int var2 = -1;
        if (!arg0) {
            throw new NullPointerException();
        }
        if (this.field717 != -1) {
            class39 var3 = class39.field1195[this.field717];
            int var4 = var3.field1197;
            int var5 = var3.field1198;
            int var6 = var3.field1199;
            int var7 = client.field405[var6 - var5];
            var2 = field724.field134[var4] >> var5 & var7;
        } else if (this.field735 != -1) {
            var2 = field724.field134[this.field735];
        }
        return var2 >= 0 && var2 < this.field738.length && this.field738[var2] != -1;
    }

    @OriginalMember(owner = "GALAVQEJ", name = "b", descriptor = "(Z)V")
    public static final void method209(boolean arg0) {
        field712 = null;
        if (arg0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field716 = null;
        field727 = null;
        field720 = null;
    }

    @OriginalMember(owner = "GALAVQEJ", name = "a", descriptor = "(LINOFEYKQ;)V")
    public static final void method210(class21 arg0) {
        field720 = new class35((byte) -103, arg0.method277("npc.dat", null));
        class35 var1 = new class35((byte) -103, arg0.method277("npc.idx", null));
        field750 = var1.method351();
        field716 = new int[field750];
        int var2 = 2;
        for (int var3 = 0; var3 < field750; var3++) {
            field716[var3] = var2;
            var2 += var1.method351();
        }
        field727 = new class12[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field727[var4] = new class12();
        }
    }
}
