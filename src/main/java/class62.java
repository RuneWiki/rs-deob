import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class62 {

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "S")
    public short field1148 = 0;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public int field1138 = 1;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    private int field1139 = 0;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
    public int field1159 = -1;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "Z")
    private boolean field1155 = true;

    @OriginalMember(owner = "client!ha", name = "S", descriptor = "S")
    public short field1177 = 0;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    private int field1151 = -1;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public int field1140 = -1;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public int field1147 = -1;

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "I")
    public int field1172 = -1;

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "I")
    public int field1174 = 32;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
    public int field1166 = -1;

    @OriginalMember(owner = "client!ha", name = "R", descriptor = "S")
    public short field1176 = 0;

    @OriginalMember(owner = "client!ha", name = "V", descriptor = "Lij;")
    public class50 field1180 = class176.field2947;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "Z")
    public boolean field1153 = false;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "[Lij;")
    public class50[] field1137 = new class50[5];

    @OriginalMember(owner = "client!ha", name = "ab", descriptor = "Z")
    public boolean field1185 = true;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    private int field1149 = 128;

    @OriginalMember(owner = "client!ha", name = "db", descriptor = "S")
    public short field1188 = 0;

    @OriginalMember(owner = "client!ha", name = "gb", descriptor = "I")
    public int field1191 = -1;

    @OriginalMember(owner = "client!ha", name = "cb", descriptor = "I")
    public int field1187 = -1;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
    private int field1157 = 128;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public int field1133 = -1;

    @OriginalMember(owner = "client!ha", name = "O", descriptor = "Z")
    public boolean field1173 = true;

    @OriginalMember(owner = "client!ha", name = "bb", descriptor = "B")
    public byte field1186 = -96;

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "I")
    public int field1171 = -1;

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
    public int field1156 = 0;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "B")
    public byte field1141 = -16;

    @OriginalMember(owner = "client!ha", name = "jb", descriptor = "I")
    private int field1194 = 0;

    @OriginalMember(owner = "client!ha", name = "kb", descriptor = "I")
    private int field1195 = -1;

    @OriginalMember(owner = "client!ha", name = "lb", descriptor = "Z")
    public boolean field1196 = true;

    @OriginalMember(owner = "client!ha", name = "ib", descriptor = "I")
    public int field1193 = -1;

    @OriginalMember(owner = "client!ha", name = "hb", descriptor = "I")
    public int field1192 = -1;

    @OriginalMember(owner = "client!ha", name = "nb", descriptor = "B")
    public byte field1198 = 0;

    @OriginalMember(owner = "client!ha", name = "mb", descriptor = "I")
    public int field1197 = -1;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "[[I")
    public static int[][] field1152 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "Lij;")
    public static class50 field1168 = class78.method578(121, "null");

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "Lij;")
    public static class50 field1175 = class78.method578(124, ":duelfriend:");

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "I")
    public static int field1162 = 0;

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1167 = new BigInteger("111425062890301051365206642964372080941130087045221691750738418203817739415579");

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public int field1142;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!ha", name = "W", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!ha", name = "Z", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!ha", name = "fb", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!ha", name = "ob", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "Lkj;")
    private class56 field1146;

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "[B")
    private byte[] field1169;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "[I")
    private int[] field1145;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "[I")
    private int[] field1158;

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "[I")
    public int[] field1160;

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "[S")
    private short[] field1163;

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "[S")
    private short[] field1164;

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "[S")
    private short[] field1178;

    @OriginalMember(owner = "client!ha", name = "eb", descriptor = "[S")
    private short[] field1189;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "[[I")
    private int[][] field1154;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILwd;)V")
    public final void method473(int arg0, class217 arg1) {
        if (arg0 > -119) {
            method475(49, 98, 72);
        }
        field1135++;
        while (true) {
            int var3 = arg1.method1487(255);
            if (var3 == 0) {
                return;
            }
            this.method485(arg1, var3, true);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIILce;I)V")
    public static final void method474(int arg0, int arg1, int arg2, class10 arg3, int arg4) {
        field1182++;
        if (arg0 != 22906) {
            method475(-115, 70, 100);
        }
        class244.method1665(0);
        class158.method1105(arg2, arg1, arg3.field243 + arg2, arg1 - -arg3.field242);
        if (class34.field668 == 2 || class34.field668 == 5 || class228.field3831 == null) {
            class158.method1115(arg2, arg1, 0, arg3.field158, arg3.field286);
        } else {
            int var5 = class45.field832 + class160.field2758 & 0x7FF;
            int var6 = class239.field4067.field3990 / 32 + 48;
            int var7 = 464 - (class239.field4067.field4027 / 32);
            ((class169) class228.field3831).method1171(arg2, arg1, arg3.field243, arg3.field242, var6, var7, var5, class252.field4381 + 256, arg3.field158, arg3.field286);
            for (int var8 = 0; var8 < class250.field4345; var8++) {
                int var41 = class39.field721[var8] * 4 + 2 - (class239.field4067.field3990 / 32);
                int var42 = class256.field4431[var8] * 4 + 2 - class239.field4067.field4027 / 32;
                class243 var43 = class53.method426((byte) -90, class89.field1704[var8]);
                if (var43.field4197 != null) {
                    var43 = var43.method1645(87);
                    if (var43 == null || var43.field4179 == -1) {
                        continue;
                    }
                }
                client.method615(arg1, var41, class190.field3150[var43.field4179], var42, arg2, arg3, arg0 ^ 0x5E85);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var37 = 0; var37 < 104; var37++) {
                    class86 var38 = class184.field3022[class201.field3312][var9][var37];
                    if (var38 != null) {
                        int var39 = var9 * 4 + 2 - (class239.field4067.field3990 / 32);
                        int var40 = var37 * 4 + 2 - (class239.field4067.field4027 / 32);
                        client.method615(arg1, var39, class14.field330[0], var40, arg2, arg3, 2047);
                    }
                }
            }
            for (int var10 = 0; var10 < class6.field77; var10++) {
                class53 var33 = class41.field764[class153.field2678[var10]];
                if (var33 != null && var33.method428((byte) 20)) {
                    class62 var34 = var33.field959;
                    if (var34 != null && var34.field1160 != null) {
                        var34 = var34.method486((byte) -106);
                    }
                    if (var34 != null && var34.field1155 && var34.field1185) {
                        int var35 = var33.field3990 / 32 - (class239.field4067.field3990 / 32);
                        int var36 = var33.field4027 / 32 - class239.field4067.field4027 / 32;
                        client.method615(arg1, var35, class14.field330[1], var36, arg2, arg3, 2047);
                    }
                }
            }
            for (int var11 = 0; var11 < class78.field1450; var11++) {
                class187 var25 = class71.field1370[class60.field1116[var11]];
                if (var25 != null && var25.method428((byte) 20)) {
                    int var26 = var25.field3990 / 32 - (class239.field4067.field3990 / 32);
                    int var27 = var25.field4027 / 32 - class239.field4067.field4027 / 32;
                    boolean var28 = false;
                    long var29 = var25.field3097.method368((byte) -103);
                    for (int var31 = 0; var31 < class227.field3830; var31++) {
                        if (class59.field1070[var31] == var29 && class141.field2477[var31] != 0) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var32 = false;
                    if (class239.field4067.field3070 != 0 && var25.field3070 != 0 && class239.field4067.field3070 == var25.field3070) {
                        var32 = true;
                    }
                    if (var28) {
                        client.method615(arg1, var26, class14.field330[3], var27, arg2, arg3, 2047);
                    } else if (var32) {
                        client.method615(arg1, var26, class14.field330[4], var27, arg2, arg3, 2047);
                    } else {
                        client.method615(arg1, var26, class14.field330[2], var27, arg2, arg3, 2047);
                    }
                }
            }
            class141[] var12 = class36.field707;
            for (int var13 = 0; var13 < var12.length; var13++) {
                class141 var16 = var12[var13];
                if (var16 != null && var16.field2474 != 0 && class244.field4245 % 20 < 10) {
                    if (var16.field2474 == 1 && var16.field2471 >= 0 && var16.field2471 < class41.field764.length) {
                        class53 var17 = class41.field764[var16.field2471];
                        if (var17 != null) {
                            int var18 = var17.field4027 / 32 - class239.field4067.field4027 / 32;
                            int var19 = var17.field3990 / 32 - (class239.field4067.field3990 / 32);
                            class52.method423(arg3, true, arg1, var16.field2465, var18, arg2, var19);
                        }
                    }
                    if (var16.field2474 == 2) {
                        int var20 = (var16.field2463 - class61.field1124) * 4 + 2 - (class239.field4067.field3990 / 32);
                        int var21 = (var16.field2473 - class254.field4394) * 4 - ((class239.field4067.field4027 / 32) - 2);
                        class52.method423(arg3, true, arg1, var16.field2465, var21, arg2, var20);
                    }
                    if (var16.field2474 == 10 && var16.field2471 >= 0 && var16.field2471 < class71.field1370.length) {
                        class187 var22 = class71.field1370[var16.field2471];
                        if (var22 != null) {
                            int var23 = var22.field3990 / 32 - (class239.field4067.field3990 / 32);
                            int var24 = var22.field4027 / 32 - class239.field4067.field4027 / 32;
                            class52.method423(arg3, true, arg1, var16.field2465, var24, arg2, var23);
                        }
                    }
                }
            }
            if (class259.field4512 != 0) {
                int var14 = class259.field4512 * 4 + 2 - class239.field4067.field3990 / 32;
                int var15 = class102.field1872 * 4 + 2 - (class239.field4067.field4027 / 32);
                client.method615(arg1, var14, class94.field1756, var15, arg2, arg3, 2047);
            }
            class158.method1104(arg2 - (1 - (arg3.field243 / 2)), arg3.field242 / 2 + arg1 - 1, 3, 3, 16777215);
        }
        class208.field3458[arg4] = true;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)Lce;")
    public static final class10 method475(int arg0, int arg1, int arg2) {
        field1170++;
        class10 var3 = class89.method698(arg1, (byte) 94);
        if (arg0 == arg2) {
            return var3;
        } else if (var3 == null || var3.field297 == null || var3.field297.length <= arg0) {
            return null;
        } else {
            return var3.field297[arg0];
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILij;)Lij;")
    public final class50 method476(int arg0, int arg1, class50 arg2) {
        field1199++;
        if (this.field1146 == null) {
            return arg2;
        } else if (arg0 == 2652) {
            class79 var4 = (class79) this.field1146.method443((long) arg1, (byte) -74);
            return var4 == null ? arg2 : var4.field1453;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)Z")
    public final boolean method477(boolean arg0) {
        field1181++;
        if (this.field1160 == null) {
            return true;
        }
        int var2 = -1;
        if (this.field1195 != -1) {
            var2 = class197.method1326(arg0, this.field1195);
        } else if (this.field1151 != -1) {
            var2 = class54.field968[this.field1151];
        }
        if (var2 < 0 || (this.field1160.length - 1) <= var2 || this.field1160[var2] == -1) {
            int var3 = this.field1160[this.field1160.length - 1];
            return var3 != -1;
        } else {
            if (arg0) {
                method483((class83) null, false, 125);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILig;Lig;II)Lwg;")
    public final class98 method478(int arg0, class186 arg1, class186 arg2, int arg3, int arg4) {
        if (arg4 != 32) {
            this.field1147 = -99;
        }
        field1143++;
        if (this.field1160 != null) {
            class62 var6 = this.method486((byte) -102);
            return var6 == null ? null : var6.method478(arg0, arg1, arg2, arg3, 32);
        }
        class98 var7 = (class98) class109.field1945.method764((byte) 70, (long) this.field1142);
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field1158.length; var9++) {
                if (!class214.field3546.method163(0, (byte) 100, this.field1158[var9])) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class202[] var10 = new class202[this.field1158.length];
            for (int var11 = 0; var11 < this.field1158.length; var11++) {
                var10[var11] = class202.method1367(class214.field3546, this.field1158[var11], 0);
                if (this.field1154 != null && this.field1154[var11] != null && var10[var11] != null) {
                    var10[var11].method1371(this.field1154[var11][0], this.field1154[var11][1], this.field1154[var11][2]);
                }
            }
            class202 var12;
            if (var10.length == 1) {
                var12 = var10[0];
            } else {
                var12 = new class202(var10, var10.length);
            }
            if (this.field1178 != null) {
                for (int var13 = 0; var13 < this.field1178.length; var13++) {
                    if (this.field1169 == null || var13 >= this.field1169.length) {
                        var12.method1358(this.field1178[var13], this.field1163[var13]);
                    } else {
                        var12.method1358(this.field1178[var13], class167.field2833[this.field1169[var13] & 0xFF]);
                    }
                }
            }
            if (this.field1189 != null) {
                for (int var14 = 0; var14 < this.field1189.length; var14++) {
                    var12.method1350(this.field1189[var14], this.field1164[var14]);
                }
            }
            var7 = var12.method1362(this.field1139 + 64, this.field1194 + 850, -30, -50, -30);
            class109.field1945.method765((byte) -128, var7, (long) this.field1142);
        }
        class98 var15;
        if (arg1 != null && arg2 != null) {
            var15 = arg1.method1259(arg0, arg3, var7, arg2, (byte) 103);
        } else if (arg1 != null) {
            var15 = arg1.method1252(1994376368, var7, arg3);
        } else if (arg2 == null) {
            var15 = var7.method743(true, true);
        } else {
            var15 = arg2.method1252(1994376368, var7, arg0);
        }
        if (this.field1149 != 128 || this.field1157 != 128) {
            var15.method746(this.field1149, this.field1157, this.field1149);
        }
        return var15;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public final void method479(int arg0) {
        if (arg0 <= 121) {
            method483((class83) null, true, -21);
        }
        field1150++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
    public static final void method480(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1144++;
        if (class114.field1992 == 0 && !class188.field3116) {
            int var7 = class160.field2760;
            class206.field3409++;
            int var8 = class26.field554;
            int var9 = class33.field649;
            int var10 = class136.field2369;
            int var11 = (arg6 - arg0) * (var8 - var7) / arg3 + var7;
            int var12 = (arg2 - arg4) * (var10 - var9) / arg5 + var9;
            class129.method921(class39.field725, class245.field4271, var11, var12, (short) 37, true, 0L);
        }
        if (arg1 != 1170) {
            return;
        }
        long var13 = -1L;
        for (int var15 = 0; var15 < class109.field1960; var15++) {
            long var16 = class221.field3720[var15];
            int var18 = (int) var16 & 0x7F;
            int var19 = (int) (var16 >>> 32) & Integer.MAX_VALUE;
            int var20 = ((int) var16 & 0x6AEDF1D2) >> 29;
            int var21 = (int) var16 >> 7 & 0x7F;
            if (var13 != var16) {
                var13 = var16;
                if (var20 == 2 && class58.method452(class201.field3312, var18, var21, var16)) {
                    class243 var22 = class53.method426((byte) -90, var19);
                    if (var22.field4197 != null) {
                        var22 = var22.method1645(70);
                    }
                    if (var22 == null) {
                        continue;
                    }
                    if (class114.field1992 == 1) {
                        class194.field3223++;
                        class129.method921(class220.field3686, class80.method589(new class50[] { class19.field407, class258.field4494, var22.field4238 }, 28743), var18, var21, (short) 26, true, var16);
                    } else if (!class188.field3116) {
                        class50[] var23 = var22.field4211;
                        if (class140.field2454) {
                            var23 = class243.method1647(-6, var23);
                        }
                        if (var23 != null) {
                            for (int var24 = 4; var24 >= 0; var24--) {
                                if (var23[var24] != null) {
                                    short var25 = 0;
                                    if (var24 == 0) {
                                        var25 = 58;
                                    }
                                    class124.field2171++;
                                    if (var24 == 1) {
                                        var25 = 12;
                                    }
                                    if (var24 == 2) {
                                        var25 = 34;
                                    }
                                    if (var24 == 3) {
                                        var25 = 17;
                                    }
                                    if (var24 == 4) {
                                        var25 = 1006;
                                    }
                                    class129.method921(var23[var24], class80.method589(new class50[] { class82.field1468, var22.field4238 }, 28743), var18, var21, var25, true, var16);
                                }
                            }
                        }
                        class129.method921(class109.field1959, class80.method589(new class50[] { class82.field1468, var22.field4238 }, 28743), var18, var21, (short) 1003, true, (long) var22.field4200);
                        class87.field1670++;
                    } else if ((class129.field2270 & 0x4) == 4) {
                        class129.method921(class41.field766, class80.method589(new class50[] { class18.field396, class258.field4494, var22.field4238 }, 28743), var18, var21, (short) 25, true, var16);
                        class142.field2497++;
                    }
                }
                if (var20 == 1) {
                    class53 var26 = class41.field764[var19];
                    if (var26.field959.field1138 == 1 && (var26.field3990 & 0x7F) == 64 && (var26.field4027 & 0x7F) == 64) {
                        for (int var27 = 0; var27 < class6.field77; var27++) {
                            class53 var30 = class41.field764[class153.field2678[var27]];
                            if (var30 != null && var26 != var30 && var30.field959.field1138 == 1 && var26.field3990 == var30.field3990 && var26.field4027 == var30.field4027) {
                                class194.method1313(-1, class153.field2678[var27], var21, var18, var30.field959);
                            }
                        }
                        for (int var28 = 0; var28 < class78.field1450; var28++) {
                            class187 var29 = class71.field1370[class60.field1116[var28]];
                            if (var29 != null && var26.field3990 == var29.field3990 && var26.field4027 == var29.field4027) {
                                class239.method1629(class60.field1116[var28], false, var29, var18, var21);
                            }
                        }
                    }
                    class194.method1313(-1, var19, var21, var18, var26.field959);
                }
                if (var20 == 0) {
                    class187 var31 = class71.field1370[var19];
                    if ((var31.field3990 & 0x7F) == 64 && (var31.field4027 & 0x7F) == 64) {
                        for (int var32 = 0; var32 < class6.field77; var32++) {
                            class53 var35 = class41.field764[class153.field2678[var32]];
                            if (var35 != null && var35.field959.field1138 == 1 && var31.field3990 == var35.field3990 && var31.field4027 == var35.field4027) {
                                class194.method1313(-1, class153.field2678[var32], var21, var18, var35.field959);
                            }
                        }
                        for (int var33 = 0; var33 < class78.field1450; var33++) {
                            class187 var34 = class71.field1370[class60.field1116[var33]];
                            if (var34 != null && var31 != var34 && var31.field3990 == var34.field3990 && var31.field4027 == var34.field4027) {
                                class239.method1629(class60.field1116[var33], false, var34, var18, var21);
                            }
                        }
                    }
                    class239.method1629(var19, false, var31, var18, var21);
                }
                if (var20 == 3) {
                    class86 var36 = class184.field3022[class201.field3312][var18][var21];
                    if (var36 != null) {
                        for (class238 var37 = (class238) var36.method687(0); var37 != null; var37 = (class238) var36.method681(2000)) {
                            int var38 = var37.field4043.field1993;
                            class239 var39 = class15.method111(var38, false);
                            if (class114.field1992 == 1) {
                                class129.method921(class220.field3686, class80.method589(new class50[] { class19.field407, class29.field605, var39.field4103 }, 28743), var18, var21, (short) 2, true, (long) var38);
                                class125.field2184++;
                            } else if (!class188.field3116) {
                                class208.field3462++;
                                class50[] var40 = var39.field4079;
                                if (class140.field2454) {
                                    var40 = class243.method1647(arg1 ^ 0xFFFFFB68, var40);
                                }
                                for (int var41 = 4; var41 >= 0; var41--) {
                                    if (var40 != null && var40[var41] != null) {
                                        class243.field4236++;
                                        byte var42 = 0;
                                        if (var41 == 0) {
                                            var42 = 3;
                                        }
                                        if (var41 == 1) {
                                            var42 = 32;
                                        }
                                        if (var41 == 2) {
                                            var42 = 22;
                                        }
                                        if (var41 == 3) {
                                            var42 = 15;
                                        }
                                        if (var41 == 4) {
                                            var42 = 8;
                                        }
                                        class129.method921(var40[var41], class80.method589(new class50[] { class61.field1123, var39.field4103 }, arg1 + 27573), var18, var21, var42, true, (long) var38);
                                    } else if (var41 == 2) {
                                        class112.field1985++;
                                        class129.method921(class96.field1799, class80.method589(new class50[] { class61.field1123, var39.field4103 }, 28743), var18, var21, (short) 22, true, (long) var38);
                                    }
                                }
                                class129.method921(class109.field1959, class80.method589(new class50[] { class61.field1123, var39.field4103 }, 28743), var18, var21, (short) 1004, true, (long) var38);
                            } else if ((class129.field2270 & 0x1) == 1) {
                                class7.field88++;
                                class129.method921(class41.field766, class80.method589(new class50[] { class18.field396, class29.field605, var39.field4103 }, 28743), var18, var21, (short) 20, true, (long) var38);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)Z")
    public final boolean method481(int arg0) {
        field1161++;
        if (this.field1160 == null) {
            return this.field1187 != -1 || this.field1172 != -1 || this.field1191 != -1;
        }
        int var2 = 10 % ((-arg0 - 65) / 54);
        for (int var3 = 0; var3 < this.field1160.length; var3++) {
            if (this.field1160[var3] != -1) {
                class62 var4 = class8.method48(-21178, this.field1160[var3]);
                if (var4.field1187 != -1 || var4.field1172 != -1 || var4.field1191 != -1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILig;I)Lwg;")
    public final class98 method482(int arg0, class186 arg1, int arg2) {
        field1190++;
        if (this.field1160 != null) {
            class62 var4 = this.method486((byte) -101);
            return var4 == null ? null : var4.method482(-48, arg1, arg2);
        } else if (this.field1145 == null) {
            return null;
        } else {
            class98 var5 = (class98) class5.field62.method764((byte) 70, (long) this.field1142);
            int var6 = 52 % ((arg0 - 20) / 59);
            if (var5 == null) {
                boolean var7 = false;
                for (int var8 = 0; var8 < this.field1145.length; var8++) {
                    if (!class214.field3546.method163(0, (byte) -61, this.field1145[var8])) {
                        var7 = true;
                    }
                }
                if (var7) {
                    return null;
                }
                class202[] var9 = new class202[this.field1145.length];
                for (int var10 = 0; var10 < this.field1145.length; var10++) {
                    var9[var10] = class202.method1367(class214.field3546, this.field1145[var10], 0);
                }
                class202 var11;
                if (var9.length == 1) {
                    var11 = var9[0];
                } else {
                    var11 = new class202(var9, var9.length);
                }
                if (this.field1178 != null) {
                    for (int var12 = 0; var12 < this.field1178.length; var12++) {
                        if (this.field1169 == null || var12 >= this.field1169.length) {
                            var11.method1358(this.field1178[var12], this.field1163[var12]);
                        } else {
                            var11.method1358(this.field1178[var12], class167.field2833[this.field1169[var12] & 0xFF]);
                        }
                    }
                }
                if (this.field1189 != null) {
                    for (int var13 = 0; var13 < this.field1189.length; var13++) {
                        var11.method1350(this.field1189[var13], this.field1164[var13]);
                    }
                }
                var5 = var11.method1362(64, 768, -50, -10, -50);
                class5.field62.method765((byte) -122, var5, (long) this.field1142);
            }
            if (arg1 != null) {
                var5 = arg1.method1258(var5, 0, arg2);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lhk;ZI)V")
    public static final void method483(class83 arg0, boolean arg1, int arg2) {
        field1184++;
        if (class20.field425 != null) {
            try {
                class20.field425.method630(2);
            } catch (Exception var8) {
            }
            class20.field425 = null;
        }
        class20.field425 = arg0;
        class136.method941(arg1, 0);
        class260.field4525 = null;
        class87.field1689 = 0;
        class54.field979 = null;
        class59.field1076.field3581 = 0;
        while (true) {
            class142 var3 = (class142) class104.field1898.method446(arg2 - 3);
            if (var3 == null) {
                while (true) {
                    class142 var4 = (class142) class136.field2345.method446(1);
                    if (var4 == null) {
                        if (class118.field2088 != 0) {
                            try {
                                class217 var5 = new class217(4);
                                var5.method1471(4, (byte) 24);
                                var5.method1471(class118.field2088, (byte) 24);
                                var5.method1494(0, (byte) -63);
                                class20.field425.method632(0, var5.field3633, 4, true);
                            } catch (IOException var7) {
                                try {
                                    class20.field425.method630(2);
                                } catch (Exception var6) {
                                }
                                class20.field425 = null;
                                class133.field2319++;
                            }
                        }
                        class48.field867 = 0;
                        class20.field418 = class104.method785(arg2 ^ 0xFFFFFFFB);
                        if (arg2 == 4) {
                            return;
                        } else {
                            field1167 = null;
                            return;
                        }
                    }
                    class254.field4388.method1685(1831570337, var4);
                    class232.field3889.method445(126, var4.field635, var4);
                    class239.field4108--;
                    class160.field2752++;
                }
            }
            class154.field2686.method445(arg2 ^ 0x4E, var3.field635, var3);
            class125.field2190++;
            class122.field2151--;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILgi;II)V")
    public static final void method484(int arg0, class187 arg1, int arg2, int arg3) {
        if ((arg0 & 0x1) != 0) {
            int var4 = class119.field2109.method1487(255);
            byte[] var5 = new byte[var4];
            class217 var6 = new class217(var5);
            class119.field2109.method1479(-119, var5, 0, var4);
            class174.field2913[arg3] = var6;
            arg1.method1265(var6, -4940);
        }
        if ((arg0 & 0x400) != 0) {
            int var7 = class119.field2109.method1487(255);
            int var8 = class119.field2109.method1487(255);
            arg1.method1604(var8, class244.field4245, var7, -101);
        }
        field1183++;
        if ((arg0 & 0x200) != 0) {
            arg1.field3966 = class119.field2109.method1441(-79);
            int var9 = class119.field2109.method1454(32);
            arg1.field3997 = (var9 & 0xFFFF) + class244.field4245;
            if (arg1.field3966 == 65535) {
                arg1.field3966 = -1;
            }
            arg1.field4025 = var9 >> 16;
            arg1.field3973 = 0;
            if (class244.field4245 < arg1.field3997) {
                arg1.field3973 = -1;
            }
            arg1.field4014 = 0;
        }
        if ((arg0 & 0x100) != 0) {
            arg1.field4013 = class119.field2109.method1448((byte) -2);
            arg1.field4024 = class119.field2109.method1486(39);
            arg1.field3987 = class119.field2109.method1448((byte) -2);
            arg1.field3991 = class119.field2109.method1448((byte) -2);
            arg1.field4004 = class119.field2109.method1441(86) + class244.field4245;
            arg1.field4021 = class119.field2109.method1483(26293) + class244.field4245;
            arg1.field4009 = class119.field2109.method1448((byte) -2);
            arg1.field4032 = 0;
            arg1.field4015 = 1;
        }
        if ((arg0 & 0x8) != 0) {
            arg1.field4030 = class119.field2109.method1469((byte) -91);
            if (arg1.field4030.method393(0, (byte) -28) == 126) {
                arg1.field4030 = arg1.field4030.method397(64, 1);
                class54.method431(arg1.field4030, 2, 0, arg1.field3097);
            } else if (class239.field4067 == arg1) {
                class54.method431(arg1.field4030, 2, 0, arg1.field3097);
            }
            arg1.field3988 = 0;
            arg1.field4017 = 150;
            arg1.field4019 = 0;
        }
        int var10 = -17 % ((-arg2 - 37) / 33);
        if ((arg0 & 0x40) != 0) {
            arg1.field3971 = class119.field2109.method1441(116);
            arg1.field4001 = class119.field2109.method1483(26293);
        }
        if ((arg0 & 0x20) != 0) {
            int var11 = class119.field2109.method1490((byte) -118);
            int var12 = class119.field2109.method1448((byte) -2);
            boolean var13 = (var11 & 0x8000) != 0;
            int var14 = class119.field2109.method1487(255);
            int var15 = class119.field2109.field3581;
            if (arg1.field3097 != null && arg1.field3092 != null) {
                long var16 = arg1.field3097.method368((byte) -103);
                boolean var18 = false;
                if (var12 <= 1) {
                    if (!var13 && (class255.field4403 == 1 || class66.field1262 == 1)) {
                        var18 = true;
                    } else {
                        for (int var19 = 0; var19 < class73.field1379; var19++) {
                            if (class227.field3823[var19] == var16) {
                                var18 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var18 && class64.field1222 == 0) {
                    class258.field4490.field3581 = 0;
                    int var20 = -1;
                    class119.field2109.method1460((byte) 97, 0, class258.field4490.field3633, var14);
                    class258.field4490.field3581 = 0;
                    class50 var21;
                    if (var13) {
                        var11 &= 0x7FFF;
                        class80 var22 = class201.method1341((byte) -32, class258.field4490);
                        var20 = var22.field1463;
                        var21 = var22.field1465.method1295(-31800, class258.field4490);
                    } else {
                        var21 = class152.method1057(class239.method1617(2000, class258.field4490).method405(13829));
                    }
                    arg1.field4030 = var21.method399(false);
                    arg1.field4017 = 150;
                    arg1.field3988 = var11 >> 8;
                    arg1.field4019 = var11 & 0xFF;
                    if (var12 == 2) {
                        class18.method137(var20, class80.method589(new class50[] { class116.field2021, arg1.field3097 }, 28743), var13 ? 17 : 1, -1, var21, (class50) null);
                    } else if (var12 == 1) {
                        class18.method137(var20, class80.method589(new class50[] { class195.field3244, arg1.field3097 }, 28743), var13 ? 17 : 1, -1, var21, (class50) null);
                    } else {
                        class18.method137(var20, arg1.field3097, var13 ? 17 : 2, -1, var21, (class50) null);
                    }
                }
            }
            class119.field2109.field3581 = var15 + var14;
        }
        if ((arg0 & 0x10) != 0) {
            int var23 = class119.field2109.method1441(-81);
            if (var23 == 65535) {
                var23 = -1;
            }
            int var24 = class119.field2109.method1448((byte) -2);
            class84.method643(arg1, var24, var23, true);
        }
        if ((arg0 & 0x2) != 0) {
            int var25 = class119.field2109.method1487(255);
            int var26 = class119.field2109.method1462(-68);
            arg1.method1604(var26, class244.field4245, var25, -91);
            arg1.field4016 = class244.field4245 + 300;
            arg1.field3999 = class119.field2109.method1486(57);
        }
        if ((arg0 & 0x80) == 0) {
            return;
        }
        arg1.field3995 = class119.field2109.method1483(26293);
        if (arg1.field3995 == 65535) {
            arg1.field3995 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lwd;IZ)V")
    private final void method485(class217 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field1151 = -71;
        }
        if (arg1 == 1) {
            int var25 = arg0.method1487(255);
            this.field1158 = new int[var25];
            for (int var26 = 0; var26 < var25; var26++) {
                this.field1158[var26] = arg0.method1441(75);
            }
        } else if (arg1 == 2) {
            this.field1180 = arg0.method1469((byte) -103);
        } else if (arg1 == 12) {
            this.field1138 = arg0.method1487(255);
        } else if (arg1 == 13) {
            this.field1193 = arg0.method1441(-43);
        } else if (arg1 == 14) {
            this.field1192 = arg0.method1441(-61);
        } else if (arg1 == 15) {
            this.field1166 = arg0.method1441(-57);
        } else if (arg1 == 16) {
            this.field1159 = arg0.method1441(112);
        } else if (arg1 == 17) {
            this.field1192 = arg0.method1441(-102);
            this.field1197 = arg0.method1441(-63);
            this.field1140 = arg0.method1441(123);
            this.field1133 = arg0.method1441(95);
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1137[arg1 - 30] = arg0.method1469((byte) -108);
            if (this.field1137[arg1 - 30].method387(class3.field48, arg2)) {
                this.field1137[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var4 = arg0.method1487(255);
            this.field1163 = new short[var4];
            this.field1178 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1178[var5] = (short) arg0.method1441(-113);
                this.field1163[var5] = (short) arg0.method1441(-18);
            }
        } else if (arg1 == 41) {
            int var6 = arg0.method1487(255);
            this.field1189 = new short[var6];
            this.field1164 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1189[var7] = (short) arg0.method1441(94);
                this.field1164[var7] = (short) arg0.method1441(126);
            }
        } else if (arg1 == 42) {
            int var23 = arg0.method1487(255);
            this.field1169 = new byte[var23];
            for (int var24 = 0; var24 < var23; var24++) {
                this.field1169[var24] = arg0.method1444((byte) -110);
            }
        } else if (arg1 == 60) {
            int var8 = arg0.method1487(255);
            this.field1145 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1145[var9] = arg0.method1441(-24);
            }
        } else if (arg1 == 93) {
            this.field1155 = false;
        } else if (arg1 == 95) {
            this.field1147 = arg0.method1441(-122);
        } else if (arg1 == 97) {
            this.field1149 = arg0.method1441(-50);
        } else if (arg1 == 98) {
            this.field1157 = arg0.method1441(-18);
        } else if (arg1 == 99) {
            this.field1153 = true;
        } else if (arg1 == 100) {
            this.field1139 = arg0.method1444((byte) -83);
        } else if (arg1 == 101) {
            this.field1194 = arg0.method1444((byte) -40) * 5;
        } else if (arg1 == 102) {
            this.field1171 = arg0.method1441(106);
        } else if (arg1 == 103) {
            this.field1174 = arg0.method1441(114);
        } else if (arg1 == 106 || arg1 == 118) {
            this.field1195 = arg0.method1441(-125);
            if (this.field1195 == 65535) {
                this.field1195 = -1;
            }
            this.field1151 = arg0.method1441(-83);
            if (this.field1151 == 65535) {
                this.field1151 = -1;
            }
            int var20 = -1;
            if (arg1 == 118) {
                var20 = arg0.method1441(-47);
                if (var20 == 65535) {
                    var20 = -1;
                }
            }
            int var21 = arg0.method1487(255);
            this.field1160 = new int[var21 + 2];
            for (int var22 = 0; var22 <= var21; var22++) {
                this.field1160[var22] = arg0.method1441(77);
                if (this.field1160[var22] == 65535) {
                    this.field1160[var22] = -1;
                }
            }
            this.field1160[var21 + 1] = var20;
        } else if (arg1 == 107) {
            this.field1185 = false;
        } else if (arg1 == 109) {
            this.field1196 = false;
        } else if (arg1 == 111) {
            this.field1173 = false;
        } else if (arg1 == 113) {
            this.field1177 = (short) arg0.method1441(-49);
            this.field1176 = (short) arg0.method1441(76);
        } else if (arg1 == 114) {
            this.field1186 = arg0.method1444((byte) -63);
            this.field1141 = arg0.method1444((byte) -37);
        } else if (arg1 == 115) {
            this.field1148 = (short) (arg0.method1487(255) * 4);
            this.field1188 = (short) (arg0.method1487(255) * 4);
        } else if (arg1 == 119) {
            this.field1198 = arg0.method1444((byte) -115);
        } else if (arg1 == 120) {
            this.field1187 = arg0.method1441(-92);
            this.field1172 = arg0.method1441(-31);
            this.field1191 = arg0.method1441(83);
            this.field1156 = arg0.method1487(255);
        } else if (arg1 == 121) {
            this.field1154 = new int[this.field1158.length][];
            int var10 = arg0.method1487(255);
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg0.method1487(255);
                int[] var13 = this.field1154[var12] = new int[3];
                var13[0] = arg0.method1444((byte) -87);
                var13[1] = arg0.method1444((byte) -105);
                var13[2] = arg0.method1444((byte) -63);
            }
        } else if (arg1 == 249) {
            int var14 = arg0.method1487(255);
            if (this.field1146 == null) {
                int var15 = class41.method311(var14, !arg2);
                this.field1146 = new class56(var15);
            }
            for (int var16 = 0; var16 < var14; var16++) {
                boolean var17 = arg0.method1487(255) == 1;
                int var18 = arg0.method1447(-51);
                class32 var19;
                if (var17) {
                    var19 = new class79(arg0.method1469((byte) -104));
                } else {
                    var19 = new class199(arg0.method1466((byte) -15));
                }
                this.field1146.method445(84, (long) var18, var19);
            }
        }
        field1134++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)Lha;")
    public final class62 method486(byte arg0) {
        field1165++;
        if (arg0 > -62) {
            return null;
        }
        int var2 = -1;
        if (this.field1195 != -1) {
            var2 = class197.method1326(false, this.field1195);
        } else if (this.field1151 != -1) {
            var2 = class54.field968[this.field1151];
        }
        if (var2 < 0 || var2 >= this.field1160.length - 1 || this.field1160[var2] == -1) {
            int var3 = this.field1160[this.field1160.length - 1];
            return var3 == -1 ? null : class8.method48(-21178, var3);
        } else {
            return class8.method48(-21178, this.field1160[var2]);
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(III)I")
    public final int method487(int arg0, int arg1, int arg2) {
        field1179++;
        if (this.field1146 == null) {
            return arg1;
        }
        class199 var4 = (class199) this.field1146.method443((long) arg2, (byte) -48);
        if (var4 == null) {
            return arg1;
        } else {
            if (arg0 > -34) {
                this.field1151 = -83;
            }
            return var4.field3286;
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public static void method488(int arg0) {
        if (arg0 != 0) {
            method475(84, 87, 52);
        }
        field1167 = null;
        field1168 = null;
        field1152 = null;
        field1175 = null;
    }
}
