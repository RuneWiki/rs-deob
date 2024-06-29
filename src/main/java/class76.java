import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class76 implements class91 {

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    private int field1441 = 50;

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "Z")
    private boolean field1458 = false;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "Lai;")
    private class10 field1446;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "Lai;")
    private class10 field1442;

    @OriginalMember(owner = "client!gj", name = "D", descriptor = "Lge;")
    private class71 field1464;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "[B")
    private byte[] field1454;

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "[Z")
    private boolean[] field1457;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "[B")
    private byte[] field1447;

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "[Z")
    private boolean[] field1459;

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "[S")
    private short[] field1460;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "[Z")
    private boolean[] field1438;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "[Z")
    private boolean[] field1445;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "[B")
    private byte[] field1439;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "[B")
    private byte[] field1450;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "[Z")
    private boolean[] field1436;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
    public static int field1451 = 0;

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "S")
    public static short field1456 = 320;

    @OriginalMember(owner = "client!gj", name = "B", descriptor = "Lkh;")
    public static class117 field1462 = class224.method1450((byte) 125, "blinken1:");

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
    public static int field1453 = -1;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!gj", name = "C", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IFI)[I")
    public final int[] method528(int arg0, float arg1, int arg2) {
        field1448++;
        class18 var4 = this.method539(arg2, arg0 ^ arg0);
        if (var4 == null) {
            return null;
        } else {
            var4.field513 = true;
            return var4.method172(this.field1458 || this.field1436[arg2], arg1, this, this.field1446, arg0 - 61);
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(IB)V")
    public final void method529(int arg0, byte arg1) {
        if (arg1 != -17) {
            this.field1457 = null;
        }
        for (class18 var3 = (class18) this.field1464.method500(false); var3 != null; var3 = (class18) this.field1464.method498((byte) -3)) {
            if (var3.field513) {
                var3.method173(false, arg0);
                var3.field513 = false;
            }
        }
        field1455++;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IB)Z")
    public final boolean method530(int arg0, byte arg1) {
        field1449++;
        return arg1 == -90 ? this.field1457[arg0] : true;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(IB)I")
    public final int method531(int arg0, byte arg1) {
        field1440++;
        if (arg1 != -128) {
            method532((byte) -67);
        }
        return this.field1460[arg0] & 0xFFFF;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V")
    public static void method532(byte arg0) {
        if (arg0 >= 93) {
            field1462 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)V")
    public final void method533(byte arg0) {
        if (arg0 <= 24) {
            this.method536(17, -85);
        }
        field1435++;
        this.field1464.method503(10);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lah;IZII)V")
    public static final void method534(class9 arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field1437++;
        int var5 = arg0.field256;
        int var6 = arg0.field207;
        if (arg0.field215 == 0) {
            arg0.field256 = arg0.field222;
        } else if (arg0.field215 == 1) {
            arg0.field256 = arg3 - arg0.field222;
        } else if (arg0.field215 == 2) {
            arg0.field256 = arg0.field222 * arg3 >> 14;
        } else if (arg0.field215 == 3) {
            if (arg0.field225 == 2) {
                arg0.field256 = arg0.field222 * 32 + (arg0.field222 - 1) * arg0.field234;
            } else if (arg0.field225 == 7) {
                arg0.field256 = (arg0.field222 - 1) * arg0.field234 + arg0.field222 * 115;
            }
        }
        if (arg0.field161 == 0) {
            arg0.field207 = arg0.field304;
        } else if (arg0.field161 == 1) {
            arg0.field207 = arg1 - arg0.field304;
        } else if (arg0.field161 == 2) {
            arg0.field207 = arg0.field304 * arg1 >> 14;
        } else if (arg0.field161 == 3) {
            if (arg0.field225 == 2) {
                arg0.field207 = arg0.field304 * 32 + (arg0.field304 - 1) * arg0.field275;
            } else if (arg0.field225 == 7) {
                arg0.field207 = arg0.field304 * 12 + (arg0.field304 - 1) * arg0.field275;
            }
        }
        if (class103.field1882 && (class187.method1269(arg0, (byte) 16) != 0 || arg0.field225 == 0)) {
            if (arg0.field207 < 5 && arg0.field256 < 5) {
                arg0.field256 = 5;
                arg0.field207 = 5;
            } else {
                if (arg0.field207 <= 0) {
                    arg0.field207 = 5;
                }
                if (arg0.field256 <= 0) {
                    arg0.field256 = 5;
                }
            }
        }
        if (arg4 >= -16) {
            field1451 = -85;
        }
        if (arg2 && arg0.field237 != null && (arg0.field256 != var5 || arg0.field207 != var6)) {
            class51 var7 = new class51();
            var7.field1046 = arg0;
            var7.field1048 = arg0.field237;
            class102.method689(var7, -115);
        }
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(II)Z")
    public final boolean method535(int arg0, int arg1) {
        field1463++;
        class18 var3 = this.method539(arg1, 0);
        if (arg0 == 5) {
            return var3 == null ? false : var3.method168(this, this.field1446, (byte) -68);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(II)Z")
    public final boolean method536(int arg0, int arg1) {
        field1444++;
        if (arg1 != 32) {
            this.method533((byte) 11);
        }
        return this.field1458 || this.field1436[arg0];
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)[I")
    public final int[] method537(int arg0, int arg1) {
        field1452++;
        class18 var3 = this.method539(arg0, arg1 ^ arg1);
        return var3 == null ? null : var3.method169(this.field1458 || this.field1436[arg0], arg1 + 129, this, this.field1446);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)Z")
    public final boolean method538(int arg0, int arg1) {
        if (arg0 == 4988) {
            field1443++;
            return this.field1459[arg1];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(II)Lbf;")
    private final class18 method539(int arg0, int arg1) {
        field1461++;
        class18 var3 = (class18) this.field1464.method506(arg1 + 1, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field1442.method104(-124, arg0, arg1);
        if (var4 == null) {
            return null;
        } else {
            class145 var5 = new class145(var4);
            class18 var6 = new class18(var5);
            this.field1464.method497((long) arg0, var6, -105);
            return var6;
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lai;Lai;Lai;IZ)V")
    public class76(class10 arg0, class10 arg1, class10 arg2, int arg3, boolean arg4) {
        this.field1458 = arg4;
        this.field1446 = arg2;
        this.field1442 = arg0;
        this.field1441 = arg3;
        this.field1464 = new class71(this.field1441);
        class145 var6 = new class145(arg1.method104(-107, 0, 0));
        int var7 = var6.method1049((byte) 96);
        this.field1454 = new byte[var7];
        this.field1457 = new boolean[var7];
        this.field1447 = new byte[var7];
        this.field1459 = new boolean[var7];
        this.field1460 = new short[var7];
        this.field1438 = new boolean[var7];
        this.field1445 = new boolean[var7];
        this.field1439 = new byte[var7];
        this.field1450 = new byte[var7];
        this.field1436 = new boolean[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field1438[var8] = var6.method998(105) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field1438[var9]) {
                this.field1459[var9] = var6.method998(127) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field1438[var10]) {
                this.field1457[var10] = var6.method998(84) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field1438[var11]) {
                this.field1436[var11] = var6.method998(70) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field1438[var12]) {
                this.field1445[var12] = var6.method998(126) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field1438[var13]) {
                this.field1450[var13] = var6.method994((byte) 35);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field1438[var14]) {
                this.field1439[var14] = var6.method994((byte) 44);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field1438[var15]) {
                this.field1454[var15] = var6.method994((byte) 77);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field1438[var16]) {
                this.field1447[var16] = var6.method994((byte) 126);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field1438[var17]) {
                this.field1460[var17] = (short) var6.method1049((byte) 117);
            }
        }
    }
}
