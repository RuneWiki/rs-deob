import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NHTDEVDA")
public class class37 {

    @OriginalMember(owner = "NHTDEVDA", name = "a", descriptor = "I")
    public int field1068 = -1;

    @OriginalMember(owner = "NHTDEVDA", name = "b", descriptor = "I")
    private int field1069 = 128;

    @OriginalMember(owner = "NHTDEVDA", name = "c", descriptor = "J")
    public long field1070 = -1L;

    @OriginalMember(owner = "NHTDEVDA", name = "d", descriptor = "Z")
    public boolean field1071 = true;

    @OriginalMember(owner = "NHTDEVDA", name = "g", descriptor = "I")
    public int field1074 = -1;

    @OriginalMember(owner = "NHTDEVDA", name = "h", descriptor = "I")
    public int field1075 = -1;

    @OriginalMember(owner = "NHTDEVDA", name = "i", descriptor = "Z")
    public boolean field1076 = false;

    @OriginalMember(owner = "NHTDEVDA", name = "l", descriptor = "I")
    public int field1079 = 32;

    @OriginalMember(owner = "NHTDEVDA", name = "m", descriptor = "I")
    public int field1080 = -1;

    @OriginalMember(owner = "NHTDEVDA", name = "p", descriptor = "I")
    private int field1083 = 489;

    @OriginalMember(owner = "NHTDEVDA", name = "r", descriptor = "I")
    public int field1085 = -1;

    @OriginalMember(owner = "NHTDEVDA", name = "v", descriptor = "B")
    private byte field1089 = -44;

    @OriginalMember(owner = "NHTDEVDA", name = "w", descriptor = "B")
    public byte field1090 = 1;

    @OriginalMember(owner = "NHTDEVDA", name = "x", descriptor = "I")
    public int field1091 = -1;

    @OriginalMember(owner = "NHTDEVDA", name = "A", descriptor = "I")
    public int field1094 = -1;

    @OriginalMember(owner = "NHTDEVDA", name = "B", descriptor = "Z")
    public boolean field1095 = true;

    @OriginalMember(owner = "NHTDEVDA", name = "E", descriptor = "Z")
    private boolean field1098 = true;

    @OriginalMember(owner = "NHTDEVDA", name = "F", descriptor = "I")
    public int field1099 = -1;

    @OriginalMember(owner = "NHTDEVDA", name = "G", descriptor = "I")
    public int field1100 = -1;

    @OriginalMember(owner = "NHTDEVDA", name = "I", descriptor = "I")
    public int field1102 = -1;

    @OriginalMember(owner = "NHTDEVDA", name = "M", descriptor = "I")
    public int field1106 = -1;

    @OriginalMember(owner = "NHTDEVDA", name = "N", descriptor = "I")
    private int field1107 = 128;

    @OriginalMember(owner = "NHTDEVDA", name = "O", descriptor = "I")
    public int field1108 = -1;

    @OriginalMember(owner = "NHTDEVDA", name = "H", descriptor = "LJLTMYUOM;")
    public static class24 field1101 = new class24(true, 30);

    @OriginalMember(owner = "NHTDEVDA", name = "L", descriptor = "B")
    private static byte field1105 = -27;

    @OriginalMember(owner = "NHTDEVDA", name = "k", descriptor = "I")
    private static int field1078;

    @OriginalMember(owner = "NHTDEVDA", name = "s", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "NHTDEVDA", name = "t", descriptor = "I")
    private int field1087;

    @OriginalMember(owner = "NHTDEVDA", name = "z", descriptor = "I")
    private int field1093;

    @OriginalMember(owner = "NHTDEVDA", name = "J", descriptor = "I")
    private int field1103;

    @OriginalMember(owner = "NHTDEVDA", name = "K", descriptor = "LXJCNBMKS;")
    private static class68 field1104;

    @OriginalMember(owner = "NHTDEVDA", name = "n", descriptor = "Lclient;")
    public static client field1081;

    @OriginalMember(owner = "NHTDEVDA", name = "P", descriptor = "Ljava/lang/String;")
    public String field1109;

    @OriginalMember(owner = "NHTDEVDA", name = "f", descriptor = "[B")
    public byte[] field1073;

    @OriginalMember(owner = "NHTDEVDA", name = "e", descriptor = "[I")
    private int[] field1072;

    @OriginalMember(owner = "NHTDEVDA", name = "j", descriptor = "[I")
    private static int[] field1077;

    @OriginalMember(owner = "NHTDEVDA", name = "o", descriptor = "[I")
    public int[] field1082;

    @OriginalMember(owner = "NHTDEVDA", name = "q", descriptor = "[I")
    private int[] field1084;

    @OriginalMember(owner = "NHTDEVDA", name = "u", descriptor = "[I")
    private int[] field1088;

    @OriginalMember(owner = "NHTDEVDA", name = "C", descriptor = "[I")
    private int[] field1096;

    @OriginalMember(owner = "NHTDEVDA", name = "y", descriptor = "[LNHTDEVDA;")
    private static class37[] field1092;

    @OriginalMember(owner = "NHTDEVDA", name = "D", descriptor = "[Ljava/lang/String;")
    public String[] field1097;

    @OriginalMember(owner = "NHTDEVDA", name = "a", descriptor = "(BLXJCNBMKS;)V")
    private final void method362(byte arg0, class68 arg1) {
        if (field1105 != arg0) {
            this.field1098 = !this.field1098;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method534();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg1.method534();
                    this.field1096 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1096[var5] = arg1.method536();
                    }
                } else if (var3 == 2) {
                    this.field1109 = arg1.method541();
                } else if (var3 == 3) {
                    this.field1073 = arg1.method542((byte) 3);
                } else if (var3 == 12) {
                    this.field1090 = arg1.method535();
                } else if (var3 == 13) {
                    this.field1091 = arg1.method536();
                } else if (var3 == 14) {
                    this.field1075 = arg1.method536();
                } else if (var3 == 17) {
                    this.field1075 = arg1.method536();
                    this.field1080 = arg1.method536();
                    this.field1074 = arg1.method536();
                    this.field1099 = arg1.method536();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field1097 == null) {
                        this.field1097 = new String[5];
                    }
                    this.field1097[var3 - 30] = arg1.method541();
                    if (this.field1097[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1097[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg1.method534();
                    this.field1088 = new int[var6];
                    this.field1084 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1088[var7] = arg1.method536();
                        this.field1084[var7] = arg1.method536();
                    }
                } else if (var3 == 60) {
                    int var8 = arg1.method534();
                    this.field1072 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field1072[var9] = arg1.method536();
                    }
                } else if (var3 == 90) {
                    this.field1085 = arg1.method536();
                } else if (var3 == 91) {
                    this.field1094 = arg1.method536();
                } else if (var3 == 92) {
                    this.field1102 = arg1.method536();
                } else if (var3 == 93) {
                    this.field1071 = false;
                } else if (var3 == 95) {
                    this.field1068 = arg1.method536();
                } else if (var3 == 97) {
                    this.field1107 = arg1.method536();
                } else if (var3 == 98) {
                    this.field1069 = arg1.method536();
                } else if (var3 == 99) {
                    this.field1076 = true;
                } else if (var3 == 100) {
                    this.field1103 = arg1.method535();
                } else if (var3 == 101) {
                    this.field1093 = arg1.method535() * 5;
                } else if (var3 == 102) {
                    this.field1106 = arg1.method536();
                } else if (var3 == 103) {
                    this.field1079 = arg1.method536();
                } else if (var3 == 106) {
                    this.field1100 = arg1.method536();
                    if (this.field1100 == 65535) {
                        this.field1100 = -1;
                    }
                    this.field1108 = arg1.method536();
                    if (this.field1108 == 65535) {
                        this.field1108 = -1;
                    }
                    int var10 = arg1.method534();
                    this.field1082 = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.field1082[var11] = arg1.method536();
                        if (this.field1082[var11] == 65535) {
                            this.field1082[var11] = -1;
                        }
                    }
                } else if (var3 == 107) {
                    this.field1095 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "NHTDEVDA", name = "a", descriptor = "(I)V")
    public static final void method363(int arg0) {
        field1101 = null;
        field1077 = null;
        field1092 = null;
        field1104 = null;
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "NHTDEVDA", name = "b", descriptor = "(I)LNHTDEVDA;")
    public final class37 method364(int arg0) {
        if (arg0 >= 0) {
            this.field1098 = !this.field1098;
        }
        int var2 = -1;
        if (this.field1100 != -1) {
            class67 var3 = class67.field1619[this.field1100];
            int var4 = var3.field1621;
            int var5 = var3.field1622;
            int var6 = var3.field1623;
            int var7 = client.field257[var6 - var5];
            var2 = field1081.field584[var4] >> var5 & var7;
        } else if (this.field1108 != -1) {
            var2 = field1081.field584[this.field1108];
        }
        return var2 < 0 || var2 >= this.field1082.length || this.field1082[var2] == -1 ? null : method368(this.field1082[var2]);
    }

    @OriginalMember(owner = "NHTDEVDA", name = "a", descriptor = "(LQKFGLETG;)V")
    public static final void method365(class50 arg0) {
        field1104 = new class68((byte) 9, arg0.method402("npc.dat", null));
        class68 var1 = new class68((byte) 9, arg0.method402("npc.idx", null));
        field1086 = var1.method536();
        field1077 = new int[field1086];
        int var2 = 2;
        for (int var3 = 0; var3 < field1086; var3++) {
            field1077[var3] = var2;
            var2 += var1.method536();
        }
        field1092 = new class37[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1092[var4] = new class37();
        }
    }

    @OriginalMember(owner = "NHTDEVDA", name = "a", descriptor = "(B)LFUTAQMCE;")
    public final class19 method366(byte arg0) {
        if (this.field1082 != null) {
            class37 var2 = this.method364(-670);
            return var2 == null ? null : var2.method366((byte) -44);
        } else if (this.field1072 == null) {
            return null;
        } else {
            boolean var3 = false;
            if (this.field1089 != arg0) {
                throw new NullPointerException();
            }
            for (int var4 = 0; var4 < this.field1072.length; var4++) {
                if (!class19.method251(this.field1072[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class19[] var5 = new class19[this.field1072.length];
            for (int var6 = 0; var6 < this.field1072.length; var6++) {
                var5[var6] = class19.method250(true, this.field1072[var6]);
            }
            class19 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class19(var5.length, 221, var5);
            }
            if (this.field1088 != null) {
                for (int var8 = 0; var8 < this.field1088.length; var8++) {
                    var7.method264(this.field1088[var8], this.field1084[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "NHTDEVDA", name = "a", descriptor = "([IIII)LFUTAQMCE;")
    public final class19 method367(int[] arg0, int arg1, int arg2, int arg3) {
        if (this.field1082 != null) {
            class37 var5 = this.method364(-670);
            return var5 == null ? null : var5.method367(arg0, arg1, arg2, 4);
        }
        class19 var6 = (class19) field1101.method297(this.field1070);
        if (arg3 != 4) {
            this.field1083 = 386;
        }
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1096.length; var8++) {
                if (!class19.method251(this.field1096[var8])) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class19[] var9 = new class19[this.field1096.length];
            for (int var10 = 0; var10 < this.field1096.length; var10++) {
                var9[var10] = class19.method250(true, this.field1096[var10]);
            }
            if (var9.length == 1) {
                var6 = var9[0];
            } else {
                var6 = new class19(var9.length, 221, var9);
            }
            if (this.field1088 != null) {
                for (int var11 = 0; var11 < this.field1088.length; var11++) {
                    var6.method264(this.field1088[var11], this.field1084[var11]);
                }
            }
            var6.method257(284);
            var6.method267(this.field1103 + 64, this.field1093 + 850, -30, -50, -30, true);
            field1101.method298(-561, this.field1070, var6);
        }
        class19 var12 = class19.field728;
        var12.method252(class55.method428(4, arg2) & class55.method428(4, arg1), this.field1087, var6);
        if (arg2 != -1 && arg1 != -1) {
            var12.method259(arg0, arg2, (byte) 116, arg1);
        } else if (arg2 != -1) {
            var12.method258(arg2, 4);
        }
        if (this.field1107 != 128 || this.field1069 != 128) {
            var12.method266(this.field1107, this.field1069, this.field1107, -9317);
        }
        var12.method254(238);
        var12.field765 = null;
        var12.field764 = null;
        if (this.field1090 == 1) {
            var12.field766 = true;
        }
        return var12;
    }

    @OriginalMember(owner = "NHTDEVDA", name = "c", descriptor = "(I)LNHTDEVDA;")
    public static final class37 method368(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1092[var1].field1070) {
                return field1092[var1];
            }
        }
        field1078 = (field1078 + 1) % 20;
        class37 var2 = field1092[field1078] = new class37();
        field1104.field1643 = field1077[arg0];
        var2.field1070 = arg0;
        var2.method362(field1105, field1104);
        return var2;
    }
}
