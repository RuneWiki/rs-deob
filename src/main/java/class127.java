import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class127 {

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public int field1553;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "[B")
    private byte[] field1554;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "Lg;")
    public static class135 field1570 = new class135(2);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public int field1552;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public int field1555;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public int field1557;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "Lmt;")
    public class334 field1559;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "[I")
    public int[] field1558;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "[I")
    public int[] field1560;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "[I")
    public int[] field1566;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "[I")
    public int[] field1567;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "[I")
    public int[] field1568;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "[I")
    public int[] field1569;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "[Lmt;")
    public class334[] field1561;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "[[B")
    public byte[][] field1564;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "[[I")
    public int[][] field1562;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "[[I")
    public int[][] field1572;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public static void method721(byte arg0) {
        if (arg0 != -44) {
            field1570 = null;
        }
        field1570 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)V")
    public static final void method722(int arg0, int arg1) {
        if (arg1 < -51) {
            field1571++;
            class557 var2 = class93.method564(9, -14073, arg0);
            var2.method3264(-1037624096);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public static final String method723(boolean arg0, int arg1) {
        field1556++;
        if (arg0) {
            return null;
        }
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class85.field1035.method987(class31.field247, 22) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class208.field2499.method987(class31.field247, 22) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)Z")
    public static final boolean method724(int arg0) {
        field1563++;
        if (arg0 != -8) {
            field1570 = null;
        }
        return class507.field7033 != class36.field282 || class633.field9120 >= 2;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B[B)V")
    private final void method725(byte arg0, byte[] arg1) {
        field1565++;
        class374 var3 = new class374(class268.method1502((byte) 49, arg1));
        int var4 = var3.method2129(-77);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field1552 = 0;
        } else {
            this.field1552 = var3.method2123(false);
        }
        int var5 = var3.method2129(-73);
        boolean var6 = (var5 & 0x1) != 0;
        this.field1557 = var3.method2136(false);
        boolean var7 = (var5 & 0x2) != 0;
        int var8 = 0;
        this.field1560 = new int[this.field1557];
        int var9 = -1;
        for (int var10 = 0; var10 < this.field1557; var10++) {
            this.field1560[var10] = var8 += var3.method2136(false);
            if (this.field1560[var10] > var9) {
                var9 = this.field1560[var10];
            }
        }
        this.field1555 = var9 + 1;
        this.field1568 = new int[this.field1555];
        this.field1567 = new int[this.field1555];
        this.field1569 = new int[this.field1555];
        this.field1566 = new int[this.field1555];
        this.field1572 = new int[this.field1555][];
        if (var7) {
            this.field1564 = new byte[this.field1555][];
        }
        if (var6) {
            this.field1558 = new int[this.field1555];
            for (int var11 = 0; var11 < this.field1555; var11++) {
                this.field1558[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field1557; var12++) {
                this.field1558[this.field1560[var12]] = var3.method2123(false);
            }
            this.field1559 = new class334(this.field1558);
        }
        if (arg0 < 22) {
            this.field1553 = -30;
        }
        for (int var13 = 0; var13 < this.field1557; var13++) {
            this.field1567[this.field1560[var13]] = var3.method2123(false);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field1557; var14++) {
                byte[] var15 = new byte[64];
                var3.method2147(var15, (byte) 94, 0, 64);
                this.field1564[this.field1560[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field1557; var16++) {
            this.field1568[this.field1560[var16]] = var3.method2123(false);
        }
        for (int var17 = 0; var17 < this.field1557; var17++) {
            this.field1566[this.field1560[var17]] = var3.method2136(false);
        }
        for (int var18 = 0; var18 < this.field1557; var18++) {
            int var25 = this.field1560[var18];
            int var26 = 0;
            int var27 = this.field1566[var25];
            int var28 = -1;
            this.field1572[var25] = new int[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = this.field1572[var25][var29] = var26 += var3.method2136(false);
                if (var28 < var30) {
                    var28 = var30;
                }
            }
            this.field1569[var25] = var28 + 1;
            if (var28 + 1 == var27) {
                this.field1572[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field1562 = new int[var9 + 1][];
        this.field1561 = new class334[var9 + 1];
        for (int var19 = 0; var19 < this.field1557; var19++) {
            int var20 = this.field1560[var19];
            int var21 = this.field1566[var20];
            this.field1562[var20] = new int[this.field1569[var20]];
            for (int var22 = 0; var22 < this.field1569[var20]; var22++) {
                this.field1562[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field1572[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field1572[var20][var23];
                }
                this.field1562[var20][var24] = var3.method2123(false);
            }
            this.field1561[var20] = new class334(this.field1562[var20]);
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "([BI[B)V")
    public class127(byte[] arg0, int arg1, byte[] arg2) {
        this.field1553 = class636.method3652(arg0.length, arg0, -32297);
        if (this.field1553 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field1554 = class256.method1443(0, arg0.length, arg0, 0);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field1554[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method725((byte) 122, arg0);
    }
}
