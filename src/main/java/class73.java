import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class73 {

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "Lob;")
    public static class141 field1451 = class175.method1195(40, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Lob;")
    public static class141 field1461 = class175.method1195(40, "(U2");

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    private int field1455;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "J")
    private long field1447;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "J")
    private long field1449;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Lca;")
    public static class22 field1450;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "Z")
    public boolean field1464;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "[I")
    private int[] field1456;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "[I")
    private int[] field1457;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    private final void method501(byte arg0) {
        field1460++;
        long var2 = this.field1449;
        if (arg0 != 114) {
            field1450 = null;
        }
        this.field1449 = -1L;
        long[] var4 = class210.field3991;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field1449 = var4[(int) (((long) (this.field1457[var5] >> 24) ^ this.field1449) & 0xFFL)] ^ this.field1449 >>> 8;
            this.field1449 = var4[(int) ((this.field1449 ^ (long) (this.field1457[var5] >> 16)) & 0xFFL)] ^ this.field1449 >>> 8;
            this.field1449 = this.field1449 >>> 8 ^ var4[(int) ((this.field1449 ^ (long) (this.field1457[var5] >> 8)) & 0xFFL)];
            this.field1449 = this.field1449 >>> 8 ^ var4[(int) (((long) this.field1457[var5] ^ this.field1449) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field1449 = var4[(int) ((this.field1449 ^ (long) this.field1456[var6]) & 0xFFL)] ^ this.field1449 >>> 8;
        }
        this.field1449 = var4[(int) (((long) (this.field1464 ? 1 : 0) ^ this.field1449) & 0xFFL)] ^ this.field1449 >>> 8;
        if (var2 != 0L && this.field1449 != var2) {
            class76.field1541.method1380(var2, false);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZB)V")
    public final void method502(boolean arg0, byte arg1) {
        int var3 = -44 / ((arg1 - 39) / 41);
        field1454++;
        if (arg0 != this.field1464) {
            this.method508(this.field1456, null, -1, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZZ)V")
    public final void method503(int arg0, boolean arg1, boolean arg2) {
        field1465++;
        if (arg1 || arg0 == 1 && this.field1464) {
            return;
        }
        int var4 = this.field1457[class68.field1332[arg0]];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 & 0x3FFFFFFF;
        class65 var6;
        do {
            if (arg2) {
                var5++;
                if (var5 >= class130.field2486) {
                    var5 = 0;
                }
            } else {
                var5--;
                if (var5 < 0) {
                    var5 = class130.field2486 - 1;
                }
            }
            var6 = class42.method273(var5, 0);
        } while (var6 == null || var6.field1262 || arg0 + (this.field1464 ? 7 : 0) != var6.field1254);
        this.field1457[class68.field1332[arg0]] = class57.method389(Integer.MIN_VALUE, var5);
        this.method501((byte) 114);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V")
    public final void method504(int arg0, int arg1, int arg2) {
        int var4 = class68.field1332[arg1];
        field1459++;
        if (this.field1457[var4] == 0 || class42.method273(arg0, 0) == null) {
            return;
        }
        if (arg2 < 117) {
            this.method508(null, null, 100, -117, false);
        }
        this.field1457[var4] = class57.method389(Integer.MIN_VALUE, arg0);
        this.method501((byte) 114);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static void method505(int arg0) {
        field1450 = null;
        field1461 = null;
        field1451 = null;
        if (arg0 != 29450) {
            method505(48);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Log;I)V")
    public final void method506(class146 arg0, int arg1) {
        field1468++;
        arg0.method997(83, this.field1464 ? 1 : 0);
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field1457[class68.field1332[var3]];
            if ((var5 & Integer.MIN_VALUE) == 0) {
                arg0.method972(26894, 65535);
            } else {
                arg0.method972(26894, var5 & 0x3FFFFFFF);
            }
        }
        if (arg1 > -75) {
            this.method513(89, -87, -21);
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method997(117, this.field1456[var4]);
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)I")
    public final int method507(int arg0) {
        if (arg0 != 24295) {
            this.method512(54, false, -110);
        }
        field1448++;
        return this.field1455 == -1 ? (this.field1457[11] << 5) + (this.field1457[8] << 10) + (this.field1457[0] << 15) + (this.field1456[0] << 25) + (this.field1456[4] << 20) + this.field1457[1] : 305419896 - -class50.method323(this.field1455, 0).field169;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([I[IIIZ)V")
    public final void method508(int[] arg0, int[] arg1, int arg2, int arg3, boolean arg4) {
        field1466++;
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class130.field2486; var7++) {
                    class65 var8 = class42.method273(var7, 0);
                    if (var8 != null && !var8.field1262 && var8.field1254 == var6 + (arg4 ? 7 : 0)) {
                        arg1[class68.field1332[var6]] = class57.method389(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field1457 = arg1;
        if (arg3 != 0) {
            this.method509(true, 127, -74, null, null);
        }
        this.field1464 = arg4;
        this.field1456 = arg0;
        this.field1455 = arg2;
        this.method501((byte) 114);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZIILce;Lce;)Lfe;")
    public final class56 method509(boolean arg0, int arg1, int arg2, class26 arg3, class26 arg4) {
        if (!arg0) {
            return null;
        }
        field1458++;
        if (this.field1455 != -1) {
            return class50.method323(this.field1455, 0).method66(arg0, arg2, arg4, arg3, arg1);
        }
        int[] var6 = this.field1457;
        long var7 = this.field1449;
        if (arg4 != null && (arg4.field484 >= 0 || arg4.field486 >= 0)) {
            var6 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var6[var9] = this.field1457[var9];
            }
            if (arg4.field484 >= 0) {
                if (arg4.field484 == 65535) {
                    var6[5] = 0;
                    var7 ^= 0xFFFFFFFF00000000L;
                } else {
                    var6[5] = class57.method389(arg4.field484, 1073741824);
                    var7 ^= (long) var6[5] << 32;
                }
            }
            if (arg4.field486 >= 0) {
                if (arg4.field486 == 65535) {
                    var6[3] = 0;
                    var7 ^= 0xFFFFFFFFL;
                } else {
                    var6[3] = class57.method389(arg4.field486, 1073741824);
                    var7 ^= var6[3];
                }
            }
        }
        class56 var10 = (class56) class76.field1541.method1383(var7, (byte) 119);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var6[var12];
                if ((var21 & 0x40000000) == 0) {
                    if ((var21 & Integer.MIN_VALUE) != 0 && !class42.method273(var21 & 0x3FFFFFFF, 0).method433(false)) {
                        var11 = true;
                    }
                } else if (!class96.method645((byte) -61, var21 & 0x3FFFFFFF).method336(this.field1464, true)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field1447 != -1L) {
                    var10 = (class56) class76.field1541.method1383(this.field1447, (byte) -79);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class23[] var13 = new class23[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var6[var15];
                    if ((var18 & 0x40000000) != 0) {
                        class23 var19 = class96.method645((byte) -61, var18 & 0x3FFFFFFF).method338(true, this.field1464);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    } else if ((Integer.MIN_VALUE & var18) != 0) {
                        class23 var20 = class42.method273(var18 & 0x3FFFFFFF, 0).method435(-19400);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    }
                }
                class23 var16 = new class23(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (class110.field2121[var17].length > this.field1456[var17]) {
                        var16.method159(class103.field1996[var17], class110.field2121[var17][this.field1456[var17]]);
                    }
                    if (class141.field2731[var17].length > this.field1456[var17]) {
                        var16.method159(class76.field1556[var17], class141.field2731[var17][this.field1456[var17]]);
                    }
                }
                var10 = var16.method166(64, 850, -30, -50, -30);
                class76.field1541.method1378(var10, (byte) -31, var7);
                this.field1447 = var7;
            }
        }
        if (arg4 == null && arg3 == null) {
            return var10;
        }
        class56 var22;
        if (arg4 != null && arg3 != null) {
            var22 = arg4.method190(var10, -18112, arg3, arg2, arg1);
        } else if (arg4 == null) {
            var22 = arg3.method188(var10, arg2, -125);
        } else {
            var22 = arg4.method188(var10, arg1, 1);
        }
        return var22;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BZ)V")
    public final void method510(byte arg0, boolean arg1) {
        field1462++;
        this.field1464 = arg1;
        this.method501((byte) 114);
        int var3 = 52 % ((22 - arg0) / 50);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZLce;)Lfe;")
    public final class56 method511(int arg0, boolean arg1, class26 arg2) {
        field1467++;
        if (this.field1455 != -1) {
            return class50.method323(this.field1455, 0).method63(125, arg0, arg2);
        }
        class56 var4 = (class56) class122.field2335.method1383(this.field1449, (byte) -72);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field1457[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var15) != 0 && !class42.method273(var15 & 0x3FFFFFFF, 0).method428(114)) {
                        var5 = true;
                    }
                } else if (!class96.method645((byte) -61, var15 & 0x3FFFFFFF).method333(this.field1464, false)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            int var7 = 0;
            class23[] var8 = new class23[12];
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field1457[var9];
                if ((var12 & 0x40000000) != 0) {
                    class23 var14 = class96.method645((byte) -61, var12 & 0x3FFFFFFF).method324(0, this.field1464);
                    if (var14 != null) {
                        var8[var7++] = var14;
                    }
                } else if ((var12 & Integer.MIN_VALUE) != 0) {
                    class23 var13 = class42.method273(var12 & 0x3FFFFFFF, 0).method434((byte) -86);
                    if (var13 != null) {
                        var8[var7++] = var13;
                    }
                }
            }
            class23 var10 = new class23(var8, var7);
            for (int var11 = 0; var11 < 5; var11++) {
                if (class110.field2121[var11].length > this.field1456[var11]) {
                    var10.method159(class103.field1996[var11], class110.field2121[var11][this.field1456[var11]]);
                }
                if (this.field1456[var11] < class141.field2731[var11].length) {
                    var10.method159(class76.field1556[var11], class141.field2731[var11][this.field1456[var11]]);
                }
            }
            var4 = var10.method166(64, 768, -50, -10, -50);
            class122.field2335.method1378(var4, (byte) -81, this.field1449);
        }
        if (arg1) {
            if (arg2 != null) {
                var4 = arg2.method189(var4, arg0, true);
            }
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZI)V")
    public final void method512(int arg0, boolean arg1, int arg2) {
        field1452++;
        int var4 = this.field1456[arg0];
        if (arg1) {
            var4++;
            if (class110.field2121[arg0].length <= var4) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class110.field2121[arg0].length - 1;
            }
        }
        this.field1456[arg0] = var4;
        this.method501((byte) 114);
        if (arg2 > -119) {
            this.field1455 = 47;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(III)V")
    public final void method513(int arg0, int arg1, int arg2) {
        this.field1456[arg2] = arg1;
        field1453++;
        int var4 = 24 / ((-arg0 - 53) / 35);
        this.method501((byte) 114);
    }
}
