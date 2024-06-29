import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class71 extends class104 {

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "Z")
    private boolean field1173 = true;

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "I")
    private int field1170 = 0;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "Z")
    private boolean field1161 = false;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    private int field1159 = 0;

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "I")
    private int field1178 = -1;

    @OriginalMember(owner = "client!bk", name = "J", descriptor = "I")
    private int field1179 = -32768;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "Z")
    private boolean field1168 = false;

    @OriginalMember(owner = "client!bk", name = "M", descriptor = "Lta;")
    private class217 field1182 = null;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "I")
    private int field1166 = 0;

    @OriginalMember(owner = "client!bk", name = "Q", descriptor = "I")
    private int field1186 = -1;

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "I")
    private int field1180;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    private int field1167;

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "I")
    private int field1174;

    @OriginalMember(owner = "client!bk", name = "N", descriptor = "I")
    private int field1183;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    private int field1162;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "I")
    private int field1175;

    @OriginalMember(owner = "client!bk", name = "T", descriptor = "I")
    private int field1189;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "Lwi;")
    private class285 field1164;

    @OriginalMember(owner = "client!bk", name = "O", descriptor = "I")
    private int field1184;

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "I")
    private int field1177;

    @OriginalMember(owner = "client!bk", name = "W", descriptor = "I")
    private int field1192;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "[I")
    public static int[] field1169 = new int[32];

    @OriginalMember(owner = "client!bk", name = "X", descriptor = "[Z")
    public static boolean[] field1193;

    @OriginalMember(owner = "client!bk", name = "Z", descriptor = "Lc;")
    public static class331 field1195;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!bk", name = "L", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!bk", name = "P", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!bk", name = "R", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!bk", name = "S", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!bk", name = "U", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!bk", name = "V", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!bk", name = "Y", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "Lil;")
    private class65 field1160;

    @OriginalMember(owner = "client!bk", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() {
        if (this.field1160 != null) {
            this.field1160.method624();
        }
        field1172++;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIII)V", line = 22)
    public final void method97(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1176++;
        class104 var6 = null;
        if (class43.field680) {
            var6 = this.method680(true, 0);
        } else {
            this.method679(arg4, 0, arg3);
        }
        if (!this.field1168) {
            if (var6 == null) {
                var6 = this.method686((byte) 2);
            }
            if (var6 == null) {
                return;
            }
            this.method685(-28919, var6);
        }
        if (this.field1160 != null) {
            this.field1160.method615(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIIIIJILil;)V", line = 56)
    public final void method74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class65 arg10) {
        field1191++;
        class104 var13 = this.method686((byte) 2);
        if (var13 != null) {
            this.method685(-28919, var13);
            var13.method74(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1160);
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "()I", line = 75)
    public final int method95() {
        field1188++;
        return this.field1179;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZ)Lfb;", line = 88)
    public static final class67 method677(int arg0, boolean arg1) {
        field1158++;
        class67 var2 = (class67) class346.field5507.method467(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class209.field3541.method441(arg1, 3, arg0);
        class67 var4 = new class67();
        if (var3 != null) {
            var4.method649(new class336(var3), !arg1);
        }
        class346.field5507.method465(var4, (long) arg0, (byte) 118);
        return var4;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V", line = 107)
    public static void method678(byte arg0) {
        field1195 = null;
        if (arg0 != 86) {
            field1193 = (boolean[]) null;
        }
        field1193 = null;
        field1169 = null;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(III)V", line = 121)
    private final void method679(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field1162 = 61;
        }
        field1165++;
        label97: while (true) {
            if (this.field1164 == null) {
                if (this.field1161) {
                    return;
                }
                this.method683(-1, 0);
                if (this.field1164 == null) {
                    return;
                }
            }
            int var4 = class181.field3045 - this.field1184;
            if (var4 > 100 && this.field1164.field4544 > 0) {
                int var5 = this.field1164.field4531.length - this.field1164.field4544;
                while (this.field1192 < var5 && var4 > this.field1164.field4536[this.field1192]) {
                    var4 -= this.field1164.field4536[this.field1192];
                    this.field1192++;
                }
                if (var5 <= this.field1192) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field1164.field4531.length; var7++) {
                        var6 += this.field1164.field4536[var7];
                    }
                    var4 %= var6;
                }
                this.field1189 = this.field1192 + 1;
                if (this.field1189 >= this.field1164.field4531.length) {
                    this.field1189 -= this.field1164.field4544;
                    if (this.field1189 < 0 || this.field1189 >= this.field1164.field4531.length) {
                        this.field1189 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field1164.field4536[this.field1192] >= var4) {
                            this.field1177 = var4;
                            this.field1184 = class181.field3045 - var4;
                            return;
                        }
                        class20.method199(false, arg0, this.field1164, arg2, this.field1192, true);
                        var4 -= this.field1164.field4536[this.field1192];
                        this.field1192++;
                        if (this.field1164.field4531.length <= this.field1192) {
                            this.field1192 -= this.field1164.field4544;
                            if (this.field1192 < 0 || this.field1192 >= this.field1164.field4531.length) {
                                this.field1164 = null;
                                continue label97;
                            }
                        }
                        this.field1189 = this.field1192 + 1;
                    } while (this.field1164.field4531.length > this.field1189);
                    this.field1189 -= this.field1164.field4544;
                } while (this.field1189 >= 0 && this.field1189 < this.field1164.field4531.length);
                this.field1189 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZI)Luk;", line = 222)
    private final class104 method680(boolean arg0, int arg1) {
        field1185++;
        boolean var3 = class255.field4110 != class137.field2487;
        class97 var4 = class92.method798((byte) 104, this.field1167);
        if (var4.field1579 != null) {
            var4 = var4.method833(false);
        }
        if (var4 == null) {
            if (class43.field680 && !var3) {
                this.method682(-1);
            }
            this.field1178 = this.field1192;
            this.field1186 = -1;
            return null;
        }
        if (!this.field1161 && this.field1186 != var4.field1522) {
            this.method683(-1, 0);
        }
        int var5 = this.field1175 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var7 = var4.field1549;
            var6 = var4.field1559;
        } else {
            var6 = var4.field1549;
            var7 = var4.field1559;
        }
        int var8 = (var7 + 1 >> 1) + this.field1174;
        if (arg1 != 0) {
            this.field1186 = -9;
        }
        int var9 = this.field1183 + (var6 >> 1);
        int var10 = (var7 >> 1) + this.field1174;
        int var11 = (var6 + 1 >> 1) + this.field1183;
        this.method679(var9 * 128, 0, var10 * 128);
        boolean var12 = !var3 && var4.field1586 && (this.field1186 != var4.field1522 || (this.field1192 != this.field1178 || this.field1164 != null && (this.field1164.field4525 || class255.field4105) && this.field1192 != this.field1189) && class137.field2549 >= 2);
        if (arg0 && !var12) {
            this.field1178 = this.field1192;
            this.field1186 = var4.field1522;
            return null;
        }
        int[][] var13 = class137.field2487[this.field1162];
        int var14 = (this.field1174 << 7) + (var7 << 6);
        int[][] var15 = (int[][]) null;
        int var16 = (this.field1183 << 7) + (var6 << 6);
        if (var3) {
            var15 = class255.field4110[0];
        } else if (this.field1162 < 3) {
            var15 = class137.field2487[this.field1162 + 1];
        }
        int var17 = var13[var10][var9] + var13[var10][var11] + var13[var8][var11] + var13[var8][var9] >> 2;
        if (class43.field680 && var12) {
            class14.method144(this.field1182, this.field1166, this.field1170, this.field1159);
        }
        boolean var18 = this.field1182 == null;
        class102 var19;
        if (this.field1164 == null) {
            var19 = var4.method823(this.field1180, var18 ? class199.field3397 : this.field1182, var12, var15, var13, this.field1175, var16, false, 121, var17, var14);
        } else {
            var19 = var4.method827(arg1 - 601462749, this.field1177, this.field1164, this.field1175, this.field1180, this.field1192, var13, var16, var12, var17, var15, var18 ? class199.field3397 : this.field1182, this.field1189, var14);
        }
        if (var19 == null) {
            this.field1186 = var4.field1522;
            this.field1178 = this.field1192;
            return null;
        }
        if (class43.field680 && var12) {
            if (var18) {
                class199.field3397 = var19.field1643;
            }
            int var20 = 0;
            if (this.field1162 != 0) {
                int[][] var21 = class137.field2487[0];
                var20 = var17 - (var21[var8][var9] + var21[var8][var11] + var21[var10][var9] + var21[var10][var11] >> 2);
            }
            class217 var22 = var19.field1643;
            if (this.field1173 && class14.method142(var22, var14, var20, var16)) {
                this.field1173 = false;
            }
            if (!this.field1173) {
                class14.method136(var22, var14, var20, var16);
                if (var18) {
                    class199.field3397 = null;
                }
                this.field1170 = var20;
                this.field1182 = var22;
                this.field1166 = var14;
                this.field1159 = var16;
            }
        }
        this.field1186 = var4.field1522;
        this.field1178 = this.field1192;
        return var19.field1640;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lqe;BIII)V", line = 367)
    public static final void method681(class205 arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1181++;
        if (class218.field3632 == arg0 || class293.field4708 >= 400) {
            return;
        }
        String var11;
        if (arg0.field3478 == 0) {
            boolean var5 = true;
            if (class218.field3632.field3494 != -1 && arg0.field3494 != -1) {
                int var6 = arg0.field3480 < class218.field3632.field3480 ? class218.field3632.field3480 : arg0.field3480;
                int var7 = class218.field3632.field3494 >= arg0.field3494 ? arg0.field3494 : class218.field3632.field3494;
                int var8 = var6 * 10 / 100 + var7 + 5;
                int var9 = class218.field3632.field3480 - arg0.field3480;
                if (var9 < 0) {
                    var9 = -var9;
                }
                if (var9 > var8) {
                    var5 = false;
                }
            }
            String var10 = class72.field1199 == 1 ? class121.field2099 : class41.field614;
            if (arg0.field3479 <= arg0.field3480) {
                var11 = arg0.method1534(arg1 - 59) + (var5 ? class36.method322(class218.field3632.field3480, arg0.field3480, arg1 - 84) : "<col=ffffff>") + " (" + var10 + arg0.field3480 + ")";
            } else {
                var11 = arg0.method1534(-110) + (var5 ? class36.method322(class218.field3632.field3480, arg0.field3480, -112) : "<col=ffffff>") + " (" + var10 + arg0.field3480 + "+" + (arg0.field3479 - arg0.field3480) + ")";
            }
        } else {
            var11 = arg0.method1534(arg1 - 61) + " (" + client.field4386 + arg0.field3478 + ")";
        }
        if (class93.field1458 == 1) {
            class86.method770((short) 57, class207.field3516 + " -> <col=ffffff>" + var11, class198.field3388, 92, class12.field166, (long) arg4, arg2, arg3);
            class348.field5538++;
        } else if (!class179.field3027) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class227.field3820[var12] != null) {
                    boolean var13 = false;
                    class295.field4718++;
                    short var14 = 0;
                    if (class72.field1199 == 0 && class227.field3820[var12].equalsIgnoreCase(class308.field4904)) {
                        if (arg0.field3480 > class218.field3632.field3480) {
                            var14 = 2000;
                        }
                        if (class218.field3632.field3490 != 0 && arg0.field3490 != 0) {
                            if (class218.field3632.field3490 == arg0.field3490) {
                                var14 = 2000;
                            } else {
                                var14 = 0;
                            }
                        }
                    } else if (field1193[var12]) {
                        var14 = 2000;
                    }
                    short var15 = class99.field1604[var12];
                    short var16 = (short) (var14 + var15);
                    class86.method770(var16, "<col=ffffff>" + var11, class227.field3820[var12], 63, class121.field2098[var12], (long) arg4, arg2, arg3);
                }
            }
        } else if ((class161.field2861 & 0x8) != 0) {
            class291.field4667++;
            class86.method770((short) 22, class28.field386 + " -> <col=ffffff>" + var11, class50.field784, arg1 + 71, class292.field4681, (long) arg4, arg2, arg3);
        }
        for (int var17 = 0; var17 < class293.field4708; var17++) {
            if (class276.field4401[var17] == 15) {
                class241.field3944[var17] = "<col=ffffff>" + var11;
                break;
            }
        }
        if (arg1 != -6) {
            method684(-110, 109, (byte[]) null, -42);
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V", line = 494)
    public final void method682(int arg0) {
        if (arg0 != -1) {
            method678((byte) -47);
        }
        field1187++;
        if (this.field1182 != null) {
            class14.method144(this.field1182, this.field1166, this.field1170, this.field1159);
            this.field1182 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)V", line = 512)
    private final void method683(int arg0, int arg1) {
        field1163++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg1 != 0) {
            this.field1189 = 12;
        }
        if (arg0 == -1) {
            class97 var5 = class92.method798((byte) 104, this.field1167);
            class97 var6 = var5;
            if (var5.field1579 != null) {
                var5 = var5.method833(false);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field1581 != null) {
                if (this.field1164 != null && var5.method839(this.field1164.field4518, (byte) -127)) {
                    return;
                }
                var3 = var5.method829((byte) 125);
                if (this.field1186 != var5.field1522) {
                    var4 = var5.field1524;
                }
            } else if (var5.field1510 == -1) {
                if (var6 != null && var6.field1581 != null) {
                    if (this.field1164 != null && var6.method839(this.field1164.field4518, (byte) -16)) {
                        return;
                    }
                    var3 = var6.method829((byte) 124);
                    if (this.field1186 != var6.field1522) {
                        var4 = var6.field1524;
                    }
                } else if (var6 != null && var6.field1510 != -1 && this.field1186 != var6.field1522) {
                    var3 = var6.field1510;
                    var4 = var6.field1524;
                }
            } else if (this.field1186 != var5.field1522) {
                var3 = var5.field1510;
                var4 = var5.field1524;
            }
        }
        if (var3 == -1) {
            this.field1164 = null;
            return;
        }
        if (this.field1164 == null || this.field1164.field4518 != var3) {
            this.field1164 = class346.method2428(var3, (byte) -24);
        } else if (this.field1164.field4532 == 0) {
            return;
        }
        if (var4) {
            this.field1192 = (int) ((double) this.field1164.field4531.length * Math.random());
            this.field1177 = ((int) (Math.random() * (double) this.field1164.field4536[this.field1192])) + 1;
        } else {
            this.field1192 = 0;
            this.field1177 = 1;
        }
        this.field1189 = this.field1192 + 1;
        if (this.field1189 < 0 || this.field1164.field4531.length <= this.field1189) {
            this.field1189 = -1;
        }
        this.field1184 = class181.field3045 - this.field1177;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(IIIIIIIZLuk;)V", line = 805)
    public class71(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class104 arg8) {
        this.field1180 = arg1;
        this.field1167 = arg0;
        this.field1174 = arg4;
        this.field1183 = arg5;
        this.field1162 = arg3;
        this.field1175 = arg2;
        if (arg8 != null) {
            this.field1161 = true;
            if ((arg8 instanceof class71)) {
                class71 var11 = (class71) arg8;
                if (class43.field680) {
                    var11.method682(-1);
                }
                this.field1189 = var11.field1189;
                this.field1164 = var11.field1164;
                this.field1184 = var11.field1184;
                this.field1177 = var11.field1177;
                this.field1192 = var11.field1192;
            } else if (class43.field680) {
                class97 var10 = class92.method798((byte) 104, this.field1167);
                if (var10.field1579 != null) {
                    var10 = var10.method833(false);
                }
                if (var10 != null) {
                    class166.method1309(this.field1174, var10, this.field1175, this.field1183, this.field1180, this.field1162, 0, (byte) 110, 0);
                }
            }
        }
        if (this.field1161) {
            this.method683(arg6, 0);
        }
        if (class43.field680 && arg8 != null) {
            this.method680(true, 0);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II[BI)Ljava/lang/String;", line = 632)
    public static final String method684(int arg0, int arg1, byte[] arg2, int arg3) {
        field1190++;
        char[] var4 = new char[arg3];
        int var5 = 0;
        if (arg0 >= -122) {
            return (String) null;
        }
        for (int var6 = 0; var6 < arg3; var6++) {
            int var7 = arg2[arg1 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class56.field865[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILuk;)V", line = 696)
    private final void method685(int arg0, class104 arg1) {
        field1171++;
        if (class43.field680) {
            class183 var5 = (class183) arg1;
            if ((this.field1160 == null || this.field1160.field1024) && (var5.field3086 != null || var5.field3066 != null)) {
                class97 var6 = class92.method798((byte) 104, this.field1167);
                if (var6.field1579 != null) {
                    var6 = var6.method833(false);
                }
                if (var6 != null) {
                    this.field1160 = new class65(class181.field3045, var6.field1559, var6.field1549);
                }
            }
            if (this.field1160 != null) {
                this.field1160.method613(var5.field3086, var5.field3066, false, var5.field3080, var5.field3054, var5.field3087);
            }
        } else {
            class103 var3 = (class103) arg1;
            if ((this.field1160 == null || this.field1160.field1024) && (var3.field1653 != null || var3.field1672 != null)) {
                class97 var4 = class92.method798((byte) 104, this.field1167);
                if (var4.field1579 != null) {
                    var4 = var4.method833(false);
                }
                if (var4 != null) {
                    this.field1160 = new class65(class181.field3045, var4.field1559, var4.field1549);
                }
            }
            if (this.field1160 != null) {
                this.field1160.method613(var3.field1653, var3.field1672, false, var3.field1657, var3.field1671, var3.field1664);
            }
        }
        this.field1168 = true;
        if (arg0 != -28919) {
            this.field1183 = 79;
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(B)Luk;", line = 764)
    public final class104 method686(byte arg0) {
        if (arg0 == 2) {
            field1194++;
            return this.method680(false, arg0 - 2);
        } else {
            return (class104) null;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1169[var1] = var0 - 1;
            var0 += var0;
        }
        field1193 = new boolean[8];
        field1195 = new class331();
    }
}
