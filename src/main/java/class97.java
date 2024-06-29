import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class97 {

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public int field1425;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "J")
    public static long field1424 = 0L;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field1427 = 0;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public static int field1438 = 0;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public int field1429;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public int field1435;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
    public int field1444;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "Lef;")
    public class81 field1443;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "[I")
    public int[] field1422;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "[I")
    public int[] field1431;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "[I")
    public int[] field1434;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "[I")
    public int[] field1436;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "[I")
    public int[] field1440;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "[I")
    public int[] field1442;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "[Lef;")
    public class81[] field1428;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "[[I")
    public int[][] field1430;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "[[I")
    public int[][] field1445;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)I")
    public static final int method725(int arg0, int arg1, int arg2) {
        class270 var3 = (class270) class155.field2273.method306((long) arg1, 16216);
        field1433++;
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = arg2; var5 < var3.field4216.length; var5++) {
                if (var3.field4213[var5] == arg0) {
                    var4 += var3.field4216[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(CLjava/lang/String;B)I")
    public static final int method726(char arg0, String arg1, byte arg2) {
        field1437++;
        int var3 = 0;
        if (arg2 >= -76) {
            return -56;
        }
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg1.charAt(var5) == arg0) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B[B)V")
    private final void method727(byte arg0, byte[] arg1) {
        field1426++;
        class54 var3 = new class54(class200.method1337(-1, arg1));
        int var4 = var3.method407(255);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field1435 = var3.method420((byte) 100);
        } else {
            this.field1435 = 0;
        }
        int var5 = var3.method407(255);
        int var6 = 0;
        this.field1444 = var3.method423(91);
        int var7 = -1;
        if (arg0 >= -58) {
            return;
        }
        this.field1422 = new int[this.field1444];
        for (int var8 = 0; var8 < this.field1444; var8++) {
            this.field1422[var8] = var6 += var3.method423(127);
            if (var7 < this.field1422[var8]) {
                var7 = this.field1422[var8];
            }
        }
        this.field1429 = var7 + 1;
        this.field1431 = new int[this.field1429];
        this.field1436 = new int[this.field1429];
        this.field1442 = new int[this.field1429];
        this.field1434 = new int[this.field1429];
        this.field1445 = new int[this.field1429][];
        if (var5 != 0) {
            this.field1440 = new int[this.field1429];
            for (int var9 = 0; var9 < this.field1429; var9++) {
                this.field1440[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field1444; var10++) {
                this.field1440[this.field1422[var10]] = var3.method420((byte) 31);
            }
            this.field1443 = new class81(this.field1440);
        }
        for (int var11 = 0; var11 < this.field1444; var11++) {
            this.field1434[this.field1422[var11]] = var3.method420((byte) 44);
        }
        for (int var12 = 0; var12 < this.field1444; var12++) {
            this.field1436[this.field1422[var12]] = var3.method420((byte) -115);
        }
        for (int var13 = 0; var13 < this.field1444; var13++) {
            this.field1431[this.field1422[var13]] = var3.method423(89);
        }
        for (int var14 = 0; var14 < this.field1444; var14++) {
            int var21 = 0;
            int var22 = this.field1422[var14];
            int var23 = this.field1431[var22];
            this.field1445[var22] = new int[var23];
            int var24 = -1;
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field1445[var22][var25] = var21 += var3.method423(-83);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field1442[var22] = var24 + 1;
            if (var24 + 1 == var23) {
                this.field1445[var22] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field1428 = new class81[var7 + 1];
        this.field1430 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field1444; var15++) {
            int var16 = this.field1422[var15];
            int var17 = this.field1431[var16];
            this.field1430[var16] = new int[this.field1442[var16]];
            for (int var18 = 0; var18 < this.field1442[var16]; var18++) {
                this.field1430[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field1445[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field1445[var16][var19];
                }
                this.field1430[var16][var20] = var3.method420((byte) 76);
            }
            this.field1428[var16] = new class81(this.field1430[var16]);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIILbg;IJIIII)Z")
    public static final boolean method728(int arg0, int arg1, int arg2, int arg3, class264 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class29.method204(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZC)B")
    public static final byte method729(boolean arg0, char arg1) {
        field1423++;
        if (!arg0) {
            method726('u', (String) null, (byte) -59);
        }
        byte var2;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "([BI)V")
    public class97(byte[] arg0, int arg1) {
        this.field1425 = class66.method530(arg0.length, false, arg0);
        if (this.field1425 != arg1) {
            throw new RuntimeException();
        }
        this.method727((byte) -105, arg0);
    }
}
