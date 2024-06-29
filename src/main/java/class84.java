import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class84 {

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    private int field1480 = -1;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    private int field1485 = 0;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "Lvf;")
    private class48 field1469 = new class48();

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "Z")
    public boolean field1486 = false;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    private int field1470;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    private int field1472;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "[Lf;")
    private class265[] field1475;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "[[[I")
    private int[][][] field1468;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "Lsb;")
    public static class98 field1479 = class47.method368("Speicher wird zugewiesen)3", 0);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "Lac;")
    public static class188 field1467;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "[Lqh;")
    public static class24[] field1476;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method626(int arg0) {
        field1478++;
        if (this.field1472 != this.field1470) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        int var3 = -103 / ((arg0 + 8) / 60);
        while (var2 < this.field1470) {
            this.field1475[var2] = class8.field176;
            var2++;
        }
        return this.field1468;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)[[I")
    public final int[][] method627(int arg0, int arg1) {
        if (arg0 != 4103) {
            method630(40, true);
        }
        field1473++;
        if (this.field1472 == this.field1470) {
            this.field1486 = this.field1475[arg1] == null;
            this.field1475[arg1] = class8.field176;
            return this.field1468[arg1];
        } else if (this.field1470 == 1) {
            this.field1486 = this.field1480 != arg1;
            this.field1480 = arg1;
            return this.field1468[0];
        } else {
            class265 var3 = this.field1475[arg1];
            if (var3 == null) {
                this.field1486 = true;
                if (this.field1470 > this.field1485) {
                    var3 = new class265(arg1, this.field1485);
                    this.field1485++;
                } else {
                    class265 var4 = (class265) this.field1469.method373((byte) -124);
                    var3 = new class265(arg1, var4.field4636);
                    this.field1475[var4.field4630] = null;
                    var4.method1611((byte) -16);
                }
                this.field1475[arg1] = var3;
            } else {
                this.field1486 = false;
            }
            this.field1469.method378(var3, 0);
            return this.field1468[var3.field4636];
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
    public static final void method628(int arg0) {
        class264.field4628.method1554((byte) -109);
        field1482++;
        if (arg0 != -1) {
            method630(-19, true);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
    public static void method629(byte arg0) {
        field1479 = null;
        field1467 = null;
        field1476 = null;
        if (arg0 < 112) {
            field1467 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ)V")
    public static final void method630(int arg0, boolean arg1) {
        class115.method867(89);
        field1474++;
        if (class249.field4370 != 30 && class249.field4370 != 25) {
            return;
        }
        class206.field3517++;
        if (class206.field3517 < 50 && !arg1) {
            return;
        }
        class206.field3517 = 0;
        if (!class101.field1789 && class46.field774 != null) {
            class237.field4084.method490(237, -87);
            try {
                class46.field774.method788(true, 0, class237.field4084.field3728, class237.field4084.field3706);
                class237.field4084.field3728 = 0;
            } catch (IOException var2) {
                class101.field1789 = true;
            }
            class261.field4579++;
        }
        class115.method867(109);
        if (arg0 != 3) {
            field1481 = -27;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V")
    public final void method631(byte arg0) {
        int var2 = 0;
        if (arg0 != -63) {
            return;
        }
        while (this.field1470 > var2) {
            this.field1468[var2][0] = null;
            this.field1468[var2][1] = null;
            this.field1468[var2][2] = null;
            this.field1468[var2] = null;
            var2++;
        }
        this.field1475 = null;
        this.field1468 = null;
        this.field1469.method382(false);
        field1484++;
        this.field1469 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B[B)V")
    public static final void method632(byte arg0, byte[] arg1) {
        field1471++;
        class216 var2 = new class216(arg1);
        var2.field3728 = arg1.length - 2;
        class110.field1956 = var2.method1487(55);
        class164.field2958 = new int[class110.field1956];
        class204.field3491 = new byte[class110.field1956][];
        int var3 = 48 % ((51 - arg0) / 48);
        class220.field3791 = new boolean[class110.field1956];
        class253.field4422 = new int[class110.field1956];
        class9.field207 = new int[class110.field1956];
        class1.field5 = new byte[class110.field1956][];
        class245.field4326 = new int[class110.field1956];
        var2.field3728 = arg1.length - (class110.field1956 * 8) - 7;
        class144.field2538 = var2.method1487(43);
        class101.field1790 = var2.method1487(115);
        int var4 = (var2.method1446(5350) & 0xFF) + 1;
        for (int var5 = 0; var5 < class110.field1956; var5++) {
            class253.field4422[var5] = var2.method1487(69);
        }
        for (int var6 = 0; var6 < class110.field1956; var6++) {
            class9.field207[var6] = var2.method1487(112);
        }
        for (int var7 = 0; var7 < class110.field1956; var7++) {
            class245.field4326[var7] = var2.method1487(119);
        }
        for (int var8 = 0; var8 < class110.field1956; var8++) {
            class164.field2958[var8] = var2.method1487(88);
        }
        var2.field3728 = arg1.length + 3 - (var4 * 3) - (class110.field1956 * 8) - 7;
        class33.field572 = new int[var4];
        for (int var9 = 1; var9 < var4; var9++) {
            class33.field572[var9] = var2.method1448(26420);
            if (class33.field572[var9] == 0) {
                class33.field572[var9] = 1;
            }
        }
        var2.field3728 = 0;
        for (int var10 = 0; var10 < class110.field1956; var10++) {
            int var11 = class245.field4326[var10];
            int var12 = class164.field2958[var10];
            int var13 = var11 * var12;
            byte[] var14 = new byte[var13];
            class204.field3491[var10] = var14;
            boolean var15 = false;
            byte[] var16 = new byte[var13];
            class1.field5[var10] = var16;
            int var17 = var2.method1446(5350);
            if ((var17 & 0x1) == 0) {
                for (int var23 = 0; var23 < var13; var23++) {
                    var14[var23] = var2.method1472(76);
                }
                if ((var17 & 0x2) != 0) {
                    for (int var24 = 0; var24 < var13; var24++) {
                        byte var25 = var16[var24] = var2.method1472(95);
                        var15 |= var25 != -1;
                    }
                }
            } else {
                int var18 = 0;
                label88: while (true) {
                    if (var18 >= var11) {
                        if ((var17 & 0x2) == 0) {
                            break;
                        }
                        int var19 = 0;
                        while (true) {
                            if (var11 <= var19) {
                                break label88;
                            }
                            for (int var20 = 0; var20 < var12; var20++) {
                                byte var21 = var16[var11 * var20 + var19] = var2.method1472(96);
                                var15 |= var21 != -1;
                            }
                            var19++;
                        }
                    }
                    for (int var22 = 0; var22 < var12; var22++) {
                        var14[var18 + (var11 * var22)] = var2.method1472(79);
                    }
                    var18++;
                }
            }
            class220.field3791[var10] = var15;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)V")
    public static final void method633(int arg0, int arg1, int arg2) {
        field1477++;
        class191 var3 = class163.method1177(arg0, 20913);
        int var4 = var3.field3303;
        int var5 = var3.field3314;
        int var6 = var3.field3310;
        int var7 = class85.field1489[var5 - var6];
        if (arg2 < arg1 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var6;
        class12.method105(var4, ~var8 & class118.field2117[var4] | var8 & arg2 << var6, -101);
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(III)V")
    public class84(int arg0, int arg1, int arg2) {
        this.field1470 = arg0;
        this.field1472 = arg1;
        this.field1475 = new class265[this.field1472];
        this.field1468 = new int[this.field1470][3][arg2];
    }
}
