import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JRELGTVY")
public class class29 {

    @OriginalMember(owner = "client!JRELGTVY", name = "c", descriptor = "I")
    public int field1034 = -1;

    @OriginalMember(owner = "client!JRELGTVY", name = "e", descriptor = "I")
    public int field1036 = -1;

    @OriginalMember(owner = "client!JRELGTVY", name = "g", descriptor = "I")
    public int field1038 = -1;

    @OriginalMember(owner = "client!JRELGTVY", name = "h", descriptor = "I")
    public int field1039 = 32;

    @OriginalMember(owner = "client!JRELGTVY", name = "k", descriptor = "I")
    private int field1042 = 128;

    @OriginalMember(owner = "client!JRELGTVY", name = "l", descriptor = "I")
    public int field1043 = -1;

    @OriginalMember(owner = "client!JRELGTVY", name = "n", descriptor = "Z")
    public boolean field1045 = false;

    @OriginalMember(owner = "client!JRELGTVY", name = "p", descriptor = "B")
    private byte field1047 = -72;

    @OriginalMember(owner = "client!JRELGTVY", name = "q", descriptor = "I")
    private int field1048 = -727;

    @OriginalMember(owner = "client!JRELGTVY", name = "r", descriptor = "J")
    public long field1049 = -1L;

    @OriginalMember(owner = "client!JRELGTVY", name = "s", descriptor = "I")
    public int field1050 = -1;

    @OriginalMember(owner = "client!JRELGTVY", name = "t", descriptor = "I")
    private int field1051 = 128;

    @OriginalMember(owner = "client!JRELGTVY", name = "u", descriptor = "I")
    public int field1052 = -1;

    @OriginalMember(owner = "client!JRELGTVY", name = "w", descriptor = "B")
    public byte field1054 = 1;

    @OriginalMember(owner = "client!JRELGTVY", name = "x", descriptor = "Z")
    public boolean field1055 = true;

    @OriginalMember(owner = "client!JRELGTVY", name = "y", descriptor = "I")
    public int field1056 = -1;

    @OriginalMember(owner = "client!JRELGTVY", name = "z", descriptor = "I")
    private int field1057 = 3;

    @OriginalMember(owner = "client!JRELGTVY", name = "B", descriptor = "I")
    public int field1059 = -1;

    @OriginalMember(owner = "client!JRELGTVY", name = "D", descriptor = "I")
    public int field1061 = -1;

    @OriginalMember(owner = "client!JRELGTVY", name = "G", descriptor = "Ljava/lang/String;")
    public String field1064 = "null";

    @OriginalMember(owner = "client!JRELGTVY", name = "I", descriptor = "I")
    public int field1066 = -1;

    @OriginalMember(owner = "client!JRELGTVY", name = "K", descriptor = "I")
    public int field1068 = -1;

    @OriginalMember(owner = "client!JRELGTVY", name = "L", descriptor = "I")
    public int field1069 = -1;

    @OriginalMember(owner = "client!JRELGTVY", name = "O", descriptor = "Z")
    public boolean field1072 = true;

    @OriginalMember(owner = "client!JRELGTVY", name = "f", descriptor = "LYITKGHWB;")
    public static class67 field1037 = new class67(30, (byte) 6);

    @OriginalMember(owner = "client!JRELGTVY", name = "N", descriptor = "I")
    private static int field1071 = 188;

    @OriginalMember(owner = "client!JRELGTVY", name = "m", descriptor = "I")
    private static int field1044;

    @OriginalMember(owner = "client!JRELGTVY", name = "A", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!JRELGTVY", name = "E", descriptor = "I")
    private int field1062;

    @OriginalMember(owner = "client!JRELGTVY", name = "H", descriptor = "I")
    private int field1065;

    @OriginalMember(owner = "client!JRELGTVY", name = "d", descriptor = "LPQBRPYKE;")
    private static class41 field1035;

    @OriginalMember(owner = "client!JRELGTVY", name = "v", descriptor = "Lclient;")
    public static client field1053;

    @OriginalMember(owner = "client!JRELGTVY", name = "j", descriptor = "[B")
    public byte[] field1041;

    @OriginalMember(owner = "client!JRELGTVY", name = "a", descriptor = "[I")
    public int[] field1032;

    @OriginalMember(owner = "client!JRELGTVY", name = "i", descriptor = "[I")
    private int[] field1040;

    @OriginalMember(owner = "client!JRELGTVY", name = "o", descriptor = "[I")
    private int[] field1046;

    @OriginalMember(owner = "client!JRELGTVY", name = "F", descriptor = "[I")
    private int[] field1063;

    @OriginalMember(owner = "client!JRELGTVY", name = "J", descriptor = "[I")
    private static int[] field1067;

    @OriginalMember(owner = "client!JRELGTVY", name = "M", descriptor = "[I")
    private int[] field1070;

    @OriginalMember(owner = "client!JRELGTVY", name = "C", descriptor = "[LJRELGTVY;")
    private static class29[] field1060;

    @OriginalMember(owner = "client!JRELGTVY", name = "b", descriptor = "[Ljava/lang/String;")
    public String[] field1033;

    @OriginalMember(owner = "client!JRELGTVY", name = "a", descriptor = "(LPQBRPYKE;Z)V")
    private final void method264(class41 arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method340();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg0.method340();
                    this.field1040 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1040[var5] = arg0.method342();
                    }
                } else if (var3 == 2) {
                    this.field1064 = arg0.method347();
                } else if (var3 == 3) {
                    this.field1041 = arg0.method348(-18086);
                } else if (var3 == 12) {
                    this.field1054 = arg0.method341();
                } else if (var3 == 13) {
                    this.field1034 = arg0.method342();
                } else if (var3 == 14) {
                    this.field1059 = arg0.method342();
                } else if (var3 == 17) {
                    this.field1059 = arg0.method342();
                    this.field1068 = arg0.method342();
                    this.field1036 = arg0.method342();
                    this.field1038 = arg0.method342();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field1033 == null) {
                        this.field1033 = new String[5];
                    }
                    this.field1033[var3 - 30] = arg0.method347();
                    if (this.field1033[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1033[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg0.method340();
                    this.field1046 = new int[var6];
                    this.field1063 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1046[var7] = arg0.method342();
                        this.field1063[var7] = arg0.method342();
                    }
                } else if (var3 == 60) {
                    int var8 = arg0.method340();
                    this.field1070 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field1070[var9] = arg0.method342();
                    }
                } else if (var3 == 90) {
                    this.field1066 = arg0.method342();
                } else if (var3 == 91) {
                    this.field1061 = arg0.method342();
                } else if (var3 == 92) {
                    this.field1056 = arg0.method342();
                } else if (var3 == 93) {
                    this.field1055 = false;
                } else if (var3 == 95) {
                    this.field1052 = arg0.method342();
                } else if (var3 == 97) {
                    this.field1051 = arg0.method342();
                } else if (var3 == 98) {
                    this.field1042 = arg0.method342();
                } else if (var3 == 99) {
                    this.field1045 = true;
                } else if (var3 == 100) {
                    this.field1062 = arg0.method341();
                } else if (var3 == 101) {
                    this.field1065 = arg0.method341() * 5;
                } else if (var3 == 102) {
                    this.field1050 = arg0.method342();
                } else if (var3 == 103) {
                    this.field1039 = arg0.method342();
                } else if (var3 == 106) {
                    this.field1043 = arg0.method342();
                    if (this.field1043 == 65535) {
                        this.field1043 = -1;
                    }
                    this.field1069 = arg0.method342();
                    if (this.field1069 == 65535) {
                        this.field1069 = -1;
                    }
                    int var10 = arg0.method340();
                    this.field1032 = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.field1032[var11] = arg0.method342();
                        if (this.field1032[var11] == 65535) {
                            this.field1032[var11] = -1;
                        }
                    }
                } else if (var3 == 107) {
                    this.field1072 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!JRELGTVY", name = "a", descriptor = "(Z)Z")
    public boolean method265(boolean arg0) {
        if (this.field1032 == null) {
            return true;
        }
        int var2 = -1;
        if (!arg0) {
            this.field1057 = 214;
        }
        if (this.field1043 != -1) {
            class25 var3 = class25.field916[this.field1043];
            int var4 = var3.field918;
            int var5 = var3.field919;
            int var6 = var3.field920;
            int var7 = client.field224[var6 - var5];
            var2 = field1053.field391[var4] >> var5 & var7;
        } else if (this.field1069 != -1) {
            var2 = field1053.field391[this.field1069];
        }
        return var2 >= 0 && var2 < this.field1032.length && this.field1032[var2] != -1;
    }

    @OriginalMember(owner = "client!JRELGTVY", name = "a", descriptor = "(I)LJRELGTVY;")
    public final class29 method266(int arg0) {
        if (arg0 < this.field1057 || arg0 > this.field1057) {
            throw new NullPointerException();
        }
        int var2 = -1;
        if (this.field1043 != -1) {
            class25 var3 = class25.field916[this.field1043];
            int var4 = var3.field918;
            int var5 = var3.field919;
            int var6 = var3.field920;
            int var7 = client.field224[var6 - var5];
            var2 = field1053.field391[var4] >> var5 & var7;
        } else if (this.field1069 != -1) {
            var2 = field1053.field391[this.field1069];
        }
        return var2 < 0 || var2 >= this.field1032.length || this.field1032[var2] == -1 ? null : method269(this.field1032[var2]);
    }

    @OriginalMember(owner = "client!JRELGTVY", name = "b", descriptor = "(Z)V")
    public static final void method267(boolean arg0) {
        field1037 = null;
        field1067 = null;
        if (arg0) {
            field1071 = -361;
        }
        field1060 = null;
        field1035 = null;
    }

    @OriginalMember(owner = "client!JRELGTVY", name = "a", descriptor = "(LXOJZVVDK;)V")
    public static final void method268(class60 arg0) {
        field1035 = new class41(888, arg0.method560("npc.dat", null));
        class41 var1 = new class41(888, arg0.method560("npc.idx", null));
        field1058 = var1.method342();
        field1067 = new int[field1058];
        int var2 = 2;
        for (int var3 = 0; var3 < field1058; var3++) {
            field1067[var3] = var2;
            var2 += var1.method342();
        }
        field1060 = new class29[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1060[var4] = new class29();
        }
    }

    @OriginalMember(owner = "client!JRELGTVY", name = "b", descriptor = "(I)LJRELGTVY;")
    public static final class29 method269(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1060[var1].field1049) {
                return field1060[var1];
            }
        }
        field1044 = (field1044 + 1) % 20;
        class29 var2 = field1060[field1044] = new class29();
        field1035.field1241 = field1067[arg0];
        var2.field1049 = arg0;
        var2.method264(field1035, false);
        return var2;
    }

    @OriginalMember(owner = "client!JRELGTVY", name = "a", descriptor = "([IIIB)LFLXAIVEA;")
    public final class16 method270(int[] arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -77) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (this.field1032 != null) {
            class29 var6 = this.method266(3);
            return var6 == null ? null : var6.method270(arg0, arg1, arg2, (byte) -77);
        }
        class16 var7 = (class16) field1037.method572(this.field1049);
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field1040.length; var9++) {
                if (!class16.method219(this.field1040[var9])) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class16[] var10 = new class16[this.field1040.length];
            for (int var11 = 0; var11 < this.field1040.length; var11++) {
                var10[var11] = class16.method218(this.field1040[var11]);
            }
            if (var10.length == 1) {
                var7 = var10[0];
            } else {
                var7 = new class16(var10.length, var10, this.field1047);
            }
            if (this.field1046 != null) {
                for (int var12 = 0; var12 < this.field1046.length; var12++) {
                    var7.method232(this.field1046[var12], this.field1063[var12]);
                }
            }
            var7.method225((byte) -116);
            var7.method235(this.field1062 + 64, this.field1065 + 850, -30, -50, -30, true);
            field1037.method573(false, var7, this.field1049);
        }
        class16 var13 = class16.field771;
        var13.method220(68, class37.method302(true, arg2) & class37.method302(true, arg1), var7);
        if (arg2 != -1 && arg1 != -1) {
            var13.method227(arg1, arg2, arg0, 955);
        } else if (arg2 != -1) {
            var13.method226((byte) 8, arg2);
        }
        if (this.field1051 != 128 || this.field1042 != 128) {
            var13.method234(this.field1051, this.field1051, (byte) 73, this.field1042);
        }
        var13.method222((byte) -42);
        var13.field807 = null;
        var13.field806 = null;
        if (this.field1054 == 1) {
            var13.field808 = true;
        }
        return var13;
    }

    @OriginalMember(owner = "client!JRELGTVY", name = "c", descriptor = "(I)LFLXAIVEA;")
    public final class16 method271(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        } else if (this.field1032 != null) {
            class29 var2 = this.method266(3);
            return var2 == null ? null : var2.method271(-727);
        } else if (this.field1070 == null) {
            return null;
        } else {
            boolean var3 = false;
            for (int var4 = 0; var4 < this.field1070.length; var4++) {
                if (!class16.method219(this.field1070[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class16[] var5 = new class16[this.field1070.length];
            for (int var6 = 0; var6 < this.field1070.length; var6++) {
                var5[var6] = class16.method218(this.field1070[var6]);
            }
            class16 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class16(var5.length, var5, this.field1047);
            }
            if (this.field1046 != null) {
                for (int var8 = 0; var8 < this.field1046.length; var8++) {
                    var7.method232(this.field1046[var8], this.field1063[var8]);
                }
            }
            return var7;
        }
    }
}
