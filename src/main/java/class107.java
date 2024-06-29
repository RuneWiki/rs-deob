import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class107 {

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public int field1302 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!di", name = "w", descriptor = "I")
    private int field1321 = -1;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "Z")
    public boolean field1320 = true;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "Z")
    public boolean field1305 = false;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    public int field1312 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "I")
    public int field1317 = -1;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "[Ljava/lang/String;")
    public String[] field1323 = new String[5];

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public int field1313 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "I")
    private int field1316 = -1;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "Z")
    public boolean field1319 = true;

    @OriginalMember(owner = "client!di", name = "E", descriptor = "I")
    private int field1329 = -1;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "I")
    private int field1315 = -1;

    @OriginalMember(owner = "client!di", name = "I", descriptor = "I")
    public int field1333 = -1;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    private int field1303 = -1;

    @OriginalMember(owner = "client!di", name = "P", descriptor = "I")
    public int field1340 = 0;

    @OriginalMember(owner = "client!di", name = "J", descriptor = "Z")
    public boolean field1334 = true;

    @OriginalMember(owner = "client!di", name = "M", descriptor = "I")
    public int field1337 = -1;

    @OriginalMember(owner = "client!di", name = "D", descriptor = "I")
    public int field1328 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!di", name = "R", descriptor = "I")
    public int field1342 = -1;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "Lvj;")
    public static class373 field1299 = new class373(8, 7);

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    private int field1304;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    private int field1306;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public int field1307;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public int field1308;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "I")
    public int field1324;

    @OriginalMember(owner = "client!di", name = "B", descriptor = "I")
    private int field1326;

    @OriginalMember(owner = "client!di", name = "C", descriptor = "I")
    public int field1327;

    @OriginalMember(owner = "client!di", name = "F", descriptor = "I")
    public int field1330;

    @OriginalMember(owner = "client!di", name = "G", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!di", name = "H", descriptor = "I")
    private int field1332;

    @OriginalMember(owner = "client!di", name = "L", descriptor = "I")
    public int field1336;

    @OriginalMember(owner = "client!di", name = "N", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!di", name = "O", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!di", name = "Q", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "Lpt;")
    private class451 field1301;

    @OriginalMember(owner = "client!di", name = "A", descriptor = "Lbl;")
    public class554 field1325;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "Ljava/lang/String;")
    public String field1314;

    @OriginalMember(owner = "client!di", name = "K", descriptor = "Ljava/lang/String;")
    public String field1335;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "[I")
    public int[] field1309;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZLwaa;)Z")
    public final boolean method621(boolean arg0, class600 arg1) {
        field1318++;
        int var3;
        if (this.field1316 == -1) {
            if (this.field1303 == -1) {
                return true;
            }
            var3 = arg1.method1630(this.field1303, 113);
        } else {
            var3 = arg1.method1632(this.field1316, false);
        }
        if (var3 < this.field1326 || this.field1306 < var3) {
            return false;
        }
        boolean var4 = false;
        int var5;
        if (this.field1315 == -1) {
            if (this.field1321 == -1) {
                return true;
            }
            var5 = arg1.method1630(this.field1321, 113);
        } else {
            var5 = arg1.method1632(this.field1315, false);
        }
        if (var5 >= this.field1304 && this.field1332 >= var5) {
            return !arg0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public static void method622(int arg0) {
        if (arg0 >= -20) {
            field1339 = -37;
        }
        field1299 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
    public final String method623(int arg0, int arg1, String arg2) {
        field1322++;
        if (this.field1301 == null) {
            return arg2;
        }
        if (arg1 != 0) {
            this.method627((byte) 64, -15, -78);
        }
        class646 var4 = (class646) this.field1301.method2645((long) arg0, (byte) -107);
        return var4 == null ? arg2 : var4.field9396;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)V")
    public final void method624(int arg0) {
        if (arg0 != 1) {
            this.field1340 = 97;
        }
        field1311++;
        if (this.field1309 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field1309.length; var2 += 2) {
            if (this.field1302 > this.field1309[var2]) {
                this.field1302 = this.field1309[var2];
            } else if (this.field1312 < this.field1309[var2]) {
                this.field1312 = this.field1309[var2];
            }
            if (this.field1309[var2 + 1] < this.field1328) {
                this.field1328 = this.field1309[var2 + 1];
            } else if (this.field1313 < this.field1309[var2 + 1]) {
                this.field1313 = this.field1309[var2 + 1];
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lqa;I)Lha;")
    public final class52 method625(class206 arg0, int arg1) {
        field1300++;
        class52 var3 = (class52) this.field1325.field8163.method3682(0, (long) (arg0.field2475 << 29 | this.field1329 | 0x20000));
        if (arg1 != -2420) {
            method622(126);
        }
        if (var3 != null) {
            return var3;
        }
        this.field1325.field8153.method2566(99, this.field1329);
        class3 var4 = class3.method18(this.field1325.field8153, this.field1329, 0);
        if (var4 != null) {
            var3 = arg0.method1101(var4, true);
            this.field1325.field8163.method3684(var3, arg1 ^ 0xFFFFF68C, (long) (arg0.field2475 << 29 | 0x20000 | this.field1329));
        }
        return var3;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lqa;ZI)Lha;")
    public final class52 method626(class206 arg0, boolean arg1, int arg2) {
        field1338++;
        int var4 = arg1 ? this.field1342 : this.field1317;
        int var5 = arg0.field2475 << 29 | var4;
        class52 var6 = (class52) this.field1325.field8163.method3682(0, (long) var5);
        if (var6 != null) {
            return var6;
        } else if (this.field1325.field8153.method2566(arg2 + 117, var4)) {
            class3 var7 = class3.method18(this.field1325.field8153, var4, 0);
            if (arg2 != 1) {
                this.method629(-40, null);
            }
            if (var7 != null) {
                var6 = arg0.method1101(var7, true);
                this.field1325.field8163.method3684(var6, 0, (long) var5);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BII)I")
    public final int method627(byte arg0, int arg1, int arg2) {
        field1331++;
        int var4 = -28 / ((arg0 + 25) / 59);
        if (this.field1301 == null) {
            return arg1;
        } else {
            class171 var5 = (class171) this.field1301.method2645((long) arg2, (byte) -113);
            return var5 == null ? arg1 : var5.field2081;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IILos;)V")
    private final void method628(int arg0, int arg1, class374 arg2) {
        field1341++;
        if (arg0 == 1) {
            this.field1317 = arg2.method2136(false);
        } else if (arg0 == 2) {
            this.field1342 = arg2.method2136(false);
        } else if (arg0 == 3) {
            this.field1335 = arg2.method2133(false);
        } else if (arg0 == 4) {
            this.field1327 = arg2.method2128(true);
        } else if (arg0 == 5) {
            this.field1337 = arg2.method2128(true);
        } else if (arg0 == 6) {
            this.field1340 = arg2.method2129(-98);
        } else if (arg0 == 7) {
            int var12 = arg2.method2129(-113);
            if ((var12 & 0x1) == 0) {
                this.field1320 = false;
            }
            if ((var12 & 0x2) == 2) {
                this.field1305 = true;
            }
        } else if (arg0 == 8) {
            this.field1334 = arg2.method2129(-68) == 1;
        } else if (arg0 == 9) {
            this.field1303 = arg2.method2136(false);
            if (this.field1303 == 65535) {
                this.field1303 = -1;
            }
            this.field1316 = arg2.method2136(false);
            if (this.field1316 == 65535) {
                this.field1316 = -1;
            }
            this.field1326 = arg2.method2123(false);
            this.field1306 = arg2.method2123(false);
        } else if (arg0 >= 10 && arg0 <= 14) {
            this.field1323[arg0 - 10] = arg2.method2133(false);
        } else if (arg0 == 15) {
            int var10 = arg2.method2129(-92);
            this.field1309 = new int[var10 * 2];
            for (int var11 = 0; var11 < var10 * 2; var11++) {
                this.field1309[var11] = arg2.method2089(true);
            }
            this.field1307 = arg2.method2123(false);
            this.field1324 = arg2.method2123(false);
        } else if (arg0 == 16) {
            this.field1319 = false;
        } else if (arg0 == 17) {
            this.field1314 = arg2.method2133(false);
        } else if (arg0 == 18) {
            this.field1329 = arg2.method2136(false);
        } else if (arg0 == 19) {
            this.field1333 = arg2.method2136(false);
        } else if (arg0 == 20) {
            this.field1321 = arg2.method2136(false);
            if (this.field1321 == 65535) {
                this.field1321 = -1;
            }
            this.field1315 = arg2.method2136(false);
            if (this.field1315 == 65535) {
                this.field1315 = -1;
            }
            this.field1304 = arg2.method2123(false);
            this.field1332 = arg2.method2123(false);
        } else if (arg0 == 21) {
            this.field1308 = arg2.method2123(false);
        } else if (arg0 == 22) {
            this.field1330 = arg2.method2123(false);
        } else if (arg0 == 249) {
            int var4 = arg2.method2129(-106);
            if (this.field1301 == null) {
                int var5 = class129.method731(var4, arg1 - 27623);
                this.field1301 = new class451(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method2129(-128) == 1;
                int var8 = arg2.method2128(true);
                class544 var9;
                if (var7) {
                    var9 = new class646(arg2.method2133(false));
                } else {
                    var9 = new class171(arg2.method2123(false));
                }
                this.field1301.method2640(arg1 - 357, (long) var8, var9);
            }
        }
        if (arg1 != 358) {
            this.field1329 = 52;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILos;)V")
    public final void method629(int arg0, class374 arg1) {
        field1310++;
        if (arg0 < 34) {
            this.method628(-58, -34, null);
        }
        while (true) {
            int var3 = arg1.method2129(-85);
            if (var3 == 0) {
                return;
            }
            this.method628(var3, 358, arg1);
        }
    }

    static {
        new class180("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
    }
}
