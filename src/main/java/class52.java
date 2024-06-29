import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class52 extends class191 {

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "I")
    public int field1162 = -1;

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "I")
    public int field1163 = 2;

    @OriginalMember(owner = "client!fa", name = "bb", descriptor = "I")
    public int field1180 = 5;

    @OriginalMember(owner = "client!fa", name = "gb", descriptor = "I")
    public int field1185 = -1;

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "I")
    public int field1171 = 99;

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "Z")
    public boolean field1170 = false;

    @OriginalMember(owner = "client!fa", name = "eb", descriptor = "I")
    public int field1183 = -1;

    @OriginalMember(owner = "client!fa", name = "ab", descriptor = "I")
    public int field1179 = -1;

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "I")
    public int field1167 = -1;

    @OriginalMember(owner = "client!fa", name = "U", descriptor = "[[I")
    public static int[][] field1173 = new int[104][104];

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "Z")
    public static boolean field1166 = false;

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "Ldd;")
    public static class35 field1172 = class180.method1196((byte) -62, "0(U");

    @OriginalMember(owner = "client!fa", name = "db", descriptor = "Ldd;")
    private static class35 field1182 = class180.method1196((byte) -50, "Examine");

    @OriginalMember(owner = "client!fa", name = "V", descriptor = "Ldd;")
    public static class35 field1174 = class180.method1196((byte) 127, "sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "Ldd;")
    public static class35 field1164 = class180.method1196((byte) -112, "mapdots");

    @OriginalMember(owner = "client!fa", name = "cb", descriptor = "Ldd;")
    public static class35 field1181 = field1182;

    @OriginalMember(owner = "client!fa", name = "kb", descriptor = "Ldd;")
    private static class35 field1189 = class180.method1196((byte) -74, "You have only just left another world)3");

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "Ldd;")
    public static class35 field1168 = field1189;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
    public static int field1158 = 0;

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!fa", name = "W", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!fa", name = "X", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!fa", name = "Y", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!fa", name = "ib", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!fa", name = "lb", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!fa", name = "ob", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!fa", name = "hb", descriptor = "Lfd;")
    public static class55 field1186;

    @OriginalMember(owner = "client!fa", name = "pb", descriptor = "Z")
    public static boolean field1194;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "[I")
    public int[] field1159;

    @OriginalMember(owner = "client!fa", name = "Z", descriptor = "[I")
    private int[] field1178;

    @OriginalMember(owner = "client!fa", name = "fb", descriptor = "[I")
    public int[] field1184;

    @OriginalMember(owner = "client!fa", name = "jb", descriptor = "[I")
    private int[] field1188;

    @OriginalMember(owner = "client!fa", name = "mb", descriptor = "[I")
    public int[] field1191;

    @OriginalMember(owner = "client!fa", name = "nb", descriptor = "[Z")
    public static boolean[] field1192;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BI)Ldd;")
    public static final class35 method458(byte arg0, int arg1) {
        if (arg0 > -87) {
            method464(24);
        }
        field1165++;
        return class63.method529(new class35[] { class3.method19(arg1 >> 24 & 0xFF, -29578), class165.field3329, class3.method19(arg1 >> 16 & 0xFF, -29578), class165.field3329, class3.method19(arg1 >> 8 & 0xFF, -29578), class165.field3329, class3.method19(arg1 & 0xFF, -29578) }, (byte) 122);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lia;III)Lia;")
    public final class81 method459(class81 arg0, int arg1, int arg2, int arg3) {
        field1175++;
        int var5 = this.field1184[arg1];
        class51 var6 = class68.method550(var5 >> 16, (byte) 27);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg0.method615(true);
        }
        class81 var8 = arg0.method615(!var6.method457(-4, var7));
        if (arg3 != -3148) {
            this.method460(-56, null, 87);
        }
        int var9 = arg2 & 0x3;
        if (var9 == 1) {
            var8.method620();
        } else if (var9 == 2) {
            var8.method605();
        } else if (var9 == 3) {
            var8.method612();
        }
        var8.method614(var6, var7);
        if (var9 == 1) {
            var8.method612();
        } else if (var9 == 2) {
            var8.method605();
        } else if (var9 == 3) {
            var8.method620();
        }
        return var8;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILia;I)Lia;")
    public final class81 method460(int arg0, class81 arg1, int arg2) {
        field1187++;
        int var4 = this.field1184[arg0];
        class51 var5 = class68.method550(var4 >> 16, (byte) 27);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method615(true);
        } else {
            class81 var7 = arg1.method615(!var5.method457(-4, var6));
            var7.method614(var5, var6);
            return arg2 < 94 ? null : var7;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILce;)V")
    public final void method461(int arg0, class26 arg1) {
        if (arg0 != -8629) {
            return;
        }
        field1176++;
        while (true) {
            int var3 = arg1.method221(-91);
            if (var3 == 0) {
                return;
            }
            this.method465(var3, arg1, -126);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IILia;)Lia;")
    public final class81 method462(int arg0, int arg1, class81 arg2) {
        if (arg0 != -2) {
            return null;
        }
        field1190++;
        int var4 = this.field1184[arg1];
        class51 var5 = class68.method550(var4 >> 16, (byte) 27);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method615(true);
        }
        class51 var7 = null;
        int var8 = 0;
        if (this.field1188 != null && arg1 < this.field1188.length) {
            int var9 = this.field1188[arg1];
            var7 = class68.method550(var9 >> 16, (byte) 27);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class81 var11 = arg2.method615(!var5.method457(arg0 ^ 0x2, var6));
            var11.method614(var5, var6);
            return var11;
        } else {
            class81 var10 = arg2.method615(!var5.method457(-4, var6) & !var7.method457(arg0 ^ 0x2, var8));
            var10.method614(var5, var6);
            var10.method614(var7, var8);
            return var10;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILia;IILfa;)Lia;")
    public final class81 method463(int arg0, class81 arg1, int arg2, int arg3, class52 arg4) {
        int var6 = this.field1184[arg3];
        field1161++;
        class51 var7 = class68.method550(var6 >> 16, (byte) 27);
        if (arg2 < 94) {
            field1174 = null;
        }
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg4.method460(arg0, arg1, 116);
        }
        int var9 = arg4.field1184[arg0];
        class51 var10 = class68.method550(var9 >> 16, (byte) 27);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class81 var12 = arg1.method615(!var7.method457(-4, var8));
            var12.method614(var7, var8);
            return var12;
        } else {
            class81 var13 = arg1.method615(!var7.method457(-4, var8) & !var10.method457(-4, var11));
            var13.method616(var7, var8, var10, var11, this.field1178);
            return var13;
        }
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V")
    public static void method464(int arg0) {
        field1181 = null;
        field1173 = null;
        field1192 = null;
        field1172 = null;
        field1164 = null;
        field1189 = null;
        field1186 = null;
        if (arg0 != 65535) {
            field1189 = null;
        }
        field1168 = null;
        field1174 = null;
        field1182 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILce;I)V")
    private final void method465(int arg0, class26 arg1, int arg2) {
        field1160++;
        if (arg0 == 1) {
            int var11 = arg1.method256((byte) -78);
            this.field1159 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1159[var12] = arg1.method256((byte) -78);
            }
            this.field1184 = new int[var11];
            for (int var13 = 0; var13 < var11; var13++) {
                this.field1184[var13] = arg1.method256((byte) -78);
            }
            for (int var14 = 0; var14 < var11; var14++) {
                this.field1184[var14] += arg1.method256((byte) -78) << 16;
            }
        } else if (arg0 == 2) {
            this.field1185 = arg1.method256((byte) -78);
        } else if (arg0 == 3) {
            int var9 = arg1.method221(-93);
            this.field1178 = new int[var9 + 1];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1178[var10] = arg1.method221(-116);
            }
            this.field1178[var9] = 9999999;
        } else if (arg0 == 4) {
            this.field1170 = true;
        } else if (arg0 == 5) {
            this.field1180 = arg1.method221(-78);
        } else if (arg0 == 6) {
            this.field1162 = arg1.method256((byte) -78);
        } else if (arg0 == 7) {
            this.field1167 = arg1.method256((byte) -78);
        } else if (arg0 == 8) {
            this.field1171 = arg1.method221(-116);
        } else if (arg0 == 9) {
            this.field1179 = arg1.method221(-84);
        } else if (arg0 == 10) {
            this.field1183 = arg1.method221(-78);
        } else if (arg0 == 11) {
            this.field1163 = arg1.method221(-124);
        } else if (arg0 == 12) {
            int var4 = arg1.method221(-87);
            this.field1188 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1188[var5] = arg1.method256((byte) -78);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                this.field1188[var6] += arg1.method256((byte) -78) << 16;
            }
        } else if (arg0 == 13) {
            int var7 = arg1.method221(-126);
            this.field1191 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1191[var8] = arg1.method232(69);
            }
        }
        int var15 = 13 % ((-arg2 - 72) / 44);
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(ILia;I)Lia;")
    public final class81 method466(int arg0, class81 arg1, int arg2) {
        int var4 = this.field1184[arg0];
        field1193++;
        class51 var5 = class68.method550(var4 >> 16, (byte) 27);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method607(true);
        } else {
            class81 var7 = arg1.method607(!var5.method457(-4, var6));
            int var8 = 83 / ((-arg2 - 74) / 34);
            var7.method614(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(B)V")
    public final void method467(byte arg0) {
        field1169++;
        if (this.field1179 == -1) {
            if (this.field1178 == null) {
                this.field1179 = 0;
            } else {
                this.field1179 = 2;
            }
        }
        if (arg0 >= -10) {
            method464(84);
        }
        if (this.field1183 != -1) {
            return;
        }
        if (this.field1178 == null) {
            this.field1183 = 0;
        } else {
            this.field1183 = 2;
        }
    }
}
