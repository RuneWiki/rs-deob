import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NPWLDXJE")
public class class37 {

    @OriginalMember(owner = "NPWLDXJE", name = "e", descriptor = "J")
    public long field1122 = -1L;

    @OriginalMember(owner = "NPWLDXJE", name = "f", descriptor = "I")
    public int field1123 = -1;

    @OriginalMember(owner = "NPWLDXJE", name = "g", descriptor = "I")
    private int field1124 = 128;

    @OriginalMember(owner = "NPWLDXJE", name = "j", descriptor = "B")
    public byte field1127 = 1;

    @OriginalMember(owner = "NPWLDXJE", name = "k", descriptor = "Z")
    public boolean field1128 = true;

    @OriginalMember(owner = "NPWLDXJE", name = "m", descriptor = "I")
    public int field1130 = -1;

    @OriginalMember(owner = "NPWLDXJE", name = "n", descriptor = "I")
    public int field1131 = -1;

    @OriginalMember(owner = "NPWLDXJE", name = "o", descriptor = "Z")
    public boolean field1132 = true;

    @OriginalMember(owner = "NPWLDXJE", name = "q", descriptor = "I")
    private int field1134 = 128;

    @OriginalMember(owner = "NPWLDXJE", name = "r", descriptor = "B")
    private byte field1135 = 29;

    @OriginalMember(owner = "NPWLDXJE", name = "s", descriptor = "I")
    public int field1136 = -1;

    @OriginalMember(owner = "NPWLDXJE", name = "t", descriptor = "I")
    public int field1137 = -1;

    @OriginalMember(owner = "NPWLDXJE", name = "u", descriptor = "I")
    public int field1138 = -1;

    @OriginalMember(owner = "NPWLDXJE", name = "v", descriptor = "I")
    public int field1139 = -1;

    @OriginalMember(owner = "NPWLDXJE", name = "w", descriptor = "I")
    public int field1140 = 32;

    @OriginalMember(owner = "NPWLDXJE", name = "x", descriptor = "I")
    public int field1141 = -1;

    @OriginalMember(owner = "NPWLDXJE", name = "A", descriptor = "I")
    public int field1144 = -1;

    @OriginalMember(owner = "NPWLDXJE", name = "B", descriptor = "Z")
    public boolean field1145 = false;

    @OriginalMember(owner = "NPWLDXJE", name = "F", descriptor = "I")
    public int field1149 = -1;

    @OriginalMember(owner = "NPWLDXJE", name = "H", descriptor = "I")
    public int field1151 = -1;

    @OriginalMember(owner = "NPWLDXJE", name = "I", descriptor = "I")
    public int field1152 = -1;

    @OriginalMember(owner = "NPWLDXJE", name = "a", descriptor = "LDSMCVRKW;")
    public static class15 field1118 = new class15((byte) 7, 30);

    @OriginalMember(owner = "NPWLDXJE", name = "h", descriptor = "I")
    private int field1125;

    @OriginalMember(owner = "NPWLDXJE", name = "z", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "NPWLDXJE", name = "E", descriptor = "I")
    private static int field1148;

    @OriginalMember(owner = "NPWLDXJE", name = "J", descriptor = "I")
    private int field1153;

    @OriginalMember(owner = "NPWLDXJE", name = "C", descriptor = "LEILHLJCE;")
    private static class17 field1146;

    @OriginalMember(owner = "NPWLDXJE", name = "d", descriptor = "Lclient;")
    public static client field1121;

    @OriginalMember(owner = "NPWLDXJE", name = "y", descriptor = "Ljava/lang/String;")
    public String field1142;

    @OriginalMember(owner = "NPWLDXJE", name = "D", descriptor = "[B")
    public byte[] field1147;

    @OriginalMember(owner = "NPWLDXJE", name = "b", descriptor = "[I")
    public int[] field1119;

    @OriginalMember(owner = "NPWLDXJE", name = "c", descriptor = "[I")
    private int[] field1120;

    @OriginalMember(owner = "NPWLDXJE", name = "i", descriptor = "[I")
    private static int[] field1126;

    @OriginalMember(owner = "NPWLDXJE", name = "l", descriptor = "[I")
    private int[] field1129;

    @OriginalMember(owner = "NPWLDXJE", name = "K", descriptor = "[I")
    private int[] field1154;

    @OriginalMember(owner = "NPWLDXJE", name = "L", descriptor = "[I")
    private int[] field1155;

    @OriginalMember(owner = "NPWLDXJE", name = "G", descriptor = "[LNPWLDXJE;")
    private static class37[] field1150;

    @OriginalMember(owner = "NPWLDXJE", name = "p", descriptor = "[Ljava/lang/String;")
    public String[] field1133;

    @OriginalMember(owner = "NPWLDXJE", name = "a", descriptor = "(II[IZ)LKBEXSZSN;")
    public final class31 method388(int arg0, int arg1, int[] arg2, boolean arg3) {
        if (this.field1119 != null) {
            class37 var5 = this.method389((byte) 108);
            return var5 == null ? null : var5.method388(arg0, arg1, arg2, true);
        }
        class31 var6 = (class31) field1118.method197(this.field1122);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1154.length; var8++) {
                if (!class31.method340(this.field1154[var8])) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class31[] var9 = new class31[this.field1154.length];
            for (int var10 = 0; var10 < this.field1154.length; var10++) {
                var9[var10] = class31.method339(this.field1154[var10]);
            }
            if (var9.length == 1) {
                var6 = var9[0];
            } else {
                var6 = new class31(var9.length, var9, 5);
            }
            if (this.field1155 != null) {
                for (int var11 = 0; var11 < this.field1155.length; var11++) {
                    var6.method353(this.field1155[var11], this.field1120[var11]);
                }
            }
            var6.method346(311);
            var6.method356(this.field1125 + 64, this.field1153 + 850, -30, -50, -30, true);
            field1118.method198((byte) 7, this.field1122, var6);
        }
        class31 var12 = class31.field996;
        if (!arg3) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        var12.method341(true, var6, class25.method309(arg0, false) & class25.method309(arg1, false));
        if (arg0 != -1 && arg1 != -1) {
            var12.method348(18849, arg2, arg1, arg0);
        } else if (arg0 != -1) {
            var12.method347(-486, arg0);
        }
        if (this.field1124 != 128 || this.field1134 != 128) {
            var12.method355(this.field1135, this.field1124, this.field1134, this.field1124);
        }
        var12.method343(0);
        var12.field1032 = null;
        var12.field1031 = null;
        if (this.field1127 == 1) {
            var12.field1033 = true;
        }
        return var12;
    }

    @OriginalMember(owner = "NPWLDXJE", name = "a", descriptor = "(B)LNPWLDXJE;")
    public final class37 method389(byte arg0) {
        int var2 = -1;
        if (arg0 != 108) {
            throw new NullPointerException();
        }
        if (this.field1131 != -1) {
            class51 var3 = class51.field1328[this.field1131];
            int var4 = var3.field1330;
            int var5 = var3.field1331;
            int var6 = var3.field1332;
            int var7 = client.field528[var6 - var5];
            var2 = field1121.field643[var4] >> var5 & var7;
        } else if (this.field1152 != -1) {
            var2 = field1121.field643[this.field1152];
        }
        return var2 < 0 || var2 >= this.field1119.length || this.field1119[var2] == -1 ? null : method393(this.field1119[var2]);
    }

    @OriginalMember(owner = "NPWLDXJE", name = "a", descriptor = "(Z)LKBEXSZSN;")
    public final class31 method390(boolean arg0) {
        if (this.field1119 != null) {
            class37 var2 = this.method389((byte) 108);
            return var2 == null ? null : var2.method390(false);
        } else if (this.field1129 == null) {
            return null;
        } else {
            boolean var3 = false;
            if (arg0) {
                throw new NullPointerException();
            }
            for (int var4 = 0; var4 < this.field1129.length; var4++) {
                if (!class31.method340(this.field1129[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class31[] var5 = new class31[this.field1129.length];
            for (int var6 = 0; var6 < this.field1129.length; var6++) {
                var5[var6] = class31.method339(this.field1129[var6]);
            }
            class31 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class31(var5.length, var5, 5);
            }
            if (this.field1155 != null) {
                for (int var8 = 0; var8 < this.field1155.length; var8++) {
                    var7.method353(this.field1155[var8], this.field1120[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "NPWLDXJE", name = "a", descriptor = "(LBBMKAXRK;)V")
    public static final void method391(class6 arg0) {
        field1146 = new class17(arg0.method30("npc.dat", null), -26583);
        class17 var1 = new class17(arg0.method30("npc.idx", null), -26583);
        field1143 = var1.method226();
        field1126 = new int[field1143];
        int var2 = 2;
        for (int var3 = 0; var3 < field1143; var3++) {
            field1126[var3] = var2;
            var2 += var1.method226();
        }
        field1150 = new class37[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1150[var4] = new class37();
        }
    }

    @OriginalMember(owner = "NPWLDXJE", name = "a", descriptor = "(I)Z")
    public boolean method392(int arg0) {
        if (this.field1119 == null) {
            return true;
        }
        int var2 = -1;
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field1131 != -1) {
            class51 var4 = class51.field1328[this.field1131];
            int var5 = var4.field1330;
            int var6 = var4.field1331;
            int var7 = var4.field1332;
            int var8 = client.field528[var7 - var6];
            var2 = field1121.field643[var5] >> var6 & var8;
        } else if (this.field1152 != -1) {
            var2 = field1121.field643[this.field1152];
        }
        return var2 >= 0 && var2 < this.field1119.length && this.field1119[var2] != -1;
    }

    @OriginalMember(owner = "NPWLDXJE", name = "b", descriptor = "(I)LNPWLDXJE;")
    public static final class37 method393(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1150[var1].field1122) {
                return field1150[var1];
            }
        }
        field1148 = (field1148 + 1) % 20;
        class37 var2 = field1150[field1148] = new class37();
        field1146.field779 = field1126[arg0];
        var2.field1122 = arg0;
        var2.method395(field1146, (byte) -50);
        return var2;
    }

    @OriginalMember(owner = "NPWLDXJE", name = "c", descriptor = "(I)V")
    public static final void method394(int arg0) {
        field1118 = null;
        field1126 = null;
        field1150 = null;
        if (arg0 == 0) {
            field1146 = null;
        }
    }

    @OriginalMember(owner = "NPWLDXJE", name = "a", descriptor = "(LEILHLJCE;B)V")
    private final void method395(class17 arg0, byte arg1) {
        if (arg1 != -50) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method224();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg0.method224();
                    this.field1154 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1154[var5] = arg0.method226();
                    }
                } else if (var3 == 2) {
                    this.field1142 = arg0.method231();
                } else if (var3 == 3) {
                    this.field1147 = arg0.method232(-40217);
                } else if (var3 == 12) {
                    this.field1127 = arg0.method225();
                } else if (var3 == 13) {
                    this.field1141 = arg0.method226();
                } else if (var3 == 14) {
                    this.field1151 = arg0.method226();
                } else if (var3 == 17) {
                    this.field1151 = arg0.method226();
                    this.field1136 = arg0.method226();
                    this.field1123 = arg0.method226();
                    this.field1149 = arg0.method226();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field1133 == null) {
                        this.field1133 = new String[5];
                    }
                    this.field1133[var3 - 30] = arg0.method231();
                    if (this.field1133[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1133[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg0.method224();
                    this.field1155 = new int[var6];
                    this.field1120 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1155[var7] = arg0.method226();
                        this.field1120[var7] = arg0.method226();
                    }
                } else if (var3 == 60) {
                    int var8 = arg0.method224();
                    this.field1129 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field1129[var9] = arg0.method226();
                    }
                } else if (var3 == 90) {
                    this.field1130 = arg0.method226();
                } else if (var3 == 91) {
                    this.field1144 = arg0.method226();
                } else if (var3 == 92) {
                    this.field1139 = arg0.method226();
                } else if (var3 == 93) {
                    this.field1132 = false;
                } else if (var3 == 95) {
                    this.field1137 = arg0.method226();
                } else if (var3 == 97) {
                    this.field1124 = arg0.method226();
                } else if (var3 == 98) {
                    this.field1134 = arg0.method226();
                } else if (var3 == 99) {
                    this.field1145 = true;
                } else if (var3 == 100) {
                    this.field1125 = arg0.method225();
                } else if (var3 == 101) {
                    this.field1153 = arg0.method225() * 5;
                } else if (var3 == 102) {
                    this.field1138 = arg0.method226();
                } else if (var3 == 103) {
                    this.field1140 = arg0.method226();
                } else if (var3 == 106) {
                    this.field1131 = arg0.method226();
                    if (this.field1131 == 65535) {
                        this.field1131 = -1;
                    }
                    this.field1152 = arg0.method226();
                    if (this.field1152 == 65535) {
                        this.field1152 = -1;
                    }
                    int var10 = arg0.method224();
                    this.field1119 = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.field1119[var11] = arg0.method226();
                        if (this.field1119[var11] == 65535) {
                            this.field1119[var11] = -1;
                        }
                    }
                } else if (var3 == 107) {
                    this.field1128 = false;
                }
            }
        }
    }
}
