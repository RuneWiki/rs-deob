import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class62 extends class220 {

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "Lmh;")
    private static class128 field1165 = class22.method156(125, "Please wait)3)3)3");

    @OriginalMember(owner = "client!nf", name = "O", descriptor = "Lmh;")
    public static class128 field1173 = class22.method156(127, ")2");

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "I")
    public static int field1172 = -1;

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "Lmh;")
    private static class128 field1163 = class22.method156(122, "Loaded world list data");

    @OriginalMember(owner = "client!nf", name = "R", descriptor = "Lmh;")
    public static class128 field1176 = class22.method156(127, "blinken1:");

    @OriginalMember(owner = "client!nf", name = "V", descriptor = "Lmh;")
    public static class128 field1180 = class22.method156(124, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!nf", name = "X", descriptor = "Lmh;")
    public static class128 field1182 = class22.method156(127, "Null");

    @OriginalMember(owner = "client!nf", name = "U", descriptor = "Lmh;")
    public static class128 field1179 = field1163;

    @OriginalMember(owner = "client!nf", name = "P", descriptor = "[I")
    public static int[] field1174 = new int[128];

    @OriginalMember(owner = "client!nf", name = "bb", descriptor = "Lmh;")
    public static class128 field1186 = field1165;

    @OriginalMember(owner = "client!nf", name = "Y", descriptor = "Lmh;")
    public static class128 field1183 = class22.method156(122, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!nf", name = "Q", descriptor = "Lmh;")
    private static class128 field1175 = class22.method156(127, "Prepared sound engine");

    @OriginalMember(owner = "client!nf", name = "eb", descriptor = "Lmh;")
    public static class128 field1189 = field1175;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
    public int field1164;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!nf", name = "S", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!nf", name = "T", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!nf", name = "W", descriptor = "I")
    private int field1181;

    @OriginalMember(owner = "client!nf", name = "Z", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!nf", name = "ab", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!nf", name = "db", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "Lmh;")
    public class128 field1170;

    @OriginalMember(owner = "client!nf", name = "cb", descriptor = "Lti;")
    public static class212 field1187;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;", line = 7)
    public static final Class method406(byte arg0, String arg1) throws ClassNotFoundException {
        field1168++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else {
            if (arg0 != -68) {
                field1189 = (class128) null;
            }
            return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIBII)I", line = 51)
    public static final int method407(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1188++;
        if (arg2 <= 97) {
            field1172 = 58;
        }
        if (class279.field4811) {
            class279.field4811 = false;
            arg1 = 1000000;
        }
        class182 var5 = class178.field3136[arg0][arg4];
        int var6 = var5.field3186;
        float var7 = ((float) arg3 * 0.1F + 0.7F) * var5.field3192;
        float var8 = var5.field3196;
        int var9 = var5.field3182;
        float var10 = var5.field3190;
        int var11 = var5.field3188;
        if (!class271.field4693) {
            var11 = 0;
        }
        if (class50.field987 != var9 || class70.field1304 != var7 || class3.field66 != var10 || class30.field668 != var8 || class249.field4325 != var6 || class210.field3728 != var11) {
            class268.field4661 = class176.field3107;
            class43.field885 = class151.field2594;
            class264.field4579 = class96.field1629;
            class178.field3135 = 0;
            class30.field668 = var8;
            class249.field4325 = var6;
            class210.field3728 = var11;
            class134.field2334 = class257.field4415;
            class70.field1304 = var7;
            class64.field1244 = class298.field5090;
            class50.field987 = var9;
            class3.field66 = var10;
            class121.field2054 = class145.field2498;
        }
        if (class178.field3135 < 65536) {
            class178.field3135 += arg1 * 250;
            if (class178.field3135 >= 65536) {
                class178.field3135 = 65536;
            }
            int var12 = 65536 - class178.field3135 >> 8;
            int var13 = class178.field3135 >> 8;
            class176.field3107 = ((class268.field4661 & 0xFF00) * var12 + (class249.field4325 & 0xFF00) * var13 & 0xFF0000) + ((class268.field4661 & 0xFF00FF) * var12 + (class249.field4325 & 0xFF00FF) * var13 & 0xFF00FF00) >> 8;
            class96.field1629 = class264.field4579 * var12 + (class210.field3728 * var13) >> 8;
            float var14 = (float) (65536 - class178.field3135) / 65536.0F;
            class298.field5090 = ((class64.field1244 & 0xFF00FF) * var12 + ((class50.field987 & 0xFF00FF) * var13) & 0xFF00FF00) + ((class64.field1244 & 0xFF00) * var12 + (class50.field987 & 0xFF00) * var13 & 0xFF0000) >> 8;
            float var15 = (float) class178.field3135 / 65536.0F;
            class257.field4415 = class30.field668 * var15 + class134.field2334 * var14;
            class151.field2594 = class70.field1304 * var15 + class43.field885 * var14;
            class145.field2498 = class3.field66 * var15 + class121.field2054 * var14;
        }
        class119.method714(class298.field5090, class151.field2594, class145.field2498, class257.field4415);
        class119.method719(class176.field3107, class96.field1629);
        class119.method717((float) class275.field4771, (float) class308.field5238, (float) class228.field3967);
        class119.method716();
        return class176.field3107;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)Z", line = 139)
    public static final boolean method408(int arg0, int arg1) {
        field1185++;
        if (arg1 == 0) {
            return (arg0 & 0x19126A6F) >> 28 != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)Z", line = 151)
    public static final boolean method409(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class226.field3955; var3++) {
            class96 var4 = class144.field2472[var3];
            if (var4.field1630 == 1) {
                int var5 = var4.field1618 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field1640 * var5 >> 8) + var4.field1619;
                    int var7 = (var4.field1621 * var5 >> 8) + var4.field1625;
                    int var8 = (var4.field1624 * var5 >> 8) + var4.field1623;
                    int var9 = (var4.field1615 * var5 >> 8) + var4.field1616;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field1630 == 2) {
                int var10 = arg0 - var4.field1618;
                if (var10 > 0) {
                    int var11 = (var4.field1640 * var10 >> 8) + var4.field1619;
                    int var12 = (var4.field1621 * var10 >> 8) + var4.field1625;
                    int var13 = (var4.field1624 * var10 >> 8) + var4.field1623;
                    int var14 = (var4.field1615 * var10 >> 8) + var4.field1616;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field1630 == 3) {
                int var15 = var4.field1619 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field1636 * var15 >> 8) + var4.field1618;
                    int var17 = (var4.field1627 * var15 >> 8) + var4.field1633;
                    int var18 = (var4.field1624 * var15 >> 8) + var4.field1623;
                    int var19 = (var4.field1615 * var15 >> 8) + var4.field1616;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field1630 == 4) {
                int var20 = arg2 - var4.field1619;
                if (var20 > 0) {
                    int var21 = (var4.field1636 * var20 >> 8) + var4.field1618;
                    int var22 = (var4.field1627 * var20 >> 8) + var4.field1633;
                    int var23 = (var4.field1624 * var20 >> 8) + var4.field1623;
                    int var24 = (var4.field1615 * var20 >> 8) + var4.field1616;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field1630 == 5) {
                int var25 = arg1 - var4.field1623;
                if (var25 > 0) {
                    int var26 = (var4.field1636 * var25 >> 8) + var4.field1618;
                    int var27 = (var4.field1627 * var25 >> 8) + var4.field1633;
                    int var28 = (var4.field1640 * var25 >> 8) + var4.field1619;
                    int var29 = (var4.field1621 * var25 >> 8) + var4.field1625;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)Z", line = 275)
    public final boolean method410(int arg0) {
        field1171++;
        if (arg0 == 0) {
            return this.field1181 == 115;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(I)V", line = 289)
    public static final void method411(int arg0) {
        if (arg0 < -52) {
            class175.field3091.method1832((byte) 84);
            field1178++;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lbg;I)V", line = 309)
    public final void method412(class194 arg0, int arg1) {
        if (arg1 != -1) {
            field1187 = (class212) null;
        }
        while (true) {
            int var3 = arg0.method1325(7627);
            if (var3 == 0) {
                field1166++;
                return;
            }
            this.method413(arg0, 16711680, var3);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lbg;II)V", line = 330)
    private final void method413(class194 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field1181 = arg0.method1325(7627);
        } else if (arg2 == 2) {
            this.field1164 = arg0.method1350(false);
        } else if (arg2 == 5) {
            this.field1170 = arg0.method1319(1);
        }
        field1167++;
        if (arg1 != 16711680) {
            field1182 = (class128) null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "(I)V", line = 357)
    public static void method414(int arg0) {
        field1173 = null;
        field1175 = null;
        field1176 = null;
        field1174 = null;
        field1187 = null;
        field1163 = null;
        field1180 = null;
        field1182 = null;
        field1165 = null;
        field1183 = null;
        field1189 = null;
        field1179 = null;
        if (arg0 != -6129) {
            method407(-122, -31, (byte) -106, -68, -121);
        }
        field1186 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BLem;)Z", line = 391)
    public static final boolean method415(byte arg0, class10 arg1) {
        field1177++;
        if (arg0 != -55) {
            method407(-40, -39, (byte) -110, -93, -77);
        }
        if (arg1.field263 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field263.length; var2++) {
            int var3 = class235.method1612(var2, (byte) 10, arg1);
            int var4 = arg1.field236[var2];
            if (arg1.field263[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg1.field263[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg1.field263[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "(I)V", line = 470)
    public static final void method416(int arg0) {
        field1184++;
        for (class3 var1 = (class3) class232.field4006.method2024(0); var1 != null; var1 = (class3) class232.field4006.method2027(arg0 + 1211754408)) {
            if (var1.field45) {
                var1.method16(26972);
            }
        }
        for (class3 var2 = (class3) class63.field1195.method2024(arg0 ^ arg0); var2 != null; var2 = (class3) class63.field1195.method2027(1211754408)) {
            if (var2.field45) {
                var2.method16(26972);
            }
        }
    }
}
