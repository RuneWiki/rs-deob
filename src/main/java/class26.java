import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HQFMWUSH")
public class class26 {

    @OriginalMember(owner = "HQFMWUSH", name = "b", descriptor = "I")
    public int field889 = -1;

    @OriginalMember(owner = "HQFMWUSH", name = "c", descriptor = "I")
    private int field890 = 128;

    @OriginalMember(owner = "HQFMWUSH", name = "e", descriptor = "I")
    public int field892 = -1;

    @OriginalMember(owner = "HQFMWUSH", name = "f", descriptor = "I")
    public int field893 = -1;

    @OriginalMember(owner = "HQFMWUSH", name = "g", descriptor = "I")
    public int field894 = -1;

    @OriginalMember(owner = "HQFMWUSH", name = "i", descriptor = "I")
    private int field896 = 6972;

    @OriginalMember(owner = "HQFMWUSH", name = "j", descriptor = "I")
    public int field897 = -1;

    @OriginalMember(owner = "HQFMWUSH", name = "l", descriptor = "B")
    private byte field899 = 3;

    @OriginalMember(owner = "HQFMWUSH", name = "m", descriptor = "I")
    public int field900 = -1;

    @OriginalMember(owner = "HQFMWUSH", name = "o", descriptor = "I")
    public int field902 = -1;

    @OriginalMember(owner = "HQFMWUSH", name = "r", descriptor = "Z")
    public boolean field905 = true;

    @OriginalMember(owner = "HQFMWUSH", name = "s", descriptor = "J")
    public long field906 = -1L;

    @OriginalMember(owner = "HQFMWUSH", name = "u", descriptor = "I")
    public int field908 = 32;

    @OriginalMember(owner = "HQFMWUSH", name = "y", descriptor = "I")
    public int field912 = -1;

    @OriginalMember(owner = "HQFMWUSH", name = "C", descriptor = "B")
    public byte field916 = 1;

    @OriginalMember(owner = "HQFMWUSH", name = "D", descriptor = "I")
    public int field917 = -1;

    @OriginalMember(owner = "HQFMWUSH", name = "E", descriptor = "Z")
    public boolean field918 = true;

    @OriginalMember(owner = "HQFMWUSH", name = "F", descriptor = "I")
    public int field919 = -1;

    @OriginalMember(owner = "HQFMWUSH", name = "I", descriptor = "I")
    public int field922 = -1;

    @OriginalMember(owner = "HQFMWUSH", name = "K", descriptor = "I")
    public int field924 = -1;

    @OriginalMember(owner = "HQFMWUSH", name = "L", descriptor = "Z")
    public boolean field925 = false;

    @OriginalMember(owner = "HQFMWUSH", name = "M", descriptor = "I")
    private int field926 = 128;

    @OriginalMember(owner = "HQFMWUSH", name = "p", descriptor = "LHPFNYARJ;")
    public static class25 field903 = new class25((byte) 41, 30);

    @OriginalMember(owner = "HQFMWUSH", name = "k", descriptor = "I")
    private static int field898;

    @OriginalMember(owner = "HQFMWUSH", name = "t", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "HQFMWUSH", name = "B", descriptor = "I")
    private int field915;

    @OriginalMember(owner = "HQFMWUSH", name = "G", descriptor = "I")
    private int field920;

    @OriginalMember(owner = "HQFMWUSH", name = "x", descriptor = "LXOUQUKZW;")
    private static class62 field911;

    @OriginalMember(owner = "HQFMWUSH", name = "h", descriptor = "Lclient;")
    public static client field895;

    @OriginalMember(owner = "HQFMWUSH", name = "A", descriptor = "Ljava/lang/String;")
    public String field914;

    @OriginalMember(owner = "HQFMWUSH", name = "a", descriptor = "[B")
    public byte[] field888;

    @OriginalMember(owner = "HQFMWUSH", name = "d", descriptor = "[I")
    private int[] field891;

    @OriginalMember(owner = "HQFMWUSH", name = "n", descriptor = "[I")
    private static int[] field901;

    @OriginalMember(owner = "HQFMWUSH", name = "q", descriptor = "[I")
    public int[] field904;

    @OriginalMember(owner = "HQFMWUSH", name = "v", descriptor = "[I")
    private int[] field909;

    @OriginalMember(owner = "HQFMWUSH", name = "w", descriptor = "[I")
    private int[] field910;

    @OriginalMember(owner = "HQFMWUSH", name = "z", descriptor = "[I")
    private int[] field913;

    @OriginalMember(owner = "HQFMWUSH", name = "J", descriptor = "[LHQFMWUSH;")
    private static class26[] field923;

    @OriginalMember(owner = "HQFMWUSH", name = "H", descriptor = "[Ljava/lang/String;")
    public String[] field921;

    @OriginalMember(owner = "HQFMWUSH", name = "a", descriptor = "(I[III)LKPUOCBCE;")
    public final class35 method305(int arg0, int[] arg1, int arg2, int arg3) {
        if (this.field904 != null) {
            class26 var5 = this.method308((byte) 3);
            return var5 == null ? null : var5.method305(arg0, arg1, 0, arg3);
        }
        class35 var6 = (class35) field903.method302(this.field906);
        if (arg2 != 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if (var6 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field891.length; var9++) {
                if (!class35.method380(this.field891[var9])) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class35[] var10 = new class35[this.field891.length];
            for (int var11 = 0; var11 < this.field891.length; var11++) {
                var10[var11] = class35.method379(this.field891[var11], 0);
            }
            if (var10.length == 1) {
                var6 = var10[0];
            } else {
                var6 = new class35(false, var10.length, var10);
            }
            if (this.field909 != null) {
                for (int var12 = 0; var12 < this.field909.length; var12++) {
                    var6.method393(this.field909[var12], this.field910[var12]);
                }
            }
            var6.method386(9);
            var6.method396(this.field920 + 64, this.field915 + 850, -30, -50, -30, true);
            field903.method303(this.field906, -15, var6);
        }
        class35 var13 = class35.field1005;
        var13.method381(class71.method585(arg3, 2) & class71.method585(arg0, 2), var6, 517);
        if (arg3 != -1 && arg0 != -1) {
            var13.method388(arg1, true, arg3, arg0);
        } else if (arg3 != -1) {
            var13.method387(arg3, -599);
        }
        if (this.field890 != 128 || this.field926 != 128) {
            var13.method395(-49478, this.field890, this.field926, this.field890);
        }
        var13.method383((byte) 8);
        var13.field1042 = null;
        var13.field1041 = null;
        if (this.field916 == 1) {
            var13.field1043 = true;
        }
        return var13;
    }

    @OriginalMember(owner = "HQFMWUSH", name = "a", descriptor = "(BLXOUQUKZW;)V")
    private final void method306(byte arg0, class62 arg1) {
        if (arg0 == 5) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            while (true) {
                int var5 = arg1.method521();
                if (var5 == 0) {
                    return;
                }
                if (var5 == 1) {
                    int var6 = arg1.method521();
                    this.field891 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field891[var7] = arg1.method523();
                    }
                } else if (var5 == 2) {
                    this.field914 = arg1.method528();
                } else if (var5 == 3) {
                    this.field888 = arg1.method529((byte) 7);
                } else if (var5 == 12) {
                    this.field916 = arg1.method522();
                } else if (var5 == 13) {
                    this.field924 = arg1.method523();
                } else if (var5 == 14) {
                    this.field902 = arg1.method523();
                } else if (var5 == 17) {
                    this.field902 = arg1.method523();
                    this.field893 = arg1.method523();
                    this.field919 = arg1.method523();
                    this.field922 = arg1.method523();
                } else if (var5 >= 30 && var5 < 40) {
                    if (this.field921 == null) {
                        this.field921 = new String[5];
                    }
                    this.field921[var5 - 30] = arg1.method528();
                    if (this.field921[var5 - 30].equalsIgnoreCase("hidden")) {
                        this.field921[var5 - 30] = null;
                    }
                } else if (var5 == 40) {
                    int var8 = arg1.method521();
                    this.field909 = new int[var8];
                    this.field910 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field909[var9] = arg1.method523();
                        this.field910[var9] = arg1.method523();
                    }
                } else if (var5 == 60) {
                    int var10 = arg1.method521();
                    this.field913 = new int[var10];
                    for (int var11 = 0; var11 < var10; var11++) {
                        this.field913[var11] = arg1.method523();
                    }
                } else if (var5 == 90) {
                    this.field892 = arg1.method523();
                } else if (var5 == 91) {
                    this.field900 = arg1.method523();
                } else if (var5 == 92) {
                    this.field912 = arg1.method523();
                } else if (var5 == 93) {
                    this.field918 = false;
                } else if (var5 == 95) {
                    this.field897 = arg1.method523();
                } else if (var5 == 97) {
                    this.field890 = arg1.method523();
                } else if (var5 == 98) {
                    this.field926 = arg1.method523();
                } else if (var5 == 99) {
                    this.field925 = true;
                } else if (var5 == 100) {
                    this.field920 = arg1.method522();
                } else if (var5 == 101) {
                    this.field915 = arg1.method522() * 5;
                } else if (var5 == 102) {
                    this.field894 = arg1.method523();
                } else if (var5 == 103) {
                    this.field908 = arg1.method523();
                } else if (var5 == 106) {
                    this.field917 = arg1.method523();
                    if (this.field917 == 65535) {
                        this.field917 = -1;
                    }
                    this.field889 = arg1.method523();
                    if (this.field889 == 65535) {
                        this.field889 = -1;
                    }
                    int var12 = arg1.method521();
                    this.field904 = new int[var12 + 1];
                    for (int var13 = 0; var13 <= var12; var13++) {
                        this.field904[var13] = arg1.method523();
                        if (this.field904[var13] == 65535) {
                            this.field904[var13] = -1;
                        }
                    }
                } else if (var5 == 107) {
                    this.field905 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "HQFMWUSH", name = "a", descriptor = "(Z)LKPUOCBCE;")
    public final class35 method307(boolean arg0) {
        if (this.field904 != null) {
            class26 var2 = this.method308((byte) 3);
            return var2 == null ? null : var2.method307(false);
        } else if (this.field913 == null) {
            return null;
        } else {
            boolean var3 = false;
            if (arg0) {
                this.field896 = 205;
            }
            for (int var4 = 0; var4 < this.field913.length; var4++) {
                if (!class35.method380(this.field913[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class35[] var5 = new class35[this.field913.length];
            for (int var6 = 0; var6 < this.field913.length; var6++) {
                var5[var6] = class35.method379(this.field913[var6], 0);
            }
            class35 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class35(false, var5.length, var5);
            }
            if (this.field909 != null) {
                for (int var8 = 0; var8 < this.field909.length; var8++) {
                    var7.method393(this.field909[var8], this.field910[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "HQFMWUSH", name = "a", descriptor = "(B)LHQFMWUSH;")
    public final class26 method308(byte arg0) {
        int var2 = -1;
        if (this.field899 != arg0) {
            throw new NullPointerException();
        }
        if (this.field917 != -1) {
            class59 var3 = class59.field1545[this.field917];
            int var4 = var3.field1547;
            int var5 = var3.field1548;
            int var6 = var3.field1549;
            int var7 = client.field433[var6 - var5];
            var2 = field895.field389[var4] >> var5 & var7;
        } else if (this.field889 != -1) {
            var2 = field895.field389[this.field889];
        }
        return var2 < 0 || var2 >= this.field904.length || this.field904[var2] == -1 ? null : method309(this.field904[var2]);
    }

    @OriginalMember(owner = "HQFMWUSH", name = "a", descriptor = "(I)LHQFMWUSH;")
    public static final class26 method309(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field923[var1].field906) {
                return field923[var1];
            }
        }
        field898 = (field898 + 1) % 20;
        class26 var2 = field923[field898] = new class26();
        field911.field1579 = field901[arg0];
        var2.field906 = arg0;
        var2.method306((byte) 5, field911);
        return var2;
    }

    @OriginalMember(owner = "HQFMWUSH", name = "b", descriptor = "(I)V")
    public static final void method310(int arg0) {
        field903 = null;
        field901 = null;
        field923 = null;
        if (arg0 < 1 || arg0 > 1) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field911 = null;
    }

    @OriginalMember(owner = "HQFMWUSH", name = "a", descriptor = "(LCVNWKEAW;)V")
    public static final void method311(class7 arg0) {
        field911 = new class62(-417, arg0.method180("npc.dat", null));
        class62 var1 = new class62(-417, arg0.method180("npc.idx", null));
        field907 = var1.method523();
        field901 = new int[field907];
        int var2 = 2;
        for (int var3 = 0; var3 < field907; var3++) {
            field901[var3] = var2;
            var2 += var1.method523();
        }
        field923 = new class26[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field923[var4] = new class26();
        }
    }
}
