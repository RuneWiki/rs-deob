import java.math.BigInteger;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class55 extends class64 {

    @OriginalMember(owner = "client!hf", name = "lb", descriptor = "I")
    public int field1146 = 0;

    @OriginalMember(owner = "client!hf", name = "ub", descriptor = "I")
    public int field1155 = -1;

    @OriginalMember(owner = "client!hf", name = "cb", descriptor = "Z")
    public boolean field1137 = true;

    @OriginalMember(owner = "client!hf", name = "tb", descriptor = "I")
    public int field1154 = -1;

    @OriginalMember(owner = "client!hf", name = "kb", descriptor = "I")
    public static int field1145 = 0;

    @OriginalMember(owner = "client!hf", name = "gb", descriptor = "Lrd;")
    public static class114 field1141 = class84.method656("oder ung-Ultiges Passwort)3", (byte) 123);

    @OriginalMember(owner = "client!hf", name = "sb", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1153 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!hf", name = "Ab", descriptor = "Lrd;")
    public static class114 field1161 = class84.method656("Freunde)2Server)3)3)3", (byte) 115);

    @OriginalMember(owner = "client!hf", name = "zb", descriptor = "Lrd;")
    public static class114 field1160 = class84.method656("Bitte wenden Sie sich an den Kundendienst)3", (byte) 119);

    @OriginalMember(owner = "client!hf", name = "Cb", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1163 = Calendar.getInstance();

    @OriginalMember(owner = "client!hf", name = "Fb", descriptor = "Lrd;")
    public static class114 field1166 = class84.method656("Benutzen Sie bitte eine andere Welt)3", (byte) 116);

    @OriginalMember(owner = "client!hf", name = "Eb", descriptor = "Lrd;")
    private static class114 field1165 = class84.method656("Press (Wrecover a locked account(W on front page)3", (byte) 115);

    @OriginalMember(owner = "client!hf", name = "Gb", descriptor = "Lrd;")
    public static class114 field1167 = field1165;

    @OriginalMember(owner = "client!hf", name = "Ib", descriptor = "I")
    public static int field1169 = 0;

    @OriginalMember(owner = "client!hf", name = "Hb", descriptor = "Lrd;")
    public static class114 field1168 = class84.method656("Verbindung abgebrochen)3", (byte) 116);

    @OriginalMember(owner = "client!hf", name = "Z", descriptor = "I")
    public int field1134;

    @OriginalMember(owner = "client!hf", name = "ab", descriptor = "I")
    public int field1135;

    @OriginalMember(owner = "client!hf", name = "bb", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!hf", name = "db", descriptor = "I")
    public int field1138;

    @OriginalMember(owner = "client!hf", name = "eb", descriptor = "I")
    public int field1139;

    @OriginalMember(owner = "client!hf", name = "fb", descriptor = "I")
    public int field1140;

    @OriginalMember(owner = "client!hf", name = "hb", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!hf", name = "ib", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!hf", name = "jb", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!hf", name = "mb", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!hf", name = "nb", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!hf", name = "ob", descriptor = "I")
    public int field1149;

    @OriginalMember(owner = "client!hf", name = "pb", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!hf", name = "qb", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!hf", name = "rb", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!hf", name = "vb", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!hf", name = "Db", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!hf", name = "wb", descriptor = "Lpb;")
    public static class100 field1157;

    @OriginalMember(owner = "client!hf", name = "xb", descriptor = "Lbb;")
    public static class10 field1158;

    @OriginalMember(owner = "client!hf", name = "Bb", descriptor = "Lke;")
    public static class73 field1162;

    @OriginalMember(owner = "client!hf", name = "yb", descriptor = "Loa;")
    public static class93 field1159;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)V")
    public static final void method406(int arg0) {
        field1152++;
        if (class100.field2259 != 0) {
            return;
        }
        int var1 = 80 % ((arg0 + 87) / 32);
        if (client.field417 != 1) {
            return;
        }
        int var2 = class142.field3392 - 575;
        int var3 = class118.field2758 - 5 - 4;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        var3 -= 75;
        var2 -= 73;
        int var4 = class92.field2159 + class69.field1505 & 0x7FF;
        int var5 = class134.field3272[var4];
        int var6 = (class48.field997 + 256) * var5 >> 8;
        int var7 = class134.field3279[var4];
        int var8 = (class48.field997 + 256) * var7 >> 8;
        int var9 = var3 * var8 - var2 * var6 >> 11;
        int var10 = var2 * var8 + var3 * var6 >> 11;
        int var11 = class7.field103.field712 + var10 >> 7;
        int var12 = class7.field103.field756 - var9 >> 7;
        boolean var13 = class10.method80(var11, class7.field103.field758[0], class7.field103.field748[0], 1, true, var12, 0, 0, -103, 0, 0, 0);
        if (!var13) {
            return;
        }
        class61.field1303.method478((byte) -32, var2);
        class61.field1303.method478((byte) 94, var3);
        class61.field1303.method464(class92.field2159, (byte) 55);
        class61.field1303.method478((byte) -52, 57);
        class61.field1303.method478((byte) 108, class69.field1505);
        class61.field1303.method478((byte) -28, class48.field997);
        class61.field1303.method478((byte) 89, 89);
        class61.field1303.method464(class7.field103.field712, (byte) 10);
        class61.field1303.method464(class7.field103.field756, (byte) 66);
        class61.field1303.method478((byte) 102, class16.field322);
        class61.field1303.method478((byte) -120, 63);
        return;
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(B)V")
    public static void method407(byte arg0) {
        field1167 = null;
        if (arg0 > -16) {
            field1158 = null;
        }
        field1161 = null;
        field1162 = null;
        field1159 = null;
        field1153 = null;
        field1163 = null;
        field1141 = null;
        field1157 = null;
        field1165 = null;
        field1166 = null;
        field1168 = null;
        field1160 = null;
        field1158 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lpb;Lrd;Lrd;B)[Lhe;")
    public static final class54[] method408(class100 arg0, class114 arg1, class114 arg2, byte arg3) {
        field1142++;
        int var4 = arg0.method766(arg1, (byte) -116);
        int var5 = arg0.method752(arg2, -31757, var4);
        return arg3 <= 50 ? null : class112.method848(arg0, var5, var4, 128);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILid;I)V")
    public final void method409(int arg0, class60 arg1, int arg2) {
        field1164++;
        while (true) {
            int var4 = arg1.method462((byte) 116);
            if (var4 == 0) {
                if (arg0 == 16876) {
                    return;
                } else {
                    field1157 = null;
                    return;
                }
            }
            this.method410(75, arg1, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILid;II)V")
    private final void method410(int arg0, class60 arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            this.field1146 = arg1.method493((byte) -30);
        } else if (arg2 == 2) {
            this.field1154 = arg1.method462((byte) 116);
        } else if (arg2 == 5) {
            this.field1137 = false;
        } else if (arg2 == 7) {
            this.field1155 = arg1.method493((byte) -37);
        }
        if (arg0 == 75) {
            field1151++;
        }
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(B)V")
    public final void method411(byte arg0) {
        if (arg0 < 75) {
            method407((byte) -37);
        }
        if (this.field1155 != -1) {
            this.method414(-4492, this.field1155);
            this.field1138 = this.field1140;
            this.field1149 = this.field1134;
            this.field1135 = this.field1139;
        }
        this.method414(-4492, this.field1146);
        field1148++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lnd;IB)I")
    public static final int method412(class90 arg0, int arg1, byte arg2) {
        field1144++;
        if (arg0.field2055 == null || arg0.field2055.length <= arg1) {
            return -2;
        }
        try {
            int[] var3 = arg0.field2055[arg1];
            int var4 = 0;
            if (arg2 > -29) {
                method413(-68, 91, -103, -7, 69, -88);
            }
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 1) {
                    var8 = class73.field1625[var3[var5++]];
                }
                if (var7 == 2) {
                    var8 = class31.field632[var3[var5++]];
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 3) {
                    var8 = class98.field2229[var3[var5++]];
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class90 var12 = class14.method115(65535, var11);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class128.method988(var13, false).field1123 || class135.field3292)) {
                        for (int var14 = 0; var14 < var12.field2019.length; var14++) {
                            if (var13 + 1 == var12.field2019[var14]) {
                                var8 += var12.field2082[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class123.field2896[var3[var5++]];
                }
                if (var7 == 6) {
                    var8 = class1.field7[class31.field632[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class123.field2896[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class7.field103.field3004;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class25.field511[var15]) {
                            var8 += class31.field632[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class90 var18 = class14.method115(65535, var17);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class128.method988(var19, false).field1123 || class135.field3292)) {
                        for (int var20 = 0; var20 < var18.field2019.length; var20++) {
                            if (var19 + 1 == var18.field2019[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class107.field2472;
                }
                if (var7 == 12) {
                    var8 = class131.field3170;
                }
                if (var7 == 13) {
                    int var21 = class123.field2896[var3[var5++]];
                    int var22 = var3[var5++];
                    var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var8 = class92.method714((byte) 99, var23);
                }
                if (var7 == 18) {
                    var8 = (class7.field103.field712 >> 7) + class72.field1611;
                }
                if (var7 == 19) {
                    var8 = (class7.field103.field756 >> 7) + class65.field1408;
                }
                if (var7 == 20) {
                    var8 = var3[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var4 += var8;
                    }
                    if (var6 == 1) {
                        var4 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var4 /= var8;
                    }
                    if (var6 == 3) {
                        var4 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIII)V")
    public static final void method413(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1156++;
        int var6 = class101.field2325.method1034(arg5, arg2, arg0);
        if (var6 != 0) {
            int var7 = class101.field2325.method1009(arg5, arg2, arg0, var6);
            int var8 = var7 & 0x1F;
            int var9 = arg3;
            if (var6 > 0) {
                var9 = arg4;
            }
            int[] var10 = class102.field2389.field1129;
            int var11 = var7 >> 6 & 0x3;
            int var12 = arg2 * 4 + (103 - arg0) * 4 * 512 + 24624;
            int var13 = var6 >> 14 & 0x7FFF;
            class12 var14 = class130.method1048(arg1 ^ 0xFFFFFF8E, var13);
            if (var14.field239 == -1) {
                if (var8 == 0 || var8 == 2) {
                    if (var11 == 0) {
                        var10[var12] = var9;
                        var10[var12 + 512] = var9;
                        var10[var12 + 1024] = var9;
                        var10[var12 + 1536] = var9;
                    } else if (var11 == 1) {
                        var10[var12] = var9;
                        var10[var12 + 1] = var9;
                        var10[var12 + 2] = var9;
                        var10[var12 + 3] = var9;
                    } else if (var11 == 2) {
                        var10[var12 + 3] = var9;
                        var10[var12 + 3 + 512] = var9;
                        var10[var12 + 3 + 1024] = var9;
                        var10[var12 + 1539] = var9;
                    } else if (var11 == 3) {
                        var10[var12 + 1536] = var9;
                        var10[var12 + 1536 + 1] = var9;
                        var10[var12 + 1536 + 2] = var9;
                        var10[var12 + 1536 + 3] = var9;
                    }
                }
                if (var8 == 3) {
                    if (var11 == 0) {
                        var10[var12] = var9;
                    } else if (var11 == 1) {
                        var10[var12 + 3] = var9;
                    } else if (var11 == 2) {
                        var10[var12 + 1539] = var9;
                    } else if (var11 == 3) {
                        var10[var12 + 1536] = var9;
                    }
                }
                if (var8 == 2) {
                    if (var11 == 3) {
                        var10[var12] = var9;
                        var10[var12 + 512] = var9;
                        var10[var12 + 1024] = var9;
                        var10[var12 + 1536] = var9;
                    } else if (var11 == 0) {
                        var10[var12] = var9;
                        var10[var12 + 1] = var9;
                        var10[var12 + 2] = var9;
                        var10[var12 + 3] = var9;
                    } else if (var11 == 1) {
                        var10[var12 + 3] = var9;
                        var10[var12 + 515] = var9;
                        var10[var12 + 3 + 1024] = var9;
                        var10[var12 + 1539] = var9;
                    } else if (var11 == 2) {
                        var10[var12 + 1536] = var9;
                        var10[var12 + 1 + 1536] = var9;
                        var10[var12 + 1536 + 2] = var9;
                        var10[var12 + 1536 + 3] = var9;
                    }
                }
            } else {
                class93 var15 = class70.field1538[var14.field239];
                if (var15 != null) {
                    int var16 = (var14.field261 * 4 - var15.field2175) / 2;
                    int var17 = (var14.field277 * 4 - var15.field2174) / 2;
                    var15.method722(arg2 * 4 + var17 + 48, var16 + 48 - -((-arg0 - var14.field261 + 104) * 4));
                }
            }
        }
        int var18 = class101.field2325.method1028(arg5, arg2, arg0);
        if (var18 != 0) {
            int var19 = class101.field2325.method1009(arg5, arg2, arg0, var18);
            int var20 = var19 >> 6 & 0x3;
            int var21 = var18 >> 14 & 0x7FFF;
            int var22 = var19 & 0x1F;
            class12 var23 = class130.method1048(arg1 ^ 0xFFFFFFA8, var21);
            if (var23.field239 != -1) {
                class93 var27 = class70.field1538[var23.field239];
                if (var27 != null) {
                    int var28 = (var23.field277 * 4 - var27.field2174) / 2;
                    int var29 = (var23.field261 * 4 - var27.field2175) / 2;
                    var27.method722(arg2 * 4 + var28 + 48, 48 - -((104 - var23.field261 + -arg0) * 4) + var29);
                }
            } else if (var22 == 9) {
                int var24 = 15658734;
                if (var18 > 0) {
                    var24 = 15597568;
                }
                int[] var25 = class102.field2389.field1129;
                int var26 = arg2 * 4 + (52736 - arg0 * 512) * 4 + 24624;
                if (var20 == 0 || var20 == 2) {
                    var25[var26 + 1536] = var24;
                    var25[var26 + 1024 + 1] = var24;
                    var25[var26 + 512 + 2] = var24;
                    var25[var26 + 3] = var24;
                } else {
                    var25[var26] = var24;
                    var25[var26 + 512 + 1] = var24;
                    var25[var26 + 1026] = var24;
                    var25[var26 + 1536 + 3] = var24;
                }
            }
        }
        int var30 = class101.field2325.method1035(arg5, arg2, arg0);
        if (arg1 == var30) {
            return;
        }
        int var31 = var30 >> 14 & 0x7FFF;
        class12 var32 = class130.method1048(arg1 - 61, var31);
        if (var32.field239 == -1) {
            return;
        }
        class93 var33 = class70.field1538[var32.field239];
        if (var33 != null) {
            int var34 = (var32.field261 * 4 - var33.field2175) / 2;
            int var35 = (var32.field277 * 4 - var33.field2174) / 2;
            var33.method722(arg2 * 4 + var35 + 48, (-arg0 + 104 - var32.field261) * 4 + var34 + 48);
            return;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V")
    private final void method414(int arg0, int arg1) {
        field1147++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 & 0xFF) / 256.0D;
        double var7 = var3;
        if (arg0 != -4492) {
            method407((byte) -25);
        }
        double var9 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        if (var9 < var3) {
            var7 = var9;
        }
        if (var7 > var5) {
            var7 = var5;
        }
        double var11 = var3;
        double var13 = 0.0D;
        double var15 = 0.0D;
        if (var3 < var9) {
            var11 = var9;
        }
        if (var11 < var5) {
            var11 = var5;
        }
        double var17 = (var7 + var11) / 2.0D;
        if (var7 != var11) {
            if (var3 == var11) {
                var15 = (var9 - var5) / (-var7 + var11);
            } else if (var9 == var11) {
                var15 = (var5 - var3) / (-var7 + var11) + 2.0D;
            } else if (var5 == var11) {
                var15 = (var3 - var9) / (var11 - var7) + 4.0D;
            }
            if (var17 < 0.5D) {
                var13 = (var11 - var7) / (var7 + var11);
            }
            if (var17 >= 0.5D) {
                var13 = (var11 - var7) / (2.0D - var11 - var7);
            }
        }
        this.field1134 = (int) (var17 * 256.0D);
        if (this.field1134 < 0) {
            this.field1134 = 0;
        } else if (this.field1134 > 255) {
            this.field1134 = 255;
        }
        double var19 = var15 / 6.0D;
        this.field1140 = (int) (var13 * 256.0D);
        this.field1139 = (int) (var19 * 256.0D);
        if (this.field1140 < 0) {
            this.field1140 = 0;
        } else if (this.field1140 > 255) {
            this.field1140 = 255;
        }
    }
}
